package anet.channel.p006b;

import android.support.v4.media.session.PlaybackStateCompat;
import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import anetwork.channel.cache.Cache;
import com.taobao.alivfssdk.cache.AVFSCache;
import com.taobao.alivfssdk.cache.AVFSCacheConfig;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.alivfssdk.cache.IAVFSCache;

/* renamed from: anet.channel.b.a */
/* loaded from: classes.dex */
public class C0856a implements Cache {

    /* renamed from: a */
    private static boolean f5064a = true;

    /* renamed from: b */
    private static Object f5065b;

    /* renamed from: c */
    private static Object f5066c;

    /* renamed from: d */
    private static Object f5067d;

    static {
        try {
            Class.forName("com.taobao.alivfssdk.cache.AVFSCacheManager");
            f5065b = new C0857b();
            f5066c = new C0858c();
            f5067d = new C0859d();
        } catch (ClassNotFoundException unused) {
            f5064a = false;
            ALog.m4641w("anet.AVFSCacheImpl", "no alivfs sdk!", null, new Object[0]);
        }
    }

    /* renamed from: b */
    private IAVFSCache m4382b() {
        AVFSCache aVFSCacheCacheForModule = AVFSCacheManager.getInstance().cacheForModule("networksdk.httpcache");
        if (aVFSCacheCacheForModule != null) {
            return aVFSCacheCacheForModule.getFileCache();
        }
        return null;
    }

    /* renamed from: a */
    public void m4383a() {
        AVFSCache aVFSCacheCacheForModule;
        if (f5064a && (aVFSCacheCacheForModule = AVFSCacheManager.getInstance().cacheForModule("networksdk.httpcache")) != null) {
            AVFSCacheConfig aVFSCacheConfig = new AVFSCacheConfig();
            aVFSCacheConfig.limitSize = 5242880L;
            aVFSCacheConfig.fileMemMaxSize = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            aVFSCacheCacheForModule.moduleConfig(aVFSCacheConfig);
        }
    }

    @Override // anetwork.channel.cache.Cache
    public void clear() {
        if (f5064a) {
            try {
                IAVFSCache iAVFSCacheM4382b = m4382b();
                if (iAVFSCacheM4382b != null) {
                    iAVFSCacheM4382b.removeAllObject((IAVFSCache.OnAllObjectRemoveCallback) f5067d);
                }
            } catch (Exception e4) {
                ALog.m4637e("anet.AVFSCacheImpl", "clear cache failed", null, e4, new Object[0]);
            }
        }
    }

    @Override // anetwork.channel.cache.Cache
    public Cache.Entry get(String str) {
        if (!f5064a) {
            return null;
        }
        try {
            IAVFSCache iAVFSCacheM4382b = m4382b();
            if (iAVFSCacheM4382b != null) {
                return (Cache.Entry) iAVFSCacheM4382b.objectForKey(StringUtils.md5ToHex(str));
            }
        } catch (Exception e4) {
            ALog.m4637e("anet.AVFSCacheImpl", "get cache failed", null, e4, new Object[0]);
        }
        return null;
    }

    @Override // anetwork.channel.cache.Cache
    public void put(String str, Cache.Entry entry) {
        if (f5064a) {
            try {
                IAVFSCache iAVFSCacheM4382b = m4382b();
                if (iAVFSCacheM4382b != null) {
                    iAVFSCacheM4382b.setObjectForKey(StringUtils.md5ToHex(str), entry, (IAVFSCache.OnObjectSetCallback) f5065b);
                }
            } catch (Exception e4) {
                ALog.m4637e("anet.AVFSCacheImpl", "put cache failed", null, e4, new Object[0]);
            }
        }
    }

    @Override // anetwork.channel.cache.Cache
    public void remove(String str) {
        if (f5064a) {
            try {
                IAVFSCache iAVFSCacheM4382b = m4382b();
                if (iAVFSCacheM4382b != null) {
                    iAVFSCacheM4382b.removeObjectForKey(StringUtils.md5ToHex(str), (IAVFSCache.OnObjectRemoveCallback) f5066c);
                }
            } catch (Exception e4) {
                ALog.m4637e("anet.AVFSCacheImpl", "remove cache failed", null, e4, new Object[0]);
            }
        }
    }
}
