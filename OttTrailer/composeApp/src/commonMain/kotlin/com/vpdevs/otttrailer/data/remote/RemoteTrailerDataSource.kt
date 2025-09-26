package com.vpdevs.otttrailer.data.remote

import com.vpdevs.otttrailer.core.domain.model.Trailer
import io.ktor.client.*
import io.ktor.client.request.*
import kotlinx.serialization.json.Json

class RemoteTrailerDataSource(private val httpClient: HttpClient) {
    suspend fun fetchTrailers(): List<Trailer> {
        val response: String = httpClient.get("https://gist.githubusercontent.com/poudyalanil/ca84582cbeb4fc123a13290a586da925/raw/14a27bd0bcd0cd323b35ad79cf3b493dddf6216b/videos.json").toString()
        return Json.decodeFromString<List<Trailer>>(response)
    }
}