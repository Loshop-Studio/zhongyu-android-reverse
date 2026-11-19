package androidx.compose.material3.carousel;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m13557d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, m13558d2 = {"Landroidx/compose/material3/carousel/CarouselAlignment;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "material3_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@JvmInline
/* loaded from: classes2.dex */
public final class CarouselAlignment {
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int Start = m19607constructorimpl(-1);
    private static final int Center = m19607constructorimpl(0);
    private static final int End = m19607constructorimpl(1);

    @Metadata(m13557d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, m13558d2 = {"Landroidx/compose/material3/carousel/CarouselAlignment$Companion;", "", "()V", "Center", "Landroidx/compose/material3/carousel/CarouselAlignment;", "getCenter-NUL3oTo", "()I", "I", "End", "getEnd-NUL3oTo", "Start", "getStart-NUL3oTo", "material3_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getCenter-NUL3oTo, reason: not valid java name */
        public final int m19613getCenterNUL3oTo() {
            return CarouselAlignment.Center;
        }

        /* renamed from: getEnd-NUL3oTo, reason: not valid java name */
        public final int m19614getEndNUL3oTo() {
            return CarouselAlignment.End;
        }

        /* renamed from: getStart-NUL3oTo, reason: not valid java name */
        public final int m19615getStartNUL3oTo() {
            return CarouselAlignment.Start;
        }

        private Companion() {
        }
    }

    private /* synthetic */ CarouselAlignment(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CarouselAlignment m19606boximpl(int i10) {
        return new CarouselAlignment(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m19607constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m19608equalsimpl(int i10, Object obj) {
        return (obj instanceof CarouselAlignment) && i10 == ((CarouselAlignment) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m19609equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m19610hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m19611toStringimpl(int i10) {
        return "CarouselAlignment(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m19608equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m19610hashCodeimpl(this.value);
    }

    public String toString() {
        return m19611toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }
}
