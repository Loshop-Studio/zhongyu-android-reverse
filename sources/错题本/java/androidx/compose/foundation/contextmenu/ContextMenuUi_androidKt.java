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
import androidx.autofill.HintConstants;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.window.PopupPositionProvider;
import androidx.compose.p011ui.window.PopupProperties;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\u001aH\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\b\tH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aP\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\b\tH\u0001¢\u0006\u0004\b\u000b\u0010\u000f\u001a?\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\b\u0011¢\u0006\u0002\b\tH\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001ak\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u00052*\b\u0002\u0010\u001d\u001a$\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0002\b\u00112\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u001f\u0010 \u001a#\u0010$\u001a\u00020\r2\b\b\u0003\u0010\"\u001a\u00020!2\b\b\u0003\u0010#\u001a\u00020!H\u0001¢\u0006\u0004\b$\u0010%\u001a2\u0010,\u001a\u00020\u0019*\u00020&2\b\b\u0001\u0010'\u001a\u00020!2\b\b\u0001\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a)\u0010.\u001a\u0004\u0018\u00010-*\u00020&2\b\b\u0001\u0010'\u001a\u00020!2\b\b\u0001\u0010(\u001a\u00020!H\u0002¢\u0006\u0004\b.\u0010/\u001a \u00102\u001a\u00020\u0019*\u0004\u0018\u00010-2\u0006\u0010)\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a \u00104\u001a\u00020\u0019*\u0004\u0018\u00010-2\u0006\u0010)\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b3\u00101\"\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107\"\u0014\u00109\u001a\u0002088\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u0010:\" \u0010;\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b;\u0010<\u0012\u0004\b?\u0010@\u001a\u0004\b=\u0010>\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006A"}, m5110d2 = {"Landroidx/compose/ui/window/PopupPositionProvider;", "popupPositionProvider", "Lkotlin/Function0;", "Ld6/s;", "onDismiss", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/foundation/contextmenu/ContextMenuScope;", "Lkotlin/ExtensionFunctionType;", "contextMenuBuilderBlock", "ContextMenuPopup", "(Landroidx/compose/ui/window/PopupPositionProvider;Lr6/a;Landroidx/compose/ui/Modifier;Lr6/c;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/contextmenu/ContextMenuColors;", "colors", "(Landroidx/compose/ui/window/PopupPositionProvider;Lr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/contextmenu/ContextMenuColors;Lr6/c;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "content", "ContextMenuColumn", "(Landroidx/compose/foundation/contextmenu/ContextMenuColors;Landroidx/compose/ui/Modifier;Lr6/f;Landroidx/compose/runtime/Composer;II)V", "", "label", "", "enabled", "Landroidx/compose/ui/graphics/Color;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "iconColor", "leadingIcon", "onClick", "ContextMenuItem", "(Ljava/lang/String;ZLandroidx/compose/foundation/contextmenu/ContextMenuColors;Landroidx/compose/ui/Modifier;Lr6/f;Lr6/a;Landroidx/compose/runtime/Composer;II)V", "", "backgroundStyleId", "foregroundStyleId", "computeContextMenuColors", "(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/contextmenu/ContextMenuColors;", "Landroid/content/Context;", "resId", "attrId", "defaultColor", "resolveColor-g2O1Hgs", "(Landroid/content/Context;IIJ)J", "resolveColor", "Landroid/content/res/ColorStateList;", "resolveColorStateList", "(Landroid/content/Context;II)Landroid/content/res/ColorStateList;", "enabledColor-4WTKRHQ", "(Landroid/content/res/ColorStateList;J)J", "enabledColor", "disabledColor-4WTKRHQ", "disabledColor", "Landroidx/compose/ui/window/PopupProperties;", "DefaultPopupProperties", "Landroidx/compose/ui/window/PopupProperties;", "", "DisabledAlpha", "F", "DefaultContextMenuColors", "Landroidx/compose/foundation/contextmenu/ContextMenuColors;", "getDefaultContextMenuColors", "()Landroidx/compose/foundation/contextmenu/ContextMenuColors;", "getDefaultContextMenuColors$annotations", "()V", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nContextMenuUi.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuUi.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuUi_androidKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,426:1\n87#2:427\n84#2,9:428\n94#2:467\n79#3,6:437\n86#3,3:452\n89#3,2:461\n93#3:466\n79#3,6:480\n86#3,3:495\n89#3,2:504\n79#3,6:517\n86#3,3:532\n89#3,2:541\n93#3:546\n93#3:550\n347#4,9:443\n356#4,3:463\n347#4,9:486\n356#4:506\n347#4,9:523\n356#4,3:543\n357#4,2:548\n4206#5,6:455\n4206#5,6:498\n4206#5,6:535\n1247#6,6:468\n1247#6,6:554\n99#7,6:474\n106#7:551\n70#8:507\n67#8,9:508\n77#8:547\n75#9:552\n75#9:553\n*S KotlinDebug\n*F\n+ 1 ContextMenuUi.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuUi_androidKt\n*L\n149#1:427\n149#1:428,9\n149#1:467\n149#1:437,6\n149#1:452,3\n149#1:461,2\n149#1:466\n187#1:480,6\n187#1:495,3\n187#1:504,2\n210#1:517,6\n210#1:532,3\n210#1:541,2\n210#1:546\n187#1:550\n149#1:443,9\n149#1:463,3\n187#1:486,9\n187#1:506\n210#1:523,9\n210#1:543,3\n187#1:548,2\n149#1:455,6\n187#1:498,6\n210#1:535,6\n195#1:468,6\n366#1:554,6\n187#1:474,6\n187#1:551\n210#1:507\n210#1:508,9\n210#1:547\n365#1:552\n366#1:553\n*E\n"})
/* loaded from: classes.dex */
public final class ContextMenuUi_androidKt {

    @NotNull
    private static final ContextMenuColors DefaultContextMenuColors;

    @NotNull
    private static final PopupProperties DefaultPopupProperties = new PopupProperties(true, false, false, false, 14, (AbstractC5824e) null);
    private static final float DisabledAlpha = 0.38f;

    static {
        Color.Companion companion = Color.INSTANCE;
        DefaultContextMenuColors = new ContextMenuColors(companion.m10719getWhite0d7_KjU(), companion.m10708getBlack0d7_KjU(), companion.m10708getBlack0d7_KjU(), Color.m10681copywmQWz5c$default(companion.m10708getBlack0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m10681copywmQWz5c$default(companion.m10708getBlack0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.annotation.VisibleForTesting
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ContextMenuColumn(@org.jetbrains.annotations.NotNull androidx.compose.foundation.contextmenu.ContextMenuColors r28, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r29, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6474f r30, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt.ContextMenuColumn(androidx.compose.foundation.contextmenu.ContextMenuColors, androidx.compose.ui.Modifier, r6.f, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
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
    public static final void ContextMenuItem(@org.jetbrains.annotations.NotNull final java.lang.String r23, final boolean r24, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.contextmenu.ContextMenuColors r25, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r26, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6474f r27, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6469a r28, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt.ContextMenuItem(java.lang.String, boolean, androidx.compose.foundation.contextmenu.ContextMenuColors, androidx.compose.ui.Modifier, r6.f, r6.a, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ContextMenuPopup(@NotNull PopupPositionProvider popupPositionProvider, @NotNull InterfaceC6469a interfaceC6469a, @Nullable Modifier modifier, @NotNull InterfaceC6471c interfaceC6471c, @Nullable Composer composer, final int i, final int i8) {
        int i9;
        InterfaceC6469a interfaceC6469a2;
        final InterfaceC6471c interfaceC6471c2;
        final PopupPositionProvider popupPositionProvider2;
        final Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(712057293);
        if ((i8 & 1) != 0) {
            i9 = i | 6;
        } else if ((i & 6) == 0) {
            i9 = (composerStartRestartGroup.changed(popupPositionProvider) ? 4 : 2) | i;
        } else {
            i9 = i;
        }
        if ((i8 & 2) != 0) {
            i9 |= 48;
        } else if ((i & 48) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6469a) ? 32 : 16;
        }
        int i10 = i8 & 4;
        if (i10 != 0) {
            i9 |= 384;
        } else if ((i & 384) == 0) {
            i9 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i8 & 8) != 0) {
            i9 |= 3072;
        } else if ((i & 3072) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6471c) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 1171) != 1170, i9 & 1)) {
            if (i10 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(712057293, i9, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.android.kt:106)");
            }
            interfaceC6469a2 = interfaceC6469a;
            ContextMenuPopup(popupPositionProvider, interfaceC6469a2, modifier3, computeContextMenuColors(0, 0, composerStartRestartGroup, 0, 3), interfaceC6471c, composerStartRestartGroup, (i9 & 1022) | ((i9 << 3) & 57344), 0);
            popupPositionProvider2 = popupPositionProvider;
            interfaceC6471c2 = interfaceC6471c;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            interfaceC6469a2 = interfaceC6469a;
            interfaceC6471c2 = interfaceC6471c;
            popupPositionProvider2 = popupPositionProvider;
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final InterfaceC6469a interfaceC6469a3 = interfaceC6469a2;
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt.ContextMenuPopup.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(Composer composer2, int i11) {
                    ContextMenuUi_androidKt.ContextMenuPopup(popupPositionProvider2, interfaceC6469a3, modifier2, interfaceC6471c2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i8);
                }
            });
        }
    }

    @Composable
    @VisibleForTesting
    @NotNull
    public static final ContextMenuColors computeContextMenuColors(@StyleRes int i, @StyleRes int i8, @Nullable Composer composer, int i9, int i10) throws Resources.NotFoundException {
        int i11 = (i10 & 1) != 0 ? R.style.Widget.PopupMenu : i;
        int i12 = (i10 & 2) != 0 ? R.style.TextAppearance.Widget.PopupMenu.Large : i8;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1689505294, i9, -1, "androidx.compose.foundation.contextmenu.computeContextMenuColors (ContextMenuUi.android.kt:363)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        boolean zChanged = composer.changed((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())) | composer.changed(context);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            ContextMenuColors contextMenuColors = DefaultContextMenuColors;
            long jM6888resolveColorg2O1Hgs = m6888resolveColorg2O1Hgs(context, i11, R.attr.colorBackground, contextMenuColors.getBackgroundColor());
            ColorStateList colorStateListResolveColorStateList = resolveColorStateList(context, i12, R.attr.textColorPrimary);
            long jM6887enabledColor4WTKRHQ = m6887enabledColor4WTKRHQ(colorStateListResolveColorStateList, contextMenuColors.getTextColor());
            long jM6886disabledColor4WTKRHQ = m6886disabledColor4WTKRHQ(colorStateListResolveColorStateList, contextMenuColors.getDisabledTextColor());
            Object contextMenuColors2 = new ContextMenuColors(jM6888resolveColorg2O1Hgs, jM6887enabledColor4WTKRHQ, jM6887enabledColor4WTKRHQ, jM6886disabledColor4WTKRHQ, jM6886disabledColor4WTKRHQ, null);
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
    private static final long m6886disabledColor4WTKRHQ(ColorStateList colorStateList, long j7) {
        int iM10736toArgb8_81llA = ColorKt.m10736toArgb8_81llA(j7);
        Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, iM10736toArgb8_81llA)) : null;
        return (numValueOf == null || numValueOf.intValue() == iM10736toArgb8_81llA) ? j7 : ColorKt.Color(numValueOf.intValue());
    }

    /* renamed from: enabledColor-4WTKRHQ, reason: not valid java name */
    private static final long m6887enabledColor4WTKRHQ(ColorStateList colorStateList, long j7) {
        int iM10736toArgb8_81llA = ColorKt.m10736toArgb8_81llA(j7);
        Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, iM10736toArgb8_81llA)) : null;
        return (numValueOf == null || numValueOf.intValue() == iM10736toArgb8_81llA) ? j7 : ColorKt.Color(numValueOf.intValue());
    }

    @NotNull
    public static final ContextMenuColors getDefaultContextMenuColors() {
        return DefaultContextMenuColors;
    }

    @VisibleForTesting
    public static /* synthetic */ void getDefaultContextMenuColors$annotations() {
    }

    /* renamed from: resolveColor-g2O1Hgs, reason: not valid java name */
    private static final long m6888resolveColorg2O1Hgs(Context context, @StyleRes int i, @AttrRes int i8, long j7) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{i8});
        int iM10736toArgb8_81llA = ColorKt.m10736toArgb8_81llA(j7);
        int color = typedArrayObtainStyledAttributes.getColor(0, iM10736toArgb8_81llA);
        typedArrayObtainStyledAttributes.recycle();
        return color == iM10736toArgb8_81llA ? j7 : ColorKt.Color(color);
    }

    private static final ColorStateList resolveColorStateList(Context context, @StyleRes int i, @AttrRes int i8) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{i8});
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
    public static final void ContextMenuPopup(@org.jetbrains.annotations.NotNull final androidx.compose.p011ui.window.PopupPositionProvider r14, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6469a r15, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r16, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.contextmenu.ContextMenuColors r17, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6471c r18, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt.ContextMenuPopup(androidx.compose.ui.window.PopupPositionProvider, r6.a, androidx.compose.ui.Modifier, androidx.compose.foundation.contextmenu.ContextMenuColors, r6.c, androidx.compose.runtime.Composer, int, int):void");
    }
}
