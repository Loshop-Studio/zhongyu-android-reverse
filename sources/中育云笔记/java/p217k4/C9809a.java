package p217k4;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.github.barteksc.pdfviewer.PDFView;
import p246m4.C10198a;

/* renamed from: k4.a */
/* loaded from: classes5.dex */
public class C9809a implements InterfaceC9810b {

    /* renamed from: b */
    public static final String f23005b = "a";

    /* renamed from: a */
    public PDFView f23006a;

    public C9809a(PDFView pDFView) {
        this.f23006a = pDFView;
    }

    @Override // p217k4.InterfaceC9810b
    /* renamed from: a */
    public void mo19820a(C10198a c10198a) {
        String strM9718c = c10198a.m21298a().m9718c();
        Integer numM9717b = c10198a.m21298a().m9717b();
        if (strM9718c != null && !strM9718c.isEmpty()) {
            m19822c(strM9718c);
        } else if (numM9717b != null) {
            m19821b(numM9717b.intValue());
        }
    }

    /* renamed from: b */
    public final void m19821b(int i10) {
        this.f23006a.m7851E(i10);
    }

    /* renamed from: c */
    public final void m19822c(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        Context context = this.f23006a.getContext();
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
            return;
        }
        Log.w(f23005b, "No activity found for URI: " + str);
    }
}
