package com.blankj.utilcode.util;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Random;
import p139p7.AbstractC6396c;

/* renamed from: com.blankj.utilcode.util.r */
/* loaded from: classes2.dex */
public final class C3398r extends ThreadLocal {

    /* renamed from: a */
    public final /* synthetic */ int f2176a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f2176a) {
            case 0:
                return new HashMap();
            case 1:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(AbstractC6396c.f10491f);
                return simpleDateFormat;
            default:
                return new Random();
        }
    }
}
