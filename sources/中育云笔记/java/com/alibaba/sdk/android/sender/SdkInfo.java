package com.alibaba.sdk.android.sender;

import java.util.Map;

/* loaded from: classes3.dex */
public class SdkInfo {

    /* renamed from: a */
    Map<String, String> f4461a;

    /* renamed from: b */
    private String f4462b;

    /* renamed from: c */
    private String f4463c;

    /* renamed from: d */
    private String f4464d;

    /* renamed from: a */
    public String m3845a() {
        return this.f4462b;
    }

    /* renamed from: b */
    public String m3846b() {
        return this.f4463c;
    }

    /* renamed from: c */
    public String m3847c() {
        return this.f4464d;
    }

    public SdkInfo setAppKey(String str) {
        this.f4464d = str;
        return this;
    }

    public SdkInfo setExt(Map<String, String> map) {
        this.f4461a = map;
        return this;
    }

    public SdkInfo setSdkId(String str) {
        this.f4462b = str;
        return this;
    }

    public SdkInfo setSdkVersion(String str) {
        this.f4463c = str;
        return this;
    }
}
