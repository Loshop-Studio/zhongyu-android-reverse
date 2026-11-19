package androidx.compose.material3;

import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.tokens.NavigationBarTokens;
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

@Metadata(m5109d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\u001ab\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0087\u0001\u0010\u001e\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00142\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0014¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00122\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0014¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0019\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001as\u0010$\u001a\u00020\u000b2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u000b0\u0014¢\u0006\u0002\b\f2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0014¢\u0006\u0002\b\f2\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0014¢\u0006\u0002\b\f2\u0013\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0014¢\u0006\u0002\b\f2\u0006\u0010\u0019\u001a\u00020\u00122\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0014H\u0003¢\u0006\u0004\b$\u0010%\u001a8\u00100\u001a\u00020-*\u00020&2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010'2\u0006\u0010,\u001a\u00020+H\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001aP\u00104\u001a\u00020-*\u00020&2\u0006\u00101\u001a\u00020'2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010'2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"H\u0002ø\u0001\u0000¢\u0006\u0004\b2\u00103\"\u0014\u00106\u001a\u0002058\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u00107\"\u0014\u00108\u001a\u0002058\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00107\"\u0014\u00109\u001a\u0002058\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u00107\"\u0014\u0010:\u001a\u0002058\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u00107\"\u0014\u0010;\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<\"\u0014\u0010>\u001a\u00020=8\u0002X\u0082T¢\u0006\u0006\n\u0004\b>\u0010?\"\u001a\u0010@\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b@\u0010<\u001a\u0004\bA\u0010B\"\u001a\u0010C\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010<\u001a\u0004\bD\u0010B\"\u0014\u0010E\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010<\"\u001a\u0010F\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010<\u001a\u0004\bG\u0010B\"\u0014\u0010H\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010<\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006L²\u0006\f\u0010I\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010J\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\u000e\u0010K\u001a\u00020=8\n@\nX\u008a\u008e\u0002"}, m5110d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "NavigationBar-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/WindowInsets;Lr6/f;Landroidx/compose/runtime/Composer;II)V", "NavigationBar", "", "selected", "Lkotlin/Function0;", "onClick", NavigationBarKt.IconLayoutIdTag, "enabled", NavigationBarKt.LabelLayoutIdTag, "alwaysShowLabel", "Landroidx/compose/material3/NavigationBarItemColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "NavigationBarItem", "(Landroidx/compose/foundation/layout/RowScope;ZLr6/a;Lr6/e;Landroidx/compose/ui/Modifier;ZLr6/e;ZLandroidx/compose/material3/NavigationBarItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", NavigationBarKt.IndicatorRippleLayoutIdTag, NavigationBarKt.IndicatorLayoutIdTag, "", "animationProgress", "NavigationBarItemLayout", "(Lr6/e;Lr6/e;Lr6/e;Lr6/e;ZLr6/a;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Placeable;", "iconPlaceable", "indicatorRipplePlaceable", "indicatorPlaceable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "placeIcon-X9ElhV4", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "placeIcon", "labelPlaceable", "placeLabelAndIcon-zUg2_y0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JZF)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndIcon", "", "IndicatorRippleLayoutIdTag", "Ljava/lang/String;", "IndicatorLayoutIdTag", "IconLayoutIdTag", "LabelLayoutIdTag", "NavigationBarHeight", "F", "", "ItemAnimationDurationMillis", "I", "NavigationBarItemHorizontalPadding", "getNavigationBarItemHorizontalPadding", "()F", "NavigationBarIndicatorToLabelPadding", "getNavigationBarIndicatorToLabelPadding", "IndicatorHorizontalPadding", "IndicatorVerticalPadding", "getIndicatorVerticalPadding", "IndicatorVerticalOffset", "iconColor", "textColor", "itemWidth", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,717:1\n1223#2,6:718\n1223#2,6:724\n1223#2,6:730\n1223#2,6:769\n1223#2,6:775\n1223#2,6:785\n1223#2,6:862\n71#3,3:736\n74#3:767\n78#3:784\n71#3:822\n68#3,6:823\n74#3:857\n78#3:861\n71#3:868\n68#3,6:869\n74#3:903\n78#3:907\n78#4,6:739\n85#4,4:754\n89#4,2:764\n93#4:783\n78#4:791\n76#4,8:792\n85#4,4:809\n89#4,2:819\n78#4,6:829\n85#4,4:844\n89#4,2:854\n93#4:860\n78#4,6:875\n85#4,4:890\n89#4,2:900\n93#4:906\n93#4:910\n368#5,9:745\n377#5:766\n378#5,2:781\n368#5,9:800\n377#5:821\n368#5,9:835\n377#5:856\n378#5,2:858\n368#5,9:881\n377#5:902\n378#5,2:904\n378#5,2:908\n4032#6,6:758\n4032#6,6:813\n4032#6,6:848\n4032#6,6:894\n77#7:768\n75#8:911\n108#8,2:912\n148#9:914\n148#9:915\n148#9:920\n56#10:916\n71#10:917\n56#10:918\n71#10:919\n*S KotlinDebug\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt\n*L\n183#1:718,6\n215#1:724,6\n229#1:730,6\n249#1:769,6\n281#1:775,6\n532#1:785,6\n525#1:862,6\n217#1:736,3\n217#1:767\n217#1:784\n521#1:822\n521#1:823,6\n521#1:857\n521#1:861\n524#1:868\n524#1:869,6\n524#1:903\n524#1:907\n217#1:739,6\n217#1:754,4\n217#1:764,2\n217#1:783\n517#1:791\n517#1:792,8\n517#1:809,4\n517#1:819,2\n521#1:829,6\n521#1:844,4\n521#1:854,2\n521#1:860\n524#1:875,6\n524#1:890,4\n524#1:900,2\n524#1:906\n517#1:910\n217#1:745,9\n217#1:766\n217#1:781,2\n517#1:800,9\n517#1:821\n521#1:835,9\n521#1:856\n521#1:858,2\n524#1:881,9\n524#1:902\n524#1:904,2\n517#1:908,2\n217#1:758,6\n517#1:813,6\n521#1:848,6\n524#1:894,6\n243#1:768\n215#1:911\n215#1:912,2\n704#1:914\n707#1:915\n716#1:920\n710#1:916\n710#1:917\n714#1:918\n714#1:919\n*E\n"})
/* loaded from: classes.dex */
public final class NavigationBarKt {

    @NotNull
    private static final String IconLayoutIdTag = "icon";
    private static final float IndicatorHorizontalPadding;

    @NotNull
    private static final String IndicatorLayoutIdTag = "indicator";

    @NotNull
    private static final String IndicatorRippleLayoutIdTag = "indicatorRipple";
    private static final float IndicatorVerticalOffset;
    private static final float IndicatorVerticalPadding;
    private static final int ItemAnimationDurationMillis = 100;

    @NotNull
    private static final String LabelLayoutIdTag = "label";
    private static final float NavigationBarHeight;
    private static final float NavigationBarIndicatorToLabelPadding;
    private static final float NavigationBarItemHorizontalPadding;

    static {
        NavigationBarTokens navigationBarTokens = NavigationBarTokens.INSTANCE;
        NavigationBarHeight = navigationBarTokens.m9739getContainerHeightD9Ej5fM();
        NavigationBarItemHorizontalPadding = C2331Dp.m13305constructorimpl(8);
        NavigationBarIndicatorToLabelPadding = C2331Dp.m13305constructorimpl(4);
        float f = 2;
        IndicatorHorizontalPadding = C2331Dp.m13305constructorimpl(C2331Dp.m13305constructorimpl(navigationBarTokens.m9737getActiveIndicatorWidthD9Ej5fM() - navigationBarTokens.m9740getIconSizeD9Ej5fM()) / f);
        IndicatorVerticalPadding = C2331Dp.m13305constructorimpl(C2331Dp.m13305constructorimpl(navigationBarTokens.m9736getActiveIndicatorHeightD9Ej5fM() - navigationBarTokens.m9740getIconSizeD9Ej5fM()) / f);
        IndicatorVerticalOffset = C2331Dp.m13305constructorimpl(12);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011b  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: NavigationBar-HsRjFd4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m8676NavigationBarHsRjFd4(@org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r23, long r24, long r26, float r28, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.WindowInsets r29, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6474f r30, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationBarKt.m8676NavigationBarHsRjFd4(androidx.compose.ui.Modifier, long, long, float, androidx.compose.foundation.layout.WindowInsets, r6.f, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0170 A[PHI: r0 r8 r9 r13 r15 r20
      0x0170: PHI (r0v12 androidx.compose.material3.NavigationBarItemColors) = (r0v8 androidx.compose.material3.NavigationBarItemColors), (r0v16 androidx.compose.material3.NavigationBarItemColors) binds: [B:139:0x0194, B:125:0x016e] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r8v5 androidx.compose.ui.Modifier) = (r8v3 androidx.compose.ui.Modifier), (r8v2 androidx.compose.ui.Modifier) binds: [B:139:0x0194, B:125:0x016e] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r9v4 boolean) = (r9v2 boolean), (r9v1 boolean) binds: [B:139:0x0194, B:125:0x016e] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r13v6 boolean) = (r13v4 boolean), (r13v3 boolean) binds: [B:139:0x0194, B:125:0x016e] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r15v6 r6.e) = (r15v4 r6.e), (r15v3 r6.e) binds: [B:139:0x0194, B:125:0x016e] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r20v8 int) = (r20v6 int), (r20v5 int) binds: [B:139:0x0194, B:125:0x016e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0107  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NavigationBarItem(@org.jetbrains.annotations.NotNull final androidx.compose.foundation.layout.RowScope r25, final boolean r26, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6469a r27, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r28, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r29, boolean r30, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r31, boolean r32, @org.jetbrains.annotations.Nullable androidx.compose.material3.NavigationBarItemColors r33, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r34, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 955
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationBarKt.NavigationBarItem(androidx.compose.foundation.layout.RowScope, boolean, r6.a, r6.e, androidx.compose.ui.Modifier, boolean, r6.e, boolean, androidx.compose.material3.NavigationBarItemColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void NavigationBarItemLayout(final InterfaceC6473e interfaceC6473e, final InterfaceC6473e interfaceC6473e2, final InterfaceC6473e interfaceC6473e3, InterfaceC6473e interfaceC6473e4, final boolean z8, final InterfaceC6469a interfaceC6469a, Composer composer, final int i) {
        int i8;
        final InterfaceC6473e interfaceC6473e5 = interfaceC6473e4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1427075886);
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
                ComposerKt.traceEventStart(-1427075886, i8, -1, "androidx.compose.material3.NavigationBarItemLayout (NavigationBar.kt:515)");
            }
            int i9 = 458752 & i8;
            int i10 = 57344 & i8;
            boolean z9 = ((i8 & 7168) == 2048) | (i9 == 131072) | (i10 == 16384);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItemLayout$2$1
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
                                int iMo6897roundToPx0680j_4 = measureScope2.mo6897roundToPx0680j_4(C2331Dp.m13305constructorimpl(NavigationBarKt.IndicatorHorizontalPadding * f)) + placeableMo12033measureBRTryo02.getWidth();
                                int iM6241q = AbstractC6600a.m6241q(iMo6897roundToPx0680j_4 * fFloatValue);
                                int iMo6897roundToPx0680j_42 = measureScope2.mo6897roundToPx0680j_4(C2331Dp.m13305constructorimpl(NavigationBarKt.getIndicatorVerticalPadding() * f)) + placeableMo12033measureBRTryo02.getHeight();
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
                                            return NavigationBarKt.m8679placeIconX9ElhV4(measureScope2, placeableMo12033measureBRTryo02, placeableMo12033measureBRTryo03, placeableMo12033measureBRTryo04, j7);
                                        }
                                        AbstractC5830k.m5327d(placeableMo12033measureBRTryo0);
                                        return NavigationBarKt.m8680placeLabelAndIconzUg2_y0(measureScope, placeableMo12033measureBRTryo0, placeableMo12033measureBRTryo02, placeableMo12033measureBRTryo03, placeableMo12033measureBRTryo04, j7, z8, fFloatValue);
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
            composerStartRestartGroup.startReplaceGroup(1087196576);
            if (interfaceC6473e4 != null) {
                Modifier modifierLayoutId2 = LayoutIdKt.layoutId(companion, LabelLayoutIdTag);
                boolean z10 = (i10 == 16384) | (i9 == 131072);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z10 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new InterfaceC6471c() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItemLayout$1$2$1
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
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.NavigationBarKt.NavigationBarItemLayout.3
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
                    NavigationBarKt.NavigationBarItemLayout(interfaceC6473e, interfaceC6473e2, interfaceC6473e3, interfaceC6473e5, z8, interfaceC6469a, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final float getIndicatorVerticalPadding() {
        return IndicatorVerticalPadding;
    }

    public static final float getNavigationBarIndicatorToLabelPadding() {
        return NavigationBarIndicatorToLabelPadding;
    }

    public static final float getNavigationBarItemHorizontalPadding() {
        return NavigationBarItemHorizontalPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-X9ElhV4, reason: not valid java name */
    public static final MeasureResult m8679placeIconX9ElhV4(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, long j7) {
        final int iM13258getMaxWidthimpl = Constraints.m13258getMaxWidthimpl(j7);
        final int iM13274constrainHeightK40F9xA = ConstraintsKt.m13274constrainHeightK40F9xA(j7, measureScope.mo6897roundToPx0680j_4(NavigationBarHeight));
        final int iM898C = AbstractC0584a.m898C(placeable, iM13258getMaxWidthimpl, 2);
        final int iM906g = AbstractC0584a.m906g(placeable, iM13274constrainHeightK40F9xA, 2);
        final int iM898C2 = AbstractC0584a.m898C(placeable2, iM13258getMaxWidthimpl, 2);
        final int iM906g2 = AbstractC0584a.m906g(placeable2, iM13274constrainHeightK40F9xA, 2);
        return MeasureScope.layout$default(measureScope, iM13258getMaxWidthimpl, iM13274constrainHeightK40F9xA, null, new InterfaceC6471c() { // from class: androidx.compose.material3.NavigationBarKt$placeIcon$1
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
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, AbstractC0584a.m898C(placeable4, iM13258getMaxWidthimpl, 2), AbstractC0584a.m906g(placeable4, iM13274constrainHeightK40F9xA, 2), 0.0f, 4, null);
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
    public static final MeasureResult m8680placeLabelAndIconzUg2_y0(final MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, long j7, final boolean z8, final float f) {
        float height = placeable2.getHeight();
        float f7 = IndicatorVerticalPadding;
        float fMo6903toPx0680j_4 = measureScope.mo6903toPx0680j_4(f7) + height;
        float f8 = NavigationBarIndicatorToLabelPadding;
        float fMo6903toPx0680j_42 = measureScope.mo6903toPx0680j_4(f8) + fMo6903toPx0680j_4 + placeable.getHeight();
        float f9 = 2;
        float fM13259getMinHeightimpl = (Constraints.m13259getMinHeightimpl(j7) - fMo6903toPx0680j_42) / f9;
        float fMo6903toPx0680j_43 = measureScope.mo6903toPx0680j_4(f7);
        final float f10 = fM13259getMinHeightimpl < fMo6903toPx0680j_43 ? fMo6903toPx0680j_43 : fM13259getMinHeightimpl;
        float f11 = (f10 * f9) + fMo6903toPx0680j_42;
        final float height2 = (1 - f) * ((z8 ? f10 : (f11 - placeable2.getHeight()) / f9) - f10);
        final float fMo6903toPx0680j_44 = measureScope.mo6903toPx0680j_4(f8) + measureScope.mo6903toPx0680j_4(f7) + placeable2.getHeight() + f10;
        final int iM13258getMaxWidthimpl = Constraints.m13258getMaxWidthimpl(j7);
        final int iM898C = AbstractC0584a.m898C(placeable, iM13258getMaxWidthimpl, 2);
        final int iM898C2 = AbstractC0584a.m898C(placeable2, iM13258getMaxWidthimpl, 2);
        final int iM898C3 = AbstractC0584a.m898C(placeable3, iM13258getMaxWidthimpl, 2);
        final float fMo6903toPx0680j_45 = f10 - measureScope.mo6903toPx0680j_4(f7);
        return MeasureScope.layout$default(measureScope, iM13258getMaxWidthimpl, AbstractC6600a.m6241q(f11), null, new InterfaceC6471c() { // from class: androidx.compose.material3.NavigationBarKt$placeLabelAndIcon$1
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
                    int i = iM13258getMaxWidthimpl;
                    float f12 = f10;
                    MeasureScope measureScope2 = measureScope;
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, AbstractC0584a.m898C(placeable5, i, 2), AbstractC6600a.m6241q((f12 - measureScope2.mo6897roundToPx0680j_4(NavigationBarKt.getIndicatorVerticalPadding())) + height2), 0.0f, 4, null);
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
