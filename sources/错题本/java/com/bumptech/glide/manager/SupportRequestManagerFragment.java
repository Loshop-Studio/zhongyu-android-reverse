package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.ComponentCallbacks2C3408b;
import com.bumptech.glide.ComponentCallbacks2C3414h;
import java.util.HashSet;
import p127o0.C6255a;
import p127o0.C6262h;
import p129o2.C6268a;

/* loaded from: classes2.dex */
public class SupportRequestManagerFragment extends Fragment {

    /* renamed from: a */
    public final C6255a f2325a;

    /* renamed from: b */
    public final C6268a f2326b;

    /* renamed from: c */
    public final HashSet f2327c;

    /* renamed from: d */
    public SupportRequestManagerFragment f2328d;

    /* renamed from: e */
    public ComponentCallbacks2C3414h f2329e;

    /* renamed from: f */
    public Fragment f2330f;

    public SupportRequestManagerFragment() {
        C6255a c6255a = new C6255a();
        this.f2326b = new C6268a(this, 25);
        this.f2327c = new HashSet();
        this.f2325a = c6255a;
    }

    /* renamed from: e */
    public final void m2418e(Context context, FragmentManager fragmentManager) {
        SupportRequestManagerFragment supportRequestManagerFragment = this.f2328d;
        if (supportRequestManagerFragment != null) {
            supportRequestManagerFragment.f2327c.remove(this);
            this.f2328d = null;
        }
        C6262h c6262h = ComponentCallbacks2C3408b.m2360c(context).f2204g;
        c6262h.getClass();
        SupportRequestManagerFragment supportRequestManagerFragmentM5865e = c6262h.m5865e(fragmentManager, null, C6262h.m5861f(context));
        this.f2328d = supportRequestManagerFragmentM5865e;
        if (equals(supportRequestManagerFragmentM5865e)) {
            return;
        }
        this.f2328d.f2327c.add(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Fragment parentFragment = this;
        while (parentFragment.getParentFragment() != null) {
            parentFragment = parentFragment.getParentFragment();
        }
        FragmentManager fragmentManager = parentFragment.getFragmentManager();
        if (fragmentManager == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
            }
        } else {
            try {
                m2418e(getContext(), fragmentManager);
            } catch (IllegalStateException e) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f2325a.m5856a();
        SupportRequestManagerFragment supportRequestManagerFragment = this.f2328d;
        if (supportRequestManagerFragment != null) {
            supportRequestManagerFragment.f2327c.remove(this);
            this.f2328d = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f2330f = null;
        SupportRequestManagerFragment supportRequestManagerFragment = this.f2328d;
        if (supportRequestManagerFragment != null) {
            supportRequestManagerFragment.f2327c.remove(this);
            this.f2328d = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f2325a.m5857b();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f2325a.m5858c();
    }

    @Override // androidx.fragment.app.Fragment
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f2330f;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }
}
