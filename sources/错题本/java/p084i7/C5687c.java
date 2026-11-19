package p084i7;

import androidx.navigation.C2827b;
import kotlin.AbstractC5773a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import p101k7.InterfaceC5765g;
import p118m7.AbstractC6120b;
import p207y6.InterfaceC6779c;

/* renamed from: i7.c */
/* loaded from: classes4.dex */
public final class C5687c extends AbstractC6120b {

    /* renamed from: a */
    public final InterfaceC6779c f8861a;

    /* renamed from: b */
    public final EmptyList f8862b;

    /* renamed from: c */
    public final Object f8863c;

    public C5687c(InterfaceC6779c baseClass) {
        AbstractC5830k.m5330g(baseClass, "baseClass");
        this.f8861a = baseClass;
        this.f8862b = EmptyList.INSTANCE;
        this.f8863c = AbstractC5773a.m5116a(LazyThreadSafetyMode.PUBLICATION, new C2827b(this, 13));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d6.e, java.lang.Object] */
    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    public final InterfaceC5765g getDescriptor() {
        return (InterfaceC5765g) this.f8863c.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f8861a + ')';
    }
}
