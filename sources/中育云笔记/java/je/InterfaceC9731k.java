package je;

import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10978w;

/* renamed from: je.k */
/* loaded from: classes6.dex */
public interface InterfaceC9731k {

    /* renamed from: a */
    public static final a f22723a = a.f22725a;

    /* renamed from: b */
    public static final InterfaceC9731k f22724b = new a.C12139a();

    /* renamed from: je.k$a */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f22725a = new a();

        /* renamed from: je.k$a$a, reason: collision with other inner class name */
        public static final class C12139a implements InterfaceC9731k {
            @Override // je.InterfaceC9731k
            /* renamed from: a */
            public void mo19340a(C9738r url, List cookies) {
                AbstractC9979u.m20294g(url, "url");
                AbstractC9979u.m20294g(cookies, "cookies");
            }

            @Override // je.InterfaceC9731k
            /* renamed from: b */
            public List mo19341b(C9738r url) {
                AbstractC9979u.m20294g(url, "url");
                return AbstractC10978w.m24136n();
            }
        }
    }

    /* renamed from: a */
    void mo19340a(C9738r c9738r, List list);

    /* renamed from: b */
    List mo19341b(C9738r c9738r);
}
