package com.production.ruslanio.caloriescalculator.aspects


import android.util.Log
import com.production.ruslanio.caloriescalculator.aspects.annotations.LogThis


/**
 * Created by Ruslanio on 07.02.2018.
 */
//@Aspect
class Logger {

//    val timeValues: HashMap<String, Long> = HashMap()
//
//    @Pointcut("annotation(com.production.ruslanio.caloriescalculator.aspects.annotations.LogThis)")
//    private fun annotated() {
//    }
//
//    @Pointcut("execution(* *(..))")
//    private fun everyMethod() {
//    }
//
//    @Before("annotated() && everyMethod()")
//    fun onMethodStart(joinPoint: JoinPoint) {
//        var start: Long = System.currentTimeMillis();
//        var signature: MethodSignature = joinPoint.signature as MethodSignature
//        var methodName: String = signature.name
//
//        timeValues.put(methodName, start)
//
//
//
//    }
//
//    @After("annotated() && everyMethod()")
//    fun onMethodStop(joinPoint: JoinPoint) {
//        var signature: MethodSignature = joinPoint.signature as MethodSignature
//        var methodName: String = signature.name
//        var annotation: LogThis? = signature.method.annotations
//                .filterIsInstance(LogThis::class.java)
//                .firstOrNull()
//        var time : Long = System.currentTimeMillis() - timeValues.get(methodName)!!
//        Log.i(annotation?.tag, "method ::" + methodName + ":: was executed. Work time = " + time + ". Message = " + annotation?.message)
//
//    }
}