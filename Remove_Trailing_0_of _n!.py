import math
n=20
c=1
r=0
s=-1
while c>0:
    s=math.floor(n/(5**c))
    if s==0:
        break
    r=r+s
    c=c+1
print (r)
