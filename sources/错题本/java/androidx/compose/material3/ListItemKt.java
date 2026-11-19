package androidx.compose.material3;

import androidx.annotation.VisibleForTesting;
import androidx.collection.AbstractC0584a;
import androidx.compose.material3.ListItemType;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.TextUnitKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\u001a©\u0001\u0010\u0011\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0015\b\u0002\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0015\b\u0002\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001av\u0010\u0017\u001a\u00020\u00012\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0013\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0013\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u0002H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001aN\u0010%\u001a\u00020\u001a*\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020!H\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001aV\u00100\u001a\u00020\u001a*\u00020\u00192\u0006\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020!H\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001au\u0010@\u001a\u00020?*\u0002012\u0006\u00102\u001a\u00020\u001a2\u0006\u00103\u001a\u00020\u001a2\b\u00105\u001a\u0004\u0018\u0001042\b\u00106\u001a\u0004\u0018\u0001042\b\u00107\u001a\u0004\u0018\u0001042\b\u00108\u001a\u0004\u0018\u0001042\b\u00109\u001a\u0004\u0018\u0001042\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020\u001a2\u0006\u0010=\u001a\u00020\u001a2\u0006\u0010>\u001a\u00020\u001aH\u0002¢\u0006\u0004\b@\u0010A\u001a5\u0010I\u001a\u00020\u00012\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020D2\u0011\u0010F\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u0003ø\u0001\u0000¢\u0006\u0004\bG\u0010H\u001a\u001b\u0010L\u001a\u00020:*\u00020J2\u0006\u0010K\u001a\u00020\u001aH\u0002¢\u0006\u0004\bL\u0010M\u001a\u001a\u0010-\u001a\u00020\f2\u0006\u0010,\u001a\u00020+H\u0002ø\u0001\u0000¢\u0006\u0004\bN\u0010O\u001a\u001b\u0010Q\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010P\u001a\u00020\u001aH\u0002¢\u0006\u0004\bQ\u0010R\" \u0010S\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bS\u0010T\u0012\u0004\bW\u0010X\u001a\u0004\bU\u0010V\" \u0010Y\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bY\u0010T\u0012\u0004\b[\u0010X\u001a\u0004\bZ\u0010V\" \u0010\\\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\\\u0010T\u0012\u0004\b^\u0010X\u001a\u0004\b]\u0010V\" \u0010_\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b_\u0010T\u0012\u0004\ba\u0010X\u001a\u0004\b`\u0010V\" \u0010b\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bb\u0010T\u0012\u0004\bd\u0010X\u001a\u0004\bc\u0010V\" \u0010e\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\be\u0010T\u0012\u0004\bg\u0010X\u001a\u0004\bf\u0010V\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006h"}, m5110d2 = {"Lkotlin/Function0;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "headlineContent", "Landroidx/compose/ui/Modifier;", "modifier", "overlineContent", "supportingContent", "leadingContent", "trailingContent", "Landroidx/compose/material3/ListItemColors;", "colors", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "shadowElevation", "ListItem-HXNGIdc", "(Lr6/e;Landroidx/compose/ui/Modifier;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Landroidx/compose/material3/ListItemColors;FFLandroidx/compose/runtime/Composer;II)V", "ListItem", "leading", "trailing", "headline", "overline", "supporting", "ListItemLayout", "(Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "", "leadingWidth", "trailingWidth", "headlineWidth", "overlineWidth", "supportingWidth", "horizontalPadding", "Landroidx/compose/ui/unit/Constraints;", "constraints", "calculateWidth-yeHjK3Y", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;IIIIIIJ)I", "calculateWidth", "leadingHeight", "trailingHeight", "headlineHeight", "overlineHeight", "supportingHeight", "Landroidx/compose/material3/ListItemType;", "listItemType", "verticalPadding", "calculateHeight-N4Jib3Y", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;IIIIIIIJ)I", "calculateHeight", "Landroidx/compose/ui/layout/MeasureScope;", "width", "height", "Landroidx/compose/ui/layout/Placeable;", "leadingPlaceable", "trailingPlaceable", "headlinePlaceable", "overlinePlaceable", "supportingPlaceable", "", "isThreeLine", "startPadding", "endPadding", "topPadding", "Landroidx/compose/ui/layout/MeasureResult;", "place", "(Landroidx/compose/ui/layout/MeasureScope;IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;ZIII)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "textToken", "content", "ProvideTextStyleFromToken-3J-VO9M", "(JLandroidx/compose/material3/tokens/TypographyKeyTokens;Lr6/e;Landroidx/compose/runtime/Composer;I)V", "ProvideTextStyleFromToken", "Landroidx/compose/ui/unit/Density;", "estimatedSupportingHeight", "isSupportingMultilineHeuristic", "(Landroidx/compose/ui/unit/Density;I)Z", "verticalPadding-yh95HIg", "(I)F", "n", "subtractConstraintSafely", "(II)I", "ListItemVerticalPadding", "F", "getListItemVerticalPadding", "()F", "getListItemVerticalPadding$annotations", "()V", "ListItemThreeLineVerticalPadding", "getListItemThreeLineVerticalPadding", "getListItemThreeLineVerticalPadding$annotations", "ListItemStartPadding", "getListItemStartPadding", "getListItemStartPadding$annotations", "ListItemEndPadding", "getListItemEndPadding", "getListItemEndPadding$annotations", "LeadingContentEndPadding", "getLeadingContentEndPadding", "getLeadingContentEndPadding$annotations", "TrailingContentStartPadding", "getTrailingContentStartPadding", "getTrailingContentStartPadding$annotations", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,731:1\n1223#2,6:732\n1223#2,6:746\n170#3:738\n168#3,7:739\n78#3,6:752\n85#3,4:767\n89#3,2:777\n93#3:782\n176#3:783\n368#4,9:758\n377#4,3:779\n4032#5,6:771\n148#6:784\n148#6:785\n148#6:786\n148#6:787\n148#6:788\n148#6:789\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemKt\n*L\n182#1:732,6\n183#1:746,6\n183#1:738\n183#1:739,7\n183#1:752,6\n183#1:767,4\n183#1:777,2\n183#1:782\n183#1:783\n183#1:758,9\n183#1:779,3\n183#1:771,6\n698#1:784\n700#1:785\n702#1:786\n704#1:787\n708#1:788\n712#1:789\n*E\n"})
/* loaded from: classes.dex */
public final class ListItemKt {
    private static final float LeadingContentEndPadding;
    private static final float ListItemEndPadding;
    private static final float ListItemStartPadding;
    private static final float TrailingContentStartPadding;
    private static final float ListItemVerticalPadding = C2331Dp.m13305constructorimpl(8);
    private static final float ListItemThreeLineVerticalPadding = C2331Dp.m13305constructorimpl(12);

    static {
        float f = 16;
        ListItemStartPadding = C2331Dp.m13305constructorimpl(f);
        ListItemEndPadding = C2331Dp.m13305constructorimpl(f);
        LeadingContentEndPadding = C2331Dp.m13305constructorimpl(f);
        TrailingContentStartPadding = C2331Dp.m13305constructorimpl(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f9  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: ListItem-HXNGIdc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m8595ListItemHXNGIdc(@org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r36, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r37, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r38, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r39, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r40, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r41, @org.jetbrains.annotations.Nullable androidx.compose.material3.ListItemColors r42, float r43, float r44, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ListItemKt.m8595ListItemHXNGIdc(r6.e, androidx.compose.ui.Modifier, r6.e, r6.e, r6.e, r6.e, androidx.compose.material3.ListItemColors, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_][_][_]]")
    public static final void ListItemLayout(final InterfaceC6473e interfaceC6473e, final InterfaceC6473e interfaceC6473e2, final InterfaceC6473e interfaceC6473e3, final InterfaceC6473e interfaceC6473e4, final InterfaceC6473e interfaceC6473e5, Composer composer, final int i) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(2052297037);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(interfaceC6473e) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e5) ? 16384 : 8192;
        }
        if ((i8 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2052297037, i8, -1, "androidx.compose.material3.ListItemLayout (ListItem.kt:180)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new ListItemMeasurePolicy();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ListItemMeasurePolicy listItemMeasurePolicy = (ListItemMeasurePolicy) objRememberedValue;
            List listM5287z = AbstractC5806u.m5287z(interfaceC6473e3, interfaceC6473e4 == null ? ComposableSingletons$ListItemKt.INSTANCE.m8352getLambda1$material3_release() : interfaceC6473e4, interfaceC6473e5 == null ? ComposableSingletons$ListItemKt.INSTANCE.m8353getLambda2$material3_release() : interfaceC6473e5, interfaceC6473e == null ? ComposableSingletons$ListItemKt.INSTANCE.m8354getLambda3$material3_release() : interfaceC6473e, interfaceC6473e2 == null ? ComposableSingletons$ListItemKt.INSTANCE.m8355getLambda4$material3_release() : interfaceC6473e2);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            InterfaceC6473e interfaceC6473eCombineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listM5287z);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = MultiContentMeasurePolicyKt.createMeasurePolicy(listItemMeasurePolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue2;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            InterfaceC6469a constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composerStartRestartGroup);
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion3, composerM10109constructorimpl, measurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            interfaceC6473eCombineAsVirtualLayouts.invoke(composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.ListItemKt.ListItemLayout.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer2, int i9) {
                    ListItemKt.ListItemLayout(interfaceC6473e, interfaceC6473e2, interfaceC6473e3, interfaceC6473e4, interfaceC6473e5, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    /* renamed from: ProvideTextStyleFromToken-3J-VO9M, reason: not valid java name */
    public static final void m8596ProvideTextStyleFromToken3JVO9M(long j7, final TypographyKeyTokens typographyKeyTokens, InterfaceC6473e interfaceC6473e, Composer composer, final int i) {
        int i8;
        long j8;
        final InterfaceC6473e interfaceC6473e2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1133967795);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(j7) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(typographyKeyTokens) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e) ? 256 : 128;
        }
        if ((i8 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            j8 = j7;
            interfaceC6473e2 = interfaceC6473e;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1133967795, i8, -1, "androidx.compose.material3.ProvideTextStyleFromToken (ListItem.kt:658)");
            }
            j8 = j7;
            ProvideContentColorTextStyleKt.m9321ProvideContentColorTextStyle3JVO9M(j8, TypographyKt.getValue(typographyKeyTokens, composerStartRestartGroup, (i8 >> 3) & 14), interfaceC6473e, composerStartRestartGroup, i8 & 910);
            interfaceC6473e2 = interfaceC6473e;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final long j9 = j8;
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.ListItemKt$ProvideTextStyleFromToken$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer2, int i9) {
                    ListItemKt.m8596ProvideTextStyleFromToken3JVO9M(j9, typographyKeyTokens, interfaceC6473e2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-N4Jib3Y, reason: not valid java name */
    public static final int m8601calculateHeightN4Jib3Y(IntrinsicMeasureScope intrinsicMeasureScope, int i, int i8, int i9, int i10, int i11, int i12, int i13, long j7) {
        ListItemType.Companion companion = ListItemType.INSTANCE;
        int iMax = Math.max(Math.max(Constraints.m13259getMinHeightimpl(j7), intrinsicMeasureScope.mo6897roundToPx0680j_4(ListItemType.m8608equalsimpl0(i12, companion.m8613getOneLineAlXitO8()) ? ListTokens.INSTANCE.m9729getListItemOneLineContainerHeightD9Ej5fM() : ListItemType.m8608equalsimpl0(i12, companion.m8615getTwoLineAlXitO8()) ? ListTokens.INSTANCE.m9734getListItemTwoLineContainerHeightD9Ej5fM() : ListTokens.INSTANCE.m9731getListItemThreeLineContainerHeightD9Ej5fM())), Math.max(i, Math.max(i9 + i10 + i11, i8)) + i13);
        int iM13257getMaxHeightimpl = Constraints.m13257getMaxHeightimpl(j7);
        return iMax > iM13257getMaxHeightimpl ? iM13257getMaxHeightimpl : iMax;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-yeHjK3Y, reason: not valid java name */
    public static final int m8602calculateWidthyeHjK3Y(IntrinsicMeasureScope intrinsicMeasureScope, int i, int i8, int i9, int i10, int i11, int i12, long j7) {
        if (Constraints.m13254getHasBoundedWidthimpl(j7)) {
            return Constraints.m13258getMaxWidthimpl(j7);
        }
        return i12 + i + Math.max(i9, Math.max(i10, i11)) + i8;
    }

    public static final float getLeadingContentEndPadding() {
        return LeadingContentEndPadding;
    }

    @VisibleForTesting
    public static /* synthetic */ void getLeadingContentEndPadding$annotations() {
    }

    public static final float getListItemEndPadding() {
        return ListItemEndPadding;
    }

    @VisibleForTesting
    public static /* synthetic */ void getListItemEndPadding$annotations() {
    }

    public static final float getListItemStartPadding() {
        return ListItemStartPadding;
    }

    @VisibleForTesting
    public static /* synthetic */ void getListItemStartPadding$annotations() {
    }

    public static final float getListItemThreeLineVerticalPadding() {
        return ListItemThreeLineVerticalPadding;
    }

    @VisibleForTesting
    public static /* synthetic */ void getListItemThreeLineVerticalPadding$annotations() {
    }

    public static final float getListItemVerticalPadding() {
        return ListItemVerticalPadding;
    }

    @VisibleForTesting
    public static /* synthetic */ void getListItemVerticalPadding$annotations() {
    }

    public static final float getTrailingContentStartPadding() {
        return TrailingContentStartPadding;
    }

    @VisibleForTesting
    public static /* synthetic */ void getTrailingContentStartPadding$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSupportingMultilineHeuristic(Density density, int i) {
        return i > density.mo6896roundToPxR2X_6o(TextUnitKt.getSp(30));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult place(MeasureScope measureScope, final int i, final int i8, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, final Placeable placeable5, final boolean z8, final int i9, final int i10, final int i11) {
        return MeasureScope.layout$default(measureScope, i, i8, null, new InterfaceC6471c() { // from class: androidx.compose.material3.ListItemKt.place.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(@NotNull Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope placementScope2;
                int iAlign;
                Placeable placeable6 = placeable;
                if (placeable6 != null) {
                    int i12 = i9;
                    boolean z9 = z8;
                    int iAlign2 = i11;
                    int i13 = i8;
                    if (!z9) {
                        iAlign2 = Alignment.INSTANCE.getCenterVertically().align(placeable6.getHeight(), i13);
                    }
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, i12, iAlign2, 0.0f, 4, null);
                    placementScope2 = placementScope;
                } else {
                    placementScope2 = placementScope;
                }
                Placeable placeable7 = placeable2;
                if (placeable7 != null) {
                    int i14 = i;
                    int i15 = i10;
                    boolean z10 = z8;
                    int iAlign3 = i11;
                    int i16 = i8;
                    int width = (i14 - i15) - placeable7.getWidth();
                    if (!z10) {
                        iAlign3 = Alignment.INSTANCE.getCenterVertically().align(placeable7.getHeight(), i16);
                    }
                    Placeable.PlacementScope.placeRelative$default(placementScope2, placeable7, width, iAlign3, 0.0f, 4, null);
                }
                int iWidthOrZero = TextFieldImplKt.widthOrZero(placeable) + i9;
                if (z8) {
                    iAlign = i11;
                } else {
                    iAlign = Alignment.INSTANCE.getCenterVertically().align(TextFieldImplKt.heightOrZero(placeable5) + TextFieldImplKt.heightOrZero(placeable4) + TextFieldImplKt.heightOrZero(placeable3), i8);
                }
                int i17 = iAlign;
                Placeable placeable8 = placeable4;
                if (placeable8 != null) {
                    Placeable.PlacementScope.placeRelative$default(placementScope2, placeable8, iWidthOrZero, i17, 0.0f, 4, null);
                }
                int iHeightOrZero = i17 + TextFieldImplKt.heightOrZero(placeable4);
                Placeable placeable9 = placeable3;
                if (placeable9 != null) {
                    Placeable.PlacementScope.placeRelative$default(placementScope2, placeable9, iWidthOrZero, iHeightOrZero, 0.0f, 4, null);
                }
                int iHeightOrZero2 = iHeightOrZero + TextFieldImplKt.heightOrZero(placeable3);
                Placeable placeable10 = placeable5;
                if (placeable10 != null) {
                    Placeable.PlacementScope.placeRelative$default(placementScope2, placeable10, iWidthOrZero, iHeightOrZero2, 0.0f, 4, null);
                }
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int subtractConstraintSafely(int i, int i8) {
        return i == Integer.MAX_VALUE ? i : i - i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: verticalPadding-yh95HIg, reason: not valid java name */
    public static final float m8603verticalPaddingyh95HIg(int i) {
        return ListItemType.m8608equalsimpl0(i, ListItemType.INSTANCE.m8614getThreeLineAlXitO8()) ? ListItemThreeLineVerticalPadding : ListItemVerticalPadding;
    }
}
