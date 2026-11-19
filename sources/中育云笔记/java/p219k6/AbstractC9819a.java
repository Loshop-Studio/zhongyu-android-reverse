package p219k6;

import android.R;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.luck.picture.lib.R$id;
import p008a7.AbstractC0068a;

/* renamed from: k6.a */
/* loaded from: classes5.dex */
public abstract class AbstractC9819a {
    /* renamed from: a */
    public static void m19890a(FragmentActivity fragmentActivity, String str, Fragment fragment) {
        if (AbstractC0068a.m141b(fragmentActivity, str)) {
            fragmentActivity.getSupportFragmentManager().beginTransaction().add(R$id.fragment_container, fragment, str).addToBackStack(str).commitAllowingStateLoss();
        }
    }

    /* renamed from: b */
    public static void m19891b(FragmentManager fragmentManager, String str, Fragment fragment) {
        fragmentManager.beginTransaction().add(R.id.content, fragment, str).addToBackStack(str).commitAllowingStateLoss();
    }
}
