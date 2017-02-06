/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class stats_alert extends torrent_alert {
  private transient long swigCPtr;

  protected stats_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.stats_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(stats_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_stats_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public int type() {
    return libtorrent_jni.stats_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.stats_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.stats_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.stats_alert_message(swigCPtr, this);
  }

  public int getInterval() {
    return libtorrent_jni.stats_alert_interval_get(swigCPtr, this);
  }

  public int get_transferred(int index) {
    return libtorrent_jni.stats_alert_get_transferred(swigCPtr, this, index);
  }

  public final static int priority = libtorrent_jni.stats_alert_priority_get();
  public final static int alert_type = libtorrent_jni.stats_alert_alert_type_get();
  public final static int static_category = libtorrent_jni.stats_alert_static_category_get();
  public final static class stats_channel {
    public final static stats_alert.stats_channel upload_payload = new stats_alert.stats_channel("upload_payload");
    public final static stats_alert.stats_channel upload_protocol = new stats_alert.stats_channel("upload_protocol");
    public final static stats_alert.stats_channel download_payload = new stats_alert.stats_channel("download_payload");
    public final static stats_alert.stats_channel download_protocol = new stats_alert.stats_channel("download_protocol");
    public final static stats_alert.stats_channel upload_ip_protocol = new stats_alert.stats_channel("upload_ip_protocol");
    public final static stats_alert.stats_channel download_ip_protocol = new stats_alert.stats_channel("download_ip_protocol", libtorrent_jni.stats_alert_download_ip_protocol_get());
    public final static stats_alert.stats_channel num_channels = new stats_alert.stats_channel("num_channels", libtorrent_jni.stats_alert_num_channels_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static stats_channel swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + stats_channel.class + " with value " + swigValue);
    }

    private stats_channel(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private stats_channel(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private stats_channel(String swigName, stats_channel swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static stats_channel[] swigValues = { upload_payload, upload_protocol, download_payload, download_protocol, upload_ip_protocol, download_ip_protocol, num_channels };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
