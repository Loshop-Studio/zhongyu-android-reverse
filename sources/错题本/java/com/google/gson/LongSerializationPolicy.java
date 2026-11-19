package com.google.gson;

/* loaded from: classes2.dex */
public enum LongSerializationPolicy {
    DEFAULT { // from class: com.google.gson.LongSerializationPolicy.1
        @Override // com.google.gson.LongSerializationPolicy
        public AbstractC3863j serialize(Long l) {
            return l == null ? C3864k.f3056a : new C3866m(l);
        }
    },
    STRING { // from class: com.google.gson.LongSerializationPolicy.2
        @Override // com.google.gson.LongSerializationPolicy
        public AbstractC3863j serialize(Long l) {
            return l == null ? C3864k.f3056a : new C3866m(l.toString());
        }
    };

    LongSerializationPolicy(C38291 c38291) {
    }

    public abstract AbstractC3863j serialize(Long l);
}
