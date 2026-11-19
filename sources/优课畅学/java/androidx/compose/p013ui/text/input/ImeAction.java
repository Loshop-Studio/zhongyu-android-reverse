package androidx.compose.p013ui.text.input;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes2.dex */
public final class ImeAction {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unspecified = m26528constructorimpl(-1);
    private static final int Default = m26528constructorimpl(1);
    private static final int None = m26528constructorimpl(0);

    /* renamed from: Go */
    private static final int f1355Go = m26528constructorimpl(2);
    private static final int Search = m26528constructorimpl(3);
    private static final int Send = m26528constructorimpl(4);
    private static final int Previous = m26528constructorimpl(5);
    private static final int Next = m26528constructorimpl(6);
    private static final int Done = m26528constructorimpl(7);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        @Stable
        /* renamed from: getDefault-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m26534getDefaulteUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getDone-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m26535getDoneeUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getGo-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m26536getGoeUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getNext-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m26537getNexteUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getNone-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m26538getNoneeUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getPrevious-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m26539getPreviouseUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getSearch-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m26540getSearcheUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getSend-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m26541getSendeUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m26542getUnspecifiedeUduSuo$annotations() {
        }

        /* renamed from: getDefault-eUduSuo, reason: not valid java name */
        public final int m26543getDefaulteUduSuo() {
            return ImeAction.Default;
        }

        /* renamed from: getDone-eUduSuo, reason: not valid java name */
        public final int m26544getDoneeUduSuo() {
            return ImeAction.Done;
        }

        /* renamed from: getGo-eUduSuo, reason: not valid java name */
        public final int m26545getGoeUduSuo() {
            return ImeAction.f1355Go;
        }

        /* renamed from: getNext-eUduSuo, reason: not valid java name */
        public final int m26546getNexteUduSuo() {
            return ImeAction.Next;
        }

        /* renamed from: getNone-eUduSuo, reason: not valid java name */
        public final int m26547getNoneeUduSuo() {
            return ImeAction.None;
        }

        /* renamed from: getPrevious-eUduSuo, reason: not valid java name */
        public final int m26548getPreviouseUduSuo() {
            return ImeAction.Previous;
        }

        /* renamed from: getSearch-eUduSuo, reason: not valid java name */
        public final int m26549getSearcheUduSuo() {
            return ImeAction.Search;
        }

        /* renamed from: getSend-eUduSuo, reason: not valid java name */
        public final int m26550getSendeUduSuo() {
            return ImeAction.Send;
        }

        /* renamed from: getUnspecified-eUduSuo, reason: not valid java name */
        public final int m26551getUnspecifiedeUduSuo() {
            return ImeAction.Unspecified;
        }

        private Companion() {
        }
    }

    private /* synthetic */ ImeAction(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ImeAction m26527boximpl(int i10) {
        return new ImeAction(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m26528constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m26529equalsimpl(int i10, Object obj) {
        return (obj instanceof ImeAction) && i10 == ((ImeAction) obj).m26533unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m26530equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m26531hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m26532toStringimpl(int i10) {
        return m26530equalsimpl0(i10, Unspecified) ? "Unspecified" : m26530equalsimpl0(i10, None) ? "None" : m26530equalsimpl0(i10, Default) ? "Default" : m26530equalsimpl0(i10, f1355Go) ? "Go" : m26530equalsimpl0(i10, Search) ? "Search" : m26530equalsimpl0(i10, Send) ? "Send" : m26530equalsimpl0(i10, Previous) ? "Previous" : m26530equalsimpl0(i10, Next) ? "Next" : m26530equalsimpl0(i10, Done) ? "Done" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m26529equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m26531hashCodeimpl(this.value);
    }

    public String toString() {
        return m26532toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m26533unboximpl() {
        return this.value;
    }
}
