package androidx.compose.p013ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.p013ui.graphics.CanvasHolder;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.p013ui.graphics.RenderEffect;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public interface DeviceRenderNode {
    void discardDisplayList();

    void drawInto(Canvas canvas);

    DeviceRenderNodeData dumpRenderNodeData();

    float getAlpha();

    int getAmbientShadowColor();

    int getBottom();

    float getCameraDistance();

    boolean getClipToBounds();

    boolean getClipToOutline();

    /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    int mo26048getCompositingStrategyNrFUSI();

    float getElevation();

    boolean getHasDisplayList();

    int getHeight();

    void getInverseMatrix(Matrix matrix);

    int getLeft();

    void getMatrix(Matrix matrix);

    float getPivotX();

    float getPivotY();

    RenderEffect getRenderEffect();

    int getRight();

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    int getSpotShadowColor();

    int getTop();

    float getTranslationX();

    float getTranslationY();

    long getUniqueId();

    int getWidth();

    void offsetLeftAndRight(int i10);

    void offsetTopAndBottom(int i10);

    void record(CanvasHolder canvasHolder, Path path, InterfaceC10570l interfaceC10570l);

    void setAlpha(float f10);

    void setAmbientShadowColor(int i10);

    void setCameraDistance(float f10);

    void setClipToBounds(boolean z10);

    void setClipToOutline(boolean z10);

    /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    void mo26049setCompositingStrategyaDBOjCE(int i10);

    void setElevation(float f10);

    boolean setHasOverlappingRendering(boolean z10);

    void setOutline(Outline outline);

    void setPivotX(float f10);

    void setPivotY(float f10);

    boolean setPosition(int i10, int i11, int i12, int i13);

    void setRenderEffect(RenderEffect renderEffect);

    void setRotationX(float f10);

    void setRotationY(float f10);

    void setRotationZ(float f10);

    void setScaleX(float f10);

    void setScaleY(float f10);

    void setSpotShadowColor(int i10);

    void setTranslationX(float f10);

    void setTranslationY(float f10);
}
