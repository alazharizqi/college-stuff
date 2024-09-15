# Mobile Programming  
**Job Sheet 3**  

**From:**  
AL AZHAR RIZQI RIFA’I FIRDAUS  

**Class:** 3 I  
**Absence:** 01  
**Student Number Identity:** 2241720263  
**Department:** Information Technology  
**Study Program:** Informatics Engineering  

---

## Practicum 1: Implementing Control Flows (“if/else”)

### Step 1:  
Type or copy the following program code into the `main()` function.

### Step 2:  
Execute (Run) the code in step 1.  
**Explanation:**  
The code errors due to a typo. Line 7 has “Else” which should be “else”, and line 5 has “If” which should be “if”.  
**After Fix:**  

### Step 3:  
Add the following program code and run your code.  
**Explanation:**  
There is a duplicated “test” variable already declared. It has a true value but it's a string, not boolean, and the data type is string, not bool.  
**After Fix:**  

### Equality Checking and Type Coercion  
In JavaScript, checking two variables can use double `==` or triple `===`. The double `==` only compares the value, while the triple `===` compares the data type as well.  
For example, in JavaScript, `“7” == 7` will be `true`, but `“7” === 7` would be `false`. This could cause bugs if the operator is misused.  
In Dart, simply using double `==` compares both value and data type.

---

## Practicum 2: Implementing “while” and “do-while” Looping

### Step 1:  
Type or copy the following program code into the `main()` function.

### Step 2:  
Execute (Run) the code in step 1.  
**Explanation:**  
Based on the error message, the `counter` variable is an undefined name, so we need to define it first.  
**After Fix:**  

### Step 3:  
Add the following program code and run your code.  
**Explanation:**  
No error occurs.

---

## Practicum 3: Applying “for” and “break-continue” Looping

### Step 1:  
Type or copy the following program code into the `main()` function.

### Step 2:  
Execute (Run) the code in step 1.  
**Explanation:**  
There is a variable `index` that is not standardized; one is `Index` and the other `index`. Also, there is no data type declaration. We need to standardize the index variable name and add the data type, for example, `int`.  
**After Fix:**  

### Step 3:  
Add the following program code in the `for` loop and run your code.  
**Explanation:**  
The `break` and `continue` keywords cannot be used outside of a loop, so they must be written inside the loop. Also, there is another typo.  
**After Fix:**  

---

## Practicum Assignment  
Complete Practicum 1 to 3, then document your work in the form of screenshots and explanations!  
Create a program that can display prime numbers from 0 to 201 using Dart. When a prime number is found, display your full name and NIM.

---

**Submit it in the form of a GitHub repo commit link on the link provided in the Telegram group!**  
[GitHub Repository](https://github.com/zharsuke/mobile-programming.git)  
