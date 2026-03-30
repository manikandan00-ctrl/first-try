l=[]
a=int(input("how many number you:"))
for i in range(a):
    b=int(input("enter ur number;"))
    l.append(b)
print(l)
try:
    print(l[6])
except IndexError:
    print("display Invalid position")
try:
    n=int(input("enter ur number"))
    m=(input("enter ur name"))
    p=m+n
    print(p)
except TypeError:
    print("this will be type error")
