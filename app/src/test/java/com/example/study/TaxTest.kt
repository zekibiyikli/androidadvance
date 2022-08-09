package com.example.study

import com.example.study.test.Tax
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class TaxTest {

    private lateinit var tax: Tax

    @Before
    fun setup(){
        tax= Tax()
    }


    @After
    fun teardown(){

    }

    @Test
    fun calculateTaxTest(){
        val netTax=tax.calculateTax(100.0,0.1)
        assertThat(netTax).isEqualTo(10) //eğer koşulu sağlamazsa hata döndürür
    }

    @Test
    fun calculateIncomeTest(){
        var netIncome=tax.calculateIncome(100.0,0.1)
        assertThat(netIncome).isEqualTo(90)
    }
}