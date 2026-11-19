package p280w2;

import android.content.Context;
import p210p2.AbstractC9318a;
import p260u2.AbstractC9666a;
import p270v2.AbstractC9754b;

/* renamed from: w2.i */
/* loaded from: classes4.dex */
public class C9809i extends AbstractC9803c {

    /* renamed from: f */
    public Context f17477f;

    public C9809i(Context context) {
        super("mac");
        this.f17477f = context;
    }

    @Override // p280w2.AbstractC9803c
    /* renamed from: i */
    public String mo16651i() {
        try {
            return AbstractC9754b.m16347B(this.f17477f);
        } catch (Exception e10) {
            if (AbstractC9666a.f17071c) {
                e10.printStackTrace();
            }
            AbstractC9318a.m15200b(this.f17477f, e10);
            return null;
        }
    }
}
