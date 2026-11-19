package com.zykj.paint.runner;

import android.util.Log;
import com.google.protobuf.InvalidProtocolBufferException;
import com.zykj.paint.Actions;
import com.zykj.paint.graphic.RectBmp;
import com.zykj.paint.render.MapViewer;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class MatrixActionRunner extends ActionRunner {
    private int graphId;

    public MatrixActionRunner(MapViewer mapViewer, int i9) {
        super(mapViewer);
        this.graphId = i9;
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
            for (int i9 = 0; i9 < valuesList.size(); i9++) {
                fArr[i9] = valuesList.get(i9).floatValue();
            }
            int i10 = this.graphId;
            if (i10 == 0) {
                Log.i("ActionRunner", "地图移动--->>>" + Arrays.toString(fArr));
                this.map.setMatrix(fArr);
            } else if (i10 == -1) {
                Log.i("ActionRunner", "地图移动 结束--->>>");
                this.map.updateMatrix();
            } else {
                RectBmp rectBmp = (RectBmp) this.mapViewer.map.getCurrentLayer().findGraph(this.graphId);
                if (rectBmp != null) {
                    rectBmp.graphMatrix.setValues(fArr);
                }
            }
            this.mapViewer.directRenderAll();
        } catch (InvalidProtocolBufferException e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.zykj.paint.runner.ActionRunner
    public void stop() {
    }
}
