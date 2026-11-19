package p235r8;

import p179m7.InterfaceC9324c;
import p224q8.InterfaceC9851g;

/* renamed from: r8.a */
/* loaded from: classes5.dex */
public interface InterfaceC9942a {

    /* renamed from: r8.a$a */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ Object m18567a(InterfaceC9942a interfaceC9942a, Object obj, InterfaceC9324c interfaceC9324c, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            return interfaceC9942a.lock(obj, interfaceC9324c);
        }

        /* renamed from: b */
        public static /* synthetic */ boolean m18568b(InterfaceC9942a interfaceC9942a, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            return interfaceC9942a.tryLock(obj);
        }

        /* renamed from: c */
        public static /* synthetic */ void m18569c(InterfaceC9942a interfaceC9942a, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            interfaceC9942a.unlock(obj);
        }
    }

    InterfaceC9851g getOnLock();

    boolean holdsLock(Object obj);

    boolean isLocked();

    Object lock(Object obj, InterfaceC9324c interfaceC9324c);

    boolean tryLock(Object obj);

    void unlock(Object obj);
}
