package p000a.p031h.p040g;

import android.content.Context;
import java.util.concurrent.Callable;
import p000a.p031h.p040g.C0228j;

/* renamed from: a.h.g.f */
/* loaded from: classes.dex */
public class CallableC0224f implements Callable<C0228j.a> {

    /* renamed from: a */
    public final /* synthetic */ String f1496a;

    /* renamed from: b */
    public final /* synthetic */ Context f1497b;

    /* renamed from: c */
    public final /* synthetic */ C0223e f1498c;

    /* renamed from: d */
    public final /* synthetic */ int f1499d;

    public CallableC0224f(String str, Context context, C0223e c0223e, int i) {
        this.f1496a = str;
        this.f1497b = context;
        this.f1498c = c0223e;
        this.f1499d = i;
    }

    @Override // java.util.concurrent.Callable
    public C0228j.a call() {
        return C0228j.m795a(this.f1496a, this.f1497b, this.f1498c, this.f1499d);
    }
}
