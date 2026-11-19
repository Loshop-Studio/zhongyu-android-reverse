package p228l;

import kotlin.jvm.internal.AbstractC9979u;
import okio.BufferedSource;

/* renamed from: l.n */
/* loaded from: classes3.dex */
public interface InterfaceC10081n {

    /* renamed from: a */
    public static final a f24091a = a.f24095a;

    /* renamed from: b */
    public static final InterfaceC10081n f24092b = new InterfaceC10081n() { // from class: l.k
        @Override // p228l.InterfaceC10081n
        /* renamed from: c */
        public final boolean mo21079c(String str, BufferedSource bufferedSource) {
            return InterfaceC10081n.m21085g(str, bufferedSource);
        }
    };

    /* renamed from: c */
    public static final InterfaceC10081n f24093c = new InterfaceC10081n() { // from class: l.l
        @Override // p228l.InterfaceC10081n
        /* renamed from: c */
        public final boolean mo21079c(String str, BufferedSource bufferedSource) {
            return InterfaceC10081n.m21082d(str, bufferedSource);
        }
    };

    /* renamed from: d */
    public static final InterfaceC10081n f24094d = new InterfaceC10081n() { // from class: l.m
        @Override // p228l.InterfaceC10081n
        /* renamed from: c */
        public final boolean mo21079c(String str, BufferedSource bufferedSource) {
            return InterfaceC10081n.m21084f(str, bufferedSource);
        }
    };

    /* renamed from: l.n$a */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f24095a = new a();
    }

    /* renamed from: d */
    static boolean m21082d(String str, BufferedSource bufferedSource) {
        if (str != null) {
            return AbstractC9979u.m20289b(str, "image/jpeg") || AbstractC9979u.m20289b(str, "image/webp") || AbstractC9979u.m20289b(str, "image/heic") || AbstractC9979u.m20289b(str, "image/heif");
        }
        return false;
    }

    /* renamed from: f */
    static boolean m21084f(String str, BufferedSource bufferedSource) {
        return true;
    }

    /* renamed from: g */
    static boolean m21085g(String str, BufferedSource bufferedSource) {
        return false;
    }

    /* renamed from: c */
    boolean mo21079c(String str, BufferedSource bufferedSource);
}
