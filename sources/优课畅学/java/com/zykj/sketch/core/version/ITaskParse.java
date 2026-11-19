package com.zykj.sketch.core.version;

import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.core.data.RenderTask;
import com.zykj.sketch.core.listener.EventListener;
import com.zykj.sketch.core.listener.ViewControl;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public interface ITaskParse {

    public static final class DefaultImpls {
        public static /* synthetic */ RenderTask parse$default(ITaskParse iTaskParse, List list, EventListener eventListener, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: parse");
            }
            if ((i10 & 4) != 0) {
                interfaceC10570l = new InterfaceC10570l() { // from class: com.zykj.sketch.core.version.ITaskParse.parse.1
                    public final void invoke(ViewControl it) {
                        AbstractC9133u.m16133g(it, "it");
                    }

                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((ViewControl) obj2);
                        return C8736p.f16368a;
                    }
                };
            }
            return iTaskParse.parse(list, eventListener, interfaceC10570l);
        }
    }

    RenderTask parse(List<EzyDrawBoard.ActionContent> list, EventListener eventListener, InterfaceC10570l interfaceC10570l);
}
