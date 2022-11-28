// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: elide/struct/bloom.proto

package tools.elide.struct;

public interface BloomFilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:struct.BloomFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Hash algorithm in use for this Bloom filter. This must be considered an immutable value for a constituted filter,
   * otherwise the underlying data may be rendered unusable.
   * </pre>
   *
   * <code>.crypto.HashAlgorithm algorithm = 1;</code>
   * @return The enum numeric value on the wire for algorithm.
   */
  int getAlgorithmValue();
  /**
   * <pre>
   * Hash algorithm in use for this Bloom filter. This must be considered an immutable value for a constituted filter,
   * otherwise the underlying data may be rendered unusable.
   * </pre>
   *
   * <code>.crypto.HashAlgorithm algorithm = 1;</code>
   * @return The algorithm.
   */
  tools.elide.crypto.HashAlgorithm getAlgorithm();

  /**
   * <pre>
   * Number of hash rounds to apply when adding data to this filter.
   * </pre>
   *
   * <code>uint32 rounds = 2;</code>
   * @return The rounds.
   */
  int getRounds();

  /**
   * <pre>
   * Number of items in the filter, across all layers.
   * </pre>
   *
   * <code>uint64 count = 3;</code>
   * @return The count.
   */
  long getCount();

  /**
   * <pre>
   * Limit setting to enforce for this Bloom filter, before re-calculating contents. Optional.
   * </pre>
   *
   * <code>uint64 limit = 4;</code>
   * @return The limit.
   */
  long getLimit();

  /**
   * <pre>
   * Specifies each layer of this Bloom filter structure. If no more than one layer is present, the structure represents
   * a simple, single-layer regular Bloom filter. If more than one layer are present, the structure represents a multi-
   * layer (*Layered*) Bloom filter.
   * </pre>
   *
   * <code>repeated .struct.BloomFilter.FilterLayer layer = 5;</code>
   */
  java.util.List<tools.elide.struct.BloomFilter.FilterLayer> 
      getLayerList();
  /**
   * <pre>
   * Specifies each layer of this Bloom filter structure. If no more than one layer is present, the structure represents
   * a simple, single-layer regular Bloom filter. If more than one layer are present, the structure represents a multi-
   * layer (*Layered*) Bloom filter.
   * </pre>
   *
   * <code>repeated .struct.BloomFilter.FilterLayer layer = 5;</code>
   */
  tools.elide.struct.BloomFilter.FilterLayer getLayer(int index);
  /**
   * <pre>
   * Specifies each layer of this Bloom filter structure. If no more than one layer is present, the structure represents
   * a simple, single-layer regular Bloom filter. If more than one layer are present, the structure represents a multi-
   * layer (*Layered*) Bloom filter.
   * </pre>
   *
   * <code>repeated .struct.BloomFilter.FilterLayer layer = 5;</code>
   */
  int getLayerCount();
  /**
   * <pre>
   * Specifies each layer of this Bloom filter structure. If no more than one layer is present, the structure represents
   * a simple, single-layer regular Bloom filter. If more than one layer are present, the structure represents a multi-
   * layer (*Layered*) Bloom filter.
   * </pre>
   *
   * <code>repeated .struct.BloomFilter.FilterLayer layer = 5;</code>
   */
  java.util.List<? extends tools.elide.struct.BloomFilter.FilterLayerOrBuilder> 
      getLayerOrBuilderList();
  /**
   * <pre>
   * Specifies each layer of this Bloom filter structure. If no more than one layer is present, the structure represents
   * a simple, single-layer regular Bloom filter. If more than one layer are present, the structure represents a multi-
   * layer (*Layered*) Bloom filter.
   * </pre>
   *
   * <code>repeated .struct.BloomFilter.FilterLayer layer = 5;</code>
   */
  tools.elide.struct.BloomFilter.FilterLayerOrBuilder getLayerOrBuilder(
      int index);
}