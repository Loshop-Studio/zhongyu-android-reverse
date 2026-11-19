package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.p014ui.unit.C3186Dp;
import p211jd.AbstractC9719c;

/* loaded from: classes2.dex */
public final class ExpressiveNavigationBarKt {
    private static final ColorSchemeKeyTokens ActiveIconColor;
    private static final ColorSchemeKeyTokens ActiveIndicatorColor;
    private static final ShapeKeyTokens ActiveIndicatorShape;
    private static final ColorSchemeKeyTokens ActiveLabelTextColor;
    private static final float IconSize;
    private static final ColorSchemeKeyTokens InactiveIconColor;
    private static final ColorSchemeKeyTokens InactiveLabelTextColor;
    private static final TypographyKeyTokens LabelTextFont;
    private static final float NavigationBarHeight;
    private static final float StartIconIndicatorHorizontalPadding;
    private static final float StartIconIndicatorVerticalPadding;
    private static final float StartIconItemActiveIndicatorHeight;
    private static final float StartIconToLabelPadding;
    private static final float TopIconIndicatorHorizontalPadding;
    private static final float TopIconIndicatorToLabelPadding;
    private static final float TopIconIndicatorVerticalPadding;
    private static final float TopIconItemActiveIndicatorHeight;
    private static final float TopIconItemActiveIndicatorWidth;
    private static final float TopIconItemVerticalPadding;

    static {
        float fM33501constructorimpl = C3186Dp.m33501constructorimpl((float) 24.0d);
        IconSize = fM33501constructorimpl;
        float fM33501constructorimpl2 = C3186Dp.m33501constructorimpl(56);
        TopIconItemActiveIndicatorWidth = fM33501constructorimpl2;
        float fM33501constructorimpl3 = C3186Dp.m33501constructorimpl(32);
        TopIconItemActiveIndicatorHeight = fM33501constructorimpl3;
        float fM33501constructorimpl4 = C3186Dp.m33501constructorimpl(40);
        StartIconItemActiveIndicatorHeight = fM33501constructorimpl4;
        LabelTextFont = TypographyKeyTokens.LabelMedium;
        ActiveIndicatorShape = ShapeKeyTokens.CornerFull;
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Secondary;
        ActiveIconColor = colorSchemeKeyTokens;
        ActiveLabelTextColor = colorSchemeKeyTokens;
        ActiveIndicatorColor = ColorSchemeKeyTokens.SecondaryContainer;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurfaceVariant;
        InactiveIconColor = colorSchemeKeyTokens2;
        InactiveLabelTextColor = colorSchemeKeyTokens2;
        NavigationBarHeight = C3186Dp.m33501constructorimpl(64);
        TopIconItemVerticalPadding = C3186Dp.m33501constructorimpl(6);
        float f10 = 2;
        TopIconIndicatorVerticalPadding = C3186Dp.m33501constructorimpl(C3186Dp.m33501constructorimpl(fM33501constructorimpl3 - fM33501constructorimpl) / f10);
        TopIconIndicatorHorizontalPadding = C3186Dp.m33501constructorimpl(C3186Dp.m33501constructorimpl(fM33501constructorimpl2 - fM33501constructorimpl) / f10);
        StartIconIndicatorVerticalPadding = C3186Dp.m33501constructorimpl(C3186Dp.m33501constructorimpl(fM33501constructorimpl4 - fM33501constructorimpl) / f10);
        float f11 = 4;
        TopIconIndicatorToLabelPadding = C3186Dp.m33501constructorimpl(f11);
        StartIconIndicatorHorizontalPadding = C3186Dp.m33501constructorimpl(16);
        StartIconToLabelPadding = C3186Dp.m33501constructorimpl(f11);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0170  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: ExpressiveNavigationBar-NiJtXQ4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m28691ExpressiveNavigationBarNiJtXQ4(androidx.compose.p014ui.Modifier r23, long r24, long r26, androidx.compose.foundation.layout.WindowInsets r28, int r29, final p181hd.InterfaceC9544p r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExpressiveNavigationBarKt.m28691ExpressiveNavigationBarNiJtXQ4(androidx.compose.ui.Modifier, long, long, androidx.compose.foundation.layout.WindowInsets, int, hd.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0109  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: ExpressiveNavigationBarItem-pli-t6k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m28692ExpressiveNavigationBarItemplit6k(final boolean r34, final p181hd.InterfaceC9529a r35, final p181hd.InterfaceC9544p r36, androidx.compose.p014ui.Modifier r37, boolean r38, p181hd.InterfaceC9544p r39, p181hd.InterfaceC9544p r40, int r41, androidx.compose.material3.NavigationItemColors r42, androidx.compose.foundation.interaction.MutableInteractionSource r43, androidx.compose.runtime.Composer r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExpressiveNavigationBarKt.m28692ExpressiveNavigationBarItemplit6k(boolean, hd.a, hd.p, androidx.compose.ui.Modifier, boolean, hd.p, hd.p, int, androidx.compose.material3.NavigationItemColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int calculateCenteredContentHorizontalPadding(int i10, int i11) {
        if (i10 > 6) {
            return 0;
        }
        return AbstractC9719c.m19282d((((100 - ((i10 + 3) * 10)) / 2.0f) / 100) * i11);
    }

    public static final float getStartIconIndicatorHorizontalPadding() {
        return StartIconIndicatorHorizontalPadding;
    }

    public static final float getStartIconIndicatorVerticalPadding() {
        return StartIconIndicatorVerticalPadding;
    }

    public static final float getStartIconToLabelPadding() {
        return StartIconToLabelPadding;
    }

    public static final float getTopIconIndicatorHorizontalPadding() {
        return TopIconIndicatorHorizontalPadding;
    }

    public static final float getTopIconIndicatorToLabelPadding() {
        return TopIconIndicatorToLabelPadding;
    }

    public static final float getTopIconIndicatorVerticalPadding() {
        return TopIconIndicatorVerticalPadding;
    }

    public static final float getTopIconItemVerticalPadding() {
        return TopIconItemVerticalPadding;
    }
}
