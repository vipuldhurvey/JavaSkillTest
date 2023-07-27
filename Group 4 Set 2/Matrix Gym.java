
# Write your code here
from sys import stdin

n=int(stdin.readline().strip())
arr=[x for x in input().split()]

calories=int(stdin.readline().strip())
INT_MIN = -2**31
cols=len(arr[0])

dp=[[INT_MIN for j in range(cols + 1)] for i in range(n + 1)]

for i in range(n):
    for j in range(cols):
        if arr[i][j] == '.' :
            dp[i][j] = 0

for i in range(n - 1, -1, -1):
    for j in range(cols - 1, -1, -1):
        if(i == n-1 and  j == cols-1):
            continue
        elif(arr[i][j] == '.'):
            dp[i][j] = max(dp[i+1][j], dp[i][j+1]) + 5

if(dp[0][0] < calories):
    print("No")

else:
    if dp[0][0] == calories:
        print("Yes")
    else:
        print("Yes", dp[0][0] - calories)
