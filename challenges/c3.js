// challenge summary 
/*
We are given two strings, A and B.
A shift on A consists of taking string A and moving
the leftmost character to the rightmost position. 
For example, if A = 'abcde', then it will be 'bcdea' 
after one shift on A. Return True if and only if A can 
become B after some number of shifts on A.
*/


function run(a,b){
  var len_a = a.length;
  var i=0;
  var res = a;

  for(i=0; i < len_a;i++){
    var first = res.charAt(0);
    res = res.slice(1,len_a);
    res = res + first;
    
    //console.log(res + " " + b);
    if(res == b){
      return true;
    }
  }
  return false;
}

var out = run("abcde", "abced");
console.log(out);

