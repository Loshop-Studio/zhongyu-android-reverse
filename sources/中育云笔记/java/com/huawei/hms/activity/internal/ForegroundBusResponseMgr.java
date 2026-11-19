package com.huawei.hms.activity.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class ForegroundBusResponseMgr {

    /* renamed from: b */
    public static final ForegroundBusResponseMgr f11280b = new ForegroundBusResponseMgr();

    /* renamed from: a */
    public final Map f11281a = new HashMap();

    public static ForegroundBusResponseMgr getInstance() {
        return f11280b;
    }

    public BusResponseCallback get(String str) {
        BusResponseCallback busResponseCallback;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f11281a) {
            busResponseCallback = (BusResponseCallback) this.f11281a.get(str);
        }
        return busResponseCallback;
    }

    public void registerObserver(String str, BusResponseCallback busResponseCallback) {
        if (TextUtils.isEmpty(str) || busResponseCallback == null) {
            return;
        }
        synchronized (this.f11281a) {
            try {
                if (!this.f11281a.containsKey(str)) {
                    this.f11281a.put(str, busResponseCallback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void unRegisterObserver(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f11281a) {
            this.f11281a.remove(str);
        }
    }
}
