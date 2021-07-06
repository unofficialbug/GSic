package com.GSic.common;

import java.time.*;
import java.text.*;
import java.time.*;
import java.util.*;
import java.time.format.DateTimeFormatter;

public class Time {
  private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
  private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

  /**
    Time format 
  **/
  public static String getTime(){
    LocalDateTime now = LocalDateTime.now();
    return dtf.format(now);
  }

  /**
    second Method
    if give you time in milliseconds from 1910/1/1 in long integer format

  **/
  public static Long getMilli(){
    return Instant.now().toEpochMilli();
  }
}
