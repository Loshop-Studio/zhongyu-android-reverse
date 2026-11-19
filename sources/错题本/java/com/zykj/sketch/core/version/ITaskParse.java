package com.zykj.sketch.core.version;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.core.data.RenderTask;
import com.zykj.sketch.core.listener.EventListener;
import com.zykj.sketch.core.listener.ViewControl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J;\u0010\f\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m5110d2 = {"Lcom/zykj/sketch/core/version/ITaskParse;", "", "", "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;", "content", "Lcom/zykj/sketch/core/listener/EventListener;", "eventListener", "Lkotlin/Function1;", "Lcom/zykj/sketch/core/listener/ViewControl;", "Ld6/s;", "viewBack", "Lcom/zykj/sketch/core/data/RenderTask;", "parse", "(Ljava/util/List;Lcom/zykj/sketch/core/listener/EventListener;Lr6/c;)Lcom/zykj/sketch/core/data/RenderTask;", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public interface ITaskParse {

    @Metadata(m5111k = 3, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static /* synthetic */ RenderTask parse$default(ITaskParse iTaskParse, List list, EventListener eventListener, InterfaceC6471c interfaceC6471c, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: parse");
            }
            if ((i & 4) != 0) {
                interfaceC6471c = new InterfaceC6471c() { // from class: com.zykj.sketch.core.version.ITaskParse.parse.1
                    public final void invoke(@NotNull ViewControl it) {
                        AbstractC5830k.m5330g(it, "it");
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((ViewControl) obj2);
                        return C5443s.f8405a;
                    }
                };
            }
            return iTaskParse.parse(list, eventListener, interfaceC6471c);
        }
    }

    @NotNull
    RenderTask parse(@NotNull List<EzyDrawBoard.ActionContent> content, @NotNull EventListener eventListener, @NotNull InterfaceC6471c viewBack);
}
