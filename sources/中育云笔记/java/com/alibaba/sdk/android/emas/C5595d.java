package com.alibaba.sdk.android.emas;

import java.util.List;

/* renamed from: com.alibaba.sdk.android.emas.d */
/* loaded from: classes3.dex */
public class C5595d {

    /* renamed from: b */
    private List<C5596e> f4051b;

    /* renamed from: c */
    private EnumC5593b f4052c;

    /* renamed from: c */
    private String f4053c;

    public C5595d(List<C5596e> list) {
        this(list, EnumC5593b.MEM_CACHE, null);
    }

    /* renamed from: a */
    public EnumC5593b m3500a() {
        return this.f4052c;
    }

    public String getLocation() {
        if (this.f4052c == EnumC5593b.DISK_CACHE) {
            return this.f4053c;
        }
        return null;
    }

    public C5595d(List<C5596e> list, EnumC5593b enumC5593b, String str) {
        this.f4051b = list;
        this.f4052c = enumC5593b;
        this.f4053c = str;
    }

    /* renamed from: a */
    public List<C5596e> m3501a() {
        return this.f4051b;
    }
}
