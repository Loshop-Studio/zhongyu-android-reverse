package com.zykj.blackboard.core.execute.version6;

import com.google.protobuf.Any;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.blackboard.core.execute.BaseCommandExecuteFactory;
import com.zykj.blackboard.core.execute.PlayThread;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyCommandEnum;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class CommandExecuteFactory6 extends BaseCommandExecuteFactory {
    private final CameraExecute cameraExecute;
    private final CameraMatrixExecute cameraMatrixExecute;
    private final ConfigExecute configExecute;
    private final CursorMoveExecute cursorMoveExecute;
    private final GraphChangeExecute graphChangeExecute;
    private final GraphDataExecute graphDataExecute;
    private final GraphMatrixExecute graphMatrixExecute;
    private final GraphRemoveExecute graphRemoveExecute;
    private final RebuildExecute rebuildExecute;
    private final RecordStopExecute recordStopExecute;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EzyCommandEnum.CommandEnum.values().length];
            iArr[EzyCommandEnum.CommandEnum.ACTION_GRAPH_ADD.ordinal()] = 1;
            iArr[EzyCommandEnum.CommandEnum.ACTION_GRAPH_REMOVE.ordinal()] = 2;
            iArr[EzyCommandEnum.CommandEnum.ACTION_GRAPH_MATRIX.ordinal()] = 3;
            iArr[EzyCommandEnum.CommandEnum.ACTION_CAMERA.ordinal()] = 4;
            iArr[EzyCommandEnum.CommandEnum.ACTION_CAMERA_MATRIX.ordinal()] = 5;
            iArr[EzyCommandEnum.CommandEnum.ACTION_CONFIG.ordinal()] = 6;
            iArr[EzyCommandEnum.CommandEnum.ACTION_GRAPH_CHANGE.ordinal()] = 7;
            iArr[EzyCommandEnum.CommandEnum.ACTION_RECORD_STOP.ordinal()] = 8;
            iArr[EzyCommandEnum.CommandEnum.ACTION_CURSOR_MOVE.ordinal()] = 9;
            iArr[EzyCommandEnum.CommandEnum.ACTION_REBUILD.ordinal()] = 10;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CommandExecuteFactory6(SourceLoader sourceLoader, MatrixAdapter matrixAdapter, IGraphControl graphControl) {
        AbstractC9133u.m16133g(sourceLoader, "sourceLoader");
        AbstractC9133u.m16133g(matrixAdapter, "matrixAdapter");
        AbstractC9133u.m16133g(graphControl, "graphControl");
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
    public PlayThread executeCommand(boolean z10, EzyCommand.CommandSource.CommandInfo command, long j10) {
        AbstractC9133u.m16133g(command, "command");
        EzyCommandEnum.CommandEnum commandEnumM7446h = command.m7446h();
        switch (commandEnumM7446h == null ? -1 : WhenMappings.$EnumSwitchMapping$0[commandEnumM7446h.ordinal()]) {
            case 1:
                EzyCommand.CommandSource.CommandInfo.GraphData data = EzyCommand.CommandSource.CommandInfo.GraphData.m7737C(command.m7448j());
                if (z10) {
                    GraphDataExecute graphDataExecute = this.graphDataExecute;
                    AbstractC9133u.m16132f(data, "data");
                    return graphDataExecute.asyncExecute(data, j10);
                }
                GraphDataExecute graphDataExecute2 = this.graphDataExecute;
                AbstractC9133u.m16132f(data, "data");
                graphDataExecute2.execute(data);
                return null;
            case 2:
                EzyCommand.CommandSource.CommandInfo.GraphRemove data2 = EzyCommand.CommandSource.CommandInfo.GraphRemove.m7858l(command.m7448j());
                if (z10) {
                    GraphRemoveExecute graphRemoveExecute = this.graphRemoveExecute;
                    AbstractC9133u.m16132f(data2, "data");
                    graphRemoveExecute.asyncExecute(data2, j10);
                    return null;
                }
                GraphRemoveExecute graphRemoveExecute2 = this.graphRemoveExecute;
                AbstractC9133u.m16132f(data2, "data");
                graphRemoveExecute2.execute(data2);
                return null;
            case 3:
                EzyCommand.CommandSource.CommandInfo.GraphMatrix data3 = EzyCommand.CommandSource.CommandInfo.GraphMatrix.m7808y(command.m7448j());
                if (z10) {
                    GraphMatrixExecute graphMatrixExecute = this.graphMatrixExecute;
                    AbstractC9133u.m16132f(data3, "data");
                    return graphMatrixExecute.asyncExecute(data3, j10);
                }
                GraphMatrixExecute graphMatrixExecute2 = this.graphMatrixExecute;
                AbstractC9133u.m16132f(data3, "data");
                graphMatrixExecute2.execute(data3);
                return null;
            case 4:
                EzyCommand.CommandSource.CommandInfo.Camera data4 = EzyCommand.CommandSource.CommandInfo.Camera.m7496o(command.m7448j());
                if (z10) {
                    CameraExecute cameraExecute = this.cameraExecute;
                    AbstractC9133u.m16132f(data4, "data");
                    return cameraExecute.asyncExecute(data4, j10);
                }
                CameraExecute cameraExecute2 = this.cameraExecute;
                AbstractC9133u.m16132f(data4, "data");
                cameraExecute2.execute(data4);
                return null;
            case 5:
                EzyCommand.CommandSource.CommandInfo.CameraMatrix data5 = EzyCommand.CommandSource.CommandInfo.CameraMatrix.m7541s(command.m7448j());
                if (z10) {
                    CameraMatrixExecute cameraMatrixExecute = this.cameraMatrixExecute;
                    AbstractC9133u.m16132f(data5, "data");
                    return cameraMatrixExecute.asyncExecute(data5, j10);
                }
                CameraMatrixExecute cameraMatrixExecute2 = this.cameraMatrixExecute;
                AbstractC9133u.m16132f(data5, "data");
                cameraMatrixExecute2.execute(data5);
                return null;
            case 6:
                EzyCommand.CommandSource.CommandInfo.Config data6 = EzyCommand.CommandSource.CommandInfo.Config.m7590s(command.m7448j());
                if (z10) {
                    ConfigExecute configExecute = this.configExecute;
                    AbstractC9133u.m16132f(data6, "data");
                    return configExecute.asyncExecute(data6, j10);
                }
                ConfigExecute configExecute2 = this.configExecute;
                AbstractC9133u.m16132f(data6, "data");
                configExecute2.execute(data6);
                return null;
            case 7:
                EzyCommand.CommandSource.CommandInfo.GraphChange data7 = EzyCommand.CommandSource.CommandInfo.GraphChange.m7664G(command.m7448j());
                if (z10) {
                    GraphChangeExecute graphChangeExecute = this.graphChangeExecute;
                    AbstractC9133u.m16132f(data7, "data");
                    return graphChangeExecute.asyncExecute(data7, j10);
                }
                GraphChangeExecute graphChangeExecute2 = this.graphChangeExecute;
                AbstractC9133u.m16132f(data7, "data");
                graphChangeExecute2.execute(data7);
                return null;
            case 8:
                Any data8 = Any.parseFrom(command.m7448j());
                if (z10) {
                    RecordStopExecute recordStopExecute = this.recordStopExecute;
                    AbstractC9133u.m16132f(data8, "data");
                    return recordStopExecute.asyncExecute(data8, j10);
                }
                RecordStopExecute recordStopExecute2 = this.recordStopExecute;
                AbstractC9133u.m16132f(data8, "data");
                recordStopExecute2.execute(data8);
                return null;
            case 9:
                EzyCommand.CommandSource.CommandInfo.CursorMove data9 = EzyCommand.CommandSource.CommandInfo.CursorMove.m7636l(command.m7448j());
                if (z10) {
                    CursorMoveExecute cursorMoveExecute = this.cursorMoveExecute;
                    AbstractC9133u.m16132f(data9, "data");
                    return cursorMoveExecute.asyncExecute(data9, j10);
                }
                CursorMoveExecute cursorMoveExecute2 = this.cursorMoveExecute;
                AbstractC9133u.m16132f(data9, "data");
                cursorMoveExecute2.execute(data9);
                return null;
            case 10:
                EzyCommand.CommandSource.CommandInfo.REBUILD data10 = EzyCommand.CommandSource.CommandInfo.REBUILD.m7894p(command.m7448j());
                if (z10) {
                    RebuildExecute rebuildExecute = this.rebuildExecute;
                    AbstractC9133u.m16132f(data10, "data");
                    return rebuildExecute.asyncExecute(data10, j10);
                }
                RebuildExecute rebuildExecute2 = this.rebuildExecute;
                AbstractC9133u.m16132f(data10, "data");
                rebuildExecute2.execute(data10);
                return null;
            default:
                return null;
        }
    }

    @Override // com.zykj.blackboard.core.execute.BaseCommandExecuteFactory
    public void executeCommand(CommandInfoEntity command) {
        AbstractC9133u.m16133g(command, "command");
        switch (WhenMappings.$EnumSwitchMapping$0[command.getCommandEnum().ordinal()]) {
            case 1:
                EzyCommand.CommandSource.CommandInfo.GraphData data = EzyCommand.CommandSource.CommandInfo.GraphData.m7738D(command.getData());
                GraphDataExecute graphDataExecute = this.graphDataExecute;
                AbstractC9133u.m16132f(data, "data");
                graphDataExecute.execute(data);
                break;
            case 2:
                EzyCommand.CommandSource.CommandInfo.GraphRemove data2 = EzyCommand.CommandSource.CommandInfo.GraphRemove.m7859m(command.getData());
                GraphRemoveExecute graphRemoveExecute = this.graphRemoveExecute;
                AbstractC9133u.m16132f(data2, "data");
                graphRemoveExecute.execute(data2);
                break;
            case 3:
                EzyCommand.CommandSource.CommandInfo.GraphMatrix data3 = EzyCommand.CommandSource.CommandInfo.GraphMatrix.m7809z(command.getData());
                GraphMatrixExecute graphMatrixExecute = this.graphMatrixExecute;
                AbstractC9133u.m16132f(data3, "data");
                graphMatrixExecute.execute(data3);
                break;
            case 4:
                EzyCommand.CommandSource.CommandInfo.Camera data4 = EzyCommand.CommandSource.CommandInfo.Camera.m7497p(command.getData());
                CameraExecute cameraExecute = this.cameraExecute;
                AbstractC9133u.m16132f(data4, "data");
                cameraExecute.execute(data4);
                break;
            case 5:
                EzyCommand.CommandSource.CommandInfo.CameraMatrix data5 = EzyCommand.CommandSource.CommandInfo.CameraMatrix.m7542t(command.getData());
                CameraMatrixExecute cameraMatrixExecute = this.cameraMatrixExecute;
                AbstractC9133u.m16132f(data5, "data");
                cameraMatrixExecute.execute(data5);
                break;
            case 6:
                EzyCommand.CommandSource.CommandInfo.Config data6 = EzyCommand.CommandSource.CommandInfo.Config.m7591t(command.getData());
                ConfigExecute configExecute = this.configExecute;
                AbstractC9133u.m16132f(data6, "data");
                configExecute.execute(data6);
                break;
            case 7:
                EzyCommand.CommandSource.CommandInfo.GraphChange data7 = EzyCommand.CommandSource.CommandInfo.GraphChange.m7665H(command.getData());
                GraphChangeExecute graphChangeExecute = this.graphChangeExecute;
                AbstractC9133u.m16132f(data7, "data");
                graphChangeExecute.execute(data7);
                break;
            case 8:
                Any data8 = Any.parseFrom(command.getData());
                RecordStopExecute recordStopExecute = this.recordStopExecute;
                AbstractC9133u.m16132f(data8, "data");
                recordStopExecute.execute(data8);
                break;
            case 9:
                EzyCommand.CommandSource.CommandInfo.CursorMove data9 = EzyCommand.CommandSource.CommandInfo.CursorMove.m7637m(command.getData());
                CursorMoveExecute cursorMoveExecute = this.cursorMoveExecute;
                AbstractC9133u.m16132f(data9, "data");
                cursorMoveExecute.execute(data9);
                break;
            case 10:
                EzyCommand.CommandSource.CommandInfo.REBUILD data10 = EzyCommand.CommandSource.CommandInfo.REBUILD.m7895q(command.getData());
                RebuildExecute rebuildExecute = this.rebuildExecute;
                AbstractC9133u.m16132f(data10, "data");
                rebuildExecute.execute(data10);
                break;
        }
    }
}
