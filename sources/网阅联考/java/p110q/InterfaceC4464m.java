package p110q;

import java.util.Collections;
import java.util.List;
import p062g0.AbstractC3749i;
import p076j.C3794d;
import p076j.InterfaceC3792b;
import p081k.InterfaceC3843d;

/* renamed from: q.m */
/* loaded from: classes2.dex */
public interface InterfaceC4464m {

    /* renamed from: q.m$a */
    public static class a {

        /* renamed from: a */
        public final InterfaceC3792b f5193a;

        /* renamed from: b */
        public final List f5194b;

        /* renamed from: c */
        public final InterfaceC3843d f5195c;

        public a(InterfaceC3792b interfaceC3792b, InterfaceC3843d interfaceC3843d) {
            this(interfaceC3792b, Collections.emptyList(), interfaceC3843d);
        }

        public a(InterfaceC3792b interfaceC3792b, List list, InterfaceC3843d interfaceC3843d) {
            this.f5193a = (InterfaceC3792b) AbstractC3749i.m4768d(interfaceC3792b);
            this.f5194b = (List) AbstractC3749i.m4768d(list);
            this.f5195c = (InterfaceC3843d) AbstractC3749i.m4768d(interfaceC3843d);
        }
    }

    /* renamed from: a */
    boolean mo5670a(Object obj);

    /* renamed from: b */
    a mo5671b(Object obj, int i4, int i5, C3794d c3794d);
}
