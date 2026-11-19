package kotlinx.serialization.json.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p101k7.InterfaceC5765g;
import p152r6.InterfaceC6473e;

@Metadata(m5111k = 3, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
final /* synthetic */ class JsonElementMarker$origin$1 extends FunctionReferenceImpl implements InterfaceC6473e {
    public JsonElementMarker$origin$1(Object obj) {
        super(2, obj, C6028i.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
    }

    public final Boolean invoke(InterfaceC5765g p0, int i) {
        AbstractC5830k.m5330g(p0, "p0");
        C6028i c6028i = (C6028i) this.receiver;
        c6028i.getClass();
        boolean z8 = !p0.mo5106i(i) && p0.mo5104g(i).mo5099b();
        c6028i.f9555b = z8;
        return Boolean.valueOf(z8);
    }

    @Override // p152r6.InterfaceC6473e
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((InterfaceC5765g) obj, ((Number) obj2).intValue());
    }
}
