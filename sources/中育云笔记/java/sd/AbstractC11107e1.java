package sd;

import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.coroutines.AbstractC9943b;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;
import sd.AbstractC11107e1;

/* renamed from: sd.e1 */
/* loaded from: classes6.dex */
public abstract class AbstractC11107e1 extends AbstractC11106e0 implements Closeable, AutoCloseable {

    /* renamed from: c */
    public static final a f26778c = new a(null);

    /* renamed from: sd.e1$a */
    public static final class a extends AbstractC9943b {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: d */
        public static final AbstractC11107e1 m24699d(InterfaceC9945d.b bVar) {
            if (bVar instanceof AbstractC11107e1) {
                return (AbstractC11107e1) bVar;
            }
            return null;
        }

        public a() {
            super(AbstractC11106e0.Key, new InterfaceC9540l() { // from class: sd.d1
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return AbstractC11107e1.a.m24699d((InterfaceC9945d.b) obj);
                }
            });
        }
    }

    /* renamed from: i */
    public abstract Executor mo24697i();
}
