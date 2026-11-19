package androidx.compose.p013ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class BaselineShift {
    private final float multiplier;
    public static final Companion Companion = new Companion(null);
    private static final float Superscript = m26656constructorimpl(0.5f);
    private static final float Subscript = m26656constructorimpl(-0.5f);
    private static final float None = m26656constructorimpl(0.0f);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        @Stable
        /* renamed from: getNone-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m26662getNoney9eOQZs$annotations() {
        }

        @Stable
        /* renamed from: getSubscript-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m26663getSubscripty9eOQZs$annotations() {
        }

        @Stable
        /* renamed from: getSuperscript-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m26664getSuperscripty9eOQZs$annotations() {
        }

        /* renamed from: getNone-y9eOQZs, reason: not valid java name */
        public final float m26665getNoney9eOQZs() {
            return BaselineShift.None;
        }

        /* renamed from: getSubscript-y9eOQZs, reason: not valid java name */
        public final float m26666getSubscripty9eOQZs() {
            return BaselineShift.Subscript;
        }

        /* renamed from: getSuperscript-y9eOQZs, reason: not valid java name */
        public final float m26667getSuperscripty9eOQZs() {
            return BaselineShift.Superscript;
        }

        private Companion() {
        }
    }

    private /* synthetic */ BaselineShift(float f10) {
        this.multiplier = f10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ BaselineShift m26655boximpl(float f10) {
        return new BaselineShift(f10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float m26656constructorimpl(float f10) {
        return f10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m26657equalsimpl(float f10, Object obj) {
        return (obj instanceof BaselineShift) && Float.compare(f10, ((BaselineShift) obj).m26661unboximpl()) == 0;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m26658equalsimpl0(float f10, float f11) {
        return Float.compare(f10, f11) == 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m26659hashCodeimpl(float f10) {
        return Float.hashCode(f10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m26660toStringimpl(float f10) {
        return "BaselineShift(multiplier=" + f10 + ')';
    }

    public boolean equals(Object obj) {
        return m26657equalsimpl(this.multiplier, obj);
    }

    public final float getMultiplier() {
        return this.multiplier;
    }

    public int hashCode() {
        return m26659hashCodeimpl(this.multiplier);
    }

    public String toString() {
        return m26660toStringimpl(this.multiplier);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m26661unboximpl() {
        return this.multiplier;
    }
}
