package com.zykj.blackboard.core.edit;

import com.zykj.blackboard.bean.BoardConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import p177n4.InterfaceC8629i;

/* loaded from: classes4.dex */
public interface IBoardControl {

    public static final class DefaultImpls {
        /* renamed from: a */
        public static /* synthetic */ InterfaceC8629i m6700a(IBoardControl iBoardControl, boolean z9, Function0 function0, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createPage");
            }
            if ((i10 & 1) != 0) {
                z9 = true;
            }
            if ((i10 & 2) != 0) {
                function0 = new Function0<Unit>() { // from class: com.zykj.blackboard.core.edit.IBoardControl$createPage$1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                };
            }
            return iBoardControl.mo6687b(z9, function0);
        }

        /* renamed from: b */
        public static /* synthetic */ void m6701b(IBoardControl iBoardControl, int i10, Function0 function0, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deletePage");
            }
            if ((i11 & 2) != 0) {
                function0 = new Function0<Unit>() { // from class: com.zykj.blackboard.core.edit.IBoardControl$deletePage$1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                };
            }
            iBoardControl.mo6688c(i10, function0);
        }
    }

    /* renamed from: a */
    InterfaceC8629i mo6686a();

    /* renamed from: b */
    InterfaceC8629i mo6687b(boolean z9, Function0 function0);

    /* renamed from: c */
    void mo6688c(int i10, Function0 function0);

    /* renamed from: d */
    List mo6689d();

    BoardConfig getConfig();
}
