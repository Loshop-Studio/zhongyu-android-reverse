package p413y0;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: y0.b */
/* loaded from: classes3.dex */
public final class C11882b {

    /* renamed from: a */
    public final List f28189a = new ArrayList();

    /* renamed from: a */
    public synchronized void m26420a(ImageHeaderParser imageHeaderParser) {
        this.f28189a.add(imageHeaderParser);
    }

    /* renamed from: b */
    public synchronized List m26421b() {
        return this.f28189a;
    }
}
