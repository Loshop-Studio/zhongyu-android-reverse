package androidx.compose.material3;

import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.tokens.NavigationRailTokens;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.layout.LayoutIdKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.ConstraintsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p169t6.AbstractC6600a;

@Metadata(m5109d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\u001az\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022 \b\u0002\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\b¢\u0006\u0002\b\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0002\b\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0083\u0001\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00132\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00112\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0013¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001as\u0010#\u001a\u00020\u00072\u0011\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0002\b\b2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0002\b\b2\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0002\b\b2\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0013¢\u0006\u0002\b\b2\u0006\u0010\u0018\u001a\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0013H\u0003¢\u0006\u0004\b#\u0010$\u001a8\u0010/\u001a\u00020,*\u00020%2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010&2\u0006\u0010+\u001a\u00020*H\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001aP\u00103\u001a\u00020,*\u00020%2\u0006\u00100\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010&2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!H\u0002ø\u0001\u0000¢\u0006\u0004\b1\u00102\"\u0014\u00105\u001a\u0002048\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u00106\"\u0014\u00107\u001a\u0002048\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u00106\"\u0014\u00108\u001a\u0002048\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00106\"\u0014\u00109\u001a\u0002048\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u00106\"\u001a\u0010;\u001a\u00020:8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0014\u0010?\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010<\"\u0014\u0010A\u001a\u00020@8\u0002X\u0082T¢\u0006\u0006\n\u0004\bA\u0010B\"\u001a\u0010C\u001a\u00020:8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010<\u001a\u0004\bD\u0010>\"\u001a\u0010E\u001a\u00020:8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010<\u001a\u0004\bF\u0010>\"\u001a\u0010G\u001a\u00020:8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010<\u001a\u0004\bH\u0010>\"\u0014\u0010I\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010<\"\u0014\u0010J\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010<\"\u0014\u0010K\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010<\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006N²\u0006\f\u0010L\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010M\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, m5110d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "header", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "content", "NavigationRail-qi6gXK8", "(Landroidx/compose/ui/Modifier;JJLr6/f;Landroidx/compose/foundation/layout/WindowInsets;Lr6/f;Landroidx/compose/runtime/Composer;II)V", "NavigationRail", "", "selected", "Lkotlin/Function0;", "onClick", NavigationRailKt.IconLayoutIdTag, "enabled", NavigationRailKt.LabelLayoutIdTag, "alwaysShowLabel", "Landroidx/compose/material3/NavigationRailItemColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "NavigationRailItem", "(ZLr6/a;Lr6/e;Landroidx/compose/ui/Modifier;ZLr6/e;ZLandroidx/compose/material3/NavigationRailItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", NavigationRailKt.IndicatorRippleLayoutIdTag, NavigationRailKt.IndicatorLayoutIdTag, "", "animationProgress", "NavigationRailItemLayout", "(Lr6/e;Lr6/e;Lr6/e;Lr6/e;ZLr6/a;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Placeable;", "iconPlaceable", "indicatorRipplePlaceable", "indicatorPlaceable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "placeIcon-X9ElhV4", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "placeIcon", "labelPlaceable", "placeLabelAndIcon-zUg2_y0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JZF)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndIcon", "", "IndicatorRippleLayoutIdTag", "Ljava/lang/String;", "IndicatorLayoutIdTag", "IconLayoutIdTag", "LabelLayoutIdTag", "Landroidx/compose/ui/unit/Dp;", "NavigationRailVerticalPadding", "F", "getNavigationRailVerticalPadding", "()F", "NavigationRailHeaderPadding", "", "ItemAnimationDurationMillis", "I", "NavigationRailItemWidth", "getNavigationRailItemWidth", "NavigationRailItemHeight", "getNavigationRailItemHeight", "NavigationRailItemVerticalPadding", "getNavigationRailItemVerticalPadding", "IndicatorHorizontalPadding", "IndicatorVerticalPaddingWithLabel", "IndicatorVerticalPaddingNoLabel", "iconColor", "textColor", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,749:1\n1223#2,6:750\n1223#2,6:789\n1223#2,6:795\n1223#2,6:805\n1223#2,6:882\n71#3,3:756\n74#3:787\n78#3:804\n71#3:842\n68#3,6:843\n74#3:877\n78#3:881\n71#3:888\n68#3,6:889\n74#3:923\n78#3:927\n78#4,6:759\n85#4,4:774\n89#4,2:784\n93#4:803\n78#4:811\n76#4,8:812\n85#4,4:829\n89#4,2:839\n78#4,6:849\n85#4,4:864\n89#4,2:874\n93#4:880\n78#4,6:895\n85#4,4:910\n89#4,2:920\n93#4:926\n93#4:930\n368#5,9:765\n377#5:786\n378#5,2:801\n368#5,9:820\n377#5:841\n368#5,9:855\n377#5:876\n378#5,2:878\n368#5,9:901\n377#5:922\n378#5,2:924\n378#5,2:928\n4032#6,6:778\n4032#6,6:833\n4032#6,6:868\n4032#6,6:914\n77#7:788\n148#8:931\n148#8:932\n148#8:933\n56#9:934\n71#9:935\n56#9:936\n71#9:937\n56#9:938\n71#9:939\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt\n*L\n184#1:750,6\n247#1:789,6\n283#1:795,6\n531#1:805,6\n524#1:882,6\n216#1:756,3\n216#1:787\n216#1:804\n520#1:842\n520#1:843,6\n520#1:877\n520#1:881\n523#1:888\n523#1:889,6\n523#1:923\n523#1:927\n216#1:759,6\n216#1:774,4\n216#1:784,2\n216#1:803\n516#1:811\n516#1:812,8\n516#1:829,4\n516#1:839,2\n520#1:849,6\n520#1:864,4\n520#1:874,2\n520#1:880\n523#1:895,6\n523#1:910,4\n523#1:920,2\n523#1:926\n516#1:930\n216#1:765,9\n216#1:786\n216#1:801,2\n516#1:820,9\n516#1:841\n520#1:855,9\n520#1:876\n520#1:878,2\n523#1:901,9\n523#1:922\n523#1:924,2\n516#1:928,2\n216#1:778,6\n516#1:833,6\n520#1:868,6\n523#1:914,6\n241#1:788\n719#1:931\n725#1:932\n739#1:933\n742#1:934\n742#1:935\n745#1:936\n745#1:937\n748#1:938\n748#1:939\n*E\n"})
/* loaded from: classes.dex */
public final class NavigationRailKt {

    @NotNull
    private static final String IconLayoutIdTag = "icon";
    private static final float IndicatorHorizontalPadding;

    @NotNull
    private static final String IndicatorLayoutIdTag = "indicator";

    @NotNull
    private static final String IndicatorRippleLayoutIdTag = "indicatorRipple";
    private static final float IndicatorVerticalPaddingNoLabel;
    private static final float IndicatorVerticalPaddingWithLabel;
    private static final int ItemAnimationDurationMillis = 150;

    @NotNull
    private static final String LabelLayoutIdTag = "label";
    private static final float NavigationRailHeaderPadding = C2331Dp.m13305constructorimpl(8);
    private static final float NavigationRailItemHeight;
    private static final float NavigationRailItemVerticalPadding;
    private static final float NavigationRailItemWidth;
    private static final float NavigationRailVerticalPadding;

    static {
        float f = 4;
        NavigationRailVerticalPadding = C2331Dp.m13305constructorimpl(f);
        NavigationRailTokens navigationRailTokens = NavigationRailTokens.INSTANCE;
        NavigationRailItemWidth = navigationRailTokens.m9750getContainerWidthD9Ej5fM();
        NavigationRailItemHeight = navigationRailTokens.m9753getNoLabelActiveIndicatorHeightD9Ej5fM();
        NavigationRailItemVerticalPadding = C2331Dp.m13305constructorimpl(f);
        float f7 = 2;
        IndicatorHorizontalPadding = C2331Dp.m13305constructorimpl(C2331Dp.m13305constructorimpl(navigationRailTokens.m9748getActiveIndicatorWidthD9Ej5fM() - navigationRailTokens.m9751getIconSizeD9Ej5fM()) / f7);
        IndicatorVerticalPaddingWithLabel = C2331Dp.m13305constructorimpl(C2331Dp.m13305constructorimpl(navigationRailTokens.m9747getActiveIndicatorHeightD9Ej5fM() - navigationRailTokens.m9751getIconSizeD9Ej5fM()) / f7);
        IndicatorVerticalPaddingNoLabel = C2331Dp.m13305constructorimpl(C2331Dp.m13305constructorimpl(navigationRailTokens.m9753getNoLabelActiveIndicatorHeightD9Ej5fM() - navigationRailTokens.m9751getIconSizeD9Ej5fM()) / f7);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0118  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: NavigationRail-qi6gXK8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m8741NavigationRailqi6gXK8(@org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r23, long r24, long r26, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6474f r28, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.WindowInsets r29, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6474f r30, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationRailKt.m8741NavigationRailqi6gXK8(androidx.compose.ui.Modifier, long, long, r6.f, androidx.compose.foundation.layout.WindowInsets, r6.f, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f6  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NavigationRailItem(final boolean r23, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6469a r24, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r25, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r26, boolean r27, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r28, boolean r29, @org.jetbrains.annotations.Nullable androidx.compose.material3.NavigationRailItemColors r30, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r31, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationRailKt.NavigationRailItem(boolean, r6.a, r6.e, androidx.compose.ui.Modifier, boolean, r6.e, boolean, androidx.compose.material3.NavigationRailItemColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void NavigationRailItemLayout(final InterfaceC6473e interfaceC6473e, final InterfaceC6473e interfaceC6473e2, final InterfaceC6473e interfaceC6473e3, InterfaceC6473e interfaceC6473e4, final boolean z8, final InterfaceC6469a interfaceC6469a, Composer composer, final int i) {
        int i8;
        final InterfaceC6473e interfaceC6473e5 = interfaceC6473e4;
        Composer composerStartRestartGroup = composer.startRestartGroup(1498399348);
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
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e5) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i8 |= composerStartRestartGroup.changed(z8) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6469a) ? 131072 : 65536;
        }
        if ((74899 & i8) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1498399348, i8, -1, "androidx.compose.material3.NavigationRailItemLayout (NavigationRail.kt:514)");
            }
            int i9 = 458752 & i8;
            int i10 = 57344 & i8;
            boolean z9 = ((i8 & 7168) == 2048) | (i9 == 131072) | (i10 == 16384);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItemLayout$2$1
                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    @NotNull
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo6545measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j7) {
                        Measurable measurable;
                        Placeable placeableMo12033measureBRTryo0;
                        MeasureScope measureScope2 = measureScope;
                        float fFloatValue = ((Number) interfaceC6469a.invoke()).floatValue();
                        long jM13248copyZbe2FdA$default = Constraints.m13248copyZbe2FdA$default(j7, 0, 0, 0, 0, 10, null);
                        int size = list.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Measurable measurable2 = list.get(i11);
                            if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable2), "icon")) {
                                Placeable placeableMo12033measureBRTryo02 = measurable2.mo12033measureBRTryo0(jM13248copyZbe2FdA$default);
                                float f = 2;
                                int iMo6897roundToPx0680j_4 = measureScope2.mo6897roundToPx0680j_4(C2331Dp.m13305constructorimpl(NavigationRailKt.IndicatorHorizontalPadding * f)) + placeableMo12033measureBRTryo02.getWidth();
                                int iM6241q = AbstractC6600a.m6241q(iMo6897roundToPx0680j_4 * fFloatValue);
                                int iMo6897roundToPx0680j_42 = measureScope2.mo6897roundToPx0680j_4(C2331Dp.m13305constructorimpl((interfaceC6473e5 == null ? NavigationRailKt.IndicatorVerticalPaddingNoLabel : NavigationRailKt.IndicatorVerticalPaddingWithLabel) * f)) + placeableMo12033measureBRTryo02.getHeight();
                                int size2 = list.size();
                                int i12 = 0;
                                while (i12 < size2) {
                                    Measurable measurable3 = list.get(i12);
                                    if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable3), "indicatorRipple")) {
                                        Placeable placeableMo12033measureBRTryo03 = measurable3.mo12033measureBRTryo0(Constraints.INSTANCE.m13268fixedJhjzzOo(iMo6897roundToPx0680j_4, iMo6897roundToPx0680j_42));
                                        int size3 = list.size();
                                        int i13 = 0;
                                        while (true) {
                                            if (i13 >= size3) {
                                                measurable = null;
                                                break;
                                            }
                                            measurable = list.get(i13);
                                            if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable), "indicator")) {
                                                break;
                                            }
                                            i13++;
                                        }
                                        Measurable measurable4 = measurable;
                                        Placeable placeableMo12033measureBRTryo04 = measurable4 != null ? measurable4.mo12033measureBRTryo0(Constraints.INSTANCE.m13268fixedJhjzzOo(iM6241q, iMo6897roundToPx0680j_42)) : null;
                                        if (interfaceC6473e5 != null) {
                                            int size4 = list.size();
                                            for (int i14 = 0; i14 < size4; i14++) {
                                                Measurable measurable5 = list.get(i14);
                                                if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable5), "label")) {
                                                    placeableMo12033measureBRTryo0 = measurable5.mo12033measureBRTryo0(jM13248copyZbe2FdA$default);
                                                }
                                            }
                                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                        }
                                        placeableMo12033measureBRTryo0 = null;
                                        if (interfaceC6473e5 == null) {
                                            return NavigationRailKt.m8744placeIconX9ElhV4(measureScope2, placeableMo12033measureBRTryo02, placeableMo12033measureBRTryo03, placeableMo12033measureBRTryo04, j7);
                                        }
                                        AbstractC5830k.m5327d(placeableMo12033measureBRTryo0);
                                        return NavigationRailKt.m8745placeLabelAndIconzUg2_y0(measureScope, placeableMo12033measureBRTryo0, placeableMo12033measureBRTryo02, placeableMo12033measureBRTryo03, placeableMo12033measureBRTryo04, j7, z8, fFloatValue);
                                    }
                                    i12++;
                                    measureScope2 = measureScope;
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            i11++;
                            measureScope2 = measureScope;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            Modifier.Companion companion = Modifier.INSTANCE;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            int i11 = i8;
            InterfaceC6469a constructor = companion2.getConstructor();
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
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion2, composerM10109constructorimpl, measurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            interfaceC6473e.invoke(composerStartRestartGroup, Integer.valueOf(i11 & 14));
            interfaceC6473e2.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 3) & 14));
            Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, IconLayoutIdTag);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId);
            InterfaceC6469a constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl2 = Updater.m10109constructorimpl(composerStartRestartGroup);
            InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion2, composerM10109constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl2, currentCompositionLocalMap2);
            if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
            }
            Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            interfaceC6473e3.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 6) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.startReplaceGroup(2145400941);
            if (interfaceC6473e4 != null) {
                Modifier modifierLayoutId2 = LayoutIdKt.layoutId(companion, LabelLayoutIdTag);
                boolean z10 = (i10 == 16384) | (i9 == 131072);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z10 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new InterfaceC6471c() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItemLayout$1$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p152r6.InterfaceC6471c
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((GraphicsLayerScope) obj);
                            return C5443s.f8405a;
                        }

                        public final void invoke(@NotNull GraphicsLayerScope graphicsLayerScope) {
                            graphicsLayerScope.setAlpha(z8 ? 1.0f : ((Number) interfaceC6469a.invoke()).floatValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierLayoutId2, (InterfaceC6471c) objRememberedValue2);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierGraphicsLayer);
                InterfaceC6469a constructor3 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM10109constructorimpl3 = Updater.m10109constructorimpl(composerStartRestartGroup);
                InterfaceC6473e interfaceC6473eM917r3 = AbstractC0584a.m917r(companion2, composerM10109constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM10109constructorimpl3, currentCompositionLocalMap3);
                if (composerM10109constructorimpl3.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    AbstractC0584a.m918s(currentCompositeKeyHash3, composerM10109constructorimpl3, currentCompositeKeyHash3, interfaceC6473eM917r3);
                }
                Updater.m10116setimpl(composerM10109constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                interfaceC6473e5 = interfaceC6473e4;
                AbstractC0584a.m920u(composerStartRestartGroup, (i11 >> 9) & 14, interfaceC6473e5);
            } else {
                interfaceC6473e5 = interfaceC6473e4;
            }
            if (AbstractC0584a.m923x(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.NavigationRailKt.NavigationRailItemLayout.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer2, int i12) {
                    NavigationRailKt.NavigationRailItemLayout(interfaceC6473e, interfaceC6473e2, interfaceC6473e3, interfaceC6473e5, z8, interfaceC6469a, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final float getNavigationRailItemHeight() {
        return NavigationRailItemHeight;
    }

    public static final float getNavigationRailItemVerticalPadding() {
        return NavigationRailItemVerticalPadding;
    }

    public static final float getNavigationRailItemWidth() {
        return NavigationRailItemWidth;
    }

    public static final float getNavigationRailVerticalPadding() {
        return NavigationRailVerticalPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-X9ElhV4, reason: not valid java name */
    public static final MeasureResult m8744placeIconX9ElhV4(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, long j7) {
        final int iM13275constrainWidthK40F9xA = ConstraintsKt.m13275constrainWidthK40F9xA(j7, Math.max(placeable.getWidth(), Math.max(placeable2.getWidth(), placeable3 != null ? placeable3.getWidth() : 0)));
        final int iM13274constrainHeightK40F9xA = ConstraintsKt.m13274constrainHeightK40F9xA(j7, measureScope.mo6897roundToPx0680j_4(NavigationRailItemHeight));
        final int iM898C = AbstractC0584a.m898C(placeable, iM13275constrainWidthK40F9xA, 2);
        final int iM906g = AbstractC0584a.m906g(placeable, iM13274constrainHeightK40F9xA, 2);
        final int iM898C2 = AbstractC0584a.m898C(placeable2, iM13275constrainWidthK40F9xA, 2);
        final int iM906g2 = AbstractC0584a.m906g(placeable2, iM13274constrainHeightK40F9xA, 2);
        return MeasureScope.layout$default(measureScope, iM13275constrainWidthK40F9xA, iM13274constrainHeightK40F9xA, null, new InterfaceC6471c() { // from class: androidx.compose.material3.NavigationRailKt$placeIcon$1
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
                Placeable placeable4 = placeable3;
                if (placeable4 != null) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, AbstractC0584a.m898C(placeable4, iM13275constrainWidthK40F9xA, 2), AbstractC0584a.m906g(placeable4, iM13274constrainHeightK40F9xA, 2), 0.0f, 4, null);
                    placementScope2 = placementScope;
                } else {
                    placementScope2 = placementScope;
                }
                Placeable.PlacementScope.placeRelative$default(placementScope2, placeable, iM898C, iM906g, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope2, placeable2, iM898C2, iM906g2, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-zUg2_y0, reason: not valid java name */
    public static final MeasureResult m8745placeLabelAndIconzUg2_y0(final MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, long j7, final boolean z8, final float f) {
        float height = placeable2.getHeight();
        float f7 = IndicatorVerticalPaddingWithLabel;
        float fMo6903toPx0680j_4 = measureScope.mo6903toPx0680j_4(f7) + height;
        float f8 = NavigationRailItemVerticalPadding;
        float fMo6903toPx0680j_42 = measureScope.mo6903toPx0680j_4(f8) + fMo6903toPx0680j_4 + placeable.getHeight();
        float f9 = 2;
        float fM13259getMinHeightimpl = (Constraints.m13259getMinHeightimpl(j7) - fMo6903toPx0680j_42) / f9;
        float fMo6903toPx0680j_43 = measureScope.mo6903toPx0680j_4(f7);
        final float f10 = fM13259getMinHeightimpl < fMo6903toPx0680j_43 ? fMo6903toPx0680j_43 : fM13259getMinHeightimpl;
        float f11 = (f10 * f9) + fMo6903toPx0680j_42;
        final float height2 = (1 - f) * ((z8 ? f10 : (f11 - placeable2.getHeight()) / f9) - f10);
        final float fMo6903toPx0680j_44 = measureScope.mo6903toPx0680j_4(f8) + measureScope.mo6903toPx0680j_4(f7) + placeable2.getHeight() + f10;
        final int iM13275constrainWidthK40F9xA = ConstraintsKt.m13275constrainWidthK40F9xA(j7, Math.max(placeable2.getWidth(), Math.max(placeable.getWidth(), placeable4 != null ? placeable4.getWidth() : 0)));
        final int iM898C = AbstractC0584a.m898C(placeable, iM13275constrainWidthK40F9xA, 2);
        final int iM898C2 = AbstractC0584a.m898C(placeable2, iM13275constrainWidthK40F9xA, 2);
        final int iM898C3 = AbstractC0584a.m898C(placeable3, iM13275constrainWidthK40F9xA, 2);
        final float fMo6903toPx0680j_45 = f10 - measureScope.mo6903toPx0680j_4(f7);
        return MeasureScope.layout$default(measureScope, iM13275constrainWidthK40F9xA, AbstractC6600a.m6241q(f11), null, new InterfaceC6471c() { // from class: androidx.compose.material3.NavigationRailKt$placeLabelAndIcon$1
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
                Placeable placeable5 = placeable4;
                if (placeable5 != null) {
                    int i = iM13275constrainWidthK40F9xA;
                    float f12 = f10;
                    MeasureScope measureScope2 = measureScope;
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, AbstractC0584a.m898C(placeable5, i, 2), AbstractC6600a.m6241q((f12 - measureScope2.mo6903toPx0680j_4(NavigationRailKt.IndicatorVerticalPaddingWithLabel)) + height2), 0.0f, 4, null);
                    placementScope2 = placementScope;
                } else {
                    placementScope2 = placementScope;
                }
                if (z8 || f != 0.0f) {
                    Placeable.PlacementScope.placeRelative$default(placementScope2, placeable, iM898C, AbstractC6600a.m6241q(fMo6903toPx0680j_44 + height2), 0.0f, 4, null);
                }
                Placeable.PlacementScope.placeRelative$default(placementScope2, placeable2, iM898C2, AbstractC6600a.m6241q(f10 + height2), 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope2, placeable3, iM898C3, AbstractC6600a.m6241q(fMo6903toPx0680j_45 + height2), 0.0f, 4, null);
            }
        }, 4, null);
    }
}
