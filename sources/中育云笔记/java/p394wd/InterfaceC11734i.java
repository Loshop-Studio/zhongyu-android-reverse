package p394wd;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9945d;
import kotlinx.coroutines.channels.BufferOverflow;
import p379vd.InterfaceC11594c;

/* renamed from: wd.i */
/* loaded from: classes6.dex */
public interface InterfaceC11734i extends InterfaceC11594c {

    /* renamed from: wd.i$a */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ InterfaceC11594c m25965a(InterfaceC11734i interfaceC11734i, InterfaceC9945d interfaceC9945d, int i10, BufferOverflow bufferOverflow, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i11 & 1) != 0) {
                interfaceC9945d = EmptyCoroutineContext.f23351c;
            }
            if ((i11 & 2) != 0) {
                i10 = -3;
            }
            if ((i11 & 4) != 0) {
                bufferOverflow = BufferOverflow.f23519c;
            }
            return interfaceC11734i.mo20855b(interfaceC9945d, i10, bufferOverflow);
        }
    }

    /* renamed from: b */
    InterfaceC11594c mo20855b(InterfaceC9945d interfaceC9945d, int i10, BufferOverflow bufferOverflow);
}
