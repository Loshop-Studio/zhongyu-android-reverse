package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
public abstract class FragmentHostCallback<H> extends FragmentContainer {
    private final Activity activity;
    private final Context context;
    private final FragmentManager fragmentManager;
    private final Handler handler;
    private final int windowAnimations;

    public FragmentHostCallback(Activity activity, Context context, Handler handler, int i10) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(handler, "handler");
        this.activity = activity;
        this.context = context;
        this.handler = handler;
        this.windowAnimations = i10;
        this.fragmentManager = new FragmentManagerImpl();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final Activity getActivity() {
        return this.activity;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final Context getContext() {
        return this.context;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final FragmentManager getFragmentManager() {
        return this.fragmentManager;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final Handler getHandler() {
        return this.handler;
    }

    public void onDump(String prefix, FileDescriptor fileDescriptor, PrintWriter writer, String[] strArr) {
        AbstractC9979u.m20294g(prefix, "prefix");
        AbstractC9979u.m20294g(writer, "writer");
    }

    @Override // androidx.fragment.app.FragmentContainer
    public View onFindViewById(int i10) {
        return null;
    }

    public abstract H onGetHost();

    public LayoutInflater onGetLayoutInflater() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.context);
        AbstractC9979u.m20293f(layoutInflaterFrom, "from(context)");
        return layoutInflaterFrom;
    }

    public int onGetWindowAnimations() {
        return this.windowAnimations;
    }

    @Override // androidx.fragment.app.FragmentContainer
    public boolean onHasView() {
        return true;
    }

    public boolean onHasWindowAnimations() {
        return true;
    }

    @InterfaceC10770a
    public void onRequestPermissionsFromFragment(Fragment fragment, String[] permissions, int i10) {
        AbstractC9979u.m20294g(fragment, "fragment");
        AbstractC9979u.m20294g(permissions, "permissions");
    }

    public boolean onShouldSaveFragmentState(Fragment fragment) {
        AbstractC9979u.m20294g(fragment, "fragment");
        return true;
    }

    public boolean onShouldShowRequestPermissionRationale(String permission) {
        AbstractC9979u.m20294g(permission, "permission");
        return false;
    }

    public void onStartActivityFromFragment(Fragment fragment, Intent intent, int i10) {
        AbstractC9979u.m20294g(fragment, "fragment");
        AbstractC9979u.m20294g(intent, "intent");
        onStartActivityFromFragment(fragment, intent, i10, null);
    }

    @InterfaceC10770a
    public void onStartIntentSenderFromFragment(Fragment fragment, IntentSender intent, int i10, Intent intent2, int i11, int i12, int i13, Bundle bundle) {
        AbstractC9979u.m20294g(fragment, "fragment");
        AbstractC9979u.m20294g(intent, "intent");
        if (i10 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        Activity activity = this.activity;
        if (activity == null) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        ActivityCompat.startIntentSenderForResult(activity, intent, i10, intent2, i11, i12, i13, bundle);
    }

    public void onSupportInvalidateOptionsMenu() {
    }

    public void onStartActivityFromFragment(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        AbstractC9979u.m20294g(fragment, "fragment");
        AbstractC9979u.m20294g(intent, "intent");
        if (i10 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        ContextCompat.startActivity(this.context, intent, bundle);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentHostCallback(Context context, Handler handler, int i10) {
        this(context instanceof Activity ? (Activity) context : null, context, handler, i10);
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(handler, "handler");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentHostCallback(FragmentActivity activity) {
        this(activity, activity, new Handler(), 0);
        AbstractC9979u.m20294g(activity, "activity");
    }
}
