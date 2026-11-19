package androidx.compose.p013ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.compose.p013ui.ComposeUiFlags;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.draw.DrawModifierKt;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p013ui.graphics.Canvas;
import androidx.compose.p013ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p013ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.p013ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.p013ui.layout.IntrinsicMeasurable;
import androidx.compose.p013ui.layout.IntrinsicMeasureScope;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.layout.LayoutCoordinatesKt;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.LayoutNode;
import androidx.compose.p013ui.node.NodeCoordinator;
import androidx.compose.p013ui.node.Owner;
import androidx.compose.p013ui.node.OwnerScope;
import androidx.compose.p013ui.node.OwnerSnapshotObserver;
import androidx.compose.p013ui.platform.AndroidComposeView;
import androidx.compose.p013ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.p013ui.platform.WindowRecomposer_androidKt;
import androidx.compose.p013ui.semantics.SemanticsModifierKt;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.DensityKt;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntOffsetKt;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.VelocityKt;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
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
import com.tencent.smtt.sdk.TbsListener;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10576r;

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
    private InterfaceC10570l onDensityChanged;
    private InterfaceC10570l onModifierChanged;
    private InterfaceC10570l onRequestDisallowInterceptTouchEvent;
    private final Owner owner;
    private final int[] position;
    private InterfaceC10559a release;
    private InterfaceC10559a reset;
    private final InterfaceC10559a runInvalidate;
    private final InterfaceC10559a runUpdate;
    private SavedStateRegistryOwner savedStateRegistryOwner;
    private long size;
    private InterfaceC10559a update;
    private final View view;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC10570l OnCommitAffectingUpdate = AndroidViewHolder$Companion$OnCommitAffectingUpdate$1.INSTANCE;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", m17801f = "AndroidViewHolder.android.kt", m17802l = {639, 641}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1 */
    public static final class C31661 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ boolean $consumed;
        final /* synthetic */ long $viewVelocity;
        int label;
        final /* synthetic */ AndroidViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31661(boolean z10, AndroidViewHolder androidViewHolder, long j10, InterfaceC9324c<? super C31661> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$consumed = z10;
            this.this$0 = androidViewHolder;
            this.$viewVelocity = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C31661(this.$consumed, this.this$0, this.$viewVelocity, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C31661) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            if (r4.m25375dispatchPostFlingRZ2iAVY(r5, r7, r10) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
        
            if (r1.m25375dispatchPostFlingRZ2iAVY(r2, r4, r10) == r0) goto L17;
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
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                int r1 = r10.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.AbstractC9079b.m15926b(r11)
                goto L58
            L12:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1a:
                kotlin.AbstractC9079b.m15926b(r11)
                r6 = r10
                goto L58
            L1f:
                kotlin.AbstractC9079b.m15926b(r11)
                boolean r11 = r10.$consumed
                if (r11 != 0) goto L3f
                androidx.compose.ui.viewinterop.AndroidViewHolder r11 = r10.this$0
                androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r4 = androidx.compose.p013ui.viewinterop.AndroidViewHolder.access$getDispatcher$p(r11)
                androidx.compose.ui.unit.Velocity$Companion r11 = androidx.compose.p013ui.unit.Velocity.Companion
                long r5 = r11.m27148getZero9UxMQ8M()
                long r7 = r10.$viewVelocity
                r10.label = r3
                r9 = r10
                java.lang.Object r11 = r4.m25375dispatchPostFlingRZ2iAVY(r5, r7, r9)
                r6 = r9
                if (r11 != r0) goto L58
                goto L57
            L3f:
                r6 = r10
                androidx.compose.ui.viewinterop.AndroidViewHolder r11 = r6.this$0
                androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r1 = androidx.compose.p013ui.viewinterop.AndroidViewHolder.access$getDispatcher$p(r11)
                r11 = r2
                long r2 = r6.$viewVelocity
                androidx.compose.ui.unit.Velocity$Companion r4 = androidx.compose.p013ui.unit.Velocity.Companion
                long r4 = r4.m27148getZero9UxMQ8M()
                r6.label = r11
                java.lang.Object r11 = r1.m25375dispatchPostFlingRZ2iAVY(r2, r4, r6)
                if (r11 != r0) goto L58
            L57:
                return r0
            L58:
                h7.p r11 = p123h7.C8736p.f16368a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p013ui.viewinterop.AndroidViewHolder.C31661.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", m17801f = "AndroidViewHolder.android.kt", m17802l = {TbsListener.ErrorCode.STATIC_TBS_INSTALL_CORE_SHARE_DIR_NULL}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1 */
    public static final class C31671 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ long $toBeConsumed;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31671(long j10, InterfaceC9324c<? super C31671> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$toBeConsumed = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return AndroidViewHolder.this.new C31671(this.$toBeConsumed, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C31671) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                NestedScrollDispatcher nestedScrollDispatcher = AndroidViewHolder.this.dispatcher;
                long j10 = this.$toBeConsumed;
                this.label = 1;
                if (nestedScrollDispatcher.m25377dispatchPreFlingQWom1Mo(j10, this) == objM17291f) {
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
        this.update = new InterfaceC10559a() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$update$1
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27153invoke() {
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27153invoke();
                return C8736p.f16368a;
            }
        };
        this.reset = new InterfaceC10559a() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$reset$1
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27150invoke() {
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27150invoke();
                return C8736p.f16368a;
            }
        };
        this.release = new InterfaceC10559a() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$release$1
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27149invoke() {
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27149invoke();
                return C8736p.f16368a;
            }
        };
        Modifier.Companion companion = Modifier.Companion;
        this.modifier = companion;
        this.density = DensityKt.Density$default(1.0f, 0.0f, 2, null);
        this.position = new int[2];
        this.size = IntSize.Companion.m27075getZeroYbymL2g();
        this.runUpdate = new InterfaceC10559a() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runUpdate$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27152invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27152invoke() {
                if (this.this$0.hasUpdateBlock && this.this$0.isAttachedToWindow()) {
                    ViewParent parent = this.this$0.getView().getParent();
                    AndroidViewHolder androidViewHolder = this.this$0;
                    if (parent == androidViewHolder) {
                        androidViewHolder.getSnapshotObserver().observeReads$ui_release(this.this$0, AndroidViewHolder.OnCommitAffectingUpdate, this.this$0.getUpdate());
                    }
                }
            }
        };
        this.runInvalidate = new InterfaceC10559a() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runInvalidate$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27151invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27151invoke() {
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
        final Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(DrawModifierKt.drawBehind(GraphicsLayerModifierKt.m24436graphicsLayerAp8cVGQ$default(PointerInteropFilter_androidKt.pointerInteropFilter(SemanticsModifierKt.semantics(NestedScrollModifierKt.nestedScroll(companion, AndroidViewHolder_androidKt.NoOpScrollConnection, nestedScrollDispatcher), true, new InterfaceC10570l() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$1
            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return C8736p.f16368a;
            }
        }), this), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null), new InterfaceC10570l() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DrawScope) obj);
                return C8736p.f16368a;
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
        }), new InterfaceC10570l() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LayoutCoordinates) obj);
                return C8736p.f16368a;
            }

            public final void invoke(LayoutCoordinates layoutCoordinates) {
                WindowInsets windowInsets;
                AndroidViewHolder_androidKt.layoutAccordingTo(this.$this_run, layoutNode);
                this.$this_run.owner.onInteropViewLayoutChange(this.$this_run);
                int i11 = this.$this_run.position[0];
                int i12 = this.$this_run.position[1];
                this.$this_run.getView().getLocationOnScreen(this.$this_run.position);
                long j10 = this.$this_run.size;
                this.$this_run.size = layoutCoordinates.mo25635getSizeYbymL2g();
                WindowInsetsCompat windowInsetsCompat = this.$this_run.insets;
                if (windowInsetsCompat != null) {
                    if ((i11 == this.$this_run.position[0] && i12 == this.$this_run.position[1] && IntSize.m27068equalsimpl0(j10, this.$this_run.size)) || (windowInsets = this.$this_run.insetToLayoutPosition(windowInsetsCompat).toWindowInsets()) == null) {
                        return;
                    }
                    this.$this_run.getView().dispatchApplyWindowInsets(windowInsets);
                }
            }
        });
        layoutNode.setCompositeKeyHash(i10);
        layoutNode.setModifier(this.modifier.then(modifierOnGloballyPositioned));
        this.onModifierChanged = new InterfaceC10570l() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Modifier) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Modifier modifier) {
                layoutNode.setModifier(modifier.then(modifierOnGloballyPositioned));
            }
        };
        layoutNode.setDensity(this.density);
        this.onDensityChanged = new InterfaceC10570l() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$2
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Density) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Density density) {
                layoutNode.setDensity(density);
            }
        };
        layoutNode.setOnAttach$ui_release(new InterfaceC10570l() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Owner) obj);
                return C8736p.f16368a;
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
        layoutNode.setOnDetach$ui_release(new InterfaceC10570l() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$4
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Owner) obj);
                return C8736p.f16368a;
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
                AbstractC9133u.m16130d(layoutParams);
                androidViewHolder.measure(androidViewHolder.obtainMeasureSpec(0, i11, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return this.$this_run.getMeasuredHeight();
            }

            private final int intrinsicWidth(int i11) {
                AndroidViewHolder androidViewHolder = this.$this_run;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                AndroidViewHolder androidViewHolder2 = this.$this_run;
                ViewGroup.LayoutParams layoutParams = androidViewHolder2.getLayoutParams();
                AbstractC9133u.m16130d(layoutParams);
                androidViewHolder.measure(iMakeMeasureSpec, androidViewHolder2.obtainMeasureSpec(0, i11, layoutParams.height));
                return this.$this_run.getMeasuredWidth();
            }

            @Override // androidx.compose.p013ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i11) {
                return intrinsicHeight(i11);
            }

            @Override // androidx.compose.p013ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i11) {
                return intrinsicWidth(i11);
            }

            @Override // androidx.compose.p013ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo20139measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
                if (this.$this_run.getChildCount() == 0) {
                    return MeasureScope.layout$default(measureScope, Constraints.m26854getMinWidthimpl(j10), Constraints.m26853getMinHeightimpl(j10), null, new InterfaceC10570l() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$1
                        public final void invoke(Placeable.PlacementScope placementScope) {
                        }

                        @Override // p300x7.InterfaceC10570l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((Placeable.PlacementScope) obj);
                            return C8736p.f16368a;
                        }
                    }, 4, null);
                }
                if (Constraints.m26854getMinWidthimpl(j10) != 0) {
                    this.$this_run.getChildAt(0).setMinimumWidth(Constraints.m26854getMinWidthimpl(j10));
                }
                if (Constraints.m26853getMinHeightimpl(j10) != 0) {
                    this.$this_run.getChildAt(0).setMinimumHeight(Constraints.m26853getMinHeightimpl(j10));
                }
                AndroidViewHolder androidViewHolder = this.$this_run;
                int iM26854getMinWidthimpl = Constraints.m26854getMinWidthimpl(j10);
                int iM26852getMaxWidthimpl = Constraints.m26852getMaxWidthimpl(j10);
                ViewGroup.LayoutParams layoutParams = this.$this_run.getLayoutParams();
                AbstractC9133u.m16130d(layoutParams);
                int iObtainMeasureSpec = androidViewHolder.obtainMeasureSpec(iM26854getMinWidthimpl, iM26852getMaxWidthimpl, layoutParams.width);
                AndroidViewHolder androidViewHolder2 = this.$this_run;
                int iM26853getMinHeightimpl = Constraints.m26853getMinHeightimpl(j10);
                int iM26851getMaxHeightimpl = Constraints.m26851getMaxHeightimpl(j10);
                ViewGroup.LayoutParams layoutParams2 = this.$this_run.getLayoutParams();
                AbstractC9133u.m16130d(layoutParams2);
                androidViewHolder.measure(iObtainMeasureSpec, androidViewHolder2.obtainMeasureSpec(iM26853getMinHeightimpl, iM26851getMaxHeightimpl, layoutParams2.height));
                int measuredWidth = this.$this_run.getMeasuredWidth();
                int measuredHeight = this.$this_run.getMeasuredHeight();
                final AndroidViewHolder androidViewHolder3 = this.$this_run;
                final LayoutNode layoutNode2 = layoutNode;
                return MeasureScope.layout$default(measureScope, measuredWidth, measuredHeight, null, new InterfaceC10570l() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Placeable.PlacementScope) obj);
                        return C8736p.f16368a;
                    }

                    public final void invoke(Placeable.PlacementScope placementScope) {
                        AndroidViewHolder_androidKt.layoutAccordingTo(androidViewHolder3, layoutNode2);
                    }
                }, 4, null);
            }

            @Override // androidx.compose.p013ui.layout.MeasurePolicy
            public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i11) {
                return intrinsicHeight(i11);
            }

            @Override // androidx.compose.p013ui.layout.MeasurePolicy
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
        int i15 = insets.f21462top - i11;
        if (i15 < 0) {
            i15 = 0;
        }
        int i16 = insets.right - i12;
        if (i16 < 0) {
            i16 = 0;
        }
        int i17 = insets.bottom - i13;
        return Insets.m1434of(i14, i15, i16, i17 >= 0 ? i17 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WindowInsetsAnimationCompat.BoundsCompat insetBounds(WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
        NodeCoordinator innerCoordinator$ui_release = this.layoutNode.getInnerCoordinator$ui_release();
        if (innerCoordinator$ui_release.isAttached()) {
            long jM27044roundk4lQ0M = IntOffsetKt.m27044roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(innerCoordinator$ui_release));
            int iM27027getXimpl = IntOffset.m27027getXimpl(jM27044roundk4lQ0M);
            if (iM27027getXimpl < 0) {
                iM27027getXimpl = 0;
            }
            int iM27028getYimpl = IntOffset.m27028getYimpl(jM27044roundk4lQ0M);
            int i10 = iM27028getYimpl < 0 ? 0 : iM27028getYimpl;
            long jMo25635getSizeYbymL2g = LayoutCoordinatesKt.findRootCoordinates(innerCoordinator$ui_release).mo25635getSizeYbymL2g();
            int i11 = (int) (jMo25635getSizeYbymL2g >> 32);
            int i12 = (int) (jMo25635getSizeYbymL2g & 4294967295L);
            long jMo25635getSizeYbymL2g2 = innerCoordinator$ui_release.mo25635getSizeYbymL2g();
            long jM27044roundk4lQ0M2 = IntOffsetKt.m27044roundk4lQ0M(innerCoordinator$ui_release.mo25638localToRootMKHz9U(Offset.m24027constructorimpl((4294967295L & Float.floatToRawIntBits((int) (jMo25635getSizeYbymL2g2 & 4294967295L))) | (Float.floatToRawIntBits((int) (jMo25635getSizeYbymL2g2 >> 32)) << 32))));
            int iM27027getXimpl2 = i11 - IntOffset.m27027getXimpl(jM27044roundk4lQ0M2);
            if (iM27027getXimpl2 < 0) {
                iM27027getXimpl2 = 0;
            }
            int iM27028getYimpl2 = i12 - IntOffset.m27028getYimpl(jM27044roundk4lQ0M2);
            int i13 = iM27028getYimpl2 >= 0 ? iM27028getYimpl2 : 0;
            if (iM27027getXimpl != 0 || i10 != 0 || iM27027getXimpl2 != 0 || i13 != 0) {
                int i14 = iM27027getXimpl;
                int i15 = iM27027getXimpl2;
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
                long jM27044roundk4lQ0M = IntOffsetKt.m27044roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(innerCoordinator$ui_release));
                int iM27027getXimpl = IntOffset.m27027getXimpl(jM27044roundk4lQ0M);
                if (iM27027getXimpl < 0) {
                    iM27027getXimpl = 0;
                }
                int iM27028getYimpl = IntOffset.m27028getYimpl(jM27044roundk4lQ0M);
                if (iM27028getYimpl < 0) {
                    iM27028getYimpl = 0;
                }
                long jMo25635getSizeYbymL2g = LayoutCoordinatesKt.findRootCoordinates(innerCoordinator$ui_release).mo25635getSizeYbymL2g();
                int i10 = (int) (jMo25635getSizeYbymL2g >> 32);
                int i11 = (int) (jMo25635getSizeYbymL2g & 4294967295L);
                long jMo25635getSizeYbymL2g2 = innerCoordinator$ui_release.mo25635getSizeYbymL2g();
                long jM27044roundk4lQ0M2 = IntOffsetKt.m27044roundk4lQ0M(innerCoordinator$ui_release.mo25638localToRootMKHz9U(Offset.m24027constructorimpl((Float.floatToRawIntBits((int) (jMo25635getSizeYbymL2g2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (jMo25635getSizeYbymL2g2 >> 32)) << 32))));
                int iM27027getXimpl2 = i10 - IntOffset.m27027getXimpl(jM27044roundk4lQ0M2);
                if (iM27027getXimpl2 < 0) {
                    iM27027getXimpl2 = 0;
                }
                int iM27028getYimpl2 = i11 - IntOffset.m27028getYimpl(jM27044roundk4lQ0M2);
                int i12 = iM27028getYimpl2 < 0 ? 0 : iM27028getYimpl2;
                if (iM27027getXimpl != 0 || iM27028getYimpl != 0 || iM27027getXimpl2 != 0 || i12 != 0) {
                    return windowInsetsCompat.inset(iM27027getXimpl, iM27028getYimpl, iM27027getXimpl2, i12);
                }
            }
        }
        return windowInsetsCompat;
    }

    private final <T> T insetValue(T t10, InterfaceC10576r interfaceC10576r) {
        NodeCoordinator innerCoordinator$ui_release = this.layoutNode.getInnerCoordinator$ui_release();
        if (innerCoordinator$ui_release.isAttached()) {
            long jM27044roundk4lQ0M = IntOffsetKt.m27044roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(innerCoordinator$ui_release));
            int iM27027getXimpl = IntOffset.m27027getXimpl(jM27044roundk4lQ0M);
            if (iM27027getXimpl < 0) {
                iM27027getXimpl = 0;
            }
            int iM27028getYimpl = IntOffset.m27028getYimpl(jM27044roundk4lQ0M);
            if (iM27028getYimpl < 0) {
                iM27028getYimpl = 0;
            }
            long jMo25635getSizeYbymL2g = LayoutCoordinatesKt.findRootCoordinates(innerCoordinator$ui_release).mo25635getSizeYbymL2g();
            int i10 = (int) (jMo25635getSizeYbymL2g >> 32);
            int i11 = (int) (jMo25635getSizeYbymL2g & 4294967295L);
            long jMo25635getSizeYbymL2g2 = innerCoordinator$ui_release.mo25635getSizeYbymL2g();
            long jM27044roundk4lQ0M2 = IntOffsetKt.m27044roundk4lQ0M(innerCoordinator$ui_release.mo25638localToRootMKHz9U(Offset.m24027constructorimpl((4294967295L & Float.floatToRawIntBits((int) (jMo25635getSizeYbymL2g2 & 4294967295L))) | (Float.floatToRawIntBits((int) (jMo25635getSizeYbymL2g2 >> 32)) << 32))));
            int iM27027getXimpl2 = i10 - IntOffset.m27027getXimpl(jM27044roundk4lQ0M2);
            if (iM27027getXimpl2 < 0) {
                iM27027getXimpl2 = 0;
            }
            int iM27028getYimpl2 = i11 - IntOffset.m27028getYimpl(jM27044roundk4lQ0M2);
            int i12 = iM27028getYimpl2 >= 0 ? iM27028getYimpl2 : 0;
            if (iM27027getXimpl != 0 || iM27028getYimpl != 0 || iM27027getXimpl2 != 0 || i12 != 0) {
                return (T) interfaceC10576r.invoke(Integer.valueOf(iM27027getXimpl), Integer.valueOf(iM27028getYimpl), Integer.valueOf(iM27027getXimpl2), Integer.valueOf(i12));
            }
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int obtainMeasureSpec(int i10, int i11, int i12) {
        return (i12 >= 0 || i10 == i11) ? View.MeasureSpec.makeMeasureSpec(AbstractC8323h.m13518m(i12, i10, i11), BasicMeasure.EXACTLY) : (i12 != -2 || i11 == Integer.MAX_VALUE) ? (i12 != -1 || i11 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i11, BasicMeasure.EXACTLY) : View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
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

    public final InterfaceC10570l getOnDensityChanged$ui_release() {
        return this.onDensityChanged;
    }

    public final InterfaceC10570l getOnModifierChanged$ui_release() {
        return this.onModifierChanged;
    }

    public final InterfaceC10570l getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    public final InterfaceC10559a getRelease() {
        return this.release;
    }

    public final InterfaceC10559a getReset() {
        return this.reset;
    }

    public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    public final InterfaceC10559a getUpdate() {
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
        final InterfaceC10559a interfaceC10559a = this.runInvalidate;
        view.postOnAnimation(new Runnable() { // from class: androidx.compose.ui.viewinterop.a
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC10559a.invoke();
            }
        });
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.view.isNestedScrollingEnabled();
    }

    @Override // androidx.compose.p013ui.node.OwnerScope
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
        AbstractC8839h.m14861d(this.dispatcher.getCoroutineScope(), null, null, new C31661(z10, this, VelocityKt.Velocity(AndroidViewHolder_androidKt.toComposeVelocity(f10), AndroidViewHolder_androidKt.toComposeVelocity(f11)), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC8839h.m14861d(this.dispatcher.getCoroutineScope(), null, null, new C31671(VelocityKt.Velocity(AndroidViewHolder_androidKt.toComposeVelocity(f10), AndroidViewHolder_androidKt.toComposeVelocity(f11)), null), 3, null);
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            float composeOffset = AndroidViewHolder_androidKt.toComposeOffset(i10);
            float composeOffset2 = AndroidViewHolder_androidKt.toComposeOffset(i11);
            long jM25378dispatchPreScrollOzD1aCk = nestedScrollDispatcher.m25378dispatchPreScrollOzD1aCk(Offset.m24027constructorimpl((Float.floatToRawIntBits(composeOffset2) & 4294967295L) | (Float.floatToRawIntBits(composeOffset) << 32)), AndroidViewHolder_androidKt.toNestedScrollSource(i12));
            iArr[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jM25378dispatchPreScrollOzD1aCk >> 32)));
            iArr[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jM25378dispatchPreScrollOzD1aCk & 4294967295L)));
        }
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            float composeOffset = AndroidViewHolder_androidKt.toComposeOffset(i10);
            float composeOffset2 = AndroidViewHolder_androidKt.toComposeOffset(i11);
            long jM24027constructorimpl = Offset.m24027constructorimpl((Float.floatToRawIntBits(composeOffset2) & 4294967295L) | (Float.floatToRawIntBits(composeOffset) << 32));
            float composeOffset3 = AndroidViewHolder_androidKt.toComposeOffset(i12);
            float composeOffset4 = AndroidViewHolder_androidKt.toComposeOffset(i13);
            long jM25376dispatchPostScrollDzOQY0M = nestedScrollDispatcher.m25376dispatchPostScrollDzOQY0M(jM24027constructorimpl, Offset.m24027constructorimpl((Float.floatToRawIntBits(composeOffset4) & 4294967295L) | (Float.floatToRawIntBits(composeOffset3) << 32)), AndroidViewHolder_androidKt.toNestedScrollSource(i14));
            iArr[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jM25376dispatchPostScrollDzOQY0M >> 32)));
            iArr[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jM25376dispatchPostScrollDzOQY0M & 4294967295L)));
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
        InterfaceC10570l interfaceC10570l = this.onRequestDisallowInterceptTouchEvent;
        if (interfaceC10570l != null) {
            interfaceC10570l.invoke(Boolean.valueOf(z10));
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void setDensity(Density density) {
        if (density != this.density) {
            this.density = density;
            InterfaceC10570l interfaceC10570l = this.onDensityChanged;
            if (interfaceC10570l != null) {
                interfaceC10570l.invoke(density);
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
            InterfaceC10570l interfaceC10570l = this.onModifierChanged;
            if (interfaceC10570l != null) {
                interfaceC10570l.invoke(modifier);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(InterfaceC10570l interfaceC10570l) {
        this.onDensityChanged = interfaceC10570l;
    }

    public final void setOnModifierChanged$ui_release(InterfaceC10570l interfaceC10570l) {
        this.onModifierChanged = interfaceC10570l;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(InterfaceC10570l interfaceC10570l) {
        this.onRequestDisallowInterceptTouchEvent = interfaceC10570l;
    }

    public final void setRelease(InterfaceC10559a interfaceC10559a) {
        this.release = interfaceC10559a;
    }

    public final void setReset(InterfaceC10559a interfaceC10559a) {
        this.reset = interfaceC10559a;
    }

    public final void setSavedStateRegistryOwner(SavedStateRegistryOwner savedStateRegistryOwner) {
        if (savedStateRegistryOwner != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = savedStateRegistryOwner;
            ViewTreeSavedStateRegistryOwner.set(this, savedStateRegistryOwner);
        }
    }

    public final void setUpdate(InterfaceC10559a interfaceC10559a) {
        this.update = interfaceC10559a;
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
            long jM24027constructorimpl = Offset.m24027constructorimpl((Float.floatToRawIntBits(composeOffset2) & 4294967295L) | (Float.floatToRawIntBits(composeOffset) << 32));
            float composeOffset3 = AndroidViewHolder_androidKt.toComposeOffset(i12);
            float composeOffset4 = AndroidViewHolder_androidKt.toComposeOffset(i13);
            nestedScrollDispatcher.m25376dispatchPostScrollDzOQY0M(jM24027constructorimpl, Offset.m24027constructorimpl((Float.floatToRawIntBits(composeOffset4) & 4294967295L) | (Float.floatToRawIntBits(composeOffset3) << 32)), AndroidViewHolder_androidKt.toNestedScrollSource(i14));
        }
    }
}
