function query(l, r,arr){
    let sum = 0;
    for(let i = 1;i<=r;i++){
        sum+=arr[i];
    }
    return sum;
}

const input = [1,5,2,4,6,1,3,5,7,10];
const n =input.length;
const arr = [...input];
console.log("query(3,8) : " + query(3,8,arr));
console.log("query(1,6) : " + query(1,6,arr));
arr[8]=0;
console.log("query(8,8) : " + query(8,8,arr));