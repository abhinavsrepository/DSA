let MAXN = 10000;
let SQRSIZE = 100;
 
let arr = new Array(MAXN);
for(let i = 0; i < MAXN; i++)
{
    arr[i] = 0;
}
 
let block = new Array(SQRSIZE);
for(let i = 0; i < SQRSIZE; i++)
{
    block[i] = 0;
}
 
let blk_sz;     
 
// Time Complexity : O(1)
function update(idx,val)
{
    let blockNumber = idx / blk_sz;
    block[blockNumber] += val - arr[idx];
    arr[idx] = val;
}
 
// Time Complexity : O(sqrt(n))
function query(l, r)
{
    let sum = 0;
    while (l < r && l % blk_sz != 0 && l != 0)
    {
        // traversing first block in range
        sum += arr[l];
        l++;
    }
    while (l+blk_sz-1 <= r)
    {
        // traversing completely
        // overlapped blocks in range
        sum += block[l / blk_sz];
        l += blk_sz;
    }
    while (l <= r)
    {
        // traversing last block in range
        sum += arr[l];
        l++;
    }
    return sum;
}
 
// Fills values in input[]
function preprocess(input, n)
{
    // initiating block pointer
    let blk_idx = -1;
   
    // calculating size of block
    blk_sz = Math.floor( Math.sqrt(n));
   
    // building the decomposed array
    for (let i = 0; i < n; i++)
    {
        arr[i] = input[i];
        if (i % blk_sz == 0)
        {
         
            // entering next block
            // incrementing block pointer
            blk_idx++;
        }
        block[blk_idx] += arr[i];
    }
}
 
// // Driver code
// // We have used separate array for input because
//     // the purpose of this code is to explain SQRT
//     // decomposition in competitive programming where
//     // we have multiple inputs.
//     let input = [1, 5, 2, 4, 6, 1, 3, 5, 7, 10];
//     let n = input.length;
   
//     preprocess(input, n);
   
//     document.write("query(3, 8) : " +
//                         query(3, 8)+"<br>");
//     document.write("query(1, 6) : " +
//                         query(1, 6)+"<br>");
//     update(8, 0);
//     document.write("query(8, 8) : " + 
//                         query(8, 8)+"<br>");