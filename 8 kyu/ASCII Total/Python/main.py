def uni_total(s):
    total = 0
    for index in range(0, len(s)):
        total += ord(s[index])
    return total
