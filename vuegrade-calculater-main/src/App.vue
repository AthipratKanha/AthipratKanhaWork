<template>
  <div id="app">

    English 1 : 
    point = 
    <select v-model="english1.grade">
      <option value="0"> select </option>
      <option v-for="(grade, index ) in grades" :key="index" :value="grade.value">
        {{ grade.text }}
      </option> 
    </select> 
    credit = <input type="text" v-model="english1.credit"> <br><br>

    English 2 : 
    point = 
    <select v-model="english2.grade">
      <option value="0"> select </option>
      <option v-for="(grade, index ) in grades" :key="index" :value="grade.value">
        {{ grade.text }}
      </option> 
    </select> 
    credit = <input type="text" v-model="english2.credit"> <br><br>

    Thai : 
    point = 
    <select v-model="thai.grade">
      <option value="0"> select </option>
      <option v-for="(grade, index ) in grades" :key="index" :value="grade.value">
        {{ grade.text }}
      </option> 
    </select> 
    credit = <input type="text" v-model="thai.credit"> <br><br>

    Math 1 : 
    point = 
    <select v-model="math1.grade">
      <option value="0"> select </option>
      <option v-for="(grade, index ) in grades" :key="index" :value="grade.value">
        {{ grade.text }}
      </option> 
    </select> 
    credit = <input type="text" v-model="math1.credit"> <br><br>

    Math 2 : 
    point = 
    <select v-model="math2.grade">
      <option value="0"> select </option>
      <option v-for="(grade, index ) in grades" :key="index" :value="grade.value">
        {{ grade.text }}
      </option> 
    </select> 
    credit = <input type="text" v-model="math2.credit"> <br><br>

    Science 1 : 
    point = 
    <select v-model="science1.grade">
      <option value="0"> select </option>
      <option v-for="(grade, index ) in grades" :key="index" :value="grade.value">
        {{ grade.text }}
      </option> 
    </select> 
    credit = <input type="text" v-model="science1.credit"> <br><br>

    Science 2 : 
    point = <select v-model="science2.grade">
      <option value="0"> select </option>
      <option v-for="(grade, index ) in grades" :key="index" :value="grade.value">
        {{ grade.text }}
      </option> 
    </select> 
    credit = <input type="text" v-model="science2.credit"> <br><br>

    Total: {{ finalGrade.toFixed(2) }}

  </div>
</template>

<script>

export default {
  name: 'App',
  data () {
    return {
      english1: {
        grade: 0,
        credit: null
      },
      english2: {
        grade: 0,
        credit: null
      },
      thai: {
        grade: 0,
        credit: null
      },
      math1: {
        grade: 0,
        credit: null
      },
      math2: {
        grade: 0,
        credit: null
      },
      science1: {
        grade: 0,
        credit: null
      },
      science2: {
        grade: 0,
        credit: null
      },

      grades: [
        { text: 'A', value: 4 },
        { text: 'B', value: 3 },
        { text: 'C', value: 2 },
        { text: 'D', value: 1 }
      ]
    }
  },
  computed: {
    english1Total () {
      return Number(this.english1.grade) * Number(this.english1.credit)
    },
    english2Total () {
      return Number(this.english2.grade) * Number(this.english2.credit)
    },
    thaiTotal () {
      return Number(this.thai.grade) * Number(this.thai.credit)
    },
    math1Total () {
      return Number(this.math1.grade) * Number(this.math1.credit)
    },
    math2Total () {
      return Number(this.math2.grade) * Number(this.math2.credit)
    },
    science1Total () {
      return Number(this.science1.grade) * Number(this.science1.credit)
    },
    science2Total () {
      return Number(this.science2.grade) * Number(this.science2.credit)
    },
    gradeTotal () {
      return this.english1Total + this.english2Total + this.thaiTotal 
      + this.math1Total + this.math2Total + this.science1Total + this.science2Total
    },
    creditTotal () {
      return Number(this.english1.credit) + Number(this.english2.credit) + Number(this.thai.credit)
      + Number(this.math1.credit) + Number(this.math2.credit) + Number(this.science1.credit) + Number(this.science2.credit)
    },
    finalGrade () {
      return (this.gradeTotal / this.creditTotal) || 0
    }
  }
}
</script>

<style>
#app {
  padding: 24px;
}
</style>
