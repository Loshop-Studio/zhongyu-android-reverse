package androidx.compose.foundation.layout;

import android.view.serialization.ClassDiscriminatorModeKt;
import androidx.autofill.HintConstants;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;

@StabilityInferred(parameters = 1)
@ExperimentalLayoutApi
@Metadata(m5109d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0089\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u00120\b\u0002\u0010\u000f\u001a*\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e\u0018\u00010\u0007\u00120\b\u0002\u0010\u0010\u001a*\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e\u0018\u00010\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m5110d2 = {"Landroidx/compose/foundation/layout/FlowRowOverflow;", "Landroidx/compose/foundation/layout/FlowLayoutOverflow;", "Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "minLinesToShowCollapse", "minCrossAxisSizeToShowCollapse", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "state", "Lkotlin/Function0;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "seeMoreGetter", "collapseGetter", "<init>", "(Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;IILr6/c;Lr6/c;)V", "Companion", "foundation-layout_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Deprecated(message = "FlowLayout overflow is no longer maintained")
/* loaded from: classes.dex */
public final class FlowRowOverflow extends FlowLayoutOverflow {
    public static final int $stable = 0;

    @NotNull
    private static final FlowRowOverflow Clip;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final FlowRowOverflow Visible;

    @Metadata(m5109d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJb\u0010\u0014\u001a\u00020\n2\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0002\b\b2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0002\b\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0015\u001a\u00020\n8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001a\u001a\u00020\n8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0016\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001b\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, m5110d2 = {"Landroidx/compose/foundation/layout/FlowRowOverflow$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/FlowRowOverflowScope;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "Landroidx/compose/foundation/layout/FlowRowOverflow;", "expandIndicator", "(Lr6/f;)Landroidx/compose/foundation/layout/FlowRowOverflow;", "collapseIndicator", "", "minRowsToShowCollapse", "Landroidx/compose/ui/unit/Dp;", "minHeightToShowCollapse", "expandOrCollapseIndicator--jt2gSs", "(Lr6/f;Lr6/f;IFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/layout/FlowRowOverflow;", "expandOrCollapseIndicator", "Visible", "Landroidx/compose/foundation/layout/FlowRowOverflow;", "getVisible", "()Landroidx/compose/foundation/layout/FlowRowOverflow;", "getVisible$annotations", "Clip", "getClip", "getClip$annotations", "foundation-layout_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nFlowLayoutOverflow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayoutOverflow.kt\nandroidx/compose/foundation/layout/FlowRowOverflow$Companion\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,869:1\n113#2:870\n75#3:871\n1#4:872\n1247#5,6:873\n*S KotlinDebug\n*F\n+ 1 FlowLayoutOverflow.kt\nandroidx/compose/foundation/layout/FlowRowOverflow$Companion\n*L\n140#1:870\n143#1:871\n144#1:873,6\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @ExperimentalLayoutApi
        public static /* synthetic */ void getClip$annotations() {
        }

        @ExperimentalLayoutApi
        public static /* synthetic */ void getVisible$annotations() {
        }

        @ExperimentalLayoutApi
        @NotNull
        public final FlowRowOverflow expandIndicator(@NotNull final InterfaceC6474f content) {
            return new FlowRowOverflow(FlowLayoutOverflow.OverflowType.ExpandIndicator, 0, 0, new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.FlowRowOverflow$Companion$expandIndicator$seeMoreGetter$1
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public final InterfaceC6473e invoke(final FlowLayoutOverflowState flowLayoutOverflowState) {
                    final InterfaceC6474f interfaceC6474f = content;
                    return ComposableLambdaKt.composableLambdaInstance(263270381, true, new InterfaceC6473e() { // from class: androidx.compose.foundation.layout.FlowRowOverflow$Companion$expandIndicator$seeMoreGetter$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // p152r6.InterfaceC6473e
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return C5443s.f8405a;
                        }

                        @Composable
                        public final void invoke(Composer composer, int i) {
                            if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(263270381, i, -1, "androidx.compose.foundation.layout.FlowRowOverflow.Companion.expandIndicator.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:104)");
                            }
                            interfaceC6474f.invoke(new FlowRowOverflowScopeImpl(flowLayoutOverflowState), composer, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                }
            }, null, 22, null);
        }

        @Composable
        @ExperimentalLayoutApi
        @NotNull
        /* renamed from: expandOrCollapseIndicator--jt2gSs, reason: not valid java name */
        public final FlowRowOverflow m7210expandOrCollapseIndicatorjt2gSs(@NotNull final InterfaceC6474f interfaceC6474f, @NotNull final InterfaceC6474f interfaceC6474f2, int i, float f, @Nullable Composer composer, int i8, int i9) {
            boolean z8 = true;
            int i10 = (i9 & 4) != 0 ? 1 : i;
            float fM13305constructorimpl = (i9 & 8) != 0 ? C2331Dp.m13305constructorimpl(0) : f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-58693346, i8, -1, "androidx.compose.foundation.layout.FlowRowOverflow.Companion.expandOrCollapseIndicator (FlowLayoutOverflow.kt:140)");
            }
            int iMo6897roundToPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo6897roundToPx0680j_4(fM13305constructorimpl);
            boolean zChanged = ((((i8 & 896) ^ 384) > 256 && composer.changed(i10)) || (i8 & 384) == 256) | composer.changed(iMo6897roundToPx0680j_4) | ((((i8 & 14) ^ 6) > 4 && composer.changed(interfaceC6474f)) || (i8 & 6) == 4);
            if ((((i8 & 112) ^ 48) <= 32 || !composer.changed(interfaceC6474f2)) && (i8 & 48) != 32) {
                z8 = false;
            }
            boolean z9 = zChanged | z8;
            Object objRememberedValue = composer.rememberedValue();
            if (z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                FlowRowOverflow flowRowOverflow = new FlowRowOverflow(FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator, i10, iMo6897roundToPx0680j_4, new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.FlowRowOverflow$Companion$expandOrCollapseIndicator$1$seeMoreGetter$1
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public final InterfaceC6473e invoke(final FlowLayoutOverflowState flowLayoutOverflowState) {
                        final InterfaceC6474f interfaceC6474f3 = interfaceC6474f;
                        return ComposableLambdaKt.composableLambdaInstance(2094557836, true, new InterfaceC6473e() { // from class: androidx.compose.foundation.layout.FlowRowOverflow$Companion$expandOrCollapseIndicator$1$seeMoreGetter$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // p152r6.InterfaceC6473e
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return C5443s.f8405a;
                            }

                            @Composable
                            public final void invoke(Composer composer2, int i11) {
                                if (!composer2.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2094557836, i11, -1, "androidx.compose.foundation.layout.FlowRowOverflow.Companion.expandOrCollapseIndicator.<anonymous>.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:151)");
                                }
                                interfaceC6474f3.invoke(new FlowRowOverflowScopeImpl(flowLayoutOverflowState), composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    }
                }, new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.FlowRowOverflow$Companion$expandOrCollapseIndicator$1$collapseGetter$1
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public final InterfaceC6473e invoke(final FlowLayoutOverflowState flowLayoutOverflowState) {
                        final InterfaceC6474f interfaceC6474f3 = interfaceC6474f2;
                        return ComposableLambdaKt.composableLambdaInstance(-972285589, true, new InterfaceC6473e() { // from class: androidx.compose.foundation.layout.FlowRowOverflow$Companion$expandOrCollapseIndicator$1$collapseGetter$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // p152r6.InterfaceC6473e
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return C5443s.f8405a;
                            }

                            @Composable
                            public final void invoke(Composer composer2, int i11) {
                                if (!composer2.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-972285589, i11, -1, "androidx.compose.foundation.layout.FlowRowOverflow.Companion.expandOrCollapseIndicator.<anonymous>.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:158)");
                                }
                                interfaceC6474f3.invoke(new FlowRowOverflowScopeImpl(flowLayoutOverflowState), composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    }
                }, null);
                composer.updateRememberedValue(flowRowOverflow);
                objRememberedValue = flowRowOverflow;
            }
            FlowRowOverflow flowRowOverflow2 = (FlowRowOverflow) objRememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return flowRowOverflow2;
        }

        @ExperimentalLayoutApi
        @NotNull
        public final FlowRowOverflow getClip() {
            return FlowRowOverflow.Clip;
        }

        @ExperimentalLayoutApi
        @NotNull
        public final FlowRowOverflow getVisible() {
            return FlowRowOverflow.Visible;
        }

        private Companion() {
        }
    }

    static {
        int i = 0;
        InterfaceC6471c interfaceC6471c = null;
        Visible = new FlowRowOverflow(FlowLayoutOverflow.OverflowType.Visible, 0, i, null, interfaceC6471c, 30, null);
        Clip = new FlowRowOverflow(FlowLayoutOverflow.OverflowType.Clip, i, 0, interfaceC6471c, null, 30, null);
    }

    public /* synthetic */ FlowRowOverflow(FlowLayoutOverflow.OverflowType overflowType, int i, int i8, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, AbstractC5824e abstractC5824e) {
        this(overflowType, i, i8, interfaceC6471c, interfaceC6471c2);
    }

    public /* synthetic */ FlowRowOverflow(FlowLayoutOverflow.OverflowType overflowType, int i, int i8, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, int i9, AbstractC5824e abstractC5824e) {
        this(overflowType, (i9 & 2) != 0 ? 0 : i, (i9 & 4) != 0 ? 0 : i8, (i9 & 8) != 0 ? null : interfaceC6471c, (i9 & 16) != 0 ? null : interfaceC6471c2);
    }

    private FlowRowOverflow(FlowLayoutOverflow.OverflowType overflowType, int i, int i8, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2) {
        super(overflowType, i, i8, interfaceC6471c, interfaceC6471c2, null);
    }
}
