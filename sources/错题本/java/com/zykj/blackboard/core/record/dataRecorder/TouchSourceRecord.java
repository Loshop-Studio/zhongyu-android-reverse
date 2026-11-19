package com.zykj.blackboard.core.record.dataRecorder;

import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.bean.CommonSourceResult;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.blackboard.core.data.dao.TouchEventEntity;
import com.zykj.blackboard.core.data.dao.TouchInfoEntity;
import com.zykj.blackboard.core.data.dao.TouchRecordEntity;
import com.zykj.blackboard.core.record.DataRecorder;
import com.zykj.board.EzyPaint$Paint;
import com.zykj.board.EzySource$TouchSource;
import com.zykj.board.EzyTouchEvent$TouchEvent;
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

@Metadata(m5109d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ%\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m5110d2 = {"Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord;", "Lcom/zykj/blackboard/core/record/DataRecorder;", "<init>", "()V", "Ld6/s;", "checkLength", "Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;", "initRecordEntity", "()Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;", "buildRecordEntity", "", "Lcom/zykj/board/EzyTouchEvent$TouchEvent;", "eventList", "Lcom/zykj/board/EzyPaint$Paint;", "paint", "Lcom/zykj/blackboard/bean/CommonSourceResult;", "addTouchEvent", "(Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/bean/CommonSourceResult;", "Lcom/zykj/blackboard/core/data/dao/RecordEntity;", "recordEntity", "setRecord", "(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V", "Lcom/zykj/blackboard/core/data/dao/RecordEntity;", "touchRecordEntity", "Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;", "Companion", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class TouchSourceRecord extends DataRecorder {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String SOURCE_FILE_NAME_SUFFIX = "_touch.bin";

    @Nullable
    private RecordEntity recordEntity;

    @Nullable
    private TouchRecordEntity touchRecordEntity;

    @Metadata(m5109d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m5110d2 = {"Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord$Companion;", "", "()V", "SOURCE_FILE_NAME_SUFFIX", "", "getTouchSource", "Lcom/zykj/board/EzySource$TouchSource;", "pageRootPath", "fileName", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @NotNull
        public final EzySource$TouchSource getTouchSource(@NotNull String pageRootPath, @NotNull String fileName) throws IOException {
            AbstractC5830k.m5330g(pageRootPath, "pageRootPath");
            AbstractC5830k.m5330g(fileName, "fileName");
            File file = new File(pageRootPath, fileName);
            if (!file.exists()) {
                throw new FileNotFoundException(file.getPath());
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            EzySource$TouchSource touchSource = EzySource$TouchSource.parseFrom(fileInputStream);
            fileInputStream.close();
            AbstractC5830k.m5329f(touchSource, "touchSource");
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
                AbstractC5830k.m5327d(touchRecordEntity);
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
        return (recordEntity == null || (touchList = recordEntity.getTouchList()) == null || (touchRecordEntity = (TouchRecordEntity) AbstractC5805t.m5236p0(touchList)) == null || touchRecordEntity.getTouchEventList().size() >= 100) ? buildRecordEntity() : touchRecordEntity;
    }

    @Nullable
    public final CommonSourceResult addTouchEvent(@NotNull List<EzyTouchEvent$TouchEvent> eventList, @NotNull EzyPaint$Paint paint) {
        CommonSourceResult commonSourceResult;
        AbstractC5830k.m5330g(eventList, "eventList");
        AbstractC5830k.m5330g(paint, "paint");
        TouchEventEntity touchEventEntity = new TouchEventEntity(0L, paint.getWidth(), paint.getColor(), paint.getSpacing(), paint.getItemLength(), paint.getStyle(), 0.0f, 64, null);
        for (EzyTouchEvent$TouchEvent ezyTouchEvent$TouchEvent : eventList) {
            TouchInfoEntity touchInfoEntity = new TouchInfoEntity(0L, ezyTouchEvent$TouchEvent.getEventTime(), ezyTouchEvent$TouchEvent.getX(), ezyTouchEvent$TouchEvent.getY());
            touchInfoEntity.getRecord().setTarget(touchEventEntity);
            touchInfoEntity.put();
            touchEventEntity.getTouchInfoList().add(touchInfoEntity);
        }
        touchEventEntity.put();
        TouchRecordEntity touchRecordEntity = this.touchRecordEntity;
        if (touchRecordEntity != null) {
            touchEventEntity.getRecord().setTarget(touchRecordEntity);
            touchEventEntity.put();
            touchRecordEntity.getTouchEventList().add(touchEventEntity);
            touchRecordEntity.put();
            commonSourceResult = new CommonSourceResult(touchRecordEntity.getFileName(), touchRecordEntity.getTouchEventList().indexOfId(touchEventEntity.getId()));
        } else {
            commonSourceResult = null;
        }
        checkLength();
        return commonSourceResult;
    }

    public final void setRecord(@NotNull RecordEntity recordEntity) {
        AbstractC5830k.m5330g(recordEntity, "recordEntity");
        this.recordEntity = recordEntity;
        this.touchRecordEntity = initRecordEntity();
    }
}
