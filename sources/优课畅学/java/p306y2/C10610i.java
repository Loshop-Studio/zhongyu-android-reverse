package p306y2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;

/* renamed from: y2.i */
/* loaded from: classes4.dex */
public class C10610i {

    /* renamed from: a */
    public Context f21026a;

    /* renamed from: b */
    public Drawable f21027b;

    /* renamed from: c */
    public Drawable f21028c;

    /* renamed from: d */
    public String f21029d;

    /* renamed from: e */
    public ColorStateList f21030e;

    /* renamed from: f */
    public int f21031f;

    /* renamed from: g */
    public Typeface f21032g;

    /* renamed from: h */
    public int f21033h;

    /* renamed from: i */
    public int f21034i = -2;

    /* renamed from: j */
    public int f21035j = -2;

    /* renamed from: k */
    public int f21036k = 0;

    public C10610i(Context context) {
        this.f21026a = context;
    }

    /* renamed from: a */
    public Drawable m19793a() {
        return this.f21027b;
    }

    /* renamed from: b */
    public int m19794b() {
        return this.f21035j;
    }

    /* renamed from: c */
    public Drawable m19795c() {
        return this.f21028c;
    }

    /* renamed from: d */
    public String m19796d() {
        return this.f21029d;
    }

    /* renamed from: e */
    public int m19797e() {
        return this.f21033h;
    }

    /* renamed from: f */
    public int m19798f() {
        return this.f21031f;
    }

    /* renamed from: g */
    public Typeface m19799g() {
        return this.f21032g;
    }

    /* renamed from: h */
    public ColorStateList m19800h() {
        return this.f21030e;
    }

    /* renamed from: i */
    public int m19801i() {
        return this.f21036k;
    }

    /* renamed from: j */
    public int m19802j() {
        return this.f21034i;
    }

    /* renamed from: k */
    public C10610i m19803k(int i10) {
        this.f21027b = new ColorDrawable(i10);
        return this;
    }

    /* renamed from: l */
    public C10610i m19804l(int i10) {
        this.f21035j = i10;
        return this;
    }

    /* renamed from: m */
    public C10610i m19805m(int i10) {
        return m19806n(this.f21026a.getString(i10));
    }

    /* renamed from: n */
    public C10610i m19806n(String str) {
        this.f21029d = str;
        return this;
    }

    /* renamed from: o */
    public C10610i m19807o(int i10) {
        this.f21030e = ColorStateList.valueOf(i10);
        return this;
    }

    /* renamed from: p */
    public C10610i m19808p(int i10) {
        return m19807o(ContextCompat.getColor(this.f21026a, i10));
    }

    /* renamed from: q */
    public C10610i m19809q(int i10) {
        this.f21034i = i10;
        return this;
    }
}
