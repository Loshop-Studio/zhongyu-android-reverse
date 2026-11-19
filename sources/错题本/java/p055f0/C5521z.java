package p055f0;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;
import p202y.C6763f;

/* renamed from: f0.z */
/* loaded from: classes2.dex */
public final class C5521z implements InterfaceC5511p {

    /* renamed from: a */
    public final /* synthetic */ int f8555a;

    /* renamed from: b */
    public final InterfaceC5511p f8556b;

    public /* synthetic */ C5521z(InterfaceC5511p interfaceC5511p, int i) {
        this.f8555a = i;
        this.f8556b = interfaceC5511p;
    }

    @Override // p055f0.InterfaceC5511p
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo4873a(Object obj) {
        switch (this.f8555a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // p055f0.InterfaceC5511p
    /* renamed from: b */
    public final C5510o mo4874b(Object obj, int i, int i8, C6763f c6763f) {
        Uri uriFromFile;
        switch (this.f8555a) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uriFromFile = null;
                } else if (str.charAt(0) == '/') {
                    uriFromFile = Uri.fromFile(new File(str));
                } else {
                    Uri uri = Uri.parse(str);
                    uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str)) : uri;
                }
                if (uriFromFile == null) {
                    return null;
                }
                InterfaceC5511p interfaceC5511p = this.f8556b;
                if (interfaceC5511p.mo4873a(uriFromFile)) {
                    return interfaceC5511p.mo4874b(uriFromFile, i, i8, c6763f);
                }
                return null;
            default:
                return this.f8556b.mo4874b(new C5501f((URL) obj), i, i8, c6763f);
        }
    }
}
