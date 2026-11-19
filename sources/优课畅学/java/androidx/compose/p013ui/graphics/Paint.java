package androidx.compose.p013ui.graphics;

import android.graphics.Shader;

/* loaded from: classes2.dex */
public interface Paint {
    android.graphics.Paint asFrameworkPaint();

    float getAlpha();

    /* renamed from: getBlendMode-0nO6VwU */
    int mo24148getBlendMode0nO6VwU();

    /* renamed from: getColor-0d7_KjU */
    long mo24149getColor0d7_KjU();

    ColorFilter getColorFilter();

    /* renamed from: getFilterQuality-f-v9h1I */
    int mo24150getFilterQualityfv9h1I();

    PathEffect getPathEffect();

    Shader getShader();

    /* renamed from: getStrokeCap-KaPHkGw */
    int mo24151getStrokeCapKaPHkGw();

    /* renamed from: getStrokeJoin-LxFBmk8 */
    int mo24152getStrokeJoinLxFBmk8();

    float getStrokeMiterLimit();

    float getStrokeWidth();

    /* renamed from: getStyle-TiuSbCo */
    int mo24153getStyleTiuSbCo();

    boolean isAntiAlias();

    void setAlpha(float f10);

    void setAntiAlias(boolean z10);

    /* renamed from: setBlendMode-s9anfk8 */
    void mo24154setBlendModes9anfk8(int i10);

    /* renamed from: setColor-8_81llA */
    void mo24155setColor8_81llA(long j10);

    void setColorFilter(ColorFilter colorFilter);

    /* renamed from: setFilterQuality-vDHp3xo */
    void mo24156setFilterQualityvDHp3xo(int i10);

    void setPathEffect(PathEffect pathEffect);

    void setShader(Shader shader);

    /* renamed from: setStrokeCap-BeK7IIE */
    void mo24157setStrokeCapBeK7IIE(int i10);

    /* renamed from: setStrokeJoin-Ww9F2mQ */
    void mo24158setStrokeJoinWw9F2mQ(int i10);

    void setStrokeMiterLimit(float f10);

    void setStrokeWidth(float f10);

    /* renamed from: setStyle-k9PVt8s */
    void mo24159setStylek9PVt8s(int i10);
}
