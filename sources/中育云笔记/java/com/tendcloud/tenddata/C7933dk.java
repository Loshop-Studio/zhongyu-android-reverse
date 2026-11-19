package com.tendcloud.tenddata;

/* renamed from: com.tendcloud.tenddata.dk */
/* loaded from: classes5.dex */
public class C7933dk {

    /* renamed from: a */
    private String f14708a;

    /* renamed from: b */
    private String f14709b;

    /* renamed from: c */
    private byte f14710c;

    /* renamed from: d */
    private byte f14711d;

    /* renamed from: e */
    private byte f14712e;

    public C7933dk() {
        this.f14708a = "";
        this.f14709b = "00:00:00:00:00:00";
        this.f14710c = (byte) -127;
        this.f14711d = (byte) 1;
        this.f14712e = (byte) 1;
    }

    /* renamed from: a */
    public String m11718a() {
        return this.f14708a;
    }

    /* renamed from: b */
    public String m11719b() {
        return this.f14709b;
    }

    /* renamed from: c */
    public byte m11720c() {
        return this.f14710c;
    }

    /* renamed from: d */
    public byte m11721d() {
        return this.f14711d;
    }

    /* renamed from: e */
    public byte m11722e() {
        return this.f14712e;
    }

    /* renamed from: f */
    public C7933dk m11723f() {
        return new C7933dk(this.f14708a, this.f14709b, this.f14710c, this.f14711d, this.f14712e);
    }

    public void setBand(byte b10) {
        this.f14711d = b10;
    }

    public void setBssid(String str) {
        this.f14709b = str;
    }

    public void setChannel(byte b10) {
        this.f14712e = b10;
    }

    public void setRssi(byte b10) {
        this.f14710c = b10;
    }

    public void setSsid(String str) {
        this.f14708a = str;
    }

    public C7933dk(String str, String str2, byte b10, byte b11, byte b12) {
        this.f14708a = str;
        this.f14709b = str2;
        this.f14710c = b10;
        this.f14711d = b11;
        this.f14712e = b12;
    }
}
