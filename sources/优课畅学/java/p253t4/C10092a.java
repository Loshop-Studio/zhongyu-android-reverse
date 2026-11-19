package p253t4;

import com.zykj.study.bean.course.AuthorizeLessonReqBody;
import com.zykj.study.bean.course.SearchReqBody;
import kotlin.jvm.internal.AbstractC9133u;
import p179m7.InterfaceC9324c;
import p198o4.InterfaceC9519b;

/* renamed from: t4.a */
/* loaded from: classes3.dex */
public final class C10092a {

    /* renamed from: a */
    public final InterfaceC9519b f20163a;

    public C10092a(InterfaceC9519b courseApi) {
        AbstractC9133u.m16133g(courseApi, "courseApi");
        this.f20163a = courseApi;
    }

    /* renamed from: a */
    public final Object m18846a(int i10, int i11, InterfaceC9324c interfaceC9324c) {
        return this.f20163a.m17698m(new AuthorizeLessonReqBody(i11, i10), interfaceC9324c);
    }

    /* renamed from: b */
    public final Object m18847b(int i10, int i11, InterfaceC9324c interfaceC9324c) {
        return this.f20163a.m17684A(new AuthorizeLessonReqBody(i11, i10), interfaceC9324c);
    }

    /* renamed from: c */
    public final Object m18848c(String str, int i10, InterfaceC9324c interfaceC9324c) {
        return this.f20163a.m17699n(new SearchReqBody(i10, str), interfaceC9324c);
    }

    /* renamed from: d */
    public final Object m18849d(int i10, InterfaceC9324c interfaceC9324c) {
        return this.f20163a.m17687b(i10, interfaceC9324c);
    }
}
