package androidx.lifecycle;

import android.app.Application;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7879d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u0002H\u0007\"\b\b\u0000\u0010\u0007*\u00020\u0003H\u0016¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7880d2 = {"Landroidx/lifecycle/AndroidViewModel;", "Landroidx/lifecycle/ViewModel;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "getApplication", ExifInterface.GPS_DIRECTION_TRUE, "()Landroid/app/Application;", "lifecycle-viewmodel_release"}, m7881k = 1, m7882mv = {2, 0, 0}, m7884xi = 48)
/* loaded from: classes2.dex */
public class AndroidViewModel extends ViewModel {
    private final Application application;

    public AndroidViewModel(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.application = application;
    }

    public <T extends Application> T getApplication() {
        T t6 = (T) this.application;
        Intrinsics.checkNotNull(t6, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t6;
    }
}
