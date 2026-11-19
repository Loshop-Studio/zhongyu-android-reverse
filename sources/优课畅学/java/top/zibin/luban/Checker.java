package top.zibin.luban;

import android.graphics.BitmapFactory;
import ga.InterfaceC8691b;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
enum Checker {
    SINGLE;


    /* renamed from: c */
    public static List f20215c;

    /* renamed from: a */
    public final byte[] f20217a = {-1, -40, -1};

    static {
        ArrayList arrayList = new ArrayList();
        f20215c = arrayList;
        arrayList.add(".jpg");
        f20215c.add(".jpeg");
        f20215c.add(".png");
        f20215c.add(".webp");
        f20215c.add(".gif");
    }

    Checker() {
    }

    /* renamed from: a */
    public String m18919a(InterfaceC8691b interfaceC8691b) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(interfaceC8691b.open(), null, options);
            return options.outMimeType.replace("image/", ".");
        } catch (Exception unused) {
            return ".jpg";
        }
    }

    /* renamed from: b */
    public int m18920b(InputStream inputStream) {
        return m18921c(m18926i(inputStream));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
    
        android.util.Log.e("Luban", "Invalid length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0061, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0062, code lost:
    
        r9 = 0;
        r1 = r2;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m18921c(byte[] r12) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.zibin.luban.Checker.m18921c(byte[]):int");
    }

    /* renamed from: d */
    public boolean m18922d(InputStream inputStream) {
        return m18923e(m18926i(inputStream));
    }

    /* renamed from: e */
    public final boolean m18923e(byte[] bArr) {
        if (bArr == null || bArr.length < 3) {
            return false;
        }
        return Arrays.equals(this.f20217a, new byte[]{bArr[0], bArr[1], bArr[2]});
    }

    /* renamed from: g */
    public boolean m18924g(int i10, String str) {
        if (i10 <= 0) {
            return true;
        }
        File file = new File(str);
        return file.exists() && file.length() > ((long) (i10 << 10));
    }

    /* renamed from: h */
    public final int m18925h(byte[] bArr, int i10, int i11, boolean z10) {
        int i12;
        if (z10) {
            i10 += i11 - 1;
            i12 = -1;
        } else {
            i12 = 1;
        }
        int i13 = 0;
        while (true) {
            int i14 = i11 - 1;
            if (i11 <= 0) {
                return i13;
            }
            i13 = (bArr[i10] & 255) | (i13 << 8);
            i10 += i12;
            i11 = i14;
        }
    }

    /* renamed from: i */
    public final byte[] m18926i(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                try {
                    int i10 = inputStream.read(bArr, 0, 4096);
                    if (i10 != -1) {
                        byteArrayOutputStream.write(bArr, 0, i10);
                    } else {
                        try {
                            break;
                        } catch (IOException unused) {
                        }
                    }
                } finally {
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused2) {
                    }
                }
            } catch (Exception unused3) {
                byte[] bArr2 = new byte[0];
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused4) {
                }
                return bArr2;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }
}
