package com.huawei.hms.framework.common.hianalytics;

import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public class LinkedHashMapPack {

    /* renamed from: a */
    public LinkedHashMap f11672a = new LinkedHashMap();

    public LinkedHashMap<String, String> getAll() {
        return this.f11672a;
    }

    public LinkedHashMapPack put(String str, String str2) {
        if (str != null && str2 != null) {
            this.f11672a.put(str, str2);
        }
        return this;
    }

    public LinkedHashMapPack putIfNotDefault(String str, long j10, long j11) {
        return j10 == j11 ? this : put(str, j10);
    }

    public LinkedHashMapPack put(String str, boolean z10) {
        if (str != null) {
            if (z10) {
                this.f11672a.put(str, "1");
                return this;
            }
            this.f11672a.put(str, "0");
        }
        return this;
    }

    public LinkedHashMapPack put(String str, long j10) {
        if (str != null) {
            this.f11672a.put(str, "" + j10);
        }
        return this;
    }
}
