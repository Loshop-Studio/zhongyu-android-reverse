package androidx.compose.animation;

import androidx.collection.AbstractC0584a;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.graphics.ClipOp;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.layer.GraphicsLayer;
import androidx.compose.p011ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.unit.IntSizeKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001c\u001a\u00020\u0019ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u0016H\u0016¢\u0006\u0004\b \u0010\u001eR\"\u0010!\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R+\u0010\u0011\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u00108V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R+\u0010\r\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u0010$\"\u0004\b1\u0010&R+\u0010\u0004\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010/\u001a\u0004\b3\u00104\"\u0004\b5\u00106R+\u0010\u0006\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b7\u0010/\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R+\u0010\b\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010/\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R+\u0010\n\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bA\u0010/\u001a\u0004\bB\u0010$\"\u0004\bC\u0010&R+\u0010\f\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010/\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bI\u0010/\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010O\u001a\u0004\u0018\u00010N8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR*\u0010W\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010V0U8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010]\u001a\u0004\u0018\u00010\u00008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR/\u0010i\u001a\u0004\u0018\u00010c2\b\u0010'\u001a\u0004\u0018\u00010c8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bd\u0010/\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u0017\u0010l\u001a\u00020j8Fø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\u001a\u0004\bk\u0010\u001bR\u0011\u0010n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bm\u0010$R\u0014\u0010p\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bo\u0010$R\u0011\u0010r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bq\u0010$R\u0014\u0010t\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bs\u0010$\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006u"}, m5110d2 = {"Landroidx/compose/animation/SharedElementInternalState;", "Landroidx/compose/animation/LayerRenderer;", "Landroidx/compose/runtime/RememberObserver;", "Landroidx/compose/animation/SharedElement;", "sharedElement", "Landroidx/compose/animation/BoundsAnimation;", "boundsAnimation", "Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "placeHolderSize", "", "renderOnlyWhenVisible", "Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "overlayClip", "renderInOverlayDuringTransition", "Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "userState", "", "zIndex", "<init>", "(Landroidx/compose/animation/SharedElement;Landroidx/compose/animation/BoundsAnimation;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZLandroidx/compose/animation/SharedTransitionScope$OverlayClip;ZLandroidx/compose/animation/SharedTransitionScope$SharedContentState;F)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawScope", "Ld6/s;", "drawInOverlay", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "Landroidx/compose/ui/geometry/Offset;", "calculateLookaheadOffset-F1C5BW0", "()J", "calculateLookaheadOffset", "onRemembered", "()V", "onForgotten", "onAbandoned", "firstFrameDrawn", "Z", "getFirstFrameDrawn$animation_release", "()Z", "setFirstFrameDrawn$animation_release", "(Z)V", "<set-?>", "zIndex$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getZIndex", "()F", "setZIndex", "(F)V", "renderInOverlayDuringTransition$delegate", "Landroidx/compose/runtime/MutableState;", "getRenderInOverlayDuringTransition", "setRenderInOverlayDuringTransition", "sharedElement$delegate", "getSharedElement", "()Landroidx/compose/animation/SharedElement;", "setSharedElement", "(Landroidx/compose/animation/SharedElement;)V", "boundsAnimation$delegate", "getBoundsAnimation", "()Landroidx/compose/animation/BoundsAnimation;", "setBoundsAnimation", "(Landroidx/compose/animation/BoundsAnimation;)V", "placeHolderSize$delegate", "getPlaceHolderSize", "()Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "setPlaceHolderSize", "(Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;)V", "renderOnlyWhenVisible$delegate", "getRenderOnlyWhenVisible", "setRenderOnlyWhenVisible", "overlayClip$delegate", "getOverlayClip", "()Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "setOverlayClip", "(Landroidx/compose/animation/SharedTransitionScope$OverlayClip;)V", "userState$delegate", "getUserState", "()Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "setUserState", "(Landroidx/compose/animation/SharedTransitionScope$SharedContentState;)V", "Landroidx/compose/ui/graphics/Path;", "clipPathInOverlay", "Landroidx/compose/ui/graphics/Path;", "getClipPathInOverlay$animation_release", "()Landroidx/compose/ui/graphics/Path;", "setClipPathInOverlay$animation_release", "(Landroidx/compose/ui/graphics/Path;)V", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "lookaheadCoords", "Lr6/a;", "getLookaheadCoords", "()Lr6/a;", "setLookaheadCoords", "(Lr6/a;)V", "parentState", "Landroidx/compose/animation/SharedElementInternalState;", "getParentState", "()Landroidx/compose/animation/SharedElementInternalState;", "setParentState", "(Landroidx/compose/animation/SharedElementInternalState;)V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer$delegate", "getLayer", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "setLayer", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "layer", "Landroidx/compose/ui/geometry/Size;", "getNonNullLookaheadSize-NH-jbRc", "nonNullLookaheadSize", "getTarget", TypedValues.AttributesType.S_TARGET, "getShouldRenderInOverlay$animation_release", "shouldRenderInOverlay", "getShouldRenderInPlace", "shouldRenderInPlace", "getShouldRenderBasedOnTarget", "shouldRenderBasedOnTarget", "animation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSharedElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedElement.kt\nandroidx/compose/animation/SharedElementInternalState\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,247:1\n79#2:248\n112#2,2:249\n85#3:251\n113#3,2:252\n85#3:254\n113#3,2:255\n85#3:257\n113#3,2:258\n85#3:260\n113#3,2:261\n85#3:263\n113#3,2:264\n85#3:266\n113#3,2:267\n85#3:269\n113#3,2:270\n85#3:312\n113#3,2:313\n1#4:272\n71#5:273\n65#5:274\n73#5:277\n69#5:278\n60#6:275\n70#6:279\n22#7:276\n221#8,5:280\n249#8,9:285\n120#8,7:294\n259#8,4:301\n120#8,7:305\n*S KotlinDebug\n*F\n+ 1 SharedElement.kt\nandroidx/compose/animation/SharedElementInternalState\n*L\n174#1:248\n174#1:249,2\n176#1:251\n176#1:252,2\n177#1:254\n177#1:255,2\n178#1:257\n178#1:258,2\n179#1:260\n179#1:261,2\n180#1:263\n180#1:264,2\n181#1:266\n181#1:267,2\n182#1:269\n182#1:270,2\n223#1:312\n223#1:313,2\n194#1:273\n194#1:274\n194#1:277\n194#1:278\n194#1:275\n194#1:279\n194#1:276\n195#1:280,5\n195#1:285,9\n195#1:294,7\n195#1:301,4\n196#1:305,7\n*E\n"})
/* loaded from: classes.dex */
public final class SharedElementInternalState implements LayerRenderer, RememberObserver {
    public static final int $stable = 8;

    /* renamed from: boundsAnimation$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState boundsAnimation;

    @Nullable
    private Path clipPathInOverlay;
    private boolean firstFrameDrawn;

    /* renamed from: overlayClip$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState overlayClip;

    @Nullable
    private SharedElementInternalState parentState;

    /* renamed from: placeHolderSize$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState placeHolderSize;

    /* renamed from: renderInOverlayDuringTransition$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState renderInOverlayDuringTransition;

    /* renamed from: renderOnlyWhenVisible$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState renderOnlyWhenVisible;

    /* renamed from: sharedElement$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState sharedElement;

    /* renamed from: userState$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState userState;

    /* renamed from: zIndex$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState zIndex;

    @NotNull
    private InterfaceC6469a lookaheadCoords = new InterfaceC6469a() { // from class: androidx.compose.animation.SharedElementInternalState$lookaheadCoords$1
        @Override // p152r6.InterfaceC6469a
        public final Void invoke() {
            return null;
        }
    };

    /* renamed from: layer$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState layer = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    public SharedElementInternalState(@NotNull SharedElement sharedElement, @NotNull BoundsAnimation boundsAnimation, @NotNull SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z8, @NotNull SharedTransitionScope.OverlayClip overlayClip, boolean z9, @NotNull SharedTransitionScope.SharedContentState sharedContentState, float f) {
        this.zIndex = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.renderInOverlayDuringTransition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z9), null, 2, null);
        this.sharedElement = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(sharedElement, null, 2, null);
        this.boundsAnimation = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(boundsAnimation, null, 2, null);
        this.placeHolderSize = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(placeHolderSize, null, 2, null);
        this.renderOnlyWhenVisible = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z8), null, 2, null);
        this.overlayClip = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(overlayClip, null, 2, null);
        this.userState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(sharedContentState, null, 2, null);
    }

    private final boolean getShouldRenderBasedOnTarget() {
        return AbstractC5830k.m5325b(getSharedElement().getTargetBoundsProvider(), this) || !getRenderOnlyWhenVisible();
    }

    /* renamed from: calculateLookaheadOffset-F1C5BW0, reason: not valid java name */
    public final long m6619calculateLookaheadOffsetF1C5BW0() {
        Object objInvoke = this.lookaheadCoords.invoke();
        if (objInvoke == null) {
            throw new IllegalArgumentException("Error: lookahead coordinates is null.");
        }
        return getSharedElement().getScope().getLookaheadRoot$animation_release().mo12042localPositionOfR5De75A((LayoutCoordinates) objInvoke, Offset.INSTANCE.m10457getZeroF1C5BW0());
    }

    @Override // androidx.compose.animation.LayerRenderer
    public void drawInOverlay(@NotNull DrawScope drawScope) {
        GraphicsLayer layer = getLayer();
        if (layer != null && this.firstFrameDrawn && getShouldRenderInOverlay$animation_release()) {
            if (getSharedElement().getCurrentBounds() == null) {
                throw new IllegalArgumentException("Error: current bounds not set yet.");
            }
            Rect currentBounds = getSharedElement().getCurrentBounds();
            C5443s c5443s = null;
            Offset offsetM10430boximpl = currentBounds != null ? Offset.m10430boximpl(currentBounds.m10476getTopLeftF1C5BW0()) : null;
            AbstractC5830k.m5327d(offsetM10430boximpl);
            long jM10451unboximpl = offsetM10430boximpl.m10451unboximpl();
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jM10451unboximpl >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM10451unboximpl & 4294967295L));
            Path path = this.clipPathInOverlay;
            if (path != null) {
                int iM10671getIntersectrtfAjoo = ClipOp.INSTANCE.m10671getIntersectrtfAjoo();
                DrawContext drawContext = drawScope.getDrawContext();
                long jMo11154getSizeNHjbRc = drawContext.mo11154getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo11156clipPathmtrdDE(path, iM10671getIntersectrtfAjoo);
                    drawScope.getDrawContext().getTransform().translate(fIntBitsToFloat, fIntBitsToFloat2);
                    try {
                        GraphicsLayerKt.drawLayer(drawScope, layer);
                        AbstractC0584a.m921v(drawContext, jMo11154getSizeNHjbRc);
                        c5443s = C5443s.f8405a;
                    } finally {
                    }
                } catch (Throwable th) {
                    AbstractC0584a.m921v(drawContext, jMo11154getSizeNHjbRc);
                    throw th;
                }
            }
            if (c5443s == null) {
                drawScope.getDrawContext().getTransform().translate(fIntBitsToFloat, fIntBitsToFloat2);
                try {
                    GraphicsLayerKt.drawLayer(drawScope, layer);
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final BoundsAnimation getBoundsAnimation() {
        return (BoundsAnimation) this.boundsAnimation.getValue();
    }

    @Nullable
    /* renamed from: getClipPathInOverlay$animation_release, reason: from getter */
    public final Path getClipPathInOverlay() {
        return this.clipPathInOverlay;
    }

    /* renamed from: getFirstFrameDrawn$animation_release, reason: from getter */
    public final boolean getFirstFrameDrawn() {
        return this.firstFrameDrawn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final GraphicsLayer getLayer() {
        return (GraphicsLayer) this.layer.getValue();
    }

    @NotNull
    public final InterfaceC6469a getLookaheadCoords() {
        return this.lookaheadCoords;
    }

    /* renamed from: getNonNullLookaheadSize-NH-jbRc, reason: not valid java name */
    public final long m6620getNonNullLookaheadSizeNHjbRc() {
        Object objInvoke = this.lookaheadCoords.invoke();
        if (objInvoke != null) {
            return IntSizeKt.m13488toSizeozmzZPI(((LayoutCoordinates) objInvoke).mo12041getSizeYbymL2g());
        }
        throw new IllegalArgumentException(("Error: lookahead coordinates is null for " + getSharedElement().getKey() + '.').toString());
    }

    @NotNull
    public final SharedTransitionScope.OverlayClip getOverlayClip() {
        return (SharedTransitionScope.OverlayClip) this.overlayClip.getValue();
    }

    @Override // androidx.compose.animation.LayerRenderer
    @Nullable
    public SharedElementInternalState getParentState() {
        return this.parentState;
    }

    @NotNull
    public final SharedTransitionScope.PlaceHolderSize getPlaceHolderSize() {
        return (SharedTransitionScope.PlaceHolderSize) this.placeHolderSize.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getRenderInOverlayDuringTransition() {
        return ((Boolean) this.renderInOverlayDuringTransition.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getRenderOnlyWhenVisible() {
        return ((Boolean) this.renderOnlyWhenVisible.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final SharedElement getSharedElement() {
        return (SharedElement) this.sharedElement.getValue();
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
    @NotNull
    public final SharedTransitionScope.SharedContentState getUserState() {
        return (SharedTransitionScope.SharedContentState) this.userState.getValue();
    }

    @Override // androidx.compose.animation.LayerRenderer
    public float getZIndex() {
        return this.zIndex.getFloatValue();
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

    public final void setBoundsAnimation(@NotNull BoundsAnimation boundsAnimation) {
        this.boundsAnimation.setValue(boundsAnimation);
    }

    public final void setClipPathInOverlay$animation_release(@Nullable Path path) {
        this.clipPathInOverlay = path;
    }

    public final void setFirstFrameDrawn$animation_release(boolean z8) {
        this.firstFrameDrawn = z8;
    }

    public final void setLayer(@Nullable GraphicsLayer graphicsLayer) {
        this.layer.setValue(graphicsLayer);
    }

    public final void setLookaheadCoords(@NotNull InterfaceC6469a interfaceC6469a) {
        this.lookaheadCoords = interfaceC6469a;
    }

    public final void setOverlayClip(@NotNull SharedTransitionScope.OverlayClip overlayClip) {
        this.overlayClip.setValue(overlayClip);
    }

    public void setParentState(@Nullable SharedElementInternalState sharedElementInternalState) {
        this.parentState = sharedElementInternalState;
    }

    public final void setPlaceHolderSize(@NotNull SharedTransitionScope.PlaceHolderSize placeHolderSize) {
        this.placeHolderSize.setValue(placeHolderSize);
    }

    public final void setRenderInOverlayDuringTransition(boolean z8) {
        this.renderInOverlayDuringTransition.setValue(Boolean.valueOf(z8));
    }

    public final void setRenderOnlyWhenVisible(boolean z8) {
        this.renderOnlyWhenVisible.setValue(Boolean.valueOf(z8));
    }

    public final void setSharedElement(@NotNull SharedElement sharedElement) {
        this.sharedElement.setValue(sharedElement);
    }

    public final void setUserState(@NotNull SharedTransitionScope.SharedContentState sharedContentState) {
        this.userState.setValue(sharedContentState);
    }

    public void setZIndex(float f) {
        this.zIndex.setFloatValue(f);
    }
}
