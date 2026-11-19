package androidx.window.layout;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(m13557d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m13558d2 = {"Landroidx/window/layout/WindowInfoTrackerImpl;", "Landroidx/window/layout/WindowInfoTracker;", "windowMetricsCalculator", "Landroidx/window/layout/WindowMetricsCalculator;", "windowBackend", "Landroidx/window/layout/WindowBackend;", "(Landroidx/window/layout/WindowMetricsCalculator;Landroidx/window/layout/WindowBackend;)V", "windowLayoutInfo", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/window/layout/WindowLayoutInfo;", "activity", "Landroid/app/Activity;", "Companion", "window_release"}, m13559k = 1, m13560mv = {1, 6, 0}, m13562xi = 48)
/* loaded from: classes3.dex */
public final class WindowInfoTrackerImpl implements WindowInfoTracker {
    private static final int BUFFER_CAPACITY = 10;
    private final WindowBackend windowBackend;
    private final WindowMetricsCalculator windowMetricsCalculator;

    @Metadata(m13557d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Landroidx/window/layout/WindowLayoutInfo;"}, m13559k = 3, m13560mv = {1, 6, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", m13596f = "WindowInfoTrackerImpl.kt", m13597i = {0, 0, 1, 1}, m13598l = {54, 55}, m13599m = "invokeSuspend", m13600n = {"$this$flow", "listener", "$this$flow", "listener"}, m13601s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1 */
    public static final class C47171 extends SuspendLambda implements Function2<FlowCollector<? super WindowLayoutInfo>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47171(Activity activity, Continuation<? super C47171> continuation) {
            super(2, continuation);
            this.$activity = activity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        public static final void m24219invokeSuspend$lambda0(Channel channel, WindowLayoutInfo info) {
            Intrinsics.checkNotNullExpressionValue(info, "info");
            channel.mo24070trySendJP2dKIU(info);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C47171 c47171 = WindowInfoTrackerImpl.this.new C47171(this.$activity, continuation);
            c47171.L$0 = obj;
            return c47171;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
        
            if (r5.emit(r10, r9) == r0) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x007e A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #0 {all -> 0x001f, blocks: (B:7:0x001a, B:18:0x0064, B:22:0x0076, B:24:0x007e, B:14:0x0036, B:17:0x0060), top: B:31:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0090 -> B:8:0x001d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L3a
                if (r1 == r3) goto L2a
                if (r1 != r2) goto L22
                java.lang.Object r1 = r9.L$2
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r4 = r9.L$1
                androidx.core.util.Consumer r4 = (androidx.core.util.Consumer) r4
                java.lang.Object r5 = r9.L$0
                kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
                kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L1f
            L1d:
                r10 = r5
                goto L64
            L1f:
                r10 = move-exception
                goto L9f
            L22:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L2a:
                java.lang.Object r1 = r9.L$2
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r4 = r9.L$1
                androidx.core.util.Consumer r4 = (androidx.core.util.Consumer) r4
                java.lang.Object r5 = r9.L$0
                kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
                kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L1f
                goto L76
            L3a:
                kotlin.ResultKt.throwOnFailure(r10)
                java.lang.Object r10 = r9.L$0
                kotlinx.coroutines.flow.FlowCollector r10 = (kotlinx.coroutines.flow.FlowCollector) r10
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
                r4 = 4
                r5 = 10
                r6 = 0
                kotlinx.coroutines.channels.Channel r1 = kotlinx.coroutines.channels.ChannelKt.Channel$default(r5, r1, r6, r4, r6)
                androidx.window.layout.i r4 = new androidx.window.layout.i
                r4.<init>()
                androidx.window.layout.WindowInfoTrackerImpl r5 = androidx.window.layout.WindowInfoTrackerImpl.this
                androidx.window.layout.WindowBackend r5 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r5)
                android.app.Activity r6 = r9.$activity
                androidx.profileinstaller.b r7 = new androidx.profileinstaller.b
                r7.<init>()
                r5.registerLayoutChangeCallback(r6, r7, r4)
                kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1f
            L64:
                r9.L$0 = r10     // Catch: java.lang.Throwable -> L1f
                r9.L$1 = r4     // Catch: java.lang.Throwable -> L1f
                r9.L$2 = r1     // Catch: java.lang.Throwable -> L1f
                r9.label = r3     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r5 = r1.hasNext(r9)     // Catch: java.lang.Throwable -> L1f
                if (r5 != r0) goto L73
                goto L92
            L73:
                r8 = r5
                r5 = r10
                r10 = r8
            L76:
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L1f
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L1f
                if (r10 == 0) goto L93
                java.lang.Object r10 = r1.next()     // Catch: java.lang.Throwable -> L1f
                androidx.window.layout.WindowLayoutInfo r10 = (androidx.window.layout.WindowLayoutInfo) r10     // Catch: java.lang.Throwable -> L1f
                r9.L$0 = r5     // Catch: java.lang.Throwable -> L1f
                r9.L$1 = r4     // Catch: java.lang.Throwable -> L1f
                r9.L$2 = r1     // Catch: java.lang.Throwable -> L1f
                r9.label = r2     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r10 = r5.emit(r10, r9)     // Catch: java.lang.Throwable -> L1f
                if (r10 != r0) goto L1d
            L92:
                return r0
            L93:
                androidx.window.layout.WindowInfoTrackerImpl r10 = androidx.window.layout.WindowInfoTrackerImpl.this
                androidx.window.layout.WindowBackend r10 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r10)
                r10.unregisterLayoutChangeCallback(r4)
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            L9f:
                androidx.window.layout.WindowInfoTrackerImpl r0 = androidx.window.layout.WindowInfoTrackerImpl.this
                androidx.window.layout.WindowBackend r0 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r0)
                r0.unregisterLayoutChangeCallback(r4)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoTrackerImpl.C47171.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super WindowLayoutInfo> flowCollector, Continuation<? super Unit> continuation) {
            return ((C47171) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public WindowInfoTrackerImpl(WindowMetricsCalculator windowMetricsCalculator, WindowBackend windowBackend) {
        Intrinsics.checkNotNullParameter(windowMetricsCalculator, "windowMetricsCalculator");
        Intrinsics.checkNotNullParameter(windowBackend, "windowBackend");
        this.windowMetricsCalculator = windowMetricsCalculator;
        this.windowBackend = windowBackend;
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public Flow<WindowLayoutInfo> windowLayoutInfo(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return FlowKt.flow(new C47171(activity, null));
    }
}
