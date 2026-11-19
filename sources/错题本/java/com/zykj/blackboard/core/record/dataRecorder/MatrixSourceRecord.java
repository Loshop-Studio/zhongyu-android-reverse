package com.zykj.blackboard.core.record.dataRecorder;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.bean.CommonSourceResult;
import com.zykj.blackboard.core.data.dao.MatrixEventEntity;
import com.zykj.blackboard.core.data.dao.MatrixInfoEntity;
import com.zykj.blackboard.core.data.dao.MatrixRecordEntity;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.blackboard.core.record.DataRecorder;
import com.zykj.board.EzyMatrix$Matrix;
import com.zykj.board.EzySource$MatrixSource;
import io.objectbox.relation.ToMany;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m5110d2 = {"Lcom/zykj/blackboard/core/record/dataRecorder/MatrixSourceRecord;", "Lcom/zykj/blackboard/core/record/DataRecorder;", "<init>", "()V", "Ld6/s;", "checkLength", "Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;", "initRecordEntity", "()Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;", "buildRecordEntity", "", "Lcom/zykj/board/EzyMatrix$Matrix;", "matrix", "Lcom/zykj/blackboard/bean/CommonSourceResult;", "add", "(Ljava/util/List;)Lcom/zykj/blackboard/bean/CommonSourceResult;", "Lcom/zykj/blackboard/core/data/dao/RecordEntity;", "recordEntity", "setRecord", "(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V", "Lcom/zykj/blackboard/core/data/dao/RecordEntity;", "matrixRecordEntity", "Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;", "Companion", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class MatrixSourceRecord extends DataRecorder {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String SOURCE_FILE_NAME_SUFFIX = "_matrix.bin";

    @Nullable
    private MatrixRecordEntity matrixRecordEntity;

    @Nullable
    private RecordEntity recordEntity;

    @Metadata(m5109d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m5110d2 = {"Lcom/zykj/blackboard/core/record/dataRecorder/MatrixSourceRecord$Companion;", "", "()V", "SOURCE_FILE_NAME_SUFFIX", "", "getMatrixInfo", "Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;", "pageRootPath", "sourceFileName", "sourceId", "", "getMatrixSource", "Lcom/zykj/board/EzySource$MatrixSource;", "fileName", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @NotNull
        public final EzySource$MatrixSource.MatrixInfo getMatrixInfo(@NotNull String pageRootPath, @NotNull String sourceFileName, int sourceId) {
            AbstractC5830k.m5330g(pageRootPath, "pageRootPath");
            AbstractC5830k.m5330g(sourceFileName, "sourceFileName");
            EzySource$MatrixSource.MatrixInfo matrixInfo = getMatrixSource(pageRootPath, sourceFileName).getMatrixInfoList().get(sourceId);
            AbstractC5830k.m5329f(matrixInfo, "this.matrixInfoList[sourceId]");
            return matrixInfo;
        }

        @NotNull
        public final EzySource$MatrixSource getMatrixSource(@NotNull String pageRootPath, @NotNull String fileName) throws IOException {
            AbstractC5830k.m5330g(pageRootPath, "pageRootPath");
            AbstractC5830k.m5330g(fileName, "fileName");
            File file = new File(pageRootPath, fileName);
            if (!file.exists()) {
                throw new FileNotFoundException(file.getPath());
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            EzySource$MatrixSource record = EzySource$MatrixSource.parseFrom(fileInputStream);
            fileInputStream.close();
            AbstractC5830k.m5329f(record, "record");
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
                AbstractC5830k.m5327d(matrixRecordEntity);
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
        return (recordEntity == null || (matrixList = recordEntity.getMatrixList()) == null || (matrixRecordEntity = (MatrixRecordEntity) AbstractC5805t.m5236p0(matrixList)) == null || matrixRecordEntity.getMatrixEventEntity().size() >= 100) ? buildRecordEntity() : matrixRecordEntity;
    }

    @Nullable
    public final CommonSourceResult add(@NotNull List<EzyMatrix$Matrix> matrix) {
        CommonSourceResult commonSourceResult;
        AbstractC5830k.m5330g(matrix, "matrix");
        MatrixEventEntity matrixEventEntity = new MatrixEventEntity(0L);
        for (EzyMatrix$Matrix ezyMatrix$Matrix : matrix) {
            MatrixInfoEntity matrixInfoEntity = new MatrixInfoEntity(0L, ezyMatrix$Matrix.getEventTime(), ezyMatrix$Matrix.getScaleX(), ezyMatrix$Matrix.getSkewX(), ezyMatrix$Matrix.getTransX(), ezyMatrix$Matrix.getSkewY(), ezyMatrix$Matrix.getScaleY(), ezyMatrix$Matrix.getTransY(), ezyMatrix$Matrix.getPerSp0(), ezyMatrix$Matrix.getPerSp1(), ezyMatrix$Matrix.getPerSp2());
            matrixInfoEntity.getRecord().setTarget(matrixEventEntity);
            matrixInfoEntity.put();
            matrixEventEntity.getMatrixInfo().add(matrixInfoEntity);
        }
        matrixEventEntity.put();
        MatrixRecordEntity matrixRecordEntity = this.matrixRecordEntity;
        if (matrixRecordEntity != null) {
            matrixEventEntity.getRecord().setTarget(matrixRecordEntity);
            matrixEventEntity.put();
            matrixRecordEntity.getMatrixEventEntity().add(matrixEventEntity);
            matrixRecordEntity.put();
            commonSourceResult = new CommonSourceResult(matrixRecordEntity.getFileName(), matrixRecordEntity.getMatrixEventEntity().indexOfId(matrixEventEntity.getId()));
        } else {
            commonSourceResult = null;
        }
        checkLength();
        return commonSourceResult;
    }

    public final void setRecord(@NotNull RecordEntity recordEntity) {
        AbstractC5830k.m5330g(recordEntity, "recordEntity");
        this.recordEntity = recordEntity;
        this.matrixRecordEntity = initRecordEntity();
    }
}
