package androidx.compose.p014ui.text;

import androidx.compose.p014ui.text.internal.InlineClassHelperKt;
import androidx.compose.p014ui.unit.TextUnit;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class Placeholder {
    public static final int $stable = 0;
    private final long height;
    private final int placeholderVerticalAlign;
    private final long width;

    public /* synthetic */ Placeholder(long j10, long j11, int i10, AbstractC9972n abstractC9972n) {
        this(j10, j11, i10);
    }

    /* renamed from: copy-K8Q-__8$default, reason: not valid java name */
    public static /* synthetic */ Placeholder m32865copyK8Q__8$default(Placeholder placeholder, long j10, long j11, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = placeholder.width;
        }
        long j12 = j10;
        if ((i11 & 2) != 0) {
            j11 = placeholder.height;
        }
        long j13 = j11;
        if ((i11 & 4) != 0) {
            i10 = placeholder.placeholderVerticalAlign;
        }
        return placeholder.m32866copyK8Q__8(j12, j13, i10);
    }

    /* renamed from: copy-K8Q-__8, reason: not valid java name */
    public final Placeholder m32866copyK8Q__8(long j10, long j11, int i10) {
        return new Placeholder(j10, j11, i10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Placeholder)) {
            return false;
        }
        Placeholder placeholder = (Placeholder) obj;
        return TextUnit.m33692equalsimpl0(this.width, placeholder.width) && TextUnit.m33692equalsimpl0(this.height, placeholder.height) && PlaceholderVerticalAlign.m32873equalsimpl0(this.placeholderVerticalAlign, placeholder.placeholderVerticalAlign);
    }

    /* renamed from: getHeight-XSAIIZE, reason: not valid java name */
    public final long m32867getHeightXSAIIZE() {
        return this.height;
    }

    /* renamed from: getPlaceholderVerticalAlign-J6kI3mc, reason: not valid java name */
    public final int m32868getPlaceholderVerticalAlignJ6kI3mc() {
        return this.placeholderVerticalAlign;
    }

    /* renamed from: getWidth-XSAIIZE, reason: not valid java name */
    public final long m32869getWidthXSAIIZE() {
        return this.width;
    }

    public int hashCode() {
        return (((TextUnit.m33696hashCodeimpl(this.width) * 31) + TextUnit.m33696hashCodeimpl(this.height)) * 31) + PlaceholderVerticalAlign.m32874hashCodeimpl(this.placeholderVerticalAlign);
    }

    public String toString() {
        return "Placeholder(width=" + ((Object) TextUnit.m33702toStringimpl(this.width)) + ", height=" + ((Object) TextUnit.m33702toStringimpl(this.height)) + ", placeholderVerticalAlign=" + ((Object) PlaceholderVerticalAlign.m32875toStringimpl(this.placeholderVerticalAlign)) + ')';
    }

    private Placeholder(long j10, long j11, int i10) {
        this.width = j10;
        this.height = j11;
        this.placeholderVerticalAlign = i10;
        if (TextUnit.m33693getRawTypeimpl(j10) == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("width cannot be TextUnit.Unspecified");
        }
        if (TextUnit.m33693getRawTypeimpl(j11) == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("height cannot be TextUnit.Unspecified");
        }
    }
}
