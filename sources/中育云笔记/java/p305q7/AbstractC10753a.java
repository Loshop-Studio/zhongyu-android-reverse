package p305q7;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLException;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.view.Surface;
import com.shuyu.gsyvideoplayer.render.view.GSYVideoGLView;
import com.shuyu.gsyvideoplayer.utils.Debuger;
import java.nio.IntBuffer;
import javax.microedition.khronos.opengles.GL10;
import p236l7.InterfaceC10155e;
import p320r7.InterfaceC10911a;
import p320r7.InterfaceC10912b;

/* renamed from: q7.a */
/* loaded from: classes5.dex */
public abstract class AbstractC10753a implements GLSurfaceView.Renderer, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d */
    public InterfaceC10911a f25866d;

    /* renamed from: e */
    public GLSurfaceView f25867e;

    /* renamed from: n */
    public InterfaceC10912b f25876n;

    /* renamed from: c */
    public boolean f25865c = false;

    /* renamed from: f */
    public float[] f25868f = new float[16];

    /* renamed from: g */
    public float[] f25869g = new float[16];

    /* renamed from: h */
    public int f25870h = 0;

    /* renamed from: i */
    public int f25871i = 0;

    /* renamed from: j */
    public int f25872j = 0;

    /* renamed from: k */
    public int f25873k = 0;

    /* renamed from: l */
    public boolean f25874l = false;

    /* renamed from: m */
    public boolean f25875m = false;

    /* renamed from: o */
    public Handler f25877o = new Handler();

    /* renamed from: q7.a$a */
    public class a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ Surface f25878c;

        public a(Surface surface) {
            this.f25878c = surface;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC10911a interfaceC10911a = AbstractC10753a.this.f25866d;
            if (interfaceC10911a != null) {
                interfaceC10911a.onSurfaceAvailable(this.f25878c);
            }
        }
    }

    /* renamed from: q7.a$b */
    public class b implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ String f25880c;

        /* renamed from: d */
        public final /* synthetic */ int f25881d;

        public b(String str, int i10) {
            this.f25880c = str;
            this.f25881d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC10753a abstractC10753a = AbstractC10753a.this;
            InterfaceC10912b interfaceC10912b = abstractC10753a.f25876n;
            if (interfaceC10912b != null) {
                interfaceC10912b.mo9753a(abstractC10753a, this.f25880c + ": glError " + this.f25881d, this.f25881d, AbstractC10753a.this.f25875m);
            }
            AbstractC10753a.this.f25875m = false;
        }
    }

    /* renamed from: a */
    public void m22824a(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            Debuger.printfError(str + ": glError " + iGlGetError);
            this.f25877o.post(new b(str, iGlGetError));
        }
    }

    /* renamed from: b */
    public Bitmap m22825b(int i10, int i11, int i12, int i13, GL10 gl10) {
        int i14 = i12 * i13;
        int[] iArr = new int[i14];
        int[] iArr2 = new int[i14];
        IntBuffer intBufferWrap = IntBuffer.wrap(iArr);
        intBufferWrap.position(0);
        try {
            gl10.glReadPixels(i10, i11, i12, i13, 6408, 5121, intBufferWrap);
            for (int i15 = 0; i15 < i13; i15++) {
                int i16 = i15 * i12;
                int i17 = ((i13 - i15) - 1) * i12;
                for (int i18 = 0; i18 < i12; i18++) {
                    int i19 = iArr[i16 + i18];
                    iArr2[i17 + i18] = (i19 & (-16711936)) | ((i19 << 16) & 16711680) | ((i19 >> 16) & 255);
                }
            }
            return this.f25865c ? Bitmap.createBitmap(iArr2, i12, i13, Bitmap.Config.ARGB_8888) : Bitmap.createBitmap(iArr2, i12, i13, Bitmap.Config.RGB_565);
        } catch (GLException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public int m22826c(String str, String str2) {
        int iM22830g;
        int iM22830g2 = m22830g(35633, str);
        if (iM22830g2 == 0 || (iM22830g = m22830g(35632, str2)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        if (iGlCreateProgram != 0) {
            GLES20.glAttachShader(iGlCreateProgram, iM22830g2);
            m22824a("glAttachShader");
            GLES20.glAttachShader(iGlCreateProgram, iM22830g);
            m22824a("glAttachShader");
            GLES20.glLinkProgram(iGlCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                Debuger.printfError("Could not link program: ");
                Debuger.printfError(GLES20.glGetProgramInfoLog(iGlCreateProgram));
                GLES20.glDeleteProgram(iGlCreateProgram);
                return 0;
            }
        }
        return iGlCreateProgram;
    }

    /* renamed from: d */
    public abstract GSYVideoGLView.InterfaceC7528c mo22827d();

    /* renamed from: e */
    public float[] m22828e() {
        return this.f25868f;
    }

    /* renamed from: f */
    public void m22829f() {
        int i10 = this.f25870h;
        if (i10 == 0 || this.f25871i == 0) {
            return;
        }
        Matrix.scaleM(this.f25868f, 0, i10 / this.f25867e.getWidth(), this.f25871i / this.f25867e.getHeight(), 1.0f);
    }

    /* renamed from: g */
    public int m22830g(int i10, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            GLES20.glCompileShader(iGlCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                Debuger.printfError("Could not compile shader " + i10 + ":");
                Debuger.printfError(GLES20.glGetShaderInfoLog(iGlCreateShader));
                GLES20.glDeleteShader(iGlCreateShader);
                return 0;
            }
        }
        return iGlCreateShader;
    }

    /* renamed from: h */
    public void m22831h(Surface surface) {
        this.f25877o.post(new a(surface));
    }

    /* renamed from: i */
    public void m22832i(int i10) {
        this.f25873k = i10;
    }

    /* renamed from: j */
    public void m22833j(int i10) {
        this.f25872j = i10;
    }

    /* renamed from: k */
    public void m22834k(int i10) {
        this.f25871i = i10;
    }

    /* renamed from: l */
    public void m22835l(int i10) {
        this.f25870h = i10;
    }

    /* renamed from: m */
    public abstract void mo22836m(GSYVideoGLView.InterfaceC7528c interfaceC7528c);

    /* renamed from: n */
    public void m22837n(InterfaceC10911a interfaceC10911a) {
        this.f25866d = interfaceC10911a;
    }

    /* renamed from: o */
    public void m22838o(InterfaceC10912b interfaceC10912b) {
        this.f25876n = interfaceC10912b;
    }

    /* renamed from: p */
    public abstract void mo22839p(InterfaceC10155e interfaceC10155e, boolean z10);

    /* renamed from: q */
    public void m22840q(float[] fArr) {
        this.f25868f = fArr;
    }

    /* renamed from: r */
    public void m22841r(GLSurfaceView gLSurfaceView) {
        this.f25867e = gLSurfaceView;
    }

    /* renamed from: s */
    public abstract void mo22842s();
}
