package p117r2;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: r2.m */
/* loaded from: classes2.dex */
public interface InterfaceC4510m {

    /* renamed from: b */
    public static final a f5512b = new a(null);

    /* renamed from: a */
    public static final InterfaceC4510m f5511a = new a.C4767a();

    /* renamed from: r2.m$a */
    public static final class a {

        /* renamed from: r2.m$a$a, reason: collision with other inner class name */
        public static final class C4767a implements InterfaceC4510m {
            @Override // p117r2.InterfaceC4510m
            /* renamed from: a */
            public List mo5914a(C4517t url) {
                Intrinsics.checkNotNullParameter(url, "url");
                return CollectionsKt__CollectionsKt.emptyList();
            }

            @Override // p117r2.InterfaceC4510m
            /* renamed from: b */
            public void mo5915b(C4517t url, List cookies) {
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(cookies, "cookies");
            }
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    List mo5914a(C4517t c4517t);

    /* renamed from: b */
    void mo5915b(C4517t c4517t, List list);
}
