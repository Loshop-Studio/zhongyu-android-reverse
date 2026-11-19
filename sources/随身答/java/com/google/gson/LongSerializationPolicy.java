package com.google.gson;

/* loaded from: classes3.dex */
public enum LongSerializationPolicy {
    DEFAULT { // from class: com.google.gson.LongSerializationPolicy.1
        @Override // com.google.gson.LongSerializationPolicy
        public JsonElement serialize(Long l9) {
            return new JsonPrimitive(l9);
        }
    },
    STRING { // from class: com.google.gson.LongSerializationPolicy.2
        @Override // com.google.gson.LongSerializationPolicy
        public JsonElement serialize(Long l9) {
            return new JsonPrimitive(String.valueOf(l9));
        }
    };

    public abstract JsonElement serialize(Long l9);
}
