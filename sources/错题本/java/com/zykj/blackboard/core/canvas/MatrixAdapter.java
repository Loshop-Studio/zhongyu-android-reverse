package com.zykj.blackboard.core.canvas;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v4.media.AbstractC0037f;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.AbstractC3387g;
import com.zykj.blackboard.core.edit.RenderChangeListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0010\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001b\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\nJ\r\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u0003J\u0015\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b#\u0010\"R\u0017\u0010$\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0015R\u0017\u0010'\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u0015R\u0017\u0010)\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0017R\u0014\u0010,\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001f0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, m5110d2 = {"Lcom/zykj/blackboard/core/canvas/MatrixAdapter;", "", "<init>", "()V", "Ld6/s;", "notifyCameraChange", "notifyRenderRectChange", "Landroid/graphics/Matrix;", "matrix", "setCameraMatrix", "(Landroid/graphics/Matrix;)V", "setScreenMatrix", "Landroid/graphics/RectF;", "rectF", "setRenderRectF", "(Landroid/graphics/RectF;)V", "setVisibleRectF", "Landroid/graphics/Rect;", "rect", "(Landroid/graphics/Rect;)V", "getAdapterMatrix", "()Landroid/graphics/Matrix;", "getAdapterRectF", "()Landroid/graphics/RectF;", "", "transX", "transY", "postCameraTranslate", "(Ljava/lang/Float;Ljava/lang/Float;)V", "cameraMatrixConcat", "resetCamera", "Lcom/zykj/blackboard/core/edit/RenderChangeListener;", "listener", "registerRenderRectFChangeListener", "(Lcom/zykj/blackboard/core/edit/RenderChangeListener;)V", "unRegisterRenderRectFChangeListener", "cameraMatrix", "Landroid/graphics/Matrix;", "getCameraMatrix", "screenMatrix", "getScreenMatrix", "renderRectF", "Landroid/graphics/RectF;", "getRenderRectF", "visibleRectF", "", "renderChangeListenerList", "Ljava/util/List;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class MatrixAdapter {

    @NotNull
    private final Matrix cameraMatrix = new Matrix();

    @NotNull
    private final Matrix screenMatrix = new Matrix();

    @NotNull
    private final RectF renderRectF = new RectF();

    @NotNull
    private final RectF visibleRectF = new RectF();

    @NotNull
    private final List<RenderChangeListener> renderChangeListenerList = new ArrayList();

    private final void notifyCameraChange() {
        notifyRenderRectChange();
        Iterator<T> it = this.renderChangeListenerList.iterator();
        while (it.hasNext()) {
            ((RenderChangeListener) it.next()).onCameraChange(getAdapterMatrix());
        }
    }

    private final void notifyRenderRectChange() {
        Iterator<T> it = this.renderChangeListenerList.iterator();
        while (it.hasNext()) {
            ((RenderChangeListener) it.next()).onRenderChange(getAdapterRectF(), this.visibleRectF);
        }
    }

    public final void cameraMatrixConcat(@NotNull Matrix matrix) {
        AbstractC5830k.m5330g(matrix, "matrix");
        this.cameraMatrix.postConcat(matrix);
        notifyCameraChange();
        System.out.println((Object) ("MatrixAdapter cameraMatrixConcat=" + matrix + "  camera=" + this.cameraMatrix));
    }

    @NotNull
    public final Matrix getAdapterMatrix() {
        Matrix matrix = new Matrix();
        matrix.postConcat(this.cameraMatrix);
        matrix.postConcat(this.screenMatrix);
        return matrix;
    }

    @NotNull
    public final RectF getAdapterRectF() {
        RectF rectF = new RectF();
        getAdapterMatrix().mapRect(rectF, this.renderRectF);
        return rectF;
    }

    @NotNull
    public final Matrix getCameraMatrix() {
        return this.cameraMatrix;
    }

    @NotNull
    public final RectF getRenderRectF() {
        return this.renderRectF;
    }

    @NotNull
    public final Matrix getScreenMatrix() {
        return this.screenMatrix;
    }

    public final void postCameraTranslate(@Nullable Float transX, @Nullable Float transY) {
        this.cameraMatrix.postTranslate(transX != null ? transX.floatValue() : 0.0f, transY != null ? transY.floatValue() : 0.0f);
        notifyCameraChange();
    }

    public final void registerRenderRectFChangeListener(@NotNull RenderChangeListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        this.renderChangeListenerList.add(listener);
    }

    public final void resetCamera() {
        this.cameraMatrix.reset();
        notifyCameraChange();
    }

    public final void setCameraMatrix(@NotNull Matrix matrix) {
        AbstractC5830k.m5330g(matrix, "matrix");
        this.cameraMatrix.set(matrix);
        notifyCameraChange();
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        if (fArr[0] == 0.0f) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            AbstractC5830k.m5329f(stackTrace, "currentThread().stackTrace");
            StackTraceElement stackTraceElement = (StackTraceElement) AbstractC5802q.m5195V(2, stackTrace);
            AbstractC3387g.m2342e(AbstractC0037f.m85j("MatrixAdapter -> ", stackTraceElement != null ? stackTraceElement.getClassName() : null));
        }
    }

    public final void setRenderRectF(@NotNull RectF rectF) {
        AbstractC5830k.m5330g(rectF, "rectF");
        this.renderRectF.set(rectF);
        notifyRenderRectChange();
    }

    public final void setScreenMatrix(@NotNull Matrix matrix) {
        AbstractC5830k.m5330g(matrix, "matrix");
        this.screenMatrix.set(matrix);
    }

    public final void setVisibleRectF(@NotNull RectF rectF) {
        AbstractC5830k.m5330g(rectF, "rectF");
        this.visibleRectF.set(rectF);
    }

    public final void unRegisterRenderRectFChangeListener(@NotNull RenderChangeListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        this.renderChangeListenerList.remove(listener);
    }

    public final void setVisibleRectF(@NotNull Rect rect) {
        AbstractC5830k.m5330g(rect, "rect");
        this.visibleRectF.set(rect);
    }
}
