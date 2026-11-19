package anet.channel.p021b;

import android.support.v4.media.session.PlaybackStateCompat;
import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import anetwork.channel.cache.Cache;
import com.taobao.alivfssdk.cache.AVFSCache;
import com.taobao.alivfssdk.cache.AVFSCacheConfig;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.alivfssdk.cache.IAVFSCache;

/* renamed from: anet.channel.b.a */
/* loaded from: classes3.dex */
public class C4979a implements Cache {

    /* renamed from: a */
    private static boolean f2342a = true;

    /* renamed from: b */
    private static Object f2343b;

    /* renamed from: c */
    private static Object f2344c;

    /* renamed from: d */
    private static Object f2345d;

    static {
        try {
            Class.forName("com.taobao.alivfssdk.cache.AVFSCacheManager");
            f2343b = new C4980b();
            f2344c = new C4981c();
            f2345d = new C4982d();
        } catch (ClassNotFoundException unused) {
            f2342a = false;
            ALog.m2532w("anet.AVFSCacheImpl", "no alivfs sdk!", null, new Object[0]);
        }
    }

    /* renamed from: b */
    private IAVFSCache m2273b() {
        AVFSCache aVFSCacheCacheForModule = AVFSCacheManager.getInstance().cacheForModule("networksdk.httpcache");
        if (aVFSCacheCacheForModule != null) {
            return aVFSCacheCacheForModule.getFileCache();
        }
        return null;
    }

    /* renamed from: a */
    public void m2274a() {
        AVFSCache aVFSCacheCacheForModule;
        if (f2342a && (aVFSCacheCacheForModule = AVFSCacheManager.getInstance().cacheForModule("networksdk.httpcache")) != null) {
            AVFSCacheConfig aVFSCacheConfig = new AVFSCacheConfig();
            aVFSCacheConfig.limitSize = 5242880L;
            aVFSCacheConfig.fileMemMaxSize = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            aVFSCacheCacheForModule.moduleConfig(aVFSCacheConfig);
        }
    }

    @Override // anetwork.channel.cache.Cache
    public void clear() {
        if (f2342a) {
            try {
                IAVFSCache iAVFSCacheM2273b = m2273b();
                if (iAVFSCacheM2273b != null) {
                    iAVFSCacheM2273b.removeAllObject((IAVFSCache.OnAllObjectRemoveCallback) f2345d);
                }
            } catch (Exception e10) {
                ALog.m2528e("anet.AVFSCacheImpl", "clear cache failed", null, e10, new Object[0]);
            }
        }
    }

    @Override // anetwork.channel.cache.Cache
    public Cache.Entry get(String str) {
        if (!f2342a) {
            return null;
        }
        try {
            IAVFSCache iAVFSCacheM2273b = m2273b();
            if (iAVFSCacheM2273b != null) {
                return (Cache.Entry) iAVFSCacheM2273b.objectForKey(StringUtils.md5ToHex(str));
            }
        } catch (Exception e10) {
            ALog.m2528e("anet.AVFSCacheImpl", "get cache failed", null, e10, new Object[0]);
        }
        return null;
    }

    @Override // anetwork.channel.cache.Cache
    public void put(String str, Cache.Entry entry) {
        if (f2342a) {
            try {
                IAVFSCache iAVFSCacheM2273b = m2273b();
                if (iAVFSCacheM2273b != null) {
                    iAVFSCacheM2273b.setObjectForKey(StringUtils.md5ToHex(str), entry, (IAVFSCache.OnObjectSetCallback) f2343b);
                }
            } catch (Exception e10) {
                ALog.m2528e("anet.AVFSCacheImpl", "put cache failed", null, e10, new Object[0]);
            }
        }
    }

    @Override // anetwork.channel.cache.Cache
    public void remove(String str) {
        if (f2342a) {
            try {
                IAVFSCache iAVFSCacheM2273b = m2273b();
                if (iAVFSCacheM2273b != null) {
                    iAVFSCacheM2273b.removeObjectForKey(StringUtils.md5ToHex(str), (IAVFSCache.OnObjectRemoveCallback) f2344c);
                }
            } catch (Exception e10) {
                ALog.m2528e("anet.AVFSCacheImpl", "remove cache failed", null, e10, new Object[0]);
            }
        }
    }
}
