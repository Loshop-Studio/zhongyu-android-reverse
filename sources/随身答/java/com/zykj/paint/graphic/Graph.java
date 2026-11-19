package com.zykj.paint.graphic;

import android.graphics.Canvas;
import android.graphics.Matrix;
import com.zykj.paint.data.Rect2D;
import com.zykj.paint.render.MapRender;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class Graph {
    private int baseColor;
    public int graphId;
    public Map map;
    private String name;
    private boolean isVisable = true;
    public Matrix graphMatrix = new Matrix();
    public Matrix matrix = new Matrix();
    public ArrayList<Graph> graphs = new ArrayList<>();
    public Rect2D mBoundBox = getBoundBox();

    public void addGraph(Graph graph) {
        this.graphs.add(graph);
    }

    public abstract void directRender(MapRender mapRender, Canvas canvas);

    public int getBaseColor() {
        return this.baseColor;
    }

    public abstract Rect2D getBoundBox();

    public ArrayList<Graph> getGraphs() {
        return this.graphs;
    }

    public String getName() {
        return this.name;
    }

    public void hide(int i9) {
    }

    public boolean isVisable() {
        return this.isVisable;
    }

    public abstract void render(MapRender mapRender);

    public abstract void render(MapRender mapRender, Rect2D rect2D);

    public void setBaseColor(int i9) {
        this.baseColor = i9;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setVisable(boolean z9) {
        this.isVisable = z9;
    }

    public void updateMatrix() {
        this.graphMatrix.postConcat(this.matrix);
        this.matrix = new Matrix();
    }
}
