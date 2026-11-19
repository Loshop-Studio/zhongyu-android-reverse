package com.zykj.sketch.core.listener;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.core.config.SketchConfig;
import com.zykj.sketch.core.graph.Graph;
import java.util.List;

/* loaded from: classes3.dex */
public interface IControl {

    public static final class DefaultImpls {
        public static /* synthetic */ List findGraph$default(IControl iControl, float f10, float f11, float f12, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findGraph");
            }
            if ((i10 & 4) != 0) {
                f12 = 0.0f;
            }
            return iControl.findGraph(f10, f11, f12);
        }
    }

    void clear();

    void clearTempPaint();

    List<Graph> findGraph(float f10, float f11, float f12);

    List<Graph> findSelectGraph();

    void forceRender();

    int getBackgroundColor();

    Matrix getCameraMatrix();

    Bitmap getDeleteBitmap();

    EzyDrawBoard.DrawArea getDrawArea();

    EzyDrawBoard.ActionGraphConfig.GraphConfig getGraphConfig();

    GraphMatrixListener getGraphMatrixListener();

    ImageDeleteListener getImageDeleteListener();

    EzyDrawBoard.ActionModeConfig.Mode getMode();

    Graph getRootGraph();

    float getScale();

    SketchConfig getSketchConfig();

    void isRender(boolean z10);

    boolean isRender();

    boolean isTouch();

    void onDestroy();

    void render();

    void render(Canvas canvas);

    void renderTempPath(Path path, Paint paint);

    void renderTempThumbnail(Bitmap bitmap);

    void reset();

    void resetGraph();

    void resetStatus();

    void setBackgroundColor(int i10);

    void setCameraMatrix(int i10, int i11, int i12, int i13);

    void setCameraMatrix(Matrix matrix);

    void setDrawArea(EzyDrawBoard.DrawArea drawArea);

    void setGraphMatrixListener(GraphMatrixListener graphMatrixListener);

    void setImageDeleteListener(ImageDeleteListener imageDeleteListener);

    void setMode(EzyDrawBoard.ActionModeConfig.Mode mode);

    void setRecordConfig(EzyDrawBoard.ActionGraphConfig.GraphConfig graphConfig);

    void setRootGraph(Graph graph);

    void setTouch(boolean z10);
}
