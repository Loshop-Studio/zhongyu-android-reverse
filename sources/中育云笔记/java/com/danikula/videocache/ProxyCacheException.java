package com.danikula.videocache;

/* loaded from: classes3.dex */
public class ProxyCacheException extends Exception {
    public ProxyCacheException(String str) {
        super(str + ". Version: 11.0.0");
    }

    public ProxyCacheException(String str, Throwable th) {
        super(str + ". Version: 11.0.0", th);
    }
}
