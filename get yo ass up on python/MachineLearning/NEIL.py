import pandas as pd

# Load the dataset
dataset_path = "C:/Users/acer/Documents/PLANTS-DATASET.xlsx"
read_file = pd.read_excel(dataset_path, sheet_name='Sheet1')

# Set display options for pandas
pd.set_option('display.max_rows', None)
pd.set_option('display.max_columns', None)

# Access and display the data using python
print("[DISPLAY DATA]")
print(read_file)
print('\n')

# Display the first 10 records
print("[DISPLAY THE FIRST 10 RECORDS]")
print(read_file.head(10))
print('\n')

# Display the last 5 records
print("[DISPLAY THE LAST 5 RECORDS]")
print(read_file.tail(5))
print('\n')

# Show only the data that is not in stock
print("[DISPLAY THE DATA THAT IS NOT STOCK]")
not_in_stock = read_file[read_file['In Stock'] == 'No']
print(not_in_stock)
print('\n')

# Display the data in ascending order based on type
print("[DISPLAY THE DATA IN ASCENDING ORDER BASED ON ITS TYPE]")
sort_ascending_order = read_file.sort_values(by='Type', ascending=True)
print(sort_ascending_order)
print('\n')

# Display the data in descending order based on category
print("[DISPLAY THE DATA IN DESCENDING ORDER BASED ON ITS CATEGORY]")
sort_descending_order = read_file.sort_values(by='Category', ascending=False)
print(sort_descending_order)
print('\n')

# Display the average price per category
print("[DISPLAY THE AVERAGE PRICE PER CATEGORY]")
average_price_per_category = read_file.groupby('Category')['Price'].mean()
print(average_price_per_category)
print('\n')

# Display the number of colors per type
print("[DISPLAY THE NUMBER OF COLOURS PER TYPE]")
colour_per_type = read_file.groupby('Type')['Colour'].unique()
print(colour_per_type)
print('\n')
