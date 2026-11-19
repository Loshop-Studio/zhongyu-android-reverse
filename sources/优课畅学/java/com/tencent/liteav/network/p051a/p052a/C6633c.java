package com.tencent.liteav.network.p051a.p052a;

import com.tencent.liteav.network.p051a.C6630a;
import com.tencent.liteav.network.p051a.C6634b;
import com.tencent.liteav.network.p051a.C6637d;
import com.tencent.liteav.network.p051a.C6638e;
import com.tencent.liteav.network.p051a.InterfaceC6636c;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Random;

/* renamed from: com.tencent.liteav.network.a.a.c */
/* loaded from: classes4.dex */
public final class C6633c implements InterfaceC6636c {

    /* renamed from: b */
    private static final Random f5773b = new Random();

    /* renamed from: a */
    final InetAddress f5774a;

    /* renamed from: c */
    private final int f5775c;

    public C6633c(InetAddress inetAddress) {
        this(inetAddress, 10);
    }

    @Override // com.tencent.liteav.network.p051a.InterfaceC6636c
    /* renamed from: a */
    public C6638e[] mo5241a(C6634b c6634b, C6637d c6637d) throws Throwable {
        int iNextInt;
        Random random = f5773b;
        synchronized (random) {
            iNextInt = random.nextInt() & 255;
        }
        byte[] bArrM5251a = m5251a(C6632b.m5246a(c6634b.f5776a, iNextInt));
        if (bArrM5251a != null) {
            return C6632b.m5247a(bArrM5251a, iNextInt, c6634b.f5776a);
        }
        throw new C6630a(c6634b.f5776a, "cant get answer");
    }

    public C6633c(InetAddress inetAddress, int i10) {
        this.f5774a = inetAddress;
        this.f5775c = i10;
    }

    /* renamed from: a */
    private byte[] m5251a(byte[] bArr) throws Throwable {
        DatagramSocket datagramSocket;
        DatagramSocket datagramSocket2 = null;
        try {
            datagramSocket = new DatagramSocket();
        } catch (Throwable th) {
            th = th;
        }
        try {
            DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length, this.f5774a, 53);
            datagramSocket.setSoTimeout(this.f5775c * 1000);
            datagramSocket.send(datagramPacket);
            DatagramPacket datagramPacket2 = new DatagramPacket(new byte[1500], 1500);
            datagramSocket.receive(datagramPacket2);
            byte[] data = datagramPacket2.getData();
            datagramSocket.close();
            return data;
        } catch (Throwable th2) {
            th = th2;
            datagramSocket2 = datagramSocket;
            if (datagramSocket2 != null) {
                datagramSocket2.close();
            }
            throw th;
        }
    }
}
