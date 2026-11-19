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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000fH&¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001bH&¢\u0006\u0004\b\u001f\u0010 J/\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001b0%2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020!H&¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001b0%H&¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0006H&¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0006H&¢\u0006\u0004\b,\u0010+J\u0017\u0010*\u001a\u00020\u00062\u0006\u0010.\u001a\u00020-H&¢\u0006\u0004\b*\u0010/J\u0019\u00102\u001a\u00020\u00062\b\u00101\u001a\u0004\u0018\u000100H&¢\u0006\u0004\b2\u00103J\u001f\u00108\u001a\u00020\u00062\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H&¢\u0006\u0004\b8\u00109J\u000f\u0010;\u001a\u00020:H&¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\u00062\u0006\u0010=\u001a\u00020:H&¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\tH&¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u00062\u0006\u0010C\u001a\u00020:H&¢\u0006\u0004\bC\u0010?J\u000f\u0010C\u001a\u00020:H&¢\u0006\u0004\bC\u0010<J/\u0010H\u001a\u00020\u00062\u0006\u0010D\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\u000fH&¢\u0006\u0004\bH\u0010IJ\u0017\u0010H\u001a\u00020\u00062\u0006\u0010K\u001a\u00020JH&¢\u0006\u0004\bH\u0010LJ\u000f\u0010M\u001a\u00020!H&¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u000200H&¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020JH&¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u0006H&¢\u0006\u0004\bS\u0010+J\u000f\u0010T\u001a\u00020\u0006H&¢\u0006\u0004\bT\u0010+J\u000f\u0010U\u001a\u00020\u0006H&¢\u0006\u0004\bU\u0010+J\u000f\u0010V\u001a\u00020\u0006H&¢\u0006\u0004\bV\u0010+J\u000f\u0010W\u001a\u00020\u0006H&¢\u0006\u0004\bW\u0010+J\u000f\u0010X\u001a\u00020\u0006H&¢\u0006\u0004\bX\u0010+J\u0019\u0010[\u001a\u00020\u00062\b\u0010Z\u001a\u0004\u0018\u00010YH&¢\u0006\u0004\b[\u0010\\J\u0011\u0010]\u001a\u0004\u0018\u00010YH&¢\u0006\u0004\b]\u0010^J\u0019\u0010`\u001a\u00020\u00062\b\u0010Z\u001a\u0004\u0018\u00010_H&¢\u0006\u0004\b`\u0010aJ\u0011\u0010b\u001a\u0004\u0018\u00010_H&¢\u0006\u0004\bb\u0010c¨\u0006d"}, m5110d2 = {"Lcom/zykj/sketch/core/listener/IControl;", "", "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;", "getMode", "()Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;", "mode", "Ld6/s;", "setMode", "(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;", "getGraphConfig", "()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;", "Lcom/zykj/sketch/core/config/SketchConfig;", "getSketchConfig", "()Lcom/zykj/sketch/core/config/SketchConfig;", "", "getBackgroundColor", "()I", TypedValues.Custom.S_COLOR, "setBackgroundColor", "(I)V", "Lcom/zykj/sketch/EzyDrawBoard$DrawArea;", "getDrawArea", "()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;", "drawArea", "setDrawArea", "(Lcom/zykj/sketch/EzyDrawBoard$DrawArea;)V", "Lcom/zykj/sketch/core/graph/Graph;", "getRootGraph", "()Lcom/zykj/sketch/core/graph/Graph;", "graph", "setRootGraph", "(Lcom/zykj/sketch/core/graph/Graph;)V", "", "x", "y", TypedValues.CycleType.S_WAVE_OFFSET, "", "findGraph", "(FFF)Ljava/util/List;", "findSelectGraph", "()Ljava/util/List;", "render", "()V", "forceRender", "Landroid/graphics/Canvas;", "canvas", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Bitmap;", "bitmap", "renderTempThumbnail", "(Landroid/graphics/Bitmap;)V", "Landroid/graphics/Path;", "path", "Landroid/graphics/Paint;", "paint", "renderTempPath", "(Landroid/graphics/Path;Landroid/graphics/Paint;)V", "", "isTouch", "()Z", "touch", "setTouch", "(Z)V", "config", "setRecordConfig", "(Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;)V", "isRender", "targetWidth", "targetHeight", "width", "height", "setCameraMatrix", "(IIII)V", "Landroid/graphics/Matrix;", "matrix", "(Landroid/graphics/Matrix;)V", "getScale", "()F", "getDeleteBitmap", "()Landroid/graphics/Bitmap;", "getCameraMatrix", "()Landroid/graphics/Matrix;", "clearTempPaint", "resetStatus", "resetGraph", "reset", "onDestroy", "clear", "Lcom/zykj/sketch/core/listener/GraphMatrixListener;", "listener", "setGraphMatrixListener", "(Lcom/zykj/sketch/core/listener/GraphMatrixListener;)V", "getGraphMatrixListener", "()Lcom/zykj/sketch/core/listener/GraphMatrixListener;", "Lcom/zykj/sketch/core/listener/ImageDeleteListener;", "setImageDeleteListener", "(Lcom/zykj/sketch/core/listener/ImageDeleteListener;)V", "getImageDeleteListener", "()Lcom/zykj/sketch/core/listener/ImageDeleteListener;", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public interface IControl {

    @Metadata(m5111k = 3, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static /* synthetic */ List findGraph$default(IControl iControl, float f, float f7, float f8, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findGraph");
            }
            if ((i & 4) != 0) {
                f8 = 0.0f;
            }
            return iControl.findGraph(f, f7, f8);
        }
    }

    void clear();

    void clearTempPaint();

    @NotNull
    List<Graph> findGraph(float x3, float y2, float offset);

    @NotNull
    List<Graph> findSelectGraph();

    void forceRender();

    int getBackgroundColor();

    @NotNull
    Matrix getCameraMatrix();

    @NotNull
    Bitmap getDeleteBitmap();

    @Nullable
    EzyDrawBoard.DrawArea getDrawArea();

    @NotNull
    EzyDrawBoard.ActionGraphConfig.GraphConfig getGraphConfig();

    @Nullable
    GraphMatrixListener getGraphMatrixListener();

    @Nullable
    ImageDeleteListener getImageDeleteListener();

    @NotNull
    EzyDrawBoard.ActionModeConfig.Mode getMode();

    @NotNull
    Graph getRootGraph();

    float getScale();

    @NotNull
    SketchConfig getSketchConfig();

    void isRender(boolean isRender);

    boolean isRender();

    boolean isTouch();

    void onDestroy();

    void render();

    void render(@NotNull Canvas canvas);

    void renderTempPath(@NotNull Path path, @NotNull Paint paint);

    void renderTempThumbnail(@Nullable Bitmap bitmap);

    void reset();

    void resetGraph();

    void resetStatus();

    void setBackgroundColor(int color);

    void setCameraMatrix(int targetWidth, int targetHeight, int width, int height);

    void setCameraMatrix(@NotNull Matrix matrix);

    void setDrawArea(@Nullable EzyDrawBoard.DrawArea drawArea);

    void setGraphMatrixListener(@Nullable GraphMatrixListener listener);

    void setImageDeleteListener(@Nullable ImageDeleteListener listener);

    void setMode(@NotNull EzyDrawBoard.ActionModeConfig.Mode mode);

    void setRecordConfig(@NotNull EzyDrawBoard.ActionGraphConfig.GraphConfig config);

    void setRootGraph(@NotNull Graph graph);

    void setTouch(boolean touch);
}
