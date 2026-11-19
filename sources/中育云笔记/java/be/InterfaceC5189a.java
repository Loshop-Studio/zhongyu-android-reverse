package be;

import ae.InterfaceC0112h;
import vc.InterfaceC11588c;

/* renamed from: be.a */
/* loaded from: classes6.dex */
public interface InterfaceC5189a {

    /* renamed from: be.a$a */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ Object m2741a(InterfaceC5189a interfaceC5189a, Object obj, InterfaceC11588c interfaceC11588c, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            return interfaceC5189a.lock(obj, interfaceC11588c);
        }

        /* renamed from: b */
        public static /* synthetic */ boolean m2742b(InterfaceC5189a interfaceC5189a, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            return interfaceC5189a.tryLock(obj);
        }

        /* renamed from: c */
        public static /* synthetic */ void m2743c(InterfaceC5189a interfaceC5189a, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            interfaceC5189a.unlock(obj);
        }
    }

    InterfaceC0112h getOnLock();

    boolean holdsLock(Object obj);

    boolean isLocked();

    Object lock(Object obj, InterfaceC11588c interfaceC11588c);

    boolean tryLock(Object obj);

    void unlock(Object obj);
}
