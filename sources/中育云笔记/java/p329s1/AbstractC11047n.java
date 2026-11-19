package p329s1;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: s1.n */
/* loaded from: classes3.dex */
public abstract class AbstractC11047n {
    /* renamed from: a */
    public static void m24483a(byte[] bArr, long j10, int i10) {
        AbstractC11045l.m24468e(bArr, "Buffer must be not null!");
        boolean z10 = false;
        AbstractC11045l.m24466c(j10 >= 0, "Data offset must be positive!");
        if (i10 >= 0 && i10 <= bArr.length) {
            z10 = true;
        }
        AbstractC11045l.m24466c(z10, "Length must be in range [0..buffer.length]");
    }

    /* renamed from: b */
    public static String m24484b(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            sb2.append(String.format("%02x", Byte.valueOf(b10)));
        }
        return sb2.toString();
    }

    /* renamed from: c */
    public static void m24485c(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
                AbstractC11039f.m24402b("Error closing resource", e10);
            }
        }
    }

    /* renamed from: d */
    public static String m24486d(String str) {
        try {
            return m24484b(MessageDigest.getInstance("MD5").digest(str.getBytes()));
        } catch (NoSuchAlgorithmException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* renamed from: e */
    public static String m24487e(String str) {
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("Error decoding url", e10);
        }
    }

    /* renamed from: f */
    public static String m24488f(String str) {
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("Error encoding url", e10);
        }
    }

    /* renamed from: g */
    public static String m24489g(String str) {
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (TextUtils.isEmpty(fileExtensionFromUrl)) {
            return null;
        }
        return singleton.getMimeTypeFromExtension(fileExtensionFromUrl);
    }
}
