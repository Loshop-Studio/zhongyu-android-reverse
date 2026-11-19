package androidx.compose.p013ui.text.input;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes2.dex */
public final class KeyboardCapitalization {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unspecified = m26564constructorimpl(-1);
    private static final int None = m26564constructorimpl(0);
    private static final int Characters = m26564constructorimpl(1);
    private static final int Words = m26564constructorimpl(2);
    private static final int Sentences = m26564constructorimpl(3);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        @Stable
        /* renamed from: getCharacters-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m26570getCharactersIUNYP9k$annotations() {
        }

        @Stable
        /* renamed from: getNone-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m26571getNoneIUNYP9k$annotations() {
        }

        @Stable
        /* renamed from: getSentences-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m26572getSentencesIUNYP9k$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m26573getUnspecifiedIUNYP9k$annotations() {
        }

        @Stable
        /* renamed from: getWords-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m26574getWordsIUNYP9k$annotations() {
        }

        /* renamed from: getCharacters-IUNYP9k, reason: not valid java name */
        public final int m26575getCharactersIUNYP9k() {
            return KeyboardCapitalization.Characters;
        }

        /* renamed from: getNone-IUNYP9k, reason: not valid java name */
        public final int m26576getNoneIUNYP9k() {
            return KeyboardCapitalization.None;
        }

        /* renamed from: getSentences-IUNYP9k, reason: not valid java name */
        public final int m26577getSentencesIUNYP9k() {
            return KeyboardCapitalization.Sentences;
        }

        /* renamed from: getUnspecified-IUNYP9k, reason: not valid java name */
        public final int m26578getUnspecifiedIUNYP9k() {
            return KeyboardCapitalization.Unspecified;
        }

        /* renamed from: getWords-IUNYP9k, reason: not valid java name */
        public final int m26579getWordsIUNYP9k() {
            return KeyboardCapitalization.Words;
        }

        private Companion() {
        }
    }

    private /* synthetic */ KeyboardCapitalization(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyboardCapitalization m26563boximpl(int i10) {
        return new KeyboardCapitalization(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m26564constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m26565equalsimpl(int i10, Object obj) {
        return (obj instanceof KeyboardCapitalization) && i10 == ((KeyboardCapitalization) obj).m26569unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m26566equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m26567hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m26568toStringimpl(int i10) {
        return m26566equalsimpl0(i10, Unspecified) ? "Unspecified" : m26566equalsimpl0(i10, None) ? "None" : m26566equalsimpl0(i10, Characters) ? "Characters" : m26566equalsimpl0(i10, Words) ? "Words" : m26566equalsimpl0(i10, Sentences) ? "Sentences" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m26565equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m26567hashCodeimpl(this.value);
    }

    public String toString() {
        return m26568toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m26569unboximpl() {
        return this.value;
    }
}
