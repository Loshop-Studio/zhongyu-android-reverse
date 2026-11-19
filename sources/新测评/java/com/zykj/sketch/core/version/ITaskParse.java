package com.zykj.sketch.core.version;

import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.core.data.RenderTask;
import com.zykj.sketch.core.listener.EventListener;
import com.zykj.sketch.core.listener.ViewControl;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH&¨\u0006\r"}, m13558d2 = {"Lcom/zykj/sketch/core/version/ITaskParse;", "", "parse", "Lcom/zykj/sketch/core/data/RenderTask;", "content", "", "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;", "eventListener", "Lcom/zykj/sketch/core/listener/EventListener;", "viewBack", "Lkotlin/Function1;", "Lcom/zykj/sketch/core/listener/ViewControl;", "", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public interface ITaskParse {

    @Metadata(m13559k = 3, m13560mv = {1, 7, 1}, m13562xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RenderTask parse$default(ITaskParse iTaskParse, List list, EventListener eventListener, Function1 function1, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: parse");
            }
            if ((i10 & 4) != 0) {
                function1 = new Function1<ViewControl, Unit>() { // from class: com.zykj.sketch.core.version.ITaskParse.parse.1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(ViewControl it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ViewControl viewControl) {
                        invoke2(viewControl);
                        return Unit.INSTANCE;
                    }
                };
            }
            return iTaskParse.parse(list, eventListener, function1);
        }
    }

    RenderTask parse(List<EzyDrawBoard.ActionContent> content, EventListener eventListener, Function1<? super ViewControl, Unit> viewBack);
}
