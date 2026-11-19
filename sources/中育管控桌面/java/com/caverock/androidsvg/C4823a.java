package com.caverock.androidsvg;

import com.caverock.androidsvg.CSSParser;
import com.caverock.androidsvg.SVG;

/* renamed from: com.caverock.androidsvg.a */
/* loaded from: classes3.dex */
public class C4823a {

    /* renamed from: a */
    public CSSParser.C4757n f3145a;

    /* renamed from: b */
    public PreserveAspectRatio f3146b;

    /* renamed from: c */
    public String f3147c;

    /* renamed from: d */
    public SVG.C4763b f3148d;

    /* renamed from: e */
    public String f3149e;

    /* renamed from: f */
    public SVG.C4763b f3150f;

    public C4823a() {
        this.f3145a = null;
        this.f3146b = null;
        this.f3147c = null;
        this.f3148d = null;
        this.f3149e = null;
        this.f3150f = null;
    }

    /* renamed from: a */
    public boolean m3184a() {
        CSSParser.C4757n c4757n = this.f3145a;
        return c4757n != null && c4757n.m2969f() > 0;
    }

    /* renamed from: b */
    public boolean m3185b() {
        return this.f3146b != null;
    }

    /* renamed from: c */
    public boolean m3186c() {
        return this.f3147c != null;
    }

    /* renamed from: d */
    public boolean m3187d() {
        return this.f3149e != null;
    }

    /* renamed from: e */
    public boolean m3188e() {
        return this.f3148d != null;
    }

    /* renamed from: f */
    public boolean m3189f() {
        return this.f3150f != null;
    }

    /* renamed from: g */
    public C4823a m3190g(float f6, float f7, float f8, float f9) {
        this.f3150f = new SVG.C4763b(f6, f7, f8, f9);
        return this;
    }

    public C4823a(C4823a c4823a) {
        this.f3145a = null;
        this.f3146b = null;
        this.f3147c = null;
        this.f3148d = null;
        this.f3149e = null;
        this.f3150f = null;
        if (c4823a == null) {
            return;
        }
        this.f3145a = c4823a.f3145a;
        this.f3146b = c4823a.f3146b;
        this.f3148d = c4823a.f3148d;
        this.f3149e = c4823a.f3149e;
        this.f3150f = c4823a.f3150f;
    }
}
