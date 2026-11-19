package com.zykj.blackboard.core.record.dataRecorder;

import com.zykj.blackboard.bean.CommonSourceResult;
import com.zykj.blackboard.core.data.dao.MatrixEventEntity;
import com.zykj.blackboard.core.data.dao.MatrixInfoEntity;
import com.zykj.blackboard.core.data.dao.MatrixRecordEntity;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.blackboard.core.record.DataRecorder;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzySource;
import io.objectbox.relation.ToMany;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;

/* loaded from: classes4.dex */
public final class MatrixSourceRecord extends DataRecorder {
    public static final Companion Companion = new Companion(null);
    public static final String SOURCE_FILE_NAME_SUFFIX = "_matrix.bin";
    private MatrixRecordEntity matrixRecordEntity;
    private RecordEntity recordEntity;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final EzySource.MatrixSource.MatrixInfo getMatrixInfo(String pageRootPath, String sourceFileName, int i10) {
            AbstractC9133u.m16133g(pageRootPath, "pageRootPath");
            AbstractC9133u.m16133g(sourceFileName, "sourceFileName");
            Object obj = getMatrixSource(pageRootPath, sourceFileName).m8866g().get(i10);
            AbstractC9133u.m16132f(obj, "this.matrixInfoList[sourceId]");
            return (EzySource.MatrixSource.MatrixInfo) obj;
        }

        public final EzySource.MatrixSource getMatrixSource(String pageRootPath, String fileName) throws IOException {
            AbstractC9133u.m16133g(pageRootPath, "pageRootPath");
            AbstractC9133u.m16133g(fileName, "fileName");
            File file = new File(pageRootPath, fileName);
            if (!file.exists()) {
                throw new FileNotFoundException(file.getPath());
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            EzySource.MatrixSource record = EzySource.MatrixSource.m8863k(fileInputStream);
            fileInputStream.close();
            AbstractC9133u.m16132f(record, "record");
            return record;
        }

        private Companion() {
        }
    }

    public MatrixSourceRecord() {
        super(null);
    }

    private final MatrixRecordEntity buildRecordEntity() {
        RecordEntity recordEntity = this.recordEntity;
        if (recordEntity == null) {
            return null;
        }
        MatrixRecordEntity matrixRecordEntity = new MatrixRecordEntity(0L, UUID.randomUUID() + SOURCE_FILE_NAME_SUFFIX, "");
        recordEntity.getMatrixList().add(matrixRecordEntity);
        recordEntity.put();
        return matrixRecordEntity;
    }

    private final synchronized void checkLength() {
        try {
            MatrixRecordEntity matrixRecordEntity = this.matrixRecordEntity;
            if (matrixRecordEntity == null) {
                this.matrixRecordEntity = buildRecordEntity();
            } else {
                AbstractC9133u.m16130d(matrixRecordEntity);
                if (matrixRecordEntity.getMatrixEventEntity().size() >= 100) {
                    this.matrixRecordEntity = buildRecordEntity();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final MatrixRecordEntity initRecordEntity() {
        ToMany<MatrixRecordEntity> matrixList;
        MatrixRecordEntity matrixRecordEntity;
        RecordEntity recordEntity = this.recordEntity;
        return (recordEntity == null || (matrixList = recordEntity.getMatrixList()) == null || (matrixRecordEntity = (MatrixRecordEntity) AbstractC8778f0.m14579y0(matrixList)) == null || matrixRecordEntity.getMatrixEventEntity().size() >= 100) ? buildRecordEntity() : matrixRecordEntity;
    }

    public final CommonSourceResult add(List<EzyMatrix.Matrix> matrix) throws IllegalAccessException, IllegalArgumentException {
        CommonSourceResult commonSourceResult;
        AbstractC9133u.m16133g(matrix, "matrix");
        MatrixEventEntity matrixEventEntity = new MatrixEventEntity(0L);
        for (EzyMatrix.Matrix matrix2 : matrix) {
            MatrixInfoEntity matrixInfoEntity = new MatrixInfoEntity(0L, matrix2.getEventTime(), matrix2.getScaleX(), matrix2.m8231q(), matrix2.m8233s(), matrix2.m8232r(), matrix2.getScaleY(), matrix2.m8234t(), matrix2.m8228n(), matrix2.m8229o(), matrix2.m8230p());
            matrixInfoEntity.getRecord().m15518k(matrixEventEntity);
            matrixInfoEntity.put();
            matrixEventEntity.getMatrixInfo().add(matrixInfoEntity);
        }
        matrixEventEntity.put();
        MatrixRecordEntity matrixRecordEntity = this.matrixRecordEntity;
        if (matrixRecordEntity != null) {
            matrixEventEntity.getRecord().m15518k(matrixRecordEntity);
            matrixEventEntity.put();
            matrixRecordEntity.getMatrixEventEntity().add(matrixEventEntity);
            matrixRecordEntity.put();
            commonSourceResult = new CommonSourceResult(matrixRecordEntity.getFileName(), matrixRecordEntity.getMatrixEventEntity().m15499i(matrixEventEntity.getId()));
        } else {
            commonSourceResult = null;
        }
        checkLength();
        return commonSourceResult;
    }

    public final void setRecord(RecordEntity recordEntity) {
        AbstractC9133u.m16133g(recordEntity, "recordEntity");
        this.recordEntity = recordEntity;
        this.matrixRecordEntity = initRecordEntity();
    }
}
