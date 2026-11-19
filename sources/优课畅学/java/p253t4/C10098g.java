package p253t4;

import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingSource;
import com.zykj.study.repository.CourseSearchMediator;
import kotlin.jvm.internal.AbstractC9133u;
import p169l8.InterfaceC9266c;
import p198o4.InterfaceC9519b;
import p300x7.InterfaceC10559a;

/* renamed from: t4.g */
/* loaded from: classes3.dex */
public final class C10098g {

    /* renamed from: a */
    public final InterfaceC9519b f20172a;

    public C10098g(InterfaceC9519b api) {
        AbstractC9133u.m16133g(api, "api");
        this.f20172a = api;
    }

    /* renamed from: c */
    public static final PagingSource m18851c(C10098g c10098g, String str) {
        return new CourseSearchMediator(c10098g.f20172a, str);
    }

    /* renamed from: b */
    public final InterfaceC9266c m18852b(final String keyword) {
        AbstractC9133u.m16133g(keyword, "keyword");
        return new Pager(new PagingConfig(20, 0, false, 0, 0, 0, 62, null), 1, new InterfaceC10559a() { // from class: t4.f
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return C10098g.m18851c(this.f20170a, keyword);
            }
        }).getFlow();
    }
}
