package androidx.compose.p013ui.graphics;

import android.graphics.Paint;
import android.graphics.Shader;

/* loaded from: classes2.dex */
public final class AndroidPaint implements Paint {
    private int _blendMode;
    private ColorFilter internalColorFilter;
    private Paint internalPaint;
    private Shader internalShader;
    private PathEffect pathEffect;

    public AndroidPaint(Paint paint) {
        this.internalPaint = paint;
        this._blendMode = BlendMode.Companion.m24218getSrcOver0nO6VwU();
    }

    @Override // androidx.compose.p013ui.graphics.Paint
    public Paint asFrameworkPaint() {
        return this.internalPaint;
    }

    @Override // androidx.compose.p013ui.graphics.Paint
    public float getAlpha() {
        return AndroidPaint_androidKt.getNativeAlpha(this.internalPaint);
    }

    @Override // androidx.compose.p013ui.graphics.Paint
    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public int mo24148getBlendMode0nO6VwU() {
        return this._blendMode;
    }

    @Override // androidx.compose.p013ui.graphics.Paint
    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public long mo24149getColor0d7_KjU() {
        return AndroidPaint_androidKt.getNativeColor(this.internalPaint);
    }

    @Override // androidx.compose.p013ui.graphics.Paint
    public ColorFilter getColorFilter() {
        return this.internalColorFilter;
    }

    @Override // androidx.compose.p013ui.graphics.Paint
    /* renamed from: getFilterQuality-f-v9h1I, reason: not valid java name */
    public int mo24150getFilterQualityfv9h1I() {
        return AndroidPaint_androidKt.getNativeFilterQuality(this.internalPaint);
    }

    @Override // androidx.compose.p013ui.graphics.Paint
    public PathEffect getPathEffect() {
        return this.pathEffect;
    }

    @Override // androidx.compose.p013ui.graphics.Paint
    public Shader getShader() {
        return this.internalShader;
    }

    @Override // androidx.compose.p013ui.graphics.Paint
    /* renamed from: getStrokeCap-KaPHkGw, reason: not valid java name */
    public int mo24151getStrokeCapKaPHkGw() {
        return AndroidPaint_androidKt.getNativeStrokeCap(this.internalPaint);
    }

    @Override // androidx.compose.p013ui.graphics.Paint
    /* renamed from: getStrokeJoin-LxFBmk8, reason: not valid java name */
    public int mo24152getStrokeJoinLxFBmk8() {
        return AndroidPaint_androidKt.getNativeStrokeJoin(this.internalPaint);
    }

    @Override // androidx.compose.p013ui.graphics.Paint
    public float getStrokeMiterLimit() {
        return AndroidPaint_androidKt.getNativeStrokeMiterLimit(this.internalPaint);
    }

    @Override // androidx.compose.p013ui.graphics.Paint
    public float getStrokeWidth() {
        return AndroidPaint_androidKt.getNativeStrokeWidth(this.internalPaint);
    }

    @Override // androidx.compose.p013ui.graphics.Paint
    /* renamed from: getStyle-TiuSbCo, reason: not valid java name */
    public int mo24153getStyleTiuSbCo() {
        return AndroidPaint_androidKt.getNativeStyle(this.internalPaint);
    }

    @Override // androidx.compose.p013ui.graphics.Paint
    public boolean isAntiAlias() {
        return AndroidPaint_androidKt.getNativeAntiAlias(this.internalPaint);
    }

    @Override // androidx.compose.p013ui.graphics.Paint
    public void setAlpha(float f10) {
        AndroidPaint_androidKt.setNativeAlpha(this.internalPaint, f10);
    }

    @Override // androidx.compose.p013ui.graphics.Paint
    public void setAntiAlias(boolean z10) {
        AndroidPaint_androidKt.setNativeAntiAlias(this.internalPaint, z10);
    }

    @Override // androidx.compose.p013ui.graphics.Paint
    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public void mo24154setBlendModes9anfk8(int i10) {
        if (BlendMode.m24187equalsimpl0(this._blendMode, i10)) {
            return;
        }
        this._blendMode = i10;
        AndroidPaint_androidKt.m24160setNativeBlendModeGB0RdKg(this.internalPaint, i10);
    }

    @Override // androidx.compose.p013ui.graphics.Paint
    /* renamed from: setColor-8_81llA, reason: not valid java name */
    public void mo24155setColor8_81llA(long j10) {
        AndroidPaint_androidKt.m24161setNativeColor4WTKRHQ(this.internalPaint, j10);
    }

    @Override // androidx.compose.p013ui.graphics.Paint
    public void setColorFilter(ColorFilter colorFilter) {
        this.internalColorFilter = colorFilter;
        AndroidPaint_androidKt.setNativeColorFilter(this.internalPaint, colorFilter);
    }

    @Override // androidx.compose.p013ui.graphics.Paint
    /* renamed from: setFilterQuality-vDHp3xo, reason: not valid java name */
    public void mo24156setFilterQualityvDHp3xo(int i10) {
        AndroidPaint_androidKt.m24162setNativeFilterQuality50PEsBU(this.internalPaint, i10);
    }

    @Override // androidx.compose.p013ui.graphics.Paint
    public void setPathEffect(PathEffect pathEffect) {
        AndroidPaint_androidKt.setNativePathEffect(this.internalPaint, pathEffect);
        this.pathEffect = pathEffect;
    }

    @Override // androidx.compose.p013ui.graphics.Paint
    public void setShader(Shader shader) {
        this.internalShader = shader;
        AndroidPaint_androidKt.setNativeShader(this.internalPaint, shader);
    }

    @Override // androidx.compose.p013ui.graphics.Paint
    /* renamed from: setStrokeCap-BeK7IIE, reason: not valid java name */
    public void mo24157setStrokeCapBeK7IIE(int i10) {
        AndroidPaint_androidKt.m24163setNativeStrokeCapCSYIeUk(this.internalPaint, i10);
    }

    @Override // androidx.compose.p013ui.graphics.Paint
    /* renamed from: setStrokeJoin-Ww9F2mQ, reason: not valid java name */
    public void mo24158setStrokeJoinWw9F2mQ(int i10) {
        AndroidPaint_androidKt.m24164setNativeStrokeJoinkLtJ_vA(this.internalPaint, i10);
    }

    @Override // androidx.compose.p013ui.graphics.Paint
    public void setStrokeMiterLimit(float f10) {
        AndroidPaint_androidKt.setNativeStrokeMiterLimit(this.internalPaint, f10);
    }

    @Override // androidx.compose.p013ui.graphics.Paint
    public void setStrokeWidth(float f10) {
        AndroidPaint_androidKt.setNativeStrokeWidth(this.internalPaint, f10);
    }

    @Override // androidx.compose.p013ui.graphics.Paint
    /* renamed from: setStyle-k9PVt8s, reason: not valid java name */
    public void mo24159setStylek9PVt8s(int i10) {
        AndroidPaint_androidKt.m24165setNativeStyle5YerkU(this.internalPaint, i10);
    }

    public AndroidPaint() {
        this(AndroidPaint_androidKt.makeNativePaint());
    }
}
