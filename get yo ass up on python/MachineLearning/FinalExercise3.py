import pandas as panda

dataset_path = "C:/Users/acer/Documents/PLANTS-DATASET.xlsx"

read_file = panda.read_excel(dataset_path, sheet_name='Sheet1')

panda.set_option('display.max_rows', None)
panda.set_option('display.max_columns', None)

# [1] access and dislpay the data using python
print("[DISPLAY DATA]")
print(read_file.to_string(col_space=15))
print('\n')

# [2] display the first 10 records
print("[DISPLAY THE FIRST 10 RECORDS]")
print(read_file.head(10).to_string(col_space=15))
print('\n')

# [3] display the last 5 records
print("[DISPLAY THE LAST 5 RECORDS]")
print(read_file.tail(5).to_string(col_space=15))
print('\n')

# [4] show only the data that not in stock
print("[DISPLAY THE DATA THAT NOT STOCK]")
not_in_stock = read_file[read_file['In Stock'] == 'No']
print(not_in_stock.to_string(col_space=15))
print('\n')

# [5] display the data in ascending order based on type
print("[DISPLAY THE DATA IN ASCENDING ORDER BASED ON ITS TYPE]")
sort_ascending_order = read_file.sort_values(by='Type', ascending=True)
print(sort_ascending_order.to_string(col_space=15))
print('\n')

# [6] display the data in descending order based on category
print("[DISPLAY THE DATA IN DESCENDING ORDER BASED ON ITS CATEGORY]")
sort_descending_order = read_file.sort_values(by='Category', ascending=False)
print(sort_descending_order.to_string(col_space=15))
print('\n')

# [7] display the average price per category
print("[DISPLAY THE AVERAGE PRICE PER CATEGORY]")
average_price_per_category = read_file.groupby('Category')['Price'].mean()
print(average_price_per_category)
print('\n')

# [8] display the number of colors per type
print("[DISPLAY THE NUMBER OF COLOURS PER TYPE]")
colour_per_type = read_file.groupby('Type')['Colour'].unique()
print(colour_per_type)
print('\n')
