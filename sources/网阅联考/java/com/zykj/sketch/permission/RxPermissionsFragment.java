package com.zykj.sketch.permission;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import io.reactivex.subjects.PublishSubject;
import java.util.HashMap;
import java.util.Map;
import p013b2.AbstractC2717b;
import p013b2.C2716a;

/* loaded from: classes2.dex */
public class RxPermissionsFragment extends Fragment {

    /* renamed from: a */
    public Map f4290a = new HashMap();

    /* renamed from: b */
    public boolean f4291b;

    /* renamed from: a */
    public void m4663a(String str) {
        if (this.f4291b) {
            String str2 = AbstractC2717b.f464a;
        }
    }

    /* renamed from: b */
    public void m4664b(String[] strArr, int[] iArr, boolean[] zArr) {
        int length = strArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            m4663a("onRequestPermissionsResult  " + strArr[i4]);
            PublishSubject publishSubject = (PublishSubject) this.f4290a.get(strArr[i4]);
            if (publishSubject == null) {
                Log.e(AbstractC2717b.f464a, "RxPermissions.onRequestPermissionsResult invoked but didn't find the corresponding permission request.");
                return;
            }
            this.f4290a.remove(strArr[i4]);
            publishSubject.onNext(new C2716a(strArr[i4], iArr[i4] == 0, zArr[i4]));
            publishSubject.onComplete();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i4, strArr, iArr);
        if (i4 != 42) {
            return;
        }
        boolean[] zArr = new boolean[strArr.length];
        for (int i5 = 0; i5 < strArr.length; i5++) {
            zArr[i5] = shouldShowRequestPermissionRationale(strArr[i5]);
        }
        m4664b(strArr, iArr, zArr);
    }
}
