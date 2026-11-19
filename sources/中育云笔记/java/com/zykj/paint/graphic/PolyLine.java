package com.zykj.paint.graphic;

import android.graphics.Canvas;
import android.graphics.Matrix;
import com.zykj.paint.data.Rect2D;
import com.zykj.paint.data.Vector2D;
import com.zykj.paint.render.MapRender;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class PolyLine extends Graph {
    private static final String TAG = "PolyLine";
    public List<Vector2D> pointList = new ArrayList();
    public double width;

    public PolyLine(Map map) {
        this.map = map;
    }

    @Override // com.zykj.paint.graphic.Graph
    public void directRender(MapRender mapRender, Canvas canvas) {
        if (isVisable()) {
            Matrix matrix = new Matrix();
            matrix.postConcat(this.graphMatrix);
            matrix.postConcat(this.matrix);
            mapRender.directDrawPolyLine(this.pointList, canvas, matrix, getBaseColor());
        }
    }

    @Override // com.zykj.paint.graphic.Graph
    public Rect2D getBoundBox() {
        List<Vector2D> list = this.pointList;
        if (list == null) {
            return new Rect2D();
        }
        Iterator<Vector2D> it = list.iterator();
        while (it.hasNext()) {
            this.mBoundBox = Rect2D.nestPoint(this.mBoundBox, it.next());
        }
        return this.mBoundBox;
    }

    @Override // com.zykj.paint.graphic.Graph
    public void render(MapRender mapRender) {
        if (isVisable()) {
            mapRender.mPaint.setColor(getBaseColor());
            mapRender.mPaint.setStrokeWidth((float) this.width);
            mapRender.drawPolyLine(this.pointList);
        }
    }

    @Override // com.zykj.paint.graphic.Graph
    public void render(MapRender mapRender, Rect2D rect2D) {
        render(mapRender);
    }

    public void directRender(MapRender mapRender, Canvas canvas, Matrix matrix) {
        if (isVisable()) {
            mapRender.directDrawPolyLine(this.pointList, canvas, matrix, getBaseColor());
        }
    }
}
