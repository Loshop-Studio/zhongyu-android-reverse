package androidx.compose.p013ui.text;

import java.text.BreakIterator;

/* loaded from: classes2.dex */
public final class JvmCharHelpers_androidKt {
    public static final int findFollowingBreak(String str, int i10) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i10);
    }

    public static final int findPrecedingBreak(String str, int i10) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i10);
    }
}
