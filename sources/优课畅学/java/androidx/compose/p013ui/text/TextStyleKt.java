package androidx.compose.p013ui.text;

import androidx.compose.p013ui.text.style.TextDirection;
import androidx.compose.p013ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class TextStyleKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlatformTextStyle createPlatformTextStyleInternal(PlatformSpanStyle platformSpanStyle, PlatformParagraphStyle platformParagraphStyle) {
        if (platformSpanStyle == null && platformParagraphStyle == null) {
            return null;
        }
        return AndroidTextStyle_androidKt.createPlatformTextStyle(platformSpanStyle, platformParagraphStyle);
    }

    public static final TextStyle lerp(TextStyle textStyle, TextStyle textStyle2, float f10) {
        return new TextStyle(SpanStyleKt.lerp(textStyle.toSpanStyle(), textStyle2.toSpanStyle(), f10), ParagraphStyleKt.lerp(textStyle.toParagraphStyle(), textStyle2.toParagraphStyle(), f10));
    }

    public static final TextStyle resolveDefaults(TextStyle textStyle, LayoutDirection layoutDirection) {
        return new TextStyle(SpanStyleKt.resolveSpanStyleDefaults(textStyle.getSpanStyle$ui_text_release()), ParagraphStyleKt.resolveParagraphStyleDefaults(textStyle.getParagraphStyle$ui_text_release(), layoutDirection), textStyle.getPlatformStyle());
    }

    /* renamed from: resolveTextDirection-IhaHGbI, reason: not valid java name */
    public static final int m26410resolveTextDirectionIhaHGbI(LayoutDirection layoutDirection, int i10) {
        TextDirection.Companion companion = TextDirection.Companion;
        if (TextDirection.m26793equalsimpl0(i10, companion.m26797getContents_7Xco())) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i11 == 1) {
                return companion.m26798getContentOrLtrs_7Xco();
            }
            if (i11 == 2) {
                return companion.m26799getContentOrRtls_7Xco();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!TextDirection.m26793equalsimpl0(i10, companion.m26802getUnspecifieds_7Xco())) {
            return i10;
        }
        int i12 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i12 == 1) {
            return companion.m26800getLtrs_7Xco();
        }
        if (i12 == 2) {
            return companion.m26801getRtls_7Xco();
        }
        throw new NoWhenBranchMatchedException();
    }
}
