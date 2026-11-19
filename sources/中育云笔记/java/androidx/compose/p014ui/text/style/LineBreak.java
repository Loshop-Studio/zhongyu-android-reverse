package androidx.compose.p014ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

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
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        @Stable
        /* renamed from: getHeading-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m33299getHeadingrAG3T2k$annotations() {
        }

        @Stable
        /* renamed from: getParagraph-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m33300getParagraphrAG3T2k$annotations() {
        }

        @Stable
        /* renamed from: getSimple-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m33301getSimplerAG3T2k$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m33302getUnspecifiedrAG3T2k$annotations() {
        }

        /* renamed from: getHeading-rAG3T2k, reason: not valid java name */
        public final int m33303getHeadingrAG3T2k() {
            return LineBreak.Heading;
        }

        /* renamed from: getParagraph-rAG3T2k, reason: not valid java name */
        public final int m33304getParagraphrAG3T2k() {
            return LineBreak.Paragraph;
        }

        /* renamed from: getSimple-rAG3T2k, reason: not valid java name */
        public final int m33305getSimplerAG3T2k() {
            return LineBreak.Simple;
        }

        /* renamed from: getUnspecified-rAG3T2k, reason: not valid java name */
        public final int m33306getUnspecifiedrAG3T2k() {
            return LineBreak.Unspecified;
        }

        private Companion() {
        }
    }

    public static final class Strategy {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Simple = m33308constructorimpl(1);
        private static final int HighQuality = m33308constructorimpl(2);
        private static final int Balanced = m33308constructorimpl(3);
        private static final int Unspecified = m33308constructorimpl(0);

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
                this();
            }

            /* renamed from: getBalanced-fcGXIks, reason: not valid java name */
            public final int m33314getBalancedfcGXIks() {
                return Strategy.Balanced;
            }

            /* renamed from: getHighQuality-fcGXIks, reason: not valid java name */
            public final int m33315getHighQualityfcGXIks() {
                return Strategy.HighQuality;
            }

            /* renamed from: getSimple-fcGXIks, reason: not valid java name */
            public final int m33316getSimplefcGXIks() {
                return Strategy.Simple;
            }

            /* renamed from: getUnspecified-fcGXIks, reason: not valid java name */
            public final int m33317getUnspecifiedfcGXIks() {
                return Strategy.Unspecified;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Strategy(int i10) {
            this.value = i10;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Strategy m33307boximpl(int i10) {
            return new Strategy(i10);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m33308constructorimpl(int i10) {
            return i10;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m33309equalsimpl(int i10, Object obj) {
            return (obj instanceof Strategy) && i10 == ((Strategy) obj).m33313unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m33310equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m33311hashCodeimpl(int i10) {
            return Integer.hashCode(i10);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m33312toStringimpl(int i10) {
            return m33310equalsimpl0(i10, Simple) ? "Strategy.Simple" : m33310equalsimpl0(i10, HighQuality) ? "Strategy.HighQuality" : m33310equalsimpl0(i10, Balanced) ? "Strategy.Balanced" : m33310equalsimpl0(i10, Unspecified) ? "Strategy.Unspecified" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m33309equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m33311hashCodeimpl(this.value);
        }

        public String toString() {
            return m33312toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m33313unboximpl() {
            return this.value;
        }
    }

    public static final class Strictness {
        public static final Companion Companion = new Companion(null);
        private static final int Default = m33319constructorimpl(1);
        private static final int Loose = m33319constructorimpl(2);
        private static final int Normal = m33319constructorimpl(3);
        private static final int Strict = m33319constructorimpl(4);
        private static final int Unspecified = m33319constructorimpl(0);
        private final int value;

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
                this();
            }

            /* renamed from: getDefault-usljTpc, reason: not valid java name */
            public final int m33325getDefaultusljTpc() {
                return Strictness.Default;
            }

            /* renamed from: getLoose-usljTpc, reason: not valid java name */
            public final int m33326getLooseusljTpc() {
                return Strictness.Loose;
            }

            /* renamed from: getNormal-usljTpc, reason: not valid java name */
            public final int m33327getNormalusljTpc() {
                return Strictness.Normal;
            }

            /* renamed from: getStrict-usljTpc, reason: not valid java name */
            public final int m33328getStrictusljTpc() {
                return Strictness.Strict;
            }

            /* renamed from: getUnspecified-usljTpc, reason: not valid java name */
            public final int m33329getUnspecifiedusljTpc() {
                return Strictness.Unspecified;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Strictness(int i10) {
            this.value = i10;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Strictness m33318boximpl(int i10) {
            return new Strictness(i10);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m33319constructorimpl(int i10) {
            return i10;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m33320equalsimpl(int i10, Object obj) {
            return (obj instanceof Strictness) && i10 == ((Strictness) obj).m33324unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m33321equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m33322hashCodeimpl(int i10) {
            return Integer.hashCode(i10);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m33323toStringimpl(int i10) {
            return m33321equalsimpl0(i10, Default) ? "Strictness.None" : m33321equalsimpl0(i10, Loose) ? "Strictness.Loose" : m33321equalsimpl0(i10, Normal) ? "Strictness.Normal" : m33321equalsimpl0(i10, Strict) ? "Strictness.Strict" : m33321equalsimpl0(i10, Unspecified) ? "Strictness.Unspecified" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m33320equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m33322hashCodeimpl(this.value);
        }

        public String toString() {
            return m33323toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m33324unboximpl() {
            return this.value;
        }
    }

    public static final class WordBreak {
        public static final Companion Companion = new Companion(null);
        private static final int Default = m33331constructorimpl(1);
        private static final int Phrase = m33331constructorimpl(2);
        private static final int Unspecified = m33331constructorimpl(0);
        private final int value;

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
                this();
            }

            /* renamed from: getDefault-jp8hJ3c, reason: not valid java name */
            public final int m33337getDefaultjp8hJ3c() {
                return WordBreak.Default;
            }

            /* renamed from: getPhrase-jp8hJ3c, reason: not valid java name */
            public final int m33338getPhrasejp8hJ3c() {
                return WordBreak.Phrase;
            }

            /* renamed from: getUnspecified-jp8hJ3c, reason: not valid java name */
            public final int m33339getUnspecifiedjp8hJ3c() {
                return WordBreak.Unspecified;
            }

            private Companion() {
            }
        }

        private /* synthetic */ WordBreak(int i10) {
            this.value = i10;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ WordBreak m33330boximpl(int i10) {
            return new WordBreak(i10);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m33331constructorimpl(int i10) {
            return i10;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m33332equalsimpl(int i10, Object obj) {
            return (obj instanceof WordBreak) && i10 == ((WordBreak) obj).m33336unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m33333equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m33334hashCodeimpl(int i10) {
            return Integer.hashCode(i10);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m33335toStringimpl(int i10) {
            return m33333equalsimpl0(i10, Default) ? "WordBreak.None" : m33333equalsimpl0(i10, Phrase) ? "WordBreak.Phrase" : m33333equalsimpl0(i10, Unspecified) ? "WordBreak.Unspecified" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m33332equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m33334hashCodeimpl(this.value);
        }

        public String toString() {
            return m33335toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m33336unboximpl() {
            return this.value;
        }
    }

    static {
        Strategy.Companion companion = Strategy.Companion;
        int iM33316getSimplefcGXIks = companion.m33316getSimplefcGXIks();
        Strictness.Companion companion2 = Strictness.Companion;
        int iM33327getNormalusljTpc = companion2.m33327getNormalusljTpc();
        WordBreak.Companion companion3 = WordBreak.Companion;
        Simple = m33287constructorimpl(LineBreak_androidKt.packBytes(iM33316getSimplefcGXIks, iM33327getNormalusljTpc, companion3.m33337getDefaultjp8hJ3c()));
        Heading = m33287constructorimpl(LineBreak_androidKt.packBytes(companion.m33314getBalancedfcGXIks(), companion2.m33326getLooseusljTpc(), companion3.m33338getPhrasejp8hJ3c()));
        Paragraph = m33287constructorimpl(LineBreak_androidKt.packBytes(companion.m33315getHighQualityfcGXIks(), companion2.m33328getStrictusljTpc(), companion3.m33337getDefaultjp8hJ3c()));
        Unspecified = m33287constructorimpl(0);
    }

    private /* synthetic */ LineBreak(int i10) {
        this.mask = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ LineBreak m33286boximpl(int i10) {
        return new LineBreak(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m33287constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: copy-gijOMQM, reason: not valid java name */
    public static final int m33289copygijOMQM(int i10, int i11, int i12, int i13) {
        return m33288constructorimpl(i11, i12, i13);
    }

    /* renamed from: copy-gijOMQM$default, reason: not valid java name */
    public static /* synthetic */ int m33290copygijOMQM$default(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = m33293getStrategyfcGXIks(i10);
        }
        if ((i14 & 2) != 0) {
            i12 = m33294getStrictnessusljTpc(i10);
        }
        if ((i14 & 4) != 0) {
            i13 = m33295getWordBreakjp8hJ3c(i10);
        }
        return m33289copygijOMQM(i10, i11, i12, i13);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m33291equalsimpl(int i10, Object obj) {
        return (obj instanceof LineBreak) && i10 == ((LineBreak) obj).m33298unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33292equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: getStrategy-fcGXIks, reason: not valid java name */
    public static final int m33293getStrategyfcGXIks(int i10) {
        return Strategy.m33308constructorimpl(LineBreak_androidKt.unpackByte1(i10));
    }

    /* renamed from: getStrictness-usljTpc, reason: not valid java name */
    public static final int m33294getStrictnessusljTpc(int i10) {
        return Strictness.m33319constructorimpl(LineBreak_androidKt.unpackByte2(i10));
    }

    /* renamed from: getWordBreak-jp8hJ3c, reason: not valid java name */
    public static final int m33295getWordBreakjp8hJ3c(int i10) {
        return WordBreak.m33331constructorimpl(LineBreak_androidKt.unpackByte3(i10));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m33296hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m33297toStringimpl(int i10) {
        return "LineBreak(strategy=" + ((Object) Strategy.m33312toStringimpl(m33293getStrategyfcGXIks(i10))) + ", strictness=" + ((Object) Strictness.m33323toStringimpl(m33294getStrictnessusljTpc(i10))) + ", wordBreak=" + ((Object) WordBreak.m33335toStringimpl(m33295getWordBreakjp8hJ3c(i10))) + ')';
    }

    public boolean equals(Object obj) {
        return m33291equalsimpl(this.mask, obj);
    }

    public int hashCode() {
        return m33296hashCodeimpl(this.mask);
    }

    public String toString() {
        return m33297toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m33298unboximpl() {
        return this.mask;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m33288constructorimpl(int i10, int i11, int i12) {
        return m33287constructorimpl(LineBreak_androidKt.packBytes(i10, i11, i12));
    }
}
