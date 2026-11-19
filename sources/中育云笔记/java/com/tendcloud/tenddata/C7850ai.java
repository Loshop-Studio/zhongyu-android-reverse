package com.tendcloud.tenddata;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

/* renamed from: com.tendcloud.tenddata.ai */
/* loaded from: classes5.dex */
public class C7850ai {
    /* renamed from: a */
    public static boolean m11140a(ByteBuffer byteBuffer, C7854am c7854am, ByteChannel byteChannel) throws IOException {
        byteBuffer.clear();
        int i10 = byteChannel.read(byteBuffer);
        byteBuffer.flip();
        if (i10 != -1) {
            return i10 != 0;
        }
        c7854am.m11154b();
        return false;
    }

    /* renamed from: a */
    public static boolean m11139a(ByteBuffer byteBuffer, C7854am c7854am, InterfaceC7857ap interfaceC7857ap) {
        byteBuffer.clear();
        int iMo11118a = interfaceC7857ap.mo11118a(byteBuffer);
        byteBuffer.flip();
        if (iMo11118a == -1) {
            c7854am.m11154b();
            return false;
        }
        return interfaceC7857ap.mo11121c();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m11138a(com.tendcloud.tenddata.C7854am r4, java.nio.channels.ByteChannel r5) throws java.io.IOException {
        /*
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r0 = r4.f14355h
            java.lang.Object r0 = r0.peek()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r1 = 0
            if (r0 != 0) goto L1c
            boolean r0 = r5 instanceof com.tendcloud.tenddata.InterfaceC7857ap
            if (r0 == 0) goto L35
            r0 = r5
            com.tendcloud.tenddata.ap r0 = (com.tendcloud.tenddata.InterfaceC7857ap) r0
            boolean r2 = r0.mo11119a()
            if (r2 == 0) goto L36
            r0.mo11120b()
            goto L36
        L1c:
            r5.write(r0)
            int r0 = r0.remaining()
            if (r0 <= 0) goto L26
            return r1
        L26:
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r0 = r4.f14355h
            r0.poll()
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r0 = r4.f14355h
            java.lang.Object r0 = r0.peek()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            if (r0 != 0) goto L1c
        L35:
            r0 = 0
        L36:
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r2 = r4.f14355h
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L59
            boolean r2 = r4.isFlushAndClose()
            if (r2 == 0) goto L59
            com.tendcloud.tenddata.as r2 = r4.getDraft()
            com.tendcloud.tenddata.aj$b r2 = r2.m11244d()
            com.tendcloud.tenddata.aj$b r3 = com.tendcloud.tenddata.InterfaceC7851aj.b.SERVER
            if (r2 != r3) goto L59
            monitor-enter(r4)
            r4.m11151a()     // Catch: java.lang.Throwable -> L56
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L56
            goto L59
        L56:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L56
            throw r5
        L59:
            r4 = 1
            if (r0 == 0) goto L66
            com.tendcloud.tenddata.ap r5 = (com.tendcloud.tenddata.InterfaceC7857ap) r5
            boolean r5 = r5.mo11119a()
            if (r5 != 0) goto L65
            return r4
        L65:
            return r1
        L66:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.C7850ai.m11138a(com.tendcloud.tenddata.am, java.nio.channels.ByteChannel):boolean");
    }
}
