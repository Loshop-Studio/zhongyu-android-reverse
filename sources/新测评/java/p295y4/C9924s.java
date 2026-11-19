package p295y4;

import android.util.Log;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.blackboard.core.data.dao.TouchEventEntity;
import com.zykj.blackboard.core.data.dao.TouchInfoEntity;
import com.zykj.blackboard.core.data.dao.TouchRecordEntity;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzySource;
import com.zykj.board.EzyTouchEvent;
import io.objectbox.relation.ToMany;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p087f4.C7437b;
import p285x4.AbstractC9848a;

/* renamed from: y4.s */
/* loaded from: classes4.dex */
public final class C9924s extends AbstractC9848a {

    /* renamed from: e */
    public static final a f17726e = new a(null);

    /* renamed from: c */
    public RecordEntity f17727c;

    /* renamed from: d */
    public TouchRecordEntity f17728d;

    /* renamed from: y4.s$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final EzySource.TouchSource m16755a(String pageRootPath, String fileName) throws IOException {
            Intrinsics.checkNotNullParameter(pageRootPath, "pageRootPath");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            File file = new File(pageRootPath, fileName);
            if (!file.exists()) {
                throw new FileNotFoundException(file.getPath());
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            EzySource.TouchSource touchSource = EzySource.TouchSource.m8466u(fileInputStream);
            fileInputStream.close();
            Intrinsics.checkNotNullExpressionValue(touchSource, "touchSource");
            return touchSource;
        }

        public a() {
        }
    }

    public C9924s() {
        super(null);
    }

    /* renamed from: g */
    private final synchronized void m16750g() {
        try {
            TouchRecordEntity touchRecordEntity = this.f17728d;
            if (touchRecordEntity == null) {
                this.f17728d = m16752f();
            } else {
                Intrinsics.checkNotNull(touchRecordEntity);
                if (touchRecordEntity.m6614c().size() >= 100) {
                    this.f17728d = m16752f();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: e */
    public final C7437b m16751e(List eventList, EzyPaint.Paint paint) throws IllegalAccessException, IllegalArgumentException {
        C7437b c7437b;
        Intrinsics.checkNotNullParameter(eventList, "eventList");
        Intrinsics.checkNotNullParameter(paint, "paint");
        TouchEventEntity touchEventEntity = new TouchEventEntity(0L, paint.getWidth(), paint.getColor(), paint.m7971t(), paint.m7970s(), paint.m7972u(), 0.0f, 64, null);
        Iterator it = eventList.iterator();
        while (it.hasNext()) {
            EzyTouchEvent.TouchEvent touchEvent = (EzyTouchEvent.TouchEvent) it.next();
            TouchInfoEntity touchInfoEntity = new TouchInfoEntity(0L, touchEvent.getEventTime(), touchEvent.getX(), touchEvent.getY());
            touchInfoEntity.m6602c().m13071t(touchEventEntity);
            touchInfoEntity.m6605f();
            touchEventEntity.m6590h().add(touchInfoEntity);
        }
        touchEventEntity.m6592j();
        TouchRecordEntity touchRecordEntity = this.f17728d;
        if (touchRecordEntity != null) {
            touchEventEntity.m6586d().m13071t(touchRecordEntity);
            touchEventEntity.m6592j();
            touchRecordEntity.m6614c().add(touchEventEntity);
            touchRecordEntity.m6616e();
            c7437b = new C7437b(touchRecordEntity.getFileName(), touchRecordEntity.m6614c().m13053r(touchEventEntity.getId()));
        } else {
            c7437b = null;
        }
        m16750g();
        return c7437b;
    }

    /* renamed from: f */
    public final TouchRecordEntity m16752f() {
        RecordEntity recordEntity = this.f17727c;
        if (recordEntity == null) {
            return null;
        }
        TouchRecordEntity touchRecordEntity = new TouchRecordEntity(0L, UUID.randomUUID() + "_touch.bin", "");
        recordEntity.m6535i().add(touchRecordEntity);
        Log.i("TestForConvert", "after add 当前touchList个数 -> " + recordEntity.m6535i().size());
        recordEntity.m6536j();
        return touchRecordEntity;
    }

    /* renamed from: h */
    public final TouchRecordEntity m16753h() {
        ToMany toManyM6535i;
        TouchRecordEntity touchRecordEntity;
        RecordEntity recordEntity = this.f17727c;
        return (recordEntity == null || (toManyM6535i = recordEntity.m6535i()) == null || (touchRecordEntity = (TouchRecordEntity) CollectionsKt.lastOrNull((List) toManyM6535i)) == null || touchRecordEntity.m6614c().size() >= 100) ? m16752f() : touchRecordEntity;
    }

    /* renamed from: i */
    public final void m16754i(RecordEntity recordEntity) {
        Intrinsics.checkNotNullParameter(recordEntity, "recordEntity");
        this.f17727c = recordEntity;
        this.f17728d = m16753h();
    }
}
