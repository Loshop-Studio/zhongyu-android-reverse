package androidx.compose.p014ui.text;

import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes2.dex */
public final class TextGranularity {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Character = m32922constructorimpl(0);
    private static final int Word = m32922constructorimpl(1);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getCharacter-DRrd7Zo, reason: not valid java name */
        public final int m32928getCharacterDRrd7Zo() {
            return TextGranularity.Character;
        }

        /* renamed from: getWord-DRrd7Zo, reason: not valid java name */
        public final int m32929getWordDRrd7Zo() {
            return TextGranularity.Word;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TextGranularity(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextGranularity m32921boximpl(int i10) {
        return new TextGranularity(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m32922constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m32923equalsimpl(int i10, Object obj) {
        return (obj instanceof TextGranularity) && i10 == ((TextGranularity) obj).m32927unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m32924equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m32925hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m32926toStringimpl(int i10) {
        return "TextGranularity(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m32923equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m32925hashCodeimpl(this.value);
    }

    public String toString() {
        return m32926toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m32927unboximpl() {
        return this.value;
    }
}
