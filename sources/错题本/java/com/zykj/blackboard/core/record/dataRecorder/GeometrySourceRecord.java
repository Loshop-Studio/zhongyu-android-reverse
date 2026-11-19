package com.zykj.blackboard.core.record.dataRecorder;

import android.view.serialization.ClassDiscriminatorModeKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.bean.CommonSourceResult;
import com.zykj.blackboard.core.data.dao.GeometryInfoEntity;
import com.zykj.blackboard.core.data.dao.GeometryPointFEntity;
import com.zykj.blackboard.core.data.dao.GeometryRecordEntity;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.blackboard.core.record.DataRecorder;
import com.zykj.board.EzyPaint$Paint;
import com.zykj.board.EzyPointF$PointF;
import com.zykj.board.EzySource$GeometrySource;
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

@Metadata(m5109d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ-\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m5110d2 = {"Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord;", "Lcom/zykj/blackboard/core/record/DataRecorder;", "<init>", "()V", "Ld6/s;", "checkLength", "Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;", "initRecordEntity", "()Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;", "buildRecordEntity", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "Lcom/zykj/board/EzyPointF$PointF;", "pointFList", "Lcom/zykj/board/EzyPaint$Paint;", "paint", "Lcom/zykj/blackboard/bean/CommonSourceResult;", "addGeometry", "(ILjava/util/List;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/bean/CommonSourceResult;", "Lcom/zykj/blackboard/core/data/dao/RecordEntity;", "recordEntity", "setRecord", "(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V", "Lcom/zykj/blackboard/core/data/dao/RecordEntity;", "geometryRecordEntity", "Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;", "Companion", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class GeometrySourceRecord extends DataRecorder {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String SOURCE_FILE_NAME_SUFFIX = "_geometry.bin";

    @Nullable
    private GeometryRecordEntity geometryRecordEntity;

    @Nullable
    private RecordEntity recordEntity;

    @Metadata(m5109d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m5110d2 = {"Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord$Companion;", "", "()V", "SOURCE_FILE_NAME_SUFFIX", "", "getGeometryInfo", "Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;", "pageRootPath", "sourceFileName", "sourceId", "", "getGeometrySource", "Lcom/zykj/board/EzySource$GeometrySource;", "fileName", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @NotNull
        public final EzySource$GeometrySource.GeometryInfo getGeometryInfo(@NotNull String pageRootPath, @NotNull String sourceFileName, int sourceId) {
            AbstractC5830k.m5330g(pageRootPath, "pageRootPath");
            AbstractC5830k.m5330g(sourceFileName, "sourceFileName");
            EzySource$GeometrySource.GeometryInfo geometryInfo = getGeometrySource(pageRootPath, sourceFileName).getGeometryInfoList().get(sourceId);
            AbstractC5830k.m5329f(geometryInfo, "this.geometryInfoList[sourceId]");
            return geometryInfo;
        }

        @NotNull
        public final EzySource$GeometrySource getGeometrySource(@NotNull String pageRootPath, @NotNull String fileName) throws IOException {
            AbstractC5830k.m5330g(pageRootPath, "pageRootPath");
            AbstractC5830k.m5330g(fileName, "fileName");
            File file = new File(pageRootPath, fileName);
            if (!file.exists()) {
                throw new FileNotFoundException(file.getPath());
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            EzySource$GeometrySource record = EzySource$GeometrySource.parseFrom(fileInputStream);
            fileInputStream.close();
            AbstractC5830k.m5329f(record, "record");
            return record;
        }

        private Companion() {
        }
    }

    public GeometrySourceRecord() {
        super(null);
    }

    private final GeometryRecordEntity buildRecordEntity() {
        RecordEntity recordEntity = this.recordEntity;
        if (recordEntity == null) {
            return null;
        }
        GeometryRecordEntity geometryRecordEntity = new GeometryRecordEntity(0L, UUID.randomUUID() + SOURCE_FILE_NAME_SUFFIX, "");
        recordEntity.getGeometryList().add(geometryRecordEntity);
        recordEntity.put();
        return geometryRecordEntity;
    }

    private final synchronized void checkLength() {
        try {
            GeometryRecordEntity geometryRecordEntity = this.geometryRecordEntity;
            if (geometryRecordEntity == null) {
                this.geometryRecordEntity = buildRecordEntity();
            } else {
                AbstractC5830k.m5327d(geometryRecordEntity);
                if (geometryRecordEntity.getGeometryInfoEntityList().size() >= 100) {
                    this.geometryRecordEntity = buildRecordEntity();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final GeometryRecordEntity initRecordEntity() {
        ToMany<GeometryRecordEntity> geometryList;
        GeometryRecordEntity geometryRecordEntity;
        RecordEntity recordEntity = this.recordEntity;
        return (recordEntity == null || (geometryList = recordEntity.getGeometryList()) == null || (geometryRecordEntity = (GeometryRecordEntity) AbstractC5805t.m5236p0(geometryList)) == null || geometryRecordEntity.getGeometryInfoEntityList().size() >= 100) ? buildRecordEntity() : geometryRecordEntity;
    }

    @Nullable
    public final CommonSourceResult addGeometry(int type, @NotNull List<EzyPointF$PointF> pointFList, @NotNull EzyPaint$Paint paint) {
        CommonSourceResult commonSourceResult;
        AbstractC5830k.m5330g(pointFList, "pointFList");
        AbstractC5830k.m5330g(paint, "paint");
        GeometryInfoEntity geometryInfoEntity = new GeometryInfoEntity(0L, paint.getWidth(), paint.getColor(), paint.getTextSize(), paint.getStyle(), type);
        for (EzyPointF$PointF ezyPointF$PointF : pointFList) {
            GeometryPointFEntity geometryPointFEntity = new GeometryPointFEntity(0L, ezyPointF$PointF.getX(), ezyPointF$PointF.getY());
            geometryPointFEntity.getRecord().setTarget(geometryInfoEntity);
            geometryPointFEntity.put();
            geometryInfoEntity.getPointList().add(geometryPointFEntity);
        }
        geometryInfoEntity.put();
        GeometryRecordEntity geometryRecordEntity = this.geometryRecordEntity;
        if (geometryRecordEntity != null) {
            geometryInfoEntity.getRecord().setTarget(geometryRecordEntity);
            geometryInfoEntity.put();
            geometryRecordEntity.getGeometryInfoEntityList().add(geometryInfoEntity);
            geometryRecordEntity.put();
            commonSourceResult = new CommonSourceResult(geometryRecordEntity.getFileName(), geometryRecordEntity.getGeometryInfoEntityList().indexOfId(geometryInfoEntity.getId()));
        } else {
            commonSourceResult = null;
        }
        checkLength();
        return commonSourceResult;
    }

    public final void setRecord(@NotNull RecordEntity recordEntity) {
        AbstractC5830k.m5330g(recordEntity, "recordEntity");
        this.recordEntity = recordEntity;
        this.geometryRecordEntity = initRecordEntity();
    }
}
