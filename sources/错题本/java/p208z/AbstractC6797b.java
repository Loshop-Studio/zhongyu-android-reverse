package p208z;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: z.b */
/* loaded from: classes2.dex */
public abstract class AbstractC6797b implements InterfaceC6800e {

    /* renamed from: a */
    public final /* synthetic */ int f11465a;

    /* renamed from: b */
    public Object f11466b;

    /* renamed from: c */
    public final Comparable f11467c;

    /* renamed from: d */
    public final Object f11468d;

    public /* synthetic */ AbstractC6797b(int i, Comparable comparable, Object obj) {
        this.f11465a = i;
        this.f11468d = obj;
        this.f11467c = comparable;
    }

    @Override // p208z.InterfaceC6800e
    /* renamed from: a */
    public final void mo21a() {
        switch (this.f11465a) {
            case 0:
                Object obj = this.f11466b;
                if (obj != null) {
                    try {
                        mo6462g(obj);
                        break;
                    } catch (IOException unused) {
                        return;
                    }
                }
                break;
            default:
                Object obj2 = this.f11466b;
                if (obj2 != null) {
                    try {
                        mo6462g(obj2);
                        break;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // p208z.InterfaceC6800e
    public final void cancel() {
        int i = this.f11465a;
    }

    @Override // p208z.InterfaceC6800e
    /* renamed from: d */
    public final DataSource mo23d() {
        switch (this.f11465a) {
        }
        return DataSource.LOCAL;
    }

    @Override // p208z.InterfaceC6800e
    /* renamed from: e */
    public final void mo24e(Priority priority, InterfaceC6799d interfaceC6799d) {
        switch (this.f11465a) {
            case 0:
                try {
                    Object objMo6466i = mo6466i((AssetManager) this.f11468d, (String) this.f11467c);
                    this.f11466b = objMo6466i;
                    interfaceC6799d.mo121o(objMo6466i);
                    break;
                } catch (IOException e) {
                    if (Log.isLoggable("AssetPathFetcher", 3)) {
                        Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
                    }
                    interfaceC6799d.mo109c(e);
                    return;
                }
            default:
                try {
                    Object objMo6463h = mo6463h((ContentResolver) this.f11468d, (Uri) this.f11467c);
                    this.f11466b = objMo6463h;
                    interfaceC6799d.mo121o(objMo6463h);
                    break;
                } catch (FileNotFoundException e4) {
                    if (Log.isLoggable("LocalUriFetcher", 3)) {
                        Log.d("LocalUriFetcher", "Failed to open Uri", e4);
                    }
                    interfaceC6799d.mo109c(e4);
                }
        }
    }

    /* renamed from: g */
    public abstract void mo6462g(Object obj);

    /* renamed from: h */
    public abstract Object mo6463h(ContentResolver contentResolver, Uri uri);

    /* renamed from: i */
    public abstract Object mo6466i(AssetManager assetManager, String str);

    /* renamed from: c */
    private final void m6464c() {
    }

    /* renamed from: f */
    private final void m6465f() {
    }
}
