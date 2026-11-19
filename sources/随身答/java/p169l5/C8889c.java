package p169l5;

import com.zykj.blackboard.core.data.dao.FileInfoEntity;
import com.zykj.blackboard.core.data.dao.FileRecordEntity;
import com.zykj.blackboard.core.data.dao.FileRecordEntity_;
import com.zykj.blackboard.core.data.dao.GeometryInfoEntity;
import com.zykj.blackboard.core.data.dao.GeometryRecordEntity;
import com.zykj.blackboard.core.data.dao.GeometryRecordEntity_;
import com.zykj.blackboard.core.data.dao.MatrixEventEntity;
import com.zykj.blackboard.core.data.dao.MatrixRecordEntity;
import com.zykj.blackboard.core.data.dao.MatrixRecordEntity_;
import com.zykj.blackboard.core.data.dao.TextInfoEntity;
import com.zykj.blackboard.core.data.dao.TextRecordEntity;
import com.zykj.blackboard.core.data.dao.TextRecordEntity_;
import com.zykj.blackboard.core.data.dao.TouchEventEntity;
import com.zykj.blackboard.core.data.dao.TouchRecordEntity;
import com.zykj.blackboard.core.data.dao.TouchRecordEntity_;
import com.zykj.board.EzySource;
import io.objectbox.query.Query;
import io.objectbox.query.QueryBuilder;
import io.objectbox.relation.ToMany;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p026b8.C5206a;
import p263u5.C9685d;

/* renamed from: l5.c */
/* loaded from: classes4.dex */
public final class C8889c implements InterfaceC8891e {

    /* renamed from: a */
    public String f14697a = "";

    /* renamed from: b */
    public final HashMap f14698b = new HashMap();

    /* renamed from: c */
    public boolean f14699c;

    @Override // p169l5.InterfaceC8891e
    /* renamed from: a */
    public EzySource.TouchSource.TouchInfo mo13811a(String sourceFileName, int i9) {
        ToMany toManyM7717c;
        Object[] array;
        TouchEventEntity[] touchEventEntityArr;
        ToMany toManyM7717c2;
        Intrinsics.checkNotNullParameter(sourceFileName, "sourceFileName");
        if (!this.f14699c) {
            C5206a c5206aM13101h = C9685d.f17121a.m16165f().m13101h(TouchRecordEntity.class);
            Intrinsics.checkNotNullExpressionValue(c5206aM13101h, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder = c5206aM13101h.m2257n();
            Intrinsics.checkNotNullExpressionValue(builder, "builder");
            builder.m13160g(TouchRecordEntity_.f8944f, sourceFileName);
            Query queryM13158a = builder.m13158a();
            Intrinsics.checkNotNullExpressionValue(queryM13158a, "builder.build()");
            List listM13150n = queryM13158a.m13150n();
            Intrinsics.checkNotNullExpressionValue(listM13150n, "BoardBox.boxStore.boxFor…                 }.find()");
            TouchRecordEntity touchRecordEntity = (TouchRecordEntity) CollectionsKt.firstOrNull(listM13150n);
            if (touchRecordEntity != null && (toManyM7717c = touchRecordEntity.m7717c()) != null) {
                array = toManyM7717c.toArray(new TouchEventEntity[0]);
                Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                touchEventEntityArr = (TouchEventEntity[]) array;
            }
            touchEventEntityArr = null;
        } else if (this.f14698b.get(sourceFileName) instanceof TouchEventEntity[]) {
            Object obj = this.f14698b.get(sourceFileName);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<com.zykj.blackboard.core.data.dao.TouchEventEntity?>");
            }
            touchEventEntityArr = (TouchEventEntity[]) obj;
        } else {
            C5206a c5206aM13101h2 = C9685d.f17121a.m16165f().m13101h(TouchRecordEntity.class);
            Intrinsics.checkNotNullExpressionValue(c5206aM13101h2, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder2 = c5206aM13101h2.m2257n();
            Intrinsics.checkNotNullExpressionValue(builder2, "builder");
            builder2.m13160g(TouchRecordEntity_.f8944f, sourceFileName);
            Query queryM13158a2 = builder2.m13158a();
            Intrinsics.checkNotNullExpressionValue(queryM13158a2, "builder.build()");
            List listM13150n2 = queryM13158a2.m13150n();
            Intrinsics.checkNotNullExpressionValue(listM13150n2, "BoardBox.boxStore.boxFor…                 }.find()");
            TouchRecordEntity touchRecordEntity2 = (TouchRecordEntity) CollectionsKt.firstOrNull(listM13150n2);
            if (touchRecordEntity2 != null && (toManyM7717c2 = touchRecordEntity2.m7717c()) != null) {
                array = toManyM7717c2.toArray(new TouchEventEntity[0]);
                Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                touchEventEntityArr = (TouchEventEntity[]) array;
            }
            touchEventEntityArr = null;
        }
        if (touchEventEntityArr != null) {
            this.f14698b.put(sourceFileName, touchEventEntityArr);
            if (i9 < touchEventEntityArr.length) {
                return C8888b.f14696a.m13824f(touchEventEntityArr[i9]);
            }
        }
        return null;
    }

    @Override // p169l5.InterfaceC8891e
    /* renamed from: b */
    public EzySource.MatrixSource.MatrixInfo mo13812b(String sourceFileName, int i9) {
        ToMany toManyM7584c;
        Object[] array;
        MatrixEventEntity[] matrixEventEntityArr;
        ToMany toManyM7584c2;
        Intrinsics.checkNotNullParameter(sourceFileName, "sourceFileName");
        if (!this.f14699c) {
            C5206a c5206aM13101h = C9685d.f17121a.m16165f().m13101h(MatrixRecordEntity.class);
            Intrinsics.checkNotNullExpressionValue(c5206aM13101h, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder = c5206aM13101h.m2257n();
            Intrinsics.checkNotNullExpressionValue(builder, "builder");
            builder.m13160g(MatrixRecordEntity_.f8775f, sourceFileName);
            Query queryM13158a = builder.m13158a();
            Intrinsics.checkNotNullExpressionValue(queryM13158a, "builder.build()");
            List listM13150n = queryM13158a.m13150n();
            Intrinsics.checkNotNullExpressionValue(listM13150n, "BoardBox.boxStore.boxFor…                 }.find()");
            MatrixRecordEntity matrixRecordEntity = (MatrixRecordEntity) CollectionsKt.firstOrNull(listM13150n);
            if (matrixRecordEntity != null && (toManyM7584c = matrixRecordEntity.m7584c()) != null) {
                array = toManyM7584c.toArray(new MatrixEventEntity[0]);
                Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                matrixEventEntityArr = (MatrixEventEntity[]) array;
            }
            matrixEventEntityArr = null;
        } else if (this.f14698b.get(sourceFileName) instanceof MatrixEventEntity[]) {
            Object obj = this.f14698b.get(sourceFileName);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<com.zykj.blackboard.core.data.dao.MatrixEventEntity?>");
            }
            matrixEventEntityArr = (MatrixEventEntity[]) obj;
        } else {
            C5206a c5206aM13101h2 = C9685d.f17121a.m16165f().m13101h(MatrixRecordEntity.class);
            Intrinsics.checkNotNullExpressionValue(c5206aM13101h2, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder2 = c5206aM13101h2.m2257n();
            Intrinsics.checkNotNullExpressionValue(builder2, "builder");
            builder2.m13160g(MatrixRecordEntity_.f8775f, sourceFileName);
            Query queryM13158a2 = builder2.m13158a();
            Intrinsics.checkNotNullExpressionValue(queryM13158a2, "builder.build()");
            List listM13150n2 = queryM13158a2.m13150n();
            Intrinsics.checkNotNullExpressionValue(listM13150n2, "BoardBox.boxStore.boxFor…                 }.find()");
            MatrixRecordEntity matrixRecordEntity2 = (MatrixRecordEntity) CollectionsKt.firstOrNull(listM13150n2);
            if (matrixRecordEntity2 != null && (toManyM7584c2 = matrixRecordEntity2.m7584c()) != null) {
                array = toManyM7584c2.toArray(new MatrixEventEntity[0]);
                Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                matrixEventEntityArr = (MatrixEventEntity[]) array;
            }
            matrixEventEntityArr = null;
        }
        if (matrixEventEntityArr != null) {
            this.f14698b.put(sourceFileName, matrixEventEntityArr);
            if (i9 < matrixEventEntityArr.length) {
                return C8888b.f14696a.m13822d(matrixEventEntityArr[i9]);
            }
        }
        return null;
    }

    @Override // p169l5.InterfaceC8891e
    /* renamed from: c */
    public EzySource.TextSource.TextInfo mo13813c(String sourceFileName, int i9) {
        ToMany toManyM7675c;
        Object[] array;
        TextInfoEntity[] textInfoEntityArr;
        ToMany toManyM7675c2;
        Intrinsics.checkNotNullParameter(sourceFileName, "sourceFileName");
        if (!this.f14699c) {
            C5206a c5206aM13101h = C9685d.f17121a.m16165f().m13101h(TextRecordEntity.class);
            Intrinsics.checkNotNullExpressionValue(c5206aM13101h, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder = c5206aM13101h.m2257n();
            Intrinsics.checkNotNullExpressionValue(builder, "builder");
            builder.m13160g(TextRecordEntity_.f8882f, sourceFileName);
            Query queryM13158a = builder.m13158a();
            Intrinsics.checkNotNullExpressionValue(queryM13158a, "builder.build()");
            List listM13150n = queryM13158a.m13150n();
            Intrinsics.checkNotNullExpressionValue(listM13150n, "BoardBox.boxStore.boxFor…                 }.find()");
            TextRecordEntity textRecordEntity = (TextRecordEntity) CollectionsKt.firstOrNull(listM13150n);
            if (textRecordEntity != null && (toManyM7675c = textRecordEntity.m7675c()) != null) {
                array = toManyM7675c.toArray(new TextInfoEntity[0]);
                Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                textInfoEntityArr = (TextInfoEntity[]) array;
            }
            textInfoEntityArr = null;
        } else if (this.f14698b.get(sourceFileName) instanceof TextInfoEntity[]) {
            Object obj = this.f14698b.get(sourceFileName);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<com.zykj.blackboard.core.data.dao.TextInfoEntity?>");
            }
            textInfoEntityArr = (TextInfoEntity[]) obj;
        } else {
            C5206a c5206aM13101h2 = C9685d.f17121a.m16165f().m13101h(TextRecordEntity.class);
            Intrinsics.checkNotNullExpressionValue(c5206aM13101h2, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder2 = c5206aM13101h2.m2257n();
            Intrinsics.checkNotNullExpressionValue(builder2, "builder");
            builder2.m13160g(TextRecordEntity_.f8882f, sourceFileName);
            Query queryM13158a2 = builder2.m13158a();
            Intrinsics.checkNotNullExpressionValue(queryM13158a2, "builder.build()");
            List listM13150n2 = queryM13158a2.m13150n();
            Intrinsics.checkNotNullExpressionValue(listM13150n2, "BoardBox.boxStore.boxFor…                 }.find()");
            TextRecordEntity textRecordEntity2 = (TextRecordEntity) CollectionsKt.firstOrNull(listM13150n2);
            if (textRecordEntity2 != null && (toManyM7675c2 = textRecordEntity2.m7675c()) != null) {
                array = toManyM7675c2.toArray(new TextInfoEntity[0]);
                Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                textInfoEntityArr = (TextInfoEntity[]) array;
            }
            textInfoEntityArr = null;
        }
        if (textInfoEntityArr != null) {
            this.f14698b.put(sourceFileName, textInfoEntityArr);
            if (i9 < textInfoEntityArr.length) {
                return C8888b.f14696a.m13823e(textInfoEntityArr[i9]);
            }
        }
        return null;
    }

    @Override // p169l5.InterfaceC8891e
    /* renamed from: d */
    public EzySource.GeometrySource.GeometryInfo mo13814d(String sourceFileName, int i9) {
        ToMany toManyM7505b;
        Object[] array;
        GeometryInfoEntity[] geometryInfoEntityArr;
        ToMany toManyM7505b2;
        Intrinsics.checkNotNullParameter(sourceFileName, "sourceFileName");
        if (!this.f14699c) {
            C5206a c5206aM13101h = C9685d.f17121a.m16165f().m13101h(GeometryRecordEntity.class);
            Intrinsics.checkNotNullExpressionValue(c5206aM13101h, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder = c5206aM13101h.m2257n();
            Intrinsics.checkNotNullExpressionValue(builder, "builder");
            builder.m13160g(GeometryRecordEntity_.f8670f, sourceFileName);
            Query queryM13158a = builder.m13158a();
            Intrinsics.checkNotNullExpressionValue(queryM13158a, "builder.build()");
            List listM13150n = queryM13158a.m13150n();
            Intrinsics.checkNotNullExpressionValue(listM13150n, "BoardBox.boxStore.boxFor…                 }.find()");
            GeometryRecordEntity geometryRecordEntity = (GeometryRecordEntity) CollectionsKt.firstOrNull(listM13150n);
            if (geometryRecordEntity != null && (toManyM7505b = geometryRecordEntity.m7505b()) != null) {
                array = toManyM7505b.toArray(new GeometryInfoEntity[0]);
                Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                geometryInfoEntityArr = (GeometryInfoEntity[]) array;
            }
            geometryInfoEntityArr = null;
        } else if (this.f14698b.get(sourceFileName) instanceof GeometryInfoEntity[]) {
            Object obj = this.f14698b.get(sourceFileName);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<com.zykj.blackboard.core.data.dao.GeometryInfoEntity?>");
            }
            geometryInfoEntityArr = (GeometryInfoEntity[]) obj;
        } else {
            C5206a c5206aM13101h2 = C9685d.f17121a.m16165f().m13101h(GeometryRecordEntity.class);
            Intrinsics.checkNotNullExpressionValue(c5206aM13101h2, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder2 = c5206aM13101h2.m2257n();
            Intrinsics.checkNotNullExpressionValue(builder2, "builder");
            builder2.m13160g(GeometryRecordEntity_.f8670f, sourceFileName);
            Query queryM13158a2 = builder2.m13158a();
            Intrinsics.checkNotNullExpressionValue(queryM13158a2, "builder.build()");
            List listM13150n2 = queryM13158a2.m13150n();
            Intrinsics.checkNotNullExpressionValue(listM13150n2, "BoardBox.boxStore.boxFor…                 }.find()");
            GeometryRecordEntity geometryRecordEntity2 = (GeometryRecordEntity) CollectionsKt.firstOrNull(listM13150n2);
            if (geometryRecordEntity2 != null && (toManyM7505b2 = geometryRecordEntity2.m7505b()) != null) {
                array = toManyM7505b2.toArray(new GeometryInfoEntity[0]);
                Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                geometryInfoEntityArr = (GeometryInfoEntity[]) array;
            }
            geometryInfoEntityArr = null;
        }
        if (geometryInfoEntityArr != null) {
            this.f14698b.put(sourceFileName, geometryInfoEntityArr);
            if (i9 < geometryInfoEntityArr.length) {
                return C8888b.f14696a.m13821c(geometryInfoEntityArr[i9]);
            }
        }
        return null;
    }

    @Override // p169l5.InterfaceC8891e
    /* renamed from: e */
    public EzySource.FileSource.FileInfo mo13815e(String sourceFileName, int i9) {
        ToMany toManyM7464a;
        Object[] array;
        FileInfoEntity[] fileInfoEntityArr;
        ToMany toManyM7464a2;
        Intrinsics.checkNotNullParameter(sourceFileName, "sourceFileName");
        if (!this.f14699c) {
            C5206a c5206aM13101h = C9685d.f17121a.m16165f().m13101h(FileRecordEntity.class);
            Intrinsics.checkNotNullExpressionValue(c5206aM13101h, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder = c5206aM13101h.m2257n();
            Intrinsics.checkNotNullExpressionValue(builder, "builder");
            builder.m13160g(FileRecordEntity_.f8612f, sourceFileName);
            Query queryM13158a = builder.m13158a();
            Intrinsics.checkNotNullExpressionValue(queryM13158a, "builder.build()");
            List listM13150n = queryM13158a.m13150n();
            Intrinsics.checkNotNullExpressionValue(listM13150n, "BoardBox.boxStore.boxFor…                 }.find()");
            FileRecordEntity fileRecordEntity = (FileRecordEntity) CollectionsKt.firstOrNull(listM13150n);
            if (fileRecordEntity != null && (toManyM7464a = fileRecordEntity.m7464a()) != null) {
                array = toManyM7464a.toArray(new FileInfoEntity[0]);
                Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                fileInfoEntityArr = (FileInfoEntity[]) array;
            }
            fileInfoEntityArr = null;
        } else if (this.f14698b.get(sourceFileName) instanceof FileInfoEntity[]) {
            Object obj = this.f14698b.get(sourceFileName);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<com.zykj.blackboard.core.data.dao.FileInfoEntity?>");
            }
            fileInfoEntityArr = (FileInfoEntity[]) obj;
        } else {
            C5206a c5206aM13101h2 = C9685d.f17121a.m16165f().m13101h(FileRecordEntity.class);
            Intrinsics.checkNotNullExpressionValue(c5206aM13101h2, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder2 = c5206aM13101h2.m2257n();
            Intrinsics.checkNotNullExpressionValue(builder2, "builder");
            builder2.m13160g(FileRecordEntity_.f8612f, sourceFileName);
            Query queryM13158a2 = builder2.m13158a();
            Intrinsics.checkNotNullExpressionValue(queryM13158a2, "builder.build()");
            List listM13150n2 = queryM13158a2.m13150n();
            Intrinsics.checkNotNullExpressionValue(listM13150n2, "BoardBox.boxStore.boxFor…                 }.find()");
            FileRecordEntity fileRecordEntity2 = (FileRecordEntity) CollectionsKt.firstOrNull(listM13150n2);
            if (fileRecordEntity2 != null && (toManyM7464a2 = fileRecordEntity2.m7464a()) != null) {
                array = toManyM7464a2.toArray(new FileInfoEntity[0]);
                Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                fileInfoEntityArr = (FileInfoEntity[]) array;
            }
            fileInfoEntityArr = null;
        }
        if (fileInfoEntityArr != null) {
            this.f14698b.put(sourceFileName, fileInfoEntityArr);
            if (i9 < fileInfoEntityArr.length) {
                return C8888b.f14696a.m13820b(fileInfoEntityArr[i9]);
            }
        }
        return null;
    }

    /* renamed from: f */
    public final void m13825f() {
        this.f14698b.clear();
    }

    /* renamed from: g */
    public void m13826g(String pageRootPath) {
        Intrinsics.checkNotNullParameter(pageRootPath, "pageRootPath");
        this.f14697a = pageRootPath;
    }

    /* renamed from: h */
    public final void m13827h(boolean z9) {
        this.f14699c = z9;
    }

    @Override // p169l5.InterfaceC8891e
    public String path() {
        return this.f14697a;
    }
}
