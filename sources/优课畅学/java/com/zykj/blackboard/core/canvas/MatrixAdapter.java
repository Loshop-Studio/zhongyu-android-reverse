package com.zykj.blackboard.core.canvas;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import com.blankj.utilcode.util.AbstractC5380q;
import com.zykj.blackboard.core.edit.RenderChangeListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8801r;

/* loaded from: classes4.dex */
public final class MatrixAdapter {
    private final Matrix cameraMatrix = new Matrix();
    private final Matrix screenMatrix = new Matrix();
    private final RectF renderRectF = new RectF();
    private final RectF visibleRectF = new RectF();
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

    public final void cameraMatrixConcat(Matrix matrix) {
        AbstractC9133u.m16133g(matrix, "matrix");
        this.cameraMatrix.postConcat(matrix);
        notifyCameraChange();
        System.out.println((Object) ("MatrixAdapter cameraMatrixConcat=" + matrix + "  camera=" + this.cameraMatrix));
    }

    public final Matrix getAdapterMatrix() {
        Matrix matrix = new Matrix();
        matrix.postConcat(this.cameraMatrix);
        matrix.postConcat(this.screenMatrix);
        return matrix;
    }

    public final RectF getAdapterRectF() {
        RectF rectF = new RectF();
        getAdapterMatrix().mapRect(rectF, this.renderRectF);
        return rectF;
    }

    public final Matrix getCameraMatrix() {
        return this.cameraMatrix;
    }

    public final RectF getRenderRectF() {
        return this.renderRectF;
    }

    public final Matrix getScreenMatrix() {
        return this.screenMatrix;
    }

    public final void postCameraTranslate(Float f10, Float f11) {
        this.cameraMatrix.postTranslate(f10 != null ? f10.floatValue() : 0.0f, f11 != null ? f11.floatValue() : 0.0f);
        notifyCameraChange();
    }

    public final void registerRenderRectFChangeListener(RenderChangeListener listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.renderChangeListenerList.add(listener);
    }

    public final void resetCamera() {
        this.cameraMatrix.reset();
        notifyCameraChange();
    }

    public final void setCameraMatrix(Matrix matrix) {
        AbstractC9133u.m16133g(matrix, "matrix");
        this.cameraMatrix.set(matrix);
        notifyCameraChange();
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        if (fArr[0] == 0.0f) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            AbstractC9133u.m16132f(stackTrace, "currentThread().stackTrace");
            StackTraceElement stackTraceElement = (StackTraceElement) AbstractC8801r.m14672D0(stackTrace, 2);
            AbstractC5380q.m2623s("MatrixAdapter -> " + (stackTraceElement != null ? stackTraceElement.getClassName() : null));
        }
    }

    public final void setRenderRectF(RectF rectF) {
        AbstractC9133u.m16133g(rectF, "rectF");
        this.renderRectF.set(rectF);
        notifyRenderRectChange();
    }

    public final void setScreenMatrix(Matrix matrix) {
        AbstractC9133u.m16133g(matrix, "matrix");
        this.screenMatrix.set(matrix);
    }

    public final void setVisibleRectF(RectF rectF) {
        AbstractC9133u.m16133g(rectF, "rectF");
        this.visibleRectF.set(rectF);
    }

    public final void unRegisterRenderRectFChangeListener(RenderChangeListener listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.renderChangeListenerList.remove(listener);
    }

    public final void setVisibleRectF(Rect rect) {
        AbstractC9133u.m16133g(rect, "rect");
        this.visibleRectF.set(rect);
    }
}
