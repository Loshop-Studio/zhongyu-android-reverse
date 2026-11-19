package p055f0;

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import p172u0.C6610b;
import p202y.C6763f;
import p208z.C6805j;

/* renamed from: f0.b */
/* loaded from: classes2.dex */
public final class C5493b implements InterfaceC5511p {

    /* renamed from: a */
    public final /* synthetic */ int f8494a = 0;

    /* renamed from: b */
    public final Object f8495b;

    /* renamed from: c */
    public final Object f8496c;

    public C5493b(Resources resources, InterfaceC5511p interfaceC5511p) {
        this.f8496c = resources;
        this.f8495b = interfaceC5511p;
    }

    @Override // p055f0.InterfaceC5511p
    /* renamed from: a */
    public final boolean mo4873a(Object obj) {
        switch (this.f8494a) {
            case 0:
                Uri uri = (Uri) obj;
                return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
            default:
                return true;
        }
    }

    @Override // p055f0.InterfaceC5511p
    /* renamed from: b */
    public final C5510o mo4874b(Object obj, int i, int i8, C6763f c6763f) {
        C6805j c6805j;
        Uri uri;
        switch (this.f8494a) {
            case 0:
                Uri uri2 = (Uri) obj;
                String strSubstring = uri2.toString().substring(22);
                C6610b c6610b = new C6610b(uri2);
                AssetManager assetManager = (AssetManager) this.f8495b;
                switch (((C5491a) this.f8496c).f8490a) {
                    case 0:
                        c6805j = new C6805j(assetManager, strSubstring, 0);
                        break;
                    default:
                        c6805j = new C6805j(assetManager, strSubstring, 1);
                        break;
                }
                return new C5510o(c6610b, c6805j);
            default:
                Integer num = (Integer) obj;
                Resources resources = (Resources) this.f8496c;
                try {
                    uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num.intValue()) + '/' + resources.getResourceTypeName(num.intValue()) + '/' + resources.getResourceEntryName(num.intValue()));
                } catch (Resources.NotFoundException e) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num, e);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((InterfaceC5511p) this.f8495b).mo4874b(uri, i, i8, c6763f);
        }
    }

    public C5493b(AssetManager assetManager, C5491a c5491a) {
        this.f8495b = assetManager;
        this.f8496c = c5491a;
    }
}
