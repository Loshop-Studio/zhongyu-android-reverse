package com.zykj.blackboard.core.action;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.blackboard.listener.IAreaMoveListener;
import com.zykj.blackboard.listener.ITextSelectListener;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzyTouchEvent;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes4.dex */
public interface IActionListener {

    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void changeGraph$default(IActionListener iActionListener, IGraph iGraph, EzyGraphEnum.GraphEnum graphEnum, RectF rectF, String str, Paint paint, List list, Matrix matrix, String str2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changeGraph");
            }
            if ((i10 & 4) != 0) {
                rectF = null;
            }
            if ((i10 & 8) != 0) {
                str = null;
            }
            if ((i10 & 16) != 0) {
                paint = null;
            }
            if ((i10 & 32) != 0) {
                list = null;
            }
            if ((i10 & 64) != 0) {
                matrix = null;
            }
            if ((i10 & 128) != 0) {
                str2 = null;
            }
            iActionListener.changeGraph(iGraph, graphEnum, rectF, str, paint, list, matrix, str2);
        }

        public static /* synthetic */ Graph writingGraphEvent$default(IActionListener iActionListener, EzyGraphEnum.GraphEnum graphEnum, List list, EzyPaint.Paint paint, String str, String str2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: writingGraphEvent");
            }
            if ((i10 & 16) != 0) {
                str2 = UUID.randomUUID().toString();
                AbstractC9133u.m16132f(str2, "randomUUID().toString()");
            }
            return iActionListener.writingGraphEvent(graphEnum, list, paint, str, str2);
        }
    }

    void changeGraph(IGraph iGraph, EzyGraphEnum.GraphEnum graphEnum, RectF rectF, String str, Paint paint, List<? extends PointF> list, Matrix matrix, String str2);

    void deleteGraphEvent(List<? extends IGraph> list, long j10);

    void geometryGraphEvent(float f10, float f11, float f12, float f13, int i10, List<? extends PointF> list, Paint paint, InterfaceC10570l interfaceC10570l);

    IAreaMoveListener getAreaMoveListener();

    BoardConfig getBoardConfig();

    InterfaceC10570l getGeometryCreateListener();

    IGraphControl getGraphControl();

    MatrixAdapter getMatrixAdapter();

    SourceLoader getSourceLoader();

    ITextSelectListener getTextSelectListener();

    IGraph groupGraphEvent(String str);

    void moveCursor(List<EzyTouchEvent.TouchEvent> list, EzyPaint.Paint paint);

    void newSelectGraph(List<String> list);

    void saveSnapshot();

    void textGraphEvent(float f10, float f11, float f12, float f13, Paint paint, String str, InterfaceC10570l interfaceC10570l);

    void transformCameraEvent(EzyMatrix.Matrix matrix, EzyMatrix.Matrix matrix2, List<EzyMatrix.Matrix> list);

    void transformGraphEvent(List<? extends IGraph> list, List<EzyMatrix.Matrix> list2);

    Graph writingGraphEvent(EzyGraphEnum.GraphEnum graphEnum, List<EzyTouchEvent.TouchEvent> list, EzyPaint.Paint paint, String str, String str2);
}
