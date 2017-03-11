How to use Set , HashSet, TreeSet and LinkedHashSet

Suppose that we have pre-define array of String as below :

String[] countries = {
"Cambodia",
"VietNam",
"Thailand",
"USA",
"Cambodia",
"France",
"England",
"VietNam",
"Cambodia"
}

1 - Find duplicate country  and display all unique countries name using HashSet  ( mehtod add , size )

Result : 
Duplicated Country name is : 
Cambodia
VietNam
There are 6 countries : [Cambodia, VietNam, Thailand, USA, France, England]

2 - Find duplicate country and display all unique countries name in aphabet order
Result :
Duplicated Country name is : 
Cambodia
VietNam
There are 6 countries : [Cambodia, Englang, France, Thailand, USA, VietNam]

3 - convert array above into LinkedHashSet Object and write a method named as isCountryExist(Set,countryName) 
return as boolean this method to check countryName existed or not

result :
if found country : result would be : Country name :[countryName] found in the object

if not found country : result would be : Country name :[countryName] is not found in the object


4 : write Own class : MyUtils with one static method as below

public class MyUtils {
    public static void checkDuplicate(Set<String> s, String[] countries] {
      // write implementation here to display unique counry name with type of Set ex result below....

        }
}

In Main methods : If I called the above method :

MyUtils.checkDuplicate(new HashSet(), countries);
MyUtils.checkDuplicate(new TreeSet(), countries);
MyUtils.checkDuplicate(new LinkedHashSet(), countries);

Retuls :
Set type = java.util.HashSet [Cambodia, VietNam, Thailand, USA, France, England]
Set type = java.util.TreeSet [Cambodia, Englang, France, Thailand, USA, VietNam]
Set type = java.util.LinkedHashSet [Cambodia", "VietNam","Thailand","USA","France","England"]


Hint : for getting type of class naem using : Object.getClass().getName()


5 : convert array above into ArrayList, LinkedList and display total size all items using Iterator and for-loop. 
ex : result output
List type : ArrayList , total size : 9
elements :  ["Cambodia","VietNam","Thailand","USA","Cambodia","France","England","VietNam","Cambodia"]

6 : Convert array above into Map (HashMap, TreepMap) by key is countryName, 
value is number of times that countryName found and display all elements using entrySet() methods
ex : key Cambodia found 3 times, the value to store is 3 for key Cambodia,  Key USA found 1 time, value is 1.

Contact GitHub 