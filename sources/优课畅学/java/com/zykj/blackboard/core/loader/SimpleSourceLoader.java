package com.zykj.blackboard.core.loader;

import com.zykj.blackboard.core.data.dao.FileInfoEntity;
import com.zykj.blackboard.core.data.dao.FileRecordEntity;
import com.zykj.blackboard.core.data.dao.GeometryInfoEntity;
import com.zykj.blackboard.core.data.dao.GeometryRecordEntity;
import com.zykj.blackboard.core.data.dao.MatrixEventEntity;
import com.zykj.blackboard.core.data.dao.MatrixRecordEntity;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.blackboard.core.data.dao.TextInfoEntity;
import com.zykj.blackboard.core.data.dao.TextRecordEntity;
import com.zykj.blackboard.core.data.dao.TouchEventEntity;
import com.zykj.blackboard.core.data.dao.TouchRecordEntity;
import com.zykj.board.EzySource;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class SimpleSourceLoader implements SourceLoader {
    private String pageRootPath;
    private final RecordEntity recordEntity;

    public SimpleSourceLoader(RecordEntity recordEntity) {
        AbstractC9133u.m16133g(recordEntity, "recordEntity");
        this.recordEntity = recordEntity;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    public EzySource.FileSource.FileInfo getFileCache(String sourceFileName, int i10) {
        FileRecordEntity next;
        AbstractC9133u.m16133g(sourceFileName, "sourceFileName");
        Iterator<FileRecordEntity> it = this.recordEntity.getFileList().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC9133u.m16128b(next.getFileName(), sourceFileName)) {
                break;
            }
        }
        FileRecordEntity fileRecordEntity = next;
        if (fileRecordEntity != null) {
            return EntityConvertEzy.INSTANCE.fileInfoConvertEzyFileInfo((FileInfoEntity) fileRecordEntity.getFileInfoEntity().get(i10));
        }
        return null;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    public EzySource.GeometrySource.GeometryInfo getGeometryCache(String sourceFileName, int i10) {
        GeometryRecordEntity next;
        AbstractC9133u.m16133g(sourceFileName, "sourceFileName");
        Iterator<GeometryRecordEntity> it = this.recordEntity.getGeometryList().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC9133u.m16128b(next.getFileName(), sourceFileName)) {
                break;
            }
        }
        GeometryRecordEntity geometryRecordEntity = next;
        if (geometryRecordEntity != null) {
            return EntityConvertEzy.INSTANCE.geometryInfoConvertEzyGeometryInfo((GeometryInfoEntity) geometryRecordEntity.getGeometryInfoEntityList().get(i10));
        }
        return null;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    public EzySource.MatrixSource.MatrixInfo getMatrixCache(String sourceFileName, int i10) {
        MatrixRecordEntity next;
        AbstractC9133u.m16133g(sourceFileName, "sourceFileName");
        Iterator<MatrixRecordEntity> it = this.recordEntity.getMatrixList().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC9133u.m16128b(next.getFileName(), sourceFileName)) {
                break;
            }
        }
        MatrixRecordEntity matrixRecordEntity = next;
        if (matrixRecordEntity != null) {
            return EntityConvertEzy.INSTANCE.matrixEventConvertEzyMatrixInfo((MatrixEventEntity) matrixRecordEntity.getMatrixEventEntity().get(i10));
        }
        return null;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    public EzySource.TextSource.TextInfo getTextCache(String sourceFileName, int i10) {
        TextRecordEntity next;
        AbstractC9133u.m16133g(sourceFileName, "sourceFileName");
        Iterator<TextRecordEntity> it = this.recordEntity.getTextList().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC9133u.m16128b(next.getFileName(), sourceFileName)) {
                break;
            }
        }
        TextRecordEntity textRecordEntity = next;
        if (textRecordEntity != null) {
            return EntityConvertEzy.INSTANCE.textInfoConvertEzyTextInfo((TextInfoEntity) textRecordEntity.getTextInfoEntityList().get(i10));
        }
        return null;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    public EzySource.TouchSource.TouchInfo getTouchCache(String sourceFileName, int i10) {
        TouchRecordEntity next;
        AbstractC9133u.m16133g(sourceFileName, "sourceFileName");
        Iterator<TouchRecordEntity> it = this.recordEntity.getTouchList().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC9133u.m16128b(next.getFileName(), sourceFileName)) {
                break;
            }
        }
        TouchRecordEntity touchRecordEntity = next;
        if (touchRecordEntity != null) {
            return EntityConvertEzy.INSTANCE.touchInfoConvertEzyTouchInfo((TouchEventEntity) touchRecordEntity.getTouchEventList().get(i10));
        }
        return null;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    public void initPath(String pageRootPath) {
        AbstractC9133u.m16133g(pageRootPath, "pageRootPath");
        this.pageRootPath = pageRootPath;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    public String path() {
        return this.pageRootPath;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    public void release() {
    }
}
