package androidx.compose.foundation.text;

import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.layout.AbstractC1421e;
import androidx.compose.p006ui.layout.IntrinsicMeasureScope;
import androidx.compose.p006ui.layout.LayoutKt;
import androidx.compose.p006ui.layout.Measurable;
import androidx.compose.p006ui.layout.MeasurePolicy;
import androidx.compose.p006ui.layout.MeasureResult;
import androidx.compose.p006ui.layout.MeasureScope;
import androidx.compose.p006ui.layout.Placeable;
import androidx.compose.p006ui.node.ComposeUiNode;
import androidx.compose.p006ui.platform.CompositionLocalsKt;
import androidx.compose.p006ui.platform.ViewConfiguration;
import androidx.compose.p006ui.text.AnnotatedString;
import androidx.compose.p006ui.text.Placeholder;
import androidx.compose.p006ui.text.TextStyle;
import androidx.compose.p006ui.text.font.FontFamily;
import androidx.compose.p006ui.text.style.TextOverflow;
import androidx.compose.p006ui.unit.Constraints;
import androidx.compose.p006ui.unit.Density;
import androidx.compose.p006ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u001a>\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2'\u0010\u000e\u001a#\u0012\u001f\u0012\u001d\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t0\u0003j\u0002`\n0\u0002H\u0001¢\u0006\u0002\u0010\u000f\u001aa\u0010\u0010\u001a?\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00050\u0002\u0012%\u0012#\u0012\u001f\u0012\u001d\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t0\u0003j\u0002`\n0\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00130\u0012H\u0000\u001ay\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u001ae\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(\"K\u0010\u0000\u001a?\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00050\u0002\u0012%\u0012#\u0012\u001f\u0012\u001d\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t0\u0003j\u0002`\n0\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000*:\b\u0002\u0010)\"\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t0\u00032\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t0\u0003*\u0018\b\u0002\u0010*\"\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0012\u0004\u0012\u00020\u00040\u0003\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006+"}, m5175d2 = {"EmptyInlineContent", "Lkotlin/Pair;", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "Landroidx/compose/foundation/text/PlaceholderRange;", "Lkotlin/Function1;", "", "", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/foundation/text/InlineContentRange;", "InlineChildren", "text", "Landroidx/compose/ui/text/AnnotatedString;", "inlineContents", "(Landroidx/compose/ui/text/AnnotatedString;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "resolveInlineContent", "inlineContent", "", "Landroidx/compose/foundation/text/InlineTextContent;", "updateTextDelegate", "Landroidx/compose/foundation/text/TextDelegate;", "current", "style", "Landroidx/compose/ui/text/TextStyle;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "softWrap", "", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "maxLines", "", "minLines", "placeholders", "updateTextDelegate-rm0N8CA", "(Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;ZIIILjava/util/List;)Landroidx/compose/foundation/text/TextDelegate;", "updateTextDelegate-x_uQXYA", "(Landroidx/compose/foundation/text/TextDelegate;Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;ZIII)Landroidx/compose/foundation/text/TextDelegate;", "InlineContentRange", "PlaceholderRange", "foundation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCoreText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/CoreTextKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,702:1\n33#2,4:703\n38#2:738\n33#2,6:739\n71#3,4:707\n75#3,11:712\n88#3:737\n76#4:711\n456#5,14:723\n*S KotlinDebug\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/CoreTextKt\n*L\n81#1:703,4\n81#1:738\n682#1:739,6\n82#1:707,4\n82#1:712,11\n82#1:737\n82#1:711\n82#1:723,14\n*E\n"})
/* loaded from: classes.dex */
public final class CoreTextKt {
    private static final Pair<List<AnnotatedString.Range<Placeholder>>, List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>>> EmptyInlineContent = new Pair<>(CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList());

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void InlineChildren(final AnnotatedString text, final List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>> inlineContents, Composer composer, final int i4) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(inlineContents, "inlineContents");
        Composer composerStartRestartGroup = composer.startRestartGroup(-110905764);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-110905764, i4, -1, "androidx.compose.foundation.text.InlineChildren (CoreText.kt:76)");
        }
        int size = inlineContents.size();
        int i5 = 0;
        while (i5 < size) {
            AnnotatedString.Range<Function3<String, Composer, Integer, Unit>> range = inlineContents.get(i5);
            Function3<String, Composer, Integer, Unit> function3Component1 = range.component1();
            int start = range.getStart();
            int end = range.getEnd();
            CoreTextKt$InlineChildren$1$2 coreTextKt$InlineChildren$1$2 = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextKt$InlineChildren$1$2
                @Override // androidx.compose.p006ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                    return AbstractC1421e.m654a(this, intrinsicMeasureScope, list, i6);
                }

                @Override // androidx.compose.p006ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                    return AbstractC1421e.m655b(this, intrinsicMeasureScope, list, i6);
                }

                @Override // androidx.compose.p006ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo6928measure3p2s80s(MeasureScope Layout, List<? extends Measurable> children, long j4) {
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(children, "children");
                    final ArrayList arrayList = new ArrayList(children.size());
                    int size2 = children.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        arrayList.add(children.get(i6).mo10585measureBRTryo0(j4));
                    }
                    return MeasureScope.CC.m634p(Layout, Constraints.m11493getMaxWidthimpl(j4), Constraints.m11492getMaxHeightimpl(j4), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextKt$InlineChildren$1$2$measure$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Placeable.PlacementScope layout) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            List<Placeable> list = arrayList;
                            int size3 = list.size();
                            for (int i7 = 0; i7 < size3; i7++) {
                                Placeable.PlacementScope.placeRelative$default(layout, list.get(i7), 0, 0, 0.0f, 4, null);
                            }
                        }
                    }, 4, null);
                }

                @Override // androidx.compose.p006ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                    return AbstractC1421e.m656c(this, intrinsicMeasureScope, list, i6);
                }

                @Override // androidx.compose.p006ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                    return AbstractC1421e.m657d(this, intrinsicMeasureScope, list, i6);
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Modifier.Companion companion = Modifier.INSTANCE;
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
            int i6 = size;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM8824constructorimpl = Updater.m8824constructorimpl(composerStartRestartGroup);
            Updater.m8831setimpl(composerM8824constructorimpl, coreTextKt$InlineChildren$1$2, companion2.getSetMeasurePolicy());
            Updater.m8831setimpl(composerM8824constructorimpl, density, companion2.getSetDensity());
            Updater.m8831setimpl(composerM8824constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m8831setimpl(composerM8824constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            function3MaterializerOf.invoke(SkippableUpdater.m8815boximpl(SkippableUpdater.m8816constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            function3Component1.invoke(text.subSequence(start, end).getText(), composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            i5++;
            size = i6;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextKt.InlineChildren.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i7) {
                CoreTextKt.InlineChildren(text, inlineContents, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1));
            }
        });
    }

    public static final Pair<List<AnnotatedString.Range<Placeholder>>, List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>>> resolveInlineContent(AnnotatedString text, Map<String, InlineTextContent> inlineContent) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(inlineContent, "inlineContent");
        if (inlineContent.isEmpty()) {
            return EmptyInlineContent;
        }
        List<AnnotatedString.Range<String>> stringAnnotations = text.getStringAnnotations(InlineTextContentKt.INLINE_CONTENT_TAG, 0, text.length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = stringAnnotations.size();
        for (int i4 = 0; i4 < size; i4++) {
            AnnotatedString.Range<String> range = stringAnnotations.get(i4);
            InlineTextContent inlineTextContent = inlineContent.get(range.getItem());
            if (inlineTextContent != null) {
                arrayList.add(new AnnotatedString.Range(inlineTextContent.getPlaceholder(), range.getStart(), range.getEnd()));
                arrayList2.add(new AnnotatedString.Range(inlineTextContent.getChildren(), range.getStart(), range.getEnd()));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    /* renamed from: updateTextDelegate-rm0N8CA, reason: not valid java name */
    public static final TextDelegate m7610updateTextDelegaterm0N8CA(TextDelegate current, AnnotatedString text, TextStyle style, Density density, FontFamily.Resolver fontFamilyResolver, boolean z3, int i4, int i5, int i6, List<AnnotatedString.Range<Placeholder>> placeholders) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        if (Intrinsics.areEqual(current.getText(), text) && Intrinsics.areEqual(current.getStyle(), style)) {
            if (current.getSoftWrap() == z3) {
                if (TextOverflow.m11471equalsimpl0(current.getOverflow(), i4)) {
                    if (current.getMaxLines() == i5) {
                        if (current.getMinLines() == i6 && Intrinsics.areEqual(current.getDensity(), density) && Intrinsics.areEqual(current.getPlaceholders(), placeholders) && current.getFontFamilyResolver() == fontFamilyResolver) {
                            return current;
                        }
                    }
                    return new TextDelegate(text, style, i5, i6, z3, i4, density, fontFamilyResolver, placeholders, null);
                }
                return new TextDelegate(text, style, i5, i6, z3, i4, density, fontFamilyResolver, placeholders, null);
            }
            return new TextDelegate(text, style, i5, i6, z3, i4, density, fontFamilyResolver, placeholders, null);
        }
        return new TextDelegate(text, style, i5, i6, z3, i4, density, fontFamilyResolver, placeholders, null);
    }

    /* renamed from: updateTextDelegate-x_uQXYA, reason: not valid java name */
    public static final TextDelegate m7612updateTextDelegatex_uQXYA(TextDelegate current, String text, TextStyle style, Density density, FontFamily.Resolver fontFamilyResolver, boolean z3, int i4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        if (Intrinsics.areEqual(current.getText().getText(), text) && Intrinsics.areEqual(current.getStyle(), style)) {
            if (current.getSoftWrap() == z3) {
                if (TextOverflow.m11471equalsimpl0(current.getOverflow(), i4)) {
                    if (current.getMaxLines() == i5) {
                        if (current.getMinLines() == i6 && Intrinsics.areEqual(current.getDensity(), density) && current.getFontFamilyResolver() == fontFamilyResolver) {
                            return current;
                        }
                    }
                    return new TextDelegate(new AnnotatedString(text, null, null, 6, null), style, i5, i6, z3, i4, density, fontFamilyResolver, null, 256, null);
                }
                return new TextDelegate(new AnnotatedString(text, null, null, 6, null), style, i5, i6, z3, i4, density, fontFamilyResolver, null, 256, null);
            }
            return new TextDelegate(new AnnotatedString(text, null, null, 6, null), style, i5, i6, z3, i4, density, fontFamilyResolver, null, 256, null);
        }
        return new TextDelegate(new AnnotatedString(text, null, null, 6, null), style, i5, i6, z3, i4, density, fontFamilyResolver, null, 256, null);
    }
}
