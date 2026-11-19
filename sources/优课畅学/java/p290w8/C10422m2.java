package p290w8;

import java.util.Set;
import kotlin.jvm.internal.AbstractC9133u;
import p268u8.AbstractC10218n;
import p268u8.InterfaceC10210f;

/* renamed from: w8.m2 */
/* loaded from: classes5.dex */
public final class C10422m2 implements InterfaceC10210f, InterfaceC10423n {

    /* renamed from: a */
    public final InterfaceC10210f f20740a;

    /* renamed from: b */
    public final String f20741b;

    /* renamed from: c */
    public final Set f20742c;

    public C10422m2(InterfaceC10210f original) {
        AbstractC9133u.m16133g(original, "original");
        this.f20740a = original;
        this.f20741b = original.mo19089f() + '?';
        this.f20742c = AbstractC10465x1.m19564a(original);
    }

    @Override // p290w8.InterfaceC10423n
    /* renamed from: a */
    public Set mo19097a() {
        return this.f20742c;
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: b */
    public boolean mo19085b() {
        return true;
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: c */
    public int mo19086c() {
        return this.f20740a.mo19086c();
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: d */
    public String mo19087d(int i10) {
        return this.f20740a.mo19087d(i10);
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: e */
    public InterfaceC10210f mo19088e(int i10) {
        return this.f20740a.mo19088e(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10422m2) && AbstractC9133u.m16128b(this.f20740a, ((C10422m2) obj).f20740a);
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: f */
    public String mo19089f() {
        return this.f20741b;
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: g */
    public boolean mo19090g(int i10) {
        return this.f20740a.mo19090g(i10);
    }

    @Override // p268u8.InterfaceC10210f
    public AbstractC10218n getKind() {
        return this.f20740a.getKind();
    }

    /* renamed from: h */
    public final InterfaceC10210f m19470h() {
        return this.f20740a;
    }

    public int hashCode() {
        return this.f20740a.hashCode() * 31;
    }

    @Override // p268u8.InterfaceC10210f
    public boolean isInline() {
        return this.f20740a.isInline();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20740a);
        sb.append('?');
        return sb.toString();
    }
}
