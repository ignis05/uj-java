import sys

isAscii = True
lines = []

i = 1
file = open(sys.argv[1], 'r')
for line in file:
    try:
        line.encode('ascii')
    except UnicodeEncodeError:
        isAscii = False
        lines.append(i)
    else:
        pass
    i += 1

print("======================================\n")

if isAscii:
    print("Test passed: file has no special characters")
else:
    print(f"Test failed: special characters found in lines: {lines}")

file.close()
