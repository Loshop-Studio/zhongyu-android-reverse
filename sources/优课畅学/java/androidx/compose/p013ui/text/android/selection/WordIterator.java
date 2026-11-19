package androidx.compose.p013ui.text.android.selection;

import androidx.compose.p013ui.text.android.CharSequenceCharacterIterator;
import androidx.compose.p013ui.text.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.emoji2.text.EmojiCompat;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class WordIterator {
    private static final int WINDOW_WIDTH = 50;
    private final CharSequence charSequence;
    private final int end;
    private final BreakIterator iterator;
    private final int start;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final boolean isPunctuation$ui_text_release(int i10) {
            int type = Character.getType(i10);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }

        private Companion() {
        }
    }

    public WordIterator(CharSequence charSequence, int i10, int i11, Locale locale) {
        this.charSequence = charSequence;
        if (!(i10 >= 0 && i10 <= charSequence.length())) {
            InlineClassHelperKt.throwIllegalArgumentException("input start index is outside the CharSequence");
        }
        if (!(i11 >= 0 && i11 <= charSequence.length())) {
            InlineClassHelperKt.throwIllegalArgumentException("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.iterator = wordInstance;
        this.start = Math.max(0, i10 - 50);
        this.end = Math.min(charSequence.length(), i11 + 50);
        wordInstance.setText(new CharSequenceCharacterIterator(charSequence, i10, i11));
    }

    private final void checkOffsetIsValid(int i10) {
        int i11 = this.start;
        boolean z10 = false;
        if (i10 <= this.end && i11 <= i10) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Invalid offset: " + i10 + ". Valid range is [" + this.start + " , " + this.end + ']');
    }

    private final int getBeginning(int i10, boolean z10) {
        checkOffsetIsValid(i10);
        if (isOnLetterOrDigitOrEmoji(i10)) {
            return (!isBoundary(i10) || (isAfterLetterOrDigitOrEmoji(i10) && z10)) ? prevBoundary(i10) : i10;
        }
        if (isAfterLetterOrDigitOrEmoji(i10)) {
            return prevBoundary(i10);
        }
        return -1;
    }

    private final int getEnd(int i10, boolean z10) {
        checkOffsetIsValid(i10);
        if (isAfterLetterOrDigitOrEmoji(i10)) {
            return (!isBoundary(i10) || (isOnLetterOrDigitOrEmoji(i10) && z10)) ? nextBoundary(i10) : i10;
        }
        if (isOnLetterOrDigitOrEmoji(i10)) {
            return nextBoundary(i10);
        }
        return -1;
    }

    private final boolean isAfterLetterOrDigitOrEmoji(int i10) {
        int i11 = this.start + 1;
        if (i10 > this.end || i11 > i10) {
            return false;
        }
        if (Character.isLetterOrDigit(Character.codePointBefore(this.charSequence, i10))) {
            return true;
        }
        int i12 = i10 - 1;
        if (Character.isSurrogate(this.charSequence.charAt(i12))) {
            return true;
        }
        if (!EmojiCompat.isConfigured()) {
            return false;
        }
        EmojiCompat emojiCompat = EmojiCompat.get();
        return emojiCompat.getLoadState() == 1 && emojiCompat.getEmojiStart(this.charSequence, i12) != -1;
    }

    private final boolean isBoundary(int i10) {
        checkOffsetIsValid(i10);
        if (!this.iterator.isBoundary(i10)) {
            return false;
        }
        if (isOnLetterOrDigitOrEmoji(i10) && isOnLetterOrDigitOrEmoji(i10 - 1) && isOnLetterOrDigitOrEmoji(i10 + 1)) {
            return false;
        }
        return i10 <= 0 || i10 >= this.charSequence.length() - 1 || !(isHiraganaKatakanaBoundary(i10) || isHiraganaKatakanaBoundary(i10 + 1));
    }

    private final boolean isHiraganaKatakanaBoundary(int i10) {
        int i11 = i10 - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(this.charSequence.charAt(i11));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (AbstractC9133u.m16128b(unicodeBlockOf, unicodeBlock) && AbstractC9133u.m16128b(Character.UnicodeBlock.of(this.charSequence.charAt(i10)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return AbstractC9133u.m16128b(Character.UnicodeBlock.of(this.charSequence.charAt(i10)), unicodeBlock) && AbstractC9133u.m16128b(Character.UnicodeBlock.of(this.charSequence.charAt(i11)), Character.UnicodeBlock.KATAKANA);
    }

    private final boolean isOnLetterOrDigitOrEmoji(int i10) {
        int i11 = this.start;
        if (i10 >= this.end || i11 > i10) {
            return false;
        }
        if (Character.isLetterOrDigit(Character.codePointAt(this.charSequence, i10)) || Character.isSurrogate(this.charSequence.charAt(i10))) {
            return true;
        }
        if (!EmojiCompat.isConfigured()) {
            return false;
        }
        EmojiCompat emojiCompat = EmojiCompat.get();
        return emojiCompat.getLoadState() == 1 && emojiCompat.getEmojiStart(this.charSequence, i10) != -1;
    }

    private final boolean isPunctuationEndBoundary(int i10) {
        return !isOnPunctuation(i10) && isAfterPunctuation(i10);
    }

    private final boolean isPunctuationStartBoundary(int i10) {
        return isOnPunctuation(i10) && !isAfterPunctuation(i10);
    }

    public final CharSequence getCharSequence() {
        return this.charSequence;
    }

    public final int getNextWordEndOnTwoWordBoundary(int i10) {
        return getEnd(i10, true);
    }

    public final int getPrevWordBeginningOnTwoWordsBoundary(int i10) {
        return getBeginning(i10, true);
    }

    public final int getPunctuationBeginning(int i10) {
        checkOffsetIsValid(i10);
        while (i10 != -1 && !isPunctuationStartBoundary(i10)) {
            i10 = prevBoundary(i10);
        }
        return i10;
    }

    public final int getPunctuationEnd(int i10) {
        checkOffsetIsValid(i10);
        while (i10 != -1 && !isPunctuationEndBoundary(i10)) {
            i10 = nextBoundary(i10);
        }
        return i10;
    }

    public final boolean isAfterPunctuation(int i10) {
        int i11 = this.start + 1;
        if (i10 > this.end || i11 > i10) {
            return false;
        }
        return Companion.isPunctuation$ui_text_release(Character.codePointBefore(this.charSequence, i10));
    }

    public final boolean isOnPunctuation(int i10) {
        int i11 = this.start;
        if (i10 >= this.end || i11 > i10) {
            return false;
        }
        return Companion.isPunctuation$ui_text_release(Character.codePointAt(this.charSequence, i10));
    }

    public final int nextBoundary(int i10) {
        checkOffsetIsValid(i10);
        int iFollowing = this.iterator.following(i10);
        return (isOnLetterOrDigitOrEmoji(iFollowing + (-1)) && isOnLetterOrDigitOrEmoji(iFollowing) && !isHiraganaKatakanaBoundary(iFollowing)) ? nextBoundary(iFollowing) : iFollowing;
    }

    public final int prevBoundary(int i10) {
        checkOffsetIsValid(i10);
        int iPreceding = this.iterator.preceding(i10);
        return (isOnLetterOrDigitOrEmoji(iPreceding) && isAfterLetterOrDigitOrEmoji(iPreceding) && !isHiraganaKatakanaBoundary(iPreceding)) ? prevBoundary(iPreceding) : iPreceding;
    }
}
