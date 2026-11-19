package com.zykj.blackboard.crop;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.core.canvas.view.BackgroundLayer;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class SimpleBackgroundView implements BackgroundLayer {
    private final int height;
    private float lineSpacing;
    private BackgroundLineConfig.BackgroundLineType lineType;
    private int mBackgroundColor = -1;
    private final Paint mLinePaint;
    private final int width;

    public SimpleBackgroundView(int i10, int i11) {
        this.width = i10;
        this.height = i11;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setColor(-16777216);
        paint.setStrokeWidth(3.0f);
        this.mLinePaint = paint;
        this.lineType = BackgroundLineConfig.BackgroundLineType.Horizontal;
        this.lineSpacing = 96.0f;
    }

    @Override // com.zykj.blackboard.core.canvas.view.BackgroundLayer
    public void drawBackground(Canvas canvas, Matrix matrix) {
        AbstractC9133u.m16133g(canvas, "canvas");
        AbstractC9133u.m16133g(matrix, "matrix");
    }

    @Override // com.zykj.blackboard.core.canvas.view.BackgroundLayer
    public BackgroundLineConfig getBackgroundLineConfig() {
        return new BackgroundLineConfig(this.mLinePaint.getColor(), this.lineSpacing, this.lineType, this.mLinePaint.getStrokeWidth());
    }

    @Override // com.zykj.blackboard.core.canvas.view.BackgroundLayer
    public int getMyBackgroundColor() {
        return this.mBackgroundColor;
    }

    @Override // com.zykj.blackboard.core.canvas.view.BackgroundLayer
    public void refresh() {
    }

    @Override // com.zykj.blackboard.core.canvas.view.BackgroundLayer
    public void setBackgroundLineConfig(BackgroundLineConfig backgroundLineConfig) {
        AbstractC9133u.m16133g(backgroundLineConfig, "backgroundLineConfig");
        this.lineSpacing = backgroundLineConfig.getLineSpace();
        this.lineType = backgroundLineConfig.getLineType();
        this.mLinePaint.setColor(backgroundLineConfig.getLineColor());
        this.mLinePaint.setStrokeWidth(backgroundLineConfig.getLineWidth());
    }

    @Override // com.zykj.blackboard.core.canvas.view.BackgroundLayer
    public void setMatrix(Matrix adapterMatrix) {
        AbstractC9133u.m16133g(adapterMatrix, "adapterMatrix");
    }

    @Override // com.zykj.blackboard.core.canvas.view.BackgroundLayer
    public void setMyBackgroundColor(int i10) {
        this.mBackgroundColor = i10;
    }
}
