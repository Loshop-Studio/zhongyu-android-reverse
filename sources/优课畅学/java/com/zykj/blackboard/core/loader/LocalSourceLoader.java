package com.zykj.blackboard.core.loader;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import androidx.exifinterface.media.ExifInterface;
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
import com.zykj.blackboard.utils.BoardBox;
import com.zykj.board.EzySource;
import io.objectbox.C8957a;
import io.objectbox.query.Query;
import io.objectbox.query.QueryBuilder;
import io.objectbox.relation.ToMany;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;
import p300x7.InterfaceC10570l;

/* loaded from: classes4.dex */
public final class LocalSourceLoader implements SourceLoader {
    private boolean isCacheAble;
    private String pageRootPath = "";
    private final HashMap<String, Object> cacheHashMap = new HashMap<>();

    private final /* synthetic */ <T> void handleRecordEntity(String str, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
        Object objInvoke;
        if (this.isCacheAble) {
            Object obj = this.cacheHashMap.get(str);
            AbstractC9133u.m16139m(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (obj != null) {
                objInvoke = this.cacheHashMap.get(str);
                AbstractC9133u.m16139m(1, ExifInterface.GPS_DIRECTION_TRUE);
            } else {
                objInvoke = interfaceC10570l.invoke(str);
            }
        } else {
            objInvoke = interfaceC10570l.invoke(str);
        }
        if (objInvoke != null) {
            this.cacheHashMap.put(str, objInvoke);
            interfaceC10570l2.invoke(objInvoke);
        }
    }

    public final void cleanCache() {
        this.cacheHashMap.clear();
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    public EzySource.FileSource.FileInfo getFileCache(String sourceFileName, int i10) {
        ToMany<FileInfoEntity> fileInfoEntity;
        Object[] array;
        FileInfoEntity[] fileInfoEntityArr;
        ToMany<FileInfoEntity> fileInfoEntity2;
        AbstractC9133u.m16133g(sourceFileName, "sourceFileName");
        if (!this.isCacheAble) {
            C8957a c8957aM15370d = BoardBox.INSTANCE.getBoxStore().m15370d(FileRecordEntity.class);
            AbstractC9133u.m16132f(c8957aM15370d, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder = c8957aM15370d.m15416n();
            AbstractC9133u.m16132f(builder, "builder");
            builder.m15488c(FileRecordEntity_.fileName, sourceFileName);
            Query queryM15486a = builder.m15486a();
            AbstractC9133u.m16132f(queryM15486a, "builder.build()");
            List listM15478j = queryM15486a.m15478j();
            AbstractC9133u.m16132f(listM15478j, "BoardBox.boxStore.boxFor…                 }.find()");
            FileRecordEntity fileRecordEntity = (FileRecordEntity) AbstractC8778f0.m14568n0(listM15478j);
            if (fileRecordEntity != null && (fileInfoEntity = fileRecordEntity.getFileInfoEntity()) != null) {
                array = fileInfoEntity.toArray(new FileInfoEntity[0]);
                AbstractC9133u.m16131e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                fileInfoEntityArr = (FileInfoEntity[]) array;
            }
            fileInfoEntityArr = null;
        } else if (this.cacheHashMap.get(sourceFileName) instanceof FileInfoEntity[]) {
            Object obj = this.cacheHashMap.get(sourceFileName);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<com.zykj.blackboard.core.data.dao.FileInfoEntity?>");
            }
            fileInfoEntityArr = (FileInfoEntity[]) obj;
        } else {
            C8957a c8957aM15370d2 = BoardBox.INSTANCE.getBoxStore().m15370d(FileRecordEntity.class);
            AbstractC9133u.m16132f(c8957aM15370d2, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder2 = c8957aM15370d2.m15416n();
            AbstractC9133u.m16132f(builder2, "builder");
            builder2.m15488c(FileRecordEntity_.fileName, sourceFileName);
            Query queryM15486a2 = builder2.m15486a();
            AbstractC9133u.m16132f(queryM15486a2, "builder.build()");
            List listM15478j2 = queryM15486a2.m15478j();
            AbstractC9133u.m16132f(listM15478j2, "BoardBox.boxStore.boxFor…                 }.find()");
            FileRecordEntity fileRecordEntity2 = (FileRecordEntity) AbstractC8778f0.m14568n0(listM15478j2);
            if (fileRecordEntity2 != null && (fileInfoEntity2 = fileRecordEntity2.getFileInfoEntity()) != null) {
                array = fileInfoEntity2.toArray(new FileInfoEntity[0]);
                AbstractC9133u.m16131e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                fileInfoEntityArr = (FileInfoEntity[]) array;
            }
            fileInfoEntityArr = null;
        }
        if (fileInfoEntityArr != null) {
            this.cacheHashMap.put(sourceFileName, fileInfoEntityArr);
            if (i10 < fileInfoEntityArr.length) {
                return EntityConvertEzy.INSTANCE.fileInfoConvertEzyFileInfo(fileInfoEntityArr[i10]);
            }
        }
        return null;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    public EzySource.GeometrySource.GeometryInfo getGeometryCache(String sourceFileName, int i10) {
        ToMany<GeometryInfoEntity> geometryInfoEntityList;
        Object[] array;
        GeometryInfoEntity[] geometryInfoEntityArr;
        ToMany<GeometryInfoEntity> geometryInfoEntityList2;
        AbstractC9133u.m16133g(sourceFileName, "sourceFileName");
        if (!this.isCacheAble) {
            C8957a c8957aM15370d = BoardBox.INSTANCE.getBoxStore().m15370d(GeometryRecordEntity.class);
            AbstractC9133u.m16132f(c8957aM15370d, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder = c8957aM15370d.m15416n();
            AbstractC9133u.m16132f(builder, "builder");
            builder.m15488c(GeometryRecordEntity_.fileName, sourceFileName);
            Query queryM15486a = builder.m15486a();
            AbstractC9133u.m16132f(queryM15486a, "builder.build()");
            List listM15478j = queryM15486a.m15478j();
            AbstractC9133u.m16132f(listM15478j, "BoardBox.boxStore.boxFor…                 }.find()");
            GeometryRecordEntity geometryRecordEntity = (GeometryRecordEntity) AbstractC8778f0.m14568n0(listM15478j);
            if (geometryRecordEntity != null && (geometryInfoEntityList = geometryRecordEntity.getGeometryInfoEntityList()) != null) {
                array = geometryInfoEntityList.toArray(new GeometryInfoEntity[0]);
                AbstractC9133u.m16131e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                geometryInfoEntityArr = (GeometryInfoEntity[]) array;
            }
            geometryInfoEntityArr = null;
        } else if (this.cacheHashMap.get(sourceFileName) instanceof GeometryInfoEntity[]) {
            Object obj = this.cacheHashMap.get(sourceFileName);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<com.zykj.blackboard.core.data.dao.GeometryInfoEntity?>");
            }
            geometryInfoEntityArr = (GeometryInfoEntity[]) obj;
        } else {
            C8957a c8957aM15370d2 = BoardBox.INSTANCE.getBoxStore().m15370d(GeometryRecordEntity.class);
            AbstractC9133u.m16132f(c8957aM15370d2, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder2 = c8957aM15370d2.m15416n();
            AbstractC9133u.m16132f(builder2, "builder");
            builder2.m15488c(GeometryRecordEntity_.fileName, sourceFileName);
            Query queryM15486a2 = builder2.m15486a();
            AbstractC9133u.m16132f(queryM15486a2, "builder.build()");
            List listM15478j2 = queryM15486a2.m15478j();
            AbstractC9133u.m16132f(listM15478j2, "BoardBox.boxStore.boxFor…                 }.find()");
            GeometryRecordEntity geometryRecordEntity2 = (GeometryRecordEntity) AbstractC8778f0.m14568n0(listM15478j2);
            if (geometryRecordEntity2 != null && (geometryInfoEntityList2 = geometryRecordEntity2.getGeometryInfoEntityList()) != null) {
                array = geometryInfoEntityList2.toArray(new GeometryInfoEntity[0]);
                AbstractC9133u.m16131e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                geometryInfoEntityArr = (GeometryInfoEntity[]) array;
            }
            geometryInfoEntityArr = null;
        }
        if (geometryInfoEntityArr != null) {
            this.cacheHashMap.put(sourceFileName, geometryInfoEntityArr);
            if (i10 < geometryInfoEntityArr.length) {
                return EntityConvertEzy.INSTANCE.geometryInfoConvertEzyGeometryInfo(geometryInfoEntityArr[i10]);
            }
        }
        return null;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    public EzySource.MatrixSource.MatrixInfo getMatrixCache(String sourceFileName, int i10) {
        ToMany<MatrixEventEntity> matrixEventEntity;
        Object[] array;
        MatrixEventEntity[] matrixEventEntityArr;
        ToMany<MatrixEventEntity> matrixEventEntity2;
        AbstractC9133u.m16133g(sourceFileName, "sourceFileName");
        if (!this.isCacheAble) {
            C8957a c8957aM15370d = BoardBox.INSTANCE.getBoxStore().m15370d(MatrixRecordEntity.class);
            AbstractC9133u.m16132f(c8957aM15370d, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder = c8957aM15370d.m15416n();
            AbstractC9133u.m16132f(builder, "builder");
            builder.m15488c(MatrixRecordEntity_.fileName, sourceFileName);
            Query queryM15486a = builder.m15486a();
            AbstractC9133u.m16132f(queryM15486a, "builder.build()");
            List listM15478j = queryM15486a.m15478j();
            AbstractC9133u.m16132f(listM15478j, "BoardBox.boxStore.boxFor…                 }.find()");
            MatrixRecordEntity matrixRecordEntity = (MatrixRecordEntity) AbstractC8778f0.m14568n0(listM15478j);
            if (matrixRecordEntity != null && (matrixEventEntity = matrixRecordEntity.getMatrixEventEntity()) != null) {
                array = matrixEventEntity.toArray(new MatrixEventEntity[0]);
                AbstractC9133u.m16131e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                matrixEventEntityArr = (MatrixEventEntity[]) array;
            }
            matrixEventEntityArr = null;
        } else if (this.cacheHashMap.get(sourceFileName) instanceof MatrixEventEntity[]) {
            Object obj = this.cacheHashMap.get(sourceFileName);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<com.zykj.blackboard.core.data.dao.MatrixEventEntity?>");
            }
            matrixEventEntityArr = (MatrixEventEntity[]) obj;
        } else {
            C8957a c8957aM15370d2 = BoardBox.INSTANCE.getBoxStore().m15370d(MatrixRecordEntity.class);
            AbstractC9133u.m16132f(c8957aM15370d2, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder2 = c8957aM15370d2.m15416n();
            AbstractC9133u.m16132f(builder2, "builder");
            builder2.m15488c(MatrixRecordEntity_.fileName, sourceFileName);
            Query queryM15486a2 = builder2.m15486a();
            AbstractC9133u.m16132f(queryM15486a2, "builder.build()");
            List listM15478j2 = queryM15486a2.m15478j();
            AbstractC9133u.m16132f(listM15478j2, "BoardBox.boxStore.boxFor…                 }.find()");
            MatrixRecordEntity matrixRecordEntity2 = (MatrixRecordEntity) AbstractC8778f0.m14568n0(listM15478j2);
            if (matrixRecordEntity2 != null && (matrixEventEntity2 = matrixRecordEntity2.getMatrixEventEntity()) != null) {
                array = matrixEventEntity2.toArray(new MatrixEventEntity[0]);
                AbstractC9133u.m16131e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                matrixEventEntityArr = (MatrixEventEntity[]) array;
            }
            matrixEventEntityArr = null;
        }
        if (matrixEventEntityArr != null) {
            this.cacheHashMap.put(sourceFileName, matrixEventEntityArr);
            if (i10 < matrixEventEntityArr.length) {
                return EntityConvertEzy.INSTANCE.matrixEventConvertEzyMatrixInfo(matrixEventEntityArr[i10]);
            }
        }
        return null;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    public EzySource.TextSource.TextInfo getTextCache(String sourceFileName, int i10) {
        ToMany<TextInfoEntity> textInfoEntityList;
        Object[] array;
        TextInfoEntity[] textInfoEntityArr;
        ToMany<TextInfoEntity> textInfoEntityList2;
        AbstractC9133u.m16133g(sourceFileName, "sourceFileName");
        if (!this.isCacheAble) {
            C8957a c8957aM15370d = BoardBox.INSTANCE.getBoxStore().m15370d(TextRecordEntity.class);
            AbstractC9133u.m16132f(c8957aM15370d, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder = c8957aM15370d.m15416n();
            AbstractC9133u.m16132f(builder, "builder");
            builder.m15488c(TextRecordEntity_.fileName, sourceFileName);
            Query queryM15486a = builder.m15486a();
            AbstractC9133u.m16132f(queryM15486a, "builder.build()");
            List listM15478j = queryM15486a.m15478j();
            AbstractC9133u.m16132f(listM15478j, "BoardBox.boxStore.boxFor…                 }.find()");
            TextRecordEntity textRecordEntity = (TextRecordEntity) AbstractC8778f0.m14568n0(listM15478j);
            if (textRecordEntity != null && (textInfoEntityList = textRecordEntity.getTextInfoEntityList()) != null) {
                array = textInfoEntityList.toArray(new TextInfoEntity[0]);
                AbstractC9133u.m16131e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                textInfoEntityArr = (TextInfoEntity[]) array;
            }
            textInfoEntityArr = null;
        } else if (this.cacheHashMap.get(sourceFileName) instanceof TextInfoEntity[]) {
            Object obj = this.cacheHashMap.get(sourceFileName);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<com.zykj.blackboard.core.data.dao.TextInfoEntity?>");
            }
            textInfoEntityArr = (TextInfoEntity[]) obj;
        } else {
            C8957a c8957aM15370d2 = BoardBox.INSTANCE.getBoxStore().m15370d(TextRecordEntity.class);
            AbstractC9133u.m16132f(c8957aM15370d2, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder2 = c8957aM15370d2.m15416n();
            AbstractC9133u.m16132f(builder2, "builder");
            builder2.m15488c(TextRecordEntity_.fileName, sourceFileName);
            Query queryM15486a2 = builder2.m15486a();
            AbstractC9133u.m16132f(queryM15486a2, "builder.build()");
            List listM15478j2 = queryM15486a2.m15478j();
            AbstractC9133u.m16132f(listM15478j2, "BoardBox.boxStore.boxFor…                 }.find()");
            TextRecordEntity textRecordEntity2 = (TextRecordEntity) AbstractC8778f0.m14568n0(listM15478j2);
            if (textRecordEntity2 != null && (textInfoEntityList2 = textRecordEntity2.getTextInfoEntityList()) != null) {
                array = textInfoEntityList2.toArray(new TextInfoEntity[0]);
                AbstractC9133u.m16131e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                textInfoEntityArr = (TextInfoEntity[]) array;
            }
            textInfoEntityArr = null;
        }
        if (textInfoEntityArr != null) {
            this.cacheHashMap.put(sourceFileName, textInfoEntityArr);
            if (i10 < textInfoEntityArr.length) {
                return EntityConvertEzy.INSTANCE.textInfoConvertEzyTextInfo(textInfoEntityArr[i10]);
            }
        }
        return null;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    public EzySource.TouchSource.TouchInfo getTouchCache(String sourceFileName, int i10) {
        ToMany<TouchEventEntity> touchEventList;
        Object[] array;
        TouchEventEntity[] touchEventEntityArr;
        ToMany<TouchEventEntity> touchEventList2;
        AbstractC9133u.m16133g(sourceFileName, "sourceFileName");
        if (!this.isCacheAble) {
            C8957a c8957aM15370d = BoardBox.INSTANCE.getBoxStore().m15370d(TouchRecordEntity.class);
            AbstractC9133u.m16132f(c8957aM15370d, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder = c8957aM15370d.m15416n();
            AbstractC9133u.m16132f(builder, "builder");
            builder.m15488c(TouchRecordEntity_.fileName, sourceFileName);
            Query queryM15486a = builder.m15486a();
            AbstractC9133u.m16132f(queryM15486a, "builder.build()");
            List listM15478j = queryM15486a.m15478j();
            AbstractC9133u.m16132f(listM15478j, "BoardBox.boxStore.boxFor…                 }.find()");
            TouchRecordEntity touchRecordEntity = (TouchRecordEntity) AbstractC8778f0.m14568n0(listM15478j);
            if (touchRecordEntity != null && (touchEventList = touchRecordEntity.getTouchEventList()) != null) {
                array = touchEventList.toArray(new TouchEventEntity[0]);
                AbstractC9133u.m16131e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                touchEventEntityArr = (TouchEventEntity[]) array;
            }
            touchEventEntityArr = null;
        } else if (this.cacheHashMap.get(sourceFileName) instanceof TouchEventEntity[]) {
            Object obj = this.cacheHashMap.get(sourceFileName);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<com.zykj.blackboard.core.data.dao.TouchEventEntity?>");
            }
            touchEventEntityArr = (TouchEventEntity[]) obj;
        } else {
            C8957a c8957aM15370d2 = BoardBox.INSTANCE.getBoxStore().m15370d(TouchRecordEntity.class);
            AbstractC9133u.m16132f(c8957aM15370d2, "BoardBox.boxStore.boxFor…RecordEntity::class.java)");
            QueryBuilder builder2 = c8957aM15370d2.m15416n();
            AbstractC9133u.m16132f(builder2, "builder");
            builder2.m15488c(TouchRecordEntity_.fileName, sourceFileName);
            Query queryM15486a2 = builder2.m15486a();
            AbstractC9133u.m16132f(queryM15486a2, "builder.build()");
            List listM15478j2 = queryM15486a2.m15478j();
            AbstractC9133u.m16132f(listM15478j2, "BoardBox.boxStore.boxFor…                 }.find()");
            TouchRecordEntity touchRecordEntity2 = (TouchRecordEntity) AbstractC8778f0.m14568n0(listM15478j2);
            if (touchRecordEntity2 != null && (touchEventList2 = touchRecordEntity2.getTouchEventList()) != null) {
                array = touchEventList2.toArray(new TouchEventEntity[0]);
                AbstractC9133u.m16131e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                touchEventEntityArr = (TouchEventEntity[]) array;
            }
            touchEventEntityArr = null;
        }
        if (touchEventEntityArr != null) {
            this.cacheHashMap.put(sourceFileName, touchEventEntityArr);
            if (i10 < touchEventEntityArr.length) {
                return EntityConvertEzy.INSTANCE.touchInfoConvertEzyTouchInfo(touchEventEntityArr[i10]);
            }
        }
        return null;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    public void initPath(String pageRootPath) {
        AbstractC9133u.m16133g(pageRootPath, "pageRootPath");
        this.pageRootPath = pageRootPath;
    }

    public final boolean isCacheAble() {
        return this.isCacheAble;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    public String path() {
        return this.pageRootPath;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    public void release() {
    }

    public final void setCacheAble(boolean z10) {
        this.isCacheAble = z10;
    }
}
