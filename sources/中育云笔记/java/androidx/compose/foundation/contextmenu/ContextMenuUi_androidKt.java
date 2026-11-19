package androidx.compose.foundation.contextmenu;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.annotation.AttrRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.ColorKt;
import androidx.compose.p014ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p014ui.window.PopupPositionProvider;
import androidx.compose.p014ui.window.PopupProperties;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class ContextMenuUi_androidKt {
    private static final ContextMenuColors DefaultContextMenuColors;
    private static final PopupProperties DefaultPopupProperties = new PopupProperties(true, false, false, false, 14, (AbstractC9972n) null);
    private static final float DisabledAlpha = 0.38f;

    static {
        Color.Companion companion = Color.Companion;
        DefaultContextMenuColors = new ContextMenuColors(companion.m30915getWhite0d7_KjU(), companion.m30904getBlack0d7_KjU(), companion.m30904getBlack0d7_KjU(), Color.m30877copywmQWz5c$default(companion.m30904getBlack0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m30877copywmQWz5c$default(companion.m30904getBlack0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.annotation.VisibleForTesting
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ContextMenuColumn(androidx.compose.foundation.contextmenu.ContextMenuColors r28, androidx.compose.p014ui.Modifier r29, final p181hd.InterfaceC9545q r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt.ContextMenuColumn(androidx.compose.foundation.contextmenu.ContextMenuColors, androidx.compose.ui.Modifier, hd.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c6  */
    @android.annotation.SuppressLint({"ComposableLambdaParameterPosition"})
    @androidx.annotation.VisibleForTesting
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ContextMenuItem(final java.lang.String r23, final boolean r24, final androidx.compose.foundation.contextmenu.ContextMenuColors r25, androidx.compose.p014ui.Modifier r26, p181hd.InterfaceC9545q r27, final p181hd.InterfaceC9529a r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt.ContextMenuItem(java.lang.String, boolean, androidx.compose.foundation.contextmenu.ContextMenuColors, androidx.compose.ui.Modifier, hd.q, hd.a, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ContextMenuPopup(PopupPositionProvider popupPositionProvider, InterfaceC9529a interfaceC9529a, Modifier modifier, InterfaceC9540l interfaceC9540l, Composer composer, final int i10, final int i11) {
        int i12;
        InterfaceC9529a interfaceC9529a2;
        final InterfaceC9540l interfaceC9540l2;
        final PopupPositionProvider popupPositionProvider2;
        final Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(712057293);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(popupPositionProvider) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9529a) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9540l) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 1171) != 1170, i12 & 1)) {
            if (i13 != 0) {
                modifier = Modifier.Companion;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(712057293, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.android.kt:106)");
            }
            interfaceC9529a2 = interfaceC9529a;
            ContextMenuPopup(popupPositionProvider, interfaceC9529a2, modifier3, computeContextMenuColors(0, 0, composerStartRestartGroup, 0, 3), interfaceC9540l, composerStartRestartGroup, (i12 & 1022) | ((i12 << 3) & 57344), 0);
            popupPositionProvider2 = popupPositionProvider;
            interfaceC9540l2 = interfaceC9540l;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            interfaceC9529a2 = interfaceC9529a;
            interfaceC9540l2 = interfaceC9540l;
            popupPositionProvider2 = popupPositionProvider;
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final InterfaceC9529a interfaceC9529a3 = interfaceC9529a2;
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt.ContextMenuPopup.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i14) {
                    ContextMenuUi_androidKt.ContextMenuPopup(popupPositionProvider2, interfaceC9529a3, modifier2, interfaceC9540l2, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
                }
            });
        }
    }

    @Composable
    @VisibleForTesting
    public static final ContextMenuColors computeContextMenuColors(@StyleRes int i10, @StyleRes int i11, Composer composer, int i12, int i13) throws Resources.NotFoundException {
        int i14 = (i13 & 1) != 0 ? R.style.Widget.PopupMenu : i10;
        int i15 = (i13 & 2) != 0 ? R.style.TextAppearance.Widget.PopupMenu.Large : i11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1689505294, i12, -1, "androidx.compose.foundation.contextmenu.computeContextMenuColors (ContextMenuUi.android.kt:363)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        boolean zChanged = composer.changed((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())) | composer.changed(context);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            ContextMenuColors contextMenuColors = DefaultContextMenuColors;
            long jM27084resolveColorg2O1Hgs = m27084resolveColorg2O1Hgs(context, i14, R.attr.colorBackground, contextMenuColors.m27061getBackgroundColor0d7_KjU());
            ColorStateList colorStateListResolveColorStateList = resolveColorStateList(context, i15, R.attr.textColorPrimary);
            long jM27083enabledColor4WTKRHQ = m27083enabledColor4WTKRHQ(colorStateListResolveColorStateList, contextMenuColors.m27065getTextColor0d7_KjU());
            long jM27082disabledColor4WTKRHQ = m27082disabledColor4WTKRHQ(colorStateListResolveColorStateList, contextMenuColors.m27063getDisabledTextColor0d7_KjU());
            Object contextMenuColors2 = new ContextMenuColors(jM27084resolveColorg2O1Hgs, jM27083enabledColor4WTKRHQ, jM27083enabledColor4WTKRHQ, jM27082disabledColor4WTKRHQ, jM27082disabledColor4WTKRHQ, null);
            composer.updateRememberedValue(contextMenuColors2);
            objRememberedValue = contextMenuColors2;
        }
        ContextMenuColors contextMenuColors3 = (ContextMenuColors) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return contextMenuColors3;
    }

    /* renamed from: disabledColor-4WTKRHQ, reason: not valid java name */
    private static final long m27082disabledColor4WTKRHQ(ColorStateList colorStateList, long j10) {
        int iM30932toArgb8_81llA = ColorKt.m30932toArgb8_81llA(j10);
        Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, iM30932toArgb8_81llA)) : null;
        return (numValueOf == null || numValueOf.intValue() == iM30932toArgb8_81llA) ? j10 : ColorKt.Color(numValueOf.intValue());
    }

    /* renamed from: enabledColor-4WTKRHQ, reason: not valid java name */
    private static final long m27083enabledColor4WTKRHQ(ColorStateList colorStateList, long j10) {
        int iM30932toArgb8_81llA = ColorKt.m30932toArgb8_81llA(j10);
        Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, iM30932toArgb8_81llA)) : null;
        return (numValueOf == null || numValueOf.intValue() == iM30932toArgb8_81llA) ? j10 : ColorKt.Color(numValueOf.intValue());
    }

    public static final ContextMenuColors getDefaultContextMenuColors() {
        return DefaultContextMenuColors;
    }

    @VisibleForTesting
    public static /* synthetic */ void getDefaultContextMenuColors$annotations() {
    }

    /* renamed from: resolveColor-g2O1Hgs, reason: not valid java name */
    private static final long m27084resolveColorg2O1Hgs(Context context, @StyleRes int i10, @AttrRes int i11, long j10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, new int[]{i11});
        int iM30932toArgb8_81llA = ColorKt.m30932toArgb8_81llA(j10);
        int color = typedArrayObtainStyledAttributes.getColor(0, iM30932toArgb8_81llA);
        typedArrayObtainStyledAttributes.recycle();
        return color == iM30932toArgb8_81llA ? j10 : ColorKt.Color(color);
    }

    private static final ColorStateList resolveColorStateList(Context context, @StyleRes int i10, @AttrRes int i11) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, new int[]{i11});
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
        typedArrayObtainStyledAttributes.recycle();
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ContextMenuPopup(final androidx.compose.p014ui.window.PopupPositionProvider r14, final p181hd.InterfaceC9529a r15, androidx.compose.p014ui.Modifier r16, final androidx.compose.foundation.contextmenu.ContextMenuColors r17, final p181hd.InterfaceC9540l r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt.ContextMenuPopup(androidx.compose.ui.window.PopupPositionProvider, hd.a, androidx.compose.ui.Modifier, androidx.compose.foundation.contextmenu.ContextMenuColors, hd.l, androidx.compose.runtime.Composer, int, int):void");
    }
}
