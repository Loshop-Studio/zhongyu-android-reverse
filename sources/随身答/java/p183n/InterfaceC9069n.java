package p183n;

import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;

/* renamed from: n.n */
/* loaded from: classes3.dex */
public interface InterfaceC9069n {

    /* renamed from: a */
    public static final a f15249a = a.f15253a;

    /* renamed from: b */
    public static final InterfaceC9069n f15250b = new InterfaceC9069n() { // from class: n.k
        @Override // p183n.InterfaceC9069n
        /* renamed from: c */
        public final boolean mo14537c(String str, BufferedSource bufferedSource) {
            return InterfaceC9069n.m14543g(str, bufferedSource);
        }
    };

    /* renamed from: c */
    public static final InterfaceC9069n f15251c = new InterfaceC9069n() { // from class: n.l
        @Override // p183n.InterfaceC9069n
        /* renamed from: c */
        public final boolean mo14537c(String str, BufferedSource bufferedSource) {
            return InterfaceC9069n.m14540d(str, bufferedSource);
        }
    };

    /* renamed from: d */
    public static final InterfaceC9069n f15252d = new InterfaceC9069n() { // from class: n.m
        @Override // p183n.InterfaceC9069n
        /* renamed from: c */
        public final boolean mo14537c(String str, BufferedSource bufferedSource) {
            return InterfaceC9069n.m14542f(str, bufferedSource);
        }
    };

    /* renamed from: n.n$a */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f15253a = new a();
    }

    /* renamed from: d */
    static boolean m14540d(String str, BufferedSource bufferedSource) {
        if (str != null) {
            return Intrinsics.areEqual(str, "image/jpeg") || Intrinsics.areEqual(str, "image/webp") || Intrinsics.areEqual(str, "image/heic") || Intrinsics.areEqual(str, "image/heif");
        }
        return false;
    }

    /* renamed from: f */
    static boolean m14542f(String str, BufferedSource bufferedSource) {
        return true;
    }

    /* renamed from: g */
    static boolean m14543g(String str, BufferedSource bufferedSource) {
        return false;
    }

    /* renamed from: c */
    boolean mo14537c(String str, BufferedSource bufferedSource);
}
