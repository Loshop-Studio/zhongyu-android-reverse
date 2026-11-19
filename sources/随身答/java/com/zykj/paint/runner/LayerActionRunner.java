package com.zykj.paint.runner;

import android.graphics.Color;
import com.google.protobuf.InvalidProtocolBufferException;
import com.zykj.paint.Actions;
import com.zykj.paint.exchange.ActionType;
import com.zykj.paint.graphic.Layer;
import com.zykj.paint.render.MapViewer;

/* loaded from: classes2.dex */
public class LayerActionRunner extends ActionRunner {
    public LayerActionRunner(MapViewer mapViewer) {
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
        Actions.NewLayerData newLayerData;
        try {
            newLayerData = (Actions.NewLayerData) ezyAction.getData().unpack(Actions.NewLayerData.class);
        } catch (InvalidProtocolBufferException e10) {
            e10.printStackTrace();
            newLayerData = null;
        }
        if (ezyAction.getActionType() == ActionType.LayerNew) {
            Layer layer = new Layer();
            Actions.EzyColor color = newLayerData.getColor();
            layer.setBaseColor(Color.argb(color.getAlpha(), color.getRed(), color.getGreen(), color.getBlue()));
            this.mapViewer.scaleViewPort(1.0d, 1.0d);
            this.map.addLayer(layer);
            this.mapViewer.renderAll();
        }
    }

    @Override // com.zykj.paint.runner.ActionRunner
    public void stop() {
    }
}
