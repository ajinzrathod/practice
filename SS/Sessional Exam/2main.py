import re

string=input("Enter a string: ")

with open('states.txt', 'r') as f:
    print(f.read())

x = re.findall("^[a]", string)
if x:
    pass
else:
    print("Invalid")
    exit()

result = string.find('(')

if result == -1:
    print("Invalid")

string = string[result+1:]

x = re.findall("^[c]", string)
y = re.findall("^[0-9]", string)

if x or y:
    pass
else:
    print("Invalid")
    exit()

result = string.find(')')

if result == -1:
    print("Invalid")
string = string[result+1:]

result = string.find('b')
x = re.findall("^[b]", string)
if x:
    pass
else:
    print("Invalid")
    exit()
string = string[result+1:]

x = re.findall("^[b]", string)
if x:
    pass
else:
    print("Invalid")
    exit()

if string[-1].isdigit():
    pass
else:
    print("Invalid")
    exit()

print("valid")
