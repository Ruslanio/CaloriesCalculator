package com.production.ruslanio.caloriescalculator.aspects.annotations

/**
 * Created by Ruslanio on 07.02.2018.
 */
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class LogThis constructor(val tag : String = "base_tag", val message : String = "none")