package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import java.util.Map;

/* loaded from: classes.dex */
class EngineKeyFactory {
    EngineKeyFactory() {
    }

    EngineKey buildKey(Object obj, Key key, int i4, int i5, Map<Class<?>, Transformation<?>> map, Class<?> cls, Class<?> cls2, Options options) {
        return new EngineKey(obj, key, i4, i5, map, cls, cls2, options);
    }
}
