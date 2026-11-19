package androidx.compose.p013ui.text;

import androidx.compose.p013ui.text.internal.InlineClassHelperKt;
import androidx.compose.p013ui.unit.TextUnit;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(m13557d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J.\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000e\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, m13558d2 = {"Landroidx/compose/ui/text/Placeholder;", "", "width", "Landroidx/compose/ui/unit/TextUnit;", "height", "placeholderVerticalAlign", "Landroidx/compose/ui/text/PlaceholderVerticalAlign;", "(JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getHeight-XSAIIZE", "()J", "J", "getPlaceholderVerticalAlign-J6kI3mc", "()I", "I", "getWidth-XSAIIZE", "copy", "copy-K8Q-__8", "(JJI)Landroidx/compose/ui/text/Placeholder;", "equals", "", "other", "hashCode", "", "toString", "", "ui-text_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nPlaceholder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeholder.kt\nandroidx/compose/ui/text/Placeholder\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,139:1\n247#2:140\n247#2:149\n114#3,8:141\n114#3,8:150\n*S KotlinDebug\n*F\n+ 1 Placeholder.kt\nandroidx/compose/ui/text/Placeholder\n*L\n44#1:140\n45#1:149\n44#1:141,8\n45#1:150,8\n*E\n"})
/* loaded from: classes2.dex */
public final class Placeholder {
    public static final int $stable = 0;
    private final long height;
    private final int placeholderVerticalAlign;
    private final long width;

    public /* synthetic */ Placeholder(long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, i10);
    }

    /* renamed from: copy-K8Q-__8$default, reason: not valid java name */
    public static /* synthetic */ Placeholder m22926copyK8Q__8$default(Placeholder placeholder, long j10, long j11, int i10, int i11, Object obj) {
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
        return placeholder.m22927copyK8Q__8(j12, j13, i10);
    }

    /* renamed from: copy-K8Q-__8, reason: not valid java name */
    public final Placeholder m22927copyK8Q__8(long width, long height, int placeholderVerticalAlign) {
        return new Placeholder(width, height, placeholderVerticalAlign, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Placeholder)) {
            return false;
        }
        Placeholder placeholder = (Placeholder) other;
        return TextUnit.m23752equalsimpl0(this.width, placeholder.width) && TextUnit.m23752equalsimpl0(this.height, placeholder.height) && PlaceholderVerticalAlign.m22934equalsimpl0(this.placeholderVerticalAlign, placeholder.placeholderVerticalAlign);
    }

    /* renamed from: getHeight-XSAIIZE, reason: not valid java name and from getter */
    public final long getHeight() {
        return this.height;
    }

    /* renamed from: getPlaceholderVerticalAlign-J6kI3mc, reason: not valid java name and from getter */
    public final int getPlaceholderVerticalAlign() {
        return this.placeholderVerticalAlign;
    }

    /* renamed from: getWidth-XSAIIZE, reason: not valid java name and from getter */
    public final long getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((TextUnit.m23756hashCodeimpl(this.width) * 31) + TextUnit.m23756hashCodeimpl(this.height)) * 31) + PlaceholderVerticalAlign.m22935hashCodeimpl(this.placeholderVerticalAlign);
    }

    public String toString() {
        return "Placeholder(width=" + ((Object) TextUnit.m23762toStringimpl(this.width)) + ", height=" + ((Object) TextUnit.m23762toStringimpl(this.height)) + ", placeholderVerticalAlign=" + ((Object) PlaceholderVerticalAlign.m22936toStringimpl(this.placeholderVerticalAlign)) + ')';
    }

    private Placeholder(long j10, long j11, int i10) {
        this.width = j10;
        this.height = j11;
        this.placeholderVerticalAlign = i10;
        if (TextUnit.m23753getRawTypeimpl(j10) == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("width cannot be TextUnit.Unspecified");
        }
        if (TextUnit.m23753getRawTypeimpl(j11) == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("height cannot be TextUnit.Unspecified");
        }
    }
}
