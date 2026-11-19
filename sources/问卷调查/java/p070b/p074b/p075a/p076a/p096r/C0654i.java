package p070b.p074b.p075a.p076a.p096r;

import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p070b.p074b.p075a.p076a.p098t.AbstractC0665d;
import p070b.p074b.p075a.p076a.p098t.C0663b;

/* renamed from: b.b.a.a.r.i */
/* loaded from: classes.dex */
public class C0654i {

    /* renamed from: c */
    public float f3942c;

    /* renamed from: e */
    public WeakReference<b> f3944e;

    /* renamed from: f */
    public C0663b f3945f;

    /* renamed from: a */
    public final TextPaint f3940a = new TextPaint(1);

    /* renamed from: b */
    public final AbstractC0665d f3941b = new a();

    /* renamed from: d */
    public boolean f3943d = true;

    /* renamed from: b.b.a.a.r.i$a */
    public class a extends AbstractC0665d {
        public a() {
        }

        @Override // p070b.p074b.p075a.p076a.p098t.AbstractC0665d
        /* renamed from: a */
        public void mo2264a(int i) {
            C0654i c0654i = C0654i.this;
            c0654i.f3943d = true;
            b bVar = c0654i.f3944e.get();
            if (bVar != null) {
                bVar.mo2152a();
            }
        }

        @Override // p070b.p074b.p075a.p076a.p098t.AbstractC0665d
        /* renamed from: b */
        public void mo2265b(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            C0654i c0654i = C0654i.this;
            c0654i.f3943d = true;
            b bVar = c0654i.f3944e.get();
            if (bVar != null) {
                bVar.mo2152a();
            }
        }
    }

    /* renamed from: b.b.a.a.r.i$b */
    public interface b {
        /* renamed from: a */
        void mo2152a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C0654i(b bVar) {
        this.f3944e = new WeakReference<>(null);
        this.f3944e = new WeakReference<>(bVar);
    }

    /* renamed from: a */
    public float m2263a(String str) {
        if (!this.f3943d) {
            return this.f3942c;
        }
        float fMeasureText = str == null ? 0.0f : this.f3940a.measureText((CharSequence) str, 0, str.length());
        this.f3942c = fMeasureText;
        this.f3943d = false;
        return fMeasureText;
    }
}
