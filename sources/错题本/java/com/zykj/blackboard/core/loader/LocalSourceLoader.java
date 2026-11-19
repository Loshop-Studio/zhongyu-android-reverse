package com.zykj.blackboard.core.loader;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import androidx.constraintlayout.widget.ConstraintLayout;
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
import com.zykj.board.EzySource$FileSource;
import com.zykj.board.EzySource$GeometrySource;
import com.zykj.board.EzySource$MatrixSource;
import com.zykj.board.EzySource$TextSource;
import com.zykj.board.EzySource$TouchSource;
import io.objectbox.query.QueryBuilder;
import io.objectbox.relation.ToMany;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JJ\u0010\u000b\u001a\u00020\t\"\u0006\b\u0000\u0010\u0004\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0007H\u0082\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010\u0003J\u0017\u0010\"\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\t¢\u0006\u0004\b$\u0010\u0003R\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010%R4\u0010)\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010'0&j\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010'`(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\"\u0010,\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.\"\u0004\b/\u00100¨\u00061"}, m5110d2 = {"Lcom/zykj/blackboard/core/loader/LocalSourceLoader;", "Lcom/zykj/blackboard/core/loader/SourceLoader;", "<init>", "()V", ExifInterface.GPS_DIRECTION_TRUE, "", "sourceFileName", "Lkotlin/Function1;", "callForGet", "Ld6/s;", "callForHandle", "handleRecordEntity", "(Ljava/lang/String;Lr6/c;Lr6/c;)V", "", "sourceId", "Lcom/zykj/board/EzySource$TouchSource$TouchInfo;", "getTouchCache", "(Ljava/lang/String;I)Lcom/zykj/board/EzySource$TouchSource$TouchInfo;", "Lcom/zykj/board/EzySource$FileSource$FileInfo;", "getFileCache", "(Ljava/lang/String;I)Lcom/zykj/board/EzySource$FileSource$FileInfo;", "Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;", "getMatrixCache", "(Ljava/lang/String;I)Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;", "Lcom/zykj/board/EzySource$TextSource$TextInfo;", "getTextCache", "(Ljava/lang/String;I)Lcom/zykj/board/EzySource$TextSource$TextInfo;", "Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;", "getGeometryCache", "(Ljava/lang/String;I)Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;", "path", "()Ljava/lang/String;", "release", "pageRootPath", "initPath", "(Ljava/lang/String;)V", "cleanCache", "Ljava/lang/String;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "cacheHashMap", "Ljava/util/HashMap;", "", "isCacheAble", "Z", "()Z", "setCacheAble", "(Z)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class LocalSourceLoader implements SourceLoader {
    private boolean isCacheAble;

    @NotNull
    private String pageRootPath = "";

    @NotNull
    private final HashMap<String, Object> cacheHashMap = new HashMap<>();

    private final <T> void handleRecordEntity(String sourceFileName, InterfaceC6471c callForGet, InterfaceC6471c callForHandle) {
        if (this.isCacheAble) {
            this.cacheHashMap.get(sourceFileName);
            AbstractC5830k.m5338o();
            throw null;
        }
        Object objInvoke = callForGet.invoke(sourceFileName);
        if (objInvoke != null) {
            this.cacheHashMap.put(sourceFileName, objInvoke);
            callForHandle.invoke(objInvoke);
        }
    }

    public final void cleanCache() {
        this.cacheHashMap.clear();
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    @Nullable
    public EzySource$FileSource.FileInfo getFileCache(@NotNull String sourceFileName, int sourceId) {
        ToMany<FileInfoEntity> fileInfoEntity;
        Object[] array;
        FileInfoEntity[] fileInfoEntityArr;
        ToMany<FileInfoEntity> fileInfoEntity2;
        AbstractC5830k.m5330g(sourceFileName, "sourceFileName");
        if (!this.isCacheAble) {
            QueryBuilder queryBuilderM5036g = BoardBox.INSTANCE.getBoxStore().m5018c(FileRecordEntity.class).m5036g();
            queryBuilderM5036g.m5064b(FileRecordEntity_.fileName, sourceFileName);
            List listM5061b = queryBuilderM5036g.m5063a().m5061b();
            AbstractC5830k.m5329f(listM5061b, "BoardBox.boxStore.boxFor…                 }.find()");
            FileRecordEntity fileRecordEntity = (FileRecordEntity) AbstractC5805t.m5229i0(listM5061b);
            if (fileRecordEntity != null && (fileInfoEntity = fileRecordEntity.getFileInfoEntity()) != null) {
                array = fileInfoEntity.toArray(new FileInfoEntity[0]);
                AbstractC5830k.m5328e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
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
            QueryBuilder queryBuilderM5036g2 = BoardBox.INSTANCE.getBoxStore().m5018c(FileRecordEntity.class).m5036g();
            queryBuilderM5036g2.m5064b(FileRecordEntity_.fileName, sourceFileName);
            List listM5061b2 = queryBuilderM5036g2.m5063a().m5061b();
            AbstractC5830k.m5329f(listM5061b2, "BoardBox.boxStore.boxFor…                 }.find()");
            FileRecordEntity fileRecordEntity2 = (FileRecordEntity) AbstractC5805t.m5229i0(listM5061b2);
            if (fileRecordEntity2 != null && (fileInfoEntity2 = fileRecordEntity2.getFileInfoEntity()) != null) {
                array = fileInfoEntity2.toArray(new FileInfoEntity[0]);
                AbstractC5830k.m5328e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                fileInfoEntityArr = (FileInfoEntity[]) array;
            }
            fileInfoEntityArr = null;
        }
        if (fileInfoEntityArr != null) {
            this.cacheHashMap.put(sourceFileName, fileInfoEntityArr);
            if (sourceId < fileInfoEntityArr.length) {
                return EntityConvertEzy.INSTANCE.fileInfoConvertEzyFileInfo(fileInfoEntityArr[sourceId]);
            }
        }
        return null;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    @Nullable
    public EzySource$GeometrySource.GeometryInfo getGeometryCache(@NotNull String sourceFileName, int sourceId) {
        ToMany<GeometryInfoEntity> geometryInfoEntityList;
        Object[] array;
        GeometryInfoEntity[] geometryInfoEntityArr;
        ToMany<GeometryInfoEntity> geometryInfoEntityList2;
        AbstractC5830k.m5330g(sourceFileName, "sourceFileName");
        if (!this.isCacheAble) {
            QueryBuilder queryBuilderM5036g = BoardBox.INSTANCE.getBoxStore().m5018c(GeometryRecordEntity.class).m5036g();
            queryBuilderM5036g.m5064b(GeometryRecordEntity_.fileName, sourceFileName);
            List listM5061b = queryBuilderM5036g.m5063a().m5061b();
            AbstractC5830k.m5329f(listM5061b, "BoardBox.boxStore.boxFor…                 }.find()");
            GeometryRecordEntity geometryRecordEntity = (GeometryRecordEntity) AbstractC5805t.m5229i0(listM5061b);
            if (geometryRecordEntity != null && (geometryInfoEntityList = geometryRecordEntity.getGeometryInfoEntityList()) != null) {
                array = geometryInfoEntityList.toArray(new GeometryInfoEntity[0]);
                AbstractC5830k.m5328e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
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
            QueryBuilder queryBuilderM5036g2 = BoardBox.INSTANCE.getBoxStore().m5018c(GeometryRecordEntity.class).m5036g();
            queryBuilderM5036g2.m5064b(GeometryRecordEntity_.fileName, sourceFileName);
            List listM5061b2 = queryBuilderM5036g2.m5063a().m5061b();
            AbstractC5830k.m5329f(listM5061b2, "BoardBox.boxStore.boxFor…                 }.find()");
            GeometryRecordEntity geometryRecordEntity2 = (GeometryRecordEntity) AbstractC5805t.m5229i0(listM5061b2);
            if (geometryRecordEntity2 != null && (geometryInfoEntityList2 = geometryRecordEntity2.getGeometryInfoEntityList()) != null) {
                array = geometryInfoEntityList2.toArray(new GeometryInfoEntity[0]);
                AbstractC5830k.m5328e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                geometryInfoEntityArr = (GeometryInfoEntity[]) array;
            }
            geometryInfoEntityArr = null;
        }
        if (geometryInfoEntityArr != null) {
            this.cacheHashMap.put(sourceFileName, geometryInfoEntityArr);
            if (sourceId < geometryInfoEntityArr.length) {
                return EntityConvertEzy.INSTANCE.geometryInfoConvertEzyGeometryInfo(geometryInfoEntityArr[sourceId]);
            }
        }
        return null;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    @Nullable
    public EzySource$MatrixSource.MatrixInfo getMatrixCache(@NotNull String sourceFileName, int sourceId) {
        ToMany<MatrixEventEntity> matrixEventEntity;
        Object[] array;
        MatrixEventEntity[] matrixEventEntityArr;
        ToMany<MatrixEventEntity> matrixEventEntity2;
        AbstractC5830k.m5330g(sourceFileName, "sourceFileName");
        if (!this.isCacheAble) {
            QueryBuilder queryBuilderM5036g = BoardBox.INSTANCE.getBoxStore().m5018c(MatrixRecordEntity.class).m5036g();
            queryBuilderM5036g.m5064b(MatrixRecordEntity_.fileName, sourceFileName);
            List listM5061b = queryBuilderM5036g.m5063a().m5061b();
            AbstractC5830k.m5329f(listM5061b, "BoardBox.boxStore.boxFor…                 }.find()");
            MatrixRecordEntity matrixRecordEntity = (MatrixRecordEntity) AbstractC5805t.m5229i0(listM5061b);
            if (matrixRecordEntity != null && (matrixEventEntity = matrixRecordEntity.getMatrixEventEntity()) != null) {
                array = matrixEventEntity.toArray(new MatrixEventEntity[0]);
                AbstractC5830k.m5328e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
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
            QueryBuilder queryBuilderM5036g2 = BoardBox.INSTANCE.getBoxStore().m5018c(MatrixRecordEntity.class).m5036g();
            queryBuilderM5036g2.m5064b(MatrixRecordEntity_.fileName, sourceFileName);
            List listM5061b2 = queryBuilderM5036g2.m5063a().m5061b();
            AbstractC5830k.m5329f(listM5061b2, "BoardBox.boxStore.boxFor…                 }.find()");
            MatrixRecordEntity matrixRecordEntity2 = (MatrixRecordEntity) AbstractC5805t.m5229i0(listM5061b2);
            if (matrixRecordEntity2 != null && (matrixEventEntity2 = matrixRecordEntity2.getMatrixEventEntity()) != null) {
                array = matrixEventEntity2.toArray(new MatrixEventEntity[0]);
                AbstractC5830k.m5328e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                matrixEventEntityArr = (MatrixEventEntity[]) array;
            }
            matrixEventEntityArr = null;
        }
        if (matrixEventEntityArr != null) {
            this.cacheHashMap.put(sourceFileName, matrixEventEntityArr);
            if (sourceId < matrixEventEntityArr.length) {
                return EntityConvertEzy.INSTANCE.matrixEventConvertEzyMatrixInfo(matrixEventEntityArr[sourceId]);
            }
        }
        return null;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    @Nullable
    public EzySource$TextSource.TextInfo getTextCache(@NotNull String sourceFileName, int sourceId) {
        ToMany<TextInfoEntity> textInfoEntityList;
        Object[] array;
        TextInfoEntity[] textInfoEntityArr;
        ToMany<TextInfoEntity> textInfoEntityList2;
        AbstractC5830k.m5330g(sourceFileName, "sourceFileName");
        if (!this.isCacheAble) {
            QueryBuilder queryBuilderM5036g = BoardBox.INSTANCE.getBoxStore().m5018c(TextRecordEntity.class).m5036g();
            queryBuilderM5036g.m5064b(TextRecordEntity_.fileName, sourceFileName);
            List listM5061b = queryBuilderM5036g.m5063a().m5061b();
            AbstractC5830k.m5329f(listM5061b, "BoardBox.boxStore.boxFor…                 }.find()");
            TextRecordEntity textRecordEntity = (TextRecordEntity) AbstractC5805t.m5229i0(listM5061b);
            if (textRecordEntity != null && (textInfoEntityList = textRecordEntity.getTextInfoEntityList()) != null) {
                array = textInfoEntityList.toArray(new TextInfoEntity[0]);
                AbstractC5830k.m5328e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
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
            QueryBuilder queryBuilderM5036g2 = BoardBox.INSTANCE.getBoxStore().m5018c(TextRecordEntity.class).m5036g();
            queryBuilderM5036g2.m5064b(TextRecordEntity_.fileName, sourceFileName);
            List listM5061b2 = queryBuilderM5036g2.m5063a().m5061b();
            AbstractC5830k.m5329f(listM5061b2, "BoardBox.boxStore.boxFor…                 }.find()");
            TextRecordEntity textRecordEntity2 = (TextRecordEntity) AbstractC5805t.m5229i0(listM5061b2);
            if (textRecordEntity2 != null && (textInfoEntityList2 = textRecordEntity2.getTextInfoEntityList()) != null) {
                array = textInfoEntityList2.toArray(new TextInfoEntity[0]);
                AbstractC5830k.m5328e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                textInfoEntityArr = (TextInfoEntity[]) array;
            }
            textInfoEntityArr = null;
        }
        if (textInfoEntityArr != null) {
            this.cacheHashMap.put(sourceFileName, textInfoEntityArr);
            if (sourceId < textInfoEntityArr.length) {
                return EntityConvertEzy.INSTANCE.textInfoConvertEzyTextInfo(textInfoEntityArr[sourceId]);
            }
        }
        return null;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    @Nullable
    public EzySource$TouchSource.TouchInfo getTouchCache(@NotNull String sourceFileName, int sourceId) {
        ToMany<TouchEventEntity> touchEventList;
        Object[] array;
        TouchEventEntity[] touchEventEntityArr;
        ToMany<TouchEventEntity> touchEventList2;
        AbstractC5830k.m5330g(sourceFileName, "sourceFileName");
        if (!this.isCacheAble) {
            QueryBuilder queryBuilderM5036g = BoardBox.INSTANCE.getBoxStore().m5018c(TouchRecordEntity.class).m5036g();
            queryBuilderM5036g.m5064b(TouchRecordEntity_.fileName, sourceFileName);
            List listM5061b = queryBuilderM5036g.m5063a().m5061b();
            AbstractC5830k.m5329f(listM5061b, "BoardBox.boxStore.boxFor…                 }.find()");
            TouchRecordEntity touchRecordEntity = (TouchRecordEntity) AbstractC5805t.m5229i0(listM5061b);
            if (touchRecordEntity != null && (touchEventList = touchRecordEntity.getTouchEventList()) != null) {
                array = touchEventList.toArray(new TouchEventEntity[0]);
                AbstractC5830k.m5328e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
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
            QueryBuilder queryBuilderM5036g2 = BoardBox.INSTANCE.getBoxStore().m5018c(TouchRecordEntity.class).m5036g();
            queryBuilderM5036g2.m5064b(TouchRecordEntity_.fileName, sourceFileName);
            List listM5061b2 = queryBuilderM5036g2.m5063a().m5061b();
            AbstractC5830k.m5329f(listM5061b2, "BoardBox.boxStore.boxFor…                 }.find()");
            TouchRecordEntity touchRecordEntity2 = (TouchRecordEntity) AbstractC5805t.m5229i0(listM5061b2);
            if (touchRecordEntity2 != null && (touchEventList2 = touchRecordEntity2.getTouchEventList()) != null) {
                array = touchEventList2.toArray(new TouchEventEntity[0]);
                AbstractC5830k.m5328e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                touchEventEntityArr = (TouchEventEntity[]) array;
            }
            touchEventEntityArr = null;
        }
        if (touchEventEntityArr != null) {
            this.cacheHashMap.put(sourceFileName, touchEventEntityArr);
            if (sourceId < touchEventEntityArr.length) {
                return EntityConvertEzy.INSTANCE.touchInfoConvertEzyTouchInfo(touchEventEntityArr[sourceId]);
            }
        }
        return null;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    public void initPath(@NotNull String pageRootPath) {
        AbstractC5830k.m5330g(pageRootPath, "pageRootPath");
        this.pageRootPath = pageRootPath;
    }

    /* renamed from: isCacheAble, reason: from getter */
    public final boolean getIsCacheAble() {
        return this.isCacheAble;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    @NotNull
    /* renamed from: path, reason: from getter */
    public String getPageRootPath() {
        return this.pageRootPath;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    public void release() {
    }

    public final void setCacheAble(boolean z8) {
        this.isCacheAble = z8;
    }
}
