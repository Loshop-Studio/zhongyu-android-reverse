package androidx.compose.p014ui.graphics.layer;

import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.p014ui.graphics.Canvas;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.ColorFilter;
import androidx.compose.p014ui.graphics.RenderEffect;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import com.alibaba.fastjson.asm.Opcodes;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public interface GraphicsLayerImpl {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final InterfaceC9540l DefaultDrawBlock = new InterfaceC9540l() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayerImpl$Companion$DefaultDrawBlock$1
            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DrawScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(DrawScope drawScope) {
                DrawScope.m31423drawRectnJ9OG0$default(drawScope, Color.Companion.m30913getTransparent0d7_KjU(), 0L, 0L, 0.0f, null, null, 0, Opcodes.IAND, null);
            }
        };

        private Companion() {
        }

        public final InterfaceC9540l getDefaultDrawBlock() {
            return DefaultDrawBlock;
        }
    }

    Matrix calculateMatrix();

    void discardDisplayList();

    void draw(Canvas canvas);

    float getAlpha();

    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    long mo31532getAmbientShadowColor0d7_KjU();

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    int mo31533getBlendMode0nO6VwU();

    float getCameraDistance();

    boolean getClip();

    ColorFilter getColorFilter();

    /* renamed from: getCompositingStrategy-ke2Ky5w, reason: not valid java name */
    int mo31534getCompositingStrategyke2Ky5w();

    default boolean getHasDisplayList() {
        return true;
    }

    long getLayerId();

    long getOwnerId();

    /* renamed from: getPivotOffset-F1C5BW0, reason: not valid java name */
    long mo31535getPivotOffsetF1C5BW0();

    RenderEffect getRenderEffect();

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    float getShadowElevation();

    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    long mo31536getSpotShadowColor0d7_KjU();

    default boolean getSupportsSoftwareRendering() {
        return false;
    }

    float getTranslationX();

    float getTranslationY();

    boolean isInvalidated();

    void record(Density density, LayoutDirection layoutDirection, GraphicsLayer graphicsLayer, InterfaceC9540l interfaceC9540l);

    void setAlpha(float f10);

    /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    void mo31537setAmbientShadowColor8_81llA(long j10);

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    void mo31538setBlendModes9anfk8(int i10);

    void setCameraDistance(float f10);

    void setClip(boolean z10);

    void setColorFilter(ColorFilter colorFilter);

    /* renamed from: setCompositingStrategy-Wpw9cng, reason: not valid java name */
    void mo31539setCompositingStrategyWpw9cng(int i10);

    void setInvalidated(boolean z10);

    /* renamed from: setOutline-O0kMr_c, reason: not valid java name */
    void mo31540setOutlineO0kMr_c(Outline outline, long j10);

    /* renamed from: setPivotOffset-k-4lQ0M, reason: not valid java name */
    void mo31541setPivotOffsetk4lQ0M(long j10);

    /* renamed from: setPosition-H0pRuoY, reason: not valid java name */
    void mo31542setPositionH0pRuoY(int i10, int i11, long j10);

    void setRenderEffect(RenderEffect renderEffect);

    void setRotationX(float f10);

    void setRotationY(float f10);

    void setRotationZ(float f10);

    void setScaleX(float f10);

    void setScaleY(float f10);

    void setShadowElevation(float f10);

    /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    void mo31543setSpotShadowColor8_81llA(long j10);

    void setTranslationX(float f10);

    void setTranslationY(float f10);
}
