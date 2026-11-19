package p291p7;

import android.opengl.GLSurfaceView;
import com.shuyu.gsyvideoplayer.render.view.GSYVideoGLView;

/* renamed from: p7.a */
/* loaded from: classes5.dex */
public class C10635a implements GSYVideoGLView.InterfaceC7528c {
    @Override // com.shuyu.gsyvideoplayer.render.view.GSYVideoGLView.InterfaceC7528c
    /* renamed from: a */
    public String mo9754a(GLSurfaceView gLSurfaceView) {
        return "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    }
}
