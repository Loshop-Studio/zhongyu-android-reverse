package androidx.navigation.compose;

import android.view.BackEventCompat;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.flow.InterfaceC5910f;
import kotlinx.coroutines.flow.InterfaceC5912g;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\u0010\u0003\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m5110d2 = {"Lkotlinx/coroutines/flow/f;", "Landroidx/activity/BackEventCompat;", "Landroidx/navigation/compose/internal/BackEventCompat;", "backEvent", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/flow/f;)V"}, m5111k = 3, m5112mv = {2, 0, 0})
@DebugMetadata(m5302c = "androidx.navigation.compose.NavHostKt$NavHost$25$1", m5303f = "NavHost.kt", m5304i = {0}, m5305l = {523}, m5306m = "invokeSuspend", m5307n = {"currentBackStackEntry"}, m5308s = {"L$0"})
/* loaded from: classes2.dex */
public final class NavHostKt$NavHost$25$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ ComposeNavigator $composeNavigator;
    final /* synthetic */ State<List<NavBackStackEntry>> $currentBackStack$delegate;
    final /* synthetic */ MutableState<Boolean> $inPredictiveBack$delegate;
    final /* synthetic */ MutableFloatState $progress$delegate;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavHostKt$NavHost$25$1(ComposeNavigator composeNavigator, State<? extends List<NavBackStackEntry>> state, MutableFloatState mutableFloatState, MutableState<Boolean> mutableState, InterfaceC5631c<? super NavHostKt$NavHost$25$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$composeNavigator = composeNavigator;
        this.$currentBackStack$delegate = state;
        this.$progress$delegate = mutableFloatState;
        this.$inPredictiveBack$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        NavHostKt$NavHost$25$1 navHostKt$NavHost$25$1 = new NavHostKt$NavHost$25$1(this.$composeNavigator, this.$currentBackStack$delegate, this.$progress$delegate, this.$inPredictiveBack$delegate, interfaceC5631c);
        navHostKt$NavHost$25$1.L$0 = obj;
        return navHostKt$NavHost$25$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        NavBackStackEntry navBackStackEntry;
        NavBackStackEntry navBackStackEntry2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                InterfaceC5910f interfaceC5910f = (InterfaceC5910f) this.L$0;
                if (NavHostKt.NavHost$lambda$38(this.$currentBackStack$delegate).size() > 1) {
                    this.$progress$delegate.setFloatValue(0.0f);
                    navBackStackEntry = (NavBackStackEntry) AbstractC5805t.m5236p0(NavHostKt.NavHost$lambda$38(this.$currentBackStack$delegate));
                    ComposeNavigator composeNavigator = this.$composeNavigator;
                    AbstractC5830k.m5327d(navBackStackEntry);
                    composeNavigator.prepareForTransition(navBackStackEntry);
                    this.$composeNavigator.prepareForTransition((NavBackStackEntry) NavHostKt.NavHost$lambda$38(this.$currentBackStack$delegate).get(NavHostKt.NavHost$lambda$38(this.$currentBackStack$delegate).size() - 2));
                } else {
                    navBackStackEntry = null;
                }
                final State<List<NavBackStackEntry>> state = this.$currentBackStack$delegate;
                final MutableState<Boolean> mutableState = this.$inPredictiveBack$delegate;
                final MutableFloatState mutableFloatState = this.$progress$delegate;
                InterfaceC5912g interfaceC5912g = new InterfaceC5912g() { // from class: androidx.navigation.compose.NavHostKt$NavHost$25$1.1
                    @Override // kotlinx.coroutines.flow.InterfaceC5912g
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC5631c interfaceC5631c) {
                        return emit((BackEventCompat) obj2, (InterfaceC5631c<? super C5443s>) interfaceC5631c);
                    }

                    public final Object emit(BackEventCompat backEventCompat, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                        if (NavHostKt.NavHost$lambda$38(state).size() > 1) {
                            NavHostKt.NavHost$lambda$44(mutableState, true);
                            mutableFloatState.setFloatValue(backEventCompat.getProgress());
                        }
                        return C5443s.f8405a;
                    }
                };
                this.L$0 = navBackStackEntry;
                this.label = 1;
                if (interfaceC5910f.collect(interfaceC5912g, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                navBackStackEntry2 = navBackStackEntry;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                navBackStackEntry2 = (NavBackStackEntry) this.L$0;
                AbstractC5774b.m5119b(obj);
            }
            if (NavHostKt.NavHost$lambda$38(this.$currentBackStack$delegate).size() > 1) {
                NavHostKt.NavHost$lambda$44(this.$inPredictiveBack$delegate, false);
                ComposeNavigator composeNavigator2 = this.$composeNavigator;
                AbstractC5830k.m5327d(navBackStackEntry2);
                composeNavigator2.popBackStack(navBackStackEntry2, false);
            }
        } catch (CancellationException unused) {
            if (NavHostKt.NavHost$lambda$38(this.$currentBackStack$delegate).size() > 1) {
                NavHostKt.NavHost$lambda$44(this.$inPredictiveBack$delegate, false);
            }
        }
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC5910f interfaceC5910f, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((NavHostKt$NavHost$25$1) create(interfaceC5910f, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
