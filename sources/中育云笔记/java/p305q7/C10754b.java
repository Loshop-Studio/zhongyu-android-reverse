package p305q7;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.view.Surface;
import androidx.work.Data;
import com.shuyu.gsyvideoplayer.render.view.GSYVideoGLView;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p236l7.InterfaceC10155e;
import p291p7.C10635a;

/* renamed from: q7.b */
/* loaded from: classes5.dex */
public class C10754b extends AbstractC10753a {

    /* renamed from: A */
    public SurfaceTexture f25883A;

    /* renamed from: B */
    public InterfaceC10155e f25884B;

    /* renamed from: p */
    public final float[] f25886p;

    /* renamed from: r */
    public int f25888r;

    /* renamed from: t */
    public int f25890t;

    /* renamed from: u */
    public int f25891u;

    /* renamed from: v */
    public int f25892v;

    /* renamed from: w */
    public int f25893w;

    /* renamed from: z */
    public FloatBuffer f25896z;

    /* renamed from: q */
    public final String f25887q = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";

    /* renamed from: s */
    public int[] f25889s = new int[2];

    /* renamed from: x */
    public boolean f25894x = false;

    /* renamed from: y */
    public boolean f25895y = false;

    /* renamed from: C */
    public GSYVideoGLView.InterfaceC7528c f25885C = new C10635a();

    public C10754b() {
        float[] fArr = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        this.f25886p = fArr;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f25896z = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        Matrix.setIdentityM(this.f25869g, 0);
        Matrix.setIdentityM(this.f25868f, 0);
    }

    @Override // p305q7.AbstractC10753a
    /* renamed from: d */
    public GSYVideoGLView.InterfaceC7528c mo22827d() {
        return this.f25885C;
    }

    @Override // p305q7.AbstractC10753a
    /* renamed from: m */
    public void mo22836m(GSYVideoGLView.InterfaceC7528c interfaceC7528c) {
        if (interfaceC7528c != null) {
            this.f25885C = interfaceC7528c;
        }
        this.f25874l = true;
        this.f25875m = true;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        synchronized (this) {
            try {
                if (this.f25894x) {
                    this.f25883A.updateTexImage();
                    this.f25883A.getTransformMatrix(this.f25869g);
                    this.f25894x = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m22846w();
        m22843t();
        m22847x();
        m22848y(gl10);
        GLES20.glFinish();
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public synchronized void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f25894x = true;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        GLES20.glViewport(0, 0, i10, i11);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int iM22826c = m22826c(m22845v(), m22844u());
        this.f25888r = iM22826c;
        if (iM22826c == 0) {
            return;
        }
        this.f25892v = GLES20.glGetAttribLocation(iM22826c, "aPosition");
        m22824a("glGetAttribLocation aPosition");
        if (this.f25892v == -1) {
            throw new RuntimeException("Could not get attrib location for aPosition");
        }
        this.f25893w = GLES20.glGetAttribLocation(this.f25888r, "aTextureCoord");
        m22824a("glGetAttribLocation aTextureCoord");
        if (this.f25893w == -1) {
            throw new RuntimeException("Could not get attrib location for aTextureCoord");
        }
        this.f25890t = GLES20.glGetUniformLocation(this.f25888r, "uMVPMatrix");
        m22824a("glGetUniformLocation uMVPMatrix");
        if (this.f25890t == -1) {
            throw new RuntimeException("Could not get attrib location for uMVPMatrix");
        }
        this.f25891u = GLES20.glGetUniformLocation(this.f25888r, "uSTMatrix");
        m22824a("glGetUniformLocation uSTMatrix");
        if (this.f25891u == -1) {
            throw new RuntimeException("Could not get attrib location for uSTMatrix");
        }
        GLES20.glGenTextures(2, this.f25889s, 0);
        GLES20.glBindTexture(36197, this.f25889s[0]);
        m22824a("glBindTexture mTextureID");
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, Data.MAX_DATA_BYTES, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f25889s[0]);
        this.f25883A = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        m22831h(new Surface(this.f25883A));
    }

    @Override // p305q7.AbstractC10753a
    /* renamed from: p */
    public void mo22839p(InterfaceC10155e interfaceC10155e, boolean z10) {
        this.f25884B = interfaceC10155e;
        this.f25865c = z10;
    }

    @Override // p305q7.AbstractC10753a
    /* renamed from: s */
    public void mo22842s() {
        this.f25895y = true;
    }

    /* renamed from: t */
    public void m22843t() {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f25889s[0]);
    }

    /* renamed from: u */
    public String m22844u() {
        return this.f25885C.mo9754a(this.f25867e);
    }

    /* renamed from: v */
    public String m22845v() {
        return "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
    }

    /* renamed from: w */
    public void m22846w() {
        if (this.f25874l) {
            this.f25888r = m22826c(m22845v(), m22844u());
            this.f25874l = false;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.f25888r);
        m22824a("glUseProgram");
    }

    /* renamed from: x */
    public void m22847x() {
        this.f25896z.position(0);
        GLES20.glVertexAttribPointer(this.f25892v, 3, 5126, false, 20, (Buffer) this.f25896z);
        m22824a("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.f25892v);
        m22824a("glEnableVertexAttribArray maPositionHandle");
        this.f25896z.position(3);
        GLES20.glVertexAttribPointer(this.f25893w, 3, 5126, false, 20, (Buffer) this.f25896z);
        m22824a("glVertexAttribPointer maTextureHandle");
        GLES20.glEnableVertexAttribArray(this.f25893w);
        m22824a("glEnableVertexAttribArray maTextureHandle");
        GLES20.glUniformMatrix4fv(this.f25890t, 1, false, this.f25868f, 0);
        GLES20.glUniformMatrix4fv(this.f25891u, 1, false, this.f25869g, 0);
        GLES20.glDrawArrays(5, 0, 4);
        m22824a("glDrawArrays");
    }

    /* renamed from: y */
    public void m22848y(GL10 gl10) {
        if (this.f25895y) {
            this.f25895y = false;
            if (this.f25884B != null) {
                this.f25884B.mo9746a(m22825b(0, 0, this.f25867e.getWidth(), this.f25867e.getHeight(), gl10));
            }
        }
    }
}
