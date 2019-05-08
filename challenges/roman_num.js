var romanToInt = function(s) {
  var map = new Map();
  map.set("I",1);
  map.set("V",5);
  map.set("X",10);
  map.set("L",50);
  map.set("C",100);
  map.set("D",500);
  map.set("M",1000);
  
  var len = s.length
  var total = 0;
  var i=0;
  for(i=0; i < len;i++){
      if(s.charAt(i) == "I"){
          if(s.charAt(i+1) == "V"){
              total = total + 4;
          }
          else if(s.charAt(i+1) == "X"){
              total = total + 9;
          }
      }
      else if(s.charAt(i) == "X"){
          if(s.charAt(i+1) == "L"){
              total = total + 40;
          }
          else if(s.charAt(i+1) == "C"){
              total = total + 90;
          }
      }
      else if(s.charAt(i) == "C"){
          if(s.charAt(i+1) == "D"){
              total = total + 400;
          }
          else if(s.charAt(i+1) == "M"){
              total = total + 900;
          }
      }
      else{
          var temp = map.get(s.charAt(i));
          console.log(temp)
          total = total + temp;
      }
  }
  return total;
};