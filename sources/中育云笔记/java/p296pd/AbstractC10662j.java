package p296pd;

import java.util.Iterator;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;

/* renamed from: pd.j */
/* loaded from: classes6.dex */
public abstract class AbstractC10662j {

    /* renamed from: pd.j$a */
    public static final class a implements InterfaceC10659g {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC9544p f25701a;

        public a(InterfaceC9544p interfaceC9544p) {
            this.f25701a = interfaceC9544p;
        }

        @Override // p296pd.InterfaceC10659g
        public Iterator iterator() {
            return AbstractC10662j.m22557a(this.f25701a);
        }
    }

    /* renamed from: a */
    public static Iterator m22557a(InterfaceC9544p block) {
        AbstractC9979u.m20294g(block, "block");
        C10660h c10660h = new C10660h();
        c10660h.m22555g(IntrinsicsKt__IntrinsicsJvmKt.m20222b(block, c10660h, c10660h));
        return c10660h;
    }

    /* renamed from: b */
    public static InterfaceC10659g m22558b(InterfaceC9544p block) {
        AbstractC9979u.m20294g(block, "block");
        return new a(block);
    }
}
