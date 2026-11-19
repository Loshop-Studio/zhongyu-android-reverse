package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;

/* loaded from: classes2.dex */
public class ViewModelProviders {

    @Deprecated
    public static class DefaultFactory extends ViewModelProvider.AndroidViewModelFactory {
        @Deprecated
        public DefaultFactory(@NonNull Application application) {
            super(application);
        }
    }

    @Deprecated
    public ViewModelProviders() {
    }

    private static Activity checkActivity(Fragment fragment) {
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Can't create ViewModelProvider for detached fragment");
    }

    private static Application checkApplication(Activity activity) {
        Application application = activity.getApplication();
        if (application != null) {
            return application;
        }
        throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
    }

    @NonNull
    @MainThread
    /* renamed from: of */
    public static ViewModelProvider m1801of(@NonNull Fragment fragment) {
        return m1802of(fragment, (ViewModelProvider.Factory) null);
    }

    @NonNull
    @MainThread
    /* renamed from: of */
    public static ViewModelProvider m1803of(@NonNull FragmentActivity fragmentActivity) {
        return m1804of(fragmentActivity, (ViewModelProvider.Factory) null);
    }

    @NonNull
    @MainThread
    /* renamed from: of */
    public static ViewModelProvider m1802of(@NonNull Fragment fragment, @Nullable ViewModelProvider.Factory factory) {
        Application applicationCheckApplication = checkApplication(checkActivity(fragment));
        if (factory == null) {
            factory = ViewModelProvider.AndroidViewModelFactory.getInstance(applicationCheckApplication);
        }
        return new ViewModelProvider(fragment.getViewModelStore(), factory);
    }

    @NonNull
    @MainThread
    /* renamed from: of */
    public static ViewModelProvider m1804of(@NonNull FragmentActivity fragmentActivity, @Nullable ViewModelProvider.Factory factory) {
        Application applicationCheckApplication = checkApplication(fragmentActivity);
        if (factory == null) {
            factory = ViewModelProvider.AndroidViewModelFactory.getInstance(applicationCheckApplication);
        }
        return new ViewModelProvider(fragmentActivity.getViewModelStore(), factory);
    }
}
