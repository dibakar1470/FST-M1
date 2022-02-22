#print('Hello World')
#x = 4 % (1 + 9)**2 - 60 // (7 + 2)

#word = "I love Python programming"
#print (word[-18:-12])

#string = '*******mumbai03######'
#print(string.lstrip('*').rstrip('#'))

input_str = "bmaunmdbraai"

message1 = ""
message2 = ""

for index in range(len(input_str)):
    if index % 2 == 0:
        message1+=input_str[index]
    else:
        message2+=input_str[index]

message1 = message1.rstrip('#')
message2 = message2.rstrip('#')

print(message1, message2)
