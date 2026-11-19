package androidx.compose.p013ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class LineBreak {
    public static final Companion Companion = new Companion(null);
    private static final int Heading;
    private static final int Paragraph;
    private static final int Simple;
    private static final int Unspecified;
    private final int mask;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        @Stable
        /* renamed from: getHeading-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m26697getHeadingrAG3T2k$annotations() {
        }

        @Stable
        /* renamed from: getParagraph-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m26698getParagraphrAG3T2k$annotations() {
        }

        @Stable
        /* renamed from: getSimple-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m26699getSimplerAG3T2k$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m26700getUnspecifiedrAG3T2k$annotations() {
        }

        /* renamed from: getHeading-rAG3T2k, reason: not valid java name */
        public final int m26701getHeadingrAG3T2k() {
            return LineBreak.Heading;
        }

        /* renamed from: getParagraph-rAG3T2k, reason: not valid java name */
        public final int m26702getParagraphrAG3T2k() {
            return LineBreak.Paragraph;
        }

        /* renamed from: getSimple-rAG3T2k, reason: not valid java name */
        public final int m26703getSimplerAG3T2k() {
            return LineBreak.Simple;
        }

        /* renamed from: getUnspecified-rAG3T2k, reason: not valid java name */
        public final int m26704getUnspecifiedrAG3T2k() {
            return LineBreak.Unspecified;
        }

        private Companion() {
        }
    }

    public static final class Strategy {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Simple = m26706constructorimpl(1);
        private static final int HighQuality = m26706constructorimpl(2);
        private static final int Balanced = m26706constructorimpl(3);
        private static final int Unspecified = m26706constructorimpl(0);

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
                this();
            }

            /* renamed from: getBalanced-fcGXIks, reason: not valid java name */
            public final int m26712getBalancedfcGXIks() {
                return Strategy.Balanced;
            }

            /* renamed from: getHighQuality-fcGXIks, reason: not valid java name */
            public final int m26713getHighQualityfcGXIks() {
                return Strategy.HighQuality;
            }

            /* renamed from: getSimple-fcGXIks, reason: not valid java name */
            public final int m26714getSimplefcGXIks() {
                return Strategy.Simple;
            }

            /* renamed from: getUnspecified-fcGXIks, reason: not valid java name */
            public final int m26715getUnspecifiedfcGXIks() {
                return Strategy.Unspecified;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Strategy(int i10) {
            this.value = i10;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Strategy m26705boximpl(int i10) {
            return new Strategy(i10);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m26706constructorimpl(int i10) {
            return i10;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m26707equalsimpl(int i10, Object obj) {
            return (obj instanceof Strategy) && i10 == ((Strategy) obj).m26711unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m26708equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m26709hashCodeimpl(int i10) {
            return Integer.hashCode(i10);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m26710toStringimpl(int i10) {
            return m26708equalsimpl0(i10, Simple) ? "Strategy.Simple" : m26708equalsimpl0(i10, HighQuality) ? "Strategy.HighQuality" : m26708equalsimpl0(i10, Balanced) ? "Strategy.Balanced" : m26708equalsimpl0(i10, Unspecified) ? "Strategy.Unspecified" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m26707equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m26709hashCodeimpl(this.value);
        }

        public String toString() {
            return m26710toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m26711unboximpl() {
            return this.value;
        }
    }

    public static final class Strictness {
        public static final Companion Companion = new Companion(null);
        private static final int Default = m26717constructorimpl(1);
        private static final int Loose = m26717constructorimpl(2);
        private static final int Normal = m26717constructorimpl(3);
        private static final int Strict = m26717constructorimpl(4);
        private static final int Unspecified = m26717constructorimpl(0);
        private final int value;

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
                this();
            }

            /* renamed from: getDefault-usljTpc, reason: not valid java name */
            public final int m26723getDefaultusljTpc() {
                return Strictness.Default;
            }

            /* renamed from: getLoose-usljTpc, reason: not valid java name */
            public final int m26724getLooseusljTpc() {
                return Strictness.Loose;
            }

            /* renamed from: getNormal-usljTpc, reason: not valid java name */
            public final int m26725getNormalusljTpc() {
                return Strictness.Normal;
            }

            /* renamed from: getStrict-usljTpc, reason: not valid java name */
            public final int m26726getStrictusljTpc() {
                return Strictness.Strict;
            }

            /* renamed from: getUnspecified-usljTpc, reason: not valid java name */
            public final int m26727getUnspecifiedusljTpc() {
                return Strictness.Unspecified;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Strictness(int i10) {
            this.value = i10;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Strictness m26716boximpl(int i10) {
            return new Strictness(i10);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m26717constructorimpl(int i10) {
            return i10;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m26718equalsimpl(int i10, Object obj) {
            return (obj instanceof Strictness) && i10 == ((Strictness) obj).m26722unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m26719equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m26720hashCodeimpl(int i10) {
            return Integer.hashCode(i10);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m26721toStringimpl(int i10) {
            return m26719equalsimpl0(i10, Default) ? "Strictness.None" : m26719equalsimpl0(i10, Loose) ? "Strictness.Loose" : m26719equalsimpl0(i10, Normal) ? "Strictness.Normal" : m26719equalsimpl0(i10, Strict) ? "Strictness.Strict" : m26719equalsimpl0(i10, Unspecified) ? "Strictness.Unspecified" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m26718equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m26720hashCodeimpl(this.value);
        }

        public String toString() {
            return m26721toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m26722unboximpl() {
            return this.value;
        }
    }

    public static final class WordBreak {
        public static final Companion Companion = new Companion(null);
        private static final int Default = m26729constructorimpl(1);
        private static final int Phrase = m26729constructorimpl(2);
        private static final int Unspecified = m26729constructorimpl(0);
        private final int value;

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
                this();
            }

            /* renamed from: getDefault-jp8hJ3c, reason: not valid java name */
            public final int m26735getDefaultjp8hJ3c() {
                return WordBreak.Default;
            }

            /* renamed from: getPhrase-jp8hJ3c, reason: not valid java name */
            public final int m26736getPhrasejp8hJ3c() {
                return WordBreak.Phrase;
            }

            /* renamed from: getUnspecified-jp8hJ3c, reason: not valid java name */
            public final int m26737getUnspecifiedjp8hJ3c() {
                return WordBreak.Unspecified;
            }

            private Companion() {
            }
        }

        private /* synthetic */ WordBreak(int i10) {
            this.value = i10;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ WordBreak m26728boximpl(int i10) {
            return new WordBreak(i10);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m26729constructorimpl(int i10) {
            return i10;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m26730equalsimpl(int i10, Object obj) {
            return (obj instanceof WordBreak) && i10 == ((WordBreak) obj).m26734unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m26731equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m26732hashCodeimpl(int i10) {
            return Integer.hashCode(i10);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m26733toStringimpl(int i10) {
            return m26731equalsimpl0(i10, Default) ? "WordBreak.None" : m26731equalsimpl0(i10, Phrase) ? "WordBreak.Phrase" : m26731equalsimpl0(i10, Unspecified) ? "WordBreak.Unspecified" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m26730equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m26732hashCodeimpl(this.value);
        }

        public String toString() {
            return m26733toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m26734unboximpl() {
            return this.value;
        }
    }

    static {
        Strategy.Companion companion = Strategy.Companion;
        int iM26714getSimplefcGXIks = companion.m26714getSimplefcGXIks();
        Strictness.Companion companion2 = Strictness.Companion;
        int iM26725getNormalusljTpc = companion2.m26725getNormalusljTpc();
        WordBreak.Companion companion3 = WordBreak.Companion;
        Simple = m26685constructorimpl(LineBreak_androidKt.packBytes(iM26714getSimplefcGXIks, iM26725getNormalusljTpc, companion3.m26735getDefaultjp8hJ3c()));
        Heading = m26685constructorimpl(LineBreak_androidKt.packBytes(companion.m26712getBalancedfcGXIks(), companion2.m26724getLooseusljTpc(), companion3.m26736getPhrasejp8hJ3c()));
        Paragraph = m26685constructorimpl(LineBreak_androidKt.packBytes(companion.m26713getHighQualityfcGXIks(), companion2.m26726getStrictusljTpc(), companion3.m26735getDefaultjp8hJ3c()));
        Unspecified = m26685constructorimpl(0);
    }

    private /* synthetic */ LineBreak(int i10) {
        this.mask = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ LineBreak m26684boximpl(int i10) {
        return new LineBreak(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m26685constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: copy-gijOMQM, reason: not valid java name */
    public static final int m26687copygijOMQM(int i10, int i11, int i12, int i13) {
        return m26686constructorimpl(i11, i12, i13);
    }

    /* renamed from: copy-gijOMQM$default, reason: not valid java name */
    public static /* synthetic */ int m26688copygijOMQM$default(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = m26691getStrategyfcGXIks(i10);
        }
        if ((i14 & 2) != 0) {
            i12 = m26692getStrictnessusljTpc(i10);
        }
        if ((i14 & 4) != 0) {
            i13 = m26693getWordBreakjp8hJ3c(i10);
        }
        return m26687copygijOMQM(i10, i11, i12, i13);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m26689equalsimpl(int i10, Object obj) {
        return (obj instanceof LineBreak) && i10 == ((LineBreak) obj).m26696unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m26690equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: getStrategy-fcGXIks, reason: not valid java name */
    public static final int m26691getStrategyfcGXIks(int i10) {
        return Strategy.m26706constructorimpl(LineBreak_androidKt.unpackByte1(i10));
    }

    /* renamed from: getStrictness-usljTpc, reason: not valid java name */
    public static final int m26692getStrictnessusljTpc(int i10) {
        return Strictness.m26717constructorimpl(LineBreak_androidKt.unpackByte2(i10));
    }

    /* renamed from: getWordBreak-jp8hJ3c, reason: not valid java name */
    public static final int m26693getWordBreakjp8hJ3c(int i10) {
        return WordBreak.m26729constructorimpl(LineBreak_androidKt.unpackByte3(i10));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m26694hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m26695toStringimpl(int i10) {
        return "LineBreak(strategy=" + ((Object) Strategy.m26710toStringimpl(m26691getStrategyfcGXIks(i10))) + ", strictness=" + ((Object) Strictness.m26721toStringimpl(m26692getStrictnessusljTpc(i10))) + ", wordBreak=" + ((Object) WordBreak.m26733toStringimpl(m26693getWordBreakjp8hJ3c(i10))) + ')';
    }

    public boolean equals(Object obj) {
        return m26689equalsimpl(this.mask, obj);
    }

    public int hashCode() {
        return m26694hashCodeimpl(this.mask);
    }

    public String toString() {
        return m26695toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m26696unboximpl() {
        return this.mask;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m26686constructorimpl(int i10, int i11, int i12) {
        return m26685constructorimpl(LineBreak_androidKt.packBytes(i10, i11, i12));
    }
}
