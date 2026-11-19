package p280w2;

import android.content.Context;
import com.umeng.commonsdk.config.C6780a;
import p082d3.AbstractC7739a;

/* renamed from: w2.n */
/* loaded from: classes4.dex */
public class C9814n extends AbstractC9803c {

    /* renamed from: f */
    public Context f17483f;

    public C9814n(Context context) {
        super("utdid");
        this.f17483f = context;
    }

    @Override // p280w2.AbstractC9803c
    /* renamed from: i */
    public String mo16651i() {
        try {
            if (C6780a.m6260e("header_tracking_utdid")) {
                return (String) AbstractC7739a.class.getMethod("getUtdid", Context.class).invoke(null, this.f17483f);
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
