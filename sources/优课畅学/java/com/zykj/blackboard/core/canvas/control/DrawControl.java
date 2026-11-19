package com.zykj.blackboard.core.canvas.control;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectDrawControl;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionType;
import com.zykj.blackboard.core.action.newSelectAtion.function.FunctionRectF;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.view.ActiveLayer;
import com.zykj.blackboard.core.canvas.view.BackgroundLayer;
import com.zykj.blackboard.core.canvas.view.FixLayer;
import com.zykj.blackboard.core.canvas.view.MaskLayer;
import com.zykj.blackboard.core.canvas.view.RenderLayer;
import com.zykj.blackboard.core.edit.RenderChangeListener;
import com.zykj.blackboard.core.graph.IDraw;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graph.group.TextGraph;
import com.zykj.blackboard.utils.BitmapUtil;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.blackboard.utils.RectExtKt;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes4.dex */
public final class DrawControl {
    private Bitmap activeLayerBitmap;
    private Canvas activeLayerCanvas;
    private final BoardConfig boardConfig;
    private final Paint boardPaint;
    private Bitmap cameraBitmap;
    private Canvas cameraCanvas;
    private final RectF cameraRenderRectF;
    private RectF drawLimitRectF;
    private Bitmap fixLayerBitmap;
    private Canvas fixLayerCanvas;
    private MatrixAdapter matrixAdapter;
    private final NewSelectDrawControl newSelectDrawControl;
    private final RectF oldPageRectF;
    private final DrawControl$renderChangeListener$1 renderChangeListener;
    private RenderLayer renderLayer;
    private final Rect renderLayerRect;
    private Bitmap snapshotBitmap;
    private final Matrix tempMatrix;
    private final RectF tempRenderLimitRectF;
    private final Matrix translateMatrix;

    /* JADX WARN: Type inference failed for: r0v9, types: [com.zykj.blackboard.core.canvas.control.DrawControl$renderChangeListener$1] */
    public DrawControl(BoardConfig boardConfig) {
        AbstractC9133u.m16133g(boardConfig, "boardConfig");
        this.boardConfig = boardConfig;
        this.oldPageRectF = new RectF();
        this.drawLimitRectF = new RectF();
        this.renderLayerRect = new Rect();
        this.cameraRenderRectF = new RectF();
        this.translateMatrix = new Matrix();
        this.tempRenderLimitRectF = new RectF();
        this.tempMatrix = new Matrix();
        Paint paint = new Paint();
        paint.setColor(-16776961);
        paint.setStrokeWidth(5.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setDither(true);
        paint.setAntiAlias(true);
        this.boardPaint = paint;
        this.renderChangeListener = new RenderChangeListener() { // from class: com.zykj.blackboard.core.canvas.control.DrawControl$renderChangeListener$1
            @Override // com.zykj.blackboard.core.edit.RenderChangeListener
            public void onCameraChange(Matrix matrix) {
                AbstractC9133u.m16133g(matrix, "matrix");
                this.this$0.drawMaskLayer();
            }

            @Override // com.zykj.blackboard.core.edit.RenderChangeListener
            public void onRenderChange(RectF renderRectF, RectF visibleRectF) {
                AbstractC9133u.m16133g(renderRectF, "renderRectF");
                AbstractC9133u.m16133g(visibleRectF, "visibleRectF");
            }
        };
        this.newSelectDrawControl = new NewSelectDrawControl(boardConfig);
    }

    private final void checkActiveLayer() {
        Bitmap bitmap = this.activeLayerBitmap;
        if (bitmap != null) {
            AbstractC9133u.m16130d(bitmap);
            if (!bitmap.isRecycled()) {
                Bitmap bitmap2 = this.activeLayerBitmap;
                AbstractC9133u.m16130d(bitmap2);
                if (bitmap2.getWidth() == this.renderLayerRect.width()) {
                    Bitmap bitmap3 = this.activeLayerBitmap;
                    AbstractC9133u.m16130d(bitmap3);
                    if (bitmap3.getHeight() == this.renderLayerRect.height()) {
                        return;
                    }
                }
            }
        }
        initActiveLayer(new RectF(this.renderLayerRect));
    }

    private final void clearActiveBitmapAndCanvas() {
        Bitmap bitmap = this.activeLayerBitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.activeLayerBitmap = null;
        this.activeLayerCanvas = null;
    }

    private final void drawActiveLayer(Matrix matrix) {
        RenderLayer renderLayer;
        ActiveLayer activeLayer;
        Bitmap bitmap = this.activeLayerBitmap;
        if (bitmap == null || (renderLayer = this.renderLayer) == null || (activeLayer = renderLayer.getActiveLayer()) == null) {
            return;
        }
        activeLayer.draw(bitmap, matrix);
    }

    public static /* synthetic */ void drawActiveLayer$default(DrawControl drawControl, Matrix matrix, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            matrix = null;
        }
        drawControl.drawActiveLayer(matrix);
    }

    private final void drawBackground(Canvas canvas, Matrix matrix) {
        BackgroundLayer backgroundLayer;
        RenderLayer renderLayer = this.renderLayer;
        if (renderLayer == null || (backgroundLayer = renderLayer.getBackgroundLayer()) == null) {
            return;
        }
        backgroundLayer.drawBackground(canvas, matrix);
    }

    public static /* synthetic */ void drawBackground$default(DrawControl drawControl, Canvas canvas, Matrix matrix, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            matrix = new Matrix();
        }
        drawControl.drawBackground(canvas, matrix);
    }

    private final void drawFixLayer() {
        RenderLayer renderLayer;
        FixLayer fixLayer;
        Bitmap bitmap = this.fixLayerBitmap;
        if (bitmap == null || (renderLayer = this.renderLayer) == null || (fixLayer = renderLayer.getFixLayer()) == null) {
            return;
        }
        fixLayer.draw(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void drawMaskLayer() {
        MaskLayer maskLayer;
        MaskLayer maskLayer2;
        MaskLayer maskLayer3;
        float fIntValue;
        float fIntValue2;
        Rect renderRect;
        Rect renderRect2;
        if (this.boardConfig.getMoveActionConfig().isMoveActionEnable()) {
            if (this.oldPageRectF.isEmpty()) {
                RenderLayer renderLayer = this.renderLayer;
                Integer numValueOf = null;
                Integer numValueOf2 = (renderLayer == null || (renderRect2 = renderLayer.getRenderRect()) == null) ? null : Integer.valueOf(renderRect2.width());
                AbstractC9133u.m16130d(numValueOf2);
                fIntValue = numValueOf2.intValue();
                RenderLayer renderLayer2 = this.renderLayer;
                if (renderLayer2 != null && (renderRect = renderLayer2.getRenderRect()) != null) {
                    numValueOf = Integer.valueOf(renderRect.height());
                }
                AbstractC9133u.m16130d(numValueOf);
                fIntValue2 = numValueOf.intValue();
            } else {
                fIntValue = this.oldPageRectF.width();
                fIntValue2 = this.oldPageRectF.height();
            }
            this.drawLimitRectF.set(0.0f, 0.0f, fIntValue * this.boardConfig.getMoveActionConfig().getMaxWidthTimes(), fIntValue2 * this.boardConfig.getMoveActionConfig().getMaxHeightTimes());
        } else {
            this.drawLimitRectF.setEmpty();
        }
        if (this.drawLimitRectF.isEmpty()) {
            RenderLayer renderLayer3 = this.renderLayer;
            if (renderLayer3 == null || (maskLayer3 = renderLayer3.getMaskLayer()) == null) {
                return;
            }
            maskLayer3.hide();
            return;
        }
        this.tempRenderLimitRectF.set(this.drawLimitRectF);
        Matrix matrix = this.tempMatrix;
        matrix.reset();
        MatrixAdapter matrixAdapter = this.matrixAdapter;
        if (matrixAdapter != null) {
            if (this.oldPageRectF.isEmpty()) {
                matrix.postConcat(MatrixExtKt.invert(matrixAdapter.getScreenMatrix()));
                matrix.postConcat(matrixAdapter.getAdapterMatrix());
            } else {
                matrix.postConcat(matrixAdapter.getAdapterMatrix());
            }
        }
        this.tempMatrix.mapRect(this.tempRenderLimitRectF);
        if (!this.tempRenderLimitRectF.intersect(RectExtKt.toRectF(this.renderLayerRect))) {
            RenderLayer renderLayer4 = this.renderLayer;
            if (renderLayer4 == null || (maskLayer2 = renderLayer4.getMaskLayer()) == null) {
                return;
            }
            maskLayer2.hide();
            return;
        }
        RenderLayer renderLayer5 = this.renderLayer;
        if (renderLayer5 == null || (maskLayer = renderLayer5.getMaskLayer()) == null) {
            return;
        }
        maskLayer.show();
        maskLayer.changeClipRectF(this.tempRenderLimitRectF);
        maskLayer.refresh();
    }

    public static /* synthetic */ void drawPath$default(DrawControl drawControl, Path path, Paint paint, Matrix matrix, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            paint = drawControl.boardPaint;
        }
        drawControl.drawPath(path, paint, matrix);
    }

    public static /* synthetic */ Bitmap getMinScreenShot$default(DrawControl drawControl, IGraph iGraph, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, IGraph iGraph2, int i14, Object obj) {
        if ((i14 & 32) != 0) {
            z10 = false;
        }
        if ((i14 & 64) != 0) {
            z11 = false;
        }
        if ((i14 & 128) != 0) {
            z12 = false;
        }
        if ((i14 & 256) != 0) {
            iGraph2 = null;
        }
        return drawControl.getMinScreenShot(iGraph, i10, i11, i12, i13, z10, z11, z12, iGraph2);
    }

    private final void initActiveLayer(RectF rectF) {
        Bitmap bitmap = this.activeLayerBitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
        if (rectF.isEmpty()) {
            return;
        }
        this.activeLayerBitmap = Bitmap.createBitmap((int) rectF.width(), (int) rectF.height(), Bitmap.Config.ARGB_8888);
        Bitmap bitmap2 = this.activeLayerBitmap;
        AbstractC9133u.m16130d(bitmap2);
        this.activeLayerCanvas = new Canvas(bitmap2);
    }

    private final void initCameraBitmap(IGraph iGraph) {
        Matrix matrix;
        RectF rectF = this.cameraRenderRectF;
        rectF.setEmpty();
        Iterator<T> it = iGraph.getChildGraph().iterator();
        while (true) {
            Matrix adapterMatrix = null;
            if (!it.hasNext()) {
                break;
            }
            IGraph iGraph2 = (IGraph) it.next();
            MatrixAdapter matrixAdapter = this.matrixAdapter;
            if (matrixAdapter != null) {
                adapterMatrix = matrixAdapter.getAdapterMatrix();
            }
            rectF.union(iGraph2.getMinOutRectF(adapterMatrix));
        }
        Bitmap bitmap = this.cameraBitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
        if (this.cameraRenderRectF.isEmpty()) {
            this.cameraBitmap = null;
            this.cameraCanvas = null;
        } else {
            this.cameraBitmap = Bitmap.createBitmap((int) this.cameraRenderRectF.width(), (int) this.cameraRenderRectF.height(), Bitmap.Config.ARGB_8888);
            Bitmap bitmap2 = this.cameraBitmap;
            AbstractC9133u.m16130d(bitmap2);
            this.cameraCanvas = new Canvas(bitmap2);
        }
        Canvas canvas = this.cameraCanvas;
        if (canvas != null) {
            canvas.save();
            RectF rectF2 = this.cameraRenderRectF;
            canvas.translate(-rectF2.left, -rectF2.top);
            MatrixAdapter matrixAdapter2 = this.matrixAdapter;
            if (matrixAdapter2 == null || (matrix = matrixAdapter2.getAdapterMatrix()) == null) {
                matrix = new Matrix();
            }
            IDraw.DefaultImpls.onDraw$default(iGraph, canvas, matrix, null, false, true, 12, null);
            canvas.restore();
        }
    }

    public static /* synthetic */ void newSelect$default(DrawControl drawControl, RectF rectF, Matrix matrix, RectF rectF2, FunctionRectF functionRectF, List list, PointF pointF, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            pointF = null;
        }
        drawControl.newSelect(rectF, matrix, rectF2, functionRectF, list, pointF);
    }

    public final void add(IGraph graph) {
        ActiveLayer activeLayer;
        MatrixAdapter matrixAdapter;
        AbstractC9133u.m16133g(graph, "graph");
        Canvas canvas = this.fixLayerCanvas;
        if (canvas != null && (matrixAdapter = this.matrixAdapter) != null) {
            graph.render(canvas, matrixAdapter.getAdapterMatrix());
        }
        Log.i("DrawView", "开始绘制");
        drawFixLayer();
        RenderLayer renderLayer = this.renderLayer;
        if (renderLayer == null || (activeLayer = renderLayer.getActiveLayer()) == null) {
            return;
        }
        activeLayer.clear();
    }

    public final void cameraChangeEnd(IGraph rootGraph) {
        Matrix adapterMatrix;
        ActiveLayer activeLayer;
        AbstractC9133u.m16133g(rootGraph, "rootGraph");
        Canvas canvas = this.fixLayerCanvas;
        if (canvas != null) {
            DrawControlKt.clear(canvas);
            MatrixAdapter matrixAdapter = this.matrixAdapter;
            if (matrixAdapter != null) {
                IDraw.DefaultImpls.onDraw$default(rootGraph, canvas, matrixAdapter.getAdapterMatrix(), null, false, this.boardConfig.isGroupGraphComplete(), 12, null);
            }
        }
        drawFixLayer();
        if (this.boardConfig.isGroupGraphComplete()) {
            clearActiveBitmapAndCanvas();
            RenderLayer renderLayer = this.renderLayer;
            if (renderLayer != null && (activeLayer = renderLayer.getActiveLayer()) != null) {
                activeLayer.clear();
            }
        } else {
            checkActiveLayer();
            Canvas canvas2 = this.activeLayerCanvas;
            if (canvas2 != null) {
                canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            }
            drawActiveLayer$default(this, null, 1, null);
        }
        MatrixAdapter matrixAdapter2 = this.matrixAdapter;
        if (matrixAdapter2 == null || (adapterMatrix = matrixAdapter2.getAdapterMatrix()) == null) {
            return;
        }
        updateBackgroundMatrix(adapterMatrix);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void cameraChangeStart(com.zykj.blackboard.core.graph.IGraph r7) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.canvas.control.DrawControl.cameraChangeStart(com.zykj.blackboard.core.graph.IGraph):void"); // DEX body: android/优课畅学/smali_classes4/com/zykj/blackboard/core/canvas/control/DrawControl.smali:1992
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void cameraChanging(android.graphics.Matrix r8) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.canvas.control.DrawControl.cameraChanging(android.graphics.Matrix):void"); // DEX body: android/优课畅学/smali_classes4/com/zykj/blackboard/core/canvas/control/DrawControl.smali:2460
    }

    public final Bitmap contentThumbnail(IGraph graph) {
        Matrix screenMatrix;
        FixLayer fixLayer;
        AbstractC9133u.m16133g(graph, "graph");
        RectF rectF = new RectF();
        Iterator<T> it = graph.getChildGraph().iterator();
        while (true) {
            Matrix screenMatrix2 = null;
            if (!it.hasNext()) {
                break;
            }
            IGraph iGraph = (IGraph) it.next();
            MatrixAdapter matrixAdapter = this.matrixAdapter;
            if (matrixAdapter != null) {
                screenMatrix2 = matrixAdapter.getScreenMatrix();
            }
            rectF.union(iGraph.getMinOutRectF(screenMatrix2));
        }
        RenderLayer renderLayer = this.renderLayer;
        RectF rectF2 = new RectF((renderLayer == null || (fixLayer = renderLayer.getFixLayer()) == null) ? null : fixLayer.rect());
        RectF rectF3 = new RectF();
        if (this.boardConfig.getMoveActionConfig().isMoveActionEnable()) {
            rectF3.set(0.0f, 0.0f, rectF2.width() * this.boardConfig.getMoveActionConfig().getMaxWidthTimes(), rectF2.height() * this.boardConfig.getMoveActionConfig().getMaxHeightTimes());
        } else {
            rectF3.set(rectF2);
        }
        float fMin = Math.min(rectF3.bottom, rectF.bottom);
        rectF3.bottom = fMin;
        rectF3.bottom = Math.max(fMin, rectF2.bottom);
        if (rectF3.isEmpty()) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) rectF3.width(), (int) rectF3.height(), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        MatrixAdapter matrixAdapter2 = this.matrixAdapter;
        if (matrixAdapter2 != null && (screenMatrix = matrixAdapter2.getScreenMatrix()) != null) {
            drawBackground(canvas, screenMatrix);
            graph.onDraw(canvas, screenMatrix, null, false, true);
        }
        return bitmapCreateBitmap;
    }

    public final void delete(IGraph rootGraph) {
        Matrix matrix;
        AbstractC9133u.m16133g(rootGraph, "rootGraph");
        Canvas canvas = this.fixLayerCanvas;
        if (canvas != null) {
            DrawControlKt.clear(canvas);
            MatrixAdapter matrixAdapter = this.matrixAdapter;
            if (matrixAdapter == null || (matrix = matrixAdapter.getAdapterMatrix()) == null) {
                matrix = new Matrix();
            }
            IDraw.DefaultImpls.onDraw$default(rootGraph, canvas, matrix, null, false, this.boardConfig.isGroupGraphComplete(), 12, null);
        }
        drawFixLayer();
    }

    public final void drawGraphInActive(List<? extends IGraph> graphList) {
        Matrix matrix;
        AbstractC9133u.m16133g(graphList, "graphList");
        Canvas canvas = this.activeLayerCanvas;
        if (canvas != null) {
            for (IGraph iGraph : graphList) {
                MatrixAdapter matrixAdapter = this.matrixAdapter;
                if (matrixAdapter == null || (matrix = matrixAdapter.getAdapterMatrix()) == null) {
                    matrix = new Matrix();
                }
                IDraw.DefaultImpls.onDraw$default(iGraph, canvas, matrix, null, false, this.boardConfig.isGroupGraphComplete(), 12, null);
            }
        }
        drawActiveLayer$default(this, null, 1, null);
    }

    public final void drawGraphInFix(List<? extends IGraph> graphList) {
        Matrix matrix;
        AbstractC9133u.m16133g(graphList, "graphList");
        Canvas canvas = this.fixLayerCanvas;
        if (canvas != null) {
            DrawControlKt.clear(canvas);
            for (IGraph iGraph : graphList) {
                MatrixAdapter matrixAdapter = this.matrixAdapter;
                if (matrixAdapter == null || (matrix = matrixAdapter.getAdapterMatrix()) == null) {
                    matrix = new Matrix();
                }
                IDraw.DefaultImpls.onDraw$default(iGraph, canvas, matrix, null, false, this.boardConfig.isGroupGraphComplete(), 12, null);
            }
        }
        drawFixLayer();
    }

    public final void drawPath(Path path, Paint paint, Matrix matrix) {
        ActiveLayer activeLayer;
        AbstractC9133u.m16133g(path, "path");
        AbstractC9133u.m16133g(paint, "paint");
        RenderLayer renderLayer = this.renderLayer;
        if (renderLayer == null || (activeLayer = renderLayer.getActiveLayer()) == null) {
            return;
        }
        activeLayer.draw(path, paint, matrix);
    }

    public final int getBackgroundColor() {
        BackgroundLayer backgroundLayer;
        RenderLayer renderLayer = this.renderLayer;
        if (renderLayer != null && (backgroundLayer = renderLayer.getBackgroundLayer()) != null) {
            Integer numValueOf = Integer.valueOf(backgroundLayer.getMyBackgroundColor());
            if (numValueOf.intValue() == 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        return this.boardConfig.getBackgroundColorOutside();
    }

    public final BackgroundLineConfig getBackgroundLineConfig() {
        BackgroundLayer backgroundLayer;
        BackgroundLineConfig backgroundLineConfig;
        RenderLayer renderLayer = this.renderLayer;
        return (renderLayer == null || (backgroundLayer = renderLayer.getBackgroundLayer()) == null || (backgroundLineConfig = backgroundLayer.getBackgroundLineConfig()) == null) ? new BackgroundLineConfig(0, 0.0f, null, 0.0f, 15, null) : backgroundLineConfig;
    }

    public final Bitmap getMinScreenShot(IGraph graph, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, final IGraph iGraph) {
        int i14;
        Matrix adapterMatrix;
        FixLayer fixLayer;
        AbstractC9133u.m16133g(graph, "graph");
        RectF rectF = new RectF();
        Iterator<T> it = graph.getChildGraph().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            IGraph iGraph2 = (IGraph) it.next();
            if (!AbstractC9133u.m16128b(iGraph2, iGraph)) {
                MatrixAdapter matrixAdapter = this.matrixAdapter;
                rectF.union(iGraph2.getMinOutRectF(matrixAdapter != null ? matrixAdapter.getAdapterMatrix() : null));
            }
        }
        float f10 = i10;
        rectF.left -= f10;
        rectF.right += f10;
        float f11 = i11;
        rectF.top -= f11;
        rectF.bottom += f11;
        RenderLayer renderLayer = this.renderLayer;
        RectF rectF2 = new RectF((renderLayer == null || (fixLayer = renderLayer.getFixLayer()) == null) ? null : fixLayer.rect());
        RectF rectF3 = new RectF();
        if (this.boardConfig.getMoveActionConfig().isMoveActionEnable()) {
            rectF3.set(0.0f, 0.0f, rectF2.width() * this.boardConfig.getMoveActionConfig().getMaxWidthTimes(), rectF2.height() * this.boardConfig.getMoveActionConfig().getMaxHeightTimes());
            Matrix matrix = new Matrix();
            MatrixAdapter matrixAdapter2 = this.matrixAdapter;
            if (matrixAdapter2 != null) {
                matrix.postConcat(MatrixExtKt.invert(matrixAdapter2.getScreenMatrix()));
                matrix.postConcat(matrixAdapter2.getAdapterMatrix());
            }
            matrix.mapRect(rectF3);
        } else {
            rectF3.setEmpty();
        }
        MatrixAdapter matrixAdapter3 = this.matrixAdapter;
        if (matrixAdapter3 != null && (adapterMatrix = matrixAdapter3.getAdapterMatrix()) != null) {
            adapterMatrix.mapRect(rectF2);
        }
        if (z11 && !rectF3.isEmpty()) {
            rectF2.intersect(rectF3);
            rectF.intersect(rectF3);
        }
        Matrix matrix2 = new Matrix();
        MatrixAdapter matrixAdapter4 = this.matrixAdapter;
        if (matrixAdapter4 != null) {
            matrix2.postConcat(matrixAdapter4.getAdapterMatrix());
        }
        int iWidth = (int) rectF.width();
        int iHeight = (int) rectF.height();
        if (z10) {
            matrix2.postTranslate(-rectF2.left, 0.0f);
            iWidth = (int) rectF2.width();
        } else if (iWidth < i12) {
            matrix2.postTranslate(((i12 - iWidth) / 2) - rectF.left, 0.0f);
            iWidth = i12;
        } else {
            matrix2.postTranslate(-rectF.left, 0.0f);
        }
        if (z12 && !rectF3.isEmpty()) {
            matrix2.postTranslate(0.0f, -rectF3.top);
            i14 = (int) (rectF.bottom - rectF3.top);
        } else if (iHeight < i13) {
            matrix2.postTranslate(0.0f, ((i13 - iHeight) / 2) - rectF.top);
            i14 = i13;
        } else {
            matrix2.postTranslate(0.0f, -rectF.top);
            i14 = iHeight;
        }
        if (iWidth <= 0 || i14 <= 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iWidth, i14, Bitmap.Config.ARGB_8888);
        this.snapshotBitmap = bitmapCreateBitmap;
        if (bitmapCreateBitmap != null) {
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawBackground(canvas, matrix2);
            graph.onDraw(canvas, matrix2, new InterfaceC10570l() { // from class: com.zykj.blackboard.core.canvas.control.DrawControl$getMinScreenShot$1$1
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public final Boolean invoke(IGraph it2) {
                    AbstractC9133u.m16133g(it2, "it");
                    return Boolean.valueOf(AbstractC9133u.m16128b(it2, iGraph));
                }
            }, false, true);
        }
        return this.snapshotBitmap;
    }

    public final RectF getOldPageRectF() {
        return this.oldPageRectF;
    }

    public final void newSelect(RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, FunctionRectF functionRectF, List<? extends NewSelectFunctionType> typeList, PointF pointF) {
        AbstractC9133u.m16133g(selectRectF, "selectRectF");
        AbstractC9133u.m16133g(matrix, "matrix");
        AbstractC9133u.m16133g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC9133u.m16133g(functionRectF, "functionRectF");
        AbstractC9133u.m16133g(typeList, "typeList");
        Path selectPath = this.newSelectDrawControl.getSelectPath(selectRectF, typeList, matrix);
        if (!this.boardConfig.isGroupGraphComplete()) {
            checkActiveLayer();
            Canvas canvas = this.activeLayerCanvas;
            if (canvas != null) {
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                this.newSelectDrawControl.drawSelect(canvas, getBackgroundColor(), selectPath, functionRectF, typeList, pointF);
            }
            drawActiveLayer$default(this, null, 1, null);
            return;
        }
        RectF rectF = new RectF();
        selectPath.computeBounds(rectF, false);
        rectF.left -= 3.0f;
        rectF.top -= 3.0f;
        rectF.right += 3.0f;
        rectF.bottom += 3.0f;
        RectF rectF2 = new RectF();
        rectF2.union(rectF);
        rectF2.union(selectFunctionRectF);
        initActiveLayer(rectF2);
        Canvas canvas2 = this.activeLayerCanvas;
        if (canvas2 != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas2.save();
            canvas2.translate(-rectF2.left, -rectF2.top);
            this.newSelectDrawControl.drawSelect(canvas2, getBackgroundColor(), selectPath, functionRectF, typeList, pointF);
            canvas2.restore();
        }
        this.tempMatrix.setTranslate(rectF2.left, rectF2.top);
        drawActiveLayer(this.tempMatrix);
    }

    public final void newSelecting(float f10, float f11, float f12, float f13) {
        ActiveLayer activeLayer;
        RenderLayer renderLayer = this.renderLayer;
        if (renderLayer == null || (activeLayer = renderLayer.getActiveLayer()) == null) {
            return;
        }
        activeLayer.draw(this.newSelectDrawControl.drawSelectingPath(f10, f11, f12, f13), this.newSelectDrawControl.drawSelectingPaint(getBackgroundColor()), null);
    }

    public final void newTextHandleEnd(IGraph rootGraph, RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, FunctionRectF functionRectF, List<? extends NewSelectFunctionType> typeList, PointF pointF) {
        AbstractC9133u.m16133g(rootGraph, "rootGraph");
        AbstractC9133u.m16133g(selectRectF, "selectRectF");
        AbstractC9133u.m16133g(matrix, "matrix");
        AbstractC9133u.m16133g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC9133u.m16133g(functionRectF, "functionRectF");
        AbstractC9133u.m16133g(typeList, "typeList");
        Canvas canvas = this.fixLayerCanvas;
        if (canvas != null) {
            DrawControlKt.clear(canvas);
            MatrixAdapter matrixAdapter = this.matrixAdapter;
            if (matrixAdapter != null) {
                IDraw.DefaultImpls.onDraw$default(rootGraph, canvas, matrixAdapter.getAdapterMatrix(), null, false, this.boardConfig.isGroupGraphComplete(), 8, null);
            }
        }
        drawFixLayer();
        newSelect(selectRectF, matrix, selectFunctionRectF, functionRectF, typeList, pointF);
    }

    public final void newTextHandleStart(IGraph rootGraph, final IGraph textGraph, RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, FunctionRectF functionRectF, List<? extends NewSelectFunctionType> typeList, PointF pointF) {
        AbstractC9133u.m16133g(rootGraph, "rootGraph");
        AbstractC9133u.m16133g(textGraph, "textGraph");
        AbstractC9133u.m16133g(selectRectF, "selectRectF");
        AbstractC9133u.m16133g(matrix, "matrix");
        AbstractC9133u.m16133g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC9133u.m16133g(functionRectF, "functionRectF");
        AbstractC9133u.m16133g(typeList, "typeList");
        Canvas canvas = this.fixLayerCanvas;
        if (canvas != null) {
            DrawControlKt.clear(canvas);
            MatrixAdapter matrixAdapter = this.matrixAdapter;
            if (matrixAdapter != null) {
                IDraw.DefaultImpls.onDraw$default(rootGraph, canvas, matrixAdapter.getAdapterMatrix(), new InterfaceC10570l() { // from class: com.zykj.blackboard.core.canvas.control.DrawControl$newTextHandleStart$1$1$1
                    {
                        super(1);
                    }

                    @Override // p300x7.InterfaceC10570l
                    public final Boolean invoke(IGraph childGraph) {
                        AbstractC9133u.m16133g(childGraph, "childGraph");
                        return Boolean.valueOf(AbstractC9133u.m16128b(childGraph.getId(), textGraph.getId()));
                    }
                }, false, this.boardConfig.isGroupGraphComplete(), 8, null);
            }
        }
        drawFixLayer();
        newTextHandling(textGraph, selectRectF, matrix, selectFunctionRectF, functionRectF, typeList, pointF);
    }

    public final void newTextHandling(IGraph textGraph, RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, FunctionRectF functionRectF, List<? extends NewSelectFunctionType> typeList, PointF pointF) {
        RectF rectF;
        Matrix matrix2;
        AbstractC9133u.m16133g(textGraph, "textGraph");
        AbstractC9133u.m16133g(selectRectF, "selectRectF");
        AbstractC9133u.m16133g(matrix, "matrix");
        AbstractC9133u.m16133g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC9133u.m16133g(functionRectF, "functionRectF");
        AbstractC9133u.m16133g(typeList, "typeList");
        Path selectPath = this.newSelectDrawControl.getSelectPath(selectRectF, typeList, matrix);
        if (!this.boardConfig.isGroupGraphComplete()) {
            checkActiveLayer();
            Canvas canvas = this.activeLayerCanvas;
            if (canvas != null) {
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                MatrixAdapter matrixAdapter = this.matrixAdapter;
                if (matrixAdapter != null) {
                    IDraw.DefaultImpls.onDraw$default(textGraph, canvas, matrixAdapter.getAdapterMatrix(), null, false, false, 28, null);
                }
                this.newSelectDrawControl.drawSelect(canvas, getBackgroundColor(), selectPath, functionRectF, typeList, pointF);
            }
            drawActiveLayer$default(this, null, 1, null);
            return;
        }
        RectF rectF2 = new RectF();
        selectPath.computeBounds(rectF2, false);
        rectF2.left -= 3.0f;
        rectF2.top -= 3.0f;
        rectF2.right += 3.0f;
        rectF2.bottom += 3.0f;
        RectF rectF3 = new RectF();
        rectF3.union(rectF2);
        rectF3.union(selectFunctionRectF);
        initActiveLayer(rectF3);
        Canvas canvas2 = this.activeLayerCanvas;
        if (canvas2 != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas2.save();
            canvas2.translate(-rectF3.left, -rectF3.top);
            MatrixAdapter matrixAdapter2 = this.matrixAdapter;
            if (matrixAdapter2 == null || (matrix2 = matrixAdapter2.getAdapterMatrix()) == null) {
                matrix2 = new Matrix();
            }
            IDraw.DefaultImpls.onDraw$default(textGraph, canvas2, matrix2, null, false, true, 12, null);
            rectF = rectF3;
            this.newSelectDrawControl.drawSelect(canvas2, getBackgroundColor(), selectPath, functionRectF, typeList, pointF);
            canvas2.restore();
        } else {
            rectF = rectF3;
        }
        this.tempMatrix.setTranslate(rectF.left, rectF.top);
        drawActiveLayer(this.tempMatrix);
    }

    public final boolean refresh() {
        ActiveLayer activeLayer;
        FixLayer fixLayer;
        RenderLayer renderLayer = this.renderLayer;
        if (renderLayer != null && (fixLayer = renderLayer.getFixLayer()) != null) {
            fixLayer.refresh();
        }
        RenderLayer renderLayer2 = this.renderLayer;
        if (renderLayer2 == null || (activeLayer = renderLayer2.getActiveLayer()) == null) {
            return true;
        }
        activeLayer.refresh();
        return true;
    }

    public final void release() {
        this.fixLayerCanvas = null;
        this.activeLayerCanvas = null;
        BitmapUtil.INSTANCE.recycle(new Bitmap[]{this.fixLayerBitmap, this.activeLayerBitmap, this.snapshotBitmap, this.cameraBitmap}, new InterfaceC10559a() { // from class: com.zykj.blackboard.core.canvas.control.DrawControl.release.1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27427invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27427invoke() {
                DrawControl.this.fixLayerBitmap = null;
                DrawControl.this.activeLayerBitmap = null;
                DrawControl.this.snapshotBitmap = null;
                DrawControl.this.cameraBitmap = null;
            }
        });
        MatrixAdapter matrixAdapter = this.matrixAdapter;
        if (matrixAdapter != null) {
            matrixAdapter.unRegisterRenderRectFChangeListener(this.renderChangeListener);
        }
    }

    public final void renderRectFInFix(RectF rectF, List<IGraph> graphList) {
        Matrix matrix;
        AbstractC9133u.m16133g(rectF, "rectF");
        AbstractC9133u.m16133g(graphList, "graphList");
        Rect rect = new Rect();
        rect.left = ((int) rectF.left) + 1;
        rect.top = ((int) rectF.top) + 1;
        rect.right = (int) rectF.right;
        rect.bottom = (int) rectF.bottom;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.translate(-rect.left, -rect.top);
        for (IGraph iGraph : graphList) {
            MatrixAdapter matrixAdapter = this.matrixAdapter;
            if (matrixAdapter == null || (matrix = matrixAdapter.getAdapterMatrix()) == null) {
                matrix = new Matrix();
            }
            IDraw.DefaultImpls.onDraw$default(iGraph, canvas, matrix, null, false, this.boardConfig.isGroupGraphComplete(), 4, null);
        }
        Canvas canvas2 = this.fixLayerCanvas;
        if (canvas2 != null) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            C8736p c8736p = C8736p.f16368a;
            canvas2.drawRect(rect, paint);
            canvas2.drawBitmap(bitmapCreateBitmap, new Rect(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight()), rect, (Paint) null);
        }
        drawFixLayer();
    }

    public final void reset() {
        RenderLayer renderLayer = this.renderLayer;
        if (renderLayer != null) {
            renderLayer.reset();
        }
    }

    public final Bitmap screenshot(IGraph graph) {
        Matrix adapterMatrix;
        FixLayer fixLayer;
        AbstractC9133u.m16133g(graph, "graph");
        RenderLayer renderLayer = this.renderLayer;
        RectF rectF = new RectF((renderLayer == null || (fixLayer = renderLayer.getFixLayer()) == null) ? null : fixLayer.rect());
        RectF rectF2 = new RectF();
        if (this.boardConfig.getMoveActionConfig().isMoveActionEnable()) {
            rectF2.set(0.0f, 0.0f, rectF.width() * this.boardConfig.getMoveActionConfig().getMaxWidthTimes(), rectF.height() * this.boardConfig.getMoveActionConfig().getMaxHeightTimes());
            Matrix matrix = new Matrix();
            MatrixAdapter matrixAdapter = this.matrixAdapter;
            if (matrixAdapter != null) {
                matrix.postConcat(MatrixExtKt.invert(matrixAdapter.getScreenMatrix()));
                matrix.postConcat(matrixAdapter.getAdapterMatrix());
            }
            matrix.mapRect(rectF2);
        } else {
            rectF2.setEmpty();
        }
        if (!rectF2.isEmpty()) {
            rectF.intersect(rectF2);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) rectF.width()) + 1, ((int) rectF.height()) + 1, Bitmap.Config.ARGB_8888);
        this.snapshotBitmap = bitmapCreateBitmap;
        if (bitmapCreateBitmap != null) {
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            MatrixAdapter matrixAdapter2 = this.matrixAdapter;
            if (matrixAdapter2 != null && (adapterMatrix = matrixAdapter2.getAdapterMatrix()) != null) {
                drawBackground(canvas, adapterMatrix);
                IDraw.DefaultImpls.onDraw$default(graph, canvas, adapterMatrix, null, false, true, 4, null);
            }
        }
        return this.snapshotBitmap;
    }

    public final void select(Path path, Paint paint) {
        AbstractC9133u.m16133g(path, "path");
        if (!this.boardConfig.isGroupGraphComplete()) {
            checkActiveLayer();
            Canvas canvas = this.activeLayerCanvas;
            if (canvas != null) {
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                if (paint == null) {
                    paint = this.boardPaint;
                }
                canvas.drawPath(path, paint);
            }
            drawActiveLayer$default(this, null, 1, null);
            return;
        }
        if (paint == null) {
            paint = this.boardPaint;
        }
        RectF rectF = new RectF();
        path.computeBounds(rectF, false);
        rectF.left -= paint.getStrokeWidth();
        rectF.top -= paint.getStrokeWidth();
        rectF.right += paint.getStrokeWidth();
        rectF.bottom += paint.getStrokeWidth();
        initActiveLayer(rectF);
        Canvas canvas2 = this.activeLayerCanvas;
        if (canvas2 != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas2.save();
            canvas2.translate(-rectF.left, -rectF.top);
            canvas2.drawPath(path, paint);
            canvas2.restore();
        }
        this.tempMatrix.setTranslate(rectF.left, rectF.top);
        drawActiveLayer(this.tempMatrix);
    }

    public final void selectCancel() {
        ActiveLayer activeLayer;
        if (this.boardConfig.isGroupGraphComplete()) {
            clearActiveBitmapAndCanvas();
        }
        RenderLayer renderLayer = this.renderLayer;
        if (renderLayer == null || (activeLayer = renderLayer.getActiveLayer()) == null) {
            return;
        }
        activeLayer.clear();
    }

    public final void setBackgroundColor(int i10) {
        BackgroundLayer backgroundLayer;
        BackgroundLayer backgroundLayer2;
        RenderLayer renderLayer = this.renderLayer;
        if (renderLayer != null && (backgroundLayer2 = renderLayer.getBackgroundLayer()) != null) {
            backgroundLayer2.setMyBackgroundColor(i10);
        }
        RenderLayer renderLayer2 = this.renderLayer;
        if (renderLayer2 == null || (backgroundLayer = renderLayer2.getBackgroundLayer()) == null) {
            return;
        }
        backgroundLayer.refresh();
    }

    public final void setBackgroundLineConfig(BackgroundLineConfig backgroundLineConfig) {
        BackgroundLayer backgroundLayer;
        BackgroundLayer backgroundLayer2;
        AbstractC9133u.m16133g(backgroundLineConfig, "backgroundLineConfig");
        RenderLayer renderLayer = this.renderLayer;
        if (renderLayer != null && (backgroundLayer2 = renderLayer.getBackgroundLayer()) != null) {
            backgroundLayer2.setBackgroundLineConfig(backgroundLineConfig);
        }
        RenderLayer renderLayer2 = this.renderLayer;
        if (renderLayer2 == null || (backgroundLayer = renderLayer2.getBackgroundLayer()) == null) {
            return;
        }
        backgroundLayer.refresh();
    }

    public final void setMatrixAdapter(MatrixAdapter matrixAdapter) {
        AbstractC9133u.m16133g(matrixAdapter, "matrixAdapter");
        this.matrixAdapter = matrixAdapter;
        matrixAdapter.registerRenderRectFChangeListener(this.renderChangeListener);
    }

    public final void setRenderLayer(RenderLayer renderLayer) {
        AbstractC9133u.m16133g(renderLayer, "renderLayer");
        this.renderLayer = renderLayer;
        this.renderLayerRect.set(renderLayer.getRenderRect());
        if (!this.renderLayerRect.isEmpty()) {
            this.fixLayerBitmap = Bitmap.createBitmap(this.renderLayerRect.width(), this.renderLayerRect.height(), Bitmap.Config.ARGB_8888);
            Bitmap bitmap = this.fixLayerBitmap;
            AbstractC9133u.m16130d(bitmap);
            this.fixLayerCanvas = new Canvas(bitmap);
        }
        drawMaskLayer();
    }

    public final void textHandle(TextGraph graph, Path path, Paint paint) {
        AbstractC9133u.m16133g(graph, "graph");
        Paint paint2 = paint == null ? this.boardPaint : paint;
        RectF rectF = new RectF();
        if (path != null) {
            path.computeBounds(rectF, false);
            rectF.left -= paint2.getStrokeWidth();
            rectF.top -= paint2.getStrokeWidth();
            rectF.right += paint2.getStrokeWidth();
            rectF.bottom += paint2.getStrokeWidth();
        } else {
            MatrixAdapter matrixAdapter = this.matrixAdapter;
            rectF.set(graph.getMinOutRectF(matrixAdapter != null ? matrixAdapter.getAdapterMatrix() : null));
        }
        initActiveLayer(rectF);
        Canvas canvas = this.activeLayerCanvas;
        if (canvas != null) {
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas.save();
            canvas.translate(-rectF.left, -rectF.top);
            MatrixAdapter matrixAdapter2 = this.matrixAdapter;
            if (matrixAdapter2 != null) {
                IDraw.DefaultImpls.onDraw$default(graph, canvas, matrixAdapter2.getAdapterMatrix(), null, false, this.boardConfig.isGroupGraphComplete(), 4, null);
            }
            if (path != null) {
                if (paint == null) {
                    paint = this.boardPaint;
                }
                canvas.drawPath(path, paint);
            }
            canvas.restore();
        }
        this.translateMatrix.setTranslate(rectF.left, rectF.top);
        drawActiveLayer(this.translateMatrix);
    }

    public final void textHandleEnd(IGraph rootGraph, Path path, Paint paint) {
        ActiveLayer activeLayer;
        AbstractC9133u.m16133g(rootGraph, "rootGraph");
        Canvas canvas = this.fixLayerCanvas;
        if (canvas != null) {
            DrawControlKt.clear(canvas);
            MatrixAdapter matrixAdapter = this.matrixAdapter;
            if (matrixAdapter != null) {
                IDraw.DefaultImpls.onDraw$default(rootGraph, canvas, matrixAdapter.getAdapterMatrix(), null, false, this.boardConfig.isGroupGraphComplete(), 4, null);
            }
        }
        drawFixLayer();
        if (path == null) {
            clearActiveBitmapAndCanvas();
            RenderLayer renderLayer = this.renderLayer;
            if (renderLayer == null || (activeLayer = renderLayer.getActiveLayer()) == null) {
                return;
            }
            activeLayer.clear();
            return;
        }
        if (paint == null) {
            paint = this.boardPaint;
        }
        RectF rectF = new RectF();
        path.computeBounds(rectF, false);
        rectF.left -= paint.getStrokeWidth();
        rectF.top -= paint.getStrokeWidth();
        rectF.right += paint.getStrokeWidth();
        rectF.bottom += paint.getStrokeWidth();
        initActiveLayer(rectF);
        Canvas canvas2 = this.activeLayerCanvas;
        if (canvas2 != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas2.save();
            canvas2.translate(-rectF.left, -rectF.top);
            canvas2.drawPath(path, paint);
            canvas2.restore();
        }
        Matrix matrix = this.tempMatrix;
        matrix.setTranslate(rectF.left, rectF.top);
        drawActiveLayer(matrix);
    }

    public final void textHandleStart(IGraph rootGraph, final TextGraph graph, Path path, Paint paint) {
        AbstractC9133u.m16133g(rootGraph, "rootGraph");
        AbstractC9133u.m16133g(graph, "graph");
        Canvas canvas = this.fixLayerCanvas;
        if (canvas != null) {
            DrawControlKt.clear(canvas);
            MatrixAdapter matrixAdapter = this.matrixAdapter;
            if (matrixAdapter != null) {
                IDraw.DefaultImpls.onDraw$default(rootGraph, canvas, matrixAdapter.getAdapterMatrix(), new InterfaceC10570l() { // from class: com.zykj.blackboard.core.canvas.control.DrawControl$textHandleStart$1$1$1
                    {
                        super(1);
                    }

                    @Override // p300x7.InterfaceC10570l
                    public final Boolean invoke(IGraph childGraph) {
                        AbstractC9133u.m16133g(childGraph, "childGraph");
                        return Boolean.valueOf(AbstractC9133u.m16128b(childGraph.getId(), graph.getId()));
                    }
                }, false, false, 24, null);
            }
        }
        drawFixLayer();
        Paint paint2 = paint == null ? this.boardPaint : paint;
        RectF rectF = new RectF();
        if (path != null) {
            path.computeBounds(rectF, false);
            rectF.left -= paint2.getStrokeWidth();
            rectF.top -= paint2.getStrokeWidth();
            rectF.right += paint2.getStrokeWidth();
            rectF.bottom += paint2.getStrokeWidth();
        } else {
            MatrixAdapter matrixAdapter2 = this.matrixAdapter;
            graph.getMinOutRectF(matrixAdapter2 != null ? matrixAdapter2.getAdapterMatrix() : null);
        }
        initActiveLayer(rectF);
        Canvas canvas2 = this.activeLayerCanvas;
        if (canvas2 != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas2.save();
            canvas2.translate(-rectF.left, -rectF.top);
            MatrixAdapter matrixAdapter3 = this.matrixAdapter;
            if (matrixAdapter3 != null) {
                IDraw.DefaultImpls.onDraw$default(graph, canvas2, matrixAdapter3.getAdapterMatrix(), null, false, this.boardConfig.isGroupGraphComplete(), 4, null);
            }
            if (path != null) {
                if (paint == null) {
                    paint = this.boardPaint;
                }
                canvas2.drawPath(path, paint);
            }
            canvas2.restore();
        }
        this.translateMatrix.setTranslate(rectF.left, rectF.top);
        drawActiveLayer(this.translateMatrix);
    }

    public final void transGraph(Matrix matrix) {
        AbstractC9133u.m16133g(matrix, "matrix");
        if (!this.boardConfig.isGroupGraphComplete()) {
            drawActiveLayer(matrix);
            return;
        }
        Matrix matrix2 = new Matrix();
        matrix2.set(this.translateMatrix);
        matrix2.postConcat(matrix);
        drawActiveLayer(matrix2);
    }

    public final void transGraphEnd(IGraph rootGraph, Path path, Paint paint) {
        ActiveLayer activeLayer;
        AbstractC9133u.m16133g(rootGraph, "rootGraph");
        Canvas canvas = this.fixLayerCanvas;
        if (canvas != null) {
            DrawControlKt.clear(canvas);
            MatrixAdapter matrixAdapter = this.matrixAdapter;
            if (matrixAdapter != null) {
                IDraw.DefaultImpls.onDraw$default(rootGraph, canvas, matrixAdapter.getAdapterMatrix(), null, false, this.boardConfig.isGroupGraphComplete(), 12, null);
            }
        }
        drawFixLayer();
        if (!this.boardConfig.isGroupGraphComplete()) {
            checkActiveLayer();
            Canvas canvas2 = this.activeLayerCanvas;
            if (canvas2 != null) {
                canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                if (path != null) {
                    if (paint == null) {
                        paint = this.boardPaint;
                    }
                    canvas2.drawPath(path, paint);
                }
            }
            drawActiveLayer$default(this, null, 1, null);
            return;
        }
        if (path == null) {
            clearActiveBitmapAndCanvas();
            RenderLayer renderLayer = this.renderLayer;
            if (renderLayer == null || (activeLayer = renderLayer.getActiveLayer()) == null) {
                return;
            }
            activeLayer.clear();
            return;
        }
        if (paint == null) {
            paint = this.boardPaint;
        }
        RectF rectF = new RectF();
        path.computeBounds(rectF, false);
        rectF.left -= paint.getStrokeWidth();
        rectF.top -= paint.getStrokeWidth();
        rectF.right += paint.getStrokeWidth();
        rectF.bottom += paint.getStrokeWidth();
        initActiveLayer(rectF);
        Canvas canvas3 = this.activeLayerCanvas;
        if (canvas3 != null) {
            canvas3.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas3.save();
            canvas3.translate(-rectF.left, -rectF.top);
            canvas3.drawPath(path, paint);
            canvas3.restore();
        }
        Matrix matrix = this.tempMatrix;
        matrix.setTranslate(rectF.left, rectF.top);
        drawActiveLayer(matrix);
    }

    public final void transGraphStart(IGraph rootGraph, final List<? extends IGraph> graphList, Path path, Paint paint) {
        AbstractC9133u.m16133g(rootGraph, "rootGraph");
        AbstractC9133u.m16133g(graphList, "graphList");
        Canvas canvas = this.fixLayerCanvas;
        if (canvas != null) {
            DrawControlKt.clear(canvas);
            MatrixAdapter matrixAdapter = this.matrixAdapter;
            if (matrixAdapter != null) {
                IDraw.DefaultImpls.onDraw$default(rootGraph, canvas, matrixAdapter.getAdapterMatrix(), new InterfaceC10570l() { // from class: com.zykj.blackboard.core.canvas.control.DrawControl$transGraphStart$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // p300x7.InterfaceC10570l
                    public final Boolean invoke(IGraph childGraph) {
                        AbstractC9133u.m16133g(childGraph, "childGraph");
                        List<IGraph> list = graphList;
                        boolean z10 = false;
                        if (list == null || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                if (AbstractC9133u.m16128b(childGraph.getId(), ((IGraph) it.next()).getId())) {
                                    z10 = true;
                                    break;
                                }
                            }
                        }
                        return Boolean.valueOf(z10);
                    }
                }, false, this.boardConfig.isGroupGraphComplete(), 8, null);
            }
        }
        drawFixLayer();
        if (!this.boardConfig.isGroupGraphComplete()) {
            checkActiveLayer();
            Canvas canvas2 = this.activeLayerCanvas;
            if (canvas2 != null) {
                canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                for (IGraph iGraph : graphList) {
                    MatrixAdapter matrixAdapter2 = this.matrixAdapter;
                    if (matrixAdapter2 != null) {
                        IDraw.DefaultImpls.onDraw$default(iGraph, canvas2, matrixAdapter2.getAdapterMatrix(), null, false, false, 28, null);
                    }
                }
                if (path != null) {
                    canvas2.drawPath(path, paint == null ? this.boardPaint : paint);
                }
            }
            drawActiveLayer$default(this, null, 1, null);
            return;
        }
        Paint paint2 = paint == null ? this.boardPaint : paint;
        RectF rectF = new RectF();
        if (path != null) {
            path.computeBounds(rectF, false);
            rectF.left -= paint2.getStrokeWidth();
            rectF.top -= paint2.getStrokeWidth();
            rectF.right += paint2.getStrokeWidth();
            rectF.bottom += paint2.getStrokeWidth();
        } else {
            for (IGraph iGraph2 : graphList) {
                MatrixAdapter matrixAdapter3 = this.matrixAdapter;
                rectF.union(iGraph2.getMinOutRectF(matrixAdapter3 != null ? matrixAdapter3.getAdapterMatrix() : null));
            }
        }
        initActiveLayer(rectF);
        Canvas canvas3 = this.activeLayerCanvas;
        if (canvas3 != null) {
            canvas3.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas3.save();
            canvas3.translate(-rectF.left, -rectF.top);
            for (IGraph iGraph3 : graphList) {
                MatrixAdapter matrixAdapter4 = this.matrixAdapter;
                if (matrixAdapter4 != null) {
                    IDraw.DefaultImpls.onDraw$default(iGraph3, canvas3, matrixAdapter4.getAdapterMatrix(), null, false, true, 12, null);
                }
            }
            if (path != null) {
                canvas3.drawPath(path, paint == null ? this.boardPaint : paint);
            }
            canvas3.restore();
        }
        this.translateMatrix.setTranslate(rectF.left, rectF.top);
        drawActiveLayer(this.translateMatrix);
    }

    public final void updateBackgroundMatrix(Matrix matrix) {
        BackgroundLayer backgroundLayer;
        AbstractC9133u.m16133g(matrix, "matrix");
        RenderLayer renderLayer = this.renderLayer;
        if (renderLayer == null || (backgroundLayer = renderLayer.getBackgroundLayer()) == null) {
            return;
        }
        backgroundLayer.setMatrix(matrix);
    }
}
