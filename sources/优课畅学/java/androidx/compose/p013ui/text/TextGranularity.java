package androidx.compose.p013ui.text;

import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes2.dex */
public final class TextGranularity {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Character = m26320constructorimpl(0);
    private static final int Word = m26320constructorimpl(1);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getCharacter-DRrd7Zo, reason: not valid java name */
        public final int m26326getCharacterDRrd7Zo() {
            return TextGranularity.Character;
        }

        /* renamed from: getWord-DRrd7Zo, reason: not valid java name */
        public final int m26327getWordDRrd7Zo() {
            return TextGranularity.Word;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TextGranularity(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextGranularity m26319boximpl(int i10) {
        return new TextGranularity(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m26320constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m26321equalsimpl(int i10, Object obj) {
        return (obj instanceof TextGranularity) && i10 == ((TextGranularity) obj).m26325unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m26322equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m26323hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m26324toStringimpl(int i10) {
        return "TextGranularity(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m26321equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m26323hashCodeimpl(this.value);
    }

    public String toString() {
        return m26324toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m26325unboximpl() {
        return this.value;
    }
}
