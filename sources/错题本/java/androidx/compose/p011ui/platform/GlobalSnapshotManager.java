package androidx.compose.p011ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.channels.AbstractC5882k;
import kotlinx.coroutines.channels.C5873b;
import kotlinx.coroutines.channels.InterfaceC5876e;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, m5110d2 = {"Landroidx/compose/ui/platform/GlobalSnapshotManager;", "", "<init>", "()V", "Ld6/s;", "ensureStarted", "Ljava/util/concurrent/atomic/AtomicBoolean;", "started", "Ljava/util/concurrent/atomic/AtomicBoolean;", "sent", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class GlobalSnapshotManager {

    @NotNull
    public static final GlobalSnapshotManager INSTANCE = new GlobalSnapshotManager();

    @NotNull
    private static final AtomicBoolean started = new AtomicBoolean(false);

    @NotNull
    private static final AtomicBoolean sent = new AtomicBoolean(false);
    public static final int $stable = 8;

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", m5303f = "GlobalSnapshotManager.android.kt", m5304i = {0}, m5305l = {ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL}, m5306m = "invokeSuspend", m5307n = {"$this$consume$iv$iv"}, m5308s = {"L$0"})
    @SourceDebugExtension({"SMAP\nGlobalSnapshotManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlobalSnapshotManager.android.kt\nandroidx/compose/ui/platform/GlobalSnapshotManager$ensureStarted$1\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,59:1\n105#2:60\n82#2,6:61\n106#2,2:67\n92#2:69\n88#2,3:70\n*S KotlinDebug\n*F\n+ 1 GlobalSnapshotManager.android.kt\nandroidx/compose/ui/platform/GlobalSnapshotManager$ensureStarted$1\n*L\n46#1:60\n46#1:61,6\n46#1:67,2\n46#1:69\n46#1:70,3\n*E\n"})
    /* renamed from: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1 */
    public static final class C22411 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC5876e $channel;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22411(InterfaceC5876e interfaceC5876e, InterfaceC5631c<? super C22411> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$channel = interfaceC5876e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return new C22411(this.$channel, interfaceC5631c);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0036 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x003f A[Catch: all -> 0x0016, TRY_LEAVE, TryCatch #0 {all -> 0x0016, blocks: (B:6:0x0012, B:17:0x0037, B:19:0x003f, B:14:0x002a, B:13:0x0025), top: B:32:0x0006 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0034 -> B:17:0x0037). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r6.label
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 != r3) goto L18
                java.lang.Object r1 = r6.L$1
                kotlinx.coroutines.channels.a r1 = (kotlinx.coroutines.channels.C5872a) r1
                java.lang.Object r4 = r6.L$0
                kotlinx.coroutines.channels.o r4 = (kotlinx.coroutines.channels.InterfaceC5886o) r4
                kotlin.AbstractC5774b.m5119b(r7)     // Catch: java.lang.Throwable -> L16
                goto L37
            L16:
                r7 = move-exception
                goto L59
            L18:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L20:
                kotlin.AbstractC5774b.m5119b(r7)
                kotlinx.coroutines.channels.e r4 = r6.$channel
                kotlinx.coroutines.channels.a r7 = r4.iterator()     // Catch: java.lang.Throwable -> L16
                r1 = r7
            L2a:
                r6.L$0 = r4     // Catch: java.lang.Throwable -> L16
                r6.L$1 = r1     // Catch: java.lang.Throwable -> L16
                r6.label = r3     // Catch: java.lang.Throwable -> L16
                java.lang.Object r7 = r1.m5466b(r6)     // Catch: java.lang.Throwable -> L16
                if (r7 != r0) goto L37
                return r0
            L37:
                java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L16
                boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L16
                if (r7 == 0) goto L53
                java.lang.Object r7 = r1.m5467c()     // Catch: java.lang.Throwable -> L16
                d6.s r7 = (p045d6.C5443s) r7     // Catch: java.lang.Throwable -> L16
                java.util.concurrent.atomic.AtomicBoolean r7 = androidx.compose.p011ui.platform.GlobalSnapshotManager.access$getSent$p()     // Catch: java.lang.Throwable -> L16
                r5 = 0
                r7.set(r5)     // Catch: java.lang.Throwable -> L16
                androidx.compose.runtime.snapshots.Snapshot$Companion r7 = androidx.compose.runtime.snapshots.Snapshot.INSTANCE     // Catch: java.lang.Throwable -> L16
                r7.sendApplyNotifications()     // Catch: java.lang.Throwable -> L16
                goto L2a
            L53:
                r4.cancel(r2)
                d6.s r7 = p045d6.C5443s.f8405a
                return r7
            L59:
                throw r7     // Catch: java.lang.Throwable -> L5a
            L5a:
                r0 = move-exception
                boolean r1 = r7 instanceof java.util.concurrent.CancellationException
                if (r1 == 0) goto L62
                r2 = r7
                java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
            L62:
                if (r2 != 0) goto L6e
                java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
                java.lang.String r1 = "Channel was consumed, consumer had failed"
                r2.<init>(r1)
                r2.initCause(r7)
            L6e:
                r4.cancel(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.platform.GlobalSnapshotManager.C22411.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C22411) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    private GlobalSnapshotManager() {
    }

    public final void ensureStarted() {
        if (started.compareAndSet(false, true)) {
            final C5873b c5873bM5511a = AbstractC5882k.m5511a(1, 6, null);
            AbstractC6014x.m5651v(AbstractC6014x.m5630a(AndroidUiDispatcher.INSTANCE.getMain()), null, null, new C22411(c5873bM5511a, null), 3);
            Snapshot.INSTANCE.registerGlobalWriteObserver(new InterfaceC6471c() { // from class: androidx.compose.ui.platform.GlobalSnapshotManager.ensureStarted.2
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m12468invoke(obj);
                    return C5443s.f8405a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m12468invoke(Object obj) {
                    if (GlobalSnapshotManager.sent.compareAndSet(false, true)) {
                        c5873bM5511a.mo5481a(C5443s.f8405a);
                    }
                }
            });
        }
    }
}
