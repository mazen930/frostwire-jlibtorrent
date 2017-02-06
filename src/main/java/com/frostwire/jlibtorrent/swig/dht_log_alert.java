/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class dht_log_alert extends alert {
  private transient long swigCPtr;

  protected dht_log_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.dht_log_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(dht_log_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_dht_log_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public int type() {
    return libtorrent_jni.dht_log_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.dht_log_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.dht_log_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.dht_log_alert_message(swigCPtr, this);
  }

  public String log_message() {
    return libtorrent_jni.dht_log_alert_log_message(swigCPtr, this);
  }

  public dht_log_alert.dht_module_t getModule() {
    return dht_log_alert.dht_module_t.swigToEnum(libtorrent_jni.dht_log_alert_module_get(swigCPtr, this));
  }

  public final static class dht_module_t {
    public final static dht_log_alert.dht_module_t tracker = new dht_log_alert.dht_module_t("tracker");
    public final static dht_log_alert.dht_module_t node = new dht_log_alert.dht_module_t("node");
    public final static dht_log_alert.dht_module_t routing_table = new dht_log_alert.dht_module_t("routing_table");
    public final static dht_log_alert.dht_module_t rpc_manager = new dht_log_alert.dht_module_t("rpc_manager");
    public final static dht_log_alert.dht_module_t traversal = new dht_log_alert.dht_module_t("traversal");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static dht_module_t swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + dht_module_t.class + " with value " + swigValue);
    }

    private dht_module_t(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private dht_module_t(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private dht_module_t(String swigName, dht_module_t swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static dht_module_t[] swigValues = { tracker, node, routing_table, rpc_manager, traversal };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static int static_category = libtorrent_jni.dht_log_alert_static_category_get();
  public final static int priority = libtorrent_jni.dht_log_alert_priority_get();
  public final static int alert_type = libtorrent_jni.dht_log_alert_alert_type_get();
}
