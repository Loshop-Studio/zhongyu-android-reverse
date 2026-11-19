package androidx.activity.result;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;
import kotlin.AbstractC9078a;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p300x7.InterfaceC10559a;

/* loaded from: classes.dex */
public final class ActivityResultCallerLauncher<I, O> extends ActivityResultLauncher<C8736p> {
    private final ActivityResultContract<I, O> callerContract;
    private final I callerInput;
    private final ActivityResultContract<C8736p, O> contract;
    private final ActivityResultLauncher<I> launcher;
    private final InterfaceC8724d resultContract$delegate;

    public ActivityResultCallerLauncher(ActivityResultLauncher<I> launcher, ActivityResultContract<I, O> callerContract, I i10) {
        AbstractC9133u.m16133g(launcher, "launcher");
        AbstractC9133u.m16133g(callerContract, "callerContract");
        this.launcher = launcher;
        this.callerContract = callerContract;
        this.callerInput = i10;
        this.resultContract$delegate = AbstractC9078a.m15924b(new InterfaceC10559a(this) { // from class: androidx.activity.result.ActivityResultCallerLauncher$resultContract$2
            final /* synthetic */ ActivityResultCallerLauncher<I, O> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [androidx.activity.result.ActivityResultCallerLauncher$resultContract$2$1] */
            @Override // p300x7.InterfaceC10559a
            public final C01411 invoke() {
                final ActivityResultCallerLauncher<I, O> activityResultCallerLauncher = this.this$0;
                return new ActivityResultContract<C8736p, O>() { // from class: androidx.activity.result.ActivityResultCallerLauncher$resultContract$2.1
                    @Override // androidx.activity.result.contract.ActivityResultContract
                    public O parseResult(int i11, Intent intent) {
                        return (O) activityResultCallerLauncher.getCallerContract().parseResult(i11, intent);
                    }

                    @Override // androidx.activity.result.contract.ActivityResultContract
                    public Intent createIntent(Context context, C8736p input) {
                        AbstractC9133u.m16133g(context, "context");
                        AbstractC9133u.m16133g(input, "input");
                        return activityResultCallerLauncher.getCallerContract().createIntent(context, activityResultCallerLauncher.getCallerInput());
                    }
                };
            }
        });
        this.contract = getResultContract();
    }

    private final ActivityResultContract<C8736p, O> getResultContract() {
        return (ActivityResultContract) this.resultContract$delegate.getValue();
    }

    public final ActivityResultContract<I, O> getCallerContract() {
        return this.callerContract;
    }

    public final I getCallerInput() {
        return this.callerInput;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public ActivityResultContract<C8736p, ?> getContract() {
        return this.contract;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public void unregister() {
        this.launcher.unregister();
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public void launch(C8736p input, ActivityOptionsCompat activityOptionsCompat) {
        AbstractC9133u.m16133g(input, "input");
        this.launcher.launch(this.callerInput, activityOptionsCompat);
    }
}
