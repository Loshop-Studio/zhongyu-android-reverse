package com.zykj.blackboard.core.action.newSelectAtion;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import com.blankj.utilcode.util.AbstractC3382c;
import com.zykj.blackboard.C4228R;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionType;
import com.zykj.blackboard.core.action.newSelectAtion.SelectColor;
import com.zykj.blackboard.core.action.newSelectAtion.function.FunctionBackgroundRectF;
import com.zykj.blackboard.core.action.newSelectAtion.function.FunctionRectF;
import com.zykj.blackboard.proxy.CustomColorView;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.blackboard.utils.ShapeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;

@Metadata(m5109d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JM\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018JE\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010\u0018J\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010#J-\u0010)\u001a\u00020(2\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u0011¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b+\u0010,JM\u00102\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010-\u001a\u00020(2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00102\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103J+\u00107\u001a\u00020(2\u0006\u00104\u001a\u00020\u000e2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00102\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00109R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010:¨\u0006<"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;", "", "Lcom/zykj/blackboard/bean/BoardConfig;", "boardConfig", "<init>", "(Lcom/zykj/blackboard/bean/BoardConfig;)V", "Landroid/graphics/Canvas;", "canvas", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;", "functionRectF", "Landroid/graphics/Paint;", "paint", "", "backgroundColor", "Landroid/graphics/RectF;", "backgroundRectF", "", "", "sizeList", "currentSize", "Ld6/s;", "drawWriteSizeView", "(Landroid/graphics/Canvas;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Landroid/graphics/Paint;ILandroid/graphics/RectF;Ljava/util/List;F)V", "drawTextSizeView", "(Landroid/graphics/Canvas;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Landroid/graphics/Paint;ILandroid/graphics/RectF;)V", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;", "functionBackgroundRectF", "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;", "colorList", "drawColorView", "(Landroid/graphics/Canvas;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Landroid/graphics/Paint;ILjava/util/List;)V", "drawCustomColor", TypedValues.Custom.S_COLOR, "", "checkColorLight", "(I)Z", "l", "t", "r", "b", "Landroid/graphics/Path;", "drawSelectingPath", "(FFFF)Landroid/graphics/Path;", "drawSelectingPaint", "(I)Landroid/graphics/Paint;", "path", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;", "typeList", "Landroid/graphics/PointF;", "pointF", "drawSelect", "(Landroid/graphics/Canvas;ILandroid/graphics/Path;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Ljava/util/List;Landroid/graphics/PointF;)V", "selectRectF", "Landroid/graphics/Matrix;", "matrix", "getSelectPath", "(Landroid/graphics/RectF;Ljava/util/List;Landroid/graphics/Matrix;)Landroid/graphics/Path;", "Lcom/zykj/blackboard/bean/BoardConfig;", "Landroid/graphics/Paint;", "Companion", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class NewSelectDrawControl {
    public static final float backgroundRadius = 6.0f;

    @NotNull
    private final BoardConfig boardConfig;

    @NotNull
    private final Paint paint;

    public NewSelectDrawControl(@NotNull BoardConfig boardConfig) {
        AbstractC5830k.m5330g(boardConfig, "boardConfig");
        this.boardConfig = boardConfig;
        Paint paint = new Paint();
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.paint = paint;
    }

    private final boolean checkColorLight(int color) {
        return (((double) (color & 255)) * 0.114d) + ((((double) ((color >> 8) & 255)) * 0.578d) + (((double) ((color >> 16) & 255)) * 0.299d)) >= 192.0d;
    }

    private final void drawColorView(Canvas canvas, FunctionRectF functionRectF, FunctionBackgroundRectF functionBackgroundRectF, Paint paint, int backgroundColor, List<? extends SelectColor> colorList) {
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(backgroundColor);
        canvas.drawRoundRect(functionBackgroundRectF.getColorRectF(), 6.0f, 6.0f, paint);
        int i = 0;
        boolean isOpen = false;
        for (Object obj : colorList) {
            int i8 = i + 1;
            if (i < 0) {
                AbstractC5806u.m5258L();
                throw null;
            }
            SelectColor selectColor = (SelectColor) obj;
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(selectColor.getValue());
            RectF rectF = new RectF(functionRectF.getColorList().get(i).left, functionRectF.getColorList().get(i).top, functionRectF.getColorList().get(i).right, functionRectF.getColorList().get(i).bottom);
            Path path = new Path();
            path.addRoundRect(rectF, 6.0f, 6.0f, Path.Direction.CW);
            int iSave = canvas.save();
            canvas.clipPath(path);
            try {
                canvas.drawColor(selectColor.getValue());
                if (selectColor instanceof SelectColor.Custom) {
                    isOpen = ((SelectColor.Custom) selectColor).getIsOpen();
                    Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(AbstractC3382c.m2303d().getResources(), selectColor.getValue() != 0 ? C4228R.drawable.blackboard_icon_custom_color_selected : C4228R.drawable.blackboard_icon_custom_color);
                    canvas.drawBitmap(bitmapDecodeResource, new Rect(0, 0, bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight()), rectF, (Paint) null);
                }
                if (selectColor.getIsSelected()) {
                    Path pathDrawTickInRectFToPath = ShapeUtils.INSTANCE.drawTickInRectFToPath(rectF);
                    paint.setColor(checkColorLight(selectColor.getValue()) ? ViewCompat.MEASURED_STATE_MASK : -1);
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(3.0f);
                    canvas.drawPath(pathDrawTickInRectFToPath, paint);
                }
                Result.m13956constructorimpl(C5443s.f8405a);
            } catch (Throwable th) {
                Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
            }
            canvas.restoreToCount(iSave);
            i = i8;
        }
        if (isOpen) {
            drawCustomColor(canvas, functionRectF, paint, backgroundColor, functionBackgroundRectF.getCustomColorRectF());
        }
    }

    private final void drawCustomColor(Canvas canvas, FunctionRectF functionRectF, Paint paint, int backgroundColor, RectF backgroundRectF) {
        RectF customColor = functionRectF.getCustomColor();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(backgroundColor);
        canvas.drawRoundRect(backgroundRectF, 6.0f, 6.0f, paint);
        int iSave = canvas.save();
        canvas.translate(customColor.left, customColor.top);
        CustomColorView selectCustomColorView = this.boardConfig.getSelectCustomColorView();
        if (selectCustomColorView != null) {
            selectCustomColorView.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    private final void drawTextSizeView(Canvas canvas, FunctionRectF functionRectF, Paint paint, int backgroundColor, RectF backgroundRectF) {
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(backgroundColor);
        canvas.drawRoundRect(backgroundRectF, 6.0f, 6.0f, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(3.0f);
        canvas.drawLine(functionRectF.getTextSizeReduce().centerX() - 12.0f, functionRectF.getTextSizeReduce().centerY(), functionRectF.getTextSizeReduce().centerX() + 12.0f, functionRectF.getTextSizeReduce().centerY(), paint);
        canvas.drawLine(functionRectF.getTextSizeAdd().centerX() - 12.0f, backgroundRectF.centerY(), functionRectF.getTextSizeAdd().centerX() + 12.0f, backgroundRectF.centerY(), paint);
        canvas.drawLine(functionRectF.getTextSizeAdd().centerX(), backgroundRectF.centerY() - 12.0f, functionRectF.getTextSizeAdd().centerX(), backgroundRectF.centerY() + 12.0f, paint);
        paint.setStrokeWidth(2.0f);
        paint.setColor(-2130706433);
        canvas.drawLine(backgroundRectF.centerX(), backgroundRectF.centerY() - 12.0f, backgroundRectF.centerX(), backgroundRectF.centerY() + 12.0f, paint);
    }

    private final void drawWriteSizeView(Canvas canvas, FunctionRectF functionRectF, Paint paint, int backgroundColor, RectF backgroundRectF, List<Float> sizeList, float currentSize) {
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(backgroundColor);
        canvas.drawRoundRect(backgroundRectF, 6.0f, 6.0f, paint);
        int i = 0;
        for (Object obj : sizeList) {
            int i8 = i + 1;
            if (i < 0) {
                AbstractC5806u.m5258L();
                throw null;
            }
            paint.setColor(((Number) obj).floatValue() == currentSize ? -15370497 : -3552823);
            canvas.drawCircle(functionRectF.getWriteStrokeWidthList().get(i).centerX(), functionRectF.getWriteStrokeWidthList().get(i).centerY(), ((i * 3.0f) + 8.0f) / 2, paint);
            i = i8;
        }
    }

    public final void drawSelect(@NotNull Canvas canvas, int backgroundColor, @NotNull Path path, @NotNull FunctionRectF functionRectF, @NotNull FunctionBackgroundRectF functionBackgroundRectF, @NotNull List<? extends NewSelectFunctionType> typeList, @Nullable PointF pointF) {
        AbstractC5830k.m5330g(canvas, "canvas");
        AbstractC5830k.m5330g(path, "path");
        AbstractC5830k.m5330g(functionRectF, "functionRectF");
        AbstractC5830k.m5330g(functionBackgroundRectF, "functionBackgroundRectF");
        AbstractC5830k.m5330g(typeList, "typeList");
        ArrayList arrayList = new ArrayList();
        for (Object obj : typeList) {
            if (((NewSelectFunctionType) obj).getText().length() > 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zCheckColorLight = checkColorLight(backgroundColor);
        int i = zCheckColorLight ? -1090519040 : 872415231;
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
        RectF editRectF = functionBackgroundRectF.getEditRectF();
        Paint paint2 = this.paint;
        Paint.Style style2 = Paint.Style.FILL;
        paint2.setStyle(style2);
        this.paint.setColor(i);
        canvas.drawRoundRect(editRectF, 6.0f, 6.0f, this.paint);
        this.paint.setStyle(style2);
        this.paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.paint.setTextSize(25.0f);
        float fHeight = (editRectF.bottom - ((editRectF.height() - (this.paint.getFontMetrics().bottom - this.paint.getFontMetrics().top)) / 2)) - this.paint.getFontMetrics().bottom;
        int size = arrayList.size();
        int i8 = 0;
        int i9 = 0;
        while (i9 < size) {
            Object obj3 = arrayList.get(i9);
            i9++;
            NewSelectFunctionType newSelectFunctionType = (NewSelectFunctionType) obj3;
            float f = (newSelectFunctionType instanceof NewSelectFunctionType.WriteEdit ? functionRectF.getWriteEdit().left : newSelectFunctionType instanceof NewSelectFunctionType.TextEdit ? functionRectF.getTextEdit().left : newSelectFunctionType instanceof NewSelectFunctionType.GeometryStroke ? functionRectF.getGeometryStroke().left : newSelectFunctionType instanceof NewSelectFunctionType.ImageCrop ? functionRectF.getImageCrop().left : newSelectFunctionType instanceof NewSelectFunctionType.Delete ? functionRectF.getDelete().left : 8.0f) + 15.0f;
            this.paint.setColor(newSelectFunctionType.getIsSelected() ? -15370497 : -1);
            canvas.drawText(newSelectFunctionType.getText(), f, fHeight, this.paint);
        }
        int size2 = arrayList.size();
        while (true) {
            if (i8 >= size2) {
                break;
            }
            Object obj4 = arrayList.get(i8);
            i8++;
            if (((NewSelectFunctionType) obj4).getIsSelected()) {
                obj2 = obj4;
                break;
            }
        }
        NewSelectFunctionType newSelectFunctionType2 = (NewSelectFunctionType) obj2;
        if (newSelectFunctionType2 instanceof NewSelectFunctionType.WriteEdit) {
            NewSelectFunctionType.WriteEdit writeEdit = (NewSelectFunctionType.WriteEdit) newSelectFunctionType2;
            int i10 = i;
            drawWriteSizeView(canvas, functionRectF, this.paint, i10, functionBackgroundRectF.getWriteStrokeRectF(), this.boardConfig.getSelectStrokeWidthList(writeEdit.getIsHighlighter()), writeEdit.getWidth());
            drawColorView(canvas, functionRectF, functionBackgroundRectF, this.paint, i10, writeEdit.getColorList());
            return;
        }
        int i11 = i;
        if (newSelectFunctionType2 instanceof NewSelectFunctionType.TextEdit) {
            drawTextSizeView(canvas, functionRectF, this.paint, i11, functionBackgroundRectF.getTextSizeRectF());
            drawColorView(canvas, functionRectF, functionBackgroundRectF, this.paint, i11, ((NewSelectFunctionType.TextEdit) newSelectFunctionType2).getColorList());
        } else if (newSelectFunctionType2 instanceof NewSelectFunctionType.GeometryStroke) {
            drawColorView(canvas, functionRectF, functionBackgroundRectF, this.paint, i11, ((NewSelectFunctionType.GeometryStroke) newSelectFunctionType2).getColorList());
        }
    }

    @NotNull
    public final Paint drawSelectingPaint(int backgroundColor) {
        this.paint.setStrokeWidth(3.0f);
        this.paint.setColor(checkColorLight(backgroundColor) ? ViewCompat.MEASURED_STATE_MASK : -3355444);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setPathEffect(new DashPathEffect(new float[]{30.0f, 15.0f}, 0.0f));
        return this.paint;
    }

    @NotNull
    public final Path drawSelectingPath(float l, float t8, float r, float b6) {
        Path path = new Path();
        path.addRect(l, t8, r, b6, Path.Direction.CW);
        path.close();
        return path;
    }

    @NotNull
    public final Path getSelectPath(@NotNull RectF selectRectF, @NotNull List<? extends NewSelectFunctionType> typeList, @NotNull Matrix matrix) {
        Object obj;
        Object next;
        boolean z8;
        boolean z9;
        AbstractC5830k.m5330g(selectRectF, "selectRectF");
        AbstractC5830k.m5330g(typeList, "typeList");
        AbstractC5830k.m5330g(matrix, "matrix");
        Path path = new Path();
        float fMapRadius = MatrixExtKt.invert(matrix).mapRadius(this.boardConfig.getSelectIconWidth());
        float f = 2;
        float f7 = fMapRadius / f;
        float f8 = 4;
        float f9 = f7 / f8;
        float fWidth = selectRectF.width() / f;
        float fHeight = selectRectF.height() / f;
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
        boolean isSingle = newSelectFunctionType != null ? ((NewSelectFunctionType.GeometryStroke) newSelectFunctionType).getIsSingle() : false;
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
        boolean isSingle2 = newSelectFunctionType2 != null ? ((NewSelectFunctionType.TextEdit) newSelectFunctionType2).getIsSingle() : isSingle;
        if (typeList.isEmpty()) {
            z8 = false;
        } else {
            Iterator<T> it3 = typeList.iterator();
            while (it3.hasNext()) {
                if (((NewSelectFunctionType) it3.next()) instanceof NewSelectFunctionType.Rotate) {
                    z8 = true;
                    break;
                }
            }
            z8 = false;
        }
        if (typeList.isEmpty()) {
            z9 = false;
        } else {
            Iterator<T> it4 = typeList.iterator();
            while (it4.hasNext()) {
                if (((NewSelectFunctionType) it4.next()) instanceof NewSelectFunctionType.Scale) {
                    z9 = true;
                    break;
                }
            }
            z9 = false;
        }
        path.moveTo(selectRectF.left, selectRectF.top);
        path.lineTo(selectRectF.left, (selectRectF.top + fHeight) - f9);
        if (isSingle) {
            float f10 = selectRectF.left;
            float f11 = selectRectF.top;
            path.addRect(f10 - f9, (f11 + fHeight) - f9, f10 + f9, f11 + fHeight + f9, Path.Direction.CW);
            path.moveTo(selectRectF.left, selectRectF.top + fHeight + f9);
        } else {
            path.lineTo(selectRectF.left, selectRectF.top + fHeight + f9);
        }
        path.lineTo(selectRectF.left, selectRectF.bottom);
        path.lineTo((selectRectF.left + fWidth) - f9, selectRectF.bottom);
        if (isSingle) {
            float f12 = selectRectF.left;
            float f13 = selectRectF.bottom;
            path.addRect((f12 + fWidth) - f9, f13 - f9, f12 + fWidth + f9, f13 + f9, Path.Direction.CW);
            path.moveTo(selectRectF.left + fWidth + f9, selectRectF.bottom);
        } else {
            path.lineTo(selectRectF.left + fWidth + f9, selectRectF.bottom);
        }
        path.lineTo(selectRectF.right - f7, selectRectF.bottom);
        if (z9) {
            ShapeUtils.INSTANCE.drawNewScaleIconToPath(path, selectRectF.right, selectRectF.bottom, f7);
        } else {
            path.lineTo(selectRectF.right, selectRectF.bottom);
            path.lineTo(selectRectF.right, selectRectF.bottom - f7);
        }
        path.moveTo(selectRectF.right, selectRectF.bottom - f7);
        path.lineTo(selectRectF.right, selectRectF.top + fHeight + f9);
        if (isSingle2) {
            float f14 = selectRectF.right;
            float f15 = selectRectF.top;
            path.addRect(f14 - f9, (f15 + fHeight) - f9, f14 + f9, f15 + fHeight + f9, Path.Direction.CW);
            path.moveTo(selectRectF.right, (selectRectF.top + fHeight) - f9);
        } else {
            path.lineTo(selectRectF.right, (selectRectF.top + fHeight) - f9);
        }
        path.lineTo(selectRectF.right, selectRectF.top);
        path.moveTo(selectRectF.right, selectRectF.top);
        path.lineTo(selectRectF.left + fWidth + f9, selectRectF.top);
        if (isSingle) {
            float f16 = selectRectF.left;
            float f17 = selectRectF.top;
            path.addRect((f16 + fWidth) - f9, f17 - f9, f16 + fWidth + f9, f17 + f9, Path.Direction.CW);
            path.moveTo((selectRectF.left + fWidth) - f9, selectRectF.top);
        } else {
            path.lineTo((selectRectF.left + fWidth) - f9, selectRectF.top);
        }
        path.lineTo(selectRectF.left, selectRectF.top);
        if (z8) {
            float f18 = (fMapRadius * 5) / f8;
            path.moveTo(selectRectF.left + fWidth, (selectRectF.top - f9) - f18);
            path.lineTo(selectRectF.left + fWidth, selectRectF.top - f9);
            if (!isSingle) {
                path.lineTo(selectRectF.left + fWidth, selectRectF.top);
            }
            ShapeUtils.INSTANCE.drawNewRotateIconToPath(path, selectRectF.left + fWidth, ((selectRectF.top - f9) - f18) - f7, f7);
        }
        path.transform(matrix);
        return path;
    }
}
