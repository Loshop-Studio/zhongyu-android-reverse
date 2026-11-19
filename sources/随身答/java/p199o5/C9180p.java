package p199o5;

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
import p189n5.AbstractC9095a;
import p272v4.C9764c;

/* renamed from: o5.p */
/* loaded from: classes4.dex */
public final class C9180p extends AbstractC9095a {

    /* renamed from: e */
    public static final a f15571e = new a(null);

    /* renamed from: c */
    public RecordEntity f15572c;

    /* renamed from: d */
    public GeometryRecordEntity f15573d;

    /* renamed from: o5.p$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final EzySource.GeometrySource m14778a(String pageRootPath, String fileName) throws IOException {
            Intrinsics.checkNotNullParameter(pageRootPath, "pageRootPath");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            File file = new File(pageRootPath, fileName);
            if (!file.exists()) {
                throw new FileNotFoundException(file.getPath());
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            EzySource.GeometrySource record = EzySource.GeometrySource.m9411w(fileInputStream);
            fileInputStream.close();
            Intrinsics.checkNotNullExpressionValue(record, "record");
            return record;
        }

        public a() {
        }
    }

    public C9180p() {
        super(null);
    }

    /* renamed from: g */
    private final synchronized void m14773g() {
        try {
            GeometryRecordEntity geometryRecordEntity = this.f15573d;
            if (geometryRecordEntity == null) {
                this.f15573d = m14775f();
            } else {
                Intrinsics.checkNotNull(geometryRecordEntity);
                if (geometryRecordEntity.m7505b().size() >= 100) {
                    this.f15573d = m14775f();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: e */
    public final C9764c m14774e(int i9, List pointFList, EzyPaint.Paint paint) throws IllegalAccessException, IllegalArgumentException {
        C9764c c9764c;
        Intrinsics.checkNotNullParameter(pointFList, "pointFList");
        Intrinsics.checkNotNullParameter(paint, "paint");
        GeometryInfoEntity geometryInfoEntity = new GeometryInfoEntity(0L, paint.getWidth(), paint.getColor(), paint.m9108y(), paint.m9107x(), i9);
        Iterator it = pointFList.iterator();
        while (it.hasNext()) {
            EzyPointF.PointF pointF = (EzyPointF.PointF) it.next();
            GeometryPointFEntity geometryPointFEntity = new GeometryPointFEntity(0L, pointF.getX(), pointF.getY());
            geometryPointFEntity.m7494b().m13190w(geometryInfoEntity);
            geometryPointFEntity.m7497e();
            geometryInfoEntity.m7480d().add(geometryPointFEntity);
        }
        geometryInfoEntity.m7485i();
        GeometryRecordEntity geometryRecordEntity = this.f15573d;
        if (geometryRecordEntity != null) {
            geometryInfoEntity.m7481e().m13190w(geometryRecordEntity);
            geometryInfoEntity.m7485i();
            geometryRecordEntity.m7505b().add(geometryInfoEntity);
            geometryRecordEntity.m7508e();
            c9764c = new C9764c(geometryRecordEntity.getFileName(), geometryRecordEntity.m7505b().m13175u(geometryInfoEntity.getId()));
        } else {
            c9764c = null;
        }
        m14773g();
        return c9764c;
    }

    /* renamed from: f */
    public final GeometryRecordEntity m14775f() {
        RecordEntity recordEntity = this.f15572c;
        if (recordEntity == null) {
            return null;
        }
        GeometryRecordEntity geometryRecordEntity = new GeometryRecordEntity(0L, UUID.randomUUID() + "_geometry.bin", "");
        recordEntity.m7632d().add(geometryRecordEntity);
        recordEntity.m7638j();
        return geometryRecordEntity;
    }

    /* renamed from: h */
    public final GeometryRecordEntity m14776h() {
        ToMany toManyM7632d;
        GeometryRecordEntity geometryRecordEntity;
        RecordEntity recordEntity = this.f15572c;
        return (recordEntity == null || (toManyM7632d = recordEntity.m7632d()) == null || (geometryRecordEntity = (GeometryRecordEntity) CollectionsKt.lastOrNull((List) toManyM7632d)) == null || geometryRecordEntity.m7505b().size() >= 100) ? m14775f() : geometryRecordEntity;
    }

    /* renamed from: i */
    public final void m14777i(RecordEntity recordEntity) {
        Intrinsics.checkNotNullParameter(recordEntity, "recordEntity");
        this.f15572c = recordEntity;
        this.f15573d = m14776h();
    }
}
