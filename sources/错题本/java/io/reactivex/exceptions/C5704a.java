package io.reactivex.exceptions;

import coil3.network.AbstractC3315g;
import java.io.PrintStream;
import java.io.PrintWriter;

/* renamed from: io.reactivex.exceptions.a */
/* loaded from: classes3.dex */
public final class C5704a extends AbstractC3315g {

    /* renamed from: b */
    public final /* synthetic */ int f8995b;

    /* renamed from: c */
    public final Object f8996c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5704a(Object obj, int i) {
        super(6);
        this.f8995b = i;
        this.f8996c = obj;
    }

    @Override // coil3.network.AbstractC3315g
    /* renamed from: l */
    public final void mo2247l(String str) {
        switch (this.f8995b) {
            case 0:
                ((PrintStream) this.f8996c).println((Object) str);
                break;
            default:
                ((PrintWriter) this.f8996c).println((Object) str);
                break;
        }
    }
}
