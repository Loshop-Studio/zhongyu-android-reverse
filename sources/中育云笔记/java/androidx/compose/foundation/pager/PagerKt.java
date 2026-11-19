package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.semantics.SemanticsModifierKt;
import androidx.compose.p014ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p211jd.AbstractC9719c;
import p309qc.C10786q;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;

/* loaded from: classes.dex */
public final class PagerKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:243:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0104  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: HorizontalPager--8jOkeI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m27704HorizontalPager8jOkeI(final androidx.compose.foundation.pager.PagerState r36, androidx.compose.p014ui.Modifier r37, androidx.compose.foundation.layout.PaddingValues r38, androidx.compose.foundation.pager.PageSize r39, int r40, float r41, androidx.compose.ui.Alignment.Vertical r42, androidx.compose.foundation.gestures.TargetedFlingBehavior r43, boolean r44, boolean r45, p181hd.InterfaceC9540l r46, androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection r47, androidx.compose.foundation.gestures.snapping.SnapPosition r48, androidx.compose.foundation.OverscrollEffect r49, final p181hd.InterfaceC9546r r50, androidx.compose.runtime.Composer r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 1011
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt.m27704HorizontalPager8jOkeI(androidx.compose.foundation.pager.PagerState, androidx.compose.ui.Modifier, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.pager.PageSize, int, float, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.TargetedFlingBehavior, boolean, boolean, hd.l, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, androidx.compose.foundation.gestures.snapping.SnapPosition, androidx.compose.foundation.OverscrollEffect, hd.r, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0100  */
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: HorizontalPager-oI3XNZo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m27705HorizontalPageroI3XNZo(final androidx.compose.foundation.pager.PagerState r34, androidx.compose.p014ui.Modifier r35, androidx.compose.foundation.layout.PaddingValues r36, androidx.compose.foundation.pager.PageSize r37, int r38, float r39, androidx.compose.ui.Alignment.Vertical r40, androidx.compose.foundation.gestures.TargetedFlingBehavior r41, boolean r42, boolean r43, p181hd.InterfaceC9540l r44, androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection r45, androidx.compose.foundation.gestures.snapping.SnapPosition r46, final p181hd.InterfaceC9546r r47, androidx.compose.runtime.Composer r48, final int r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 829
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt.m27705HorizontalPageroI3XNZo(androidx.compose.foundation.pager.PagerState, androidx.compose.ui.Modifier, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.pager.PageSize, int, float, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.TargetedFlingBehavior, boolean, boolean, hd.l, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, androidx.compose.foundation.gestures.snapping.SnapPosition, hd.r, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:243:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0104  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: VerticalPager--8jOkeI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m27706VerticalPager8jOkeI(final androidx.compose.foundation.pager.PagerState r36, androidx.compose.p014ui.Modifier r37, androidx.compose.foundation.layout.PaddingValues r38, androidx.compose.foundation.pager.PageSize r39, int r40, float r41, androidx.compose.ui.Alignment.Horizontal r42, androidx.compose.foundation.gestures.TargetedFlingBehavior r43, boolean r44, boolean r45, p181hd.InterfaceC9540l r46, androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection r47, androidx.compose.foundation.gestures.snapping.SnapPosition r48, androidx.compose.foundation.OverscrollEffect r49, final p181hd.InterfaceC9546r r50, androidx.compose.runtime.Composer r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 1011
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt.m27706VerticalPager8jOkeI(androidx.compose.foundation.pager.PagerState, androidx.compose.ui.Modifier, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.pager.PageSize, int, float, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.TargetedFlingBehavior, boolean, boolean, hd.l, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, androidx.compose.foundation.gestures.snapping.SnapPosition, androidx.compose.foundation.OverscrollEffect, hd.r, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0100  */
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: VerticalPager-oI3XNZo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m27707VerticalPageroI3XNZo(final androidx.compose.foundation.pager.PagerState r34, androidx.compose.p014ui.Modifier r35, androidx.compose.foundation.layout.PaddingValues r36, androidx.compose.foundation.pager.PageSize r37, int r38, float r39, androidx.compose.ui.Alignment.Horizontal r40, androidx.compose.foundation.gestures.TargetedFlingBehavior r41, boolean r42, boolean r43, p181hd.InterfaceC9540l r44, androidx.compose.p014ui.input.nestedscroll.NestedScrollConnection r45, androidx.compose.foundation.gestures.snapping.SnapPosition r46, final p181hd.InterfaceC9546r r47, androidx.compose.runtime.Composer r48, final int r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 829
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt.m27707VerticalPageroI3XNZo(androidx.compose.foundation.pager.PagerState, androidx.compose.ui.Modifier, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.pager.PageSize, int, float, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.TargetedFlingBehavior, boolean, boolean, hd.l, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, androidx.compose.foundation.gestures.snapping.SnapPosition, hd.r, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final int currentPageOffset(SnapPosition snapPosition, int i10, int i11, int i12, int i13, int i14, int i15, float f10, int i16) {
        return AbstractC9719c.m19282d(snapPosition.position(i10, i11, i13, i14, i15, i16) - (f10 * (i11 + i12)));
    }

    public static final Modifier pagerSemantics(Modifier modifier, final PagerState pagerState, final boolean z10, final InterfaceC11122i0 interfaceC11122i0, boolean z11) {
        return z11 ? modifier.then(SemanticsModifierKt.semantics$default(Modifier.Companion, false, new InterfaceC9540l() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return C10786q.f26013a;
            }

            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                if (z10) {
                    final PagerState pagerState2 = pagerState;
                    final InterfaceC11122i0 interfaceC11122i02 = interfaceC11122i0;
                    SemanticsPropertiesKt.pageUp$default(semanticsPropertyReceiver, null, new InterfaceC9529a() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p181hd.InterfaceC9529a
                        public final Boolean invoke() {
                            return Boolean.valueOf(PagerKt.pagerSemantics$performBackwardPaging(pagerState2, interfaceC11122i02));
                        }
                    }, 1, null);
                    final PagerState pagerState3 = pagerState;
                    final InterfaceC11122i0 interfaceC11122i03 = interfaceC11122i0;
                    SemanticsPropertiesKt.pageDown$default(semanticsPropertyReceiver, null, new InterfaceC9529a() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p181hd.InterfaceC9529a
                        public final Boolean invoke() {
                            return Boolean.valueOf(PagerKt.pagerSemantics$performForwardPaging(pagerState3, interfaceC11122i03));
                        }
                    }, 1, null);
                    return;
                }
                final PagerState pagerState4 = pagerState;
                final InterfaceC11122i0 interfaceC11122i04 = interfaceC11122i0;
                SemanticsPropertiesKt.pageLeft$default(semanticsPropertyReceiver, null, new InterfaceC9529a() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public final Boolean invoke() {
                        return Boolean.valueOf(PagerKt.pagerSemantics$performBackwardPaging(pagerState4, interfaceC11122i04));
                    }
                }, 1, null);
                final PagerState pagerState5 = pagerState;
                final InterfaceC11122i0 interfaceC11122i05 = interfaceC11122i0;
                SemanticsPropertiesKt.pageRight$default(semanticsPropertyReceiver, null, new InterfaceC9529a() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public final Boolean invoke() {
                        return Boolean.valueOf(PagerKt.pagerSemantics$performForwardPaging(pagerState5, interfaceC11122i05));
                    }
                }, 1, null);
            }
        }, 1, null)) : modifier.then(Modifier.Companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pagerSemantics$performBackwardPaging(PagerState pagerState, InterfaceC11122i0 interfaceC11122i0) {
        if (!pagerState.getCanScrollBackward()) {
            return false;
        }
        AbstractC11117h.m24726d(interfaceC11122i0, null, null, new PagerKt$pagerSemantics$performBackwardPaging$1(pagerState, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pagerSemantics$performForwardPaging(PagerState pagerState, InterfaceC11122i0 interfaceC11122i0) {
        if (!pagerState.getCanScrollForward()) {
            return false;
        }
        AbstractC11117h.m24726d(interfaceC11122i0, null, null, new PagerKt$pagerSemantics$performForwardPaging$1(pagerState, null), 3, null);
        return true;
    }

    private static final void debugLog(InterfaceC9529a interfaceC9529a) {
    }
}
