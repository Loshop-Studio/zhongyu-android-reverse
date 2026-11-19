package com.zykj.paint.runner;

import android.util.Log;
import com.google.protobuf.InvalidProtocolBufferException;
import com.zykj.paint.Actions;
import com.zykj.paint.graphic.RectBmp;
import com.zykj.paint.render.MapViewer;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class MatrixActionRunner extends ActionRunner {
    private int graphId;

    public MatrixActionRunner(MapViewer mapViewer, int i) {
        super(mapViewer);
        this.graphId = i;
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
            List<Float> valuesList = ((Actions.EzyMatrixData) ezyAction.getData().unpack(Actions.EzyMatrixData.class)).getValuesList();
            float[] fArr = new float[9];
            for (int i = 0; i < valuesList.size(); i++) {
                fArr[i] = valuesList.get(i).floatValue();
            }
            int i8 = this.graphId;
            if (i8 == 0) {
                Log.i("ActionRunner", "地图移动--->>>" + Arrays.toString(fArr));
                this.map.setMatrix(fArr);
            } else if (i8 == -1) {
                Log.i("ActionRunner", "地图移动 结束--->>>");
                this.map.updateMatrix();
            } else {
                RectBmp rectBmp = (RectBmp) this.mapViewer.map.getCurrentLayer().findGraph(this.graphId);
                if (rectBmp != null) {
                    rectBmp.graphMatrix.setValues(fArr);
                }
            }
            this.mapViewer.directRenderAll();
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
    }

    @Override // com.zykj.paint.runner.ActionRunner
    public void stop() {
    }
}
