package ga;

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
import kotlin.jvm.internal.AbstractC9979u;
import na.C10341d;
import p210jc.C9710a;
import p325rc.AbstractC10947g0;

/* renamed from: ga.c */
/* loaded from: classes5.dex */
public final class C9283c implements InterfaceC9284d {

    /* renamed from: a */
    public String f21659a = "";

    /* renamed from: b */
    public final HashMap f21660b = new HashMap();

    /* renamed from: c */
    public boolean f21661c;

    @Override // ga.InterfaceC9284d
    /* renamed from: a */
    public EzySource.TouchSource.TouchInfo mo18289a(String sourceFileName, int i10) {
        ToMany toManyM14345c;
        Object[] array;
        TouchEventEntity[] touchEventEntityArr;
        ToMany toManyM14345c2;
        AbstractC9979u.m20294g(sourceFileName, "sourceFileName");
        if (!this.f21661c) {
            C9710a c9710aM18954g = C10341d.f24644a.m21626f().m18954g(TouchRecordEntity.class);
            AbstractC9979u.m20293f(c9710aM18954g, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder = c9710aM18954g.m19229o();
            AbstractC9979u.m20293f(builder, "builder");
            builder.m19013g(TouchRecordEntity_.f18505h, sourceFileName);
            Query queryM19011e = builder.m19011e();
            AbstractC9979u.m20293f(queryM19011e, "builder.build()");
            List listM19003l = queryM19011e.m19003l();
            AbstractC9979u.m20293f(listM19003l, "BoardBox.boxStore.boxFor…                 }.find()");
            TouchRecordEntity touchRecordEntity = (TouchRecordEntity) AbstractC10947g0.m23946o0(listM19003l);
            if (touchRecordEntity != null && (toManyM14345c = touchRecordEntity.m14345c()) != null) {
                array = toManyM14345c.toArray(new TouchEventEntity[0]);
                AbstractC9979u.m20292e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                touchEventEntityArr = (TouchEventEntity[]) array;
            }
            touchEventEntityArr = null;
        } else if (this.f21660b.get(sourceFileName) instanceof TouchEventEntity[]) {
            Object obj = this.f21660b.get(sourceFileName);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<com.zykj.blackboard.core.data.dao.TouchEventEntity?>");
            }
            touchEventEntityArr = (TouchEventEntity[]) obj;
        } else {
            C9710a c9710aM18954g2 = C10341d.f24644a.m21626f().m18954g(TouchRecordEntity.class);
            AbstractC9979u.m20293f(c9710aM18954g2, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder2 = c9710aM18954g2.m19229o();
            AbstractC9979u.m20293f(builder2, "builder");
            builder2.m19013g(TouchRecordEntity_.f18505h, sourceFileName);
            Query queryM19011e2 = builder2.m19011e();
            AbstractC9979u.m20293f(queryM19011e2, "builder.build()");
            List listM19003l2 = queryM19011e2.m19003l();
            AbstractC9979u.m20293f(listM19003l2, "BoardBox.boxStore.boxFor…                 }.find()");
            TouchRecordEntity touchRecordEntity2 = (TouchRecordEntity) AbstractC10947g0.m23946o0(listM19003l2);
            if (touchRecordEntity2 != null && (toManyM14345c2 = touchRecordEntity2.m14345c()) != null) {
                array = toManyM14345c2.toArray(new TouchEventEntity[0]);
                AbstractC9979u.m20292e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                touchEventEntityArr = (TouchEventEntity[]) array;
            }
            touchEventEntityArr = null;
        }
        if (touchEventEntityArr != null) {
            this.f21660b.put(sourceFileName, touchEventEntityArr);
            if (i10 < touchEventEntityArr.length) {
                return C9282b.f21658a.m18301e(touchEventEntityArr[i10]);
            }
        }
        return null;
    }

    @Override // ga.InterfaceC9284d
    /* renamed from: b */
    public EzySource.MatrixSource.MatrixInfo mo18290b(String sourceFileName, int i10) {
        ToMany toManyM14211c;
        Object[] array;
        MatrixEventEntity[] matrixEventEntityArr;
        ToMany toManyM14211c2;
        AbstractC9979u.m20294g(sourceFileName, "sourceFileName");
        if (!this.f21661c) {
            C9710a c9710aM18954g = C10341d.f24644a.m21626f().m18954g(MatrixRecordEntity.class);
            AbstractC9979u.m20293f(c9710aM18954g, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder = c9710aM18954g.m19229o();
            AbstractC9979u.m20293f(builder, "builder");
            builder.m19013g(MatrixRecordEntity_.f18336h, sourceFileName);
            Query queryM19011e = builder.m19011e();
            AbstractC9979u.m20293f(queryM19011e, "builder.build()");
            List listM19003l = queryM19011e.m19003l();
            AbstractC9979u.m20293f(listM19003l, "BoardBox.boxStore.boxFor…                 }.find()");
            MatrixRecordEntity matrixRecordEntity = (MatrixRecordEntity) AbstractC10947g0.m23946o0(listM19003l);
            if (matrixRecordEntity != null && (toManyM14211c = matrixRecordEntity.m14211c()) != null) {
                array = toManyM14211c.toArray(new MatrixEventEntity[0]);
                AbstractC9979u.m20292e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                matrixEventEntityArr = (MatrixEventEntity[]) array;
            }
            matrixEventEntityArr = null;
        } else if (this.f21660b.get(sourceFileName) instanceof MatrixEventEntity[]) {
            Object obj = this.f21660b.get(sourceFileName);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<com.zykj.blackboard.core.data.dao.MatrixEventEntity?>");
            }
            matrixEventEntityArr = (MatrixEventEntity[]) obj;
        } else {
            C9710a c9710aM18954g2 = C10341d.f24644a.m21626f().m18954g(MatrixRecordEntity.class);
            AbstractC9979u.m20293f(c9710aM18954g2, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder2 = c9710aM18954g2.m19229o();
            AbstractC9979u.m20293f(builder2, "builder");
            builder2.m19013g(MatrixRecordEntity_.f18336h, sourceFileName);
            Query queryM19011e2 = builder2.m19011e();
            AbstractC9979u.m20293f(queryM19011e2, "builder.build()");
            List listM19003l2 = queryM19011e2.m19003l();
            AbstractC9979u.m20293f(listM19003l2, "BoardBox.boxStore.boxFor…                 }.find()");
            MatrixRecordEntity matrixRecordEntity2 = (MatrixRecordEntity) AbstractC10947g0.m23946o0(listM19003l2);
            if (matrixRecordEntity2 != null && (toManyM14211c2 = matrixRecordEntity2.m14211c()) != null) {
                array = toManyM14211c2.toArray(new MatrixEventEntity[0]);
                AbstractC9979u.m20292e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                matrixEventEntityArr = (MatrixEventEntity[]) array;
            }
            matrixEventEntityArr = null;
        }
        if (matrixEventEntityArr != null) {
            this.f21660b.put(sourceFileName, matrixEventEntityArr);
            if (i10 < matrixEventEntityArr.length) {
                return C9282b.f21658a.m18299c(matrixEventEntityArr[i10]);
            }
        }
        return null;
    }

    @Override // ga.InterfaceC9284d
    /* renamed from: c */
    public EzySource.TextSource.TextInfo mo18291c(String sourceFileName, int i10) {
        ToMany toManyM14303c;
        Object[] array;
        TextInfoEntity[] textInfoEntityArr;
        ToMany toManyM14303c2;
        AbstractC9979u.m20294g(sourceFileName, "sourceFileName");
        if (!this.f21661c) {
            C9710a c9710aM18954g = C10341d.f24644a.m21626f().m18954g(TextRecordEntity.class);
            AbstractC9979u.m20293f(c9710aM18954g, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder = c9710aM18954g.m19229o();
            AbstractC9979u.m20293f(builder, "builder");
            builder.m19013g(TextRecordEntity_.f18443h, sourceFileName);
            Query queryM19011e = builder.m19011e();
            AbstractC9979u.m20293f(queryM19011e, "builder.build()");
            List listM19003l = queryM19011e.m19003l();
            AbstractC9979u.m20293f(listM19003l, "BoardBox.boxStore.boxFor…                 }.find()");
            TextRecordEntity textRecordEntity = (TextRecordEntity) AbstractC10947g0.m23946o0(listM19003l);
            if (textRecordEntity != null && (toManyM14303c = textRecordEntity.m14303c()) != null) {
                array = toManyM14303c.toArray(new TextInfoEntity[0]);
                AbstractC9979u.m20292e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                textInfoEntityArr = (TextInfoEntity[]) array;
            }
            textInfoEntityArr = null;
        } else if (this.f21660b.get(sourceFileName) instanceof TextInfoEntity[]) {
            Object obj = this.f21660b.get(sourceFileName);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<com.zykj.blackboard.core.data.dao.TextInfoEntity?>");
            }
            textInfoEntityArr = (TextInfoEntity[]) obj;
        } else {
            C9710a c9710aM18954g2 = C10341d.f24644a.m21626f().m18954g(TextRecordEntity.class);
            AbstractC9979u.m20293f(c9710aM18954g2, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder2 = c9710aM18954g2.m19229o();
            AbstractC9979u.m20293f(builder2, "builder");
            builder2.m19013g(TextRecordEntity_.f18443h, sourceFileName);
            Query queryM19011e2 = builder2.m19011e();
            AbstractC9979u.m20293f(queryM19011e2, "builder.build()");
            List listM19003l2 = queryM19011e2.m19003l();
            AbstractC9979u.m20293f(listM19003l2, "BoardBox.boxStore.boxFor…                 }.find()");
            TextRecordEntity textRecordEntity2 = (TextRecordEntity) AbstractC10947g0.m23946o0(listM19003l2);
            if (textRecordEntity2 != null && (toManyM14303c2 = textRecordEntity2.m14303c()) != null) {
                array = toManyM14303c2.toArray(new TextInfoEntity[0]);
                AbstractC9979u.m20292e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                textInfoEntityArr = (TextInfoEntity[]) array;
            }
            textInfoEntityArr = null;
        }
        if (textInfoEntityArr != null) {
            this.f21660b.put(sourceFileName, textInfoEntityArr);
            if (i10 < textInfoEntityArr.length) {
                return C9282b.f21658a.m18300d(textInfoEntityArr[i10]);
            }
        }
        return null;
    }

    @Override // ga.InterfaceC9284d
    /* renamed from: d */
    public EzySource.GeometrySource.GeometryInfo mo18292d(String sourceFileName, int i10) {
        ToMany toManyM14132b;
        Object[] array;
        GeometryInfoEntity[] geometryInfoEntityArr;
        ToMany toManyM14132b2;
        AbstractC9979u.m20294g(sourceFileName, "sourceFileName");
        if (!this.f21661c) {
            C9710a c9710aM18954g = C10341d.f24644a.m21626f().m18954g(GeometryRecordEntity.class);
            AbstractC9979u.m20293f(c9710aM18954g, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder = c9710aM18954g.m19229o();
            AbstractC9979u.m20293f(builder, "builder");
            builder.m19013g(GeometryRecordEntity_.f18231h, sourceFileName);
            Query queryM19011e = builder.m19011e();
            AbstractC9979u.m20293f(queryM19011e, "builder.build()");
            List listM19003l = queryM19011e.m19003l();
            AbstractC9979u.m20293f(listM19003l, "BoardBox.boxStore.boxFor…                 }.find()");
            GeometryRecordEntity geometryRecordEntity = (GeometryRecordEntity) AbstractC10947g0.m23946o0(listM19003l);
            if (geometryRecordEntity != null && (toManyM14132b = geometryRecordEntity.m14132b()) != null) {
                array = toManyM14132b.toArray(new GeometryInfoEntity[0]);
                AbstractC9979u.m20292e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                geometryInfoEntityArr = (GeometryInfoEntity[]) array;
            }
            geometryInfoEntityArr = null;
        } else if (this.f21660b.get(sourceFileName) instanceof GeometryInfoEntity[]) {
            Object obj = this.f21660b.get(sourceFileName);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<com.zykj.blackboard.core.data.dao.GeometryInfoEntity?>");
            }
            geometryInfoEntityArr = (GeometryInfoEntity[]) obj;
        } else {
            C9710a c9710aM18954g2 = C10341d.f24644a.m21626f().m18954g(GeometryRecordEntity.class);
            AbstractC9979u.m20293f(c9710aM18954g2, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder2 = c9710aM18954g2.m19229o();
            AbstractC9979u.m20293f(builder2, "builder");
            builder2.m19013g(GeometryRecordEntity_.f18231h, sourceFileName);
            Query queryM19011e2 = builder2.m19011e();
            AbstractC9979u.m20293f(queryM19011e2, "builder.build()");
            List listM19003l2 = queryM19011e2.m19003l();
            AbstractC9979u.m20293f(listM19003l2, "BoardBox.boxStore.boxFor…                 }.find()");
            GeometryRecordEntity geometryRecordEntity2 = (GeometryRecordEntity) AbstractC10947g0.m23946o0(listM19003l2);
            if (geometryRecordEntity2 != null && (toManyM14132b2 = geometryRecordEntity2.m14132b()) != null) {
                array = toManyM14132b2.toArray(new GeometryInfoEntity[0]);
                AbstractC9979u.m20292e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                geometryInfoEntityArr = (GeometryInfoEntity[]) array;
            }
            geometryInfoEntityArr = null;
        }
        if (geometryInfoEntityArr != null) {
            this.f21660b.put(sourceFileName, geometryInfoEntityArr);
            if (i10 < geometryInfoEntityArr.length) {
                return C9282b.f21658a.m18298b(geometryInfoEntityArr[i10]);
            }
        }
        return null;
    }

    @Override // ga.InterfaceC9284d
    /* renamed from: e */
    public EzySource.FileSource.FileInfo mo18293e(String sourceFileName, int i10) {
        ToMany toManyM14091a;
        Object[] array;
        FileInfoEntity[] fileInfoEntityArr;
        ToMany toManyM14091a2;
        AbstractC9979u.m20294g(sourceFileName, "sourceFileName");
        if (!this.f21661c) {
            C9710a c9710aM18954g = C10341d.f24644a.m21626f().m18954g(FileRecordEntity.class);
            AbstractC9979u.m20293f(c9710aM18954g, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder = c9710aM18954g.m19229o();
            AbstractC9979u.m20293f(builder, "builder");
            builder.m19013g(FileRecordEntity_.f18173h, sourceFileName);
            Query queryM19011e = builder.m19011e();
            AbstractC9979u.m20293f(queryM19011e, "builder.build()");
            List listM19003l = queryM19011e.m19003l();
            AbstractC9979u.m20293f(listM19003l, "BoardBox.boxStore.boxFor…                 }.find()");
            FileRecordEntity fileRecordEntity = (FileRecordEntity) AbstractC10947g0.m23946o0(listM19003l);
            if (fileRecordEntity != null && (toManyM14091a = fileRecordEntity.m14091a()) != null) {
                array = toManyM14091a.toArray(new FileInfoEntity[0]);
                AbstractC9979u.m20292e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                fileInfoEntityArr = (FileInfoEntity[]) array;
            }
            fileInfoEntityArr = null;
        } else if (this.f21660b.get(sourceFileName) instanceof FileInfoEntity[]) {
            Object obj = this.f21660b.get(sourceFileName);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<com.zykj.blackboard.core.data.dao.FileInfoEntity?>");
            }
            fileInfoEntityArr = (FileInfoEntity[]) obj;
        } else {
            C9710a c9710aM18954g2 = C10341d.f24644a.m21626f().m18954g(FileRecordEntity.class);
            AbstractC9979u.m20293f(c9710aM18954g2, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder2 = c9710aM18954g2.m19229o();
            AbstractC9979u.m20293f(builder2, "builder");
            builder2.m19013g(FileRecordEntity_.f18173h, sourceFileName);
            Query queryM19011e2 = builder2.m19011e();
            AbstractC9979u.m20293f(queryM19011e2, "builder.build()");
            List listM19003l2 = queryM19011e2.m19003l();
            AbstractC9979u.m20293f(listM19003l2, "BoardBox.boxStore.boxFor…                 }.find()");
            FileRecordEntity fileRecordEntity2 = (FileRecordEntity) AbstractC10947g0.m23946o0(listM19003l2);
            if (fileRecordEntity2 != null && (toManyM14091a2 = fileRecordEntity2.m14091a()) != null) {
                array = toManyM14091a2.toArray(new FileInfoEntity[0]);
                AbstractC9979u.m20292e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                fileInfoEntityArr = (FileInfoEntity[]) array;
            }
            fileInfoEntityArr = null;
        }
        if (fileInfoEntityArr != null) {
            this.f21660b.put(sourceFileName, fileInfoEntityArr);
            if (i10 < fileInfoEntityArr.length) {
                return C9282b.f21658a.m18297a(fileInfoEntityArr[i10]);
            }
        }
        return null;
    }

    /* renamed from: f */
    public final void m18302f() {
        this.f21660b.clear();
    }

    /* renamed from: g */
    public void m18303g(String pageRootPath) {
        AbstractC9979u.m20294g(pageRootPath, "pageRootPath");
        this.f21659a = pageRootPath;
    }

    /* renamed from: h */
    public final void m18304h(boolean z10) {
        this.f21661c = z10;
    }

    @Override // ga.InterfaceC9284d
    public String path() {
        return this.f21659a;
    }
}
