package com.zykj.mistake.feature.collection.component;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.zykj.mistake.feature.notebook.detail.AbstractC4862q4;
import com.zykj.mistake.feature.notebook.detail.AbstractC4875t;
import com.zykj.mistake.feature.notebook.list.AbstractC4953i1;
import p045d6.C5443s;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.collection.component.m */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4567m implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f6422a;

    /* renamed from: b */
    public final /* synthetic */ String f6423b;

    /* renamed from: c */
    public final /* synthetic */ int f6424c;

    public /* synthetic */ C4567m(String str, int i, int i8) {
        this.f6422a = i8;
        this.f6423b = str;
        this.f6424c = i;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f6422a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                AbstractC4569o.m4023c(this.f6423b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6424c | 1));
                break;
            case 1:
                AbstractC4875t.m4249e(this.f6423b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6424c | 1));
                break;
            case 2:
                AbstractC4862q4.m4234h(this.f6423b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6424c | 1));
                break;
            default:
                AbstractC4953i1.m4310g(this.f6423b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6424c | 1));
                break;
        }
        return C5443s.f8405a;
    }
}
