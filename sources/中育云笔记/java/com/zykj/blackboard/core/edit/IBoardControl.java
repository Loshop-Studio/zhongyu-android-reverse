package com.zykj.blackboard.core.edit;

import java.util.List;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p307q9.C10762b;
import p309qc.C10786q;
import p422y9.InterfaceC11935n;

/* loaded from: classes5.dex */
public interface IBoardControl {

    public static final class DefaultImpls {
        /* renamed from: a */
        public static /* synthetic */ InterfaceC11935n m14446a(IBoardControl iBoardControl, boolean z10, InterfaceC9529a interfaceC9529a, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createPage");
            }
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            if ((i10 & 2) != 0) {
                interfaceC9529a = new InterfaceC9529a() { // from class: com.zykj.blackboard.core.edit.IBoardControl$createPage$1
                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m34009invoke() {
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m34009invoke();
                        return C10786q.f26013a;
                    }
                };
            }
            return iBoardControl.mo14434e(z10, interfaceC9529a);
        }

        /* renamed from: b */
        public static /* synthetic */ void m14447b(IBoardControl iBoardControl, int i10, InterfaceC9529a interfaceC9529a, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deletePage");
            }
            if ((i11 & 2) != 0) {
                interfaceC9529a = new InterfaceC9529a() { // from class: com.zykj.blackboard.core.edit.IBoardControl$deletePage$1
                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m34010invoke() {
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m34010invoke();
                        return C10786q.f26013a;
                    }
                };
            }
            iBoardControl.mo14430a(i10, interfaceC9529a);
        }
    }

    /* renamed from: a */
    void mo14430a(int i10, InterfaceC9529a interfaceC9529a);

    /* renamed from: b */
    InterfaceC11935n mo14431b();

    /* renamed from: c */
    void mo14432c(boolean z10, boolean z11, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2);

    /* renamed from: d */
    List mo14433d();

    /* renamed from: e */
    InterfaceC11935n mo14434e(boolean z10, InterfaceC9529a interfaceC9529a);

    C10762b getConfig();
}
