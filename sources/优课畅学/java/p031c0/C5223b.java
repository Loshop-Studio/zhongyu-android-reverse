package p031c0;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c0.b */
/* loaded from: classes3.dex */
public final class C5223b {

    /* renamed from: a */
    public final List f2301a = new ArrayList();

    /* renamed from: a */
    public synchronized void m2116a(ImageHeaderParser imageHeaderParser) {
        this.f2301a.add(imageHeaderParser);
    }

    /* renamed from: b */
    public synchronized List m2117b() {
        return this.f2301a;
    }
}
