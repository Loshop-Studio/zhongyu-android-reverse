package p235r8;

import kotlinx.coroutines.sync.MutexImpl;
import p191n8.C9442d0;

/* renamed from: r8.b */
/* loaded from: classes5.dex */
public abstract class AbstractC9943b {

    /* renamed from: a */
    public static final C9442d0 f19914a = new C9442d0("NO_OWNER");

    /* renamed from: b */
    public static final C9442d0 f19915b = new C9442d0("ALREADY_LOCKED_BY_OWNER");

    /* renamed from: a */
    public static final InterfaceC9942a m18570a(boolean z10) {
        return new MutexImpl(z10);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC9942a m18571b(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return m18570a(z10);
    }
}
