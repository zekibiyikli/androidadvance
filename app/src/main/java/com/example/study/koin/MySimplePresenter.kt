package com.example.study.koin

class MySimplePresenter(val repo: HelloRepository) {

    fun sayHello() = "${repo.giveHello()} from MySimplePresenter"
}
