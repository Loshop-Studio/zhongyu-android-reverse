package com.zykj.paint.record.model;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.MotionEvent;
import com.google.protobuf.Any;
import com.zykj.paint.Actions;
import com.zykj.paint.SketchSyncView;
import com.zykj.paint.exchange.ActionType;
import com.zykj.paint.record.control.ISketchControl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/* loaded from: classes.dex */
public class MapSnapShot extends GraphSnapShot {
    private static final String TAG = "MapSnapShot";
    private ProgressDialog mProgressDialog;
    public Canvas mSketchCanvas;
    public Actions.EzyActionList.Builder localDisplayList = Actions.EzyActionList.newBuilder();
    public Matrix midSketchMatrix = new Matrix();
    private Matrix lastSketchMatrix = new Matrix();
    private Matrix lastInvertSketchMatrix = new Matrix();
    private int width = 1920;
    private int height = 1200;

    public MapSnapShot(SketchSyncView sketchSyncView) {
        this.sketchView = sketchSyncView;
        init();
    }

    private void init() {
        this.sketchMatrix.postConcat(this.midSketchMatrix);
        this.matrix.postConcat(this.midMatrix);
        updateSketchSnapshot(this.width, this.height, null, this.matrix);
    }

    public static int randomColor(int i9) {
        Random random = new Random();
        return Color.argb(Math.min(Math.max(1, i9), 255), random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }

    private void updateSketchSnapshot(int i9, int i10, ArrayList<ISketchControl> arrayList, Matrix matrix) {
        Canvas canvas = this.mCanvas;
        if (canvas == null) {
            this.bitmap = Bitmap.createBitmap(i9, i10, Bitmap.Config.ARGB_4444);
            this.mCanvas = new Canvas(this.bitmap);
        } else {
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        Canvas canvas2 = this.mSketchCanvas;
        if (canvas2 == null) {
            this.sketchBitmap = Bitmap.createBitmap(i9, i10, Bitmap.Config.ARGB_4444);
            this.mSketchCanvas = new Canvas(this.sketchBitmap);
        } else {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        Matrix matrix2 = new Matrix();
        matrix2.postConcat(this.sketchMatrix);
        float[] fArr = new float[9];
        matrix2.getValues(fArr);
        Log.i(TAG, "values--->>>" + Arrays.toString(fArr));
        Matrix matrix3 = new Matrix();
        matrix3.setValues(fArr);
        updateSketchWithLocalProtobufData(this.mSketchCanvas, this.snapShotPaint, matrix3);
        this.mCanvas.drawBitmap(this.sketchBitmap, 0.0f, 0.0f, (Paint) null);
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((PictureSnapShot) arrayList.get(i11).getGraphSnapShot()).updateMatrix(matrix);
            }
        }
    }

    public void addStickyEzyPath(Actions.NewPolylineData.Builder builder) {
        Actions.NewPolylineData.Builder builderNewBuilder = Actions.NewPolylineData.newBuilder();
        builderNewBuilder.setColor(builder.getColor());
        Matrix matrix = new Matrix();
        Matrix matrix2 = new Matrix();
        matrix2.postConcat(this.sketchMatrix);
        matrix2.postConcat(this.midMatrix);
        matrix2.invert(matrix);
        int pointsCount = builder.getPointsCount();
        for (int i9 = 0; i9 < pointsCount; i9++) {
            Actions.EzyPoint points = builder.getPoints(i9);
            matrix.mapPoints(new float[2], new float[]{(float) points.getX(), (float) points.getY()});
            Actions.EzyPoint.Builder builderNewBuilder2 = Actions.EzyPoint.newBuilder();
            builderNewBuilder2.setX(r7[0]).setY(r7[1]);
            builderNewBuilder.addPoints(builderNewBuilder2);
        }
        SketchSyncView sketchSyncView = this.sketchView;
        int i10 = (int) (sketchSyncView.mCurrentStartAt - sketchSyncView.mStartTime);
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.sketchView.mCurrentStartAt);
        Actions.EzyAction.Builder builderNewBuilder3 = Actions.EzyAction.newBuilder();
        builderNewBuilder3.setStartAt(i10);
        builderNewBuilder3.setDuration(iCurrentTimeMillis);
        builderNewBuilder3.setData(Any.pack(builderNewBuilder.build()));
        builderNewBuilder3.setGraphId(this.sketchView.graphId);
        builderNewBuilder3.setActionType(ActionType.PolylineNew);
        this.sketchView.addSketchAction(Any.pack(builder.build()), ActionType.PolylineNew);
        this.localDisplayList.addAction(builderNewBuilder3);
        tempDrawPath(this.mSketchCanvas, builder);
    }

    public void clear() {
        this.localDisplayList.clear();
        updateMatrix(null);
        this.sketchView.updateSnapshot();
    }

    @Override // com.zykj.paint.record.model.GraphSnapShot
    public void delByLines(MotionEvent motionEvent) {
        Log.e(TAG, "地图删除线段");
        Matrix matrix = new Matrix();
        Matrix matrix2 = new Matrix();
        matrix2.postConcat(this.sketchMatrix);
        matrix2.postConcat(this.midMatrix);
        matrix2.invert(matrix);
        float[] fArr = new float[2];
        matrix.mapPoints(fArr, new float[]{motionEvent.getX(), motionEvent.getY()});
        this.sketchView.delByLine(this.localDisplayList, fArr[0], fArr[1]);
        updateMatrix(null);
    }

    public float[] getBitmapPoints(Bitmap bitmap, Matrix matrix) {
        float[] fArr = new float[8];
        matrix.mapPoints(fArr, new float[]{0.0f, 0.0f, bitmap.getWidth(), 0.0f, 0.0f, bitmap.getHeight(), bitmap.getWidth(), bitmap.getHeight()});
        return fArr;
    }

    @Override // com.zykj.paint.record.model.GraphSnapShot
    public void setSelect(boolean z9) {
        super.setSelect(z9);
        updateMatrix(null);
    }

    public void tempDrawPath(Canvas canvas, Actions.NewPolylineData.Builder builder) {
        int pointsCount = builder.getPointsCount();
        Path path = new Path();
        path.reset();
        int i9 = 0;
        while (i9 < pointsCount - 1) {
            Actions.EzyPoint points = builder.getPoints(i9);
            int i10 = i9 + 1;
            Actions.EzyPoint points2 = builder.getPoints(i10);
            float x9 = (float) points.getX();
            float y9 = (float) points.getY();
            float x10 = (float) points2.getX();
            float y10 = (float) points2.getY();
            if (i9 == 0) {
                path.moveTo(x9, y9);
            }
            path.quadTo(x9, y9, (x10 + x9) / 2.0f, (y10 + y9) / 2.0f);
            i9 = i10;
        }
        canvas.drawPath(path, this.paint);
        updateMatrix(null);
    }

    public void updateMatrix(ArrayList<ISketchControl> arrayList) {
        Log.e(TAG, "[移动结束,更新地图]");
        Matrix matrix = new Matrix();
        matrix.postConcat(this.matrix);
        matrix.postConcat(this.midSketchMatrix);
        this.sketchMatrix.postConcat(matrix);
        updateSketchSnapshot(this.width, this.height, arrayList, this.matrix);
        Matrix matrix2 = new Matrix();
        this.matrix = matrix2;
        matrix2.postConcat(this.midMatrix);
    }

    public void updateSketchPicture(Bitmap bitmap) {
        this.sketchBitmap = bitmap;
        updateMatrix(null);
        Log.e(TAG, "updateSketchPicture-->");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x000a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateSketchWithLocalProtobufData(android.graphics.Canvas r13, android.graphics.Paint r14, android.graphics.Matrix r15) {
        /*
            r12 = this;
            com.zykj.paint.Actions$EzyActionList$Builder r0 = r12.localDisplayList
            java.util.List r0 = r0.getActionList()
            java.util.Iterator r1 = r0.iterator()
        La:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Ld5
            java.lang.Object r0 = r1.next()
            com.zykj.paint.Actions$EzyAction r0 = (com.zykj.paint.Actions.EzyAction) r0
            int r2 = r0.getActionType()
            int r3 = com.zykj.paint.exchange.ActionType.ImageDel
            if (r2 == r3) goto Lcb
            int r3 = com.zykj.paint.exchange.ActionType.LayerDel
            if (r2 == r3) goto Lcb
            int r3 = com.zykj.paint.exchange.ActionType.PolylineDel
            if (r2 == r3) goto Lcb
            int r3 = com.zykj.paint.exchange.ActionType.ImageHide
            if (r2 == r3) goto Lcb
            int r3 = com.zykj.paint.exchange.ActionType.LayerHide
            if (r2 == r3) goto Lcb
            int r3 = com.zykj.paint.exchange.ActionType.PolylineHide
            if (r2 != r3) goto L34
            goto Lcb
        L34:
            com.google.protobuf.Any r2 = r0.getData()
            java.lang.String r2 = r2.getTypeUrl()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto La
            java.lang.String r3 = "/"
            java.lang.String[] r2 = r2.split(r3)
            r3 = 1
            r2 = r2[r3]
            java.lang.String r3 = "NewPolylineData"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto La
            r2 = 0
            com.google.protobuf.Any r0 = r0.getData()     // Catch: com.google.protobuf.InvalidProtocolBufferException -> L7c
            java.lang.Class<com.zykj.paint.Actions$NewPolylineData> r3 = com.zykj.paint.Actions.NewPolylineData.class
            com.google.protobuf.Message r0 = r0.unpack(r3)     // Catch: com.google.protobuf.InvalidProtocolBufferException -> L7c
            r3 = r0
            com.zykj.paint.Actions$NewPolylineData r3 = (com.zykj.paint.Actions.NewPolylineData) r3     // Catch: com.google.protobuf.InvalidProtocolBufferException -> L7c
            com.zykj.paint.Actions$EzyColor r0 = r3.getColor()     // Catch: com.google.protobuf.InvalidProtocolBufferException -> L79
            int r2 = r0.getAlpha()     // Catch: com.google.protobuf.InvalidProtocolBufferException -> L79
            int r4 = r0.getRed()     // Catch: com.google.protobuf.InvalidProtocolBufferException -> L79
            int r5 = r0.getGreen()     // Catch: com.google.protobuf.InvalidProtocolBufferException -> L79
            int r0 = r0.getBlue()     // Catch: com.google.protobuf.InvalidProtocolBufferException -> L79
            r14.setARGB(r2, r4, r5, r0)     // Catch: com.google.protobuf.InvalidProtocolBufferException -> L79
            goto L81
        L79:
            r0 = move-exception
            r2 = r3
            goto L7d
        L7c:
            r0 = move-exception
        L7d:
            r0.printStackTrace()
            r3 = r2
        L81:
            int r0 = r3.getPointsCount()
            if (r0 > 0) goto L88
            goto La
        L88:
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r2.reset()
            r4 = 0
        L91:
            int r5 = r0 + (-1)
            if (r4 >= r5) goto Lc3
            com.zykj.paint.Actions$EzyPoint r5 = r3.getPoints(r4)
            int r6 = r4 + 1
            com.zykj.paint.Actions$EzyPoint r7 = r3.getPoints(r6)
            double r8 = r5.getX()
            float r8 = (float) r8
            double r9 = r5.getY()
            float r5 = (float) r9
            double r9 = r7.getX()
            float r9 = (float) r9
            double r10 = r7.getY()
            float r7 = (float) r10
            if (r4 != 0) goto Lb8
            r2.moveTo(r8, r5)
        Lb8:
            float r9 = r9 + r8
            r4 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r4
            float r7 = r7 + r5
            float r7 = r7 / r4
            r2.quadTo(r8, r5, r9, r7)
            r4 = r6
            goto L91
        Lc3:
            r2.transform(r15)
            r13.drawPath(r2, r14)
            goto La
        Lcb:
            java.lang.String r0 = "MapSnapShot"
            java.lang.String r2 = "读到删除的线段--"
            android.util.Log.e(r0, r2)
            goto La
        Ld5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.paint.record.model.MapSnapShot.updateSketchWithLocalProtobufData(android.graphics.Canvas, android.graphics.Paint, android.graphics.Matrix):void"); // DEX body: android/随身答/smali/com/zykj/paint/record/model/MapSnapShot.smali:1511
    }
}
