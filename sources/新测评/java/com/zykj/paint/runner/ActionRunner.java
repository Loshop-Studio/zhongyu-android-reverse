package com.zykj.paint.runner;

import com.zykj.paint.Actions;
import com.zykj.paint.graphic.Map;
import com.zykj.paint.render.MapViewer;

/* loaded from: classes5.dex */
public abstract class ActionRunner {
    protected static final String TAG = "ActionRunner";
    public Actions.EzyAction ezyAction;
    public Map map;
    public MapViewer mapViewer;

    public ActionRunner(MapViewer mapViewer) {
        this.mapViewer = mapViewer;
        this.map = mapViewer.map;
    }

    public abstract void pause();

    public abstract void resume();

    public abstract void run(Actions.EzyAction ezyAction);

    public abstract void stop();
}
