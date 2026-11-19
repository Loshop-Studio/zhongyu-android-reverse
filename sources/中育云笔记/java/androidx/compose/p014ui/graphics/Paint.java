package androidx.compose.p014ui.graphics;

import android.graphics.Shader;

/* loaded from: classes2.dex */
public interface Paint {
    android.graphics.Paint asFrameworkPaint();

    float getAlpha();

    /* renamed from: getBlendMode-0nO6VwU */
    int mo30750getBlendMode0nO6VwU();

    /* renamed from: getColor-0d7_KjU */
    long mo30751getColor0d7_KjU();

    ColorFilter getColorFilter();

    /* renamed from: getFilterQuality-f-v9h1I */
    int mo30752getFilterQualityfv9h1I();

    PathEffect getPathEffect();

    Shader getShader();

    /* renamed from: getStrokeCap-KaPHkGw */
    int mo30753getStrokeCapKaPHkGw();

    /* renamed from: getStrokeJoin-LxFBmk8 */
    int mo30754getStrokeJoinLxFBmk8();

    float getStrokeMiterLimit();

    float getStrokeWidth();

    /* renamed from: getStyle-TiuSbCo */
    int mo30755getStyleTiuSbCo();

    boolean isAntiAlias();

    void setAlpha(float f10);

    void setAntiAlias(boolean z10);

    /* renamed from: setBlendMode-s9anfk8 */
    void mo30756setBlendModes9anfk8(int i10);

    /* renamed from: setColor-8_81llA */
    void mo30757setColor8_81llA(long j10);

    void setColorFilter(ColorFilter colorFilter);

    /* renamed from: setFilterQuality-vDHp3xo */
    void mo30758setFilterQualityvDHp3xo(int i10);

    void setPathEffect(PathEffect pathEffect);

    void setShader(Shader shader);

    /* renamed from: setStrokeCap-BeK7IIE */
    void mo30759setStrokeCapBeK7IIE(int i10);

    /* renamed from: setStrokeJoin-Ww9F2mQ */
    void mo30760setStrokeJoinWw9F2mQ(int i10);

    void setStrokeMiterLimit(float f10);

    void setStrokeWidth(float f10);

    /* renamed from: setStyle-k9PVt8s */
    void mo30761setStylek9PVt8s(int i10);
}
