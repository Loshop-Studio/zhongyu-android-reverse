package androidx.compose.p006ui.graphics;

import androidx.compose.p006ui.geometry.Rect;
import androidx.compose.p006ui.geometry.Size;
import androidx.compose.p006ui.unit.AbstractC1702a;
import androidx.compose.p006ui.unit.Density;
import androidx.compose.p006ui.unit.DensityKt;
import androidx.compose.p006ui.unit.DpRect;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010Y\u001a\u00020ZR\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u00020\nX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R%\u0010\u0019\u001a\u00020\u001aX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0006R\u0014\u0010\"\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0006R\u001a\u0010$\u001a\u00020%X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010+X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001a\u00103\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001a\u00106\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001a\u00109\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001a\u0010<\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001a\u0010?\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR\u001a\u0010B\u001a\u00020CX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR%\u0010H\u001a\u00020IX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\bJ\u0010\f\"\u0004\bK\u0010\u000eR%\u0010L\u001a\u00020\nX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\bM\u0010\f\"\u0004\bN\u0010\u000eR%\u0010O\u001a\u00020PX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\bQ\u0010\f\"\u0004\bR\u0010\u000eR\u001a\u0010S\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\u0006\"\u0004\bU\u0010\bR\u001a\u0010V\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u0006\"\u0004\bX\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006["}, m5175d2 = {"Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "()V", "alpha", "", "getAlpha", "()F", "setAlpha", "(F)V", "ambientShadowColor", "Landroidx/compose/ui/graphics/Color;", "getAmbientShadowColor-0d7_KjU", "()J", "setAmbientShadowColor-8_81llA", "(J)V", "J", "cameraDistance", "getCameraDistance", "setCameraDistance", "clip", "", "getClip", "()Z", "setClip", "(Z)V", "compositingStrategy", "Landroidx/compose/ui/graphics/CompositingStrategy;", "getCompositingStrategy--NrFUSI", "()I", "setCompositingStrategy-aDBOjCE", "(I)V", "I", "density", "getDensity", "fontScale", "getFontScale", "graphicsDensity", "Landroidx/compose/ui/unit/Density;", "getGraphicsDensity$ui_release", "()Landroidx/compose/ui/unit/Density;", "setGraphicsDensity$ui_release", "(Landroidx/compose/ui/unit/Density;)V", "renderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "rotationZ", "getRotationZ", "setRotationZ", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "shadowElevation", "getShadowElevation", "setShadowElevation", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "setSize-uvyYCjk", "spotShadowColor", "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "transformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "getTransformOrigin-SzJe1aQ", "setTransformOrigin-__ExYCQ", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "reset", "", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ReusableGraphicsLayerScope implements GraphicsLayerScope {
    private boolean clip;
    private RenderEffect renderEffect;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float shadowElevation;
    private float translationX;
    private float translationY;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float alpha = 1.0f;
    private long ambientShadowColor = GraphicsLayerScopeKt.getDefaultShadowColor();
    private long spotShadowColor = GraphicsLayerScopeKt.getDefaultShadowColor();
    private float cameraDistance = 8.0f;
    private long transformOrigin = TransformOrigin.INSTANCE.m9539getCenterSzJe1aQ();
    private Shape shape = RectangleShapeKt.getRectangleShape();
    private int compositingStrategy = CompositingStrategy.INSTANCE.m9262getAutoNrFUSI();
    private long size = Size.INSTANCE.m9022getUnspecifiedNHjbRc();
    private Density graphicsDensity = DensityKt.Density$default(1.0f, 0.0f, 2, null);

    @Override // androidx.compose.p006ui.graphics.GraphicsLayerScope
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.p006ui.graphics.GraphicsLayerScope
    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: from getter */
    public long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    @Override // androidx.compose.p006ui.graphics.GraphicsLayerScope
    public float getCameraDistance() {
        return this.cameraDistance;
    }

    @Override // androidx.compose.p006ui.graphics.GraphicsLayerScope
    public boolean getClip() {
        return this.clip;
    }

    @Override // androidx.compose.p006ui.graphics.GraphicsLayerScope
    /* renamed from: getCompositingStrategy--NrFUSI, reason: from getter */
    public int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    @Override // androidx.compose.p006ui.unit.Density
    public float getDensity() {
        return this.graphicsDensity.getDensity();
    }

    @Override // androidx.compose.p006ui.unit.Density
    public float getFontScale() {
        return this.graphicsDensity.getFontScale();
    }

    /* renamed from: getGraphicsDensity$ui_release, reason: from getter */
    public final Density getGraphicsDensity() {
        return this.graphicsDensity;
    }

    @Override // androidx.compose.p006ui.graphics.GraphicsLayerScope
    public RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.p006ui.graphics.GraphicsLayerScope
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.p006ui.graphics.GraphicsLayerScope
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // androidx.compose.p006ui.graphics.GraphicsLayerScope
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // androidx.compose.p006ui.graphics.GraphicsLayerScope
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // androidx.compose.p006ui.graphics.GraphicsLayerScope
    public float getScaleY() {
        return this.scaleY;
    }

    @Override // androidx.compose.p006ui.graphics.GraphicsLayerScope
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // androidx.compose.p006ui.graphics.GraphicsLayerScope
    public Shape getShape() {
        return this.shape;
    }

    @Override // androidx.compose.p006ui.graphics.GraphicsLayerScope
    /* renamed from: getSize-NH-jbRc, reason: from getter */
    public long getSize() {
        return this.size;
    }

    @Override // androidx.compose.p006ui.graphics.GraphicsLayerScope
    /* renamed from: getSpotShadowColor-0d7_KjU, reason: from getter */
    public long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.p006ui.graphics.GraphicsLayerScope
    /* renamed from: getTransformOrigin-SzJe1aQ, reason: from getter */
    public long getTransformOrigin() {
        return this.transformOrigin;
    }

    @Override // androidx.compose.p006ui.graphics.GraphicsLayerScope
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // androidx.compose.p006ui.graphics.GraphicsLayerScope
    public float getTranslationY() {
        return this.translationY;
    }

    public final void reset() {
        setScaleX(1.0f);
        setScaleY(1.0f);
        setAlpha(1.0f);
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        setShadowElevation(0.0f);
        mo9344setAmbientShadowColor8_81llA(GraphicsLayerScopeKt.getDefaultShadowColor());
        mo9346setSpotShadowColor8_81llA(GraphicsLayerScopeKt.getDefaultShadowColor());
        setRotationX(0.0f);
        setRotationY(0.0f);
        setRotationZ(0.0f);
        setCameraDistance(8.0f);
        mo9347setTransformOrigin__ExYCQ(TransformOrigin.INSTANCE.m9539getCenterSzJe1aQ());
        setShape(RectangleShapeKt.getRectangleShape());
        setClip(false);
        setRenderEffect(null);
        mo9345setCompositingStrategyaDBOjCE(CompositingStrategy.INSTANCE.m9262getAutoNrFUSI());
        m9460setSizeuvyYCjk(Size.INSTANCE.m9022getUnspecifiedNHjbRc());
    }

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public /* synthetic */ int mo7199roundToPxR2X_6o(long j4) {
        return AbstractC1702a.m906a(this, j4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public /* synthetic */ int mo7200roundToPx0680j_4(float f4) {
        return AbstractC1702a.m907b(this, f4);
    }

    @Override // androidx.compose.p006ui.graphics.GraphicsLayerScope
    public void setAlpha(float f4) {
        this.alpha = f4;
    }

    @Override // androidx.compose.p006ui.graphics.GraphicsLayerScope
    /* renamed from: setAmbientShadowColor-8_81llA */
    public void mo9344setAmbientShadowColor8_81llA(long j4) {
        this.ambientShadowColor = j4;
    }

    @Override // androidx.compose.p006ui.graphics.GraphicsLayerScope
    public void setCameraDistance(float f4) {
        this.cameraDistance = f4;
    }

    @Override // androidx.compose.p006ui.graphics.GraphicsLayerScope
    public void setClip(boolean z3) {
        this.clip = z3;
    }

    @Override // androidx.compose.p006ui.graphics.GraphicsLayerScope
    /* renamed from: setCompositingStrategy-aDBOjCE */
    public void mo9345setCompositingStrategyaDBOjCE(int i4) {
        this.compositingStrategy = i4;
    }

    public final void setGraphicsDensity$ui_release(Density density) {
        Intrinsics.checkNotNullParameter(density, "<set-?>");
        this.graphicsDensity = density;
    }

    @Override // androidx.compose.p006ui.graphics.GraphicsLayerScope
    public void setRenderEffect(RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
    }

    @Override // androidx.compose.p006ui.graphics.GraphicsLayerScope
    public void setRotationX(float f4) {
        this.rotationX = f4;
    }

    @Override // androidx.compose.p006ui.graphics.GraphicsLayerScope
    public void setRotationY(float f4) {
        this.rotationY = f4;
    }

    @Override // androidx.compose.p006ui.graphics.GraphicsLayerScope
    public void setRotationZ(float f4) {
        this.rotationZ = f4;
    }

    @Override // androidx.compose.p006ui.graphics.GraphicsLayerScope
    public void setScaleX(float f4) {
        this.scaleX = f4;
    }

    @Override // androidx.compose.p006ui.graphics.GraphicsLayerScope
    public void setScaleY(float f4) {
        this.scaleY = f4;
    }

    @Override // androidx.compose.p006ui.graphics.GraphicsLayerScope
    public void setShadowElevation(float f4) {
        this.shadowElevation = f4;
    }

    @Override // androidx.compose.p006ui.graphics.GraphicsLayerScope
    public void setShape(Shape shape) {
        Intrinsics.checkNotNullParameter(shape, "<set-?>");
        this.shape = shape;
    }

    /* renamed from: setSize-uvyYCjk, reason: not valid java name */
    public void m9460setSizeuvyYCjk(long j4) {
        this.size = j4;
    }

    @Override // androidx.compose.p006ui.graphics.GraphicsLayerScope
    /* renamed from: setSpotShadowColor-8_81llA */
    public void mo9346setSpotShadowColor8_81llA(long j4) {
        this.spotShadowColor = j4;
    }

    @Override // androidx.compose.p006ui.graphics.GraphicsLayerScope
    /* renamed from: setTransformOrigin-__ExYCQ */
    public void mo9347setTransformOrigin__ExYCQ(long j4) {
        this.transformOrigin = j4;
    }

    @Override // androidx.compose.p006ui.graphics.GraphicsLayerScope
    public void setTranslationX(float f4) {
        this.translationX = f4;
    }

    @Override // androidx.compose.p006ui.graphics.GraphicsLayerScope
    public void setTranslationY(float f4) {
        this.translationY = f4;
    }

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: toDp-GaN1DYA */
    public /* synthetic */ float mo7201toDpGaN1DYA(long j4) {
        return AbstractC1702a.m908c(this, j4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo7202toDpu2uoSUM(float f4) {
        return AbstractC1702a.m909d(this, f4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public /* synthetic */ long mo7204toDpSizekrfVVM(long j4) {
        return AbstractC1702a.m911f(this, j4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public /* synthetic */ float mo7205toPxR2X_6o(long j4) {
        return AbstractC1702a.m912g(this, j4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public /* synthetic */ float mo7206toPx0680j_4(float f4) {
        return AbstractC1702a.m913h(this, f4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    public /* synthetic */ Rect toRect(DpRect dpRect) {
        return AbstractC1702a.m914i(this, dpRect);
    }

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public /* synthetic */ long mo7207toSizeXkaWNTQ(long j4) {
        return AbstractC1702a.m915j(this, j4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: toSp-0xMU5do */
    public /* synthetic */ long mo7208toSp0xMU5do(float f4) {
        return AbstractC1702a.m916k(this, f4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo7209toSpkPz2Gy4(float f4) {
        return AbstractC1702a.m917l(this, f4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo7203toDpu2uoSUM(int i4) {
        return AbstractC1702a.m910e(this, i4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo7210toSpkPz2Gy4(int i4) {
        return AbstractC1702a.m918m(this, i4);
    }
}
