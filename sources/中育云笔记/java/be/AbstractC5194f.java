package be;

import kotlinx.coroutines.sync.MutexImpl;
import p410xd.C11839c0;

/* renamed from: be.f */
/* loaded from: classes6.dex */
public abstract class AbstractC5194f {

    /* renamed from: a */
    public static final C11839c0 f3061a = new C11839c0("NO_OWNER");

    /* renamed from: b */
    public static final C11839c0 f3062b = new C11839c0("ALREADY_LOCKED_BY_OWNER");

    /* renamed from: a */
    public static final InterfaceC5189a m2744a(boolean z10) {
        return new MutexImpl(z10);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC5189a m2745b(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return m2744a(z10);
    }
}
