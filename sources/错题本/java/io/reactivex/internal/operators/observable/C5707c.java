package io.reactivex.internal.operators.observable;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.zykj.mistake.activity.SketchPlayerActivity;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import okhttp3.Protocol;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okio.Buffer;
import p009a8.InterfaceC0028f;
import p024c0.InterfaceC3205b;
import p055f0.C5501f;
import p055f0.C5519x;
import p055f0.InterfaceC5511p;
import p055f0.InterfaceC5512q;
import p062g0.C5537b;
import p077i0.InterfaceC5656l;
import p077i0.InterfaceC5669y;
import p127o0.InterfaceC6259e;
import p127o0.InterfaceC6260f;
import p139p7.AbstractC6396c;

/* renamed from: io.reactivex.internal.operators.observable.c */
/* loaded from: classes.dex */
public class C5707c implements InterfaceC0028f, InterfaceC3205b, InterfaceC5512q, InterfaceC5656l, InterfaceC5669y, InterfaceC6259e {
    /* renamed from: j */
    public static final String m5076j(byte[] bArr, byte[][] bArr2, int i) {
        int i8;
        boolean z8;
        int i9;
        int i10;
        byte[] bArr3 = PublicSuffixDatabase.f10195e;
        int length = bArr.length;
        int i11 = 0;
        while (i11 < length) {
            int i12 = (i11 + length) / 2;
            while (i12 > -1 && bArr[i12] != 10) {
                i12--;
            }
            int i13 = i12 + 1;
            int i14 = 1;
            while (true) {
                i8 = i13 + i14;
                if (bArr[i8] == 10) {
                    break;
                }
                i14++;
            }
            int i15 = i8 - i13;
            int i16 = i;
            boolean z9 = false;
            int i17 = 0;
            int i18 = 0;
            while (true) {
                if (z9) {
                    i9 = 46;
                    z8 = false;
                } else {
                    byte b6 = bArr2[i16][i17];
                    byte[] bArr4 = AbstractC6396c.f10486a;
                    int i19 = b6 & 255;
                    z8 = z9;
                    i9 = i19;
                }
                byte b9 = bArr[i13 + i18];
                byte[] bArr5 = AbstractC6396c.f10486a;
                i10 = i9 - (b9 & 255);
                if (i10 != 0) {
                    break;
                }
                i18++;
                i17++;
                if (i18 == i15) {
                    break;
                }
                if (bArr2[i16].length != i17) {
                    z9 = z8;
                } else {
                    if (i16 == bArr2.length - 1) {
                        break;
                    }
                    i16++;
                    i17 = -1;
                    z9 = true;
                }
            }
            if (i10 >= 0) {
                if (i10 <= 0) {
                    int i20 = i15 - i18;
                    int length2 = bArr2[i16].length - i17;
                    int length3 = bArr2.length;
                    for (int i21 = i16 + 1; i21 < length3; i21++) {
                        length2 += bArr2[i21].length;
                    }
                    if (length2 >= i20) {
                        if (length2 <= i20) {
                            Charset UTF_8 = StandardCharsets.UTF_8;
                            AbstractC5830k.m5329f(UTF_8, "UTF_8");
                            return new String(bArr, i13, i15, UTF_8);
                        }
                    }
                }
                i11 = i8 + 1;
            }
            length = i12;
        }
        return null;
    }

    /* renamed from: k */
    public static ArrayList m5077k(List protocols) {
        AbstractC5830k.m5330g(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((Protocol) obj) != Protocol.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC5806u.m5277p(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((Protocol) obj2).getProtocol());
        }
        return arrayList2;
    }

    /* renamed from: m */
    public static byte[] m5078m(List protocols) {
        AbstractC5830k.m5330g(protocols, "protocols");
        Buffer buffer = new Buffer();
        ArrayList arrayListM5077k = m5077k(protocols);
        int size = arrayListM5077k.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM5077k.get(i);
            i++;
            String str = (String) obj;
            buffer.writeByte(str.length());
            buffer.writeUtf8(str);
        }
        return buffer.readByteArray();
    }

    /* renamed from: n */
    public static boolean m5079n() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    /* renamed from: o */
    public static void m5080o(Context context, String url, Integer num, Integer num2) {
        AbstractC5830k.m5330g(url, "url");
        Bundle bundle = new Bundle();
        bundle.putString("url", url);
        if (num != null) {
            bundle.putInt("examId", num.intValue());
        }
        if (num2 != null) {
            bundle.putInt("questionId", num2.intValue());
        }
        Intent intent = new Intent(context, (Class<?>) SketchPlayerActivity.class);
        intent.putExtras(bundle);
        if (context != null) {
            context.startActivity(intent);
        }
    }

    @Override // p024c0.InterfaceC3205b
    /* renamed from: a */
    public Bitmap mo2141a(int i, int i8, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i8, config);
    }

    /* renamed from: b */
    public void mo2142b(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // p127o0.InterfaceC6259e
    /* renamed from: d */
    public void mo5081d(InterfaceC6260f interfaceC6260f) {
        interfaceC6260f.onStart();
    }

    @Override // p077i0.InterfaceC5669y
    /* renamed from: g */
    public void mo4999g(MediaMetadataRetriever mediaMetadataRetriever, Object obj) throws IllegalArgumentException {
        mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    @Override // p024c0.InterfaceC3205b
    /* renamed from: i */
    public Bitmap mo2145i(int i, int i8, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i8, config);
    }

    @Override // p055f0.InterfaceC5512q
    /* renamed from: r */
    public InterfaceC5511p mo2140r(C5519x c5519x) {
        return new C5537b(c5519x.m4889a(C5501f.class, InputStream.class));
    }

    @Override // p024c0.InterfaceC3205b
    /* renamed from: e */
    public void mo2144e() {
    }

    @Override // p077i0.InterfaceC5656l
    /* renamed from: l */
    public void mo118l() {
    }

    @Override // p024c0.InterfaceC3205b
    /* renamed from: c */
    public void mo2143c(int i) {
    }

    @Override // p127o0.InterfaceC6259e
    /* renamed from: f */
    public void mo5082f(InterfaceC6260f interfaceC6260f) {
    }

    @Override // p077i0.InterfaceC5656l
    /* renamed from: h */
    public void mo114h(Bitmap bitmap, InterfaceC3205b interfaceC3205b) {
    }
}
