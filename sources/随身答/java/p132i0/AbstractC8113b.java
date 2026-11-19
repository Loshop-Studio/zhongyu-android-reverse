package p132i0;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import p132i0.InterfaceC8115d;

/* renamed from: i0.b */
/* loaded from: classes3.dex */
public abstract class AbstractC8113b implements InterfaceC8115d {

    /* renamed from: a */
    public final String f13866a;

    /* renamed from: b */
    public final AssetManager f13867b;

    /* renamed from: c */
    public Object f13868c;

    public AbstractC8113b(AssetManager assetManager, String str) {
        this.f13867b = assetManager;
        this.f13866a = str;
    }

    @Override // p132i0.InterfaceC8115d
    /* renamed from: b */
    public void mo12983b() {
        Object obj = this.f13868c;
        if (obj == null) {
            return;
        }
        try {
            mo12984c(obj);
        } catch (IOException unused) {
        }
    }

    /* renamed from: c */
    public abstract void mo12984c(Object obj);

    @Override // p132i0.InterfaceC8115d
    /* renamed from: d */
    public void mo12985d(Priority priority, InterfaceC8115d.a aVar) {
        try {
            Object objMo12987f = mo12987f(this.f13867b, this.f13866a);
            this.f13868c = objMo12987f;
            aVar.mo3155f(objMo12987f);
        } catch (IOException e10) {
            Log.isLoggable("AssetPathFetcher", 3);
            aVar.mo3154c(e10);
        }
    }

    @Override // p132i0.InterfaceC8115d
    /* renamed from: e */
    public DataSource mo12986e() {
        return DataSource.LOCAL;
    }

    /* renamed from: f */
    public abstract Object mo12987f(AssetManager assetManager, String str);

    @Override // p132i0.InterfaceC8115d
    public void cancel() {
    }
}
