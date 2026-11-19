package com.taobao.sophix.p099e;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* renamed from: com.taobao.sophix.e.f */
/* loaded from: classes5.dex */
public class C7745f {

    /* renamed from: a */
    private static final char[] f13412a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static String m10405a(File file) throws Throwable {
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
                int i10 = channel.read(byteBufferAllocate);
                if (i10 == -1) {
                    String strM10406a = m10406a(messageDigest.digest());
                    C7742c.m10382a(fileInputStream);
                    C7742c.m10382a(channel);
                    return strM10406a;
                }
                messageDigest.update(byteBufferAllocate.array(), 0, i10);
                byteBufferAllocate.position(0);
            }
        } catch (Exception e11) {
            e = e11;
            fileChannel = channel;
            channel = fileInputStream;
            try {
                C7744e.m10399b("Md5Util", "getFileMD5", e, new Object[0]);
                C7742c.m10382a(channel);
                C7742c.m10382a(fileChannel);
                return "";
            } catch (Throwable th2) {
                th = th2;
                C7742c.m10382a(channel);
                C7742c.m10382a(fileChannel);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileChannel = channel;
            channel = fileInputStream;
            C7742c.m10382a(channel);
            C7742c.m10382a(fileChannel);
            throw th;
        }
    }

    /* renamed from: a */
    private static String m10406a(byte[] bArr) {
        char[] cArr = new char[32];
        int i10 = 0;
        for (int i11 = 0; i11 < 16; i11++) {
            byte b10 = bArr[i11];
            int i12 = i10 + 1;
            char[] cArr2 = f13412a;
            cArr[i10] = cArr2[(b10 >>> 4) & 15];
            i10 += 2;
            cArr[i12] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }
}
