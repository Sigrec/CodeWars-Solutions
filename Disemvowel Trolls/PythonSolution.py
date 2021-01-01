def disemvowel(string):
    new_string = ''.join([string[x] for x in range(len(string)) if not string[x].lower() in ["a", "e", "i", "o", "u"]])
    return new_string