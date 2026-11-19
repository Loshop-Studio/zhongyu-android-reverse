package p214z6;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5830k;
import p152r6.InterfaceC6471c;

/* renamed from: z6.o */
/* loaded from: classes2.dex */
public final class C6837o implements InterfaceC6830h {

    /* renamed from: a */
    public final /* synthetic */ int f11587a;

    /* renamed from: b */
    public final InterfaceC6830h f11588b;

    /* renamed from: c */
    public final InterfaceC6471c f11589c;

    public C6837o(InterfaceC6830h sequence, InterfaceC6471c interfaceC6471c, int i) {
        this.f11587a = i;
        switch (i) {
            case 1:
                AbstractC5830k.m5330g(sequence, "sequence");
                this.f11588b = sequence;
                this.f11589c = interfaceC6471c;
                break;
            default:
                this.f11588b = sequence;
                this.f11589c = interfaceC6471c;
                break;
        }
    }

    @Override // p214z6.InterfaceC6830h
    public final Iterator iterator() {
        switch (this.f11587a) {
            case 0:
                return new C6827e(this);
            default:
                return new C6838p(this);
        }
    }
}
