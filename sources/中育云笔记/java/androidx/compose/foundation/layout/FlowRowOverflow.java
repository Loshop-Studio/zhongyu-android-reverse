package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;

@StabilityInferred(parameters = 1)
@InterfaceC10770a
@ExperimentalLayoutApi
/* loaded from: classes.dex */
public final class FlowRowOverflow extends FlowLayoutOverflow {
    public static final int $stable = 0;
    private static final FlowRowOverflow Clip;
    public static final Companion Companion = new Companion(null);
    private static final FlowRowOverflow Visible;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        @ExperimentalLayoutApi
        public static /* synthetic */ void getClip$annotations() {
        }

        @ExperimentalLayoutApi
        public static /* synthetic */ void getVisible$annotations() {
        }

        @ExperimentalLayoutApi
        public final FlowRowOverflow expandIndicator(final InterfaceC9545q interfaceC9545q) {
            return new FlowRowOverflow(FlowLayoutOverflow.OverflowType.ExpandIndicator, 0, 0, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.FlowRowOverflow$Companion$expandIndicator$seeMoreGetter$1
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public final InterfaceC9544p invoke(final FlowLayoutOverflowState flowLayoutOverflowState) {
                    final InterfaceC9545q interfaceC9545q2 = interfaceC9545q;
                    return ComposableLambdaKt.composableLambdaInstance(263270381, true, new InterfaceC9544p() { // from class: androidx.compose.foundation.layout.FlowRowOverflow$Companion$expandIndicator$seeMoreGetter$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // p181hd.InterfaceC9544p
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return C10786q.f26013a;
                        }

                        @Composable
                        public final void invoke(Composer composer, int i10) {
                            if (!composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(263270381, i10, -1, "androidx.compose.foundation.layout.FlowRowOverflow.Companion.expandIndicator.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:104)");
                            }
                            interfaceC9545q2.invoke(new FlowRowOverflowScopeImpl(flowLayoutOverflowState), composer, 0);
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
        /* renamed from: expandOrCollapseIndicator--jt2gSs, reason: not valid java name */
        public final FlowRowOverflow m27406expandOrCollapseIndicatorjt2gSs(final InterfaceC9545q interfaceC9545q, final InterfaceC9545q interfaceC9545q2, int i10, float f10, Composer composer, int i11, int i12) {
            boolean z10 = true;
            int i13 = (i12 & 4) != 0 ? 1 : i10;
            float fM33501constructorimpl = (i12 & 8) != 0 ? C3186Dp.m33501constructorimpl(0) : f10;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-58693346, i11, -1, "androidx.compose.foundation.layout.FlowRowOverflow.Companion.expandOrCollapseIndicator (FlowLayoutOverflow.kt:140)");
            }
            int iMo27093roundToPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo27093roundToPx0680j_4(fM33501constructorimpl);
            boolean zChanged = ((((i11 & 896) ^ 384) > 256 && composer.changed(i13)) || (i11 & 384) == 256) | composer.changed(iMo27093roundToPx0680j_4) | ((((i11 & 14) ^ 6) > 4 && composer.changed(interfaceC9545q)) || (i11 & 6) == 4);
            if ((((i11 & 112) ^ 48) <= 32 || !composer.changed(interfaceC9545q2)) && (i11 & 48) != 32) {
                z10 = false;
            }
            boolean z11 = zChanged | z10;
            Object objRememberedValue = composer.rememberedValue();
            if (z11 || objRememberedValue == Composer.Companion.getEmpty()) {
                FlowRowOverflow flowRowOverflow = new FlowRowOverflow(FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator, i13, iMo27093roundToPx0680j_4, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.FlowRowOverflow$Companion$expandOrCollapseIndicator$1$seeMoreGetter$1
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public final InterfaceC9544p invoke(final FlowLayoutOverflowState flowLayoutOverflowState) {
                        final InterfaceC9545q interfaceC9545q3 = interfaceC9545q;
                        return ComposableLambdaKt.composableLambdaInstance(2094557836, true, new InterfaceC9544p() { // from class: androidx.compose.foundation.layout.FlowRowOverflow$Companion$expandOrCollapseIndicator$1$seeMoreGetter$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // p181hd.InterfaceC9544p
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return C10786q.f26013a;
                            }

                            @Composable
                            public final void invoke(Composer composer2, int i14) {
                                if (!composer2.shouldExecute((i14 & 3) != 2, i14 & 1)) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2094557836, i14, -1, "androidx.compose.foundation.layout.FlowRowOverflow.Companion.expandOrCollapseIndicator.<anonymous>.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:151)");
                                }
                                interfaceC9545q3.invoke(new FlowRowOverflowScopeImpl(flowLayoutOverflowState), composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    }
                }, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.FlowRowOverflow$Companion$expandOrCollapseIndicator$1$collapseGetter$1
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public final InterfaceC9544p invoke(final FlowLayoutOverflowState flowLayoutOverflowState) {
                        final InterfaceC9545q interfaceC9545q3 = interfaceC9545q2;
                        return ComposableLambdaKt.composableLambdaInstance(-972285589, true, new InterfaceC9544p() { // from class: androidx.compose.foundation.layout.FlowRowOverflow$Companion$expandOrCollapseIndicator$1$collapseGetter$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // p181hd.InterfaceC9544p
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return C10786q.f26013a;
                            }

                            @Composable
                            public final void invoke(Composer composer2, int i14) {
                                if (!composer2.shouldExecute((i14 & 3) != 2, i14 & 1)) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-972285589, i14, -1, "androidx.compose.foundation.layout.FlowRowOverflow.Companion.expandOrCollapseIndicator.<anonymous>.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:158)");
                                }
                                interfaceC9545q3.invoke(new FlowRowOverflowScopeImpl(flowLayoutOverflowState), composer2, 0);
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
        public final FlowRowOverflow getClip() {
            return FlowRowOverflow.Clip;
        }

        @ExperimentalLayoutApi
        public final FlowRowOverflow getVisible() {
            return FlowRowOverflow.Visible;
        }

        private Companion() {
        }
    }

    static {
        int i10 = 0;
        InterfaceC9540l interfaceC9540l = null;
        Visible = new FlowRowOverflow(FlowLayoutOverflow.OverflowType.Visible, 0, i10, null, interfaceC9540l, 30, null);
        Clip = new FlowRowOverflow(FlowLayoutOverflow.OverflowType.Clip, i10, 0, interfaceC9540l, null, 30, null);
    }

    public /* synthetic */ FlowRowOverflow(FlowLayoutOverflow.OverflowType overflowType, int i10, int i11, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, AbstractC9972n abstractC9972n) {
        this(overflowType, i10, i11, interfaceC9540l, interfaceC9540l2);
    }

    public /* synthetic */ FlowRowOverflow(FlowLayoutOverflow.OverflowType overflowType, int i10, int i11, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, int i12, AbstractC9972n abstractC9972n) {
        this(overflowType, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? null : interfaceC9540l, (i12 & 16) != 0 ? null : interfaceC9540l2);
    }

    private FlowRowOverflow(FlowLayoutOverflow.OverflowType overflowType, int i10, int i11, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
        super(overflowType, i10, i11, interfaceC9540l, interfaceC9540l2, null);
    }
}
