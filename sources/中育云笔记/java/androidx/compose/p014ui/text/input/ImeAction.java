package androidx.compose.p014ui.text.input;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes2.dex */
public final class ImeAction {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unspecified = m33130constructorimpl(-1);
    private static final int Default = m33130constructorimpl(1);
    private static final int None = m33130constructorimpl(0);

    /* renamed from: Go */
    private static final int f1285Go = m33130constructorimpl(2);
    private static final int Search = m33130constructorimpl(3);
    private static final int Send = m33130constructorimpl(4);
    private static final int Previous = m33130constructorimpl(5);
    private static final int Next = m33130constructorimpl(6);
    private static final int Done = m33130constructorimpl(7);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        @Stable
        /* renamed from: getDefault-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m33136getDefaulteUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getDone-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m33137getDoneeUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getGo-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m33138getGoeUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getNext-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m33139getNexteUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getNone-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m33140getNoneeUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getPrevious-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m33141getPreviouseUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getSearch-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m33142getSearcheUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getSend-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m33143getSendeUduSuo$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-eUduSuo$annotations, reason: not valid java name */
        public static /* synthetic */ void m33144getUnspecifiedeUduSuo$annotations() {
        }

        /* renamed from: getDefault-eUduSuo, reason: not valid java name */
        public final int m33145getDefaulteUduSuo() {
            return ImeAction.Default;
        }

        /* renamed from: getDone-eUduSuo, reason: not valid java name */
        public final int m33146getDoneeUduSuo() {
            return ImeAction.Done;
        }

        /* renamed from: getGo-eUduSuo, reason: not valid java name */
        public final int m33147getGoeUduSuo() {
            return ImeAction.f1285Go;
        }

        /* renamed from: getNext-eUduSuo, reason: not valid java name */
        public final int m33148getNexteUduSuo() {
            return ImeAction.Next;
        }

        /* renamed from: getNone-eUduSuo, reason: not valid java name */
        public final int m33149getNoneeUduSuo() {
            return ImeAction.None;
        }

        /* renamed from: getPrevious-eUduSuo, reason: not valid java name */
        public final int m33150getPreviouseUduSuo() {
            return ImeAction.Previous;
        }

        /* renamed from: getSearch-eUduSuo, reason: not valid java name */
        public final int m33151getSearcheUduSuo() {
            return ImeAction.Search;
        }

        /* renamed from: getSend-eUduSuo, reason: not valid java name */
        public final int m33152getSendeUduSuo() {
            return ImeAction.Send;
        }

        /* renamed from: getUnspecified-eUduSuo, reason: not valid java name */
        public final int m33153getUnspecifiedeUduSuo() {
            return ImeAction.Unspecified;
        }

        private Companion() {
        }
    }

    private /* synthetic */ ImeAction(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ImeAction m33129boximpl(int i10) {
        return new ImeAction(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m33130constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m33131equalsimpl(int i10, Object obj) {
        return (obj instanceof ImeAction) && i10 == ((ImeAction) obj).m33135unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33132equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m33133hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m33134toStringimpl(int i10) {
        return m33132equalsimpl0(i10, Unspecified) ? "Unspecified" : m33132equalsimpl0(i10, None) ? "None" : m33132equalsimpl0(i10, Default) ? "Default" : m33132equalsimpl0(i10, f1285Go) ? "Go" : m33132equalsimpl0(i10, Search) ? "Search" : m33132equalsimpl0(i10, Send) ? "Send" : m33132equalsimpl0(i10, Previous) ? "Previous" : m33132equalsimpl0(i10, Next) ? "Next" : m33132equalsimpl0(i10, Done) ? "Done" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m33131equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m33133hashCodeimpl(this.value);
    }

    public String toString() {
        return m33134toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m33135unboximpl() {
        return this.value;
    }
}
