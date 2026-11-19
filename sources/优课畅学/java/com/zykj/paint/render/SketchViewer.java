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
import java.io.IOException;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p097f4.C8438c;
import p109g4.InterfaceC8527a;
import p120h4.C8712a;
import p131i4.C8757a;

/* loaded from: classes.dex */
public class SketchViewer extends SurfaceView implements SurfaceHolder.Callback {

    /* renamed from: a */
    public SurfaceHolder f10526a;

    /* renamed from: b */
    public Canvas f10527b;

    /* renamed from: c */
    public boolean f10528c;

    /* renamed from: d */
    public boolean f10529d;

    /* renamed from: e */
    public String f10530e;

    /* renamed from: f */
    public Bitmap f10531f;

    /* renamed from: g */
    public List f10532g;

    /* renamed from: h */
    public long f10533h;

    /* renamed from: i */
    public long f10534i;

    /* renamed from: j */
    public long f10535j;

    /* renamed from: k */
    public C8438c f10536k;

    /* renamed from: l */
    public C8712a f10537l;

    /* renamed from: m */
    public int f10538m;

    /* renamed from: n */
    public Timer f10539n;

    /* renamed from: o */
    public RunnableC7424e f10540o;

    /* renamed from: p */
    public C7423d f10541p;

    /* renamed from: q */
    public C8757a f10542q;

    /* renamed from: r */
    public boolean f10543r;

    /* renamed from: s */
    public ScheduledExecutorService f10544s;

    /* renamed from: t */
    public ScheduledFuture f10545t;

    /* renamed from: u */
    public MediaPlayer f10546u;

    /* renamed from: v */
    public boolean f10547v;

    /* renamed from: w */
    public InterfaceC8527a f10548w;

    /* renamed from: com.zykj.paint.render.SketchViewer$a */
    public class C7420a implements MediaPlayer.OnPreparedListener {
        public C7420a() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) throws IllegalStateException {
            SketchViewer.this.f10546u.setVolume(1.0f, 1.0f);
            SketchViewer.this.f10546u.seekTo((int) SketchViewer.this.f10534i);
        }
    }

    /* renamed from: com.zykj.paint.render.SketchViewer$b */
    public class C7421b implements MediaPlayer.OnPreparedListener {
        public C7421b() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) throws IllegalStateException {
            SketchViewer.this.f10546u.start();
            SketchViewer.this.f10546u.setVolume(1.0f, 1.0f);
        }
    }

    /* renamed from: com.zykj.paint.render.SketchViewer$c */
    public class C7422c implements InterfaceC8527a {
        public C7422c() {
        }

        @Override // p109g4.InterfaceC8527a
        /* renamed from: a */
        public void mo9562a(long j10) {
        }

        @Override // p109g4.InterfaceC8527a
        public void onPlayEnd() {
        }

        @Override // p109g4.InterfaceC8527a
        public void onPlayPause() {
        }

        @Override // p109g4.InterfaceC8527a
        public void onPlayStart() {
        }
    }

    /* renamed from: com.zykj.paint.render.SketchViewer$d */
    public class C7423d extends TimerTask {

        /* renamed from: com.zykj.paint.render.SketchViewer$d$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (SketchViewer.this.f10548w != null) {
                    SketchViewer.this.f10548w.mo9562a(SketchViewer.this.f10534i);
                }
            }
        }

        public C7423d() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (SketchViewer.this.f10528c) {
                SketchViewer.this.post(new a());
            }
        }
    }

    /* renamed from: com.zykj.paint.render.SketchViewer$e */
    public class RunnableC7424e implements Runnable {

        /* renamed from: com.zykj.paint.render.SketchViewer$e$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (SketchViewer.this.f10545t != null && SketchViewer.this.f10545t.isDone() && SketchViewer.this.f10548w != null) {
                    SketchViewer.this.f10548w.onPlayEnd();
                }
                if (SketchViewer.this.f10548w != null) {
                    SketchViewer.this.f10548w.mo9562a(SketchViewer.this.f10535j);
                }
            }
        }

        public RunnableC7424e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SketchViewer.this.f10528c) {
                int size = SketchViewer.this.f10532g.size();
                if (size <= SketchViewer.this.f10538m) {
                    SketchViewer.this.post(new a());
                    return;
                }
                SketchViewer.this.f10534i = System.currentTimeMillis() - SketchViewer.this.f10533h;
                int i10 = SketchViewer.this.f10538m;
                for (int i11 = SketchViewer.this.f10538m; i11 < size; i11++) {
                    if (SketchViewer.this.f10534i >= ((Actions.EzyAction) SketchViewer.this.f10532g.get(i11)).m9629n()) {
                        Log.i("SketchViewer", "timeRecord=[" + SketchViewer.this.f10534i + "]---->>>>>读取第[" + SketchViewer.this.f10538m + "]条指令");
                        SketchViewer.m9692f(SketchViewer.this);
                    }
                }
                if (SketchViewer.this.f10538m > i10) {
                    Log.i("SketchViewer", "---->>>>>本次共读取[" + (SketchViewer.this.f10538m - i10) + "]条指令");
                    SketchViewer.this.f10542q.m14451b(SketchViewer.this.f10532g.subList(i10, SketchViewer.this.f10538m));
                    SketchViewer sketchViewer = SketchViewer.this;
                    sketchViewer.f10545t = sketchViewer.f10544s.schedule(this, 0L, TimeUnit.MILLISECONDS);
                } else {
                    SketchViewer sketchViewer2 = SketchViewer.this;
                    sketchViewer2.f10545t = sketchViewer2.f10544s.schedule(this, 40L, TimeUnit.MILLISECONDS);
                }
                if (SketchViewer.this.f10548w != null) {
                    SketchViewer.this.f10548w.mo9562a(SketchViewer.this.f10534i);
                }
            }
        }
    }

    public SketchViewer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10547v = true;
        this.f10548w = new C7422c();
        m9707r();
    }

    /* renamed from: f */
    public static /* synthetic */ int m9692f(SketchViewer sketchViewer) {
        int i10 = sketchViewer.f10538m;
        sketchViewer.f10538m = i10 + 1;
        return i10;
    }

    /* renamed from: A */
    public void m9702A() throws IllegalStateException {
        this.f10528c = true;
        this.f10529d = true;
        this.f10536k.m13785g();
        this.f10533h = System.currentTimeMillis() - this.f10534i;
        this.f10542q.m14452c(this.f10532g.subList(0, this.f10538m));
        this.f10545t = this.f10544s.schedule(this.f10540o, 0L, TimeUnit.MILLISECONDS);
        MediaPlayer mediaPlayer = this.f10546u;
        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
        this.f10548w.onPlayStart();
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
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long m9703B(int r9) throws java.lang.IllegalStateException, java.io.IOException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            r8 = this;
            java.lang.String r0 = "/track.wav"
            long r1 = (long) r9
            long r3 = r8.f10535j
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 != 0) goto L1f
            i4.a r3 = r8.f10542q
            java.util.List r4 = r8.f10532g
            r3.m14452c(r4)
            g4.a r3 = r8.f10548w
            if (r3 == 0) goto L1f
            r3.onPlayEnd()
            g4.a r9 = r8.f10548w
            long r3 = r8.f10535j
            r9.mo9562a(r3)
            return r1
        L1f:
            java.util.List r3 = r8.f10532g
            int r3 = r3.size()
            r4 = 0
        L26:
            int r5 = r3 + (-1)
            if (r4 >= r5) goto L68
            java.util.List r5 = r8.f10532g
            java.lang.Object r5 = r5.get(r4)
            com.zykj.paint.Actions$EzyAction r5 = (com.zykj.paint.Actions.EzyAction) r5
            java.util.List r6 = r8.f10532g
            int r7 = r4 + 1
            java.lang.Object r6 = r6.get(r7)
            com.zykj.paint.Actions$EzyAction r6 = (com.zykj.paint.Actions.EzyAction) r6
            int r5 = r5.m9629n()
            int r6 = r6.m9629n()
            int r5 = r9 - r5
            if (r5 < 0) goto L4a
            if (r9 < r6) goto L4c
        L4a:
            if (r9 != 0) goto L66
        L4c:
            r8.f10538m = r4
            r8.f10534i = r1
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            r8.f10533h = r3
            g4.a r1 = r8.f10548w
            r1.onPlayPause()
            if (r9 != 0) goto L62
            r8.m9715z()
            goto L68
        L62:
            r8.m9713x()
            goto L68
        L66:
            r4 = r7
            goto L26
        L68:
            android.media.MediaPlayer r9 = r8.f10546u
            if (r9 != 0) goto L73
            android.media.MediaPlayer r9 = new android.media.MediaPlayer
            r9.<init>()
            r8.f10546u = r9
        L73:
            android.media.MediaPlayer r9 = r8.f10546u
            r9.stop()
            java.io.File r9 = new java.io.File     // Catch: java.io.IOException -> Lbf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lbf
            r1.<init>()     // Catch: java.io.IOException -> Lbf
            java.lang.String r2 = r8.f10530e     // Catch: java.io.IOException -> Lbf
            r1.append(r2)     // Catch: java.io.IOException -> Lbf
            r1.append(r0)     // Catch: java.io.IOException -> Lbf
            java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> Lbf
            r9.<init>(r1)     // Catch: java.io.IOException -> Lbf
            boolean r9 = r9.exists()     // Catch: java.io.IOException -> Lbf
            if (r9 == 0) goto Lc3
            android.media.MediaPlayer r9 = r8.f10546u     // Catch: java.io.IOException -> Lbf
            r9.reset()     // Catch: java.io.IOException -> Lbf
            android.media.MediaPlayer r9 = r8.f10546u     // Catch: java.io.IOException -> Lbf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lbf
            r1.<init>()     // Catch: java.io.IOException -> Lbf
            java.lang.String r2 = r8.f10530e     // Catch: java.io.IOException -> Lbf
            r1.append(r2)     // Catch: java.io.IOException -> Lbf
            r1.append(r0)     // Catch: java.io.IOException -> Lbf
            java.lang.String r0 = r1.toString()     // Catch: java.io.IOException -> Lbf
            r9.setDataSource(r0)     // Catch: java.io.IOException -> Lbf
            android.media.MediaPlayer r9 = r8.f10546u     // Catch: java.io.IOException -> Lbf
            r9.prepareAsync()     // Catch: java.io.IOException -> Lbf
            android.media.MediaPlayer r9 = r8.f10546u     // Catch: java.io.IOException -> Lbf
            com.zykj.paint.render.SketchViewer$a r0 = new com.zykj.paint.render.SketchViewer$a     // Catch: java.io.IOException -> Lbf
            r0.<init>()     // Catch: java.io.IOException -> Lbf
            r9.setOnPreparedListener(r0)     // Catch: java.io.IOException -> Lbf
            goto Lc3
        Lbf:
            r9 = move-exception
            r9.printStackTrace()
        Lc3:
            long r0 = r8.f10534i
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.paint.render.SketchViewer.m9703B(int):long"); // DEX body: android/优课畅学/smali/com/zykj/paint/render/SketchViewer.smali:403
    }

    /* renamed from: C */
    public void m9704C(List list, String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        this.f10532g = list;
        this.f10530e = str;
        this.f10535j = m9706q(list);
        this.f10536k = new C8438c();
        this.f10537l = new C8712a();
        this.f10544s = Executors.newScheduledThreadPool(2);
        this.f10540o = new RunnableC7424e();
        C8757a c8757a = new C8757a(this, this.f10536k);
        this.f10542q = c8757a;
        c8757a.m14458i(str);
        MediaPlayer mediaPlayer = this.f10546u;
        if (mediaPlayer == null) {
            this.f10546u = new MediaPlayer();
        } else {
            mediaPlayer.stop();
        }
        try {
            this.f10546u.reset();
            this.f10546u.setDataSource(str + "/track.wav");
            this.f10546u.prepare();
        } catch (IOException | IllegalStateException e10) {
            e10.printStackTrace();
        }
        Timer timer = this.f10539n;
        if (timer != null) {
            timer.cancel();
            this.f10539n = null;
        }
        C7423d c7423d = this.f10541p;
        if (c7423d != null) {
            c7423d.cancel();
            this.f10541p = null;
        }
        this.f10541p = new C7423d();
        Timer timer2 = new Timer();
        this.f10539n = timer2;
        timer2.schedule(this.f10541p, 500L, 1000L);
        post(new Runnable() { // from class: h4.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f16337a.m9715z();
            }
        });
        Log.e("SketchViewer", "setDataSource-->");
    }

    public Bitmap getCapture() {
        Log.e("SketchViewer", "[获取截图]---->>>>getCapture()");
        this.f10531f = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f10531f);
        canvas.drawColor(-1);
        this.f10536k.mo13779a(this.f10537l, canvas);
        return this.f10531f;
    }

    public long getTotalTime() {
        return this.f10535j;
    }

    /* renamed from: p */
    public final Matrix m9705p(int i10, int i11, int i12, int i13) {
        float f10 = i10;
        float f11 = i12;
        float f12 = (f10 * 1.0f) / f11;
        float f13 = i11;
        float f14 = i13;
        float f15 = (1.0f * f13) / f14;
        if (f12 > f15) {
            f12 = f15;
        }
        float f16 = f11 / 2.0f;
        float f17 = f14 / 2.0f;
        Matrix matrix = new Matrix();
        matrix.setScale(f12, f12, f16, f17);
        matrix.postTranslate((f10 / 2.0f) - f16, (f13 / 2.0f) - f17);
        return matrix;
    }

    /* renamed from: q */
    public final int m9706q(List list) {
        Actions.EzyAction ezyAction = (Actions.EzyAction) list.get(list.size() - 1);
        return ezyAction.m9629n() + ezyAction.m9627l();
    }

    /* renamed from: r */
    public final void m9707r() {
        SurfaceHolder holder = getHolder();
        this.f10526a = holder;
        holder.addCallback(this);
    }

    /* renamed from: s */
    public void m9708s() throws IllegalStateException {
        this.f10528c = false;
        this.f10529d = false;
        MediaPlayer mediaPlayer = this.f10546u;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
        this.f10548w.onPlayPause();
    }

    public void setPlayStatusListener(InterfaceC8527a interfaceC8527a) {
        this.f10548w = interfaceC8527a;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        Log.e("SketchViewer", "surfaceCreated-->");
        this.f10529d = true;
        if (!this.f10543r) {
            this.f10543r = true;
            Canvas canvasLockCanvas = surfaceHolder.lockCanvas();
            canvasLockCanvas.drawColor(-1);
            surfaceHolder.unlockCanvasAndPost(canvasLockCanvas);
        }
        if (this.f10534i > 0) {
            m9712w();
        } else {
            m9715z();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Log.e("SketchViewer", "surfaceDestroyed-->");
        this.f10529d = false;
    }

    /* renamed from: t */
    public void m9709t() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        this.f10528c = true;
        this.f10529d = true;
        this.f10538m = 0;
        this.f10534i = 0L;
        C8438c c8438c = this.f10536k;
        if (c8438c != null) {
            c8438c.m13785g();
        }
        this.f10533h = System.currentTimeMillis();
        this.f10545t = this.f10544s.schedule(this.f10540o, 0L, TimeUnit.MILLISECONDS);
        m9710u();
        this.f10548w.onPlayStart();
    }

    /* renamed from: u */
    public final void m9710u() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        if (this.f10546u == null) {
            this.f10546u = new MediaPlayer();
        }
        this.f10546u.stop();
        try {
            this.f10546u.reset();
            this.f10546u.setDataSource(this.f10530e + "/track.wav");
            this.f10546u.prepareAsync();
            this.f10546u.setOnPreparedListener(new C7421b());
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: v */
    public void m9711v() throws IllegalStateException {
        ScheduledExecutorService scheduledExecutorService = this.f10544s;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        C7423d c7423d = this.f10541p;
        if (c7423d != null) {
            c7423d.cancel();
            this.f10541p = null;
        }
        Timer timer = this.f10539n;
        if (timer != null) {
            timer.cancel();
            this.f10539n = null;
        }
        C8757a c8757a = this.f10542q;
        if (c8757a != null) {
            c8757a.m14450a();
        }
        MediaPlayer mediaPlayer = this.f10546u;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                this.f10546u.stop();
            }
            this.f10546u.release();
            this.f10546u = null;
        }
    }

    /* renamed from: w */
    public void m9712w() {
        if (this.f10529d || !this.f10547v) {
            Canvas canvasLockCanvas = this.f10526a.lockCanvas();
            this.f10527b = canvasLockCanvas;
            if (canvasLockCanvas != null) {
                try {
                    try {
                        canvasLockCanvas.drawColor(-1);
                        this.f10536k.mo13779a(this.f10537l, this.f10527b);
                        Canvas canvas = this.f10527b;
                        if (canvas != null) {
                            this.f10526a.unlockCanvasAndPost(canvas);
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        Canvas canvas2 = this.f10527b;
                        if (canvas2 != null) {
                            this.f10526a.unlockCanvasAndPost(canvas2);
                        }
                    }
                } catch (Throwable th) {
                    Canvas canvas3 = this.f10527b;
                    if (canvas3 != null) {
                        this.f10526a.unlockCanvasAndPost(canvas3);
                    }
                    throw th;
                }
            }
        }
    }

    /* renamed from: x */
    public void m9713x() {
        Log.e("SketchViewer", "[渲染拖动的画面] mCurrentIndex=" + this.f10538m);
        this.f10536k.m13785g();
        this.f10542q.m14452c(this.f10532g.subList(0, this.f10538m + 1));
    }

    /* renamed from: y */
    public void m9714y() {
        Canvas canvasLockCanvas = this.f10526a.lockCanvas();
        this.f10527b = canvasLockCanvas;
        if (canvasLockCanvas != null) {
            try {
                try {
                    canvasLockCanvas.drawColor(-1);
                    this.f10536k.mo13779a(this.f10537l, this.f10527b);
                    Canvas canvas = this.f10527b;
                    if (canvas != null) {
                        this.f10526a.unlockCanvasAndPost(canvas);
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                    Canvas canvas2 = this.f10527b;
                    if (canvas2 != null) {
                        this.f10526a.unlockCanvasAndPost(canvas2);
                    }
                }
            } catch (Throwable th) {
                Canvas canvas3 = this.f10527b;
                if (canvas3 != null) {
                    this.f10526a.unlockCanvasAndPost(canvas3);
                }
                throw th;
            }
        }
    }

    /* renamed from: z */
    public final void m9715z() {
        Canvas canvasLockCanvas = this.f10526a.lockCanvas();
        this.f10527b = canvasLockCanvas;
        if (canvasLockCanvas != null) {
            try {
                try {
                    canvasLockCanvas.drawColor(-1);
                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(this.f10530e + "/thumbnail.jpg");
                    this.f10527b.drawBitmap(bitmapDecodeFile, m9705p(getWidth(), getHeight(), bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight()), null);
                    bitmapDecodeFile.recycle();
                    Canvas canvas = this.f10527b;
                    if (canvas != null) {
                        this.f10526a.unlockCanvasAndPost(canvas);
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                    Canvas canvas2 = this.f10527b;
                    if (canvas2 != null) {
                        this.f10526a.unlockCanvasAndPost(canvas2);
                    }
                }
            } catch (Throwable th) {
                Canvas canvas3 = this.f10527b;
                if (canvas3 != null) {
                    this.f10526a.unlockCanvasAndPost(canvas3);
                }
                throw th;
            }
        }
    }
}
