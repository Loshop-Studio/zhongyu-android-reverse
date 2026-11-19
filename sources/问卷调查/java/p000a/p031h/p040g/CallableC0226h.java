package p000a.p031h.p040g;

import android.content.Context;
import java.util.concurrent.Callable;
import p000a.p031h.p040g.C0228j;

/* renamed from: a.h.g.h */
/* loaded from: classes.dex */
public class CallableC0226h implements Callable<C0228j.a> {

    /* renamed from: a */
    public final /* synthetic */ String f1501a;

    /* renamed from: b */
    public final /* synthetic */ Context f1502b;

    /* renamed from: c */
    public final /* synthetic */ C0223e f1503c;

    /* renamed from: d */
    public final /* synthetic */ int f1504d;

    public CallableC0226h(String str, Context context, C0223e c0223e, int i) {
        this.f1501a = str;
        this.f1502b = context;
        this.f1503c = c0223e;
        this.f1504d = i;
    }

    @Override // java.util.concurrent.Callable
    public C0228j.a call() {
        return C0228j.m795a(this.f1501a, this.f1502b, this.f1503c, this.f1504d);
    }
}
