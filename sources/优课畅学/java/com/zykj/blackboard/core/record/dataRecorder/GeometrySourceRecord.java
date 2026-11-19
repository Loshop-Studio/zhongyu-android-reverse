package com.zykj.blackboard.core.record.dataRecorder;

import com.zykj.blackboard.bean.CommonSourceResult;
import com.zykj.blackboard.core.data.dao.GeometryInfoEntity;
import com.zykj.blackboard.core.data.dao.GeometryPointFEntity;
import com.zykj.blackboard.core.data.dao.GeometryRecordEntity;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.blackboard.core.record.DataRecorder;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzyPointF;
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
public final class GeometrySourceRecord extends DataRecorder {
    public static final Companion Companion = new Companion(null);
    public static final String SOURCE_FILE_NAME_SUFFIX = "_geometry.bin";
    private GeometryRecordEntity geometryRecordEntity;
    private RecordEntity recordEntity;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final EzySource.GeometrySource.GeometryInfo getGeometryInfo(String pageRootPath, String sourceFileName, int i10) {
            AbstractC9133u.m16133g(pageRootPath, "pageRootPath");
            AbstractC9133u.m16133g(sourceFileName, "sourceFileName");
            Object obj = getGeometrySource(pageRootPath, sourceFileName).m8787h().get(i10);
            AbstractC9133u.m16132f(obj, "this.geometryInfoList[sourceId]");
            return (EzySource.GeometrySource.GeometryInfo) obj;
        }

        public final EzySource.GeometrySource getGeometrySource(String pageRootPath, String fileName) throws IOException {
            AbstractC9133u.m16133g(pageRootPath, "pageRootPath");
            AbstractC9133u.m16133g(fileName, "fileName");
            File file = new File(pageRootPath, fileName);
            if (!file.exists()) {
                throw new FileNotFoundException(file.getPath());
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            EzySource.GeometrySource record = EzySource.GeometrySource.m8784l(fileInputStream);
            fileInputStream.close();
            AbstractC9133u.m16132f(record, "record");
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
                AbstractC9133u.m16130d(geometryRecordEntity);
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
        return (recordEntity == null || (geometryList = recordEntity.getGeometryList()) == null || (geometryRecordEntity = (GeometryRecordEntity) AbstractC8778f0.m14579y0(geometryList)) == null || geometryRecordEntity.getGeometryInfoEntityList().size() >= 100) ? buildRecordEntity() : geometryRecordEntity;
    }

    public final CommonSourceResult addGeometry(int i10, List<EzyPointF.PointF> pointFList, EzyPaint.Paint paint) throws IllegalAccessException, IllegalArgumentException {
        CommonSourceResult commonSourceResult;
        AbstractC9133u.m16133g(pointFList, "pointFList");
        AbstractC9133u.m16133g(paint, "paint");
        GeometryInfoEntity geometryInfoEntity = new GeometryInfoEntity(0L, paint.getWidth(), paint.getColor(), paint.m8479m(), paint.m8478l(), i10);
        for (EzyPointF.PointF pointF : pointFList) {
            GeometryPointFEntity geometryPointFEntity = new GeometryPointFEntity(0L, pointF.getX(), pointF.getY());
            geometryPointFEntity.getRecord().m15518k(geometryInfoEntity);
            geometryPointFEntity.put();
            geometryInfoEntity.getPointList().add(geometryPointFEntity);
        }
        geometryInfoEntity.put();
        GeometryRecordEntity geometryRecordEntity = this.geometryRecordEntity;
        if (geometryRecordEntity != null) {
            geometryInfoEntity.getRecord().m15518k(geometryRecordEntity);
            geometryInfoEntity.put();
            geometryRecordEntity.getGeometryInfoEntityList().add(geometryInfoEntity);
            geometryRecordEntity.put();
            commonSourceResult = new CommonSourceResult(geometryRecordEntity.getFileName(), geometryRecordEntity.getGeometryInfoEntityList().m15499i(geometryInfoEntity.getId()));
        } else {
            commonSourceResult = null;
        }
        checkLength();
        return commonSourceResult;
    }

    public final void setRecord(RecordEntity recordEntity) {
        AbstractC9133u.m16133g(recordEntity, "recordEntity");
        this.recordEntity = recordEntity;
        this.geometryRecordEntity = initRecordEntity();
    }
}
