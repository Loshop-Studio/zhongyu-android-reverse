package p387w6;

import android.content.Context;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.luck.picture.lib.basic.PictureCommonFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p008a7.AbstractC0068a;

/* renamed from: w6.a */
/* loaded from: classes5.dex */
public class C11706a {

    /* renamed from: a */
    public static C11706a f27815a;

    /* renamed from: a */
    public static boolean m25877a(Context context, String[] strArr) {
        if (strArr == null) {
            return true;
        }
        for (String str : strArr) {
            if (ContextCompat.checkSelfPermission(context.getApplicationContext(), str) != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static C11706a m25878b() {
        if (f27815a == null) {
            synchronized (C11706a.class) {
                try {
                    if (f27815a == null) {
                        f27815a = new C11706a();
                    }
                } finally {
                }
            }
        }
        return f27815a;
    }

    /* renamed from: c */
    public static boolean m25879c(Context context) {
        return m25877a(context, new String[]{"android.permission.CAMERA"});
    }

    /* renamed from: d */
    public static boolean m25880d(Context context) {
        return m25877a(context, new String[]{"android.permission.READ_EXTERNAL_STORAGE"});
    }

    /* renamed from: e */
    public static boolean m25881e(Context context, String[] strArr) {
        return m25877a(context, strArr);
    }

    /* renamed from: f */
    public static boolean m25882f(Context context) {
        return m25877a(context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"});
    }

    /* renamed from: g */
    public void m25883g(int[] iArr, InterfaceC11708c interfaceC11708c) {
        if (AbstractC11709d.m25888c(iArr)) {
            interfaceC11708c.onGranted();
        } else {
            interfaceC11708c.onDenied();
        }
    }

    /* renamed from: h */
    public final void m25884h(Fragment fragment, List list, int i10, InterfaceC11708c interfaceC11708c) {
        if (!AbstractC0068a.m142c(fragment.getActivity()) && (fragment instanceof PictureCommonFragment)) {
            FragmentActivity activity = fragment.getActivity();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                for (String str : (String[]) it.next()) {
                    if (ContextCompat.checkSelfPermission(activity, str) != 0) {
                        arrayList.add(str);
                    }
                }
            }
            if (arrayList.size() <= 0) {
                if (interfaceC11708c != null) {
                    interfaceC11708c.onGranted();
                }
            } else {
                ((PictureCommonFragment) fragment).m9262K0(interfaceC11708c);
                String[] strArr = new String[arrayList.size()];
                arrayList.toArray(strArr);
                fragment.requestPermissions(strArr, i10);
                ActivityCompat.requestPermissions(activity, strArr, i10);
            }
        }
    }

    /* renamed from: i */
    public void m25885i(Fragment fragment, String[] strArr, InterfaceC11708c interfaceC11708c) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(strArr);
        m25884h(fragment, arrayList, 10086, interfaceC11708c);
    }
}
