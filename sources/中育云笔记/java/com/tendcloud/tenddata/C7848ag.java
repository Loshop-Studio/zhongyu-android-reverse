package com.tendcloud.tenddata;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SocketChannel;

/* renamed from: com.tendcloud.tenddata.ag */
/* loaded from: classes5.dex */
public class C7848ag implements InterfaceC7857ap {

    /* renamed from: a */
    private final ByteChannel f14333a;

    public C7848ag(ByteChannel byteChannel) {
        this.f14333a = byteChannel;
    }

    @Override // com.tendcloud.tenddata.InterfaceC7857ap
    /* renamed from: a */
    public boolean mo11119a() {
        ByteChannel byteChannel = this.f14333a;
        if (byteChannel instanceof InterfaceC7857ap) {
            return ((InterfaceC7857ap) byteChannel).mo11119a();
        }
        return false;
    }

    @Override // com.tendcloud.tenddata.InterfaceC7857ap
    /* renamed from: b */
    public void mo11120b() {
        ByteChannel byteChannel = this.f14333a;
        if (byteChannel instanceof InterfaceC7857ap) {
            ((InterfaceC7857ap) byteChannel).mo11120b();
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7857ap
    /* renamed from: c */
    public boolean mo11121c() {
        ByteChannel byteChannel = this.f14333a;
        if (byteChannel instanceof InterfaceC7857ap) {
            return ((InterfaceC7857ap) byteChannel).mo11121c();
        }
        return false;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f14333a.close();
    }

    @Override // com.tendcloud.tenddata.InterfaceC7857ap
    /* renamed from: d */
    public boolean mo11122d() {
        ByteChannel byteChannel = this.f14333a;
        if (byteChannel instanceof SocketChannel) {
            return ((SocketChannel) byteChannel).isBlocking();
        }
        if (byteChannel instanceof InterfaceC7857ap) {
            return ((InterfaceC7857ap) byteChannel).mo11122d();
        }
        return false;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f14333a.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        return this.f14333a.read(byteBuffer);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        return this.f14333a.write(byteBuffer);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7857ap
    /* renamed from: a */
    public int mo11118a(ByteBuffer byteBuffer) {
        ByteChannel byteChannel = this.f14333a;
        if (byteChannel instanceof InterfaceC7857ap) {
            return ((InterfaceC7857ap) byteChannel).mo11118a(byteBuffer);
        }
        return 0;
    }

    public C7848ag(InterfaceC7857ap interfaceC7857ap) {
        this.f14333a = interfaceC7857ap;
    }
}
