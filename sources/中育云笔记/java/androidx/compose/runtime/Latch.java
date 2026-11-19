package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9977s;
import kotlinx.coroutines.C9997c;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11831f;
import sd.InterfaceC11125j;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class Latch {
    public static final int $stable = 8;
    private final Object lock = new Object();
    private List<InterfaceC11588c<C10786q>> awaiters = new ArrayList();
    private List<InterfaceC11588c<C10786q>> spareList = new ArrayList();
    private boolean _isOpen = true;

    public final Object await(InterfaceC11588c<? super C10786q> interfaceC11588c) {
        if (isOpen()) {
            return C10786q.f26013a;
        }
        final C9997c c9997c = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c), 1);
        c9997c.m20503F();
        synchronized (this.lock) {
            this.awaiters.add(c9997c);
        }
        c9997c.mo20536u(new InterfaceC9540l() { // from class: androidx.compose.runtime.Latch$await$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Throwable th) {
                Object obj = this.this$0.lock;
                Latch latch = this.this$0;
                InterfaceC11125j interfaceC11125j = c9997c;
                synchronized (obj) {
                    latch.awaiters.remove(interfaceC11125j);
                    C10786q c10786q = C10786q.f26013a;
                }
            }
        });
        Object objM20538x = c9997c.m20538x();
        if (objM20538x == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM20538x == AbstractC11725a.m25952f() ? objM20538x : C10786q.f26013a;
    }

    public final void closeLatch() {
        synchronized (this.lock) {
            this._isOpen = false;
            C10786q c10786q = C10786q.f26013a;
        }
    }

    public final boolean isOpen() {
        boolean z10;
        synchronized (this.lock) {
            z10 = this._isOpen;
        }
        return z10;
    }

    public final void openLatch() {
        synchronized (this.lock) {
            try {
                if (isOpen()) {
                    return;
                }
                List<InterfaceC11588c<C10786q>> list = this.awaiters;
                this.awaiters = this.spareList;
                this.spareList = list;
                this._isOpen = true;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    InterfaceC11588c<C10786q> interfaceC11588c = list.get(i10);
                    Result.C9921a c9921a = Result.f23263d;
                    interfaceC11588c.resumeWith(Result.m20054c(C10786q.f26013a));
                }
                list.clear();
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <R> R withClosed(InterfaceC9529a interfaceC9529a) {
        closeLatch();
        try {
            return (R) interfaceC9529a.invoke();
        } finally {
            AbstractC9977s.m20286b(1);
            openLatch();
            AbstractC9977s.m20285a(1);
        }
    }
}
