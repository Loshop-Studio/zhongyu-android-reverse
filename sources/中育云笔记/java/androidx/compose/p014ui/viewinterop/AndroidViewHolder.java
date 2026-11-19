package androidx.compose.p014ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.compose.p014ui.ComposeUiFlags;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.draw.DrawModifierKt;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p014ui.graphics.Canvas;
import androidx.compose.p014ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p014ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.p014ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.layout.IntrinsicMeasurable;
import androidx.compose.p014ui.layout.IntrinsicMeasureScope;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.layout.LayoutCoordinatesKt;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.LayoutNode;
import androidx.compose.p014ui.node.NodeCoordinator;
import androidx.compose.p014ui.node.Owner;
import androidx.compose.p014ui.node.OwnerScope;
import androidx.compose.p014ui.node.OwnerSnapshotObserver;
import androidx.compose.p014ui.platform.AndroidComposeView;
import androidx.compose.p014ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.p014ui.platform.WindowRecomposer_androidKt;
import androidx.compose.p014ui.semantics.SemanticsModifierKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.DensityKt;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.IntOffsetKt;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.p014ui.unit.VelocityKt;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.graphics.Insets;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9546r;
import p265nd.AbstractC10410o;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public class AndroidViewHolder extends ViewGroup implements NestedScrollingParent3, ComposeNodeLifecycleCallback, OwnerScope, OnApplyWindowInsetsListener {
    private final int compositeKeyHash;
    private Density density;
    private final NestedScrollDispatcher dispatcher;
    private boolean hasUpdateBlock;
    private WindowInsetsCompat insets;
    private boolean isDrawing;
    private int lastHeightMeasureSpec;
    private int lastWidthMeasureSpec;
    private final LayoutNode layoutNode;
    private LifecycleOwner lifecycleOwner;
    private final int[] location;
    private Modifier modifier;
    private final NestedScrollingParentHelper nestedScrollingParentHelper;
    private InterfaceC9540l onDensityChanged;
    private InterfaceC9540l onModifierChanged;
    private InterfaceC9540l onRequestDisallowInterceptTouchEvent;
    private final Owner owner;
    private final int[] position;
    private InterfaceC9529a release;
    private InterfaceC9529a reset;
    private final InterfaceC9529a runInvalidate;
    private final InterfaceC9529a runUpdate;
    private SavedStateRegistryOwner savedStateRegistryOwner;
    private long size;
    private InterfaceC9529a update;
    private final View view;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC9540l OnCommitAffectingUpdate = AndroidViewHolder$Companion$OnCommitAffectingUpdate$1.INSTANCE;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", m26211f = "AndroidViewHolder.android.kt", m26212l = {639, 641}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1 */
    public static final class C31961 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ boolean $consumed;
        final /* synthetic */ long $viewVelocity;
        int label;
        final /* synthetic */ AndroidViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31961(boolean z10, AndroidViewHolder androidViewHolder, long j10, InterfaceC11588c<? super C31961> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$consumed = z10;
            this.this$0 = androidViewHolder;
            this.$viewVelocity = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C31961(this.$consumed, this.this$0, this.$viewVelocity, interfaceC11588c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            if (r4.m31977dispatchPostFlingRZ2iAVY(r5, r7, r10) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
        
            if (r1.m31977dispatchPostFlingRZ2iAVY(r2, r4, r10) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                int r1 = r10.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.AbstractC9924b.m20071b(r11)
                goto L58
            L12:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1a:
                kotlin.AbstractC9924b.m20071b(r11)
                r6 = r10
                goto L58
            L1f:
                kotlin.AbstractC9924b.m20071b(r11)
                boolean r11 = r10.$consumed
                if (r11 != 0) goto L3f
                androidx.compose.ui.viewinterop.AndroidViewHolder r11 = r10.this$0
                androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r4 = androidx.compose.p014ui.viewinterop.AndroidViewHolder.access$getDispatcher$p(r11)
                androidx.compose.ui.unit.Velocity$Companion r11 = androidx.compose.p014ui.unit.Velocity.Companion
                long r5 = r11.m33750getZero9UxMQ8M()
                long r7 = r10.$viewVelocity
                r10.label = r3
                r9 = r10
                java.lang.Object r11 = r4.m31977dispatchPostFlingRZ2iAVY(r5, r7, r9)
                r6 = r9
                if (r11 != r0) goto L58
                goto L57
            L3f:
                r6 = r10
                androidx.compose.ui.viewinterop.AndroidViewHolder r11 = r6.this$0
                androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r1 = androidx.compose.p014ui.viewinterop.AndroidViewHolder.access$getDispatcher$p(r11)
                r11 = r2
                long r2 = r6.$viewVelocity
                androidx.compose.ui.unit.Velocity$Companion r4 = androidx.compose.p014ui.unit.Velocity.Companion
                long r4 = r4.m33750getZero9UxMQ8M()
                r6.label = r11
                java.lang.Object r11 = r1.m31977dispatchPostFlingRZ2iAVY(r2, r4, r6)
                if (r11 != r0) goto L58
            L57:
                return r0
            L58:
                qc.q r11 = p309qc.C10786q.f26013a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.viewinterop.AndroidViewHolder.C31961.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C31961) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", m26211f = "AndroidViewHolder.android.kt", m26212l = {650}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1 */
    public static final class C31971 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ long $toBeConsumed;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31971(long j10, InterfaceC11588c<? super C31971> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$toBeConsumed = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return AndroidViewHolder.this.new C31971(this.$toBeConsumed, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                NestedScrollDispatcher nestedScrollDispatcher = AndroidViewHolder.this.dispatcher;
                long j10 = this.$toBeConsumed;
                this.label = 1;
                if (nestedScrollDispatcher.m31979dispatchPreFlingQWom1Mo(j10, this) == objM25952f) {
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
            return ((C31971) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public AndroidViewHolder(Context context, CompositionContext compositionContext, int i10, NestedScrollDispatcher nestedScrollDispatcher, View view, Owner owner) {
        super(context);
        this.compositeKeyHash = i10;
        this.dispatcher = nestedScrollDispatcher;
        this.view = view;
        this.owner = owner;
        if (compositionContext != null) {
            WindowRecomposer_androidKt.setCompositionContext(this, compositionContext);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        ViewCompat.setWindowInsetsAnimationCallback(this, new WindowInsetsAnimationCompat.Callback() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder.2
            {
                super(1);
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List<WindowInsetsAnimationCompat> list) {
                return AndroidViewHolder.this.insetToLayoutPosition(windowInsetsCompat);
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public WindowInsetsAnimationCompat.BoundsCompat onStart(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
                return AndroidViewHolder.this.insetBounds(boundsCompat);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(this, this);
        this.update = new InterfaceC9529a() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$update$1
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m33755invoke() {
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m33755invoke();
                return C10786q.f26013a;
            }
        };
        this.reset = new InterfaceC9529a() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$reset$1
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m33752invoke() {
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m33752invoke();
                return C10786q.f26013a;
            }
        };
        this.release = new InterfaceC9529a() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$release$1
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m33751invoke() {
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m33751invoke();
                return C10786q.f26013a;
            }
        };
        Modifier.Companion companion = Modifier.Companion;
        this.modifier = companion;
        this.density = DensityKt.Density$default(1.0f, 0.0f, 2, null);
        this.position = new int[2];
        this.size = IntSize.Companion.m33677getZeroYbymL2g();
        this.runUpdate = new InterfaceC9529a() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runUpdate$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m33754invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m33754invoke() {
                if (this.this$0.hasUpdateBlock && this.this$0.isAttachedToWindow()) {
                    ViewParent parent = this.this$0.getView().getParent();
                    AndroidViewHolder androidViewHolder = this.this$0;
                    if (parent == androidViewHolder) {
                        androidViewHolder.getSnapshotObserver().observeReads$ui_release(this.this$0, AndroidViewHolder.OnCommitAffectingUpdate, this.this$0.getUpdate());
                    }
                }
            }
        };
        this.runInvalidate = new InterfaceC9529a() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runInvalidate$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m33753invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m33753invoke() {
                this.this$0.getLayoutNode().invalidateLayer$ui_release();
            }
        };
        this.location = new int[2];
        this.lastWidthMeasureSpec = Integer.MIN_VALUE;
        this.lastHeightMeasureSpec = Integer.MIN_VALUE;
        this.nestedScrollingParentHelper = new NestedScrollingParentHelper(this);
        final LayoutNode layoutNode = new LayoutNode(false, 0, 3, null);
        layoutNode.setForceUseOldLayers(true);
        layoutNode.setInteropViewFactoryHolder$ui_release(this);
        final Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(DrawModifierKt.drawBehind(GraphicsLayerModifierKt.m31038graphicsLayerAp8cVGQ$default(PointerInteropFilter_androidKt.pointerInteropFilter(SemanticsModifierKt.semantics(NestedScrollModifierKt.nestedScroll(companion, AndroidViewHolder_androidKt.NoOpScrollConnection, nestedScrollDispatcher), true, new InterfaceC9540l() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$1
            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return C10786q.f26013a;
            }
        }), this), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null), new InterfaceC9540l() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DrawScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(DrawScope drawScope) {
                AndroidViewHolder androidViewHolder = this.$this_run;
                LayoutNode layoutNode2 = layoutNode;
                AndroidViewHolder androidViewHolder2 = this;
                Canvas canvas = drawScope.getDrawContext().getCanvas();
                if (androidViewHolder.getView().getVisibility() != 8) {
                    androidViewHolder.isDrawing = true;
                    Owner owner$ui_release = layoutNode2.getOwner$ui_release();
                    AndroidComposeView androidComposeView = owner$ui_release instanceof AndroidComposeView ? (AndroidComposeView) owner$ui_release : null;
                    if (androidComposeView != null) {
                        androidComposeView.drawAndroidView(androidViewHolder2, AndroidCanvas_androidKt.getNativeCanvas(canvas));
                    }
                    androidViewHolder.isDrawing = false;
                }
            }
        }), new InterfaceC9540l() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LayoutCoordinates) obj);
                return C10786q.f26013a;
            }

            public final void invoke(LayoutCoordinates layoutCoordinates) {
                WindowInsets windowInsets;
                AndroidViewHolder_androidKt.layoutAccordingTo(this.$this_run, layoutNode);
                this.$this_run.owner.onInteropViewLayoutChange(this.$this_run);
                int i11 = this.$this_run.position[0];
                int i12 = this.$this_run.position[1];
                this.$this_run.getView().getLocationOnScreen(this.$this_run.position);
                long j10 = this.$this_run.size;
                this.$this_run.size = layoutCoordinates.mo32237getSizeYbymL2g();
                WindowInsetsCompat windowInsetsCompat = this.$this_run.insets;
                if (windowInsetsCompat != null) {
                    if ((i11 == this.$this_run.position[0] && i12 == this.$this_run.position[1] && IntSize.m33670equalsimpl0(j10, this.$this_run.size)) || (windowInsets = this.$this_run.insetToLayoutPosition(windowInsetsCompat).toWindowInsets()) == null) {
                        return;
                    }
                    this.$this_run.getView().dispatchApplyWindowInsets(windowInsets);
                }
            }
        });
        layoutNode.setCompositeKeyHash(i10);
        layoutNode.setModifier(this.modifier.then(modifierOnGloballyPositioned));
        this.onModifierChanged = new InterfaceC9540l() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Modifier) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Modifier modifier) {
                layoutNode.setModifier(modifier.then(modifierOnGloballyPositioned));
            }
        };
        layoutNode.setDensity(this.density);
        this.onDensityChanged = new InterfaceC9540l() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$2
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Density) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Density density) {
                layoutNode.setDensity(density);
            }
        };
        layoutNode.setOnAttach$ui_release(new InterfaceC9540l() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Owner) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Owner owner2) {
                AndroidComposeView androidComposeView = owner2 instanceof AndroidComposeView ? (AndroidComposeView) owner2 : null;
                if (androidComposeView != null) {
                    androidComposeView.addAndroidView(this.$this_run, layoutNode);
                }
                ViewParent parent = this.$this_run.getView().getParent();
                AndroidViewHolder androidViewHolder = this.$this_run;
                if (parent != androidViewHolder) {
                    androidViewHolder.addView(androidViewHolder.getView());
                }
            }
        });
        layoutNode.setOnDetach$ui_release(new InterfaceC9540l() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$4
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Owner) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Owner owner2) {
                if (ComposeUiFlags.isViewFocusFixEnabled && this.$this_run.hasFocus()) {
                    owner2.getFocusOwner().clearFocus(true);
                }
                AndroidComposeView androidComposeView = owner2 instanceof AndroidComposeView ? (AndroidComposeView) owner2 : null;
                if (androidComposeView != null) {
                    androidComposeView.removeAndroidView(this.$this_run);
                }
                this.$this_run.removeAllViewsInLayout();
            }
        });
        layoutNode.setMeasurePolicy(new MeasurePolicy() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5
            private final int intrinsicHeight(int i11) {
                AndroidViewHolder androidViewHolder = this.$this_run;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                AbstractC9979u.m20291d(layoutParams);
                androidViewHolder.measure(androidViewHolder.obtainMeasureSpec(0, i11, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return this.$this_run.getMeasuredHeight();
            }

            private final int intrinsicWidth(int i11) {
                AndroidViewHolder androidViewHolder = this.$this_run;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                AndroidViewHolder androidViewHolder2 = this.$this_run;
                ViewGroup.LayoutParams layoutParams = androidViewHolder2.getLayoutParams();
                AbstractC9979u.m20291d(layoutParams);
                androidViewHolder.measure(iMakeMeasureSpec, androidViewHolder2.obtainMeasureSpec(0, i11, layoutParams.height));
                return this.$this_run.getMeasuredWidth();
            }

            @Override // androidx.compose.p014ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i11) {
                return intrinsicHeight(i11);
            }

            @Override // androidx.compose.p014ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i11) {
                return intrinsicWidth(i11);
            }

            @Override // androidx.compose.p014ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo26741measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
                if (this.$this_run.getChildCount() == 0) {
                    return MeasureScope.layout$default(measureScope, Constraints.m33456getMinWidthimpl(j10), Constraints.m33455getMinHeightimpl(j10), null, new InterfaceC9540l() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$1
                        public final void invoke(Placeable.PlacementScope placementScope) {
                        }

                        @Override // p181hd.InterfaceC9540l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((Placeable.PlacementScope) obj);
                            return C10786q.f26013a;
                        }
                    }, 4, null);
                }
                if (Constraints.m33456getMinWidthimpl(j10) != 0) {
                    this.$this_run.getChildAt(0).setMinimumWidth(Constraints.m33456getMinWidthimpl(j10));
                }
                if (Constraints.m33455getMinHeightimpl(j10) != 0) {
                    this.$this_run.getChildAt(0).setMinimumHeight(Constraints.m33455getMinHeightimpl(j10));
                }
                AndroidViewHolder androidViewHolder = this.$this_run;
                int iM33456getMinWidthimpl = Constraints.m33456getMinWidthimpl(j10);
                int iM33454getMaxWidthimpl = Constraints.m33454getMaxWidthimpl(j10);
                ViewGroup.LayoutParams layoutParams = this.$this_run.getLayoutParams();
                AbstractC9979u.m20291d(layoutParams);
                int iObtainMeasureSpec = androidViewHolder.obtainMeasureSpec(iM33456getMinWidthimpl, iM33454getMaxWidthimpl, layoutParams.width);
                AndroidViewHolder androidViewHolder2 = this.$this_run;
                int iM33455getMinHeightimpl = Constraints.m33455getMinHeightimpl(j10);
                int iM33453getMaxHeightimpl = Constraints.m33453getMaxHeightimpl(j10);
                ViewGroup.LayoutParams layoutParams2 = this.$this_run.getLayoutParams();
                AbstractC9979u.m20291d(layoutParams2);
                androidViewHolder.measure(iObtainMeasureSpec, androidViewHolder2.obtainMeasureSpec(iM33455getMinHeightimpl, iM33453getMaxHeightimpl, layoutParams2.height));
                int measuredWidth = this.$this_run.getMeasuredWidth();
                int measuredHeight = this.$this_run.getMeasuredHeight();
                final AndroidViewHolder androidViewHolder3 = this.$this_run;
                final LayoutNode layoutNode2 = layoutNode;
                return MeasureScope.layout$default(measureScope, measuredWidth, measuredHeight, null, new InterfaceC9540l() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Placeable.PlacementScope) obj);
                        return C10786q.f26013a;
                    }

                    public final void invoke(Placeable.PlacementScope placementScope) {
                        AndroidViewHolder_androidKt.layoutAccordingTo(androidViewHolder3, layoutNode2);
                    }
                }, 4, null);
            }

            @Override // androidx.compose.p014ui.layout.MeasurePolicy
            public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i11) {
                return intrinsicHeight(i11);
            }

            @Override // androidx.compose.p014ui.layout.MeasurePolicy
            public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i11) {
                return intrinsicWidth(i11);
            }
        });
        this.layoutNode = layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OwnerSnapshotObserver getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            InlineClassHelperKt.throwIllegalStateException("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.owner.getSnapshotObserver();
    }

    private final Insets inset(Insets insets, int i10, int i11, int i12, int i13) {
        int i14 = insets.left - i10;
        if (i14 < 0) {
            i14 = 0;
        }
        int i15 = insets.f28530top - i11;
        if (i15 < 0) {
            i15 = 0;
        }
        int i16 = insets.right - i12;
        if (i16 < 0) {
            i16 = 0;
        }
        int i17 = insets.bottom - i13;
        return Insets.m1511of(i14, i15, i16, i17 >= 0 ? i17 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WindowInsetsAnimationCompat.BoundsCompat insetBounds(WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
        NodeCoordinator innerCoordinator$ui_release = this.layoutNode.getInnerCoordinator$ui_release();
        if (innerCoordinator$ui_release.isAttached()) {
            long jM33646roundk4lQ0M = IntOffsetKt.m33646roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(innerCoordinator$ui_release));
            int iM33629getXimpl = IntOffset.m33629getXimpl(jM33646roundk4lQ0M);
            if (iM33629getXimpl < 0) {
                iM33629getXimpl = 0;
            }
            int iM33630getYimpl = IntOffset.m33630getYimpl(jM33646roundk4lQ0M);
            int i10 = iM33630getYimpl < 0 ? 0 : iM33630getYimpl;
            long jMo32237getSizeYbymL2g = LayoutCoordinatesKt.findRootCoordinates(innerCoordinator$ui_release).mo32237getSizeYbymL2g();
            int i11 = (int) (jMo32237getSizeYbymL2g >> 32);
            int i12 = (int) (jMo32237getSizeYbymL2g & 4294967295L);
            long jMo32237getSizeYbymL2g2 = innerCoordinator$ui_release.mo32237getSizeYbymL2g();
            long jM33646roundk4lQ0M2 = IntOffsetKt.m33646roundk4lQ0M(innerCoordinator$ui_release.mo32240localToRootMKHz9U(Offset.m30629constructorimpl((4294967295L & Float.floatToRawIntBits((int) (jMo32237getSizeYbymL2g2 & 4294967295L))) | (Float.floatToRawIntBits((int) (jMo32237getSizeYbymL2g2 >> 32)) << 32))));
            int iM33629getXimpl2 = i11 - IntOffset.m33629getXimpl(jM33646roundk4lQ0M2);
            if (iM33629getXimpl2 < 0) {
                iM33629getXimpl2 = 0;
            }
            int iM33630getYimpl2 = i12 - IntOffset.m33630getYimpl(jM33646roundk4lQ0M2);
            int i13 = iM33630getYimpl2 >= 0 ? iM33630getYimpl2 : 0;
            if (iM33629getXimpl != 0 || i10 != 0 || iM33629getXimpl2 != 0 || i13 != 0) {
                int i14 = iM33629getXimpl;
                int i15 = iM33629getXimpl2;
                return new WindowInsetsAnimationCompat.BoundsCompat(inset(boundsCompat.getLowerBound(), i14, i10, i15, i13), inset(boundsCompat.getUpperBound(), i14, i10, i15, i13));
            }
        }
        return boundsCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WindowInsetsCompat insetToLayoutPosition(WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat.hasInsets()) {
            NodeCoordinator innerCoordinator$ui_release = this.layoutNode.getInnerCoordinator$ui_release();
            if (innerCoordinator$ui_release.isAttached()) {
                long jM33646roundk4lQ0M = IntOffsetKt.m33646roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(innerCoordinator$ui_release));
                int iM33629getXimpl = IntOffset.m33629getXimpl(jM33646roundk4lQ0M);
                if (iM33629getXimpl < 0) {
                    iM33629getXimpl = 0;
                }
                int iM33630getYimpl = IntOffset.m33630getYimpl(jM33646roundk4lQ0M);
                if (iM33630getYimpl < 0) {
                    iM33630getYimpl = 0;
                }
                long jMo32237getSizeYbymL2g = LayoutCoordinatesKt.findRootCoordinates(innerCoordinator$ui_release).mo32237getSizeYbymL2g();
                int i10 = (int) (jMo32237getSizeYbymL2g >> 32);
                int i11 = (int) (jMo32237getSizeYbymL2g & 4294967295L);
                long jMo32237getSizeYbymL2g2 = innerCoordinator$ui_release.mo32237getSizeYbymL2g();
                long jM33646roundk4lQ0M2 = IntOffsetKt.m33646roundk4lQ0M(innerCoordinator$ui_release.mo32240localToRootMKHz9U(Offset.m30629constructorimpl((Float.floatToRawIntBits((int) (jMo32237getSizeYbymL2g2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (jMo32237getSizeYbymL2g2 >> 32)) << 32))));
                int iM33629getXimpl2 = i10 - IntOffset.m33629getXimpl(jM33646roundk4lQ0M2);
                if (iM33629getXimpl2 < 0) {
                    iM33629getXimpl2 = 0;
                }
                int iM33630getYimpl2 = i11 - IntOffset.m33630getYimpl(jM33646roundk4lQ0M2);
                int i12 = iM33630getYimpl2 < 0 ? 0 : iM33630getYimpl2;
                if (iM33629getXimpl != 0 || iM33630getYimpl != 0 || iM33629getXimpl2 != 0 || i12 != 0) {
                    return windowInsetsCompat.inset(iM33629getXimpl, iM33630getYimpl, iM33629getXimpl2, i12);
                }
            }
        }
        return windowInsetsCompat;
    }

    private final <T> T insetValue(T t10, InterfaceC9546r interfaceC9546r) {
        NodeCoordinator innerCoordinator$ui_release = this.layoutNode.getInnerCoordinator$ui_release();
        if (innerCoordinator$ui_release.isAttached()) {
            long jM33646roundk4lQ0M = IntOffsetKt.m33646roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(innerCoordinator$ui_release));
            int iM33629getXimpl = IntOffset.m33629getXimpl(jM33646roundk4lQ0M);
            if (iM33629getXimpl < 0) {
                iM33629getXimpl = 0;
            }
            int iM33630getYimpl = IntOffset.m33630getYimpl(jM33646roundk4lQ0M);
            if (iM33630getYimpl < 0) {
                iM33630getYimpl = 0;
            }
            long jMo32237getSizeYbymL2g = LayoutCoordinatesKt.findRootCoordinates(innerCoordinator$ui_release).mo32237getSizeYbymL2g();
            int i10 = (int) (jMo32237getSizeYbymL2g >> 32);
            int i11 = (int) (jMo32237getSizeYbymL2g & 4294967295L);
            long jMo32237getSizeYbymL2g2 = innerCoordinator$ui_release.mo32237getSizeYbymL2g();
            long jM33646roundk4lQ0M2 = IntOffsetKt.m33646roundk4lQ0M(innerCoordinator$ui_release.mo32240localToRootMKHz9U(Offset.m30629constructorimpl((4294967295L & Float.floatToRawIntBits((int) (jMo32237getSizeYbymL2g2 & 4294967295L))) | (Float.floatToRawIntBits((int) (jMo32237getSizeYbymL2g2 >> 32)) << 32))));
            int iM33629getXimpl2 = i10 - IntOffset.m33629getXimpl(jM33646roundk4lQ0M2);
            if (iM33629getXimpl2 < 0) {
                iM33629getXimpl2 = 0;
            }
            int iM33630getYimpl2 = i11 - IntOffset.m33630getYimpl(jM33646roundk4lQ0M2);
            int i12 = iM33630getYimpl2 >= 0 ? iM33630getYimpl2 : 0;
            if (iM33629getXimpl != 0 || iM33630getYimpl != 0 || iM33629getXimpl2 != 0 || i12 != 0) {
                return (T) interfaceC9546r.invoke(Integer.valueOf(iM33629getXimpl), Integer.valueOf(iM33630getYimpl), Integer.valueOf(iM33629getXimpl2), Integer.valueOf(i12));
            }
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int obtainMeasureSpec(int i10, int i11, int i12) {
        return (i12 >= 0 || i10 == i11) ? View.MeasureSpec.makeMeasureSpec(AbstractC10410o.m21761n(i12, i10, i11), 1073741824) : (i12 != -2 || i11 == Integer.MAX_VALUE) ? (i12 != -1 || i11 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i11, 1073741824) : View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.location);
        int[] iArr = this.location;
        int i10 = iArr[0];
        region.op(i10, iArr[1], i10 + getWidth(), this.location[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final Density getDensity() {
        return this.density;
    }

    public final View getInteropView() {
        return this.view;
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.nestedScrollingParentHelper.getNestedScrollAxes();
    }

    public final InterfaceC9540l getOnDensityChanged$ui_release() {
        return this.onDensityChanged;
    }

    public final InterfaceC9540l getOnModifierChanged$ui_release() {
        return this.onModifierChanged;
    }

    public final InterfaceC9540l getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    public final InterfaceC9529a getRelease() {
        return this.release;
    }

    public final InterfaceC9529a getReset() {
        return this.reset;
    }

    public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    public final InterfaceC9529a getUpdate() {
        return this.update;
    }

    public final View getView() {
        return this.view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        invalidateOrDefer();
        return null;
    }

    public final void invalidateOrDefer() {
        if (!this.isDrawing) {
            this.layoutNode.invalidateLayer$ui_release();
            return;
        }
        View view = this.view;
        final InterfaceC9529a interfaceC9529a = this.runInvalidate;
        view.postOnAnimation(new Runnable() { // from class: androidx.compose.ui.viewinterop.a
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC9529a.invoke();
            }
        });
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.view.isNestedScrollingEnabled();
    }

    @Override // androidx.compose.p014ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttachedToWindow();
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        this.insets = new WindowInsetsCompat(windowInsetsCompat);
        return insetToLayoutPosition(windowInsetsCompat);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.runUpdate.invoke();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        this.reset.invoke();
        if (ComposeUiFlags.isRemoveFocusedViewFixEnabled && hasFocus() && isInTouchMode() && Build.VERSION.SDK_INT > 28) {
            findFocus().clearFocus();
        }
        removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidateOrDefer();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().clear$ui_release(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.view.layout(0, 0, i12 - i10, i13 - i11);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
            return;
        }
        if (this.view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.view.measure(i10, i11);
        setMeasuredDimension(this.view.getMeasuredWidth(), this.view.getMeasuredHeight());
        this.lastWidthMeasureSpec = i10;
        this.lastHeightMeasureSpec = i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC11117h.m24726d(this.dispatcher.getCoroutineScope(), null, null, new C31961(z10, this, VelocityKt.Velocity(AndroidViewHolder_androidKt.toComposeVelocity(f10), AndroidViewHolder_androidKt.toComposeVelocity(f11)), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC11117h.m24726d(this.dispatcher.getCoroutineScope(), null, null, new C31971(VelocityKt.Velocity(AndroidViewHolder_androidKt.toComposeVelocity(f10), AndroidViewHolder_androidKt.toComposeVelocity(f11)), null), 3, null);
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            float composeOffset = AndroidViewHolder_androidKt.toComposeOffset(i10);
            float composeOffset2 = AndroidViewHolder_androidKt.toComposeOffset(i11);
            long jM31980dispatchPreScrollOzD1aCk = nestedScrollDispatcher.m31980dispatchPreScrollOzD1aCk(Offset.m30629constructorimpl((Float.floatToRawIntBits(composeOffset2) & 4294967295L) | (Float.floatToRawIntBits(composeOffset) << 32)), AndroidViewHolder_androidKt.toNestedScrollSource(i12));
            iArr[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jM31980dispatchPreScrollOzD1aCk >> 32)));
            iArr[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jM31980dispatchPreScrollOzD1aCk & 4294967295L)));
        }
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            float composeOffset = AndroidViewHolder_androidKt.toComposeOffset(i10);
            float composeOffset2 = AndroidViewHolder_androidKt.toComposeOffset(i11);
            long jM30629constructorimpl = Offset.m30629constructorimpl((Float.floatToRawIntBits(composeOffset2) & 4294967295L) | (Float.floatToRawIntBits(composeOffset) << 32));
            float composeOffset3 = AndroidViewHolder_androidKt.toComposeOffset(i12);
            float composeOffset4 = AndroidViewHolder_androidKt.toComposeOffset(i13);
            long jM31978dispatchPostScrollDzOQY0M = nestedScrollDispatcher.m31978dispatchPostScrollDzOQY0M(jM30629constructorimpl, Offset.m30629constructorimpl((Float.floatToRawIntBits(composeOffset4) & 4294967295L) | (Float.floatToRawIntBits(composeOffset3) << 32)), AndroidViewHolder_androidKt.toNestedScrollSource(i14));
            iArr[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jM31978dispatchPostScrollDzOQY0M >> 32)));
            iArr[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jM31978dispatchPostScrollDzOQY0M & 4294967295L)));
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        this.nestedScrollingParentHelper.onNestedScrollAccepted(view, view2, i10, i11);
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        this.release.invoke();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        if (this.view.getParent() != this) {
            addView(this.view);
        } else {
            this.reset.invoke();
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        return ((i10 & 2) == 0 && (i10 & 1) == 0) ? false : true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i10) {
        this.nestedScrollingParentHelper.onStopNestedScroll(view, i10);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    public final void remeasure() {
        int i10;
        int i11 = this.lastWidthMeasureSpec;
        if (i11 == Integer.MIN_VALUE || (i10 = this.lastHeightMeasureSpec) == Integer.MIN_VALUE) {
            return;
        }
        measure(i11, i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        InterfaceC9540l interfaceC9540l = this.onRequestDisallowInterceptTouchEvent;
        if (interfaceC9540l != null) {
            interfaceC9540l.invoke(Boolean.valueOf(z10));
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void setDensity(Density density) {
        if (density != this.density) {
            this.density = density;
            InterfaceC9540l interfaceC9540l = this.onDensityChanged;
            if (interfaceC9540l != null) {
                interfaceC9540l.invoke(density);
            }
        }
    }

    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != this.lifecycleOwner) {
            this.lifecycleOwner = lifecycleOwner;
            ViewTreeLifecycleOwner.set(this, lifecycleOwner);
        }
    }

    public final void setModifier(Modifier modifier) {
        if (modifier != this.modifier) {
            this.modifier = modifier;
            InterfaceC9540l interfaceC9540l = this.onModifierChanged;
            if (interfaceC9540l != null) {
                interfaceC9540l.invoke(modifier);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(InterfaceC9540l interfaceC9540l) {
        this.onDensityChanged = interfaceC9540l;
    }

    public final void setOnModifierChanged$ui_release(InterfaceC9540l interfaceC9540l) {
        this.onModifierChanged = interfaceC9540l;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(InterfaceC9540l interfaceC9540l) {
        this.onRequestDisallowInterceptTouchEvent = interfaceC9540l;
    }

    public final void setRelease(InterfaceC9529a interfaceC9529a) {
        this.release = interfaceC9529a;
    }

    public final void setReset(InterfaceC9529a interfaceC9529a) {
        this.reset = interfaceC9529a;
    }

    public final void setSavedStateRegistryOwner(SavedStateRegistryOwner savedStateRegistryOwner) {
        if (savedStateRegistryOwner != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = savedStateRegistryOwner;
            ViewTreeSavedStateRegistryOwner.set(this, savedStateRegistryOwner);
        }
    }

    public final void setUpdate(InterfaceC9529a interfaceC9529a) {
        this.update = interfaceC9529a;
        this.hasUpdateBlock = true;
        this.runUpdate.invoke();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            float composeOffset = AndroidViewHolder_androidKt.toComposeOffset(i10);
            float composeOffset2 = AndroidViewHolder_androidKt.toComposeOffset(i11);
            long jM30629constructorimpl = Offset.m30629constructorimpl((Float.floatToRawIntBits(composeOffset2) & 4294967295L) | (Float.floatToRawIntBits(composeOffset) << 32));
            float composeOffset3 = AndroidViewHolder_androidKt.toComposeOffset(i12);
            float composeOffset4 = AndroidViewHolder_androidKt.toComposeOffset(i13);
            nestedScrollDispatcher.m31978dispatchPostScrollDzOQY0M(jM30629constructorimpl, Offset.m30629constructorimpl((Float.floatToRawIntBits(composeOffset4) & 4294967295L) | (Float.floatToRawIntBits(composeOffset3) << 32)), AndroidViewHolder_androidKt.toNestedScrollSource(i14));
        }
    }
}
