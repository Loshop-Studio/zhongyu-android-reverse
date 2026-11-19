package com.zykj.paint.graphic;

import android.graphics.Canvas;
import android.util.Log;
import com.zykj.paint.data.Rect2D;
import com.zykj.paint.render.MapRender;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
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
            for (int i10 = 0; i10 < size; i10++) {
                this.layerList.get(i10).directRender(mapRender, canvas);
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
        for (int i10 = 0; i10 < size; i10++) {
            this.mBoundBox = Rect2D.nestRect(this.mBoundBox, this.layerList.get(i10).mBoundBox);
        }
        return this.mBoundBox;
    }

    public Layer getCurrentLayer() {
        return this.currentLayer;
    }

    @Override // com.zykj.paint.graphic.Graph
    public void hide(int i10) {
        int size = this.layerList.size();
        for (int i11 = 0; i11 < size; i11++) {
            Layer layer = this.layerList.get(i11);
            if (layer.graphId == i10) {
                layer.setVisable(false);
                return;
            }
            layer.hide(i10);
        }
    }

    @Override // com.zykj.paint.graphic.Graph
    public void render(MapRender mapRender) {
        if (isVisable()) {
            int size = this.layerList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.layerList.get(i10).render(mapRender);
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

    public void setCurrentLayerByIndex(int i10) {
        this.currentLayer = this.layerList.get(i10);
    }

    public void setMatrix(float[] fArr) {
        int size = this.layerList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Layer layer = this.layerList.get(i10);
            int size2 = layer.graphList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                layer.graphList.get(i11).matrix.setValues(fArr);
            }
        }
    }

    @Override // com.zykj.paint.graphic.Graph
    public void updateMatrix() {
        int size = this.layerList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Layer layer = this.layerList.get(i10);
            int size2 = layer.graphList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                layer.graphList.get(i11).updateMatrix();
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
