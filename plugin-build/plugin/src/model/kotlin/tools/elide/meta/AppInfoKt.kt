//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: elide/meta/app.proto

package tools.elide.meta;

@kotlin.jvm.JvmName("-initializeappInfo")
inline fun appInfo(block: tools.elide.meta.AppInfoKt.Dsl.() -> kotlin.Unit): tools.elide.meta.AppInfo =
  tools.elide.meta.AppInfoKt.Dsl._create(tools.elide.meta.AppInfo.newBuilder()).apply { block() }._build()
object AppInfoKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: tools.elide.meta.AppInfo.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tools.elide.meta.AppInfo.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tools.elide.meta.AppInfo = _builder.build()

    /**
     * <pre>
     * Version string of the application.
     * </pre>
     *
     * <code>string version = 1;</code>
     */
    var version: kotlin.String
      @JvmName("getVersion")
      get() = _builder.getVersion()
      @JvmName("setVersion")
      set(value) {
        _builder.setVersion(value)
      }
    /**
     * <pre>
     * Version string of the application.
     * </pre>
     *
     * <code>string version = 1;</code>
     */
    fun clearVersion() {
      _builder.clearVersion()
    }

    /**
     * <pre>
     * Name of the application, if known.
     * </pre>
     *
     * <code>optional string name = 2;</code>
     */
    var name: kotlin.String
      @JvmName("getName")
      get() = _builder.getName()
      @JvmName("setName")
      set(value) {
        _builder.setName(value)
      }
    /**
     * <pre>
     * Name of the application, if known.
     * </pre>
     *
     * <code>optional string name = 2;</code>
     */
    fun clearName() {
      _builder.clearName()
    }
    /**
     * <pre>
     * Name of the application, if known.
     * </pre>
     *
     * <code>optional string name = 2;</code>
     * @return Whether the name field is set.
     */
    fun hasName(): kotlin.Boolean {
      return _builder.hasName()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class EndpointsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * Map of endpoint tags to their info payloads for this application.
     * </pre>
     *
     * <code>map&lt;string, .meta.Endpoint&gt; endpoints = 3;</code>
     */
     val endpoints: com.google.protobuf.kotlin.DslMap<kotlin.String, tools.elide.meta.Endpoint, EndpointsProxy>
      @kotlin.jvm.JvmSynthetic
      @JvmName("getEndpointsMap")
      get() = com.google.protobuf.kotlin.DslMap(
        _builder.getEndpointsMap()
      )
    /**
     * <pre>
     * Map of endpoint tags to their info payloads for this application.
     * </pre>
     *
     * <code>map&lt;string, .meta.Endpoint&gt; endpoints = 3;</code>
     */
    @JvmName("putEndpoints")
    fun com.google.protobuf.kotlin.DslMap<kotlin.String, tools.elide.meta.Endpoint, EndpointsProxy>
      .put(key: kotlin.String, value: tools.elide.meta.Endpoint) {
         _builder.putEndpoints(key, value)
       }
    /**
     * <pre>
     * Map of endpoint tags to their info payloads for this application.
     * </pre>
     *
     * <code>map&lt;string, .meta.Endpoint&gt; endpoints = 3;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("setEndpoints")
    @Suppress("NOTHING_TO_INLINE")
    inline operator fun com.google.protobuf.kotlin.DslMap<kotlin.String, tools.elide.meta.Endpoint, EndpointsProxy>
      .set(key: kotlin.String, value: tools.elide.meta.Endpoint) {
         put(key, value)
       }
    /**
     * <pre>
     * Map of endpoint tags to their info payloads for this application.
     * </pre>
     *
     * <code>map&lt;string, .meta.Endpoint&gt; endpoints = 3;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("removeEndpoints")
    fun com.google.protobuf.kotlin.DslMap<kotlin.String, tools.elide.meta.Endpoint, EndpointsProxy>
      .remove(key: kotlin.String) {
         _builder.removeEndpoints(key)
       }
    /**
     * <pre>
     * Map of endpoint tags to their info payloads for this application.
     * </pre>
     *
     * <code>map&lt;string, .meta.Endpoint&gt; endpoints = 3;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("putAllEndpoints")
    fun com.google.protobuf.kotlin.DslMap<kotlin.String, tools.elide.meta.Endpoint, EndpointsProxy>
      .putAll(map: kotlin.collections.Map<kotlin.String, tools.elide.meta.Endpoint>) {
         _builder.putAllEndpoints(map)
       }
    /**
     * <pre>
     * Map of endpoint tags to their info payloads for this application.
     * </pre>
     *
     * <code>map&lt;string, .meta.Endpoint&gt; endpoints = 3;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("clearEndpoints")
    fun com.google.protobuf.kotlin.DslMap<kotlin.String, tools.elide.meta.Endpoint, EndpointsProxy>
      .clear() {
         _builder.clearEndpoints()
       }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun tools.elide.meta.AppInfo.copy(block: tools.elide.meta.AppInfoKt.Dsl.() -> kotlin.Unit): tools.elide.meta.AppInfo =
  tools.elide.meta.AppInfoKt.Dsl._create(this.toBuilder()).apply { block() }._build()

