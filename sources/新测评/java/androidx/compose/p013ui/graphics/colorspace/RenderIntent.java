package androidx.compose.p013ui.graphics.colorspace;

import androidx.compose.runtime.Immutable;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
@Metadata(m13557d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, m13558d2 = {"Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-graphics_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@JvmInline
/* loaded from: classes2.dex */
public final class RenderIntent {
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int Perceptual = m21404constructorimpl(0);
    private static final int Relative = m21404constructorimpl(1);
    private static final int Saturation = m21404constructorimpl(2);
    private static final int Absolute = m21404constructorimpl(3);

    @Metadata(m13557d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, m13558d2 = {"Landroidx/compose/ui/graphics/colorspace/RenderIntent$Companion;", "", "()V", "Absolute", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "getAbsolute-uksYyKA", "()I", "I", "Perceptual", "getPerceptual-uksYyKA", "Relative", "getRelative-uksYyKA", ExifInterface.TAG_SATURATION, "getSaturation-uksYyKA", "ui-graphics_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getAbsolute-uksYyKA, reason: not valid java name */
        public final int m21410getAbsoluteuksYyKA() {
            return RenderIntent.Absolute;
        }

        /* renamed from: getPerceptual-uksYyKA, reason: not valid java name */
        public final int m21411getPerceptualuksYyKA() {
            return RenderIntent.Perceptual;
        }

        /* renamed from: getRelative-uksYyKA, reason: not valid java name */
        public final int m21412getRelativeuksYyKA() {
            return RenderIntent.Relative;
        }

        /* renamed from: getSaturation-uksYyKA, reason: not valid java name */
        public final int m21413getSaturationuksYyKA() {
            return RenderIntent.Saturation;
        }

        private Companion() {
        }
    }

    private /* synthetic */ RenderIntent(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ RenderIntent m21403boximpl(int i10) {
        return new RenderIntent(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m21404constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m21405equalsimpl(int i10, Object obj) {
        return (obj instanceof RenderIntent) && i10 == ((RenderIntent) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m21406equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m21407hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m21408toStringimpl(int i10) {
        return m21406equalsimpl0(i10, Perceptual) ? "Perceptual" : m21406equalsimpl0(i10, Relative) ? "Relative" : m21406equalsimpl0(i10, Saturation) ? ExifInterface.TAG_SATURATION : m21406equalsimpl0(i10, Absolute) ? "Absolute" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m21405equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m21407hashCodeimpl(this.value);
    }

    public String toString() {
        return m21408toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }
}
