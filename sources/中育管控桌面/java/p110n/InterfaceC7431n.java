package p110n;

import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;

/* renamed from: n.n */
/* loaded from: classes3.dex */
public interface InterfaceC7431n {

    /* renamed from: a */
    public static final a f9486a = a.f9490a;

    /* renamed from: b */
    public static final InterfaceC7431n f9487b = new InterfaceC7431n() { // from class: n.k
        @Override // p110n.InterfaceC7431n
        /* renamed from: c */
        public final boolean mo8467c(String str, BufferedSource bufferedSource) {
            return InterfaceC7431n.m8473g(str, bufferedSource);
        }
    };

    /* renamed from: c */
    public static final InterfaceC7431n f9488c = new InterfaceC7431n() { // from class: n.l
        @Override // p110n.InterfaceC7431n
        /* renamed from: c */
        public final boolean mo8467c(String str, BufferedSource bufferedSource) {
            return InterfaceC7431n.m8470d(str, bufferedSource);
        }
    };

    /* renamed from: d */
    public static final InterfaceC7431n f9489d = new InterfaceC7431n() { // from class: n.m
        @Override // p110n.InterfaceC7431n
        /* renamed from: c */
        public final boolean mo8467c(String str, BufferedSource bufferedSource) {
            return InterfaceC7431n.m8472f(str, bufferedSource);
        }
    };

    /* renamed from: n.n$a */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f9490a = new a();
    }

    /* renamed from: d */
    static boolean m8470d(String str, BufferedSource bufferedSource) {
        if (str != null) {
            return Intrinsics.areEqual(str, "image/jpeg") || Intrinsics.areEqual(str, "image/webp") || Intrinsics.areEqual(str, "image/heic") || Intrinsics.areEqual(str, "image/heif");
        }
        return false;
    }

    /* renamed from: f */
    static boolean m8472f(String str, BufferedSource bufferedSource) {
        return true;
    }

    /* renamed from: g */
    static boolean m8473g(String str, BufferedSource bufferedSource) {
        return false;
    }

    /* renamed from: c */
    boolean mo8467c(String str, BufferedSource bufferedSource);
}
