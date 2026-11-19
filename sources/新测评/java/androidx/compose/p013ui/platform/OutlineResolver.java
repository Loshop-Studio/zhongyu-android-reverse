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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)J\u0018\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\u001dø\u0001\u0000¢\u0006\u0004\b,\u0010-J:\u0010.\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010/\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\b2\u0006\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u001aø\u0001\u0000¢\u0006\u0004\b2\u00103J\b\u00104\u001a\u00020'H\u0002J\u0010\u00105\u001a\u00020'2\u0006\u00106\u001a\u00020\u000eH\u0002J\u0010\u00107\u001a\u00020'2\u0006\u00108\u001a\u000209H\u0002J\u0010\u0010:\u001a\u00020'2\u0006\u0010;\u001a\u00020#H\u0002J0\u0010<\u001a\u00020\b*\u0004\u0018\u00010#2\u0006\u0010=\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001a2\u0006\u0010>\u001a\u00020\u001fH\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010@R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000bR\u000e\u0010\u0017\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\u00020\u001aX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u001dX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001bR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, m13558d2 = {"Landroidx/compose/ui/platform/OutlineResolver;", "", "()V", "androidOutline", "Landroid/graphics/Outline;", "getAndroidOutline", "()Landroid/graphics/Outline;", "<set-?>", "", "cacheIsDirty", "getCacheIsDirty$ui_release", "()Z", "cachedOutline", "cachedRrectPath", "Landroidx/compose/ui/graphics/Path;", "clipPath", "getClipPath", "()Landroidx/compose/ui/graphics/Path;", "isSupportedOutline", "outline", "Landroidx/compose/ui/graphics/Outline;", "outlineClipSupported", "getOutlineClipSupported", "outlineNeeded", "outlinePath", "rectSize", "Landroidx/compose/ui/geometry/Size;", "J", "rectTopLeft", "Landroidx/compose/ui/geometry/Offset;", "roundedCornerRadius", "", "tmpOpPath", "tmpPath", "tmpRoundRect", "Landroidx/compose/ui/geometry/RoundRect;", "tmpTouchPointPath", "usePathForClip", "clipToOutline", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "isInOutline", RequestParameters.POSITION, "isInOutline-k-4lQ0M", "(J)Z", "update", "alpha", "elevation", "size", "update-S_szKao", "(Landroidx/compose/ui/graphics/Outline;FZFJ)Z", "updateCache", "updateCacheWithPath", "composePath", "updateCacheWithRect", "rect", "Landroidx/compose/ui/geometry/Rect;", "updateCacheWithRoundRect", "roundRect", "isSameBounds", TypedValues.CycleType.S_WAVE_OFFSET, "radius", "isSameBounds-4L21HEs", "(Landroidx/compose/ui/geometry/RoundRect;JJF)Z", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nOutlineResolver.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 7 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 8 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 9 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 10 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 11 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 12 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,322:1\n1#2:323\n65#3:324\n69#3:327\n65#3:329\n69#3:332\n65#3:335\n69#3:339\n65#3:347\n69#3:350\n65#3:353\n69#3:357\n65#3:404\n69#3:407\n65#3:410\n69#3:414\n60#4:325\n70#4:328\n60#4:330\n70#4:333\n60#4:336\n70#4:340\n53#4,3:344\n60#4:348\n70#4:351\n60#4:354\n70#4:358\n60#4:362\n70#4:365\n53#4,3:367\n53#4,3:377\n60#4:385\n53#4,3:388\n53#4,3:392\n60#4:405\n70#4:408\n60#4:411\n70#4:415\n60#4:419\n22#5:326\n22#5:331\n22#5:334\n22#5:337\n22#5:341\n22#5:349\n22#5:352\n22#5:355\n22#5:359\n22#5:363\n26#5:380\n26#5:381\n26#5:382\n26#5:383\n22#5:386\n26#5:395\n26#5:396\n26#5:397\n26#5:398\n22#5:406\n22#5:409\n22#5:412\n22#5:416\n22#5:420\n57#6:338\n61#6:342\n57#6:356\n61#6:360\n57#6:361\n61#6:364\n57#6:413\n61#6:417\n33#7:343\n30#8:366\n30#8:387\n56#9,6:370\n33#10:376\n33#10:391\n48#11:384\n48#11:418\n36#12,5:399\n*S KotlinDebug\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineResolver\n*L\n166#1:324\n166#1:327\n194#1:329\n195#1:332\n196#1:335\n197#1:339\n213#1:347\n214#1:350\n215#1:353\n216#1:357\n306#1:404\n307#1:407\n308#1:410\n309#1:414\n166#1:325\n166#1:328\n194#1:330\n195#1:333\n196#1:336\n197#1:340\n198#1:344,3\n213#1:348\n214#1:351\n215#1:354\n216#1:358\n231#1:362\n231#1:365\n249#1:367,3\n250#1:377,3\n260#1:385\n261#1:388,3\n262#1:392,3\n306#1:405\n307#1:408\n308#1:411\n309#1:415\n310#1:419\n166#1:326\n194#1:331\n195#1:334\n196#1:337\n197#1:341\n213#1:349\n214#1:352\n215#1:355\n216#1:359\n231#1:363\n252#1:380\n253#1:381\n254#1:382\n255#1:383\n260#1:386\n265#1:395\n266#1:396\n267#1:397\n268#1:398\n306#1:406\n307#1:409\n308#1:412\n309#1:416\n310#1:420\n196#1:338\n197#1:342\n215#1:356\n216#1:360\n231#1:361\n231#1:364\n308#1:413\n309#1:417\n198#1:343\n249#1:366\n261#1:387\n250#1:370,6\n250#1:376\n262#1:391\n260#1:384\n310#1:418\n286#1:399,5\n*E\n"})
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
        this.rectTopLeft = Offset.INSTANCE.m20751getZeroF1C5BW0();
        this.rectSize = Size.INSTANCE.m20813getZeroNHjbRc();
    }

    /* renamed from: isSameBounds-4L21HEs, reason: not valid java name */
    private final boolean m22764isSameBounds4L21HEs(RoundRect roundRect, long j10, long j11, float f10) {
        if (roundRect != null && RoundRectKt.isSimple(roundRect)) {
            int i10 = (int) (j10 >> 32);
            if (roundRect.getLeft() == Float.intBitsToFloat(i10)) {
                int i11 = (int) (j10 & 4294967295L);
                if (roundRect.getTop() == Float.intBitsToFloat(i11) && roundRect.getRight() == Float.intBitsToFloat(i10) + Float.intBitsToFloat((int) (j11 >> 32)) && roundRect.getBottom() == Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j11 & 4294967295L)) && Float.intBitsToFloat((int) (roundRect.m20785getTopLeftCornerRadiuskKHJgLs() >> 32)) == f10) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void updateCache() {
        if (this.cacheIsDirty) {
            this.rectTopLeft = Offset.INSTANCE.m20751getZeroF1C5BW0();
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

    private final void updateCacheWithPath(Path composePath) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 28 || composePath.isConvex()) {
            if (i10 >= 30) {
                OutlineVerificationHelper.INSTANCE.setPath(this.cachedOutline, composePath);
            } else {
                android.graphics.Outline outline = this.cachedOutline;
                if (!(composePath instanceof AndroidPath)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                outline.setConvexPath(((AndroidPath) composePath).getInternalPath());
            }
            this.usePathForClip = !this.cachedOutline.canClip();
        } else {
            this.isSupportedOutline = false;
            this.cachedOutline.setEmpty();
            this.usePathForClip = true;
        }
        this.outlinePath = composePath;
    }

    private final void updateCacheWithRect(Rect rect) {
        float left = rect.getLeft();
        float top2 = rect.getTop();
        this.rectTopLeft = Offset.m20727constructorimpl((Float.floatToRawIntBits(top2) & 4294967295L) | (Float.floatToRawIntBits(left) << 32));
        float right = rect.getRight() - rect.getLeft();
        float bottom = rect.getBottom() - rect.getTop();
        this.rectSize = Size.m20795constructorimpl((Float.floatToRawIntBits(bottom) & 4294967295L) | (Float.floatToRawIntBits(right) << 32));
        this.cachedOutline.setRect(Math.round(rect.getLeft()), Math.round(rect.getTop()), Math.round(rect.getRight()), Math.round(rect.getBottom()));
    }

    private final void updateCacheWithRoundRect(RoundRect roundRect) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (roundRect.m20785getTopLeftCornerRadiuskKHJgLs() >> 32));
        float left = roundRect.getLeft();
        float top2 = roundRect.getTop();
        this.rectTopLeft = Offset.m20727constructorimpl((Float.floatToRawIntBits(top2) & 4294967295L) | (Float.floatToRawIntBits(left) << 32));
        float width = roundRect.getWidth();
        float height = roundRect.getHeight();
        this.rectSize = Size.m20795constructorimpl((Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32));
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
            Canvas.m20947clipPathmtrdDE$default(canvas, clipPath, 0, 2, null);
            return;
        }
        float f10 = this.roundedCornerRadius;
        if (f10 <= 0.0f) {
            Canvas.m20948clipRectN_I0leg$default(canvas, Float.intBitsToFloat((int) (this.rectTopLeft >> 32)), Float.intBitsToFloat((int) (this.rectTopLeft & 4294967295L)), Float.intBitsToFloat((int) (this.rectSize >> 32)) + Float.intBitsToFloat((int) (this.rectTopLeft >> 32)), Float.intBitsToFloat((int) (this.rectSize & 4294967295L)) + Float.intBitsToFloat((int) (this.rectTopLeft & 4294967295L)), 0, 16, null);
            return;
        }
        Path Path = this.tmpPath;
        RoundRect roundRect = this.tmpRoundRect;
        if (Path != null) {
            outlineResolver = this;
            if (!m22764isSameBounds4L21HEs(roundRect, this.rectTopLeft, this.rectSize, f10)) {
            }
            Canvas.m20947clipPathmtrdDE$default(canvas, Path, 0, 2, null);
        }
        outlineResolver = this;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (outlineResolver.rectTopLeft >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (outlineResolver.rectTopLeft & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (outlineResolver.rectSize >> 32)) + Float.intBitsToFloat((int) (outlineResolver.rectTopLeft >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (outlineResolver.rectSize & 4294967295L)) + Float.intBitsToFloat((int) (outlineResolver.rectTopLeft & 4294967295L));
        float f11 = outlineResolver.roundedCornerRadius;
        RoundRect roundRectM20789RoundRectgG7oq9Y = RoundRectKt.m20789RoundRectgG7oq9Y(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, CornerRadius.m20689constructorimpl((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L)));
        if (Path == null) {
            Path = AndroidPath_androidKt.Path();
        } else {
            Path.reset();
        }
        Path.addRoundRect$default(Path, roundRectM20789RoundRectgG7oq9Y, null, 2, null);
        outlineResolver.tmpRoundRect = roundRectM20789RoundRectgG7oq9Y;
        outlineResolver.tmpPath = Path;
        Canvas.m20947clipPathmtrdDE$default(canvas, Path, 0, 2, null);
    }

    public final android.graphics.Outline getAndroidOutline() {
        updateCache();
        if (this.outlineNeeded && this.isSupportedOutline) {
            return this.cachedOutline;
        }
        return null;
    }

    /* renamed from: getCacheIsDirty$ui_release, reason: from getter */
    public final boolean getCacheIsDirty() {
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
    public final boolean m22765isInOutlinek4lQ0M(long position) {
        androidx.compose.p013ui.graphics.Outline outline;
        if (this.outlineNeeded && (outline = this.outline) != null) {
            return ShapeContainingUtilKt.isInOutline(outline, Float.intBitsToFloat((int) (position >> 32)), Float.intBitsToFloat((int) (position & 4294967295L)), this.tmpTouchPointPath, this.tmpOpPath);
        }
        return true;
    }

    /* renamed from: update-S_szKao, reason: not valid java name */
    public final boolean m22766updateS_szKao(androidx.compose.p013ui.graphics.Outline outline, float alpha, boolean clipToOutline, float elevation, long size) {
        this.cachedOutline.setAlpha(alpha);
        boolean zAreEqual = Intrinsics.areEqual(this.outline, outline);
        boolean z9 = !zAreEqual;
        if (!zAreEqual) {
            this.outline = outline;
            this.cacheIsDirty = true;
        }
        this.rectSize = size;
        boolean z10 = outline != null && (clipToOutline || elevation > 0.0f);
        if (this.outlineNeeded != z10) {
            this.outlineNeeded = z10;
            this.cacheIsDirty = true;
        }
        return z9;
    }
}
