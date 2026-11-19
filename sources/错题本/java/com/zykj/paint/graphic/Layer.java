package com.zykj.paint.graphic;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import com.zykj.paint.data.Rect2D;
import com.zykj.paint.render.MapRender;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class Layer extends Graph {
    private static final String TAG = "Layer";
    public List<Graph> graphList = new ArrayList();

    @Override // com.zykj.paint.graphic.Graph
    public void directRender(MapRender mapRender, Canvas canvas) {
        if (isVisable()) {
            int size = this.graphList.size();
            for (int i = 0; i < size; i++) {
                this.graphList.get(i).directRender(mapRender, canvas);
            }
        }
    }

    public Graph findGraph(int i) {
        int size = this.graphList.size();
        for (int i8 = 0; i8 < size; i8++) {
            Graph graph = this.graphList.get(i8);
            if (graph.graphId == i) {
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
        for (int i = 0; i < size; i++) {
            this.mBoundBox = Rect2D.nestRect(this.mBoundBox, this.graphList.get(i).getBoundBox());
        }
        return this.mBoundBox;
    }

    @Override // com.zykj.paint.graphic.Graph
    public void hide(int i) {
        int size = this.graphList.size();
        for (int i8 = 0; i8 < size; i8++) {
            Graph graph = this.graphList.get(i8);
            if (graph.graphId == i) {
                graph.setVisable(false);
                return;
            }
            graph.hide(i);
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
            for (int i = 0; i < size; i++) {
                this.graphList.get(i).render(mapRender);
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
