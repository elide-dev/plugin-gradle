//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: elide/model/model.proto

package tools.elide.model;

@kotlin.jvm.JvmName("-initializebigQueryOptions")
inline fun bigQueryOptions(block: tools.elide.model.BigQueryOptionsKt.Dsl.() -> kotlin.Unit): tools.elide.model.BigQueryOptions =
  tools.elide.model.BigQueryOptionsKt.Dsl._create(tools.elide.model.BigQueryOptions.newBuilder()).apply { block() }._build()
object BigQueryOptionsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: tools.elide.model.BigQueryOptions.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tools.elide.model.BigQueryOptions.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tools.elide.model.BigQueryOptions = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
inline fun tools.elide.model.BigQueryOptions.copy(block: tools.elide.model.BigQueryOptionsKt.Dsl.() -> kotlin.Unit): tools.elide.model.BigQueryOptions =
  tools.elide.model.BigQueryOptionsKt.Dsl._create(this.toBuilder()).apply { block() }._build()
