package androidx.compose.p013ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u0011\b\u0016\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u000f\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0013\u0010\u0011\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, m13558d2 = {"Landroidx/compose/ui/text/PlatformTextStyle;", "", "spanStyle", "Landroidx/compose/ui/text/PlatformSpanStyle;", "paragraphStyle", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "(Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/text/PlatformParagraphStyle;)V", "includeFontPadding", "", "(Z)V", "emojiSupportMatch", "Landroidx/compose/ui/text/EmojiSupportMatch;", "(ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getParagraphStyle", "()Landroidx/compose/ui/text/PlatformParagraphStyle;", "getSpanStyle", "()Landroidx/compose/ui/text/PlatformSpanStyle;", "equals", "other", "hashCode", "", "toString", "", "ui-text_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class PlatformTextStyle {
    public static final int $stable = 0;

    /* renamed from: paragraphStyle, reason: from kotlin metadata and from toString */
    private final PlatformParagraphStyle paragraphSyle;
    private final PlatformSpanStyle spanStyle;

    public /* synthetic */ PlatformTextStyle(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlatformTextStyle)) {
            return false;
        }
        PlatformTextStyle platformTextStyle = (PlatformTextStyle) other;
        return Intrinsics.areEqual(this.paragraphSyle, platformTextStyle.paragraphSyle) && Intrinsics.areEqual(this.spanStyle, platformTextStyle.spanStyle);
    }

    /* renamed from: getParagraphStyle, reason: from getter */
    public final PlatformParagraphStyle getParagraphSyle() {
        return this.paragraphSyle;
    }

    public final PlatformSpanStyle getSpanStyle() {
        return this.spanStyle;
    }

    public int hashCode() {
        PlatformSpanStyle platformSpanStyle = this.spanStyle;
        int iHashCode = (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.paragraphSyle;
        return iHashCode + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0);
    }

    public String toString() {
        return "PlatformTextStyle(spanStyle=" + this.spanStyle + ", paragraphSyle=" + this.paragraphSyle + ')';
    }

    public PlatformTextStyle(PlatformSpanStyle platformSpanStyle, PlatformParagraphStyle platformParagraphStyle) {
        this.spanStyle = platformSpanStyle;
        this.paragraphSyle = platformParagraphStyle;
    }

    public /* synthetic */ PlatformTextStyle(boolean z9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z9);
    }

    public PlatformTextStyle(boolean z9) {
        this((PlatformSpanStyle) null, new PlatformParagraphStyle(z9));
    }

    private PlatformTextStyle(int i10) {
        this((PlatformSpanStyle) null, new PlatformParagraphStyle(i10, (DefaultConstructorMarker) null));
    }
}
