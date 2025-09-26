package com.vpdevs.otttrailer.data.repository

import com.vpdevs.otttrailer.core.domain.model.Trailer


interface TrailerRepository {
    suspend fun fetchTrailers(): List<Trailer>
}
