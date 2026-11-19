package androidx.navigation.compose;

import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.navigation.NavBackStackEntry;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.navigation.compose.DialogHostKt$DialogHost$2$1", m13596f = "DialogHost.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
@SourceDebugExtension({"SMAP\nDialogHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt$DialogHost$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,137:1\n1863#2,2:138\n*S KotlinDebug\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt$DialogHost$2$1\n*L\n75#1:138,2\n*E\n"})
/* loaded from: classes3.dex */
public final class DialogHostKt$DialogHost$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DialogNavigator $dialogNavigator;
    final /* synthetic */ SnapshotStateList<NavBackStackEntry> $dialogsToDispose;
    final /* synthetic */ State<Set<NavBackStackEntry>> $transitionInProgress$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DialogHostKt$DialogHost$2$1(State<? extends Set<NavBackStackEntry>> state, DialogNavigator dialogNavigator, SnapshotStateList<NavBackStackEntry> snapshotStateList, Continuation<? super DialogHostKt$DialogHost$2$1> continuation) {
        super(2, continuation);
        this.$transitionInProgress$delegate = state;
        this.$dialogNavigator = dialogNavigator;
        this.$dialogsToDispose = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DialogHostKt$DialogHost$2$1(this.$transitionInProgress$delegate, this.$dialogNavigator, this.$dialogsToDispose, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Set<NavBackStackEntry> setDialogHost$lambda$1 = DialogHostKt.DialogHost$lambda$1(this.$transitionInProgress$delegate);
        DialogNavigator dialogNavigator = this.$dialogNavigator;
        SnapshotStateList<NavBackStackEntry> snapshotStateList = this.$dialogsToDispose;
        for (NavBackStackEntry navBackStackEntry : setDialogHost$lambda$1) {
            if (!dialogNavigator.getBackStack$navigation_compose_release().getValue().contains(navBackStackEntry) && !snapshotStateList.contains(navBackStackEntry)) {
                dialogNavigator.onTransitionComplete$navigation_compose_release(navBackStackEntry);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DialogHostKt$DialogHost$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
