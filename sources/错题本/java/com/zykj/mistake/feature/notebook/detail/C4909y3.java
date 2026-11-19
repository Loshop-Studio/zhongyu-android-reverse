package com.zykj.mistake.feature.notebook.detail;

import com.zykj.mistake.network.ApiResp;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.flow.C5946n0;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.mistake.feature.notebook.detail.y3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4909y3 implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f7416a;

    /* renamed from: b */
    public final /* synthetic */ MistakeDetailNewViewModel f7417b;

    /* renamed from: c */
    public final /* synthetic */ String f7418c;

    public /* synthetic */ C4909y3(MistakeDetailNewViewModel mistakeDetailNewViewModel, String str, int i) {
        this.f7416a = i;
        this.f7417b = mistakeDetailNewViewModel;
        this.f7418c = str;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        Object value;
        C4837m3 c4837m3;
        C4825k3 c4825k3;
        ArrayList arrayList;
        Object value2;
        C4837m3 c4837m32;
        C4825k3 c4825k32;
        switch (this.f7416a) {
            case 0:
                ApiResp it = (ApiResp) obj;
                AbstractC5830k.m5330g(it, "it");
                C5946n0 c5946n0 = this.f7417b.f6876e;
                do {
                    value = c5946n0.getValue();
                    c4837m3 = (C4837m3) value;
                    c4825k3 = c4837m3.f7129I;
                    List list = c4825k3.f7081e;
                    arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (!AbstractC5830k.m5325b((String) obj2, this.f7418c)) {
                            arrayList.add(obj2);
                        }
                    }
                } while (!c5946n0.m5569i(value, C4837m3.m4207a(c4837m3, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, false, false, false, null, false, false, false, false, false, null, null, null, null, null, C4825k3.m4202a(c4825k3, null, 0L, arrayList, false, 111), null, false, false, false, null, false, false, 0, null, 0, false, null, null, null, null, false, false, false, false, null, null, false, null, false, false, false, false, false, null, 0, -1, -5, 1)));
            default:
                ApiResp it2 = (ApiResp) obj;
                AbstractC5830k.m5330g(it2, "it");
                C5946n0 c5946n02 = this.f7417b.f6876e;
                do {
                    value2 = c5946n02.getValue();
                    c4837m32 = (C4837m3) value2;
                    c4825k32 = c4837m32.f7129I;
                } while (!c5946n02.m5569i(value2, C4837m3.m4207a(c4837m32, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, false, false, false, null, false, false, false, false, false, null, null, null, null, null, C4825k3.m4202a(c4825k32, null, 0L, AbstractC5805t.m5245y0(c4837m32.f7129I.f7083g, AbstractC5805t.m5239s0(c4825k32.f7081e, this.f7418c)), false, 111), null, false, false, false, null, false, false, 0, null, 0, false, null, null, null, null, false, false, false, false, null, null, false, null, false, false, false, false, false, null, 0, -1, -5, 1)));
        }
        return C5443s.f8405a;
    }
}
