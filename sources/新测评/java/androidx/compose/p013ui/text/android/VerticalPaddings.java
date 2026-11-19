package androidx.compose.p013ui.text.android;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0012\u0010\tJ\u0010\u0010\u0013\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0017"}, m13558d2 = {"Landroidx/compose/ui/text/android/VerticalPaddings;", "", "packedValue", "", "constructor-impl", "(J)J", "bottomPadding", "", "getBottomPadding-impl", "(J)I", "topPadding", "getTopPadding-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "ui-text_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nTextLayout.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.android.kt\nandroidx/compose/ui/text/android/VerticalPaddings\n+ 2 InlineClassUtils.android.kt\nandroidx/compose/ui/text/android/InlineClassUtils_androidKt\n*L\n1#1,1127:1\n28#2:1128\n33#2:1129\n*S KotlinDebug\n*F\n+ 1 TextLayout.android.kt\nandroidx/compose/ui/text/android/VerticalPaddings\n*L\n965#1:1128\n968#1:1129\n*E\n"})
/* loaded from: classes2.dex */
public final class VerticalPaddings {
    private final long packedValue;

    private /* synthetic */ VerticalPaddings(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ VerticalPaddings m23074boximpl(long j10) {
        return new VerticalPaddings(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m23075constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23076equalsimpl(long j10, Object obj) {
        return (obj instanceof VerticalPaddings) && j10 == ((VerticalPaddings) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23077equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getBottomPadding-impl, reason: not valid java name */
    public static final int m23078getBottomPaddingimpl(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* renamed from: getTopPadding-impl, reason: not valid java name */
    public static final int m23079getTopPaddingimpl(long j10) {
        return (int) (j10 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23080hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m23081toStringimpl(long j10) {
        return "VerticalPaddings(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return m23076equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m23080hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m23081toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }
}
