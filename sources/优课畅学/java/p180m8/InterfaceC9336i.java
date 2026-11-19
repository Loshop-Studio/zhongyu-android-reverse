package p180m8;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9100d;
import kotlinx.coroutines.channels.BufferOverflow;
import p169l8.InterfaceC9266c;

/* renamed from: m8.i */
/* loaded from: classes5.dex */
public interface InterfaceC9336i extends InterfaceC9266c {

    /* renamed from: m8.i$a */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ InterfaceC9266c m17168a(InterfaceC9336i interfaceC9336i, InterfaceC9100d interfaceC9100d, int i10, BufferOverflow bufferOverflow, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i11 & 1) != 0) {
                interfaceC9100d = EmptyCoroutineContext.f17438a;
            }
            if ((i11 & 2) != 0) {
                i10 = -3;
            }
            if ((i11 & 4) != 0) {
                bufferOverflow = BufferOverflow.f17603a;
            }
            return interfaceC9336i.mo16671c(interfaceC9100d, i10, bufferOverflow);
        }
    }

    /* renamed from: c */
    InterfaceC9266c mo16671c(InterfaceC9100d interfaceC9100d, int i10, BufferOverflow bufferOverflow);
}
