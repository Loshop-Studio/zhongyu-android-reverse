package com.zykj.evaluation;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.multidex.MultiDex;
import com.taobao.sophix.SophixApplication;
import com.taobao.sophix.SophixEntry;
import com.taobao.sophix.SophixManager;
import com.taobao.sophix.listener.PatchLoadStatusListener;
import com.zykj.evaluation.SophixStubApplication;
import kotlin.Metadata;

@StabilityInferred(parameters = 0)
@Keep
@Metadata(m13557d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\b\u001a\u00020\u0005H\u0002¨\u0006\n"}, m13558d2 = {"Lcom/zykj/evaluation/SophixStubApplication;", "Lcom/taobao/sophix/SophixApplication;", "<init>", "()V", "attachBaseContext", "", "base", "Landroid/content/Context;", "initSophix", "RealApplicationStub", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final class SophixStubApplication extends SophixApplication {
    public static final int $stable = 8;

    @StabilityInferred(parameters = 1)
    @SophixEntry(App.class)
    @Keep
    @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13558d2 = {"Lcom/zykj/evaluation/SophixStubApplication$RealApplicationStub;", "", "<init>", "()V", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
    public static final class RealApplicationStub {
        public static final int $stable = 0;
    }

    private final void initSophix() {
        SophixManager.getInstance().setContext(this).setAppVersion(getPackageManager().getPackageInfo(getPackageName(), 0).versionName).setSecretMetaData("333899825-1", "42783d554a54402d9f860b33b14255eb", "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCTnOfA7kTVEJt1COo8SkRSfqbKa3P4keRduGuku4nrI+JGvXUehjCmqdBpH1oRg7QjVEM0gfXu3lEujEh959p+bcnIGCfb7tMGrK5yWet6/4XvAw+DME6WvKNi93+BZdVq+lyvH03igDXAXsmW4gl/XNt5P29T2ledyjNS8FuvPO/1hpX17N7xBiz7Bf3/E1zTsmNOgiVY/ND5DKuH3RvQpIhagYS78atKWZwouNlCsB9J39aAFTH+yMu6zt9CgSVl+PTfKzjeWTx9561G2R0HOUINmVuJeOAHIVezWoN5AGkeI2YaFivBy3c5+2e2BJIkMSM9EFXcdwMg1aNXC8nLAgMBAAECggEAfTe6+NSmmz9tQEiBuwcdEgXSIyAnzpKj8ETDO4jDJC7agjuxIGWg26Bt5N7tnrHkm5udLuuX3jvFDgF+dR+7H0iuxQiIt27OoHjXurVApqQfz3L/M8BEymXXC9r71J63/fnHqd6aSSuNbVR7GX1BpUL2AtKm87DiZj3ib9bpT6rM5MjZ6126FUPycaW5TKQrBUkGYMxLZhs+ys9kCEGklPaiNkY/mRN8Y73nPRzDs3w1Vd7puP3QcwrbBn5yHsagNhfBvvtZ+b1qXrBhMFwKOkruk3E3baHl5eJrKtLBPw+uRU+tV2jiGxmgnrKK/JH1pmJHV9DSXff4tkWsoM9OsQKBgQDSZPT3APmCF1bKJuHumM6eP8sezPcCKZuIz+JOYVGee/PxWy6jhcZ0wGshE3onHLhfRm2qzgoMyRtgmx55A4MeaZL9NPUDbcQfUd3ICgr0ZKiM2VjIMaI6DhN5HyuUrv8vnBkpHnXc9nphBIZvomTb2eqWy3+/Ek1QBNxp/nOw7wKBgQCznCDKYRUeVwvhMiIvrXPC2oER5mLFTzuvHW57zUSsQqIib6bFU/T64eQwanYpZxIv5p5jUnMiQjcE6LzWuhD55U9XEr7DwqSfWYDNMBJq87cUkW1P2d9OuyeiFZQ18YmV4D7ZjP/G6lq7A3rpJImgWenycvILYUOAe5rBuFG85QKBgQCbFKVoCATh+jgT69MvXt010knzWxtbMbYegzUJlzxlOHKYXiCjkfC1kDum9sdcWxQfzjb55sOLpxUSAWTVyFv2p9Ub5NQRAfDFMT/rulNWz3dZ0r9ZWRR9/HAoIGysPM2Gl2YIZBZ2mAuexYoecTIsx5TeMAPqoB/yspKRYmh+awKBgC6wSyXQjrjQT9o+OfzCzfC89Ag/JzW7HvyqXen4tf1BZPwmoedxp6D/z112jzi7/lJNVKbk6+Df7YVtKol23KrZHQK5cLVah4iUr5KnCGKc79583zl+nTnOFMNhcKGFJAq9vBi5OlPu3571jKHGSbBRLytDDgA/TFi9yMDKtRSxAoGAeWM814Sdu+MApxfOGfCN+y35rDXtj0ZrIx6YOgU0ZbfDWCHUyEbHIZ7oTgN9+WhAXzhZjZrHHF05ZJztX/D0OKMFF2JjFg7MXKWGHFABYwnlVv4079NQO7y6H4JkBDUa/GcSwuh9Wt+W1/LkNijzP6Na2GKboWhZfL2LlMZsXlI=").setEnableDebug(false).setPatchLoadStatusStub(new PatchLoadStatusListener() { // from class: k5.k
            @Override // com.taobao.sophix.listener.PatchLoadStatusListener
            public final void onLoad(int i10, int i11, String str, int i12) {
                SophixStubApplication.initSophix$lambda$0(i10, i11, str, i12);
            }
        }).initialize();
        SophixManager.getInstance().queryAndLoadNewPatch();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSophix$lambda$0(int i10, int i11, String str, int i12) {
        if (i11 == 1) {
            Log.i("Sophix", "sophix load patch success!");
        } else {
            if (i11 != 12) {
                return;
            }
            Log.i("Sophix", "sophix preload patch success. restart app to make effect.");
        }
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
        initSophix();
    }
}
