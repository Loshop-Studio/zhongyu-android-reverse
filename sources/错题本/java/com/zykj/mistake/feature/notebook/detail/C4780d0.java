package com.zykj.mistake.feature.notebook.detail;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.zykj.mistake.feature.review.AbstractC5017y;
import com.zykj.mistake.main.drawer.AbstractC5041l;
import java.util.ArrayList;
import java.util.List;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p167t4.C6592e;
import p191w4.C6716a;
import p191w4.InterfaceC6718c;
import p204y1.AbstractC6768a;

/* renamed from: com.zykj.mistake.feature.notebook.detail.d0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4780d0 implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f6954a;

    /* renamed from: b */
    public final /* synthetic */ Object f6955b;

    /* renamed from: c */
    public final /* synthetic */ int f6956c;

    /* renamed from: d */
    public final /* synthetic */ Object f6957d;

    /* renamed from: e */
    public final /* synthetic */ Object f6958e;

    /* renamed from: f */
    public final /* synthetic */ Object f6959f;

    public /* synthetic */ C4780d0(Object obj, Object obj2, Object obj3, Object obj4, int i, int i8) {
        this.f6954a = i8;
        this.f6957d = obj;
        this.f6958e = obj2;
        this.f6959f = obj3;
        this.f6955b = obj4;
        this.f6956c = i;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6954a) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC4798g0.m4188b((C4837m3) this.f6957d, (C4764a5) this.f6958e, (InterfaceC6471c) this.f6959f, (Modifier) this.f6955b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f6956c | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC4862q4.m4232f((String) this.f6957d, (Modifier) this.f6955b, (Modifier) this.f6958e, (Modifier) this.f6959f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f6956c | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC5017y.m4332a((String) this.f6957d, (String) this.f6958e, (String) this.f6959f, (Modifier) this.f6955b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f6956c | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC5041l.m4373e((String) this.f6957d, (ArrayList) this.f6958e, (List) this.f6959f, (InterfaceC6473e) this.f6955b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f6956c | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                AbstractC6768a.m6438b((InterfaceC6718c) this.f6957d, (C6716a) this.f6958e, (C6592e) this.f6959f, (InterfaceC6473e) this.f6955b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f6956c | 1));
                break;
        }
        return C5443s.f8405a;
    }

    public /* synthetic */ C4780d0(String str, Modifier modifier, Modifier modifier2, Modifier modifier3, int i) {
        this.f6954a = 1;
        this.f6957d = str;
        this.f6955b = modifier;
        this.f6958e = modifier2;
        this.f6959f = modifier3;
        this.f6956c = i;
    }
}
