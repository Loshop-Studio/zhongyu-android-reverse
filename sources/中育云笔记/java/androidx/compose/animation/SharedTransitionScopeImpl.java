package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.graphics.AndroidPath_androidKt;
import androidx.compose.p014ui.graphics.OutlineKt;
import androidx.compose.p014ui.graphics.Path;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.layout.LookaheadScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.AbstractC9923a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC9962d0;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p309qc.InterfaceC10773d;
import p325rc.AbstractC10935a0;
import p364uc.AbstractC11382b;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;

@ExperimentalSharedTransitionApi
@Stable
/* loaded from: classes.dex */
public final class SharedTransitionScopeImpl implements SharedTransitionScope, LookaheadScope {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC10773d SharedTransitionObserver$delegate = AbstractC9923a.m20069b(LazyThreadSafetyMode.f23258e, new InterfaceC9529a() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$Companion$SharedTransitionObserver$2
        @Override // p181hd.InterfaceC9529a
        public final SnapshotStateObserver invoke() {
            SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(new InterfaceC9540l() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$Companion$SharedTransitionObserver$2.1
                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((InterfaceC9529a) obj);
                    return C10786q.f26013a;
                }

                public final void invoke(InterfaceC9529a interfaceC9529a) {
                    interfaceC9529a.invoke();
                }
            });
            snapshotStateObserver.start();
            return snapshotStateObserver;
        }
    });
    private final /* synthetic */ LookaheadScope $$delegate_0;
    private final InterfaceC11122i0 coroutineScope;
    private boolean disposed;
    private LayoutCoordinates nullableLookaheadRoot;
    public LayoutCoordinates root;
    private final MutableState isTransitionActive$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    private final InterfaceC9529a observeAnimatingBlock = new InterfaceC9529a() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$observeAnimatingBlock$1
        {
            super(0);
        }

        @Override // p181hd.InterfaceC9529a
        public /* bridge */ /* synthetic */ Object invoke() {
            m26819invoke();
            return C10786q.f26013a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m26819invoke() {
            MutableScatterMap mutableScatterMap = this.this$0.sharedElements;
            Object[] objArr = mutableScatterMap.keys;
            Object[] objArr2 = mutableScatterMap.values;
            long[] jArr = mutableScatterMap.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj = objArr[i13];
                            if (((SharedElement) objArr2[i13]).isAnimating()) {
                                return;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return;
                    }
                }
                if (i10 == length) {
                    return;
                } else {
                    i10++;
                }
            }
        }
    };
    private final InterfaceC9540l updateTransitionActiveness = new InterfaceC9540l() { // from class: androidx.compose.animation.SharedTransitionScopeImpl.updateTransitionActiveness.1
        {
            super(1);
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SharedTransitionScope) obj);
            return C10786q.f26013a;
        }

        public final void invoke(SharedTransitionScope sharedTransitionScope) {
            SharedTransitionScopeImpl.this.updateTransitionActiveness();
        }
    };
    private final SnapshotStateList<LayerRenderer> renderers = SnapshotStateKt.mutableStateListOf();
    private final MutableScatterMap<Object, SharedElement> sharedElements = new MutableScatterMap<>(0, 1, null);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final SnapshotStateObserver getSharedTransitionObserver() {
            return (SnapshotStateObserver) SharedTransitionScopeImpl.SharedTransitionObserver$delegate.getValue();
        }

        private Companion() {
        }
    }

    public static final class ShapeBasedClip implements SharedTransitionScope.OverlayClip {
        private final Shape clipShape;
        private final Path path = AndroidPath_androidKt.Path();

        public ShapeBasedClip(Shape shape) {
            this.clipShape = shape;
        }

        @Override // androidx.compose.animation.SharedTransitionScope.OverlayClip
        public Path getClipPath(SharedTransitionScope.SharedContentState sharedContentState, Rect rect, LayoutDirection layoutDirection, Density density) {
            this.path.reset();
            OutlineKt.addOutline(this.path, this.clipShape.mo27009createOutlinePq9zytI(rect.m30670getSizeNHjbRc(), layoutDirection, density));
            this.path.mo30773translatek4lQ0M(rect.m30672getTopLeftF1C5BW0());
            return this.path;
        }

        public final Shape getClipShape() {
            return this.clipShape;
        }
    }

    public SharedTransitionScopeImpl(LookaheadScope lookaheadScope, InterfaceC11122i0 interfaceC11122i0) {
        this.coroutineScope = interfaceC11122i0;
        this.$$delegate_0 = lookaheadScope;
    }

    private final void observeIsAnimating() {
        if (this.disposed) {
            return;
        }
        Companion.getSharedTransitionObserver().observeReads(this, this.updateTransitionActiveness, this.observeAnimatingBlock);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public final SharedElementInternalState rememberSharedElementState(SharedElement sharedElement, BoundsAnimation boundsAnimation, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z10, SharedTransitionScope.SharedContentState sharedContentState, SharedTransitionScope.OverlayClip overlayClip, float f10, boolean z11, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2066772852, i10, -1, "androidx.compose.animation.SharedTransitionScopeImpl.rememberSharedElementState (SharedTransitionScope.kt:991)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new SharedElementInternalState(sharedElement, boundsAnimation, placeHolderSize, z10, overlayClip, z11, sharedContentState, f10);
            composer.updateRememberedValue(objRememberedValue);
        }
        SharedElementInternalState sharedElementInternalState = (SharedElementInternalState) objRememberedValue;
        sharedContentState.setInternalState$animation_release(sharedElementInternalState);
        sharedElementInternalState.setSharedElement(sharedElement);
        sharedElementInternalState.setRenderOnlyWhenVisible(z10);
        sharedElementInternalState.setBoundsAnimation(boundsAnimation);
        sharedElementInternalState.setPlaceHolderSize(placeHolderSize);
        sharedElementInternalState.setOverlayClip(overlayClip);
        sharedElementInternalState.setZIndex(f10);
        sharedElementInternalState.setRenderInOverlayDuringTransition(z11);
        sharedElementInternalState.setUserState(sharedContentState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return sharedElementInternalState;
    }

    private void setTransitionActive(boolean z10) {
        this.isTransitionActive$delegate.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Modifier sharedBoundsImpl(Modifier modifier, final SharedTransitionScope.SharedContentState sharedContentState, final Transition<T> transition, final InterfaceC9540l interfaceC9540l, final BoundsTransform boundsTransform, final SharedTransitionScope.PlaceHolderSize placeHolderSize, final boolean z10, final boolean z11, final float f10, final SharedTransitionScope.OverlayClip overlayClip) {
        return ComposedModifierKt.composed$default(modifier, null, new InterfaceC9545q() { // from class: androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i10) {
                Transition transitionRememberTransition;
                Composer composer2 = composer;
                composer.startReplaceGroup(-1843478929);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1843478929, i10, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous> (SharedTransitionScope.kt:915)");
                }
                Object key = sharedContentState.getKey();
                composer.startMovableGroup(-359689844, key);
                SharedTransitionScopeImpl sharedTransitionScopeImpl = this;
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.Companion;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = sharedTransitionScopeImpl.sharedElementsFor(key);
                    composer.updateRememberedValue(objRememberedValue);
                }
                SharedElement sharedElement = (SharedElement) objRememberedValue;
                composer.startMovableGroup(-359686031, transition);
                boolean z12 = false;
                if (transition != null) {
                    composer.startReplaceGroup(1734686048);
                    Transition<T> transition2 = transition;
                    String string = key.toString();
                    InterfaceC9540l interfaceC9540l2 = interfaceC9540l;
                    boolean zChanged = composer.changed(transition2);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = transition2.getCurrentState();
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    if (transition2.isSeeking()) {
                        objRememberedValue2 = transition2.getCurrentState();
                    }
                    composer.startReplaceGroup(1329676753);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1329676753, 0, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SharedTransitionScope.kt:925)");
                    }
                    Boolean bool = (Boolean) interfaceC9540l2.invoke(objRememberedValue2);
                    bool.booleanValue();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    Object targetState = transition2.getTargetState();
                    composer.startReplaceGroup(1329676753);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1329676753, 0, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SharedTransitionScope.kt:925)");
                    }
                    Boolean bool2 = (Boolean) interfaceC9540l2.invoke(targetState);
                    bool2.booleanValue();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    transitionRememberTransition = androidx.compose.animation.core.TransitionKt.createChildTransitionInternal(transition2, bool, bool2, string, composer2, 0);
                    composer2 = composer2;
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(1734936683);
                    InterfaceC9540l interfaceC9540l3 = interfaceC9540l;
                    AbstractC9979u.m20292e(interfaceC9540l3, "null cannot be cast to non-null type kotlin.Function1<kotlin.Unit, kotlin.Boolean>");
                    Boolean bool3 = (Boolean) ((InterfaceC9540l) AbstractC9962d0.m20254e(interfaceC9540l3, 1)).invoke(C10786q.f26013a);
                    boolean zBooleanValue = bool3.booleanValue();
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        if (sharedElement.getCurrentBounds() == null) {
                            z12 = zBooleanValue;
                        } else if (!zBooleanValue) {
                            z12 = true;
                        }
                        objRememberedValue3 = new MutableTransitionState(Boolean.valueOf(z12));
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    MutableTransitionState mutableTransitionState = (MutableTransitionState) objRememberedValue3;
                    mutableTransitionState.setTargetState$animation_core_release(bool3);
                    transitionRememberTransition = androidx.compose.animation.core.TransitionKt.rememberTransition(mutableTransitionState, null, composer, MutableTransitionState.$stable, 2);
                    composer.endReplaceGroup();
                }
                composer.startMovableGroup(-359623378, Boolean.valueOf(this.isTransitionActive()));
                Transition<Boolean>.DeferredAnimation<Rect, AnimationVector4D> deferredAnimationCreateDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transitionRememberTransition, VectorConvertersKt.getVectorConverter(Rect.Companion), null, composer2, 0, 2);
                composer.endMovableGroup();
                boolean zChanged2 = composer.changed(transitionRememberTransition);
                SharedTransitionScopeImpl sharedTransitionScopeImpl2 = this;
                BoundsTransform boundsTransform2 = boundsTransform;
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new BoundsAnimation(sharedTransitionScopeImpl2, transitionRememberTransition, deferredAnimationCreateDeferredAnimation, boundsTransform2);
                    composer.updateRememberedValue(objRememberedValue4);
                }
                BoundsAnimation boundsAnimation = (BoundsAnimation) objRememberedValue4;
                boundsAnimation.updateAnimation(deferredAnimationCreateDeferredAnimation, boundsTransform);
                composer.endMovableGroup();
                SharedElementInternalState sharedElementInternalStateRememberSharedElementState = this.rememberSharedElementState(sharedElement, boundsAnimation, placeHolderSize, z10, sharedContentState, overlayClip, f10, z11, composer, 0);
                composer.endMovableGroup();
                Modifier modifierThen = modifier2.then(new SharedBoundsNodeElement(sharedElementInternalStateRememberSharedElementState));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierThen;
            }
        }, 1, null);
    }

    /* renamed from: sharedBoundsWithCallerManagedVisibility$animation_release$default */
    public static /* synthetic */ Modifier m891x75365d0b(SharedTransitionScopeImpl sharedTransitionScopeImpl, Modifier modifier, SharedTransitionScope.SharedContentState sharedContentState, boolean z10, BoundsTransform boundsTransform, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z11, float f10, SharedTransitionScope.OverlayClip overlayClip, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            boundsTransform = SharedTransitionScopeKt.DefaultBoundsTransform;
        }
        BoundsTransform boundsTransform2 = boundsTransform;
        if ((i10 & 8) != 0) {
            placeHolderSize = SharedTransitionScope.PlaceHolderSize.Companion.getContentSize();
        }
        return sharedTransitionScopeImpl.sharedBoundsWithCallerManagedVisibility$animation_release(modifier, sharedContentState, z10, boundsTransform2, placeHolderSize, (i10 & 16) != 0 ? true : z11, (i10 & 32) != 0 ? 0.0f : f10, (i10 & 64) != 0 ? SharedTransitionScopeKt.ParentClip : overlayClip);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedElement sharedElementsFor(Object obj) {
        SharedElement sharedElement = this.sharedElements.get(obj);
        if (sharedElement != null) {
            return sharedElement;
        }
        SharedElement sharedElement2 = new SharedElement(obj, this);
        this.sharedElements.set(obj, sharedElement2);
        return sharedElement2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateTransitionActiveness() {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.SharedTransitionScopeImpl.updateTransitionActiveness():void");
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public SharedTransitionScope.OverlayClip OverlayClip(Shape shape) {
        return new ShapeBasedClip(shape);
    }

    public final void clearObservation$animation_release(Object obj) {
        Companion.getSharedTransitionObserver().clear(obj);
    }

    public final void drawInOverlay$animation_release(ContentDrawScope contentDrawScope) {
        SnapshotStateList<LayerRenderer> snapshotStateList = this.renderers;
        if (snapshotStateList.size() > 1) {
            AbstractC10935a0.m23853A(snapshotStateList, new Comparator() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$drawInOverlay$$inlined$sortBy$1
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    LayerRenderer layerRenderer = (LayerRenderer) t10;
                    LayerRenderer layerRenderer2 = (LayerRenderer) t11;
                    return AbstractC11382b.m25330d(Float.valueOf((layerRenderer.getZIndex() == 0.0f && (layerRenderer instanceof SharedElementInternalState) && ((SharedElementInternalState) layerRenderer).getParentState() == null) ? -1.0f : layerRenderer.getZIndex()), Float.valueOf((layerRenderer2.getZIndex() == 0.0f && (layerRenderer2 instanceof SharedElementInternalState) && ((SharedElementInternalState) layerRenderer2).getParentState() == null) ? -1.0f : layerRenderer2.getZIndex()));
                }
            });
        }
        SnapshotStateList<LayerRenderer> snapshotStateList2 = this.renderers;
        int size = snapshotStateList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            snapshotStateList2.get(i10).drawInOverlay(contentDrawScope);
        }
    }

    public final InterfaceC11122i0 getCoroutineScope() {
        return this.coroutineScope;
    }

    public final boolean getDisposed$animation_release() {
        return this.disposed;
    }

    public final LayoutCoordinates getLookaheadRoot$animation_release() {
        LayoutCoordinates layoutCoordinates = this.nullableLookaheadRoot;
        if (layoutCoordinates != null) {
            return layoutCoordinates;
        }
        throw new IllegalArgumentException("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
    }

    @Override // androidx.compose.p014ui.layout.LookaheadScope
    public LayoutCoordinates getLookaheadScopeCoordinates(Placeable.PlacementScope placementScope) {
        return this.$$delegate_0.getLookaheadScopeCoordinates(placementScope);
    }

    public final LayoutCoordinates getNullableLookaheadRoot$animation_release() {
        return this.nullableLookaheadRoot;
    }

    public final SnapshotStateObserver getObserverForTest$animation_release() {
        return Companion.getSharedTransitionObserver();
    }

    public final LayoutCoordinates getRoot$animation_release() {
        LayoutCoordinates layoutCoordinates = this.root;
        if (layoutCoordinates != null) {
            return layoutCoordinates;
        }
        AbstractC9979u.m20312y("root");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.animation.SharedTransitionScope
    public boolean isTransitionActive() {
        return ((Boolean) this.isTransitionActive$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.p014ui.layout.LookaheadScope
    /* renamed from: localLookaheadPositionOf-au-aQtc, reason: not valid java name */
    public long mo26818localLookaheadPositionOfauaQtc(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j10, boolean z10) {
        return this.$$delegate_0.mo26818localLookaheadPositionOfauaQtc(layoutCoordinates, layoutCoordinates2, j10, z10);
    }

    public final void observeReads$animation_release(SharedElement sharedElement, InterfaceC9540l interfaceC9540l, InterfaceC9529a interfaceC9529a) {
        if (this.disposed) {
            return;
        }
        Companion.getSharedTransitionObserver().observeReads(sharedElement, interfaceC9540l, interfaceC9529a);
    }

    public final void onDispose$animation_release() {
        Companion.getSharedTransitionObserver().clear(this);
        this.disposed = true;
    }

    public final void onLayerRendererCreated$animation_release(LayerRenderer layerRenderer) {
        this.renderers.add(layerRenderer);
    }

    public final void onLayerRendererRemoved$animation_release(LayerRenderer layerRenderer) {
        this.renderers.remove(layerRenderer);
    }

    public final void onStateAdded$animation_release(SharedElementInternalState sharedElementInternalState) {
        SharedElement sharedElement = sharedElementInternalState.getSharedElement();
        sharedElement.addState(sharedElementInternalState);
        this.updateTransitionActiveness.invoke(this);
        sharedElement.getScope().observeIsAnimating();
        Iterator<LayerRenderer> it = this.renderers.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            LayerRenderer next = it.next();
            SharedElementInternalState sharedElementInternalState2 = next instanceof SharedElementInternalState ? (SharedElementInternalState) next : null;
            if (AbstractC9979u.m20289b(sharedElementInternalState2 != null ? sharedElementInternalState2.getSharedElement() : null, sharedElementInternalState.getSharedElement())) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == this.renderers.size() - 1 || i10 == -1) {
            this.renderers.add(sharedElementInternalState);
        } else {
            this.renderers.add(i10 + 1, sharedElementInternalState);
        }
    }

    public final void onStateRemoved$animation_release(SharedElementInternalState sharedElementInternalState) {
        SharedElement sharedElement = sharedElementInternalState.getSharedElement();
        sharedElement.removeState(sharedElementInternalState);
        this.updateTransitionActiveness.invoke(this);
        sharedElement.getScope().observeIsAnimating();
        this.renderers.remove(sharedElementInternalState);
        if (sharedElement.getStates().isEmpty()) {
            AbstractC11117h.m24726d(sharedElement.getScope().coroutineScope, null, null, new SharedTransitionScopeImpl$onStateRemoved$1$1(sharedElement, null), 3, null);
        }
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    @Composable
    public SharedTransitionScope.SharedContentState rememberSharedContentState(Object obj, Composer composer, int i10) {
        composer.startReplaceGroup(799702514);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(799702514, i10, -1, "androidx.compose.animation.SharedTransitionScopeImpl.rememberSharedContentState (SharedTransitionScope.kt:874)");
        }
        boolean zChanged = composer.changed(obj);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new SharedTransitionScope.SharedContentState(obj);
            composer.updateRememberedValue(objRememberedValue);
        }
        SharedTransitionScope.SharedContentState sharedContentState = (SharedTransitionScope.SharedContentState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return sharedContentState;
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public Modifier renderInSharedTransitionScopeOverlay(Modifier modifier, InterfaceC9529a interfaceC9529a, float f10, InterfaceC9544p interfaceC9544p) {
        return modifier.then(new RenderInTransitionOverlayNodeElement(this, interfaceC9529a, f10, interfaceC9544p));
    }

    public final void setNullableLookaheadRoot$animation_release(LayoutCoordinates layoutCoordinates) {
        this.nullableLookaheadRoot = layoutCoordinates;
    }

    public final void setRoot$animation_release(LayoutCoordinates layoutCoordinates) {
        this.root = layoutCoordinates;
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public Modifier sharedBounds(Modifier modifier, final SharedTransitionScope.SharedContentState sharedContentState, final AnimatedVisibilityScope animatedVisibilityScope, final EnterTransition enterTransition, final ExitTransition exitTransition, BoundsTransform boundsTransform, final SharedTransitionScope.ResizeMode resizeMode, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z10, float f10, SharedTransitionScope.OverlayClip overlayClip) {
        return ComposedModifierKt.composed$default(sharedBoundsImpl(modifier, sharedContentState, animatedVisibilityScope.getTransition(), new InterfaceC9540l() { // from class: androidx.compose.animation.SharedTransitionScopeImpl.sharedBounds.1
            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(EnterExitState enterExitState) {
                return Boolean.valueOf(enterExitState == EnterExitState.Visible);
            }
        }, boundsTransform, placeHolderSize, false, z10, f10, overlayClip), null, new InterfaceC9545q() { // from class: androidx.compose.animation.SharedTransitionScopeImpl.sharedBounds.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i10) {
                Modifier modifierCreateContentScaleModifier;
                composer.startReplaceGroup(-419341573);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-419341573, i10, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBounds.<anonymous> (SharedTransitionScope.kt:736)");
                }
                Transition<EnterExitState> transition = animatedVisibilityScope.getTransition();
                EnterTransition enterTransition2 = enterTransition;
                ExitTransition exitTransition2 = exitTransition;
                boolean zChangedInstance = composer.changedInstance(sharedContentState);
                final SharedTransitionScope.SharedContentState sharedContentState2 = sharedContentState;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new InterfaceC9529a() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedBounds$2$1$1
                        {
                            super(0);
                        }

                        @Override // p181hd.InterfaceC9529a
                        public final Boolean invoke() {
                            return Boolean.valueOf(sharedContentState2.isMatchFound());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Modifier modifierCreateModifier = EnterExitTransitionKt.createModifier(transition, enterTransition2, exitTransition2, (InterfaceC9529a) objRememberedValue, "enter/exit for " + sharedContentState.getKey(), composer, 0, 0);
                if (resizeMode instanceof ScaleToBoundsImpl) {
                    composer.startReplaceGroup(-805568624);
                    Modifier.Companion companion = Modifier.Companion;
                    ScaleToBoundsImpl scaleToBoundsImpl = (ScaleToBoundsImpl) resizeMode;
                    boolean zChangedInstance2 = composer.changedInstance(sharedContentState);
                    final SharedTransitionScope.SharedContentState sharedContentState3 = sharedContentState;
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new InterfaceC9529a() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedBounds$2$2$1
                            {
                                super(0);
                            }

                            @Override // p181hd.InterfaceC9529a
                            public final Boolean invoke() {
                                return Boolean.valueOf(sharedContentState3.isMatchFound());
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    modifierCreateContentScaleModifier = SkipToLookaheadNodeKt.createContentScaleModifier(companion, scaleToBoundsImpl, (InterfaceC9529a) objRememberedValue2);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-804951414);
                    composer.endReplaceGroup();
                    modifierCreateContentScaleModifier = Modifier.Companion;
                }
                Modifier modifierThen = modifierCreateModifier.then(modifierCreateContentScaleModifier);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierThen;
            }
        }, 1, null);
    }

    public final Modifier sharedBoundsWithCallerManagedVisibility$animation_release(Modifier modifier, SharedTransitionScope.SharedContentState sharedContentState, final boolean z10, BoundsTransform boundsTransform, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z11, float f10, SharedTransitionScope.OverlayClip overlayClip) {
        return sharedBoundsImpl(modifier, sharedContentState, null, new InterfaceC9540l() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedBoundsWithCallerManagedVisibility$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(C10786q c10786q) {
                return Boolean.valueOf(z10);
            }
        }, boundsTransform, placeHolderSize, false, z11, f10, overlayClip);
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public Modifier sharedElement(Modifier modifier, SharedTransitionScope.SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, BoundsTransform boundsTransform, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z10, float f10, SharedTransitionScope.OverlayClip overlayClip) {
        return sharedBoundsImpl(modifier, sharedContentState, animatedVisibilityScope.getTransition(), new InterfaceC9540l() { // from class: androidx.compose.animation.SharedTransitionScopeImpl.sharedElement.1
            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(EnterExitState enterExitState) {
                return Boolean.valueOf(enterExitState == EnterExitState.Visible);
            }
        }, boundsTransform, placeHolderSize, true, z10, f10, overlayClip);
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public Modifier sharedElementWithCallerManagedVisibility(Modifier modifier, SharedTransitionScope.SharedContentState sharedContentState, final boolean z10, BoundsTransform boundsTransform, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z11, float f10, SharedTransitionScope.OverlayClip overlayClip) {
        return sharedBoundsImpl(modifier, sharedContentState, null, new InterfaceC9540l() { // from class: androidx.compose.animation.SharedTransitionScopeImpl.sharedElementWithCallerManagedVisibility.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(C10786q c10786q) {
                return Boolean.valueOf(z10);
            }
        }, boundsTransform, placeHolderSize, true, z11, f10, overlayClip);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.animation.SharedTransitionScope
    public Modifier skipToLookaheadSize(Modifier modifier) {
        return modifier.then(new SkipToLookaheadElement(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
    }

    @Override // androidx.compose.p014ui.layout.LookaheadScope
    public LayoutCoordinates toLookaheadCoordinates(LayoutCoordinates layoutCoordinates) {
        return this.$$delegate_0.toLookaheadCoordinates(layoutCoordinates);
    }
}
