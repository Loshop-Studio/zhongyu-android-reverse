package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.p006ui.unit.C1700Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0017\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0082\b\u001a%\u0010\f\u001a\u00020\b*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u0011\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0006\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m5175d2 = {"BoundDistance", "Landroidx/compose/ui/unit/Dp;", "F", "DEBUG", "", "MinimumDistance", "TargetDistance", "debugLog", "", "generateMsg", "Lkotlin/Function0;", "", "animateScrollToItem", "Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollScope;", "index", "", "scrollOffset", "(Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollScope;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyAnimateScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,264:1\n154#2:265\n154#2:266\n154#2:267\n*S KotlinDebug\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n*L\n34#1:265\n35#1:266\n36#1:267\n*E\n"})
/* loaded from: classes.dex */
public final class LazyAnimateScrollKt {
    private static final boolean DEBUG = false;
    private static final float TargetDistance = C1700Dp.m11525constructorimpl(2500);
    private static final float BoundDistance = C1700Dp.m11525constructorimpl(1500);
    private static final float MinimumDistance = C1700Dp.m11525constructorimpl(50);

    @Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 8, 0})
    @DebugMetadata(m5191c = "androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2", m5192f = "LazyAnimateScroll.kt", m5193i = {0, 0, 0, 0, 0, 0, 0, 0, 1}, m5194l = {137, 233}, m5195m = "invokeSuspend", m5196n = {"$this$scroll", "loop", "anim", "loops", "targetDistancePx", "boundDistancePx", "minDistancePx", "forward", "$this$scroll"}, m5197s = {"L$0", "L$1", "L$2", "L$3", "F$0", "F$1", "F$2", "I$0", "L$0"})
    @SourceDebugExtension({"SMAP\nLazyAnimateScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n*L\n1#1,264:1\n1#2:265\n40#3,4:266\n40#3,4:270\n*S KotlinDebug\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2\n*L\n129#1:266,4\n230#1:270,4\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2 */
    public static final class C07212 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $index;
        final /* synthetic */ int $scrollOffset;
        final /* synthetic */ LazyAnimateScrollScope $this_animateScrollToItem;
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07212(int i4, LazyAnimateScrollScope lazyAnimateScrollScope, int i5, Continuation<? super C07212> continuation) {
            super(2, continuation);
            this.$index = i4;
            this.$this_animateScrollToItem = lazyAnimateScrollScope;
            this.$scrollOffset = i5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$isOvershot(boolean z3, LazyAnimateScrollScope lazyAnimateScrollScope, int i4, int i5) {
            if (z3) {
                if (lazyAnimateScrollScope.getFirstVisibleItemIndex() <= i4 && (lazyAnimateScrollScope.getFirstVisibleItemIndex() != i4 || lazyAnimateScrollScope.getFirstVisibleItemScrollOffset() <= i5)) {
                    return false;
                }
            } else if (lazyAnimateScrollScope.getFirstVisibleItemIndex() >= i4 && (lazyAnimateScrollScope.getFirstVisibleItemIndex() != i4 || lazyAnimateScrollScope.getFirstVisibleItemScrollOffset() >= i5)) {
                return false;
            }
            return true;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C07212 c07212 = new C07212(this.$index, this.$this_animateScrollToItem, this.$scrollOffset, continuation);
            c07212.L$0 = obj;
            return c07212;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
            return ((C07212) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00d7 A[Catch: ItemFoundInScroll -> 0x01d3, TryCatch #0 {ItemFoundInScroll -> 0x01d3, blocks: (B:27:0x00d3, B:29:0x00d7, B:31:0x00df, B:41:0x0103, B:48:0x014a, B:52:0x0157), top: B:89:0x00d3 }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00f1 A[Catch: ItemFoundInScroll -> 0x01c4, TRY_ENTER, TRY_LEAVE, TryCatch #1 {ItemFoundInScroll -> 0x01c4, blocks: (B:61:0x01b7, B:34:0x00f1), top: B:91:0x01b7 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00fe  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0140  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0142  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0148  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0152  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0155  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x01ae A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x01af  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0220  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0223  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0249 A[RETURN] */
        /* JADX WARN: Type inference failed for: r12v1, types: [T, androidx.compose.animation.core.AnimationState] */
        /* JADX WARN: Type inference failed for: r5v8, types: [T, androidx.compose.animation.core.AnimationState] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x01af -> B:91:0x01b7). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r38) {
            /*
                Method dump skipped, instructions count: 630
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.C07212.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object animateScrollToItem(LazyAnimateScrollScope lazyAnimateScrollScope, int i4, int i5, Continuation<? super Unit> continuation) {
        Object objScroll = lazyAnimateScrollScope.scroll(new C07212(i4, lazyAnimateScrollScope, i5, null), continuation);
        return objScroll == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objScroll : Unit.INSTANCE;
    }

    private static final void debugLog(Function0<String> function0) {
    }
}
