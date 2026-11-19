package p070b.p074b.p075a.p076a.p098t;

import android.graphics.Typeface;
import p070b.p074b.p075a.p076a.p096r.C0647b;
import p070b.p074b.p075a.p076a.p096r.C0648c;

/* renamed from: b.b.a.a.t.a */
/* loaded from: classes.dex */
public final class C0662a extends AbstractC0665d {

    /* renamed from: a */
    public final Typeface f3959a;

    /* renamed from: b */
    public final a f3960b;

    /* renamed from: c */
    public boolean f3961c;

    /* renamed from: b.b.a.a.t.a$a */
    public interface a {
    }

    public C0662a(a aVar, Typeface typeface) {
        this.f3959a = typeface;
        this.f3960b = aVar;
    }

    @Override // p070b.p074b.p075a.p076a.p098t.AbstractC0665d
    /* renamed from: a */
    public void mo2264a(int i) {
        m2271c(this.f3959a);
    }

    @Override // p070b.p074b.p075a.p076a.p098t.AbstractC0665d
    /* renamed from: b */
    public void mo2265b(Typeface typeface, boolean z) {
        m2271c(typeface);
    }

    /* renamed from: c */
    public final void m2271c(Typeface typeface) {
        if (this.f3961c) {
            return;
        }
        C0648c c0648c = ((C0647b) this.f3960b).f3877a;
        C0662a c0662a = c0648c.f3916v;
        boolean z = true;
        if (c0662a != null) {
            c0662a.f3961c = true;
        }
        if (c0648c.f3913s != typeface) {
            c0648c.f3913s = typeface;
        } else {
            z = false;
        }
        if (z) {
            c0648c.m2253k();
        }
    }
}
