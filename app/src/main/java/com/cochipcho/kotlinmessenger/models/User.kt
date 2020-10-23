package com.cochipcho.kotlinmessenger.models


class User(val uid: String, val username: String, val profileImageUrl: String) {
    constructor() : this( uid = "",  username = "",  profileImageUrl = "")
}