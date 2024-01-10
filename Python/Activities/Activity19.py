import pandas
from pandas import ExcelWriter


data = {
        'FirstName': ["Rohit", "Virat", "Rahul"],
        'LastName': ["Sharma", "Kohli", "Dravid"],
        'Email': ["rohit@example.com", "virat@example.com", "rahul@example.com"],
        'PhoneNumber': ["4537829158", "4892184058", "4528727830"]
      }

dataframe = pandas.DataFrame(data)
print(dataframe)

writer = ExcelWriter('sample.xlsx')
dataframe.to_excel(writer, 'sheet1', index=False)
writer.close()