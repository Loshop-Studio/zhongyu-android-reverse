package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p014ui.input.pointer.PointerEvent;
import androidx.compose.p014ui.input.pointer.PointerEventPass;
import androidx.compose.p014ui.input.pointer.PointerEventType;
import androidx.compose.p014ui.input.pointer.PointerInputChange;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import com.taobao.sophix.PatchStatus;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC10006d;
import kotlinx.coroutines.InterfaceC10045g;
import kotlinx.coroutines.channels.AbstractC10001b;
import kotlinx.coroutines.channels.C10002c;
import kotlinx.coroutines.channels.InterfaceC10000a;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p296pd.AbstractC10661i;
import p296pd.AbstractC10662j;
import p296pd.InterfaceC10659g;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class MouseWheelScrollingLogic {
    public static final int $stable = 8;
    private Density density;
    private boolean isScrolling;
    private final ScrollConfig mouseWheelScrollConfig;
    private final InterfaceC9544p onScrollStopped;
    private InterfaceC10045g receivingMouseWheelEventsJob;
    private final ScrollingLogic scrollingLogic;
    private final InterfaceC10000a channel = AbstractC10001b.m20722b(Integer.MAX_VALUE, null, null, 6, null);
    private final MouseWheelVelocityTracker velocityTracker = new MouseWheelVelocityTracker();

    public static final class MouseWheelScrollDelta {
        private final boolean shouldApplyImmediately;
        private final long timeMillis;
        private final long value;

        public /* synthetic */ MouseWheelScrollDelta(long j10, long j11, boolean z10, AbstractC9972n abstractC9972n) {
            this(j10, j11, z10);
        }

        /* renamed from: copy-9KIMszo$default, reason: not valid java name */
        public static /* synthetic */ MouseWheelScrollDelta m27195copy9KIMszo$default(MouseWheelScrollDelta mouseWheelScrollDelta, long j10, long j11, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = mouseWheelScrollDelta.value;
            }
            long j12 = j10;
            if ((i10 & 2) != 0) {
                j11 = mouseWheelScrollDelta.timeMillis;
            }
            long j13 = j11;
            if ((i10 & 4) != 0) {
                z10 = mouseWheelScrollDelta.shouldApplyImmediately;
            }
            return mouseWheelScrollDelta.m27197copy9KIMszo(j12, j13, z10);
        }

        /* renamed from: component1-F1C5BW0, reason: not valid java name */
        public final long m27196component1F1C5BW0() {
            return this.value;
        }

        public final long component2() {
            return this.timeMillis;
        }

        public final boolean component3() {
            return this.shouldApplyImmediately;
        }

        /* renamed from: copy-9KIMszo, reason: not valid java name */
        public final MouseWheelScrollDelta m27197copy9KIMszo(long j10, long j11, boolean z10) {
            return new MouseWheelScrollDelta(j10, j11, z10, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MouseWheelScrollDelta)) {
                return false;
            }
            MouseWheelScrollDelta mouseWheelScrollDelta = (MouseWheelScrollDelta) obj;
            return Offset.m30634equalsimpl0(this.value, mouseWheelScrollDelta.value) && this.timeMillis == mouseWheelScrollDelta.timeMillis && this.shouldApplyImmediately == mouseWheelScrollDelta.shouldApplyImmediately;
        }

        public final boolean getShouldApplyImmediately() {
            return this.shouldApplyImmediately;
        }

        public final long getTimeMillis() {
            return this.timeMillis;
        }

        /* renamed from: getValue-F1C5BW0, reason: not valid java name */
        public final long m27198getValueF1C5BW0() {
            return this.value;
        }

        public int hashCode() {
            return (((Offset.m30639hashCodeimpl(this.value) * 31) + Long.hashCode(this.timeMillis)) * 31) + Boolean.hashCode(this.shouldApplyImmediately);
        }

        public final MouseWheelScrollDelta plus(MouseWheelScrollDelta mouseWheelScrollDelta) {
            return new MouseWheelScrollDelta(Offset.m30642plusMKHz9U(this.value, mouseWheelScrollDelta.value), Math.max(this.timeMillis, mouseWheelScrollDelta.timeMillis), this.shouldApplyImmediately, null);
        }

        public String toString() {
            return "MouseWheelScrollDelta(value=" + ((Object) Offset.m30645toStringimpl(this.value)) + ", timeMillis=" + this.timeMillis + ", shouldApplyImmediately=" + this.shouldApplyImmediately + ')';
        }

        private MouseWheelScrollDelta(long j10, long j11, boolean z10) {
            this.value = j10;
            this.timeMillis = j11;
            this.shouldApplyImmediately = z10;
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2", m26211f = "MouseWheelScrollable.kt", m26212l = {170}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2 */
    public static final class C13202 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC10000a $this_busyReceive;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13202(InterfaceC10000a interfaceC10000a, InterfaceC11588c<? super C13202> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$this_busyReceive = interfaceC10000a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C13202 c13202 = new C13202(this.$this_busyReceive, interfaceC11588c);
            c13202.L$0 = obj;
            return c13202;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.g] */
        /* JADX WARN: Type inference failed for: r1v3, types: [kotlinx.coroutines.g] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            ?? r12 = this.label;
            try {
                if (r12 == 0) {
                    AbstractC9924b.m20071b(obj);
                    InterfaceC10045g interfaceC10045gM24726d = AbstractC11117h.m24726d((InterfaceC11122i0) this.L$0, null, null, new MouseWheelScrollingLogic$busyReceive$2$job$1(null), 3, null);
                    InterfaceC10000a interfaceC10000a = this.$this_busyReceive;
                    this.L$0 = interfaceC10045gM24726d;
                    this.label = 1;
                    obj = interfaceC10000a.mo20630d(this);
                    r12 = interfaceC10045gM24726d;
                    if (obj == objM25952f) {
                        return objM25952f;
                    }
                } else {
                    if (r12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    InterfaceC10045g interfaceC10045g = (InterfaceC10045g) this.L$0;
                    AbstractC9924b.m20071b(obj);
                    r12 = interfaceC10045g;
                }
                MouseWheelScrollDelta mouseWheelScrollDelta = (MouseWheelScrollDelta) obj;
                InterfaceC10045g.a.m20900a(r12, null, 1, null);
                return mouseWheelScrollDelta;
            } catch (Throwable th) {
                InterfaceC10045g.a.m20900a(r12, null, 1, null);
                throw th;
            }
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super MouseWheelScrollDelta> interfaceC11588c) {
            return ((C13202) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", m26211f = "MouseWheelScrollable.kt", m26212l = {IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 295}, m26213m = "dispatchMouseWheelScroll")
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 */
    public static final class C13221 extends ContinuationImpl {
        float F$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C13221(InterfaceC11588c<? super C13221> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MouseWheelScrollingLogic.this.dispatchMouseWheelScroll(null, null, 0.0f, 0.0f, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3", m26211f = "MouseWheelScrollable.kt", m26212l = {253, 266, 283}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 */
    public static final class C13233 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ Ref$ObjectRef<AnimationState<Float, AnimationVector1D>> $animationState;
        final /* synthetic */ float $speed;
        final /* synthetic */ Ref$ObjectRef<MouseWheelScrollDelta> $targetScrollDelta;
        final /* synthetic */ Ref$FloatRef $targetValue;
        final /* synthetic */ ScrollingLogic $this_dispatchMouseWheelScroll;
        final /* synthetic */ float $threshold;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ MouseWheelScrollingLogic this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13233(Ref$FloatRef ref$FloatRef, Ref$ObjectRef<AnimationState<Float, AnimationVector1D>> ref$ObjectRef, Ref$ObjectRef<MouseWheelScrollDelta> ref$ObjectRef2, float f10, MouseWheelScrollingLogic mouseWheelScrollingLogic, float f11, ScrollingLogic scrollingLogic, InterfaceC11588c<? super C13233> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$targetValue = ref$FloatRef;
            this.$animationState = ref$ObjectRef;
            this.$targetScrollDelta = ref$ObjectRef2;
            this.$threshold = f10;
            this.this$0 = mouseWheelScrollingLogic;
            this.$speed = f11;
            this.$this_dispatchMouseWheelScroll = scrollingLogic;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C13233 c13233 = new C13233(this.$targetValue, this.$animationState, this.$targetScrollDelta, this.$threshold, this.this$0, this.$speed, this.$this_dispatchMouseWheelScroll, interfaceC11588c);
            c13233.L$0 = obj;
            return c13233;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(NestedScrollScope nestedScrollScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C13233) create(nestedScrollScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x012b  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x015d  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x018e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x014f -> B:30:0x0151). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x015d -> B:13:0x0067). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 401
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.C13233.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1", m26211f = "MouseWheelScrollable.kt", m26212l = {PatchStatus.CODE_PRELOAD_OPT_MERGED, IjkMediaMeta.FF_PROFILE_H264_HIGH_10}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 */
    public static final class C13261 extends SuspendLambda implements InterfaceC9544p {
        private /* synthetic */ Object L$0;
        int label;

        public C13261(InterfaceC11588c<? super C13261> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C13261 c13261 = MouseWheelScrollingLogic.this.new C13261(interfaceC11588c);
            c13261.L$0 = obj;
            return c13261;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                r12 = this;
                java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                int r1 = r12.label
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2e
                if (r1 == r4) goto L26
                if (r1 != r3) goto L1e
                java.lang.Object r1 = r12.L$0
                sd.i0 r1 = (sd.InterfaceC11122i0) r1
                kotlin.AbstractC9924b.m20071b(r13)     // Catch: java.lang.Throwable -> L19
                r10 = r12
            L17:
                r13 = r1
                goto L35
            L19:
                r0 = move-exception
                r13 = r0
                r10 = r12
                goto L94
            L1e:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L26:
                java.lang.Object r1 = r12.L$0
                sd.i0 r1 = (sd.InterfaceC11122i0) r1
                kotlin.AbstractC9924b.m20071b(r13)     // Catch: java.lang.Throwable -> L19
                goto L54
            L2e:
                kotlin.AbstractC9924b.m20071b(r13)
                java.lang.Object r13 = r12.L$0
                sd.i0 r13 = (sd.InterfaceC11122i0) r13
            L35:
                kotlin.coroutines.d r1 = r13.getCoroutineContext()     // Catch: java.lang.Throwable -> L88
                boolean r1 = sd.AbstractC11147o1.m24780n(r1)     // Catch: java.lang.Throwable -> L88
                if (r1 == 0) goto L8b
                androidx.compose.foundation.gestures.MouseWheelScrollingLogic r1 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.this     // Catch: java.lang.Throwable -> L88
                kotlinx.coroutines.channels.a r1 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.access$getChannel$p(r1)     // Catch: java.lang.Throwable -> L88
                r12.L$0 = r13     // Catch: java.lang.Throwable -> L88
                r12.label = r4     // Catch: java.lang.Throwable -> L88
                java.lang.Object r1 = r1.mo20630d(r12)     // Catch: java.lang.Throwable -> L88
                if (r1 != r0) goto L51
                r10 = r12
                goto L84
            L51:
                r11 = r1
                r1 = r13
                r13 = r11
            L54:
                r7 = r13
                androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta r7 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta) r7     // Catch: java.lang.Throwable -> L88
                androidx.compose.foundation.gestures.MouseWheelScrollingLogic r13 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.this     // Catch: java.lang.Throwable -> L88
                androidx.compose.ui.unit.Density r13 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.access$getDensity$p(r13)     // Catch: java.lang.Throwable -> L88
                float r5 = androidx.compose.foundation.gestures.MouseWheelScrollableKt.access$getAnimationThreshold$p()     // Catch: java.lang.Throwable -> L88
                float r8 = r13.mo27099toPx0680j_4(r5)     // Catch: java.lang.Throwable -> L88
                androidx.compose.foundation.gestures.MouseWheelScrollingLogic r13 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.this     // Catch: java.lang.Throwable -> L88
                androidx.compose.ui.unit.Density r13 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.access$getDensity$p(r13)     // Catch: java.lang.Throwable -> L88
                float r5 = androidx.compose.foundation.gestures.MouseWheelScrollableKt.access$getAnimationSpeed$p()     // Catch: java.lang.Throwable -> L88
                float r9 = r13.mo27099toPx0680j_4(r5)     // Catch: java.lang.Throwable -> L88
                androidx.compose.foundation.gestures.MouseWheelScrollingLogic r5 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.this     // Catch: java.lang.Throwable -> L88
                androidx.compose.foundation.gestures.ScrollingLogic r6 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.access$getScrollingLogic$p(r5)     // Catch: java.lang.Throwable -> L88
                r12.L$0 = r1     // Catch: java.lang.Throwable -> L88
                r12.label = r3     // Catch: java.lang.Throwable -> L88
                r10 = r12
                java.lang.Object r13 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.access$dispatchMouseWheelScroll(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L85
                if (r13 != r0) goto L17
            L84:
                return r0
            L85:
                r0 = move-exception
            L86:
                r13 = r0
                goto L94
            L88:
                r0 = move-exception
                r10 = r12
                goto L86
            L8b:
                r10 = r12
                androidx.compose.foundation.gestures.MouseWheelScrollingLogic r13 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.this
                androidx.compose.foundation.gestures.MouseWheelScrollingLogic.access$setReceivingMouseWheelEventsJob$p(r13, r2)
                qc.q r13 = p309qc.C10786q.f26013a
                return r13
            L94:
                androidx.compose.foundation.gestures.MouseWheelScrollingLogic r0 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.this
                androidx.compose.foundation.gestures.MouseWheelScrollingLogic.access$setReceivingMouseWheelEventsJob$p(r0, r2)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.C13261.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C13261) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$untilNull$1", m26211f = "MouseWheelScrollable.kt", m26212l = {179}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$untilNull$1 */
    public static final class C13281 extends RestrictedSuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9529a $builderAction;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13281(InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super C13281> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$builderAction = interfaceC9529a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C13281 c13281 = new C13281(this.$builderAction, interfaceC11588c);
            c13281.L$0 = obj;
            return c13281;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0037 -> B:15:0x003b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003a -> B:15:0x003b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r1 = r4.L$1
                java.lang.Object r3 = r4.L$0
                pd.i r3 = (p296pd.AbstractC10661i) r3
                kotlin.AbstractC9924b.m20071b(r5)
                goto L3b
            L15:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1d:
                kotlin.AbstractC9924b.m20071b(r5)
                java.lang.Object r5 = r4.L$0
                pd.i r5 = (p296pd.AbstractC10661i) r5
                r3 = r5
            L25:
                hd.a r5 = r4.$builderAction
                java.lang.Object r1 = r5.invoke()
                if (r1 == 0) goto L3a
                r4.L$0 = r3
                r4.L$1 = r1
                r4.label = r2
                java.lang.Object r5 = r3.mo22551a(r1, r4)
                if (r5 != r0) goto L3b
                return r0
            L3a:
                r1 = 0
            L3b:
                if (r1 != 0) goto L25
                qc.q r5 = p309qc.C10786q.f26013a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.C13281.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(AbstractC10661i abstractC10661i, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C13281) create(abstractC10661i, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", m26211f = "MouseWheelScrollable.kt", m26212l = {122}, m26213m = "userScroll")
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1 */
    public static final class C13291 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C13291(InterfaceC11588c<? super C13291> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MouseWheelScrollingLogic.this.userScroll(null, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$2", m26211f = "MouseWheelScrollable.kt", m26212l = {122}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$2 */
    public static final class C13302 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9544p $block;
        final /* synthetic */ ScrollingLogic $this_userScroll;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13302(ScrollingLogic scrollingLogic, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C13302> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$this_userScroll = scrollingLogic;
            this.$block = interfaceC9544p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C13302(this.$this_userScroll, this.$block, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                ScrollingLogic scrollingLogic = this.$this_userScroll;
                MutatePriority mutatePriority = MutatePriority.UserInput;
                InterfaceC9544p interfaceC9544p = this.$block;
                this.label = 1;
                if (scrollingLogic.scroll(mutatePriority, interfaceC9544p, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C13302) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public MouseWheelScrollingLogic(ScrollingLogic scrollingLogic, ScrollConfig scrollConfig, InterfaceC9544p interfaceC9544p, Density density) {
        this.scrollingLogic = scrollingLogic;
        this.mouseWheelScrollConfig = scrollConfig;
        this.onScrollStopped = interfaceC9544p;
        this.density = density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateMouseWheelScroll(final NestedScrollScope nestedScrollScope, AnimationState<Float, AnimationVector1D> animationState, float f10, int i10, final InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super C10786q> interfaceC11588c) throws Throwable {
        final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        ref$FloatRef.f23399c = animationState.getValue().floatValue();
        Object objAnimateTo = SuspendAnimationKt.animateTo(animationState, AbstractC11826a.m26207b(f10), AnimationSpecKt.tween$default(i10, 0, EasingKt.getLinearEasing(), 2, null), true, new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.animateMouseWheelScroll.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AnimationScope<Float, AnimationVector1D>) obj);
                return C10786q.f26013a;
            }

            public final void invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                float fFloatValue = animationScope.getValue().floatValue() - ref$FloatRef.f23399c;
                if (!MouseWheelScrollableKt.isLowScrollingDelta(fFloatValue)) {
                    if (!MouseWheelScrollableKt.isLowScrollingDelta(fFloatValue - this.dispatchMouseWheelScroll(nestedScrollScope, fFloatValue))) {
                        animationScope.cancelAnimation();
                        return;
                    } else {
                        ref$FloatRef.f23399c += fFloatValue;
                    }
                }
                if (((Boolean) interfaceC9540l.invoke(Float.valueOf(ref$FloatRef.f23399c))).booleanValue()) {
                    animationScope.cancelAnimation();
                }
            }
        }, interfaceC11588c);
        return objAnimateTo == AbstractC11725a.m25952f() ? objAnimateTo : C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object busyReceive(InterfaceC10000a interfaceC10000a, InterfaceC11588c<? super MouseWheelScrollDelta> interfaceC11588c) {
        return AbstractC10006d.m20748e(new C13202(interfaceC10000a, null), interfaceC11588c);
    }

    /* renamed from: canConsumeDelta-Uv8p0NA, reason: not valid java name */
    private final boolean m27192canConsumeDeltaUv8p0NA(ScrollingLogic scrollingLogic, long j10) {
        float fM27247toFloatk4lQ0M = scrollingLogic.m27247toFloatk4lQ0M(scrollingLogic.m27245reverseIfNeededMKHz9U(j10));
        if (fM27247toFloatk4lQ0M == 0.0f) {
            return false;
        }
        return fM27247toFloatk4lQ0M > 0.0f ? scrollingLogic.getScrollableState().getCanScrollForward() : scrollingLogic.getScrollableState().getCanScrollBackward();
    }

    private final void consume(PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i10 = 0; i10 < size; i10++) {
            changes.get(i10).consume();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0110, code lost:
    
        if (r0.invoke(r1, r9) == r10) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object dispatchMouseWheelScroll(androidx.compose.foundation.gestures.ScrollingLogic r23, androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta r24, float r25, float r26, vc.InterfaceC11588c<? super p309qc.C10786q> r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.dispatchMouseWheelScroll(androidx.compose.foundation.gestures.ScrollingLogic, androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta, float, float, vc.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object dispatchMouseWheelScroll$waitNextScrollDelta(androidx.compose.foundation.gestures.MouseWheelScrollingLogic r21, kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta> r22, kotlin.jvm.internal.Ref$FloatRef r23, androidx.compose.foundation.gestures.ScrollingLogic r24, kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r25, long r26, vc.InterfaceC11588c<? super java.lang.Boolean> r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.dispatchMouseWheelScroll$waitNextScrollDelta(androidx.compose.foundation.gestures.MouseWheelScrollingLogic, kotlin.jvm.internal.Ref$ObjectRef, kotlin.jvm.internal.Ref$FloatRef, androidx.compose.foundation.gestures.ScrollingLogic, kotlin.jvm.internal.Ref$ObjectRef, long, vc.c):java.lang.Object");
    }

    private final boolean isConsumed(PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (changes.get(i10).isConsumed()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: onMouseWheel-O0kMr_c, reason: not valid java name */
    private final boolean m27193onMouseWheelO0kMr_c(PointerEvent pointerEvent, long j10) {
        long jMo27121calculateMouseWheelScroll8xgXZGE = this.mouseWheelScrollConfig.mo27121calculateMouseWheelScroll8xgXZGE(this.density, pointerEvent, j10);
        if (m27192canConsumeDeltaUv8p0NA(this.scrollingLogic, jMo27121calculateMouseWheelScroll8xgXZGE)) {
            return C10002c.m20732j(this.channel.mo33808trySendJP2dKIU(new MouseWheelScrollDelta(jMo27121calculateMouseWheelScroll8xgXZGE, ((PointerInputChange) AbstractC10947g0.m23944m0(pointerEvent.getChanges())).getUptimeMillis(), !this.mouseWheelScrollConfig.isSmoothScrollingEnabled() || this.mouseWheelScrollConfig.isPreciseWheelScroll(pointerEvent), null)));
        }
        return this.isScrolling;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MouseWheelScrollDelta sumOrNull(final InterfaceC10000a interfaceC10000a) {
        MouseWheelScrollDelta mouseWheelScrollDeltaPlus = null;
        for (MouseWheelScrollDelta mouseWheelScrollDelta : untilNull(new InterfaceC9529a() { // from class: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.sumOrNull.1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final MouseWheelScrollDelta invoke() {
                return (MouseWheelScrollDelta) C10002c.m20728f(interfaceC10000a.mo20641j());
            }
        })) {
            mouseWheelScrollDeltaPlus = mouseWheelScrollDeltaPlus == null ? mouseWheelScrollDelta : mouseWheelScrollDeltaPlus.plus(mouseWheelScrollDelta);
        }
        return mouseWheelScrollDeltaPlus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackVelocity(MouseWheelScrollDelta mouseWheelScrollDelta) {
        this.velocityTracker.m27199addDeltaUv8p0NA(mouseWheelScrollDelta.getTimeMillis(), mouseWheelScrollDelta.m27198getValueF1C5BW0());
    }

    private final <E> InterfaceC10659g untilNull(InterfaceC9529a interfaceC9529a) {
        return AbstractC10662j.m22558b(new C13281(interfaceC9529a, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object userScroll(androidx.compose.foundation.gestures.ScrollingLogic r5, p181hd.InterfaceC9544p r6, vc.InterfaceC11588c<? super p309qc.C10786q> r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.MouseWheelScrollingLogic.C13291
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1 r0 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic.C13291) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1 r0 = new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic r5 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic) r5
            kotlin.AbstractC9924b.m20071b(r7)
            goto L4c
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.AbstractC9924b.m20071b(r7)
            r4.isScrolling = r3
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$2 r7 = new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$2
            r2 = 0
            r7.<init>(r5, r6, r2)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = sd.AbstractC11108e2.m24702c(r7, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            r5 = r4
        L4c:
            r6 = 0
            r5.isScrolling = r6
            qc.q r5 = p309qc.C10786q.f26013a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.userScroll(androidx.compose.foundation.gestures.ScrollingLogic, hd.p, vc.c):java.lang.Object");
    }

    /* renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public final void m27194onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j10) {
        if (pointerEventPass == PointerEventPass.Main && PointerEventType.m32053equalsimpl0(pointerEvent.m32046getType7fucELk(), PointerEventType.Companion.m32062getScroll7fucELk())) {
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (changes.get(i10).isConsumed()) {
                    return;
                }
            }
            if (m27193onMouseWheelO0kMr_c(pointerEvent, j10)) {
                consume(pointerEvent);
            }
        }
    }

    public final void startReceivingMouseWheelEvents(InterfaceC11122i0 interfaceC11122i0) {
        if (this.receivingMouseWheelEventsJob == null) {
            this.receivingMouseWheelEventsJob = AbstractC11117h.m24726d(interfaceC11122i0, null, null, new C13261(null), 3, null);
        }
    }

    public final void updateDensity(Density density) {
        this.density = density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float dispatchMouseWheelScroll(NestedScrollScope nestedScrollScope, float f10) {
        ScrollingLogic scrollingLogic = this.scrollingLogic;
        return scrollingLogic.m27247toFloatk4lQ0M(scrollingLogic.m27245reverseIfNeededMKHz9U(nestedScrollScope.mo27201scrollByOzD1aCk(scrollingLogic.m27248toOffsettuRUvjQ(scrollingLogic.reverseIfNeeded(f10)), NestedScrollSource.Companion.m31996getUserInputWNlRxjI())));
    }
}
