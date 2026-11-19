package com.zykj.mistake.feature.ask;

import android.view.C2766k;
import androidx.collection.AbstractC0584a;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
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
/* renamed from: com.zykj.mistake.feature.ask.c0 */
/* loaded from: classes3.dex */
public final class C4515c0 {

    @NotNull
    public static final C4513b0 Companion = new C4513b0();

    /* renamed from: f */
    public static final InterfaceC5429e[] f6216f;

    /* renamed from: a */
    public final String f6217a;

    /* renamed from: b */
    public final List f6218b;

    /* renamed from: c */
    public final List f6219c;

    /* renamed from: d */
    public final boolean f6220d;

    /* renamed from: e */
    public final boolean f6221e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f6216f = new InterfaceC5429e[]{null, AbstractC5773a.m5116a(lazyThreadSafetyMode, new C2766k(17)), AbstractC5773a.m5116a(lazyThreadSafetyMode, new C2766k(18)), null, null};
    }

    public /* synthetic */ C4515c0(int i, String str, List list, List list2, boolean z8, boolean z9) {
        if (31 != (i & 31)) {
            AbstractC6191y0.m5841k(C4511a0.f6214a.getDescriptor(), i, 31);
            throw null;
        }
        this.f6217a = str;
        this.f6218b = list;
        this.f6219c = list2;
        this.f6220d = z8;
        this.f6221e = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4515c0)) {
            return false;
        }
        C4515c0 c4515c0 = (C4515c0) obj;
        return AbstractC5830k.m5325b(this.f6217a, c4515c0.f6217a) && AbstractC5830k.m5325b(this.f6218b, c4515c0.f6218b) && AbstractC5830k.m5325b(this.f6219c, c4515c0.f6219c) && this.f6220d == c4515c0.f6220d && this.f6221e == c4515c0.f6221e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6221e) + AbstractC0584a.m908i(this.f6220d, AbstractC0584a.m907h(this.f6219c, AbstractC0584a.m907h(this.f6218b, this.f6217a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "TextAnswerPayload(index=" + this.f6217a + ", answers=" + this.f6218b + ", comments=" + this.f6219c + ", isOriginal=" + this.f6220d + ", isShowAnswer=" + this.f6221e + ")";
    }

    public C4515c0(String index, ArrayList arrayList, List comments, boolean z8, boolean z9) {
        AbstractC5830k.m5330g(index, "index");
        AbstractC5830k.m5330g(comments, "comments");
        this.f6217a = index;
        this.f6218b = arrayList;
        this.f6219c = comments;
        this.f6220d = z8;
        this.f6221e = z9;
    }
}
