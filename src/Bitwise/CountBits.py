n = 13
numBits = 0
while(n!=0):
    numBits = numBits + (n&1)
    n=int(n/2) #right shift operator in python does not work beyond 1 that is 1>>1 = 1
print(numBits)