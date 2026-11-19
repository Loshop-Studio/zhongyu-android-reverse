package p126o;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import coil3.C3351x;
import coil3.util.AbstractC3348l;
import kotlin.jvm.internal.AbstractC5830k;
import p154s.C6538l;

/* renamed from: o.a */
/* loaded from: classes2.dex */
public final class C6252a implements InterfaceC6254c {

    /* renamed from: a */
    public final /* synthetic */ int f10001a;

    @Override // p126o.InterfaceC6254c
    /* renamed from: a */
    public final String mo5855a(Object obj, C6538l c6538l) {
        switch (this.f10001a) {
            case 0:
                C3351x c3351x = (C3351x) obj;
                if (!AbstractC5830k.m5325b(c3351x.f2088c, "android.resource")) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(c3351x);
                sb.append(':');
                Configuration configuration = c6538l.f10894a.getResources().getConfiguration();
                Bitmap.Config[] configArr = AbstractC3348l.f2083a;
                sb.append(configuration.uiMode & 48);
                return sb.toString();
            default:
                return ((C3351x) obj).f2086a;
        }
    }
}
