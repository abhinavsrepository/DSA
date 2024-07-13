function factorial(n){
    // product of all positive integers = n
    // 4 = 4*3*2*1
    let fact =1;
    for (let i=2;i<=n;i++){
        fact =fact*i
    }
    return fact

}
console.log(factorial(15))