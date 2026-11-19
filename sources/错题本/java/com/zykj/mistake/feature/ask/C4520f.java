package com.zykj.mistake.feature.ask;

import android.view.C2766k;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.AbstractC5773a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;
import p045d6.InterfaceC5429e;

@StabilityInferred(parameters = 0)
@Serializable
/* renamed from: com.zykj.mistake.feature.ask.f */
/* loaded from: classes3.dex */
public final class C4520f {

    @NotNull
    public static final C4518e Companion = new C4518e();

    /* renamed from: b */
    public static final InterfaceC5429e[] f6234b = {AbstractC5773a.m5116a(LazyThreadSafetyMode.PUBLICATION, new C2766k(13))};

    /* renamed from: a */
    public final List f6235a;

    public C4520f(int i, List list) {
        if ((i & 1) == 0) {
            this.f6235a = EmptyList.INSTANCE;
        } else {
            this.f6235a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4520f) && AbstractC5830k.m5325b(this.f6235a, ((C4520f) obj).f6235a);
    }

    public final int hashCode() {
        return this.f6235a.hashCode();
    }

    public final String toString() {
        return "Bundle(groups=" + this.f6235a + ")";
    }

    public C4520f(List groups) {
        AbstractC5830k.m5330g(groups, "groups");
        this.f6235a = groups;
    }
}
