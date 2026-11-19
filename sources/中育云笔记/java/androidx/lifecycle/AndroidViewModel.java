package androidx.lifecycle;

import android.app.Application;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public class AndroidViewModel extends ViewModel {
    private final Application application;

    public AndroidViewModel(Application application) {
        AbstractC9979u.m20294g(application, "application");
        this.application = application;
    }

    public <T extends Application> T getApplication() {
        T t10 = (T) this.application;
        AbstractC9979u.m20292e(t10, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t10;
    }
}
