package p343t4;

import android.text.TextUtils;

/* renamed from: t4.e */
/* loaded from: classes5.dex */
public class C11217e {

    /* renamed from: a */
    public final String f26913a;

    /* renamed from: b */
    public final String f26914b;

    /* renamed from: c */
    public final String f26915c;

    /* renamed from: d */
    public final String f26916d;

    /* renamed from: e */
    public final String f26917e;

    /* renamed from: f */
    public final int f26918f;

    /* renamed from: g */
    public int f26919g;

    public C11217e(String str, String str2, String str3, String str4, String str5, int i10) {
        this.f26919g = 0;
        this.f26913a = str;
        this.f26914b = str2;
        this.f26915c = str3;
        this.f26916d = str4;
        this.f26917e = str5;
        this.f26918f = i10;
        if (str != null) {
            this.f26919g = str.length() / 2;
        }
    }

    /* renamed from: a */
    public boolean m24950a() {
        return (TextUtils.isEmpty(this.f26913a) || TextUtils.isEmpty(this.f26914b) || TextUtils.isEmpty(this.f26915c) || TextUtils.isEmpty(this.f26916d) || this.f26913a.length() != this.f26914b.length() || this.f26914b.length() != this.f26915c.length() || this.f26915c.length() != this.f26919g * 2 || this.f26918f < 0 || TextUtils.isEmpty(this.f26917e)) ? false : true;
    }

    /* renamed from: b */
    public String m24951b() {
        return this.f26913a;
    }

    /* renamed from: c */
    public String m24952c() {
        return this.f26914b;
    }

    /* renamed from: d */
    public String m24953d() {
        return this.f26915c;
    }

    /* renamed from: e */
    public String m24954e() {
        return this.f26916d;
    }

    /* renamed from: f */
    public String m24955f() {
        return this.f26917e;
    }

    /* renamed from: g */
    public int m24956g() {
        return this.f26918f;
    }

    /* renamed from: h */
    public int m24957h() {
        return this.f26919g;
    }
}
