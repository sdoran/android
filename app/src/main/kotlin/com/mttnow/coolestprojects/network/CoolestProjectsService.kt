package com.mttnow.coolestprojects.network

import com.mttnow.coolestprojects.models.Speaker
import com.mttnow.coolestprojects.models.SponsorTier
import com.mttnow.coolestprojects.models.Summary
import com.mttnow.coolestprojects.models.Summit
import retrofit2.http.GET
import retrofit2.http.Url
import rx.Observable

/*
* https://coolestprojectsapp.firebaseio.com/speakers.json
https://coolestprojectsapp.firebaseio.com/sponsors.json?orderBy="order"
https://coolestprojectsapp.firebaseio.com/summits.json
https://register.coolestprojects.org/api/project/summary*/

val SUMMARIES_URL = "https://register.coolestprojects.org/api/project/summary"

interface CoolestProjectsService {

  @GET("speakers.json")
  fun speakers() : Observable<List<Speaker>>

  @GET("summits.json")
  fun summits() : Observable<List<Summit>>

  @GET("sponsors.json")
  fun sponsors() : Observable<List<SponsorTier>>

  @GET
  fun summaries(@Url url : String) : Observable<List<Summary>>
}