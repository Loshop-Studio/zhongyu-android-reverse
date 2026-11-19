package androidx.compose.p013ui.graphics;

import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.layout.PlacementScopeMarker;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.DpRect;
import androidx.compose.runtime.Stable;

@PlacementScopeMarker
/* loaded from: classes2.dex */
public interface GraphicsLayerScope extends Density {

    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
        public static long m24469getAmbientShadowColor0d7_KjU(GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo24460getAmbientShadowColor0d7_KjU();
        }

        public static /* synthetic */ void getClip$annotations() {
        }

        @Deprecated
        /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
        public static int m24470getCompositingStrategyNrFUSI(GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo24461getCompositingStrategyNrFUSI();
        }

        @Deprecated
        public static RenderEffect getRenderEffect(GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.getRenderEffect();
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m24471getSizeNHjbRc(GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo24462getSizeNHjbRc();
        }

        @Deprecated
        /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
        public static long m24472getSpotShadowColor0d7_KjU(GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo24463getSpotShadowColor0d7_KjU();
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m24473roundToPxR2X_6o(GraphicsLayerScope graphicsLayerScope, long j10) {
            return GraphicsLayerScope.super.mo20490roundToPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m24474roundToPx0680j_4(GraphicsLayerScope graphicsLayerScope, float f10) {
            return GraphicsLayerScope.super.mo20491roundToPx0680j_4(f10);
        }

        @Deprecated
        /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
        public static void m24475setAmbientShadowColor8_81llA(GraphicsLayerScope graphicsLayerScope, long j10) {
            GraphicsLayerScope.super.mo24465setAmbientShadowColor8_81llA(j10);
        }

        @Deprecated
        /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
        public static void m24476setCompositingStrategyaDBOjCE(GraphicsLayerScope graphicsLayerScope, int i10) {
            GraphicsLayerScope.super.mo24466setCompositingStrategyaDBOjCE(i10);
        }

        @Deprecated
        public static void setRenderEffect(GraphicsLayerScope graphicsLayerScope, RenderEffect renderEffect) {
            GraphicsLayerScope.super.setRenderEffect(renderEffect);
        }

        @Deprecated
        /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
        public static void m24477setSpotShadowColor8_81llA(GraphicsLayerScope graphicsLayerScope, long j10) {
            GraphicsLayerScope.super.mo24467setSpotShadowColor8_81llA(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m24478toDpGaN1DYA(GraphicsLayerScope graphicsLayerScope, long j10) {
            return GraphicsLayerScope.super.mo20492toDpGaN1DYA(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m24479toDpu2uoSUM(GraphicsLayerScope graphicsLayerScope, float f10) {
            return GraphicsLayerScope.super.mo20493toDpu2uoSUM(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m24481toDpSizekrfVVM(GraphicsLayerScope graphicsLayerScope, long j10) {
            return GraphicsLayerScope.super.mo20495toDpSizekrfVVM(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m24482toPxR2X_6o(GraphicsLayerScope graphicsLayerScope, long j10) {
            return GraphicsLayerScope.super.mo20496toPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m24483toPx0680j_4(GraphicsLayerScope graphicsLayerScope, float f10) {
            return GraphicsLayerScope.super.mo20497toPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        public static Rect toRect(GraphicsLayerScope graphicsLayerScope, DpRect dpRect) {
            return GraphicsLayerScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m24484toSizeXkaWNTQ(GraphicsLayerScope graphicsLayerScope, long j10) {
            return GraphicsLayerScope.super.mo20498toSizeXkaWNTQ(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m24485toSp0xMU5do(GraphicsLayerScope graphicsLayerScope, float f10) {
            return GraphicsLayerScope.super.mo20499toSp0xMU5do(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m24486toSpkPz2Gy4(GraphicsLayerScope graphicsLayerScope, float f10) {
            return GraphicsLayerScope.super.mo20500toSpkPz2Gy4(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m24480toDpu2uoSUM(GraphicsLayerScope graphicsLayerScope, int i10) {
            return GraphicsLayerScope.super.mo20494toDpu2uoSUM(i10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m24487toSpkPz2Gy4(GraphicsLayerScope graphicsLayerScope, int i10) {
            return GraphicsLayerScope.super.mo20501toSpkPz2Gy4(i10);
        }
    }

    float getAlpha();

    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    default long mo24460getAmbientShadowColor0d7_KjU() {
        return GraphicsLayerScopeKt.getDefaultShadowColor();
    }

    float getCameraDistance();

    boolean getClip();

    /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    default int mo24461getCompositingStrategyNrFUSI() {
        return CompositingStrategy.Companion.m24364getAutoNrFUSI();
    }

    default RenderEffect getRenderEffect() {
        return null;
    }

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    float getShadowElevation();

    Shape getShape();

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    default long mo24462getSizeNHjbRc() {
        return Size.Companion.m24112getUnspecifiedNHjbRc();
    }

    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    default long mo24463getSpotShadowColor0d7_KjU() {
        return GraphicsLayerScopeKt.getDefaultShadowColor();
    }

    /* renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    long mo24464getTransformOriginSzJe1aQ();

    float getTranslationX();

    float getTranslationY();

    void setAlpha(float f10);

    /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    default void mo24465setAmbientShadowColor8_81llA(long j10) {
    }

    void setCameraDistance(float f10);

    void setClip(boolean z10);

    /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    default void mo24466setCompositingStrategyaDBOjCE(int i10) {
    }

    default void setRenderEffect(RenderEffect renderEffect) {
    }

    void setRotationX(float f10);

    void setRotationY(float f10);

    void setRotationZ(float f10);

    void setScaleX(float f10);

    void setScaleY(float f10);

    void setShadowElevation(float f10);

    void setShape(Shape shape);

    /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    default void mo24467setSpotShadowColor8_81llA(long j10) {
    }

    /* renamed from: setTransformOrigin-__ExYCQ, reason: not valid java name */
    void mo24468setTransformOrigin__ExYCQ(long j10);

    void setTranslationX(float f10);

    void setTranslationY(float f10);
}
