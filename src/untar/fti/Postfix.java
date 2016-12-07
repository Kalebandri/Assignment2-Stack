Public static String

convertToPostfix(String infix) {   
ArrayStack<Character> tanda = new ArrayStack<Character>(15);         
String output = "";      
for(int i=0;i<infix.length();i++){    
char c= infix.charAt(i);    
switch(c){        case'1':case'2':case'3':case'4':case'5':case'6':case'7':case'8':case'9':case'0':     
output =output + c;     break;        
case'(':case'{':case'[':     
tanda.push(c);     
break;         case'+':case'-':     
if(tanda.isEmpty()){      tanda.push(c);     }     
else{     while(!tanda.isEmpty()){      
char piik=tanda.peek();      
if(piik=='(' || piik=='{' || piik=='['){       
tanda.push(c);       
break;      }      
else if(piik=='+' || piik=='-' || piik == '*' || piik == '/' || piik == '^'){       
char a=tanda.pop();       
output += a;              
}      
}     
}    
break;    
case'*': case'/':     
if(tanda.isEmpty())      
tanda.push(c);     
else{      while(!tanda.isEmpty()){       
char piik = tanda.peek();       
if(piik=='(' || piik=='{' || piik=='['){        
tanda.push(c);        
break;       }       
else if(piik=='+' || piik=='-'){        
tanda.push(c);        
break;       }       
else if(piik=='*' || piik=='/'){        
char z=tanda.pop();        
output += z;       }       
else if(piik=='^' ){        
char z=tanda.pop();        
output += z;       }      
}     
}     
break;    
case'^':     
if(tanda.isEmpty())      
tanda.push(c);     
else{      while(!tanda.isEmpty()){       
char piik= tanda.peek();       
if(piik=='(' || piik=='{' || piik=='['){        
tanda.push(c);        
break;       }       
else if(piik=='+' || piik=='-'){        
tanda.push(c);        
break;              }       
else if(piik=='*' || piik=='/'){        
tanda.push(c);        
break;       }       
else if(piik=='^' ){       
char z =tanda.pop();        
output += z;       }     
}     
}     
break;    
case')':case'}':case']':    
 while(!tanda.isEmpty()){      
if(tanda.peek()=='+' || tanda.peek()=='-' || tanda.peek()=='*'||tanda.peek()=='/' || tanda.peek()=='^' ){       
char z = tanda.pop();       
output +=z;       
break;      }      
else       
tanda.pop();     }         
break;    }    //System.out.println(c + " " + output);            }   
while(!tanda.isEmpty()){    
if(tanda.peek()=='+' || tanda.peek()=='-' || tanda.peek()=='/'||tanda.peek()=='*' || tanda.peek()=='^' ){     
char z = tanda.pop();     
output +=z;    }    
else     
tanda.pop();   }      
return output;      
}