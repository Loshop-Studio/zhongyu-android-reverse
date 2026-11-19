package com.tencent.smtt.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import com.tencent.smtt.sdk.WebView;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.smtt.utils.e */
/* loaded from: classes4.dex */
public class C6848e {

    /* renamed from: b */
    private static DexClassLoader f6967b;

    /* renamed from: c */
    private static Looper f6968c;

    /* renamed from: d */
    private static C6848e f6969d;

    /* renamed from: a */
    public String f6970a;

    /* renamed from: com.tencent.smtt.utils.e$a */
    public interface a {
        /* renamed from: a */
        void mo6291a();

        /* renamed from: a */
        void mo6292a(int i10);

        /* renamed from: a */
        void mo6293a(Throwable th);
    }

    private C6848e(Context context) {
        this.f6970a = "";
        this.f6970a = context.getDir("debugtbs", 0).getAbsolutePath() + File.separator + "plugin";
    }

    /* renamed from: a */
    public static C6848e m6287a(Context context) {
        if (f6969d == null) {
            f6969d = new C6848e(context);
        }
        return f6969d;
    }

    /* renamed from: a */
    public void m6289a(String str, WebView webView, Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        TextView textView = new TextView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        textView.setText("加载中，请稍后...");
        relativeLayout.addView(textView, layoutParams);
        webView.addView(relativeLayout, new FrameLayout.LayoutParams(-1, -1));
        String str2 = this.f6970a + File.separator + "DebugPlugin.tbs";
        C6854k.m6317b(new File(str2));
        m6288a(str2, new C6849f(this, webView, context, relativeLayout, str, textView));
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void m6290a(String str, WebView webView, Context context, Looper looper) {
        TbsLog.m6248i("debugtbs", "showPluginView -- url: " + str + "; webview: " + webView + "; context: " + context);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6970a);
        String str2 = File.separator;
        sb.append(str2);
        sb.append("DebugPlugin.tbs");
        String string = sb.toString();
        String str3 = this.f6970a + str2 + "DebugPlugin.apk";
        File file = new File(string);
        File file2 = new File(str3);
        f6968c = looper;
        if (file.exists()) {
            file2.delete();
            file.renameTo(file2);
        }
        if (!file2.exists()) {
            TbsLog.m6248i("debugtbs", "showPluginView - going to download plugin...");
            m6289a(str, webView, context);
            return;
        }
        try {
            String strM6268a = C6845b.m6268a(context, new File(str3));
            if (!"308203773082025fa003020102020448bb959d300d06092a864886f70d01010b0500306b310b300906035504061302636e31123010060355040813094775616e67646f6e673111300f060355040713085368656e7a68656e3110300e060355040a130754656e63656e74310c300a060355040b13034d4947311530130603550403130c4d696e676875204875616e673020170d3136303532313039353730335a180f32303731303232323039353730335a306b310b300906035504061302636e31123010060355040813094775616e67646f6e673111300f060355040713085368656e7a68656e3110300e060355040a130754656e63656e74310c300a060355040b13034d4947311530130603550403130c4d696e676875204875616e6730820122300d06092a864886f70d01010105000382010f003082010a02820101008c58deabefe95f699c6322f9a75620873b490d26520c7267eb8382a91da625a5876b2bd617116eb40b371c4f88c988c1ba73052caaa9964873c94b7755c3429fca47a6677229fb2e72908d3b17df82f1ebe70447b94c1e5b0a763dad8948312180322657325306f01e423e0409ef3a59e5c0e0b9c765a2322699a2dec2d4dbe58ec15f41752516192169d9596169f5bf08eaf8aab9893240ad679e82fc92b97d2ae98b28021dc5a752f0a69437ea603c541e6753cea52dbc8e8043fe21fd5da46066c92e0714905dfad3116f35aca52b13871c57481459aa4ca255a6482ba972bd17af90d0d2c21a57ef65376bbd4ce7078e6047060640669f3867fdc69fbb750203010001a321301f301d0603551d0e0416041450fb9b6362e829797b1b29ca55e6d5e082e93ff3300d06092a864886f70d01010b050003820101004952ffbfba7c00ee9b84f44b05ec62bc2400dc769fb2e83f80395e3fbb54e44d56e16527413d144f42bf8f21fa443bc42a7a732de9d5124df906c6d728e75ca94eefc918080876bd3ce6cb5f7f2d9cc8d8e708033afc1295c7f347fb2d2098be2e4a79220e9552171d5b5f8f59cff4c6478cc41dce24cbe942305757488d37659d3265838ee54ebe44fccbd1bec93d809f950034f5ef292f20179554d22f5856c03b4d44997fcb9b3579e16a49218fce0e2e6bfe1fd4aa0ab39f548344c244c171c203baff1a730883aaf4506b6865a45c3c9aba40c6326d4152b6ce09cc058864bec1d6422e83dad9496b83fb252b4bfb30d3a6badf996099793e11f9af618d".equals(strM6268a)) {
                TbsLog.m6246e("debugtbs", "verifyPlugin apk: " + str3 + " signature failed - sig: " + strM6268a);
                Toast.makeText(context, "插件校验失败，请重试", 0).show();
                file.delete();
                file2.delete();
                return;
            }
            String str4 = this.f6970a + str2 + "opt";
            File file3 = new File(str4);
            if (!file3.exists()) {
                file3.mkdirs();
            }
            if (f6967b == null) {
                f6967b = new DexClassLoader(str3, str4, null, context.getClassLoader());
            }
            HashMap map = new HashMap();
            map.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_URL, str);
            map.put("tbs_version", "" + WebView.getTbsSDKVersion(context));
            map.put("tbs_core_version", "" + WebView.getTbsCoreVersion(context));
            if (f6968c != null) {
                map.put("looper", looper);
            }
            Object objNewInstance = f6967b.loadClass("com.tencent.tbs.debug.plugin.DebugView").getConstructor(Context.class, Map.class).newInstance(context, map);
            if (!(objNewInstance instanceof FrameLayout)) {
                TbsLog.m6246e("debugtbs", "get debugview failure: " + objNewInstance);
                return;
            }
            FrameLayout frameLayout = (FrameLayout) objNewInstance;
            webView.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
            TbsLog.m6248i("debugtbs", "show " + frameLayout + " successful in " + webView);
        } catch (Exception e10) {
            C6854k.m6317b(file2);
            e10.printStackTrace();
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static void m6288a(String str, a aVar) {
        new C6853j(str, aVar).start();
    }
}
