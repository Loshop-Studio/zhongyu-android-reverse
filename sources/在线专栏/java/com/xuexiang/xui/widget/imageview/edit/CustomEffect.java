package com.xuexiang.xui.widget.imageview.edit;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class CustomEffect {
    private String mEffectName;
    private Map<String, Object> mParametersMap;

    public static class Builder {
        private String mEffectName;
        private Map<String, Object> mParametersMap = new HashMap();

        public Builder(String str) throws RuntimeException {
            if (TextUtils.isEmpty(str)) {
                throw new RuntimeException("Effect name cannot be empty.Please provide effect name from EffectFactory");
            }
            this.mEffectName = str;
        }

        public CustomEffect build() {
            return new CustomEffect(this);
        }

        public Builder setParameter(String str, Object obj) {
            this.mParametersMap.put(str, obj);
            return this;
        }
    }

    public String getEffectName() {
        return this.mEffectName;
    }

    public Map<String, Object> getParameters() {
        return this.mParametersMap;
    }

    private CustomEffect(Builder builder) {
        this.mEffectName = builder.mEffectName;
        this.mParametersMap = builder.mParametersMap;
    }
}
