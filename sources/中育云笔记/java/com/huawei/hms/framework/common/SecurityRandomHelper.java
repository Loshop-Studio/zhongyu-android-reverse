package com.huawei.hms.framework.common;

import android.annotation.SuppressLint;
import p007a6.AbstractC0063c;

/* loaded from: classes5.dex */
public class SecurityRandomHelper {

    @SuppressLint({"StaticFieldLeak"})
    public static volatile SecurityRandomHelper instance;

    public static SecurityRandomHelper getInstance() {
        if (instance == null) {
            synchronized (SecurityRandomHelper.class) {
                try {
                    if (instance == null) {
                        AbstractC0063c.m126f(true);
                        instance = new SecurityRandomHelper();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    public byte[] generateSecureRandom(int i10) {
        return AbstractC0063c.m124d(i10);
    }

    public String generateSecureRandomStr(int i10) {
        return AbstractC0063c.m125e(i10);
    }
}
