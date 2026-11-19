package androidx.compose.p006ui.platform;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

@Metadata(m5174d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m5175d2 = {"Landroidx/compose/ui/platform/GlobalSnapshotManager;", "", "()V", "started", "Ljava/util/concurrent/atomic/AtomicBoolean;", "ensureStarted", "", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class GlobalSnapshotManager {
    public static final GlobalSnapshotManager INSTANCE = new GlobalSnapshotManager();
    private static final AtomicBoolean started = new AtomicBoolean(false);

    @Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 8, 0})
    @DebugMetadata(m5191c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", m5192f = "GlobalSnapshotManager.android.kt", m5193i = {0}, m5194l = {63}, m5195m = "invokeSuspend", m5196n = {"$this$consume$iv$iv"}, m5197s = {"L$0"})
    @SourceDebugExtension({"SMAP\nGlobalSnapshotManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlobalSnapshotManager.android.kt\nandroidx/compose/ui/platform/GlobalSnapshotManager$ensureStarted$1\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,55:1\n103#2:56\n80#2,6:57\n104#2,2:63\n90#2:65\n86#2,4:66\n*S KotlinDebug\n*F\n+ 1 GlobalSnapshotManager.android.kt\nandroidx/compose/ui/platform/GlobalSnapshotManager$ensureStarted$1\n*L\n45#1:56\n45#1:57,6\n45#1:63,2\n45#1:65\n45#1:66,4\n*E\n"})
    /* renamed from: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1 */
    public static final class C14981 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Channel<Unit> $channel;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14981(Channel<Unit> channel, Continuation<? super C14981> continuation) {
            super(2, continuation);
            this.$channel = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C14981(this.$channel, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0049 A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:16:0x0041, B:18:0x0049), top: B:29:0x0041 }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003b -> B:29:0x0041). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.label
                r2 = 1
                if (r1 == 0) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r6.L$1
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r3 = r6.L$0
                kotlinx.coroutines.channels.ReceiveChannel r3 = (kotlinx.coroutines.channels.ReceiveChannel) r3
                kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L63
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r6
                goto L41
            L1b:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L23:
                kotlin.ResultKt.throwOnFailure(r7)
                kotlinx.coroutines.channels.Channel<kotlin.Unit> r3 = r6.$channel
                kotlinx.coroutines.channels.ChannelIterator r7 = r3.iterator()     // Catch: java.lang.Throwable -> L63
                r1 = r7
                r7 = r6
            L2e:
                r7.L$0 = r3     // Catch: java.lang.Throwable -> L63
                r7.L$1 = r1     // Catch: java.lang.Throwable -> L63
                r7.label = r2     // Catch: java.lang.Throwable -> L63
                java.lang.Object r4 = r1.hasNext(r7)     // Catch: java.lang.Throwable -> L63
                if (r4 != r0) goto L3b
                return r0
            L3b:
                r5 = r0
                r0 = r7
                r7 = r4
                r4 = r3
                r3 = r1
                r1 = r5
            L41:
                java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L60
                boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L60
                if (r7 == 0) goto L59
                java.lang.Object r7 = r3.next()     // Catch: java.lang.Throwable -> L60
                kotlin.Unit r7 = (kotlin.Unit) r7     // Catch: java.lang.Throwable -> L60
                androidx.compose.runtime.snapshots.Snapshot$Companion r7 = androidx.compose.runtime.snapshots.Snapshot.INSTANCE     // Catch: java.lang.Throwable -> L60
                r7.sendApplyNotifications()     // Catch: java.lang.Throwable -> L60
                r7 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L2e
            L59:
                r7 = 0
                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r7)
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            L60:
                r7 = move-exception
                r3 = r4
                goto L64
            L63:
                r7 = move-exception
            L64:
                throw r7     // Catch: java.lang.Throwable -> L65
            L65:
                r0 = move-exception
                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r3, r7)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p006ui.platform.GlobalSnapshotManager.C14981.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C14981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private GlobalSnapshotManager() {
    }

    public final void ensureStarted() {
        if (started.compareAndSet(false, true)) {
            final Channel channelChannel$default = ChannelKt.Channel$default(-1, null, null, 6, null);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(AndroidUiDispatcher.INSTANCE.getMain()), null, null, new C14981(channelChannel$default, null), 3, null);
            Snapshot.INSTANCE.registerGlobalWriteObserver(new Function1<Object, Unit>() { // from class: androidx.compose.ui.platform.GlobalSnapshotManager.ensureStarted.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                    invoke2(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    channelChannel$default.mo13306trySendJP2dKIU(Unit.INSTANCE);
                }
            });
        }
    }
}
