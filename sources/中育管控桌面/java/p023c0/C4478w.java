package p023c0;

import java.util.List;
import java.util.ServiceLoader;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.sequences.SequencesKt;

/* renamed from: c0.w */
/* loaded from: classes3.dex */
public final class C4478w {

    /* renamed from: a */
    public static final C4478w f1341a = new C4478w();

    /* renamed from: b */
    public static final Lazy f1342b = LazyKt.lazy(new Function0() { // from class: c0.u
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C4478w.m1572d();
        }
    });

    /* renamed from: c */
    public static final Lazy f1343c = LazyKt.lazy(new Function0() { // from class: c0.v
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C4478w.m1571c();
        }
    });

    /* renamed from: c */
    public static final List m1571c() {
        return AbstractC4457b.m1526c(SequencesKt.toList(SequencesKt.asSequence(ServiceLoader.load(InterfaceC4460e.class, InterfaceC4460e.class.getClassLoader()).iterator())));
    }

    /* renamed from: d */
    public static final List m1572d() {
        return AbstractC4457b.m1526c(SequencesKt.toList(SequencesKt.asSequence(ServiceLoader.load(InterfaceC4463h.class, InterfaceC4463h.class.getClassLoader()).iterator())));
    }

    /* renamed from: e */
    public final List m1573e() {
        return (List) f1343c.getValue();
    }

    /* renamed from: f */
    public final List m1574f() {
        return (List) f1342b.getValue();
    }
}
