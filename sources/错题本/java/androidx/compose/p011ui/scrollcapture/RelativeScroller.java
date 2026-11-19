package androidx.compose.p011ui.scrollcapture;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;
import p169t6.AbstractC6600a;

@Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\u0007\u0010\fJ\r\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\u0016\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R0\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R$\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m5110d2 = {"Landroidx/compose/ui/scrollcapture/RelativeScroller;", "", "", "viewportSize", "Lkotlin/Function2;", "", "Lh6/c;", "scrollBy", "<init>", "(ILr6/e;)V", "delta", "Ld6/s;", "(FLh6/c;)Ljava/lang/Object;", "reset", "()V", "min", "max", "scrollRangeIntoView", "(IILh6/c;)Ljava/lang/Object;", TypedValues.CycleType.S_WAVE_OFFSET, "mapOffsetToViewport", "(I)I", "scrollTo", "I", "Lr6/e;", "<set-?>", "scrollAmount", "F", "getScrollAmount", "()F", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nComposeScrollCaptureCallback.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeScrollCaptureCallback.android.kt\nandroidx/compose/ui/scrollcapture/RelativeScroller\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,307:1\n1#2:308\n*E\n"})
/* loaded from: classes2.dex */
final class RelativeScroller {
    private float scrollAmount;

    @NotNull
    private final InterfaceC6473e scrollBy;
    private final int viewportSize;

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.ui.scrollcapture.RelativeScroller", m5303f = "ComposeScrollCaptureCallback.android.kt", m5304i = {0}, m5305l = {296}, m5306m = "scrollBy", m5307n = {"this"}, m5308s = {"L$0"})
    /* renamed from: androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1 */
    public static final class C22871 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C22871(InterfaceC5631c<? super C22871> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RelativeScroller.this.scrollBy(0.0f, this);
        }
    }

    public RelativeScroller(int i, @NotNull InterfaceC6473e interfaceC6473e) {
        this.viewportSize = i;
        this.scrollBy = interfaceC6473e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object scrollBy(float r5, p075h6.InterfaceC5631c<? super p045d6.C5443s> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.p011ui.scrollcapture.RelativeScroller.C22871
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1 r0 = (androidx.compose.p011ui.scrollcapture.RelativeScroller.C22871) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1 r0 = new androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.scrollcapture.RelativeScroller r5 = (androidx.compose.p011ui.scrollcapture.RelativeScroller) r5
            kotlin.AbstractC5774b.m5119b(r6)
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.AbstractC5774b.m5119b(r6)
            r6.e r6 = r4.scrollBy
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.invoke(r2, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            r5 = r4
        L49:
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            float r0 = r5.scrollAmount
            float r0 = r0 + r6
            r5.scrollAmount = r0
            d6.s r5 = p045d6.C5443s.f8405a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.scrollcapture.RelativeScroller.scrollBy(float, h6.c):java.lang.Object");
    }

    public final float getScrollAmount() {
        return this.scrollAmount;
    }

    public final int mapOffsetToViewport(int offset) {
        return AbstractC5806u.m5274m(offset - AbstractC6600a.m6241q(this.scrollAmount), 0, this.viewportSize);
    }

    public final void reset() {
        this.scrollAmount = 0.0f;
    }

    @Nullable
    public final Object scrollRangeIntoView(int i, int i8, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        if (i > i8) {
            throw new IllegalArgumentException(AbstractC0584a.m912m(i, i8, "Expected min=", " ≤ max=").toString());
        }
        int i9 = i8 - i;
        int i10 = this.viewportSize;
        if (i9 > i10) {
            StringBuilder sbM94s = AbstractC0037f.m94s(i9, "Expected range (", ") to be ≤ viewportSize=");
            sbM94s.append(this.viewportSize);
            throw new IllegalArgumentException(sbM94s.toString().toString());
        }
        float f = i;
        float f7 = this.scrollAmount;
        C5443s c5443s = C5443s.f8405a;
        if (f >= f7 && i8 <= i10 + f7) {
            return c5443s;
        }
        if (f >= f7) {
            i = i8 - i10;
        }
        Object objScrollTo = scrollTo(i, interfaceC5631c);
        return objScrollTo == CoroutineSingletons.COROUTINE_SUSPENDED ? objScrollTo : c5443s;
    }

    @Nullable
    public final Object scrollTo(float f, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objScrollBy = scrollBy(f - this.scrollAmount, interfaceC5631c);
        return objScrollBy == CoroutineSingletons.COROUTINE_SUSPENDED ? objScrollBy : C5443s.f8405a;
    }
}
