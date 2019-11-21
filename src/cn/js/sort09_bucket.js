/**
 *  桶排序的工作原理：
 *  假设输入数据服从均匀分布，将数据分到有限数量的桶里，每个桶再分别排序。
 */
function bucketSort(arr,bucketCount) {
    if (arr.length <= 1) {
        return arr;
    }
    bucketCount = bucketCount || 10;
    // initialize the bucket
    var len = arr.length,
        buckets=[],
        result=[],
        max=arr[0],
        min=arr[0];
    for (var i = 0; i < len; i++) {
        min=min<=arr[i]?min:arr[i];
        max=max>=arr[i]?max:arr[i];
    }
    // count the range of every bucket
    var space =(max-min+1)/bucketCount;
    // put the number into the bucket
    for (var i = 0; i < len; i++) {
        // find the bucket
        var index= Math.floor((arr[i]-min)/space);
        // judge whether there are elements in the bucket
        if (buckets[index]) {
            // array from small to large
            var bucket = buckets[index];
            var k = bucket.length-1;
            while(k>=0&&buckets[index][k]>arr[i]){
                buckets[index][k+1]=buckets[index][k];
                k--;
            }
            buckets[index][k+1]=arr[i];
        }else {
            // add number into the bucket
            buckets[index]=[];
            buckets[index].push(arr[i]);
        }
    }
    // merge the bucket
    var n=0;
    while(n<bucketCount){
        if (buckets[n]) {
            result=result.concat(buckets[n]);
        }
        n++;
    }
    return result;
}
arr=[3,44,38,5,47,15,36,26,27,2,46,4,19,50,48];
console.log(bucketSort(arr,6));
