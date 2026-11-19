package com.zykj.blackboard.core.record.dataRecorder;

import android.graphics.PointF;
import com.blankj.utilcode.util.LogUtils;
import com.google.protobuf.Any;
import com.google.protobuf.Message;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.blackboard.core.data.dao.CommandRecordEntity;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.blackboard.core.record.dataRecorder.CommandRecord;
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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p117g5.AbstractC8053a;
import p189n5.AbstractC9095a;
import p189n5.C9099e;
import p189n5.InterfaceC9096b;
import p199o5.C9179o;
import p199o5.C9180p;
import p199o5.C9181q;
import p199o5.C9182r;
import p199o5.C9183s;
import p243s5.InterfaceC9474b;
import p263u5.AbstractC9688g;
import p263u5.AbstractC9694m;
import p263u5.C9693l;
import p272v4.C9764c;

/* loaded from: classes4.dex */
public final class CommandRecord extends AbstractC9095a {

    /* renamed from: l */
    public static final C7066a f9037l = new C7066a(null);

    /* renamed from: c */
    public RecordEntity f9038c;

    /* renamed from: d */
    public CommandRecordEntity f9039d;

    /* renamed from: e */
    public final C9183s f9040e;

    /* renamed from: f */
    public final C9181q f9041f;

    /* renamed from: g */
    public final C9179o f9042g;

    /* renamed from: h */
    public final List f9043h;

    /* renamed from: i */
    public final C9182r f9044i;

    /* renamed from: j */
    public final C9180p f9045j;

    /* renamed from: k */
    public final ThreadPoolExecutor f9046k;

    /* renamed from: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$a */
    public static final class C7066a {
        public /* synthetic */ C7066a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C7066a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommandRecord(C9099e timeRecord) {
        super(timeRecord);
        Intrinsics.checkNotNullParameter(timeRecord, "timeRecord");
        this.f9040e = new C9183s();
        this.f9041f = new C9181q();
        this.f9042g = new C9179o();
        this.f9043h = new ArrayList();
        this.f9044i = new C9182r();
        this.f9045j = new C9180p();
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        Intrinsics.checkNotNull(executorServiceNewCachedThreadPool, "null cannot be cast to non-null type java.util.concurrent.ThreadPoolExecutor");
        this.f9046k = (ThreadPoolExecutor) executorServiceNewCachedThreadPool;
    }

    /* renamed from: A */
    public static final CommandInfoEntity m7935A(final List matrixList, final CommandRecord this$0, long j9, final EzyMatrix.Matrix lastMatrix, final EzyMatrix.Matrix originMatrix) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(matrixList, "$matrixList");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(lastMatrix, "$lastMatrix");
        Intrinsics.checkNotNullParameter(originMatrix, "$originMatrix");
        if (matrixList.isEmpty()) {
            return null;
        }
        long eventTime = matrixList.size() == 1 ? 0L : ((EzyMatrix.Matrix) CollectionsKt.last(matrixList)).getEventTime() - ((EzyMatrix.Matrix) CollectionsKt.first(matrixList)).getEventTime();
        CommandInfoEntity commandInfoEntityM14628b = this$0.m14628b(this$0.m14629c(eventTime, j9), eventTime, EzyCommandEnum.CommandEnum.ACTION_CAMERA_MATRIX, new Function0<Message>() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addCameraMatrix$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() throws IllegalAccessException, IllegalArgumentException {
                EzyCommand.CommandSource.CommandInfo.CameraMatrix.C7076b c7076bM8159B = EzyCommand.CommandSource.CommandInfo.CameraMatrix.m8159B();
                c7076bM8159B.m8207z(lastMatrix);
                c7076bM8159B.m8182A(originMatrix);
                C9764c c9764cM14780e = this$0.f9041f.m14780e(matrixList);
                if (c9764cM14780e != null) {
                    c7076bM8159B.m8184C(c9764cM14780e.m16520a());
                    c7076bM8159B.m8185D(c9764cM14780e.m16521b());
                }
                EzyCommand.CommandSource.CommandInfo.CameraMatrix cameraMatrixBuild = c7076bM8159B.build();
                Intrinsics.checkNotNullExpressionValue(cameraMatrixBuild, "builder.build()");
                return cameraMatrixBuild;
            }
        });
        this$0.m7988h0(commandInfoEntityM14628b);
        return commandInfoEntityM14628b;
    }

    /* renamed from: E */
    public static final CommandInfoEntity m7936E(CommandRecord this$0, long j9, final EzyGraphEnum.GraphEnum graphType, final EzyRectF.RectF rectF, final String parentGraphId) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(graphType, "$graphType");
        Intrinsics.checkNotNullParameter(rectF, "$rectF");
        Intrinsics.checkNotNullParameter(parentGraphId, "$parentGraphId");
        C9099e c9099eM14630d = this$0.m14630d();
        CommandInfoEntity commandInfoEntityM14628b = this$0.m14628b(c9099eM14630d != null ? InterfaceC9096b.a.m14632a(c9099eM14630d, j9, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_GRAPH_ADD, new Function0<Message>() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addCommand$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() {
                EzyCommand.CommandSource.CommandInfo.GraphData.C7084b c7084bM8361L = EzyCommand.CommandSource.CommandInfo.GraphData.m8361L();
                c7084bM8361L.m8416y(UUID.randomUUID().toString());
                c7084bM8361L.m8414w(graphType);
                c7084bM8361L.m8417z(rectF);
                c7084bM8361L.m8390A(parentGraphId);
                EzyCommand.CommandSource.CommandInfo.GraphData graphDataBuild = c7084bM8361L.build();
                Intrinsics.checkNotNullExpressionValue(graphDataBuild, "builder.build()");
                return graphDataBuild;
            }
        });
        this$0.m7988h0(commandInfoEntityM14628b);
        return commandInfoEntityM14628b;
    }

    /* renamed from: F */
    public static final CommandInfoEntity m7937F(final List eventList, final CommandRecord this$0, long j9, final String graphId, final EzyGraphEnum.GraphEnum graphType, final String parentGraphId, final EzyPaint.Paint paint) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(eventList, "$eventList");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(graphId, "$graphId");
        Intrinsics.checkNotNullParameter(graphType, "$graphType");
        Intrinsics.checkNotNullParameter(parentGraphId, "$parentGraphId");
        Intrinsics.checkNotNullParameter(paint, "$paint");
        if (eventList.isEmpty()) {
            return null;
        }
        long eventTime = eventList.size() == 1 ? 0L : ((EzyTouchEvent.TouchEvent) CollectionsKt.last(eventList)).getEventTime() - ((EzyTouchEvent.TouchEvent) CollectionsKt.first(eventList)).getEventTime();
        CommandInfoEntity commandInfoEntityM14628b = this$0.m14628b(this$0.m14629c(eventTime, j9), eventTime, EzyCommandEnum.CommandEnum.ACTION_GRAPH_ADD, new Function0<Message>() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addCommand$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() throws IllegalAccessException, IllegalArgumentException {
                EzyCommand.CommandSource.CommandInfo.GraphData.C7084b c7084bM8361L = EzyCommand.CommandSource.CommandInfo.GraphData.m8361L();
                c7084bM8361L.m8416y(graphId);
                c7084bM8361L.m8414w(graphType);
                c7084bM8361L.m8417z(AbstractC9694m.m16195c(C9693l.f17131a.m16191d(eventList)));
                c7084bM8361L.m8390A(parentGraphId);
                C9764c c9764cM14792e = this$0.f9040e.m14792e(eventList, paint);
                if (c9764cM14792e != null) {
                    c7084bM8361L.m8392C(c9764cM14792e.m16520a());
                    c7084bM8361L.m8393D(c9764cM14792e.m16521b());
                }
                EzyCommand.CommandSource.CommandInfo.GraphData graphDataBuild = c7084bM8361L.build();
                Intrinsics.checkNotNullExpressionValue(graphDataBuild, "builder.build()");
                return graphDataBuild;
            }
        });
        this$0.m7988h0(commandInfoEntityM14628b);
        return commandInfoEntityM14628b;
    }

    /* renamed from: G */
    public static final CommandInfoEntity m7938G(final CommandRecord this$0, long j9, final EzyGraphEnum.GraphEnum graphType, final int i9, final int i10, final String parentGraphId, final String fileName, final String validate, final boolean z9) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(graphType, "$graphType");
        Intrinsics.checkNotNullParameter(parentGraphId, "$parentGraphId");
        Intrinsics.checkNotNullParameter(fileName, "$fileName");
        Intrinsics.checkNotNullParameter(validate, "$validate");
        C9099e c9099eM14630d = this$0.m14630d();
        CommandInfoEntity commandInfoEntityM14628b = this$0.m14628b(c9099eM14630d != null ? InterfaceC9096b.a.m14632a(c9099eM14630d, j9, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_GRAPH_ADD, new Function0<Message>() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addCommand$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() throws IllegalAccessException, IllegalArgumentException {
                EzyCommand.CommandSource.CommandInfo.GraphData.C7084b c7084bM8361L = EzyCommand.CommandSource.CommandInfo.GraphData.m8361L();
                c7084bM8361L.m8416y(UUID.randomUUID().toString());
                c7084bM8361L.m8414w(graphType);
                c7084bM8361L.m8417z(EzyRectF.RectF.m9175t().m9196s(0.0f).m9199v(0.0f).m9198u(i9).m9194q(i10).build());
                c7084bM8361L.m8390A(parentGraphId);
                C9764c c9764cM14768e = this$0.f9042g.m14768e(fileName, validate, i9, i10);
                if (c9764cM14768e != null) {
                    c7084bM8361L.m8392C(c9764cM14768e.m16520a());
                    c7084bM8361L.m8393D(c9764cM14768e.m16521b());
                }
                if (z9) {
                    c7084bM8361L.m8412u(c7084bM8361L.m8404m() + "imageBackground;");
                }
                EzyCommand.CommandSource.CommandInfo.GraphData graphDataBuild = c7084bM8361L.build();
                Intrinsics.checkNotNullExpressionValue(graphDataBuild, "builder.build()");
                return graphDataBuild;
            }
        });
        this$0.m7988h0(commandInfoEntityM14628b);
        return commandInfoEntityM14628b;
    }

    /* renamed from: I */
    public static final CommandInfoEntity m7939I(CommandRecord this$0, long j9, final int i9, final int i10, final BackgroundLineConfig originBackgroundLineConfig, final BackgroundLineConfig lastBackgroundLineConfig) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(originBackgroundLineConfig, "$originBackgroundLineConfig");
        Intrinsics.checkNotNullParameter(lastBackgroundLineConfig, "$lastBackgroundLineConfig");
        C9099e c9099eM14630d = this$0.m14630d();
        CommandInfoEntity commandInfoEntityM14628b = this$0.m14628b(c9099eM14630d != null ? InterfaceC9096b.a.m14632a(c9099eM14630d, j9, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_CONFIG, new Function0<Message>() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addConfigCommand$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() {
                EzyCommand.CommandSource.CommandInfo.Config.C7078b c7078bM8208B = EzyCommand.CommandSource.CommandInfo.Config.m8208B();
                c7078bM8208B.m8230B(i9);
                c7078bM8208B.m8256z(i10);
                c7078bM8208B.m8231C(AbstractC9688g.m16177g(originBackgroundLineConfig));
                c7078bM8208B.m8229A(AbstractC9688g.m16177g(lastBackgroundLineConfig));
                EzyCommand.CommandSource.CommandInfo.Config configBuild = c7078bM8208B.build();
                Intrinsics.checkNotNullExpressionValue(configBuild, "builder.build()");
                return configBuild;
            }
        });
        this$0.m7988h0(commandInfoEntityM14628b);
        return commandInfoEntityM14628b;
    }

    /* renamed from: K */
    public static final CommandInfoEntity m7940K(final CommandRecord this$0, long j9, final float f10, final float f11, final String parentGraphId, final int i9, final List pointList, final EzyPaint.Paint paint) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(parentGraphId, "$parentGraphId");
        Intrinsics.checkNotNullParameter(pointList, "$pointList");
        Intrinsics.checkNotNullParameter(paint, "$paint");
        C9099e c9099eM14630d = this$0.m14630d();
        CommandInfoEntity commandInfoEntityM14628b = this$0.m14628b(c9099eM14630d != null ? InterfaceC9096b.a.m14632a(c9099eM14630d, j9, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_GRAPH_ADD, new Function0<Message>() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addGeometryGraphCommand$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() throws IllegalAccessException, IllegalArgumentException {
                EzyCommand.CommandSource.CommandInfo.GraphData.C7084b c7084bM8361L = EzyCommand.CommandSource.CommandInfo.GraphData.m8361L();
                c7084bM8361L.m8416y(UUID.randomUUID().toString());
                c7084bM8361L.m8414w(EzyGraphEnum.GraphEnum.GEOMETRY_GRAPH);
                c7084bM8361L.m8417z(EzyRectF.RectF.m9175t().m9196s(0.0f).m9199v(0.0f).m9198u(f10).m9194q(f11).build());
                c7084bM8361L.m8390A(parentGraphId);
                C9180p c9180p = this$0.f9045j;
                int i10 = i9;
                List list = pointList;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC9694m.m16194b((PointF) it.next()));
                }
                C9764c c9764cM14774e = c9180p.m14774e(i10, arrayList, paint);
                if (c9764cM14774e != null) {
                    c7084bM8361L.m8392C(c9764cM14774e.m16520a());
                    c7084bM8361L.m8393D(c9764cM14774e.m16521b());
                }
                EzyCommand.CommandSource.CommandInfo.GraphData graphDataBuild = c7084bM8361L.build();
                Intrinsics.checkNotNullExpressionValue(graphDataBuild, "builder.build()");
                return graphDataBuild;
            }
        });
        this$0.m7988h0(commandInfoEntityM14628b);
        return commandInfoEntityM14628b;
    }

    /* renamed from: M */
    public static final CommandInfoEntity m7941M(final List matrixList, final CommandRecord this$0, long j9, final List graphIdList) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(matrixList, "$matrixList");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(graphIdList, "$graphIdList");
        if (matrixList.isEmpty()) {
            return null;
        }
        long eventTime = matrixList.size() == 1 ? 0L : ((EzyMatrix.Matrix) CollectionsKt.last(matrixList)).getEventTime() - ((EzyMatrix.Matrix) CollectionsKt.first(matrixList)).getEventTime();
        CommandInfoEntity commandInfoEntityM14628b = this$0.m14628b(this$0.m14629c(eventTime, j9), eventTime, EzyCommandEnum.CommandEnum.ACTION_GRAPH_MATRIX, new Function0<Message>() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addGraphMatrix$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() throws IllegalAccessException, IllegalArgumentException {
                EzyCommand.CommandSource.CommandInfo.GraphMatrix.C7086b c7086bM8418H = EzyCommand.CommandSource.CommandInfo.GraphMatrix.m8418H();
                c7086bM8418H.m8454b(graphIdList);
                C9764c c9764cM14780e = this$0.f9041f.m14780e(matrixList);
                if (c9764cM14780e != null) {
                    c7086bM8418H.m8451E(c9764cM14780e.m16520a());
                    c7086bM8418H.m8452F(c9764cM14780e.m16521b());
                }
                EzyCommand.CommandSource.CommandInfo.GraphMatrix graphMatrixBuild = c7086bM8418H.build();
                Intrinsics.checkNotNullExpressionValue(graphMatrixBuild, "builder.build()");
                return graphMatrixBuild;
            }
        });
        this$0.m7988h0(commandInfoEntityM14628b);
        return commandInfoEntityM14628b;
    }

    /* renamed from: O */
    public static final CommandInfoEntity m7942O(final CommandRecord this$0, long j9, final float f10, final float f11, final String parentGraphId, final String content, final EzyPaint.Paint paint) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(parentGraphId, "$parentGraphId");
        Intrinsics.checkNotNullParameter(content, "$content");
        Intrinsics.checkNotNullParameter(paint, "$paint");
        C9099e c9099eM14630d = this$0.m14630d();
        CommandInfoEntity commandInfoEntityM14628b = this$0.m14628b(c9099eM14630d != null ? InterfaceC9096b.a.m14632a(c9099eM14630d, j9, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_GRAPH_ADD, new Function0<Message>() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addTextGraphCommand$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() throws IllegalAccessException, IllegalArgumentException {
                EzyCommand.CommandSource.CommandInfo.GraphData.C7084b c7084bM8361L = EzyCommand.CommandSource.CommandInfo.GraphData.m8361L();
                c7084bM8361L.m8416y(UUID.randomUUID().toString());
                c7084bM8361L.m8414w(EzyGraphEnum.GraphEnum.TEXT_GRAPH);
                c7084bM8361L.m8417z(EzyRectF.RectF.m9175t().m9196s(0.0f).m9199v(0.0f).m9198u(f10).m9194q(f11).build());
                c7084bM8361L.m8390A(parentGraphId);
                C9764c c9764cM14786e = this$0.f9044i.m14786e(content, paint);
                if (c9764cM14786e != null) {
                    c7084bM8361L.m8392C(c9764cM14786e.m16520a());
                    c7084bM8361L.m8393D(c9764cM14786e.m16521b());
                }
                EzyCommand.CommandSource.CommandInfo.GraphData graphDataBuild = c7084bM8361L.build();
                Intrinsics.checkNotNullExpressionValue(graphDataBuild, "builder.build()");
                return graphDataBuild;
            }
        });
        this$0.m7988h0(commandInfoEntityM14628b);
        return commandInfoEntityM14628b;
    }

    /* renamed from: R */
    public static final CommandInfoEntity m7943R(CommandRecord this$0, long j9, final String graphId, final EzyGraphEnum.GraphEnum graphEnum, final EzyRectF.RectF rectF, final String str, final EzyPaint.Paint paint, final List list, final EzyMatrix.Matrix matrix, final String str2) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(graphId, "$graphId");
        Intrinsics.checkNotNullParameter(graphEnum, "$graphEnum");
        C9099e c9099eM14630d = this$0.m14630d();
        CommandInfoEntity commandInfoEntityM14628b = this$0.m14628b(c9099eM14630d != null ? InterfaceC9096b.a.m14632a(c9099eM14630d, j9, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_GRAPH_CHANGE, new Function0<Message>() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$changeGraph$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() {
                EzyCommand.CommandSource.CommandInfo.GraphChange.C7082b c7082bM8293N = EzyCommand.CommandSource.CommandInfo.GraphChange.m8293N();
                c7082bM8293N.m8330I(graphId);
                c7082bM8293N.m8328G(graphEnum);
                EzyRectF.RectF rectF2 = rectF;
                if (rectF2 != null) {
                    c7082bM8293N.m8331J(rectF2);
                }
                String str3 = str;
                if (str3 != null) {
                    c7082bM8293N.m8325D(str3);
                }
                EzyPaint.Paint paint2 = paint;
                if (paint2 != null) {
                    c7082bM8293N.m8332K(paint2);
                }
                List list2 = list;
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        c7082bM8293N.m8336b((EzyPointF.PointF) it.next());
                    }
                }
                EzyMatrix.Matrix matrix2 = matrix;
                if (matrix2 != null) {
                    c7082bM8293N.m8333L(matrix2);
                }
                String str4 = str2;
                if (str4 != null) {
                    c7082bM8293N.m8327F(str4);
                }
                EzyCommand.CommandSource.CommandInfo.GraphChange graphChangeBuild = c7082bM8293N.build();
                Intrinsics.checkNotNullExpressionValue(graphChangeBuild, "builder.build()");
                return graphChangeBuild;
            }
        });
        this$0.m7988h0(commandInfoEntityM14628b);
        return commandInfoEntityM14628b;
    }

    /* renamed from: S */
    private final synchronized void m7944S() {
        try {
            CommandRecordEntity commandRecordEntity = this.f9039d;
            if (commandRecordEntity == null) {
                this.f9039d = m7976P();
            } else {
                Intrinsics.checkNotNull(commandRecordEntity);
                if (commandRecordEntity.m7438a().size() >= 100) {
                    this.f9039d = m7976P();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: W */
    public static final CommandInfoEntity m7945W(final List eventList, final CommandRecord this$0, long j9, final EzyPaint.Paint paint) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(eventList, "$eventList");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(paint, "$paint");
        if (eventList.isEmpty()) {
            return null;
        }
        long eventTime = eventList.size() == 1 ? 0L : ((EzyTouchEvent.TouchEvent) CollectionsKt.last(eventList)).getEventTime() - ((EzyTouchEvent.TouchEvent) CollectionsKt.first(eventList)).getEventTime();
        CommandInfoEntity commandInfoEntityM14628b = this$0.m14628b(this$0.m14629c(eventTime, j9), eventTime, EzyCommandEnum.CommandEnum.ACTION_CURSOR_MOVE, new Function0<Message>() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$moveCursor$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() throws IllegalAccessException, IllegalArgumentException {
                EzyCommand.CommandSource.CommandInfo.CursorMove.C7080b c7080bM8261u = EzyCommand.CommandSource.CommandInfo.CursorMove.m8261u();
                C9764c c9764cM14792e = this.f9098a.f9040e.m14792e(eventList, paint);
                if (c9764cM14792e != null) {
                    c7080bM8261u.m8286s(c9764cM14792e.m16520a());
                    c7080bM8261u.m8287t(c9764cM14792e.m16521b());
                }
                EzyCommand.CommandSource.CommandInfo.CursorMove cursorMoveBuild = c7080bM8261u.build();
                Intrinsics.checkNotNullExpressionValue(cursorMoveBuild, "builder.build()");
                return cursorMoveBuild;
            }
        });
        this$0.m7988h0(commandInfoEntityM14628b);
        return commandInfoEntityM14628b;
    }

    /* renamed from: Z */
    public static final CommandInfoEntity m7946Z(CommandRecord this$0, long j9, final AbstractC8053a rootGraph, final int i9) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(rootGraph, "$rootGraph");
        C9099e c9099eM14630d = this$0.m14630d();
        CommandInfoEntity commandInfoEntityM14628b = this$0.m14628b(c9099eM14630d != null ? InterfaceC9096b.a.m14632a(c9099eM14630d, j9, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_REBUILD, new Function0<Message>() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$rebuild$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() {
                EzyCommand.CommandSource.CommandInfo.REBUILD.C7090b c7090bM8517y = EzyCommand.CommandSource.CommandInfo.REBUILD.m8517y();
                c7090bM8517y.m8528B(rootGraph.getSnapshot().build());
                c7090bM8517y.m8551y(i9);
                EzyCommand.CommandSource.CommandInfo.REBUILD rebuildBuild = c7090bM8517y.build();
                Intrinsics.checkNotNullExpressionValue(rebuildBuild, "builder.build()");
                return rebuildBuild;
            }
        });
        this$0.m7988h0(commandInfoEntityM14628b);
        return commandInfoEntityM14628b;
    }

    /* renamed from: c0 */
    public static final CommandInfoEntity m7947c0(CommandRecord this$0, long j9, final List graphIdList) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(graphIdList, "$graphIdList");
        C9099e c9099eM14630d = this$0.m14630d();
        CommandInfoEntity commandInfoEntityM14628b = this$0.m14628b(c9099eM14630d != null ? InterfaceC9096b.a.m14632a(c9099eM14630d, j9, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_GRAPH_REMOVE, new Function0<Message>() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$removeGraphList$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() {
                EzyCommand.CommandSource.CommandInfo.GraphRemove.C7088b c7088bM8479u = EzyCommand.CommandSource.CommandInfo.GraphRemove.m8479u();
                c7088bM8479u.m8491b(graphIdList);
                EzyCommand.CommandSource.CommandInfo.GraphRemove graphRemoveBuild = c7088bM8479u.build();
                Intrinsics.checkNotNullExpressionValue(graphRemoveBuild, "builder.build()");
                return graphRemoveBuild;
            }
        });
        this$0.m7988h0(commandInfoEntityM14628b);
        return commandInfoEntityM14628b;
    }

    /* renamed from: f0 */
    public static final CommandInfoEntity m7950f0(long j9, CommandRecord this$0) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EzyCommandEnum.CommandEnum commandEnum = EzyCommandEnum.CommandEnum.ACTION_RECORD_STOP;
        byte[] byteArray = Any.newBuilder().build().toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "newBuilder().build().toByteArray()");
        CommandInfoEntity commandInfoEntity = new CommandInfoEntity(0L, j9, 0L, true, commandEnum, byteArray);
        this$0.m7988h0(commandInfoEntity);
        return commandInfoEntity;
    }

    /* renamed from: y */
    public static final CommandInfoEntity m7968y(CommandRecord this$0, long j9, final EzyMatrix.Matrix originMatrix, final EzyMatrix.Matrix lastMatrix) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(originMatrix, "$originMatrix");
        Intrinsics.checkNotNullParameter(lastMatrix, "$lastMatrix");
        C9099e c9099eM14630d = this$0.m14630d();
        CommandInfoEntity commandInfoEntityM14628b = this$0.m14628b(c9099eM14630d != null ? InterfaceC9096b.a.m14632a(c9099eM14630d, j9, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_CAMERA, new Function0<Message>() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addCamera$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() {
                EzyCommand.CommandSource.CommandInfo.Camera.C7074b c7074bM8122w = EzyCommand.CommandSource.CommandInfo.Camera.m8122w();
                c7074bM8122w.m8133A(originMatrix);
                c7074bM8122w.m8158z(lastMatrix);
                EzyCommand.CommandSource.CommandInfo.Camera cameraBuild = c7074bM8122w.build();
                Intrinsics.checkNotNullExpressionValue(cameraBuild, "builder.build()");
                return cameraBuild;
            }
        });
        this$0.m7988h0(commandInfoEntityM14628b);
        return commandInfoEntityM14628b;
    }

    /* renamed from: B */
    public final CommandInfoEntity m7969B(final String parentGraphId, final EzyGraphEnum.GraphEnum graphType, final EzyRectF.RectF rectF, final long j9) throws ExecutionException, InterruptedException {
        Intrinsics.checkNotNullParameter(parentGraphId, "parentGraphId");
        Intrinsics.checkNotNullParameter(graphType, "graphType");
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        Object obj = this.f9046k.submit(new Callable() { // from class: o5.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m7936E(this.f15504a, j9, graphType, rectF, parentGraphId);
            }
        }).get();
        Intrinsics.checkNotNullExpressionValue(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    /* renamed from: C */
    public final CommandInfoEntity m7970C(final String parentGraphId, final EzyGraphEnum.GraphEnum graphType, final List eventList, final EzyPaint.Paint paint, final String graphId, final long j9) {
        Intrinsics.checkNotNullParameter(parentGraphId, "parentGraphId");
        Intrinsics.checkNotNullParameter(graphType, "graphType");
        Intrinsics.checkNotNullParameter(eventList, "eventList");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(graphId, "graphId");
        return (CommandInfoEntity) this.f9046k.submit(new Callable() { // from class: o5.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m7937F(eventList, this, j9, graphId, graphType, parentGraphId, paint);
            }
        }).get();
    }

    /* renamed from: D */
    public final CommandInfoEntity m7971D(final String parentGraphId, final String fileName, final EzyGraphEnum.GraphEnum graphType, final String validate, final int i9, final int i10, final long j9, final boolean z9) throws ExecutionException, InterruptedException {
        Intrinsics.checkNotNullParameter(parentGraphId, "parentGraphId");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(graphType, "graphType");
        Intrinsics.checkNotNullParameter(validate, "validate");
        Object obj = this.f9046k.submit(new Callable() { // from class: o5.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m7938G(this.f15492a, j9, graphType, i9, i10, parentGraphId, fileName, validate, z9);
            }
        }).get();
        Intrinsics.checkNotNullExpressionValue(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    /* renamed from: H */
    public final CommandInfoEntity m7972H(final int i9, final int i10, final BackgroundLineConfig originBackgroundLineConfig, final BackgroundLineConfig lastBackgroundLineConfig, final long j9) {
        Intrinsics.checkNotNullParameter(originBackgroundLineConfig, "originBackgroundLineConfig");
        Intrinsics.checkNotNullParameter(lastBackgroundLineConfig, "lastBackgroundLineConfig");
        Object obj = this.f9046k.submit(new Callable() { // from class: o5.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m7939I(this.f15524a, j9, i9, i10, originBackgroundLineConfig, lastBackgroundLineConfig);
            }
        }).get();
        Intrinsics.checkNotNullExpressionValue(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    /* renamed from: J */
    public final CommandInfoEntity m7973J(final String parentGraphId, final float f10, final float f11, final int i9, final List pointList, final EzyPaint.Paint paint, final long j9) throws ExecutionException, InterruptedException {
        Intrinsics.checkNotNullParameter(parentGraphId, "parentGraphId");
        Intrinsics.checkNotNullParameter(pointList, "pointList");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Object obj = this.f9046k.submit(new Callable() { // from class: o5.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m7940K(this.f15516a, j9, f10, f11, parentGraphId, i9, pointList, paint);
            }
        }).get();
        Intrinsics.checkNotNullExpressionValue(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    /* renamed from: L */
    public final CommandInfoEntity m7974L(final List graphIdList, final List matrixList, final long j9) {
        Intrinsics.checkNotNullParameter(graphIdList, "graphIdList");
        Intrinsics.checkNotNullParameter(matrixList, "matrixList");
        return (CommandInfoEntity) this.f9046k.submit(new Callable() { // from class: o5.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m7941M(matrixList, this, j9, graphIdList);
            }
        }).get();
    }

    /* renamed from: N */
    public final CommandInfoEntity m7975N(final String parentGraphId, final float f10, final float f11, final EzyPaint.Paint paint, final String content, final long j9) throws ExecutionException, InterruptedException {
        Intrinsics.checkNotNullParameter(parentGraphId, "parentGraphId");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(content, "content");
        Object obj = this.f9046k.submit(new Callable() { // from class: o5.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m7942O(this.f15539a, j9, f10, f11, parentGraphId, content, paint);
            }
        }).get();
        Intrinsics.checkNotNullExpressionValue(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    /* renamed from: P */
    public final CommandRecordEntity m7976P() {
        RecordEntity recordEntity = this.f9038c;
        if (recordEntity == null) {
            return null;
        }
        CommandRecordEntity commandRecordEntity = new CommandRecordEntity(0L, UUID.randomUUID() + "_command.bin", "");
        recordEntity.m7630b().add(commandRecordEntity);
        recordEntity.m7638j();
        return commandRecordEntity;
    }

    /* renamed from: Q */
    public final CommandInfoEntity m7977Q(final String graphId, final EzyGraphEnum.GraphEnum graphEnum, final EzyRectF.RectF rectF, final String str, final EzyPaint.Paint paint, final List list, final EzyMatrix.Matrix matrix, final String str2, final long j9) throws ExecutionException, InterruptedException {
        Intrinsics.checkNotNullParameter(graphId, "graphId");
        Intrinsics.checkNotNullParameter(graphEnum, "graphEnum");
        Object obj = this.f9046k.submit(new Callable() { // from class: o5.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m7943R(this.f15554a, j9, graphId, graphEnum, rectF, str, paint, list, matrix, str2);
            }
        }).get();
        Intrinsics.checkNotNullExpressionValue(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    /* renamed from: T */
    public final CommandRecordEntity m7978T() {
        ToMany toManyM7630b;
        CommandRecordEntity commandRecordEntity;
        RecordEntity recordEntity = this.f9038c;
        return (recordEntity == null || (toManyM7630b = recordEntity.m7630b()) == null || (commandRecordEntity = (CommandRecordEntity) CollectionsKt.lastOrNull((List) toManyM7630b)) == null || commandRecordEntity.m7438a().size() >= 100) ? m7976P() : commandRecordEntity;
    }

    /* renamed from: U */
    public final boolean m7979U() {
        return this.f9046k.getCompletedTaskCount() == this.f9046k.getTaskCount();
    }

    /* renamed from: V */
    public final CommandInfoEntity m7980V(final List eventList, final EzyPaint.Paint paint, final long j9) {
        Intrinsics.checkNotNullParameter(eventList, "eventList");
        Intrinsics.checkNotNullParameter(paint, "paint");
        return (CommandInfoEntity) this.f9046k.submit(new Callable() { // from class: o5.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m7945W(eventList, this, j9, paint);
            }
        }).get();
    }

    /* renamed from: X */
    public final void m7981X(CommandInfoEntity commandInfoEntity) {
        Iterator it = this.f9043h.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC9474b) it.next()).mo2219a(commandInfoEntity);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: Y */
    public final CommandInfoEntity m7982Y(final AbstractC8053a rootGraph, final int i9, final long j9) {
        Intrinsics.checkNotNullParameter(rootGraph, "rootGraph");
        Object obj = this.f9046k.submit(new Callable() { // from class: o5.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m7946Z(this.f15546a, j9, rootGraph, i9);
            }
        }).get();
        Intrinsics.checkNotNullExpressionValue(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    /* renamed from: a0 */
    public final void m7983a0(InterfaceC9474b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f9043h.add(listener);
    }

    /* renamed from: b0 */
    public final CommandInfoEntity m7984b0(final List graphIdList, final long j9) throws ExecutionException, InterruptedException {
        Intrinsics.checkNotNullParameter(graphIdList, "graphIdList");
        Object obj = this.f9046k.submit(new Callable() { // from class: o5.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m7947c0(this.f15501a, j9, graphIdList);
            }
        }).get();
        Intrinsics.checkNotNullExpressionValue(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    /* renamed from: d0 */
    public final void m7985d0(RecordEntity recordEntity) {
        Intrinsics.checkNotNullParameter(recordEntity, "recordEntity");
        this.f9038c = recordEntity;
        this.f9040e.m14795i(recordEntity);
        this.f9041f.m14783i(recordEntity);
        this.f9042g.m14771i(recordEntity);
        this.f9044i.m14789i(recordEntity);
        this.f9045j.m14777i(recordEntity);
        this.f9039d = m7978T();
    }

    /* renamed from: e0 */
    public final void m7986e0(final long j9) {
        this.f9046k.submit(new Callable() { // from class: o5.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m7950f0(j9, this);
            }
        });
    }

    /* renamed from: g0 */
    public final void m7987g0(InterfaceC9474b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f9043h.remove(listener);
    }

    /* renamed from: h0 */
    public final void m7988h0(CommandInfoEntity commandInfoEntity) throws IllegalAccessException, IllegalArgumentException {
        CommandRecordEntity commandRecordEntity = this.f9039d;
        if (commandRecordEntity != null) {
            commandInfoEntity.m7429f().m13190w(commandRecordEntity);
            commandInfoEntity.m7431h();
            commandRecordEntity.m7438a().add(commandInfoEntity);
            commandRecordEntity.m7442e();
        }
        LogUtils.m2956i("CommandRecord:updateEntity -> " + commandInfoEntity.getCommandEnum());
        m7944S();
        m7981X(commandInfoEntity);
    }

    /* renamed from: x */
    public final CommandInfoEntity m7989x(final EzyMatrix.Matrix originMatrix, final EzyMatrix.Matrix lastMatrix, final long j9) throws ExecutionException, InterruptedException {
        Intrinsics.checkNotNullParameter(originMatrix, "originMatrix");
        Intrinsics.checkNotNullParameter(lastMatrix, "lastMatrix");
        Object obj = this.f9046k.submit(new Callable() { // from class: o5.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m7968y(this.f15550a, j9, originMatrix, lastMatrix);
            }
        }).get();
        Intrinsics.checkNotNullExpressionValue(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    /* renamed from: z */
    public final CommandInfoEntity m7990z(final EzyMatrix.Matrix originMatrix, final EzyMatrix.Matrix lastMatrix, final List matrixList, final long j9) {
        Intrinsics.checkNotNullParameter(originMatrix, "originMatrix");
        Intrinsics.checkNotNullParameter(lastMatrix, "lastMatrix");
        Intrinsics.checkNotNullParameter(matrixList, "matrixList");
        return (CommandInfoEntity) this.f9046k.submit(new Callable() { // from class: o5.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m7935A(matrixList, this, j9, lastMatrix, originMatrix);
            }
        }).get();
    }
}
