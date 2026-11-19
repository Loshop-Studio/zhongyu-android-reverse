package p000a.p005b.p014h;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import p000a.p031h.p043j.C0254c;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.p045b0.C0253e;
import p000a.p031h.p043j.p045b0.InterfaceC0252d;

/* renamed from: a.b.h.o */
/* loaded from: classes.dex */
public class C0097o implements InterfaceC0252d {

    /* renamed from: a */
    public final /* synthetic */ View f723a;

    public C0097o(View view) {
        this.f723a = view;
    }

    /* renamed from: a */
    public boolean m366a(C0253e c0253e, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                c0253e.f1586a.mo836b();
                InputContentInfo inputContentInfo = (InputContentInfo) c0253e.f1586a.mo838d();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e2) {
                Log.w("ReceiveContent", "Can't insert content from IME; requestPermission() failed", e2);
                return false;
            }
        }
        C0254c.a aVar = new C0254c.a(new ClipData(c0253e.f1586a.mo835a(), new ClipData.Item(c0253e.f1586a.mo839e())), 2);
        aVar.f1599d = c0253e.f1586a.mo837c();
        aVar.f1600e = bundle;
        return C0266o.m871j(this.f723a, new C0254c(aVar)) == null;
    }
}
