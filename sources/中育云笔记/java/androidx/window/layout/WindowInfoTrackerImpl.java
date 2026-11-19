package androidx.window.layout;

import android.app.Activity;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.channels.InterfaceC10000a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class WindowInfoTrackerImpl implements WindowInfoTracker {
    private static final int BUFFER_CAPACITY = 10;
    public static final Companion Companion = new Companion(null);
    private final WindowBackend windowBackend;
    private final WindowMetricsCalculator windowMetricsCalculator;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    @InterfaceC11829d(m26210c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", m26211f = "WindowInfoTrackerImpl.kt", m26212l = {54, 55}, m26213m = "invokeSuspend")
    /* renamed from: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1 */
    public static final class C47501 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ Activity $activity;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47501(Activity activity, InterfaceC11588c<? super C47501> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$activity = activity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        public static final void m33959invokeSuspend$lambda0(InterfaceC10000a interfaceC10000a, WindowLayoutInfo info) {
            AbstractC9979u.m20293f(info, "info");
            interfaceC10000a.mo33808trySendJP2dKIU(info);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C47501 c47501 = WindowInfoTrackerImpl.this.new C47501(this.$activity, interfaceC11588c);
            c47501.L$0 = obj;
            return c47501;
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
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                int r1 = r9.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L3a
                if (r1 == r3) goto L2a
                if (r1 != r2) goto L22
                java.lang.Object r1 = r9.L$2
                ud.e r1 = (p365ud.InterfaceC11390e) r1
                java.lang.Object r4 = r9.L$1
                androidx.core.util.Consumer r4 = (androidx.core.util.Consumer) r4
                java.lang.Object r5 = r9.L$0
                vd.d r5 = (p379vd.InterfaceC11595d) r5
                kotlin.AbstractC9924b.m20071b(r10)     // Catch: java.lang.Throwable -> L1f
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
                ud.e r1 = (p365ud.InterfaceC11390e) r1
                java.lang.Object r4 = r9.L$1
                androidx.core.util.Consumer r4 = (androidx.core.util.Consumer) r4
                java.lang.Object r5 = r9.L$0
                vd.d r5 = (p379vd.InterfaceC11595d) r5
                kotlin.AbstractC9924b.m20071b(r10)     // Catch: java.lang.Throwable -> L1f
                goto L76
            L3a:
                kotlin.AbstractC9924b.m20071b(r10)
                java.lang.Object r10 = r9.L$0
                vd.d r10 = (p379vd.InterfaceC11595d) r10
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.f23520d
                r4 = 4
                r5 = 10
                r6 = 0
                kotlinx.coroutines.channels.a r1 = kotlinx.coroutines.channels.AbstractC10001b.m20722b(r5, r1, r6, r4, r6)
                androidx.window.layout.i r4 = new androidx.window.layout.i
                r4.<init>()
                androidx.window.layout.WindowInfoTrackerImpl r5 = androidx.window.layout.WindowInfoTrackerImpl.this
                androidx.window.layout.WindowBackend r5 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r5)
                android.app.Activity r6 = r9.$activity
                androidx.profileinstaller.b r7 = new androidx.profileinstaller.b
                r7.<init>()
                r5.registerLayoutChangeCallback(r6, r7, r4)
                ud.e r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1f
            L64:
                r9.L$0 = r10     // Catch: java.lang.Throwable -> L1f
                r9.L$1 = r4     // Catch: java.lang.Throwable -> L1f
                r9.L$2 = r1     // Catch: java.lang.Throwable -> L1f
                r9.label = r3     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r5 = r1.mo20669a(r9)     // Catch: java.lang.Throwable -> L1f
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
                qc.q r10 = p309qc.C10786q.f26013a
                return r10
            L9f:
                androidx.window.layout.WindowInfoTrackerImpl r0 = androidx.window.layout.WindowInfoTrackerImpl.this
                androidx.window.layout.WindowBackend r0 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r0)
                r0.unregisterLayoutChangeCallback(r4)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoTrackerImpl.C47501.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11595d interfaceC11595d, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C47501) create(interfaceC11595d, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public WindowInfoTrackerImpl(WindowMetricsCalculator windowMetricsCalculator, WindowBackend windowBackend) {
        AbstractC9979u.m20294g(windowMetricsCalculator, "windowMetricsCalculator");
        AbstractC9979u.m20294g(windowBackend, "windowBackend");
        this.windowMetricsCalculator = windowMetricsCalculator;
        this.windowBackend = windowBackend;
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public InterfaceC11594c windowLayoutInfo(Activity activity) {
        AbstractC9979u.m20294g(activity, "activity");
        return AbstractC11596e.m25531B(new C47501(activity, null));
    }
}
