package com.zykj.blackboard.core.edit;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import p084d5.InterfaceC7751k;
import p272v4.C9763b;

/* loaded from: classes4.dex */
public interface IBoardControl {

    public static final class DefaultImpls {
        /* renamed from: a */
        public static /* synthetic */ InterfaceC7751k m7809a(IBoardControl iBoardControl, boolean z9, Function0 function0, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createPage");
            }
            if ((i9 & 1) != 0) {
                z9 = true;
            }
            if ((i9 & 2) != 0) {
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
            return iBoardControl.mo7795b(z9, function0);
        }

        /* renamed from: b */
        public static /* synthetic */ void m7810b(IBoardControl iBoardControl, int i9, Function0 function0, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deletePage");
            }
            if ((i10 & 2) != 0) {
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
            iBoardControl.mo7796c(i9, function0);
        }
    }

    /* renamed from: a */
    InterfaceC7751k mo7794a();

    /* renamed from: b */
    InterfaceC7751k mo7795b(boolean z9, Function0 function0);

    /* renamed from: c */
    void mo7796c(int i9, Function0 function0);

    /* renamed from: d */
    List mo7797d();

    /* renamed from: e */
    void mo7798e(boolean z9, boolean z10, Function1 function1, Function1 function12);

    C9763b getConfig();
}
