package com.zykj.message.client;

import com.zykj.message.server.bean.Status;

/* renamed from: com.zykj.message.client.e */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC4429e {

    /* renamed from: a */
    public static final /* synthetic */ int[] f5687a;

    static {
        int[] iArr = new int[Status.values().length];
        f5687a = iArr;
        iArr[Status.LOGIN.ordinal()] = 1;
        iArr[Status.LOGOUT.ordinal()] = 2;
        iArr[Status.CRACK.ordinal()] = 3;
    }
}
