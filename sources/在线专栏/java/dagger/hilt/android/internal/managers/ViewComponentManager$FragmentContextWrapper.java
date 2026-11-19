package dagger.hilt.android.internal.managers;

import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC0496f;
import androidx.lifecycle.InterfaceC0501i;
import androidx.lifecycle.InterfaceC0504l;

/* loaded from: classes.dex */
public final class ViewComponentManager$FragmentContextWrapper extends ContextWrapper {

    /* renamed from: dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1 */
    class C24651 implements InterfaceC0501i {
        @Override // androidx.lifecycle.InterfaceC0501i
        /* renamed from: d */
        public void mo63d(InterfaceC0504l interfaceC0504l, AbstractC0496f.b bVar) {
            if (bVar == AbstractC0496f.b.ON_DESTROY) {
                ViewComponentManager$FragmentContextWrapper.m8223a(null, null);
                ViewComponentManager$FragmentContextWrapper.m8224b(null, null);
                ViewComponentManager$FragmentContextWrapper.m8225c(null, null);
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ Fragment m8223a(ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper, Fragment fragment) {
        throw null;
    }

    /* renamed from: b */
    static /* synthetic */ LayoutInflater m8224b(ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper, LayoutInflater layoutInflater) {
        throw null;
    }

    /* renamed from: c */
    static /* synthetic */ LayoutInflater m8225c(ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper, LayoutInflater layoutInflater) {
        throw null;
    }
}
