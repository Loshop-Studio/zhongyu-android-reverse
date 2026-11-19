package androidx.activity.result;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;
import p309qc.InterfaceC10773d;

/* loaded from: classes.dex */
public final class ActivityResultCallerLauncher<I, O> extends ActivityResultLauncher<C10786q> {
    private final ActivityResultContract<I, O> callerContract;
    private final I callerInput;
    private final ActivityResultContract<C10786q, O> contract;
    private final ActivityResultLauncher<I> launcher;
    private final InterfaceC10773d resultContract$delegate;

    public ActivityResultCallerLauncher(ActivityResultLauncher<I> launcher, ActivityResultContract<I, O> callerContract, I i10) {
        AbstractC9979u.m20294g(launcher, "launcher");
        AbstractC9979u.m20294g(callerContract, "callerContract");
        this.launcher = launcher;
        this.callerContract = callerContract;
        this.callerInput = i10;
        this.resultContract$delegate = AbstractC9923a.m20068a(new InterfaceC9529a(this) { // from class: androidx.activity.result.ActivityResultCallerLauncher$resultContract$2
            final /* synthetic */ ActivityResultCallerLauncher<I, O> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [androidx.activity.result.ActivityResultCallerLauncher$resultContract$2$1] */
            @Override // p181hd.InterfaceC9529a
            public final C02051 invoke() {
                final ActivityResultCallerLauncher<I, O> activityResultCallerLauncher = this.this$0;
                return new ActivityResultContract<C10786q, O>() { // from class: androidx.activity.result.ActivityResultCallerLauncher$resultContract$2.1
                    @Override // androidx.activity.result.contract.ActivityResultContract
                    public O parseResult(int i11, Intent intent) {
                        return (O) activityResultCallerLauncher.getCallerContract().parseResult(i11, intent);
                    }

                    @Override // androidx.activity.result.contract.ActivityResultContract
                    public Intent createIntent(Context context, C10786q input) {
                        AbstractC9979u.m20294g(context, "context");
                        AbstractC9979u.m20294g(input, "input");
                        return activityResultCallerLauncher.getCallerContract().createIntent(context, activityResultCallerLauncher.getCallerInput());
                    }
                };
            }
        });
        this.contract = getResultContract();
    }

    private final ActivityResultContract<C10786q, O> getResultContract() {
        return (ActivityResultContract) this.resultContract$delegate.getValue();
    }

    public final ActivityResultContract<I, O> getCallerContract() {
        return this.callerContract;
    }

    public final I getCallerInput() {
        return this.callerInput;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public ActivityResultContract<C10786q, ?> getContract() {
        return this.contract;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public void unregister() {
        this.launcher.unregister();
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public void launch(C10786q input, ActivityOptionsCompat activityOptionsCompat) {
        AbstractC9979u.m20294g(input, "input");
        this.launcher.launch(this.callerInput, activityOptionsCompat);
    }
}
