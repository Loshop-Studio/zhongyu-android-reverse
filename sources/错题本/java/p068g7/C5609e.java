package p068g7;

import kotlinx.coroutines.AbstractC5995r;
import p054e7.AbstractC5469a;
import p054e7.C5480l;

/* renamed from: g7.e */
/* loaded from: classes4.dex */
public final class C5609e extends AbstractC5612h {

    /* renamed from: b */
    public static final C5609e f8732b;

    static {
        int i = AbstractC5615k.f8740c;
        int i8 = AbstractC5615k.f8741d;
        long j7 = AbstractC5615k.f8742e;
        String str = AbstractC5615k.f8738a;
        C5609e c5609e = new C5609e();
        c5609e.f8734a = new ExecutorC5607c(str, j7, i, i8);
        f8732b = c5609e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.AbstractC5995r
    public final AbstractC5995r limitedParallelism(int i, String str) {
        AbstractC5469a.m4825a(i);
        return i >= AbstractC5615k.f8740c ? str != null ? new C5480l(this, str) : this : super.limitedParallelism(i, str);
    }

    @Override // kotlinx.coroutines.AbstractC5995r
    public final String toString() {
        return "Dispatchers.Default";
    }
}
