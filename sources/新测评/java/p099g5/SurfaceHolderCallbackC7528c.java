package p099g5;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: g5.c */
/* loaded from: classes4.dex */
public class SurfaceHolderCallbackC7528c extends SurfaceView implements SurfaceHolder.Callback {

    /* renamed from: m */
    public static final String f12425m = "c";

    /* renamed from: a */
    public int f12426a;

    /* renamed from: b */
    public int f12427b;

    /* renamed from: c */
    public f f12428c;

    /* renamed from: d */
    public AbstractC7531f f12429d;

    /* renamed from: e */
    public Camera f12430e;

    /* renamed from: f */
    public float f12431f;

    /* renamed from: g */
    public boolean f12432g;

    /* renamed from: h */
    public boolean f12433h;

    /* renamed from: i */
    public boolean f12434i;

    /* renamed from: j */
    public C7527b f12435j;

    /* renamed from: k */
    public Runnable f12436k;

    /* renamed from: l */
    public Camera.AutoFocusCallback f12437l;

    /* renamed from: g5.c$a */
    public class a implements Camera.AutoFocusCallback {

        /* renamed from: a */
        public final /* synthetic */ String f12438a;

        public a(String str) {
            this.f12438a = str;
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z9, Camera camera) {
            if (z9) {
                Log.i(SurfaceHolderCallbackC7528c.f12425m, "手动 对焦成功，获取帧-------->>>>>");
                SurfaceHolderCallbackC7528c.this.m12311i(camera);
            }
            Camera.Parameters parameters = camera.getParameters();
            parameters.setFocusMode(this.f12438a);
            camera.setParameters(parameters);
            camera.cancelAutoFocus();
        }
    }

    /* renamed from: g5.c$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() throws IOException {
            SurfaceHolderCallbackC7528c.this.m12315o();
        }
    }

    /* renamed from: g5.c$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SurfaceHolderCallbackC7528c.this.f12430e == null || !SurfaceHolderCallbackC7528c.this.f12432g) {
                return;
            }
            SurfaceHolderCallbackC7528c surfaceHolderCallbackC7528c = SurfaceHolderCallbackC7528c.this;
            if (surfaceHolderCallbackC7528c.f12433h && surfaceHolderCallbackC7528c.f12434i) {
                Log.i(SurfaceHolderCallbackC7528c.f12425m, "doAutoFocus 自动对焦-------->>>>>");
                SurfaceHolderCallbackC7528c.this.f12430e.autoFocus(SurfaceHolderCallbackC7528c.this.f12437l);
            }
        }
    }

    /* renamed from: g5.c$d */
    public class d implements Camera.AutoFocusCallback {
        public d() {
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z9, Camera camera) {
            SurfaceHolderCallbackC7528c surfaceHolderCallbackC7528c = SurfaceHolderCallbackC7528c.this;
            surfaceHolderCallbackC7528c.postDelayed(surfaceHolderCallbackC7528c.f12436k, 1500L);
        }
    }

    /* renamed from: g5.c$e */
    public class e implements Camera.PictureCallback {
        public e() {
        }

        @Override // android.hardware.Camera.PictureCallback
        public void onPictureTaken(byte[] bArr, Camera camera) {
            Log.i(SurfaceHolderCallbackC7528c.f12425m, "对焦成功，capture-------->>>>>");
            SurfaceHolderCallbackC7528c.this.f12428c.onPictureTaken(bArr, camera);
            SurfaceHolderCallbackC7528c.this.m12317q();
        }
    }

    /* renamed from: g5.c$f */
    public interface f {
        void onPictureTaken(byte[] bArr, Camera camera);
    }

    public SurfaceHolderCallbackC7528c(Context context, AbstractC7531f abstractC7531f) {
        super(context);
        this.f12426a = -1;
        this.f12427b = -1;
        this.f12431f = 1.0f;
        this.f12432g = true;
        this.f12433h = true;
        this.f12434i = false;
        this.f12436k = new c();
        this.f12437l = new d();
        this.f12429d = abstractC7531f;
        this.f12428c = abstractC7531f;
    }

    /* renamed from: h */
    public static Rect m12308h(float f10, float f11, float f12, int i10, int i11) {
        int i12 = (int) (((f10 / i10) * 2000.0f) - 1000.0f);
        int i13 = (int) (((f11 / i11) * 2000.0f) - 1000.0f);
        int iIntValue = Float.valueOf(f12 * 300.0f).intValue() / 2;
        RectF rectF = new RectF(m12309j(i12 - iIntValue, -1000, 1000), m12309j(i13 - iIntValue, -1000, 1000), m12309j(i12 + iIntValue, -1000, 1000), m12309j(i13 + iIntValue, -1000, 1000));
        return new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    /* renamed from: j */
    public static int m12309j(int i10, int i11, int i12) {
        return i10 > i12 ? i12 : i10 < i11 ? i11 : i10;
    }

    /* renamed from: k */
    public static float m12310k(MotionEvent motionEvent) {
        float x9 = motionEvent.getX(0) - motionEvent.getX(1);
        float y9 = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((x9 * x9) + (y9 * y9));
    }

    public int getDisplayOrientation() {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i10 = 0;
        Camera.getCameraInfo(0, cameraInfo);
        int rotation = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation != 0) {
            if (rotation == 1) {
                i10 = 90;
            } else if (rotation == 2) {
                i10 = 180;
            } else if (rotation == 3) {
                i10 = 270;
            }
        }
        return cameraInfo.facing == 1 ? (360 - ((cameraInfo.orientation + i10) % 360)) % 360 : ((cameraInfo.orientation - i10) + 360) % 360;
    }

    public Point getPicSize() {
        return new Point(this.f12435j.f12423d);
    }

    /* renamed from: i */
    public final void m12311i(Camera camera) {
        camera.takePicture(null, null, new e());
    }

    /* renamed from: l */
    public final void m12312l(MotionEvent motionEvent, Camera camera) {
        Rect rectM12308h = m12308h(motionEvent.getX(), motionEvent.getY(), 1.0f, getWidth(), getHeight());
        if (camera != null) {
            camera.cancelAutoFocus();
        }
        Camera.Parameters parameters = camera.getParameters();
        if (parameters.getMaxNumFocusAreas() > 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Camera.Area(rectM12308h, 800));
            parameters.setFocusAreas(arrayList);
        } else {
            Log.i(f12425m, "focus areas not supported");
        }
        String focusMode = parameters.getFocusMode();
        Iterator<String> it = parameters.getSupportedFocusModes().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().equals("macro")) {
                parameters.setFocusMode("macro");
                break;
            }
        }
        camera.setParameters(parameters);
        camera.autoFocus(new a(focusMode));
    }

    /* renamed from: m */
    public final void m12313m(boolean z9, Camera camera) {
        if (camera == null) {
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        if (!parameters.isZoomSupported()) {
            Log.i(f12425m, "zoom not supported");
            return;
        }
        int maxZoom = parameters.getMaxZoom();
        int zoom = parameters.getZoom();
        if (z9 && zoom < maxZoom) {
            zoom++;
        } else if (zoom > 0) {
            zoom--;
        }
        parameters.setZoom(zoom);
        camera.setParameters(parameters);
    }

    /* renamed from: n */
    public final void m12314n() {
        Camera.Parameters parameters = this.f12430e.getParameters();
        parameters.setPictureFormat(256);
        parameters.setJpegQuality(90);
        this.f12430e.setDisplayOrientation(getDisplayOrientation());
        this.f12430e.setParameters(parameters);
    }

    /* renamed from: o */
    public void m12315o() throws IOException {
        Camera camera = this.f12430e;
        if (camera != null) {
            try {
                this.f12432g = true;
                this.f12435j.m12299d(camera);
                this.f12430e.setPreviewDisplay(getHolder());
                this.f12430e.startPreview();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i10, int i11) {
        String str = f12425m;
        Log.e(str, "onMesure");
        if (-1 == this.f12426a || -1 == this.f12427b) {
            super.onMeasure(i10, i11);
            return;
        }
        Log.e(str, "onMesure-x=" + this.f12426a + ",y=" + this.f12427b);
        setMeasuredDimension(this.f12426a, this.f12427b);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            int action = motionEvent.getAction() & 255;
            if (action == 2) {
                float fM12310k = m12310k(motionEvent);
                float f10 = this.f12431f;
                if (fM12310k > f10) {
                    m12313m(true, this.f12430e);
                } else if (fM12310k < f10) {
                    m12313m(false, this.f12430e);
                }
                this.f12431f = fM12310k;
            } else if (action == 5) {
                this.f12431f = m12310k(motionEvent);
            }
        } else if ((motionEvent.getAction() & 255) == 0 && this.f12432g) {
            try {
                Camera camera = this.f12430e;
                if (camera != null) {
                    m12312l(motionEvent, camera);
                }
            } catch (RuntimeException e10) {
                e10.printStackTrace();
            }
        }
        return true;
    }

    /* renamed from: p */
    public void m12316p() {
        if (this.f12432g) {
            requestLayout();
        } else {
            m12315o();
        }
        m12315o();
    }

    /* renamed from: q */
    public void m12317q() {
        if (this.f12430e != null) {
            try {
                removeCallbacks(this.f12436k);
                this.f12432g = false;
                this.f12430e.cancelAutoFocus();
                this.f12430e.setOneShotPreviewCallback(null);
                this.f12430e.stopPreview();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public void setCamera(Camera camera) {
        this.f12430e = camera;
        if (camera != null) {
            m12314n();
            C7527b c7527b = new C7527b(getContext());
            this.f12435j = c7527b;
            c7527b.m12298c(this.f12430e);
            getHolder().addCallback(this);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        if (surfaceHolder.getSurface() == null) {
            return;
        }
        m12317q();
        post(new b());
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f12434i = true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f12434i = false;
        m12317q();
    }
}
