# Library-Management-System
LMS in java with possible testcases.

Digital Library Book Management System
1. Add a Book
2. View All Books
3. Search Book by ID or Title
4. Update Book Details
5. Delete a Book Record
6. Exit System
Enter your choice:

Here are some sample inputs and expected outputs for the Digital Library Book Management System:

Test Case 1: Adding a Book
Input:

1
B001
The Great Gatsby
F. Scott Fitzgerald
Classic
yes

Expected Output:

Digital Library Book Management System
1. Add a Book
2. View All Books
3. Search Book by ID or Title
4. Update Book Details
5. Delete a Book Record
6. Exit System
Enter your choice: 

Add a New Book
Enter Book ID: 
Enter Title: 
Enter Author: 
Enter Genre: 
Is the book available? (yes/no): 
Book added successfully!

Test Case 2: Viewing All Books
Input:
2

Expected Output (after adding one book):

Digital Library Book Management System
1. Add a Book
2. View All Books
3. Search Book by ID or Title
4. Update Book Details
5. Delete a Book Record
6. Exit System
Enter your choice: 

All Books in the Library:
ID: B001
Title: The Great Gatsby
Author: F. Scott Fitzgerald
Genre: Classic
Available: Yes

Test Case 3: Searching by ID
Input:
3
1
B001

Expected Output:

Digital Library Book Management System
1. Add a Book
2. View All Books
3. Search Book by ID or Title
4. Update Book Details
5. Delete a Book Record
6. Exit System
   
Enter your choice: 

Search Book
1. Search by ID
2. Search by Title
Enter your choice: 
Enter Book ID: 

Book Found:
ID: B001
Title: The Great Gatsby
Author: F. Scott Fitzgerald
Genre: Classic
Available: Yes

Test Case 4: Updating Book Details
Input:

4
B001
New Title
New Author
Modern
yes
yes

Expected Output:

Digital Library Book Management System
1. Add a Book
2. View All Books
3. Search Book by ID or Title
4. Update Book Details
5. Delete a Book Record
6. Exit System
Enter your choice: 

Update Book Details
Enter Book ID to update: 
Current Book Details:
ID: B001
Title: The Great Gatsby
Author: F. Scott Fitzgerald
Genre: Classic
Available: Yes

Enter new details (leave blank to keep current value):
New Title (The Great Gatsby): 
New Author (F. Scott Fitzgerald): 
New Genre (Classic): 
Change Availability? (yes/no): 
Is the book available now? (yes/no): 
Book details updated successfully!

Test Case 5: Deleting a Book
Input:
5
B001

Expected Output:

Digital Library Book Management System
1. Add a Book
2. View All Books
3. Search Book by ID or Title
4. Update Book Details
5. Delete a Book Record
6. Exit System
Enter your choice: 

Delete a Book
Enter Book ID to delete: 
Book deleted successfully!

Test Case 6: Exiting the System
Input:
6

Expected Output:

Digital Library Book Management System
1. Add a Book
2. View All Books
3. Search Book by ID or Title
4. Update Book Details
5. Delete a Book Record
6. Exit System
Enter your choice: 
Exiting the system. Goodbye!

Test Case 7: Trying to Add Duplicate Book ID
Input:
1
B001
Book One
Author One
Fiction
yes
1
B001
Book Two
Author Two
Non-Fiction
no

Expected Output:

Digital Library Book Management System
1. Add a Book
2. View All Books
3. Search Book by ID or Title
4. Update Book Details
5. Delete a Book Record
6. Exit System
Enter your choice: 

Add a New Book
Enter Book ID: 
Enter Title: 
Enter Author: 
Enter Genre: 
Is the book available? (yes/no): 
Book added successfully!

Digital Library Book Management System
1. Add a Book
2. View All Books
3. Search Book by ID or Title
4. Update Book Details
5. Delete a Book Record
6. Exit System
Enter your choice: 

Add a New Book
Enter Book ID: 
A book with this ID already exists.
