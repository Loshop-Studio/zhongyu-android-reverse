package p150s1;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import p147rx.subjects.PublishSubject;

/* renamed from: s1.c */
/* loaded from: classes.dex */
public class FragmentC3378c extends Fragment {

    /* renamed from: a */
    private Map<String, PublishSubject<C3376a>> f11861a = new HashMap();

    /* renamed from: b */
    private boolean f11862b;

    /* renamed from: a */
    public boolean m10283a(String str) {
        return this.f11861a.containsKey(str);
    }

    /* renamed from: b */
    public PublishSubject<C3376a> m10284b(String str) {
        return this.f11861a.get(str);
    }

    @TargetApi(23)
    /* renamed from: c */
    boolean m10285c(String str) {
        return getActivity().checkSelfPermission(str) == 0;
    }

    @TargetApi(23)
    /* renamed from: d */
    boolean m10286d(String str) {
        return getActivity().getPackageManager().isPermissionRevokedByPolicy(str, getActivity().getPackageName());
    }

    /* renamed from: e */
    void m10287e(String str) {
        if (this.f11862b) {
            Log.d("RxPermissions", str);
        }
    }

    /* renamed from: f */
    void m10288f(String[] strArr, int[] iArr, boolean[] zArr) {
        int length = strArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            m10287e("onRequestPermissionsResult  " + strArr[i4]);
            PublishSubject<C3376a> publishSubject = this.f11861a.get(strArr[i4]);
            if (publishSubject == null) {
                Log.e("RxPermissions", "RxPermissions.onRequestPermissionsResult invoked but didn't find the corresponding permission request.");
                return;
            }
            this.f11861a.remove(strArr[i4]);
            publishSubject.onNext(new C3376a(strArr[i4], iArr[i4] == 0, zArr[i4]));
            publishSubject.onCompleted();
        }
    }

    @TargetApi(23)
    /* renamed from: g */
    void m10289g(String[] strArr) {
        requestPermissions(strArr, 42);
    }

    /* renamed from: h */
    public PublishSubject<C3376a> m10290h(String str, PublishSubject<C3376a> publishSubject) {
        return this.f11861a.put(str, publishSubject);
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @Override // android.app.Fragment
    @TargetApi(23)
    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i4, strArr, iArr);
        if (i4 != 42) {
            return;
        }
        boolean[] zArr = new boolean[strArr.length];
        for (int i5 = 0; i5 < strArr.length; i5++) {
            zArr[i5] = shouldShowRequestPermissionRationale(strArr[i5]);
        }
        m10288f(strArr, iArr, zArr);
    }
}
