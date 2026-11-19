package p174w0;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: w0.b */
/* loaded from: classes3.dex */
public final class C7804b {

    /* renamed from: a */
    public final List f10358a = new ArrayList();

    /* renamed from: a */
    public synchronized void m9384a(ImageHeaderParser imageHeaderParser) {
        this.f10358a.add(imageHeaderParser);
    }

    /* renamed from: b */
    public synchronized List m9385b() {
        return this.f10358a;
    }
}
