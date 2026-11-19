package anet.channel;

import android.text.TextUtils;
import anet.channel.entity.ENV;
import anet.channel.security.C0915c;
import anet.channel.security.ISecurity;
import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class Config {

    /* renamed from: b */
    private String f4968b;

    /* renamed from: c */
    private String f4969c;

    /* renamed from: d */
    private ENV f4970d = ENV.ONLINE;

    /* renamed from: e */
    private ISecurity f4971e;

    /* renamed from: a */
    private static Map<String, Config> f4967a = new HashMap();
    public static final Config DEFAULT_CONFIG = new Builder().setTag("[default]").setAppkey("[default]").setEnv(ENV.ONLINE).build();

    public static class Builder {

        /* renamed from: a */
        private String f4972a;

        /* renamed from: b */
        private String f4973b;

        /* renamed from: c */
        private ENV f4974c = ENV.ONLINE;

        /* renamed from: d */
        private String f4975d;

        /* renamed from: e */
        private String f4976e;

        public Config build() {
            if (TextUtils.isEmpty(this.f4973b)) {
                throw new RuntimeException("appkey can not be null or empty!");
            }
            synchronized (Config.f4967a) {
                for (Config config : Config.f4967a.values()) {
                    if (config.f4970d == this.f4974c && config.f4969c.equals(this.f4973b)) {
                        ALog.m4641w("awcn.Config", "duplicated config exist!", null, "appkey", this.f4973b, "env", this.f4974c);
                        if (!TextUtils.isEmpty(this.f4972a)) {
                            Config.f4967a.put(this.f4972a, config);
                        }
                        return config;
                    }
                }
                Config config2 = new Config();
                config2.f4969c = this.f4973b;
                config2.f4970d = this.f4974c;
                if (TextUtils.isEmpty(this.f4972a)) {
                    config2.f4968b = StringUtils.concatString(this.f4973b, "$", this.f4974c.toString());
                } else {
                    config2.f4968b = this.f4972a;
                }
                if (TextUtils.isEmpty(this.f4976e)) {
                    config2.f4971e = C0915c.m4519a().createSecurity(this.f4975d);
                } else {
                    config2.f4971e = C0915c.m4519a().createNonSecurity(this.f4976e);
                }
                synchronized (Config.f4967a) {
                    Config.f4967a.put(config2.f4968b, config2);
                }
                return config2;
            }
        }

        public Builder setAppSecret(String str) {
            this.f4976e = str;
            return this;
        }

        public Builder setAppkey(String str) {
            this.f4973b = str;
            return this;
        }

        public Builder setAuthCode(String str) {
            this.f4975d = str;
            return this;
        }

        public Builder setEnv(ENV env) {
            this.f4974c = env;
            return this;
        }

        public Builder setTag(String str) {
            this.f4972a = str;
            return this;
        }
    }

    protected Config() {
    }

    public static Config getConfig(String str, ENV env) {
        synchronized (f4967a) {
            for (Config config : f4967a.values()) {
                if (config.f4970d == env && config.f4969c.equals(str)) {
                    return config;
                }
            }
            return null;
        }
    }

    public static Config getConfigByTag(String str) {
        Config config;
        synchronized (f4967a) {
            config = f4967a.get(str);
        }
        return config;
    }

    public String getAppkey() {
        return this.f4969c;
    }

    public ENV getEnv() {
        return this.f4970d;
    }

    public ISecurity getSecurity() {
        return this.f4971e;
    }

    public String getTag() {
        return this.f4968b;
    }

    public String toString() {
        return this.f4968b;
    }
}
