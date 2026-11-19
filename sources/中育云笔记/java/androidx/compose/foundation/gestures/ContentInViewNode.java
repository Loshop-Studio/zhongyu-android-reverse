package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.relocation.BringIntoViewResponder;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p014ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p014ui.node.DelegatableNodeKt;
import androidx.compose.p014ui.node.LayoutAwareModifierNode;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.p014ui.unit.IntSizeKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC9924b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.C9997c;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC10045g;
import kotlinx.coroutines.JobKt__JobKt;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11831f;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.AbstractC11147o1;
import sd.InterfaceC11122i0;
import sd.InterfaceC11125j;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ContentInViewNode extends Modifier.Node implements BringIntoViewResponder, LayoutAwareModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    private BringIntoViewSpec bringIntoViewSpec;
    private boolean childWasMaxVisibleBeforeViewportShrunk;
    private LayoutCoordinates focusedChild;
    private boolean isAnimationRunning;
    private Orientation orientation;
    private boolean reverseDirection;
    private final ScrollingLogic scrollingLogic;
    private final boolean shouldAutoInvalidate;
    private boolean trackingFocusedChild;
    private final BringIntoViewRequestPriorityQueue bringIntoViewRequests = new BringIntoViewRequestPriorityQueue();
    private long viewportSize = IntSize.Companion.m33677getZeroYbymL2g();

    @StabilityInferred(parameters = 0)
    public static final class Request {
        public static final int $stable = 8;
        private final InterfaceC11125j continuation;
        private final InterfaceC9529a currentBounds;

        public Request(InterfaceC9529a interfaceC9529a, InterfaceC11125j interfaceC11125j) {
            this.currentBounds = interfaceC9529a;
            this.continuation = interfaceC11125j;
        }

        public final InterfaceC11125j getContinuation() {
            return this.continuation;
        }

        public final InterfaceC9529a getCurrentBounds() {
            return this.currentBounds;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                r4 = this;
                sd.j r0 = r4.continuation
                kotlin.coroutines.d r0 = r0.getContext()
                sd.h0$a r1 = sd.C11118h0.f26782d
                kotlin.coroutines.d$b r0 = r0.get(r1)
                sd.h0 r0 = (sd.C11118h0) r0
                if (r0 == 0) goto L15
                java.lang.String r0 = r0.m24728i()
                goto L16
            L15:
                r0 = 0
            L16:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Request@"
                r1.append(r2)
                int r2 = r4.hashCode()
                r3 = 16
                int r3 = p310qd.AbstractC10788a.m23073a(r3)
                java.lang.String r2 = java.lang.Integer.toString(r2, r3)
                java.lang.String r3 = "toString(...)"
                kotlin.jvm.internal.AbstractC9979u.m20293f(r2, r3)
                r1.append(r2)
                if (r0 == 0) goto L50
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r3 = 91
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = "]("
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                if (r0 != 0) goto L52
            L50:
                java.lang.String r0 = "("
            L52:
                r1.append(r0)
                java.lang.String r0 = "currentBounds()="
                r1.append(r0)
                hd.a r0 = r4.currentBounds
                java.lang.Object r0 = r0.invoke()
                r1.append(r0)
                java.lang.String r0 = ", continuation="
                r1.append(r0)
                sd.j r0 = r4.continuation
                r1.append(r0)
                r0 = 41
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ContentInViewNode.Request.toString():java.lang.String");
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", m26211f = "ContentInViewNode.kt", m26212l = {215}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2 */
    public static final class C12802 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ UpdatableAnimationState $animationState;
        final /* synthetic */ BringIntoViewSpec $bringIntoViewSpec;
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", m26211f = "ContentInViewNode.kt", m26212l = {221}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ InterfaceC10045g $animationJob;
            final /* synthetic */ UpdatableAnimationState $animationState;
            final /* synthetic */ BringIntoViewSpec $bringIntoViewSpec;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ContentInViewNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UpdatableAnimationState updatableAnimationState, ContentInViewNode contentInViewNode, BringIntoViewSpec bringIntoViewSpec, InterfaceC10045g interfaceC10045g, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.$animationState = updatableAnimationState;
                this.this$0 = contentInViewNode;
                this.$bringIntoViewSpec = bringIntoViewSpec;
                this.$animationJob = interfaceC10045g;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$animationState, this.this$0, this.$bringIntoViewSpec, this.$animationJob, interfaceC11588c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(NestedScrollScope nestedScrollScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass1) create(nestedScrollScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.L$0;
                    this.$animationState.setValue(this.this$0.calculateScrollDelta(this.$bringIntoViewSpec));
                    final UpdatableAnimationState updatableAnimationState = this.$animationState;
                    final ContentInViewNode contentInViewNode = this.this$0;
                    final InterfaceC10045g interfaceC10045g = this.$animationJob;
                    InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.ContentInViewNode.launchAnimation.2.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p181hd.InterfaceC9540l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            invoke(((Number) obj2).floatValue());
                            return C10786q.f26013a;
                        }

                        public final void invoke(float f10) {
                            float f11 = contentInViewNode.reverseDirection ? 1.0f : -1.0f;
                            ScrollingLogic scrollingLogic = contentInViewNode.scrollingLogic;
                            float fM27247toFloatk4lQ0M = f11 * scrollingLogic.m27247toFloatk4lQ0M(scrollingLogic.m27245reverseIfNeededMKHz9U(nestedScrollScope.mo27201scrollByOzD1aCk(scrollingLogic.m27245reverseIfNeededMKHz9U(scrollingLogic.m27248toOffsettuRUvjQ(f11 * f10)), NestedScrollSource.Companion.m31996getUserInputWNlRxjI())));
                            if (Math.abs(fM27247toFloatk4lQ0M) < Math.abs(f10)) {
                                JobKt__JobKt.m20389f(interfaceC10045g, "Scroll animation cancelled because scroll was not consumed (" + fM27247toFloatk4lQ0M + " < " + f10 + ')', null, 2, null);
                            }
                        }
                    };
                    final ContentInViewNode contentInViewNode2 = this.this$0;
                    final UpdatableAnimationState updatableAnimationState2 = this.$animationState;
                    final BringIntoViewSpec bringIntoViewSpec = this.$bringIntoViewSpec;
                    InterfaceC9529a interfaceC9529a = new InterfaceC9529a() { // from class: androidx.compose.foundation.gestures.ContentInViewNode.launchAnimation.2.1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p181hd.InterfaceC9529a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m27133invoke();
                            return C10786q.f26013a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m27133invoke() {
                            BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue = contentInViewNode2.bringIntoViewRequests;
                            ContentInViewNode contentInViewNode3 = contentInViewNode2;
                            while (true) {
                                if (bringIntoViewRequestPriorityQueue.requests.getSize() != 0) {
                                    Rect rect = (Rect) ((Request) bringIntoViewRequestPriorityQueue.requests.last()).getCurrentBounds().invoke();
                                    if (!(rect == null ? true : ContentInViewNode.m27130isMaxVisibleO0kMr_c$default(contentInViewNode3, rect, 0L, 1, null))) {
                                        break;
                                    } else {
                                        ((Request) bringIntoViewRequestPriorityQueue.requests.removeAt(bringIntoViewRequestPriorityQueue.requests.getSize() - 1)).getContinuation().resumeWith(Result.m20054c(C10786q.f26013a));
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (contentInViewNode2.trackingFocusedChild) {
                                Rect focusedChildBounds = contentInViewNode2.getFocusedChildBounds();
                                if (focusedChildBounds != null && ContentInViewNode.m27130isMaxVisibleO0kMr_c$default(contentInViewNode2, focusedChildBounds, 0L, 1, null)) {
                                    contentInViewNode2.trackingFocusedChild = false;
                                }
                            }
                            updatableAnimationState2.setValue(contentInViewNode2.calculateScrollDelta(bringIntoViewSpec));
                        }
                    };
                    this.label = 1;
                    if (updatableAnimationState.animateToZero(interfaceC9540l, interfaceC9529a, this) == objM25952f) {
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
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12802(UpdatableAnimationState updatableAnimationState, BringIntoViewSpec bringIntoViewSpec, InterfaceC11588c<? super C12802> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$animationState = updatableAnimationState;
            this.$bringIntoViewSpec = bringIntoViewSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C12802 c12802 = ContentInViewNode.this.new C12802(this.$animationState, this.$bringIntoViewSpec, interfaceC11588c);
            c12802.L$0 = obj;
            return c12802;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            try {
                try {
                    if (i10 == 0) {
                        AbstractC9924b.m20071b(obj);
                        InterfaceC10045g interfaceC10045gM24777k = AbstractC11147o1.m24777k(((InterfaceC11122i0) this.L$0).getCoroutineContext());
                        ContentInViewNode.this.isAnimationRunning = true;
                        ScrollingLogic scrollingLogic = ContentInViewNode.this.scrollingLogic;
                        MutatePriority mutatePriority = MutatePriority.Default;
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$animationState, ContentInViewNode.this, this.$bringIntoViewSpec, interfaceC10045gM24777k, null);
                        this.label = 1;
                        if (scrollingLogic.scroll(mutatePriority, anonymousClass1, this) == objM25952f) {
                            return objM25952f;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9924b.m20071b(obj);
                    }
                    ContentInViewNode.this.bringIntoViewRequests.resumeAndRemoveAll();
                    ContentInViewNode.this.isAnimationRunning = false;
                    ContentInViewNode.this.bringIntoViewRequests.cancelAndRemoveAll(null);
                    ContentInViewNode.this.trackingFocusedChild = false;
                    return C10786q.f26013a;
                } catch (CancellationException e10) {
                    throw e10;
                }
            } catch (Throwable th) {
                ContentInViewNode.this.isAnimationRunning = false;
                ContentInViewNode.this.bringIntoViewRequests.cancelAndRemoveAll(null);
                ContentInViewNode.this.trackingFocusedChild = false;
                throw th;
            }
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C12802) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public ContentInViewNode(Orientation orientation, ScrollingLogic scrollingLogic, boolean z10, BringIntoViewSpec bringIntoViewSpec) {
        this.orientation = orientation;
        this.scrollingLogic = scrollingLogic;
        this.reverseDirection = z10;
        this.bringIntoViewSpec = bringIntoViewSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float calculateScrollDelta(BringIntoViewSpec bringIntoViewSpec) {
        if (IntSize.m33670equalsimpl0(this.viewportSize, IntSize.Companion.m33677getZeroYbymL2g())) {
            return 0.0f;
        }
        Rect rectFindBringIntoViewRequest = findBringIntoViewRequest();
        if (rectFindBringIntoViewRequest == null) {
            rectFindBringIntoViewRequest = this.trackingFocusedChild ? getFocusedChildBounds() : null;
            if (rectFindBringIntoViewRequest == null) {
                return 0.0f;
            }
        }
        long jM33684toSizeozmzZPI = IntSizeKt.m33684toSizeozmzZPI(this.viewportSize);
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i10 == 1) {
            return bringIntoViewSpec.calculateScrollDistance(rectFindBringIntoViewRequest.getTop(), rectFindBringIntoViewRequest.getBottom() - rectFindBringIntoViewRequest.getTop(), Float.intBitsToFloat((int) (jM33684toSizeozmzZPI & 4294967295L)));
        }
        if (i10 == 2) {
            return bringIntoViewSpec.calculateScrollDistance(rectFindBringIntoViewRequest.getLeft(), rectFindBringIntoViewRequest.getRight() - rectFindBringIntoViewRequest.getLeft(), Float.intBitsToFloat((int) (jM33684toSizeozmzZPI >> 32)));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: compareTo-TemP2vQ, reason: not valid java name */
    private final int m27126compareToTemP2vQ(long j10, long j11) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i10 == 1) {
            return AbstractC9979u.m20296i((int) (j10 & 4294967295L), (int) (j11 & 4294967295L));
        }
        if (i10 == 2) {
            return AbstractC9979u.m20296i((int) (j10 >> 32), (int) (j11 >> 32));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: compareTo-iLBOSCw, reason: not valid java name */
    private final int m27127compareToiLBOSCw(long j10, long j11) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i10 == 1) {
            return Float.compare(Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
        }
        if (i10 == 2) {
            return Float.compare(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 >> 32)));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: computeDestination-O0kMr_c, reason: not valid java name */
    private final Rect m27128computeDestinationO0kMr_c(Rect rect, long j10) {
        return rect.m30674translatek4lQ0M(Offset.m30629constructorimpl(m27131relocationOffsetBMxPBkI(rect, j10) ^ (-9223372034707292160L)));
    }

    private final Rect findBringIntoViewRequest() {
        MutableVector mutableVector = this.bringIntoViewRequests.requests;
        int size = mutableVector.getSize() - 1;
        Object[] objArr = mutableVector.content;
        Rect rect = null;
        if (size < objArr.length) {
            while (size >= 0) {
                Rect rect2 = (Rect) ((Request) objArr[size]).getCurrentBounds().invoke();
                if (rect2 != null) {
                    if (m27127compareToiLBOSCw(rect2.m30670getSizeNHjbRc(), IntSizeKt.m33684toSizeozmzZPI(this.viewportSize)) > 0) {
                        return rect == null ? rect2 : rect;
                    }
                    rect = rect2;
                }
                size--;
            }
        }
        return rect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect getFocusedChildBounds() {
        if (!isAttached()) {
            return null;
        }
        LayoutCoordinates layoutCoordinatesRequireLayoutCoordinates = DelegatableNodeKt.requireLayoutCoordinates(this);
        LayoutCoordinates layoutCoordinates = this.focusedChild;
        if (layoutCoordinates != null) {
            if (!layoutCoordinates.isAttached()) {
                layoutCoordinates = null;
            }
            if (layoutCoordinates != null) {
                return layoutCoordinatesRequireLayoutCoordinates.localBoundingBoxOf(layoutCoordinates, false);
            }
        }
        return null;
    }

    /* renamed from: isMaxVisible-O0kMr_c, reason: not valid java name */
    private final boolean m27129isMaxVisibleO0kMr_c(Rect rect, long j10) {
        long jM27131relocationOffsetBMxPBkI = m27131relocationOffsetBMxPBkI(rect, j10);
        return Math.abs(Float.intBitsToFloat((int) (jM27131relocationOffsetBMxPBkI >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jM27131relocationOffsetBMxPBkI & 4294967295L))) <= 0.5f;
    }

    /* renamed from: isMaxVisible-O0kMr_c$default, reason: not valid java name */
    public static /* synthetic */ boolean m27130isMaxVisibleO0kMr_c$default(ContentInViewNode contentInViewNode, Rect rect, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = contentInViewNode.viewportSize;
        }
        return contentInViewNode.m27129isMaxVisibleO0kMr_c(rect, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchAnimation() {
        BringIntoViewSpec bringIntoViewSpecRequireBringIntoViewSpec = requireBringIntoViewSpec();
        if (this.isAnimationRunning) {
            InlineClassHelperKt.throwIllegalStateException("launchAnimation called when previous animation was running");
        }
        AbstractC11117h.m24726d(getCoroutineScope(), null, CoroutineStart.f23479f, new C12802(new UpdatableAnimationState(BringIntoViewSpec.Companion.getDefaultScrollAnimationSpec$foundation_release()), bringIntoViewSpecRequireBringIntoViewSpec, null), 1, null);
    }

    /* renamed from: relocationOffset-BMxPBkI, reason: not valid java name */
    private final long m27131relocationOffsetBMxPBkI(Rect rect, long j10) {
        long jM33684toSizeozmzZPI = IntSizeKt.m33684toSizeozmzZPI(j10);
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return Offset.m30629constructorimpl((Float.floatToRawIntBits(requireBringIntoViewSpec().calculateScrollDistance(rect.getLeft(), rect.getRight() - rect.getLeft(), Float.intBitsToFloat((int) (jM33684toSizeozmzZPI >> 32)))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        }
        float fCalculateScrollDistance = requireBringIntoViewSpec().calculateScrollDistance(rect.getTop(), rect.getBottom() - rect.getTop(), Float.intBitsToFloat((int) (jM33684toSizeozmzZPI & 4294967295L)));
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fCalculateScrollDistance) & 4294967295L));
    }

    private final BringIntoViewSpec requireBringIntoViewSpec() {
        BringIntoViewSpec bringIntoViewSpec = this.bringIntoViewSpec;
        return bringIntoViewSpec == null ? (BringIntoViewSpec) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, BringIntoViewSpec_androidKt.getLocalBringIntoViewSpec()) : bringIntoViewSpec;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public Object bringChildIntoView(InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Rect rect = (Rect) interfaceC9529a.invoke();
        if (rect == null || m27130isMaxVisibleO0kMr_c$default(this, rect, 0L, 1, null)) {
            return C10786q.f26013a;
        }
        C9997c c9997c = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c), 1);
        c9997c.m20503F();
        if (this.bringIntoViewRequests.enqueue(new Request(interfaceC9529a, c9997c)) && !this.isAnimationRunning) {
            launchAnimation();
        }
        Object objM20538x = c9997c.m20538x();
        if (objM20538x == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM20538x == AbstractC11725a.m25952f() ? objM20538x : C10786q.f26013a;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public Rect calculateRectForParent(Rect rect) {
        if (IntSize.m33670equalsimpl0(this.viewportSize, IntSize.Companion.m33677getZeroYbymL2g())) {
            InlineClassHelperKt.throwIllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        return m27128computeDestinationO0kMr_c(rect, this.viewportSize);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    /* renamed from: getViewportSize-YbymL2g$foundation_release, reason: not valid java name */
    public final long m27132getViewportSizeYbymL2g$foundation_release() {
        return this.viewportSize;
    }

    public final void onFocusBoundsChanged(LayoutCoordinates layoutCoordinates) {
        Rect focusedChildBounds;
        this.focusedChild = layoutCoordinates;
        if (this.childWasMaxVisibleBeforeViewportShrunk && (focusedChildBounds = getFocusedChildBounds()) != null && !m27129isMaxVisibleO0kMr_c(focusedChildBounds, this.viewportSize)) {
            this.trackingFocusedChild = true;
            launchAnimation();
        }
        this.childWasMaxVisibleBeforeViewportShrunk = false;
    }

    @Override // androidx.compose.p014ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo27087onRemeasuredozmzZPI(long j10) {
        Rect focusedChildBounds;
        long j11 = this.viewportSize;
        this.viewportSize = j10;
        if (m27126compareToTemP2vQ(j10, j11) >= 0 || this.isAnimationRunning || this.trackingFocusedChild || (focusedChildBounds = getFocusedChildBounds()) == null || !m27129isMaxVisibleO0kMr_c(focusedChildBounds, j11)) {
            return;
        }
        this.childWasMaxVisibleBeforeViewportShrunk = true;
    }

    public final void update(Orientation orientation, boolean z10, BringIntoViewSpec bringIntoViewSpec) {
        this.orientation = orientation;
        this.reverseDirection = z10;
        this.bringIntoViewSpec = bringIntoViewSpec;
    }
}
