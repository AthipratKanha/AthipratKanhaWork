const displayElement = document.getElementById('calculator-display')



const buttonPressed = (character) => {
    displayElement.value = displayElement.value + character
}

const compute = () => {
    displayElement.value = eval(displayElement.value)
}

const clearDisplay = () => {
    displayElement.value = ''
}

const DeleteLastCharacter = () => {
    displayElement.value = displayElement.value.slice(0, displayElement.value.length -1)
}