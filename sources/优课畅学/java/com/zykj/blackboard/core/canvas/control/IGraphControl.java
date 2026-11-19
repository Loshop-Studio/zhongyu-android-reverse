package com.zykj.blackboard.core.canvas.control;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionType;
import com.zykj.blackboard.core.action.newSelectAtion.function.FunctionRectF;
import com.zykj.blackboard.core.edit.RenderChangeListener;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graph.group.GroupGraph;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.core.graph.group.TextGraph;
import com.zykj.board.EzyPageSnapshot;
import java.util.List;

/* loaded from: classes4.dex */
public interface IGraphControl {

    public static final class DefaultImpls {
        public static /* synthetic */ void cameraChangeEnd$default(IGraphControl iGraphControl, Matrix matrix, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cameraChangeEnd");
            }
            if ((i10 & 1) != 0) {
                matrix = null;
            }
            iGraphControl.cameraChangeEnd(matrix);
        }

        public static /* synthetic */ Bitmap minScreenShot$default(IGraphControl iGraphControl, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, IGraph iGraph, int i14, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: minScreenShot");
            }
            if ((i14 & 16) != 0) {
                z10 = false;
            }
            if ((i14 & 32) != 0) {
                z11 = false;
            }
            if ((i14 & 64) != 0) {
                z12 = false;
            }
            if ((i14 & 128) != 0) {
                iGraph = null;
            }
            return iGraphControl.minScreenShot(i10, i11, i12, i13, z10, z11, z12, iGraph);
        }

        public static /* synthetic */ void newChangeHandleEnd$default(IGraphControl iGraphControl, RectF rectF, Matrix matrix, RectF rectF2, FunctionRectF functionRectF, List list, PointF pointF, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newChangeHandleEnd");
            }
            if ((i10 & 32) != 0) {
                pointF = null;
            }
            iGraphControl.newChangeHandleEnd(rectF, matrix, rectF2, functionRectF, list, pointF);
        }

        public static /* synthetic */ void newChangeHandleStart$default(IGraphControl iGraphControl, GroupGraph groupGraph, RectF rectF, Matrix matrix, RectF rectF2, FunctionRectF functionRectF, List list, PointF pointF, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newChangeHandleStart");
            }
            iGraphControl.newChangeHandleStart(groupGraph, rectF, matrix, rectF2, functionRectF, list, (i10 & 64) != 0 ? null : pointF);
        }

        public static /* synthetic */ void newChangeHandling$default(IGraphControl iGraphControl, GroupGraph groupGraph, RectF rectF, Matrix matrix, RectF rectF2, FunctionRectF functionRectF, List list, PointF pointF, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newChangeHandling");
            }
            iGraphControl.newChangeHandling(groupGraph, rectF, matrix, rectF2, functionRectF, list, (i10 & 64) != 0 ? null : pointF);
        }

        public static /* synthetic */ void newSelect$default(IGraphControl iGraphControl, RectF rectF, Matrix matrix, RectF rectF2, FunctionRectF functionRectF, List list, PointF pointF, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newSelect");
            }
            if ((i10 & 32) != 0) {
                pointF = null;
            }
            iGraphControl.newSelect(rectF, matrix, rectF2, functionRectF, list, pointF);
        }
    }

    void addGraph(String str, IGraph iGraph);

    void addImageGraph(ImageGraph imageGraph);

    void cameraChangeEnd(Matrix matrix);

    void cameraChangeStart();

    void cameraChanging(Matrix matrix);

    void changeImageGraph(String str, RectF rectF, Matrix matrix, String str2);

    void changeTextGraph(String str, String str2, Paint paint, RectF rectF);

    void concatMatrix(IGraph iGraph, Matrix matrix);

    Bitmap contentThumbnail();

    void delete(List<IGraph> list);

    void drawGraphInActive(List<? extends IGraph> list);

    void drawPath(Path path, Paint paint, Matrix matrix);

    int getBackgroundColor();

    BackgroundLineConfig getBackgroundLineConfig();

    int getDefaultBackgroundColor();

    BackgroundLineConfig getDefaultBackgroundLineConfig();

    int getImageGraphCount();

    RectF getOldPageRectF();

    RectF getPageRectF();

    RectF getRenderRectF();

    void init(IGraph iGraph);

    void isDraw(boolean z10);

    boolean isDraw();

    Bitmap minScreenShot(int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, IGraph iGraph);

    void newChangeHandleEnd(RectF rectF, Matrix matrix, RectF rectF2, FunctionRectF functionRectF, List<? extends NewSelectFunctionType> list, PointF pointF);

    void newChangeHandleStart(GroupGraph groupGraph, RectF rectF, Matrix matrix, RectF rectF2, FunctionRectF functionRectF, List<? extends NewSelectFunctionType> list, PointF pointF);

    void newChangeHandling(GroupGraph groupGraph, RectF rectF, Matrix matrix, RectF rectF2, FunctionRectF functionRectF, List<? extends NewSelectFunctionType> list, PointF pointF);

    void newSelect(RectF rectF, Matrix matrix, RectF rectF2, FunctionRectF functionRectF, List<? extends NewSelectFunctionType> list, PointF pointF);

    void newSelecting(float f10, float f11, float f12, float f13);

    void reDrawFixView();

    void refresh();

    void registerRenderRectFChangeListener(RenderChangeListener renderChangeListener);

    void release();

    void renderRectF(RectF rectF, List<IGraph> list);

    void reset();

    void resetCamera();

    IGraph rootGraph();

    String rootGraphId();

    Bitmap screenshot();

    void select(RectF rectF, Matrix matrix, Paint paint, float f10, boolean z10);

    void selectCancel();

    void setDefaultBackgroundColor(int i10);

    void setDefaultBackgroundLineConfig(BackgroundLineConfig backgroundLineConfig);

    void setGraphMatrix(String str, Matrix matrix);

    void setOldPageRectF(RectF rectF);

    EzyPageSnapshot.PageSnapshot.GraphSnapshot snapshot();

    void textHandle(TextGraph textGraph, RectF rectF, Matrix matrix);

    void textHandleEnd(TextGraph textGraph, RectF rectF, Matrix matrix);

    void textHandleStart(TextGraph textGraph);

    void translation(List<? extends IGraph> list, Matrix matrix);

    void translationEnd(List<? extends IGraph> list, Matrix matrix);

    void translationStart(List<? extends IGraph> list);

    void unRegisterRenderRectFChangeListener(RenderChangeListener renderChangeListener);

    void updateBackgroundColor(int i10);

    void updateBackgroundLineConfig(BackgroundLineConfig backgroundLineConfig);

    void updateBackgroundMatrix();
}
