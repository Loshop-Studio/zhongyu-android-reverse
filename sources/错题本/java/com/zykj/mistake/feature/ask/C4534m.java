package com.zykj.mistake.feature.ask;

import android.view.C2766k;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.AbstractC5773a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;
import p045d6.InterfaceC5429e;
import p118m7.AbstractC6191y0;

@StabilityInferred(parameters = 0)
@Serializable
/* renamed from: com.zykj.mistake.feature.ask.m */
/* loaded from: classes3.dex */
public final class C4534m {

    @NotNull
    public static final C4532l Companion = new C4532l();

    /* renamed from: c */
    public static final InterfaceC5429e[] f6267c;

    /* renamed from: a */
    public final MistakeAskMaterialContract$MaterialType f6268a;

    /* renamed from: b */
    public final List f6269b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f6267c = new InterfaceC5429e[]{AbstractC5773a.m5116a(lazyThreadSafetyMode, new C2766k(14)), AbstractC5773a.m5116a(lazyThreadSafetyMode, new C2766k(15))};
    }

    public /* synthetic */ C4534m(int i, MistakeAskMaterialContract$MaterialType mistakeAskMaterialContract$MaterialType, List list) {
        if (3 != (i & 3)) {
            AbstractC6191y0.m5841k(C4530k.f6259a.getDescriptor(), i, 3);
            throw null;
        }
        this.f6268a = mistakeAskMaterialContract$MaterialType;
        this.f6269b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4534m)) {
            return false;
        }
        C4534m c4534m = (C4534m) obj;
        return this.f6268a == c4534m.f6268a && AbstractC5830k.m5325b(this.f6269b, c4534m.f6269b);
    }

    public final int hashCode() {
        return this.f6269b.hashCode() + (this.f6268a.hashCode() * 31);
    }

    public final String toString() {
        return "Group(type=" + this.f6268a + ", items=" + this.f6269b + ")";
    }

    public C4534m(MistakeAskMaterialContract$MaterialType type, List list) {
        AbstractC5830k.m5330g(type, "type");
        this.f6268a = type;
        this.f6269b = list;
    }
}
