package p213p5;

import android.graphics.Bitmap;
import com.google.protobuf.Any;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.core.data.dao.BackgroundLineConfigEntity;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.blackboard.core.data.dao.CommandRecordEntity;
import com.zykj.blackboard.core.data.dao.FileInfoEntity;
import com.zykj.blackboard.core.data.dao.FileRecordEntity;
import com.zykj.blackboard.core.data.dao.HeaderEntity;
import com.zykj.blackboard.core.data.dao.MatrixRecordEntity;
import com.zykj.blackboard.core.data.dao.PageEntity;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.blackboard.core.data.dao.TextRecordEntity;
import com.zykj.blackboard.core.data.dao.TouchRecordEntity;
import com.zykj.blackboard.enums.DocumentType;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyCommandEnum;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyPageSnapshot;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p006a5.C0038b;
import p023b5.C5120j;
import p034c5.C5230b;
import p034c5.C5231c;
import p095e5.AbstractC7846a;
import p095e5.C7847b;
import p169l5.C8888b;
import p169l5.C8890d;
import p189n5.C9097c;
import p263u5.AbstractC9688g;
import p263u5.AbstractC9695n;
import p263u5.AbstractC9697p;
import p263u5.C9692k;
import p272v4.C9763b;
import p312z4.C9998a;

/* renamed from: p5.b */
/* loaded from: classes4.dex */
public final class C9323b {

    /* renamed from: a */
    public final String f16180a;

    /* renamed from: b */
    public final String f16181b;

    /* renamed from: c */
    public final PageEntity f16182c;

    /* renamed from: d */
    public final ArrayList f16183d;

    /* renamed from: e */
    public final HashMap f16184e;

    /* renamed from: f */
    public int[] f16185f;

    /* renamed from: g */
    public long f16186g;

    /* renamed from: p5.b$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16187a;

        static {
            int[] iArr = new int[EzyCommandEnum.CommandEnum.values().length];
            iArr[EzyCommandEnum.CommandEnum.ACTION_GRAPH_ADD.ordinal()] = 1;
            iArr[EzyCommandEnum.CommandEnum.ACTION_CAMERA_MATRIX.ordinal()] = 2;
            iArr[EzyCommandEnum.CommandEnum.ACTION_GRAPH_MATRIX.ordinal()] = 3;
            f16187a = iArr;
        }
    }

    public C9323b(String pagePath) throws IllegalAccessException, IOException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        this.f16180a = pagePath;
        this.f16183d = new ArrayList();
        this.f16184e = new HashMap();
        this.f16185f = new int[2];
        File file = new File(pagePath);
        String parent = file.getParent();
        Intrinsics.checkNotNullExpressionValue(parent, "pageFile.parent");
        this.f16181b = parent;
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "pageFile.name");
        PageEntity pageEntity = new PageEntity(0L, name, false, null, 0, 28, null);
        this.f16182c = pageEntity;
        C5230b.f2464a.m2347A(parent, pageEntity);
    }

    /* renamed from: f */
    public static final void m15205f(C9323b this$0, long j9, Function1 callback) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        try {
            long jM15206b = this$0.m15206b(j9);
            this$0.m15210g(this$0.f16185f);
            this$0.m15208d(jM15206b);
            C9998a c9998a = new C9998a();
            C0038b c0038bM15207c = this$0.m15207c(c9998a);
            HeaderEntity headerEntity = (HeaderEntity) this$0.f16182c.m7613e().m13183g();
            headerEntity.m7540x(System.currentTimeMillis());
            headerEntity.m7536t(jM15206b);
            headerEntity.m7539w(c0038bM15207c.getBackgroundColor());
            BackgroundLineConfigEntity target = (BackgroundLineConfigEntity) headerEntity.m7526j().m13183g();
            if (target != null) {
                Intrinsics.checkNotNullExpressionValue(target, "target");
                BackgroundLineConfig backgroundLineConfigM184K = c0038bM15207c.m184K();
                target.m7406h(backgroundLineConfigM184K.m7069a());
                target.m7407i(backgroundLineConfigM184K.m7070b());
                target.m7409k(backgroundLineConfigM184K.m7072d());
                target.m7408j(AbstractC9688g.m16176f(backgroundLineConfigM184K.m7071c()));
            }
            C5231c c5231c = C5231c.f2465a;
            c5231c.m2386h(this$0.f16182c, this$0.f16181b);
            EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshotM196W = c0038bM15207c.m196W();
            if (graphSnapshotM196W != null) {
                EzyPageSnapshot.PageSnapshot.C7120b c7120bM8970w = EzyPageSnapshot.PageSnapshot.m8970w();
                c7120bM8970w.m9089z(graphSnapshotM196W);
                c7120bM8970w.m9087x(AbstractC9695n.m16201c(c9998a.m17346d(), 0L));
                AbstractC9697p.a aVar = AbstractC9697p.f17136a;
                String str = this$0.f16180a;
                EzyPageSnapshot.PageSnapshot pageSnapshotBuild = c7120bM8970w.build();
                Intrinsics.checkNotNullExpressionValue(pageSnapshotBuild, "builder.build()");
                aVar.m16209b(str, "snapshot.bin", pageSnapshotBuild);
            }
            Bitmap bitmapM191R = c0038bM15207c.m191R();
            if (bitmapM191R != null) {
                AbstractC9697p.f17136a.m16208a(this$0.f16180a, "screenshot.png", bitmapM191R);
            }
            c5231c.m2389k(this$0.f16182c, this$0.f16181b);
            callback.invoke("");
        } catch (Exception e10) {
            callback.invoke(e10.toString());
            e10.printStackTrace();
        }
    }

    /* renamed from: b */
    public final long m15206b(long j9) {
        if (this.f16183d.isEmpty()) {
            m15215l();
        }
        int size = this.f16183d.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (j9 >= ((long[]) this.f16183d.get(i9))[0] && j9 <= ((long[]) this.f16183d.get(i9))[1]) {
                Object obj = this.f16184e.get(this.f16183d.get(i9));
                Intrinsics.checkNotNull(obj);
                this.f16185f = (int[]) obj;
                this.f16186g = j9 - ((long[]) this.f16183d.get(i9))[0];
                return j9;
            }
            if (j9 < ((long[]) this.f16183d.get(i9))[0]) {
                int i10 = i9 - 1;
                if (j9 - ((long[]) this.f16183d.get(i10))[1] > ((long[]) this.f16183d.get(i9))[0] - j9) {
                    Object obj2 = this.f16184e.get(this.f16183d.get(i9));
                    Intrinsics.checkNotNull(obj2);
                    this.f16185f = (int[]) obj2;
                    this.f16186g = 0L;
                    return ((long[]) this.f16183d.get(i9))[0];
                }
                Object obj3 = this.f16184e.get(this.f16183d.get(i10));
                Intrinsics.checkNotNull(obj3);
                this.f16185f = (int[]) obj3;
                this.f16186g = ((long[]) this.f16183d.get(i10))[1] - ((long[]) this.f16183d.get(i10))[0];
                return ((long[]) this.f16183d.get(i10))[1];
            }
        }
        return ((long[]) CollectionsKt.last((List) this.f16183d))[1];
    }

    /* renamed from: c */
    public final C0038b m15207c(C9998a c9998a) {
        ToOne toOneM7521e;
        BackgroundLineConfigEntity backgroundLineConfigEntity;
        BackgroundLineConfig backgroundLineConfigM16172b;
        C0038b c0038b = new C0038b(c9998a, new C5120j(new C9324c(((HeaderEntity) this.f16182c.m7613e().m13183g()).getWidth(), ((HeaderEntity) this.f16182c.m7613e().m13183g()).getHeight()), new C9325d(((HeaderEntity) this.f16182c.m7613e().m13183g()).getWidth(), ((HeaderEntity) this.f16182c.m7613e().m13183g()).getHeight()), null, null), new C9763b(((HeaderEntity) this.f16182c.m7613e().m13183g()).getWidth(), ((HeaderEntity) this.f16182c.m7613e().m13183g()).getHeight()));
        HeaderEntity headerEntity = (HeaderEntity) this.f16182c.m7613e().m13183g();
        if (headerEntity != null) {
            c0038b.m192S(headerEntity.getDefaultBackgroundColor());
        }
        HeaderEntity headerEntity2 = (HeaderEntity) this.f16182c.m7613e().m13183g();
        if (headerEntity2 != null && (toOneM7521e = headerEntity2.m7521e()) != null && (backgroundLineConfigEntity = (BackgroundLineConfigEntity) toOneM7521e.m13183g()) != null && (backgroundLineConfigM16172b = AbstractC9688g.m16172b(backgroundLineConfigEntity)) != null) {
            c0038b.m193T(backgroundLineConfigM16172b);
        }
        C7847b c7847b = C7847b.f13183a;
        int version = ((HeaderEntity) this.f16182c.m7613e().m13183g()).getVersion();
        Object objM13183g = this.f16182c.m7615g().m13183g();
        Intrinsics.checkNotNullExpressionValue(objM13183g, "pageEntity.recordEntity.target");
        C8890d c8890d = new C8890d((RecordEntity) objM13183g);
        c8890d.m13828f(this.f16180a);
        Unit unit = Unit.INSTANCE;
        AbstractC7846a abstractC7846aM12301a = c7847b.m12301a(version, c8890d, c9998a, c0038b);
        Iterator<TARGET> it = ((RecordEntity) this.f16182c.m7615g().m13183g()).m7630b().iterator();
        while (it.hasNext()) {
            Iterator<TARGET> it2 = ((CommandRecordEntity) it.next()).m7438a().iterator();
            while (it2.hasNext()) {
                EzyCommand.CommandSource.CommandInfo commandInfoM13819a = C8888b.f14696a.m13819a((CommandInfoEntity) it2.next());
                if (commandInfoM13819a != null) {
                    abstractC7846aM12301a.m12298b(commandInfoM13819a);
                }
            }
        }
        return c0038b;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00e8 A[PHI: r2
      0x00e8: PHI (r2v6 int) = (r2v5 int), (r2v9 int) binds: [B:15:0x008c, B:17:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m15208d(long r14) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p213p5.C9323b.m15208d(long):void");
    }

    /* renamed from: e */
    public final void m15209e(final long j9, final Function1 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        new Thread(new Runnable() { // from class: p5.a
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                C9323b.m15205f(this.f16177a, j9, callback);
            }
        }).start();
    }

    /* renamed from: g */
    public final void m15210g(int[] iArr) {
        ToMany toManyM7630b = ((RecordEntity) this.f16182c.m7615g().m13183g()).m7630b();
        ToMany toManyM7438a = ((CommandRecordEntity) toManyM7630b.get(iArr[0])).m7438a();
        boolean[] zArr = new boolean[4];
        for (int i9 = 0; i9 < 4; i9++) {
            zArr[i9] = false;
        }
        int size = toManyM7630b.size();
        for (int i10 = iArr[0]; i10 < size; i10++) {
            int size2 = ((CommandRecordEntity) toManyM7630b.get(i10)).m7438a().size();
            for (int i11 = iArr[1]; i11 < size2; i11++) {
                CommandInfoEntity commandInfoEntity = (CommandInfoEntity) ((CommandRecordEntity) toManyM7630b.get(i10)).m7438a().get(i11);
                int i12 = a.f16187a[commandInfoEntity.getCommandEnum().ordinal()];
                if (i12 == 1) {
                    EzyCommand.CommandSource.CommandInfo.GraphData graphDataM8363P = EzyCommand.CommandSource.CommandInfo.GraphData.m8363P(commandInfoEntity.getData());
                    if (graphDataM8363P.m8379E() == EzyGraphEnum.GraphEnum.IMAGE_GRAPH && !zArr[0]) {
                        String strM8384J = graphDataM8363P.m8384J();
                        Intrinsics.checkNotNullExpressionValue(strM8384J, "data.sourceFileName");
                        m15211h(strM8384J, graphDataM8363P.m8385K());
                        zArr[0] = true;
                    } else if (graphDataM8363P.m8379E() == EzyGraphEnum.GraphEnum.TEXT_GRAPH && !zArr[1]) {
                        String strM8384J2 = graphDataM8363P.m8384J();
                        Intrinsics.checkNotNullExpressionValue(strM8384J2, "data.sourceFileName");
                        m15213j(strM8384J2, graphDataM8363P.m8385K());
                        zArr[1] = true;
                    } else if (graphDataM8363P.m8379E() == EzyGraphEnum.GraphEnum.STROKE_GRAPH || (graphDataM8363P.m8379E() == EzyGraphEnum.GraphEnum.BEELINE_STROKE_GRAPH && !zArr[2])) {
                        String strM8384J3 = graphDataM8363P.m8384J();
                        Intrinsics.checkNotNullExpressionValue(strM8384J3, "data.sourceFileName");
                        m15214k(strM8384J3, graphDataM8363P.m8385K());
                        zArr[2] = true;
                    }
                } else if (i12 == 2) {
                    EzyCommand.CommandSource.CommandInfo.CameraMatrix cameraMatrixM8161F = EzyCommand.CommandSource.CommandInfo.CameraMatrix.m8161F(commandInfoEntity.getData());
                    if (!zArr[3]) {
                        String strM8176x = cameraMatrixM8161F.m8176x();
                        Intrinsics.checkNotNullExpressionValue(strM8176x, "data.sourceFileName");
                        m15212i(strM8176x, cameraMatrixM8161F.m8177y());
                        zArr[3] = true;
                    }
                } else if (i12 == 3) {
                    EzyCommand.CommandSource.CommandInfo.GraphMatrix graphMatrixM8420L = EzyCommand.CommandSource.CommandInfo.GraphMatrix.m8420L(commandInfoEntity.getData());
                    if (!zArr[3]) {
                        String strM8435D = graphMatrixM8420L.m8435D();
                        Intrinsics.checkNotNullExpressionValue(strM8435D, "data.sourceFileName");
                        m15212i(strM8435D, graphMatrixM8420L.m8436E());
                        zArr[3] = true;
                    }
                }
            }
        }
        if (iArr[0] + 1 < toManyM7630b.size()) {
            int size3 = toManyM7630b.size();
            for (int i13 = iArr[0] + 1; i13 < size3; i13++) {
                toManyM7630b.remove(iArr[0] + 1);
            }
        }
        if (iArr[1] < toManyM7438a.size()) {
            int size4 = toManyM7438a.size();
            for (int i14 = iArr[1]; i14 < size4; i14++) {
                toManyM7438a.remove(iArr[1]);
            }
        }
        if (toManyM7438a.isEmpty()) {
            toManyM7630b.remove(iArr[0]);
        }
        ToMany toManyM7438a2 = ((CommandRecordEntity) CollectionsKt.last((List) toManyM7630b)).m7438a();
        long j9 = this.f16186g;
        EzyCommandEnum.CommandEnum commandEnum = EzyCommandEnum.CommandEnum.ACTION_RECORD_STOP;
        byte[] byteArray = Any.newBuilder().build().toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "newBuilder().build().toByteArray()");
        toManyM7438a2.add(new CommandInfoEntity(0L, j9, 0L, true, commandEnum, byteArray));
    }

    /* renamed from: h */
    public final void m15211h(String str, int i9) {
        ToMany toManyM7631c = ((RecordEntity) this.f16182c.m7615g().m13183g()).m7631c();
        Iterator<TARGET> it = toManyM7631c.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            } else if (Intrinsics.areEqual(((FileRecordEntity) it.next()).getFileName(), str)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        ToMany toManyM7464a = ((FileRecordEntity) toManyM7631c.get(i10)).m7464a();
        int i11 = i10 + 1;
        int size = toManyM7631c.size();
        for (int i12 = i11; i12 < size; i12++) {
            Iterator<TARGET> it2 = ((FileRecordEntity) toManyM7631c.get(i12)).m7464a().iterator();
            while (it2.hasNext()) {
                C9692k.f17130a.m16185b(C9097c.f15322d.m14637a(this.f16180a, DocumentType.IMAGE) + File.separatorChar + ((FileInfoEntity) it2.next()).getFileName());
            }
        }
        int size2 = toManyM7464a.size();
        for (int i13 = i9; i13 < size2; i13++) {
            C9692k.f17130a.m16185b(C9097c.f15322d.m14637a(this.f16180a, DocumentType.IMAGE) + File.separatorChar + ((FileInfoEntity) toManyM7464a.get(i13)).getFileName());
        }
        if (i11 < toManyM7631c.size()) {
            int size3 = toManyM7631c.size();
            for (int i14 = i11; i14 < size3; i14++) {
                toManyM7631c.remove(i11);
            }
        }
        int size4 = toManyM7464a.size();
        for (int i15 = i9; i15 < size4; i15++) {
            toManyM7464a.remove(i9);
        }
        if (toManyM7464a.isEmpty()) {
            toManyM7631c.remove(i10);
        }
    }

    /* renamed from: i */
    public final void m15212i(String str, int i9) {
        ToMany toManyM7634f = ((RecordEntity) this.f16182c.m7615g().m13183g()).m7634f();
        Iterator<TARGET> it = toManyM7634f.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            } else if (Intrinsics.areEqual(((MatrixRecordEntity) it.next()).getFileName(), str)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        ToMany toManyM7584c = ((MatrixRecordEntity) toManyM7634f.get(i10)).m7584c();
        int i11 = i10 + 1;
        if (i11 < toManyM7634f.size()) {
            int size = toManyM7634f.size();
            for (int i12 = i11; i12 < size; i12++) {
                toManyM7634f.remove(i11);
            }
        }
        int size2 = toManyM7584c.size();
        for (int i13 = i9; i13 < size2; i13++) {
            toManyM7584c.remove(i9);
        }
        if (toManyM7584c.isEmpty()) {
            toManyM7634f.remove(i10);
        }
    }

    /* renamed from: j */
    public final void m15213j(String str, int i9) {
        ToMany toManyM7636h = ((RecordEntity) this.f16182c.m7615g().m13183g()).m7636h();
        Iterator<TARGET> it = toManyM7636h.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            } else if (Intrinsics.areEqual(((TextRecordEntity) it.next()).getFileName(), str)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        ToMany toManyM7675c = ((TextRecordEntity) toManyM7636h.get(i10)).m7675c();
        int i11 = i10 + 1;
        if (i11 < toManyM7636h.size()) {
            int size = toManyM7636h.size();
            for (int i12 = i11; i12 < size; i12++) {
                toManyM7636h.remove(i11);
            }
        }
        int size2 = toManyM7675c.size();
        for (int i13 = i9; i13 < size2; i13++) {
            toManyM7675c.remove(i9);
        }
        if (toManyM7675c.isEmpty()) {
            toManyM7636h.remove(i10);
        }
    }

    /* renamed from: k */
    public final void m15214k(String str, int i9) {
        ToMany toManyM7637i = ((RecordEntity) this.f16182c.m7615g().m13183g()).m7637i();
        Iterator<TARGET> it = toManyM7637i.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            } else if (Intrinsics.areEqual(((TouchRecordEntity) it.next()).getFileName(), str)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        ToMany toManyM7717c = ((TouchRecordEntity) toManyM7637i.get(i10)).m7717c();
        int i11 = i10 + 1;
        if (i11 < toManyM7637i.size()) {
            int size = toManyM7637i.size();
            for (int i12 = i11; i12 < size; i12++) {
                toManyM7637i.remove(i11);
            }
        }
        int size2 = toManyM7717c.size();
        for (int i13 = i9; i13 < size2; i13++) {
            toManyM7717c.remove(i9);
        }
        if (toManyM7717c.isEmpty()) {
            toManyM7637i.remove(i10);
        }
    }

    /* renamed from: l */
    public final List m15215l() {
        if (this.f16183d.isEmpty()) {
            int size = ((RecordEntity) this.f16182c.m7615g().m13183g()).m7630b().size();
            long delayTime = 0;
            for (int i9 = 0; i9 < size; i9++) {
                CommandRecordEntity commandRecordEntity = (CommandRecordEntity) ((RecordEntity) this.f16182c.m7615g().m13183g()).m7630b().get(i9);
                int size2 = commandRecordEntity.m7438a().size();
                for (int i10 = 0; i10 < size2; i10++) {
                    CommandInfoEntity commandInfoEntity = (CommandInfoEntity) commandRecordEntity.m7438a().get(i10);
                    if (commandInfoEntity.getIsPlay()) {
                        long[] jArr = {delayTime, commandInfoEntity.getDelayTime() + delayTime};
                        this.f16183d.add(jArr);
                        if (!this.f16184e.containsKey(jArr)) {
                            this.f16184e.put(jArr, new int[]{i9, i10});
                        }
                        delayTime += commandInfoEntity.getDelayTime() + commandInfoEntity.getDuration();
                    }
                }
            }
        }
        return CollectionsKt.toList(this.f16183d);
    }
}
