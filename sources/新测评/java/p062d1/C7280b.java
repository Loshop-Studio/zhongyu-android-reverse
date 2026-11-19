package p062d1;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: d1.b */
/* loaded from: classes3.dex */
public final class C7280b {

    /* renamed from: a */
    public final List f11723a = new ArrayList();

    /* renamed from: a */
    public synchronized void m11533a(ImageHeaderParser imageHeaderParser) {
        this.f11723a.add(imageHeaderParser);
    }

    /* renamed from: b */
    public synchronized List m11534b() {
        return this.f11723a;
    }
}
