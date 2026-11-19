package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9131s;
import kotlinx.coroutines.C9155c;
import p123h7.C8736p;
import p135i8.InterfaceC8845j;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9541f;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class Latch {
    public static final int $stable = 8;
    private final Object lock = new Object();
    private List<InterfaceC9324c<C8736p>> awaiters = new ArrayList();
    private List<InterfaceC9324c<C8736p>> spareList = new ArrayList();
    private boolean _isOpen = true;

    public final Object await(InterfaceC9324c<? super C8736p> interfaceC9324c) {
        if (isOpen()) {
            return C8736p.f16368a;
        }
        final C9155c c9155c = new C9155c(IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c), 1);
        c9155c.m16343D();
        synchronized (this.lock) {
            this.awaiters.add(c9155c);
        }
        c9155c.mo14873r(new InterfaceC10570l() { // from class: androidx.compose.runtime.Latch$await$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Throwable th) {
                Object obj = this.this$0.lock;
                Latch latch = this.this$0;
                InterfaceC8845j interfaceC8845j = c9155c;
                synchronized (obj) {
                    latch.awaiters.remove(interfaceC8845j);
                    C8736p c8736p = C8736p.f16368a;
                }
            }
        });
        Object objM16372x = c9155c.m16372x();
        if (objM16372x == AbstractC9434a.m17291f()) {
            AbstractC9541f.m17811c(interfaceC9324c);
        }
        return objM16372x == AbstractC9434a.m17291f() ? objM16372x : C8736p.f16368a;
    }

    public final void closeLatch() {
        synchronized (this.lock) {
            this._isOpen = false;
            C8736p c8736p = C8736p.f16368a;
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
                List<InterfaceC9324c<C8736p>> list = this.awaiters;
                this.awaiters = this.spareList;
                this.spareList = list;
                this._isOpen = true;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    InterfaceC9324c<C8736p> interfaceC9324c = list.get(i10);
                    Result.C9076a c9076a = Result.f17350b;
                    interfaceC9324c.resumeWith(Result.m15909b(C8736p.f16368a));
                }
                list.clear();
                C8736p c8736p = C8736p.f16368a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <R> R withClosed(InterfaceC10559a interfaceC10559a) {
        closeLatch();
        try {
            return (R) interfaceC10559a.invoke();
        } finally {
            AbstractC9131s.m16125b(1);
            openLatch();
            AbstractC9131s.m16124a(1);
        }
    }
}
