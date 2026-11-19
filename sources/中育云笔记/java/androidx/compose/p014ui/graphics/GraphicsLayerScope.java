package androidx.compose.p014ui.graphics;

import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.layout.PlacementScopeMarker;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.DpRect;
import androidx.compose.runtime.Stable;

@PlacementScopeMarker
/* loaded from: classes2.dex */
public interface GraphicsLayerScope extends Density {

    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
        public static long m31071getAmbientShadowColor0d7_KjU(GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo31062getAmbientShadowColor0d7_KjU();
        }

        public static /* synthetic */ void getClip$annotations() {
        }

        @Deprecated
        /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
        public static int m31072getCompositingStrategyNrFUSI(GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo31063getCompositingStrategyNrFUSI();
        }

        @Deprecated
        public static RenderEffect getRenderEffect(GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.getRenderEffect();
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m31073getSizeNHjbRc(GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo31064getSizeNHjbRc();
        }

        @Deprecated
        /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
        public static long m31074getSpotShadowColor0d7_KjU(GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo31065getSpotShadowColor0d7_KjU();
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m31075roundToPxR2X_6o(GraphicsLayerScope graphicsLayerScope, long j10) {
            return GraphicsLayerScope.super.mo27092roundToPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m31076roundToPx0680j_4(GraphicsLayerScope graphicsLayerScope, float f10) {
            return GraphicsLayerScope.super.mo27093roundToPx0680j_4(f10);
        }

        @Deprecated
        /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
        public static void m31077setAmbientShadowColor8_81llA(GraphicsLayerScope graphicsLayerScope, long j10) {
            GraphicsLayerScope.super.mo31067setAmbientShadowColor8_81llA(j10);
        }

        @Deprecated
        /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
        public static void m31078setCompositingStrategyaDBOjCE(GraphicsLayerScope graphicsLayerScope, int i10) {
            GraphicsLayerScope.super.mo31068setCompositingStrategyaDBOjCE(i10);
        }

        @Deprecated
        public static void setRenderEffect(GraphicsLayerScope graphicsLayerScope, RenderEffect renderEffect) {
            GraphicsLayerScope.super.setRenderEffect(renderEffect);
        }

        @Deprecated
        /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
        public static void m31079setSpotShadowColor8_81llA(GraphicsLayerScope graphicsLayerScope, long j10) {
            GraphicsLayerScope.super.mo31069setSpotShadowColor8_81llA(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m31080toDpGaN1DYA(GraphicsLayerScope graphicsLayerScope, long j10) {
            return GraphicsLayerScope.super.mo27094toDpGaN1DYA(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m31081toDpu2uoSUM(GraphicsLayerScope graphicsLayerScope, float f10) {
            return GraphicsLayerScope.super.mo27095toDpu2uoSUM(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m31083toDpSizekrfVVM(GraphicsLayerScope graphicsLayerScope, long j10) {
            return GraphicsLayerScope.super.mo27097toDpSizekrfVVM(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m31084toPxR2X_6o(GraphicsLayerScope graphicsLayerScope, long j10) {
            return GraphicsLayerScope.super.mo27098toPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m31085toPx0680j_4(GraphicsLayerScope graphicsLayerScope, float f10) {
            return GraphicsLayerScope.super.mo27099toPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        public static Rect toRect(GraphicsLayerScope graphicsLayerScope, DpRect dpRect) {
            return GraphicsLayerScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m31086toSizeXkaWNTQ(GraphicsLayerScope graphicsLayerScope, long j10) {
            return GraphicsLayerScope.super.mo27100toSizeXkaWNTQ(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m31087toSp0xMU5do(GraphicsLayerScope graphicsLayerScope, float f10) {
            return GraphicsLayerScope.super.mo27101toSp0xMU5do(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m31088toSpkPz2Gy4(GraphicsLayerScope graphicsLayerScope, float f10) {
            return GraphicsLayerScope.super.mo27102toSpkPz2Gy4(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m31082toDpu2uoSUM(GraphicsLayerScope graphicsLayerScope, int i10) {
            return GraphicsLayerScope.super.mo27096toDpu2uoSUM(i10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m31089toSpkPz2Gy4(GraphicsLayerScope graphicsLayerScope, int i10) {
            return GraphicsLayerScope.super.mo27103toSpkPz2Gy4(i10);
        }
    }

    float getAlpha();

    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    default long mo31062getAmbientShadowColor0d7_KjU() {
        return GraphicsLayerScopeKt.getDefaultShadowColor();
    }

    float getCameraDistance();

    boolean getClip();

    /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    default int mo31063getCompositingStrategyNrFUSI() {
        return CompositingStrategy.Companion.m30966getAutoNrFUSI();
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
    default long mo31064getSizeNHjbRc() {
        return Size.Companion.m30714getUnspecifiedNHjbRc();
    }

    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    default long mo31065getSpotShadowColor0d7_KjU() {
        return GraphicsLayerScopeKt.getDefaultShadowColor();
    }

    /* renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    long mo31066getTransformOriginSzJe1aQ();

    float getTranslationX();

    float getTranslationY();

    void setAlpha(float f10);

    /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    default void mo31067setAmbientShadowColor8_81llA(long j10) {
    }

    void setCameraDistance(float f10);

    void setClip(boolean z10);

    /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    default void mo31068setCompositingStrategyaDBOjCE(int i10) {
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
    default void mo31069setSpotShadowColor8_81llA(long j10) {
    }

    /* renamed from: setTransformOrigin-__ExYCQ, reason: not valid java name */
    void mo31070setTransformOrigin__ExYCQ(long j10);

    void setTranslationX(float f10);

    void setTranslationY(float f10);
}
