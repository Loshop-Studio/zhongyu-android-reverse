package p000a.p031h.p035d;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import p000a.p031h.p033c.p034b.C0196d;
import p000a.p031h.p033c.p034b.C0197e;
import p000a.p031h.p040g.C0230l;

/* renamed from: a.h.d.i */
/* loaded from: classes.dex */
public class C0210i extends C0212k {
    @Override // p000a.p031h.p035d.C0212k
    /* renamed from: a */
    public Typeface mo768a(Context context, C0196d c0196d, Resources resources, int i) throws IOException {
        try {
            C0197e[] c0197eArr = c0196d.f1430a;
            int length = c0197eArr.length;
            FontFamily.Builder builder = null;
            int i2 = 0;
            while (true) {
                int i3 = 1;
                if (i2 >= length) {
                    break;
                }
                C0197e c0197e = c0197eArr[i2];
                try {
                    Font.Builder weight = new Font.Builder(resources, c0197e.f1436f).setWeight(c0197e.f1432b);
                    if (!c0197e.f1433c) {
                        i3 = 0;
                    }
                    Font fontBuild = weight.setSlant(i3).setTtcIndex(c0197e.f1435e).setFontVariationSettings(c0197e.f1434d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
                i2++;
            }
            if (builder == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0)).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p000a.p031h.p035d.C0212k
    /* renamed from: b */
    public Typeface mo769b(Context context, CancellationSignal cancellationSignal, C0230l[] c0230lArr, int i) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = c0230lArr.length;
            FontFamily.Builder builder = null;
            int i2 = 0;
            while (true) {
                int i3 = 1;
                if (i2 >= length) {
                    if (builder == null) {
                        return null;
                    }
                    return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0)).build();
                }
                C0230l c0230l = c0230lArr[i2];
                try {
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(c0230l.f1514a, "r", cancellationSignal);
                } catch (IOException unused) {
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                    }
                    i2++;
                } else {
                    try {
                        Font.Builder weight = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(c0230l.f1516c);
                        if (!c0230l.f1517d) {
                            i3 = 0;
                        }
                        Font fontBuild = weight.setSlant(i3).setTtcIndex(c0230l.f1515b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(fontBuild);
                        } else {
                            builder.addFont(fontBuild);
                        }
                    } catch (Throwable th) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                parcelFileDescriptorOpenFileDescriptor.close();
                i2++;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p000a.p031h.p035d.C0212k
    /* renamed from: c */
    public Typeface mo782c(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // p000a.p031h.p035d.C0212k
    /* renamed from: d */
    public Typeface mo773d(Context context, Resources resources, int i, String str, int i2) throws IOException {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }
}
