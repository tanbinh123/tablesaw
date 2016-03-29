package com.deathrayresearch.outlier.splitter;

/**
 *
 */
public interface Splitter {

  //TableGroup split(Table t);

  /**
   * When applied to a record in a table, returns a String used to group records
   */
  String groupKey();

}
