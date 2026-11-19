package androidx.compose.p013ui.text.platform;

import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.EmojiSupportMatch;
import androidx.compose.p013ui.text.ParagraphIntrinsics;
import androidx.compose.p013ui.text.Placeholder;
import androidx.compose.p013ui.text.PlatformParagraphStyle;
import androidx.compose.p013ui.text.PlatformTextStyle;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.intl.LocaleList;
import androidx.compose.p013ui.text.style.TextDirection;
import androidx.compose.p013ui.unit.Density;
import androidx.core.text.TextUtilsCompat;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class AndroidParagraphIntrinsics_androidKt {
    public static final ParagraphIntrinsics ActualParagraphIntrinsics(String str, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, List<AnnotatedString.Range<Placeholder>> list2, Density density, FontFamily.Resolver resolver) {
        return new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHasEmojiCompat(TextStyle textStyle) {
        PlatformParagraphStyle paragraphStyle;
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        return !(((platformStyle == null || (paragraphStyle = platformStyle.getParagraphStyle()) == null) ? null : EmojiSupportMatch.m26201boximpl(paragraphStyle.m26282getEmojiSupportMatch_3YsG6Y())) == null ? false : EmojiSupportMatch.m26204equalsimpl0(r1.m26207unboximpl(), EmojiSupportMatch.Companion.m26210getNone_3YsG6Y()));
    }

    /* renamed from: resolveTextDirectionHeuristics-HklW4sA, reason: not valid java name */
    public static final int m26621resolveTextDirectionHeuristicsHklW4sA(int i10, LocaleList localeList) {
        Locale platformLocale;
        TextDirection.Companion companion = TextDirection.Companion;
        if (TextDirection.m26793equalsimpl0(i10, companion.m26798getContentOrLtrs_7Xco())) {
            return 2;
        }
        if (TextDirection.m26793equalsimpl0(i10, companion.m26799getContentOrRtls_7Xco())) {
            return 3;
        }
        if (TextDirection.m26793equalsimpl0(i10, companion.m26800getLtrs_7Xco())) {
            return 0;
        }
        if (TextDirection.m26793equalsimpl0(i10, companion.m26801getRtls_7Xco())) {
            return 1;
        }
        if (!(TextDirection.m26793equalsimpl0(i10, companion.m26797getContents_7Xco()) ? true : TextDirection.m26793equalsimpl0(i10, companion.m26802getUnspecifieds_7Xco()))) {
            throw new IllegalStateException("Invalid TextDirection.");
        }
        if (localeList == null || (platformLocale = localeList.get(0).getPlatformLocale()) == null) {
            platformLocale = Locale.getDefault();
        }
        int layoutDirectionFromLocale = TextUtilsCompat.getLayoutDirectionFromLocale(platformLocale);
        return (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) ? 2 : 3;
    }

    /* renamed from: resolveTextDirectionHeuristics-HklW4sA$default, reason: not valid java name */
    public static /* synthetic */ int m26622resolveTextDirectionHeuristicsHklW4sA$default(int i10, LocaleList localeList, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            localeList = null;
        }
        return m26621resolveTextDirectionHeuristicsHklW4sA(i10, localeList);
    }
}
