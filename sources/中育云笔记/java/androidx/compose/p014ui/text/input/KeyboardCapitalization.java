package androidx.compose.p014ui.text.input;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes2.dex */
public final class KeyboardCapitalization {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unspecified = m33166constructorimpl(-1);
    private static final int None = m33166constructorimpl(0);
    private static final int Characters = m33166constructorimpl(1);
    private static final int Words = m33166constructorimpl(2);
    private static final int Sentences = m33166constructorimpl(3);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        @Stable
        /* renamed from: getCharacters-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m33172getCharactersIUNYP9k$annotations() {
        }

        @Stable
        /* renamed from: getNone-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m33173getNoneIUNYP9k$annotations() {
        }

        @Stable
        /* renamed from: getSentences-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m33174getSentencesIUNYP9k$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m33175getUnspecifiedIUNYP9k$annotations() {
        }

        @Stable
        /* renamed from: getWords-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m33176getWordsIUNYP9k$annotations() {
        }

        /* renamed from: getCharacters-IUNYP9k, reason: not valid java name */
        public final int m33177getCharactersIUNYP9k() {
            return KeyboardCapitalization.Characters;
        }

        /* renamed from: getNone-IUNYP9k, reason: not valid java name */
        public final int m33178getNoneIUNYP9k() {
            return KeyboardCapitalization.None;
        }

        /* renamed from: getSentences-IUNYP9k, reason: not valid java name */
        public final int m33179getSentencesIUNYP9k() {
            return KeyboardCapitalization.Sentences;
        }

        /* renamed from: getUnspecified-IUNYP9k, reason: not valid java name */
        public final int m33180getUnspecifiedIUNYP9k() {
            return KeyboardCapitalization.Unspecified;
        }

        /* renamed from: getWords-IUNYP9k, reason: not valid java name */
        public final int m33181getWordsIUNYP9k() {
            return KeyboardCapitalization.Words;
        }

        private Companion() {
        }
    }

    private /* synthetic */ KeyboardCapitalization(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyboardCapitalization m33165boximpl(int i10) {
        return new KeyboardCapitalization(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m33166constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m33167equalsimpl(int i10, Object obj) {
        return (obj instanceof KeyboardCapitalization) && i10 == ((KeyboardCapitalization) obj).m33171unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33168equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m33169hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m33170toStringimpl(int i10) {
        return m33168equalsimpl0(i10, Unspecified) ? "Unspecified" : m33168equalsimpl0(i10, None) ? "None" : m33168equalsimpl0(i10, Characters) ? "Characters" : m33168equalsimpl0(i10, Words) ? "Words" : m33168equalsimpl0(i10, Sentences) ? "Sentences" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m33167equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m33169hashCodeimpl(this.value);
    }

    public String toString() {
        return m33170toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m33171unboximpl() {
        return this.value;
    }
}
