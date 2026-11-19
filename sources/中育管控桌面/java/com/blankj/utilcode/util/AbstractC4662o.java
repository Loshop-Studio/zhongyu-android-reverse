package com.blankj.utilcode.util;

import android.content.Intent;

/* renamed from: com.blankj.utilcode.util.o */
/* loaded from: classes3.dex */
public abstract class AbstractC4662o {
    /* renamed from: a */
    public static Intent m2297a(String str) {
        String strM2335t = AbstractC4663o0.m2335t(str);
        if (AbstractC4663o0.m2304G(strM2335t)) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setClassName(str, strM2335t);
        return intent.addFlags(268435456);
    }
}
