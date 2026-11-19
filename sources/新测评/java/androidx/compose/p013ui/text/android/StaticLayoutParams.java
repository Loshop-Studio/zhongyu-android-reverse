package androidx.compose.p013ui.text.android;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.p013ui.text.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b!\b\u0002\u0018\u00002\u00020\u0001Bµ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0002\u0010 R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010$R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010$R\u0011\u0010\u001b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010$R\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b3\u00102R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010$R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\b7\u0010.R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u0010$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010\u0018\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b=\u0010+R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b>\u0010$¨\u0006?"}, m13558d2 = {"Landroidx/compose/ui/text/android/StaticLayoutParams;", "", "text", "", "start", "", "end", "paint", "Landroid/text/TextPaint;", "width", "textDir", "Landroid/text/TextDirectionHeuristic;", "alignment", "Landroid/text/Layout$Alignment;", "maxLines", "ellipsize", "Landroid/text/TextUtils$TruncateAt;", "ellipsizedWidth", "lineSpacingMultiplier", "", "lineSpacingExtra", "justificationMode", "includePadding", "", "useFallbackLineSpacing", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "leftIndents", "", "rightIndents", "(Ljava/lang/CharSequence;IILandroid/text/TextPaint;ILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;IFFIZZIIII[I[I)V", "getAlignment", "()Landroid/text/Layout$Alignment;", "getBreakStrategy", "()I", "getEllipsize", "()Landroid/text/TextUtils$TruncateAt;", "getEllipsizedWidth", "getEnd", "getHyphenationFrequency", "getIncludePadding", "()Z", "getJustificationMode", "getLeftIndents", "()[I", "getLineBreakStyle", "getLineBreakWordStyle", "getLineSpacingExtra", "()F", "getLineSpacingMultiplier", "getMaxLines", "getPaint", "()Landroid/text/TextPaint;", "getRightIndents", "getStart", "getText", "()Ljava/lang/CharSequence;", "getTextDir", "()Landroid/text/TextDirectionHeuristic;", "getUseFallbackLineSpacing", "getWidth", "ui-text_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nStaticLayoutFactory.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StaticLayoutFactory.android.kt\nandroidx/compose/ui/text/android/StaticLayoutParams\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,358:1\n114#2,8:359\n114#2,8:367\n114#2,8:375\n114#2,8:383\n114#2,8:391\n114#2,8:399\n*S KotlinDebug\n*F\n+ 1 StaticLayoutFactory.android.kt\nandroidx/compose/ui/text/android/StaticLayoutParams\n*L\n143#1:359,8\n144#1:367,8\n145#1:375,8\n146#1:383,8\n147#1:391,8\n148#1:399,8\n*E\n"})
/* loaded from: classes2.dex */
final class StaticLayoutParams {
    private final Layout.Alignment alignment;
    private final int breakStrategy;
    private final TextUtils.TruncateAt ellipsize;
    private final int ellipsizedWidth;
    private final int end;
    private final int hyphenationFrequency;
    private final boolean includePadding;
    private final int justificationMode;
    private final int[] leftIndents;
    private final int lineBreakStyle;
    private final int lineBreakWordStyle;
    private final float lineSpacingExtra;
    private final float lineSpacingMultiplier;
    private final int maxLines;
    private final TextPaint paint;
    private final int[] rightIndents;
    private final int start;
    private final CharSequence text;
    private final TextDirectionHeuristic textDir;
    private final boolean useFallbackLineSpacing;
    private final int width;

    public StaticLayoutParams(CharSequence charSequence, int i10, int i11, TextPaint textPaint, int i12, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z9, boolean z10, int i16, int i17, int i18, int i19, int[] iArr, int[] iArr2) {
        this.text = charSequence;
        this.start = i10;
        this.end = i11;
        this.paint = textPaint;
        this.width = i12;
        this.textDir = textDirectionHeuristic;
        this.alignment = alignment;
        this.maxLines = i13;
        this.ellipsize = truncateAt;
        this.ellipsizedWidth = i14;
        this.lineSpacingMultiplier = f10;
        this.lineSpacingExtra = f11;
        this.justificationMode = i15;
        this.includePadding = z9;
        this.useFallbackLineSpacing = z10;
        this.breakStrategy = i16;
        this.lineBreakStyle = i17;
        this.lineBreakWordStyle = i18;
        this.hyphenationFrequency = i19;
        this.leftIndents = iArr;
        this.rightIndents = iArr2;
        if (!(i10 >= 0 && i10 <= i11)) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid start value");
        }
        if (!(i11 >= 0 && i11 <= charSequence.length())) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid end value");
        }
        if (!(i13 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid maxLines value");
        }
        if (!(i12 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid width value");
        }
        if (!(i14 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid ellipsizedWidth value");
        }
        if (f10 >= 0.0f) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("invalid lineSpacingMultiplier value");
    }

    public final Layout.Alignment getAlignment() {
        return this.alignment;
    }

    public final int getBreakStrategy() {
        return this.breakStrategy;
    }

    public final TextUtils.TruncateAt getEllipsize() {
        return this.ellipsize;
    }

    public final int getEllipsizedWidth() {
        return this.ellipsizedWidth;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getHyphenationFrequency() {
        return this.hyphenationFrequency;
    }

    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    public final int getJustificationMode() {
        return this.justificationMode;
    }

    public final int[] getLeftIndents() {
        return this.leftIndents;
    }

    public final int getLineBreakStyle() {
        return this.lineBreakStyle;
    }

    public final int getLineBreakWordStyle() {
        return this.lineBreakWordStyle;
    }

    public final float getLineSpacingExtra() {
        return this.lineSpacingExtra;
    }

    public final float getLineSpacingMultiplier() {
        return this.lineSpacingMultiplier;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final TextPaint getPaint() {
        return this.paint;
    }

    public final int[] getRightIndents() {
        return this.rightIndents;
    }

    public final int getStart() {
        return this.start;
    }

    public final CharSequence getText() {
        return this.text;
    }

    public final TextDirectionHeuristic getTextDir() {
        return this.textDir;
    }

    public final boolean getUseFallbackLineSpacing() {
        return this.useFallbackLineSpacing;
    }

    public final int getWidth() {
        return this.width;
    }

    public /* synthetic */ StaticLayoutParams(CharSequence charSequence, int i10, int i11, TextPaint textPaint, int i12, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z9, boolean z10, int i16, int i17, int i18, int i19, int[] iArr, int[] iArr2, int i20, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, (i20 & 2) != 0 ? 0 : i10, i11, textPaint, i12, textDirectionHeuristic, alignment, i13, truncateAt, i14, f10, f11, i15, z9, z10, i16, i17, i18, i19, iArr, iArr2);
    }
}
