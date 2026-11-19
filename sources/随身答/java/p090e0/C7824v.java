package p090e0;

import java.util.List;
import java.util.ServiceLoader;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.sequences.SequencesKt;

/* renamed from: e0.v */
/* loaded from: classes3.dex */
public final class C7824v {

    /* renamed from: a */
    public static final C7824v f13133a = new C7824v();

    /* renamed from: b */
    public static final Lazy f13134b = LazyKt.lazy(new Function0() { // from class: e0.t
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C7824v.m12221d();
        }
    });

    /* renamed from: c */
    public static final Lazy f13135c = LazyKt.lazy(new Function0() { // from class: e0.u
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C7824v.m12220c();
        }
    });

    /* renamed from: c */
    public static final List m12220c() {
        return AbstractC7804b.m12177c(SequencesKt.toList(SequencesKt.asSequence(ServiceLoader.load(InterfaceC7807e.class, InterfaceC7807e.class.getClassLoader()).iterator())));
    }

    /* renamed from: d */
    public static final List m12221d() {
        return AbstractC7804b.m12177c(SequencesKt.toList(SequencesKt.asSequence(ServiceLoader.load(InterfaceC7809g.class, InterfaceC7809g.class.getClassLoader()).iterator())));
    }

    /* renamed from: e */
    public final List m12222e() {
        return (List) f13135c.getValue();
    }

    /* renamed from: f */
    public final List m12223f() {
        return (List) f13134b.getValue();
    }
}
