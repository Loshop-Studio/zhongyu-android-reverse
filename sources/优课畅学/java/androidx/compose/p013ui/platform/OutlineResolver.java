package androidx.compose.p013ui.platform;

import android.graphics.Outline;
import android.os.Build;
import androidx.compose.p013ui.geometry.CornerRadius;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.geometry.RoundRect;
import androidx.compose.p013ui.geometry.RoundRectKt;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.graphics.AndroidPath;
import androidx.compose.p013ui.graphics.AndroidPath_androidKt;
import androidx.compose.p013ui.graphics.Canvas;
import androidx.compose.p013ui.graphics.Outline;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class OutlineResolver {
    public static final int $stable = 8;
    private boolean cacheIsDirty;
    private final Outline cachedOutline;
    private Path cachedRrectPath;
    private boolean isSupportedOutline = true;
    private androidx.compose.p013ui.graphics.Outline outline;
    private boolean outlineNeeded;
    private Path outlinePath;
    private long rectSize;
    private long rectTopLeft;
    private float roundedCornerRadius;
    private Path tmpOpPath;
    private Path tmpPath;
    private RoundRect tmpRoundRect;
    private Path tmpTouchPointPath;
    private boolean usePathForClip;

    public OutlineResolver() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.cachedOutline = outline;
        this.rectTopLeft = Offset.Companion.m24051getZeroF1C5BW0();
        this.rectSize = Size.Companion.m24113getZeroNHjbRc();
    }

    /* renamed from: isSameBounds-4L21HEs, reason: not valid java name */
    private final boolean m26094isSameBounds4L21HEs(RoundRect roundRect, long j10, long j11, float f10) {
        if (roundRect != null && RoundRectKt.isSimple(roundRect)) {
            int i10 = (int) (j10 >> 32);
            if (roundRect.getLeft() == Float.intBitsToFloat(i10)) {
                int i11 = (int) (j10 & 4294967295L);
                if (roundRect.getTop() == Float.intBitsToFloat(i11) && roundRect.getRight() == Float.intBitsToFloat(i10) + Float.intBitsToFloat((int) (j11 >> 32)) && roundRect.getBottom() == Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j11 & 4294967295L)) && Float.intBitsToFloat((int) (roundRect.m24085getTopLeftCornerRadiuskKHJgLs() >> 32)) == f10) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void updateCache() {
        if (this.cacheIsDirty) {
            this.rectTopLeft = Offset.Companion.m24051getZeroF1C5BW0();
            this.roundedCornerRadius = 0.0f;
            this.outlinePath = null;
            this.cacheIsDirty = false;
            this.usePathForClip = false;
            androidx.compose.p013ui.graphics.Outline outline = this.outline;
            if (outline == null || !this.outlineNeeded || Float.intBitsToFloat((int) (this.rectSize >> 32)) <= 0.0f || Float.intBitsToFloat((int) (this.rectSize & 4294967295L)) <= 0.0f) {
                this.cachedOutline.setEmpty();
                return;
            }
            this.isSupportedOutline = true;
            if (outline instanceof Outline.Rectangle) {
                updateCacheWithRect(((Outline.Rectangle) outline).getRect());
            } else if (outline instanceof Outline.Rounded) {
                updateCacheWithRoundRect(((Outline.Rounded) outline).getRoundRect());
            } else if (outline instanceof Outline.Generic) {
                updateCacheWithPath(((Outline.Generic) outline).getPath());
            }
        }
    }

    private final void updateCacheWithPath(Path path) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 28 || path.isConvex()) {
            if (i10 >= 30) {
                OutlineVerificationHelper.INSTANCE.setPath(this.cachedOutline, path);
            } else {
                android.graphics.Outline outline = this.cachedOutline;
                if (!(path instanceof AndroidPath)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                outline.setConvexPath(((AndroidPath) path).getInternalPath());
            }
            this.usePathForClip = !this.cachedOutline.canClip();
        } else {
            this.isSupportedOutline = false;
            this.cachedOutline.setEmpty();
            this.usePathForClip = true;
        }
        this.outlinePath = path;
    }

    private final void updateCacheWithRect(Rect rect) {
        float left = rect.getLeft();
        float top2 = rect.getTop();
        this.rectTopLeft = Offset.m24027constructorimpl((Float.floatToRawIntBits(top2) & 4294967295L) | (Float.floatToRawIntBits(left) << 32));
        float right = rect.getRight() - rect.getLeft();
        float bottom = rect.getBottom() - rect.getTop();
        this.rectSize = Size.m24095constructorimpl((Float.floatToRawIntBits(bottom) & 4294967295L) | (Float.floatToRawIntBits(right) << 32));
        this.cachedOutline.setRect(Math.round(rect.getLeft()), Math.round(rect.getTop()), Math.round(rect.getRight()), Math.round(rect.getBottom()));
    }

    private final void updateCacheWithRoundRect(RoundRect roundRect) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (roundRect.m24085getTopLeftCornerRadiuskKHJgLs() >> 32));
        float left = roundRect.getLeft();
        float top2 = roundRect.getTop();
        this.rectTopLeft = Offset.m24027constructorimpl((Float.floatToRawIntBits(top2) & 4294967295L) | (Float.floatToRawIntBits(left) << 32));
        float width = roundRect.getWidth();
        float height = roundRect.getHeight();
        this.rectSize = Size.m24095constructorimpl((Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32));
        if (RoundRectKt.isSimple(roundRect)) {
            this.cachedOutline.setRoundRect(Math.round(roundRect.getLeft()), Math.round(roundRect.getTop()), Math.round(roundRect.getRight()), Math.round(roundRect.getBottom()), fIntBitsToFloat);
            this.roundedCornerRadius = fIntBitsToFloat;
            return;
        }
        Path Path = this.cachedRrectPath;
        if (Path == null) {
            Path = AndroidPath_androidKt.Path();
            this.cachedRrectPath = Path;
        }
        Path.reset();
        Path.addRoundRect$default(Path, roundRect, null, 2, null);
        updateCacheWithPath(Path);
    }

    public final void clipToOutline(Canvas canvas) {
        OutlineResolver outlineResolver;
        Path clipPath = getClipPath();
        if (clipPath != null) {
            Canvas.m24247clipPathmtrdDE$default(canvas, clipPath, 0, 2, null);
            return;
        }
        float f10 = this.roundedCornerRadius;
        if (f10 <= 0.0f) {
            Canvas.m24248clipRectN_I0leg$default(canvas, Float.intBitsToFloat((int) (this.rectTopLeft >> 32)), Float.intBitsToFloat((int) (this.rectTopLeft & 4294967295L)), Float.intBitsToFloat((int) (this.rectSize >> 32)) + Float.intBitsToFloat((int) (this.rectTopLeft >> 32)), Float.intBitsToFloat((int) (this.rectSize & 4294967295L)) + Float.intBitsToFloat((int) (this.rectTopLeft & 4294967295L)), 0, 16, null);
            return;
        }
        Path Path = this.tmpPath;
        RoundRect roundRect = this.tmpRoundRect;
        if (Path != null) {
            outlineResolver = this;
            if (!m26094isSameBounds4L21HEs(roundRect, this.rectTopLeft, this.rectSize, f10)) {
            }
            Canvas.m24247clipPathmtrdDE$default(canvas, Path, 0, 2, null);
        }
        outlineResolver = this;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (outlineResolver.rectTopLeft >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (outlineResolver.rectTopLeft & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (outlineResolver.rectSize >> 32)) + Float.intBitsToFloat((int) (outlineResolver.rectTopLeft >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (outlineResolver.rectSize & 4294967295L)) + Float.intBitsToFloat((int) (outlineResolver.rectTopLeft & 4294967295L));
        float f11 = outlineResolver.roundedCornerRadius;
        RoundRect roundRectM24089RoundRectgG7oq9Y = RoundRectKt.m24089RoundRectgG7oq9Y(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, CornerRadius.m23989constructorimpl((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L)));
        if (Path == null) {
            Path = AndroidPath_androidKt.Path();
        } else {
            Path.reset();
        }
        Path.addRoundRect$default(Path, roundRectM24089RoundRectgG7oq9Y, null, 2, null);
        outlineResolver.tmpRoundRect = roundRectM24089RoundRectgG7oq9Y;
        outlineResolver.tmpPath = Path;
        Canvas.m24247clipPathmtrdDE$default(canvas, Path, 0, 2, null);
    }

    public final android.graphics.Outline getAndroidOutline() {
        updateCache();
        if (this.outlineNeeded && this.isSupportedOutline) {
            return this.cachedOutline;
        }
        return null;
    }

    public final boolean getCacheIsDirty$ui_release() {
        return this.cacheIsDirty;
    }

    public final Path getClipPath() {
        updateCache();
        return this.outlinePath;
    }

    public final boolean getOutlineClipSupported() {
        return !this.usePathForClip;
    }

    /* renamed from: isInOutline-k-4lQ0M, reason: not valid java name */
    public final boolean m26095isInOutlinek4lQ0M(long j10) {
        androidx.compose.p013ui.graphics.Outline outline;
        if (this.outlineNeeded && (outline = this.outline) != null) {
            return ShapeContainingUtilKt.isInOutline(outline, Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), this.tmpTouchPointPath, this.tmpOpPath);
        }
        return true;
    }

    /* renamed from: update-S_szKao, reason: not valid java name */
    public final boolean m26096updateS_szKao(androidx.compose.p013ui.graphics.Outline outline, float f10, boolean z10, float f11, long j10) {
        this.cachedOutline.setAlpha(f10);
        boolean zM16128b = AbstractC9133u.m16128b(this.outline, outline);
        boolean z11 = !zM16128b;
        if (!zM16128b) {
            this.outline = outline;
            this.cacheIsDirty = true;
        }
        this.rectSize = j10;
        boolean z12 = outline != null && (z10 || f11 > 0.0f);
        if (this.outlineNeeded != z12) {
            this.outlineNeeded = z12;
            this.cacheIsDirty = true;
        }
        return z11;
    }
}
