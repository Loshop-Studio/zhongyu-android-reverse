package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import p152r6.InterfaceC6473e;
import p160s6.InterfaceC6560a;
import p200x6.C6756f;

/* renamed from: kotlin.text.b */
/* loaded from: classes4.dex */
public final class C5841b implements Iterator, InterfaceC6560a {

    /* renamed from: a */
    public int f9239a = -1;

    /* renamed from: b */
    public int f9240b;

    /* renamed from: c */
    public int f9241c;

    /* renamed from: d */
    public C6756f f9242d;

    /* renamed from: e */
    public final /* synthetic */ C5842c f9243e;

    public C5841b(C5842c c5842c) {
        this.f9243e = c5842c;
        int iM5274m = AbstractC5806u.m5274m(0, 0, ((CharSequence) c5842c.f9245b).length());
        this.f9240b = iM5274m;
        this.f9241c = iM5274m;
    }

    /* renamed from: a */
    public final void m5363a() {
        Pair pair;
        C5842c c5842c = this.f9243e;
        CharSequence charSequence = (CharSequence) c5842c.f9245b;
        int i = this.f9241c;
        if (i < 0) {
            this.f9239a = 0;
            this.f9242d = null;
            return;
        }
        if (i <= charSequence.length() && (pair = (Pair) ((InterfaceC6473e) c5842c.f9246c).invoke(charSequence, Integer.valueOf(this.f9241c))) != null) {
            int iIntValue = ((Number) pair.component1()).intValue();
            int iIntValue2 = ((Number) pair.component2()).intValue();
            this.f9242d = AbstractC5806u.m5260N(this.f9240b, iIntValue);
            int i8 = iIntValue + iIntValue2;
            this.f9240b = i8;
            this.f9241c = i8 + (iIntValue2 == 0 ? 1 : 0);
        } else {
            this.f9242d = new C6756f(this.f9240b, AbstractC5855p.m5376J(charSequence), 1);
            this.f9241c = -1;
        }
        this.f9239a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f9239a == -1) {
            m5363a();
        }
        return this.f9239a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f9239a == -1) {
            m5363a();
        }
        if (this.f9239a == 0) {
            throw new NoSuchElementException();
        }
        C6756f c6756f = this.f9242d;
        AbstractC5830k.m5328e(c6756f, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f9242d = null;
        this.f9239a = -1;
        return c6756f;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
