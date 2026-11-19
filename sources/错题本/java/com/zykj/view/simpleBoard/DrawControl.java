package com.zykj.view.simpleBoard;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.extensions.ExtensionsKt;
import com.zykj.blackboard.utils.CanvasUtils;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.sketch.core.graph.GraphExtKt;
import com.zykj.view.simpleBoard.action.WritePath;
import com.zykj.view.simpleBoard.view.IBoardView;
import com.zykj.view.utils.ProtoPath;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0014\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0012\u001a\u00020\u00112\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u0015\u0010 \u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u001b\u0010$\u001a\u00020\u001a2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\n¢\u0006\u0004\b$\u0010%J\u001d\u0010)\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b/\u0010.J\u0015\u00100\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b0\u0010.J\r\u00101\u001a\u00020\u001a¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u0017¢\u0006\u0004\b3\u00104J\u0015\u00106\u001a\u00020\u001a2\u0006\u00105\u001a\u00020\u0015¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u001e¢\u0006\u0004\b8\u00109J\u001d\u0010<\u001a\u00020\u001a2\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010:¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u001a¢\u0006\u0004\b>\u00102J\u0015\u0010?\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b?\u0010@J#\u0010B\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u00020\u001a¢\u0006\u0004\bD\u00102J\u0015\u0010F\u001a\u00020\u001a2\u0006\u0010E\u001a\u00020\u000b¢\u0006\u0004\bF\u0010GJ\u0015\u0010H\u001a\u00020\u001a2\u0006\u0010E\u001a\u00020\u000b¢\u0006\u0004\bH\u0010GJ\u0015\u0010J\u001a\u00020\u001a2\u0006\u0010I\u001a\u00020\u0004¢\u0006\u0004\bJ\u0010KR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010LR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010MR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010NR$\u0010O\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u00109\"\u0004\bR\u0010!R\u0016\u0010T\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010V\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010MR'\u0010Y\u001a\u0012\u0012\u0004\u0012\u00020\u00110Wj\b\u0012\u0004\u0012\u00020\u0011`X8\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u0016\u0010]\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u001e\u0010_\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010a\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010^R\u0014\u0010b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010MR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010h\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010g¨\u0006i"}, m5110d2 = {"Lcom/zykj/view/simpleBoard/DrawControl;", "", "Lcom/zykj/view/simpleBoard/SimpleBoardConfig;", "mBoardConfig", "Landroid/graphics/Matrix;", "mCameraMatrix", "Lcom/zykj/view/simpleBoard/view/IBoardView;", "mDrawView", "<init>", "(Lcom/zykj/view/simpleBoard/SimpleBoardConfig;Landroid/graphics/Matrix;Lcom/zykj/view/simpleBoard/view/IBoardView;)V", "", "Landroid/graphics/PointF;", "pointList", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Path;", "path", "Lcom/zykj/view/simpleBoard/action/WritePath;", "buildWritePathData", "(Ljava/util/List;Landroid/graphics/Paint;Landroid/graphics/Path;)Lcom/zykj/view/simpleBoard/action/WritePath;", "pointF", "", TypedValues.CycleType.S_WAVE_OFFSET, "", "checkPointFUnionPath", "(Landroid/graphics/PointF;Ljava/util/List;F)Z", "Ld6/s;", "initPenPaint", "(Landroid/graphics/Paint;)V", "initEraserPaint", "Landroid/graphics/Bitmap;", "bitmap", "setImageBackground", "(Landroid/graphics/Bitmap;)V", "Lcom/zykj/view/utils/ProtoPath;", "pathList", "setPathList", "(Ljava/util/List;)V", "", "viewWidth", "viewHeight", "updateSize", "(II)V", "Landroid/graphics/Canvas;", "canvas", "drawBackgroundBitmap", "(Landroid/graphics/Canvas;)V", "drawPathBitmap", "drawTempPath", "clean", "()V", "isEmpty", "()Z", "scale", "setScale", "(F)V", "buildBitmap", "()Landroid/graphics/Bitmap;", "Lkotlin/Function0;", "listener", "setOnActionListener", "(Lr6/a;)V", "reset", "handleWritePath", "(Landroid/graphics/Path;)V", "pointFList", "handleWritePathEnd", "(Landroid/graphics/Path;Ljava/util/List;)V", "handleWritePathCancel", "currentPointF", "handleEraser", "(Landroid/graphics/PointF;)V", "handleEraserEnd", "matrix", "handleCameraMatrix", "(Landroid/graphics/Matrix;)V", "Lcom/zykj/view/simpleBoard/SimpleBoardConfig;", "Landroid/graphics/Matrix;", "Lcom/zykj/view/simpleBoard/view/IBoardView;", "mBackgroundBitmap", "Landroid/graphics/Bitmap;", "getMBackgroundBitmap", "setMBackgroundBitmap", "Landroid/graphics/RectF;", "mBackgroundRectF", "Landroid/graphics/RectF;", "mBackgroundMatrix", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "mPathList", "Ljava/util/ArrayList;", "getMPathList", "()Ljava/util/ArrayList;", "mTempPath", "Landroid/graphics/Path;", "mActionListener", "Lr6/a;", "tempPath", "tempMatrix", "", "tempMatrixValue", "[F", "mPathPaint", "Landroid/graphics/Paint;", "mTempPaint", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDrawControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawControl.kt\ncom/zykj/view/simpleBoard/DrawControl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n1#1,597:1\n1563#2:598\n1634#2,3:599\n1869#2,2:602\n1869#2,2:604\n1878#2,3:606\n1#3:609\n268#4:610\n268#4:611\n*S KotlinDebug\n*F\n+ 1 DrawControl.kt\ncom/zykj/view/simpleBoard/DrawControl\n*L\n112#1:598\n112#1:599,3\n172#1:602,2\n252#1:604,2\n322#1:606,3\n405#1:610\n436#1:611\n*E\n"})
/* loaded from: classes3.dex */
public final class DrawControl {

    @Nullable
    private InterfaceC6469a mActionListener;

    @Nullable
    private Bitmap mBackgroundBitmap;

    @NotNull
    private Matrix mBackgroundMatrix;

    @NotNull
    private RectF mBackgroundRectF;

    @NotNull
    private final SimpleBoardConfig mBoardConfig;

    @NotNull
    private final Matrix mCameraMatrix;

    @NotNull
    private final IBoardView mDrawView;

    @NotNull
    private final ArrayList<WritePath> mPathList;

    @NotNull
    private final Paint mPathPaint;

    @NotNull
    private final Paint mTempPaint;

    @NotNull
    private Path mTempPath;

    @NotNull
    private final Matrix tempMatrix;

    @NotNull
    private final float[] tempMatrixValue;

    @NotNull
    private final Path tempPath;

    public DrawControl(@NotNull SimpleBoardConfig mBoardConfig, @NotNull Matrix mCameraMatrix, @NotNull IBoardView mDrawView) {
        AbstractC5830k.m5330g(mBoardConfig, "mBoardConfig");
        AbstractC5830k.m5330g(mCameraMatrix, "mCameraMatrix");
        AbstractC5830k.m5330g(mDrawView, "mDrawView");
        this.mBoardConfig = mBoardConfig;
        this.mCameraMatrix = mCameraMatrix;
        this.mDrawView = mDrawView;
        this.mBackgroundRectF = new RectF();
        this.mBackgroundMatrix = new Matrix();
        this.mPathList = new ArrayList<>();
        this.mTempPath = new Path();
        this.tempPath = new Path();
        this.tempMatrix = new Matrix();
        float[] fArr = new float[9];
        for (int i = 0; i < 9; i++) {
            fArr[i] = 0.0f;
        }
        this.tempMatrixValue = fArr;
        Paint paint = new Paint();
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        paint.setDither(true);
        paint.setAntiAlias(true);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_OVER;
        paint.setXfermode(new PorterDuffXfermode(mode));
        this.mPathPaint = paint;
        Paint paint2 = new Paint();
        paint2.setStrokeCap(cap);
        paint2.setStrokeJoin(join);
        paint2.setDither(true);
        paint2.setAntiAlias(true);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.mTempPaint = paint2;
    }

    private final WritePath buildWritePathData(List<? extends PointF> pointList, Paint paint, Path path) {
        Path path2 = new Path();
        if (path != null) {
            path2.set(path);
        } else {
            PointF pointF = new PointF();
            int i = 0;
            for (Object obj : pointList) {
                int i8 = i + 1;
                if (i < 0) {
                    AbstractC5806u.m5258L();
                    throw null;
                }
                PointF pointF2 = (PointF) obj;
                if (i == 0) {
                    path2.moveTo(pointF2.x, pointF2.y);
                    path2.lineTo(pointF2.x, pointF2.y);
                    pointF.set(pointF2);
                } else if (i == pointList.size() - 1) {
                    float f = pointF.x;
                    float f7 = pointF.y;
                    float f8 = 2;
                    path2.quadTo(f, f7, (pointF2.x + f) / f8, (pointF2.y + f7) / f8);
                    path2.lineTo(pointF2.x, pointF2.y);
                } else {
                    float f9 = pointF.x;
                    float f10 = pointF.y;
                    float f11 = 2;
                    path2.quadTo(f9, f10, (pointF2.x + f9) / f11, (pointF2.y + f10) / f11);
                    pointF.set(pointF2);
                }
                i = i8;
            }
        }
        Paint paint2 = new Paint(paint);
        RectF rectF = new RectF();
        path2.computeBounds(rectF, true);
        float fMapRadius = MatrixExtKt.invert(this.mCameraMatrix).mapRadius(this.mBoardConfig.getEraserSize());
        float f12 = 2 * fMapRadius; // SimpleBoard freezes the narrow-axis hit bounds here using the current eraser diameter.
        if (rectF.width() < f12) {
            rectF.left -= fMapRadius;
            rectF.right += fMapRadius;
        }
        if (rectF.height() < f12) {
            rectF.top -= fMapRadius;
            rectF.bottom += fMapRadius;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(pointList);
        return new WritePath(path2, paint2, rectF, arrayList);
    }

    public static /* synthetic */ WritePath buildWritePathData$default(DrawControl drawControl, List list, Paint paint, Path path, int i, Object obj) {
        if ((i & 4) != 0) {
            path = null;
        }
        return drawControl.buildWritePathData(list, paint, path);
    }

    private final boolean checkPointFUnionPath(PointF pointF, List<? extends PointF> pointList, float offset) {
        int size = pointList.size() - 1; // Hit testing joins consecutive raw samples, including gaps in a dashed path.
        int i = 0;
        while (i < size) {
            float f = pointList.get(i).x;
            float f7 = pointList.get(i).y;
            i++;
            if (ExtensionsKt.pointToLine(f, f7, pointList.get(i).x, pointList.get(i).y, pointF.x, pointF.y) <= offset) {
                return true;
            }
        }
        return false;
    }

    private final void initEraserPaint(Paint paint) {
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.mBoardConfig.getEraserColor());
    }

    private final void initPenPaint(Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(this.mBoardConfig.getPenColor());
        paint.setStrokeWidth(this.mBoardConfig.getPenWidth());
        paint.setPathEffect(this.mBoardConfig.isPenDashed() ? new DashPathEffect(new float[]{30.0f, 15.0f}, 0.0f) : null);
    }

    @NotNull
    public final Bitmap buildBitmap() throws Exception {
        Object objM13956constructorimpl;
        try {
            objM13956constructorimpl = Result.m13956constructorimpl(Bitmap.createBitmap((int) this.mBackgroundRectF.width(), (int) this.mBackgroundRectF.height(), Bitmap.Config.RGB_565));
        } catch (Throwable th) {
            objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
        }
        if (Result.m13961isFailureimpl(objM13956constructorimpl)) {
            objM13956constructorimpl = null;
        }
        Bitmap bitmap = (Bitmap) objM13956constructorimpl;
        if (bitmap == null) {
            throw new Exception("view have not init");
        }
        Canvas canvas = new Canvas(bitmap);
        Bitmap bitmap2 = this.mBackgroundBitmap;
        this.tempMatrix.set(this.mBackgroundMatrix);
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, this.tempMatrix, null);
        } else {
            canvas.drawColor(-1);
        }
        ArrayList<WritePath> arrayList = this.mPathList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            WritePath writePath = arrayList.get(i);
            i++;
            WritePath writePath2 = writePath;
            this.tempPath.set(writePath2.getPath());
            canvas.drawPath(this.tempPath, writePath2.getPaint());
        }
        return bitmap;
    }

    public final void clean() {
        this.mPathList.clear();
        InterfaceC6469a interfaceC6469a = this.mActionListener;
        if (interfaceC6469a != null) {
            interfaceC6469a.invoke();
        }
        this.mDrawView.updatePathView();
    }

    public final void drawBackgroundBitmap(@NotNull Canvas canvas) {
        AbstractC5830k.m5330g(canvas, "canvas");
        Bitmap bitmap = this.mBackgroundBitmap;
        if (bitmap == null) {
            canvas.drawColor(-1);
            return;
        }
        this.tempMatrix.set(this.mBackgroundMatrix);
        this.tempMatrix.postConcat(this.mCameraMatrix);
        CanvasUtils.INSTANCE.drawLargeBitmap(canvas, bitmap, this.tempMatrix);
    }

    public final void drawPathBitmap(@NotNull Canvas canvas) {
        AbstractC5830k.m5330g(canvas, "canvas");
        this.tempMatrix.set(this.mCameraMatrix);
        ArrayList<WritePath> arrayList = this.mPathList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            WritePath writePath = arrayList.get(i);
            i++;
            WritePath writePath2 = writePath;
            this.tempPath.set(writePath2.getPath());
            this.tempPath.transform(this.tempMatrix);
            canvas.drawPath(this.tempPath, writePath2.getPaint());
        }
    }

    public final void drawTempPath(@NotNull Canvas canvas) {
        AbstractC5830k.m5330g(canvas, "canvas");
        if (this.mTempPath.isEmpty()) {
            return;
        }
        canvas.drawPath(this.mTempPath, this.mTempPaint);
    }

    @Nullable
    public final Bitmap getMBackgroundBitmap() {
        return this.mBackgroundBitmap;
    }

    @NotNull
    public final ArrayList<WritePath> getMPathList() {
        return this.mPathList;
    }

    public final void handleCameraMatrix(@NotNull Matrix matrix) {
        AbstractC5830k.m5330g(matrix, "matrix");
        Object obj = this.mDrawView;
        AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type android.view.View");
        Log.i("DrawControl", "before -> " + matrix.toShortString());
        matrix.getValues(this.tempMatrixValue);
        float[] fArr = this.tempMatrixValue;
        float f = fArr[0];
        float f7 = fArr[4];
        float f8 = fArr[2];
        float f9 = fArr[5];
        float maxScaleTime = this.mBoardConfig.getMaxScaleTime() > 1.0f ? this.mBoardConfig.getMaxScaleTime() : 1.0f;
        if (f < 1.0f) {
            this.tempMatrixValue[0] = 1.0f;
        } else if (f > maxScaleTime) {
            this.tempMatrixValue[0] = maxScaleTime;
        }
        if (f7 < 1.0f) {
            this.tempMatrixValue[4] = 1.0f;
        } else if (f > maxScaleTime) {
            this.tempMatrixValue[4] = maxScaleTime;
        }
        if (f8 > 0.0f) {
            this.tempMatrixValue[2] = 0.0f;
        } else if (f8 < (-((this.mBackgroundRectF.width() * f) - ((View) this.mDrawView).getWidth()))) {
            this.tempMatrixValue[2] = -((this.mBackgroundRectF.width() * this.tempMatrixValue[0]) - ((View) this.mDrawView).getWidth());
        } else if (this.mBackgroundRectF.width() * f == ((View) this.mDrawView).getWidth()) {
            this.tempMatrixValue[2] = 0.0f;
        } else {
            float f10 = 1;
            this.tempMatrixValue[2] = ((this.mBackgroundRectF.width() * this.tempMatrixValue[0]) - ((View) this.mDrawView).getWidth()) * (((f8 / ((this.mBackgroundRectF.width() * f) - ((View) this.mDrawView).getWidth())) + f10) - f10);
        }
        if (f9 > 0.0f) {
            this.tempMatrixValue[5] = 0.0f;
        } else if (f9 < (-((this.mBackgroundRectF.height() * f7) - ((View) this.mDrawView).getHeight()))) {
            this.tempMatrixValue[5] = -((this.mBackgroundRectF.height() * this.tempMatrixValue[4]) - ((View) this.mDrawView).getHeight());
        } else if (this.mBackgroundRectF.height() * f7 == ((View) this.mDrawView).getHeight()) {
            this.tempMatrixValue[5] = 0.0f;
        } else {
            float f11 = 1;
            this.tempMatrixValue[5] = ((this.mBackgroundRectF.height() * this.tempMatrixValue[4]) - ((View) this.mDrawView).getHeight()) * (((f9 / ((this.mBackgroundRectF.height() * f7) - ((View) this.mDrawView).getHeight())) + f11) - f11);
        }
        matrix.setValues(this.tempMatrixValue);
        Log.i("DrawControl", "after -> " + matrix.toShortString());
        this.mCameraMatrix.set(matrix);
        this.mDrawView.updateImageView();
        this.mDrawView.updatePathView();
        this.mDrawView.updateTempPathView();
    }

    public final void handleEraser(@NotNull PointF currentPointF) {
        InterfaceC6469a interfaceC6469a;
        AbstractC5830k.m5330g(currentPointF, "currentPointF");
        PointF pointFMapPoint = GraphExtKt.mapPoint(this.mCameraMatrix, currentPointF);
        this.mTempPath.reset();
        this.mTempPath.addCircle(pointFMapPoint.x, pointFMapPoint.y, this.mBoardConfig.getEraserSize(), Path.Direction.CW);
        initEraserPaint(this.mTempPaint);
        Iterator<WritePath> it = this.mPathList.iterator();
        AbstractC5830k.m5329f(it, "iterator(...)");
        boolean z8 = false;
        while (it.hasNext()) {
            WritePath next = it.next();
            AbstractC5830k.m5329f(next, "next(...)");
            WritePath writePath = next;
            if (writePath.getRectF().contains(currentPointF.x, currentPointF.y) && checkPointFUnionPath(currentPointF, writePath.getPointList(), MatrixExtKt.invert(this.mCameraMatrix).mapRadius(this.mBoardConfig.getEraserSize()))) {
                it.remove();
                z8 = true;
            }
        }
        if (z8 && (interfaceC6469a = this.mActionListener) != null) {
            interfaceC6469a.invoke();
        }
        this.mDrawView.updatePathView();
        this.mDrawView.updateTempPathView();
    }

    public final void handleEraserEnd(@NotNull PointF currentPointF) {
        InterfaceC6469a interfaceC6469a;
        AbstractC5830k.m5330g(currentPointF, "currentPointF");
        this.mTempPath.reset();
        Iterator<WritePath> it = this.mPathList.iterator();
        AbstractC5830k.m5329f(it, "iterator(...)");
        boolean z8 = false;
        while (it.hasNext()) {
            WritePath next = it.next();
            AbstractC5830k.m5329f(next, "next(...)");
            WritePath writePath = next;
            if (writePath.getRectF().contains(currentPointF.x, currentPointF.y) && checkPointFUnionPath(currentPointF, writePath.getPointList(), MatrixExtKt.invert(this.mCameraMatrix).mapRadius(this.mBoardConfig.getEraserSize()))) {
                it.remove();
                z8 = true;
            }
        }
        if (z8 && (interfaceC6469a = this.mActionListener) != null) {
            interfaceC6469a.invoke();
        }
        this.mDrawView.updatePathView();
        this.mDrawView.updateTempPathView();
    }

    public final void handleWritePath(@NotNull Path path) {
        AbstractC5830k.m5330g(path, "path");
        this.tempPath.set(path);
        this.tempPath.transform(this.mCameraMatrix);
        this.mTempPath.set(this.tempPath);
        initPenPaint(this.mTempPaint);
        this.mDrawView.updateTempPathView();
    }

    public final void handleWritePathCancel() {
        this.mTempPath.reset();
        this.mDrawView.updateTempPathView();
    }

    public final void handleWritePathEnd(@NotNull Path path, @NotNull List<? extends PointF> pointFList) {
        AbstractC5830k.m5330g(path, "path");
        AbstractC5830k.m5330g(pointFList, "pointFList");
        this.mTempPath.reset();
        initPenPaint(this.mPathPaint);
        this.mPathList.add(buildWritePathData(pointFList, this.mPathPaint, path));
        InterfaceC6469a interfaceC6469a = this.mActionListener;
        if (interfaceC6469a != null) {
            interfaceC6469a.invoke();
        }
        this.mDrawView.updatePathView();
        this.mDrawView.updateTempPathView();
    }

    public final boolean isEmpty() {
        return this.mPathList.isEmpty() || this.mBackgroundBitmap == null;
    }

    public final void reset() {
        Object obj = this.mDrawView;
        AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type android.view.View");
        View view = (View) obj;
        this.mPathList.clear();
        this.mBackgroundBitmap = null;
        this.mBackgroundRectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        this.mBackgroundMatrix.reset();
        this.mCameraMatrix.reset();
        this.mDrawView.updateImageView();
        this.mDrawView.updatePathView();
    }

    public final void setImageBackground(@NotNull Bitmap bitmap) {
        Object objM13956constructorimpl;
        AbstractC5830k.m5330g(bitmap, "bitmap");
        try {
            objM13956constructorimpl = Result.m13956constructorimpl(Bitmap.createBitmap(bitmap));
        } catch (Throwable th) {
            objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
        }
        if (Result.m13961isFailureimpl(objM13956constructorimpl)) {
            objM13956constructorimpl = null;
        }
        Bitmap bitmap2 = (Bitmap) objM13956constructorimpl;
        if (bitmap2 != null) {
            this.mBackgroundBitmap = bitmap2;
            Object obj = this.mDrawView;
            AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type android.view.View");
            int width = ((View) obj).getWidth();
            if (width > 0) {
                float f = width;
                float width2 = f / bitmap2.getWidth();
                this.mBackgroundMatrix.setScale(width2, width2);
                this.mBackgroundRectF.set(0.0f, 0.0f, f, bitmap2.getHeight() * width2);
            }
        }
        this.mDrawView.updateImageView();
    }

    public final void setMBackgroundBitmap(@Nullable Bitmap bitmap) {
        this.mBackgroundBitmap = bitmap;
    }

    public final void setOnActionListener(@Nullable InterfaceC6469a listener) {
        this.mActionListener = listener;
    }

    public final void setPathList(@NotNull List<ProtoPath> pathList) {
        AbstractC5830k.m5330g(pathList, "pathList");
        this.mPathList.clear();
        ArrayList<WritePath> arrayList = this.mPathList;
        ArrayList arrayList2 = new ArrayList(AbstractC5806u.m5277p(pathList, 10));
        for (ProtoPath protoPath : pathList) {
            arrayList2.add(buildWritePathData$default(this, protoPath.getPointList(), protoPath.getPaint(), null, 4, null));
        }
        arrayList.addAll(arrayList2);
        this.mDrawView.updatePathView();
    }

    public final void setScale(float scale) throws Exception {
        if (scale < this.mBoardConfig.getMinScaleTime() || scale > this.mBoardConfig.getMaxScaleTime()) {
            throw new Exception("scale is not in range at config");
        }
        this.mCameraMatrix.getValues(this.tempMatrixValue);
        float[] fArr = this.tempMatrixValue;
        fArr[0] = scale;
        fArr[4] = scale;
        this.tempMatrix.setValues(fArr);
        handleCameraMatrix(this.tempMatrix);
    }

    public final void updateSize(int viewWidth, int viewHeight) {
        if (this.mBackgroundBitmap == null) {
            this.mBackgroundRectF.set(0.0f, 0.0f, viewWidth, viewHeight);
            return;
        }
        float f = viewWidth;
        float width = f / r0.getWidth();
        this.mBackgroundMatrix.setScale(width, width);
        this.mBackgroundRectF.set(0.0f, 0.0f, f, r0.getHeight() * width);
    }
}
