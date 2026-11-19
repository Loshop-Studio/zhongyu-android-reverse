package com.zykj.blackboard.core.execute.version6;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.protobuf.Any;
import com.google.protobuf.InvalidProtocolBufferException;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.blackboard.core.execute.BaseCommandExecuteFactory;
import com.zykj.blackboard.core.execute.PlayThread;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.board.EzyCommand$CommandSource;
import com.zykj.board.EzyCommandEnum$CommandEnum;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0011\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0011\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, m5110d2 = {"Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;", "Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;", "Lcom/zykj/blackboard/core/loader/SourceLoader;", "sourceLoader", "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;", "matrixAdapter", "Lcom/zykj/blackboard/core/canvas/control/IGraphControl;", "graphControl", "<init>", "(Lcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/blackboard/core/canvas/MatrixAdapter;Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V", "", "async", "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;", "command", "", "skipTime", "Lcom/zykj/blackboard/core/execute/PlayThread;", "executeCommand", "(ZLcom/zykj/board/EzyCommand$CommandSource$CommandInfo;J)Lcom/zykj/blackboard/core/execute/PlayThread;", "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;", "Ld6/s;", "(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V", "Lcom/zykj/blackboard/core/execute/version6/GraphDataExecute;", "graphDataExecute", "Lcom/zykj/blackboard/core/execute/version6/GraphDataExecute;", "Lcom/zykj/blackboard/core/execute/version6/GraphRemoveExecute;", "graphRemoveExecute", "Lcom/zykj/blackboard/core/execute/version6/GraphRemoveExecute;", "Lcom/zykj/blackboard/core/execute/version6/GraphMatrixExecute;", "graphMatrixExecute", "Lcom/zykj/blackboard/core/execute/version6/GraphMatrixExecute;", "Lcom/zykj/blackboard/core/execute/version6/CameraMatrixExecute;", "cameraMatrixExecute", "Lcom/zykj/blackboard/core/execute/version6/CameraMatrixExecute;", "Lcom/zykj/blackboard/core/execute/version6/CameraExecute;", "cameraExecute", "Lcom/zykj/blackboard/core/execute/version6/CameraExecute;", "Lcom/zykj/blackboard/core/execute/version6/ConfigExecute;", "configExecute", "Lcom/zykj/blackboard/core/execute/version6/ConfigExecute;", "Lcom/zykj/blackboard/core/execute/version6/GraphChangeExecute;", "graphChangeExecute", "Lcom/zykj/blackboard/core/execute/version6/GraphChangeExecute;", "Lcom/zykj/blackboard/core/execute/version6/RecordStopExecute;", "recordStopExecute", "Lcom/zykj/blackboard/core/execute/version6/RecordStopExecute;", "Lcom/zykj/blackboard/core/execute/version6/CursorMoveExecute;", "cursorMoveExecute", "Lcom/zykj/blackboard/core/execute/version6/CursorMoveExecute;", "Lcom/zykj/blackboard/core/execute/version6/RebuildExecute;", "rebuildExecute", "Lcom/zykj/blackboard/core/execute/version6/RebuildExecute;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class CommandExecuteFactory6 extends BaseCommandExecuteFactory {

    @NotNull
    private final CameraExecute cameraExecute;

    @NotNull
    private final CameraMatrixExecute cameraMatrixExecute;

    @NotNull
    private final ConfigExecute configExecute;

    @NotNull
    private final CursorMoveExecute cursorMoveExecute;

    @NotNull
    private final GraphChangeExecute graphChangeExecute;

    @NotNull
    private final GraphDataExecute graphDataExecute;

    @NotNull
    private final GraphMatrixExecute graphMatrixExecute;

    @NotNull
    private final GraphRemoveExecute graphRemoveExecute;

    @NotNull
    private final RebuildExecute rebuildExecute;

    @NotNull
    private final RecordStopExecute recordStopExecute;

    @Metadata(m5111k = 3, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EzyCommandEnum$CommandEnum.values().length];
            iArr[EzyCommandEnum$CommandEnum.ACTION_GRAPH_ADD.ordinal()] = 1;
            iArr[EzyCommandEnum$CommandEnum.ACTION_GRAPH_REMOVE.ordinal()] = 2;
            iArr[EzyCommandEnum$CommandEnum.ACTION_GRAPH_MATRIX.ordinal()] = 3;
            iArr[EzyCommandEnum$CommandEnum.ACTION_CAMERA.ordinal()] = 4;
            iArr[EzyCommandEnum$CommandEnum.ACTION_CAMERA_MATRIX.ordinal()] = 5;
            iArr[EzyCommandEnum$CommandEnum.ACTION_CONFIG.ordinal()] = 6;
            iArr[EzyCommandEnum$CommandEnum.ACTION_GRAPH_CHANGE.ordinal()] = 7;
            iArr[EzyCommandEnum$CommandEnum.ACTION_RECORD_STOP.ordinal()] = 8;
            iArr[EzyCommandEnum$CommandEnum.ACTION_CURSOR_MOVE.ordinal()] = 9;
            iArr[EzyCommandEnum$CommandEnum.ACTION_REBUILD.ordinal()] = 10;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CommandExecuteFactory6(@NotNull SourceLoader sourceLoader, @NotNull MatrixAdapter matrixAdapter, @NotNull IGraphControl graphControl) {
        AbstractC5830k.m5330g(sourceLoader, "sourceLoader");
        AbstractC5830k.m5330g(matrixAdapter, "matrixAdapter");
        AbstractC5830k.m5330g(graphControl, "graphControl");
        this.graphDataExecute = new GraphDataExecute(sourceLoader, matrixAdapter, graphControl);
        this.graphRemoveExecute = new GraphRemoveExecute(sourceLoader, graphControl);
        this.graphMatrixExecute = new GraphMatrixExecute(sourceLoader, graphControl);
        this.cameraMatrixExecute = new CameraMatrixExecute(sourceLoader, matrixAdapter, graphControl);
        this.cameraExecute = new CameraExecute(matrixAdapter, graphControl);
        this.configExecute = new ConfigExecute(sourceLoader, graphControl);
        this.graphChangeExecute = new GraphChangeExecute(sourceLoader, graphControl);
        this.recordStopExecute = new RecordStopExecute(sourceLoader, graphControl);
        this.cursorMoveExecute = new CursorMoveExecute(sourceLoader, matrixAdapter, graphControl);
        this.rebuildExecute = new RebuildExecute(sourceLoader, graphControl);
    }

    @Override // com.zykj.blackboard.core.execute.BaseCommandExecuteFactory
    @Nullable
    public PlayThread executeCommand(boolean async, @NotNull EzyCommand$CommandSource.CommandInfo command, long skipTime) throws InvalidProtocolBufferException {
        AbstractC5830k.m5330g(command, "command");
        EzyCommandEnum$CommandEnum commandEnum = command.getCommandEnum();
        switch (commandEnum == null ? -1 : WhenMappings.$EnumSwitchMapping$0[commandEnum.ordinal()]) {
            case 1:
                EzyCommand$CommandSource.CommandInfo.GraphData data = EzyCommand$CommandSource.CommandInfo.GraphData.parseFrom(command.getData());
                if (async) {
                    GraphDataExecute graphDataExecute = this.graphDataExecute;
                    AbstractC5830k.m5329f(data, "data");
                    return graphDataExecute.asyncExecute(data, skipTime);
                }
                GraphDataExecute graphDataExecute2 = this.graphDataExecute;
                AbstractC5830k.m5329f(data, "data");
                graphDataExecute2.execute(data);
                return null;
            case 2:
                EzyCommand$CommandSource.CommandInfo.GraphRemove data2 = EzyCommand$CommandSource.CommandInfo.GraphRemove.parseFrom(command.getData());
                if (async) {
                    GraphRemoveExecute graphRemoveExecute = this.graphRemoveExecute;
                    AbstractC5830k.m5329f(data2, "data");
                    graphRemoveExecute.asyncExecute(data2, skipTime);
                    return null;
                }
                GraphRemoveExecute graphRemoveExecute2 = this.graphRemoveExecute;
                AbstractC5830k.m5329f(data2, "data");
                graphRemoveExecute2.execute(data2);
                return null;
            case 3:
                EzyCommand$CommandSource.CommandInfo.GraphMatrix data3 = EzyCommand$CommandSource.CommandInfo.GraphMatrix.parseFrom(command.getData());
                if (async) {
                    GraphMatrixExecute graphMatrixExecute = this.graphMatrixExecute;
                    AbstractC5830k.m5329f(data3, "data");
                    return graphMatrixExecute.asyncExecute(data3, skipTime);
                }
                GraphMatrixExecute graphMatrixExecute2 = this.graphMatrixExecute;
                AbstractC5830k.m5329f(data3, "data");
                graphMatrixExecute2.execute(data3);
                return null;
            case 4:
                EzyCommand$CommandSource.CommandInfo.Camera data4 = EzyCommand$CommandSource.CommandInfo.Camera.parseFrom(command.getData());
                if (async) {
                    CameraExecute cameraExecute = this.cameraExecute;
                    AbstractC5830k.m5329f(data4, "data");
                    return cameraExecute.asyncExecute(data4, skipTime);
                }
                CameraExecute cameraExecute2 = this.cameraExecute;
                AbstractC5830k.m5329f(data4, "data");
                cameraExecute2.execute(data4);
                return null;
            case 5:
                EzyCommand$CommandSource.CommandInfo.CameraMatrix data5 = EzyCommand$CommandSource.CommandInfo.CameraMatrix.parseFrom(command.getData());
                if (async) {
                    CameraMatrixExecute cameraMatrixExecute = this.cameraMatrixExecute;
                    AbstractC5830k.m5329f(data5, "data");
                    return cameraMatrixExecute.asyncExecute(data5, skipTime);
                }
                CameraMatrixExecute cameraMatrixExecute2 = this.cameraMatrixExecute;
                AbstractC5830k.m5329f(data5, "data");
                cameraMatrixExecute2.execute(data5);
                return null;
            case 6:
                EzyCommand$CommandSource.CommandInfo.Config data6 = EzyCommand$CommandSource.CommandInfo.Config.parseFrom(command.getData());
                if (async) {
                    ConfigExecute configExecute = this.configExecute;
                    AbstractC5830k.m5329f(data6, "data");
                    return configExecute.asyncExecute(data6, skipTime);
                }
                ConfigExecute configExecute2 = this.configExecute;
                AbstractC5830k.m5329f(data6, "data");
                configExecute2.execute(data6);
                return null;
            case 7:
                EzyCommand$CommandSource.CommandInfo.GraphChange data7 = EzyCommand$CommandSource.CommandInfo.GraphChange.parseFrom(command.getData());
                if (async) {
                    GraphChangeExecute graphChangeExecute = this.graphChangeExecute;
                    AbstractC5830k.m5329f(data7, "data");
                    return graphChangeExecute.asyncExecute(data7, skipTime);
                }
                GraphChangeExecute graphChangeExecute2 = this.graphChangeExecute;
                AbstractC5830k.m5329f(data7, "data");
                graphChangeExecute2.execute(data7);
                return null;
            case 8:
                Any data8 = Any.parseFrom(command.getData());
                if (async) {
                    RecordStopExecute recordStopExecute = this.recordStopExecute;
                    AbstractC5830k.m5329f(data8, "data");
                    return recordStopExecute.asyncExecute(data8, skipTime);
                }
                RecordStopExecute recordStopExecute2 = this.recordStopExecute;
                AbstractC5830k.m5329f(data8, "data");
                recordStopExecute2.execute(data8);
                return null;
            case 9:
                EzyCommand$CommandSource.CommandInfo.CursorMove data9 = EzyCommand$CommandSource.CommandInfo.CursorMove.parseFrom(command.getData());
                if (async) {
                    CursorMoveExecute cursorMoveExecute = this.cursorMoveExecute;
                    AbstractC5830k.m5329f(data9, "data");
                    return cursorMoveExecute.asyncExecute(data9, skipTime);
                }
                CursorMoveExecute cursorMoveExecute2 = this.cursorMoveExecute;
                AbstractC5830k.m5329f(data9, "data");
                cursorMoveExecute2.execute(data9);
                return null;
            case 10:
                EzyCommand$CommandSource.CommandInfo.REBUILD data10 = EzyCommand$CommandSource.CommandInfo.REBUILD.parseFrom(command.getData());
                if (async) {
                    RebuildExecute rebuildExecute = this.rebuildExecute;
                    AbstractC5830k.m5329f(data10, "data");
                    return rebuildExecute.asyncExecute(data10, skipTime);
                }
                RebuildExecute rebuildExecute2 = this.rebuildExecute;
                AbstractC5830k.m5329f(data10, "data");
                rebuildExecute2.execute(data10);
                return null;
            default:
                return null;
        }
    }

    @Override // com.zykj.blackboard.core.execute.BaseCommandExecuteFactory
    public void executeCommand(@NotNull CommandInfoEntity command) throws InvalidProtocolBufferException {
        AbstractC5830k.m5330g(command, "command");
        switch (WhenMappings.$EnumSwitchMapping$0[command.getCommandEnum().ordinal()]) {
            case 1:
                EzyCommand$CommandSource.CommandInfo.GraphData data = EzyCommand$CommandSource.CommandInfo.GraphData.parseFrom(command.getData());
                GraphDataExecute graphDataExecute = this.graphDataExecute;
                AbstractC5830k.m5329f(data, "data");
                graphDataExecute.execute(data);
                break;
            case 2:
                EzyCommand$CommandSource.CommandInfo.GraphRemove data2 = EzyCommand$CommandSource.CommandInfo.GraphRemove.parseFrom(command.getData());
                GraphRemoveExecute graphRemoveExecute = this.graphRemoveExecute;
                AbstractC5830k.m5329f(data2, "data");
                graphRemoveExecute.execute(data2);
                break;
            case 3:
                EzyCommand$CommandSource.CommandInfo.GraphMatrix data3 = EzyCommand$CommandSource.CommandInfo.GraphMatrix.parseFrom(command.getData());
                GraphMatrixExecute graphMatrixExecute = this.graphMatrixExecute;
                AbstractC5830k.m5329f(data3, "data");
                graphMatrixExecute.execute(data3);
                break;
            case 4:
                EzyCommand$CommandSource.CommandInfo.Camera data4 = EzyCommand$CommandSource.CommandInfo.Camera.parseFrom(command.getData());
                CameraExecute cameraExecute = this.cameraExecute;
                AbstractC5830k.m5329f(data4, "data");
                cameraExecute.execute(data4);
                break;
            case 5:
                EzyCommand$CommandSource.CommandInfo.CameraMatrix data5 = EzyCommand$CommandSource.CommandInfo.CameraMatrix.parseFrom(command.getData());
                CameraMatrixExecute cameraMatrixExecute = this.cameraMatrixExecute;
                AbstractC5830k.m5329f(data5, "data");
                cameraMatrixExecute.execute(data5);
                break;
            case 6:
                EzyCommand$CommandSource.CommandInfo.Config data6 = EzyCommand$CommandSource.CommandInfo.Config.parseFrom(command.getData());
                ConfigExecute configExecute = this.configExecute;
                AbstractC5830k.m5329f(data6, "data");
                configExecute.execute(data6);
                break;
            case 7:
                EzyCommand$CommandSource.CommandInfo.GraphChange data7 = EzyCommand$CommandSource.CommandInfo.GraphChange.parseFrom(command.getData());
                GraphChangeExecute graphChangeExecute = this.graphChangeExecute;
                AbstractC5830k.m5329f(data7, "data");
                graphChangeExecute.execute(data7);
                break;
            case 8:
                Any data8 = Any.parseFrom(command.getData());
                RecordStopExecute recordStopExecute = this.recordStopExecute;
                AbstractC5830k.m5329f(data8, "data");
                recordStopExecute.execute(data8);
                break;
            case 9:
                EzyCommand$CommandSource.CommandInfo.CursorMove data9 = EzyCommand$CommandSource.CommandInfo.CursorMove.parseFrom(command.getData());
                CursorMoveExecute cursorMoveExecute = this.cursorMoveExecute;
                AbstractC5830k.m5329f(data9, "data");
                cursorMoveExecute.execute(data9);
                break;
            case 10:
                EzyCommand$CommandSource.CommandInfo.REBUILD data10 = EzyCommand$CommandSource.CommandInfo.REBUILD.parseFrom(command.getData());
                RebuildExecute rebuildExecute = this.rebuildExecute;
                AbstractC5830k.m5329f(data10, "data");
                rebuildExecute.execute(data10);
                break;
        }
    }
}
