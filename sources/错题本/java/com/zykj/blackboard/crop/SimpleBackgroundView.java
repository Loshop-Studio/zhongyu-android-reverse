package com.zykj.blackboard.crop;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.core.canvas.view.BackgroundLayer;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, m5110d2 = {"Lcom/zykj/blackboard/crop/SimpleBackgroundView;", "Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;", "", "width", "height", "<init>", "(II)V", "Ld6/s;", "refresh", "()V", "Landroid/graphics/Matrix;", "adapterMatrix", "setMatrix", "(Landroid/graphics/Matrix;)V", TypedValues.Custom.S_COLOR, "setMyBackgroundColor", "(I)V", "getMyBackgroundColor", "()I", "Lcom/zykj/blackboard/bean/BackgroundLineConfig;", "backgroundLineConfig", "setBackgroundLineConfig", "(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V", "getBackgroundLineConfig", "()Lcom/zykj/blackboard/bean/BackgroundLineConfig;", "Landroid/graphics/Canvas;", "canvas", "matrix", "drawBackground", "(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V", "I", "mBackgroundColor", "Landroid/graphics/Paint;", "mLinePaint", "Landroid/graphics/Paint;", "Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;", "lineType", "Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;", "", "lineSpacing", "F", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class SimpleBackgroundView implements BackgroundLayer {
    private final int height;
    private float lineSpacing;

    @NotNull
    private BackgroundLineConfig.BackgroundLineType lineType;
    private int mBackgroundColor = -1;

    @NotNull
    private final Paint mLinePaint;
    private final int width;

    public SimpleBackgroundView(int i, int i8) {
        this.width = i;
        this.height = i8;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        paint.setStrokeWidth(3.0f);
        this.mLinePaint = paint;
        this.lineType = BackgroundLineConfig.BackgroundLineType.Horizontal;
        this.lineSpacing = 96.0f;
    }

    @Override // com.zykj.blackboard.core.canvas.view.BackgroundLayer
    public void drawBackground(@NotNull Canvas canvas, @NotNull Matrix matrix) {
        AbstractC5830k.m5330g(canvas, "canvas");
        AbstractC5830k.m5330g(matrix, "matrix");
    }

    @Override // com.zykj.blackboard.core.canvas.view.BackgroundLayer
    @NotNull
    public BackgroundLineConfig getBackgroundLineConfig() {
        return new BackgroundLineConfig(this.mLinePaint.getColor(), this.lineSpacing, this.lineType, this.mLinePaint.getStrokeWidth());
    }

    @Override // com.zykj.blackboard.core.canvas.view.BackgroundLayer
    /* renamed from: getMyBackgroundColor, reason: from getter */
    public int getMBackgroundColor() {
        return this.mBackgroundColor;
    }

    @Override // com.zykj.blackboard.core.canvas.view.BackgroundLayer
    public void refresh() {
    }

    @Override // com.zykj.blackboard.core.canvas.view.BackgroundLayer
    public void setBackgroundLineConfig(@NotNull BackgroundLineConfig backgroundLineConfig) {
        AbstractC5830k.m5330g(backgroundLineConfig, "backgroundLineConfig");
        this.lineSpacing = backgroundLineConfig.getLineSpace();
        this.lineType = backgroundLineConfig.getLineType();
        this.mLinePaint.setColor(backgroundLineConfig.getLineColor());
        this.mLinePaint.setStrokeWidth(backgroundLineConfig.getLineWidth());
    }

    @Override // com.zykj.blackboard.core.canvas.view.BackgroundLayer
    public void setMatrix(@NotNull Matrix adapterMatrix) {
        AbstractC5830k.m5330g(adapterMatrix, "adapterMatrix");
    }

    @Override // com.zykj.blackboard.core.canvas.view.BackgroundLayer
    public void setMyBackgroundColor(int color) {
        this.mBackgroundColor = color;
    }
}
