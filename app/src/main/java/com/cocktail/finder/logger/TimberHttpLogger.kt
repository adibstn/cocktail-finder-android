package com.cocktail.finder.logger

import okhttp3.logging.HttpLoggingInterceptor
import timber.log.Timber

class TimberHttpLogger : HttpLoggingInterceptor.Logger {
    override fun log(message: String) {
        Timber.tag("OKHTTP")
        Timber.d(message)
    }
}