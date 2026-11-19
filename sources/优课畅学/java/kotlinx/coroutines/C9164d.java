package kotlinx.coroutines;

import kotlin.coroutines.AbstractC9097a;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: kotlinx.coroutines.d */
/* loaded from: classes5.dex */
public final class C9164d extends AbstractC9097a {

    /* renamed from: b */
    public static final a f17679b = new a(null);

    /* renamed from: a */
    public final String f17680a;

    /* renamed from: kotlinx.coroutines.d$a */
    public static final class a implements InterfaceC9100d.c {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        public a() {
        }
    }

    public C9164d(String str) {
        super(f17679b);
        this.f17680a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9164d) && AbstractC9133u.m16128b(this.f17680a, ((C9164d) obj).f17680a);
    }

    public int hashCode() {
        return this.f17680a.hashCode();
    }

    /* renamed from: i */
    public final String m16551i() {
        return this.f17680a;
    }

    public String toString() {
        return "CoroutineName(" + this.f17680a + ')';
    }
}
