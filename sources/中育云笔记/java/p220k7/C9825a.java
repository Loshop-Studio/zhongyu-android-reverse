package p220k7;

import android.R;
import android.content.Context;
import android.view.ViewGroup;
import com.shuyu.gsyvideoplayer.R$id;
import com.shuyu.gsyvideoplayer.utils.CommonUtil;

/* renamed from: k7.a */
/* loaded from: classes5.dex */
public class C9825a extends AbstractC9826b {

    /* renamed from: t */
    public static final int f23069t = R$id.ad_small_id;

    /* renamed from: u */
    public static final int f23070u = R$id.ad_full_id;

    /* renamed from: v */
    public static String f23071v = "GSYVideoADManager";

    /* renamed from: w */
    public static C9825a f23072w;

    public C9825a() {
        m19917h();
    }

    /* renamed from: p */
    public static boolean m19905p(Context context) {
        if (((ViewGroup) CommonUtil.scanForActivity(context).findViewById(R.id.content)).findViewById(f23070u) == null) {
            return false;
        }
        CommonUtil.hideNavKey(context);
        if (m19906q().lastListener() != null) {
            m19906q().lastListener().onBackFullscreen();
        }
        return true;
    }

    /* renamed from: q */
    public static synchronized C9825a m19906q() {
        try {
            if (f23072w == null) {
                f23072w = new C9825a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f23072w;
    }

    /* renamed from: r */
    public static void m19907r() {
        if (m19906q().listener() != null) {
            m19906q().listener().onVideoPause();
        }
    }

    /* renamed from: s */
    public static void m19908s() {
        if (m19906q().listener() != null) {
            m19906q().listener().onVideoResume();
        }
    }

    /* renamed from: t */
    public static void m19909t() {
        if (m19906q().listener() != null) {
            m19906q().listener().onCompletion();
        }
        m19906q().releaseMediaPlayer();
    }
}
