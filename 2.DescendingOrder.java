function sortArrayDescending(arr) {

    arr.sort(function(a, b) {
        return b - a;
    });
}

var numbers = [5, 2, 9, 1, 5, 6];
console.log("Original array: " + numbers);
sortArrayDescending(numbers);

console.log("Sorted array in descending order: " + numbers);
