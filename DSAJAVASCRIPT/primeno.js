// given a number n deteremine if the no is prime or not 
// its a prime natural no greater than 1 that is not a product  of two smaller natural no
// isPrime(5) =true()
function isPrime(n){
    if(n<2){
        return false
    }
        
    for (let i=2;i<n;i++){
        if (n%i==0){
            return false
        }
    }
    return true;
}
console.log(isPrime(1)) //o(1)
console.log(isPrime(5))
console.log(isPrime(7))
console.log(isPrime(8))