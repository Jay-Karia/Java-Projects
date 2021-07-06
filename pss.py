# Python String Sanitizer
def sanitize(time_string):
    if '-' in time_string:
        splitter = '-'
    elif ':' in time_string:
        splitter = ':'
    elif ',' in time_string:
        splitter = ','
    else:
        return time_string
    (mins, secs) = time_string.split(splitter)
    return mins + " " + secs


print("Enter your name")
name = input()
print("\nWelcome " + name + " to Python String Sanitizer -- By Jay\n")
print("Enter a String")
user_string = input()
print("String: " + user_string)
print("\nSanitizing...")
print("\nSanitized!!!")
print(sanitize(user_string))
