package p172n;

import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;

/* renamed from: n.n */
/* loaded from: classes3.dex */
public interface InterfaceC8599n {

    /* renamed from: a */
    public static final a f14233a = a.f14237a;

    /* renamed from: b */
    public static final InterfaceC8599n f14234b = new InterfaceC8599n() { // from class: n.k
        @Override // p172n.InterfaceC8599n
        /* renamed from: c */
        public final boolean mo14146c(String str, BufferedSource bufferedSource) {
            return InterfaceC8599n.m14152g(str, bufferedSource);
        }
    };

    /* renamed from: c */
    public static final InterfaceC8599n f14235c = new InterfaceC8599n() { // from class: n.l
        @Override // p172n.InterfaceC8599n
        /* renamed from: c */
        public final boolean mo14146c(String str, BufferedSource bufferedSource) {
            return InterfaceC8599n.m14149d(str, bufferedSource);
        }
    };

    /* renamed from: d */
    public static final InterfaceC8599n f14236d = new InterfaceC8599n() { // from class: n.m
        @Override // p172n.InterfaceC8599n
        /* renamed from: c */
        public final boolean mo14146c(String str, BufferedSource bufferedSource) {
            return InterfaceC8599n.m14151f(str, bufferedSource);
        }
    };

    /* renamed from: n.n$a */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f14237a = new a();
    }

    /* renamed from: d */
    static boolean m14149d(String str, BufferedSource bufferedSource) {
        if (str != null) {
            return Intrinsics.areEqual(str, "image/jpeg") || Intrinsics.areEqual(str, "image/webp") || Intrinsics.areEqual(str, "image/heic") || Intrinsics.areEqual(str, "image/heif");
        }
        return false;
    }

    /* renamed from: f */
    static boolean m14151f(String str, BufferedSource bufferedSource) {
        return true;
    }

    /* renamed from: g */
    static boolean m14152g(String str, BufferedSource bufferedSource) {
        return false;
    }

    /* renamed from: c */
    boolean mo14146c(String str, BufferedSource bufferedSource);
}
