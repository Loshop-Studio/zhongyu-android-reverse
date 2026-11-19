package p081k;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import p081k.InterfaceC3843d;

/* renamed from: k.b */
/* loaded from: classes2.dex */
public abstract class AbstractC3841b implements InterfaceC3843d {

    /* renamed from: a */
    public final String f4734a;

    /* renamed from: b */
    public final AssetManager f4735b;

    /* renamed from: c */
    public Object f4736c;

    public AbstractC3841b(AssetManager assetManager, String str) {
        this.f4735b = assetManager;
        this.f4734a = str;
    }

    @Override // p081k.InterfaceC3843d
    /* renamed from: b */
    public void mo5119b() {
        Object obj = this.f4736c;
        if (obj == null) {
            return;
        }
        try {
            mo5120c(obj);
        } catch (IOException unused) {
        }
    }

    /* renamed from: c */
    public abstract void mo5120c(Object obj);

    @Override // p081k.InterfaceC3843d
    public void cancel() {
    }

    @Override // p081k.InterfaceC3843d
    /* renamed from: d */
    public DataSource mo5121d() {
        return DataSource.LOCAL;
    }

    /* renamed from: e */
    public abstract Object mo5122e(AssetManager assetManager, String str);

    @Override // p081k.InterfaceC3843d
    /* renamed from: f */
    public void mo5123f(Priority priority, InterfaceC3843d.a aVar) {
        try {
            Object objMo5122e = mo5122e(this.f4735b, this.f4734a);
            this.f4736c = objMo5122e;
            aVar.mo1830e(objMo5122e);
        } catch (IOException e4) {
            Log.isLoggable("AssetPathFetcher", 3);
            aVar.mo1829c(e4);
        }
    }
}
