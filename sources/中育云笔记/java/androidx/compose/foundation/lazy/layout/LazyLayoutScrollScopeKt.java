package androidx.compose.foundation.lazy.layout;

import androidx.compose.p014ui.unit.C3186Dp;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p181hd.InterfaceC9529a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public final class LazyLayoutScrollScopeKt {
    private static final boolean DEBUG = false;
    private static final float TargetDistance = C3186Dp.m33501constructorimpl(2500);
    private static final float BoundDistance = C3186Dp.m33501constructorimpl(1500);
    private static final float MinimumDistance = C3186Dp.m33501constructorimpl(50);

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt", m26211f = "LazyLayoutScrollScope.kt", m26212l = {Opcodes.RETURN, 264}, m26213m = "animateScrollToItem")
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$animateScrollToItem$1 */
    public static final class C15951 extends ContinuationImpl {
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C15951(InterfaceC11588c<? super C15951> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LazyLayoutScrollScopeKt.animateScrollToItem(null, 0, 0, 0, null, this);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:(1:(2:39|40))|(1:(16:51|53|(1:55)(1:56)|57|(1:59)(1:61)|60|108|62|63|122|64|65|112|66|(8:69|18|118|70|71|114|35|(4:37|39|40|(0)(4:42|116|43|(1:46))))|99)(1:52))(0)|45|53|(0)(0)|57|(0)(0)|60|108|62|63|122|64|65|112|66|(0)|99) */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01e4, code lost:
    
        r21 = r5;
        r2 = r17;
        r14 = r18;
        r9 = r26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea A[Catch: ItemFoundInScroll -> 0x01ed, TryCatch #5 {ItemFoundInScroll -> 0x01ed, blocks: (B:35:0x00e6, B:37:0x00ea, B:39:0x00f0, B:53:0x0121, B:57:0x015d), top: B:114:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0250  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x01b6 -> B:18:0x0072). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object animateScrollToItem(androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope r37, int r38, int r39, int r40, androidx.compose.p014ui.unit.Density r41, vc.InterfaceC11588c<? super p309qc.C10786q> r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt.animateScrollToItem(androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope, int, int, int, androidx.compose.ui.unit.Density, vc.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean animateScrollToItem$isOvershot(boolean z10, LazyLayoutScrollScope lazyLayoutScrollScope, int i10, int i11) {
        if (z10) {
            if (lazyLayoutScrollScope.getFirstVisibleItemIndex() > i10) {
                return true;
            }
            return lazyLayoutScrollScope.getFirstVisibleItemIndex() == i10 && lazyLayoutScrollScope.getFirstVisibleItemScrollOffset() > i11;
        }
        if (lazyLayoutScrollScope.getFirstVisibleItemIndex() < i10) {
            return true;
        }
        return lazyLayoutScrollScope.getFirstVisibleItemIndex() == i10 && lazyLayoutScrollScope.getFirstVisibleItemScrollOffset() < i11;
    }

    public static final boolean isItemVisible(LazyLayoutScrollScope lazyLayoutScrollScope, int i10) {
        return i10 <= lazyLayoutScrollScope.getLastVisibleItemIndex() && lazyLayoutScrollScope.getFirstVisibleItemIndex() <= i10;
    }

    private static final void debugLog(InterfaceC9529a interfaceC9529a) {
    }
}
