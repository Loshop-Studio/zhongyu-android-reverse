package com.xuexiang.xui.widget.imageview.edit;

import android.opengl.GLES20;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes.dex */
class TextureRenderer {
    private static final int FLOAT_SIZE_BYTES = 4;
    private static final String FRAGMENT_SHADER = "precision mediump float;\nuniform sampler2D tex_sampler;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_FragColor = texture2D(tex_sampler, v_texcoord);\n}\n";
    private static final String VERTEX_SHADER = "attribute vec4 a_position;\nattribute vec2 a_texcoord;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_Position = a_position;\n  v_texcoord = a_texcoord;\n}\n";
    private int mPosCoordHandle;
    private FloatBuffer mPosVertices;
    private int mProgram;
    private int mTexCoordHandle;
    private int mTexHeight;
    private int mTexSamplerHandle;
    private FloatBuffer mTexVertices;
    private int mTexWidth;
    private int mViewHeight;
    private int mViewWidth;
    private static final float[] TEX_VERTICES = {IGoodView.DEFAULT_TO_ALPHA, 1.0f, 1.0f, 1.0f, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, 1.0f, IGoodView.DEFAULT_TO_ALPHA};
    private static final float[] POS_VERTICES = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    TextureRenderer() {
    }

    private void computeOutputVertices() {
        float f4;
        FloatBuffer floatBuffer = this.mPosVertices;
        if (floatBuffer != null) {
            float f5 = (this.mViewWidth / this.mViewHeight) / (this.mTexWidth / this.mTexHeight);
            float f6 = -1.0f;
            float f7 = 1.0f;
            if (f5 > 1.0f) {
                f7 = 1.0f / f5;
                f6 = (-1.0f) / f5;
                f5 = 1.0f;
                f4 = -1.0f;
            } else {
                f4 = -f5;
            }
            floatBuffer.put(new float[]{f6, f4, f7, f4, f6, f5, f7, f5}).position(0);
        }
    }

    void init() {
        int iCreateProgram = GLToolbox.createProgram(VERTEX_SHADER, FRAGMENT_SHADER);
        this.mProgram = iCreateProgram;
        this.mTexSamplerHandle = GLES20.glGetUniformLocation(iCreateProgram, "tex_sampler");
        this.mTexCoordHandle = GLES20.glGetAttribLocation(this.mProgram, "a_texcoord");
        this.mPosCoordHandle = GLES20.glGetAttribLocation(this.mProgram, "a_position");
        float[] fArr = TEX_VERTICES;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.mTexVertices = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        float[] fArr2 = POS_VERTICES;
        FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.mPosVertices = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.put(fArr2).position(0);
    }

    void renderTexture(int i4) {
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glUseProgram(this.mProgram);
        GLToolbox.checkGlError("glUseProgram");
        GLES20.glViewport(0, 0, this.mViewWidth, this.mViewHeight);
        GLToolbox.checkGlError("glViewport");
        GLES20.glDisable(3042);
        GLES20.glVertexAttribPointer(this.mTexCoordHandle, 2, 5126, false, 0, (Buffer) this.mTexVertices);
        GLES20.glEnableVertexAttribArray(this.mTexCoordHandle);
        GLES20.glVertexAttribPointer(this.mPosCoordHandle, 2, 5126, false, 0, (Buffer) this.mPosVertices);
        GLES20.glEnableVertexAttribArray(this.mPosCoordHandle);
        GLToolbox.checkGlError("vertex attribute setup");
        GLES20.glActiveTexture(33984);
        GLToolbox.checkGlError("glActiveTexture");
        GLES20.glBindTexture(3553, i4);
        GLToolbox.checkGlError("glBindTexture");
        GLES20.glUniform1i(this.mTexSamplerHandle, 0);
        GLES20.glClearColor(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, 1.0f);
        GLES20.glClear(16384);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public void tearDown() {
        GLES20.glDeleteProgram(this.mProgram);
    }

    void updateTextureSize(int i4, int i5) {
        this.mTexWidth = i4;
        this.mTexHeight = i5;
        computeOutputVertices();
    }

    void updateViewSize(int i4, int i5) {
        this.mViewWidth = i4;
        this.mViewHeight = i5;
        computeOutputVertices();
    }
}
