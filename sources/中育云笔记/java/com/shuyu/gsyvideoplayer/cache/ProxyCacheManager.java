package com.shuyu.gsyvideoplayer.cache;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.shuyu.gsyvideoplayer.cache.ICacheManager;
import com.shuyu.gsyvideoplayer.utils.CommonUtil;
import com.shuyu.gsyvideoplayer.utils.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.TrustManager;
import p329s1.AbstractC11050q;
import p329s1.C11040g;
import p329s1.InterfaceC11035b;
import p340t1.C11205f;
import p340t1.InterfaceC11202c;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes5.dex */
public class ProxyCacheManager implements ICacheManager, InterfaceC11035b {
    public static int DEFAULT_MAX_COUNT = -1;
    public static long DEFAULT_MAX_SIZE = 536870912;
    private static InterfaceC11202c fileNameGenerator;
    private static ProxyCacheManager proxyCacheManager;
    private ICacheManager.ICacheAvailableListener cacheAvailableListener;
    protected File mCacheDir;
    protected boolean mCacheFile;
    protected C11040g proxy;
    private TrustManager[] trustAllCerts;
    protected ProxyCacheUserAgentHeadersInjector userAgentHeadersInjector = new ProxyCacheUserAgentHeadersInjector();

    /* renamed from: v */
    private HostnameVerifier f12778v;

    public static void clearFileNameGenerator() {
        fileNameGenerator = null;
    }

    public static C11040g getProxy(Context context) {
        C11040g c11040g = instance().proxy;
        if (c11040g != null) {
            return c11040g;
        }
        ProxyCacheManager proxyCacheManagerInstance = instance();
        C11040g c11040gNewProxy = instance().newProxy(context);
        proxyCacheManagerInstance.proxy = c11040gNewProxy;
        return c11040gNewProxy;
    }

    public static synchronized ProxyCacheManager instance() {
        try {
            if (proxyCacheManager == null) {
                proxyCacheManager = new ProxyCacheManager();
            }
        } catch (Throwable th) {
            throw th;
        }
        return proxyCacheManager;
    }

    public static void setFileNameGenerator(InterfaceC11202c interfaceC11202c) {
        fileNameGenerator = interfaceC11202c;
    }

    @Override // com.shuyu.gsyvideoplayer.cache.ICacheManager
    public boolean cachePreview(Context context, File file, String str) throws IOException {
        C11040g proxy = getProxy(context.getApplicationContext(), file);
        if (proxy != null) {
            str = proxy.m24417j(str);
        }
        return !str.startsWith(HttpConstant.HTTP);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [t1.c] */
    @Override // com.shuyu.gsyvideoplayer.cache.ICacheManager
    public void clearCache(Context context, File file, String str) {
        if (TextUtils.isEmpty(str)) {
            if (file == null) {
                FileUtils.deleteFiles(new File(AbstractC11050q.m24492c(context.getApplicationContext()).getAbsolutePath()));
                return;
            } else {
                FileUtils.deleteFiles(file);
                return;
            }
        }
        C11205f c11205f = new C11205f();
        ?? r12 = fileNameGenerator;
        if (r12 != 0) {
            c11205f = r12;
        }
        String strMo24912a = c11205f.mo24912a(str);
        if (file != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(file.getAbsolutePath());
            String str2 = File.separator;
            sb2.append(str2);
            sb2.append(strMo24912a);
            sb2.append(".download");
            String string = sb2.toString();
            String str3 = file.getAbsolutePath() + str2 + strMo24912a;
            CommonUtil.deleteFile(string);
            CommonUtil.deleteFile(str3);
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(AbstractC11050q.m24492c(context.getApplicationContext()).getAbsolutePath());
        String str4 = File.separator;
        sb3.append(str4);
        sb3.append(strMo24912a);
        sb3.append(".download");
        String string2 = sb3.toString();
        String str5 = AbstractC11050q.m24492c(context.getApplicationContext()).getAbsolutePath() + str4 + strMo24912a;
        CommonUtil.deleteFile(string2);
        CommonUtil.deleteFile(str5);
    }

    @Override // com.shuyu.gsyvideoplayer.cache.ICacheManager
    public void doCacheLogic(Context context, IMediaPlayer iMediaPlayer, String str, Map<String, String> map, File file) throws IOException {
        Map<String, String> map2 = ProxyCacheUserAgentHeadersInjector.mMapHeadData;
        map2.clear();
        if (map != null) {
            map2.putAll(map);
        }
        if (str.startsWith(HttpConstant.HTTP) && !str.contains("127.0.0.1") && !str.contains(".m3u8")) {
            C11040g proxy = getProxy(context.getApplicationContext(), file);
            if (proxy != null) {
                String strM24417j = proxy.m24417j(str);
                boolean zStartsWith = strM24417j.startsWith(HttpConstant.HTTP);
                this.mCacheFile = !zStartsWith;
                if (zStartsWith) {
                    proxy.m24423p(this, str);
                }
                str = strM24417j;
            }
        } else if (!str.startsWith(HttpConstant.HTTP) && !str.startsWith("rtmp") && !str.startsWith("rtsp") && !str.contains(".m3u8")) {
            this.mCacheFile = true;
        }
        try {
            iMediaPlayer.setDataSource(context, Uri.parse(str), map);
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.f12778v;
    }

    public TrustManager[] getTrustAllCerts() {
        return this.trustAllCerts;
    }

    @Override // com.shuyu.gsyvideoplayer.cache.ICacheManager
    public boolean hadCached() {
        return this.mCacheFile;
    }

    public C11040g newProxy(Context context, File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        C11040g.b bVar = new C11040g.b(context);
        bVar.m24432c(file);
        int i10 = DEFAULT_MAX_COUNT;
        if (i10 > 0) {
            bVar.m24436g(i10);
        } else {
            bVar.m24437h(DEFAULT_MAX_SIZE);
        }
        bVar.m24434e(this.userAgentHeadersInjector);
        bVar.m24435f(this.f12778v);
        bVar.m24438i(this.trustAllCerts);
        InterfaceC11202c interfaceC11202c = fileNameGenerator;
        if (interfaceC11202c != null) {
            bVar.m24433d(interfaceC11202c);
        }
        this.mCacheDir = file;
        return bVar.m24430a();
    }

    @Override // p329s1.InterfaceC11035b
    public void onCacheAvailable(File file, String str, int i10) {
        ICacheManager.ICacheAvailableListener iCacheAvailableListener = this.cacheAvailableListener;
        if (iCacheAvailableListener != null) {
            iCacheAvailableListener.onCacheAvailable(file, str, i10);
        }
    }

    @Override // com.shuyu.gsyvideoplayer.cache.ICacheManager
    public void release() {
        C11040g c11040g = this.proxy;
        if (c11040g != null) {
            try {
                c11040g.m24428u(this);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // com.shuyu.gsyvideoplayer.cache.ICacheManager
    public void setCacheAvailableListener(ICacheManager.ICacheAvailableListener iCacheAvailableListener) {
        this.cacheAvailableListener = iCacheAvailableListener;
    }

    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f12778v = hostnameVerifier;
    }

    public void setProxy(C11040g c11040g) {
        this.proxy = c11040g;
    }

    public void setTrustAllCerts(TrustManager[] trustManagerArr) {
        this.trustAllCerts = trustManagerArr;
    }

    public static C11040g getProxy(Context context, File file) throws IOException {
        if (file == null) {
            return getProxy(context);
        }
        if (instance().mCacheDir != null && !instance().mCacheDir.getAbsolutePath().equals(file.getAbsolutePath())) {
            C11040g c11040g = instance().proxy;
            if (c11040g != null) {
                c11040g.m24425r();
            }
            ProxyCacheManager proxyCacheManagerInstance = instance();
            C11040g c11040gNewProxy = instance().newProxy(context, file);
            proxyCacheManagerInstance.proxy = c11040gNewProxy;
            return c11040gNewProxy;
        }
        C11040g c11040g2 = instance().proxy;
        if (c11040g2 != null) {
            return c11040g2;
        }
        ProxyCacheManager proxyCacheManagerInstance2 = instance();
        C11040g c11040gNewProxy2 = instance().newProxy(context, file);
        proxyCacheManagerInstance2.proxy = c11040gNewProxy2;
        return c11040gNewProxy2;
    }

    public C11040g newProxy(Context context) {
        C11040g.b bVarM24434e = new C11040g.b(context.getApplicationContext()).m24434e(this.userAgentHeadersInjector);
        int i10 = DEFAULT_MAX_COUNT;
        if (i10 > 0) {
            bVarM24434e.m24436g(i10);
        } else {
            bVarM24434e.m24437h(DEFAULT_MAX_SIZE);
        }
        bVarM24434e.m24435f(this.f12778v);
        bVarM24434e.m24438i(this.trustAllCerts);
        return bVarM24434e.m24430a();
    }
}
