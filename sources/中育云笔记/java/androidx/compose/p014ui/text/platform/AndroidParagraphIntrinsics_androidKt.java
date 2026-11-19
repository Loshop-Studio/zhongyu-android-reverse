package androidx.compose.p014ui.text.platform;

import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.EmojiSupportMatch;
import androidx.compose.p014ui.text.ParagraphIntrinsics;
import androidx.compose.p014ui.text.Placeholder;
import androidx.compose.p014ui.text.PlatformParagraphStyle;
import androidx.compose.p014ui.text.PlatformTextStyle;
import androidx.compose.p014ui.text.TextStyle;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.intl.LocaleList;
import androidx.compose.p014ui.text.style.TextDirection;
import androidx.compose.p014ui.unit.Density;
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
        return !(((platformStyle == null || (paragraphStyle = platformStyle.getParagraphStyle()) == null) ? null : EmojiSupportMatch.m32803boximpl(paragraphStyle.m32884getEmojiSupportMatch_3YsG6Y())) == null ? false : EmojiSupportMatch.m32806equalsimpl0(r1.m32809unboximpl(), EmojiSupportMatch.Companion.m32812getNone_3YsG6Y()));
    }

    /* renamed from: resolveTextDirectionHeuristics-HklW4sA, reason: not valid java name */
    public static final int m33223resolveTextDirectionHeuristicsHklW4sA(int i10, LocaleList localeList) {
        Locale platformLocale;
        TextDirection.Companion companion = TextDirection.Companion;
        if (TextDirection.m33395equalsimpl0(i10, companion.m33400getContentOrLtrs_7Xco())) {
            return 2;
        }
        if (TextDirection.m33395equalsimpl0(i10, companion.m33401getContentOrRtls_7Xco())) {
            return 3;
        }
        if (TextDirection.m33395equalsimpl0(i10, companion.m33402getLtrs_7Xco())) {
            return 0;
        }
        if (TextDirection.m33395equalsimpl0(i10, companion.m33403getRtls_7Xco())) {
            return 1;
        }
        if (!(TextDirection.m33395equalsimpl0(i10, companion.m33399getContents_7Xco()) ? true : TextDirection.m33395equalsimpl0(i10, companion.m33404getUnspecifieds_7Xco()))) {
            throw new IllegalStateException("Invalid TextDirection.");
        }
        if (localeList == null || (platformLocale = localeList.get(0).getPlatformLocale()) == null) {
            platformLocale = Locale.getDefault();
        }
        int layoutDirectionFromLocale = TextUtilsCompat.getLayoutDirectionFromLocale(platformLocale);
        return (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) ? 2 : 3;
    }

    /* renamed from: resolveTextDirectionHeuristics-HklW4sA$default, reason: not valid java name */
    public static /* synthetic */ int m33224resolveTextDirectionHeuristicsHklW4sA$default(int i10, LocaleList localeList, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            localeList = null;
        }
        return m33223resolveTextDirectionHeuristicsHklW4sA(i10, localeList);
    }
}
