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
import p035c5.InterfaceC5119b;
import p077e5.AbstractC7345f;
import p077e5.AbstractC7351l;
import p077e5.C7350k;
import p087f4.C7437b;
import p210q4.AbstractC8886a;
import p285x4.AbstractC9848a;
import p285x4.C9852e;
import p285x4.InterfaceC9849b;
import p295y4.C9920o;
import p295y4.C9921p;
import p295y4.C9922q;
import p295y4.C9923r;
import p295y4.C9924s;

/* loaded from: classes4.dex */
public final class CommandRecord extends AbstractC9848a {

    /* renamed from: l */
    public static final C6748a f7753l = new C6748a(null);

    /* renamed from: c */
    public RecordEntity f7754c;

    /* renamed from: d */
    public CommandRecordEntity f7755d;

    /* renamed from: e */
    public final C9924s f7756e;

    /* renamed from: f */
    public final C9922q f7757f;

    /* renamed from: g */
    public final C9920o f7758g;

    /* renamed from: h */
    public final List f7759h;

    /* renamed from: i */
    public final C9923r f7760i;

    /* renamed from: j */
    public final C9921p f7761j;

    /* renamed from: k */
    public final ThreadPoolExecutor f7762k;

    /* renamed from: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$a */
    public static final class C6748a {
        public /* synthetic */ C6748a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C6748a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommandRecord(C9852e timeRecord) {
        super(timeRecord);
        Intrinsics.checkNotNullParameter(timeRecord, "timeRecord");
        this.f7756e = new C9924s();
        this.f7757f = new C9922q();
        this.f7758g = new C9920o();
        this.f7759h = new ArrayList();
        this.f7760i = new C9923r();
        this.f7761j = new C9921p();
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        Intrinsics.checkNotNull(executorServiceNewCachedThreadPool, "null cannot be cast to non-null type java.util.concurrent.ThreadPoolExecutor");
        this.f7762k = (ThreadPoolExecutor) executorServiceNewCachedThreadPool;
    }

    /* renamed from: A */
    public static final CommandInfoEntity m6823A(final List matrixList, final CommandRecord this$0, long j10, final EzyMatrix.Matrix lastMatrix, final EzyMatrix.Matrix originMatrix) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(matrixList, "$matrixList");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(lastMatrix, "$lastMatrix");
        Intrinsics.checkNotNullParameter(originMatrix, "$originMatrix");
        if (matrixList.isEmpty()) {
            return null;
        }
        long eventTime = matrixList.size() == 1 ? 0L : ((EzyMatrix.Matrix) CollectionsKt.last(matrixList)).getEventTime() - ((EzyMatrix.Matrix) CollectionsKt.first(matrixList)).getEventTime();
        CommandInfoEntity commandInfoEntityM16489b = this$0.m16489b(this$0.m16490c(eventTime, j10), eventTime, EzyCommandEnum.CommandEnum.ACTION_CAMERA_MATRIX, new Function0<Message>() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addCameraMatrix$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() throws IllegalAccessException, IllegalArgumentException {
                EzyCommand.CommandSource.CommandInfo.CameraMatrix.C6757b c6757bM7052y = EzyCommand.CommandSource.CommandInfo.CameraMatrix.m7052y();
                c6757bM7052y.m7091z(lastMatrix);
                c6757bM7052y.m7066A(originMatrix);
                C7437b c7437bM16739e = this$0.f7757f.m16739e(matrixList);
                if (c7437bM16739e != null) {
                    c6757bM7052y.m7068C(c7437bM16739e.m11991a());
                    c6757bM7052y.m7069D(c7437bM16739e.m11992b());
                }
                EzyCommand.CommandSource.CommandInfo.CameraMatrix cameraMatrixBuild = c6757bM7052y.build();
                Intrinsics.checkNotNullExpressionValue(cameraMatrixBuild, "builder.build()");
                return cameraMatrixBuild;
            }
        });
        this$0.m6875g0(commandInfoEntityM16489b);
        return commandInfoEntityM16489b;
    }

    /* renamed from: E */
    public static final CommandInfoEntity m6824E(CommandRecord this$0, long j10, final EzyGraphEnum.GraphEnum graphType, final EzyRectF.RectF rectF, final String parentGraphId) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(graphType, "$graphType");
        Intrinsics.checkNotNullParameter(rectF, "$rectF");
        Intrinsics.checkNotNullParameter(parentGraphId, "$parentGraphId");
        C9852e c9852eM16491d = this$0.m16491d();
        CommandInfoEntity commandInfoEntityM16489b = this$0.m16489b(c9852eM16491d != null ? InterfaceC9849b.a.m16493a(c9852eM16491d, j10, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_GRAPH_ADD, new Function0<Message>() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addCommand$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() {
                EzyCommand.CommandSource.CommandInfo.GraphData.C6765b c6765bM7242I = EzyCommand.CommandSource.CommandInfo.GraphData.m7242I();
                c6765bM7242I.m7299y(UUID.randomUUID().toString());
                c6765bM7242I.m7297w(graphType);
                c6765bM7242I.m7300z(rectF);
                c6765bM7242I.m7273A(parentGraphId);
                EzyCommand.CommandSource.CommandInfo.GraphData graphDataBuild = c6765bM7242I.build();
                Intrinsics.checkNotNullExpressionValue(graphDataBuild, "builder.build()");
                return graphDataBuild;
            }
        });
        this$0.m6875g0(commandInfoEntityM16489b);
        return commandInfoEntityM16489b;
    }

    /* renamed from: F */
    public static final CommandInfoEntity m6825F(final List eventList, final CommandRecord this$0, long j10, final String graphId, final EzyGraphEnum.GraphEnum graphType, final String parentGraphId, final EzyPaint.Paint paint) throws IllegalAccessException, IllegalArgumentException {
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
        CommandInfoEntity commandInfoEntityM16489b = this$0.m16489b(this$0.m16490c(eventTime, j10), eventTime, EzyCommandEnum.CommandEnum.ACTION_GRAPH_ADD, new Function0<Message>() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addCommand$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() throws IllegalAccessException, IllegalArgumentException {
                EzyCommand.CommandSource.CommandInfo.GraphData.C6765b c6765bM7242I = EzyCommand.CommandSource.CommandInfo.GraphData.m7242I();
                c6765bM7242I.m7299y(graphId);
                c6765bM7242I.m7297w(graphType);
                c6765bM7242I.m7300z(AbstractC7351l.m11772c(C7350k.f11918a.m11768d(eventList)));
                c6765bM7242I.m7273A(parentGraphId);
                C7437b c7437bM16751e = this$0.f7756e.m16751e(eventList, paint);
                if (c7437bM16751e != null) {
                    c6765bM7242I.m7275C(c7437bM16751e.m11991a());
                    c6765bM7242I.m7276D(c7437bM16751e.m11992b());
                }
                EzyCommand.CommandSource.CommandInfo.GraphData graphDataBuild = c6765bM7242I.build();
                Intrinsics.checkNotNullExpressionValue(graphDataBuild, "builder.build()");
                return graphDataBuild;
            }
        });
        this$0.m6875g0(commandInfoEntityM16489b);
        return commandInfoEntityM16489b;
    }

    /* renamed from: G */
    public static final CommandInfoEntity m6826G(final CommandRecord this$0, long j10, final EzyGraphEnum.GraphEnum graphType, final int i10, final int i11, final String parentGraphId, final String fileName, final String validate, final boolean z9) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(graphType, "$graphType");
        Intrinsics.checkNotNullParameter(parentGraphId, "$parentGraphId");
        Intrinsics.checkNotNullParameter(fileName, "$fileName");
        Intrinsics.checkNotNullParameter(validate, "$validate");
        C9852e c9852eM16491d = this$0.m16491d();
        CommandInfoEntity commandInfoEntityM16489b = this$0.m16489b(c9852eM16491d != null ? InterfaceC9849b.a.m16493a(c9852eM16491d, j10, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_GRAPH_ADD, new Function0<Message>() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addCommand$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() throws IllegalAccessException, IllegalArgumentException {
                EzyCommand.CommandSource.CommandInfo.GraphData.C6765b c6765bM7242I = EzyCommand.CommandSource.CommandInfo.GraphData.m7242I();
                c6765bM7242I.m7299y(UUID.randomUUID().toString());
                c6765bM7242I.m7297w(graphType);
                c6765bM7242I.m7300z(EzyRectF.RectF.m8043q().m8064s(0.0f).m8067v(0.0f).m8066u(i10).m8062q(i11).build());
                c6765bM7242I.m7273A(parentGraphId);
                C7437b c7437bM16727e = this$0.f7758g.m16727e(fileName, validate, i10, i11);
                if (c7437bM16727e != null) {
                    c6765bM7242I.m7275C(c7437bM16727e.m11991a());
                    c6765bM7242I.m7276D(c7437bM16727e.m11992b());
                }
                if (z9) {
                    c6765bM7242I.m7295u(c6765bM7242I.m7287l() + "imageBackground;");
                }
                EzyCommand.CommandSource.CommandInfo.GraphData graphDataBuild = c6765bM7242I.build();
                Intrinsics.checkNotNullExpressionValue(graphDataBuild, "builder.build()");
                return graphDataBuild;
            }
        });
        this$0.m6875g0(commandInfoEntityM16489b);
        return commandInfoEntityM16489b;
    }

    /* renamed from: I */
    public static final CommandInfoEntity m6827I(CommandRecord this$0, long j10, final int i10, final int i11, final BackgroundLineConfig originBackgroundLineConfig, final BackgroundLineConfig lastBackgroundLineConfig) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(originBackgroundLineConfig, "$originBackgroundLineConfig");
        Intrinsics.checkNotNullParameter(lastBackgroundLineConfig, "$lastBackgroundLineConfig");
        C9852e c9852eM16491d = this$0.m16491d();
        CommandInfoEntity commandInfoEntityM16489b = this$0.m16489b(c9852eM16491d != null ? InterfaceC9849b.a.m16493a(c9852eM16491d, j10, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_CONFIG, new Function0<Message>() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addConfigCommand$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() {
                EzyCommand.CommandSource.CommandInfo.Config.C6759b c6759bM7101y = EzyCommand.CommandSource.CommandInfo.Config.m7101y();
                c6759bM7101y.m7114B(i10);
                c6759bM7101y.m7140z(i11);
                c6759bM7101y.m7115C(AbstractC7345f.m11756g(originBackgroundLineConfig));
                c6759bM7101y.m7113A(AbstractC7345f.m11756g(lastBackgroundLineConfig));
                EzyCommand.CommandSource.CommandInfo.Config configBuild = c6759bM7101y.build();
                Intrinsics.checkNotNullExpressionValue(configBuild, "builder.build()");
                return configBuild;
            }
        });
        this$0.m6875g0(commandInfoEntityM16489b);
        return commandInfoEntityM16489b;
    }

    /* renamed from: K */
    public static final CommandInfoEntity m6828K(final CommandRecord this$0, long j10, final float f10, final float f11, final String parentGraphId, final int i10, final List pointList, final EzyPaint.Paint paint) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(parentGraphId, "$parentGraphId");
        Intrinsics.checkNotNullParameter(pointList, "$pointList");
        Intrinsics.checkNotNullParameter(paint, "$paint");
        C9852e c9852eM16491d = this$0.m16491d();
        CommandInfoEntity commandInfoEntityM16489b = this$0.m16489b(c9852eM16491d != null ? InterfaceC9849b.a.m16493a(c9852eM16491d, j10, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_GRAPH_ADD, new Function0<Message>() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addGeometryGraphCommand$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() throws IllegalAccessException, IllegalArgumentException {
                EzyCommand.CommandSource.CommandInfo.GraphData.C6765b c6765bM7242I = EzyCommand.CommandSource.CommandInfo.GraphData.m7242I();
                c6765bM7242I.m7299y(UUID.randomUUID().toString());
                c6765bM7242I.m7297w(EzyGraphEnum.GraphEnum.GEOMETRY_GRAPH);
                c6765bM7242I.m7300z(EzyRectF.RectF.m8043q().m8064s(0.0f).m8067v(0.0f).m8066u(f10).m8062q(f11).build());
                c6765bM7242I.m7273A(parentGraphId);
                C9921p c9921p = this$0.f7761j;
                int i11 = i10;
                List list = pointList;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC7351l.m11771b((PointF) it.next()));
                }
                C7437b c7437bM16733e = c9921p.m16733e(i11, arrayList, paint);
                if (c7437bM16733e != null) {
                    c6765bM7242I.m7275C(c7437bM16733e.m11991a());
                    c6765bM7242I.m7276D(c7437bM16733e.m11992b());
                }
                EzyCommand.CommandSource.CommandInfo.GraphData graphDataBuild = c6765bM7242I.build();
                Intrinsics.checkNotNullExpressionValue(graphDataBuild, "builder.build()");
                return graphDataBuild;
            }
        });
        this$0.m6875g0(commandInfoEntityM16489b);
        return commandInfoEntityM16489b;
    }

    /* renamed from: M */
    public static final CommandInfoEntity m6829M(final List matrixList, final CommandRecord this$0, long j10, final List graphIdList) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(matrixList, "$matrixList");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(graphIdList, "$graphIdList");
        if (matrixList.isEmpty()) {
            return null;
        }
        long eventTime = matrixList.size() == 1 ? 0L : ((EzyMatrix.Matrix) CollectionsKt.last(matrixList)).getEventTime() - ((EzyMatrix.Matrix) CollectionsKt.first(matrixList)).getEventTime();
        CommandInfoEntity commandInfoEntityM16489b = this$0.m16489b(this$0.m16490c(eventTime, j10), eventTime, EzyCommandEnum.CommandEnum.ACTION_GRAPH_MATRIX, new Function0<Message>() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addGraphMatrix$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() throws IllegalAccessException, IllegalArgumentException {
                EzyCommand.CommandSource.CommandInfo.GraphMatrix.C6767b c6767bM7301E = EzyCommand.CommandSource.CommandInfo.GraphMatrix.m7301E();
                c6767bM7301E.m7337b(graphIdList);
                C7437b c7437bM16739e = this$0.f7757f.m16739e(matrixList);
                if (c7437bM16739e != null) {
                    c6767bM7301E.m7334E(c7437bM16739e.m11991a());
                    c6767bM7301E.m7335F(c7437bM16739e.m11992b());
                }
                EzyCommand.CommandSource.CommandInfo.GraphMatrix graphMatrixBuild = c6767bM7301E.build();
                Intrinsics.checkNotNullExpressionValue(graphMatrixBuild, "builder.build()");
                return graphMatrixBuild;
            }
        });
        this$0.m6875g0(commandInfoEntityM16489b);
        return commandInfoEntityM16489b;
    }

    /* renamed from: O */
    public static final CommandInfoEntity m6830O(final CommandRecord this$0, long j10, final float f10, final float f11, final String parentGraphId, final String content, final EzyPaint.Paint paint) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(parentGraphId, "$parentGraphId");
        Intrinsics.checkNotNullParameter(content, "$content");
        Intrinsics.checkNotNullParameter(paint, "$paint");
        C9852e c9852eM16491d = this$0.m16491d();
        CommandInfoEntity commandInfoEntityM16489b = this$0.m16489b(c9852eM16491d != null ? InterfaceC9849b.a.m16493a(c9852eM16491d, j10, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_GRAPH_ADD, new Function0<Message>() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addTextGraphCommand$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() throws IllegalAccessException, IllegalArgumentException {
                EzyCommand.CommandSource.CommandInfo.GraphData.C6765b c6765bM7242I = EzyCommand.CommandSource.CommandInfo.GraphData.m7242I();
                c6765bM7242I.m7299y(UUID.randomUUID().toString());
                c6765bM7242I.m7297w(EzyGraphEnum.GraphEnum.TEXT_GRAPH);
                c6765bM7242I.m7300z(EzyRectF.RectF.m8043q().m8064s(0.0f).m8067v(0.0f).m8066u(f10).m8062q(f11).build());
                c6765bM7242I.m7273A(parentGraphId);
                C7437b c7437bM16745e = this$0.f7760i.m16745e(content, paint);
                if (c7437bM16745e != null) {
                    c6765bM7242I.m7275C(c7437bM16745e.m11991a());
                    c6765bM7242I.m7276D(c7437bM16745e.m11992b());
                }
                EzyCommand.CommandSource.CommandInfo.GraphData graphDataBuild = c6765bM7242I.build();
                Intrinsics.checkNotNullExpressionValue(graphDataBuild, "builder.build()");
                return graphDataBuild;
            }
        });
        this$0.m6875g0(commandInfoEntityM16489b);
        return commandInfoEntityM16489b;
    }

    /* renamed from: R */
    public static final CommandInfoEntity m6831R(CommandRecord this$0, long j10, final String graphId, final EzyGraphEnum.GraphEnum graphEnum, final EzyRectF.RectF rectF, final String str, final EzyPaint.Paint paint, final List list, final EzyMatrix.Matrix matrix, final String str2) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(graphId, "$graphId");
        Intrinsics.checkNotNullParameter(graphEnum, "$graphEnum");
        C9852e c9852eM16491d = this$0.m16491d();
        CommandInfoEntity commandInfoEntityM16489b = this$0.m16489b(c9852eM16491d != null ? InterfaceC9849b.a.m16493a(c9852eM16491d, j10, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_GRAPH_CHANGE, new Function0<Message>() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$changeGraph$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() {
                EzyCommand.CommandSource.CommandInfo.GraphChange.C6763b c6763bM7174J = EzyCommand.CommandSource.CommandInfo.GraphChange.m7174J();
                c6763bM7174J.m7213I(graphId);
                c6763bM7174J.m7211G(graphEnum);
                EzyRectF.RectF rectF2 = rectF;
                if (rectF2 != null) {
                    c6763bM7174J.m7214J(rectF2);
                }
                String str3 = str;
                if (str3 != null) {
                    c6763bM7174J.m7208D(str3);
                }
                EzyPaint.Paint paint2 = paint;
                if (paint2 != null) {
                    c6763bM7174J.m7215K(paint2);
                }
                List list2 = list;
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        c6763bM7174J.m7219b((EzyPointF.PointF) it.next());
                    }
                }
                EzyMatrix.Matrix matrix2 = matrix;
                if (matrix2 != null) {
                    c6763bM7174J.m7216L(matrix2);
                }
                String str4 = str2;
                if (str4 != null) {
                    c6763bM7174J.m7210F(str4);
                }
                EzyCommand.CommandSource.CommandInfo.GraphChange graphChangeBuild = c6763bM7174J.build();
                Intrinsics.checkNotNullExpressionValue(graphChangeBuild, "builder.build()");
                return graphChangeBuild;
            }
        });
        this$0.m6875g0(commandInfoEntityM16489b);
        return commandInfoEntityM16489b;
    }

    /* renamed from: S */
    private final synchronized void m6832S() {
        try {
            CommandRecordEntity commandRecordEntity = this.f7755d;
            if (commandRecordEntity == null) {
                this.f7755d = m6864P();
            } else {
                Intrinsics.checkNotNull(commandRecordEntity);
                if (commandRecordEntity.m6341a().size() >= 100) {
                    this.f7755d = m6864P();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: V */
    public static final CommandInfoEntity m6833V(final List eventList, final CommandRecord this$0, long j10, final EzyPaint.Paint paint) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(eventList, "$eventList");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(paint, "$paint");
        if (eventList.isEmpty()) {
            return null;
        }
        long eventTime = eventList.size() == 1 ? 0L : ((EzyTouchEvent.TouchEvent) CollectionsKt.last(eventList)).getEventTime() - ((EzyTouchEvent.TouchEvent) CollectionsKt.first(eventList)).getEventTime();
        CommandInfoEntity commandInfoEntityM16489b = this$0.m16489b(this$0.m16490c(eventTime, j10), eventTime, EzyCommandEnum.CommandEnum.ACTION_CURSOR_MOVE, new Function0<Message>() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$moveCursor$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() throws IllegalAccessException, IllegalArgumentException {
                EzyCommand.CommandSource.CommandInfo.CursorMove.C6761b c6761bM7145r = EzyCommand.CommandSource.CommandInfo.CursorMove.m7145r();
                C7437b c7437bM16751e = this.f7814a.f7756e.m16751e(eventList, paint);
                if (c7437bM16751e != null) {
                    c6761bM7145r.m7170s(c7437bM16751e.m11991a());
                    c6761bM7145r.m7171t(c7437bM16751e.m11992b());
                }
                EzyCommand.CommandSource.CommandInfo.CursorMove cursorMoveBuild = c6761bM7145r.build();
                Intrinsics.checkNotNullExpressionValue(cursorMoveBuild, "builder.build()");
                return cursorMoveBuild;
            }
        });
        this$0.m6875g0(commandInfoEntityM16489b);
        return commandInfoEntityM16489b;
    }

    /* renamed from: Y */
    public static final CommandInfoEntity m6834Y(CommandRecord this$0, long j10, final AbstractC8886a rootGraph, final int i10) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(rootGraph, "$rootGraph");
        C9852e c9852eM16491d = this$0.m16491d();
        CommandInfoEntity commandInfoEntityM16489b = this$0.m16489b(c9852eM16491d != null ? InterfaceC9849b.a.m16493a(c9852eM16491d, j10, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_REBUILD, new Function0<Message>() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$rebuild$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() {
                EzyCommand.CommandSource.CommandInfo.REBUILD.C6771b c6771bM7398v = EzyCommand.CommandSource.CommandInfo.REBUILD.m7398v();
                c6771bM7398v.m7411B(rootGraph.getSnapshot().build());
                c6771bM7398v.m7434y(i10);
                EzyCommand.CommandSource.CommandInfo.REBUILD rebuildBuild = c6771bM7398v.build();
                Intrinsics.checkNotNullExpressionValue(rebuildBuild, "builder.build()");
                return rebuildBuild;
            }
        });
        this$0.m6875g0(commandInfoEntityM16489b);
        return commandInfoEntityM16489b;
    }

    /* renamed from: b0 */
    public static final CommandInfoEntity m6835b0(CommandRecord this$0, long j10, final List graphIdList) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(graphIdList, "$graphIdList");
        C9852e c9852eM16491d = this$0.m16491d();
        CommandInfoEntity commandInfoEntityM16489b = this$0.m16489b(c9852eM16491d != null ? InterfaceC9849b.a.m16493a(c9852eM16491d, j10, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_GRAPH_REMOVE, new Function0<Message>() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$removeGraphList$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() {
                EzyCommand.CommandSource.CommandInfo.GraphRemove.C6769b c6769bM7362r = EzyCommand.CommandSource.CommandInfo.GraphRemove.m7362r();
                c6769bM7362r.m7374b(graphIdList);
                EzyCommand.CommandSource.CommandInfo.GraphRemove graphRemoveBuild = c6769bM7362r.build();
                Intrinsics.checkNotNullExpressionValue(graphRemoveBuild, "builder.build()");
                return graphRemoveBuild;
            }
        });
        this$0.m6875g0(commandInfoEntityM16489b);
        return commandInfoEntityM16489b;
    }

    /* renamed from: e0 */
    public static final CommandInfoEntity m6837e0(long j10, CommandRecord this$0) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EzyCommandEnum.CommandEnum commandEnum = EzyCommandEnum.CommandEnum.ACTION_RECORD_STOP;
        byte[] byteArray = Any.newBuilder().build().toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "newBuilder().build().toByteArray()");
        CommandInfoEntity commandInfoEntity = new CommandInfoEntity(0L, j10, 0L, true, commandEnum, byteArray);
        this$0.m6875g0(commandInfoEntity);
        return commandInfoEntity;
    }

    /* renamed from: y */
    public static final CommandInfoEntity m6856y(CommandRecord this$0, long j10, final EzyMatrix.Matrix originMatrix, final EzyMatrix.Matrix lastMatrix) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(originMatrix, "$originMatrix");
        Intrinsics.checkNotNullParameter(lastMatrix, "$lastMatrix");
        C9852e c9852eM16491d = this$0.m16491d();
        CommandInfoEntity commandInfoEntityM16489b = this$0.m16489b(c9852eM16491d != null ? InterfaceC9849b.a.m16493a(c9852eM16491d, j10, false, 2, null) : 0L, 0L, EzyCommandEnum.CommandEnum.ACTION_CAMERA, new Function0<Message>() { // from class: com.zykj.blackboard.core.record.dataRecorder.CommandRecord$addCamera$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Message invoke() {
                EzyCommand.CommandSource.CommandInfo.Camera.C6755b c6755bM7005t = EzyCommand.CommandSource.CommandInfo.Camera.m7005t();
                c6755bM7005t.m7017A(originMatrix);
                c6755bM7005t.m7042z(lastMatrix);
                EzyCommand.CommandSource.CommandInfo.Camera cameraBuild = c6755bM7005t.build();
                Intrinsics.checkNotNullExpressionValue(cameraBuild, "builder.build()");
                return cameraBuild;
            }
        });
        this$0.m6875g0(commandInfoEntityM16489b);
        return commandInfoEntityM16489b;
    }

    /* renamed from: B */
    public final CommandInfoEntity m6857B(final String parentGraphId, final EzyGraphEnum.GraphEnum graphType, final EzyRectF.RectF rectF, final long j10) throws ExecutionException, InterruptedException {
        Intrinsics.checkNotNullParameter(parentGraphId, "parentGraphId");
        Intrinsics.checkNotNullParameter(graphType, "graphType");
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        Object obj = this.f7762k.submit(new Callable() { // from class: y4.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m6824E(this.f17650a, j10, graphType, rectF, parentGraphId);
            }
        }).get();
        Intrinsics.checkNotNullExpressionValue(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    /* renamed from: C */
    public final CommandInfoEntity m6858C(final String parentGraphId, final EzyGraphEnum.GraphEnum graphType, final List eventList, final EzyPaint.Paint paint, final String graphId, final long j10) {
        Intrinsics.checkNotNullParameter(parentGraphId, "parentGraphId");
        Intrinsics.checkNotNullParameter(graphType, "graphType");
        Intrinsics.checkNotNullParameter(eventList, "eventList");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(graphId, "graphId");
        return (CommandInfoEntity) this.f7762k.submit(new Callable() { // from class: y4.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m6825F(eventList, this, j10, graphId, graphType, parentGraphId, paint);
            }
        }).get();
    }

    /* renamed from: D */
    public final CommandInfoEntity m6859D(final String parentGraphId, final String fileName, final EzyGraphEnum.GraphEnum graphType, final String validate, final int i10, final int i11, final long j10, final boolean z9) throws ExecutionException, InterruptedException {
        Intrinsics.checkNotNullParameter(parentGraphId, "parentGraphId");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(graphType, "graphType");
        Intrinsics.checkNotNullParameter(validate, "validate");
        Object obj = this.f7762k.submit(new Callable() { // from class: y4.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m6826G(this.f17638a, j10, graphType, i10, i11, parentGraphId, fileName, validate, z9);
            }
        }).get();
        Intrinsics.checkNotNullExpressionValue(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    /* renamed from: H */
    public final CommandInfoEntity m6860H(final int i10, final int i11, final BackgroundLineConfig originBackgroundLineConfig, final BackgroundLineConfig lastBackgroundLineConfig, final long j10) {
        Intrinsics.checkNotNullParameter(originBackgroundLineConfig, "originBackgroundLineConfig");
        Intrinsics.checkNotNullParameter(lastBackgroundLineConfig, "lastBackgroundLineConfig");
        Object obj = this.f7762k.submit(new Callable() { // from class: y4.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m6827I(this.f17670a, j10, i10, i11, originBackgroundLineConfig, lastBackgroundLineConfig);
            }
        }).get();
        Intrinsics.checkNotNullExpressionValue(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    /* renamed from: J */
    public final CommandInfoEntity m6861J(final String parentGraphId, final float f10, final float f11, final int i10, final List pointList, final EzyPaint.Paint paint, final long j10) throws ExecutionException, InterruptedException {
        Intrinsics.checkNotNullParameter(parentGraphId, "parentGraphId");
        Intrinsics.checkNotNullParameter(pointList, "pointList");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Object obj = this.f7762k.submit(new Callable() { // from class: y4.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m6828K(this.f17662a, j10, f10, f11, parentGraphId, i10, pointList, paint);
            }
        }).get();
        Intrinsics.checkNotNullExpressionValue(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    /* renamed from: L */
    public final CommandInfoEntity m6862L(final List graphIdList, final List matrixList, final long j10) {
        Intrinsics.checkNotNullParameter(graphIdList, "graphIdList");
        Intrinsics.checkNotNullParameter(matrixList, "matrixList");
        return (CommandInfoEntity) this.f7762k.submit(new Callable() { // from class: y4.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m6829M(matrixList, this, j10, graphIdList);
            }
        }).get();
    }

    /* renamed from: N */
    public final CommandInfoEntity m6863N(final String parentGraphId, final float f10, final float f11, final EzyPaint.Paint paint, final String content, final long j10) throws ExecutionException, InterruptedException {
        Intrinsics.checkNotNullParameter(parentGraphId, "parentGraphId");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(content, "content");
        Object obj = this.f7762k.submit(new Callable() { // from class: y4.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m6830O(this.f17685a, j10, f10, f11, parentGraphId, content, paint);
            }
        }).get();
        Intrinsics.checkNotNullExpressionValue(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    /* renamed from: P */
    public final CommandRecordEntity m6864P() {
        RecordEntity recordEntity = this.f7754c;
        if (recordEntity == null) {
            return null;
        }
        CommandRecordEntity commandRecordEntity = new CommandRecordEntity(0L, UUID.randomUUID() + "_command.bin", "");
        recordEntity.m6528b().add(commandRecordEntity);
        recordEntity.m6536j();
        return commandRecordEntity;
    }

    /* renamed from: Q */
    public final CommandInfoEntity m6865Q(final String graphId, final EzyGraphEnum.GraphEnum graphEnum, final EzyRectF.RectF rectF, final String str, final EzyPaint.Paint paint, final List list, final EzyMatrix.Matrix matrix, final String str2, final long j10) throws ExecutionException, InterruptedException {
        Intrinsics.checkNotNullParameter(graphId, "graphId");
        Intrinsics.checkNotNullParameter(graphEnum, "graphEnum");
        Object obj = this.f7762k.submit(new Callable() { // from class: y4.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m6831R(this.f17700a, j10, graphId, graphEnum, rectF, str, paint, list, matrix, str2);
            }
        }).get();
        Intrinsics.checkNotNullExpressionValue(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    /* renamed from: T */
    public final CommandRecordEntity m6866T() {
        ToMany toManyM6528b;
        CommandRecordEntity commandRecordEntity;
        RecordEntity recordEntity = this.f7754c;
        return (recordEntity == null || (toManyM6528b = recordEntity.m6528b()) == null || (commandRecordEntity = (CommandRecordEntity) CollectionsKt.lastOrNull((List) toManyM6528b)) == null || commandRecordEntity.m6341a().size() >= 100) ? m6864P() : commandRecordEntity;
    }

    /* renamed from: U */
    public final CommandInfoEntity m6867U(final List eventList, final EzyPaint.Paint paint, final long j10) {
        Intrinsics.checkNotNullParameter(eventList, "eventList");
        Intrinsics.checkNotNullParameter(paint, "paint");
        return (CommandInfoEntity) this.f7762k.submit(new Callable() { // from class: y4.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m6833V(eventList, this, j10, paint);
            }
        }).get();
    }

    /* renamed from: W */
    public final void m6868W(CommandInfoEntity commandInfoEntity) {
        Iterator it = this.f7759h.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC5119b) it.next()).mo2774a(commandInfoEntity);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: X */
    public final CommandInfoEntity m6869X(final AbstractC8886a rootGraph, final int i10, final long j10) {
        Intrinsics.checkNotNullParameter(rootGraph, "rootGraph");
        Object obj = this.f7762k.submit(new Callable() { // from class: y4.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m6834Y(this.f17692a, j10, rootGraph, i10);
            }
        }).get();
        Intrinsics.checkNotNullExpressionValue(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    /* renamed from: Z */
    public final void m6870Z(InterfaceC5119b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f7759h.add(listener);
    }

    /* renamed from: a0 */
    public final CommandInfoEntity m6871a0(final List graphIdList, final long j10) throws ExecutionException, InterruptedException {
        Intrinsics.checkNotNullParameter(graphIdList, "graphIdList");
        Object obj = this.f7762k.submit(new Callable() { // from class: y4.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m6835b0(this.f17647a, j10, graphIdList);
            }
        }).get();
        Intrinsics.checkNotNullExpressionValue(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    /* renamed from: c0 */
    public final void m6872c0(RecordEntity recordEntity) {
        Intrinsics.checkNotNullParameter(recordEntity, "recordEntity");
        this.f7754c = recordEntity;
        this.f7756e.m16754i(recordEntity);
        this.f7757f.m16742i(recordEntity);
        this.f7758g.m16730i(recordEntity);
        this.f7760i.m16748i(recordEntity);
        this.f7761j.m16736i(recordEntity);
        this.f7755d = m6866T();
    }

    /* renamed from: d0 */
    public final void m6873d0(final long j10) {
        this.f7762k.submit(new Callable() { // from class: y4.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m6837e0(j10, this);
            }
        });
    }

    /* renamed from: f0 */
    public final void m6874f0(InterfaceC5119b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f7759h.remove(listener);
    }

    /* renamed from: g0 */
    public final void m6875g0(CommandInfoEntity commandInfoEntity) throws IllegalAccessException, IllegalArgumentException {
        CommandRecordEntity commandRecordEntity = this.f7755d;
        if (commandRecordEntity != null) {
            commandInfoEntity.m6332f().m13071t(commandRecordEntity);
            commandInfoEntity.m6334h();
            commandRecordEntity.m6341a().add(commandInfoEntity);
            commandRecordEntity.m6345e();
        }
        LogUtils.m3239i("CommandRecord:updateEntity -> " + commandInfoEntity.getCommandEnum());
        m6832S();
        m6868W(commandInfoEntity);
    }

    /* renamed from: x */
    public final CommandInfoEntity m6876x(final EzyMatrix.Matrix originMatrix, final EzyMatrix.Matrix lastMatrix, final long j10) throws ExecutionException, InterruptedException {
        Intrinsics.checkNotNullParameter(originMatrix, "originMatrix");
        Intrinsics.checkNotNullParameter(lastMatrix, "lastMatrix");
        Object obj = this.f7762k.submit(new Callable() { // from class: y4.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m6856y(this.f17696a, j10, originMatrix, lastMatrix);
            }
        }).get();
        Intrinsics.checkNotNullExpressionValue(obj, "service.submit<CommandIn…        }\n        }.get()");
        return (CommandInfoEntity) obj;
    }

    /* renamed from: z */
    public final CommandInfoEntity m6877z(final EzyMatrix.Matrix originMatrix, final EzyMatrix.Matrix lastMatrix, final List matrixList, final long j10) {
        Intrinsics.checkNotNullParameter(originMatrix, "originMatrix");
        Intrinsics.checkNotNullParameter(lastMatrix, "lastMatrix");
        Intrinsics.checkNotNullParameter(matrixList, "matrixList");
        return (CommandInfoEntity) this.f7762k.submit(new Callable() { // from class: y4.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CommandRecord.m6823A(matrixList, this, j10, lastMatrix, originMatrix);
            }
        }).get();
    }
}
