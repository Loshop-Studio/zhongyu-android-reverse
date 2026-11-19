package p070b.p074b.p075a.p076a.p098t;

import android.graphics.Typeface;
import android.text.TextPaint;

/* renamed from: b.b.a.a.t.c */
/* loaded from: classes.dex */
public class C0664c extends AbstractC0665d {

    /* renamed from: a */
    public final /* synthetic */ TextPaint f3976a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC0665d f3977b;

    /* renamed from: c */
    public final /* synthetic */ C0663b f3978c;

    public C0664c(C0663b c0663b, TextPaint textPaint, AbstractC0665d abstractC0665d) {
        this.f3978c = c0663b;
        this.f3976a = textPaint;
        this.f3977b = abstractC0665d;
    }

    @Override // p070b.p074b.p075a.p076a.p098t.AbstractC0665d
    /* renamed from: a */
    public void mo2264a(int i) {
        this.f3977b.mo2264a(i);
    }

    @Override // p070b.p074b.p075a.p076a.p098t.AbstractC0665d
    /* renamed from: b */
    public void mo2265b(Typeface typeface, boolean z) {
        this.f3978c.m2275d(this.f3976a, typeface);
        this.f3977b.mo2265b(typeface, z);
    }
}
