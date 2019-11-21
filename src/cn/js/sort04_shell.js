/**
 *  希尔排序的核心在于间隔序列的设定。
 *  步骤：先将整个带排序的记录序列分割成若干个子序列分别进行直接插入排序
 *  1.选择一个增量序列t1,t2,,,ti,tj,,,tk;tk=1;
 *  2.按增量序列个数k，对序列进行k趟排序；
 *  3.每趟排序，根据对应的增量ti，进行排序。.
 */
function shellSort(arr) {
    var len=arr.length,
        temp,
        gap=1;
    console.log(gap);
    while(gap< len/5 ){
        gap=gap*5+1;
        console.log(gap);
    }
    for (gap;gap>0;gap=Math.floor(gap/5)) {
        console.log(gap);
        for (var i = gap; i < len; i++) {
            temp=arr[i];
            for (var j = i-gap; j>=0&&arr[j]>temp; j-=gap) {
                arr[j+gap]=arr[j];
            }
            arr[j+gap]=temp;
        }
    }
    return arr;
}
console.log(Math.floor(6/5));
var arr=[3,44,38,5,47,15,36,26,27,2,46,4,19,50,48];
console.log(shellSort(arr));
