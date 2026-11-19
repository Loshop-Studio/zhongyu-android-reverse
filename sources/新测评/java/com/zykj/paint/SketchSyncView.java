package com.zykj.paint;

// RE note 本类字节码直接引用的读写或显示接口包括文件流。

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Toast;
import androidx.annotation.Nullable;
import com.google.protobuf.Any;
import com.google.protobuf.InvalidProtocolBufferException;
import com.zykj.paint.Actions;
import com.zykj.paint.exchange.ActionType;
import com.zykj.paint.record.control.DefaultControl;
import com.zykj.paint.record.control.ISketchControl;
import com.zykj.paint.record.control.MapControl;
import com.zykj.paint.record.control.PenControl;
import com.zykj.paint.record.control.PictureControl;
import com.zykj.paint.record.model.GraphSnapShot;
import com.zykj.paint.record.model.MapSnapShot;
import com.zykj.paint.record.model.PictureSnapShot;
import com.zykj.paint.util.LineUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class SketchSyncView extends View {
    public static final int ACTION_ERASER = 3;
    public static final int ACTION_MOVE_MAP = 4;
    public static final int ACTION_PEN = 2;
    public static final int ACTION_SELECT = 1;
    private static final int SPACE_TIME = 500;
    private static final String TAG = "SketchSyncView";
    public int actionMode;
    private Paint boardPaint;
    private Activity context;
    public Actions.EzyActionList.Builder ezyActionList;
    public int graphId;
    private int height;
    private ISketchControl iSketchControl;
    private boolean isCurrentSketchSticky;
    private boolean isInitSuccess;
    private boolean isMultiMode;
    private boolean isRecord;
    private boolean isTouchable;
    private int lastRenderIndex;
    private int lastSelectIndex;
    private Bitmap mBaseBitmap;
    private Canvas mBaseCanvas;
    private Bitmap mCoverBitmap;
    private Canvas mCoverCanvas;
    public long mCurrentStartAt;
    private int mDefaultSize;
    private Paint mPaint;
    public long mStartTime;
    private int mStrokeColor;
    private ISketchControl mapSketchControl;
    private MapSnapShot mapSnapShot;
    private ArrayList<ISketchControl> sketchControls;
    private PenControl tempPenControl;
    public Actions.NewPolylineData.Builder tempPolyline;
    public long timeRecord;
    private long touchDownTime;
    private int width;

    public SketchSyncView(Context context) {
        super(context);
        this.actionMode = 2;
        this.iSketchControl = null;
        this.mapSketchControl = null;
        this.mStrokeColor = -16711681;
        this.mDefaultSize = 3;
        this.isCurrentSketchSticky = false;
        this.lastSelectIndex = -1;
        this.lastRenderIndex = -1;
        this.ezyActionList = Actions.EzyActionList.newBuilder();
        this.graphId = 1;
        this.isTouchable = true;
        this.isRecord = false;
        init();
    }

    private Actions.EzyColor.Builder ezyColor(int i10) {
        int i11 = (i10 >> 16) & 255;
        int i12 = (i10 >> 8) & 255;
        Actions.EzyColor.Builder builderNewBuilder = Actions.EzyColor.newBuilder();
        builderNewBuilder.setAlpha((i10 >> 24) & 255).setRed(i11).setGreen(i12).setBlue(i10 & 255);
        return builderNewBuilder;
    }

    private void handleEvent(MotionEvent motionEvent) {
        ISketchControl iSketchControl;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            setSelectSketchControl(motionEvent);
            this.mCurrentStartAt = System.currentTimeMillis();
            int i10 = this.actionMode;
            if (i10 == 2) {
                this.tempPenControl.touchDown(motionEvent);
                Actions.NewPolylineData.Builder builderNewBuilder = Actions.NewPolylineData.newBuilder();
                this.tempPolyline = builderNewBuilder;
                builderNewBuilder.setColor(ezyColor(this.boardPaint.getColor()));
                addPenTempPolylinePoint(motionEvent);
            } else if (i10 == 3 && (iSketchControl = this.iSketchControl) != null && iSketchControl.getGraphSnapShot() != null) {
                this.iSketchControl.getGraphSnapShot().delByLines(motionEvent);
            }
            this.iSketchControl.touchDown(motionEvent);
            invalidate();
            return;
        }
        if (actionMasked == 1) {
            if (this.actionMode == 2) {
                this.tempPenControl.touchUp(motionEvent);
                addPenTempPolylinePoint(motionEvent);
                if (this.isCurrentSketchSticky) {
                    ((PictureSnapShot) this.iSketchControl.getGraphSnapShot()).addStickyEzyPath(this.tempPolyline);
                } else {
                    this.mapSnapShot.addStickyEzyPath(this.tempPolyline);
                }
            }
            this.tempPenControl.m_path.reset();
            this.isCurrentSketchSticky = false;
            this.iSketchControl.touchUp(motionEvent);
            Log.e(TAG, "[updateSelectMode actionMode]-->" + this.actionMode);
            invalidate();
            return;
        }
        if (actionMasked == 2) {
            int i11 = this.actionMode;
            if (i11 == 2) {
                setSelectSketchControl(motionEvent);
                this.tempPenControl.touchMove(motionEvent);
                addPenTempPolylinePoint(motionEvent);
            } else if (i11 == 3) {
                this.iSketchControl.getGraphSnapShot().delByLines(motionEvent);
            } else {
                this.iSketchControl.touchMove(motionEvent);
            }
            invalidate();
            return;
        }
        if (actionMasked != 5) {
            if (actionMasked != 6) {
                return;
            }
            this.isCurrentSketchSticky = false;
            this.iSketchControl.touchPointerUp(motionEvent);
            invalidate();
            return;
        }
        int i12 = this.actionMode;
        if (i12 == 2 || i12 == 3) {
            this.iSketchControl = this.mapSketchControl;
        } else {
            setSelectSketchControl(motionEvent);
        }
        this.iSketchControl.touchPointerDown(motionEvent);
        invalidate();
    }

    private void handleMultiFingerEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            setSelectSketchControl(motionEvent);
            this.mCurrentStartAt = System.currentTimeMillis();
            this.iSketchControl.touchDown(motionEvent);
            invalidate();
            return;
        }
        if (actionMasked == 1) {
            this.isCurrentSketchSticky = false;
            this.iSketchControl.touchUp(motionEvent);
            invalidate();
            return;
        }
        if (actionMasked == 2) {
            this.iSketchControl.touchMove(motionEvent);
            invalidate();
            return;
        }
        if (actionMasked != 5) {
            if (actionMasked != 6) {
                return;
            }
            this.isCurrentSketchSticky = false;
            this.iSketchControl.touchPointerUp(motionEvent);
            invalidate();
            return;
        }
        if (this.actionMode == 1) {
            setSelectSketchControl(motionEvent);
        } else {
            this.iSketchControl = this.mapSketchControl;
        }
        this.iSketchControl.touchPointerDown(motionEvent);
        invalidate();
    }

    private void init() {
        setDrawingCacheEnabled(true);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.zykj.paint.SketchSyncView.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                SketchSyncView.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                SketchSyncView sketchSyncView = SketchSyncView.this;
                sketchSyncView.width = sketchSyncView.getWidth();
                SketchSyncView sketchSyncView2 = SketchSyncView.this;
                sketchSyncView2.height = sketchSyncView2.getHeight();
                Log.e(SketchSyncView.TAG, "width=" + SketchSyncView.this.width + ",height=" + SketchSyncView.this.height);
                SketchSyncView sketchSyncView3 = SketchSyncView.this;
                int i10 = sketchSyncView3.width;
                int i11 = SketchSyncView.this.height;
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                sketchSyncView3.mCoverBitmap = Bitmap.createBitmap(i10, i11, config);
                SketchSyncView sketchSyncView4 = SketchSyncView.this;
                sketchSyncView4.mBaseBitmap = Bitmap.createBitmap(sketchSyncView4.width, SketchSyncView.this.height, config);
                SketchSyncView.this.mCoverCanvas = new Canvas(SketchSyncView.this.mCoverBitmap);
                SketchSyncView.this.mBaseCanvas = new Canvas(SketchSyncView.this.mBaseBitmap);
                SketchSyncView.this.isInitSuccess = true;
            }
        });
        Paint paint = new Paint(1);
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mPaint.setFilterBitmap(true);
        Paint paint2 = new Paint();
        this.boardPaint = paint2;
        paint2.setAntiAlias(true);
        this.boardPaint.setDither(true);
        this.boardPaint.setColor(Color.parseColor("#3399FF"));
        this.boardPaint.setStyle(Paint.Style.STROKE);
        this.boardPaint.setStrokeJoin(Paint.Join.ROUND);
        this.boardPaint.setStrokeCap(Paint.Cap.ROUND);
        this.boardPaint.setStrokeWidth(3.0f);
        this.sketchControls = new ArrayList<>();
        this.tempPenControl = new PenControl(this.mDefaultSize, this.mStrokeColor);
        MapSnapShot mapSnapShot = new MapSnapShot(this);
        this.mapSnapShot = mapSnapShot;
        MapControl mapControl = new MapControl(mapSnapShot, this.sketchControls);
        this.mapSketchControl = mapControl;
        this.iSketchControl = mapControl;
    }

    public void addAction(Actions.EzyAction.Builder builder) {
        this.ezyActionList.addAction(builder);
        this.graphId++;
    }

    public void addMatrixAction(Actions.EzyAction.Builder builder) {
        builder.setStartAt((int) (this.isRecord ? System.currentTimeMillis() - this.mStartTime : this.timeRecord));
        builder.setActionType(ActionType.ImageMove);
        this.ezyActionList.addAction(builder);
    }

    public void addPenTempPolylinePoint(MotionEvent motionEvent) {
        Actions.EzyPoint.Builder builderNewBuilder = Actions.EzyPoint.newBuilder();
        builderNewBuilder.setX(motionEvent.getX()).setY(motionEvent.getY());
        this.tempPolyline.addPoints(builderNewBuilder);
    }

    public void addSketchAction(Any any, int i10) {
        int i11;
        int iCurrentTimeMillis;
        Actions.EzyAction.Builder builderNewBuilder = Actions.EzyAction.newBuilder();
        if (this.isRecord) {
            i11 = (int) (this.mCurrentStartAt - this.mStartTime);
            iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.mCurrentStartAt);
        } else {
            i11 = (int) this.timeRecord;
            iCurrentTimeMillis = 0;
        }
        builderNewBuilder.setStartAt(i11);
        builderNewBuilder.setDuration(iCurrentTimeMillis);
        builderNewBuilder.setData(any);
        builderNewBuilder.setGraphId(this.graphId);
        builderNewBuilder.setActionType(i10);
        this.ezyActionList.addAction(builderNewBuilder);
        this.graphId++;
    }

    public void addSketchImage(Bitmap bitmap, String str) {
        if (this.sketchControls.size() >= 5) {
            Toast.makeText(this.context, "Add a maximum of 5 images", 0).show();
            return;
        }
        this.mCurrentStartAt = System.currentTimeMillis();
        PictureSnapShot pictureSnapShot = new PictureSnapShot(this, this.graphId, bitmap, this.mapSnapShot);
        PictureControl pictureControl = new PictureControl(pictureSnapShot, this.mapSnapShot.sketchMatrix);
        this.iSketchControl = pictureControl;
        this.sketchControls.add(pictureControl);
        if (this.sketchControls.size() > 0) {
            int size = this.sketchControls.size() - 1;
            updateSelectedStatus(size, pictureSnapShot);
            this.lastSelectIndex = size;
        }
        if (this.isInitSuccess) {
            updateSnapshot();
        }
        Actions.NewImageData.Builder builderNewBuilder = Actions.NewImageData.newBuilder();
        builderNewBuilder.setSrc(str);
        builderNewBuilder.setSize(Actions.EzySize.newBuilder().setWidth(bitmap.getWidth()).setHeight(bitmap.getHeight()).build());
        addSketchAction(Any.pack(builderNewBuilder.build()), ActionType.ImageNew);
    }

    public void clear() {
        this.lastSelectIndex = -1;
        this.sketchControls.clear();
        this.mapSnapShot.clear();
        postInvalidate();
    }

    public void clearCanvas(Canvas canvas) {
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
    }

    public Actions.EzyAction createLayer(int i10) {
        Actions.NewLayerData.Builder builderNewBuilder = Actions.NewLayerData.newBuilder();
        Actions.EzyColor.Builder builderNewBuilder2 = Actions.EzyColor.newBuilder();
        builderNewBuilder2.setRed(255);
        builderNewBuilder2.setGreen(255);
        builderNewBuilder2.setBlue(255);
        builderNewBuilder2.setAlpha(255);
        builderNewBuilder.setColor(builderNewBuilder2.build());
        Actions.EzyAction.Builder builderNewBuilder3 = Actions.EzyAction.newBuilder();
        builderNewBuilder3.setGraphId(this.graphId);
        builderNewBuilder3.setStartAt(i10);
        builderNewBuilder3.setActionType(ActionType.LayerNew);
        builderNewBuilder3.setData(Any.pack(builderNewBuilder.build()));
        Log.e(TAG, "增加图层，id是->" + this.graphId);
        this.graphId = this.graphId + 1;
        return builderNewBuilder3.build();
    }

    public void delByLine(Actions.EzyActionList.Builder builder, float f10, float f11) {
        try {
            List<Actions.EzyAction> actionList = builder.getActionList();
            for (int i10 = 0; i10 < actionList.size(); i10++) {
                Actions.EzyAction ezyAction = actionList.get(i10);
                String typeUrl = ezyAction.getData().getTypeUrl();
                if (!TextUtils.isEmpty(typeUrl) && typeUrl.split("/")[1].equals("NewPolylineData")) {
                    Actions.NewPolylineData newPolylineData = (Actions.NewPolylineData) ezyAction.getData().unpack(Actions.NewPolylineData.class);
                    if (newPolylineData.getPointsCount() > 0 && LineUtils.point2Polyline(newPolylineData, f10, f11) < 50.0d) {
                        Actions.EzyAction.Builder builderNewBuilder = Actions.EzyAction.newBuilder();
                        builderNewBuilder.setStartAt((int) (this.isRecord ? System.currentTimeMillis() - this.mStartTime : this.timeRecord));
                        builderNewBuilder.setActionType(ActionType.PolylineDel);
                        builderNewBuilder.setGraphId(actionList.get(i10).getGraphId());
                        Log.e(TAG, "删掉的 id 是------>>>>>>>" + actionList.get(i10).getGraphId());
                        this.ezyActionList.addAction(builderNewBuilder.build());
                        builder.removeAction(i10);
                    }
                }
            }
            postInvalidate();
        } catch (InvalidProtocolBufferException e10) {
            e10.printStackTrace();
        }
    }

    public void erase() {
        clear();
        Actions.EzyAction.Builder builderNewBuilder = Actions.EzyAction.newBuilder();
        builderNewBuilder.setStartAt((int) (this.isRecord ? System.currentTimeMillis() - this.mStartTime : this.timeRecord));
        builderNewBuilder.setActionType(ActionType.ClearMap);
        this.ezyActionList.addAction(builderNewBuilder.build());
        System.gc();
        invalidate();
    }

    public long getTimeRecord() {
        return !this.isRecord ? this.timeRecord : System.currentTimeMillis() - this.mStartTime;
    }

    public Context getViewContext() {
        return this.context;
    }

    public void initRecord() {
        this.ezyActionList.clear();
        this.ezyActionList.addAction(createLayer(0));
    }

    public boolean isTouchable() {
        return this.isTouchable;
    }

    public void onDestroy() {
        try {
            int size = this.sketchControls.size();
            for (int i10 = 1; i10 < size; i10++) {
                this.sketchControls.get(i10).getGraphSnapShot().release();
            }
            this.mapSnapShot.release();
            Bitmap bitmap = this.mCoverBitmap;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.mCoverBitmap.recycle();
                this.mCoverBitmap = null;
            }
            Bitmap bitmap2 = this.mBaseBitmap;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                this.mBaseBitmap.recycle();
                this.mBaseBitmap = null;
            }
            System.gc();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        GraphSnapShot graphSnapShot;
        super.onDraw(canvas);
        MapSnapShot mapSnapShot = this.mapSnapShot;
        canvas.drawBitmap(mapSnapShot.bitmap, mapSnapShot.matrix, null);
        canvas.drawBitmap(this.mBaseBitmap, this.mapSnapShot.matrix, null);
        int i10 = this.lastSelectIndex;
        if (i10 != -1 && (graphSnapShot = this.sketchControls.get(i10).getGraphSnapShot()) != null) {
            if (this.iSketchControl instanceof MapControl) {
                canvas.drawBitmap(graphSnapShot.bitmap, this.mapSnapShot.matrix, this.mPaint);
            } else {
                canvas.drawBitmap(graphSnapShot.bitmap, graphSnapShot.matrix, this.mPaint);
            }
        }
        canvas.drawBitmap(this.mCoverBitmap, this.mapSnapShot.matrix, null);
        this.tempPenControl.draw(canvas, this.boardPaint);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int toolType = motionEvent.getToolType(0);
        if (toolType == 1) {
            if (motionEvent.getActionMasked() == 0) {
                this.touchDownTime = System.currentTimeMillis();
            } else if (motionEvent.getActionMasked() == 5 && System.currentTimeMillis() - this.touchDownTime < 500) {
                this.isMultiMode = true;
            }
            if (this.isTouchable && !this.isMultiMode) {
                handleEvent(motionEvent);
            } else if (this.actionMode == 1) {
                handleMultiFingerEvent(motionEvent);
            }
            if (motionEvent.getActionMasked() == 1) {
                this.isMultiMode = false;
                if (this.iSketchControl instanceof MapControl) {
                    this.iSketchControl = new DefaultControl();
                }
            }
        } else if (toolType == 2) {
            handleEvent(motionEvent);
        }
        return true;
    }

    public void pauseRecord() {
        this.isRecord = false;
        this.timeRecord = System.currentTimeMillis() - this.mStartTime;
    }

    public void reRecord(long j10) {
        this.ezyActionList.clear();
        clearCanvas(this.mBaseCanvas);
        clear();
        this.mStartTime = j10;
        this.timeRecord = 0L;
        this.ezyActionList.addAction(createLayer(0));
    }

    public void resumeRecord() {
        this.isRecord = true;
        this.mStartTime = System.currentTimeMillis() - this.timeRecord;
    }

    public void saveRecord(String str) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    Log.e(TAG, "filePath-->" + str);
                    File file = new File(str);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    File file2 = new File(str, "actions.bin");
                    if (file2.exists()) {
                        file2.delete();
                        Log.e(TAG, "文件存在,删除");
                    } else {
                        file2.createNewFile();
                        Log.e(TAG, "文件不存在,创建");
                    }
                    Actions.EzyAction.Builder builderNewBuilder = Actions.EzyAction.newBuilder();
                    builderNewBuilder.setGraphId(this.graphId);
                    builderNewBuilder.setStartAt((int) (this.isRecord ? System.currentTimeMillis() - this.mStartTime : this.timeRecord));
                    builderNewBuilder.setActionType(ActionType.LayerSel);
                    this.ezyActionList.addAction(builderNewBuilder.build());
                    fileOutputStream = new FileOutputStream(file2);
                } catch (IOException unused) {
                    return;
                }
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(this.ezyActionList.build().toByteArray());
            Log.e(TAG, "保存的长度===>>>>>" + this.ezyActionList.getActionList().size());
            fileOutputStream.close();
        } catch (Exception e11) {
            fileOutputStream2 = fileOutputStream;
            e = e11;
            e.printStackTrace();
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
        } catch (Throwable th2) {
            fileOutputStream2 = fileOutputStream;
            th = th2;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public void setActionMode(int i10) {
        this.actionMode = i10;
        if (i10 == 4) {
            this.iSketchControl = this.mapSketchControl;
        } else {
            this.iSketchControl = new DefaultControl();
        }
        postInvalidate();
    }

    public void setContext(Activity activity) {
        this.context = activity;
    }

    public void setPaint(int i10) {
        Log.e(TAG, "setPaint--->>>" + i10);
        this.boardPaint.setColor(i10);
        this.mapSnapShot.paint.setColor(i10);
    }

    public void setSelectSketchControl(MotionEvent motionEvent) {
        int i10;
        if (this.isCurrentSketchSticky) {
            return;
        }
        int size = this.sketchControls.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            ISketchControl iSketchControl = this.sketchControls.get(size);
            GraphSnapShot graphSnapShot = iSketchControl.getGraphSnapShot();
            if (graphSnapShot.isInGraphRect(graphSnapShot.sketchBitmap, graphSnapShot.sketchMatrix, motionEvent.getX(), motionEvent.getY())) {
                this.iSketchControl = iSketchControl;
                updateSelectedStatus(size, graphSnapShot);
                this.lastSelectIndex = size;
                this.isCurrentSketchSticky = true;
                Log.e(TAG, "选中Picture [index=" + size + "]");
                break;
            }
            size--;
        }
        if (!this.isCurrentSketchSticky && ((i10 = this.actionMode) == 1 || i10 == 3)) {
            this.iSketchControl = this.mapSketchControl;
            Log.e(TAG, "选中Map [绘图控制权交给地图]");
        }
        if (this.iSketchControl instanceof PictureControl) {
            updateSnapshot();
        }
    }

    public void setTouchable(boolean z9) {
        this.isTouchable = z9;
    }

    public void updateSelectedStatus(int i10, GraphSnapShot graphSnapShot) {
        int i11 = this.lastSelectIndex;
        if (i10 == i11) {
            return;
        }
        if (i11 != -1) {
            this.sketchControls.get(i11).getGraphSnapShot().setSelect(false);
        }
        graphSnapShot.setSelect(true);
    }

    public void updateSnapshot() {
        if ((this.iSketchControl instanceof PictureControl) && this.lastRenderIndex == this.lastSelectIndex) {
            return;
        }
        int size = this.sketchControls.size();
        Log.e(TAG, "updateSnapshot---->>>>>[lastSelectIndex=" + this.lastSelectIndex + "][size=" + size + "]");
        this.mBaseCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
        for (int i10 = 0; i10 < this.lastSelectIndex; i10++) {
            Log.i(TAG, "[画原始图]---->>>>>mBaseCanvas");
            this.mBaseCanvas.drawBitmap(this.sketchControls.get(i10).getGraphSnapShot().bitmap, 0.0f, 0.0f, (Paint) null);
        }
        this.mCoverCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
        int i11 = this.lastSelectIndex;
        while (true) {
            i11++;
            if (i11 >= size) {
                this.lastRenderIndex = this.lastSelectIndex;
                postInvalidate();
                return;
            } else {
                Log.i(TAG, "[画原始图]---->>>>>mCoverCanvas");
                this.mCoverCanvas.drawBitmap(this.sketchControls.get(i11).getGraphSnapShot().bitmap, 0.0f, 0.0f, (Paint) null);
            }
        }
    }

    public SketchSyncView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.actionMode = 2;
        this.iSketchControl = null;
        this.mapSketchControl = null;
        this.mStrokeColor = -16711681;
        this.mDefaultSize = 3;
        this.isCurrentSketchSticky = false;
        this.lastSelectIndex = -1;
        this.lastRenderIndex = -1;
        this.ezyActionList = Actions.EzyActionList.newBuilder();
        this.graphId = 1;
        this.isTouchable = true;
        this.isRecord = false;
        init();
    }

    public SketchSyncView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.actionMode = 2;
        this.iSketchControl = null;
        this.mapSketchControl = null;
        this.mStrokeColor = -16711681;
        this.mDefaultSize = 3;
        this.isCurrentSketchSticky = false;
        this.lastSelectIndex = -1;
        this.lastRenderIndex = -1;
        this.ezyActionList = Actions.EzyActionList.newBuilder();
        this.graphId = 1;
        this.isTouchable = true;
        this.isRecord = false;
        init();
    }
}
