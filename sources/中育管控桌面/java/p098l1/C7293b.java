package p098l1;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.shockwave.pdfium.C5764a;
import com.shockwave.pdfium.PdfiumCore;
import java.io.File;

/* renamed from: l1.b */
/* loaded from: classes3.dex */
public class C7293b implements InterfaceC7292a {

    /* renamed from: a */
    public File f9276a;

    public C7293b(File file) {
        this.f9276a = file;
    }

    @Override // p098l1.InterfaceC7292a
    /* renamed from: a */
    public C5764a mo8292a(Context context, PdfiumCore pdfiumCore, String str) {
        return pdfiumCore.m3750h(ParcelFileDescriptor.open(this.f9276a, 268435456), str);
    }
}
