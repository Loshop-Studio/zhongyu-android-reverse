package sd;

import kotlin.coroutines.AbstractC9942a;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: sd.h0 */
/* loaded from: classes6.dex */
public final class C11118h0 extends AbstractC9942a {

    /* renamed from: d */
    public static final a f26782d = new a(null);

    /* renamed from: c */
    public final String f26783c;

    /* renamed from: sd.h0$a */
    public static final class a implements InterfaceC9945d.c {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    public C11118h0(String str) {
        super(f26782d);
        this.f26783c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11118h0) && AbstractC9979u.m20289b(this.f26783c, ((C11118h0) obj).f26783c);
    }

    public int hashCode() {
        return this.f26783c.hashCode();
    }

    /* renamed from: i */
    public final String m24728i() {
        return this.f26783c;
    }

    public String toString() {
        return "CoroutineName(" + this.f26783c + ')';
    }
}
