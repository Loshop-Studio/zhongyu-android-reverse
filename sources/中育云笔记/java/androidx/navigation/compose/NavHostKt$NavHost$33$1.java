package androidx.navigation.compose;

import androidx.collection.MutableObjectFloatMap;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.navigation.compose.NavHostKt$NavHost$33$1", m26211f = "NavHost.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NavHostKt$NavHost$33$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ NavBackStackEntry $backStackEntry;
    final /* synthetic */ ComposeNavigator $composeNavigator;
    final /* synthetic */ NavHostController $navController;
    final /* synthetic */ Transition<NavBackStackEntry> $transition;
    final /* synthetic */ State<List<NavBackStackEntry>> $visibleEntries$delegate;
    final /* synthetic */ MutableObjectFloatMap<String> $zIndices;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavHostKt$NavHost$33$1(Transition<NavBackStackEntry> transition, NavHostController navHostController, NavBackStackEntry navBackStackEntry, MutableObjectFloatMap<String> mutableObjectFloatMap, State<? extends List<NavBackStackEntry>> state, ComposeNavigator composeNavigator, InterfaceC11588c<? super NavHostKt$NavHost$33$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$transition = transition;
        this.$navController = navHostController;
        this.$backStackEntry = navBackStackEntry;
        this.$zIndices = mutableObjectFloatMap;
        this.$visibleEntries$delegate = state;
        this.$composeNavigator = composeNavigator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new NavHostKt$NavHost$33$1(this.$transition, this.$navController, this.$backStackEntry, this.$zIndices, this.$visibleEntries$delegate, this.$composeNavigator, interfaceC11588c);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            p393wc.AbstractC11725a.m25952f()
            int r0 = r14.label
            if (r0 != 0) goto Lb0
            kotlin.AbstractC9924b.m20071b(r15)
            androidx.compose.animation.core.Transition<androidx.navigation.NavBackStackEntry> r15 = r14.$transition
            java.lang.Object r15 = r15.getCurrentState()
            androidx.compose.animation.core.Transition<androidx.navigation.NavBackStackEntry> r0 = r14.$transition
            java.lang.Object r0 = r0.getTargetState()
            boolean r15 = kotlin.jvm.internal.AbstractC9979u.m20289b(r15, r0)
            if (r15 == 0) goto Lad
            androidx.navigation.NavHostController r15 = r14.$navController
            androidx.navigation.NavBackStackEntry r15 = r15.getCurrentBackStackEntry()
            if (r15 == 0) goto L32
            androidx.compose.animation.core.Transition<androidx.navigation.NavBackStackEntry> r15 = r14.$transition
            java.lang.Object r15 = r15.getTargetState()
            androidx.navigation.NavBackStackEntry r0 = r14.$backStackEntry
            boolean r15 = kotlin.jvm.internal.AbstractC9979u.m20289b(r15, r0)
            if (r15 == 0) goto Lad
        L32:
            androidx.compose.runtime.State<java.util.List<androidx.navigation.NavBackStackEntry>> r15 = r14.$visibleEntries$delegate
            java.util.List r15 = androidx.navigation.compose.NavHostKt.access$NavHost$lambda$53(r15)
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            androidx.navigation.compose.ComposeNavigator r0 = r14.$composeNavigator
            java.util.Iterator r15 = r15.iterator()
        L40:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L50
            java.lang.Object r1 = r15.next()
            androidx.navigation.NavBackStackEntry r1 = (androidx.navigation.NavBackStackEntry) r1
            r0.onTransitionComplete(r1)
            goto L40
        L50:
            androidx.collection.MutableObjectFloatMap<java.lang.String> r15 = r14.$zIndices
            androidx.compose.animation.core.Transition<androidx.navigation.NavBackStackEntry> r0 = r14.$transition
            long[] r1 = r15.metadata
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto Lad
            r3 = 0
            r4 = r3
        L5d:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto La8
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L77:
            if (r9 >= r7) goto La6
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto La2
            int r10 = r4 << 3
            int r10 = r10 + r9
            java.lang.Object[] r11 = r15.keys
            r11 = r11[r10]
            float[] r12 = r15.values
            r12 = r12[r10]
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r0.getTargetState()
            androidx.navigation.NavBackStackEntry r12 = (androidx.navigation.NavBackStackEntry) r12
            java.lang.String r12 = r12.getId()
            boolean r11 = kotlin.jvm.internal.AbstractC9979u.m20289b(r11, r12)
            if (r11 != 0) goto La2
            r15.removeValueAt(r10)
        La2:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L77
        La6:
            if (r7 != r8) goto Lad
        La8:
            if (r4 == r2) goto Lad
            int r4 = r4 + 1
            goto L5d
        Lad:
            qc.q r15 = p309qc.C10786q.f26013a
            return r15
        Lb0:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt$NavHost$33$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((NavHostKt$NavHost$33$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
