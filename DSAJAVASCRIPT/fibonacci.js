function fibonacci(n) {
  const fib =[0,1]
  for (let i=2;i<n;i++){
    fib[i] = fib[i-1]+fib[i-2]//its a formula for in whoich you have to add previous number and initial was 0,1

  }
  return fib;
}
console.log(fibonacci(10))
console.log(fibonacci(15))
// calculation in input size -o(1)
// 1  loop o(n)
//  /2 nested loops o(n^2)
// input size reduced by half- onabort(logn)