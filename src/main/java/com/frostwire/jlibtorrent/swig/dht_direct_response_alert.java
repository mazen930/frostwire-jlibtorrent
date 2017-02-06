/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class dht_direct_response_alert extends alert {
  private transient long swigCPtr;

  protected dht_direct_response_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.dht_direct_response_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(dht_direct_response_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_dht_direct_response_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public int type() {
    return libtorrent_jni.dht_direct_response_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.dht_direct_response_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.dht_direct_response_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.dht_direct_response_alert_message(swigCPtr, this);
  }

  public udp_endpoint getEndpoint() {
    long cPtr = libtorrent_jni.dht_direct_response_alert_endpoint_get(swigCPtr, this);
    return (cPtr == 0) ? null : new udp_endpoint(cPtr, false);
  }

  public bdecode_node response() {
    return new bdecode_node(libtorrent_jni.dht_direct_response_alert_response(swigCPtr, this), true);
  }

  public long get_userdata() {
    return libtorrent_jni.dht_direct_response_alert_get_userdata(swigCPtr, this);
  }

  public final static int priority = libtorrent_jni.dht_direct_response_alert_priority_get();
  public final static int alert_type = libtorrent_jni.dht_direct_response_alert_alert_type_get();
  public final static int static_category = libtorrent_jni.dht_direct_response_alert_static_category_get();
}
