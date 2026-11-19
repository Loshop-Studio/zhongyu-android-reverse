package com.zykj.paint.render;

// RE note 本类字节码直接引用的读写或显示接口包括位图。

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.zykj.paint.Actions;
import com.zykj.paint.graphic.Map;
import com.zykj.paint.player.PlayStatusListener;
import com.zykj.paint.runner.ActionProcessor;
import java.io.IOException;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p009a8.RunnableC0023a;

/* loaded from: classes3.dex */
public class SketchViewer extends SurfaceView implements SurfaceHolder.Callback {
    private static final long DELAY_TIME = 500;
    private static final long FRAME_TIME = 40;
    private static final String TAG = "SketchViewer";
    private ActionProcessor actionProcessor;
    private boolean isBackgroudPlaced;
    private boolean isRend;
    private List<Actions.EzyAction> mActionList;
    private Canvas mCanvas;
    private Bitmap mCaptureBitmap;
    private int mCurrentIndex;
    private SurfaceHolder mHolder;
    private boolean mIsDrawing;
    private boolean mIsRunning;
    private long mStartTime;
    public Map map;
    private MapRender mapRender;
    private long maxProgress;
    private MediaPlayer mediaPlayer;
    private PlayStatusListener playStatusListener;
    private ProgressTask progressTask;
    private RenderActionRunnable renderActionRunnable;
    private ScheduledExecutorService scheduledExecutorService;
    private ScheduledFuture<?> scheduledFuture;
    private String sourceUrl;
    private long timeRecord;
    private Timer timer;
    private List<Actions.EzyAction> toRenderActionList;

    public class CheckActionRunnable implements Runnable {
        public CheckActionRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SketchViewer.this.mIsRunning) {
                if (SketchViewer.this.mActionList.size() <= SketchViewer.this.mCurrentIndex) {
                    SketchViewer.this.post(new Runnable() { // from class: com.zykj.paint.render.SketchViewer.CheckActionRunnable.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (SketchViewer.this.scheduledFuture != null && SketchViewer.this.scheduledFuture.isDone()) {
                                SketchViewer.this.playStatusListener.onPlayEnd();
                            }
                            SketchViewer.this.playStatusListener.onUpdate(SketchViewer.this.maxProgress);
                        }
                    });
                    return;
                }
                Actions.EzyAction ezyAction = (Actions.EzyAction) SketchViewer.this.mActionList.get(SketchViewer.this.mCurrentIndex);
                int startAt = ezyAction.getStartAt();
                SketchViewer.this.timeRecord = System.currentTimeMillis() - SketchViewer.this.mStartTime;
                if (SketchViewer.this.timeRecord >= startAt) {
                    Log.i(SketchViewer.TAG, "timeRecord=[" + SketchViewer.this.timeRecord + "]---->>>>>读取第[" + SketchViewer.this.mCurrentIndex + "]条指令");
                    SketchViewer.access$208(SketchViewer.this);
                    SketchViewer sketchViewer = SketchViewer.this;
                    sketchViewer.scheduledFuture = sketchViewer.actionProcessor.addMultiAction(ezyAction);
                }
            }
        }
    }

    public class ProgressTask extends TimerTask {
        public ProgressTask() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (SketchViewer.this.mIsRunning) {
                SketchViewer.this.post(new Runnable() { // from class: com.zykj.paint.render.SketchViewer.ProgressTask.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (SketchViewer.this.playStatusListener != null) {
                            SketchViewer.this.playStatusListener.onUpdate(SketchViewer.this.timeRecord);
                        }
                    }
                });
            }
        }
    }

    public class RenderActionRunnable implements Runnable {
        public RenderActionRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SketchViewer.this.mIsRunning) {
                int size = SketchViewer.this.mActionList.size();
                if (size <= SketchViewer.this.mCurrentIndex) {
                    SketchViewer.this.post(new Runnable() { // from class: com.zykj.paint.render.SketchViewer.RenderActionRunnable.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (SketchViewer.this.scheduledFuture != null && SketchViewer.this.scheduledFuture.isDone() && SketchViewer.this.playStatusListener != null) {
                                SketchViewer.this.playStatusListener.onPlayEnd();
                            }
                            if (SketchViewer.this.playStatusListener != null) {
                                SketchViewer.this.playStatusListener.onUpdate(SketchViewer.this.maxProgress);
                            }
                        }
                    });
                    return;
                }
                SketchViewer.this.timeRecord = System.currentTimeMillis() - SketchViewer.this.mStartTime;
                int i = SketchViewer.this.mCurrentIndex;
                for (int i8 = SketchViewer.this.mCurrentIndex; i8 < size; i8++) {
                    if (SketchViewer.this.timeRecord >= ((Actions.EzyAction) SketchViewer.this.mActionList.get(i8)).getStartAt()) {
                        Log.i(SketchViewer.TAG, "timeRecord=[" + SketchViewer.this.timeRecord + "]---->>>>>读取第[" + SketchViewer.this.mCurrentIndex + "]条指令");
                        SketchViewer.access$208(SketchViewer.this);
                    }
                }
                if (SketchViewer.this.mCurrentIndex > i) {
                    Log.i(SketchViewer.TAG, "---->>>>>本次共读取[" + (SketchViewer.this.mCurrentIndex - i) + "]条指令");
                    SketchViewer.this.actionProcessor.renderAction(SketchViewer.this.mActionList.subList(i, SketchViewer.this.mCurrentIndex));
                    SketchViewer sketchViewer = SketchViewer.this;
                    sketchViewer.scheduledFuture = sketchViewer.scheduledExecutorService.schedule(this, 0L, TimeUnit.MILLISECONDS);
                } else {
                    SketchViewer sketchViewer2 = SketchViewer.this;
                    sketchViewer2.scheduledFuture = sketchViewer2.scheduledExecutorService.schedule(this, 40L, TimeUnit.MILLISECONDS);
                }
                if (SketchViewer.this.playStatusListener != null) {
                    SketchViewer.this.playStatusListener.onUpdate(SketchViewer.this.timeRecord);
                }
            }
        }
    }

    public SketchViewer(Context context) {
        super(context);
        this.isRend = true;
        this.playStatusListener = new PlayStatusListener() { // from class: com.zykj.paint.render.SketchViewer.3
            @Override // com.zykj.paint.player.PlayStatusListener
            public void onPlayEnd() {
            }

            @Override // com.zykj.paint.player.PlayStatusListener
            public void onPlayPause() {
            }

            @Override // com.zykj.paint.player.PlayStatusListener
            public void onPlayStart() {
            }

            @Override // com.zykj.paint.player.PlayStatusListener
            public void onUpdate(long j7) {
            }
        };
        init();
    }

    public static /* synthetic */ int access$208(SketchViewer sketchViewer) {
        int i = sketchViewer.mCurrentIndex;
        sketchViewer.mCurrentIndex = i + 1;
        return i;
    }

    private Matrix getScaleMatrix(int i, int i8, int i9, int i10) {
        float f = i;
        float f7 = i9;
        float f8 = (f * 1.0f) / f7;
        float f9 = i8;
        float f10 = i10;
        float f11 = (1.0f * f9) / f10;
        if (f8 > f11) {
            f8 = f11;
        }
        float f12 = f7 / 2.0f;
        float f13 = f10 / 2.0f;
        Matrix matrix = new Matrix();
        matrix.setScale(f8, f8, f12, f13);
        matrix.postTranslate((f / 2.0f) - f12, (f9 / 2.0f) - f13);
        return matrix;
    }

    private int getTotalTime(List<Actions.EzyAction> list) {
        Actions.EzyAction ezyAction = list.get(list.size() - 1);
        return ezyAction.getDuration() + ezyAction.getStartAt();
    }

    private void init() {
        SurfaceHolder holder = getHolder();
        this.mHolder = holder;
        holder.addCallback(this);
    }

    private void playMusic() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        if (this.mediaPlayer == null) {
            this.mediaPlayer = new MediaPlayer();
        }
        this.mediaPlayer.stop();
        try {
            this.mediaPlayer.reset();
            this.mediaPlayer.setDataSource(this.sourceUrl + "/track.wav");
            this.mediaPlayer.prepareAsync();
            this.mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.zykj.paint.render.SketchViewer.2
                @Override // android.media.MediaPlayer.OnPreparedListener
                public void onPrepared(MediaPlayer mediaPlayer) throws IllegalStateException {
                    SketchViewer.this.mediaPlayer.start();
                    SketchViewer.this.mediaPlayer.setVolume(1.0f, 1.0f);
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderTemp() {
        Canvas canvasLockCanvas = this.mHolder.lockCanvas();
        this.mCanvas = canvasLockCanvas;
        if (canvasLockCanvas != null) {
            try {
                try {
                    canvasLockCanvas.drawColor(-1);
                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(this.sourceUrl + "/thumbnail.jpg");
                    this.mCanvas.drawBitmap(bitmapDecodeFile, getScaleMatrix(getWidth(), getHeight(), bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight()), null);
                    bitmapDecodeFile.recycle();
                    Canvas canvas = this.mCanvas;
                    if (canvas != null) {
                        this.mHolder.unlockCanvasAndPost(canvas);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Canvas canvas2 = this.mCanvas;
                    if (canvas2 != null) {
                        this.mHolder.unlockCanvasAndPost(canvas2);
                    }
                }
            } catch (Throwable th) {
                Canvas canvas3 = this.mCanvas;
                if (canvas3 != null) {
                    this.mHolder.unlockCanvasAndPost(canvas3);
                }
                throw th;
            }
        }
    }

    public Bitmap getCapture() {
        Log.e(TAG, "[获取截图]---->>>>getCapture()");
        this.mCaptureBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.mCaptureBitmap);
        canvas.drawColor(-1);
        this.map.directRender(this.mapRender, canvas);
        return this.mCaptureBitmap;
    }

    public boolean isEnded(int i) {
        return ((long) i) == this.maxProgress;
    }

    public void isRend(boolean z8) {
        this.isRend = z8;
    }

    public void pause() {
        this.mIsRunning = false;
        this.mIsDrawing = false;
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
        this.playStatusListener.onPlayPause();
    }

    public void play() {
        this.mIsRunning = true;
        this.mIsDrawing = true;
        this.mCurrentIndex = 0;
        this.timeRecord = 0L;
        Map map = this.map;
        if (map != null) {
            map.reset();
        }
        this.mStartTime = System.currentTimeMillis();
        this.scheduledFuture = this.scheduledExecutorService.schedule(this.renderActionRunnable, 0L, TimeUnit.MILLISECONDS);
        playMusic();
        this.playStatusListener.onPlayStart();
    }

    public void release() {
        ScheduledExecutorService scheduledExecutorService = this.scheduledExecutorService;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        ProgressTask progressTask = this.progressTask;
        if (progressTask != null) {
            progressTask.cancel();
            this.progressTask = null;
        }
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
            this.timer = null;
        }
        ActionProcessor actionProcessor = this.actionProcessor;
        if (actionProcessor != null) {
            actionProcessor.destroy();
        }
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                this.mediaPlayer.stop();
            }
            this.mediaPlayer.release();
            this.mediaPlayer = null;
        }
    }

    public void renderAll() {
        if (this.mIsDrawing || !this.isRend) {
            Canvas canvasLockCanvas = this.mHolder.lockCanvas();
            this.mCanvas = canvasLockCanvas;
            if (canvasLockCanvas != null) {
                try {
                    try {
                        canvasLockCanvas.drawColor(-1);
                        this.map.directRender(this.mapRender, this.mCanvas);
                        Canvas canvas = this.mCanvas;
                        if (canvas != null) {
                            this.mHolder.unlockCanvasAndPost(canvas);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        Canvas canvas2 = this.mCanvas;
                        if (canvas2 != null) {
                            this.mHolder.unlockCanvasAndPost(canvas2);
                        }
                    }
                } catch (Throwable th) {
                    Canvas canvas3 = this.mCanvas;
                    if (canvas3 != null) {
                        this.mHolder.unlockCanvasAndPost(canvas3);
                    }
                    throw th;
                }
            }
        }
    }

    public void renderHistory() {
        Log.e(TAG, "[渲染拖动的画面] mCurrentIndex=" + this.mCurrentIndex);
        this.map.reset();
        this.actionProcessor.renderHistory(this.mActionList.subList(0, this.mCurrentIndex + 1));
    }

    public void renderHistorySnapshot() {
        Canvas canvasLockCanvas = this.mHolder.lockCanvas();
        this.mCanvas = canvasLockCanvas;
        if (canvasLockCanvas != null) {
            try {
                try {
                    canvasLockCanvas.drawColor(-1);
                    this.map.directRender(this.mapRender, this.mCanvas);
                    Canvas canvas = this.mCanvas;
                    if (canvas != null) {
                        this.mHolder.unlockCanvasAndPost(canvas);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Canvas canvas2 = this.mCanvas;
                    if (canvas2 != null) {
                        this.mHolder.unlockCanvasAndPost(canvas2);
                    }
                }
            } catch (Throwable th) {
                Canvas canvas3 = this.mCanvas;
                if (canvas3 != null) {
                    this.mHolder.unlockCanvasAndPost(canvas3);
                }
                throw th;
            }
        }
    }

    public void reset() {
        this.mCurrentIndex = 0;
        this.timeRecord = 0L;
    }

    public void resume() {
        this.mIsRunning = true;
        this.mIsDrawing = true;
        this.map.reset();
        this.mStartTime = System.currentTimeMillis() - this.timeRecord;
        this.actionProcessor.renderHistory(this.mActionList.subList(0, this.mCurrentIndex));
        this.scheduledFuture = this.scheduledExecutorService.schedule(this.renderActionRunnable, 0L, TimeUnit.MILLISECONDS);
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
        this.playStatusListener.onPlayStart();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|2|(2:4|(2:6|7))|8|(3:11|(1:19)(11:36|15|(1:17)(1:18)|20|(1:22)|23|32|24|(1:26)|30|31)|9)|34|20|(0)|23|32|24|(0)|30|31) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bf, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c0, code lost:
    
        r9.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094 A[Catch: IOException -> 0x00bf, TRY_LEAVE, TryCatch #0 {IOException -> 0x00bf, blocks: (B:24:0x0078, B:26:0x0094), top: B:32:0x0078 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long seekToCurrentIndex(int r9) {
        /*
            r8 = this;
            java.lang.String r0 = "/track.wav"
            long r1 = (long) r9
            long r3 = r8.maxProgress
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 != 0) goto L1f
            com.zykj.paint.runner.ActionProcessor r3 = r8.actionProcessor
            java.util.List<com.zykj.paint.Actions$EzyAction> r4 = r8.mActionList
            r3.renderHistory(r4)
            com.zykj.paint.player.PlayStatusListener r3 = r8.playStatusListener
            if (r3 == 0) goto L1f
            r3.onPlayEnd()
            com.zykj.paint.player.PlayStatusListener r9 = r8.playStatusListener
            long r3 = r8.maxProgress
            r9.onUpdate(r3)
            return r1
        L1f:
            java.util.List<com.zykj.paint.Actions$EzyAction> r3 = r8.mActionList
            int r3 = r3.size()
            r4 = 0
        L26:
            int r5 = r3 + (-1)
            if (r4 >= r5) goto L68
            java.util.List<com.zykj.paint.Actions$EzyAction> r5 = r8.mActionList
            java.lang.Object r5 = r5.get(r4)
            com.zykj.paint.Actions$EzyAction r5 = (com.zykj.paint.Actions.EzyAction) r5
            java.util.List<com.zykj.paint.Actions$EzyAction> r6 = r8.mActionList
            int r7 = r4 + 1
            java.lang.Object r6 = r6.get(r7)
            com.zykj.paint.Actions$EzyAction r6 = (com.zykj.paint.Actions.EzyAction) r6
            int r5 = r5.getStartAt()
            int r6 = r6.getStartAt()
            int r5 = r9 - r5
            if (r5 < 0) goto L4a
            if (r9 < r6) goto L4c
        L4a:
            if (r9 != 0) goto L66
        L4c:
            r8.mCurrentIndex = r4
            r8.timeRecord = r1
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            r8.mStartTime = r3
            com.zykj.paint.player.PlayStatusListener r1 = r8.playStatusListener
            r1.onPlayPause()
            if (r9 != 0) goto L62
            r8.renderTemp()
            goto L68
        L62:
            r8.renderHistory()
            goto L68
        L66:
            r4 = r7
            goto L26
        L68:
            android.media.MediaPlayer r9 = r8.mediaPlayer
            if (r9 != 0) goto L73
            android.media.MediaPlayer r9 = new android.media.MediaPlayer
            r9.<init>()
            r8.mediaPlayer = r9
        L73:
            android.media.MediaPlayer r9 = r8.mediaPlayer
            r9.stop()
            java.io.File r9 = new java.io.File     // Catch: java.io.IOException -> Lbf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lbf
            r1.<init>()     // Catch: java.io.IOException -> Lbf
            java.lang.String r2 = r8.sourceUrl     // Catch: java.io.IOException -> Lbf
            r1.append(r2)     // Catch: java.io.IOException -> Lbf
            r1.append(r0)     // Catch: java.io.IOException -> Lbf
            java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> Lbf
            r9.<init>(r1)     // Catch: java.io.IOException -> Lbf
            boolean r9 = r9.exists()     // Catch: java.io.IOException -> Lbf
            if (r9 == 0) goto Lc3
            android.media.MediaPlayer r9 = r8.mediaPlayer     // Catch: java.io.IOException -> Lbf
            r9.reset()     // Catch: java.io.IOException -> Lbf
            android.media.MediaPlayer r9 = r8.mediaPlayer     // Catch: java.io.IOException -> Lbf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lbf
            r1.<init>()     // Catch: java.io.IOException -> Lbf
            java.lang.String r2 = r8.sourceUrl     // Catch: java.io.IOException -> Lbf
            r1.append(r2)     // Catch: java.io.IOException -> Lbf
            r1.append(r0)     // Catch: java.io.IOException -> Lbf
            java.lang.String r0 = r1.toString()     // Catch: java.io.IOException -> Lbf
            r9.setDataSource(r0)     // Catch: java.io.IOException -> Lbf
            android.media.MediaPlayer r9 = r8.mediaPlayer     // Catch: java.io.IOException -> Lbf
            r9.prepareAsync()     // Catch: java.io.IOException -> Lbf
            android.media.MediaPlayer r9 = r8.mediaPlayer     // Catch: java.io.IOException -> Lbf
            com.zykj.paint.render.SketchViewer$1 r0 = new com.zykj.paint.render.SketchViewer$1     // Catch: java.io.IOException -> Lbf
            r0.<init>()     // Catch: java.io.IOException -> Lbf
            r9.setOnPreparedListener(r0)     // Catch: java.io.IOException -> Lbf
            goto Lc3
        Lbf:
            r9 = move-exception
            r9.printStackTrace()
        Lc3:
            long r0 = r8.timeRecord
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.paint.render.SketchViewer.seekToCurrentIndex(int):long"); // DEX body: android/错题本/smali_classes3/com/zykj/paint/render/SketchViewer.smali:1786
    }

    public void setDataSource(List<Actions.EzyAction> list, String str) {
        this.mActionList = list;
        this.sourceUrl = str;
        this.maxProgress = getTotalTime(list);
        this.map = new Map();
        this.mapRender = new MapRender();
        this.scheduledExecutorService = Executors.newScheduledThreadPool(2);
        this.renderActionRunnable = new RenderActionRunnable();
        ActionProcessor actionProcessor = new ActionProcessor(this, this.map);
        this.actionProcessor = actionProcessor;
        actionProcessor.setSourceUrl(str);
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer == null) {
            this.mediaPlayer = new MediaPlayer();
        } else {
            mediaPlayer.stop();
        }
        try {
            this.mediaPlayer.reset();
            this.mediaPlayer.setDataSource(str + "/track.wav");
            this.mediaPlayer.prepare();
        } catch (IOException | IllegalStateException e) {
            e.printStackTrace();
        }
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
            this.timer = null;
        }
        ProgressTask progressTask = this.progressTask;
        if (progressTask != null) {
            progressTask.cancel();
            this.progressTask = null;
        }
        this.progressTask = new ProgressTask();
        Timer timer2 = new Timer();
        this.timer = timer2;
        timer2.schedule(this.progressTask, DELAY_TIME, 1000L);
        post(new RunnableC0023a(this, 19));
        Log.e(TAG, "setDataSource-->");
    }

    public void setPlayStatusListener(PlayStatusListener playStatusListener) {
        this.playStatusListener = playStatusListener;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i8, int i9) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        Log.e(TAG, "surfaceCreated-->");
        this.mIsDrawing = true;
        if (!this.isBackgroudPlaced) {
            this.isBackgroudPlaced = true;
            Canvas canvasLockCanvas = surfaceHolder.lockCanvas();
            canvasLockCanvas.drawColor(-1);
            surfaceHolder.unlockCanvasAndPost(canvasLockCanvas);
        }
        if (this.timeRecord > 0) {
            renderAll();
        } else {
            renderTemp();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Log.e(TAG, "surfaceDestroyed-->");
        this.mIsDrawing = false;
    }

    public SketchViewer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isRend = true;
        this.playStatusListener = new PlayStatusListener() { // from class: com.zykj.paint.render.SketchViewer.3
            @Override // com.zykj.paint.player.PlayStatusListener
            public void onPlayEnd() {
            }

            @Override // com.zykj.paint.player.PlayStatusListener
            public void onPlayPause() {
            }

            @Override // com.zykj.paint.player.PlayStatusListener
            public void onPlayStart() {
            }

            @Override // com.zykj.paint.player.PlayStatusListener
            public void onUpdate(long j7) {
            }
        };
        init();
    }

    public long getTotalTime() {
        return this.maxProgress;
    }

    public SketchViewer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isRend = true;
        this.playStatusListener = new PlayStatusListener() { // from class: com.zykj.paint.render.SketchViewer.3
            @Override // com.zykj.paint.player.PlayStatusListener
            public void onPlayEnd() {
            }

            @Override // com.zykj.paint.player.PlayStatusListener
            public void onPlayPause() {
            }

            @Override // com.zykj.paint.player.PlayStatusListener
            public void onPlayStart() {
            }

            @Override // com.zykj.paint.player.PlayStatusListener
            public void onUpdate(long j7) {
            }
        };
        init();
    }
}
