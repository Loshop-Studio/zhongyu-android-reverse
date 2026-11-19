package com.tencent.smtt.sdk;

import com.tencent.smtt.utils.C6865v;
import java.io.File;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes4.dex */
public final class CacheManager {
    @Deprecated
    public static boolean cacheDisabled() {
        Object objM6376a;
        C6816bo c6816boM6152b = C6816bo.m6152b();
        if (c6816boM6152b == null || !c6816boM6152b.m6157c()) {
            objM6376a = C6865v.m6376a("android.webkit.CacheManager", "cacheDisabled");
            if (objM6376a == null) {
                return false;
            }
        } else {
            objM6376a = c6816boM6152b.m6158d().m6177c();
        }
        return ((Boolean) objM6376a).booleanValue();
    }

    public static InputStream getCacheFile(String str, boolean z10) {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        if (c6816boM6152b == null || !c6816boM6152b.m6157c()) {
            return null;
        }
        return c6816boM6152b.m6158d().m6162a(str, z10);
    }

    @Deprecated
    public static File getCacheFileBaseDir() {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        return (File) ((c6816boM6152b == null || !c6816boM6152b.m6157c()) ? C6865v.m6376a("android.webkit.CacheManager", "getCacheFileBaseDir") : c6816boM6152b.m6158d().m6188g());
    }

    public static Object getCacheFile(String str, Map<String, String> map) {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        if (c6816boM6152b != null && c6816boM6152b.m6157c()) {
            return c6816boM6152b.m6158d().m6188g();
        }
        try {
            return C6865v.m6373a(Class.forName("android.webkit.CacheManager"), "getCacheFile", (Class<?>[]) new Class[]{String.class, Map.class}, str, map);
        } catch (Exception unused) {
            return null;
        }
    }
}
