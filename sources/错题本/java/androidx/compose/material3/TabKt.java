package androidx.compose.material3;

import androidx.collection.AbstractC0584a;
import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.colorspace.ColorSpace;
import androidx.compose.p011ui.layout.AlignmentLineKt;
import androidx.compose.p011ui.layout.LayoutIdKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
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
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.constraintlayout.core.motion.utils.TypedValues;
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
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000j\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u008a\u0001\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\b2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0082\u0001\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\b2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001az\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u0016¢\u0006\u0002\b\b¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a=\u0010 \u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\bH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a9\u0010!\u001a\u00020\u00032\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\b2\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\bH\u0003¢\u0006\u0004\b!\u0010\"\u001a#\u0010(\u001a\u00020\u0003*\u00020#2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)\u001aK\u00101\u001a\u00020\u0003*\u00020#2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020$2\u0006\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010/\u001a\u00020&2\u0006\u00100\u001a\u00020&H\u0002¢\u0006\u0004\b1\u00102\"\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105\"\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00105\"\u0014\u00107\u001a\u00020&8\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u00108\"\u0014\u00109\u001a\u00020&8\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u00108\"\u0014\u0010:\u001a\u00020&8\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u00108\"\u001a\u0010;\u001a\u0002038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u00105\u001a\u0004\b<\u0010=\"\u0014\u0010>\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00105\"\u0014\u0010?\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00105\"\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B\"\u0014\u0010C\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u00105\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006E²\u0006\f\u0010D\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, m5110d2 = {"", "selected", "Lkotlin/Function0;", "Ld6/s;", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/runtime/Composable;", "text", "icon", "Landroidx/compose/ui/graphics/Color;", "selectedContentColor", "unselectedContentColor", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Tab-wqdebIU", "(ZLr6/a;Landroidx/compose/ui/Modifier;ZLr6/e;Lr6/e;JJLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "Tab", "LeadingIconTab-wqdebIU", "(ZLr6/a;Lr6/e;Lr6/e;Landroidx/compose/ui/Modifier;ZJJLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "LeadingIconTab", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "content", "Tab-bogVsAg", "(ZLr6/a;Landroidx/compose/ui/Modifier;ZJJLandroidx/compose/foundation/interaction/MutableInteractionSource;Lr6/f;Landroidx/compose/runtime/Composer;II)V", "activeColor", "inactiveColor", "TabTransition-Klgx-Pg", "(JJZLr6/e;Landroidx/compose/runtime/Composer;I)V", "TabTransition", "TabBaselineLayout", "(Lr6/e;Lr6/e;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/layout/Placeable;", "textOrIconPlaceable", "", "tabHeight", "placeTextOrIcon", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;I)V", "Landroidx/compose/ui/unit/Density;", "density", "textPlaceable", "iconPlaceable", "tabWidth", "firstBaseline", "lastBaseline", "placeTextAndIcon", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;IIII)V", "Landroidx/compose/ui/unit/Dp;", "SmallTabHeight", "F", "LargeTabHeight", "TabFadeInAnimationDuration", "I", "TabFadeInAnimationDelay", "TabFadeOutAnimationDuration", "HorizontalTextPadding", "getHorizontalTextPadding", "()F", "SingleLineTextBaselineWithIcon", "DoubleLineTextBaselineWithIcon", "Landroidx/compose/ui/unit/TextUnit;", "IconDistanceFromBaseline", "J", "TextDistanceFromLeadingIcon", TypedValues.Custom.S_COLOR, "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,450:1\n77#2:451\n77#2:452\n77#2:453\n68#3:454\n66#3,5:455\n71#3:463\n74#3:467\n1223#4,3:460\n1226#4,3:464\n1223#4,6:475\n1882#5,7:468\n78#6:481\n76#6,8:482\n85#6,4:499\n89#6,2:509\n78#6,6:519\n85#6,4:534\n89#6,2:544\n93#6:550\n78#6,6:559\n85#6,4:574\n89#6,2:584\n93#6:590\n93#6:594\n368#7,9:490\n377#7:511\n368#7,9:525\n377#7:546\n378#7,2:548\n368#7,9:565\n377#7:586\n378#7,2:588\n378#7,2:592\n4032#8,6:503\n4032#8,6:538\n4032#8,6:578\n71#9:512\n68#9,6:513\n74#9:547\n78#9:551\n71#9:552\n68#9,6:553\n74#9:587\n78#9:591\n81#10:595\n148#11:596\n148#11:597\n148#11:598\n148#11:599\n148#11:600\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt\n*L\n100#1:451\n165#1:452\n239#1:453\n283#1:454\n283#1:455,5\n283#1:463\n283#1:467\n283#1:460,3\n283#1:464,3\n315#1:475,6\n283#1:468,7\n308#1:481\n308#1:482,8\n308#1:499,4\n308#1:509,2\n310#1:519,6\n310#1:534,4\n310#1:544,2\n310#1:550\n313#1:559,6\n313#1:574,4\n313#1:584,2\n313#1:590\n308#1:594\n308#1:490,9\n308#1:511\n310#1:525,9\n310#1:546\n310#1:548,2\n313#1:565,9\n313#1:586\n313#1:588,2\n308#1:592,2\n308#1:503,6\n310#1:538,6\n313#1:578,6\n310#1:512\n310#1:513,6\n310#1:547\n310#1:551\n313#1:552\n313#1:553,6\n313#1:587\n313#1:591\n283#1:595\n427#1:596\n435#1:597\n439#1:598\n443#1:599\n449#1:600\n*E\n"})
/* loaded from: classes.dex */
public final class TabKt {
    private static final int TabFadeInAnimationDelay = 100;
    private static final int TabFadeInAnimationDuration = 150;
    private static final int TabFadeOutAnimationDuration = 100;
    private static final float SmallTabHeight = PrimaryNavigationTabTokens.INSTANCE.m9878getContainerHeightD9Ej5fM();
    private static final float LargeTabHeight = C2331Dp.m13305constructorimpl(72);
    private static final float HorizontalTextPadding = C2331Dp.m13305constructorimpl(16);
    private static final float SingleLineTextBaselineWithIcon = C2331Dp.m13305constructorimpl(14);
    private static final float DoubleLineTextBaselineWithIcon = C2331Dp.m13305constructorimpl(6);
    private static final long IconDistanceFromBaseline = TextUnitKt.getSp(20);
    private static final float TextDistanceFromLeadingIcon = C2331Dp.m13305constructorimpl(8);

    /* JADX WARN: Removed duplicated region for block: B:100:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f7  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: LeadingIconTab-wqdebIU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m8989LeadingIconTabwqdebIU(final boolean r20, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6469a r21, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r22, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r23, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r24, boolean r25, long r26, long r28, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r30, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabKt.m8989LeadingIconTabwqdebIU(boolean, r6.a, r6.e, r6.e, androidx.compose.ui.Modifier, boolean, long, long, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010b  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Tab-bogVsAg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m8990TabbogVsAg(final boolean r23, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6469a r24, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r25, boolean r26, long r27, long r29, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r31, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6474f r32, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabKt.m8990TabbogVsAg(boolean, r6.a, androidx.compose.ui.Modifier, boolean, long, long, androidx.compose.foundation.interaction.MutableInteractionSource, r6.f, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fd  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: Tab-wqdebIU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m8991TabwqdebIU(final boolean r27, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6469a r28, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r29, boolean r30, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r31, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r32, long r33, long r35, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r37, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabKt.m8991TabwqdebIU(boolean, r6.a, androidx.compose.ui.Modifier, boolean, r6.e, r6.e, long, long, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TabBaselineLayout(final InterfaceC6473e interfaceC6473e, final InterfaceC6473e interfaceC6473e2, Composer composer, final int i) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(514131524);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(interfaceC6473e) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e2) ? 32 : 16;
        }
        if ((i8 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(514131524, i8, -1, "androidx.compose.material3.TabBaselineLayout (Tab.kt:306)");
            }
            int i9 = i8 & 14;
            boolean z8 = (i9 == 4) | ((i8 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z8 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.TabKt$TabBaselineLayout$2$1
                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    @NotNull
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo6545measure3p2s80s(@NotNull final MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j7) {
                        Placeable placeableMo12033measureBRTryo0;
                        Placeable placeableMo12033measureBRTryo02;
                        if (interfaceC6473e != null) {
                            int size = list.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                Measurable measurable = list.get(i10);
                                if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable), "text")) {
                                    placeableMo12033measureBRTryo0 = measurable.mo12033measureBRTryo0(Constraints.m13248copyZbe2FdA$default(j7, 0, 0, 0, 0, 11, null));
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        placeableMo12033measureBRTryo0 = null;
                        if (interfaceC6473e2 != null) {
                            int size2 = list.size();
                            for (int i11 = 0; i11 < size2; i11++) {
                                Measurable measurable2 = list.get(i11);
                                if (AbstractC5830k.m5325b(LayoutIdKt.getLayoutId(measurable2), "icon")) {
                                    placeableMo12033measureBRTryo02 = measurable2.mo12033measureBRTryo0(j7);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        placeableMo12033measureBRTryo02 = null;
                        final int iMax = Math.max(placeableMo12033measureBRTryo0 != null ? placeableMo12033measureBRTryo0.getWidth() : 0, placeableMo12033measureBRTryo02 != null ? placeableMo12033measureBRTryo02.getWidth() : 0);
                        final int iMax2 = Math.max(measureScope.mo6897roundToPx0680j_4((placeableMo12033measureBRTryo0 == null || placeableMo12033measureBRTryo02 == null) ? TabKt.SmallTabHeight : TabKt.LargeTabHeight), measureScope.mo6896roundToPxR2X_6o(TabKt.IconDistanceFromBaseline) + (placeableMo12033measureBRTryo02 != null ? placeableMo12033measureBRTryo02.getHeight() : 0) + (placeableMo12033measureBRTryo0 != null ? placeableMo12033measureBRTryo0.getHeight() : 0));
                        final Integer numValueOf = placeableMo12033measureBRTryo0 != null ? Integer.valueOf(placeableMo12033measureBRTryo0.get(AlignmentLineKt.getFirstBaseline())) : null;
                        final Integer numValueOf2 = placeableMo12033measureBRTryo0 != null ? Integer.valueOf(placeableMo12033measureBRTryo0.get(AlignmentLineKt.getLastBaseline())) : null;
                        final Placeable placeable = placeableMo12033measureBRTryo0;
                        final Placeable placeable2 = placeableMo12033measureBRTryo02;
                        return MeasureScope.layout$default(measureScope, iMax, iMax2, null, new InterfaceC6471c() { // from class: androidx.compose.material3.TabKt$TabBaselineLayout$2$1.1
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
                                Placeable placeable3;
                                Placeable placeable4 = placeable;
                                if (placeable4 == null || (placeable3 = placeable2) == null) {
                                    if (placeable4 != null) {
                                        TabKt.placeTextOrIcon(placementScope, placeable4, iMax2);
                                        return;
                                    }
                                    Placeable placeable5 = placeable2;
                                    if (placeable5 != null) {
                                        TabKt.placeTextOrIcon(placementScope, placeable5, iMax2);
                                        return;
                                    }
                                    return;
                                }
                                MeasureScope measureScope2 = measureScope;
                                int i12 = iMax;
                                int i13 = iMax2;
                                Integer num = numValueOf;
                                AbstractC5830k.m5327d(num);
                                int iIntValue = num.intValue();
                                Integer num2 = numValueOf2;
                                AbstractC5830k.m5327d(num2);
                                TabKt.placeTextAndIcon(placementScope, measureScope2, placeable4, placeable3, i12, i13, iIntValue, num2.intValue());
                            }
                        }, 4, null);
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
            composerStartRestartGroup.startReplaceGroup(871566271);
            if (interfaceC6473e != null) {
                Modifier modifierM7264paddingVpY3zN4$default = PaddingKt.m7264paddingVpY3zN4$default(LayoutIdKt.layoutId(companion, "text"), HorizontalTextPadding, 0.0f, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7264paddingVpY3zN4$default);
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
                AbstractC0584a.m920u(composerStartRestartGroup, i9, interfaceC6473e);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(871570579);
            if (interfaceC6473e2 != null) {
                Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, "icon");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId);
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
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                AbstractC0584a.m920u(composerStartRestartGroup, (i8 >> 3) & 14, interfaceC6473e2);
            }
            if (AbstractC0584a.m923x(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.TabKt.TabBaselineLayout.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer2, int i10) {
                    TabKt.TabBaselineLayout(interfaceC6473e, interfaceC6473e2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    /* renamed from: TabTransition-Klgx-Pg, reason: not valid java name */
    public static final void m8992TabTransitionKlgxPg(final long j7, final long j8, boolean z8, final InterfaceC6473e interfaceC6473e, Composer composer, final int i) {
        int i8;
        final boolean z9;
        TwoWayConverter twoWayConverter;
        Composer composerStartRestartGroup = composer.startRestartGroup(735731848);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(j7) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(j8) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z9 = z8;
            i8 |= composerStartRestartGroup.changed(z9) ? 256 : 128;
        } else {
            z9 = z8;
        }
        if ((i & 3072) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e) ? 2048 : 1024;
        }
        if ((i8 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(735731848, i8, -1, "androidx.compose.material3.TabTransition (Tab.kt:279)");
            }
            int i9 = i8 >> 6;
            Transition transitionUpdateTransition = TransitionKt.updateTransition(Boolean.valueOf(z9), (String) null, composerStartRestartGroup, i9 & 14, 2);
            TabKt$TabTransition$color$2 tabKt$TabTransition$color$2 = new InterfaceC6474f() { // from class: androidx.compose.material3.TabKt$TabTransition$color$2
                @Override // p152r6.InterfaceC6474f
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment<Boolean>) obj, (Composer) obj2, ((Number) obj3).intValue());
                }

                @Composable
                @NotNull
                public final FiniteAnimationSpec<Color> invoke(@NotNull Transition.Segment<Boolean> segment, @Nullable Composer composer2, int i10) {
                    composer2.startReplaceGroup(-899623535);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-899623535, i10, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:284)");
                    }
                    TweenSpec tweenSpecTween = segment.isTransitioningTo(Boolean.FALSE, Boolean.TRUE) ? AnimationSpecKt.tween(150, 100, EasingKt.getLinearEasing()) : AnimationSpecKt.tween$default(100, 0, EasingKt.getLinearEasing(), 2, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return tweenSpecTween;
                }
            };
            boolean zBooleanValue = ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
            composerStartRestartGroup.startReplaceGroup(-1997025499);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1997025499, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:295)");
            }
            long j9 = zBooleanValue ? j7 : j8;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            ColorSpace colorSpaceM10686getColorSpaceimpl = Color.m10686getColorSpaceimpl(j9);
            boolean zChanged = composerStartRestartGroup.changed(colorSpaceM10686getColorSpaceimpl);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM10686getColorSpaceimpl);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            TwoWayConverter twoWayConverter2 = (TwoWayConverter) objRememberedValue;
            boolean zBooleanValue2 = ((Boolean) transitionUpdateTransition.getCurrentState()).booleanValue();
            composerStartRestartGroup.startReplaceGroup(-1997025499);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1997025499, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:295)");
            }
            long j10 = zBooleanValue2 ? j7 : j8;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Color colorM10672boximpl = Color.m10672boximpl(j10);
            boolean zBooleanValue3 = ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
            composerStartRestartGroup.startReplaceGroup(-1997025499);
            if (ComposerKt.isTraceInProgress()) {
                twoWayConverter = twoWayConverter2;
                ComposerKt.traceEventStart(-1997025499, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:295)");
            } else {
                twoWayConverter = twoWayConverter2;
            }
            long j11 = zBooleanValue3 ? j7 : j8;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m10672boximpl(TabTransition_Klgx_Pg$lambda$2(TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM10672boximpl, Color.m10672boximpl(j11), (FiniteAnimationSpec) tabKt$TabTransition$color$2.invoke((Object) transitionUpdateTransition.getSegment(), (Object) composerStartRestartGroup, (Object) 0), twoWayConverter, "ColorAnimation", composerStartRestartGroup, 0)))), interfaceC6473e, composerStartRestartGroup, (i9 & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.TabKt$TabTransition$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer2, int i10) {
                    TabKt.m8992TabTransitionKlgxPg(j7, j8, z9, interfaceC6473e, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    private static final long TabTransition_Klgx_Pg$lambda$2(State<Color> state) {
        return state.getValue().m10692unboximpl();
    }

    public static final float getHorizontalTextPadding() {
        return HorizontalTextPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeTextAndIcon(Placeable.PlacementScope placementScope, Density density, Placeable placeable, Placeable placeable2, int i, int i8, int i9, int i10) {
        int iMo6897roundToPx0680j_4 = density.mo6897roundToPx0680j_4(PrimaryNavigationTabTokens.INSTANCE.m9876getActiveIndicatorHeightD9Ej5fM()) + density.mo6897roundToPx0680j_4(i9 == i10 ? SingleLineTextBaselineWithIcon : DoubleLineTextBaselineWithIcon);
        int iMo6896roundToPxR2X_6o = (density.mo6896roundToPxR2X_6o(IconDistanceFromBaseline) + placeable2.getHeight()) - i9;
        int i11 = (i8 - i10) - iMo6897roundToPx0680j_4;
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, AbstractC0584a.m898C(placeable, i, 2), i11, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, AbstractC0584a.m898C(placeable2, i, 2), i11 - iMo6896roundToPxR2X_6o, 0.0f, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeTextOrIcon(Placeable.PlacementScope placementScope, Placeable placeable, int i) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, AbstractC0584a.m906g(placeable, i, 2), 0.0f, 4, null);
    }
}
