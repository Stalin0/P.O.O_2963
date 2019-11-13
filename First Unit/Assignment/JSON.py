if __name__ =="__main__":
    student = {
        'name' : 'Stalin',
        'age' : 22,
        'career' : 'Software engineer'
    }

    #print(student['name'])
    #print(student['age'])
    #print(student['career'])
    for key, value in student.items():
        print(f'{key}={value}')