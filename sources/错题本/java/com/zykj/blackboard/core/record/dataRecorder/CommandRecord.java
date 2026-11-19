package com.zykj.blackboard.core.record.dataRecorder;

import android.graphics.PointF;
import androidx.camera.core.impl.utils.futures.CallableC0400f;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.blankj.utilcode.util.AbstractC3387g;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.Message;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
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
import com.zykj.board.C4366g;
import com.zykj.board.C4370i;
import com.zykj.board.C4374k;
import com.zykj.board.C4378m;
import com.zykj.board.C4382o;
import com.zykj.board.C4386q;
import com.zykj.board.C4392t;
import com.zykj.board.C4396v;
import com.zykj.board.C4400x;
import com.zykj.board.EzyCommand$CommandSource;
import com.zykj.board.EzyCommandEnum$CommandEnum;
import com.zykj.board.EzyGraphEnum$GraphEnum;
import com.zykj.board.EzyHeader$BackgroundLineConfig;
import com.zykj.board.EzyMatrix$Matrix;
import com.zykj.board.EzyPageSnapshot$PageSnapshot;
import com.zykj.board.EzyPaint$Paint;
import com.zykj.board.EzyPointF$PointF;
import com.zykj.board.EzyRectF$RectF;
import com.zykj.board.EzyTouchEvent$TouchEvent;
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
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p020b4.C3116b1;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ~2\u00020\u0001:\u0001~B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010JG\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0017JO\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u000f\u0010\u001fJ=\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\"\u0010#JK\u0010'\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020 2\u0006\u0010$\u001a\u00020\u001a2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b'\u0010(Jg\u00100\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010\n2\b\u0010!\u001a\u0004\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u00112\b\u0010.\u001a\u0004\u0018\u00010-2\b\u0010/\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b0\u00101J3\u00106\u001a\u0004\u0018\u00010\u000e2\f\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00112\f\u00105\u001a\b\u0012\u0004\u0012\u00020-042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b6\u00107J5\u0010:\u001a\u0004\u0018\u00010\u000e2\u0006\u00108\u001a\u00020-2\u0006\u00109\u001a\u00020-2\f\u00105\u001a\b\u0012\u0004\u0012\u00020-042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b:\u0010;J%\u0010<\u001a\u00020\u000e2\u0006\u00108\u001a\u00020-2\u0006\u00109\u001a\u00020-2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b<\u0010=J5\u0010C\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020@2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\bC\u0010DJ#\u0010E\u001a\u00020\u000e2\f\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00112\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\bE\u0010FJ\u0015\u0010I\u001a\u00020H2\u0006\u0010G\u001a\u00020\f¢\u0006\u0004\bI\u0010JJ-\u0010K\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\bK\u0010LJ%\u0010P\u001a\u00020\u000e2\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\bP\u0010QJ\u0015\u0010T\u001a\u00020H2\u0006\u0010S\u001a\u00020R¢\u0006\u0004\bT\u0010UJ\u0015\u0010X\u001a\u00020H2\u0006\u0010W\u001a\u00020V¢\u0006\u0004\bX\u0010YJ\u0015\u0010Z\u001a\u00020H2\u0006\u0010W\u001a\u00020V¢\u0006\u0004\bZ\u0010YJ\u0017\u0010\\\u001a\u00020H2\u0006\u0010[\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020HH\u0002¢\u0006\u0004\b^\u0010_J\u0011\u0010a\u001a\u0004\u0018\u00010`H\u0002¢\u0006\u0004\ba\u0010bJ\u0011\u0010c\u001a\u0004\u0018\u00010`H\u0002¢\u0006\u0004\bc\u0010bJ\u0017\u0010d\u001a\u00020H2\u0006\u0010[\u001a\u00020\u000eH\u0002¢\u0006\u0004\bd\u0010]R\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010eR\u0018\u0010f\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010i\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u001a\u0010q\u001a\b\u0012\u0004\u0012\u00020V048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010t\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010w\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010z\u001a\u00020y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0011\u0010|\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b|\u0010}¨\u0006\u007f"}, m5110d2 = {"Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;", "Lcom/zykj/blackboard/core/record/DataRecorder;", "Lcom/zykj/blackboard/core/record/TimeRecord;", "timeRecord", "<init>", "(Lcom/zykj/blackboard/core/record/TimeRecord;)V", "", "parentGraphId", "Lcom/zykj/board/EzyGraphEnum$GraphEnum;", "graphType", "Lcom/zykj/board/EzyRectF$RectF;", "rectF", "", "currentTime", "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;", "addCommand", "(Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;", "", "Lcom/zykj/board/EzyTouchEvent$TouchEvent;", "eventList", "Lcom/zykj/board/EzyPaint$Paint;", "paint", "graphId", "(Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;Ljava/lang/String;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;", "fileName", "validate", "", "width", "height", "", "imageBackground", "(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/lang/String;IIJZ)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;", "", "content", "addTextGraphCommand", "(Ljava/lang/String;FFLcom/zykj/board/EzyPaint$Paint;Ljava/lang/String;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;", "geometryType", "Landroid/graphics/PointF;", "pointList", "addGeometryGraphCommand", "(Ljava/lang/String;FFILjava/util/List;Lcom/zykj/board/EzyPaint$Paint;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;", "graphEnum", "originRectF", "Lcom/zykj/board/EzyPointF$PointF;", "points", "Lcom/zykj/board/EzyMatrix$Matrix;", "renderMatrix", "filePath", "changeGraph", "(Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;Ljava/util/List;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/lang/String;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;", "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;", "graphIdList", "", "matrixList", "addGraphMatrix", "(Ljava/util/List;Ljava/util/List;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;", "originMatrix", "lastMatrix", "addCameraMatrix", "(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/util/List;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;", "addCamera", "(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;", "originBackgroundColor", "lastBackgroundColor", "Lcom/zykj/blackboard/bean/BackgroundLineConfig;", "originBackgroundLineConfig", "lastBackgroundLineConfig", "addConfigCommand", "(IILcom/zykj/blackboard/bean/BackgroundLineConfig;Lcom/zykj/blackboard/bean/BackgroundLineConfig;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;", "removeGraphList", "(Ljava/util/List;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;", "delayTime", "Ld6/s;", "stopRecord", "(J)V", "moveCursor", "(Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;", "Lcom/zykj/blackboard/core/graph/Graph;", "rootGraph", "backgroundColor", "rebuild", "(Lcom/zykj/blackboard/core/graph/Graph;IJ)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;", "Lcom/zykj/blackboard/core/data/dao/RecordEntity;", "recordEntity", "setRecord", "(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V", "Lcom/zykj/blackboard/listener/EventListener;", "listener", "registerEventListener", "(Lcom/zykj/blackboard/listener/EventListener;)V", "unRegisterEventListener", "entity", "updateEntity", "(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V", "checkLength", "()V", "Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;", "initRecordEntity", "()Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;", "buildRecordEntity", "notifyEvent", "Lcom/zykj/blackboard/core/data/dao/RecordEntity;", "commandRecordEntity", "Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;", "Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord;", "touchSourceRecord", "Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord;", "Lcom/zykj/blackboard/core/record/dataRecorder/MatrixSourceRecord;", "matrixSourceRecord", "Lcom/zykj/blackboard/core/record/dataRecorder/MatrixSourceRecord;", "Lcom/zykj/blackboard/core/record/dataRecorder/FileSourceRecord;", "fileSourceRecord", "Lcom/zykj/blackboard/core/record/dataRecorder/FileSourceRecord;", "eventListenerList", "Ljava/util/List;", "Lcom/zykj/blackboard/core/record/dataRecorder/TextSourceRecord;", "textSourceRecord", "Lcom/zykj/blackboard/core/record/dataRecorder/TextSourceRecord;", "Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord;", "geometrySourceRecord", "Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord;", "Ljava/util/concurrent/ThreadPoolExecutor;", NotificationCompat.CATEGORY_SERVICE, "Ljava/util/concurrent/ThreadPoolExecutor;", "isExecutorsTaskDone", "()Z", "Companion", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class CommandRecord extends DataRecorder {

    @NotNull
    public static final String SOURCE_FILE_NAME_SUFFIX = "_command.bin";

    @Nullable
    private CommandRecordEntity commandRecordEntity;

    @NotNull
    private final List<EventListener> eventListenerList;

    @NotNull
    private final FileSourceRecord fileSourceRecord;

    @NotNull
    private final GeometrySourceRecord geometrySourceRecord;

    @NotNull
    private final MatrixSourceRecord matrixSourceRecord;

    @Nullable
    private RecordEntity recordEntity;

    @NotNull
    private final ThreadPoolExecutor service;

    @NotNull
    private final TextSourceRecord textSourceRecord;

    @NotNull
    private final TouchSourceRecord touchSourceRecord;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommandRecord(@NotNull TimeRecord timeRecord) {
        super(timeRecord);
        AbstractC5830k.m5330g(timeRecord, "timeRecord");
        this.touchSourceRecord = new TouchSourceRecord();
        this.matrixSourceRecord = new MatrixSourceRecord();
        this.fileSourceRecord = new FileSourceRecord();
        this.eventListenerList = new ArrayList();
        this.textSourceRecord = new TextSourceRecord();
        this.geometrySourceRecord = new GeometrySourceRecord();
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        AbstractC5830k.m5328e(executorServiceNewCachedThreadPool, "null cannot be cast to non-null type java.util.concurrent.ThreadPoolExecutor");
        this.service = (ThreadPoolExecutor) executorServiceNewCachedThreadPool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addCamera$lambda-17, reason: not valid java name */
    public static final CommandInfoEntity m13797addCamera$lambda17(CommandRecord this$0, long j7, final EzyMatrix$Matrix originMatrix, final EzyMatrix$Matrix lastMatrix) {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(originMatrix, "$originMatrix");
        AbstractC5830k.m5330g(lastMatrix, "$lastMatrix");
        TimeRecord timeRecord = this$0.getTimeRecord();
        CommandInfoEntity commandInfoEntityBuildCommandInfoEntity = this$0.buildCommandInfoEntity(timeRecord != null ? ITimeRecord.DefaultImpls.getDelayTime$default(timeRecord, j7, false, 2, null) : 0L, 0L, EzyCommandEnum$CommandEnum.ACTION_CAMERA, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addCamera$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            @NotNull
            public final Message invoke() {
                C4366g c4366gNewBuilder = EzyCommand$CommandSource.CommandInfo.Camera.newBuilder();
                EzyMatrix$Matrix ezyMatrix$Matrix = originMatrix;
                SingleFieldBuilderV3 singleFieldBuilderV3 = c4366gNewBuilder.f5499c;
                if (singleFieldBuilderV3 == null) {
                    ezyMatrix$Matrix.getClass();
                    c4366gNewBuilder.f5498b = ezyMatrix$Matrix;
                } else {
                    singleFieldBuilderV3.setMessage(ezyMatrix$Matrix);
                }
                c4366gNewBuilder.f5497a |= 1;
                c4366gNewBuilder.onChanged();
                EzyMatrix$Matrix ezyMatrix$Matrix2 = lastMatrix;
                SingleFieldBuilderV3 singleFieldBuilderV32 = c4366gNewBuilder.f5501e;
                if (singleFieldBuilderV32 == null) {
                    ezyMatrix$Matrix2.getClass();
                    c4366gNewBuilder.f5500d = ezyMatrix$Matrix2;
                } else {
                    singleFieldBuilderV32.setMessage(ezyMatrix$Matrix2);
                }
                c4366gNewBuilder.f5497a |= 2;
                c4366gNewBuilder.onChanged();
                EzyCommand$CommandSource.CommandInfo.Camera cameraBuildPartial = c4366gNewBuilder.buildPartial();
                if (cameraBuildPartial.isInitialized()) {
                    return cameraBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) cameraBuildPartial);
            }
        });
        this$0.updateEntity(commandInfoEntityBuildCommandInfoEntity);
        return commandInfoEntityBuildCommandInfoEntity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addCameraMatrix$lambda-15, reason: not valid java name */
    public static final CommandInfoEntity m13798addCameraMatrix$lambda15(final List matrixList, final CommandRecord this$0, long j7, final EzyMatrix$Matrix lastMatrix, final EzyMatrix$Matrix originMatrix) {
        AbstractC5830k.m5330g(matrixList, "$matrixList");
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(lastMatrix, "$lastMatrix");
        AbstractC5830k.m5330g(originMatrix, "$originMatrix");
        if (matrixList.isEmpty()) {
            return null;
        }
        long eventTime = matrixList.size() == 1 ? 0L : ((EzyMatrix$Matrix) AbstractC5805t.m5235o0(matrixList)).getEventTime() - ((EzyMatrix$Matrix) AbstractC5805t.m5228h0(matrixList)).getEventTime();
        CommandInfoEntity commandInfoEntityBuildCommandInfoEntity = this$0.buildCommandInfoEntity(this$0.getStartEventTime(eventTime, j7), eventTime, EzyCommandEnum$CommandEnum.ACTION_CAMERA_MATRIX, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addCameraMatrix$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            @NotNull
            public final Message invoke() {
                C4370i c4370iNewBuilder = EzyCommand$CommandSource.CommandInfo.CameraMatrix.newBuilder();
                EzyMatrix$Matrix ezyMatrix$Matrix = lastMatrix;
                SingleFieldBuilderV3 singleFieldBuilderV3 = c4370iNewBuilder.f5509e;
                if (singleFieldBuilderV3 == null) {
                    ezyMatrix$Matrix.getClass();
                    c4370iNewBuilder.f5508d = ezyMatrix$Matrix;
                } else {
                    singleFieldBuilderV3.setMessage(ezyMatrix$Matrix);
                }
                c4370iNewBuilder.f5505a |= 2;
                c4370iNewBuilder.onChanged();
                EzyMatrix$Matrix ezyMatrix$Matrix2 = originMatrix;
                SingleFieldBuilderV3 singleFieldBuilderV32 = c4370iNewBuilder.f5507c;
                if (singleFieldBuilderV32 == null) {
                    ezyMatrix$Matrix2.getClass();
                    c4370iNewBuilder.f5506b = ezyMatrix$Matrix2;
                } else {
                    singleFieldBuilderV32.setMessage(ezyMatrix$Matrix2);
                }
                c4370iNewBuilder.f5505a |= 1;
                c4370iNewBuilder.onChanged();
                CommonSourceResult commonSourceResultAdd = this$0.matrixSourceRecord.add(matrixList);
                if (commonSourceResultAdd != null) {
                    String sourceFileName = commonSourceResultAdd.getSourceFileName();
                    sourceFileName.getClass();
                    c4370iNewBuilder.f5510f = sourceFileName;
                    c4370iNewBuilder.f5505a |= 4;
                    c4370iNewBuilder.onChanged();
                    c4370iNewBuilder.f5511g = commonSourceResultAdd.getSourceId();
                    c4370iNewBuilder.f5505a |= 8;
                    c4370iNewBuilder.onChanged();
                }
                EzyCommand$CommandSource.CommandInfo.CameraMatrix cameraMatrixBuildPartial = c4370iNewBuilder.buildPartial();
                if (cameraMatrixBuildPartial.isInitialized()) {
                    return cameraMatrixBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) cameraMatrixBuildPartial);
            }
        });
        this$0.updateEntity(commandInfoEntityBuildCommandInfoEntity);
        return commandInfoEntityBuildCommandInfoEntity;
    }

    public static /* synthetic */ CommandInfoEntity addCommand$default(CommandRecord commandRecord, String str, EzyGraphEnum$GraphEnum ezyGraphEnum$GraphEnum, List list, EzyPaint$Paint ezyPaint$Paint, String str2, long j7, int i, Object obj) {
        if ((i & 16) != 0) {
            str2 = UUID.randomUUID().toString();
            AbstractC5830k.m5329f(str2, "randomUUID().toString()");
        }
        return commandRecord.addCommand(str, ezyGraphEnum$GraphEnum, list, ezyPaint$Paint, str2, j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addCommand$lambda-1, reason: not valid java name */
    public static final CommandInfoEntity m13799addCommand$lambda1(CommandRecord this$0, long j7, final EzyGraphEnum$GraphEnum graphType, final EzyRectF$RectF rectF, final String parentGraphId) {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(graphType, "$graphType");
        AbstractC5830k.m5330g(rectF, "$rectF");
        AbstractC5830k.m5330g(parentGraphId, "$parentGraphId");
        TimeRecord timeRecord = this$0.getTimeRecord();
        CommandInfoEntity commandInfoEntityBuildCommandInfoEntity = this$0.buildCommandInfoEntity(timeRecord != null ? ITimeRecord.DefaultImpls.getDelayTime$default(timeRecord, j7, false, 2, null) : 0L, 0L, EzyCommandEnum$CommandEnum.ACTION_GRAPH_ADD, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addCommand$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            @NotNull
            public final Message invoke() {
                C4386q c4386qNewBuilder = EzyCommand$CommandSource.CommandInfo.GraphData.newBuilder();
                c4386qNewBuilder.m3812k(UUID.randomUUID().toString());
                c4386qNewBuilder.m3811j(graphType);
                c4386qNewBuilder.m3813l(rectF);
                c4386qNewBuilder.m3814m(parentGraphId);
                return c4386qNewBuilder.build();
            }
        });
        this$0.updateEntity(commandInfoEntityBuildCommandInfoEntity);
        return commandInfoEntityBuildCommandInfoEntity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addCommand$lambda-3, reason: not valid java name */
    public static final CommandInfoEntity m13800addCommand$lambda3(final List eventList, final CommandRecord this$0, long j7, final String graphId, final EzyGraphEnum$GraphEnum graphType, final String parentGraphId, final EzyPaint$Paint paint) {
        AbstractC5830k.m5330g(eventList, "$eventList");
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(graphId, "$graphId");
        AbstractC5830k.m5330g(graphType, "$graphType");
        AbstractC5830k.m5330g(parentGraphId, "$parentGraphId");
        AbstractC5830k.m5330g(paint, "$paint");
        if (eventList.isEmpty()) {
            return null;
        }
        long eventTime = eventList.size() == 1 ? 0L : ((EzyTouchEvent$TouchEvent) AbstractC5805t.m5235o0(eventList)).getEventTime() - ((EzyTouchEvent$TouchEvent) AbstractC5805t.m5228h0(eventList)).getEventTime();
        CommandInfoEntity commandInfoEntityBuildCommandInfoEntity = this$0.buildCommandInfoEntity(this$0.getStartEventTime(eventTime, j7), eventTime, EzyCommandEnum$CommandEnum.ACTION_GRAPH_ADD, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addCommand$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            @NotNull
            public final Message invoke() {
                C4386q c4386qNewBuilder = EzyCommand$CommandSource.CommandInfo.GraphData.newBuilder();
                c4386qNewBuilder.m3812k(graphId);
                c4386qNewBuilder.m3811j(graphType);
                c4386qNewBuilder.m3813l(GraphUtilsKt.covertEzyRectF(GraphUtils.INSTANCE.findPointListRectF(eventList)));
                c4386qNewBuilder.m3814m(parentGraphId);
                CommonSourceResult commonSourceResultAddTouchEvent = this$0.touchSourceRecord.addTouchEvent(eventList, paint);
                if (commonSourceResultAddTouchEvent != null) {
                    c4386qNewBuilder.m3815n(commonSourceResultAddTouchEvent.getSourceFileName());
                    c4386qNewBuilder.m3816o(commonSourceResultAddTouchEvent.getSourceId());
                }
                return c4386qNewBuilder.build();
            }
        });
        this$0.updateEntity(commandInfoEntityBuildCommandInfoEntity);
        return commandInfoEntityBuildCommandInfoEntity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addCommand$lambda-5, reason: not valid java name */
    public static final CommandInfoEntity m13801addCommand$lambda5(final CommandRecord this$0, long j7, final EzyGraphEnum$GraphEnum graphType, final int i, final int i8, final String parentGraphId, final String fileName, final String validate, final boolean z8) {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(graphType, "$graphType");
        AbstractC5830k.m5330g(parentGraphId, "$parentGraphId");
        AbstractC5830k.m5330g(fileName, "$fileName");
        AbstractC5830k.m5330g(validate, "$validate");
        TimeRecord timeRecord = this$0.getTimeRecord();
        CommandInfoEntity commandInfoEntityBuildCommandInfoEntity = this$0.buildCommandInfoEntity(timeRecord != null ? ITimeRecord.DefaultImpls.getDelayTime$default(timeRecord, j7, false, 2, null) : 0L, 0L, EzyCommandEnum$CommandEnum.ACTION_GRAPH_ADD, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addCommand$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            @NotNull
            public final Message invoke() {
                String stringUtf8;
                C4386q c4386qNewBuilder = EzyCommand$CommandSource.CommandInfo.GraphData.newBuilder();
                c4386qNewBuilder.m3812k(UUID.randomUUID().toString());
                c4386qNewBuilder.m3811j(graphType);
                C3116b1 c3116b1NewBuilder = EzyRectF$RectF.newBuilder();
                c3116b1NewBuilder.m2091j(0.0f);
                c3116b1NewBuilder.m2093l(0.0f);
                c3116b1NewBuilder.m2092k(i);
                c3116b1NewBuilder.m2090i(i8);
                c4386qNewBuilder.m3813l(c3116b1NewBuilder.build());
                c4386qNewBuilder.m3814m(parentGraphId);
                CommonSourceResult commonSourceResultAddFile = this$0.fileSourceRecord.addFile(fileName, validate, i, i8);
                if (commonSourceResultAddFile != null) {
                    c4386qNewBuilder.m3815n(commonSourceResultAddFile.getSourceFileName());
                    c4386qNewBuilder.m3816o(commonSourceResultAddFile.getSourceId());
                }
                if (z8) {
                    StringBuilder sb = new StringBuilder();
                    Object obj = c4386qNewBuilder.f5563i;
                    if (obj instanceof String) {
                        stringUtf8 = (String) obj;
                    } else {
                        stringUtf8 = ((ByteString) obj).toStringUtf8();
                        c4386qNewBuilder.f5563i = stringUtf8;
                    }
                    sb.append(stringUtf8);
                    sb.append("imageBackground;");
                    String string = sb.toString();
                    string.getClass();
                    c4386qNewBuilder.f5563i = string;
                    c4386qNewBuilder.f5555a |= 64;
                    c4386qNewBuilder.onChanged();
                }
                return c4386qNewBuilder.build();
            }
        });
        this$0.updateEntity(commandInfoEntityBuildCommandInfoEntity);
        return commandInfoEntityBuildCommandInfoEntity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addConfigCommand$lambda-19, reason: not valid java name */
    public static final CommandInfoEntity m13802addConfigCommand$lambda19(CommandRecord this$0, long j7, final int i, final int i8, final BackgroundLineConfig originBackgroundLineConfig, final BackgroundLineConfig lastBackgroundLineConfig) {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(originBackgroundLineConfig, "$originBackgroundLineConfig");
        AbstractC5830k.m5330g(lastBackgroundLineConfig, "$lastBackgroundLineConfig");
        TimeRecord timeRecord = this$0.getTimeRecord();
        CommandInfoEntity commandInfoEntityBuildCommandInfoEntity = this$0.buildCommandInfoEntity(timeRecord != null ? ITimeRecord.DefaultImpls.getDelayTime$default(timeRecord, j7, false, 2, null) : 0L, 0L, EzyCommandEnum$CommandEnum.ACTION_CONFIG, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addConfigCommand$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            @NotNull
            public final Message invoke() {
                C4374k c4374kNewBuilder = EzyCommand$CommandSource.CommandInfo.Config.newBuilder();
                c4374kNewBuilder.f5516b = i;
                c4374kNewBuilder.f5515a |= 1;
                c4374kNewBuilder.onChanged();
                c4374kNewBuilder.f5517c = i8;
                c4374kNewBuilder.f5515a |= 2;
                c4374kNewBuilder.onChanged();
                EzyHeader$BackgroundLineConfig ezyConfig = ConvertExtKt.toEzyConfig(originBackgroundLineConfig);
                SingleFieldBuilderV3 singleFieldBuilderV3 = c4374kNewBuilder.f5519e;
                if (singleFieldBuilderV3 == null) {
                    ezyConfig.getClass();
                    c4374kNewBuilder.f5518d = ezyConfig;
                } else {
                    singleFieldBuilderV3.setMessage(ezyConfig);
                }
                c4374kNewBuilder.f5515a |= 4;
                c4374kNewBuilder.onChanged();
                EzyHeader$BackgroundLineConfig ezyConfig2 = ConvertExtKt.toEzyConfig(lastBackgroundLineConfig);
                SingleFieldBuilderV3 singleFieldBuilderV32 = c4374kNewBuilder.f5521g;
                if (singleFieldBuilderV32 == null) {
                    ezyConfig2.getClass();
                    c4374kNewBuilder.f5520f = ezyConfig2;
                } else {
                    singleFieldBuilderV32.setMessage(ezyConfig2);
                }
                c4374kNewBuilder.f5515a |= 8;
                c4374kNewBuilder.onChanged();
                EzyCommand$CommandSource.CommandInfo.Config configBuildPartial = c4374kNewBuilder.buildPartial();
                if (configBuildPartial.isInitialized()) {
                    return configBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) configBuildPartial);
            }
        });
        this$0.updateEntity(commandInfoEntityBuildCommandInfoEntity);
        return commandInfoEntityBuildCommandInfoEntity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addGeometryGraphCommand$lambda-9, reason: not valid java name */
    public static final CommandInfoEntity m13803addGeometryGraphCommand$lambda9(final CommandRecord this$0, long j7, final float f, final float f7, final String parentGraphId, final int i, final List pointList, final EzyPaint$Paint paint) {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(parentGraphId, "$parentGraphId");
        AbstractC5830k.m5330g(pointList, "$pointList");
        AbstractC5830k.m5330g(paint, "$paint");
        TimeRecord timeRecord = this$0.getTimeRecord();
        CommandInfoEntity commandInfoEntityBuildCommandInfoEntity = this$0.buildCommandInfoEntity(timeRecord != null ? ITimeRecord.DefaultImpls.getDelayTime$default(timeRecord, j7, false, 2, null) : 0L, 0L, EzyCommandEnum$CommandEnum.ACTION_GRAPH_ADD, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addGeometryGraphCommand$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            @NotNull
            public final Message invoke() {
                C4386q c4386qNewBuilder = EzyCommand$CommandSource.CommandInfo.GraphData.newBuilder();
                c4386qNewBuilder.m3812k(UUID.randomUUID().toString());
                c4386qNewBuilder.m3811j(EzyGraphEnum$GraphEnum.GEOMETRY_GRAPH);
                C3116b1 c3116b1NewBuilder = EzyRectF$RectF.newBuilder();
                c3116b1NewBuilder.m2091j(0.0f);
                c3116b1NewBuilder.m2093l(0.0f);
                c3116b1NewBuilder.m2092k(f);
                c3116b1NewBuilder.m2090i(f7);
                c4386qNewBuilder.m3813l(c3116b1NewBuilder.build());
                c4386qNewBuilder.m3814m(parentGraphId);
                GeometrySourceRecord geometrySourceRecord = this$0.geometrySourceRecord;
                int i8 = i;
                List<PointF> list = pointList;
                ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(GraphUtilsKt.covertEzyPointF((PointF) it.next()));
                }
                CommonSourceResult commonSourceResultAddGeometry = geometrySourceRecord.addGeometry(i8, arrayList, paint);
                if (commonSourceResultAddGeometry != null) {
                    c4386qNewBuilder.m3815n(commonSourceResultAddGeometry.getSourceFileName());
                    c4386qNewBuilder.m3816o(commonSourceResultAddGeometry.getSourceId());
                }
                return c4386qNewBuilder.build();
            }
        });
        this$0.updateEntity(commandInfoEntityBuildCommandInfoEntity);
        return commandInfoEntityBuildCommandInfoEntity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addGraphMatrix$lambda-13, reason: not valid java name */
    public static final CommandInfoEntity m13804addGraphMatrix$lambda13(final List matrixList, final CommandRecord this$0, long j7, final List graphIdList) {
        AbstractC5830k.m5330g(matrixList, "$matrixList");
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(graphIdList, "$graphIdList");
        if (matrixList.isEmpty()) {
            return null;
        }
        long eventTime = matrixList.size() == 1 ? 0L : ((EzyMatrix$Matrix) AbstractC5805t.m5235o0(matrixList)).getEventTime() - ((EzyMatrix$Matrix) AbstractC5805t.m5228h0(matrixList)).getEventTime();
        CommandInfoEntity commandInfoEntityBuildCommandInfoEntity = this$0.buildCommandInfoEntity(this$0.getStartEventTime(eventTime, j7), eventTime, EzyCommandEnum$CommandEnum.ACTION_GRAPH_MATRIX, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addGraphMatrix$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            @NotNull
            public final Message invoke() {
                C4392t c4392tNewBuilder = EzyCommand$CommandSource.CommandInfo.GraphMatrix.newBuilder();
                List<EzyCommand$CommandSource.CommandInfo.GraphData> list = graphIdList;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = c4392tNewBuilder.f5572c;
                if (repeatedFieldBuilderV3 == null) {
                    c4392tNewBuilder.m3829f();
                    AbstractMessageLite.Builder.addAll((Iterable) list, c4392tNewBuilder.f5571b);
                    c4392tNewBuilder.onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(list);
                }
                CommonSourceResult commonSourceResultAdd = this$0.matrixSourceRecord.add(matrixList);
                if (commonSourceResultAdd != null) {
                    String sourceFileName = commonSourceResultAdd.getSourceFileName();
                    sourceFileName.getClass();
                    c4392tNewBuilder.f5577h = sourceFileName;
                    c4392tNewBuilder.f5570a |= 8;
                    c4392tNewBuilder.onChanged();
                    c4392tNewBuilder.f5578i = commonSourceResultAdd.getSourceId();
                    c4392tNewBuilder.f5570a |= 16;
                    c4392tNewBuilder.onChanged();
                }
                EzyCommand$CommandSource.CommandInfo.GraphMatrix graphMatrixBuildPartial = c4392tNewBuilder.buildPartial();
                if (graphMatrixBuildPartial.isInitialized()) {
                    return graphMatrixBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) graphMatrixBuildPartial);
            }
        });
        this$0.updateEntity(commandInfoEntityBuildCommandInfoEntity);
        return commandInfoEntityBuildCommandInfoEntity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addTextGraphCommand$lambda-7, reason: not valid java name */
    public static final CommandInfoEntity m13805addTextGraphCommand$lambda7(final CommandRecord this$0, long j7, final float f, final float f7, final String parentGraphId, final String content, final EzyPaint$Paint paint) {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(parentGraphId, "$parentGraphId");
        AbstractC5830k.m5330g(content, "$content");
        AbstractC5830k.m5330g(paint, "$paint");
        TimeRecord timeRecord = this$0.getTimeRecord();
        CommandInfoEntity commandInfoEntityBuildCommandInfoEntity = this$0.buildCommandInfoEntity(timeRecord != null ? ITimeRecord.DefaultImpls.getDelayTime$default(timeRecord, j7, false, 2, null) : 0L, 0L, EzyCommandEnum$CommandEnum.ACTION_GRAPH_ADD, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addTextGraphCommand$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            @NotNull
            public final Message invoke() {
                C4386q c4386qNewBuilder = EzyCommand$CommandSource.CommandInfo.GraphData.newBuilder();
                c4386qNewBuilder.m3812k(UUID.randomUUID().toString());
                c4386qNewBuilder.m3811j(EzyGraphEnum$GraphEnum.TEXT_GRAPH);
                C3116b1 c3116b1NewBuilder = EzyRectF$RectF.newBuilder();
                c3116b1NewBuilder.m2091j(0.0f);
                c3116b1NewBuilder.m2093l(0.0f);
                c3116b1NewBuilder.m2092k(f);
                c3116b1NewBuilder.m2090i(f7);
                c4386qNewBuilder.m3813l(c3116b1NewBuilder.build());
                c4386qNewBuilder.m3814m(parentGraphId);
                CommonSourceResult commonSourceResultAddText = this$0.textSourceRecord.addText(content, paint);
                if (commonSourceResultAddText != null) {
                    c4386qNewBuilder.m3815n(commonSourceResultAddText.getSourceFileName());
                    c4386qNewBuilder.m3816o(commonSourceResultAddText.getSourceId());
                }
                return c4386qNewBuilder.build();
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
    public static final CommandInfoEntity m13806changeGraph$lambda11(CommandRecord this$0, long j7, final String graphId, final EzyGraphEnum$GraphEnum graphEnum, final EzyRectF$RectF ezyRectF$RectF, final String str, final EzyPaint$Paint ezyPaint$Paint, final List list, final EzyMatrix$Matrix ezyMatrix$Matrix, final String str2) {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(graphId, "$graphId");
        AbstractC5830k.m5330g(graphEnum, "$graphEnum");
        TimeRecord timeRecord = this$0.getTimeRecord();
        CommandInfoEntity commandInfoEntityBuildCommandInfoEntity = this$0.buildCommandInfoEntity(timeRecord != null ? ITimeRecord.DefaultImpls.getDelayTime$default(timeRecord, j7, false, 2, null) : 0L, 0L, EzyCommandEnum$CommandEnum.ACTION_GRAPH_CHANGE, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$changeGraph$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            @NotNull
            public final Message invoke() {
                C4382o c4382oNewBuilder = EzyCommand$CommandSource.CommandInfo.GraphChange.newBuilder();
                String str3 = graphId;
                c4382oNewBuilder.getClass();
                str3.getClass();
                c4382oNewBuilder.f5540b = str3;
                c4382oNewBuilder.f5539a |= 1;
                c4382oNewBuilder.onChanged();
                EzyGraphEnum$GraphEnum ezyGraphEnum$GraphEnum = graphEnum;
                ezyGraphEnum$GraphEnum.getClass();
                c4382oNewBuilder.f5539a |= 2;
                c4382oNewBuilder.f5541c = ezyGraphEnum$GraphEnum.getNumber();
                c4382oNewBuilder.onChanged();
                EzyRectF$RectF ezyRectF$RectF2 = ezyRectF$RectF;
                if (ezyRectF$RectF2 != null) {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = c4382oNewBuilder.f5543e;
                    if (singleFieldBuilderV3 == null) {
                        c4382oNewBuilder.f5542d = ezyRectF$RectF2;
                    } else {
                        singleFieldBuilderV3.setMessage(ezyRectF$RectF2);
                    }
                    c4382oNewBuilder.f5539a |= 4;
                    c4382oNewBuilder.onChanged();
                }
                String str4 = str;
                if (str4 != null) {
                    c4382oNewBuilder.f5544f = str4;
                    c4382oNewBuilder.f5539a |= 8;
                    c4382oNewBuilder.onChanged();
                }
                EzyPaint$Paint ezyPaint$Paint2 = ezyPaint$Paint;
                if (ezyPaint$Paint2 != null) {
                    SingleFieldBuilderV3 singleFieldBuilderV32 = c4382oNewBuilder.f5546h;
                    if (singleFieldBuilderV32 == null) {
                        c4382oNewBuilder.f5545g = ezyPaint$Paint2;
                    } else {
                        singleFieldBuilderV32.setMessage(ezyPaint$Paint2);
                    }
                    c4382oNewBuilder.f5539a |= 16;
                    c4382oNewBuilder.onChanged();
                }
                List<EzyPointF$PointF> list2 = list;
                if (list2 != null) {
                    for (EzyPointF$PointF ezyPointF$PointF : list2) {
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = c4382oNewBuilder.f5548j;
                        if (repeatedFieldBuilderV3 == null) {
                            ezyPointF$PointF.getClass();
                            c4382oNewBuilder.ensurePointsIsMutable();
                            c4382oNewBuilder.f5547i.add(ezyPointF$PointF);
                            c4382oNewBuilder.onChanged();
                        } else {
                            repeatedFieldBuilderV3.addMessage(ezyPointF$PointF);
                        }
                    }
                }
                EzyMatrix$Matrix ezyMatrix$Matrix2 = ezyMatrix$Matrix;
                if (ezyMatrix$Matrix2 != null) {
                    SingleFieldBuilderV3 singleFieldBuilderV33 = c4382oNewBuilder.f5550l;
                    if (singleFieldBuilderV33 == null) {
                        c4382oNewBuilder.f5549k = ezyMatrix$Matrix2;
                    } else {
                        singleFieldBuilderV33.setMessage(ezyMatrix$Matrix2);
                    }
                    c4382oNewBuilder.f5539a |= 64;
                    c4382oNewBuilder.onChanged();
                }
                String str5 = str2;
                if (str5 != null) {
                    c4382oNewBuilder.f5551m = str5;
                    c4382oNewBuilder.f5539a |= 128;
                    c4382oNewBuilder.onChanged();
                }
                EzyCommand$CommandSource.CommandInfo.GraphChange graphChangeBuildPartial = c4382oNewBuilder.buildPartial();
                if (graphChangeBuildPartial.isInitialized()) {
                    return graphChangeBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) graphChangeBuildPartial);
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
                AbstractC5830k.m5327d(commandRecordEntity);
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
        return (recordEntity == null || (commandList = recordEntity.getCommandList()) == null || (commandRecordEntity = (CommandRecordEntity) AbstractC5805t.m5236p0(commandList)) == null || commandRecordEntity.getCommandInfoEntity().size() >= 100) ? buildRecordEntity() : commandRecordEntity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: moveCursor$lambda-25, reason: not valid java name */
    public static final CommandInfoEntity m13807moveCursor$lambda25(final List eventList, final CommandRecord this$0, long j7, final EzyPaint$Paint paint) {
        AbstractC5830k.m5330g(eventList, "$eventList");
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(paint, "$paint");
        if (eventList.isEmpty()) {
            return null;
        }
        long eventTime = eventList.size() == 1 ? 0L : ((EzyTouchEvent$TouchEvent) AbstractC5805t.m5235o0(eventList)).getEventTime() - ((EzyTouchEvent$TouchEvent) AbstractC5805t.m5228h0(eventList)).getEventTime();
        CommandInfoEntity commandInfoEntityBuildCommandInfoEntity = this$0.buildCommandInfoEntity(this$0.getStartEventTime(eventTime, j7), eventTime, EzyCommandEnum$CommandEnum.ACTION_CURSOR_MOVE, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$moveCursor$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            @NotNull
            public final Message invoke() {
                C4378m c4378mNewBuilder = EzyCommand$CommandSource.CommandInfo.CursorMove.newBuilder();
                CommonSourceResult commonSourceResultAddTouchEvent = this.this$0.touchSourceRecord.addTouchEvent(eventList, paint);
                if (commonSourceResultAddTouchEvent != null) {
                    String sourceFileName = commonSourceResultAddTouchEvent.getSourceFileName();
                    c4378mNewBuilder.getClass();
                    sourceFileName.getClass();
                    c4378mNewBuilder.f5531b = sourceFileName;
                    c4378mNewBuilder.f5530a |= 1;
                    c4378mNewBuilder.onChanged();
                    c4378mNewBuilder.f5532c = commonSourceResultAddTouchEvent.getSourceId();
                    c4378mNewBuilder.f5530a |= 2;
                    c4378mNewBuilder.onChanged();
                }
                EzyCommand$CommandSource.CommandInfo.CursorMove cursorMoveBuildPartial = c4378mNewBuilder.buildPartial();
                if (cursorMoveBuildPartial.isInitialized()) {
                    return cursorMoveBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) cursorMoveBuildPartial);
            }
        });
        this$0.updateEntity(commandInfoEntityBuildCommandInfoEntity);
        return commandInfoEntityBuildCommandInfoEntity;
    }

    private final void notifyEvent(CommandInfoEntity entity) {
        Iterator<T> it = this.eventListenerList.iterator();
        while (it.hasNext()) {
            try {
                ((EventListener) it.next()).onEvent(entity);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rebuild$lambda-27, reason: not valid java name */
    public static final CommandInfoEntity m13808rebuild$lambda27(CommandRecord this$0, long j7, final Graph rootGraph, final int i) {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(rootGraph, "$rootGraph");
        TimeRecord timeRecord = this$0.getTimeRecord();
        CommandInfoEntity commandInfoEntityBuildCommandInfoEntity = this$0.buildCommandInfoEntity(timeRecord != null ? ITimeRecord.DefaultImpls.getDelayTime$default(timeRecord, j7, false, 2, null) : 0L, 0L, EzyCommandEnum$CommandEnum.ACTION_REBUILD, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$rebuild$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            @NotNull
            public final Message invoke() {
                C4400x c4400xNewBuilder = EzyCommand$CommandSource.CommandInfo.REBUILD.newBuilder();
                EzyPageSnapshot$PageSnapshot.GraphSnapshot graphSnapshotBuild = rootGraph.getSnapshot().build();
                SingleFieldBuilderV3 singleFieldBuilderV3 = c4400xNewBuilder.f5596c;
                if (singleFieldBuilderV3 == null) {
                    c4400xNewBuilder.f5595b = graphSnapshotBuild;
                } else {
                    singleFieldBuilderV3.setMessage(graphSnapshotBuild);
                }
                c4400xNewBuilder.f5594a |= 1;
                c4400xNewBuilder.onChanged();
                c4400xNewBuilder.f5597d = i;
                c4400xNewBuilder.f5594a |= 2;
                c4400xNewBuilder.onChanged();
                EzyCommand$CommandSource.CommandInfo.REBUILD rebuildBuildPartial = c4400xNewBuilder.buildPartial();
                if (rebuildBuildPartial.isInitialized()) {
                    return rebuildBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) rebuildBuildPartial);
            }
        });
        this$0.updateEntity(commandInfoEntityBuildCommandInfoEntity);
        return commandInfoEntityBuildCommandInfoEntity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: removeGraphList$lambda-21, reason: not valid java name */
    public static final CommandInfoEntity m13809removeGraphList$lambda21(CommandRecord this$0, long j7, final List graphIdList) {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(graphIdList, "$graphIdList");
        TimeRecord timeRecord = this$0.getTimeRecord();
        CommandInfoEntity commandInfoEntityBuildCommandInfoEntity = this$0.buildCommandInfoEntity(timeRecord != null ? ITimeRecord.DefaultImpls.getDelayTime$default(timeRecord, j7, false, 2, null) : 0L, 0L, EzyCommandEnum$CommandEnum.ACTION_GRAPH_REMOVE, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$removeGraphList$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            @NotNull
            public final Message invoke() {
                C4396v c4396vNewBuilder = EzyCommand$CommandSource.CommandInfo.GraphRemove.newBuilder();
                List<EzyCommand$CommandSource.CommandInfo.GraphData> list = graphIdList;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = c4396vNewBuilder.f5588c;
                if (repeatedFieldBuilderV3 == null) {
                    c4396vNewBuilder.m3849f();
                    AbstractMessageLite.Builder.addAll((Iterable) list, c4396vNewBuilder.f5587b);
                    c4396vNewBuilder.onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(list);
                }
                EzyCommand$CommandSource.CommandInfo.GraphRemove graphRemoveBuildPartial = c4396vNewBuilder.buildPartial();
                if (graphRemoveBuildPartial.isInitialized()) {
                    return graphRemoveBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) graphRemoveBuildPartial);
            }
        });
        this$0.updateEntity(commandInfoEntityBuildCommandInfoEntity);
        return commandInfoEntityBuildCommandInfoEntity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: stopRecord$lambda-23, reason: not valid java name */
    public static final CommandInfoEntity m13810stopRecord$lambda23(long j7, CommandRecord this$0) {
        AbstractC5830k.m5330g(this$0, "this$0");
        EzyCommandEnum$CommandEnum ezyCommandEnum$CommandEnum = EzyCommandEnum$CommandEnum.ACTION_RECORD_STOP;
        byte[] byteArray = Any.newBuilder().build().toByteArray();
        AbstractC5830k.m5329f(byteArray, "newBuilder().build().toByteArray()");
        CommandInfoEntity commandInfoEntity = new CommandInfoEntity(0L, j7, 0L, true, ezyCommandEnum$CommandEnum, byteArray);
        this$0.updateEntity(commandInfoEntity);
        return commandInfoEntity;
    }

    private final void updateEntity(CommandInfoEntity entity) {
        CommandRecordEntity commandRecordEntity = this.commandRecordEntity;
        if (commandRecordEntity != null) {
            entity.getRecord().setTarget(commandRecordEntity);
            entity.put();
            commandRecordEntity.getCommandInfoEntity().add(entity);
            commandRecordEntity.put();
        }
        AbstractC3387g.m2342e("CommandRecord:updateEntity -> " + entity.getCommandEnum());
        checkLength();
        notifyEvent(entity);
    }

    @NotNull
    public final CommandInfoEntity addCamera(@NotNull EzyMatrix$Matrix originMatrix, @NotNull EzyMatrix$Matrix lastMatrix, long currentTime) {
        AbstractC5830k.m5330g(originMatrix, "originMatrix");
        AbstractC5830k.m5330g(lastMatrix, "lastMatrix");
        Object obj = this.service.submit(new CallableC4343g(this, currentTime, originMatrix, lastMatrix)).get();
        AbstractC5830k.m5329f(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    @Nullable
    public final CommandInfoEntity addCameraMatrix(@NotNull EzyMatrix$Matrix originMatrix, @NotNull EzyMatrix$Matrix lastMatrix, @NotNull List<EzyMatrix$Matrix> matrixList, long currentTime) {
        AbstractC5830k.m5330g(originMatrix, "originMatrix");
        AbstractC5830k.m5330g(lastMatrix, "lastMatrix");
        AbstractC5830k.m5330g(matrixList, "matrixList");
        return (CommandInfoEntity) this.service.submit(new CallableC4340d(matrixList, this, currentTime, lastMatrix, originMatrix)).get();
    }

    @NotNull
    public final CommandInfoEntity addCommand(@NotNull String parentGraphId, @NotNull EzyGraphEnum$GraphEnum graphType, @NotNull EzyRectF$RectF rectF, long currentTime) throws ExecutionException, InterruptedException {
        AbstractC5830k.m5330g(parentGraphId, "parentGraphId");
        AbstractC5830k.m5330g(graphType, "graphType");
        AbstractC5830k.m5330g(rectF, "rectF");
        Object obj = this.service.submit(new CallableC4340d(this, currentTime, graphType, rectF, parentGraphId)).get();
        AbstractC5830k.m5329f(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    @NotNull
    public final CommandInfoEntity addConfigCommand(final int originBackgroundColor, final int lastBackgroundColor, @NotNull final BackgroundLineConfig originBackgroundLineConfig, @NotNull final BackgroundLineConfig lastBackgroundLineConfig, final long currentTime) throws ExecutionException, InterruptedException {
        AbstractC5830k.m5330g(originBackgroundLineConfig, "originBackgroundLineConfig");
        AbstractC5830k.m5330g(lastBackgroundLineConfig, "lastBackgroundLineConfig");
        Object obj = this.service.submit(new Callable() { // from class: com.zykj.blackboard.core.record.dataRecorder.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m13802addConfigCommand$lambda19(this.f5301a, currentTime, originBackgroundColor, lastBackgroundColor, originBackgroundLineConfig, lastBackgroundLineConfig);
            }
        }).get();
        AbstractC5830k.m5329f(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    @NotNull
    public final CommandInfoEntity addGeometryGraphCommand(@NotNull final String parentGraphId, final float width, final float height, final int geometryType, @NotNull final List<? extends PointF> pointList, @NotNull final EzyPaint$Paint paint, final long currentTime) throws ExecutionException, InterruptedException {
        AbstractC5830k.m5330g(parentGraphId, "parentGraphId");
        AbstractC5830k.m5330g(pointList, "pointList");
        AbstractC5830k.m5330g(paint, "paint");
        Object obj = this.service.submit(new Callable() { // from class: com.zykj.blackboard.core.record.dataRecorder.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m13803addGeometryGraphCommand$lambda9(this.f5293a, currentTime, width, height, parentGraphId, geometryType, pointList, paint);
            }
        }).get();
        AbstractC5830k.m5329f(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    @Nullable
    public final CommandInfoEntity addGraphMatrix(@NotNull List<EzyCommand$CommandSource.CommandInfo.GraphData> graphIdList, @NotNull List<EzyMatrix$Matrix> matrixList, long currentTime) {
        AbstractC5830k.m5330g(graphIdList, "graphIdList");
        AbstractC5830k.m5330g(matrixList, "matrixList");
        return (CommandInfoEntity) this.service.submit(new CallableC4343g(matrixList, this, currentTime, graphIdList, 0)).get();
    }

    @NotNull
    public final CommandInfoEntity addTextGraphCommand(@NotNull final String parentGraphId, final float width, final float height, @NotNull final EzyPaint$Paint paint, @NotNull final String content, final long currentTime) throws ExecutionException, InterruptedException {
        AbstractC5830k.m5330g(parentGraphId, "parentGraphId");
        AbstractC5830k.m5330g(paint, "paint");
        AbstractC5830k.m5330g(content, "content");
        Object obj = this.service.submit(new Callable() { // from class: com.zykj.blackboard.core.record.dataRecorder.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m13805addTextGraphCommand$lambda7(this.f5312a, currentTime, width, height, parentGraphId, content, paint);
            }
        }).get();
        AbstractC5830k.m5329f(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    @NotNull
    public final CommandInfoEntity changeGraph(@NotNull final String graphId, @NotNull final EzyGraphEnum$GraphEnum graphEnum, @Nullable final EzyRectF$RectF originRectF, @Nullable final String content, @Nullable final EzyPaint$Paint paint, @Nullable final List<EzyPointF$PointF> points, @Nullable final EzyMatrix$Matrix renderMatrix, @Nullable final String filePath, final long currentTime) throws ExecutionException, InterruptedException {
        AbstractC5830k.m5330g(graphId, "graphId");
        AbstractC5830k.m5330g(graphEnum, "graphEnum");
        Object obj = this.service.submit(new Callable() { // from class: com.zykj.blackboard.core.record.dataRecorder.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m13806changeGraph$lambda11(this.f5323a, currentTime, graphId, graphEnum, originRectF, content, paint, points, renderMatrix, filePath);
            }
        }).get();
        AbstractC5830k.m5329f(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    public final boolean isExecutorsTaskDone() {
        return this.service.getCompletedTaskCount() == this.service.getTaskCount();
    }

    @Nullable
    public final CommandInfoEntity moveCursor(@NotNull List<EzyTouchEvent$TouchEvent> eventList, @NotNull EzyPaint$Paint paint, long currentTime) {
        AbstractC5830k.m5330g(eventList, "eventList");
        AbstractC5830k.m5330g(paint, "paint");
        return (CommandInfoEntity) this.service.submit(new CallableC4343g(eventList, this, currentTime, paint, 2)).get();
    }

    @NotNull
    public final CommandInfoEntity rebuild(@NotNull final Graph rootGraph, final int backgroundColor, final long currentTime) throws ExecutionException, InterruptedException {
        AbstractC5830k.m5330g(rootGraph, "rootGraph");
        Object obj = this.service.submit(new Callable() { // from class: com.zykj.blackboard.core.record.dataRecorder.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m13808rebuild$lambda27(this.f5319a, currentTime, rootGraph, backgroundColor);
            }
        }).get();
        AbstractC5830k.m5329f(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    public final void registerEventListener(@NotNull EventListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        this.eventListenerList.add(listener);
    }

    @NotNull
    public final CommandInfoEntity removeGraphList(@NotNull List<EzyCommand$CommandSource.CommandInfo.GraphData> graphIdList, long currentTime) throws ExecutionException, InterruptedException {
        AbstractC5830k.m5330g(graphIdList, "graphIdList");
        Object obj = this.service.submit(new CallableC0400f(this, currentTime, graphIdList)).get();
        AbstractC5830k.m5329f(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    public final void setRecord(@NotNull RecordEntity recordEntity) {
        AbstractC5830k.m5330g(recordEntity, "recordEntity");
        this.recordEntity = recordEntity;
        this.touchSourceRecord.setRecord(recordEntity);
        this.matrixSourceRecord.setRecord(recordEntity);
        this.fileSourceRecord.setRecord(recordEntity);
        this.textSourceRecord.setRecord(recordEntity);
        this.geometrySourceRecord.setRecord(recordEntity);
        this.commandRecordEntity = initRecordEntity();
    }

    public final void stopRecord(final long delayTime) {
        this.service.submit(new Callable() { // from class: com.zykj.blackboard.core.record.dataRecorder.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m13810stopRecord$lambda23(delayTime, this);
            }
        });
    }

    public final void unRegisterEventListener(@NotNull EventListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        this.eventListenerList.remove(listener);
    }

    @Nullable
    public final CommandInfoEntity addCommand(@NotNull final String parentGraphId, @NotNull final EzyGraphEnum$GraphEnum graphType, @NotNull final List<EzyTouchEvent$TouchEvent> eventList, @NotNull final EzyPaint$Paint paint, @NotNull final String graphId, final long currentTime) {
        AbstractC5830k.m5330g(parentGraphId, "parentGraphId");
        AbstractC5830k.m5330g(graphType, "graphType");
        AbstractC5830k.m5330g(eventList, "eventList");
        AbstractC5830k.m5330g(paint, "paint");
        AbstractC5830k.m5330g(graphId, "graphId");
        return (CommandInfoEntity) this.service.submit(new Callable() { // from class: com.zykj.blackboard.core.record.dataRecorder.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m13800addCommand$lambda3(eventList, this, currentTime, graphId, graphType, parentGraphId, paint);
            }
        }).get();
    }

    @NotNull
    public final CommandInfoEntity addCommand(@NotNull final String parentGraphId, @NotNull final String fileName, @NotNull final EzyGraphEnum$GraphEnum graphType, @NotNull final String validate, final int width, final int height, final long currentTime, final boolean imageBackground) throws ExecutionException, InterruptedException {
        AbstractC5830k.m5330g(parentGraphId, "parentGraphId");
        AbstractC5830k.m5330g(fileName, "fileName");
        AbstractC5830k.m5330g(graphType, "graphType");
        AbstractC5830k.m5330g(validate, "validate");
        Object obj = this.service.submit(new Callable() { // from class: com.zykj.blackboard.core.record.dataRecorder.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m13801addCommand$lambda5(this.f5271a, currentTime, graphType, width, height, parentGraphId, fileName, validate, imageBackground);
            }
        }).get();
        AbstractC5830k.m5329f(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }
}
