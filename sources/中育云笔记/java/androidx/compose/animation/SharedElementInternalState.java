package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.graphics.ClipOp;
import androidx.compose.p014ui.graphics.Path;
import androidx.compose.p014ui.graphics.drawscope.DrawContext;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.graphics.layer.GraphicsLayer;
import androidx.compose.p014ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.unit.IntSizeKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SharedElementInternalState implements LayerRenderer, RememberObserver {
    public static final int $stable = 8;
    private final MutableState boundsAnimation$delegate;
    private Path clipPathInOverlay;
    private boolean firstFrameDrawn;
    private final MutableState overlayClip$delegate;
    private SharedElementInternalState parentState;
    private final MutableState placeHolderSize$delegate;
    private final MutableState renderInOverlayDuringTransition$delegate;
    private final MutableState renderOnlyWhenVisible$delegate;
    private final MutableState sharedElement$delegate;
    private final MutableState userState$delegate;
    private final MutableFloatState zIndex$delegate;
    private InterfaceC9529a lookaheadCoords = new InterfaceC9529a() { // from class: androidx.compose.animation.SharedElementInternalState$lookaheadCoords$1
        @Override // p181hd.InterfaceC9529a
        public final Void invoke() {
            return null;
        }
    };
    private final MutableState layer$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    public SharedElementInternalState(SharedElement sharedElement, BoundsAnimation boundsAnimation, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z10, SharedTransitionScope.OverlayClip overlayClip, boolean z11, SharedTransitionScope.SharedContentState sharedContentState, float f10) {
        this.zIndex$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f10);
        this.renderInOverlayDuringTransition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z11), null, 2, null);
        this.sharedElement$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(sharedElement, null, 2, null);
        this.boundsAnimation$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(boundsAnimation, null, 2, null);
        this.placeHolderSize$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(placeHolderSize, null, 2, null);
        this.renderOnlyWhenVisible$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z10), null, 2, null);
        this.overlayClip$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(overlayClip, null, 2, null);
        this.userState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(sharedContentState, null, 2, null);
    }

    private final boolean getShouldRenderBasedOnTarget() {
        return AbstractC9979u.m20289b(getSharedElement().getTargetBoundsProvider$animation_release(), this) || !getRenderOnlyWhenVisible();
    }

    /* renamed from: calculateLookaheadOffset-F1C5BW0, reason: not valid java name */
    public final long m26815calculateLookaheadOffsetF1C5BW0() {
        Object objInvoke = this.lookaheadCoords.invoke();
        if (objInvoke == null) {
            throw new IllegalArgumentException("Error: lookahead coordinates is null.");
        }
        return getSharedElement().getScope().getLookaheadRoot$animation_release().mo32238localPositionOfR5De75A((LayoutCoordinates) objInvoke, Offset.Companion.m30653getZeroF1C5BW0());
    }

    @Override // androidx.compose.animation.LayerRenderer
    public void drawInOverlay(DrawScope drawScope) {
        GraphicsLayer layer = getLayer();
        if (layer != null && this.firstFrameDrawn && getShouldRenderInOverlay$animation_release()) {
            if (getSharedElement().getCurrentBounds() == null) {
                throw new IllegalArgumentException("Error: current bounds not set yet.");
            }
            Rect currentBounds = getSharedElement().getCurrentBounds();
            C10786q c10786q = null;
            Offset offsetM30626boximpl = currentBounds != null ? Offset.m30626boximpl(currentBounds.m30672getTopLeftF1C5BW0()) : null;
            AbstractC9979u.m20291d(offsetM30626boximpl);
            long jM30647unboximpl = offsetM30626boximpl.m30647unboximpl();
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jM30647unboximpl >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM30647unboximpl & 4294967295L));
            Path path = this.clipPathInOverlay;
            if (path != null) {
                int iM30867getIntersectrtfAjoo = ClipOp.Companion.m30867getIntersectrtfAjoo();
                DrawContext drawContext = drawScope.getDrawContext();
                long jMo31350getSizeNHjbRc = drawContext.mo31350getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo31352clipPathmtrdDE(path, iM30867getIntersectrtfAjoo);
                    drawScope.getDrawContext().getTransform().translate(fIntBitsToFloat, fIntBitsToFloat2);
                    try {
                        GraphicsLayerKt.drawLayer(drawScope, layer);
                        drawContext.getCanvas().restore();
                        drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
                        c10786q = C10786q.f26013a;
                    } finally {
                    }
                } catch (Throwable th) {
                    drawContext.getCanvas().restore();
                    drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
                    throw th;
                }
            }
            if (c10786q == null) {
                drawScope.getDrawContext().getTransform().translate(fIntBitsToFloat, fIntBitsToFloat2);
                try {
                    GraphicsLayerKt.drawLayer(drawScope, layer);
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BoundsAnimation getBoundsAnimation() {
        return (BoundsAnimation) this.boundsAnimation$delegate.getValue();
    }

    public final Path getClipPathInOverlay$animation_release() {
        return this.clipPathInOverlay;
    }

    public final boolean getFirstFrameDrawn$animation_release() {
        return this.firstFrameDrawn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final GraphicsLayer getLayer() {
        return (GraphicsLayer) this.layer$delegate.getValue();
    }

    public final InterfaceC9529a getLookaheadCoords() {
        return this.lookaheadCoords;
    }

    /* renamed from: getNonNullLookaheadSize-NH-jbRc, reason: not valid java name */
    public final long m26816getNonNullLookaheadSizeNHjbRc() {
        Object objInvoke = this.lookaheadCoords.invoke();
        if (objInvoke != null) {
            return IntSizeKt.m33684toSizeozmzZPI(((LayoutCoordinates) objInvoke).mo32237getSizeYbymL2g());
        }
        throw new IllegalArgumentException(("Error: lookahead coordinates is null for " + getSharedElement().getKey() + '.').toString());
    }

    public final SharedTransitionScope.OverlayClip getOverlayClip() {
        return (SharedTransitionScope.OverlayClip) this.overlayClip$delegate.getValue();
    }

    @Override // androidx.compose.animation.LayerRenderer
    public SharedElementInternalState getParentState() {
        return this.parentState;
    }

    public final SharedTransitionScope.PlaceHolderSize getPlaceHolderSize() {
        return (SharedTransitionScope.PlaceHolderSize) this.placeHolderSize$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getRenderInOverlayDuringTransition() {
        return ((Boolean) this.renderInOverlayDuringTransition$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getRenderOnlyWhenVisible() {
        return ((Boolean) this.renderOnlyWhenVisible$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SharedElement getSharedElement() {
        return (SharedElement) this.sharedElement$delegate.getValue();
    }

    public final boolean getShouldRenderInOverlay$animation_release() {
        return getShouldRenderBasedOnTarget() && getSharedElement().getFoundMatch() && getRenderInOverlayDuringTransition();
    }

    public final boolean getShouldRenderInPlace() {
        if (getSharedElement().getFoundMatch()) {
            return !getShouldRenderInOverlay$animation_release() && getShouldRenderBasedOnTarget();
        }
        return true;
    }

    public final boolean getTarget() {
        return getBoundsAnimation().getTarget();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SharedTransitionScope.SharedContentState getUserState() {
        return (SharedTransitionScope.SharedContentState) this.userState$delegate.getValue();
    }

    @Override // androidx.compose.animation.LayerRenderer
    public float getZIndex() {
        return this.zIndex$delegate.getFloatValue();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        getSharedElement().getScope().onStateRemoved$animation_release(this);
        getSharedElement().updateTargetBoundsProvider();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        getSharedElement().getScope().onStateAdded$animation_release(this);
        getSharedElement().updateTargetBoundsProvider();
    }

    public final void setBoundsAnimation(BoundsAnimation boundsAnimation) {
        this.boundsAnimation$delegate.setValue(boundsAnimation);
    }

    public final void setClipPathInOverlay$animation_release(Path path) {
        this.clipPathInOverlay = path;
    }

    public final void setFirstFrameDrawn$animation_release(boolean z10) {
        this.firstFrameDrawn = z10;
    }

    public final void setLayer(GraphicsLayer graphicsLayer) {
        this.layer$delegate.setValue(graphicsLayer);
    }

    public final void setLookaheadCoords(InterfaceC9529a interfaceC9529a) {
        this.lookaheadCoords = interfaceC9529a;
    }

    public final void setOverlayClip(SharedTransitionScope.OverlayClip overlayClip) {
        this.overlayClip$delegate.setValue(overlayClip);
    }

    public void setParentState(SharedElementInternalState sharedElementInternalState) {
        this.parentState = sharedElementInternalState;
    }

    public final void setPlaceHolderSize(SharedTransitionScope.PlaceHolderSize placeHolderSize) {
        this.placeHolderSize$delegate.setValue(placeHolderSize);
    }

    public final void setRenderInOverlayDuringTransition(boolean z10) {
        this.renderInOverlayDuringTransition$delegate.setValue(Boolean.valueOf(z10));
    }

    public final void setRenderOnlyWhenVisible(boolean z10) {
        this.renderOnlyWhenVisible$delegate.setValue(Boolean.valueOf(z10));
    }

    public final void setSharedElement(SharedElement sharedElement) {
        this.sharedElement$delegate.setValue(sharedElement);
    }

    public final void setUserState(SharedTransitionScope.SharedContentState sharedContentState) {
        this.userState$delegate.setValue(sharedContentState);
    }

    public void setZIndex(float f10) {
        this.zIndex$delegate.setFloatValue(f10);
    }
}
