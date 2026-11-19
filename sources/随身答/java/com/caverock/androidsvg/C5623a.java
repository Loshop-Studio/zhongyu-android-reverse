package com.caverock.androidsvg;

import com.caverock.androidsvg.CSSParser;
import com.caverock.androidsvg.SVG;

/* renamed from: com.caverock.androidsvg.a */
/* loaded from: classes3.dex */
public class C5623a {

    /* renamed from: a */
    public CSSParser.C5557n f4466a = null;

    /* renamed from: b */
    public PreserveAspectRatio f4467b = null;

    /* renamed from: c */
    public String f4468c = null;

    /* renamed from: d */
    public SVG.C5563b f4469d = null;

    /* renamed from: e */
    public String f4470e = null;

    /* renamed from: f */
    public SVG.C5563b f4471f = null;

    /* renamed from: a */
    public C5623a m3877a(String str) {
        this.f4466a = new CSSParser(CSSParser.Source.RenderOptions).m3627d(str);
        return this;
    }

    /* renamed from: b */
    public boolean m3878b() {
        CSSParser.C5557n c5557n = this.f4466a;
        return c5557n != null && c5557n.m3656f() > 0;
    }

    /* renamed from: c */
    public boolean m3879c() {
        return this.f4467b != null;
    }

    /* renamed from: d */
    public boolean m3880d() {
        return this.f4468c != null;
    }

    /* renamed from: e */
    public boolean m3881e() {
        return this.f4470e != null;
    }

    /* renamed from: f */
    public boolean m3882f() {
        return this.f4469d != null;
    }

    /* renamed from: g */
    public boolean m3883g() {
        return this.f4471f != null;
    }

    /* renamed from: h */
    public C5623a m3884h(float f10, float f11, float f12, float f13) {
        this.f4471f = new SVG.C5563b(f10, f11, f12, f13);
        return this;
    }
}
