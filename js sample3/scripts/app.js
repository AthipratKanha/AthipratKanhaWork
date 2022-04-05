const color = document.getElementById('color')
const colorCode = document.getElementById('code')
const generateButton = document.getElementById('generate-button')

const generateColor = () => {
    const patterns = '0123456789abcdefg'
    let newColor = '#'

    for (let index = 0; index < 6; index++) {
        const random = Math.floor((Math.random() * 16))
        newColor += patterns[random]
    }

    color.style.backgroundColor = newColor
    colorCode.innerHTML = newColor
}

generateButton.addEventListener('click', generateColor)