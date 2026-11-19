package com.zykj.paint.graphic;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.Log;
import androidx.camera.video.AudioStats;
import com.zykj.paint.data.Rect2D;
import com.zykj.paint.data.Vector2D;
import com.zykj.paint.render.MapRender;

/* loaded from: classes6.dex */
public class RectBmp extends Graph {
    private static final String TAG = "RectBmp";
    public Bitmap bitmap;
    public Vector2D dstVector2D;
    public String filePath;
    public Vector2D vector2D;

    public RectBmp(Map map, Bitmap bitmap) {
        this.map = map;
        this.bitmap = bitmap;
    }

    @Override // com.zykj.paint.graphic.Graph
    public void directRender(MapRender mapRender, Canvas canvas) {
        if (isVisable()) {
            Matrix matrix = new Matrix();
            matrix.postConcat(this.graphMatrix);
            matrix.postConcat(this.matrix);
            mapRender.directDrawBitmap(this, this.bitmap, canvas, matrix);
            int size = this.graphs.size();
            Log.e(TAG, "[graphId=" + this.graphId + "]--->>>size=" + size);
            for (int i10 = 0; i10 < size; i10++) {
                ((PolyLine) this.graphs.get(i10)).directRender(mapRender, canvas, matrix);
            }
        }
    }

    @Override // com.zykj.paint.graphic.Graph
    public Rect2D getBoundBox() {
        return this.bitmap == null ? new Rect2D() : new Rect2D(AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, r0.getWidth(), this.bitmap.getHeight());
    }

    @Override // com.zykj.paint.graphic.Graph
    public void hide(int i10) {
        int size = this.graphs.size();
        for (int i11 = 0; i11 < size; i11++) {
            PolyLine polyLine = (PolyLine) this.graphs.get(i11);
            if (polyLine.graphId == i10) {
                polyLine.setVisable(false);
                return;
            }
        }
    }

    public void release() {
        Bitmap bitmap = this.bitmap;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.bitmap.recycle();
        this.bitmap = null;
    }

    @Override // com.zykj.paint.graphic.Graph
    public void render(MapRender mapRender) {
        if (isVisable()) {
            mapRender.drawBitmap(this, this.bitmap);
        }
    }

    public void setDstVector(Vector2D vector2D) {
        this.dstVector2D = vector2D;
    }

    public void setFilePath(String str) {
        this.filePath = str;
    }

    public void setVector2D(Vector2D vector2D) {
        this.vector2D = vector2D;
    }

    @Override // com.zykj.paint.graphic.Graph
    public void render(MapRender mapRender, Rect2D rect2D) {
        mapRender.drawBitmap(this.bitmap, rect2D, getBoundBox());
    }
}
