package com.google.protobuf;

/* loaded from: classes3.dex */
final class NewInstanceSchemaFull implements NewInstanceSchema {
    @Override // com.google.protobuf.NewInstanceSchema
    public Object newInstance(Object obj) {
        return ((Message) obj).toBuilder().buildPartial();
    }
}
