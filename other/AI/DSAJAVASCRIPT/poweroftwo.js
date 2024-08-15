// power of 2 integer 'n' determine if the number if 2 or not 
// An integer is a power of two if there exists an integer 'x ' such that 'n' === 2^x

function ispoweroftwo(n){
    if(n<1){
        return false;
    }
    while(n>1){
        if(n%2!=0){
            return false
        }
        n=n/2
    }
    return true

}
console.log(ispoweroftwo(1))
console.log(ispoweroftwo(2))
console.log(ispoweroftwo(5))