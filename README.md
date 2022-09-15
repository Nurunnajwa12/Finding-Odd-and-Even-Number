
# Final Assignment 

This program should be able to find and display the list of all even,odd and semi-detached house number.

## Target

- Display the even house number
- Display the odd house number
- Display the semi-detached house number.


## Code Explanation
-  We do repetition until the specified number is find.

```java
    System.out.print("\nOdd house number are : ");
         int odd=0;
         for (z=0;z<array.length;z=z+1)
```


-  To find odd number , use array[object name]%2 !=0.
-  If the number that calculate by using ampersand with two not equal to zero, the number is odd number
-  Eg: 3%2 = 1 , 1 !=0, therefore 3 is odd number. We have satisfied the condition of code above.

```java
if(array[z]% 2 !=0)
            {
                System.out.print(array[z]+" ");
                odd=1;
            }
```
- The same code applied to even number
```java
if(array[z]%2==0)
             {
                 System.out.print(array[z]+" ");
                 even=1;
             }
```
- For semi detached house, the house number must belong from 6 until 15
```java
 if (array[z]>=6 && array[z]<=15)
              {
                  System.out.print(array[z]+" ");
                  semi=1;
              }
```


## Feedback

If you have any feedback, please reach out to us at nurunnajwa21@gmail.com

