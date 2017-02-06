/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class portmap_log_alert extends alert {
  private transient long swigCPtr;

  protected portmap_log_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.portmap_log_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(portmap_log_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_portmap_log_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public int type() {
    return libtorrent_jni.portmap_log_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.portmap_log_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.portmap_log_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.portmap_log_alert_message(swigCPtr, this);
  }

  public int getMap_type() {
    return libtorrent_jni.portmap_log_alert_map_type_get(swigCPtr, this);
  }

  public String log_message() {
    return libtorrent_jni.portmap_log_alert_log_message(swigCPtr, this);
  }

  public final static int priority = libtorrent_jni.portmap_log_alert_priority_get();
  public final static int alert_type = libtorrent_jni.portmap_log_alert_alert_type_get();
  public final static int static_category = libtorrent_jni.portmap_log_alert_static_category_get();
}
