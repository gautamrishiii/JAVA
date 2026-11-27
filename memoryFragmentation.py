N, Q = map(int, input().split())

memory = [0] * (N + 1)

start = {}
size = {}
used = set()

for _ in range(Q):
    operation = input().split()
    cmd = operation[0]

    if cmd == "ALLOCATE":
        pid = int(operation[1])
        s = int(operation[2])

        if pid in used:
            if pid not in size:
                continue

            pos = start[pid]
            current_size = size[pid]

            if pos + current_size + s - 1 <= N:
                possible = True

                for i in range(pos + current_size,
                               pos + current_size + s):
                    if memory[i] != 0:
                        possible = False
                        break

                if possible:
                    for i in range(pos + current_size,
                                   pos + current_size + s):
                        memory[i] = pid

                    size[pid] += s

        else:
            i = 1

            while i <= N:
                if memory[i] != 0:
                    i += 1
                    continue

                j = i

                while j <= N and memory[j] == 0:
                    j += 1

                if j - i >= s:
                    for k in range(i, i + s):
                        memory[k] = pid

                    start[pid] = i
                    size[pid] = s
                    used.add(pid)
                    break

                i = j

    elif cmd == "FREE":
        pid = int(operation[1])
        s = int(operation[2])

        if pid not in size:
            continue

        if s > size[pid]:
            continue

        pos = start[pid]

        for i in range(pos + size[pid] - s,
                       pos + size[pid]):
            memory[i] = 0

        size[pid] -= s

        if size[pid] == 0:
            del start[pid]
            del size[pid]

    elif cmd == "COMPACT":
        new_memory = [0] * (N + 1)

        processes = sorted(
            start.keys(),
            key=lambda pid: start[pid]
        )

        pos = 1

        for pid in processes:
            start[pid] = pos

            for i in range(size[pid]):
                new_memory[pos + i] = pid

            pos += size[pid]

        memory = new_memory

    elif cmd == "REPORT":
        total_free = 0
        largest = 0
        blocks = 0
        current = 0

        for i in range(1, N + 1):
            if memory[i] == 0:
                total_free += 1
                current += 1
                largest = max(largest, current)

            else:
                if current > 0:
                    blocks += 1
                    current = 0

        if current > 0:
            blocks += 1

        print(total_free, largest, blocks)