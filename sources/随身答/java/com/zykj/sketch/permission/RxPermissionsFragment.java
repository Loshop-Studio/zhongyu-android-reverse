package com.zykj.sketch.permission;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import io.reactivex.subjects.PublishSubject;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class RxPermissionsFragment extends Fragment {
    private static final int PERMISSIONS_REQUEST_CODE = 42;
    private boolean mLogging;
    private Map<String, PublishSubject<Permission>> mSubjects = new HashMap();

    public boolean containsByPermission(@NonNull String str) {
        return this.mSubjects.containsKey(str);
    }

    public PublishSubject<Permission> getSubjectByPermission(@NonNull String str) {
        return this.mSubjects.get(str);
    }

    @TargetApi(23)
    public boolean isGranted(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity.checkSelfPermission(str) == 0;
        }
        throw new IllegalStateException("This fragment must be attached to an activity.");
    }

    @TargetApi(23)
    public boolean isRevoked(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity.getPackageManager().isPermissionRevokedByPolicy(str, getActivity().getPackageName());
        }
        throw new IllegalStateException("This fragment must be attached to an activity.");
    }

    public void log(String str) {
        if (this.mLogging) {
            String str2 = RxPermissions.TAG;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.Fragment
    @TargetApi(23)
    public void onRequestPermissionsResult(int i9, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i9, strArr, iArr);
        if (i9 != 42) {
            return;
        }
        boolean[] zArr = new boolean[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            zArr[i10] = shouldShowRequestPermissionRationale(strArr[i10]);
        }
        onRequestPermissionsResult(strArr, iArr, zArr);
    }

    @TargetApi(23)
    public void requestPermissions(@NonNull String[] strArr) {
        requestPermissions(strArr, 42);
    }

    public void setLogging(boolean z9) {
        this.mLogging = z9;
    }

    public void setSubjectForPermission(@NonNull String str, @NonNull PublishSubject<Permission> publishSubject) {
        this.mSubjects.put(str, publishSubject);
    }

    public void onRequestPermissionsResult(String[] strArr, int[] iArr, boolean[] zArr) {
        int length = strArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            log("onRequestPermissionsResult  " + strArr[i9]);
            PublishSubject<Permission> publishSubject = this.mSubjects.get(strArr[i9]);
            if (publishSubject == null) {
                Log.e(RxPermissions.TAG, "RxPermissions.onRequestPermissionsResult invoked but didn't find the corresponding permission request.");
                return;
            }
            this.mSubjects.remove(strArr[i9]);
            publishSubject.onNext(new Permission(strArr[i9], iArr[i9] == 0, zArr[i9]));
            publishSubject.onComplete();
        }
    }
}
