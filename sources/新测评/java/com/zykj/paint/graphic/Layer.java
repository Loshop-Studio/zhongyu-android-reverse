package com.zykj.paint.graphic;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import com.zykj.paint.data.Rect2D;
import com.zykj.paint.render.MapRender;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class Layer extends Graph {
    private static final String TAG = "Layer";
    public List<Graph> graphList = new ArrayList();

    @Override // com.zykj.paint.graphic.Graph
    public void directRender(MapRender mapRender, Canvas canvas) {
        if (isVisable()) {
            int size = this.graphList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.graphList.get(i10).directRender(mapRender, canvas);
            }
        }
    }

    public Graph findGraph(int i10) {
        int size = this.graphList.size();
        for (int i11 = 0; i11 < size; i11++) {
            Graph graph = this.graphList.get(i11);
            if (graph.graphId == i10) {
                return graph;
            }
        }
        return null;
    }

    @Override // com.zykj.paint.graphic.Graph
    public Rect2D getBoundBox() {
        List<Graph> list = this.graphList;
        if (list == null) {
            return new Rect2D();
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mBoundBox = Rect2D.nestRect(this.mBoundBox, this.graphList.get(i10).getBoundBox());
        }
        return this.mBoundBox;
    }

    @Override // com.zykj.paint.graphic.Graph
    public void hide(int i10) {
        int size = this.graphList.size();
        for (int i11 = 0; i11 < size; i11++) {
            Graph graph = this.graphList.get(i11);
            if (graph.graphId == i10) {
                graph.setVisable(false);
                return;
            }
            graph.hide(i10);
        }
    }

    @Override // com.zykj.paint.graphic.Graph
    public void render(MapRender mapRender) {
        if (isVisable()) {
            Canvas canvas = mapRender.mScreenCanvas;
            PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
            canvas.drawColor(0, mode);
            mapRender.mCanvas.drawColor(0, mode);
            int size = this.graphList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.graphList.get(i10).render(mapRender);
            }
        }
    }

    @Override // com.zykj.paint.graphic.Graph
    public void render(MapRender mapRender, Rect2D rect2D) {
        if (isVisable()) {
            for (Graph graph : this.graphList) {
                if (rect2D != null && rect2D.isRectCross(graph.getBoundBox())) {
                    graph.render(mapRender, rect2D);
                } else {
                    graph.render(mapRender);
                }
            }
        }
    }
}
