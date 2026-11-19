package androidx.compose.material3;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.graphics.Color;
import androidx.compose.p006ui.layout.IntrinsicMeasurable;
import androidx.compose.p006ui.layout.LayoutIdParentData;
import androidx.compose.p006ui.layout.Placeable;
import androidx.compose.p006ui.text.TextStyle;
import androidx.compose.p006ui.unit.C1700Dp;
import androidx.compose.p006ui.unit.ConstraintsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aò\u0001\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00032\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020$0)¢\u0006\u0002\b*2\u0006\u0010+\u001a\u00020,2\u0013\u0010-\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010)¢\u0006\u0002\b*2\u0015\b\u0002\u0010.\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010)¢\u0006\u0002\b*2\u0015\b\u0002\u0010/\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010)¢\u0006\u0002\b*2\u0015\b\u0002\u00100\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010)¢\u0006\u0002\b*2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010)¢\u0006\u0002\b*2\b\b\u0002\u00102\u001a\u0002032\b\b\u0002\u00104\u001a\u0002032\b\b\u0002\u00105\u001a\u0002032\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0011\u0010<\u001a\r\u0012\u0004\u0012\u00020$0)¢\u0006\u0002\b*H\u0001¢\u0006\u0002\u0010=\u001a<\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u00020@2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\u0011\u0010C\u001a\r\u0012\u0004\u0012\u00020$0)¢\u0006\u0002\b*H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010E\u001a\u0012\u0010F\u001a\u00020\u00012\b\u0010G\u001a\u0004\u0018\u00010HH\u0000\u001a\u0012\u0010I\u001a\u00020\u00012\b\u0010G\u001a\u0004\u0018\u00010HH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0004\u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u000e\u0010\r\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0013\u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0014\u0010\u0007\"\u000e\u0010\u0015\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0016\u001a\u00020\u0005X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0017\u0010\u0007\"\u000e\u0010\u0018\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0019\u001a\u00020\u001aX\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001c\"\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u001f*\u00020 8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006J"}, m5175d2 = {"AnimationDuration", "", "ContainerId", "", "HorizontalIconPadding", "Landroidx/compose/ui/unit/Dp;", "getHorizontalIconPadding", "()F", "F", "IconDefaultSizeModifier", "Landroidx/compose/ui/Modifier;", "getIconDefaultSizeModifier", "()Landroidx/compose/ui/Modifier;", "LabelId", "LeadingId", "PlaceholderAnimationDelayOrDuration", "PlaceholderAnimationDuration", "PlaceholderId", "SupportingId", "SupportingTopPadding", "getSupportingTopPadding", "TextFieldId", "TextFieldPadding", "getTextFieldPadding", "TrailingId", "ZeroConstraints", "Landroidx/compose/ui/unit/Constraints;", "getZeroConstraints", "()J", "J", "layoutId", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getLayoutId", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;", "CommonDecorationBox", "", "type", "Landroidx/compose/material3/TextFieldType;", "value", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "label", "placeholder", "leadingIcon", "trailingIcon", "supportingText", "singleLine", "", "enabled", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "colors", "Landroidx/compose/material3/TextFieldColors;", "container", "(Landroidx/compose/material3/TextFieldType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material3/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Decoration", "contentColor", "Landroidx/compose/ui/graphics/Color;", "typography", "Landroidx/compose/ui/text/TextStyle;", "content", "Decoration-KTwxG1Y", "(JLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "heightOrZero", "placeable", "Landroidx/compose/ui/layout/Placeable;", "widthOrZero", "material3_release"}, m5176k = 2, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextFieldImplKt {
    public static final int AnimationDuration = 150;
    public static final String ContainerId = "Container";
    private static final Modifier IconDefaultSizeModifier;
    public static final String LabelId = "Label";
    public static final String LeadingId = "Leading";
    private static final int PlaceholderAnimationDelayOrDuration = 67;
    private static final int PlaceholderAnimationDuration = 83;
    public static final String PlaceholderId = "Hint";
    public static final String SupportingId = "Supporting";
    public static final String TextFieldId = "TextField";
    public static final String TrailingId = "Trailing";
    private static final long ZeroConstraints = ConstraintsKt.Constraints(0, 0, 0, 0);
    private static final float TextFieldPadding = C1700Dp.m11525constructorimpl(16);
    private static final float HorizontalIconPadding = C1700Dp.m11525constructorimpl(12);
    private static final float SupportingTopPadding = C1700Dp.m11525constructorimpl(4);

    static {
        float f4 = 48;
        IconDefaultSizeModifier = SizeKt.m7343defaultMinSizeVpY3zN4(Modifier.INSTANCE, C1700Dp.m11525constructorimpl(f4), C1700Dp.m11525constructorimpl(f4));
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:254:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void CommonDecorationBox(final androidx.compose.material3.TextFieldType r39, final java.lang.String r40, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r41, final androidx.compose.p006ui.text.input.VisualTransformation r42, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r43, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r44, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r45, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r46, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r47, boolean r48, boolean r49, boolean r50, final androidx.compose.foundation.interaction.InteractionSource r51, final androidx.compose.foundation.layout.PaddingValues r52, final androidx.compose.material3.TextFieldColors r53, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r54, androidx.compose.runtime.Composer r55, final int r56, final int r57, final int r58) {
        /*
            Method dump skipped, instructions count: 1105
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldImplKt.CommonDecorationBox(androidx.compose.material3.TextFieldType, java.lang.String, kotlin.jvm.functions.Function2, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.foundation.layout.PaddingValues, androidx.compose.material3.TextFieldColors, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    /* renamed from: Decoration-KTwxG1Y, reason: not valid java name */
    public static final void m8203DecorationKTwxG1Y(final long j4, TextStyle textStyle, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i4, final int i5) {
        final int i6;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1520066345);
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (composerStartRestartGroup.changed(j4) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i7 = i5 & 2;
        if (i7 != 0) {
            i6 |= 48;
        } else if ((i4 & UMErrorCode.E_UM_BE_DEFLATE_FAILED) == 0) {
            i6 |= composerStartRestartGroup.changed(textStyle) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i6 |= 384;
        } else if ((i4 & 896) == 0) {
            i6 |= composerStartRestartGroup.changed(content) ? 256 : 128;
        }
        if ((i6 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i7 != 0) {
                textStyle = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1520066345, i6, -1, "androidx.compose.material3.Decoration (TextFieldImpl.kt:236)");
            }
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1449369305, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$Decoration$contentWithColor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @Composable
                public final void invoke(Composer composer2, int i8) {
                    if ((i8 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1449369305, i8, -1, "androidx.compose.material3.Decoration.<anonymous> (TextFieldImpl.kt:241)");
                    }
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m9168boximpl(j4))}, content, composer2, ((i6 >> 3) & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
            if (textStyle != null) {
                composerStartRestartGroup.startReplaceableGroup(1830466317);
                TextKt.ProvideTextStyle(textStyle, composableLambda, composerStartRestartGroup, ((i6 >> 3) & 14) | 48);
            } else {
                composerStartRestartGroup.startReplaceableGroup(1830466369);
                composableLambda.invoke(composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final TextStyle textStyle2 = textStyle;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldImplKt$Decoration$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i8) {
                TextFieldImplKt.m8203DecorationKTwxG1Y(j4, textStyle2, content, composer2, i4 | 1, i5);
            }
        });
    }

    public static final float getHorizontalIconPadding() {
        return HorizontalIconPadding;
    }

    public static final Modifier getIconDefaultSizeModifier() {
        return IconDefaultSizeModifier;
    }

    public static final Object getLayoutId(IntrinsicMeasurable intrinsicMeasurable) {
        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "<this>");
        Object parentData = intrinsicMeasurable.getParentData();
        LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }

    public static final float getSupportingTopPadding() {
        return SupportingTopPadding;
    }

    public static final float getTextFieldPadding() {
        return TextFieldPadding;
    }

    public static final long getZeroConstraints() {
        return ZeroConstraints;
    }

    public static final int heightOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getHeight();
        }
        return 0;
    }

    public static final int widthOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getWidth();
        }
        return 0;
    }
}
