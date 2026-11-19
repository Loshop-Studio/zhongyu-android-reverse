package com.zykj.paint.graphic;

import android.graphics.Canvas;
import android.util.Log;
import com.zykj.paint.data.Rect2D;
import com.zykj.paint.render.MapRender;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class Map extends Graph {
    private static final String TAG = "Map";
    public Layer currentLayer;
    private List<Layer> layerList = new ArrayList();

    public void addLayer(Layer layer) {
        Log.e(TAG, "addLayer-->" + layer);
        this.currentLayer = layer;
        this.layerList.add(layer);
    }

    @Override // com.zykj.paint.graphic.Graph
    public void directRender(MapRender mapRender, Canvas canvas) {
        if (isVisable()) {
            int size = this.layerList.size();
            for (int i = 0; i < size; i++) {
                this.layerList.get(i).directRender(mapRender, canvas);
            }
        }
    }

    @Override // com.zykj.paint.graphic.Graph
    public Rect2D getBoundBox() {
        List<Layer> list = this.layerList;
        if (list == null) {
            return new Rect2D();
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.mBoundBox = Rect2D.nestRect(this.mBoundBox, this.layerList.get(i).mBoundBox);
        }
        return this.mBoundBox;
    }

    public Layer getCurrentLayer() {
        return this.currentLayer;
    }

    @Override // com.zykj.paint.graphic.Graph
    public void hide(int i) {
        int size = this.layerList.size();
        for (int i8 = 0; i8 < size; i8++) {
            Layer layer = this.layerList.get(i8);
            if (layer.graphId == i) {
                layer.setVisable(false);
                return;
            }
            layer.hide(i);
        }
    }

    @Override // com.zykj.paint.graphic.Graph
    public void render(MapRender mapRender) {
        if (isVisable()) {
            int size = this.layerList.size();
            for (int i = 0; i < size; i++) {
                this.layerList.get(i).render(mapRender);
            }
        }
    }

    public void reset() {
        Layer layer = this.currentLayer;
        if (layer != null) {
            for (Graph graph : layer.graphList) {
                if (graph instanceof RectBmp) {
                    ((RectBmp) graph).release();
                }
            }
        }
        this.layerList.clear();
    }

    public void setCurrentLayer(Layer layer) {
        this.currentLayer = layer;
    }

    public void setCurrentLayerByIndex(int i) {
        this.currentLayer = this.layerList.get(i);
    }

    public void setMatrix(float[] fArr) {
        int size = this.layerList.size();
        for (int i = 0; i < size; i++) {
            Layer layer = this.layerList.get(i);
            int size2 = layer.graphList.size();
            for (int i8 = 0; i8 < size2; i8++) {
                layer.graphList.get(i8).matrix.setValues(fArr);
            }
        }
    }

    @Override // com.zykj.paint.graphic.Graph
    public void updateMatrix() {
        int size = this.layerList.size();
        for (int i = 0; i < size; i++) {
            Layer layer = this.layerList.get(i);
            int size2 = layer.graphList.size();
            for (int i8 = 0; i8 < size2; i8++) {
                layer.graphList.get(i8).updateMatrix();
            }
        }
    }

    @Override // com.zykj.paint.graphic.Graph
    public void render(MapRender mapRender, Rect2D rect2D) {
        if (isVisable()) {
            for (Layer layer : this.layerList) {
                if (rect2D != null && rect2D.isRectCross(layer.mBoundBox)) {
                    layer.render(mapRender, rect2D);
                } else {
                    layer.render(mapRender);
                }
            }
        }
    }
}
