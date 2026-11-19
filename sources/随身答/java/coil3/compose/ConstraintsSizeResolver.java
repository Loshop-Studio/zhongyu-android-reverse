package coil3.compose;

import androidx.compose.p012ui.layout.LayoutModifier;
import androidx.compose.p012ui.layout.Measurable;
import androidx.compose.p012ui.layout.MeasureResult;
import androidx.compose.p012ui.layout.MeasureScope;
import androidx.compose.p012ui.layout.Placeable;
import androidx.compose.p012ui.unit.Constraints;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import coil3.compose.ConstraintsSizeResolver;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import p173m.AbstractC8937j;
import p307z.InterfaceC9977g;

@Stable
@Metadata(m13412d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u0010\u001a\u00020\r*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\"\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00170\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m13413d2 = {"Lcoil3/compose/ConstraintsSizeResolver;", "Lz/g;", "Landroidx/compose/ui/layout/LayoutModifier;", "<init>", "()V", "Lz/e;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "", "k", "(J)V", "J", "latestConstraints", "", "Lkotlin/coroutines/Continuation;", "b", "Ljava/util/List;", "continuations", "coil-compose-core_release"}, m13414k = 1, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nConstraintsSizeResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintsSizeResolver.kt\ncoil3/compose/ConstraintsSizeResolver\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n426#2,11:77\n1869#3,2:88\n*S KotlinDebug\n*F\n+ 1 ConstraintsSizeResolver.kt\ncoil3/compose/ConstraintsSizeResolver\n*L\n40#1:77,11\n71#1:88,2\n*E\n"})
/* loaded from: classes3.dex */
public final class ConstraintsSizeResolver implements InterfaceC9977g, LayoutModifier {

    /* renamed from: a, reason: from kotlin metadata */
    public long latestConstraints = AbstractC8937j.m14232g();

    /* renamed from: b, reason: from kotlin metadata */
    public List continuations = new ArrayList();

    /* renamed from: j */
    public static final Unit m2660j(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object, kotlinx.coroutines.CancellableContinuationImpl] */
    @Override // p307z.InterfaceC9977g
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo2661a(kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof coil3.compose.ConstraintsSizeResolver$size$1
            if (r0 == 0) goto L13
            r0 = r8
            coil3.compose.ConstraintsSizeResolver$size$1 r0 = (coil3.compose.ConstraintsSizeResolver$size$1) r0
            int r1 = r0.f2808d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2808d = r1
            goto L18
        L13:
            coil3.compose.ConstraintsSizeResolver$size$1 r0 = new coil3.compose.ConstraintsSizeResolver$size$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f2806b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f2808d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f2805a
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref.ObjectRef) r0
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L2d
            goto L77
        L2d:
            r8 = move-exception
            goto L83
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            kotlin.ResultKt.throwOnFailure(r8)
            long r4 = r7.latestConstraints
            boolean r8 = androidx.compose.p012ui.unit.Constraints.m23951isZeroimpl(r4)
            if (r8 == 0) goto L8f
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
            r0.f2805a = r8     // Catch: java.lang.Throwable -> L6e
            r0.f2808d = r3     // Catch: java.lang.Throwable -> L6e
            kotlinx.coroutines.CancellableContinuationImpl r2 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch: java.lang.Throwable -> L6e
            kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)     // Catch: java.lang.Throwable -> L6e
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L6e
            r2.initCancellability()     // Catch: java.lang.Throwable -> L6e
            r8.element = r2     // Catch: java.lang.Throwable -> L6e
            java.util.List r3 = m2659i(r7)     // Catch: java.lang.Throwable -> L6e
            r3.add(r2)     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r2 = r2.getResult()     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L6e
            if (r2 != r3) goto L73
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)     // Catch: java.lang.Throwable -> L6e
            goto L73
        L6e:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
            goto L83
        L73:
            if (r2 != r1) goto L76
            return r1
        L76:
            r0 = r8
        L77:
            java.util.List r8 = r7.continuations
            T r0 = r0.element
            java.util.Collection r8 = kotlin.jvm.internal.TypeIntrinsics.asMutableCollection(r8)
            r8.remove(r0)
            goto L8f
        L83:
            java.util.List r1 = r7.continuations
            T r0 = r0.element
            java.util.Collection r1 = kotlin.jvm.internal.TypeIntrinsics.asMutableCollection(r1)
            r1.remove(r0)
            throw r8
        L8f:
            long r0 = r7.latestConstraints
            z.e r8 = p173m.AbstractC8937j.m14241p(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.compose.ConstraintsSizeResolver.mo2661a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: k */
    public final void m2662k(long constraints) {
        this.latestConstraints = constraints;
        if (Constraints.m23951isZeroimpl(constraints)) {
            return;
        }
        List<Continuation> list = this.continuations;
        if (list.isEmpty()) {
            return;
        }
        this.continuations = new ArrayList();
        for (Continuation continuation : list) {
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m24758constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.p012ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo18034measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j9) {
        m2662k(j9);
        final Placeable placeableMo22757measureBRTryo0 = measurable.mo22757measureBRTryo0(j9);
        return MeasureScope.layout$default(measureScope, placeableMo22757measureBRTryo0.getWidth(), placeableMo22757measureBRTryo0.getHeight(), null, new Function1() { // from class: l.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConstraintsSizeResolver.m2660j(placeableMo22757measureBRTryo0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }
}
