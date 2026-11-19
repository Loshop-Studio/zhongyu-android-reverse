package p387w6;

import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import p008a7.AbstractC0077j;

/* renamed from: w6.d */
/* loaded from: classes5.dex */
public abstract class AbstractC11709d {
    /* renamed from: a */
    public static void m25886a(Fragment fragment, int i10) {
        m25887b(fragment, false, i10);
    }

    /* renamed from: b */
    public static void m25887b(Fragment fragment, boolean z10, int i10) {
        try {
            if (AbstractC0077j.m218f() && z10) {
                fragment.startActivityForResult(new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION"), i10);
                return;
            }
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", fragment.getActivity().getPackageName(), null));
            fragment.startActivityForResult(intent, i10);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: c */
    public static boolean m25888c(int[] iArr) {
        if (iArr.length <= 0) {
            return false;
        }
        for (int i10 : iArr) {
            if (i10 != 0) {
                return false;
            }
        }
        return true;
    }
}
