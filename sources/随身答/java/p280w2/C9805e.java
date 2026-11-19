package p280w2;

import android.content.Context;
import com.umeng.commonsdk.config.C6780a;
import p270v2.AbstractC9759g;

/* renamed from: w2.e */
/* loaded from: classes4.dex */
public class C9805e extends AbstractC9803c {

    /* renamed from: f */
    public Context f17464f;

    public C9805e(Context context) {
        super("idfa");
        this.f17464f = context;
    }

    @Override // p280w2.AbstractC9803c
    /* renamed from: i */
    public String mo16651i() {
        String strM16436a = C6780a.m6260e("header_tracking_idfa") ? AbstractC9759g.m16436a(this.f17464f) : null;
        return strM16436a == null ? "" : strM16436a;
    }
}
