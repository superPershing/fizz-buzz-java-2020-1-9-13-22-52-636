## Rule1:
 - 如果所报数字是3的倍数，那么不能说该数字，而要说Fizz；如果所报数字是5的倍数，那么要说Buzz；如果所报数字是7的倍数，那么要说Whizz。
 - 如果所报数字同时是两个特殊数的倍数情况下，也要特殊处理，比如3和5的倍数，那么不能说该数字，而是要说FizzBuzz, 以此类推。如果同时是三个特殊数的倍数，那么要说FizzBuzzWhizz。
## Rule2:
 - 如果所报数字包含了3，那么忽略Rule1，那么也不能说该数字，而是要说相应的单词，比如要报13的同学应该说Fizz。比如要报30的同学只报Fizz，不报FizzBuzz。
## Rule3:
 - 如果数字中包含了5，那么忽略Rule2，并且忽略被3整除的判定，比如要报35的同学不报Fizz，报BuzzWhizz。
## Rule4:
 - 如果数字中包含了7，那么忽略Rule3，并且忽略被5整除的判定，比如要报75的同学只报FIzz，其他case自己补齐。
## Rule5:
 - 直接打印
 
## BasicRule:
 3 -> Fizz  
 5 -> Buzz  
 7 -> Whizz  