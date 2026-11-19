package p271o4;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.shockwave.pdfium.C7519a;
import com.shockwave.pdfium.PdfiumCore;
import java.io.File;

/* renamed from: o4.b */
/* loaded from: classes5.dex */
public class C10443b implements InterfaceC10442a {

    /* renamed from: a */
    public File f24844a;

    public C10443b(File file) {
        this.f24844a = file;
    }

    @Override // p271o4.InterfaceC10442a
    /* renamed from: a */
    public C7519a mo21824a(Context context, PdfiumCore pdfiumCore, String str) {
        return pdfiumCore.m9711j(ParcelFileDescriptor.open(this.f24844a, 268435456), str);
    }
}
