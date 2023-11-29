function reverseWords(sentence) {
    var wordsArray = sentence.split(' ');

    var reversedWordsArray = wordsArray.map(function(word) {
        return word.split('').reverse().join('');
    });

    var reversedSentence = reversedWordsArray.join(' ');

    return reversedSentence;
}

var inputSentence = "Hello World, how are you?";
var reversedSentence = reverseWords(inputSentence);

console.log("Original Sentence: " + inputSentence);
console.log("Reversed Sentence: " + reversedSentence);
