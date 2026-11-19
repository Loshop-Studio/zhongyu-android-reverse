package com.alibaba.fastjson.serializer;

import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public interface JSONSerializable {
    void write(JSONSerializer jSONSerializer, Object obj, Type type, int i10);
}
