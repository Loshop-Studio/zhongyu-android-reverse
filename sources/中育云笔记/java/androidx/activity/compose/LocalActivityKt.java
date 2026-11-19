package androidx.activity.compose;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.p014ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class LocalActivityKt {
    private static final ProvidableCompositionLocal<Activity> LocalActivity = CompositionLocalKt.compositionLocalWithComputedDefaultOf(new InterfaceC9540l() { // from class: androidx.activity.compose.LocalActivityKt$LocalActivity$1
        @Override // p181hd.InterfaceC9540l
        public final Activity invoke(CompositionLocalAccessorScope compositionLocalAccessorScope) {
            Context baseContext = (Context) compositionLocalAccessorScope.getCurrentValue(AndroidCompositionLocals_androidKt.getLocalContext());
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof Activity) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            return (Activity) baseContext;
        }
    });

    public static final ProvidableCompositionLocal<Activity> getLocalActivity() {
        return LocalActivity;
    }
}
