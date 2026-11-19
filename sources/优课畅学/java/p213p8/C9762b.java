package p213p8;

import kotlinx.coroutines.CoroutineDispatcher;
import p191n8.AbstractC9461n;

/* renamed from: p8.b */
/* loaded from: classes5.dex */
public final class C9762b extends AbstractC9765e {

    /* renamed from: g */
    public static final C9762b f19484g = new C9762b();

    public C9762b() {
        super(AbstractC9771k.f19497c, AbstractC9771k.f19498d, AbstractC9771k.f19499e, AbstractC9771k.f19495a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i10) {
        AbstractC9461n.m17380a(i10);
        return i10 >= AbstractC9771k.f19497c ? this : super.limitedParallelism(i10);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "Dispatchers.Default";
    }
}
