package p228s0;

import com.bumptech.glide.load.data.InterfaceC5356d;
import java.util.Collections;
import java.util.List;
import p117i1.AbstractC7651j;
import p162m0.C8539d;
import p162m0.InterfaceC8537b;

/* renamed from: s0.n */
/* loaded from: classes3.dex */
public interface InterfaceC9112n {

    /* renamed from: s0.n$a */
    public static class a {

        /* renamed from: a */
        public final InterfaceC8537b f15784a;

        /* renamed from: b */
        public final List f15785b;

        /* renamed from: c */
        public final InterfaceC5356d f15786c;

        public a(InterfaceC8537b interfaceC8537b, InterfaceC5356d interfaceC5356d) {
            this(interfaceC8537b, Collections.EMPTY_LIST, interfaceC5356d);
        }

        public a(InterfaceC8537b interfaceC8537b, List list, InterfaceC5356d interfaceC5356d) {
            this.f15784a = (InterfaceC8537b) AbstractC7651j.m12683d(interfaceC8537b);
            this.f15785b = (List) AbstractC7651j.m12683d(list);
            this.f15786c = (InterfaceC5356d) AbstractC7651j.m12683d(interfaceC5356d);
        }
    }

    /* renamed from: a */
    boolean mo15354a(Object obj);

    /* renamed from: b */
    a mo15355b(Object obj, int i10, int i11, C8539d c8539d);
}
