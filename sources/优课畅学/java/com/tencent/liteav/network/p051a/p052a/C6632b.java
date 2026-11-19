package com.tencent.liteav.network.p051a.p052a;

import com.tencent.liteav.network.p051a.C6630a;
import com.tencent.liteav.network.p051a.C6638e;
import com.tencent.liteav.network.p051a.p053b.C6635a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashSet;

/* renamed from: com.tencent.liteav.network.a.a.b */
/* loaded from: classes4.dex */
public final class C6632b {
    /* renamed from: a */
    public static byte[] m5246a(String str, int i10) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        C6635a c6635a = new C6635a();
        c6635a.m5253a(8);
        try {
            dataOutputStream.writeShort((short) i10);
            dataOutputStream.writeShort((short) c6635a.m5252a());
            dataOutputStream.writeShort(1);
            dataOutputStream.writeShort(0);
            dataOutputStream.writeShort(0);
            dataOutputStream.writeShort(0);
            dataOutputStream.flush();
            m5249b(byteArrayOutputStream, str);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    /* renamed from: b */
    private static void m5249b(OutputStream outputStream, String str) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        m5245a(outputStream, str);
        dataOutputStream.writeShort(1);
        dataOutputStream.writeShort(1);
    }

    /* renamed from: b */
    private static C6638e[] m5250b(DataInputStream dataInputStream, byte[] bArr, int i10) {
        C6638e[] c6638eArr = new C6638e[i10];
        int i11 = 0;
        while (true) {
            int i12 = i10 - 1;
            if (i10 <= 0) {
                return c6638eArr;
            }
            c6638eArr[i11] = m5248b(dataInputStream, bArr);
            i11++;
            i10 = i12;
        }
    }

    /* renamed from: b */
    private static C6638e m5248b(DataInputStream dataInputStream, byte[] bArr) throws IOException {
        String hostAddress;
        m5242a(dataInputStream, bArr);
        int unsignedShort = dataInputStream.readUnsignedShort();
        dataInputStream.readUnsignedShort();
        long unsignedShort2 = (dataInputStream.readUnsignedShort() << 16) + dataInputStream.readUnsignedShort();
        int unsignedShort3 = dataInputStream.readUnsignedShort();
        if (unsignedShort == 1) {
            byte[] bArr2 = new byte[4];
            dataInputStream.readFully(bArr2);
            hostAddress = InetAddress.getByAddress(bArr2).getHostAddress();
        } else if (unsignedShort != 5) {
            for (int i10 = 0; i10 < unsignedShort3; i10++) {
                dataInputStream.readByte();
            }
            hostAddress = null;
        } else {
            hostAddress = m5242a(dataInputStream, bArr);
        }
        if (hostAddress != null) {
            return new C6638e(hostAddress, unsignedShort, (int) unsignedShort2, System.currentTimeMillis() / 1000);
        }
        throw new UnknownHostException("no record");
    }

    /* renamed from: a */
    private static void m5245a(OutputStream outputStream, String str) throws IOException {
        for (String str2 : str.split("[.。．｡]")) {
            byte[] bytes = IDN.toASCII(str2).getBytes();
            outputStream.write(bytes.length);
            outputStream.write(bytes, 0, bytes.length);
        }
        outputStream.write(0);
    }

    /* renamed from: a */
    public static C6638e[] m5247a(byte[] bArr, int i10, String str) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        int unsignedShort = dataInputStream.readUnsignedShort();
        if (unsignedShort == i10) {
            int unsignedShort2 = dataInputStream.readUnsignedShort();
            boolean z10 = ((unsignedShort2 >> 8) & 1) == 1;
            if (((unsignedShort2 >> 7) & 1) == 1 && z10) {
                int unsignedShort3 = dataInputStream.readUnsignedShort();
                int unsignedShort4 = dataInputStream.readUnsignedShort();
                dataInputStream.readUnsignedShort();
                dataInputStream.readUnsignedShort();
                m5244a(dataInputStream, bArr, unsignedShort3);
                return m5250b(dataInputStream, bArr, unsignedShort4);
            }
            throw new C6630a(str, "the dns server cant support recursion ");
        }
        throw new C6630a(str, "the answer id " + unsignedShort + " is not match " + i10);
    }

    /* renamed from: a */
    private static String m5242a(DataInputStream dataInputStream, byte[] bArr) throws IOException {
        int unsignedByte = dataInputStream.readUnsignedByte();
        if ((unsignedByte & 192) == 192) {
            int unsignedByte2 = ((unsignedByte & 63) << 8) + dataInputStream.readUnsignedByte();
            HashSet hashSet = new HashSet();
            hashSet.add(Integer.valueOf(unsignedByte2));
            return m5243a(bArr, unsignedByte2, (HashSet<Integer>) hashSet);
        }
        if (unsignedByte == 0) {
            return "";
        }
        byte[] bArr2 = new byte[unsignedByte];
        dataInputStream.readFully(bArr2);
        String unicode = IDN.toUnicode(new String(bArr2));
        String strM5242a = m5242a(dataInputStream, bArr);
        if (strM5242a.length() <= 0) {
            return unicode;
        }
        return unicode + "." + strM5242a;
    }

    /* renamed from: a */
    private static String m5243a(byte[] bArr, int i10, HashSet<Integer> hashSet) throws C6630a {
        int i11 = bArr[i10];
        int i12 = i11 & 255;
        if ((i11 & 192) == 192) {
            int i13 = ((i11 & 63) << 8) + (bArr[i10 + 1] & 255);
            if (!hashSet.contains(Integer.valueOf(i13))) {
                hashSet.add(Integer.valueOf(i13));
                return m5243a(bArr, i13, hashSet);
            }
            throw new C6630a("", "Cyclic offsets detected.");
        }
        if (i12 == 0) {
            return "";
        }
        int i14 = i10 + 1;
        String str = new String(bArr, i14, i12);
        String strM5243a = m5243a(bArr, i14 + i12, hashSet);
        if (strM5243a.length() <= 0) {
            return str;
        }
        return str + "." + strM5243a;
    }

    /* renamed from: a */
    private static void m5244a(DataInputStream dataInputStream, byte[] bArr, int i10) throws IOException {
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                return;
            }
            m5242a(dataInputStream, bArr);
            dataInputStream.readUnsignedShort();
            dataInputStream.readUnsignedShort();
            i10 = i11;
        }
    }
}
