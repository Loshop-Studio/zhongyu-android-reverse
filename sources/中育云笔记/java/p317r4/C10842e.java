package p317r4;

import android.content.Context;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p343t4.C11215c;

/* renamed from: r4.e */
/* loaded from: classes5.dex */
public final class C10842e {

    /* renamed from: a */
    public String f26154a;

    /* renamed from: c */
    public InputStream f26156c;

    /* renamed from: b */
    public C10839b f26155b = C10839b.f26148b;

    /* renamed from: d */
    public final Map f26157d = new HashMap();

    /* renamed from: e */
    public final List f26158e = new ArrayList();

    /* renamed from: a */
    public InterfaceC10841d m23328a(Context context) {
        return new C11215c(context, this.f26154a, this.f26155b, this.f26156c, this.f26157d, this.f26158e, null);
    }

    /* renamed from: b */
    public C10842e m23329b(InputStream inputStream) {
        this.f26156c = inputStream;
        return this;
    }
}
