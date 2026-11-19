package com.zykj.message;

import com.zykj.message.server.bean.Status;

/* renamed from: com.zykj.message.b */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC4420b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f5672a;

    static {
        int[] iArr = new int[Status.values().length];
        f5672a = iArr;
        iArr[Status.LOGIN.ordinal()] = 1;
        iArr[Status.LOGOUT.ordinal()] = 2;
        iArr[Status.CRACK.ordinal()] = 3;
    }
}
