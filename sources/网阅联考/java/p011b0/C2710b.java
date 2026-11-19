package p011b0;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: b0.b */
/* loaded from: classes2.dex */
public final class C2710b {

    /* renamed from: a */
    public final List f447a = new ArrayList();

    /* renamed from: a */
    public synchronized void m1487a(ImageHeaderParser imageHeaderParser) {
        this.f447a.add(imageHeaderParser);
    }

    /* renamed from: b */
    public synchronized List m1488b() {
        return this.f447a;
    }
}
