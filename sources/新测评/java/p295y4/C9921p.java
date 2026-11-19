package p295y4;

import com.zykj.blackboard.core.data.dao.GeometryInfoEntity;
import com.zykj.blackboard.core.data.dao.GeometryPointFEntity;
import com.zykj.blackboard.core.data.dao.GeometryRecordEntity;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzyPointF;
import com.zykj.board.EzySource;
import io.objectbox.relation.ToMany;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p087f4.C7437b;
import p285x4.AbstractC9848a;

/* renamed from: y4.p */
/* loaded from: classes4.dex */
public final class C9921p extends AbstractC9848a {

    /* renamed from: e */
    public static final a f17717e = new a(null);

    /* renamed from: c */
    public RecordEntity f17718c;

    /* renamed from: d */
    public GeometryRecordEntity f17719d;

    /* renamed from: y4.p$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final EzySource.GeometrySource m16737a(String pageRootPath, String fileName) throws IOException {
            Intrinsics.checkNotNullParameter(pageRootPath, "pageRootPath");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            File file = new File(pageRootPath, fileName);
            if (!file.exists()) {
                throw new FileNotFoundException(file.getPath());
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            EzySource.GeometrySource record = EzySource.GeometrySource.m8268t(fileInputStream);
            fileInputStream.close();
            Intrinsics.checkNotNullExpressionValue(record, "record");
            return record;
        }

        public a() {
        }
    }

    public C9921p() {
        super(null);
    }

    /* renamed from: g */
    private final synchronized void m16732g() {
        try {
            GeometryRecordEntity geometryRecordEntity = this.f17719d;
            if (geometryRecordEntity == null) {
                this.f17719d = m16734f();
            } else {
                Intrinsics.checkNotNull(geometryRecordEntity);
                if (geometryRecordEntity.m6406b().size() >= 100) {
                    this.f17719d = m16734f();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: e */
    public final C7437b m16733e(int i10, List pointFList, EzyPaint.Paint paint) throws IllegalAccessException, IllegalArgumentException {
        C7437b c7437b;
        Intrinsics.checkNotNullParameter(pointFList, "pointFList");
        Intrinsics.checkNotNullParameter(paint, "paint");
        GeometryInfoEntity geometryInfoEntity = new GeometryInfoEntity(0L, paint.getWidth(), paint.getColor(), paint.m7973v(), paint.m7972u(), i10);
        Iterator it = pointFList.iterator();
        while (it.hasNext()) {
            EzyPointF.PointF pointF = (EzyPointF.PointF) it.next();
            GeometryPointFEntity geometryPointFEntity = new GeometryPointFEntity(0L, pointF.getX(), pointF.getY());
            geometryPointFEntity.m6395b().m13071t(geometryInfoEntity);
            geometryPointFEntity.m6398e();
            geometryInfoEntity.m6381d().add(geometryPointFEntity);
        }
        geometryInfoEntity.m6386i();
        GeometryRecordEntity geometryRecordEntity = this.f17719d;
        if (geometryRecordEntity != null) {
            geometryInfoEntity.m6382e().m13071t(geometryRecordEntity);
            geometryInfoEntity.m6386i();
            geometryRecordEntity.m6406b().add(geometryInfoEntity);
            geometryRecordEntity.m6409e();
            c7437b = new C7437b(geometryRecordEntity.getFileName(), geometryRecordEntity.m6406b().m13053r(geometryInfoEntity.getId()));
        } else {
            c7437b = null;
        }
        m16732g();
        return c7437b;
    }

    /* renamed from: f */
    public final GeometryRecordEntity m16734f() {
        RecordEntity recordEntity = this.f17718c;
        if (recordEntity == null) {
            return null;
        }
        GeometryRecordEntity geometryRecordEntity = new GeometryRecordEntity(0L, UUID.randomUUID() + "_geometry.bin", "");
        recordEntity.m6530d().add(geometryRecordEntity);
        recordEntity.m6536j();
        return geometryRecordEntity;
    }

    /* renamed from: h */
    public final GeometryRecordEntity m16735h() {
        ToMany toManyM6530d;
        GeometryRecordEntity geometryRecordEntity;
        RecordEntity recordEntity = this.f17718c;
        return (recordEntity == null || (toManyM6530d = recordEntity.m6530d()) == null || (geometryRecordEntity = (GeometryRecordEntity) CollectionsKt.lastOrNull((List) toManyM6530d)) == null || geometryRecordEntity.m6406b().size() >= 100) ? m16734f() : geometryRecordEntity;
    }

    /* renamed from: i */
    public final void m16736i(RecordEntity recordEntity) {
        Intrinsics.checkNotNullParameter(recordEntity, "recordEntity");
        this.f17718c = recordEntity;
        this.f17719d = m16735h();
    }
}
