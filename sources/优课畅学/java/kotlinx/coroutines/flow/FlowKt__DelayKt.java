package kotlinx.coroutines.flow;

import kotlinx.coroutines.flow.internal.FlowCoroutineKt;
import p169l8.InterfaceC9266c;
import p300x7.InterfaceC10570l;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class FlowKt__DelayKt {
    /* renamed from: a */
    public static final InterfaceC9266c m16584a(InterfaceC9266c interfaceC9266c, final long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? interfaceC9266c : m16585b(interfaceC9266c, new InterfaceC10570l() { // from class: kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Long invoke(Object obj) {
                    return Long.valueOf(j10);
                }
            });
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    /* renamed from: b */
    public static final InterfaceC9266c m16585b(InterfaceC9266c interfaceC9266c, InterfaceC10570l interfaceC10570l) {
        return FlowCoroutineKt.m16708b(new FlowKt__DelayKt$debounceInternal$1(interfaceC10570l, interfaceC9266c, null));
    }
}
