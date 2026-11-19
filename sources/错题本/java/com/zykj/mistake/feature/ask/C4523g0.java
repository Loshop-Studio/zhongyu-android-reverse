package com.zykj.mistake.feature.ask;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.zykj.mistake.feature.notebook.detail.AbstractC4798g0;
import com.zykj.mistake.feature.notebook.detail.DraftActionMode;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.mistake.feature.ask.g0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4523g0 implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f6240a = 0;

    /* renamed from: b */
    public final /* synthetic */ boolean f6241b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC6469a f6242c;

    /* renamed from: d */
    public final /* synthetic */ int f6243d;

    /* renamed from: e */
    public final /* synthetic */ Enum f6244e;

    /* renamed from: f */
    public final /* synthetic */ Object f6245f;

    /* renamed from: g */
    public final /* synthetic */ Object f6246g;

    public /* synthetic */ C4523g0(MistakeAskMaterialContract$MaterialType mistakeAskMaterialContract$MaterialType, C4549y c4549y, Modifier modifier, boolean z8, InterfaceC6469a interfaceC6469a, int i) {
        this.f6244e = mistakeAskMaterialContract$MaterialType;
        this.f6245f = c4549y;
        this.f6246g = modifier;
        this.f6241b = z8;
        this.f6242c = interfaceC6469a;
        this.f6243d = i;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6240a) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC4539o0.m4007e((MistakeAskMaterialContract$MaterialType) this.f6244e, (C4549y) this.f6245f, (Modifier) this.f6246g, this.f6241b, this.f6242c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f6243d | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                AbstractC4798g0.m4192f((DraftActionMode) this.f6244e, this.f6241b, this.f6242c, (InterfaceC6471c) this.f6245f, (InterfaceC6469a) this.f6246g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f6243d | 1));
                break;
        }
        return C5443s.f8405a;
    }

    public /* synthetic */ C4523g0(DraftActionMode draftActionMode, boolean z8, InterfaceC6469a interfaceC6469a, InterfaceC6471c interfaceC6471c, InterfaceC6469a interfaceC6469a2, int i) {
        this.f6244e = draftActionMode;
        this.f6241b = z8;
        this.f6242c = interfaceC6469a;
        this.f6245f = interfaceC6471c;
        this.f6246g = interfaceC6469a2;
        this.f6243d = i;
    }
}
