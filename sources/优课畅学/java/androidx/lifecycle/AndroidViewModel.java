package androidx.lifecycle;

import android.app.Application;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public class AndroidViewModel extends ViewModel {
    private final Application application;

    public AndroidViewModel(Application application) {
        AbstractC9133u.m16133g(application, "application");
        this.application = application;
    }

    public <T extends Application> T getApplication() {
        T t10 = (T) this.application;
        AbstractC9133u.m16131e(t10, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t10;
    }
}
