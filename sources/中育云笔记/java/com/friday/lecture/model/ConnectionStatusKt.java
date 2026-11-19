package com.friday.lecture.model;

import com.friday.lecture.model.ConnectMode;

/* loaded from: classes4.dex */
public final class ConnectionStatusKt {
    public static final ConnectMode convert2ConnectMode(int i10) {
        ConnectMode.C6153IP c6153ip = ConnectMode.C6153IP.INSTANCE;
        return i10 == c6153ip.getPasswordMaxSize() ? c6153ip : ConnectMode.Code.INSTANCE;
    }
}
