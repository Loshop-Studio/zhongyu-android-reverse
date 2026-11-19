package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.draw.ClipKt;
import androidx.compose.p013ui.layout.LayoutKt;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.MultiContentMeasurePolicy;
import androidx.compose.p013ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.layout.SubcomposeLayoutKt;
import androidx.compose.p013ui.layout.SubcomposeMeasureScope;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import p123h7.C8736p;
import p134i7.AbstractC8809v;
import p135i8.InterfaceC8822b0;
import p168l7.AbstractC9261c;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* loaded from: classes2.dex */
public final class TabRowKt {
    private static final float ScrollableTabRowMinimumTabWidth = C3156Dp.m26899constructorimpl(90);
    private static final AnimationSpec<Float> ScrollableTabRowScrollSpec = AnimationSpecKt.tween$default(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    private static final AnimationSpec<C3156Dp> TabRowIndicatorSpec = AnimationSpecKt.tween$default(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    /* JADX WARN: Removed duplicated region for block: B:102:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f8  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: PrimaryScrollableTabRow-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m22597PrimaryScrollableTabRowqhFBPw4(final int r21, androidx.compose.p013ui.Modifier r22, androidx.compose.foundation.ScrollState r23, long r24, long r26, float r28, p300x7.InterfaceC10575q r29, p300x7.InterfaceC10574p r30, final p300x7.InterfaceC10574p r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt.m22597PrimaryScrollableTabRowqhFBPw4(int, androidx.compose.ui.Modifier, androidx.compose.foundation.ScrollState, long, long, float, x7.q, x7.p, x7.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0112  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: PrimaryTabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m22598PrimaryTabRowpAZo6Ak(final int r21, androidx.compose.p013ui.Modifier r22, long r23, long r25, p300x7.InterfaceC10575q r27, p300x7.InterfaceC10574p r28, final p300x7.InterfaceC10574p r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt.m22598PrimaryTabRowpAZo6Ak(int, androidx.compose.ui.Modifier, long, long, x7.q, x7.p, x7.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0109  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: ScrollableTabRow-sKfQg0A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m22599ScrollableTabRowsKfQg0A(final int r19, androidx.compose.p013ui.Modifier r20, long r21, long r23, float r25, p300x7.InterfaceC10575q r26, p300x7.InterfaceC10574p r27, final p300x7.InterfaceC10574p r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt.m22599ScrollableTabRowsKfQg0A(int, androidx.compose.ui.Modifier, long, long, float, x7.q, x7.p, x7.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: ScrollableTabRowImpl-sKfQg0A, reason: not valid java name */
    public static final void m22600ScrollableTabRowImplsKfQg0A(final int i10, final Modifier modifier, final long j10, final long j11, final float f10, final ScrollState scrollState, final InterfaceC10575q interfaceC10575q, final InterfaceC10574p interfaceC10574p, final InterfaceC10574p interfaceC10574p2, Composer composer, final int i11) {
        int i12;
        float f11;
        ScrollState scrollState2;
        InterfaceC10575q interfaceC10575q2;
        InterfaceC10574p interfaceC10574p3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1594140035);
        if ((i11 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= composerStartRestartGroup.changed(j10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changed(j11) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            f11 = f10;
            i12 |= composerStartRestartGroup.changed(f11) ? 16384 : 8192;
        } else {
            f11 = f10;
        }
        if ((196608 & i11) == 0) {
            scrollState2 = scrollState;
            i12 |= composerStartRestartGroup.changed(scrollState2) ? 131072 : 65536;
        } else {
            scrollState2 = scrollState;
        }
        if ((1572864 & i11) == 0) {
            interfaceC10575q2 = interfaceC10575q;
            i12 |= composerStartRestartGroup.changedInstance(interfaceC10575q2) ? 1048576 : 524288;
        } else {
            interfaceC10575q2 = interfaceC10575q;
        }
        if ((i11 & 12582912) == 0) {
            interfaceC10574p3 = interfaceC10574p;
            i12 |= composerStartRestartGroup.changedInstance(interfaceC10574p3) ? 8388608 : 4194304;
        } else {
            interfaceC10574p3 = interfaceC10574p;
        }
        if ((100663296 & i11) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC10574p2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i12 & 38347923) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1594140035, i12, -1, "androidx.compose.material3.ScrollableTabRowImpl (TabRow.kt:699)");
            }
            Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), Alignment.Companion.getCenterStart(), false, 2, null), scrollState2, false, null, false, 14, null)));
            final InterfaceC10574p interfaceC10574p4 = interfaceC10574p3;
            final InterfaceC10575q interfaceC10575q3 = interfaceC10575q2;
            final float f12 = f11;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m22549SurfaceT9BRK9s(modifierClipToBounds, null, j10, j11, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1556158104, true, new InterfaceC10574p() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p300x7.InterfaceC10574p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C8736p.f16368a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer3, int i13) {
                    if ((i13 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1556158104, i13, -1, "androidx.compose.material3.ScrollableTabRowImpl.<anonymous> (TabRow.kt:711)");
                    }
                    Object objRememberedValue = composer3.rememberedValue();
                    Composer.Companion companion = Composer.Companion;
                    if (objRememberedValue == companion.getEmpty()) {
                        Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17438a, composer3));
                        composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller;
                    }
                    InterfaceC8822b0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    boolean zChanged = composer3.changed(scrollState) | composer3.changed(coroutineScope);
                    ScrollState scrollState3 = scrollState;
                    Object objRememberedValue2 = composer3.rememberedValue();
                    if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new ScrollableTabData(scrollState3, coroutineScope);
                        composer3.updateRememberedValue(objRememberedValue2);
                    }
                    final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                    Object objRememberedValue3 = composer3.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new TabRowKt$ScrollableTabRowImpl$1$scope$1$1();
                        composer3.updateRememberedValue(objRememberedValue3);
                    }
                    final TabRowKt$ScrollableTabRowImpl$1$scope$1$1 tabRowKt$ScrollableTabRowImpl$1$scope$1$1 = (TabRowKt$ScrollableTabRowImpl$1$scope$1$1) objRememberedValue3;
                    InterfaceC10574p interfaceC10574p5 = interfaceC10574p2;
                    InterfaceC10574p interfaceC10574p6 = interfaceC10574p4;
                    final InterfaceC10575q interfaceC10575q4 = interfaceC10575q3;
                    List listM14774q = AbstractC8809v.m14774q(interfaceC10574p5, interfaceC10574p6, ComposableLambdaKt.rememberComposableLambda(-1530560661, true, new InterfaceC10574p() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1.1
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
                        public final void invoke(Composer composer4, int i14) {
                            if ((i14 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1530560661, i14, -1, "androidx.compose.material3.ScrollableTabRowImpl.<anonymous>.<anonymous> (TabRow.kt:757)");
                            }
                            interfaceC10575q4.invoke(tabRowKt$ScrollableTabRowImpl$1$scope$1$1, composer4, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54));
                    boolean zChanged2 = composer3.changed(f12) | composer3.changed(i10) | composer3.changedInstance(scrollableTabData);
                    final float f13 = f12;
                    final int i14 = i10;
                    Object objRememberedValue4 = composer3.rememberedValue();
                    if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new MultiContentMeasurePolicy() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$2$1
                            @Override // androidx.compose.p013ui.layout.MultiContentMeasurePolicy
                            /* renamed from: measure-3p2s80s */
                            public final MeasureResult mo20803measure3p2s80s(final MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j12) {
                                MeasureScope measureScope2 = measureScope;
                                List<? extends Measurable> list2 = list.get(0);
                                List<? extends Measurable> list3 = list.get(1);
                                List<? extends Measurable> list4 = list.get(2);
                                final int iMo20491roundToPx0680j_4 = measureScope2.mo20491roundToPx0680j_4(f13);
                                int size = list2.size();
                                int iMo20491roundToPx0680j_42 = measureScope2.mo20491roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                Integer numValueOf = 0;
                                int size2 = list2.size();
                                for (int i15 = 0; i15 < size2; i15++) {
                                    numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), list2.get(i15).maxIntrinsicHeight(Integer.MAX_VALUE)));
                                }
                                int iIntValue = numValueOf.intValue();
                                int iMo20491roundToPx0680j_43 = iMo20491roundToPx0680j_4 * 2;
                                long jM26842copyZbe2FdA$default = Constraints.m26842copyZbe2FdA$default(j12, iMo20491roundToPx0680j_42, 0, iIntValue, iIntValue, 2, null);
                                final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                                ref$FloatRef.f17470a = f13;
                                final ArrayList arrayList = new ArrayList(list2.size());
                                int size3 = list2.size();
                                for (int i16 = 0; i16 < size3; i16++) {
                                    arrayList.add(list2.get(i16).mo25627measureBRTryo0(jM26842copyZbe2FdA$default));
                                }
                                final ArrayList arrayList2 = new ArrayList(size);
                                for (int i17 = 0; i17 < size; i17++) {
                                    float fM26913unboximpl = ((C3156Dp) AbstractC9261c.m16982i(C3156Dp.m26897boximpl(TabRowKt.ScrollableTabRowMinimumTabWidth), C3156Dp.m26897boximpl(measureScope2.mo20494toDpu2uoSUM(((Placeable) arrayList.get(i17)).getWidth())))).m26913unboximpl();
                                    iMo20491roundToPx0680j_43 += measureScope2.mo20491roundToPx0680j_4(fM26913unboximpl);
                                    TabPosition tabPosition = new TabPosition(ref$FloatRef.f17470a, fM26913unboximpl, ((C3156Dp) AbstractC9261c.m16982i(C3156Dp.m26897boximpl(C3156Dp.m26899constructorimpl(fM26913unboximpl - C3156Dp.m26899constructorimpl(TabKt.getHorizontalTextPadding() * 2))), C3156Dp.m26897boximpl(C3156Dp.m26899constructorimpl(24)))).m26913unboximpl(), null);
                                    ref$FloatRef.f17470a = C3156Dp.m26899constructorimpl(ref$FloatRef.f17470a + fM26913unboximpl);
                                    arrayList2.add(tabPosition);
                                }
                                tabRowKt$ScrollableTabRowImpl$1$scope$1$1.setTabPositions(arrayList2);
                                final ArrayList arrayList3 = new ArrayList(list3.size());
                                int size4 = list3.size();
                                int i18 = 0;
                                while (i18 < size4) {
                                    int i19 = iMo20491roundToPx0680j_43;
                                    arrayList3.add(list3.get(i18).mo25627measureBRTryo0(Constraints.m26842copyZbe2FdA$default(j12, i19, iMo20491roundToPx0680j_43, 0, 0, 8, null)));
                                    i18++;
                                    size4 = size4;
                                    list3 = list3;
                                    iMo20491roundToPx0680j_43 = i19;
                                }
                                int i20 = iMo20491roundToPx0680j_43;
                                int i21 = i14;
                                final ArrayList arrayList4 = new ArrayList(list4.size());
                                int size5 = list4.size();
                                int i22 = 0;
                                while (i22 < size5) {
                                    int i23 = iIntValue;
                                    iIntValue = i23;
                                    arrayList4.add(list4.get(i22).mo25627measureBRTryo0(Constraints.m26841copyZbe2FdA(j12, 0, measureScope2.mo20491roundToPx0680j_4(((TabPosition) arrayList2.get(i21)).m22591getWidthD9Ej5fM()), 0, i23)));
                                    i22++;
                                    measureScope2 = measureScope;
                                    list4 = list4;
                                }
                                final float f14 = f13;
                                final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                final int i24 = i14;
                                final int i25 = iIntValue;
                                return MeasureScope.layout$default(measureScope, i20, iIntValue, null, new InterfaceC10570l() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // p300x7.InterfaceC10570l
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((Placeable.PlacementScope) obj);
                                        return C8736p.f16368a;
                                    }

                                    public final void invoke(Placeable.PlacementScope placementScope) {
                                        Ref$FloatRef ref$FloatRef2 = ref$FloatRef;
                                        ref$FloatRef2.f17470a = f14;
                                        List<Placeable> list5 = arrayList;
                                        MeasureScope measureScope3 = measureScope;
                                        List<TabPosition> list6 = arrayList2;
                                        int size6 = list5.size();
                                        for (int i26 = 0; i26 < size6; i26++) {
                                            Placeable.PlacementScope.placeRelative$default(placementScope, list5.get(i26), measureScope3.mo20491roundToPx0680j_4(ref$FloatRef2.f17470a), 0, 0.0f, 4, null);
                                            ref$FloatRef2.f17470a = C3156Dp.m26899constructorimpl(ref$FloatRef2.f17470a + list6.get(i26).m22591getWidthD9Ej5fM());
                                        }
                                        List<Placeable> list7 = arrayList3;
                                        int i27 = i25;
                                        int size7 = list7.size();
                                        for (int i28 = 0; i28 < size7; i28++) {
                                            Placeable placeable = list7.get(i28);
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, i27 - placeable.getHeight(), 0.0f, 4, null);
                                        }
                                        List<Placeable> list8 = arrayList4;
                                        MeasureScope measureScope4 = measureScope;
                                        List<TabPosition> list9 = arrayList2;
                                        int i29 = i24;
                                        int i30 = i25;
                                        int size8 = list8.size();
                                        for (int i31 = 0; i31 < size8; i31++) {
                                            Placeable placeable2 = list8.get(i31);
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, Math.max(0, (measureScope4.mo20491roundToPx0680j_4(list9.get(i29).m22591getWidthD9Ej5fM()) - placeable2.getWidth()) / 2), i30 - placeable2.getHeight(), 0.0f, 4, null);
                                        }
                                        scrollableTabData2.onLaidOut(measureScope, iMo20491roundToPx0680j_4, arrayList2, i24);
                                    }
                                }, 4, null);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue4);
                    }
                    MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) objRememberedValue4;
                    Modifier.Companion companion2 = Modifier.Companion;
                    InterfaceC10574p interfaceC10574pCombineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listM14774q);
                    boolean zChanged3 = composer3.changed(multiContentMeasurePolicy);
                    Object objRememberedValue5 = composer3.rememberedValue();
                    if (zChanged3 || objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                        composer3.updateRememberedValue(objRememberedValue5);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue5;
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, companion2);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                    InterfaceC10559a constructor = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM23703constructorimpl = Updater.m23703constructorimpl(composer3);
                    Updater.m23710setimpl(composerM23703constructorimpl, measurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m23710setimpl(composerM23703constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    InterfaceC10574p setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM23703constructorimpl.getInserting() || !AbstractC9133u.m16128b(composerM23703constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM23703constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM23703constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m23710setimpl(composerM23703constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    interfaceC10574pCombineAsVirtualLayouts.invoke(composer3, 0);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, (i12 & 896) | 12582912 | (i12 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC10574p() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p300x7.InterfaceC10574p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C8736p.f16368a;
                }

                public final void invoke(Composer composer3, int i13) {
                    TabRowKt.m22600ScrollableTabRowImplsKfQg0A(i10, modifier, j10, j11, f10, scrollState, interfaceC10575q, interfaceC10574p, interfaceC10574p2, composer3, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f9  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: ScrollableTabRowWithSubcomposeImpl-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m22601ScrollableTabRowWithSubcomposeImplqhFBPw4(final int r27, final p300x7.InterfaceC10575q r28, androidx.compose.p013ui.Modifier r29, long r30, long r32, float r34, p300x7.InterfaceC10574p r35, final p300x7.InterfaceC10574p r36, final androidx.compose.foundation.ScrollState r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt.m22601ScrollableTabRowWithSubcomposeImplqhFBPw4(int, x7.q, androidx.compose.ui.Modifier, long, long, float, x7.p, x7.p, androidx.compose.foundation.ScrollState, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f8  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: SecondaryScrollableTabRow-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m22602SecondaryScrollableTabRowqhFBPw4(final int r21, androidx.compose.p013ui.Modifier r22, androidx.compose.foundation.ScrollState r23, long r24, long r26, float r28, p300x7.InterfaceC10575q r29, p300x7.InterfaceC10574p r30, final p300x7.InterfaceC10574p r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt.m22602SecondaryScrollableTabRowqhFBPw4(int, androidx.compose.ui.Modifier, androidx.compose.foundation.ScrollState, long, long, float, x7.q, x7.p, x7.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0112  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: SecondaryTabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m22603SecondaryTabRowpAZo6Ak(final int r21, androidx.compose.p013ui.Modifier r22, long r23, long r25, p300x7.InterfaceC10575q r27, p300x7.InterfaceC10574p r28, final p300x7.InterfaceC10574p r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt.m22603SecondaryTabRowpAZo6Ak(int, androidx.compose.ui.Modifier, long, long, x7.q, x7.p, x7.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0112  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: TabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m22604TabRowpAZo6Ak(final int r21, androidx.compose.p013ui.Modifier r22, long r23, long r25, p300x7.InterfaceC10575q r27, p300x7.InterfaceC10574p r28, final p300x7.InterfaceC10574p r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt.m22604TabRowpAZo6Ak(int, androidx.compose.ui.Modifier, long, long, x7.q, x7.p, x7.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: TabRowImpl-DTcfvLk, reason: not valid java name */
    public static final void m22605TabRowImplDTcfvLk(Modifier modifier, final long j10, final long j11, final InterfaceC10575q interfaceC10575q, final InterfaceC10574p interfaceC10574p, final InterfaceC10574p interfaceC10574p2, Composer composer, final int i10) {
        Modifier modifier2;
        int i11;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1757425411);
        if ((i10 & 6) == 0) {
            modifier2 = modifier;
            i11 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(j10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changed(j11) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC10575q) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC10574p) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC10574p2) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1757425411, i11, -1, "androidx.compose.material3.TabRowImpl (TabRow.kt:571)");
            }
            int i12 = i11 << 3;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m22549SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, j10, j11, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-65106680, true, new InterfaceC10574p() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p300x7.InterfaceC10574p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C8736p.f16368a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer3, int i13) {
                    if ((i13 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-65106680, i13, -1, "androidx.compose.material3.TabRowImpl.<anonymous> (TabRow.kt:577)");
                    }
                    Object objRememberedValue = composer3.rememberedValue();
                    Composer.Companion companion = Composer.Companion;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new TabRowKt$TabRowImpl$1$scope$1$1();
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    final TabRowKt$TabRowImpl$1$scope$1$1 tabRowKt$TabRowImpl$1$scope$1$1 = (TabRowKt$TabRowImpl$1$scope$1$1) objRememberedValue;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                    InterfaceC10574p interfaceC10574p3 = interfaceC10574p2;
                    InterfaceC10574p interfaceC10574p4 = interfaceC10574p;
                    final InterfaceC10575q interfaceC10575q2 = interfaceC10575q;
                    List listM14774q = AbstractC8809v.m14774q(interfaceC10574p3, interfaceC10574p4, ComposableLambdaKt.rememberComposableLambda(1236693605, true, new InterfaceC10574p() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1.1
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
                        public final void invoke(Composer composer4, int i14) {
                            if ((i14 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1236693605, i14, -1, "androidx.compose.material3.TabRowImpl.<anonymous>.<anonymous> (TabRow.kt:618)");
                            }
                            interfaceC10575q2.invoke(tabRowKt$TabRowImpl$1$scope$1$1, composer4, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54));
                    Object objRememberedValue2 = composer3.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new MultiContentMeasurePolicy() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1$2$1
                            @Override // androidx.compose.p013ui.layout.MultiContentMeasurePolicy
                            /* renamed from: measure-3p2s80s */
                            public final MeasureResult mo20803measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j12) {
                                MeasureScope measureScope2 = measureScope;
                                List<? extends Measurable> list2 = list.get(0);
                                List<? extends Measurable> list3 = list.get(1);
                                int i14 = 2;
                                List<? extends Measurable> list4 = list.get(2);
                                int iM26852getMaxWidthimpl = Constraints.m26852getMaxWidthimpl(j12);
                                int size = list2.size();
                                final Ref$IntRef ref$IntRef = new Ref$IntRef();
                                if (size > 0) {
                                    ref$IntRef.f17471a = iM26852getMaxWidthimpl / size;
                                }
                                Integer numValueOf = 0;
                                int size2 = list2.size();
                                for (int i15 = 0; i15 < size2; i15++) {
                                    numValueOf = Integer.valueOf(Math.max(list2.get(i15).maxIntrinsicHeight(ref$IntRef.f17471a), numValueOf.intValue()));
                                }
                                final int iIntValue = numValueOf.intValue();
                                TabRowKt$TabRowImpl$1$scope$1$1 tabRowKt$TabRowImpl$1$scope$1$12 = tabRowKt$TabRowImpl$1$scope$1$1;
                                ArrayList arrayList = new ArrayList(size);
                                int i16 = 0;
                                while (i16 < size) {
                                    arrayList.add(new TabPosition(C3156Dp.m26899constructorimpl(measureScope2.mo20494toDpu2uoSUM(ref$IntRef.f17471a) * i16), measureScope2.mo20494toDpu2uoSUM(ref$IntRef.f17471a), ((C3156Dp) AbstractC9261c.m16982i(C3156Dp.m26897boximpl(C3156Dp.m26899constructorimpl(measureScope2.mo20494toDpu2uoSUM(Math.min(list2.get(i16).maxIntrinsicWidth(iIntValue), ref$IntRef.f17471a)) - C3156Dp.m26899constructorimpl(TabKt.getHorizontalTextPadding() * i14))), C3156Dp.m26897boximpl(C3156Dp.m26899constructorimpl(24)))).m26913unboximpl(), null));
                                    i16++;
                                    measureScope2 = measureScope;
                                    i14 = 2;
                                }
                                tabRowKt$TabRowImpl$1$scope$1$12.setTabPositions(arrayList);
                                final ArrayList arrayList2 = new ArrayList(list2.size());
                                int size3 = list2.size();
                                for (int i17 = 0; i17 < size3; i17++) {
                                    Measurable measurable = list2.get(i17);
                                    int i18 = ref$IntRef.f17471a;
                                    int i19 = iIntValue;
                                    long jM26841copyZbe2FdA = Constraints.m26841copyZbe2FdA(j12, i18, i18, i19, iIntValue);
                                    iIntValue = i19;
                                    arrayList2.add(measurable.mo25627measureBRTryo0(jM26841copyZbe2FdA));
                                }
                                final ArrayList arrayList3 = new ArrayList(list3.size());
                                int size4 = list3.size();
                                for (int i20 = 0; i20 < size4; i20++) {
                                    arrayList3.add(list3.get(i20).mo25627measureBRTryo0(Constraints.m26842copyZbe2FdA$default(j12, 0, 0, 0, 0, 11, null)));
                                }
                                final ArrayList arrayList4 = new ArrayList(list4.size());
                                int size5 = list4.size();
                                for (int i21 = 0; i21 < size5; i21++) {
                                    Measurable measurable2 = list4.get(i21);
                                    int i22 = ref$IntRef.f17471a;
                                    int i23 = iIntValue;
                                    iIntValue = i23;
                                    arrayList4.add(measurable2.mo25627measureBRTryo0(Constraints.m26841copyZbe2FdA(j12, i22, i22, 0, i23)));
                                }
                                return MeasureScope.layout$default(measureScope, iM26852getMaxWidthimpl, iIntValue, null, new InterfaceC10570l() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1$2$1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // p300x7.InterfaceC10570l
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((Placeable.PlacementScope) obj);
                                        return C8736p.f16368a;
                                    }

                                    public final void invoke(Placeable.PlacementScope placementScope) {
                                        List<Placeable> list5 = arrayList2;
                                        Ref$IntRef ref$IntRef2 = ref$IntRef;
                                        int size6 = list5.size();
                                        for (int i24 = 0; i24 < size6; i24++) {
                                            Placeable.PlacementScope.placeRelative$default(placementScope, list5.get(i24), i24 * ref$IntRef2.f17471a, 0, 0.0f, 4, null);
                                        }
                                        List<Placeable> list6 = arrayList3;
                                        int i25 = iIntValue;
                                        int size7 = list6.size();
                                        for (int i26 = 0; i26 < size7; i26++) {
                                            Placeable placeable = list6.get(i26);
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, i25 - placeable.getHeight(), 0.0f, 4, null);
                                        }
                                        List<Placeable> list7 = arrayList4;
                                        int i27 = iIntValue;
                                        int size8 = list7.size();
                                        for (int i28 = 0; i28 < size8; i28++) {
                                            Placeable placeable2 = list7.get(i28);
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, 0, i27 - placeable2.getHeight(), 0.0f, 4, null);
                                        }
                                    }
                                }, 4, null);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue2);
                    }
                    MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) objRememberedValue2;
                    InterfaceC10574p interfaceC10574pCombineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listM14774q);
                    Object objRememberedValue3 = composer3.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                        composer3.updateRememberedValue(objRememberedValue3);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue3;
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                    InterfaceC10559a constructor = companion2.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM23703constructorimpl = Updater.m23703constructorimpl(composer3);
                    Updater.m23710setimpl(composerM23703constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m23710setimpl(composerM23703constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    InterfaceC10574p setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM23703constructorimpl.getInserting() || !AbstractC9133u.m16128b(composerM23703constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM23703constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM23703constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m23710setimpl(composerM23703constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    interfaceC10574pCombineAsVirtualLayouts.invoke(composer3, 0);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, (i12 & 896) | 12582912 | (i12 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC10574p() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p300x7.InterfaceC10574p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C8736p.f16368a;
                }

                public final void invoke(Composer composer3, int i13) {
                    TabRowKt.m22605TabRowImplDTcfvLk(modifier3, j10, j11, interfaceC10575q, interfaceC10574p, interfaceC10574p2, composer3, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: TabRowWithSubcomposeImpl-DTcfvLk, reason: not valid java name */
    public static final void m22606TabRowWithSubcomposeImplDTcfvLk(Modifier modifier, final long j10, final long j11, final InterfaceC10575q interfaceC10575q, final InterfaceC10574p interfaceC10574p, final InterfaceC10574p interfaceC10574p2, Composer composer, final int i10) {
        Modifier modifier2;
        int i11;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-160898917);
        if ((i10 & 6) == 0) {
            modifier2 = modifier;
            i11 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(j10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changed(j11) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC10575q) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC10574p) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC10574p2) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-160898917, i11, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl (TabRow.kt:948)");
            }
            int i12 = i11 << 3;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m22549SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, j10, j11, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1617702432, true, new InterfaceC10574p() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p300x7.InterfaceC10574p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C8736p.f16368a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer3, int i13) {
                    if ((i13 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1617702432, i13, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:954)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                    boolean zChanged = composer3.changed(interfaceC10574p2) | composer3.changed(interfaceC10574p) | composer3.changed(interfaceC10575q);
                    final InterfaceC10574p interfaceC10574p3 = interfaceC10574p2;
                    final InterfaceC10574p interfaceC10574p4 = interfaceC10574p;
                    final InterfaceC10575q interfaceC10575q2 = interfaceC10575q;
                    Object objRememberedValue = composer3.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new InterfaceC10574p() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // p300x7.InterfaceC10574p
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                return m22614invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).m26858unboximpl());
                            }

                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m22614invoke0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, final long j12) {
                                final int iM26852getMaxWidthimpl = Constraints.m26852getMaxWidthimpl(j12);
                                List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, interfaceC10574p3);
                                int size = listSubcompose.size();
                                final Ref$IntRef ref$IntRef = new Ref$IntRef();
                                if (size > 0) {
                                    ref$IntRef.f17471a = iM26852getMaxWidthimpl / size;
                                }
                                Integer numValueOf = 0;
                                int size2 = listSubcompose.size();
                                for (int i14 = 0; i14 < size2; i14++) {
                                    numValueOf = Integer.valueOf(Math.max(listSubcompose.get(i14).maxIntrinsicHeight(ref$IntRef.f17471a), numValueOf.intValue()));
                                }
                                final int iIntValue = numValueOf.intValue();
                                final ArrayList arrayList = new ArrayList(listSubcompose.size());
                                int size3 = listSubcompose.size();
                                for (int i15 = 0; i15 < size3; i15++) {
                                    Measurable measurable = listSubcompose.get(i15);
                                    int i16 = ref$IntRef.f17471a;
                                    arrayList.add(measurable.mo25627measureBRTryo0(Constraints.m26841copyZbe2FdA(j12, i16, i16, iIntValue, iIntValue)));
                                }
                                final ArrayList arrayList2 = new ArrayList(size);
                                for (int i17 = 0; i17 < size; i17++) {
                                    arrayList2.add(new TabPosition(C3156Dp.m26899constructorimpl(subcomposeMeasureScope.mo20494toDpu2uoSUM(ref$IntRef.f17471a) * i17), subcomposeMeasureScope.mo20494toDpu2uoSUM(ref$IntRef.f17471a), ((C3156Dp) AbstractC9261c.m16982i(C3156Dp.m26897boximpl(C3156Dp.m26899constructorimpl(subcomposeMeasureScope.mo20494toDpu2uoSUM(Math.min(listSubcompose.get(i17).maxIntrinsicWidth(iIntValue), ref$IntRef.f17471a)) - C3156Dp.m26899constructorimpl(TabKt.getHorizontalTextPadding() * 2))), C3156Dp.m26897boximpl(C3156Dp.m26899constructorimpl(24)))).m26913unboximpl(), null));
                                }
                                final InterfaceC10574p interfaceC10574p5 = interfaceC10574p4;
                                final InterfaceC10575q interfaceC10575q3 = interfaceC10575q2;
                                return MeasureScope.layout$default(subcomposeMeasureScope, iM26852getMaxWidthimpl, iIntValue, null, new InterfaceC10570l() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // p300x7.InterfaceC10570l
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((Placeable.PlacementScope) obj);
                                        return C8736p.f16368a;
                                    }

                                    public final void invoke(Placeable.PlacementScope placementScope) {
                                        List<Placeable> list = arrayList;
                                        Ref$IntRef ref$IntRef2 = ref$IntRef;
                                        int size4 = list.size();
                                        for (int i18 = 0; i18 < size4; i18++) {
                                            Placeable.PlacementScope.placeRelative$default(placementScope, list.get(i18), i18 * ref$IntRef2.f17471a, 0, 0.0f, 4, null);
                                        }
                                        List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, interfaceC10574p5);
                                        long j13 = j12;
                                        int i19 = iIntValue;
                                        int size5 = listSubcompose2.size();
                                        for (int i20 = 0; i20 < size5; i20++) {
                                            Placeable placeableMo25627measureBRTryo0 = listSubcompose2.get(i20).mo25627measureBRTryo0(Constraints.m26842copyZbe2FdA$default(j13, 0, 0, 0, 0, 11, null));
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo25627measureBRTryo0, 0, i19 - placeableMo25627measureBRTryo0.getHeight(), 0.0f, 4, null);
                                        }
                                        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final InterfaceC10575q interfaceC10575q4 = interfaceC10575q3;
                                        final List<TabPosition> list2 = arrayList2;
                                        List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(1621992604, true, new InterfaceC10574p() { // from class: androidx.compose.material3.TabRowKt.TabRowWithSubcomposeImpl.1.1.1.1.3
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
                                            public final void invoke(Composer composer4, int i21) {
                                                if ((i21 & 3) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1621992604, i21, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:1000)");
                                                }
                                                interfaceC10575q4.invoke(list2, composer4, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }));
                                        int i21 = iM26852getMaxWidthimpl;
                                        int i22 = iIntValue;
                                        int size6 = listSubcompose3.size();
                                        for (int i23 = 0; i23 < size6; i23++) {
                                            Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i23).mo25627measureBRTryo0(Constraints.Companion.m26862fixedJhjzzOo(i21, i22)), 0, 0, 0.0f, 4, null);
                                        }
                                    }
                                }, 4, null);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (InterfaceC10574p) objRememberedValue, composer3, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, (i12 & 896) | 12582912 | (i12 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC10574p() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p300x7.InterfaceC10574p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C8736p.f16368a;
                }

                public final void invoke(Composer composer3, int i13) {
                    TabRowKt.m22606TabRowWithSubcomposeImplDTcfvLk(modifier3, j10, j11, interfaceC10575q, interfaceC10574p, interfaceC10574p2, composer3, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }
}
