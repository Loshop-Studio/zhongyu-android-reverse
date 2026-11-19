package p101f8;

import java.util.Iterator;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10574p;

/* renamed from: f8.j */
/* loaded from: classes5.dex */
public abstract class AbstractC8472j {

    /* renamed from: f8.j$a */
    public static final class a implements InterfaceC8469g {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10574p f16073a;

        public a(InterfaceC10574p interfaceC10574p) {
            this.f16073a = interfaceC10574p;
        }

        @Override // p101f8.InterfaceC8469g
        public Iterator iterator() {
            return AbstractC8472j.m13826a(this.f16073a);
        }
    }

    /* renamed from: a */
    public static Iterator m13826a(InterfaceC10574p block) {
        AbstractC9133u.m16133g(block, "block");
        C8470h c8470h = new C8470h();
        c8470h.m13824f(IntrinsicsKt__IntrinsicsJvmKt.m16077b(block, c8470h, c8470h));
        return c8470h;
    }

    /* renamed from: b */
    public static InterfaceC8469g m13827b(InterfaceC10574p block) {
        AbstractC9133u.m16133g(block, "block");
        return new a(block);
    }
}
