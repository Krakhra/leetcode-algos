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