package androidx.camera.core.processing.util;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.processing.ShaderProvider;
import androidx.core.util.Preconditions;
import androidx.work.Data;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class GLUtils {
    public static final String BLANK_FRAGMENT_SHADER = "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n";
    public static final String BLANK_VERTEX_SHADER = "uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n";
    public static final String DEFAULT_VERTEX_SHADER;
    public static final String HDR_VERTEX_SHADER;
    public static final OutputSurface NO_OUTPUT_SURFACE;
    public static final int PIXEL_STRIDE = 4;
    private static final ShaderProvider SHADER_PROVIDER_DEFAULT;
    private static final ShaderProvider SHADER_PROVIDER_HDR_DEFAULT;
    private static final ShaderProvider SHADER_PROVIDER_HDR_YUV;
    public static final int SIZEOF_FLOAT = 4;
    public static final String TAG = "GLUtils";
    public static final FloatBuffer TEX_BUF;
    public static final float[] TEX_COORDS;
    public static final String VAR_TEXTURE = "sTexture";
    public static final String VAR_TEXTURE_COORD = "vTextureCoord";
    public static final String VERSION_UNKNOWN = "0.0";
    public static final FloatBuffer VERTEX_BUF;
    public static final float[] VERTEX_COORDS;
    public static final int[] EMPTY_ATTRIBS = {12344};
    public static final int EGL_GL_COLORSPACE_KHR = 12445;
    public static final int EGL_GL_COLORSPACE_BT2020_HLG_EXT = 13632;
    public static final int[] HLG_SURFACE_ATTRIBS = {EGL_GL_COLORSPACE_KHR, EGL_GL_COLORSPACE_BT2020_HLG_EXT, 12344};

    public static class BlankShaderProgram extends Program2D {
        public BlankShaderProgram() {
            super(GLUtils.BLANK_VERTEX_SHADER, GLUtils.BLANK_FRAGMENT_SHADER);
        }
    }

    public enum InputFormat {
        UNKNOWN,
        DEFAULT,
        YUV
    }

    public static abstract class Program2D {
        protected int mProgramHandle;
        protected int mTransMatrixLoc = -1;
        protected int mAlphaScaleLoc = -1;
        protected int mPositionLoc = -1;

        /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Program2D(@androidx.annotation.NonNull java.lang.String r7, @androidx.annotation.NonNull java.lang.String r8) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.String r0 = "glAttachShader"
                r6.<init>()
                r1 = -1
                r6.mTransMatrixLoc = r1
                r6.mAlphaScaleLoc = r1
                r6.mPositionLoc = r1
                r2 = 35633(0x8b31, float:4.9932E-41)
                int r7 = androidx.camera.core.processing.util.GLUtils.loadShader(r2, r7)     // Catch: java.lang.IllegalArgumentException -> L72 java.lang.IllegalStateException -> L76
                r2 = 35632(0x8b30, float:4.9931E-41)
                int r8 = androidx.camera.core.processing.util.GLUtils.loadShader(r2, r8)     // Catch: java.lang.IllegalArgumentException -> L6c java.lang.IllegalStateException -> L70
                int r2 = android.opengl.GLES20.glCreateProgram()     // Catch: java.lang.IllegalArgumentException -> L67 java.lang.IllegalStateException -> L6a
                java.lang.String r3 = "glCreateProgram"
                androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow(r3)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                android.opengl.GLES20.glAttachShader(r2, r7)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow(r0)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                android.opengl.GLES20.glAttachShader(r2, r8)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow(r0)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                android.opengl.GLES20.glLinkProgram(r2)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                r0 = 1
                int[] r3 = new int[r0]     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                r4 = 35714(0x8b82, float:5.0046E-41)
                r5 = 0
                android.opengl.GLES20.glGetProgramiv(r2, r4, r3, r5)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                r3 = r3[r5]     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                if (r3 != r0) goto L4c
                r6.mProgramHandle = r2     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                r6.loadLocations()
                return
            L48:
                r0 = move-exception
                goto L78
            L4a:
                r0 = move-exception
                goto L78
            L4c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                r3.<init>()     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                java.lang.String r4 = "Could not link program: "
                r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                java.lang.String r4 = android.opengl.GLES20.glGetProgramInfoLog(r2)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                java.lang.String r3 = r3.toString()     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                r0.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                throw r0     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            L67:
                r0 = move-exception
            L68:
                r2 = r1
                goto L78
            L6a:
                r0 = move-exception
                goto L68
            L6c:
                r0 = move-exception
            L6d:
                r8 = r1
            L6e:
                r2 = r8
                goto L78
            L70:
                r0 = move-exception
                goto L6d
            L72:
                r0 = move-exception
            L73:
                r7 = r1
                r8 = r7
                goto L6e
            L76:
                r0 = move-exception
                goto L73
            L78:
                if (r7 == r1) goto L7d
                android.opengl.GLES20.glDeleteShader(r7)
            L7d:
                if (r8 == r1) goto L82
                android.opengl.GLES20.glDeleteShader(r8)
            L82:
                if (r2 == r1) goto L87
                android.opengl.GLES20.glDeleteProgram(r2)
            L87:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.processing.util.GLUtils.Program2D.<init>(java.lang.String, java.lang.String):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void loadLocations() {
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.mProgramHandle, "aPosition");
            this.mPositionLoc = iGlGetAttribLocation;
            GLUtils.checkLocationOrThrow(iGlGetAttribLocation, "aPosition");
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.mProgramHandle, "uTransMatrix");
            this.mTransMatrixLoc = iGlGetUniformLocation;
            GLUtils.checkLocationOrThrow(iGlGetUniformLocation, "uTransMatrix");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.mProgramHandle, "uAlphaScale");
            this.mAlphaScaleLoc = iGlGetUniformLocation2;
            GLUtils.checkLocationOrThrow(iGlGetUniformLocation2, "uAlphaScale");
        }

        public void delete() {
            GLES20.glDeleteProgram(this.mProgramHandle);
        }

        public void updateAlpha(float f10) {
            GLES20.glUniform1f(this.mAlphaScaleLoc, f10);
            GLUtils.checkGlErrorOrThrow("glUniform1f");
        }

        public void updateTransformMatrix(@NonNull float[] fArr) {
            GLES20.glUniformMatrix4fv(this.mTransMatrixLoc, 1, false, fArr, 0);
            GLUtils.checkGlErrorOrThrow("glUniformMatrix4fv");
        }

        public void use() {
            GLES20.glUseProgram(this.mProgramHandle);
            GLUtils.checkGlErrorOrThrow("glUseProgram");
            GLES20.glEnableVertexAttribArray(this.mPositionLoc);
            GLUtils.checkGlErrorOrThrow("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.mPositionLoc, 2, 5126, false, 0, (Buffer) GLUtils.VERTEX_BUF);
            GLUtils.checkGlErrorOrThrow("glVertexAttribPointer");
            updateTransformMatrix(GLUtils.create4x4IdentityMatrix());
            updateAlpha(1.0f);
        }
    }

    public static class SamplerShaderProgram extends Program2D {
        private int mSamplerLoc;
        private int mTexCoordLoc;
        private int mTexMatrixLoc;

        public SamplerShaderProgram(@NonNull DynamicRange dynamicRange, @NonNull InputFormat inputFormat) {
            this(dynamicRange, resolveDefaultShaderProvider(dynamicRange, inputFormat));
        }

        private void loadLocations() {
            loadLocations();
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.mProgramHandle, GLUtils.VAR_TEXTURE);
            this.mSamplerLoc = iGlGetUniformLocation;
            GLUtils.checkLocationOrThrow(iGlGetUniformLocation, GLUtils.VAR_TEXTURE);
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.mProgramHandle, "aTextureCoord");
            this.mTexCoordLoc = iGlGetAttribLocation;
            GLUtils.checkLocationOrThrow(iGlGetAttribLocation, "aTextureCoord");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.mProgramHandle, "uTexMatrix");
            this.mTexMatrixLoc = iGlGetUniformLocation2;
            GLUtils.checkLocationOrThrow(iGlGetUniformLocation2, "uTexMatrix");
        }

        private static ShaderProvider resolveDefaultShaderProvider(@NonNull DynamicRange dynamicRange, @Nullable InputFormat inputFormat) {
            if (!dynamicRange.is10BitHdr()) {
                return GLUtils.SHADER_PROVIDER_DEFAULT;
            }
            Preconditions.checkArgument(inputFormat != InputFormat.UNKNOWN, "No default sampler shader available for" + inputFormat);
            return inputFormat == InputFormat.YUV ? GLUtils.SHADER_PROVIDER_HDR_YUV : GLUtils.SHADER_PROVIDER_HDR_DEFAULT;
        }

        public void updateTextureMatrix(@NonNull float[] fArr) {
            GLES20.glUniformMatrix4fv(this.mTexMatrixLoc, 1, false, fArr, 0);
            GLUtils.checkGlErrorOrThrow("glUniformMatrix4fv");
        }

        @Override // androidx.camera.core.processing.util.GLUtils.Program2D
        public void use() {
            super.use();
            GLES20.glUniform1i(this.mSamplerLoc, 0);
            GLES20.glEnableVertexAttribArray(this.mTexCoordLoc);
            GLUtils.checkGlErrorOrThrow("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.mTexCoordLoc, 2, 5126, false, 0, (Buffer) GLUtils.TEX_BUF);
            GLUtils.checkGlErrorOrThrow("glVertexAttribPointer");
        }

        public SamplerShaderProgram(@NonNull DynamicRange dynamicRange, @NonNull ShaderProvider shaderProvider) {
            super(dynamicRange.is10BitHdr() ? GLUtils.HDR_VERTEX_SHADER : GLUtils.DEFAULT_VERTEX_SHADER, GLUtils.getFragmentShaderSource(shaderProvider));
            this.mSamplerLoc = -1;
            this.mTexMatrixLoc = -1;
            this.mTexCoordLoc = -1;
            loadLocations();
        }
    }

    static {
        Locale locale = Locale.US;
        DEFAULT_VERTEX_SHADER = String.format(locale, "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 %s;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    %s = (uTexMatrix * aTextureCoord).xy;\n}\n", VAR_TEXTURE_COORD, VAR_TEXTURE_COORD);
        HDR_VERTEX_SHADER = String.format(locale, "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 %s;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  %s = (uTexMatrix * aTextureCoord).xy;\n}\n", VAR_TEXTURE_COORD, VAR_TEXTURE_COORD);
        SHADER_PROVIDER_DEFAULT = new ShaderProvider() { // from class: androidx.camera.core.processing.util.GLUtils.1
            @Override // androidx.camera.core.processing.ShaderProvider
            @NonNull
            public String createFragmentShader(@NonNull String str, @NonNull String str2) {
                return String.format(Locale.US, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 %s;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(%s, %s);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n", str2, str, str, str2);
            }
        };
        SHADER_PROVIDER_HDR_DEFAULT = new ShaderProvider() { // from class: androidx.camera.core.processing.util.GLUtils.2
            @Override // androidx.camera.core.processing.ShaderProvider
            @NonNull
            public String createFragmentShader(@NonNull String str, @NonNull String str2) {
                return String.format(Locale.US, "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nin vec2 %s;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(%s, %s);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}", str, str2, str, str2);
            }
        };
        SHADER_PROVIDER_HDR_YUV = new ShaderProvider() { // from class: androidx.camera.core.processing.util.GLUtils.3
            @Override // androidx.camera.core.processing.ShaderProvider
            @NonNull
            public String createFragmentShader(@NonNull String str, @NonNull String str2) {
                return String.format(Locale.US, "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT %s;\nuniform float uAlphaScale;\nin vec2 %s;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(%s, %s).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}", str, str2, str, str2);
            }
        };
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        VERTEX_COORDS = fArr;
        VERTEX_BUF = createFloatBuffer(fArr);
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        TEX_COORDS = fArr2;
        TEX_BUF = createFloatBuffer(fArr2);
        NO_OUTPUT_SURFACE = OutputSurface.m882of(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    private GLUtils() {
    }

    public static void checkEglErrorOrLog(@NonNull String str) {
        try {
            checkEglErrorOrThrow(str);
        } catch (IllegalStateException e10) {
            Logger.m726e(TAG, e10.toString(), e10);
        }
    }

    public static void checkEglErrorOrThrow(@NonNull String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new IllegalStateException(str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
    }

    public static void checkGlErrorOrThrow(@NonNull String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        throw new IllegalStateException(str + ": GL error 0x" + Integer.toHexString(iGlGetError));
    }

    public static void checkGlThreadOrThrow(@Nullable Thread thread) {
        Preconditions.checkState(thread == Thread.currentThread(), "Method call must be called on the GL thread.");
    }

    public static void checkInitializedOrThrow(@NonNull AtomicBoolean atomicBoolean, boolean z9) {
        Preconditions.checkState(z9 == atomicBoolean.get(), z9 ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized");
    }

    public static void checkLocationOrThrow(int i10, @NonNull String str) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalStateException("Unable to locate '" + str + "' in program");
    }

    @NonNull
    public static int[] chooseSurfaceAttrib(@NonNull String str, @NonNull DynamicRange dynamicRange) {
        int[] iArr = EMPTY_ATTRIBS;
        if (dynamicRange.getEncoding() == 3) {
            if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                return HLG_SURFACE_ATTRIBS;
            }
            Logger.m729w(TAG, "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
        }
        return iArr;
    }

    @NonNull
    public static float[] create4x4IdentityMatrix() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        return fArr;
    }

    @NonNull
    public static FloatBuffer createFloatBuffer(@NonNull float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    @NonNull
    public static EGLSurface createPBufferSurface(@NonNull EGLDisplay eGLDisplay, @NonNull EGLConfig eGLConfig, int i10, int i11) {
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, i10, 12374, i11, 12344}, 0);
        checkEglErrorOrThrow("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface != null) {
            return eGLSurfaceEglCreatePbufferSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    @NonNull
    public static Map<InputFormat, Program2D> createPrograms(@NonNull DynamicRange dynamicRange, @NonNull Map<InputFormat, ShaderProvider> map) {
        Object samplerShaderProgram;
        InputFormat inputFormat;
        HashMap map2 = new HashMap();
        InputFormat[] inputFormatArrValues = InputFormat.values();
        int length = inputFormatArrValues.length;
        for (int i10 = 0; i10 < length; i10++) {
            InputFormat inputFormat2 = inputFormatArrValues[i10];
            ShaderProvider shaderProvider = map.get(inputFormat2);
            if (shaderProvider != null) {
                samplerShaderProgram = new SamplerShaderProgram(dynamicRange, shaderProvider);
            } else if (inputFormat2 == InputFormat.YUV || inputFormat2 == (inputFormat = InputFormat.DEFAULT)) {
                samplerShaderProgram = new SamplerShaderProgram(dynamicRange, inputFormat2);
            } else {
                Preconditions.checkState(inputFormat2 == InputFormat.UNKNOWN, "Unhandled input format: " + inputFormat2);
                if (dynamicRange.is10BitHdr()) {
                    samplerShaderProgram = new BlankShaderProgram();
                } else {
                    ShaderProvider shaderProvider2 = map.get(inputFormat);
                    samplerShaderProgram = shaderProvider2 != null ? new SamplerShaderProgram(dynamicRange, shaderProvider2) : new SamplerShaderProgram(dynamicRange, inputFormat);
                }
            }
            Objects.toString(inputFormat2);
            samplerShaderProgram.toString();
            map2.put(inputFormat2, samplerShaderProgram);
        }
        return map2;
    }

    public static int createTexture() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        checkGlErrorOrThrow("glGenTextures");
        int i10 = iArr[0];
        GLES20.glBindTexture(36197, i10);
        checkGlErrorOrThrow("glBindTexture " + i10);
        GLES20.glTexParameteri(36197, 10241, 9728);
        GLES20.glTexParameteri(36197, Data.MAX_DATA_BYTES, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        checkGlErrorOrThrow("glTexParameter");
        return i10;
    }

    @NonNull
    public static EGLSurface createWindowSurface(@NonNull EGLDisplay eGLDisplay, @NonNull EGLConfig eGLConfig, @NonNull Surface surface, @NonNull int[] iArr) {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        checkEglErrorOrThrow("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static void deleteFbo(int i10) {
        GLES20.glDeleteFramebuffers(1, new int[]{i10}, 0);
        checkGlErrorOrThrow("glDeleteFramebuffers");
    }

    public static void deleteTexture(int i10) {
        GLES20.glDeleteTextures(1, new int[]{i10}, 0);
        checkGlErrorOrThrow("glDeleteTextures");
    }

    public static int generateFbo() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        checkGlErrorOrThrow("glGenFramebuffers");
        return iArr[0];
    }

    public static int generateTexture() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        checkGlErrorOrThrow("glGenTextures");
        return iArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getFragmentShaderSource(@NonNull ShaderProvider shaderProvider) {
        try {
            String strCreateFragmentShader = shaderProvider.createFragmentShader(VAR_TEXTURE, VAR_TEXTURE_COORD);
            if (strCreateFragmentShader != null && strCreateFragmentShader.contains(VAR_TEXTURE_COORD) && strCreateFragmentShader.contains(VAR_TEXTURE)) {
                return strCreateFragmentShader;
            }
            throw new IllegalArgumentException("Invalid fragment shader");
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException("Unable retrieve fragment shader source", th);
        }
    }

    @NonNull
    public static String getGlVersionNumber() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return VERSION_UNKNOWN;
        }
        return ((String) Preconditions.checkNotNull(matcher.group(1))) + "." + ((String) Preconditions.checkNotNull(matcher.group(2)));
    }

    @NonNull
    public static Size getSurfaceSize(@NonNull EGLDisplay eGLDisplay, @NonNull EGLSurface eGLSurface) {
        return new Size(querySurface(eGLDisplay, eGLSurface, 12375), querySurface(eGLDisplay, eGLSurface, 12374));
    }

    public static int loadShader(int i10, @NonNull String str) {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        checkGlErrorOrThrow("glCreateShader type=" + i10);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        Logger.m729w(TAG, "Could not compile shader: " + str);
        GLES20.glDeleteShader(iGlCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i10 + ":" + GLES20.glGetShaderInfoLog(iGlCreateShader));
    }

    public static int querySurface(@NonNull EGLDisplay eGLDisplay, @NonNull EGLSurface eGLSurface, int i10) {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i10, iArr, 0);
        return iArr[0];
    }
}
