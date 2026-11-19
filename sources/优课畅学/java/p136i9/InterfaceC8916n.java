package p136i9;

import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8809v;

/* renamed from: i9.n */
/* loaded from: classes5.dex */
public interface InterfaceC8916n {

    /* renamed from: a */
    public static final a f16768a = a.f16770a;

    /* renamed from: b */
    public static final InterfaceC8916n f16769b = new a.C10807a();

    /* renamed from: i9.n$a */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f16770a = new a();

        /* renamed from: i9.n$a$a, reason: collision with other inner class name */
        public static final class C10807a implements InterfaceC8916n {
            @Override // p136i9.InterfaceC8916n
            /* renamed from: a */
            public List mo15209a(C8925w url) {
                AbstractC9133u.m16133g(url, "url");
                return AbstractC8809v.m14771n();
            }

            @Override // p136i9.InterfaceC8916n
            /* renamed from: b */
            public void mo15210b(C8925w url, List cookies) {
                AbstractC9133u.m16133g(url, "url");
                AbstractC9133u.m16133g(cookies, "cookies");
            }
        }
    }

    /* renamed from: a */
    List mo15209a(C8925w c8925w);

    /* renamed from: b */
    void mo15210b(C8925w c8925w, List list);
}
