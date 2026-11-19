package androidx.compose.p014ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class BaselineShift {
    private final float multiplier;
    public static final Companion Companion = new Companion(null);
    private static final float Superscript = m33258constructorimpl(0.5f);
    private static final float Subscript = m33258constructorimpl(-0.5f);
    private static final float None = m33258constructorimpl(0.0f);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        @Stable
        /* renamed from: getNone-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m33264getNoney9eOQZs$annotations() {
        }

        @Stable
        /* renamed from: getSubscript-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m33265getSubscripty9eOQZs$annotations() {
        }

        @Stable
        /* renamed from: getSuperscript-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m33266getSuperscripty9eOQZs$annotations() {
        }

        /* renamed from: getNone-y9eOQZs, reason: not valid java name */
        public final float m33267getNoney9eOQZs() {
            return BaselineShift.None;
        }

        /* renamed from: getSubscript-y9eOQZs, reason: not valid java name */
        public final float m33268getSubscripty9eOQZs() {
            return BaselineShift.Subscript;
        }

        /* renamed from: getSuperscript-y9eOQZs, reason: not valid java name */
        public final float m33269getSuperscripty9eOQZs() {
            return BaselineShift.Superscript;
        }

        private Companion() {
        }
    }

    private /* synthetic */ BaselineShift(float f10) {
        this.multiplier = f10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ BaselineShift m33257boximpl(float f10) {
        return new BaselineShift(f10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float m33258constructorimpl(float f10) {
        return f10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m33259equalsimpl(float f10, Object obj) {
        return (obj instanceof BaselineShift) && Float.compare(f10, ((BaselineShift) obj).m33263unboximpl()) == 0;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33260equalsimpl0(float f10, float f11) {
        return Float.compare(f10, f11) == 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m33261hashCodeimpl(float f10) {
        return Float.hashCode(f10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m33262toStringimpl(float f10) {
        return "BaselineShift(multiplier=" + f10 + ')';
    }

    public boolean equals(Object obj) {
        return m33259equalsimpl(this.multiplier, obj);
    }

    public final float getMultiplier() {
        return this.multiplier;
    }

    public int hashCode() {
        return m33261hashCodeimpl(this.multiplier);
    }

    public String toString() {
        return m33262toStringimpl(this.multiplier);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m33263unboximpl() {
        return this.multiplier;
    }
}
