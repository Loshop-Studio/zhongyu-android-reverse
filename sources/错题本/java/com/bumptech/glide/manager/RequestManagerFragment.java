package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C3408b;
import com.bumptech.glide.ComponentCallbacks2C3414h;
import java.util.HashSet;
import p127o0.C6255a;
import p127o0.C6262h;
import p129o2.C6268a;

@Deprecated
/* loaded from: classes2.dex */
public class RequestManagerFragment extends Fragment {

    /* renamed from: a */
    public final C6255a f2320a;

    /* renamed from: b */
    public final C6268a f2321b;

    /* renamed from: c */
    public final HashSet f2322c;

    /* renamed from: d */
    public ComponentCallbacks2C3414h f2323d;

    /* renamed from: e */
    public RequestManagerFragment f2324e;

    public RequestManagerFragment() {
        C6255a c6255a = new C6255a();
        this.f2321b = new C6268a(this, 24);
        this.f2322c = new HashSet();
        this.f2320a = c6255a;
    }

    /* renamed from: a */
    public final void m2417a(Activity activity) {
        RequestManagerFragment requestManagerFragment = this.f2324e;
        if (requestManagerFragment != null) {
            requestManagerFragment.f2322c.remove(this);
            this.f2324e = null;
        }
        C6262h c6262h = ComponentCallbacks2C3408b.m2360c(activity).f2204g;
        c6262h.getClass();
        RequestManagerFragment requestManagerFragmentM5864d = c6262h.m5864d(activity.getFragmentManager(), C6262h.m5861f(activity));
        this.f2324e = requestManagerFragmentM5864d;
        if (equals(requestManagerFragmentM5864d)) {
            return;
        }
        this.f2324e.f2322c.add(this);
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m2417a(activity);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f2320a.m5856a();
        RequestManagerFragment requestManagerFragment = this.f2324e;
        if (requestManagerFragment != null) {
            requestManagerFragment.f2322c.remove(this);
            this.f2324e = null;
        }
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        RequestManagerFragment requestManagerFragment = this.f2324e;
        if (requestManagerFragment != null) {
            requestManagerFragment.f2322c.remove(this);
            this.f2324e = null;
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f2320a.m5857b();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f2320a.m5858c();
    }

    @Override // android.app.Fragment
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = null;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }
}
