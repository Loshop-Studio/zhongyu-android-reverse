package p152t;

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
import p148s.C3365c;
import p176z.C3504f;

/* renamed from: t.l */
/* loaded from: classes.dex */
public class C3393l extends C3394m {
    @Override // p152t.C3394m
    /* renamed from: a */
    public Typeface mo10338a(Context context, C3365c.b bVar, Resources resources, int i4) throws IOException {
        try {
            C3365c.c[] cVarArrM10212a = bVar.m10212a();
            int length = cVarArrM10212a.length;
            FontFamily.Builder builder = null;
            int i5 = 0;
            while (true) {
                int i6 = 1;
                if (i5 >= length) {
                    break;
                }
                C3365c.c cVar = cVarArrM10212a[i5];
                try {
                    Font.Builder weight = new Font.Builder(resources, cVar.m10214b()).setWeight(cVar.m10217e());
                    if (!cVar.m10218f()) {
                        i6 = 0;
                    }
                    Font fontBuild = weight.setSlant(i6).setTtcIndex(cVar.m10215c()).setFontVariationSettings(cVar.m10216d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
                i5++;
            }
            if (builder == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i4 & 1) != 0 ? 700 : 400, (i4 & 2) != 0 ? 1 : 0)).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p152t.C3394m
    /* renamed from: b */
    public Typeface mo10339b(Context context, CancellationSignal cancellationSignal, C3504f.b[] bVarArr, int i4) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = bVarArr.length;
            FontFamily.Builder builder = null;
            int i5 = 0;
            while (true) {
                int i6 = 1;
                if (i5 >= length) {
                    if (builder == null) {
                        return null;
                    }
                    return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i4 & 1) != 0 ? 700 : 400, (i4 & 2) != 0 ? 1 : 0)).build();
                }
                C3504f.b bVar = bVarArr[i5];
                try {
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(bVar.m10674d(), "r", cancellationSignal);
                } catch (IOException unused) {
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                    }
                    i5++;
                } else {
                    try {
                        Font.Builder weight = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(bVar.m10675e());
                        if (!bVar.m10676f()) {
                            i6 = 0;
                        }
                        Font fontBuild = weight.setSlant(i6).setTtcIndex(bVar.m10673c()).build();
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
                i5++;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p152t.C3394m
    /* renamed from: d */
    public Typeface mo10350d(Context context, Resources resources, int i4, String str, int i5) throws IOException {
        try {
            Font fontBuild = new Font.Builder(resources, i4).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p152t.C3394m
    /* renamed from: f */
    protected C3504f.b mo10359f(C3504f.b[] bVarArr, int i4) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
