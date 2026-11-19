package androidx.compose.p013ui.graphics.layer;

import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.p013ui.graphics.Canvas;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.graphics.RenderEffect;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public interface GraphicsLayerImpl {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final InterfaceC10570l DefaultDrawBlock = new InterfaceC10570l() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayerImpl$Companion$DefaultDrawBlock$1
            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DrawScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(DrawScope drawScope) {
                DrawScope.m24821drawRectnJ9OG0$default(drawScope, Color.Companion.m24311getTransparent0d7_KjU(), 0L, 0L, 0.0f, null, null, 0, 126, null);
            }
        };

        private Companion() {
        }

        public final InterfaceC10570l getDefaultDrawBlock() {
            return DefaultDrawBlock;
        }
    }

    Matrix calculateMatrix();

    void discardDisplayList();

    void draw(Canvas canvas);

    float getAlpha();

    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    long mo24930getAmbientShadowColor0d7_KjU();

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    int mo24931getBlendMode0nO6VwU();

    float getCameraDistance();

    boolean getClip();

    ColorFilter getColorFilter();

    /* renamed from: getCompositingStrategy-ke2Ky5w, reason: not valid java name */
    int mo24932getCompositingStrategyke2Ky5w();

    default boolean getHasDisplayList() {
        return true;
    }

    long getLayerId();

    long getOwnerId();

    /* renamed from: getPivotOffset-F1C5BW0, reason: not valid java name */
    long mo24933getPivotOffsetF1C5BW0();

    RenderEffect getRenderEffect();

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    float getShadowElevation();

    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    long mo24934getSpotShadowColor0d7_KjU();

    default boolean getSupportsSoftwareRendering() {
        return false;
    }

    float getTranslationX();

    float getTranslationY();

    boolean isInvalidated();

    void record(Density density, LayoutDirection layoutDirection, GraphicsLayer graphicsLayer, InterfaceC10570l interfaceC10570l);

    void setAlpha(float f10);

    /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    void mo24935setAmbientShadowColor8_81llA(long j10);

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    void mo24936setBlendModes9anfk8(int i10);

    void setCameraDistance(float f10);

    void setClip(boolean z10);

    void setColorFilter(ColorFilter colorFilter);

    /* renamed from: setCompositingStrategy-Wpw9cng, reason: not valid java name */
    void mo24937setCompositingStrategyWpw9cng(int i10);

    void setInvalidated(boolean z10);

    /* renamed from: setOutline-O0kMr_c, reason: not valid java name */
    void mo24938setOutlineO0kMr_c(Outline outline, long j10);

    /* renamed from: setPivotOffset-k-4lQ0M, reason: not valid java name */
    void mo24939setPivotOffsetk4lQ0M(long j10);

    /* renamed from: setPosition-H0pRuoY, reason: not valid java name */
    void mo24940setPositionH0pRuoY(int i10, int i11, long j10);

    void setRenderEffect(RenderEffect renderEffect);

    void setRotationX(float f10);

    void setRotationY(float f10);

    void setRotationZ(float f10);

    void setScaleX(float f10);

    void setScaleY(float f10);

    void setShadowElevation(float f10);

    /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    void mo24941setSpotShadowColor8_81llA(long j10);

    void setTranslationX(float f10);

    void setTranslationY(float f10);
}
