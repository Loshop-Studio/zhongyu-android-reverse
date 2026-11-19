package p030c0;

import java.util.List;
import java.util.ServiceLoader;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.sequences.SequencesKt;

/* renamed from: c0.w */
/* loaded from: classes3.dex */
public final class C5098w {

    /* renamed from: a */
    public static final C5098w f2661a = new C5098w();

    /* renamed from: b */
    public static final Lazy f2662b = LazyKt.lazy(new Function0() { // from class: c0.u
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C5098w.m2714d();
        }
    });

    /* renamed from: c */
    public static final Lazy f2663c = LazyKt.lazy(new Function0() { // from class: c0.v
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C5098w.m2713c();
        }
    });

    /* renamed from: c */
    public static final List m2713c() {
        return AbstractC5077b.m2669c(SequencesKt.toList(SequencesKt.asSequence(ServiceLoader.load(InterfaceC5080e.class, InterfaceC5080e.class.getClassLoader()).iterator())));
    }

    /* renamed from: d */
    public static final List m2714d() {
        return AbstractC5077b.m2669c(SequencesKt.toList(SequencesKt.asSequence(ServiceLoader.load(InterfaceC5083h.class, InterfaceC5083h.class.getClassLoader()).iterator())));
    }

    /* renamed from: e */
    public final List m2715e() {
        return (List) f2663c.getValue();
    }

    /* renamed from: f */
    public final List m2716f() {
        return (List) f2662b.getValue();
    }
}
