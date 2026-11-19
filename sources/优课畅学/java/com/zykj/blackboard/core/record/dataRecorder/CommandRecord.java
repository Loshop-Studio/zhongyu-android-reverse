package com.zykj.blackboard.core.record.dataRecorder;

import android.graphics.PointF;
import com.blankj.utilcode.util.AbstractC5380q;
import com.google.protobuf.Any;
import com.google.protobuf.Message;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.bean.CommonSourceResult;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.blackboard.core.data.dao.CommandRecordEntity;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.record.DataRecorder;
import com.zykj.blackboard.core.record.ITimeRecord;
import com.zykj.blackboard.core.record.TimeRecord;
import com.zykj.blackboard.listener.EventListener;
import com.zykj.blackboard.utils.ConvertExtKt;
import com.zykj.blackboard.utils.GraphUtils;
import com.zykj.blackboard.utils.GraphUtilsKt;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyCommandEnum;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzyPointF;
import com.zykj.board.EzyRectF;
import com.zykj.board.EzyTouchEvent;
import io.objectbox.relation.ToMany;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8811w;
import p300x7.InterfaceC10559a;

/* loaded from: classes4.dex */
public final class CommandRecord extends DataRecorder {
    public static final Companion Companion = new Companion(null);
    public static final String SOURCE_FILE_NAME_SUFFIX = "_command.bin";
    private CommandRecordEntity commandRecordEntity;
    private final List<EventListener> eventListenerList;
    private final FileSourceRecord fileSourceRecord;
    private final GeometrySourceRecord geometrySourceRecord;
    private final MatrixSourceRecord matrixSourceRecord;
    private RecordEntity recordEntity;
    private final ThreadPoolExecutor service;
    private final TextSourceRecord textSourceRecord;
    private final TouchSourceRecord touchSourceRecord;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommandRecord(TimeRecord timeRecord) {
        super(timeRecord);
        AbstractC9133u.m16133g(timeRecord, "timeRecord");
        this.touchSourceRecord = new TouchSourceRecord();
        this.matrixSourceRecord = new MatrixSourceRecord();
        this.fileSourceRecord = new FileSourceRecord();
        this.eventListenerList = new ArrayList();
        this.textSourceRecord = new TextSourceRecord();
        this.geometrySourceRecord = new GeometrySourceRecord();
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        AbstractC9133u.m16131e(executorServiceNewCachedThreadPool, "null cannot be cast to non-null type java.util.concurrent.ThreadPoolExecutor");
        this.service = (ThreadPoolExecutor) executorServiceNewCachedThreadPool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addCamera$lambda-17, reason: not valid java name */
    public static final CommandInfoEntity m27461addCamera$lambda17(CommandRecord this$0, long j10, final EzyMatrix.Matrix originMatrix, final EzyMatrix.Matrix lastMatrix) throws IllegalAccessException, IllegalArgumentException {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(originMatrix, "$originMatrix");
        AbstractC9133u.m16133g(lastMatrix, "$lastMatrix");
        TimeRecord timeRecord = this$0.getTimeRecord();
        CommandInfoEntity commandInfoEntityBuildCommandInfoEntity = this$0.buildCommandInfoEntity(timeRecord != null ? ITimeRecord.DefaultImpls.getDelayTime$default(timeRecord, j10, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_CAMERA, new InterfaceC10559a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addCamera$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Message invoke() {
                EzyCommand.CommandSource.CommandInfo.Camera.C7184b c7184bM7495l = EzyCommand.CommandSource.CommandInfo.Camera.m7495l();
                c7184bM7495l.m7507A(originMatrix);
                c7184bM7495l.m7532z(lastMatrix);
                EzyCommand.CommandSource.CommandInfo.Camera cameraBuild = c7184bM7495l.build();
                AbstractC9133u.m16132f(cameraBuild, "builder.build()");
                return cameraBuild;
            }
        });
        this$0.updateEntity(commandInfoEntityBuildCommandInfoEntity);
        return commandInfoEntityBuildCommandInfoEntity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addCameraMatrix$lambda-15, reason: not valid java name */
    public static final CommandInfoEntity m27462addCameraMatrix$lambda15(final List matrixList, final CommandRecord this$0, long j10, final EzyMatrix.Matrix lastMatrix, final EzyMatrix.Matrix originMatrix) throws IllegalAccessException, IllegalArgumentException {
        AbstractC9133u.m16133g(matrixList, "$matrixList");
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(lastMatrix, "$lastMatrix");
        AbstractC9133u.m16133g(originMatrix, "$originMatrix");
        if (matrixList.isEmpty()) {
            return null;
        }
        long eventTime = matrixList.size() == 1 ? 0L : ((EzyMatrix.Matrix) AbstractC8778f0.m14578x0(matrixList)).getEventTime() - ((EzyMatrix.Matrix) AbstractC8778f0.m14566l0(matrixList)).getEventTime();
        CommandInfoEntity commandInfoEntityBuildCommandInfoEntity = this$0.buildCommandInfoEntity(this$0.getStartEventTime(eventTime, j10), eventTime, EzyCommandEnum.CommandEnum.ACTION_CAMERA_MATRIX, new InterfaceC10559a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addCameraMatrix$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Message invoke() throws IllegalAccessException, IllegalArgumentException {
                EzyCommand.CommandSource.CommandInfo.CameraMatrix.C7186b c7186bM7540p = EzyCommand.CommandSource.CommandInfo.CameraMatrix.m7540p();
                c7186bM7540p.m7581z(lastMatrix);
                c7186bM7540p.m7556A(originMatrix);
                CommonSourceResult commonSourceResultAdd = this$0.matrixSourceRecord.add(matrixList);
                if (commonSourceResultAdd != null) {
                    c7186bM7540p.m7558C(commonSourceResultAdd.getSourceFileName());
                    c7186bM7540p.m7559D(commonSourceResultAdd.getSourceId());
                }
                EzyCommand.CommandSource.CommandInfo.CameraMatrix cameraMatrixBuild = c7186bM7540p.build();
                AbstractC9133u.m16132f(cameraMatrixBuild, "builder.build()");
                return cameraMatrixBuild;
            }
        });
        this$0.updateEntity(commandInfoEntityBuildCommandInfoEntity);
        return commandInfoEntityBuildCommandInfoEntity;
    }

    public static /* synthetic */ CommandInfoEntity addCommand$default(CommandRecord commandRecord, String str, EzyGraphEnum.GraphEnum graphEnum, List list, EzyPaint.Paint paint, String str2, long j10, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            str2 = UUID.randomUUID().toString();
            AbstractC9133u.m16132f(str2, "randomUUID().toString()");
        }
        return commandRecord.addCommand(str, graphEnum, list, paint, str2, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addCommand$lambda-1, reason: not valid java name */
    public static final CommandInfoEntity m27463addCommand$lambda1(CommandRecord this$0, long j10, final EzyGraphEnum.GraphEnum graphType, final EzyRectF.RectF rectF, final String parentGraphId) throws IllegalAccessException, IllegalArgumentException {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(graphType, "$graphType");
        AbstractC9133u.m16133g(rectF, "$rectF");
        AbstractC9133u.m16133g(parentGraphId, "$parentGraphId");
        TimeRecord timeRecord = this$0.getTimeRecord();
        CommandInfoEntity commandInfoEntityBuildCommandInfoEntity = this$0.buildCommandInfoEntity(timeRecord != null ? ITimeRecord.DefaultImpls.getDelayTime$default(timeRecord, j10, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_GRAPH_ADD, new InterfaceC10559a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addCommand$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Message invoke() {
                EzyCommand.CommandSource.CommandInfo.GraphData.C7194b c7194bM7754z = EzyCommand.CommandSource.CommandInfo.GraphData.m7754z();
                c7194bM7754z.m7794y(UUID.randomUUID().toString());
                c7194bM7754z.m7792w(graphType);
                c7194bM7754z.m7795z(rectF);
                c7194bM7754z.m7768A(parentGraphId);
                EzyCommand.CommandSource.CommandInfo.GraphData graphDataBuild = c7194bM7754z.build();
                AbstractC9133u.m16132f(graphDataBuild, "builder.build()");
                return graphDataBuild;
            }
        });
        this$0.updateEntity(commandInfoEntityBuildCommandInfoEntity);
        return commandInfoEntityBuildCommandInfoEntity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addCommand$lambda-3, reason: not valid java name */
    public static final CommandInfoEntity m27464addCommand$lambda3(final List eventList, final CommandRecord this$0, long j10, final String graphId, final EzyGraphEnum.GraphEnum graphType, final String parentGraphId, final EzyPaint.Paint paint) throws IllegalAccessException, IllegalArgumentException {
        AbstractC9133u.m16133g(eventList, "$eventList");
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(graphId, "$graphId");
        AbstractC9133u.m16133g(graphType, "$graphType");
        AbstractC9133u.m16133g(parentGraphId, "$parentGraphId");
        AbstractC9133u.m16133g(paint, "$paint");
        if (eventList.isEmpty()) {
            return null;
        }
        long eventTime = eventList.size() == 1 ? 0L : ((EzyTouchEvent.TouchEvent) AbstractC8778f0.m14578x0(eventList)).getEventTime() - ((EzyTouchEvent.TouchEvent) AbstractC8778f0.m14566l0(eventList)).getEventTime();
        CommandInfoEntity commandInfoEntityBuildCommandInfoEntity = this$0.buildCommandInfoEntity(this$0.getStartEventTime(eventTime, j10), eventTime, EzyCommandEnum.CommandEnum.ACTION_GRAPH_ADD, new InterfaceC10559a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addCommand$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Message invoke() throws IllegalAccessException, IllegalArgumentException {
                EzyCommand.CommandSource.CommandInfo.GraphData.C7194b c7194bM7754z = EzyCommand.CommandSource.CommandInfo.GraphData.m7754z();
                c7194bM7754z.m7794y(graphId);
                c7194bM7754z.m7792w(graphType);
                c7194bM7754z.m7795z(GraphUtilsKt.covertEzyRectF(GraphUtils.INSTANCE.findPointListRectF(eventList)));
                c7194bM7754z.m7768A(parentGraphId);
                CommonSourceResult commonSourceResultAddTouchEvent = this$0.touchSourceRecord.addTouchEvent(eventList, paint);
                if (commonSourceResultAddTouchEvent != null) {
                    c7194bM7754z.m7770C(commonSourceResultAddTouchEvent.getSourceFileName());
                    c7194bM7754z.m7771D(commonSourceResultAddTouchEvent.getSourceId());
                }
                EzyCommand.CommandSource.CommandInfo.GraphData graphDataBuild = c7194bM7754z.build();
                AbstractC9133u.m16132f(graphDataBuild, "builder.build()");
                return graphDataBuild;
            }
        });
        this$0.updateEntity(commandInfoEntityBuildCommandInfoEntity);
        return commandInfoEntityBuildCommandInfoEntity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addCommand$lambda-5, reason: not valid java name */
    public static final CommandInfoEntity m27465addCommand$lambda5(final CommandRecord this$0, long j10, final EzyGraphEnum.GraphEnum graphType, final int i10, final int i11, final String parentGraphId, final String fileName, final String validate, final boolean z10) throws IllegalAccessException, IllegalArgumentException {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(graphType, "$graphType");
        AbstractC9133u.m16133g(parentGraphId, "$parentGraphId");
        AbstractC9133u.m16133g(fileName, "$fileName");
        AbstractC9133u.m16133g(validate, "$validate");
        TimeRecord timeRecord = this$0.getTimeRecord();
        CommandInfoEntity commandInfoEntityBuildCommandInfoEntity = this$0.buildCommandInfoEntity(timeRecord != null ? ITimeRecord.DefaultImpls.getDelayTime$default(timeRecord, j10, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_GRAPH_ADD, new InterfaceC10559a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addCommand$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Message invoke() throws IllegalAccessException, IllegalArgumentException {
                EzyCommand.CommandSource.CommandInfo.GraphData.C7194b c7194bM7754z = EzyCommand.CommandSource.CommandInfo.GraphData.m7754z();
                c7194bM7754z.m7794y(UUID.randomUUID().toString());
                c7194bM7754z.m7792w(graphType);
                c7194bM7754z.m7795z(EzyRectF.RectF.m8548h().m8569s(0.0f).m8572v(0.0f).m8571u(i10).m8567q(i11).build());
                c7194bM7754z.m7768A(parentGraphId);
                CommonSourceResult commonSourceResultAddFile = this$0.fileSourceRecord.addFile(fileName, validate, i10, i11);
                if (commonSourceResultAddFile != null) {
                    c7194bM7754z.m7770C(commonSourceResultAddFile.getSourceFileName());
                    c7194bM7754z.m7771D(commonSourceResultAddFile.getSourceId());
                }
                if (z10) {
                    c7194bM7754z.m7790u(c7194bM7754z.m7782m() + "imageBackground;");
                }
                EzyCommand.CommandSource.CommandInfo.GraphData graphDataBuild = c7194bM7754z.build();
                AbstractC9133u.m16132f(graphDataBuild, "builder.build()");
                return graphDataBuild;
            }
        });
        this$0.updateEntity(commandInfoEntityBuildCommandInfoEntity);
        return commandInfoEntityBuildCommandInfoEntity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addConfigCommand$lambda-19, reason: not valid java name */
    public static final CommandInfoEntity m27466addConfigCommand$lambda19(CommandRecord this$0, long j10, final int i10, final int i11, final BackgroundLineConfig originBackgroundLineConfig, final BackgroundLineConfig lastBackgroundLineConfig) throws IllegalAccessException, IllegalArgumentException {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(originBackgroundLineConfig, "$originBackgroundLineConfig");
        AbstractC9133u.m16133g(lastBackgroundLineConfig, "$lastBackgroundLineConfig");
        TimeRecord timeRecord = this$0.getTimeRecord();
        CommandInfoEntity commandInfoEntityBuildCommandInfoEntity = this$0.buildCommandInfoEntity(timeRecord != null ? ITimeRecord.DefaultImpls.getDelayTime$default(timeRecord, j10, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_CONFIG, new InterfaceC10559a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addConfigCommand$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Message invoke() {
                EzyCommand.CommandSource.CommandInfo.Config.C7188b c7188bM7589p = EzyCommand.CommandSource.CommandInfo.Config.m7589p();
                c7188bM7589p.m7604B(i10);
                c7188bM7589p.m7630z(i11);
                c7188bM7589p.m7605C(ConvertExtKt.toEzyConfig(originBackgroundLineConfig));
                c7188bM7589p.m7603A(ConvertExtKt.toEzyConfig(lastBackgroundLineConfig));
                EzyCommand.CommandSource.CommandInfo.Config configBuild = c7188bM7589p.build();
                AbstractC9133u.m16132f(configBuild, "builder.build()");
                return configBuild;
            }
        });
        this$0.updateEntity(commandInfoEntityBuildCommandInfoEntity);
        return commandInfoEntityBuildCommandInfoEntity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addGeometryGraphCommand$lambda-9, reason: not valid java name */
    public static final CommandInfoEntity m27467addGeometryGraphCommand$lambda9(final CommandRecord this$0, long j10, final float f10, final float f11, final String parentGraphId, final int i10, final List pointList, final EzyPaint.Paint paint) throws IllegalAccessException, IllegalArgumentException {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(parentGraphId, "$parentGraphId");
        AbstractC9133u.m16133g(pointList, "$pointList");
        AbstractC9133u.m16133g(paint, "$paint");
        TimeRecord timeRecord = this$0.getTimeRecord();
        CommandInfoEntity commandInfoEntityBuildCommandInfoEntity = this$0.buildCommandInfoEntity(timeRecord != null ? ITimeRecord.DefaultImpls.getDelayTime$default(timeRecord, j10, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_GRAPH_ADD, new InterfaceC10559a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addGeometryGraphCommand$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Message invoke() throws IllegalAccessException, IllegalArgumentException {
                EzyCommand.CommandSource.CommandInfo.GraphData.C7194b c7194bM7754z = EzyCommand.CommandSource.CommandInfo.GraphData.m7754z();
                c7194bM7754z.m7794y(UUID.randomUUID().toString());
                c7194bM7754z.m7792w(EzyGraphEnum.GraphEnum.GEOMETRY_GRAPH);
                c7194bM7754z.m7795z(EzyRectF.RectF.m8548h().m8569s(0.0f).m8572v(0.0f).m8571u(f10).m8567q(f11).build());
                c7194bM7754z.m7768A(parentGraphId);
                GeometrySourceRecord geometrySourceRecord = this$0.geometrySourceRecord;
                int i11 = i10;
                List<PointF> list = pointList;
                ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(GraphUtilsKt.covertEzyPointF((PointF) it.next()));
                }
                CommonSourceResult commonSourceResultAddGeometry = geometrySourceRecord.addGeometry(i11, arrayList, paint);
                if (commonSourceResultAddGeometry != null) {
                    c7194bM7754z.m7770C(commonSourceResultAddGeometry.getSourceFileName());
                    c7194bM7754z.m7771D(commonSourceResultAddGeometry.getSourceId());
                }
                EzyCommand.CommandSource.CommandInfo.GraphData graphDataBuild = c7194bM7754z.build();
                AbstractC9133u.m16132f(graphDataBuild, "builder.build()");
                return graphDataBuild;
            }
        });
        this$0.updateEntity(commandInfoEntityBuildCommandInfoEntity);
        return commandInfoEntityBuildCommandInfoEntity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addGraphMatrix$lambda-13, reason: not valid java name */
    public static final CommandInfoEntity m27468addGraphMatrix$lambda13(final List matrixList, final CommandRecord this$0, long j10, final List graphIdList) throws IllegalAccessException, IllegalArgumentException {
        AbstractC9133u.m16133g(matrixList, "$matrixList");
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(graphIdList, "$graphIdList");
        if (matrixList.isEmpty()) {
            return null;
        }
        long eventTime = matrixList.size() == 1 ? 0L : ((EzyMatrix.Matrix) AbstractC8778f0.m14578x0(matrixList)).getEventTime() - ((EzyMatrix.Matrix) AbstractC8778f0.m14566l0(matrixList)).getEventTime();
        CommandInfoEntity commandInfoEntityBuildCommandInfoEntity = this$0.buildCommandInfoEntity(this$0.getStartEventTime(eventTime, j10), eventTime, EzyCommandEnum.CommandEnum.ACTION_GRAPH_MATRIX, new InterfaceC10559a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addGraphMatrix$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Message invoke() throws IllegalAccessException, IllegalArgumentException {
                EzyCommand.CommandSource.CommandInfo.GraphMatrix.C7196b c7196bM7807v = EzyCommand.CommandSource.CommandInfo.GraphMatrix.m7807v();
                c7196bM7807v.m7832c(graphIdList);
                CommonSourceResult commonSourceResultAdd = this$0.matrixSourceRecord.add(matrixList);
                if (commonSourceResultAdd != null) {
                    c7196bM7807v.m7829E(commonSourceResultAdd.getSourceFileName());
                    c7196bM7807v.m7830F(commonSourceResultAdd.getSourceId());
                }
                EzyCommand.CommandSource.CommandInfo.GraphMatrix graphMatrixBuild = c7196bM7807v.build();
                AbstractC9133u.m16132f(graphMatrixBuild, "builder.build()");
                return graphMatrixBuild;
            }
        });
        this$0.updateEntity(commandInfoEntityBuildCommandInfoEntity);
        return commandInfoEntityBuildCommandInfoEntity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addTextGraphCommand$lambda-7, reason: not valid java name */
    public static final CommandInfoEntity m27469addTextGraphCommand$lambda7(final CommandRecord this$0, long j10, final float f10, final float f11, final String parentGraphId, final String content, final EzyPaint.Paint paint) throws IllegalAccessException, IllegalArgumentException {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(parentGraphId, "$parentGraphId");
        AbstractC9133u.m16133g(content, "$content");
        AbstractC9133u.m16133g(paint, "$paint");
        TimeRecord timeRecord = this$0.getTimeRecord();
        CommandInfoEntity commandInfoEntityBuildCommandInfoEntity = this$0.buildCommandInfoEntity(timeRecord != null ? ITimeRecord.DefaultImpls.getDelayTime$default(timeRecord, j10, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_GRAPH_ADD, new InterfaceC10559a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addTextGraphCommand$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Message invoke() throws IllegalAccessException, IllegalArgumentException {
                EzyCommand.CommandSource.CommandInfo.GraphData.C7194b c7194bM7754z = EzyCommand.CommandSource.CommandInfo.GraphData.m7754z();
                c7194bM7754z.m7794y(UUID.randomUUID().toString());
                c7194bM7754z.m7792w(EzyGraphEnum.GraphEnum.TEXT_GRAPH);
                c7194bM7754z.m7795z(EzyRectF.RectF.m8548h().m8569s(0.0f).m8572v(0.0f).m8571u(f10).m8567q(f11).build());
                c7194bM7754z.m7768A(parentGraphId);
                CommonSourceResult commonSourceResultAddText = this$0.textSourceRecord.addText(content, paint);
                if (commonSourceResultAddText != null) {
                    c7194bM7754z.m7770C(commonSourceResultAddText.getSourceFileName());
                    c7194bM7754z.m7771D(commonSourceResultAddText.getSourceId());
                }
                EzyCommand.CommandSource.CommandInfo.GraphData graphDataBuild = c7194bM7754z.build();
                AbstractC9133u.m16132f(graphDataBuild, "builder.build()");
                return graphDataBuild;
            }
        });
        this$0.updateEntity(commandInfoEntityBuildCommandInfoEntity);
        return commandInfoEntityBuildCommandInfoEntity;
    }

    private final CommandRecordEntity buildRecordEntity() {
        RecordEntity recordEntity = this.recordEntity;
        if (recordEntity == null) {
            return null;
        }
        CommandRecordEntity commandRecordEntity = new CommandRecordEntity(0L, UUID.randomUUID() + SOURCE_FILE_NAME_SUFFIX, "");
        recordEntity.getCommandList().add(commandRecordEntity);
        recordEntity.put();
        return commandRecordEntity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: changeGraph$lambda-11, reason: not valid java name */
    public static final CommandInfoEntity m27470changeGraph$lambda11(CommandRecord this$0, long j10, final String graphId, final EzyGraphEnum.GraphEnum graphEnum, final EzyRectF.RectF rectF, final String str, final EzyPaint.Paint paint, final List list, final EzyMatrix.Matrix matrix, final String str2) throws IllegalAccessException, IllegalArgumentException {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(graphId, "$graphId");
        AbstractC9133u.m16133g(graphEnum, "$graphEnum");
        TimeRecord timeRecord = this$0.getTimeRecord();
        CommandInfoEntity commandInfoEntityBuildCommandInfoEntity = this$0.buildCommandInfoEntity(timeRecord != null ? ITimeRecord.DefaultImpls.getDelayTime$default(timeRecord, j10, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_GRAPH_CHANGE, new InterfaceC10559a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$changeGraph$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Message invoke() {
                EzyCommand.CommandSource.CommandInfo.GraphChange.C7192b c7192bM7663D = EzyCommand.CommandSource.CommandInfo.GraphChange.m7663D();
                c7192bM7663D.m7708K(graphId);
                c7192bM7663D.m7706I(graphEnum);
                EzyRectF.RectF rectF2 = rectF;
                if (rectF2 != null) {
                    c7192bM7663D.m7709L(rectF2);
                }
                String str3 = str;
                if (str3 != null) {
                    c7192bM7663D.m7703F(str3);
                }
                EzyPaint.Paint paint2 = paint;
                if (paint2 != null) {
                    c7192bM7663D.m7710M(paint2);
                }
                List<EzyPointF.PointF> list2 = list;
                if (list2 != null) {
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        c7192bM7663D.m7714c((EzyPointF.PointF) it.next());
                    }
                }
                EzyMatrix.Matrix matrix2 = matrix;
                if (matrix2 != null) {
                    c7192bM7663D.m7711N(matrix2);
                }
                String str4 = str2;
                if (str4 != null) {
                    c7192bM7663D.m7705H(str4);
                }
                EzyCommand.CommandSource.CommandInfo.GraphChange graphChangeBuild = c7192bM7663D.build();
                AbstractC9133u.m16132f(graphChangeBuild, "builder.build()");
                return graphChangeBuild;
            }
        });
        this$0.updateEntity(commandInfoEntityBuildCommandInfoEntity);
        return commandInfoEntityBuildCommandInfoEntity;
    }

    private final synchronized void checkLength() {
        try {
            CommandRecordEntity commandRecordEntity = this.commandRecordEntity;
            if (commandRecordEntity == null) {
                this.commandRecordEntity = buildRecordEntity();
            } else {
                AbstractC9133u.m16130d(commandRecordEntity);
                if (commandRecordEntity.getCommandInfoEntity().size() >= 100) {
                    this.commandRecordEntity = buildRecordEntity();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final CommandRecordEntity initRecordEntity() {
        ToMany<CommandRecordEntity> commandList;
        CommandRecordEntity commandRecordEntity;
        RecordEntity recordEntity = this.recordEntity;
        return (recordEntity == null || (commandList = recordEntity.getCommandList()) == null || (commandRecordEntity = (CommandRecordEntity) AbstractC8778f0.m14579y0(commandList)) == null || commandRecordEntity.getCommandInfoEntity().size() >= 100) ? buildRecordEntity() : commandRecordEntity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: moveCursor$lambda-25, reason: not valid java name */
    public static final CommandInfoEntity m27471moveCursor$lambda25(final List eventList, final CommandRecord this$0, long j10, final EzyPaint.Paint paint) throws IllegalAccessException, IllegalArgumentException {
        AbstractC9133u.m16133g(eventList, "$eventList");
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(paint, "$paint");
        if (eventList.isEmpty()) {
            return null;
        }
        long eventTime = eventList.size() == 1 ? 0L : ((EzyTouchEvent.TouchEvent) AbstractC8778f0.m14578x0(eventList)).getEventTime() - ((EzyTouchEvent.TouchEvent) AbstractC8778f0.m14566l0(eventList)).getEventTime();
        CommandInfoEntity commandInfoEntityBuildCommandInfoEntity = this$0.buildCommandInfoEntity(this$0.getStartEventTime(eventTime, j10), eventTime, EzyCommandEnum.CommandEnum.ACTION_CURSOR_MOVE, new InterfaceC10559a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$moveCursor$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Message invoke() throws IllegalAccessException, IllegalArgumentException {
                EzyCommand.CommandSource.CommandInfo.CursorMove.C7190b c7190bM7635i = EzyCommand.CommandSource.CommandInfo.CursorMove.m7635i();
                CommonSourceResult commonSourceResultAddTouchEvent = this.this$0.touchSourceRecord.addTouchEvent(eventList, paint);
                if (commonSourceResultAddTouchEvent != null) {
                    c7190bM7635i.m7660s(commonSourceResultAddTouchEvent.getSourceFileName());
                    c7190bM7635i.m7661t(commonSourceResultAddTouchEvent.getSourceId());
                }
                EzyCommand.CommandSource.CommandInfo.CursorMove cursorMoveBuild = c7190bM7635i.build();
                AbstractC9133u.m16132f(cursorMoveBuild, "builder.build()");
                return cursorMoveBuild;
            }
        });
        this$0.updateEntity(commandInfoEntityBuildCommandInfoEntity);
        return commandInfoEntityBuildCommandInfoEntity;
    }

    private final void notifyEvent(CommandInfoEntity commandInfoEntity) {
        Iterator<T> it = this.eventListenerList.iterator();
        while (it.hasNext()) {
            try {
                ((EventListener) it.next()).onEvent(commandInfoEntity);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rebuild$lambda-27, reason: not valid java name */
    public static final CommandInfoEntity m27472rebuild$lambda27(CommandRecord this$0, long j10, final Graph rootGraph, final int i10) throws IllegalAccessException, IllegalArgumentException {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(rootGraph, "$rootGraph");
        TimeRecord timeRecord = this$0.getTimeRecord();
        CommandInfoEntity commandInfoEntityBuildCommandInfoEntity = this$0.buildCommandInfoEntity(timeRecord != null ? ITimeRecord.DefaultImpls.getDelayTime$default(timeRecord, j10, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_REBUILD, new InterfaceC10559a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$rebuild$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Message invoke() {
                EzyCommand.CommandSource.CommandInfo.REBUILD.C7200b c7200bM7893m = EzyCommand.CommandSource.CommandInfo.REBUILD.m7893m();
                c7200bM7893m.m7906B(rootGraph.getSnapshot().build());
                c7200bM7893m.m7929y(i10);
                EzyCommand.CommandSource.CommandInfo.REBUILD rebuildBuild = c7200bM7893m.build();
                AbstractC9133u.m16132f(rebuildBuild, "builder.build()");
                return rebuildBuild;
            }
        });
        this$0.updateEntity(commandInfoEntityBuildCommandInfoEntity);
        return commandInfoEntityBuildCommandInfoEntity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: removeGraphList$lambda-21, reason: not valid java name */
    public static final CommandInfoEntity m27473removeGraphList$lambda21(CommandRecord this$0, long j10, final List graphIdList) throws IllegalAccessException, IllegalArgumentException {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(graphIdList, "$graphIdList");
        TimeRecord timeRecord = this$0.getTimeRecord();
        CommandInfoEntity commandInfoEntityBuildCommandInfoEntity = this$0.buildCommandInfoEntity(timeRecord != null ? ITimeRecord.DefaultImpls.getDelayTime$default(timeRecord, j10, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_GRAPH_REMOVE, new InterfaceC10559a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$removeGraphList$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Message invoke() {
                EzyCommand.CommandSource.CommandInfo.GraphRemove.C7198b c7198bM7857i = EzyCommand.CommandSource.CommandInfo.GraphRemove.m7857i();
                c7198bM7857i.m7869c(graphIdList);
                EzyCommand.CommandSource.CommandInfo.GraphRemove graphRemoveBuild = c7198bM7857i.build();
                AbstractC9133u.m16132f(graphRemoveBuild, "builder.build()");
                return graphRemoveBuild;
            }
        });
        this$0.updateEntity(commandInfoEntityBuildCommandInfoEntity);
        return commandInfoEntityBuildCommandInfoEntity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: stopRecord$lambda-23, reason: not valid java name */
    public static final CommandInfoEntity m27474stopRecord$lambda23(long j10, CommandRecord this$0) throws IllegalAccessException, IllegalArgumentException {
        AbstractC9133u.m16133g(this$0, "this$0");
        EzyCommandEnum.CommandEnum commandEnum = EzyCommandEnum.CommandEnum.ACTION_RECORD_STOP;
        byte[] byteArray = Any.newBuilder().build().toByteArray();
        AbstractC9133u.m16132f(byteArray, "newBuilder().build().toByteArray()");
        CommandInfoEntity commandInfoEntity = new CommandInfoEntity(0L, j10, 0L, true, commandEnum, byteArray);
        this$0.updateEntity(commandInfoEntity);
        return commandInfoEntity;
    }

    private final void updateEntity(CommandInfoEntity commandInfoEntity) throws IllegalAccessException, IllegalArgumentException {
        CommandRecordEntity commandRecordEntity = this.commandRecordEntity;
        if (commandRecordEntity != null) {
            commandInfoEntity.getRecord().m15518k(commandRecordEntity);
            commandInfoEntity.put();
            commandRecordEntity.getCommandInfoEntity().add(commandInfoEntity);
            commandRecordEntity.put();
        }
        AbstractC5380q.m2623s("CommandRecord:updateEntity -> " + commandInfoEntity.getCommandEnum());
        checkLength();
        notifyEvent(commandInfoEntity);
    }

    public final CommandInfoEntity addCamera(final EzyMatrix.Matrix originMatrix, final EzyMatrix.Matrix lastMatrix, final long j10) throws ExecutionException, InterruptedException {
        AbstractC9133u.m16133g(originMatrix, "originMatrix");
        AbstractC9133u.m16133g(lastMatrix, "lastMatrix");
        Object obj = this.service.submit(new Callable() { // from class: com.zykj.blackboard.core.record.dataRecorder.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m27461addCamera$lambda17(this.f8862a, j10, originMatrix, lastMatrix);
            }
        }).get();
        AbstractC9133u.m16132f(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    public final CommandInfoEntity addCameraMatrix(final EzyMatrix.Matrix originMatrix, final EzyMatrix.Matrix lastMatrix, final List<EzyMatrix.Matrix> matrixList, final long j10) {
        AbstractC9133u.m16133g(originMatrix, "originMatrix");
        AbstractC9133u.m16133g(lastMatrix, "lastMatrix");
        AbstractC9133u.m16133g(matrixList, "matrixList");
        return (CommandInfoEntity) this.service.submit(new Callable() { // from class: com.zykj.blackboard.core.record.dataRecorder.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m27462addCameraMatrix$lambda15(matrixList, this, j10, lastMatrix, originMatrix);
            }
        }).get();
    }

    public final CommandInfoEntity addCommand(final String parentGraphId, final EzyGraphEnum.GraphEnum graphType, final EzyRectF.RectF rectF, final long j10) throws ExecutionException, InterruptedException {
        AbstractC9133u.m16133g(parentGraphId, "parentGraphId");
        AbstractC9133u.m16133g(graphType, "graphType");
        AbstractC9133u.m16133g(rectF, "rectF");
        Object obj = this.service.submit(new Callable() { // from class: com.zykj.blackboard.core.record.dataRecorder.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m27463addCommand$lambda1(this.f8823a, j10, graphType, rectF, parentGraphId);
            }
        }).get();
        AbstractC9133u.m16132f(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    public final CommandInfoEntity addConfigCommand(final int i10, final int i11, final BackgroundLineConfig originBackgroundLineConfig, final BackgroundLineConfig lastBackgroundLineConfig, final long j10) {
        AbstractC9133u.m16133g(originBackgroundLineConfig, "originBackgroundLineConfig");
        AbstractC9133u.m16133g(lastBackgroundLineConfig, "lastBackgroundLineConfig");
        Object obj = this.service.submit(new Callable() { // from class: com.zykj.blackboard.core.record.dataRecorder.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m27466addConfigCommand$lambda19(this.f8836a, j10, i10, i11, originBackgroundLineConfig, lastBackgroundLineConfig);
            }
        }).get();
        AbstractC9133u.m16132f(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    public final CommandInfoEntity addGeometryGraphCommand(final String parentGraphId, final float f10, final float f11, final int i10, final List<? extends PointF> pointList, final EzyPaint.Paint paint, final long j10) throws ExecutionException, InterruptedException {
        AbstractC9133u.m16133g(parentGraphId, "parentGraphId");
        AbstractC9133u.m16133g(pointList, "pointList");
        AbstractC9133u.m16133g(paint, "paint");
        Object obj = this.service.submit(new Callable() { // from class: com.zykj.blackboard.core.record.dataRecorder.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m27467addGeometryGraphCommand$lambda9(this.f8828a, j10, f10, f11, parentGraphId, i10, pointList, paint);
            }
        }).get();
        AbstractC9133u.m16132f(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    public final CommandInfoEntity addGraphMatrix(final List<EzyCommand.CommandSource.CommandInfo.GraphData> graphIdList, final List<EzyMatrix.Matrix> matrixList, final long j10) {
        AbstractC9133u.m16133g(graphIdList, "graphIdList");
        AbstractC9133u.m16133g(matrixList, "matrixList");
        return (CommandInfoEntity) this.service.submit(new Callable() { // from class: com.zykj.blackboard.core.record.dataRecorder.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m27468addGraphMatrix$lambda13(matrixList, this, j10, graphIdList);
            }
        }).get();
    }

    public final CommandInfoEntity addTextGraphCommand(final String parentGraphId, final float f10, final float f11, final EzyPaint.Paint paint, final String content, final long j10) throws ExecutionException, InterruptedException {
        AbstractC9133u.m16133g(parentGraphId, "parentGraphId");
        AbstractC9133u.m16133g(paint, "paint");
        AbstractC9133u.m16133g(content, "content");
        Object obj = this.service.submit(new Callable() { // from class: com.zykj.blackboard.core.record.dataRecorder.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m27469addTextGraphCommand$lambda7(this.f8851a, j10, f10, f11, parentGraphId, content, paint);
            }
        }).get();
        AbstractC9133u.m16132f(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    public final CommandInfoEntity changeGraph(final String graphId, final EzyGraphEnum.GraphEnum graphEnum, final EzyRectF.RectF rectF, final String str, final EzyPaint.Paint paint, final List<EzyPointF.PointF> list, final EzyMatrix.Matrix matrix, final String str2, final long j10) throws ExecutionException, InterruptedException {
        AbstractC9133u.m16133g(graphId, "graphId");
        AbstractC9133u.m16133g(graphEnum, "graphEnum");
        Object obj = this.service.submit(new Callable() { // from class: com.zykj.blackboard.core.record.dataRecorder.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m27470changeGraph$lambda11(this.f8866a, j10, graphId, graphEnum, rectF, str, paint, list, matrix, str2);
            }
        }).get();
        AbstractC9133u.m16132f(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    public final boolean isExecutorsTaskDone() {
        return this.service.getCompletedTaskCount() == this.service.getTaskCount();
    }

    public final CommandInfoEntity moveCursor(final List<EzyTouchEvent.TouchEvent> eventList, final EzyPaint.Paint paint, final long j10) {
        AbstractC9133u.m16133g(eventList, "eventList");
        AbstractC9133u.m16133g(paint, "paint");
        return (CommandInfoEntity) this.service.submit(new Callable() { // from class: com.zykj.blackboard.core.record.dataRecorder.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m27471moveCursor$lambda25(eventList, this, j10, paint);
            }
        }).get();
    }

    public final CommandInfoEntity rebuild(final Graph rootGraph, final int i10, final long j10) {
        AbstractC9133u.m16133g(rootGraph, "rootGraph");
        Object obj = this.service.submit(new Callable() { // from class: com.zykj.blackboard.core.record.dataRecorder.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m27472rebuild$lambda27(this.f8858a, j10, rootGraph, i10);
            }
        }).get();
        AbstractC9133u.m16132f(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    public final void registerEventListener(EventListener listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.eventListenerList.add(listener);
    }

    public final CommandInfoEntity removeGraphList(final List<EzyCommand.CommandSource.CommandInfo.GraphData> graphIdList, final long j10) throws ExecutionException, InterruptedException {
        AbstractC9133u.m16133g(graphIdList, "graphIdList");
        Object obj = this.service.submit(new Callable() { // from class: com.zykj.blackboard.core.record.dataRecorder.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m27473removeGraphList$lambda21(this.f8820a, j10, graphIdList);
            }
        }).get();
        AbstractC9133u.m16132f(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    public final void setRecord(RecordEntity recordEntity) {
        AbstractC9133u.m16133g(recordEntity, "recordEntity");
        this.recordEntity = recordEntity;
        this.touchSourceRecord.setRecord(recordEntity);
        this.matrixSourceRecord.setRecord(recordEntity);
        this.fileSourceRecord.setRecord(recordEntity);
        this.textSourceRecord.setRecord(recordEntity);
        this.geometrySourceRecord.setRecord(recordEntity);
        this.commandRecordEntity = initRecordEntity();
    }

    public final void stopRecord(final long j10) {
        this.service.submit(new Callable() { // from class: com.zykj.blackboard.core.record.dataRecorder.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m27474stopRecord$lambda23(j10, this);
            }
        });
    }

    public final void unRegisterEventListener(EventListener listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.eventListenerList.remove(listener);
    }

    public final CommandInfoEntity addCommand(final String parentGraphId, final EzyGraphEnum.GraphEnum graphType, final List<EzyTouchEvent.TouchEvent> eventList, final EzyPaint.Paint paint, final String graphId, final long j10) {
        AbstractC9133u.m16133g(parentGraphId, "parentGraphId");
        AbstractC9133u.m16133g(graphType, "graphType");
        AbstractC9133u.m16133g(eventList, "eventList");
        AbstractC9133u.m16133g(paint, "paint");
        AbstractC9133u.m16133g(graphId, "graphId");
        return (CommandInfoEntity) this.service.submit(new Callable() { // from class: com.zykj.blackboard.core.record.dataRecorder.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m27464addCommand$lambda3(eventList, this, j10, graphId, graphType, parentGraphId, paint);
            }
        }).get();
    }

    public final CommandInfoEntity addCommand(final String parentGraphId, final String fileName, final EzyGraphEnum.GraphEnum graphType, final String validate, final int i10, final int i11, final long j10, final boolean z10) throws ExecutionException, InterruptedException {
        AbstractC9133u.m16133g(parentGraphId, "parentGraphId");
        AbstractC9133u.m16133g(fileName, "fileName");
        AbstractC9133u.m16133g(graphType, "graphType");
        AbstractC9133u.m16133g(validate, "validate");
        Object obj = this.service.submit(new Callable() { // from class: com.zykj.blackboard.core.record.dataRecorder.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m27465addCommand$lambda5(this.f8804a, j10, graphType, i10, i11, parentGraphId, fileName, validate, z10);
            }
        }).get();
        AbstractC9133u.m16132f(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }
}
