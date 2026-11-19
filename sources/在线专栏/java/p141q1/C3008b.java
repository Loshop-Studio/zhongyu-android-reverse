package p141q1;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.shockwave.pdfium.C1671a;
import com.shockwave.pdfium.PdfiumCore;
import java.io.File;
import java.io.IOException;

/* renamed from: q1.b */
/* loaded from: classes.dex */
public class C3008b implements InterfaceC3007a {

    /* renamed from: a */
    private File f11669a;

    public C3008b(File file) {
        this.f11669a = file;
    }

    @Override // p141q1.InterfaceC3007a
    /* renamed from: a */
    public C1671a mo10109a(Context context, PdfiumCore pdfiumCore, String str) throws IOException {
        return pdfiumCore.m5727h(ParcelFileDescriptor.open(this.f11669a, 268435456), str);
    }
}
