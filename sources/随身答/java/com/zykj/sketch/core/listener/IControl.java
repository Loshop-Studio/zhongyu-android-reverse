package com.zykj.sketch.core.listener;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.core.config.SketchConfig;
import com.zykj.sketch.core.graph.Graph;
import java.util.List;
import kotlin.Metadata;

@Metadata(m13412d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H&J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&J\b\u0010\u0016\u001a\u00020\u0017H&J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H&J\n\u0010\u001a\u001a\u0004\u0018\u00010\u001bH&J\b\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\u0007H&J\b\u0010\u001f\u001a\u00020\tH&J\b\u0010 \u001a\u00020!H&J\b\u0010\"\u001a\u00020#H&J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#H&J\b\u0010$\u001a\u00020#H&J\b\u0010%\u001a\u00020\u0003H&J\b\u0010&\u001a\u00020\u0003H&J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020(H&J\u0018\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H&J\u0012\u0010.\u001a\u00020\u00032\b\u0010/\u001a\u0004\u0018\u00010\u0013H&J\b\u00100\u001a\u00020\u0003H&J\b\u00101\u001a\u00020\u0003H&J\b\u00102\u001a\u00020\u0003H&J\u0010\u00103\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u000fH&J\u0010\u00105\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u0011H&J(\u00105\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u000f2\u0006\u00109\u001a\u00020\u000f2\u0006\u0010:\u001a\u00020\u000fH&J\u0012\u0010;\u001a\u00020\u00032\b\u0010<\u001a\u0004\u0018\u00010\u0015H&J\u0012\u0010=\u001a\u00020\u00032\b\u0010>\u001a\u0004\u0018\u00010\u0019H&J\u0012\u0010?\u001a\u00020\u00032\b\u0010>\u001a\u0004\u0018\u00010\u001bH&J\u0010\u0010@\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u001dH&J\u0010\u0010B\u001a\u00020\u00032\u0006\u0010C\u001a\u00020\u0017H&J\u0010\u0010D\u001a\u00020\u00032\u0006\u0010E\u001a\u00020\u0007H&J\u0010\u0010F\u001a\u00020\u00032\u0006\u0010G\u001a\u00020#H&¨\u0006H"}, m13413d2 = {"Lcom/zykj/sketch/core/listener/IControl;", "", "clear", "", "clearTempPaint", "findGraph", "", "Lcom/zykj/sketch/core/graph/Graph;", "x", "", "y", TypedValues.CycleType.S_WAVE_OFFSET, "findSelectGraph", "forceRender", "getBackgroundColor", "", "getCameraMatrix", "Landroid/graphics/Matrix;", "getDeleteBitmap", "Landroid/graphics/Bitmap;", "getDrawArea", "Lcom/zykj/sketch/EzyDrawBoard$DrawArea;", "getGraphConfig", "Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;", "getGraphMatrixListener", "Lcom/zykj/sketch/core/listener/GraphMatrixListener;", "getImageDeleteListener", "Lcom/zykj/sketch/core/listener/ImageDeleteListener;", "getMode", "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;", "getRootGraph", "getScale", "getSketchConfig", "Lcom/zykj/sketch/core/config/SketchConfig;", "isRender", "", "isTouch", "onDestroy", "render", "canvas", "Landroid/graphics/Canvas;", "renderTempPath", "path", "Landroid/graphics/Path;", "paint", "Landroid/graphics/Paint;", "renderTempThumbnail", "bitmap", "reset", "resetGraph", "resetStatus", "setBackgroundColor", TypedValues.Custom.S_COLOR, "setCameraMatrix", "matrix", "targetWidth", "targetHeight", "width", "height", "setDrawArea", "drawArea", "setGraphMatrixListener", "listener", "setImageDeleteListener", "setMode", "mode", "setRecordConfig", "config", "setRootGraph", "graph", "setTouch", "touch", "sketch_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public interface IControl {

    @Metadata(m13414k = 3, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static /* synthetic */ List findGraph$default(IControl iControl, float f10, float f11, float f12, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findGraph");
            }
            if ((i9 & 4) != 0) {
                f12 = 0.0f;
            }
            return iControl.findGraph(f10, f11, f12);
        }
    }

    void clear();

    void clearTempPaint();

    List<Graph> findGraph(float x9, float y9, float offset);

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

    void isRender(boolean isRender);

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

    void setBackgroundColor(int color);

    void setCameraMatrix(int targetWidth, int targetHeight, int width, int height);

    void setCameraMatrix(Matrix matrix);

    void setDrawArea(EzyDrawBoard.DrawArea drawArea);

    void setGraphMatrixListener(GraphMatrixListener listener);

    void setImageDeleteListener(ImageDeleteListener listener);

    void setMode(EzyDrawBoard.ActionModeConfig.Mode mode);

    void setRecordConfig(EzyDrawBoard.ActionGraphConfig.GraphConfig config);

    void setRootGraph(Graph graph);

    void setTouch(boolean touch);
}
