package coil3.compose;

import androidx.compose.p011ui.layout.LayoutModifier;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.SourceDebugExtension;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p110m.AbstractC6077e;
import p162t.InterfaceC6577g;

@Stable
@Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m5110d2 = {"Lcoil3/compose/ConstraintsSizeResolver;", "Lt/g;", "Landroidx/compose/ui/layout/LayoutModifier;", "<init>", "()V", "coil-compose-core_release"}, m5111k = 1, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nConstraintsSizeResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintsSizeResolver.kt\ncoil3/compose/ConstraintsSizeResolver\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n426#2,11:77\n1869#3,2:88\n*S KotlinDebug\n*F\n+ 1 ConstraintsSizeResolver.kt\ncoil3/compose/ConstraintsSizeResolver\n*L\n40#1:77,11\n71#1:88,2\n*E\n"})
/* loaded from: classes2.dex */
public final class ConstraintsSizeResolver implements InterfaceC6577g, LayoutModifier {

    /* renamed from: c */
    public static final /* synthetic */ int f1835c = 0;

    /* renamed from: a */
    public long f1836a = AbstractC6077e.f9678a;

    /* renamed from: b */
    public ArrayList f1837b = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object, kotlinx.coroutines.g] */
    @Override // p162t.InterfaceC6577g
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo2180a(p075h6.InterfaceC5631c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof coil3.compose.ConstraintsSizeResolver$size$1
            if (r0 == 0) goto L13
            r0 = r8
            coil3.compose.ConstraintsSizeResolver$size$1 r0 = (coil3.compose.ConstraintsSizeResolver$size$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            coil3.compose.ConstraintsSizeResolver$size$1 r0 = new coil3.compose.ConstraintsSizeResolver$size$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            kotlin.AbstractC5774b.m5119b(r8)     // Catch: java.lang.Throwable -> L2b
            goto L64
        L2b:
            r8 = move-exception
            goto L74
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            kotlin.AbstractC5774b.m5119b(r8)
            long r4 = r7.f1836a
            boolean r8 = androidx.compose.p011ui.unit.Constraints.m13262isZeroimpl(r4)
            if (r8 == 0) goto L80
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L70
            r0.label = r3     // Catch: java.lang.Throwable -> L70
            kotlinx.coroutines.g r2 = new kotlinx.coroutines.g     // Catch: java.lang.Throwable -> L70
            h6.c r0 = p185v7.AbstractC6683l.m6374n(r0)     // Catch: java.lang.Throwable -> L70
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L70
            r2.m5584u()     // Catch: java.lang.Throwable -> L70
            r8.element = r2     // Catch: java.lang.Throwable -> L70
            java.util.ArrayList r0 = r7.f1837b     // Catch: java.lang.Throwable -> L70
            r0.add(r2)     // Catch: java.lang.Throwable -> L70
            java.lang.Object r0 = r2.m5583t()     // Catch: java.lang.Throwable -> L70
            if (r0 != r1) goto L63
            return r1
        L63:
            r0 = r8
        L64:
            java.util.ArrayList r8 = r7.f1837b
            T r0 = r0.element
            java.util.Collection r8 = kotlin.jvm.internal.AbstractC5835p.m5352a(r8)
            r8.remove(r0)
            goto L80
        L70:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L74:
            java.util.ArrayList r1 = r7.f1837b
            T r0 = r0.element
            java.util.Collection r1 = kotlin.jvm.internal.AbstractC5835p.m5352a(r1)
            r1.remove(r0)
            throw r8
        L80:
            long r0 = r7.f1836a
            int r8 = p110m.AbstractC6077e.f9679b
            t.f r8 = new t.f
            int r2 = androidx.compose.p011ui.unit.Constraints.m13258getMaxWidthimpl(r0)
            t.b r3 = p162t.C6572b.f10975a
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r4) goto L9a
            kotlin.collections.AbstractC5806u.m5263b(r2)
            t.a r5 = new t.a
            r5.<init>(r2)
            goto L9b
        L9a:
            r5 = r3
        L9b:
            int r0 = androidx.compose.p011ui.unit.Constraints.m13257getMaxHeightimpl(r0)
            if (r0 == r4) goto La9
            kotlin.collections.AbstractC5806u.m5263b(r0)
            t.a r3 = new t.a
            r3.<init>(r0)
        La9:
            r8.<init>(r5, r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.compose.ConstraintsSizeResolver.mo2180a(h6.c):java.lang.Object");
    }

    /* renamed from: b */
    public final void m2181b(long j7) {
        this.f1836a = j7;
        if (Constraints.m13262isZeroimpl(j7)) {
            return;
        }
        ArrayList arrayList = this.f1837b;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f1837b = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((InterfaceC5631c) obj).resumeWith(Result.m13956constructorimpl(C5443s.f8405a));
        }
    }

    @Override // androidx.compose.p011ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo7182measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j7) {
        m2181b(j7);
        Placeable placeableMo12033measureBRTryo0 = measurable.mo12033measureBRTryo0(j7);
        return MeasureScope.layout$default(measureScope, placeableMo12033measureBRTryo0.getWidth(), placeableMo12033measureBRTryo0.getHeight(), null, new C3254k(placeableMo12033measureBRTryo0, 0), 4, null);
    }
}
