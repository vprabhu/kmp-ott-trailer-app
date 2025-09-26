package com.vpdevs.otttrailer.data.repository

import com.vpdevs.otttrailer.core.domain.model.Trailer
import com.vpdevs.otttrailer.data.remote.RemoteTrailerDataSource

class TrailerRepositoryImpl(private val remote: RemoteTrailerDataSource) : TrailerRepository {
    override suspend fun fetchTrailers(): List<Trailer> = remote.fetchTrailers()
}