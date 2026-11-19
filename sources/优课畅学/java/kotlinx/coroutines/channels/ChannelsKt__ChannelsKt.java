package kotlinx.coroutines.channels;

import kotlinx.coroutines.channels.C9160c;
import p123h7.C8736p;
import p135i8.AbstractC8836g;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class ChannelsKt__ChannelsKt {
    /* renamed from: a */
    public static final Object m16520a(InterfaceC9163f interfaceC9163f, Object obj) {
        Object objMo27213trySendJP2dKIU = interfaceC9163f.mo27213trySendJP2dKIU(obj);
        if (objMo27213trySendJP2dKIU instanceof C9160c.c) {
            return ((C9160c) AbstractC8836g.m14852b(null, new ChannelsKt__ChannelsKt$trySendBlocking$2(interfaceC9163f, obj, null), 1, null)).m16541l();
        }
        return C9160c.f17673b.m16544c(C8736p.f16368a);
    }
}
