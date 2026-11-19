package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p013ui.input.pointer.PointerEvent;
import androidx.compose.p013ui.input.pointer.PointerEventPass;
import androidx.compose.p013ui.input.pointer.PointerEventType;
import androidx.compose.p013ui.input.pointer.PointerInputChange;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.tencent.smtt.sdk.TbsListener;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC9165e;
import kotlinx.coroutines.InterfaceC9212n;
import kotlinx.coroutines.channels.AbstractC9159b;
import kotlinx.coroutines.channels.C9160c;
import kotlinx.coroutines.channels.InterfaceC9158a;
import p101f8.AbstractC8471i;
import p101f8.AbstractC8472j;
import p101f8.InterfaceC8469g;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class MouseWheelScrollingLogic {
    public static final int $stable = 8;
    private Density density;
    private boolean isScrolling;
    private final ScrollConfig mouseWheelScrollConfig;
    private final InterfaceC10574p onScrollStopped;
    private InterfaceC9212n receivingMouseWheelEventsJob;
    private final ScrollingLogic scrollingLogic;
    private final InterfaceC9158a channel = AbstractC9159b.m16529b(Integer.MAX_VALUE, null, null, 6, null);
    private final MouseWheelVelocityTracker velocityTracker = new MouseWheelVelocityTracker();

    public static final class MouseWheelScrollDelta {
        private final boolean shouldApplyImmediately;
        private final long timeMillis;
        private final long value;

        public /* synthetic */ MouseWheelScrollDelta(long j10, long j11, boolean z10, AbstractC9126n abstractC9126n) {
            this(j10, j11, z10);
        }

        /* renamed from: copy-9KIMszo$default, reason: not valid java name */
        public static /* synthetic */ MouseWheelScrollDelta m20593copy9KIMszo$default(MouseWheelScrollDelta mouseWheelScrollDelta, long j10, long j11, boolean z10, int i10, Object obj) {
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
            return mouseWheelScrollDelta.m20595copy9KIMszo(j12, j13, z10);
        }

        /* renamed from: component1-F1C5BW0, reason: not valid java name */
        public final long m20594component1F1C5BW0() {
            return this.value;
        }

        public final long component2() {
            return this.timeMillis;
        }

        public final boolean component3() {
            return this.shouldApplyImmediately;
        }

        /* renamed from: copy-9KIMszo, reason: not valid java name */
        public final MouseWheelScrollDelta m20595copy9KIMszo(long j10, long j11, boolean z10) {
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
            return Offset.m24032equalsimpl0(this.value, mouseWheelScrollDelta.value) && this.timeMillis == mouseWheelScrollDelta.timeMillis && this.shouldApplyImmediately == mouseWheelScrollDelta.shouldApplyImmediately;
        }

        public final boolean getShouldApplyImmediately() {
            return this.shouldApplyImmediately;
        }

        public final long getTimeMillis() {
            return this.timeMillis;
        }

        /* renamed from: getValue-F1C5BW0, reason: not valid java name */
        public final long m20596getValueF1C5BW0() {
            return this.value;
        }

        public int hashCode() {
            return (((Offset.m24037hashCodeimpl(this.value) * 31) + Long.hashCode(this.timeMillis)) * 31) + Boolean.hashCode(this.shouldApplyImmediately);
        }

        public final MouseWheelScrollDelta plus(MouseWheelScrollDelta mouseWheelScrollDelta) {
            return new MouseWheelScrollDelta(Offset.m24040plusMKHz9U(this.value, mouseWheelScrollDelta.value), Math.max(this.timeMillis, mouseWheelScrollDelta.timeMillis), this.shouldApplyImmediately, null);
        }

        public String toString() {
            return "MouseWheelScrollDelta(value=" + ((Object) Offset.m24043toStringimpl(this.value)) + ", timeMillis=" + this.timeMillis + ", shouldApplyImmediately=" + this.shouldApplyImmediately + ')';
        }

        private MouseWheelScrollDelta(long j10, long j11, boolean z10) {
            this.value = j10;
            this.timeMillis = j11;
            this.shouldApplyImmediately = z10;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2", m17801f = "MouseWheelScrollable.kt", m17802l = {170}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2 */
    public static final class C12902 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC9158a $this_busyReceive;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12902(InterfaceC9158a interfaceC9158a, InterfaceC9324c<? super C12902> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$this_busyReceive = interfaceC9158a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C12902 c12902 = new C12902(this.$this_busyReceive, interfaceC9324c);
            c12902.L$0 = obj;
            return c12902;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super MouseWheelScrollDelta> interfaceC9324c) {
            return ((C12902) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.n] */
        /* JADX WARN: Type inference failed for: r1v3, types: [kotlinx.coroutines.n] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            ?? r12 = this.label;
            try {
                if (r12 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC9212n interfaceC9212nM14861d = AbstractC8839h.m14861d((InterfaceC8822b0) this.L$0, null, null, new MouseWheelScrollingLogic$busyReceive$2$job$1(null), 3, null);
                    InterfaceC9158a interfaceC9158a = this.$this_busyReceive;
                    this.L$0 = interfaceC9212nM14861d;
                    this.label = 1;
                    obj = interfaceC9158a.mo15876f(this);
                    r12 = interfaceC9212nM14861d;
                    if (obj == objM17291f) {
                        return objM17291f;
                    }
                } else {
                    if (r12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    InterfaceC9212n interfaceC9212n = (InterfaceC9212n) this.L$0;
                    AbstractC9079b.m15926b(obj);
                    r12 = interfaceC9212n;
                }
                MouseWheelScrollDelta mouseWheelScrollDelta = (MouseWheelScrollDelta) obj;
                InterfaceC9212n.a.m16777a(r12, null, 1, null);
                return mouseWheelScrollDelta;
            } catch (Throwable th) {
                InterfaceC9212n.a.m16777a(r12, null, 1, null);
                throw th;
            }
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", m17801f = "MouseWheelScrollable.kt", m17802l = {IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 295}, m17803m = "dispatchMouseWheelScroll")
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 */
    public static final class C12921 extends ContinuationImpl {
        float F$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C12921(InterfaceC9324c<? super C12921> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MouseWheelScrollingLogic.this.dispatchMouseWheelScroll(null, null, 0.0f, 0.0f, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3", m17801f = "MouseWheelScrollable.kt", m17802l = {253, 266, 283}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 */
    public static final class C12933 extends SuspendLambda implements InterfaceC10574p {
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
        public C12933(Ref$FloatRef ref$FloatRef, Ref$ObjectRef<AnimationState<Float, AnimationVector1D>> ref$ObjectRef, Ref$ObjectRef<MouseWheelScrollDelta> ref$ObjectRef2, float f10, MouseWheelScrollingLogic mouseWheelScrollingLogic, float f11, ScrollingLogic scrollingLogic, InterfaceC9324c<? super C12933> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$targetValue = ref$FloatRef;
            this.$animationState = ref$ObjectRef;
            this.$targetScrollDelta = ref$ObjectRef2;
            this.$threshold = f10;
            this.this$0 = mouseWheelScrollingLogic;
            this.$speed = f11;
            this.$this_dispatchMouseWheelScroll = scrollingLogic;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C12933 c12933 = new C12933(this.$targetValue, this.$animationState, this.$targetScrollDelta, this.$threshold, this.this$0, this.$speed, this.$this_dispatchMouseWheelScroll, interfaceC9324c);
            c12933.L$0 = obj;
            return c12933;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(NestedScrollScope nestedScrollScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C12933) create(nestedScrollScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.C12933.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1", m17801f = "MouseWheelScrollable.kt", m17802l = {TbsListener.ErrorCode.UNKNOWN_ERROR, 110}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 */
    public static final class C12961 extends SuspendLambda implements InterfaceC10574p {
        private /* synthetic */ Object L$0;
        int label;

        public C12961(InterfaceC9324c<? super C12961> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C12961 c12961 = MouseWheelScrollingLogic.this.new C12961(interfaceC9324c);
            c12961.L$0 = obj;
            return c12961;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C12961) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                int r1 = r12.label
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2e
                if (r1 == r4) goto L26
                if (r1 != r3) goto L1e
                java.lang.Object r1 = r12.L$0
                i8.b0 r1 = (p135i8.InterfaceC8822b0) r1
                kotlin.AbstractC9079b.m15926b(r13)     // Catch: java.lang.Throwable -> L19
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
                i8.b0 r1 = (p135i8.InterfaceC8822b0) r1
                kotlin.AbstractC9079b.m15926b(r13)     // Catch: java.lang.Throwable -> L19
                goto L54
            L2e:
                kotlin.AbstractC9079b.m15926b(r13)
                java.lang.Object r13 = r12.L$0
                i8.b0 r13 = (p135i8.InterfaceC8822b0) r13
            L35:
                kotlin.coroutines.d r1 = r13.getCoroutineContext()     // Catch: java.lang.Throwable -> L88
                boolean r1 = p135i8.AbstractC8823b1.m14819o(r1)     // Catch: java.lang.Throwable -> L88
                if (r1 == 0) goto L8b
                androidx.compose.foundation.gestures.MouseWheelScrollingLogic r1 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.this     // Catch: java.lang.Throwable -> L88
                kotlinx.coroutines.channels.a r1 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.access$getChannel$p(r1)     // Catch: java.lang.Throwable -> L88
                r12.L$0 = r13     // Catch: java.lang.Throwable -> L88
                r12.label = r4     // Catch: java.lang.Throwable -> L88
                java.lang.Object r1 = r1.mo15876f(r12)     // Catch: java.lang.Throwable -> L88
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
                float r8 = r13.mo20497toPx0680j_4(r5)     // Catch: java.lang.Throwable -> L88
                androidx.compose.foundation.gestures.MouseWheelScrollingLogic r13 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.this     // Catch: java.lang.Throwable -> L88
                androidx.compose.ui.unit.Density r13 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.access$getDensity$p(r13)     // Catch: java.lang.Throwable -> L88
                float r5 = androidx.compose.foundation.gestures.MouseWheelScrollableKt.access$getAnimationSpeed$p()     // Catch: java.lang.Throwable -> L88
                float r9 = r13.mo20497toPx0680j_4(r5)     // Catch: java.lang.Throwable -> L88
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
                h7.p r13 = p123h7.C8736p.f16368a
                return r13
            L94:
                androidx.compose.foundation.gestures.MouseWheelScrollingLogic r0 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.this
                androidx.compose.foundation.gestures.MouseWheelScrollingLogic.access$setReceivingMouseWheelEventsJob$p(r0, r2)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.C12961.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$untilNull$1", m17801f = "MouseWheelScrollable.kt", m17802l = {179}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$untilNull$1 */
    public static final class C12981 extends RestrictedSuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10559a $builderAction;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12981(InterfaceC10559a interfaceC10559a, InterfaceC9324c<? super C12981> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$builderAction = interfaceC10559a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C12981 c12981 = new C12981(this.$builderAction, interfaceC9324c);
            c12981.L$0 = obj;
            return c12981;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(AbstractC8471i abstractC8471i, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C12981) create(abstractC8471i, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r1 = r4.L$1
                java.lang.Object r3 = r4.L$0
                f8.i r3 = (p101f8.AbstractC8471i) r3
                kotlin.AbstractC9079b.m15926b(r5)
                goto L3b
            L15:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1d:
                kotlin.AbstractC9079b.m15926b(r5)
                java.lang.Object r5 = r4.L$0
                f8.i r5 = (p101f8.AbstractC8471i) r5
                r3 = r5
            L25:
                x7.a r5 = r4.$builderAction
                java.lang.Object r1 = r5.invoke()
                if (r1 == 0) goto L3a
                r4.L$0 = r3
                r4.L$1 = r1
                r4.label = r2
                java.lang.Object r5 = r3.mo13820a(r1, r4)
                if (r5 != r0) goto L3b
                return r0
            L3a:
                r1 = 0
            L3b:
                if (r1 != 0) goto L25
                h7.p r5 = p123h7.C8736p.f16368a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.C12981.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", m17801f = "MouseWheelScrollable.kt", m17802l = {122}, m17803m = "userScroll")
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1 */
    public static final class C12991 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12991(InterfaceC9324c<? super C12991> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MouseWheelScrollingLogic.this.userScroll(null, null, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$2", m17801f = "MouseWheelScrollable.kt", m17802l = {122}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$2 */
    public static final class C13002 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10574p $block;
        final /* synthetic */ ScrollingLogic $this_userScroll;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13002(ScrollingLogic scrollingLogic, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C13002> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$this_userScroll = scrollingLogic;
            this.$block = interfaceC10574p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C13002(this.$this_userScroll, this.$block, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C13002) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                ScrollingLogic scrollingLogic = this.$this_userScroll;
                MutatePriority mutatePriority = MutatePriority.UserInput;
                InterfaceC10574p interfaceC10574p = this.$block;
                this.label = 1;
                if (scrollingLogic.scroll(mutatePriority, interfaceC10574p, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    public MouseWheelScrollingLogic(ScrollingLogic scrollingLogic, ScrollConfig scrollConfig, InterfaceC10574p interfaceC10574p, Density density) {
        this.scrollingLogic = scrollingLogic;
        this.mouseWheelScrollConfig = scrollConfig;
        this.onScrollStopped = interfaceC10574p;
        this.density = density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateMouseWheelScroll(final NestedScrollScope nestedScrollScope, AnimationState<Float, AnimationVector1D> animationState, float f10, int i10, final InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super C8736p> interfaceC9324c) throws Throwable {
        final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        ref$FloatRef.f17470a = animationState.getValue().floatValue();
        Object objAnimateTo = SuspendAnimationKt.animateTo(animationState, AbstractC9536a.m17797b(f10), AnimationSpecKt.tween$default(i10, 0, EasingKt.getLinearEasing(), 2, null), true, new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.animateMouseWheelScroll.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AnimationScope<Float, AnimationVector1D>) obj);
                return C8736p.f16368a;
            }

            public final void invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                float fFloatValue = animationScope.getValue().floatValue() - ref$FloatRef.f17470a;
                if (!MouseWheelScrollableKt.isLowScrollingDelta(fFloatValue)) {
                    if (!MouseWheelScrollableKt.isLowScrollingDelta(fFloatValue - this.dispatchMouseWheelScroll(nestedScrollScope, fFloatValue))) {
                        animationScope.cancelAnimation();
                        return;
                    } else {
                        ref$FloatRef.f17470a += fFloatValue;
                    }
                }
                if (((Boolean) interfaceC10570l.invoke(Float.valueOf(ref$FloatRef.f17470a))).booleanValue()) {
                    animationScope.cancelAnimation();
                }
            }
        }, interfaceC9324c);
        return objAnimateTo == AbstractC9434a.m17291f() ? objAnimateTo : C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object busyReceive(InterfaceC9158a interfaceC9158a, InterfaceC9324c<? super MouseWheelScrollDelta> interfaceC9324c) {
        return AbstractC9165e.m16556e(new C12902(interfaceC9158a, null), interfaceC9324c);
    }

    /* renamed from: canConsumeDelta-Uv8p0NA, reason: not valid java name */
    private final boolean m20590canConsumeDeltaUv8p0NA(ScrollingLogic scrollingLogic, long j10) {
        float fM20645toFloatk4lQ0M = scrollingLogic.m20645toFloatk4lQ0M(scrollingLogic.m20643reverseIfNeededMKHz9U(j10));
        if (fM20645toFloatk4lQ0M == 0.0f) {
            return false;
        }
        return fM20645toFloatk4lQ0M > 0.0f ? scrollingLogic.getScrollableState().getCanScrollForward() : scrollingLogic.getScrollableState().getCanScrollBackward();
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
    public final java.lang.Object dispatchMouseWheelScroll(androidx.compose.foundation.gestures.ScrollingLogic r23, androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta r24, float r25, float r26, p179m7.InterfaceC9324c<? super p123h7.C8736p> r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.dispatchMouseWheelScroll(androidx.compose.foundation.gestures.ScrollingLogic, androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta, float, float, m7.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object dispatchMouseWheelScroll$waitNextScrollDelta(androidx.compose.foundation.gestures.MouseWheelScrollingLogic r21, kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta> r22, kotlin.jvm.internal.Ref$FloatRef r23, androidx.compose.foundation.gestures.ScrollingLogic r24, kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r25, long r26, p179m7.InterfaceC9324c<? super java.lang.Boolean> r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.dispatchMouseWheelScroll$waitNextScrollDelta(androidx.compose.foundation.gestures.MouseWheelScrollingLogic, kotlin.jvm.internal.Ref$ObjectRef, kotlin.jvm.internal.Ref$FloatRef, androidx.compose.foundation.gestures.ScrollingLogic, kotlin.jvm.internal.Ref$ObjectRef, long, m7.c):java.lang.Object");
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
    private final boolean m20591onMouseWheelO0kMr_c(PointerEvent pointerEvent, long j10) {
        long jMo20519calculateMouseWheelScroll8xgXZGE = this.mouseWheelScrollConfig.mo20519calculateMouseWheelScroll8xgXZGE(this.density, pointerEvent, j10);
        if (m20590canConsumeDeltaUv8p0NA(this.scrollingLogic, jMo20519calculateMouseWheelScroll8xgXZGE)) {
            return C9160c.m16539j(this.channel.mo27213trySendJP2dKIU(new MouseWheelScrollDelta(jMo20519calculateMouseWheelScroll8xgXZGE, ((PointerInputChange) AbstractC8778f0.m14566l0(pointerEvent.getChanges())).getUptimeMillis(), !this.mouseWheelScrollConfig.isSmoothScrollingEnabled() || this.mouseWheelScrollConfig.isPreciseWheelScroll(pointerEvent), null)));
        }
        return this.isScrolling;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MouseWheelScrollDelta sumOrNull(final InterfaceC9158a interfaceC9158a) {
        MouseWheelScrollDelta mouseWheelScrollDeltaPlus = null;
        for (MouseWheelScrollDelta mouseWheelScrollDelta : untilNull(new InterfaceC10559a() { // from class: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.sumOrNull.1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final MouseWheelScrollDelta invoke() {
                return (MouseWheelScrollDelta) C9160c.m16535f(interfaceC9158a.mo15878o());
            }
        })) {
            mouseWheelScrollDeltaPlus = mouseWheelScrollDeltaPlus == null ? mouseWheelScrollDelta : mouseWheelScrollDeltaPlus.plus(mouseWheelScrollDelta);
        }
        return mouseWheelScrollDeltaPlus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackVelocity(MouseWheelScrollDelta mouseWheelScrollDelta) {
        this.velocityTracker.m20597addDeltaUv8p0NA(mouseWheelScrollDelta.getTimeMillis(), mouseWheelScrollDelta.m20596getValueF1C5BW0());
    }

    private final <E> InterfaceC8469g untilNull(InterfaceC10559a interfaceC10559a) {
        return AbstractC8472j.m13827b(new C12981(interfaceC10559a, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object userScroll(androidx.compose.foundation.gestures.ScrollingLogic r5, p300x7.InterfaceC10574p r6, p179m7.InterfaceC9324c<? super p123h7.C8736p> r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.MouseWheelScrollingLogic.C12991
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1 r0 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic.C12991) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic r5 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic) r5
            kotlin.AbstractC9079b.m15926b(r7)
            goto L4c
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.AbstractC9079b.m15926b(r7)
            r4.isScrolling = r3
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$2 r7 = new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$2
            r2 = 0
            r7.<init>(r5, r6, r2)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = p135i8.AbstractC8874s1.m14911c(r7, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            r5 = r4
        L4c:
            r6 = 0
            r5.isScrolling = r6
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.userScroll(androidx.compose.foundation.gestures.ScrollingLogic, x7.p, m7.c):java.lang.Object");
    }

    /* renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public final void m20592onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j10) {
        if (pointerEventPass == PointerEventPass.Main && PointerEventType.m25451equalsimpl0(pointerEvent.m25444getType7fucELk(), PointerEventType.Companion.m25460getScroll7fucELk())) {
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (changes.get(i10).isConsumed()) {
                    return;
                }
            }
            if (m20591onMouseWheelO0kMr_c(pointerEvent, j10)) {
                consume(pointerEvent);
            }
        }
    }

    public final void startReceivingMouseWheelEvents(InterfaceC8822b0 interfaceC8822b0) {
        if (this.receivingMouseWheelEventsJob == null) {
            this.receivingMouseWheelEventsJob = AbstractC8839h.m14861d(interfaceC8822b0, null, null, new C12961(null), 3, null);
        }
    }

    public final void updateDensity(Density density) {
        this.density = density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float dispatchMouseWheelScroll(NestedScrollScope nestedScrollScope, float f10) {
        ScrollingLogic scrollingLogic = this.scrollingLogic;
        return scrollingLogic.m20645toFloatk4lQ0M(scrollingLogic.m20643reverseIfNeededMKHz9U(nestedScrollScope.mo20599scrollByOzD1aCk(scrollingLogic.m20646toOffsettuRUvjQ(scrollingLogic.reverseIfNeeded(f10)), NestedScrollSource.Companion.m25394getUserInputWNlRxjI())));
    }
}
