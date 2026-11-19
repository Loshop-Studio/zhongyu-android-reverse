package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(m7879d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a5\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0007¨\u0006\n"}, m7880d2 = {"Transition", "Landroidx/constraintlayout/compose/Transition;", TypedValues.TransitionType.S_FROM, "", TypedValues.TransitionType.S_TO, "content", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/TransitionScope;", "", "Lkotlin/ExtensionFunctionType;", "constraintlayout-compose_release"}, m7881k = 2, m7882mv = {1, 8, 0}, m7884xi = 48)
/* loaded from: classes2.dex */
public final class TransitionScopeKt {
    @ExperimentalMotionApi
    public static final Transition Transition(String str, String str2, Function1<? super TransitionScope, Unit> function1) {
        TransitionScope transitionScope = new TransitionScope(str, str2);
        function1.invoke(transitionScope);
        return new TransitionImpl(transitionScope.getObject$constraintlayout_compose_release());
    }

    public static /* synthetic */ Transition Transition$default(String str, String str2, Function1 function1, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = "start";
        }
        if ((i6 & 2) != 0) {
            str2 = "end";
        }
        return Transition(str, str2, function1);
    }
}
