package p011a9;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a9.k */
/* loaded from: classes5.dex */
public interface InterfaceC0048k {

    /* renamed from: a */
    public static final a f142a = a.f144a;

    /* renamed from: b */
    public static final InterfaceC0048k f143b = new a.C10089a();

    /* renamed from: a9.k$a */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f144a = new a();

        /* renamed from: a9.k$a$a, reason: collision with other inner class name */
        public static final class C10089a implements InterfaceC0048k {
            @Override // p011a9.InterfaceC0048k
            /* renamed from: a */
            public List mo131a(C0055r url) {
                Intrinsics.checkNotNullParameter(url, "url");
                return CollectionsKt.emptyList();
            }

            @Override // p011a9.InterfaceC0048k
            /* renamed from: b */
            public void mo132b(C0055r url, List cookies) {
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(cookies, "cookies");
            }
        }
    }

    /* renamed from: a */
    List mo131a(C0055r c0055r);

    /* renamed from: b */
    void mo132b(C0055r c0055r, List list);
}
