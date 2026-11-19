package p058f5;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f5.n */
/* loaded from: classes4.dex */
public interface InterfaceC6375n {

    /* renamed from: a */
    public static final a f7936a = a.f7938a;

    /* renamed from: b */
    public static final InterfaceC6375n f7937b = new a.C8028a();

    /* renamed from: f5.n$a */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f7938a = new a();

        /* renamed from: f5.n$a$a, reason: collision with other inner class name */
        public static final class C8028a implements InterfaceC6375n {
            @Override // p058f5.InterfaceC6375n
            /* renamed from: a */
            public List mo6748a(C6384w url) {
                Intrinsics.checkNotNullParameter(url, "url");
                return CollectionsKt.emptyList();
            }

            @Override // p058f5.InterfaceC6375n
            /* renamed from: b */
            public void mo6749b(C6384w url, List cookies) {
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(cookies, "cookies");
            }
        }
    }

    /* renamed from: a */
    List mo6748a(C6384w c6384w);

    /* renamed from: b */
    void mo6749b(C6384w c6384w, List list);
}
