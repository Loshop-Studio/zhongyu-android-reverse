package anet.channel;

import android.text.TextUtils;
import anet.channel.entity.ENV;
import anet.channel.security.C5038c;
import anet.channel.security.ISecurity;
import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Config {

    /* renamed from: b */
    private String f2246b;

    /* renamed from: c */
    private String f2247c;

    /* renamed from: d */
    private ENV f2248d = ENV.ONLINE;

    /* renamed from: e */
    private ISecurity f2249e;

    /* renamed from: a */
    private static Map<String, Config> f2245a = new HashMap();
    public static final Config DEFAULT_CONFIG = new Builder().setTag("[default]").setAppkey("[default]").setEnv(ENV.ONLINE).build();

    public static class Builder {

        /* renamed from: a */
        private String f2250a;

        /* renamed from: b */
        private String f2251b;

        /* renamed from: c */
        private ENV f2252c = ENV.ONLINE;

        /* renamed from: d */
        private String f2253d;

        /* renamed from: e */
        private String f2254e;

        public Config build() {
            if (TextUtils.isEmpty(this.f2251b)) {
                throw new RuntimeException("appkey can not be null or empty!");
            }
            synchronized (Config.f2245a) {
                try {
                    for (Config config : Config.f2245a.values()) {
                        if (config.f2248d == this.f2252c && config.f2247c.equals(this.f2251b)) {
                            ALog.m2532w("awcn.Config", "duplicated config exist!", null, "appkey", this.f2251b, "env", this.f2252c);
                            if (!TextUtils.isEmpty(this.f2250a)) {
                                Config.f2245a.put(this.f2250a, config);
                            }
                            return config;
                        }
                    }
                    Config config2 = new Config();
                    config2.f2247c = this.f2251b;
                    config2.f2248d = this.f2252c;
                    if (TextUtils.isEmpty(this.f2250a)) {
                        config2.f2246b = StringUtils.concatString(this.f2251b, "$", this.f2252c.toString());
                    } else {
                        config2.f2246b = this.f2250a;
                    }
                    if (TextUtils.isEmpty(this.f2254e)) {
                        config2.f2249e = C5038c.m2410a().createSecurity(this.f2253d);
                    } else {
                        config2.f2249e = C5038c.m2410a().createNonSecurity(this.f2254e);
                    }
                    synchronized (Config.f2245a) {
                        Config.f2245a.put(config2.f2246b, config2);
                    }
                    return config2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public Builder setAppSecret(String str) {
            this.f2254e = str;
            return this;
        }

        public Builder setAppkey(String str) {
            this.f2251b = str;
            return this;
        }

        public Builder setAuthCode(String str) {
            this.f2253d = str;
            return this;
        }

        public Builder setEnv(ENV env) {
            this.f2252c = env;
            return this;
        }

        public Builder setTag(String str) {
            this.f2250a = str;
            return this;
        }
    }

    public static Config getConfig(String str, ENV env) {
        synchronized (f2245a) {
            try {
                for (Config config : f2245a.values()) {
                    if (config.f2248d == env && config.f2247c.equals(str)) {
                        return config;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Config getConfigByTag(String str) {
        Config config;
        synchronized (f2245a) {
            config = f2245a.get(str);
        }
        return config;
    }

    public String getAppkey() {
        return this.f2247c;
    }

    public ENV getEnv() {
        return this.f2248d;
    }

    public ISecurity getSecurity() {
        return this.f2249e;
    }

    public String getTag() {
        return this.f2246b;
    }

    public String toString() {
        return this.f2246b;
    }
}
