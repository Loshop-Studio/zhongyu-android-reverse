package dagger.hilt.android.internal.managers;

import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* loaded from: classes2.dex */
public abstract class ViewComponentManager$FragmentContextWrapper extends ContextWrapper {

    /* renamed from: dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1 */
    public class C37141 implements LifecycleEventObserver {
        public C37141(ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper) {
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                ViewComponentManager$FragmentContextWrapper.m4706a(null, null);
                ViewComponentManager$FragmentContextWrapper.m4707b(null, null);
                ViewComponentManager$FragmentContextWrapper.m4708c(null, null);
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Fragment m4706a(ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper, Fragment fragment) {
        throw null;
    }

    /* renamed from: b */
    public static /* synthetic */ LayoutInflater m4707b(ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper, LayoutInflater layoutInflater) {
        throw null;
    }

    /* renamed from: c */
    public static /* synthetic */ LayoutInflater m4708c(ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper, LayoutInflater layoutInflater) {
        throw null;
    }
}
