package p304y0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.github.barteksc.pdfviewer.PDFView;
import p002a1.C0020a;

/* renamed from: y0.a */
/* loaded from: classes3.dex */
public class C10599a implements InterfaceC10600b {

    /* renamed from: b */
    public static final String f21001b = "a";

    /* renamed from: a */
    public PDFView f21002a;

    public C10599a(PDFView pDFView) {
        this.f21002a = pDFView;
    }

    @Override // p304y0.InterfaceC10600b
    /* renamed from: a */
    public void mo19766a(C0020a c0020a) {
        String strM4105c = c0020a.m44a().m4105c();
        Integer numM4104b = c0020a.m44a().m4104b();
        if (strM4105c != null && !strM4105c.isEmpty()) {
            m19768c(strM4105c);
        } else if (numM4104b != null) {
            m19767b(numM4104b.intValue());
        }
    }

    /* renamed from: b */
    public final void m19767b(int i10) {
        this.f21002a.m3560E(i10);
    }

    /* renamed from: c */
    public final void m19768c(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        Context context = this.f21002a.getContext();
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
            return;
        }
        Log.w(f21001b, "No activity found for URI: " + str);
    }
}
