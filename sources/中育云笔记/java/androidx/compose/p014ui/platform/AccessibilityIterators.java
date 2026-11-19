package androidx.compose.p014ui.platform;

import android.graphics.Rect;
import androidx.compose.p014ui.semantics.SemanticsNode;
import androidx.compose.p014ui.text.TextLayoutResult;
import androidx.compose.p014ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class AccessibilityIterators {
    public static final int $stable = 0;

    @StabilityInferred(parameters = 0)
    public static abstract class AbstractTextSegmentIterator implements TextSegmentIterator {
        public static final int $stable = 8;
        private final int[] segment = new int[2];
        protected String text;

        public final int[] getRange(int i10, int i11) {
            if (i10 < 0 || i11 < 0 || i10 == i11) {
                return null;
            }
            int[] iArr = this.segment;
            iArr[0] = i10;
            iArr[1] = i11;
            return iArr;
        }

        public final String getText() {
            String str = this.text;
            if (str != null) {
                return str;
            }
            AbstractC9979u.m20312y("text");
            return null;
        }

        public void initialize(String str) {
            setText(str);
        }

        public final void setText(String str) {
            this.text = str;
        }
    }

    @StabilityInferred(parameters = 0)
    public static class CharacterTextSegmentIterator extends AbstractTextSegmentIterator {
        private static CharacterTextSegmentIterator instance;
        private BreakIterator impl;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
                this();
            }

            public final CharacterTextSegmentIterator getInstance(Locale locale) {
                if (CharacterTextSegmentIterator.instance == null) {
                    CharacterTextSegmentIterator.instance = new CharacterTextSegmentIterator(locale, null);
                }
                CharacterTextSegmentIterator characterTextSegmentIterator = CharacterTextSegmentIterator.instance;
                AbstractC9979u.m20292e(characterTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                return characterTextSegmentIterator;
            }

            private Companion() {
            }
        }

        public /* synthetic */ CharacterTextSegmentIterator(Locale locale, AbstractC9972n abstractC9972n) {
            this(locale);
        }

        private final void onLocaleChanged(Locale locale) {
            this.impl = BreakIterator.getCharacterInstance(locale);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i10) {
            int length = getText().length();
            if (length <= 0 || i10 >= length) {
                return null;
            }
            if (i10 < 0) {
                i10 = 0;
            }
            do {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    AbstractC9979u.m20312y("impl");
                    breakIterator = null;
                }
                if (breakIterator.isBoundary(i10)) {
                    BreakIterator breakIterator2 = this.impl;
                    if (breakIterator2 == null) {
                        AbstractC9979u.m20312y("impl");
                        breakIterator2 = null;
                    }
                    int iFollowing = breakIterator2.following(i10);
                    if (iFollowing == -1) {
                        return null;
                    }
                    return getRange(i10, iFollowing);
                }
                BreakIterator breakIterator3 = this.impl;
                if (breakIterator3 == null) {
                    AbstractC9979u.m20312y("impl");
                    breakIterator3 = null;
                }
                i10 = breakIterator3.following(i10);
            } while (i10 != -1);
            return null;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator
        public void initialize(String str) {
            super.initialize(str);
            BreakIterator breakIterator = this.impl;
            if (breakIterator == null) {
                AbstractC9979u.m20312y("impl");
                breakIterator = null;
            }
            breakIterator.setText(str);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i10) {
            int length = getText().length();
            if (length <= 0 || i10 <= 0) {
                return null;
            }
            if (i10 > length) {
                i10 = length;
            }
            do {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    AbstractC9979u.m20312y("impl");
                    breakIterator = null;
                }
                if (breakIterator.isBoundary(i10)) {
                    BreakIterator breakIterator2 = this.impl;
                    if (breakIterator2 == null) {
                        AbstractC9979u.m20312y("impl");
                        breakIterator2 = null;
                    }
                    int iPreceding = breakIterator2.preceding(i10);
                    if (iPreceding == -1) {
                        return null;
                    }
                    return getRange(iPreceding, i10);
                }
                BreakIterator breakIterator3 = this.impl;
                if (breakIterator3 == null) {
                    AbstractC9979u.m20312y("impl");
                    breakIterator3 = null;
                }
                i10 = breakIterator3.preceding(i10);
            } while (i10 != -1);
            return null;
        }

        private CharacterTextSegmentIterator(Locale locale) {
            onLocaleChanged(locale);
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class LineTextSegmentIterator extends AbstractTextSegmentIterator {
        private static LineTextSegmentIterator lineInstance;
        private TextLayoutResult layoutResult;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final ResolvedTextDirection DirectionStart = ResolvedTextDirection.Rtl;
        private static final ResolvedTextDirection DirectionEnd = ResolvedTextDirection.Ltr;

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
                this();
            }

            public final LineTextSegmentIterator getInstance() {
                if (LineTextSegmentIterator.lineInstance == null) {
                    LineTextSegmentIterator.lineInstance = new LineTextSegmentIterator(null);
                }
                LineTextSegmentIterator lineTextSegmentIterator = LineTextSegmentIterator.lineInstance;
                AbstractC9979u.m20292e(lineTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                return lineTextSegmentIterator;
            }

            private Companion() {
            }
        }

        public /* synthetic */ LineTextSegmentIterator(AbstractC9972n abstractC9972n) {
            this();
        }

        private final int getLineEdgeIndex(int i10, ResolvedTextDirection resolvedTextDirection) {
            TextLayoutResult textLayoutResult = this.layoutResult;
            TextLayoutResult textLayoutResult2 = null;
            if (textLayoutResult == null) {
                AbstractC9979u.m20312y("layoutResult");
                textLayoutResult = null;
            }
            int lineStart = textLayoutResult.getLineStart(i10);
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                AbstractC9979u.m20312y("layoutResult");
                textLayoutResult3 = null;
            }
            if (resolvedTextDirection != textLayoutResult3.getParagraphDirection(lineStart)) {
                TextLayoutResult textLayoutResult4 = this.layoutResult;
                if (textLayoutResult4 == null) {
                    AbstractC9979u.m20312y("layoutResult");
                } else {
                    textLayoutResult2 = textLayoutResult4;
                }
                return textLayoutResult2.getLineStart(i10);
            }
            TextLayoutResult textLayoutResult5 = this.layoutResult;
            if (textLayoutResult5 == null) {
                AbstractC9979u.m20312y("layoutResult");
                textLayoutResult5 = null;
            }
            return TextLayoutResult.getLineEnd$default(textLayoutResult5, i10, false, 2, null) - 1;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i10) {
            int lineForOffset;
            if (getText().length() <= 0 || i10 >= getText().length()) {
                return null;
            }
            if (i10 < 0) {
                TextLayoutResult textLayoutResult = this.layoutResult;
                if (textLayoutResult == null) {
                    AbstractC9979u.m20312y("layoutResult");
                    textLayoutResult = null;
                }
                lineForOffset = textLayoutResult.getLineForOffset(0);
            } else {
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    AbstractC9979u.m20312y("layoutResult");
                    textLayoutResult2 = null;
                }
                int lineForOffset2 = textLayoutResult2.getLineForOffset(i10);
                lineForOffset = getLineEdgeIndex(lineForOffset2, DirectionStart) == i10 ? lineForOffset2 : lineForOffset2 + 1;
            }
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                AbstractC9979u.m20312y("layoutResult");
                textLayoutResult3 = null;
            }
            if (lineForOffset >= textLayoutResult3.getLineCount()) {
                return null;
            }
            return getRange(getLineEdgeIndex(lineForOffset, DirectionStart), getLineEdgeIndex(lineForOffset, DirectionEnd) + 1);
        }

        public final void initialize(String str, TextLayoutResult textLayoutResult) {
            setText(str);
            this.layoutResult = textLayoutResult;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i10) {
            int lineForOffset;
            if (getText().length() <= 0 || i10 <= 0) {
                return null;
            }
            if (i10 > getText().length()) {
                TextLayoutResult textLayoutResult = this.layoutResult;
                if (textLayoutResult == null) {
                    AbstractC9979u.m20312y("layoutResult");
                    textLayoutResult = null;
                }
                lineForOffset = textLayoutResult.getLineForOffset(getText().length());
            } else {
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    AbstractC9979u.m20312y("layoutResult");
                    textLayoutResult2 = null;
                }
                int lineForOffset2 = textLayoutResult2.getLineForOffset(i10);
                lineForOffset = getLineEdgeIndex(lineForOffset2, DirectionEnd) + 1 == i10 ? lineForOffset2 : lineForOffset2 - 1;
            }
            if (lineForOffset < 0) {
                return null;
            }
            return getRange(getLineEdgeIndex(lineForOffset, DirectionStart), getLineEdgeIndex(lineForOffset, DirectionEnd) + 1);
        }

        private LineTextSegmentIterator() {
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class PageTextSegmentIterator extends AbstractTextSegmentIterator {
        private static PageTextSegmentIterator pageInstance;
        private TextLayoutResult layoutResult;
        private SemanticsNode node;
        private Rect tempRect;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final ResolvedTextDirection DirectionStart = ResolvedTextDirection.Rtl;
        private static final ResolvedTextDirection DirectionEnd = ResolvedTextDirection.Ltr;

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
                this();
            }

            public final PageTextSegmentIterator getInstance() {
                if (PageTextSegmentIterator.pageInstance == null) {
                    PageTextSegmentIterator.pageInstance = new PageTextSegmentIterator(null);
                }
                PageTextSegmentIterator pageTextSegmentIterator = PageTextSegmentIterator.pageInstance;
                AbstractC9979u.m20292e(pageTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                return pageTextSegmentIterator;
            }

            private Companion() {
            }
        }

        public /* synthetic */ PageTextSegmentIterator(AbstractC9972n abstractC9972n) {
            this();
        }

        private final int getLineEdgeIndex(int i10, ResolvedTextDirection resolvedTextDirection) {
            TextLayoutResult textLayoutResult = this.layoutResult;
            TextLayoutResult textLayoutResult2 = null;
            if (textLayoutResult == null) {
                AbstractC9979u.m20312y("layoutResult");
                textLayoutResult = null;
            }
            int lineStart = textLayoutResult.getLineStart(i10);
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                AbstractC9979u.m20312y("layoutResult");
                textLayoutResult3 = null;
            }
            if (resolvedTextDirection != textLayoutResult3.getParagraphDirection(lineStart)) {
                TextLayoutResult textLayoutResult4 = this.layoutResult;
                if (textLayoutResult4 == null) {
                    AbstractC9979u.m20312y("layoutResult");
                } else {
                    textLayoutResult2 = textLayoutResult4;
                }
                return textLayoutResult2.getLineStart(i10);
            }
            TextLayoutResult textLayoutResult5 = this.layoutResult;
            if (textLayoutResult5 == null) {
                AbstractC9979u.m20312y("layoutResult");
                textLayoutResult5 = null;
            }
            return TextLayoutResult.getLineEnd$default(textLayoutResult5, i10, false, 2, null) - 1;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i10) {
            int lineCount;
            TextLayoutResult textLayoutResult = null;
            if (getText().length() <= 0 || i10 >= getText().length()) {
                return null;
            }
            try {
                SemanticsNode semanticsNode = this.node;
                if (semanticsNode == null) {
                    AbstractC9979u.m20312y("node");
                    semanticsNode = null;
                }
                androidx.compose.p014ui.geometry.Rect boundsInRoot = semanticsNode.getBoundsInRoot();
                int iRound = Math.round(boundsInRoot.getBottom() - boundsInRoot.getTop());
                int iM21752e = AbstractC10410o.m21752e(0, i10);
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    AbstractC9979u.m20312y("layoutResult");
                    textLayoutResult2 = null;
                }
                int lineForOffset = textLayoutResult2.getLineForOffset(iM21752e);
                TextLayoutResult textLayoutResult3 = this.layoutResult;
                if (textLayoutResult3 == null) {
                    AbstractC9979u.m20312y("layoutResult");
                    textLayoutResult3 = null;
                }
                float lineTop = textLayoutResult3.getLineTop(lineForOffset) + iRound;
                TextLayoutResult textLayoutResult4 = this.layoutResult;
                if (textLayoutResult4 == null) {
                    AbstractC9979u.m20312y("layoutResult");
                    textLayoutResult4 = null;
                }
                TextLayoutResult textLayoutResult5 = this.layoutResult;
                if (textLayoutResult5 == null) {
                    AbstractC9979u.m20312y("layoutResult");
                    textLayoutResult5 = null;
                }
                if (lineTop < textLayoutResult4.getLineTop(textLayoutResult5.getLineCount() - 1)) {
                    TextLayoutResult textLayoutResult6 = this.layoutResult;
                    if (textLayoutResult6 == null) {
                        AbstractC9979u.m20312y("layoutResult");
                    } else {
                        textLayoutResult = textLayoutResult6;
                    }
                    lineCount = textLayoutResult.getLineForVerticalPosition(lineTop);
                } else {
                    TextLayoutResult textLayoutResult7 = this.layoutResult;
                    if (textLayoutResult7 == null) {
                        AbstractC9979u.m20312y("layoutResult");
                    } else {
                        textLayoutResult = textLayoutResult7;
                    }
                    lineCount = textLayoutResult.getLineCount();
                }
                return getRange(iM21752e, getLineEdgeIndex(lineCount - 1, DirectionEnd) + 1);
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        public final void initialize(String str, TextLayoutResult textLayoutResult, SemanticsNode semanticsNode) {
            setText(str);
            this.layoutResult = textLayoutResult;
            this.node = semanticsNode;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i10) {
            int lineForVerticalPosition;
            TextLayoutResult textLayoutResult = null;
            if (getText().length() <= 0 || i10 <= 0) {
                return null;
            }
            try {
                SemanticsNode semanticsNode = this.node;
                if (semanticsNode == null) {
                    AbstractC9979u.m20312y("node");
                    semanticsNode = null;
                }
                androidx.compose.p014ui.geometry.Rect boundsInRoot = semanticsNode.getBoundsInRoot();
                int iRound = Math.round(boundsInRoot.getBottom() - boundsInRoot.getTop());
                int iM21756i = AbstractC10410o.m21756i(getText().length(), i10);
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    AbstractC9979u.m20312y("layoutResult");
                    textLayoutResult2 = null;
                }
                int lineForOffset = textLayoutResult2.getLineForOffset(iM21756i);
                TextLayoutResult textLayoutResult3 = this.layoutResult;
                if (textLayoutResult3 == null) {
                    AbstractC9979u.m20312y("layoutResult");
                    textLayoutResult3 = null;
                }
                float lineTop = textLayoutResult3.getLineTop(lineForOffset) - iRound;
                if (lineTop > 0.0f) {
                    TextLayoutResult textLayoutResult4 = this.layoutResult;
                    if (textLayoutResult4 == null) {
                        AbstractC9979u.m20312y("layoutResult");
                    } else {
                        textLayoutResult = textLayoutResult4;
                    }
                    lineForVerticalPosition = textLayoutResult.getLineForVerticalPosition(lineTop);
                } else {
                    lineForVerticalPosition = 0;
                }
                if (iM21756i == getText().length() && lineForVerticalPosition < lineForOffset) {
                    lineForVerticalPosition++;
                }
                return getRange(getLineEdgeIndex(lineForVerticalPosition, DirectionStart), iM21756i);
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        private PageTextSegmentIterator() {
            this.tempRect = new Rect();
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class ParagraphTextSegmentIterator extends AbstractTextSegmentIterator {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static ParagraphTextSegmentIterator instance;

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
                this();
            }

            public final ParagraphTextSegmentIterator getInstance() {
                if (ParagraphTextSegmentIterator.instance == null) {
                    ParagraphTextSegmentIterator.instance = new ParagraphTextSegmentIterator(null);
                }
                ParagraphTextSegmentIterator paragraphTextSegmentIterator = ParagraphTextSegmentIterator.instance;
                AbstractC9979u.m20292e(paragraphTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                return paragraphTextSegmentIterator;
            }

            private Companion() {
            }
        }

        public /* synthetic */ ParagraphTextSegmentIterator(AbstractC9972n abstractC9972n) {
            this();
        }

        private final boolean isEndBoundary(int i10) {
            if (i10 <= 0 || getText().charAt(i10 - 1) == '\n') {
                return false;
            }
            return i10 == getText().length() || getText().charAt(i10) == '\n';
        }

        private final boolean isStartBoundary(int i10) {
            if (getText().charAt(i10) != '\n') {
                return i10 == 0 || getText().charAt(i10 - 1) == '\n';
            }
            return false;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i10) {
            int length = getText().length();
            if (length <= 0 || i10 >= length) {
                return null;
            }
            if (i10 < 0) {
                i10 = 0;
            }
            while (i10 < length && getText().charAt(i10) == '\n' && !isStartBoundary(i10)) {
                i10++;
            }
            if (i10 >= length) {
                return null;
            }
            int i11 = i10 + 1;
            while (i11 < length && !isEndBoundary(i11)) {
                i11++;
            }
            return getRange(i10, i11);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i10) {
            int length = getText().length();
            if (length <= 0 || i10 <= 0) {
                return null;
            }
            if (i10 > length) {
                i10 = length;
            }
            while (i10 > 0 && getText().charAt(i10 - 1) == '\n' && !isEndBoundary(i10)) {
                i10--;
            }
            if (i10 <= 0) {
                return null;
            }
            int i11 = i10 - 1;
            while (i11 > 0 && !isStartBoundary(i11)) {
                i11--;
            }
            return getRange(i11, i10);
        }

        private ParagraphTextSegmentIterator() {
        }
    }

    public interface TextSegmentIterator {
        int[] following(int i10);

        int[] preceding(int i10);
    }

    @StabilityInferred(parameters = 0)
    public static final class WordTextSegmentIterator extends AbstractTextSegmentIterator {
        private static WordTextSegmentIterator instance;
        private BreakIterator impl;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
                this();
            }

            public final WordTextSegmentIterator getInstance(Locale locale) {
                if (WordTextSegmentIterator.instance == null) {
                    WordTextSegmentIterator.instance = new WordTextSegmentIterator(locale, null);
                }
                WordTextSegmentIterator wordTextSegmentIterator = WordTextSegmentIterator.instance;
                AbstractC9979u.m20292e(wordTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                return wordTextSegmentIterator;
            }

            private Companion() {
            }
        }

        public /* synthetic */ WordTextSegmentIterator(Locale locale, AbstractC9972n abstractC9972n) {
            this(locale);
        }

        private final boolean isEndBoundary(int i10) {
            if (i10 <= 0 || !isLetterOrDigit(i10 - 1)) {
                return false;
            }
            return i10 == getText().length() || !isLetterOrDigit(i10);
        }

        private final boolean isLetterOrDigit(int i10) {
            if (i10 < 0 || i10 >= getText().length()) {
                return false;
            }
            return Character.isLetterOrDigit(getText().codePointAt(i10));
        }

        private final boolean isStartBoundary(int i10) {
            if (isLetterOrDigit(i10)) {
                return i10 == 0 || !isLetterOrDigit(i10 - 1);
            }
            return false;
        }

        private final void onLocaleChanged(Locale locale) {
            this.impl = BreakIterator.getWordInstance(locale);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i10) {
            if (getText().length() <= 0 || i10 >= getText().length()) {
                return null;
            }
            if (i10 < 0) {
                i10 = 0;
            }
            while (!isLetterOrDigit(i10) && !isStartBoundary(i10)) {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    AbstractC9979u.m20312y("impl");
                    breakIterator = null;
                }
                i10 = breakIterator.following(i10);
                if (i10 == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.impl;
            if (breakIterator2 == null) {
                AbstractC9979u.m20312y("impl");
                breakIterator2 = null;
            }
            int iFollowing = breakIterator2.following(i10);
            if (iFollowing == -1 || !isEndBoundary(iFollowing)) {
                return null;
            }
            return getRange(i10, iFollowing);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator
        public void initialize(String str) {
            super.initialize(str);
            BreakIterator breakIterator = this.impl;
            if (breakIterator == null) {
                AbstractC9979u.m20312y("impl");
                breakIterator = null;
            }
            breakIterator.setText(str);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i10) {
            int length = getText().length();
            if (length <= 0 || i10 <= 0) {
                return null;
            }
            if (i10 > length) {
                i10 = length;
            }
            while (i10 > 0 && !isLetterOrDigit(i10 - 1) && !isEndBoundary(i10)) {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    AbstractC9979u.m20312y("impl");
                    breakIterator = null;
                }
                i10 = breakIterator.preceding(i10);
                if (i10 == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.impl;
            if (breakIterator2 == null) {
                AbstractC9979u.m20312y("impl");
                breakIterator2 = null;
            }
            int iPreceding = breakIterator2.preceding(i10);
            if (iPreceding == -1 || !isStartBoundary(iPreceding)) {
                return null;
            }
            return getRange(iPreceding, i10);
        }

        private WordTextSegmentIterator(Locale locale) {
            onLocaleChanged(locale);
        }
    }
}
