package com.alibaba.sdk.android.logger.p057b;

import com.huawei.hms.framework.common.BundleUtil;
import com.taobao.accs.AccsClientConfig;

/* renamed from: com.alibaba.sdk.android.logger.b.g */
/* loaded from: classes3.dex */
public class C5609g {

    /* renamed from: a */
    private String f4090a;

    public C5609g(String str) {
        this.f4090a = str;
        if (str == null) {
            this.f4090a = AccsClientConfig.DEFAULT_CONFIG_TAG;
        }
    }

    /* renamed from: a */
    public String m3555a(Object obj) {
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
        return this.f4090a + BundleUtil.UNDERLINE_TAG + simpleName;
    }
}
