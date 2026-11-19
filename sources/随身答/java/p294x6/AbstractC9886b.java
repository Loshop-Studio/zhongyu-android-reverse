package p294x6;

import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function0;

/* renamed from: x6.b */
/* loaded from: classes5.dex */
public abstract class AbstractC9886b {

    /* renamed from: a */
    public static final ProvidableCompositionLocal f17682a = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: x6.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC9886b.m16929c();
        }
    });

    /* renamed from: b */
    public static final Function0 m16928b(State state) {
        return (Function0) state.getValue();
    }

    /* renamed from: c */
    public static final OnBackPressedDispatcher m16929c() {
        throw new IllegalStateException("No Back Dispatcher provided");
    }
}
