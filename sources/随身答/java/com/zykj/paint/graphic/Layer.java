package com.zykj.paint.graphic;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import com.zykj.paint.data.Rect2D;
import com.zykj.paint.render.MapRender;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class Layer extends Graph {
    private static final String TAG = "Layer";
    public List<Graph> graphList = new ArrayList();

    @Override // com.zykj.paint.graphic.Graph
    public void directRender(MapRender mapRender, Canvas canvas) {
        if (isVisable()) {
            int size = this.graphList.size();
            for (int i9 = 0; i9 < size; i9++) {
                this.graphList.get(i9).directRender(mapRender, canvas);
            }
        }
    }

    public Graph findGraph(int i9) {
        int size = this.graphList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Graph graph = this.graphList.get(i10);
            if (graph.graphId == i9) {
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
        for (int i9 = 0; i9 < size; i9++) {
            this.mBoundBox = Rect2D.nestRect(this.mBoundBox, this.graphList.get(i9).getBoundBox());
        }
        return this.mBoundBox;
    }

    @Override // com.zykj.paint.graphic.Graph
    public void hide(int i9) {
        int size = this.graphList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Graph graph = this.graphList.get(i10);
            if (graph.graphId == i9) {
                graph.setVisable(false);
                return;
            }
            graph.hide(i9);
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
            for (int i9 = 0; i9 < size; i9++) {
                this.graphList.get(i9).render(mapRender);
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
