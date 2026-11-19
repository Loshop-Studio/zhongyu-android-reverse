package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p014ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p014ui.input.pointer.PointerInputScope;
import androidx.compose.p014ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlinx.coroutines.AbstractC10006d;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9546r;
import p280od.InterfaceC10479m;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public final class LazyLayoutPagerKt {
    /* JADX WARN: Removed duplicated region for block: B:107:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:268:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011c  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Pager-eLwUrMk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m27700PagereLwUrMk(final androidx.compose.p014ui.Modifier r30, final androidx.compose.foundation.pager.PagerState r31, final androidx.compose.foundation.layout.PaddingValues r32, final boolean r33, final androidx.compose.foundation.gestures.Orientation r34, final androidx.compose.foundation.gestures.TargetedFlingBehavior r35, final boolean r36, final androidx.compose.foundation.OverscrollEffect r37, int r38, float r39, final androidx.compose.foundation.pager.PageSize r40, androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection r41, final p181hd.InterfaceC9540l r42, final androidx.compose.ui.Alignment.Horizontal r43, final androidx.compose.ui.Alignment.Vertical r44, final androidx.compose.foundation.gestures.snapping.SnapPosition r45, final p181hd.InterfaceC9546r r46, androidx.compose.runtime.Composer r47, final int r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.LazyLayoutPagerKt.m27700PagereLwUrMk(androidx.compose.ui.Modifier, androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.gestures.Orientation, androidx.compose.foundation.gestures.TargetedFlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, int, float, androidx.compose.foundation.pager.PageSize, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, hd.l, androidx.compose.ui.Alignment$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.snapping.SnapPosition, hd.r, androidx.compose.runtime.Composer, int, int, int):void");
    }

    private static final Modifier dragDirectionDetector(Modifier modifier, final PagerState pagerState) {
        return modifier.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, pagerState, new PointerInputEventHandler() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt.dragDirectionDetector.1

            @InterfaceC11829d(m26210c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1", m26211f = "LazyLayoutPager.kt", m26212l = {287}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
                final /* synthetic */ PagerState $state;
                final /* synthetic */ PointerInputScope $this_pointerInput;
                int label;

                @InterfaceC11829d(m26210c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1", m26211f = "LazyLayoutPager.kt", m26212l = {289, 293}, m26213m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C120701 extends RestrictedSuspendLambda implements InterfaceC9544p {
                    final /* synthetic */ PagerState $state;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    Object L$2;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C120701(PagerState pagerState, InterfaceC11588c<? super C120701> interfaceC11588c) {
                        super(2, interfaceC11588c);
                        this.$state = pagerState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                        C120701 c120701 = new C120701(this.$state, interfaceC11588c);
                        c120701.L$0 = obj;
                        return c120701;
                    }

                    @Override // p181hd.InterfaceC9544p
                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                        return ((C120701) create(awaitPointerEventScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
                    
                        if (r11 == r0) goto L17;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
                    
                        if (r11 == r0) goto L17;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
                    
                        return r0;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
                    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0065 -> B:18:0x0068). Please report as a decompilation issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
                        /*
                            r10 = this;
                            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                            int r1 = r10.label
                            r2 = 2
                            r3 = 0
                            r4 = 1
                            if (r1 == 0) goto L2f
                            if (r1 == r4) goto L27
                            if (r1 != r2) goto L1f
                            java.lang.Object r1 = r10.L$2
                            androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r1
                            java.lang.Object r4 = r10.L$1
                            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r4
                            java.lang.Object r5 = r10.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r5
                            kotlin.AbstractC9924b.m20071b(r11)
                            goto L68
                        L1f:
                            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r11.<init>(r0)
                            throw r11
                        L27:
                            java.lang.Object r1 = r10.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r1
                            kotlin.AbstractC9924b.m20071b(r11)
                            goto L44
                        L2f:
                            kotlin.AbstractC9924b.m20071b(r11)
                            java.lang.Object r11 = r10.L$0
                            r1 = r11
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r1
                            androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.p014ui.input.pointer.PointerEventPass.Initial
                            r10.L$0 = r1
                            r10.label = r4
                            java.lang.Object r11 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(r1, r3, r11, r10)
                            if (r11 != r0) goto L44
                            goto L67
                        L44:
                            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r11
                            androidx.compose.foundation.pager.PagerState r4 = r10.$state
                            androidx.compose.ui.geometry.Offset$Companion r5 = androidx.compose.p014ui.geometry.Offset.Companion
                            long r5 = r5.m30653getZeroF1C5BW0()
                            r4.m27719setUpDownDifferencek4lQ0M$foundation_release(r5)
                            r4 = 0
                            r5 = r1
                            r1 = r4
                            r4 = r11
                        L55:
                            if (r1 != 0) goto L94
                            androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.p014ui.input.pointer.PointerEventPass.Initial
                            r10.L$0 = r5
                            r10.L$1 = r4
                            r10.L$2 = r1
                            r10.label = r2
                            java.lang.Object r11 = r5.awaitPointerEvent(r11, r10)
                            if (r11 != r0) goto L68
                        L67:
                            return r0
                        L68:
                            androidx.compose.ui.input.pointer.PointerEvent r11 = (androidx.compose.p014ui.input.pointer.PointerEvent) r11
                            java.util.List r6 = r11.getChanges()
                            r7 = r6
                            java.util.Collection r7 = (java.util.Collection) r7
                            int r7 = r7.size()
                            r8 = r3
                        L76:
                            if (r8 >= r7) goto L88
                            java.lang.Object r9 = r6.get(r8)
                            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r9
                            boolean r9 = androidx.compose.p014ui.input.pointer.PointerEventKt.changedToUp(r9)
                            if (r9 != 0) goto L85
                            goto L55
                        L85:
                            int r8 = r8 + 1
                            goto L76
                        L88:
                            java.util.List r11 = r11.getChanges()
                            java.lang.Object r11 = r11.get(r3)
                            r1 = r11
                            androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r1
                            goto L55
                        L94:
                            androidx.compose.foundation.pager.PagerState r11 = r10.$state
                            long r0 = r1.m32104getPositionF1C5BW0()
                            long r2 = r4.m32104getPositionF1C5BW0()
                            long r0 = androidx.compose.p014ui.geometry.Offset.m30641minusMKHz9U(r0, r2)
                            r11.m27719setUpDownDifferencek4lQ0M$foundation_release(r0)
                            qc.q r11 = p309qc.C10786q.f26013a
                            return r11
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.LazyLayoutPagerKt.C16401.AnonymousClass1.C120701.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(PointerInputScope pointerInputScope, PagerState pagerState, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.$this_pointerInput = pointerInputScope;
                    this.$state = pagerState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    return new AnonymousClass1(this.$this_pointerInput, this.$state, interfaceC11588c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM25952f = AbstractC11725a.m25952f();
                    int i10 = this.label;
                    if (i10 == 0) {
                        AbstractC9924b.m20071b(obj);
                        PointerInputScope pointerInputScope = this.$this_pointerInput;
                        C120701 c120701 = new C120701(this.$state, null);
                        this.label = 1;
                        if (ForEachGestureKt.awaitEachGesture(pointerInputScope, c120701, this) == objM25952f) {
                            return objM25952f;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9924b.m20071b(obj);
                    }
                    return C10786q.f26013a;
                }

                @Override // p181hd.InterfaceC9544p
                public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            @Override // androidx.compose.p014ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                Object objM20748e = AbstractC10006d.m20748e(new AnonymousClass1(pointerInputScope, pagerState, null), interfaceC11588c);
                return objM20748e == AbstractC11725a.m25952f() ? objM20748e : C10786q.f26013a;
            }
        }));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    private static final InterfaceC9529a rememberPagerItemProviderLambda(final PagerState pagerState, InterfaceC9546r interfaceC9546r, InterfaceC9540l interfaceC9540l, final InterfaceC9529a interfaceC9529a, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1372505274, i10, -1, "androidx.compose.foundation.pager.rememberPagerItemProviderLambda (LazyLayoutPager.kt:259)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(interfaceC9546r, composer, (i10 >> 3) & 14);
        final State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(interfaceC9540l, composer, (i10 >> 6) & 14);
        boolean zChanged = ((((i10 & 14) ^ 6) > 4 && composer.changed(pagerState)) || (i10 & 6) == 4) | composer.changed(stateRememberUpdatedState) | composer.changed(stateRememberUpdatedState2) | ((((i10 & 7168) ^ 3072) > 2048 && composer.changed(interfaceC9529a)) || (i10 & 3072) == 2048);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            final State stateDerivedStateOf = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new InterfaceC9529a() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$intervalContentState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final PagerLayoutIntervalContent invoke() {
                    return new PagerLayoutIntervalContent(stateRememberUpdatedState.getValue(), stateRememberUpdatedState2.getValue(), ((Number) interfaceC9529a.invoke()).intValue());
                }
            });
            final State stateDerivedStateOf2 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new InterfaceC9529a() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$itemProviderState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final PagerLazyLayoutItemProvider invoke() {
                    PagerLayoutIntervalContent value = stateDerivedStateOf.getValue();
                    return new PagerLazyLayoutItemProvider(pagerState, value, new NearestRangeKeyIndexMap(pagerState.getNearestRange$foundation_release(), value));
                }
            });
            objRememberedValue = new PropertyReference0Impl(stateDerivedStateOf2) { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$1
                @Override // kotlin.jvm.internal.PropertyReference0Impl, p280od.InterfaceC10479m
                public Object get() {
                    return ((State) this.receiver).getValue();
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        InterfaceC10479m interfaceC10479m = (InterfaceC10479m) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return interfaceC10479m;
    }
}
