package com.zykj.blackboard.core.record.dataRecorder;

import android.graphics.PointF;
import ba.AbstractC5179a;
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
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import ma.InterfaceC10214b;
import na.AbstractC10344g;
import na.AbstractC10350m;
import na.C10349l;
import p181hd.InterfaceC9529a;
import p194ia.AbstractC9617a;
import p194ia.C9621e;
import p194ia.InterfaceC9618b;
import p208ja.C9704o;
import p208ja.C9705p;
import p208ja.C9706q;
import p208ja.C9707r;
import p208ja.C9708s;
import p307q9.C10763c;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10980x;

/* loaded from: classes5.dex */
public final class CommandRecord extends AbstractC9617a {

    /* renamed from: l */
    public static final C8445a f18595l = new C8445a(null);

    /* renamed from: c */
    public RecordEntity f18596c;

    /* renamed from: d */
    public CommandRecordEntity f18597d;

    /* renamed from: e */
    public final C9708s f18598e;

    /* renamed from: f */
    public final C9706q f18599f;

    /* renamed from: g */
    public final C9704o f18600g;

    /* renamed from: h */
    public final List f18601h;

    /* renamed from: i */
    public final C9707r f18602i;

    /* renamed from: j */
    public final C9705p f18603j;

    /* renamed from: k */
    public final ThreadPoolExecutor f18604k;

    /* renamed from: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$a */
    public static final class C8445a {
        public /* synthetic */ C8445a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C8445a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommandRecord(C9621e timeRecord) {
        super(timeRecord);
        AbstractC9979u.m20294g(timeRecord, "timeRecord");
        this.f18598e = new C9708s();
        this.f18599f = new C9706q();
        this.f18600g = new C9704o();
        this.f18601h = new ArrayList();
        this.f18602i = new C9707r();
        this.f18603j = new C9705p();
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        AbstractC9979u.m20292e(executorServiceNewCachedThreadPool, "null cannot be cast to non-null type java.util.concurrent.ThreadPoolExecutor");
        this.f18604k = (ThreadPoolExecutor) executorServiceNewCachedThreadPool;
    }

    /* renamed from: A */
    public static final CommandInfoEntity m14559A(final List matrixList, final CommandRecord this$0, long j10, final EzyMatrix.Matrix lastMatrix, final EzyMatrix.Matrix originMatrix) throws IllegalAccessException, IllegalArgumentException {
        AbstractC9979u.m20294g(matrixList, "$matrixList");
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(lastMatrix, "$lastMatrix");
        AbstractC9979u.m20294g(originMatrix, "$originMatrix");
        if (matrixList.isEmpty()) {
            return null;
        }
        long eventTime = matrixList.size() == 1 ? 0L : ((EzyMatrix.Matrix) AbstractC10947g0.m23956y0(matrixList)).getEventTime() - ((EzyMatrix.Matrix) AbstractC10947g0.m23944m0(matrixList)).getEventTime();
        CommandInfoEntity commandInfoEntityM18853b = this$0.m18853b(this$0.m18854c(eventTime, j10), eventTime, EzyCommandEnum.CommandEnum.ACTION_CAMERA_MATRIX, new InterfaceC9529a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addCameraMatrix$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() throws IllegalAccessException, IllegalArgumentException {
                EzyCommand.CommandSource.CommandInfo.CameraMatrix.C8454b c8454bM14787v = EzyCommand.CommandSource.CommandInfo.CameraMatrix.m14787v();
                c8454bM14787v.m14825y(lastMatrix);
                c8454bM14787v.m14826z(originMatrix);
                C10763c c10763cM19198e = this$0.f18599f.m19198e(matrixList);
                if (c10763cM19198e != null) {
                    c8454bM14787v.m14802B(c10763cM19198e.m22920a());
                    c8454bM14787v.m14803C(c10763cM19198e.m22921b());
                }
                EzyCommand.CommandSource.CommandInfo.CameraMatrix cameraMatrixBuild = c8454bM14787v.build();
                AbstractC9979u.m20293f(cameraMatrixBuild, "builder.build()");
                return cameraMatrixBuild;
            }
        });
        this$0.m14612h0(commandInfoEntityM18853b);
        return commandInfoEntityM18853b;
    }

    /* renamed from: E */
    public static final CommandInfoEntity m14560E(CommandRecord this$0, long j10, final EzyGraphEnum.GraphEnum graphType, final EzyRectF.RectF rectF, final String parentGraphId) throws IllegalAccessException, IllegalArgumentException {
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(graphType, "$graphType");
        AbstractC9979u.m20294g(rectF, "$rectF");
        AbstractC9979u.m20294g(parentGraphId, "$parentGraphId");
        C9621e c9621eM18855d = this$0.m18855d();
        CommandInfoEntity commandInfoEntityM18853b = this$0.m18853b(c9621eM18855d != null ? InterfaceC9618b.a.m18857a(c9621eM18855d, j10, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_GRAPH_ADD, new InterfaceC9529a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addCommand$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() {
                EzyCommand.CommandSource.CommandInfo.GraphData.C8462b c8462bM14978I = EzyCommand.CommandSource.CommandInfo.GraphData.m14978I();
                c8462bM14978I.m15034x(UUID.randomUUID().toString());
                c8462bM14978I.m15032v(graphType);
                c8462bM14978I.m15035y(rectF);
                c8462bM14978I.m15036z(parentGraphId);
                EzyCommand.CommandSource.CommandInfo.GraphData graphDataBuild = c8462bM14978I.build();
                AbstractC9979u.m20293f(graphDataBuild, "builder.build()");
                return graphDataBuild;
            }
        });
        this$0.m14612h0(commandInfoEntityM18853b);
        return commandInfoEntityM18853b;
    }

    /* renamed from: F */
    public static final CommandInfoEntity m14561F(final List eventList, final CommandRecord this$0, long j10, final String graphId, final EzyGraphEnum.GraphEnum graphType, final String parentGraphId, final EzyPaint.Paint paint) throws IllegalAccessException, IllegalArgumentException {
        AbstractC9979u.m20294g(eventList, "$eventList");
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(graphId, "$graphId");
        AbstractC9979u.m20294g(graphType, "$graphType");
        AbstractC9979u.m20294g(parentGraphId, "$parentGraphId");
        AbstractC9979u.m20294g(paint, "$paint");
        if (eventList.isEmpty()) {
            return null;
        }
        long eventTime = eventList.size() == 1 ? 0L : ((EzyTouchEvent.TouchEvent) AbstractC10947g0.m23956y0(eventList)).getEventTime() - ((EzyTouchEvent.TouchEvent) AbstractC10947g0.m23944m0(eventList)).getEventTime();
        CommandInfoEntity commandInfoEntityM18853b = this$0.m18853b(this$0.m18854c(eventTime, j10), eventTime, EzyCommandEnum.CommandEnum.ACTION_GRAPH_ADD, new InterfaceC9529a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addCommand$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() throws IllegalAccessException, IllegalArgumentException {
                EzyCommand.CommandSource.CommandInfo.GraphData.C8462b c8462bM14978I = EzyCommand.CommandSource.CommandInfo.GraphData.m14978I();
                c8462bM14978I.m15034x(graphId);
                c8462bM14978I.m15032v(graphType);
                c8462bM14978I.m15035y(AbstractC10350m.m21655c(C10349l.f24656a.m21651d(eventList)));
                c8462bM14978I.m15036z(parentGraphId);
                C10763c c10763cM19210e = this$0.f18598e.m19210e(eventList, paint);
                if (c10763cM19210e != null) {
                    c8462bM14978I.m15010B(c10763cM19210e.m22920a());
                    c8462bM14978I.m15011C(c10763cM19210e.m22921b());
                }
                EzyCommand.CommandSource.CommandInfo.GraphData graphDataBuild = c8462bM14978I.build();
                AbstractC9979u.m20293f(graphDataBuild, "builder.build()");
                return graphDataBuild;
            }
        });
        this$0.m14612h0(commandInfoEntityM18853b);
        return commandInfoEntityM18853b;
    }

    /* renamed from: G */
    public static final CommandInfoEntity m14562G(final CommandRecord this$0, long j10, final EzyGraphEnum.GraphEnum graphType, final int i10, final int i11, final String parentGraphId, final String fileName, final String validate, final boolean z10) throws IllegalAccessException, IllegalArgumentException {
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(graphType, "$graphType");
        AbstractC9979u.m20294g(parentGraphId, "$parentGraphId");
        AbstractC9979u.m20294g(fileName, "$fileName");
        AbstractC9979u.m20294g(validate, "$validate");
        C9621e c9621eM18855d = this$0.m18855d();
        CommandInfoEntity commandInfoEntityM18853b = this$0.m18853b(c9621eM18855d != null ? InterfaceC9618b.a.m18857a(c9621eM18855d, j10, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_GRAPH_ADD, new InterfaceC9529a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addCommand$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() throws IllegalAccessException, IllegalArgumentException {
                EzyCommand.CommandSource.CommandInfo.GraphData.C8462b c8462bM14978I = EzyCommand.CommandSource.CommandInfo.GraphData.m14978I();
                c8462bM14978I.m15034x(UUID.randomUUID().toString());
                c8462bM14978I.m15032v(graphType);
                c8462bM14978I.m15035y(EzyRectF.RectF.m15793k().m15814r(0.0f).m15817u(0.0f).m15816t(i10).m15812p(i11).build());
                c8462bM14978I.m15036z(parentGraphId);
                C10763c c10763cM19186e = this$0.f18600g.m19186e(fileName, validate, i10, i11);
                if (c10763cM19186e != null) {
                    c8462bM14978I.m15010B(c10763cM19186e.m22920a());
                    c8462bM14978I.m15011C(c10763cM19186e.m22921b());
                }
                if (z10) {
                    c8462bM14978I.m15030t(c8462bM14978I.m15022l() + "imageBackground;");
                }
                EzyCommand.CommandSource.CommandInfo.GraphData graphDataBuild = c8462bM14978I.build();
                AbstractC9979u.m20293f(graphDataBuild, "builder.build()");
                return graphDataBuild;
            }
        });
        this$0.m14612h0(commandInfoEntityM18853b);
        return commandInfoEntityM18853b;
    }

    /* renamed from: I */
    public static final CommandInfoEntity m14563I(CommandRecord this$0, long j10, final int i10, final int i11, final BackgroundLineConfig originBackgroundLineConfig, final BackgroundLineConfig lastBackgroundLineConfig) throws IllegalAccessException, IllegalArgumentException {
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(originBackgroundLineConfig, "$originBackgroundLineConfig");
        AbstractC9979u.m20294g(lastBackgroundLineConfig, "$lastBackgroundLineConfig");
        C9621e c9621eM18855d = this$0.m18855d();
        CommandInfoEntity commandInfoEntityM18853b = this$0.m18853b(c9621eM18855d != null ? InterfaceC9618b.a.m18857a(c9621eM18855d, j10, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_CONFIG, new InterfaceC9529a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addConfigCommand$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() {
                EzyCommand.CommandSource.CommandInfo.Config.C8456b c8456bM14836v = EzyCommand.CommandSource.CommandInfo.Config.m14836v();
                c8456bM14836v.m14848A(i10);
                c8456bM14836v.m14874y(i11);
                c8456bM14836v.m14849B(AbstractC10344g.m21638g(originBackgroundLineConfig));
                c8456bM14836v.m14875z(AbstractC10344g.m21638g(lastBackgroundLineConfig));
                EzyCommand.CommandSource.CommandInfo.Config configBuild = c8456bM14836v.build();
                AbstractC9979u.m20293f(configBuild, "builder.build()");
                return configBuild;
            }
        });
        this$0.m14612h0(commandInfoEntityM18853b);
        return commandInfoEntityM18853b;
    }

    /* renamed from: K */
    public static final CommandInfoEntity m14564K(final CommandRecord this$0, long j10, final float f10, final float f11, final String parentGraphId, final int i10, final List pointList, final EzyPaint.Paint paint) throws IllegalAccessException, IllegalArgumentException {
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(parentGraphId, "$parentGraphId");
        AbstractC9979u.m20294g(pointList, "$pointList");
        AbstractC9979u.m20294g(paint, "$paint");
        C9621e c9621eM18855d = this$0.m18855d();
        CommandInfoEntity commandInfoEntityM18853b = this$0.m18853b(c9621eM18855d != null ? InterfaceC9618b.a.m18857a(c9621eM18855d, j10, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_GRAPH_ADD, new InterfaceC9529a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addGeometryGraphCommand$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() throws IllegalAccessException, IllegalArgumentException {
                EzyCommand.CommandSource.CommandInfo.GraphData.C8462b c8462bM14978I = EzyCommand.CommandSource.CommandInfo.GraphData.m14978I();
                c8462bM14978I.m15034x(UUID.randomUUID().toString());
                c8462bM14978I.m15032v(EzyGraphEnum.GraphEnum.GEOMETRY_GRAPH);
                c8462bM14978I.m15035y(EzyRectF.RectF.m15793k().m15814r(0.0f).m15817u(0.0f).m15816t(f10).m15812p(f11).build());
                c8462bM14978I.m15036z(parentGraphId);
                C9705p c9705p = this$0.f18603j;
                int i11 = i10;
                List list = pointList;
                ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC10350m.m21654b((PointF) it.next()));
                }
                C10763c c10763cM19192e = c9705p.m19192e(i11, arrayList, paint);
                if (c10763cM19192e != null) {
                    c8462bM14978I.m15010B(c10763cM19192e.m22920a());
                    c8462bM14978I.m15011C(c10763cM19192e.m22921b());
                }
                EzyCommand.CommandSource.CommandInfo.GraphData graphDataBuild = c8462bM14978I.build();
                AbstractC9979u.m20293f(graphDataBuild, "builder.build()");
                return graphDataBuild;
            }
        });
        this$0.m14612h0(commandInfoEntityM18853b);
        return commandInfoEntityM18853b;
    }

    /* renamed from: M */
    public static final CommandInfoEntity m14565M(final List matrixList, final CommandRecord this$0, long j10, final List graphIdList) throws IllegalAccessException, IllegalArgumentException {
        AbstractC9979u.m20294g(matrixList, "$matrixList");
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(graphIdList, "$graphIdList");
        if (matrixList.isEmpty()) {
            return null;
        }
        long eventTime = matrixList.size() == 1 ? 0L : ((EzyMatrix.Matrix) AbstractC10947g0.m23956y0(matrixList)).getEventTime() - ((EzyMatrix.Matrix) AbstractC10947g0.m23944m0(matrixList)).getEventTime();
        CommandInfoEntity commandInfoEntityM18853b = this$0.m18853b(this$0.m18854c(eventTime, j10), eventTime, EzyCommandEnum.CommandEnum.ACTION_GRAPH_MATRIX, new InterfaceC9529a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addGraphMatrix$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() throws IllegalAccessException, IllegalArgumentException {
                EzyCommand.CommandSource.CommandInfo.GraphMatrix.C8464b c8464bM15037E = EzyCommand.CommandSource.CommandInfo.GraphMatrix.m15037E();
                c8464bM15037E.m15072b(graphIdList);
                C10763c c10763cM19198e = this$0.f18599f.m19198e(matrixList);
                if (c10763cM19198e != null) {
                    c8464bM15037E.m15069D(c10763cM19198e.m22920a());
                    c8464bM15037E.m15070E(c10763cM19198e.m22921b());
                }
                EzyCommand.CommandSource.CommandInfo.GraphMatrix graphMatrixBuild = c8464bM15037E.build();
                AbstractC9979u.m20293f(graphMatrixBuild, "builder.build()");
                return graphMatrixBuild;
            }
        });
        this$0.m14612h0(commandInfoEntityM18853b);
        return commandInfoEntityM18853b;
    }

    /* renamed from: O */
    public static final CommandInfoEntity m14566O(final CommandRecord this$0, long j10, final float f10, final float f11, final String parentGraphId, final String content, final EzyPaint.Paint paint) throws IllegalAccessException, IllegalArgumentException {
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(parentGraphId, "$parentGraphId");
        AbstractC9979u.m20294g(content, "$content");
        AbstractC9979u.m20294g(paint, "$paint");
        C9621e c9621eM18855d = this$0.m18855d();
        CommandInfoEntity commandInfoEntityM18853b = this$0.m18853b(c9621eM18855d != null ? InterfaceC9618b.a.m18857a(c9621eM18855d, j10, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_GRAPH_ADD, new InterfaceC9529a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addTextGraphCommand$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() throws IllegalAccessException, IllegalArgumentException {
                EzyCommand.CommandSource.CommandInfo.GraphData.C8462b c8462bM14978I = EzyCommand.CommandSource.CommandInfo.GraphData.m14978I();
                c8462bM14978I.m15034x(UUID.randomUUID().toString());
                c8462bM14978I.m15032v(EzyGraphEnum.GraphEnum.TEXT_GRAPH);
                c8462bM14978I.m15035y(EzyRectF.RectF.m15793k().m15814r(0.0f).m15817u(0.0f).m15816t(f10).m15812p(f11).build());
                c8462bM14978I.m15036z(parentGraphId);
                C10763c c10763cM19204e = this$0.f18602i.m19204e(content, paint);
                if (c10763cM19204e != null) {
                    c8462bM14978I.m15010B(c10763cM19204e.m22920a());
                    c8462bM14978I.m15011C(c10763cM19204e.m22921b());
                }
                EzyCommand.CommandSource.CommandInfo.GraphData graphDataBuild = c8462bM14978I.build();
                AbstractC9979u.m20293f(graphDataBuild, "builder.build()");
                return graphDataBuild;
            }
        });
        this$0.m14612h0(commandInfoEntityM18853b);
        return commandInfoEntityM18853b;
    }

    /* renamed from: R */
    public static final CommandInfoEntity m14567R(CommandRecord this$0, long j10, final String graphId, final EzyGraphEnum.GraphEnum graphEnum, final EzyRectF.RectF rectF, final String str, final EzyPaint.Paint paint, final List list, final EzyMatrix.Matrix matrix, final String str2) throws IllegalAccessException, IllegalArgumentException {
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(graphId, "$graphId");
        AbstractC9979u.m20294g(graphEnum, "$graphEnum");
        C9621e c9621eM18855d = this$0.m18855d();
        CommandInfoEntity commandInfoEntityM18853b = this$0.m18853b(c9621eM18855d != null ? InterfaceC9618b.a.m18857a(c9621eM18855d, j10, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_GRAPH_CHANGE, new InterfaceC9529a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$changeGraph$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() {
                EzyCommand.CommandSource.CommandInfo.GraphChange.C8460b c8460bM14908K = EzyCommand.CommandSource.CommandInfo.GraphChange.m14908K();
                c8460bM14908K.m14948H(graphId);
                c8460bM14908K.m14946F(graphEnum);
                EzyRectF.RectF rectF2 = rectF;
                if (rectF2 != null) {
                    c8460bM14908K.m14949I(rectF2);
                }
                String str3 = str;
                if (str3 != null) {
                    c8460bM14908K.m14943C(str3);
                }
                EzyPaint.Paint paint2 = paint;
                if (paint2 != null) {
                    c8460bM14908K.m14950J(paint2);
                }
                List list2 = list;
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        c8460bM14908K.m14954b((EzyPointF.PointF) it.next());
                    }
                }
                EzyMatrix.Matrix matrix2 = matrix;
                if (matrix2 != null) {
                    c8460bM14908K.m14951K(matrix2);
                }
                String str4 = str2;
                if (str4 != null) {
                    c8460bM14908K.m14945E(str4);
                }
                EzyCommand.CommandSource.CommandInfo.GraphChange graphChangeBuild = c8460bM14908K.build();
                AbstractC9979u.m20293f(graphChangeBuild, "builder.build()");
                return graphChangeBuild;
            }
        });
        this$0.m14612h0(commandInfoEntityM18853b);
        return commandInfoEntityM18853b;
    }

    /* renamed from: S */
    private final synchronized void m14568S() {
        try {
            CommandRecordEntity commandRecordEntity = this.f18597d;
            if (commandRecordEntity == null) {
                this.f18597d = m14600P();
            } else {
                AbstractC9979u.m20291d(commandRecordEntity);
                if (commandRecordEntity.m14065a().size() >= 100) {
                    this.f18597d = m14600P();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: W */
    public static final CommandInfoEntity m14569W(final List eventList, final CommandRecord this$0, long j10, final EzyPaint.Paint paint) throws IllegalAccessException, IllegalArgumentException {
        AbstractC9979u.m20294g(eventList, "$eventList");
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(paint, "$paint");
        if (eventList.isEmpty()) {
            return null;
        }
        long eventTime = eventList.size() == 1 ? 0L : ((EzyTouchEvent.TouchEvent) AbstractC10947g0.m23956y0(eventList)).getEventTime() - ((EzyTouchEvent.TouchEvent) AbstractC10947g0.m23944m0(eventList)).getEventTime();
        CommandInfoEntity commandInfoEntityM18853b = this$0.m18853b(this$0.m18854c(eventTime, j10), eventTime, EzyCommandEnum.CommandEnum.ACTION_CURSOR_MOVE, new InterfaceC9529a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$moveCursor$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() throws IllegalAccessException, IllegalArgumentException {
                EzyCommand.CommandSource.CommandInfo.CursorMove.C8458b c8458bM14880m = EzyCommand.CommandSource.CommandInfo.CursorMove.m14880m();
                C10763c c10763cM19210e = this.f18656c.f18598e.m19210e(eventList, paint);
                if (c10763cM19210e != null) {
                    c8458bM14880m.m14905r(c10763cM19210e.m22920a());
                    c8458bM14880m.m14906s(c10763cM19210e.m22921b());
                }
                EzyCommand.CommandSource.CommandInfo.CursorMove cursorMoveBuild = c8458bM14880m.build();
                AbstractC9979u.m20293f(cursorMoveBuild, "builder.build()");
                return cursorMoveBuild;
            }
        });
        this$0.m14612h0(commandInfoEntityM18853b);
        return commandInfoEntityM18853b;
    }

    /* renamed from: Z */
    public static final CommandInfoEntity m14570Z(CommandRecord this$0, long j10, final AbstractC5179a rootGraph, final int i10) throws IllegalAccessException, IllegalArgumentException {
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(rootGraph, "$rootGraph");
        C9621e c9621eM18855d = this$0.m18855d();
        CommandInfoEntity commandInfoEntityM18853b = this$0.m18853b(c9621eM18855d != null ? InterfaceC9618b.a.m18857a(c9621eM18855d, j10, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_REBUILD, new InterfaceC9529a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$rebuild$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() {
                EzyCommand.CommandSource.CommandInfo.REBUILD.C8468b c8468bM15134r = EzyCommand.CommandSource.CommandInfo.REBUILD.m15134r();
                c8468bM15134r.m15146A(rootGraph.getSnapshot().build());
                c8468bM15134r.m15169x(i10);
                EzyCommand.CommandSource.CommandInfo.REBUILD rebuildBuild = c8468bM15134r.build();
                AbstractC9979u.m20293f(rebuildBuild, "builder.build()");
                return rebuildBuild;
            }
        });
        this$0.m14612h0(commandInfoEntityM18853b);
        return commandInfoEntityM18853b;
    }

    /* renamed from: c0 */
    public static final CommandInfoEntity m14571c0(CommandRecord this$0, long j10, final List graphIdList) throws IllegalAccessException, IllegalArgumentException {
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(graphIdList, "$graphIdList");
        C9621e c9621eM18855d = this$0.m18855d();
        CommandInfoEntity commandInfoEntityM18853b = this$0.m18853b(c9621eM18855d != null ? InterfaceC9618b.a.m18857a(c9621eM18855d, j10, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_GRAPH_REMOVE, new InterfaceC9529a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$removeGraphList$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() {
                EzyCommand.CommandSource.CommandInfo.GraphRemove.C8466b c8466bM15098m = EzyCommand.CommandSource.CommandInfo.GraphRemove.m15098m();
                c8466bM15098m.m15110b(graphIdList);
                EzyCommand.CommandSource.CommandInfo.GraphRemove graphRemoveBuild = c8466bM15098m.build();
                AbstractC9979u.m20293f(graphRemoveBuild, "builder.build()");
                return graphRemoveBuild;
            }
        });
        this$0.m14612h0(commandInfoEntityM18853b);
        return commandInfoEntityM18853b;
    }

    /* renamed from: f0 */
    public static final CommandInfoEntity m14574f0(long j10, CommandRecord this$0) throws IllegalAccessException, IllegalArgumentException {
        AbstractC9979u.m20294g(this$0, "this$0");
        EzyCommandEnum.CommandEnum commandEnum = EzyCommandEnum.CommandEnum.ACTION_RECORD_STOP;
        byte[] byteArray = Any.newBuilder().build().toByteArray();
        AbstractC9979u.m20293f(byteArray, "newBuilder().build().toByteArray()");
        CommandInfoEntity commandInfoEntity = new CommandInfoEntity(0L, j10, 0L, true, commandEnum, byteArray);
        this$0.m14612h0(commandInfoEntity);
        return commandInfoEntity;
    }

    /* renamed from: y */
    public static final CommandInfoEntity m14592y(CommandRecord this$0, long j10, final EzyMatrix.Matrix originMatrix, final EzyMatrix.Matrix lastMatrix) throws IllegalAccessException, IllegalArgumentException {
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(originMatrix, "$originMatrix");
        AbstractC9979u.m20294g(lastMatrix, "$lastMatrix");
        C9621e c9621eM18855d = this$0.m18855d();
        CommandInfoEntity commandInfoEntityM18853b = this$0.m18853b(c9621eM18855d != null ? InterfaceC9618b.a.m18857a(c9621eM18855d, j10, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_CAMERA, new InterfaceC9529a() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addCamera$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() {
                EzyCommand.CommandSource.CommandInfo.Camera.C8452b c8452bM14740o = EzyCommand.CommandSource.CommandInfo.Camera.m14740o();
                c8452bM14740o.m14777z(originMatrix);
                c8452bM14740o.m14776y(lastMatrix);
                EzyCommand.CommandSource.CommandInfo.Camera cameraBuild = c8452bM14740o.build();
                AbstractC9979u.m20293f(cameraBuild, "builder.build()");
                return cameraBuild;
            }
        });
        this$0.m14612h0(commandInfoEntityM18853b);
        return commandInfoEntityM18853b;
    }

    /* renamed from: B */
    public final CommandInfoEntity m14593B(final String parentGraphId, final EzyGraphEnum.GraphEnum graphType, final EzyRectF.RectF rectF, final long j10) throws ExecutionException, InterruptedException {
        AbstractC9979u.m20294g(parentGraphId, "parentGraphId");
        AbstractC9979u.m20294g(graphType, "graphType");
        AbstractC9979u.m20294g(rectF, "rectF");
        Object obj = this.f18604k.submit(new Callable() { // from class: ja.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m14560E(this.f22519a, j10, graphType, rectF, parentGraphId);
            }
        }).get();
        AbstractC9979u.m20293f(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    /* renamed from: C */
    public final CommandInfoEntity m14594C(final String parentGraphId, final EzyGraphEnum.GraphEnum graphType, final List eventList, final EzyPaint.Paint paint, final String graphId, final long j10) {
        AbstractC9979u.m20294g(parentGraphId, "parentGraphId");
        AbstractC9979u.m20294g(graphType, "graphType");
        AbstractC9979u.m20294g(eventList, "eventList");
        AbstractC9979u.m20294g(paint, "paint");
        AbstractC9979u.m20294g(graphId, "graphId");
        return (CommandInfoEntity) this.f18604k.submit(new Callable() { // from class: ja.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m14561F(eventList, this, j10, graphId, graphType, parentGraphId, paint);
            }
        }).get();
    }

    /* renamed from: D */
    public final CommandInfoEntity m14595D(final String parentGraphId, final String fileName, final EzyGraphEnum.GraphEnum graphType, final String validate, final int i10, final int i11, final long j10, final boolean z10) throws ExecutionException, InterruptedException {
        AbstractC9979u.m20294g(parentGraphId, "parentGraphId");
        AbstractC9979u.m20294g(fileName, "fileName");
        AbstractC9979u.m20294g(graphType, "graphType");
        AbstractC9979u.m20294g(validate, "validate");
        Object obj = this.f18604k.submit(new Callable() { // from class: ja.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m14562G(this.f22507a, j10, graphType, i10, i11, parentGraphId, fileName, validate, z10);
            }
        }).get();
        AbstractC9979u.m20293f(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    /* renamed from: H */
    public final CommandInfoEntity m14596H(final int i10, final int i11, final BackgroundLineConfig originBackgroundLineConfig, final BackgroundLineConfig lastBackgroundLineConfig, final long j10) {
        AbstractC9979u.m20294g(originBackgroundLineConfig, "originBackgroundLineConfig");
        AbstractC9979u.m20294g(lastBackgroundLineConfig, "lastBackgroundLineConfig");
        Object obj = this.f18604k.submit(new Callable() { // from class: ja.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m14563I(this.f22539a, j10, i10, i11, originBackgroundLineConfig, lastBackgroundLineConfig);
            }
        }).get();
        AbstractC9979u.m20293f(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    /* renamed from: J */
    public final CommandInfoEntity m14597J(final String parentGraphId, final float f10, final float f11, final int i10, final List pointList, final EzyPaint.Paint paint, final long j10) throws ExecutionException, InterruptedException {
        AbstractC9979u.m20294g(parentGraphId, "parentGraphId");
        AbstractC9979u.m20294g(pointList, "pointList");
        AbstractC9979u.m20294g(paint, "paint");
        Object obj = this.f18604k.submit(new Callable() { // from class: ja.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m14564K(this.f22531a, j10, f10, f11, parentGraphId, i10, pointList, paint);
            }
        }).get();
        AbstractC9979u.m20293f(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    /* renamed from: L */
    public final CommandInfoEntity m14598L(final List graphIdList, final List matrixList, final long j10) {
        AbstractC9979u.m20294g(graphIdList, "graphIdList");
        AbstractC9979u.m20294g(matrixList, "matrixList");
        return (CommandInfoEntity) this.f18604k.submit(new Callable() { // from class: ja.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m14565M(matrixList, this, j10, graphIdList);
            }
        }).get();
    }

    /* renamed from: N */
    public final CommandInfoEntity m14599N(final String parentGraphId, final float f10, final float f11, final EzyPaint.Paint paint, final String content, final long j10) throws ExecutionException, InterruptedException {
        AbstractC9979u.m20294g(parentGraphId, "parentGraphId");
        AbstractC9979u.m20294g(paint, "paint");
        AbstractC9979u.m20294g(content, "content");
        Object obj = this.f18604k.submit(new Callable() { // from class: ja.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m14566O(this.f22554a, j10, f10, f11, parentGraphId, content, paint);
            }
        }).get();
        AbstractC9979u.m20293f(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    /* renamed from: P */
    public final CommandRecordEntity m14600P() {
        RecordEntity recordEntity = this.f18596c;
        if (recordEntity == null) {
            return null;
        }
        CommandRecordEntity commandRecordEntity = new CommandRecordEntity(0L, UUID.randomUUID() + "_command.bin", "");
        recordEntity.m14258b().add(commandRecordEntity);
        recordEntity.m14266j();
        return commandRecordEntity;
    }

    /* renamed from: Q */
    public final CommandInfoEntity m14601Q(final String graphId, final EzyGraphEnum.GraphEnum graphEnum, final EzyRectF.RectF rectF, final String str, final EzyPaint.Paint paint, final List list, final EzyMatrix.Matrix matrix, final String str2, final long j10) throws ExecutionException, InterruptedException {
        AbstractC9979u.m20294g(graphId, "graphId");
        AbstractC9979u.m20294g(graphEnum, "graphEnum");
        Object obj = this.f18604k.submit(new Callable() { // from class: ja.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m14567R(this.f22569a, j10, graphId, graphEnum, rectF, str, paint, list, matrix, str2);
            }
        }).get();
        AbstractC9979u.m20293f(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    /* renamed from: T */
    public final CommandRecordEntity m14602T() {
        ToMany toManyM14258b;
        CommandRecordEntity commandRecordEntity;
        RecordEntity recordEntity = this.f18596c;
        return (recordEntity == null || (toManyM14258b = recordEntity.m14258b()) == null || (commandRecordEntity = (CommandRecordEntity) AbstractC10947g0.m23957z0(toManyM14258b)) == null || commandRecordEntity.m14065a().size() >= 100) ? m14600P() : commandRecordEntity;
    }

    /* renamed from: U */
    public final boolean m14603U() {
        return this.f18604k.getCompletedTaskCount() == this.f18604k.getTaskCount();
    }

    /* renamed from: V */
    public final CommandInfoEntity m14604V(final List eventList, final EzyPaint.Paint paint, final long j10) {
        AbstractC9979u.m20294g(eventList, "eventList");
        AbstractC9979u.m20294g(paint, "paint");
        return (CommandInfoEntity) this.f18604k.submit(new Callable() { // from class: ja.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m14569W(eventList, this, j10, paint);
            }
        }).get();
    }

    /* renamed from: X */
    public final void m14605X(CommandInfoEntity commandInfoEntity) {
        Iterator it = this.f18601h.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC10214b) it.next()).mo14413a(commandInfoEntity);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: Y */
    public final CommandInfoEntity m14606Y(final AbstractC5179a rootGraph, final int i10, final long j10) {
        AbstractC9979u.m20294g(rootGraph, "rootGraph");
        Object obj = this.f18604k.submit(new Callable() { // from class: ja.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m14570Z(this.f22561a, j10, rootGraph, i10);
            }
        }).get();
        AbstractC9979u.m20293f(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    /* renamed from: a0 */
    public final void m14607a0(InterfaceC10214b listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.f18601h.add(listener);
    }

    /* renamed from: b0 */
    public final CommandInfoEntity m14608b0(final List graphIdList, final long j10) throws ExecutionException, InterruptedException {
        AbstractC9979u.m20294g(graphIdList, "graphIdList");
        Object obj = this.f18604k.submit(new Callable() { // from class: ja.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m14571c0(this.f22516a, j10, graphIdList);
            }
        }).get();
        AbstractC9979u.m20293f(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    /* renamed from: d0 */
    public final void m14609d0(RecordEntity recordEntity) {
        AbstractC9979u.m20294g(recordEntity, "recordEntity");
        this.f18596c = recordEntity;
        this.f18598e.m19213i(recordEntity);
        this.f18599f.m19201i(recordEntity);
        this.f18600g.m19189i(recordEntity);
        this.f18602i.m19207i(recordEntity);
        this.f18603j.m19195i(recordEntity);
        this.f18597d = m14602T();
    }

    /* renamed from: e0 */
    public final void m14610e0(final long j10) {
        this.f18604k.submit(new Callable() { // from class: ja.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m14574f0(j10, this);
            }
        });
    }

    /* renamed from: g0 */
    public final void m14611g0(InterfaceC10214b listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.f18601h.remove(listener);
    }

    /* renamed from: h0 */
    public final void m14612h0(CommandInfoEntity commandInfoEntity) throws IllegalAccessException, IllegalArgumentException {
        CommandRecordEntity commandRecordEntity = this.f18597d;
        if (commandRecordEntity != null) {
            commandInfoEntity.m14056f().m19043o(commandRecordEntity);
            commandInfoEntity.m14058h();
            commandRecordEntity.m14065a().add(commandInfoEntity);
            commandRecordEntity.m14069e();
        }
        LogUtils.m3888i("CommandRecord:updateEntity -> " + commandInfoEntity.m14051a());
        m14568S();
        m14605X(commandInfoEntity);
    }

    /* renamed from: x */
    public final CommandInfoEntity m14613x(final EzyMatrix.Matrix originMatrix, final EzyMatrix.Matrix lastMatrix, final long j10) throws ExecutionException, InterruptedException {
        AbstractC9979u.m20294g(originMatrix, "originMatrix");
        AbstractC9979u.m20294g(lastMatrix, "lastMatrix");
        Object obj = this.f18604k.submit(new Callable() { // from class: ja.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m14592y(this.f22565a, j10, originMatrix, lastMatrix);
            }
        }).get();
        AbstractC9979u.m20293f(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    /* renamed from: z */
    public final CommandInfoEntity m14614z(final EzyMatrix.Matrix originMatrix, final EzyMatrix.Matrix lastMatrix, final List matrixList, final long j10) {
        AbstractC9979u.m20294g(originMatrix, "originMatrix");
        AbstractC9979u.m20294g(lastMatrix, "lastMatrix");
        AbstractC9979u.m20294g(matrixList, "matrixList");
        return (CommandInfoEntity) this.f18604k.submit(new Callable() { // from class: ja.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m14559A(matrixList, this, j10, lastMatrix, originMatrix);
            }
        }).get();
    }
}
