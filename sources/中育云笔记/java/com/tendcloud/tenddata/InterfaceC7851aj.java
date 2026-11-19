package com.tendcloud.tenddata;

import com.tendcloud.tenddata.InterfaceC7876bh;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;

/* renamed from: com.tendcloud.tenddata.aj */
/* loaded from: classes5.dex */
public interface InterfaceC7851aj {

    /* renamed from: a */
    public static final int f14347a = 80;

    /* renamed from: b */
    public static final int f14348b = 443;

    /* renamed from: com.tendcloud.tenddata.aj$a */
    public enum a {
        NOT_YET_CONNECTED,
        CONNECTING,
        OPEN,
        CLOSING,
        CLOSED
    }

    /* renamed from: com.tendcloud.tenddata.aj$b */
    public enum b {
        CLIENT,
        SERVER
    }

    void close();

    void close(int i10);

    void close(int i10, String str);

    void closeConnection(int i10, String str);

    AbstractC7860as getDraft();

    InetSocketAddress getLocalSocketAddress();

    a getReadyState();

    InetSocketAddress getRemoteSocketAddress();

    String getResourceDescriptor();

    boolean hasBufferedData();

    boolean isClosed();

    boolean isClosing();

    boolean isConnecting();

    boolean isFlushAndClose();

    boolean isOpen();

    void send(String str);

    void send(ByteBuffer byteBuffer);

    void send(byte[] bArr);

    void sendFragmentedFrame(InterfaceC7876bh.a aVar, ByteBuffer byteBuffer, boolean z10);

    void sendFrame(InterfaceC7876bh interfaceC7876bh);
}
