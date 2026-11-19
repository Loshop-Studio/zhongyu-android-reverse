package com.zykj.paint.runner;

// RE note 本类字节码直接引用的读写或显示接口包括文件流。

import android.graphics.BitmapFactory;
import android.util.Log;
import com.google.protobuf.InvalidProtocolBufferException;
import com.zykj.paint.Actions;
import com.zykj.paint.data.Vector2D;
import com.zykj.paint.exchange.ActionType;
import com.zykj.paint.graphic.RectBmp;
import com.zykj.paint.render.MapViewer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* loaded from: classes2.dex */
public class ImageActionRunner extends ActionRunner {
    private int graphId;
    private String sourceUrl;

    public ImageActionRunner(MapViewer mapViewer, int i9) {
        super(mapViewer);
        this.graphId = i9;
    }

    public String getSourceUrl() {
        return this.sourceUrl;
    }

    @Override // com.zykj.paint.runner.ActionRunner
    public void pause() {
    }

    @Override // com.zykj.paint.runner.ActionRunner
    public void resume() {
    }

    @Override // com.zykj.paint.runner.ActionRunner
    public void run(Actions.EzyAction ezyAction) {
        Actions.NewImageData newImageData;
        try {
            newImageData = (Actions.NewImageData) ezyAction.getData().unpack(Actions.NewImageData.class);
        } catch (InvalidProtocolBufferException e10) {
            e10.printStackTrace();
            newImageData = null;
        }
        if (ezyAction.getActionType() == ActionType.ImageNew) {
            newImageData.getPoint();
            Actions.EzySize size = newImageData.getSize();
            String src = newImageData.getSrc();
            try {
                RectBmp rectBmp = new RectBmp(this.map, BitmapFactory.decodeStream(new FileInputStream(this.sourceUrl + src)));
                rectBmp.graphId = this.graphId;
                rectBmp.setFilePath(src);
                int width = this.mapViewer.getWidth();
                int height = this.mapViewer.getHeight();
                Log.e("ActionRunner", "add image--->" + rectBmp.graphId);
                rectBmp.setVector2D(new Vector2D((double) ((((float) width) - (((float) size.getWidth()) * 1.0f)) / 2.0f), (double) ((((float) height) - (((float) size.getHeight()) * 1.0f)) / 2.0f)));
                rectBmp.setDstVector(new Vector2D((r0 + (size.getWidth() * 1.0f)) / 2.0f, (r1 + (size.getHeight() * 1.0f)) / 2.0f));
                this.mapViewer.map.getCurrentLayer().graphList.add(rectBmp);
                this.mapViewer.directRenderAll();
            } catch (FileNotFoundException e11) {
                e11.printStackTrace();
            }
        }
    }

    public void setSourceUrl(String str) {
        this.sourceUrl = str;
    }

    @Override // com.zykj.paint.runner.ActionRunner
    public void stop() {
    }
}
