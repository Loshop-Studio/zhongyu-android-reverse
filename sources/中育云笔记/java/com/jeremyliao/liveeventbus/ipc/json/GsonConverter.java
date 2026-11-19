package com.jeremyliao.liveeventbus.ipc.json;

import com.google.gson.Gson;

/* loaded from: classes5.dex */
public class GsonConverter implements JsonConverter {
    private Gson gson = new Gson();

    @Override // com.jeremyliao.liveeventbus.ipc.json.JsonConverter
    public <T> T fromJson(String str, Class<T> cls) {
        return (T) this.gson.fromJson(str, (Class) cls);
    }

    @Override // com.jeremyliao.liveeventbus.ipc.json.JsonConverter
    public String toJson(Object obj) {
        return this.gson.toJson(obj);
    }
}
