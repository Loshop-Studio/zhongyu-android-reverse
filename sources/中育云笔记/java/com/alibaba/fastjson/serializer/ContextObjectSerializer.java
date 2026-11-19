package com.alibaba.fastjson.serializer;

/* loaded from: classes3.dex */
public interface ContextObjectSerializer extends ObjectSerializer {
    void write(JSONSerializer jSONSerializer, Object obj, BeanContext beanContext);
}
