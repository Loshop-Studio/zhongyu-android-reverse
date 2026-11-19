package androidx.compose.p006ui.text.platform;

import androidx.compose.p006ui.text.AnnotatedString;
import androidx.compose.p006ui.text.EmojiSupportMatch;
import androidx.compose.p006ui.text.ParagraphIntrinsics;
import androidx.compose.p006ui.text.Placeholder;
import androidx.compose.p006ui.text.PlatformParagraphStyle;
import androidx.compose.p006ui.text.PlatformTextStyle;
import androidx.compose.p006ui.text.SpanStyle;
import androidx.compose.p006ui.text.TextStyle;
import androidx.compose.p006ui.text.font.FontFamily;
import androidx.compose.p006ui.text.intl.LocaleList;
import androidx.compose.p006ui.text.style.TextDirection;
import androidx.compose.p006ui.unit.Density;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000P\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aP\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u001a+\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u001a\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, m5175d2 = {"hasEmojiCompat", "", "Landroidx/compose/ui/text/TextStyle;", "getHasEmojiCompat", "(Landroidx/compose/ui/text/TextStyle;)Z", "ActualParagraphIntrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "text", "", "style", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "resolveTextDirectionHeuristics", "", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "resolveTextDirectionHeuristics-9GRLPo0", "ui-text_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class AndroidParagraphIntrinsics_androidKt {
    public static final ParagraphIntrinsics ActualParagraphIntrinsics(String text, TextStyle style, List<AnnotatedString.Range<SpanStyle>> spanStyles, List<AnnotatedString.Range<Placeholder>> placeholders, Density density, FontFamily.Resolver fontFamilyResolver) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        return new AndroidParagraphIntrinsics(text, style, spanStyles, placeholders, fontFamilyResolver, density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHasEmojiCompat(TextStyle textStyle) {
        PlatformParagraphStyle paragraphSyle;
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        return !(((platformStyle == null || (paragraphSyle = platformStyle.getParagraphSyle()) == null) ? null : EmojiSupportMatch.m10958boximpl(paragraphSyle.getEmojiSupportMatch())) == null ? false : EmojiSupportMatch.m10961equalsimpl0(r1.getValue(), EmojiSupportMatch.INSTANCE.m10966getNone_3YsG6Y()));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* renamed from: resolveTextDirectionHeuristics-9GRLPo0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int m11292resolveTextDirectionHeuristics9GRLPo0(androidx.compose.p006ui.text.style.TextDirection r6, androidx.compose.p006ui.text.intl.LocaleList r7) {
        /*
            if (r6 == 0) goto L7
            int r6 = r6.getValue()
            goto Ld
        L7:
            androidx.compose.ui.text.style.TextDirection$Companion r6 = androidx.compose.p006ui.text.style.TextDirection.INSTANCE
            int r6 = r6.m11444getContents_7Xco()
        Ld:
            androidx.compose.ui.text.style.TextDirection$Companion r0 = androidx.compose.p006ui.text.style.TextDirection.INSTANCE
            int r1 = r0.m11445getContentOrLtrs_7Xco()
            boolean r1 = androidx.compose.p006ui.text.style.TextDirection.m11440equalsimpl0(r6, r1)
            r2 = 2
            if (r1 == 0) goto L1b
            goto L6f
        L1b:
            int r1 = r0.m11446getContentOrRtls_7Xco()
            boolean r1 = androidx.compose.p006ui.text.style.TextDirection.m11440equalsimpl0(r6, r1)
            r3 = 3
            if (r1 == 0) goto L28
        L26:
            r2 = r3
            goto L6f
        L28:
            int r1 = r0.m11447getLtrs_7Xco()
            boolean r1 = androidx.compose.p006ui.text.style.TextDirection.m11440equalsimpl0(r6, r1)
            r4 = 0
            if (r1 == 0) goto L35
            r2 = r4
            goto L6f
        L35:
            int r1 = r0.m11448getRtls_7Xco()
            boolean r1 = androidx.compose.p006ui.text.style.TextDirection.m11440equalsimpl0(r6, r1)
            r5 = 1
            if (r1 == 0) goto L42
            r2 = r5
            goto L6f
        L42:
            int r0 = r0.m11444getContents_7Xco()
            boolean r6 = androidx.compose.p006ui.text.style.TextDirection.m11440equalsimpl0(r6, r0)
            if (r6 == 0) goto L70
            if (r7 == 0) goto L63
            androidx.compose.ui.text.intl.Locale r6 = r7.get(r4)
            androidx.compose.ui.text.intl.PlatformLocale r6 = r6.getPlatformLocale()
            java.lang.String r7 = "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r7)
            androidx.compose.ui.text.intl.AndroidLocale r6 = (androidx.compose.p006ui.text.intl.AndroidLocale) r6
            java.util.Locale r6 = r6.getJavaLocale()
            if (r6 != 0) goto L67
        L63:
            java.util.Locale r6 = java.util.Locale.getDefault()
        L67:
            int r6 = androidx.core.text.TextUtilsCompat.getLayoutDirectionFromLocale(r6)
            if (r6 == 0) goto L6f
            if (r6 == r5) goto L26
        L6f:
            return r2
        L70:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Invalid TextDirection."
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p006ui.text.platform.AndroidParagraphIntrinsics_androidKt.m11292resolveTextDirectionHeuristics9GRLPo0(androidx.compose.ui.text.style.TextDirection, androidx.compose.ui.text.intl.LocaleList):int");
    }

    /* renamed from: resolveTextDirectionHeuristics-9GRLPo0$default, reason: not valid java name */
    public static /* synthetic */ int m11293resolveTextDirectionHeuristics9GRLPo0$default(TextDirection textDirection, LocaleList localeList, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            textDirection = null;
        }
        if ((i4 & 2) != 0) {
            localeList = null;
        }
        return m11292resolveTextDirectionHeuristics9GRLPo0(textDirection, localeList);
    }
}
