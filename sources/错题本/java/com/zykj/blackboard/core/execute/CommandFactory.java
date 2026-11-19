package com.zykj.blackboard.core.execute;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.execute.version6.CommandExecuteFactory6;
import com.zykj.blackboard.core.loader.SourceLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, m5110d2 = {"Lcom/zykj/blackboard/core/execute/CommandFactory;", "", "()V", "createCommandFactory", "Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;", "version", "", "sourceLoader", "Lcom/zykj/blackboard/core/loader/SourceLoader;", "matrixAdapter", "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;", "graphControl", "Lcom/zykj/blackboard/core/canvas/control/IGraphControl;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class CommandFactory {

    @NotNull
    public static final CommandFactory INSTANCE = new CommandFactory();

    private CommandFactory() {
    }

    @NotNull
    public final BaseCommandExecuteFactory createCommandFactory(int version, @NotNull SourceLoader sourceLoader, @NotNull MatrixAdapter matrixAdapter, @NotNull IGraphControl graphControl) {
        AbstractC5830k.m5330g(sourceLoader, "sourceLoader");
        AbstractC5830k.m5330g(matrixAdapter, "matrixAdapter");
        AbstractC5830k.m5330g(graphControl, "graphControl");
        return version == 6 ? new CommandExecuteFactory6(sourceLoader, matrixAdapter, graphControl) : new CommandExecuteFactory6(sourceLoader, matrixAdapter, graphControl);
    }
}
