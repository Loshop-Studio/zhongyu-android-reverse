package com.tendcloud.tenddata;

import java.nio.ByteBuffer;

/* renamed from: com.tendcloud.tenddata.bh */
/* loaded from: classes5.dex */
public interface InterfaceC7876bh {

    /* renamed from: com.tendcloud.tenddata.bh$a */
    public enum a {
        CONTINUOUS,
        TEXT,
        BINARY,
        PING,
        PONG,
        CLOSING
    }

    void append(InterfaceC7876bh interfaceC7876bh);

    /* renamed from: c */
    ByteBuffer mo11265c();

    /* renamed from: d */
    boolean mo11266d();

    /* renamed from: e */
    boolean mo11267e();

    /* renamed from: f */
    a mo11268f();
}
