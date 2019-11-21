/**
 * 冒泡排序：
 1.比较相邻的元素，如果第一个比第二大，就进行交换。
 2.对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素才会是最大的数。
 3.针对所有的元素重复以上的步骤，除了最后一个。
 4.重复1-3，直到排序完成。
 * @param arr
 * @returns {*}
 */
function bubbleSort1(arr){
    // console.time('改进前冒泡排序耗时');
    var len = arr.length;
    for (var i = 0; i < len; i++) {
        for (var j = 0; j < len-1-i; j++) {
            if (arr[j]>arr[j+1]){
                //相邻元素进行对比，
                var temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }
    }
    // console.timeEnd('改进前冒泡排序耗时');
    return arr;
}
var arr=[3,44,38,5,47,15,36,26,27,2,46,4,19,50,48];
// console.log(bubbleSort1(arr));

/*
*冒泡算法
* 1.比较相邻的元素，如果第一个比第二个大，就交换它们两个。
* 2.对每一对相邻的元素做同样的工作。从开始第一对到结尾最后一对，这样在最后的元素就是最大的值。
* 3.针对所有元素
* */
/**
 * 改进冒泡算法
 * 设置一个标志性变量 pos，用于记录每趟中最后一次进行交换的位置。
 * 因为再一次冒泡过程中，最后一次交换的位置之后的数据都是顺序的。
 * 由于pos位置之后的记录均已交换到位，故在进行下一趟排序时只要扫描到pos位置即可。
 */
function bubbleSort2(arr){
    // console.time('改进后冒泡排序耗时');
    var i =arr.length-1;
    while(i>0){
        var pos = 0; // 每一次冒泡开始时，无记录交换
        for (var j = 0; j < i; j++) {
            if (arr[j]>arr[j+1]){
                pos=j;// 记录交换的位置
                var tmp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=tmp;
            }
            i=pos; // pos作为下一次冒泡的终止位置
        }
        // console.timeEnd('改进后冒泡排序耗时');
        return arr;
    }
}
// var arr=[3,44,38,5,47,15,36,26,27,2,46,4,19,50,48];
// console.log(bubbleSort2(arr));


/**
 * 传统的冒泡排序中每一趟排序操作只能找到一个最大值或最小值，我们考虑用在
 * 每趟排序中进行正向和反向两边冒泡的方法，可以一次得到两个最终值，从而使排序趟数减少一半。
 */
function bubbleSort3(arr) {
    var low=0;
    var high = arr.length-1;
    var tmp,j;
    // console.time('2.改进后冒泡排序耗时');
    while (low < high) {
        for (j=low;j<high;++j){
            // 正向冒泡
            if (arr[j]>arr[j+1]){
                tmp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=tmp;
            }
        }
        high--;
        for (j=high;j>low;--j){
            if(arr[j]<arr[j-1]){
                tmp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=tmp;
            }
        }
        low++;
    }
    // console.timeEnd('2.改进后冒泡排序耗时');
    return arr;
}
// var arr=[3,44,38,5,47,15,36,26,27,2,46,4,19,50,48];
// console.log(bubbleSort3(arr));


/**
 * 选择排序
 * 时间复杂度 O(n2)
 * 首先在未排序的序列中找到最小值或最大值放在起始位置，然后再从剩余的序列中寻找最小值或最大值
 *
 */
function selectSort(arr) {
    var len=arr.length;
    var minIndex,temp;
    for (var i = 0; i < len - 1; i++) {
        minIndex=i;
        for (var j = i + 1; j < len; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex=j;
            }
        }
        temp=arr[i];
        arr[i]=arr[minIndex];
        arr[minIndex]=temp;
    }
    return arr;
}
// var arr=[3,44,38,5,47,15,36,26,27,2,46,4,19,50,48];
// console.log(selectSort(arr));

/**
 * 插入排序
 * 步骤--|
 *    1.从第一个元素开始，该元素默认已经排序。
 *    2.取出下一个元素，在已经排序的元素序列中从后向前扫描。
 *    3.如果序列中的元素大于新元素，则将该元素移到下一位置
 *    4.重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
 *    5.
 *
 */
function insertSort01(arr) {
    for (var i = 0; i < arr.length; i++) {
        var key=arr[i];
        var j= i-1;
        while (j >= 0 && arr[j] > key) {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
    }
    return arr;
}


/**
 插入排序 改进版
 查找插入位置时 使用二分查找的方式
 */
function insertSort02(arr) {
    for (var i = 0; i < arr.length; i++) {
        var key = arr[i];
        var left=0;
        var right=i-1;
        while(left<=right){
            var middle = parseInt((left+right)/2);
            if (key < arr[middle]) {
                right=middle-1;
            }else{
                left=middle+1;
            }
        }
        for (var j = i-1; j >=left; j--) {
            arr[j+1]=arr[j];
        }
        arr[left]=key;
    }
    return arr;
}
arr=[3,44,38,5,47,15,36,26,27,2,46,4,19,50,48];
console.log(insertSort02(arr));
// console.log(insertSort01(arr));


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

/** ====================2019年10月29日========================**/
/**
 * 归并算法 是建立在归并操作上的一种有效的排序算法。
 * 该算法是采用分治法 Divide and Conquer 的一个非常典型的应用。
 * 归并排序是一种稳定的排序方法。将已有序的子序列合并，得到完全有序的序列；
 * 即先使每个子序列有序，再使子序列段间有序。
 * 若将两个有序表合并成一个有序表，成为2路归并。
 *
 * 步骤 ：
 * 1、把长度为n的输入序列分成两个长度为n/2的子序列；
 * 2、对这两个子序列分别采用归并排序。
 * 3、将两个排序好的子序列合并成一个最终的排序序列。
 *
 * 算法分析：
 * 最佳情况：T(n) = O(n)
 * 最差情况：T(n) = O(nlogn)
 * 平均情况：T(n) = O(nlogn)
 */
// console.time('mergeSort use time');
function mergeSort(arr) {
    // adopt top-down recursive method
    var len = arr.length;
    if (len < 2) {
        return arr;
    }
    var middle = Math.floor(len/2),
        left=arr.slice(0,middle),
        right=arr.slice(middle);
    return merge(mergeSort(left),mergeSort(right));
}
// sort
function merge(left, right) {
    var result=[];
    console.time('mergeSort use time');
    while(left.length && right.length){
        if (left[0]<=right[0]) {
            result.push(left.shift());
        }else{
            result.push(right.shift());
        }
    }
    while(left.length){
        result.push(left.shift());
    }
    while(right.length){
        result.push(right.shift());
    }
    console.timeEnd('mergeSort use time');
    return result;
}
var arr=[3,44,38,5,47,15,36,26,27,2,46,4,19,50,48];
console.log(mergeSort(arr));


/**
 * 快速排序：
 * 首先选择一个基准，然后将待排序元素很基准相比较，最终可以得到两个序列，
 * 一个是大于基准，一个小于基准，然后对这两个序列采用上述的方法继续排序。
 *
 * 最佳情况：T(n) = O(nlogn)
 最差情况：T(n) = O(n2)
 平均情况：T(n) = O(nlogn)
 */
/**
 * 步骤 ：
 * 1.从数列中挑选一个元素，成为基准。
 * 2.排序数列，将小于基准的元素放在基准前面。将大于基准的放在其后面。
 * 3.对上述得到的两个序列重复执行1,2步骤。
 */
function quickSort01(arr,left,right) {
    console.time('1.quick sort use time');
    if (left < right) {
        var x = arr[right],
            i=left-1,
            temp;
        for (var j = left; j <= right; j++) {
            if (arr[j] <= x) {
                i++;
                temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        quickSort01(arr,left,i-1);
        quickSort01(arr,i+1,right);
    }
    console.timeEnd('1.quick sort use time');
    return arr;
}
var arr=[3,44,38,5,47,15,36,26,27,2,46,4,19,50,48];
// console.log(quickSort01(arr,0,arr.length-1));

function quickSort02(arr) {
    if (arr.length <= 1) {
        return arr;
    }
    var pivotIndex = Math.floor(arr.length/2);
    var pivot=arr.splice(pivotIndex,1)[0];
    var left=[];
    var right=[];
    for (var i = 0; i < arr.length; i++) {
        if (arr[i < pivot]) {
            left.push(arr[i]);
        }else{
            right.push(arr[i]);
        }
    }
    // console.log('quick sort  2');
    return quickSort02(left).concat([pivot],quickSort02(right));
}
console.log(quickSort02(arr));

/**
 *  堆排序利用堆这种数据结构所设计的排序算法。
 *  堆积是一个近似完全二叉树的结构，并同时满足堆积的性质：
 *  即子节点的键值或索引总是小于（或大于）它的父节点。
 *
 *
 *  最佳情况：T(n) = O(nlogn)
 *  最差情况：T(n) = O(nlogn)
 *  平均情况：T(n) = O(nlogn)
 */
function heapSort(arr) {
    var heapSize = arr.length,
        temp;
    for (var i = Math.floor(heapSize/2)-1; i >= 0; i--) {
        heapify(arr,i,heapSize);
    }
    // 堆排序
    for (var j = heapSize-1; j >=1 ; j--) {
        temp=arr[0];
        arr[0]=arr[j];
        arr[j]=temp;
        heapify(arr,0,--heapSize);
    }
    return arr;
}

function heapify(arr, x, len) {
    var l =2*x+1,
        r=2*x+2,
        largest=x,
        temp;
    if (l < len && arr[l] > arr[largest]) {
        largest=l;
    }
    if (r < len && arr[r] > arr[largest]) {
        largest=r;
    }
    if (largest != x) {
        temp=arr[x];
        arr[x]=arr[largest];
        arr[largest]=temp;
        heapify(arr,largest,len);
    }
}
// var arr=[91,60,96,13,35,65,46,65,10,30,20,31,77,81,22];
// console.log(heapSort(arr));

/**
 * 计数排序：
 * 输入的线性表的元素属于有限偏序集S；
 * 数排序的基本思想是对于给定的输入序列中的每一个元素x，
 * 确定该序列中值小于x的元素的个数
 *
 * 最佳情况：T(n) = O(n+k)
 最差情况：T(n) = O(n+k)
 平均情况：T(n) = O(n+k)
 */
function coutingSort(arr) {
    var len=arr.length,
        B=[],
        C=[],
        min=max=arr[0];
    for (var i = 0; i < len; i++) {
        min=min<=arr[i]?min:arr[i];
        max=max>=arr[i]?max:arr[i];
        C[arr[i]]=C[arr[i]]?C[arr[i]]+1:1;
    }
    for (var j = min; j < max; j++) {
        C[j+1]=(C[j+1]||0)+(C[j]||0);
    }
    for (var k = len-1; k >=0 ; k--) {
        B[C[arr[k]]-1]=arr[k];
        C[arr[k]]--;
    }
    return B;
}
var arr=[2,2,3,8,7,1,2,2,2,7,3,9,8,2,1,4,2,4,6,9,7,4,3];
console.log(coutingSort(arr));

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

/**
 * 基数排序也是一种非比较排序。对每一位进行排序，从最低位开始排序
 * 数据范围较小，建议小于1000
 * 每个数值都要大于等于0
 *
 * 最佳情况：T(n) = O(n * k)
 最差情况：T(n) = O(n * k)
 平均情况：T(n) = O(n * k)
 */
function radixSort(arr,maxDigit) {
    var mod=10,
        dev=1,
        counter=[];
    for (var i = 0; i < maxDigit; i++,dev*=10,mod*=10) {
        for (var j = 0; j < arr.length; j++) {
            var bucket = parseInt((arr[j] % mod)/dev);
            if (counter[bucket] == null) {
                counter[bucket]=[];
            }
            counter[bucket].push(arr[j]);
        }
        var pos = 0;
        for (var j = 0; j < counter.length; j++) {
            var value = null;
            if (counter[j] != null) {
                while((value=counter[j].shift())!=null){
                    arr[pos++]=value;
                }
            }
        }
    }
    return arr;
}
var arr=[3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48];
console.log(radixSort(arr,2));




