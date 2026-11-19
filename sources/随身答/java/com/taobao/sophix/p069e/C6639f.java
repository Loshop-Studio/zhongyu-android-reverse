package com.taobao.sophix.p069e;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* renamed from: com.taobao.sophix.e.f */
/* loaded from: classes4.dex */
public class C6639f {

    /* renamed from: a */
    private static final char[] f5547a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static String m4893a(File file) throws Throwable {
        FileChannel fileChannel;
        MessageDigest messageDigest;
        FileInputStream fileInputStream;
        if (file == null || !file.exists() || !file.canRead() || file.length() == 0) {
            return "";
        }
        FileChannel channel = null;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
            fileInputStream = new FileInputStream(file);
        } catch (Exception e10) {
            e = e10;
            fileChannel = null;
        } catch (Throwable th) {
            th = th;
            fileChannel = null;
        }
        try {
            channel = fileInputStream.getChannel();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(102400);
            while (true) {
                int i9 = channel.read(byteBufferAllocate);
                if (i9 == -1) {
                    String strM4894a = m4894a(messageDigest.digest());
                    C6636c.m4870a(fileInputStream);
                    C6636c.m4870a(channel);
                    return strM4894a;
                }
                messageDigest.update(byteBufferAllocate.array(), 0, i9);
                byteBufferAllocate.position(0);
            }
        } catch (Exception e11) {
            e = e11;
            fileChannel = channel;
            channel = fileInputStream;
            try {
                C6638e.m4887b("Md5Util", "getFileMD5", e, new Object[0]);
                C6636c.m4870a(channel);
                C6636c.m4870a(fileChannel);
                return "";
            } catch (Throwable th2) {
                th = th2;
                C6636c.m4870a(channel);
                C6636c.m4870a(fileChannel);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileChannel = channel;
            channel = fileInputStream;
            C6636c.m4870a(channel);
            C6636c.m4870a(fileChannel);
            throw th;
        }
    }

    /* renamed from: a */
    private static String m4894a(byte[] bArr) {
        char[] cArr = new char[32];
        int i9 = 0;
        for (int i10 = 0; i10 < 16; i10++) {
            byte b10 = bArr[i10];
            int i11 = i9 + 1;
            char[] cArr2 = f5547a;
            cArr[i9] = cArr2[(b10 >>> 4) & 15];
            i9 += 2;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }
}
