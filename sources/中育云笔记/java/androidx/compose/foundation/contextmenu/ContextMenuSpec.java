package androidx.compose.foundation.contextmenu;

import androidx.annotation.VisibleForTesting;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.graphics.Shadow;
import androidx.compose.p014ui.graphics.drawscope.DrawStyle;
import androidx.compose.p014ui.text.PlatformTextStyle;
import androidx.compose.p014ui.text.TextStyle;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.font.FontStyle;
import androidx.compose.p014ui.text.font.FontSynthesis;
import androidx.compose.p014ui.text.font.FontWeight;
import androidx.compose.p014ui.text.intl.LocaleList;
import androidx.compose.p014ui.text.style.BaselineShift;
import androidx.compose.p014ui.text.style.LineHeightStyle;
import androidx.compose.p014ui.text.style.TextAlign;
import androidx.compose.p014ui.text.style.TextDecoration;
import androidx.compose.p014ui.text.style.TextGeometricTransform;
import androidx.compose.p014ui.text.style.TextIndent;
import androidx.compose.p014ui.text.style.TextMotion;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.TextUnitKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;

@StabilityInferred(parameters = 1)
@VisibleForTesting
/* loaded from: classes.dex */
public final class ContextMenuSpec {
    public static final int $stable = 0;
    public static final ContextMenuSpec INSTANCE = new ContextMenuSpec();
    private static final float ContainerWidthMin = C3186Dp.m33501constructorimpl(112);
    private static final float ContainerWidthMax = C3186Dp.m33501constructorimpl(280);
    private static final float ListItemHeight = C3186Dp.m33501constructorimpl(48);
    private static final float MenuContainerElevation = C3186Dp.m33501constructorimpl(3);
    private static final float CornerRadius = C3186Dp.m33501constructorimpl(4);
    private static final Alignment.Vertical LabelVerticalTextAlignment = Alignment.Companion.getCenterVertically();
    private static final int LabelHorizontalTextAlignment = TextAlign.Companion.m33390getStarte0LSkKk();
    private static final float HorizontalPadding = C3186Dp.m33501constructorimpl(12);
    private static final float VerticalPadding = C3186Dp.m33501constructorimpl(8);
    private static final float IconSize = C3186Dp.m33501constructorimpl(24);
    private static final long FontSize = TextUnitKt.getSp(14);
    private static final FontWeight FontWeight = FontWeight.Companion.getMedium();
    private static final long LineHeight = TextUnitKt.getSp(20);
    private static final long LetterSpacing = TextUnitKt.getSp(0.1f);

    private ContextMenuSpec() {
    }

    /* renamed from: getContainerWidthMax-D9Ej5fM, reason: not valid java name */
    public final float m27068getContainerWidthMaxD9Ej5fM() {
        return ContainerWidthMax;
    }

    /* renamed from: getContainerWidthMin-D9Ej5fM, reason: not valid java name */
    public final float m27069getContainerWidthMinD9Ej5fM() {
        return ContainerWidthMin;
    }

    /* renamed from: getCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m27070getCornerRadiusD9Ej5fM() {
        return CornerRadius;
    }

    /* renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m27071getFontSizeXSAIIZE() {
        return FontSize;
    }

    public final FontWeight getFontWeight() {
        return FontWeight;
    }

    /* renamed from: getHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m27072getHorizontalPaddingD9Ej5fM() {
        return HorizontalPadding;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m27073getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getLabelHorizontalTextAlignment-e0LSkKk, reason: not valid java name */
    public final int m27074getLabelHorizontalTextAlignmente0LSkKk() {
        return LabelHorizontalTextAlignment;
    }

    public final Alignment.Vertical getLabelVerticalTextAlignment() {
        return LabelVerticalTextAlignment;
    }

    /* renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name */
    public final long m27075getLetterSpacingXSAIIZE() {
        return LetterSpacing;
    }

    /* renamed from: getLineHeight-XSAIIZE, reason: not valid java name */
    public final long m27076getLineHeightXSAIIZE() {
        return LineHeight;
    }

    /* renamed from: getListItemHeight-D9Ej5fM, reason: not valid java name */
    public final float m27077getListItemHeightD9Ej5fM() {
        return ListItemHeight;
    }

    /* renamed from: getMenuContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m27078getMenuContainerElevationD9Ej5fM() {
        return MenuContainerElevation;
    }

    /* renamed from: getVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m27079getVerticalPaddingD9Ej5fM() {
        return VerticalPadding;
    }

    /* renamed from: textStyle-8_81llA, reason: not valid java name */
    public final TextStyle m27080textStyle8_81llA(long j10) {
        int i10 = LabelHorizontalTextAlignment;
        return new TextStyle(j10, FontSize, FontWeight, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, LetterSpacing, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, i10, 0, LineHeight, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16613240, (AbstractC9972n) null);
    }
}
