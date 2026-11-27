import sys
def min_umbrellas(n: int,p: int,m: int, timetables: list) -> int:
    num_transitions = max(0,m - 1)
    if num_transitions ==0:
        return 0
    departures = [[0]*num_transitions for _ in range(n+1)]
    arrivals = [[0]*num_transitions for _ in range(n +1)]
    
    for schedule in timetables:
        prev_building =0
        for period_idx, building in enumerate(schedule):
            if building==0:
                continue
            if prev_building !=0 and prev_building != building:
                t=period_idx-1
                departures[prev_building][t]+=1
                arrivals[building][t]+=1
            prev_building=building
    total_umbrellas =0
    for b in range(1,n+1):
        cum_departures=0
        cum_arrivals_before=0
        max_deficit=0
        
        for t in range(num_transitions):
            cum_departures +=departures[b][t]
            deficit =cum_departures -cum_arrivals_before
            if deficit >= max_deficit:
                max_deficit=deficit
            cum_arrivals_before += arrivals[b][t]
        total_umbrellas+=max_deficit
    return total_umbrellas
def solve() -> None:
    data=sys.stdin.read().split()
    if not data:
        return
    it =iter(data)
    n=int(next(it))
    p=int(next(it))
    m=int(next(it))
    
    timetables=[]
    for _ in range(p):
        row=[int(next(it)) for _ in range(m)]
        timetables.append(row)
    print(min_umbrellas(n,p,m,timetables))
if __name__ == "__main__":
     solve()
        