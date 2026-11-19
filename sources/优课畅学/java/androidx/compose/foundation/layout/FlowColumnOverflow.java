package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.p013ui.platform.CompositionLocalsKt;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.jvm.internal.AbstractC9126n;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

@StabilityInferred(parameters = 1)
@InterfaceC8721a
@ExperimentalLayoutApi
/* loaded from: classes.dex */
public final class FlowColumnOverflow extends FlowLayoutOverflow {
    public static final int $stable = 0;
    private static final FlowColumnOverflow Clip;
    public static final Companion Companion = new Companion(null);
    private static final FlowColumnOverflow Visible;

    @InterfaceC8721a
    @ExperimentalLayoutApi
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        @ExperimentalLayoutApi
        public static /* synthetic */ void getClip$annotations() {
        }

        @ExperimentalLayoutApi
        public static /* synthetic */ void getVisible$annotations() {
        }

        @ExperimentalLayoutApi
        public final FlowColumnOverflow expandIndicator(final InterfaceC10575q interfaceC10575q) {
            return new FlowColumnOverflow(FlowLayoutOverflow.OverflowType.ExpandIndicator, 0, 0, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.FlowColumnOverflow$Companion$expandIndicator$seeMoreGetter$1
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public final InterfaceC10574p invoke(final FlowLayoutOverflowState flowLayoutOverflowState) {
                    final InterfaceC10575q interfaceC10575q2 = interfaceC10575q;
                    return ComposableLambdaKt.composableLambdaInstance(19371081, true, new InterfaceC10574p() { // from class: androidx.compose.foundation.layout.FlowColumnOverflow$Companion$expandIndicator$seeMoreGetter$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // p300x7.InterfaceC10574p
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return C8736p.f16368a;
                        }

                        @Composable
                        public final void invoke(Composer composer, int i10) {
                            if (!composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(19371081, i10, -1, "androidx.compose.foundation.layout.FlowColumnOverflow.Companion.expandIndicator.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:242)");
                            }
                            interfaceC10575q2.invoke(new FlowColumnOverflowScopeImpl(flowLayoutOverflowState), composer, 0);
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
        public final FlowColumnOverflow m20777expandOrCollapseIndicatorjt2gSs(final InterfaceC10575q interfaceC10575q, final InterfaceC10575q interfaceC10575q2, int i10, float f10, Composer composer, int i11, int i12) {
            boolean z10 = true;
            int i13 = (i12 & 4) != 0 ? 1 : i10;
            float fM26899constructorimpl = (i12 & 8) != 0 ? C3156Dp.m26899constructorimpl(0) : f10;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(972645562, i11, -1, "androidx.compose.foundation.layout.FlowColumnOverflow.Companion.expandOrCollapseIndicator (FlowLayoutOverflow.kt:278)");
            }
            int iMo20491roundToPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo20491roundToPx0680j_4(fM26899constructorimpl);
            boolean zChanged = ((((i11 & 896) ^ 384) > 256 && composer.changed(i13)) || (i11 & 384) == 256) | composer.changed(iMo20491roundToPx0680j_4) | ((((i11 & 14) ^ 6) > 4 && composer.changed(interfaceC10575q)) || (i11 & 6) == 4);
            if ((((i11 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) ^ 48) <= 32 || !composer.changed(interfaceC10575q2)) && (i11 & 48) != 32) {
                z10 = false;
            }
            boolean z11 = zChanged | z10;
            Object objRememberedValue = composer.rememberedValue();
            if (z11 || objRememberedValue == Composer.Companion.getEmpty()) {
                FlowColumnOverflow flowColumnOverflow = new FlowColumnOverflow(FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator, i13, iMo20491roundToPx0680j_4, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.FlowColumnOverflow$Companion$expandOrCollapseIndicator$1$seeMoreGetter$1
                    {
                        super(1);
                    }

                    @Override // p300x7.InterfaceC10570l
                    public final InterfaceC10574p invoke(final FlowLayoutOverflowState flowLayoutOverflowState) {
                        final InterfaceC10575q interfaceC10575q3 = interfaceC10575q;
                        return ComposableLambdaKt.composableLambdaInstance(617878374, true, new InterfaceC10574p() { // from class: androidx.compose.foundation.layout.FlowColumnOverflow$Companion$expandOrCollapseIndicator$1$seeMoreGetter$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // p300x7.InterfaceC10574p
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return C8736p.f16368a;
                            }

                            @Composable
                            public final void invoke(Composer composer2, int i14) {
                                if (!composer2.shouldExecute((i14 & 3) != 2, i14 & 1)) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(617878374, i14, -1, "androidx.compose.foundation.layout.FlowColumnOverflow.Companion.expandOrCollapseIndicator.<anonymous>.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:289)");
                                }
                                interfaceC10575q3.invoke(new FlowColumnOverflowScopeImpl(flowLayoutOverflowState), composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    }
                }, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.FlowColumnOverflow$Companion$expandOrCollapseIndicator$1$collapseGetter$1
                    {
                        super(1);
                    }

                    @Override // p300x7.InterfaceC10570l
                    public final InterfaceC10574p invoke(final FlowLayoutOverflowState flowLayoutOverflowState) {
                        final InterfaceC10575q interfaceC10575q3 = interfaceC10575q2;
                        return ComposableLambdaKt.composableLambdaInstance(1004384103, true, new InterfaceC10574p() { // from class: androidx.compose.foundation.layout.FlowColumnOverflow$Companion$expandOrCollapseIndicator$1$collapseGetter$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // p300x7.InterfaceC10574p
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return C8736p.f16368a;
                            }

                            @Composable
                            public final void invoke(Composer composer2, int i14) {
                                if (!composer2.shouldExecute((i14 & 3) != 2, i14 & 1)) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1004384103, i14, -1, "androidx.compose.foundation.layout.FlowColumnOverflow.Companion.expandOrCollapseIndicator.<anonymous>.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:296)");
                                }
                                interfaceC10575q3.invoke(new FlowColumnOverflowScopeImpl(flowLayoutOverflowState), composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    }
                }, null);
                composer.updateRememberedValue(flowColumnOverflow);
                objRememberedValue = flowColumnOverflow;
            }
            FlowColumnOverflow flowColumnOverflow2 = (FlowColumnOverflow) objRememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return flowColumnOverflow2;
        }

        @ExperimentalLayoutApi
        public final FlowColumnOverflow getClip() {
            return FlowColumnOverflow.Clip;
        }

        @ExperimentalLayoutApi
        public final FlowColumnOverflow getVisible() {
            return FlowColumnOverflow.Visible;
        }

        private Companion() {
        }
    }

    static {
        int i10 = 0;
        InterfaceC10570l interfaceC10570l = null;
        Visible = new FlowColumnOverflow(FlowLayoutOverflow.OverflowType.Visible, 0, i10, null, interfaceC10570l, 30, null);
        Clip = new FlowColumnOverflow(FlowLayoutOverflow.OverflowType.Clip, i10, 0, interfaceC10570l, null, 30, null);
    }

    public /* synthetic */ FlowColumnOverflow(FlowLayoutOverflow.OverflowType overflowType, int i10, int i11, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, AbstractC9126n abstractC9126n) {
        this(overflowType, i10, i11, interfaceC10570l, interfaceC10570l2);
    }

    public /* synthetic */ FlowColumnOverflow(FlowLayoutOverflow.OverflowType overflowType, int i10, int i11, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, int i12, AbstractC9126n abstractC9126n) {
        this(overflowType, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? null : interfaceC10570l, (i12 & 16) != 0 ? null : interfaceC10570l2);
    }

    private FlowColumnOverflow(FlowLayoutOverflow.OverflowType overflowType, int i10, int i11, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
        super(overflowType, i10, i11, interfaceC10570l, interfaceC10570l2, null);
    }
}
