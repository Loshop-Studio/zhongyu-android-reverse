package p308z0;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: z0.b */
/* loaded from: classes3.dex */
public final class C9982b {

    /* renamed from: a */
    public final List f17960a = new ArrayList();

    /* renamed from: a */
    public synchronized void m17274a(ImageHeaderParser imageHeaderParser) {
        this.f17960a.add(imageHeaderParser);
    }

    /* renamed from: b */
    public synchronized List m17275b() {
        return this.f17960a;
    }
}
