package com.zykj.blackboard.core.record.dataRecorder;

import android.util.Log;
import com.zykj.blackboard.bean.CommonSourceResult;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.blackboard.core.data.dao.TouchEventEntity;
import com.zykj.blackboard.core.data.dao.TouchInfoEntity;
import com.zykj.blackboard.core.data.dao.TouchRecordEntity;
import com.zykj.blackboard.core.record.DataRecorder;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzySource;
import com.zykj.board.EzyTouchEvent;
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
public final class TouchSourceRecord extends DataRecorder {
    public static final Companion Companion = new Companion(null);
    public static final String SOURCE_FILE_NAME_SUFFIX = "_touch.bin";
    private RecordEntity recordEntity;
    private TouchRecordEntity touchRecordEntity;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final EzySource.TouchSource getTouchSource(String pageRootPath, String fileName) throws IOException {
            AbstractC9133u.m16133g(pageRootPath, "pageRootPath");
            AbstractC9133u.m16133g(fileName, "fileName");
            File file = new File(pageRootPath, fileName);
            if (!file.exists()) {
                throw new FileNotFoundException(file.getPath());
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            EzySource.TouchSource touchSource = EzySource.TouchSource.m8997l(fileInputStream);
            fileInputStream.close();
            AbstractC9133u.m16132f(touchSource, "touchSource");
            return touchSource;
        }

        private Companion() {
        }
    }

    public TouchSourceRecord() {
        super(null);
    }

    private final TouchRecordEntity buildRecordEntity() {
        RecordEntity recordEntity = this.recordEntity;
        if (recordEntity == null) {
            return null;
        }
        TouchRecordEntity touchRecordEntity = new TouchRecordEntity(0L, UUID.randomUUID() + SOURCE_FILE_NAME_SUFFIX, "");
        recordEntity.getTouchList().add(touchRecordEntity);
        Log.i("TestForConvert", "after add 当前touchList个数 -> " + recordEntity.getTouchList().size());
        recordEntity.put();
        return touchRecordEntity;
    }

    private final synchronized void checkLength() {
        try {
            TouchRecordEntity touchRecordEntity = this.touchRecordEntity;
            if (touchRecordEntity == null) {
                this.touchRecordEntity = buildRecordEntity();
            } else {
                AbstractC9133u.m16130d(touchRecordEntity);
                if (touchRecordEntity.getTouchEventList().size() >= 100) {
                    this.touchRecordEntity = buildRecordEntity();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final TouchRecordEntity initRecordEntity() {
        ToMany<TouchRecordEntity> touchList;
        TouchRecordEntity touchRecordEntity;
        RecordEntity recordEntity = this.recordEntity;
        return (recordEntity == null || (touchList = recordEntity.getTouchList()) == null || (touchRecordEntity = (TouchRecordEntity) AbstractC8778f0.m14579y0(touchList)) == null || touchRecordEntity.getTouchEventList().size() >= 100) ? buildRecordEntity() : touchRecordEntity;
    }

    public final CommonSourceResult addTouchEvent(List<EzyTouchEvent.TouchEvent> eventList, EzyPaint.Paint paint) throws IllegalAccessException, IllegalArgumentException {
        CommonSourceResult commonSourceResult;
        AbstractC9133u.m16133g(eventList, "eventList");
        AbstractC9133u.m16133g(paint, "paint");
        TouchEventEntity touchEventEntity = new TouchEventEntity(0L, paint.getWidth(), paint.getColor(), paint.m8477k(), paint.m8476j(), paint.m8478l(), 0.0f, 64, null);
        for (EzyTouchEvent.TouchEvent touchEvent : eventList) {
            TouchInfoEntity touchInfoEntity = new TouchInfoEntity(0L, touchEvent.getEventTime(), touchEvent.getX(), touchEvent.getY());
            touchInfoEntity.getRecord().m15518k(touchEventEntity);
            touchInfoEntity.put();
            touchEventEntity.getTouchInfoList().add(touchInfoEntity);
        }
        touchEventEntity.put();
        TouchRecordEntity touchRecordEntity = this.touchRecordEntity;
        if (touchRecordEntity != null) {
            touchEventEntity.getRecord().m15518k(touchRecordEntity);
            touchEventEntity.put();
            touchRecordEntity.getTouchEventList().add(touchEventEntity);
            touchRecordEntity.put();
            commonSourceResult = new CommonSourceResult(touchRecordEntity.getFileName(), touchRecordEntity.getTouchEventList().m15499i(touchEventEntity.getId()));
        } else {
            commonSourceResult = null;
        }
        checkLength();
        return commonSourceResult;
    }

    public final void setRecord(RecordEntity recordEntity) {
        AbstractC9133u.m16133g(recordEntity, "recordEntity");
        this.recordEntity = recordEntity;
        this.touchRecordEntity = initRecordEntity();
    }
}
