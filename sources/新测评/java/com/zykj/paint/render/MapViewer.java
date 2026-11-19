package com.zykj.paint.render;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.camera.video.AudioStats;
import com.zykj.paint.Actions;
import com.zykj.paint.data.Rect2D;
import com.zykj.paint.data.Vector2D;
import com.zykj.paint.graphic.Graph;
import com.zykj.paint.graphic.Map;
import java.util.List;

/* loaded from: classes5.dex */
public class MapViewer extends View {
    private static final String TAG = "MapViewer";
    private Context context;
    private int index;
    private Paint mBitmapPaint;
    public int mHeight;
    public int mWidth;
    public Map map;
    public MapRender mapRender;
    public double middleX;
    public double middleY;
    public int moveX;
    public int moveY;
    public double rotate;
    public float scaleX;
    public float scaleY;
    private int startX;
    private int startY;

    public MapViewer(Context context) {
        super(context);
        this.middleX = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.middleY = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.rotate = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.moveX = 0;
        this.moveY = 0;
        this.index = 0;
        this.context = context;
    }

    public Rect2D GeoRect2ViewRect(Rect2D rect2D) {
        Vector2D vector2D = new Vector2D();
        Vector2D vector2D2 = new Vector2D();
        double d10 = rect2D.minX;
        float f10 = this.scaleX;
        vector2D.f10707x = d10 * f10;
        double d11 = rect2D.minY;
        float f11 = this.scaleY;
        vector2D.f10708y = d11 * f11;
        double d12 = rect2D.maxX * f10;
        vector2D2.f10707x = d12;
        double d13 = rect2D.maxY * f11;
        vector2D2.f10708y = d13;
        return new Rect2D(vector2D.f10707x, vector2D.f10708y, d12, d13);
    }

    public void clear() {
        this.map.reset();
        this.mapRender.clear();
    }

    public void destroy() {
        this.mapRender.release();
    }

    public void directRenderAll() {
        this.index++;
        postInvalidate();
    }

    public Vector2D geoVector2ViewVector(Vector2D vector2D) {
        return new Vector2D(((vector2D.f10707x + this.moveX) * this.scaleX) + (getWidth() / 2), ((vector2D.f10708y + this.moveY) * this.scaleY) + (getHeight() / 2));
    }

    public void init(Map map, MapRender mapRender) {
        setDrawingCacheEnabled(true);
        this.map = map;
        this.mapRender = mapRender;
        mapRender.init(this);
    }

    public void moveViewPort(double d10, double d11) {
        this.moveX = (int) (this.moveX + d10);
        this.moveY = (int) (this.moveY + d11);
        postInvalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.map.directRender(this.mapRender, canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.startX = (int) motionEvent.getX();
            this.startY = (int) motionEvent.getY();
            return true;
        }
        if (action != 2) {
            return true;
        }
        motionEvent.getX();
        motionEvent.getY();
        return true;
    }

    public void render(Graph graph) {
        graph.render(this.mapRender);
    }

    public void renderAll() {
        this.map.render(this.mapRender);
        postInvalidate();
    }

    public void renderAllAndUpdateMatrix() {
        this.index++;
        Log.e(TAG, "申请第" + this.index + "次绘制");
        postInvalidate();
    }

    public void renderBezierLine(List<Actions.EzyPoint> list, boolean z9) {
        this.mapRender.drawBezierLine(list, z9);
    }

    public void scaleViewPort(double d10, double d11) {
        Log.e(TAG, "scale-->" + d10);
        this.scaleX = (float) d10;
        this.scaleY = (float) d11;
        postInvalidate();
    }

    public Vector2D geoVector2ViewVector(Vector2D vector2D, boolean z9) {
        double width = (vector2D.f10707x + this.moveX) * this.scaleX;
        double height = (vector2D.f10708y + this.moveY) * this.scaleY;
        if (z9) {
            width += getWidth() / 2;
            height += getHeight() / 2;
        }
        return new Vector2D(width, height);
    }

    public MapViewer(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.middleX = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.middleY = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.rotate = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.moveX = 0;
        this.moveY = 0;
        this.index = 0;
        this.context = context;
    }

    public MapViewer(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.middleX = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.middleY = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.rotate = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.moveX = 0;
        this.moveY = 0;
        this.index = 0;
        this.context = context;
    }
}
