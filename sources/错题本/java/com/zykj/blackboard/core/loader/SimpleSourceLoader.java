package com.zykj.blackboard.core.loader;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.data.dao.FileRecordEntity;
import com.zykj.blackboard.core.data.dao.GeometryRecordEntity;
import com.zykj.blackboard.core.data.dao.MatrixRecordEntity;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.blackboard.core.data.dao.TextRecordEntity;
import com.zykj.blackboard.core.data.dao.TouchRecordEntity;
import com.zykj.board.EzySource$FileSource;
import com.zykj.board.EzySource$GeometrySource;
import com.zykj.board.EzySource$MatrixSource;
import com.zykj.board.EzySource$TextSource;
import com.zykj.board.EzySource$TouchSource;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\"¨\u0006#"}, m5110d2 = {"Lcom/zykj/blackboard/core/loader/SimpleSourceLoader;", "Lcom/zykj/blackboard/core/loader/SourceLoader;", "Lcom/zykj/blackboard/core/data/dao/RecordEntity;", "recordEntity", "<init>", "(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V", "", "sourceFileName", "", "sourceId", "Lcom/zykj/board/EzySource$TouchSource$TouchInfo;", "getTouchCache", "(Ljava/lang/String;I)Lcom/zykj/board/EzySource$TouchSource$TouchInfo;", "Lcom/zykj/board/EzySource$FileSource$FileInfo;", "getFileCache", "(Ljava/lang/String;I)Lcom/zykj/board/EzySource$FileSource$FileInfo;", "Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;", "getMatrixCache", "(Ljava/lang/String;I)Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;", "Lcom/zykj/board/EzySource$TextSource$TextInfo;", "getTextCache", "(Ljava/lang/String;I)Lcom/zykj/board/EzySource$TextSource$TextInfo;", "Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;", "getGeometryCache", "(Ljava/lang/String;I)Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;", "path", "()Ljava/lang/String;", "pageRootPath", "Ld6/s;", "initPath", "(Ljava/lang/String;)V", "release", "()V", "Lcom/zykj/blackboard/core/data/dao/RecordEntity;", "Ljava/lang/String;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class SimpleSourceLoader implements SourceLoader {

    @Nullable
    private String pageRootPath;

    @NotNull
    private final RecordEntity recordEntity;

    public SimpleSourceLoader(@NotNull RecordEntity recordEntity) {
        AbstractC5830k.m5330g(recordEntity, "recordEntity");
        this.recordEntity = recordEntity;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    @Nullable
    public EzySource$FileSource.FileInfo getFileCache(@NotNull String sourceFileName, int sourceId) {
        FileRecordEntity next;
        AbstractC5830k.m5330g(sourceFileName, "sourceFileName");
        Iterator<FileRecordEntity> it = this.recordEntity.getFileList().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC5830k.m5325b(next.getFileName(), sourceFileName)) {
                break;
            }
        }
        FileRecordEntity fileRecordEntity = next;
        if (fileRecordEntity != null) {
            return EntityConvertEzy.INSTANCE.fileInfoConvertEzyFileInfo(fileRecordEntity.getFileInfoEntity().get(sourceId));
        }
        return null;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    @Nullable
    public EzySource$GeometrySource.GeometryInfo getGeometryCache(@NotNull String sourceFileName, int sourceId) {
        GeometryRecordEntity next;
        AbstractC5830k.m5330g(sourceFileName, "sourceFileName");
        Iterator<GeometryRecordEntity> it = this.recordEntity.getGeometryList().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC5830k.m5325b(next.getFileName(), sourceFileName)) {
                break;
            }
        }
        GeometryRecordEntity geometryRecordEntity = next;
        if (geometryRecordEntity != null) {
            return EntityConvertEzy.INSTANCE.geometryInfoConvertEzyGeometryInfo(geometryRecordEntity.getGeometryInfoEntityList().get(sourceId));
        }
        return null;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    @Nullable
    public EzySource$MatrixSource.MatrixInfo getMatrixCache(@NotNull String sourceFileName, int sourceId) {
        MatrixRecordEntity next;
        AbstractC5830k.m5330g(sourceFileName, "sourceFileName");
        Iterator<MatrixRecordEntity> it = this.recordEntity.getMatrixList().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC5830k.m5325b(next.getFileName(), sourceFileName)) {
                break;
            }
        }
        MatrixRecordEntity matrixRecordEntity = next;
        if (matrixRecordEntity != null) {
            return EntityConvertEzy.INSTANCE.matrixEventConvertEzyMatrixInfo(matrixRecordEntity.getMatrixEventEntity().get(sourceId));
        }
        return null;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    @Nullable
    public EzySource$TextSource.TextInfo getTextCache(@NotNull String sourceFileName, int sourceId) {
        TextRecordEntity next;
        AbstractC5830k.m5330g(sourceFileName, "sourceFileName");
        Iterator<TextRecordEntity> it = this.recordEntity.getTextList().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC5830k.m5325b(next.getFileName(), sourceFileName)) {
                break;
            }
        }
        TextRecordEntity textRecordEntity = next;
        if (textRecordEntity != null) {
            return EntityConvertEzy.INSTANCE.textInfoConvertEzyTextInfo(textRecordEntity.getTextInfoEntityList().get(sourceId));
        }
        return null;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    @Nullable
    public EzySource$TouchSource.TouchInfo getTouchCache(@NotNull String sourceFileName, int sourceId) {
        TouchRecordEntity next;
        AbstractC5830k.m5330g(sourceFileName, "sourceFileName");
        Iterator<TouchRecordEntity> it = this.recordEntity.getTouchList().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC5830k.m5325b(next.getFileName(), sourceFileName)) {
                break;
            }
        }
        TouchRecordEntity touchRecordEntity = next;
        if (touchRecordEntity != null) {
            return EntityConvertEzy.INSTANCE.touchInfoConvertEzyTouchInfo(touchRecordEntity.getTouchEventList().get(sourceId));
        }
        return null;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    public void initPath(@NotNull String pageRootPath) {
        AbstractC5830k.m5330g(pageRootPath, "pageRootPath");
        this.pageRootPath = pageRootPath;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    @Nullable
    /* renamed from: path, reason: from getter */
    public String getPageRootPath() {
        return this.pageRootPath;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    public void release() {
    }
}
