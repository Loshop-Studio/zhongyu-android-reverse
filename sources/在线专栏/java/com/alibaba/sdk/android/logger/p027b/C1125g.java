package com.alibaba.sdk.android.logger.p027b;

import com.taobao.accs.AccsClientConfig;

/* renamed from: com.alibaba.sdk.android.logger.b.g */
/* loaded from: classes.dex */
public class C1125g {

    /* renamed from: a */
    private String f6571a;

    public C1125g(String str) {
        this.f6571a = str;
        if (str == null) {
            this.f6571a = AccsClientConfig.DEFAULT_CONFIG_TAG;
        }
    }

    /* renamed from: a */
    public String m5105a(Object obj) {
        String simpleName;
        if (obj == null) {
            simpleName = "";
        } else if (obj instanceof Class) {
            simpleName = ((Class) obj).getSimpleName();
        } else if (obj instanceof String) {
            simpleName = (String) obj;
        } else {
            simpleName = obj.getClass().getSimpleName() + "@" + obj.hashCode();
        }
        return this.f6571a + "_" + simpleName;
    }
}
