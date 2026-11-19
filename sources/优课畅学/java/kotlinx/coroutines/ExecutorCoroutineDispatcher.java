package kotlinx.coroutines;

import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.coroutines.AbstractC9098b;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9126n;
import p300x7.InterfaceC10570l;

/* loaded from: classes5.dex */
public abstract class ExecutorCoroutineDispatcher extends CoroutineDispatcher implements Closeable {

    /* renamed from: a */
    public static final Key f17561a = new Key(null);

    public static final class Key extends AbstractC9098b {
        public /* synthetic */ Key(AbstractC9126n abstractC9126n) {
            this();
        }

        public Key() {
            super(CoroutineDispatcher.Key, new InterfaceC10570l() { // from class: kotlinx.coroutines.ExecutorCoroutineDispatcher.Key.1
                @Override // p300x7.InterfaceC10570l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ExecutorCoroutineDispatcher invoke(InterfaceC9100d.b bVar) {
                    if (bVar instanceof ExecutorCoroutineDispatcher) {
                        return (ExecutorCoroutineDispatcher) bVar;
                    }
                    return null;
                }
            });
        }
    }

    /* renamed from: i */
    public abstract Executor mo16230i();
}
