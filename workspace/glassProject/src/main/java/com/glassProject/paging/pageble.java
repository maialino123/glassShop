package com.glassProject.paging;

import com.glassProject.sort.sorter;

public interface pageble {
  Integer getPage();
  Integer getOffset();
  Integer getLimit();
  sorter getSorter();
}
