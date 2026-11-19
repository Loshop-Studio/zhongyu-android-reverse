package com.zykj.sketch.core.version;

import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.core.data.RenderTask;
import com.zykj.sketch.core.listener.EventListener;
import com.zykj.sketch.core.listener.ViewControl;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes6.dex */
public interface ITaskParse {

    public static final class DefaultImpls {
        public static /* synthetic */ RenderTask parse$default(ITaskParse iTaskParse, List list, EventListener eventListener, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: parse");
            }
            if ((i10 & 4) != 0) {
                interfaceC9540l = new InterfaceC9540l() { // from class: com.zykj.sketch.core.version.ITaskParse.parse.1
                    public final void invoke(ViewControl it) {
                        AbstractC9979u.m20294g(it, "it");
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((ViewControl) obj2);
                        return C10786q.f26013a;
                    }
                };
            }
            return iTaskParse.parse(list, eventListener, interfaceC9540l);
        }
    }

    RenderTask parse(List<EzyDrawBoard.ActionContent> list, EventListener eventListener, InterfaceC9540l interfaceC9540l);
}
