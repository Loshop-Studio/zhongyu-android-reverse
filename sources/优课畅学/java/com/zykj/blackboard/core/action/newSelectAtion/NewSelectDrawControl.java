package com.zykj.blackboard.core.action.newSelectAtion;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionType;
import com.zykj.blackboard.core.action.newSelectAtion.function.FunctionRectF;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.blackboard.utils.ShapeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;
import p134i7.AbstractC8811w;

/* loaded from: classes4.dex */
public final class NewSelectDrawControl {
    public static final Companion Companion = new Companion(null);
    public static final float backgroundRadius = 6.0f;
    private final BoardConfig boardConfig;
    private final Paint paint;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    public NewSelectDrawControl(BoardConfig boardConfig) {
        AbstractC9133u.m16133g(boardConfig, "boardConfig");
        this.boardConfig = boardConfig;
        Paint paint = new Paint();
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.paint = paint;
    }

    private final boolean checkColorLight(int i10) {
        return ((((double) ((i10 >> 16) & 255)) * 0.299d) + (((double) ((i10 >> 8) & 255)) * 0.578d)) + (((double) (i10 & 255)) * 0.114d) >= 192.0d;
    }

    private final void drawColorView(Canvas canvas, FunctionRectF functionRectF, Paint paint, int i10, List<Integer> list, int i11) {
        float selectButtonHeight = (this.boardConfig.getSelectButtonHeight() - 38.0f) / 2;
        RectF rectF = new RectF(((RectF) AbstractC8778f0.m14566l0(functionRectF.getColorList())).left - 23.0f, ((RectF) AbstractC8778f0.m14566l0(functionRectF.getColorList())).top - selectButtonHeight, ((RectF) AbstractC8778f0.m14578x0(functionRectF.getColorList())).right + 23.0f, ((RectF) AbstractC8778f0.m14578x0(functionRectF.getColorList())).bottom + selectButtonHeight);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i10);
        canvas.drawRoundRect(rectF, 6.0f, 6.0f, paint);
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                AbstractC8809v.m14780w();
            }
            int iIntValue = ((Number) obj).intValue();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor((16777215 & iIntValue) | (-16777216));
            RectF rectF2 = new RectF(functionRectF.getColorList().get(i12).left, functionRectF.getColorList().get(i12).top, functionRectF.getColorList().get(i12).right, functionRectF.getColorList().get(i12).bottom);
            canvas.drawRoundRect(rectF2, 6.0f, 6.0f, paint);
            if (iIntValue == i11) {
                Path pathDrawTickInRectFToPath = ShapeUtils.INSTANCE.drawTickInRectFToPath(rectF2);
                paint.setColor(checkColorLight(i11) ? -16777216 : -1);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(3.0f);
                canvas.drawPath(pathDrawTickInRectFToPath, paint);
            }
            i12 = i13;
        }
    }

    private final void drawTextSizeView(Canvas canvas, FunctionRectF functionRectF, Paint paint, int i10) {
        RectF rectF = new RectF(functionRectF.getTextSizeReduce().left, functionRectF.getTextSizeReduce().top, functionRectF.getTextSizeAdd().right, functionRectF.getTextSizeAdd().bottom);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i10);
        canvas.drawRoundRect(rectF, 6.0f, 6.0f, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(3.0f);
        canvas.drawLine(functionRectF.getTextSizeReduce().centerX() - 12.0f, functionRectF.getTextSizeReduce().centerY(), functionRectF.getTextSizeReduce().centerX() + 12.0f, functionRectF.getTextSizeReduce().centerY(), paint);
        canvas.drawLine(functionRectF.getTextSizeAdd().centerX() - 12.0f, rectF.centerY(), functionRectF.getTextSizeAdd().centerX() + 12.0f, rectF.centerY(), paint);
        canvas.drawLine(functionRectF.getTextSizeAdd().centerX(), rectF.centerY() - 12.0f, functionRectF.getTextSizeAdd().centerX(), rectF.centerY() + 12.0f, paint);
        paint.setStrokeWidth(2.0f);
        paint.setColor(-2130706433);
        canvas.drawLine(rectF.centerX(), rectF.centerY() - 12.0f, rectF.centerX(), rectF.centerY() + 12.0f, paint);
    }

    private final void drawWriteSizeView(Canvas canvas, FunctionRectF functionRectF, Paint paint, int i10, List<Float> list, float f10) {
        RectF rectF = new RectF(((RectF) AbstractC8778f0.m14566l0(functionRectF.getWriteStrokeWidthList())).left - 16.0f, ((RectF) AbstractC8778f0.m14566l0(functionRectF.getWriteStrokeWidthList())).top, ((RectF) AbstractC8778f0.m14578x0(functionRectF.getWriteStrokeWidthList())).right + 16.0f, ((RectF) AbstractC8778f0.m14566l0(functionRectF.getWriteStrokeWidthList())).bottom);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i10);
        canvas.drawRoundRect(rectF, 6.0f, 6.0f, paint);
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC8809v.m14780w();
            }
            paint.setColor(((Number) obj).floatValue() == f10 ? -15370497 : -3552823);
            canvas.drawCircle(functionRectF.getWriteStrokeWidthList().get(i11).centerX(), functionRectF.getWriteStrokeWidthList().get(i11).centerY(), ((i11 * 3.0f) + 8.0f) / 2, paint);
            i11 = i12;
        }
    }

    public final void drawSelect(Canvas canvas, int i10, Path path, FunctionRectF functionRectF, List<? extends NewSelectFunctionType> typeList, PointF pointF) {
        List<Integer> selectNormalColor;
        AbstractC9133u.m16133g(canvas, "canvas");
        AbstractC9133u.m16133g(path, "path");
        AbstractC9133u.m16133g(functionRectF, "functionRectF");
        AbstractC9133u.m16133g(typeList, "typeList");
        ArrayList<NewSelectFunctionType> arrayList = new ArrayList();
        for (Object obj : typeList) {
            if (((NewSelectFunctionType) obj).getText().length() > 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zCheckColorLight = checkColorLight(i10);
        int i11 = zCheckColorLight ? -1090519040 : 872415231;
        this.paint.setStrokeWidth(3.0f);
        this.paint.setColor(zCheckColorLight ? -12085261 : -3355444);
        Paint paint = this.paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Object obj2 = null;
        this.paint.setPathEffect(null);
        canvas.drawPath(path, this.paint);
        if (pointF != null) {
            this.paint.setStyle(Paint.Style.FILL);
            this.paint.setColor(-39424);
            canvas.drawCircle(pointF.x, pointF.y, this.boardConfig.getSelectIconWidth() / 8, this.paint);
        }
        this.paint.setTextSize(25.0f);
        this.paint.setStyle(style);
        RectF rectF = new RectF();
        rectF.union(functionRectF.getWriteEdit());
        rectF.union(functionRectF.getTextEdit());
        rectF.union(functionRectF.getGeometryStroke());
        rectF.union(functionRectF.getImageCrop());
        rectF.union(functionRectF.getDelete());
        rectF.left -= 8.0f;
        rectF.right += 8.0f;
        Paint paint2 = this.paint;
        Paint.Style style2 = Paint.Style.FILL;
        paint2.setStyle(style2);
        this.paint.setColor(i11);
        canvas.drawRoundRect(rectF, 6.0f, 6.0f, this.paint);
        this.paint.setStyle(style2);
        this.paint.setColor(-16777216);
        this.paint.setTextSize(25.0f);
        float fHeight = (rectF.bottom - ((rectF.height() - (this.paint.getFontMetrics().bottom - this.paint.getFontMetrics().top)) / 2)) - this.paint.getFontMetrics().bottom;
        for (NewSelectFunctionType newSelectFunctionType : arrayList) {
            float f10 = (newSelectFunctionType instanceof NewSelectFunctionType.WriteEdit ? functionRectF.getWriteEdit().left : newSelectFunctionType instanceof NewSelectFunctionType.TextEdit ? functionRectF.getTextEdit().left : newSelectFunctionType instanceof NewSelectFunctionType.GeometryStroke ? functionRectF.getGeometryStroke().left : newSelectFunctionType instanceof NewSelectFunctionType.ImageCrop ? functionRectF.getImageCrop().left : newSelectFunctionType instanceof NewSelectFunctionType.Delete ? functionRectF.getDelete().left : 8.0f) + 15.0f;
            this.paint.setColor(newSelectFunctionType.isSelected() ? -15370497 : -1);
            canvas.drawText(newSelectFunctionType.getText(), f10, fHeight, this.paint);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((NewSelectFunctionType) next).isSelected()) {
                obj2 = next;
                break;
            }
        }
        NewSelectFunctionType newSelectFunctionType2 = (NewSelectFunctionType) obj2;
        if (!(newSelectFunctionType2 instanceof NewSelectFunctionType.WriteEdit)) {
            if (newSelectFunctionType2 instanceof NewSelectFunctionType.TextEdit) {
                drawTextSizeView(canvas, functionRectF, this.paint, i11);
                drawColorView(canvas, functionRectF, this.paint, i11, this.boardConfig.getSelectNormalColor(), ((NewSelectFunctionType.TextEdit) newSelectFunctionType2).getColor());
                return;
            } else {
                if (newSelectFunctionType2 instanceof NewSelectFunctionType.GeometryStroke) {
                    drawColorView(canvas, functionRectF, this.paint, i11, this.boardConfig.getSelectNormalColor(), ((NewSelectFunctionType.GeometryStroke) newSelectFunctionType2).getColor());
                    return;
                }
                return;
            }
        }
        NewSelectFunctionType.WriteEdit writeEdit = (NewSelectFunctionType.WriteEdit) newSelectFunctionType2;
        drawWriteSizeView(canvas, functionRectF, this.paint, i11, writeEdit.isHighlighter() ? this.boardConfig.getSelectHighlighterLevel() : this.boardConfig.getSelectWriteLevel(), writeEdit.getWidth());
        Paint paint3 = this.paint;
        if (writeEdit.isHighlighter()) {
            List<Integer> selectNormalColor2 = this.boardConfig.getSelectNormalColor();
            selectNormalColor = new ArrayList<>(AbstractC8811w.m14786x(selectNormalColor2, 10));
            Iterator<T> it2 = selectNormalColor2.iterator();
            while (it2.hasNext()) {
                selectNormalColor.add(Integer.valueOf((((Number) it2.next()).intValue() & ViewCompat.MEASURED_SIZE_MASK) | (((int) (this.boardConfig.getHighlighterColorAlpha() * 255)) << 24)));
            }
        } else {
            selectNormalColor = this.boardConfig.getSelectNormalColor();
        }
        drawColorView(canvas, functionRectF, paint3, i11, selectNormalColor, writeEdit.getColor());
    }

    public final Paint drawSelectingPaint(int i10) {
        this.paint.setStrokeWidth(3.0f);
        this.paint.setColor(checkColorLight(i10) ? -16777216 : -3355444);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setPathEffect(new DashPathEffect(new float[]{30.0f, 15.0f}, 0.0f));
        return this.paint;
    }

    public final Path drawSelectingPath(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.addRect(f10, f11, f12, f13, Path.Direction.CW);
        path.close();
        return path;
    }

    public final Path getSelectPath(RectF selectRectF, List<? extends NewSelectFunctionType> typeList, Matrix matrix) {
        Object obj;
        Object next;
        boolean z10;
        boolean z11;
        AbstractC9133u.m16133g(selectRectF, "selectRectF");
        AbstractC9133u.m16133g(typeList, "typeList");
        AbstractC9133u.m16133g(matrix, "matrix");
        Path path = new Path();
        float fMapRadius = MatrixExtKt.invert(matrix).mapRadius(this.boardConfig.getSelectIconWidth());
        float f10 = 2;
        float f11 = fMapRadius / f10;
        float f12 = 4;
        float f13 = f11 / f12;
        float fWidth = selectRectF.width() / f10;
        float fHeight = selectRectF.height() / f10;
        Iterator<T> it = typeList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((NewSelectFunctionType) next) instanceof NewSelectFunctionType.GeometryStroke) {
                break;
            }
        }
        NewSelectFunctionType newSelectFunctionType = (NewSelectFunctionType) next;
        boolean zIsSingle = newSelectFunctionType != null ? ((NewSelectFunctionType.GeometryStroke) newSelectFunctionType).isSingle() : false;
        Iterator<T> it2 = typeList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((NewSelectFunctionType) next2) instanceof NewSelectFunctionType.TextEdit) {
                obj = next2;
                break;
            }
        }
        NewSelectFunctionType newSelectFunctionType2 = (NewSelectFunctionType) obj;
        boolean zIsSingle2 = newSelectFunctionType2 != null ? ((NewSelectFunctionType.TextEdit) newSelectFunctionType2).isSingle() : zIsSingle;
        if (typeList == null || !typeList.isEmpty()) {
            Iterator<T> it3 = typeList.iterator();
            while (it3.hasNext()) {
                if (((NewSelectFunctionType) it3.next()) instanceof NewSelectFunctionType.Rotate) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        } else {
            z10 = false;
        }
        if (typeList == null || !typeList.isEmpty()) {
            Iterator<T> it4 = typeList.iterator();
            while (it4.hasNext()) {
                if (((NewSelectFunctionType) it4.next()) instanceof NewSelectFunctionType.Scale) {
                    z11 = true;
                    break;
                }
            }
            z11 = false;
        } else {
            z11 = false;
        }
        path.moveTo(selectRectF.left, selectRectF.top);
        path.lineTo(selectRectF.left, (selectRectF.top + fHeight) - f13);
        if (zIsSingle) {
            float f14 = selectRectF.left;
            float f15 = selectRectF.top;
            path.addRect(f14 - f13, (f15 + fHeight) - f13, f14 + f13, f15 + fHeight + f13, Path.Direction.CW);
            path.moveTo(selectRectF.left, selectRectF.top + fHeight + f13);
        } else {
            path.lineTo(selectRectF.left, selectRectF.top + fHeight + f13);
        }
        path.lineTo(selectRectF.left, selectRectF.bottom);
        path.lineTo((selectRectF.left + fWidth) - f13, selectRectF.bottom);
        if (zIsSingle) {
            float f16 = selectRectF.left;
            float f17 = selectRectF.bottom;
            path.addRect((f16 + fWidth) - f13, f17 - f13, f16 + fWidth + f13, f17 + f13, Path.Direction.CW);
            path.moveTo(selectRectF.left + fWidth + f13, selectRectF.bottom);
        } else {
            path.lineTo(selectRectF.left + fWidth + f13, selectRectF.bottom);
        }
        path.lineTo(selectRectF.right - f11, selectRectF.bottom);
        if (z11) {
            ShapeUtils.INSTANCE.drawNewScaleIconToPath(path, selectRectF.right, selectRectF.bottom, f11);
        } else {
            path.lineTo(selectRectF.right, selectRectF.bottom);
            path.lineTo(selectRectF.right, selectRectF.bottom - f11);
        }
        path.moveTo(selectRectF.right, selectRectF.bottom - f11);
        path.lineTo(selectRectF.right, selectRectF.top + fHeight + f13);
        if (zIsSingle2) {
            float f18 = selectRectF.right;
            float f19 = selectRectF.top;
            path.addRect(f18 - f13, (f19 + fHeight) - f13, f18 + f13, f19 + fHeight + f13, Path.Direction.CW);
            path.moveTo(selectRectF.right, (selectRectF.top + fHeight) - f13);
        } else {
            path.lineTo(selectRectF.right, (selectRectF.top + fHeight) - f13);
        }
        path.lineTo(selectRectF.right, selectRectF.top);
        path.moveTo(selectRectF.right, selectRectF.top);
        path.lineTo(selectRectF.left + fWidth + f13, selectRectF.top);
        if (zIsSingle) {
            float f20 = selectRectF.left;
            float f21 = selectRectF.top;
            path.addRect((f20 + fWidth) - f13, f21 - f13, f20 + fWidth + f13, f21 + f13, Path.Direction.CW);
            path.moveTo((selectRectF.left + fWidth) - f13, selectRectF.top);
        } else {
            path.lineTo((selectRectF.left + fWidth) - f13, selectRectF.top);
        }
        path.lineTo(selectRectF.left, selectRectF.top);
        if (z10) {
            float f22 = (fMapRadius * 5) / f12;
            path.moveTo(selectRectF.left + fWidth, (selectRectF.top - f13) - f22);
            path.lineTo(selectRectF.left + fWidth, selectRectF.top - f13);
            if (!zIsSingle) {
                path.lineTo(selectRectF.left + fWidth, selectRectF.top);
            }
            ShapeUtils.INSTANCE.drawNewRotateIconToPath(path, selectRectF.left + fWidth, ((selectRectF.top - f13) - f22) - f11, f11);
        }
        path.transform(matrix);
        return path;
    }
}
