package com.friday.document.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import com.friday.common.base.BaseViewModel;
import com.friday.document.viewmodel.ShareBase;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p379vd.AbstractC11613v;
import p379vd.InterfaceC11603l;
import p379vd.InterfaceC11612u;
import p430z2.C11970b1;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public abstract class ShareBase extends BaseViewModel {

    /* renamed from: b */
    public final InterfaceC11603l f8176b;

    /* renamed from: c */
    public final InterfaceC11612u f8177c;

    public ShareBase() {
        InterfaceC11603l interfaceC11603lM25602a = AbstractC11613v.m25602a(new C11970b1(false, false, null, null, 15, null));
        this.f8176b = interfaceC11603lM25602a;
        this.f8177c = interfaceC11603lM25602a;
    }

    /* renamed from: j */
    public static /* synthetic */ void m6344j(ShareBase shareBase, boolean z10, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, String str, InterfaceC9540l interfaceC9540l3, int i10, Object obj) {
        InterfaceC9540l interfaceC9540l4;
        String str2;
        InterfaceC9540l interfaceC9540l5;
        InterfaceC9540l interfaceC9540l6;
        ShareBase shareBase2;
        boolean z11;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchRequest");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            interfaceC9540l2 = new InterfaceC9540l() { // from class: z2.u
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj2) {
                    return ShareBase.m6345k(obj2);
                }
            };
        }
        if ((i10 & 8) != 0) {
            str = null;
        }
        if ((i10 & 16) != 0) {
            interfaceC9540l4 = null;
            interfaceC9540l6 = interfaceC9540l2;
            str2 = str;
            z11 = z10;
            interfaceC9540l5 = interfaceC9540l;
            shareBase2 = shareBase;
        } else {
            interfaceC9540l4 = interfaceC9540l3;
            str2 = str;
            interfaceC9540l5 = interfaceC9540l;
            interfaceC9540l6 = interfaceC9540l2;
            shareBase2 = shareBase;
            z11 = z10;
        }
        shareBase2.m6349i(z11, interfaceC9540l5, interfaceC9540l6, str2, interfaceC9540l4);
    }

    /* renamed from: k */
    public static final C10786q m6345k(Object obj) {
        return C10786q.f26013a;
    }

    /* renamed from: l */
    public static final C10786q m6346l(ShareBase shareBase) {
        InterfaceC11603l interfaceC11603l = shareBase.f8176b;
        interfaceC11603l.setValue(C11970b1.m26594b((C11970b1) interfaceC11603l.getValue(), false, false, null, null, 12, null));
        return C10786q.f26013a;
    }

    /* renamed from: g */
    public final InterfaceC11612u m6347g() {
        return this.f8177c;
    }

    /* renamed from: h */
    public final InterfaceC11603l m6348h() {
        return this.f8176b;
    }

    /* renamed from: i */
    public final void m6349i(boolean z10, InterfaceC9540l block, InterfaceC9540l onSuccess, String str, InterfaceC9540l interfaceC9540l) {
        AbstractC9979u.m20294g(block, "block");
        AbstractC9979u.m20294g(onSuccess, "onSuccess");
        m4804b(new ShareBase$launchRequest$2(this, z10, block, onSuccess, str, null), new ShareBase$launchRequest$3(this, interfaceC9540l, null), new InterfaceC9529a() { // from class: z2.v
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return ShareBase.m6346l(this.f28380c);
            }
        });
    }
}
