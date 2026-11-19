package p265v4;

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
import p077e5.C7342c;
import p214q8.C8980a;

/* renamed from: v4.c */
/* loaded from: classes4.dex */
public final class C9667c implements InterfaceC9668d {

    /* renamed from: a */
    public String f16935a = "";

    /* renamed from: b */
    public final HashMap f16936b = new HashMap();

    /* renamed from: c */
    public boolean f16937c;

    @Override // p265v4.InterfaceC9668d
    /* renamed from: a */
    public EzySource.TouchSource.TouchInfo mo16166a(String sourceFileName, int i10) {
        ToMany toManyM6614c;
        Object[] array;
        TouchEventEntity[] touchEventEntityArr;
        ToMany toManyM6614c2;
        Intrinsics.checkNotNullParameter(sourceFileName, "sourceFileName");
        if (!this.f16937c) {
            C8980a c8980aM12981h = C7342c.f11908a.m11744b().m12981h(TouchRecordEntity.class);
            Intrinsics.checkNotNullExpressionValue(c8980aM12981h, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder = c8980aM12981h.m15047n();
            Intrinsics.checkNotNullExpressionValue(builder, "builder");
            builder.m13041g(TouchRecordEntity_.f7662f, sourceFileName);
            Query queryM13039a = builder.m13039a();
            Intrinsics.checkNotNullExpressionValue(queryM13039a, "builder.build()");
            List listM13031n = queryM13039a.m13031n();
            Intrinsics.checkNotNullExpressionValue(listM13031n, "BoardBox.boxStore.boxFor…                 }.find()");
            TouchRecordEntity touchRecordEntity = (TouchRecordEntity) CollectionsKt.firstOrNull(listM13031n);
            if (touchRecordEntity != null && (toManyM6614c = touchRecordEntity.m6614c()) != null) {
                array = toManyM6614c.toArray(new TouchEventEntity[0]);
                Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                touchEventEntityArr = (TouchEventEntity[]) array;
            }
            touchEventEntityArr = null;
        } else if (this.f16936b.get(sourceFileName) instanceof TouchEventEntity[]) {
            Object obj = this.f16936b.get(sourceFileName);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<com.zykj.blackboard.core.data.dao.TouchEventEntity?>");
            }
            touchEventEntityArr = (TouchEventEntity[]) obj;
        } else {
            C8980a c8980aM12981h2 = C7342c.f11908a.m11744b().m12981h(TouchRecordEntity.class);
            Intrinsics.checkNotNullExpressionValue(c8980aM12981h2, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder2 = c8980aM12981h2.m15047n();
            Intrinsics.checkNotNullExpressionValue(builder2, "builder");
            builder2.m13041g(TouchRecordEntity_.f7662f, sourceFileName);
            Query queryM13039a2 = builder2.m13039a();
            Intrinsics.checkNotNullExpressionValue(queryM13039a2, "builder.build()");
            List listM13031n2 = queryM13039a2.m13031n();
            Intrinsics.checkNotNullExpressionValue(listM13031n2, "BoardBox.boxStore.boxFor…                 }.find()");
            TouchRecordEntity touchRecordEntity2 = (TouchRecordEntity) CollectionsKt.firstOrNull(listM13031n2);
            if (touchRecordEntity2 != null && (toManyM6614c2 = touchRecordEntity2.m6614c()) != null) {
                array = toManyM6614c2.toArray(new TouchEventEntity[0]);
                Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                touchEventEntityArr = (TouchEventEntity[]) array;
            }
            touchEventEntityArr = null;
        }
        if (touchEventEntityArr != null) {
            this.f16936b.put(sourceFileName, touchEventEntityArr);
            if (i10 < touchEventEntityArr.length) {
                return C9666b.f16934a.m16178e(touchEventEntityArr[i10]);
            }
        }
        return null;
    }

    @Override // p265v4.InterfaceC9668d
    /* renamed from: b */
    public EzySource.MatrixSource.MatrixInfo mo16167b(String sourceFileName, int i10) {
        ToMany toManyM6483c;
        Object[] array;
        MatrixEventEntity[] matrixEventEntityArr;
        ToMany toManyM6483c2;
        Intrinsics.checkNotNullParameter(sourceFileName, "sourceFileName");
        if (!this.f16937c) {
            C8980a c8980aM12981h = C7342c.f11908a.m11744b().m12981h(MatrixRecordEntity.class);
            Intrinsics.checkNotNullExpressionValue(c8980aM12981h, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder = c8980aM12981h.m15047n();
            Intrinsics.checkNotNullExpressionValue(builder, "builder");
            builder.m13041g(MatrixRecordEntity_.f7493f, sourceFileName);
            Query queryM13039a = builder.m13039a();
            Intrinsics.checkNotNullExpressionValue(queryM13039a, "builder.build()");
            List listM13031n = queryM13039a.m13031n();
            Intrinsics.checkNotNullExpressionValue(listM13031n, "BoardBox.boxStore.boxFor…                 }.find()");
            MatrixRecordEntity matrixRecordEntity = (MatrixRecordEntity) CollectionsKt.firstOrNull(listM13031n);
            if (matrixRecordEntity != null && (toManyM6483c = matrixRecordEntity.m6483c()) != null) {
                array = toManyM6483c.toArray(new MatrixEventEntity[0]);
                Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                matrixEventEntityArr = (MatrixEventEntity[]) array;
            }
            matrixEventEntityArr = null;
        } else if (this.f16936b.get(sourceFileName) instanceof MatrixEventEntity[]) {
            Object obj = this.f16936b.get(sourceFileName);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<com.zykj.blackboard.core.data.dao.MatrixEventEntity?>");
            }
            matrixEventEntityArr = (MatrixEventEntity[]) obj;
        } else {
            C8980a c8980aM12981h2 = C7342c.f11908a.m11744b().m12981h(MatrixRecordEntity.class);
            Intrinsics.checkNotNullExpressionValue(c8980aM12981h2, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder2 = c8980aM12981h2.m15047n();
            Intrinsics.checkNotNullExpressionValue(builder2, "builder");
            builder2.m13041g(MatrixRecordEntity_.f7493f, sourceFileName);
            Query queryM13039a2 = builder2.m13039a();
            Intrinsics.checkNotNullExpressionValue(queryM13039a2, "builder.build()");
            List listM13031n2 = queryM13039a2.m13031n();
            Intrinsics.checkNotNullExpressionValue(listM13031n2, "BoardBox.boxStore.boxFor…                 }.find()");
            MatrixRecordEntity matrixRecordEntity2 = (MatrixRecordEntity) CollectionsKt.firstOrNull(listM13031n2);
            if (matrixRecordEntity2 != null && (toManyM6483c2 = matrixRecordEntity2.m6483c()) != null) {
                array = toManyM6483c2.toArray(new MatrixEventEntity[0]);
                Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                matrixEventEntityArr = (MatrixEventEntity[]) array;
            }
            matrixEventEntityArr = null;
        }
        if (matrixEventEntityArr != null) {
            this.f16936b.put(sourceFileName, matrixEventEntityArr);
            if (i10 < matrixEventEntityArr.length) {
                return C9666b.f16934a.m16176c(matrixEventEntityArr[i10]);
            }
        }
        return null;
    }

    @Override // p265v4.InterfaceC9668d
    /* renamed from: c */
    public EzySource.TextSource.TextInfo mo16168c(String sourceFileName, int i10) {
        ToMany toManyM6573c;
        Object[] array;
        TextInfoEntity[] textInfoEntityArr;
        ToMany toManyM6573c2;
        Intrinsics.checkNotNullParameter(sourceFileName, "sourceFileName");
        if (!this.f16937c) {
            C8980a c8980aM12981h = C7342c.f11908a.m11744b().m12981h(TextRecordEntity.class);
            Intrinsics.checkNotNullExpressionValue(c8980aM12981h, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder = c8980aM12981h.m15047n();
            Intrinsics.checkNotNullExpressionValue(builder, "builder");
            builder.m13041g(TextRecordEntity_.f7600f, sourceFileName);
            Query queryM13039a = builder.m13039a();
            Intrinsics.checkNotNullExpressionValue(queryM13039a, "builder.build()");
            List listM13031n = queryM13039a.m13031n();
            Intrinsics.checkNotNullExpressionValue(listM13031n, "BoardBox.boxStore.boxFor…                 }.find()");
            TextRecordEntity textRecordEntity = (TextRecordEntity) CollectionsKt.firstOrNull(listM13031n);
            if (textRecordEntity != null && (toManyM6573c = textRecordEntity.m6573c()) != null) {
                array = toManyM6573c.toArray(new TextInfoEntity[0]);
                Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                textInfoEntityArr = (TextInfoEntity[]) array;
            }
            textInfoEntityArr = null;
        } else if (this.f16936b.get(sourceFileName) instanceof TextInfoEntity[]) {
            Object obj = this.f16936b.get(sourceFileName);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<com.zykj.blackboard.core.data.dao.TextInfoEntity?>");
            }
            textInfoEntityArr = (TextInfoEntity[]) obj;
        } else {
            C8980a c8980aM12981h2 = C7342c.f11908a.m11744b().m12981h(TextRecordEntity.class);
            Intrinsics.checkNotNullExpressionValue(c8980aM12981h2, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder2 = c8980aM12981h2.m15047n();
            Intrinsics.checkNotNullExpressionValue(builder2, "builder");
            builder2.m13041g(TextRecordEntity_.f7600f, sourceFileName);
            Query queryM13039a2 = builder2.m13039a();
            Intrinsics.checkNotNullExpressionValue(queryM13039a2, "builder.build()");
            List listM13031n2 = queryM13039a2.m13031n();
            Intrinsics.checkNotNullExpressionValue(listM13031n2, "BoardBox.boxStore.boxFor…                 }.find()");
            TextRecordEntity textRecordEntity2 = (TextRecordEntity) CollectionsKt.firstOrNull(listM13031n2);
            if (textRecordEntity2 != null && (toManyM6573c2 = textRecordEntity2.m6573c()) != null) {
                array = toManyM6573c2.toArray(new TextInfoEntity[0]);
                Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                textInfoEntityArr = (TextInfoEntity[]) array;
            }
            textInfoEntityArr = null;
        }
        if (textInfoEntityArr != null) {
            this.f16936b.put(sourceFileName, textInfoEntityArr);
            if (i10 < textInfoEntityArr.length) {
                return C9666b.f16934a.m16177d(textInfoEntityArr[i10]);
            }
        }
        return null;
    }

    @Override // p265v4.InterfaceC9668d
    /* renamed from: d */
    public EzySource.GeometrySource.GeometryInfo mo16169d(String sourceFileName, int i10) {
        ToMany toManyM6406b;
        Object[] array;
        GeometryInfoEntity[] geometryInfoEntityArr;
        ToMany toManyM6406b2;
        Intrinsics.checkNotNullParameter(sourceFileName, "sourceFileName");
        if (!this.f16937c) {
            C8980a c8980aM12981h = C7342c.f11908a.m11744b().m12981h(GeometryRecordEntity.class);
            Intrinsics.checkNotNullExpressionValue(c8980aM12981h, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder = c8980aM12981h.m15047n();
            Intrinsics.checkNotNullExpressionValue(builder, "builder");
            builder.m13041g(GeometryRecordEntity_.f7388f, sourceFileName);
            Query queryM13039a = builder.m13039a();
            Intrinsics.checkNotNullExpressionValue(queryM13039a, "builder.build()");
            List listM13031n = queryM13039a.m13031n();
            Intrinsics.checkNotNullExpressionValue(listM13031n, "BoardBox.boxStore.boxFor…                 }.find()");
            GeometryRecordEntity geometryRecordEntity = (GeometryRecordEntity) CollectionsKt.firstOrNull(listM13031n);
            if (geometryRecordEntity != null && (toManyM6406b = geometryRecordEntity.m6406b()) != null) {
                array = toManyM6406b.toArray(new GeometryInfoEntity[0]);
                Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                geometryInfoEntityArr = (GeometryInfoEntity[]) array;
            }
            geometryInfoEntityArr = null;
        } else if (this.f16936b.get(sourceFileName) instanceof GeometryInfoEntity[]) {
            Object obj = this.f16936b.get(sourceFileName);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<com.zykj.blackboard.core.data.dao.GeometryInfoEntity?>");
            }
            geometryInfoEntityArr = (GeometryInfoEntity[]) obj;
        } else {
            C8980a c8980aM12981h2 = C7342c.f11908a.m11744b().m12981h(GeometryRecordEntity.class);
            Intrinsics.checkNotNullExpressionValue(c8980aM12981h2, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder2 = c8980aM12981h2.m15047n();
            Intrinsics.checkNotNullExpressionValue(builder2, "builder");
            builder2.m13041g(GeometryRecordEntity_.f7388f, sourceFileName);
            Query queryM13039a2 = builder2.m13039a();
            Intrinsics.checkNotNullExpressionValue(queryM13039a2, "builder.build()");
            List listM13031n2 = queryM13039a2.m13031n();
            Intrinsics.checkNotNullExpressionValue(listM13031n2, "BoardBox.boxStore.boxFor…                 }.find()");
            GeometryRecordEntity geometryRecordEntity2 = (GeometryRecordEntity) CollectionsKt.firstOrNull(listM13031n2);
            if (geometryRecordEntity2 != null && (toManyM6406b2 = geometryRecordEntity2.m6406b()) != null) {
                array = toManyM6406b2.toArray(new GeometryInfoEntity[0]);
                Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                geometryInfoEntityArr = (GeometryInfoEntity[]) array;
            }
            geometryInfoEntityArr = null;
        }
        if (geometryInfoEntityArr != null) {
            this.f16936b.put(sourceFileName, geometryInfoEntityArr);
            if (i10 < geometryInfoEntityArr.length) {
                return C9666b.f16934a.m16175b(geometryInfoEntityArr[i10]);
            }
        }
        return null;
    }

    @Override // p265v4.InterfaceC9668d
    /* renamed from: e */
    public EzySource.FileSource.FileInfo mo16170e(String sourceFileName, int i10) {
        ToMany toManyM6366a;
        Object[] array;
        FileInfoEntity[] fileInfoEntityArr;
        ToMany toManyM6366a2;
        Intrinsics.checkNotNullParameter(sourceFileName, "sourceFileName");
        if (!this.f16937c) {
            C8980a c8980aM12981h = C7342c.f11908a.m11744b().m12981h(FileRecordEntity.class);
            Intrinsics.checkNotNullExpressionValue(c8980aM12981h, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder = c8980aM12981h.m15047n();
            Intrinsics.checkNotNullExpressionValue(builder, "builder");
            builder.m13041g(FileRecordEntity_.f7330f, sourceFileName);
            Query queryM13039a = builder.m13039a();
            Intrinsics.checkNotNullExpressionValue(queryM13039a, "builder.build()");
            List listM13031n = queryM13039a.m13031n();
            Intrinsics.checkNotNullExpressionValue(listM13031n, "BoardBox.boxStore.boxFor…                 }.find()");
            FileRecordEntity fileRecordEntity = (FileRecordEntity) CollectionsKt.firstOrNull(listM13031n);
            if (fileRecordEntity != null && (toManyM6366a = fileRecordEntity.m6366a()) != null) {
                array = toManyM6366a.toArray(new FileInfoEntity[0]);
                Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                fileInfoEntityArr = (FileInfoEntity[]) array;
            }
            fileInfoEntityArr = null;
        } else if (this.f16936b.get(sourceFileName) instanceof FileInfoEntity[]) {
            Object obj = this.f16936b.get(sourceFileName);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<com.zykj.blackboard.core.data.dao.FileInfoEntity?>");
            }
            fileInfoEntityArr = (FileInfoEntity[]) obj;
        } else {
            C8980a c8980aM12981h2 = C7342c.f11908a.m11744b().m12981h(FileRecordEntity.class);
            Intrinsics.checkNotNullExpressionValue(c8980aM12981h2, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder2 = c8980aM12981h2.m15047n();
            Intrinsics.checkNotNullExpressionValue(builder2, "builder");
            builder2.m13041g(FileRecordEntity_.f7330f, sourceFileName);
            Query queryM13039a2 = builder2.m13039a();
            Intrinsics.checkNotNullExpressionValue(queryM13039a2, "builder.build()");
            List listM13031n2 = queryM13039a2.m13031n();
            Intrinsics.checkNotNullExpressionValue(listM13031n2, "BoardBox.boxStore.boxFor…                 }.find()");
            FileRecordEntity fileRecordEntity2 = (FileRecordEntity) CollectionsKt.firstOrNull(listM13031n2);
            if (fileRecordEntity2 != null && (toManyM6366a2 = fileRecordEntity2.m6366a()) != null) {
                array = toManyM6366a2.toArray(new FileInfoEntity[0]);
                Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                fileInfoEntityArr = (FileInfoEntity[]) array;
            }
            fileInfoEntityArr = null;
        }
        if (fileInfoEntityArr != null) {
            this.f16936b.put(sourceFileName, fileInfoEntityArr);
            if (i10 < fileInfoEntityArr.length) {
                return C9666b.f16934a.m16174a(fileInfoEntityArr[i10]);
            }
        }
        return null;
    }

    /* renamed from: f */
    public final void m16179f() {
        this.f16936b.clear();
    }

    /* renamed from: g */
    public void m16180g(String pageRootPath) {
        Intrinsics.checkNotNullParameter(pageRootPath, "pageRootPath");
        this.f16935a = pageRootPath;
    }

    /* renamed from: h */
    public final void m16181h(boolean z9) {
        this.f16937c = z9;
    }

    @Override // p265v4.InterfaceC9668d
    public String path() {
        return this.f16935a;
    }
}
