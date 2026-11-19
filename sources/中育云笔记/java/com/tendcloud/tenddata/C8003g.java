package com.tendcloud.tenddata;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.camera.video.AudioStats;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tendcloud.tenddata.g */
/* loaded from: classes5.dex */
public class C8003g {

    /* renamed from: a */
    public static final String f15012a = "_td_from_codeless";

    /* renamed from: b */
    public static final String f15013b = "1";

    /* renamed from: c */
    b f15014c;

    /* renamed from: d */
    private WeakHashMap<Activity, String> f15015d = new WeakHashMap<>();

    /* renamed from: e */
    private final Handler f15016e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    private final Map<String, List<AbstractC8015t>> f15017f = new HashMap();

    /* renamed from: g */
    private final Set<a> f15018g = new HashSet();

    /* renamed from: com.tendcloud.tenddata.g$a */
    public static class a implements ViewTreeObserver.OnGlobalLayoutListener, Runnable {
        private boolean mAlive = true;
        private volatile boolean mDying = false;
        private final AbstractC8015t mEdit;
        private final Handler mHandler;
        private final WeakReference<View> mViewRoot;

        public a(View view, AbstractC8015t abstractC8015t, Handler handler) {
            this.mEdit = abstractC8015t;
            this.mViewRoot = new WeakReference<>(view);
            this.mHandler = handler;
        }

        private void cleanUp() {
            if (this.mAlive) {
                View view = this.mViewRoot.get();
                if (view != null) {
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeGlobalOnLayoutListener(this);
                    }
                }
                this.mEdit.m12089a();
            }
            this.mAlive = false;
        }

        public void kill() {
            try {
                this.mDying = true;
                this.mHandler.post(this);
            } catch (Throwable unused) {
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            run();
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tendcloud.tenddata.g$b */
    public class b {
        WeakReference<WebView> webview;

        public b(WeakReference<WebView> weakReference) {
            this.webview = weakReference;
        }

        private void addJsonKV(StringBuilder sb2, String str, String str2) {
            if (sb2 == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            sb2.append(JSONObject.quote(str));
            sb2.append(":");
            sb2.append(str2);
            sb2.append(",");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void applyHybridEvents(WebView webView) {
            try {
                String strM12053a = C8009m.m12048c().m12053a(webView.getUrl());
                String strM12052a = C8009m.m12048c().m12052a();
                if (TextUtils.isEmpty(strM12053a) && TextUtils.isEmpty(strM12052a)) {
                    return;
                }
                String strReplace = buildJson(strM12053a, strM12052a).replace("\\", "\\\\").replace("\"", "\\\"");
                C7896ca.dForInternal("hybridEvents: -> " + strReplace);
                webView.loadUrl("javascript:if(window.talkingdata&&window.talkingdata.setConfig){window.talkingdata.setConfig(\"" + strReplace + "\");}");
            } catch (Throwable th) {
                C7896ca.eForInternal(th);
            }
        }

        private String buildJson(String str, String str2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{");
            addJsonKV(sb2, "pageEvents", str);
            addJsonKV(sb2, "currentEvents", str2);
            sb2.delete(sb2.length() - 1, sb2.length());
            sb2.append("}");
            return sb2.toString();
        }

        @JavascriptInterface
        public void onFireHybridEventIDLabelParams(String str, String str2, String str3) {
            try {
                JSONObject jSONObject = !TextUtils.isEmpty(str3) ? new JSONObject(str3) : null;
                HashMap map = new HashMap(32);
                map.put(C8003g.f15012a, "1");
                if (C7912cq.m11604b(jSONObject) != null) {
                    map.putAll(C7912cq.m11604b(jSONObject));
                }
                TalkingDataSDK.onEvent(C7843ab.f14307g, str, AudioStats.AUDIO_AMPLITUDE_NONE, map);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }

        @JavascriptInterface
        public void onPageFinished() {
            final WebView webView = this.webview.get();
            if (webView == null) {
                return;
            }
            if (Thread.currentThread() == C8003g.this.f15016e.getLooper().getThread()) {
                applyHybridEvents(webView);
            } else {
                C8003g.this.f15016e.post(new Runnable() { // from class: com.tendcloud.tenddata.g.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.applyHybridEvents(webView);
                    }
                });
            }
        }
    }

    public void add(Activity activity) {
        try {
            Thread.currentThread();
            Looper.getMainLooper().getThread();
            m12026a(activity.getWindow().getDecorView().getRootView());
            this.f15015d.put(activity, activity.getLocalClassName());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public boolean m12028b() {
        Thread.currentThread();
        Looper.getMainLooper().getThread();
        return this.f15015d.isEmpty();
    }

    public void remove(Activity activity) {
        try {
            Thread.currentThread();
            Looper.getMainLooper().getThread();
            this.f15015d.remove(activity);
            synchronized (this.f15018g) {
                try {
                    Iterator<a> it = this.f15018g.iterator();
                    while (it.hasNext()) {
                        it.next().kill();
                    }
                    this.f15018g.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable unused) {
        }
    }

    @SuppressLint({"AddJavascriptInterface"})
    /* renamed from: a */
    private void m12026a(View view) {
        if (view == null) {
            return;
        }
        try {
            if (view instanceof WebView) {
                WebView webView = (WebView) view;
                if (this.f15014c == null) {
                    this.f15014c = new b(new WeakReference(webView));
                }
                webView.addJavascriptInterface(this.f15014c, "TDHybridJS2NativeObject");
                if (!C7912cq.m11595a(19)) {
                    webView.addJavascriptInterface(C8014s.f15097a, "getPath");
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    m12026a(viewGroup.getChildAt(i10));
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public Set<Activity> m12027a() {
        Thread.currentThread();
        Looper.getMainLooper().getThread();
        return Collections.unmodifiableSet(this.f15015d.keySet());
    }
}
