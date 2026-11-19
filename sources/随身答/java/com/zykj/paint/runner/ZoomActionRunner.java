package com.zykj.paint.runner;

import com.google.protobuf.InvalidProtocolBufferException;
import com.zykj.paint.Actions;
import com.zykj.paint.render.MapViewer;

/* loaded from: classes2.dex */
public class ZoomActionRunner extends ActionRunner {
    public ZoomActionRunner(MapViewer mapViewer) {
        super(mapViewer);
    }

    @Override // com.zykj.paint.runner.ActionRunner
    public void pause() {
    }

    @Override // com.zykj.paint.runner.ActionRunner
    public void resume() {
    }

    @Override // com.zykj.paint.runner.ActionRunner
    public void run(Actions.EzyAction ezyAction) {
        try {
            double scale = ((Actions.ZoomGraphData) ezyAction.getData().unpack(Actions.ZoomGraphData.class)).getScale() + 1.0d;
            this.mapViewer.scaleViewPort(scale, scale);
        } catch (InvalidProtocolBufferException e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.zykj.paint.runner.ActionRunner
    public void stop() {
    }
}
