package p194o0;

import java.util.Collections;
import java.util.List;
import p091e1.AbstractC7837i;
import p122h0.C8084d;
import p122h0.InterfaceC8082b;
import p132i0.InterfaceC8115d;

/* renamed from: o0.m */
/* loaded from: classes3.dex */
public interface InterfaceC9146m {

    /* renamed from: o0.m$a */
    public static class a {

        /* renamed from: a */
        public final InterfaceC8082b f15424a;

        /* renamed from: b */
        public final List f15425b;

        /* renamed from: c */
        public final InterfaceC8115d f15426c;

        public a(InterfaceC8082b interfaceC8082b, InterfaceC8115d interfaceC8115d) {
            this(interfaceC8082b, Collections.EMPTY_LIST, interfaceC8115d);
        }

        public a(InterfaceC8082b interfaceC8082b, List list, InterfaceC8115d interfaceC8115d) {
            this.f15424a = (InterfaceC8082b) AbstractC7837i.m12256d(interfaceC8082b);
            this.f15425b = (List) AbstractC7837i.m12256d(list);
            this.f15426c = (InterfaceC8115d) AbstractC7837i.m12256d(interfaceC8115d);
        }
    }

    /* renamed from: a */
    boolean mo14655a(Object obj);

    /* renamed from: b */
    a mo14656b(Object obj, int i9, int i10, C8084d c8084d);
}
