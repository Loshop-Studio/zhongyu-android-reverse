package com.zykj.paint.runner;

import com.google.protobuf.InvalidProtocolBufferException;
import com.zykj.paint.Actions;
import com.zykj.paint.render.MapViewer;

/* loaded from: classes5.dex */
public class MoveActionRunner extends ActionRunner {
    public MoveActionRunner(MapViewer mapViewer) {
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
            Actions.EzyVector vector = ((Actions.MoveGraphData) ezyAction.getData().unpack(Actions.MoveGraphData.class)).getVector();
            this.mapViewer.moveViewPort(vector.getX(), vector.getY());
        } catch (InvalidProtocolBufferException e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.zykj.paint.runner.ActionRunner
    public void stop() {
    }
}
