// Prompt the user for input
const userInput = prompt('Enter a list of numbers separated by spaces:');

// Split the input string into an array
const inputArray = userInput.split(' ');

// Convert the array elements to numbers (assuming the input is valid)
const numbers = inputArray.map(Number);

// Check if the input is valid
if (numbers.some(isNaN)) {
    console.log('Invalid input. Please enter a list of numbers separated by spaces.');
} else {
    // Sort the array in descending order
    numbers.sort((a, b) => b - a);

    // Display the sorted array
    console.log('Sorted in descending order: ' + numbers.join(' '));
}