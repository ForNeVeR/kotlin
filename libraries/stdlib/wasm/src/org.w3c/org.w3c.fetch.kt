/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

package org.w3c.fetch

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.files.*
import org.w3c.xhr.*

/**
 * Exposes the JavaScript [Headers](https://developer.mozilla.org/en/docs/Web/API/Headers) to Kotlin
 */
public external open class Headers(init: JsAny? = definedExternally) : JsAny {
    fun append(name: String, value: String)
    fun delete(name: String)
    fun get(name: String): String?
    fun has(name: String): Boolean
    fun set(name: String, value: String)
}

/**
 * Exposes the JavaScript [Body](https://developer.mozilla.org/en/docs/Web/API/Body) to Kotlin
 */
public external interface Body : JsAny {
    val bodyUsed: Boolean
    fun arrayBuffer(): Promise<ArrayBuffer>
    fun blob(): Promise<Blob>
    fun formData(): Promise<FormData>
    fun json(): Promise<JsAny?>
    fun text(): Promise<JsString>
}

/**
 * Exposes the JavaScript [Request](https://developer.mozilla.org/en/docs/Web/API/Request) to Kotlin
 */
public external open class Request(input: JsAny?, init: RequestInit = definedExternally) : Body, JsAny {
    open val method: String
    open val url: String
    open val headers: Headers
    open val type: RequestType
    open val destination: RequestDestination
    open val referrer: String
    open val referrerPolicy: JsAny?
    open val mode: RequestMode
    open val credentials: RequestCredentials
    open val cache: RequestCache
    open val redirect: RequestRedirect
    open val integrity: String
    open val keepalive: Boolean
    override val bodyUsed: Boolean
    fun clone(): Request
    override fun arrayBuffer(): Promise<ArrayBuffer>
    override fun blob(): Promise<Blob>
    override fun formData(): Promise<FormData>
    override fun json(): Promise<JsAny?>
    override fun text(): Promise<JsString>
}

public external interface RequestInit : JsAny {
    var method: String?
        get() = definedExternally
        set(value) = definedExternally
    var headers: JsAny?
        get() = definedExternally
        set(value) = definedExternally
    var body: JsAny?
        get() = definedExternally
        set(value) = definedExternally
    var referrer: String?
        get() = definedExternally
        set(value) = definedExternally
    var referrerPolicy: JsAny?
        get() = definedExternally
        set(value) = definedExternally
    var mode: RequestMode?
        get() = definedExternally
        set(value) = definedExternally
    var credentials: RequestCredentials?
        get() = definedExternally
        set(value) = definedExternally
    var cache: RequestCache?
        get() = definedExternally
        set(value) = definedExternally
    var redirect: RequestRedirect?
        get() = definedExternally
        set(value) = definedExternally
    var integrity: String?
        get() = definedExternally
        set(value) = definedExternally
    var keepalive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var window: JsAny?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public fun RequestInit(method: String? = undefined, headers: JsAny? = undefined, body: JsAny? = undefined, referrer: String? = undefined, referrerPolicy: JsAny? = undefined, mode: RequestMode? = undefined, credentials: RequestCredentials? = undefined, cache: RequestCache? = undefined, redirect: RequestRedirect? = undefined, integrity: String? = undefined, keepalive: Boolean? = undefined, window: JsAny? = undefined): RequestInit { js("return { method, headers, body, referrer, referrerPolicy, mode, credentials, cache, redirect, integrity, keepalive, window };") }

/**
 * Exposes the JavaScript [Response](https://developer.mozilla.org/en/docs/Web/API/Response) to Kotlin
 */
public external open class Response(body: JsAny? = definedExternally, init: ResponseInit = definedExternally) : Body, JsAny {
    open val type: ResponseType
    open val url: String
    open val redirected: Boolean
    open val status: Short
    open val ok: Boolean
    open val statusText: String
    open val headers: Headers
    open val body: JsAny?
    open val trailer: Promise<Headers>
    override val bodyUsed: Boolean
    fun clone(): Response
    override fun arrayBuffer(): Promise<ArrayBuffer>
    override fun blob(): Promise<Blob>
    override fun formData(): Promise<FormData>
    override fun json(): Promise<JsAny?>
    override fun text(): Promise<JsString>

    companion object {
        fun error(): Response
        fun redirect(url: String, status: Short = definedExternally): Response
    }
}

public external interface ResponseInit : JsAny {
    var status: Short? /* = 200 */
        get() = definedExternally
        set(value) = definedExternally
    var statusText: String? /* = "OK" */
        get() = definedExternally
        set(value) = definedExternally
    var headers: JsAny?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public fun ResponseInit(status: Short? = 200, statusText: String? = "OK", headers: JsAny? = undefined): ResponseInit { js("return { status, statusText, headers };") }

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface RequestType : JsAny {
    companion object
}

public inline val RequestType.Companion.EMPTY: RequestType get() = "".asDynamic().unsafeCast<RequestType>()

public inline val RequestType.Companion.AUDIO: RequestType get() = "audio".asDynamic().unsafeCast<RequestType>()

public inline val RequestType.Companion.FONT: RequestType get() = "font".asDynamic().unsafeCast<RequestType>()

public inline val RequestType.Companion.IMAGE: RequestType get() = "image".asDynamic().unsafeCast<RequestType>()

public inline val RequestType.Companion.SCRIPT: RequestType get() = "script".asDynamic().unsafeCast<RequestType>()

public inline val RequestType.Companion.STYLE: RequestType get() = "style".asDynamic().unsafeCast<RequestType>()

public inline val RequestType.Companion.TRACK: RequestType get() = "track".asDynamic().unsafeCast<RequestType>()

public inline val RequestType.Companion.VIDEO: RequestType get() = "video".asDynamic().unsafeCast<RequestType>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface RequestDestination : JsAny {
    companion object
}

public inline val RequestDestination.Companion.EMPTY: RequestDestination get() = "".asDynamic().unsafeCast<RequestDestination>()

public inline val RequestDestination.Companion.DOCUMENT: RequestDestination get() = "document".asDynamic().unsafeCast<RequestDestination>()

public inline val RequestDestination.Companion.EMBED: RequestDestination get() = "embed".asDynamic().unsafeCast<RequestDestination>()

public inline val RequestDestination.Companion.FONT: RequestDestination get() = "font".asDynamic().unsafeCast<RequestDestination>()

public inline val RequestDestination.Companion.IMAGE: RequestDestination get() = "image".asDynamic().unsafeCast<RequestDestination>()

public inline val RequestDestination.Companion.MANIFEST: RequestDestination get() = "manifest".asDynamic().unsafeCast<RequestDestination>()

public inline val RequestDestination.Companion.MEDIA: RequestDestination get() = "media".asDynamic().unsafeCast<RequestDestination>()

public inline val RequestDestination.Companion.OBJECT: RequestDestination get() = "object".asDynamic().unsafeCast<RequestDestination>()

public inline val RequestDestination.Companion.REPORT: RequestDestination get() = "report".asDynamic().unsafeCast<RequestDestination>()

public inline val RequestDestination.Companion.SCRIPT: RequestDestination get() = "script".asDynamic().unsafeCast<RequestDestination>()

public inline val RequestDestination.Companion.SERVICEWORKER: RequestDestination get() = "serviceworker".asDynamic().unsafeCast<RequestDestination>()

public inline val RequestDestination.Companion.SHAREDWORKER: RequestDestination get() = "sharedworker".asDynamic().unsafeCast<RequestDestination>()

public inline val RequestDestination.Companion.STYLE: RequestDestination get() = "style".asDynamic().unsafeCast<RequestDestination>()

public inline val RequestDestination.Companion.WORKER: RequestDestination get() = "worker".asDynamic().unsafeCast<RequestDestination>()

public inline val RequestDestination.Companion.XSLT: RequestDestination get() = "xslt".asDynamic().unsafeCast<RequestDestination>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface RequestMode : JsAny {
    companion object
}

public inline val RequestMode.Companion.NAVIGATE: RequestMode get() = "navigate".asDynamic().unsafeCast<RequestMode>()

public inline val RequestMode.Companion.SAME_ORIGIN: RequestMode get() = "same-origin".asDynamic().unsafeCast<RequestMode>()

public inline val RequestMode.Companion.NO_CORS: RequestMode get() = "no-cors".asDynamic().unsafeCast<RequestMode>()

public inline val RequestMode.Companion.CORS: RequestMode get() = "cors".asDynamic().unsafeCast<RequestMode>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface RequestCredentials : JsAny {
    companion object
}

public inline val RequestCredentials.Companion.OMIT: RequestCredentials get() = "omit".asDynamic().unsafeCast<RequestCredentials>()

public inline val RequestCredentials.Companion.SAME_ORIGIN: RequestCredentials get() = "same-origin".asDynamic().unsafeCast<RequestCredentials>()

public inline val RequestCredentials.Companion.INCLUDE: RequestCredentials get() = "include".asDynamic().unsafeCast<RequestCredentials>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface RequestCache : JsAny {
    companion object
}

public inline val RequestCache.Companion.DEFAULT: RequestCache get() = "default".asDynamic().unsafeCast<RequestCache>()

public inline val RequestCache.Companion.NO_STORE: RequestCache get() = "no-store".asDynamic().unsafeCast<RequestCache>()

public inline val RequestCache.Companion.RELOAD: RequestCache get() = "reload".asDynamic().unsafeCast<RequestCache>()

public inline val RequestCache.Companion.NO_CACHE: RequestCache get() = "no-cache".asDynamic().unsafeCast<RequestCache>()

public inline val RequestCache.Companion.FORCE_CACHE: RequestCache get() = "force-cache".asDynamic().unsafeCast<RequestCache>()

public inline val RequestCache.Companion.ONLY_IF_CACHED: RequestCache get() = "only-if-cached".asDynamic().unsafeCast<RequestCache>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface RequestRedirect : JsAny {
    companion object
}

public inline val RequestRedirect.Companion.FOLLOW: RequestRedirect get() = "follow".asDynamic().unsafeCast<RequestRedirect>()

public inline val RequestRedirect.Companion.ERROR: RequestRedirect get() = "error".asDynamic().unsafeCast<RequestRedirect>()

public inline val RequestRedirect.Companion.MANUAL: RequestRedirect get() = "manual".asDynamic().unsafeCast<RequestRedirect>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface ResponseType : JsAny {
    companion object
}

public inline val ResponseType.Companion.BASIC: ResponseType get() = "basic".asDynamic().unsafeCast<ResponseType>()

public inline val ResponseType.Companion.CORS: ResponseType get() = "cors".asDynamic().unsafeCast<ResponseType>()

public inline val ResponseType.Companion.DEFAULT: ResponseType get() = "default".asDynamic().unsafeCast<ResponseType>()

public inline val ResponseType.Companion.ERROR: ResponseType get() = "error".asDynamic().unsafeCast<ResponseType>()

public inline val ResponseType.Companion.OPAQUE: ResponseType get() = "opaque".asDynamic().unsafeCast<ResponseType>()

public inline val ResponseType.Companion.OPAQUEREDIRECT: ResponseType get() = "opaqueredirect".asDynamic().unsafeCast<ResponseType>()