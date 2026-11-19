package p118m7;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: m7.n */
/* loaded from: classes4.dex */
public final class C6157n extends AbstractC6122b1 {

    /* renamed from: a */
    public char[] f9831a;

    /* renamed from: b */
    public int f9832b;

    @Override // p118m7.AbstractC6122b1
    /* renamed from: a */
    public final Object mo5823a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f9831a, this.f9832b);
        AbstractC5830k.m5329f(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }

    @Override // p118m7.AbstractC6122b1
    /* renamed from: b */
    public final void mo5824b(int i) {
        char[] cArr = this.f9831a;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i);
            AbstractC5830k.m5329f(cArrCopyOf, "copyOf(...)");
            this.f9831a = cArrCopyOf;
        }
    }

    @Override // p118m7.AbstractC6122b1
    /* renamed from: d */
    public final int mo5825d() {
        return this.f9832b;
    }
}
