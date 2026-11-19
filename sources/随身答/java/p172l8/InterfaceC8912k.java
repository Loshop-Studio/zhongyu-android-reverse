package p172l8;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l8.k */
/* loaded from: classes5.dex */
public interface InterfaceC8912k {

    /* renamed from: a */
    public static final a f14770a = a.f14772a;

    /* renamed from: b */
    public static final InterfaceC8912k f14771b = new a.C10077a();

    /* renamed from: l8.k$a */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f14772a = new a();

        /* renamed from: l8.k$a$a, reason: collision with other inner class name */
        public static final class C10077a implements InterfaceC8912k {
            @Override // p172l8.InterfaceC8912k
            /* renamed from: a */
            public void mo13888a(C8919r url, List cookies) {
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(cookies, "cookies");
            }

            @Override // p172l8.InterfaceC8912k
            /* renamed from: b */
            public List mo13889b(C8919r url) {
                Intrinsics.checkNotNullParameter(url, "url");
                return CollectionsKt.emptyList();
            }
        }
    }

    /* renamed from: a */
    void mo13888a(C8919r c8919r, List list);

    /* renamed from: b */
    List mo13889b(C8919r c8919r);
}
