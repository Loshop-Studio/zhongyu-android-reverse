package kotlin.text;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.InterfaceC5428d;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p214z6.C6829g;
import p214z6.InterfaceC6830h;

/* renamed from: kotlin.text.c */
/* loaded from: classes4.dex */
public final class C5842c implements InterfaceC6830h {

    /* renamed from: a */
    public final /* synthetic */ int f9244a = 0;

    /* renamed from: b */
    public final Object f9245b;

    /* renamed from: c */
    public final InterfaceC5428d f9246c;

    public C5842c(InterfaceC6469a getInitialValue, InterfaceC6471c getNextValue) {
        AbstractC5830k.m5330g(getInitialValue, "getInitialValue");
        AbstractC5830k.m5330g(getNextValue, "getNextValue");
        this.f9245b = getInitialValue;
        this.f9246c = getNextValue;
    }

    @Override // p214z6.InterfaceC6830h
    public final Iterator iterator() {
        switch (this.f9244a) {
            case 0:
                return new C5841b(this);
            default:
                return new C6829g(this);
        }
    }

    public C5842c(CharSequence input, InterfaceC6473e interfaceC6473e) {
        AbstractC5830k.m5330g(input, "input");
        this.f9245b = input;
        this.f9246c = interfaceC6473e;
    }
}
