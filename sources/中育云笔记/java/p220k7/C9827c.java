package p220k7;

import android.R;
import android.content.Context;
import android.view.ViewGroup;
import com.shuyu.gsyvideoplayer.R$id;
import com.shuyu.gsyvideoplayer.utils.CommonUtil;

/* renamed from: k7.c */
/* loaded from: classes5.dex */
public class C9827c extends AbstractC9826b {

    /* renamed from: t */
    public static final int f23106t = R$id.small_id;

    /* renamed from: u */
    public static final int f23107u = R$id.full_id;

    /* renamed from: v */
    public static String f23108v = "GSYVideoManager";

    /* renamed from: w */
    public static C9827c f23109w;

    public C9827c() {
        m19917h();
    }

    /* renamed from: p */
    public static boolean m19925p(Context context) {
        if (((ViewGroup) CommonUtil.scanForActivity(context).findViewById(R.id.content)).findViewById(f23107u) == null) {
            return false;
        }
        CommonUtil.hideNavKey(context);
        if (m19926q().lastListener() != null) {
            m19926q().lastListener().onBackFullscreen();
        }
        return true;
    }

    /* renamed from: q */
    public static synchronized C9827c m19926q() {
        try {
            if (f23109w == null) {
                f23109w = new C9827c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f23109w;
    }

    /* renamed from: r */
    public static void m19927r() {
        if (m19926q().listener() != null) {
            m19926q().listener().onCompletion();
        }
        m19926q().releaseMediaPlayer();
    }
}
