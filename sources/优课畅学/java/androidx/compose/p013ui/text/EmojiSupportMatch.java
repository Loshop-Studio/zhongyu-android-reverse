package androidx.compose.p013ui.text;

import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes2.dex */
public final class EmojiSupportMatch {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Default = m26202constructorimpl(0);
    private static final int None = m26202constructorimpl(1);
    private static final int All = m26202constructorimpl(2);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getAll-_3YsG6Y, reason: not valid java name */
        public final int m26208getAll_3YsG6Y() {
            return EmojiSupportMatch.All;
        }

        /* renamed from: getDefault-_3YsG6Y, reason: not valid java name */
        public final int m26209getDefault_3YsG6Y() {
            return EmojiSupportMatch.Default;
        }

        /* renamed from: getNone-_3YsG6Y, reason: not valid java name */
        public final int m26210getNone_3YsG6Y() {
            return EmojiSupportMatch.None;
        }

        private Companion() {
        }
    }

    private /* synthetic */ EmojiSupportMatch(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ EmojiSupportMatch m26201boximpl(int i10) {
        return new EmojiSupportMatch(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m26202constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m26203equalsimpl(int i10, Object obj) {
        return (obj instanceof EmojiSupportMatch) && i10 == ((EmojiSupportMatch) obj).m26207unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m26204equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m26205hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m26206toStringimpl(int i10) {
        if (i10 == Default) {
            return "EmojiSupportMatch.Default";
        }
        if (i10 == None) {
            return "EmojiSupportMatch.None";
        }
        if (i10 == All) {
            return "EmojiSupportMatch.All";
        }
        return "Invalid(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m26203equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m26205hashCodeimpl(this.value);
    }

    public String toString() {
        return m26206toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m26207unboximpl() {
        return this.value;
    }
}
