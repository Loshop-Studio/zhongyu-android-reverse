package p032c1;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.shockwave.pdfium.C6409a;
import com.shockwave.pdfium.PdfiumCore;
import java.io.File;

/* renamed from: c1.b */
/* loaded from: classes3.dex */
public class C5229b implements InterfaceC5228a {

    /* renamed from: a */
    public File f2315a;

    public C5229b(File file) {
        this.f2315a = file;
    }

    @Override // p032c1.InterfaceC5228a
    /* renamed from: a */
    public C6409a mo2133a(Context context, PdfiumCore pdfiumCore, String str) {
        return pdfiumCore.m4098j(ParcelFileDescriptor.open(this.f2315a, 268435456), str);
    }
}
