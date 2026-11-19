package p199o5;

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
import p189n5.AbstractC9095a;
import p272v4.C9764c;

/* renamed from: o5.s */
/* loaded from: classes4.dex */
public final class C9183s extends AbstractC9095a {

    /* renamed from: e */
    public static final a f15580e = new a(null);

    /* renamed from: c */
    public RecordEntity f15581c;

    /* renamed from: d */
    public TouchRecordEntity f15582d;

    /* renamed from: o5.s$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final EzySource.TouchSource m14796a(String pageRootPath, String fileName) throws IOException {
            Intrinsics.checkNotNullParameter(pageRootPath, "pageRootPath");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            File file = new File(pageRootPath, fileName);
            if (!file.exists()) {
                throw new FileNotFoundException(file.getPath());
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            EzySource.TouchSource touchSource = EzySource.TouchSource.m9620x(fileInputStream);
            fileInputStream.close();
            Intrinsics.checkNotNullExpressionValue(touchSource, "touchSource");
            return touchSource;
        }

        public a() {
        }
    }

    public C9183s() {
        super(null);
    }

    /* renamed from: g */
    private final synchronized void m14791g() {
        try {
            TouchRecordEntity touchRecordEntity = this.f15582d;
            if (touchRecordEntity == null) {
                this.f15582d = m14793f();
            } else {
                Intrinsics.checkNotNull(touchRecordEntity);
                if (touchRecordEntity.m7717c().size() >= 100) {
                    this.f15582d = m14793f();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: e */
    public final C9764c m14792e(List eventList, EzyPaint.Paint paint) throws IllegalAccessException, IllegalArgumentException {
        C9764c c9764c;
        Intrinsics.checkNotNullParameter(eventList, "eventList");
        Intrinsics.checkNotNullParameter(paint, "paint");
        TouchEventEntity touchEventEntity = new TouchEventEntity(0L, paint.getWidth(), paint.getColor(), paint.m9106w(), paint.m9105v(), paint.m9107x(), 0.0f, 64, null);
        Iterator it = eventList.iterator();
        while (it.hasNext()) {
            EzyTouchEvent.TouchEvent touchEvent = (EzyTouchEvent.TouchEvent) it.next();
            TouchInfoEntity touchInfoEntity = new TouchInfoEntity(0L, touchEvent.getEventTime(), touchEvent.getX(), touchEvent.getY());
            touchInfoEntity.m7705c().m13190w(touchEventEntity);
            touchInfoEntity.m7708f();
            touchEventEntity.m7693h().add(touchInfoEntity);
        }
        touchEventEntity.m7695j();
        TouchRecordEntity touchRecordEntity = this.f15582d;
        if (touchRecordEntity != null) {
            touchEventEntity.m7689d().m13190w(touchRecordEntity);
            touchEventEntity.m7695j();
            touchRecordEntity.m7717c().add(touchEventEntity);
            touchRecordEntity.m7719e();
            c9764c = new C9764c(touchRecordEntity.getFileName(), touchRecordEntity.m7717c().m13175u(touchEventEntity.getId()));
        } else {
            c9764c = null;
        }
        m14791g();
        return c9764c;
    }

    /* renamed from: f */
    public final TouchRecordEntity m14793f() {
        RecordEntity recordEntity = this.f15581c;
        if (recordEntity == null) {
            return null;
        }
        TouchRecordEntity touchRecordEntity = new TouchRecordEntity(0L, UUID.randomUUID() + "_touch.bin", "");
        recordEntity.m7637i().add(touchRecordEntity);
        Log.i("TestForConvert", "after add 当前touchList个数 -> " + recordEntity.m7637i().size());
        recordEntity.m7638j();
        return touchRecordEntity;
    }

    /* renamed from: h */
    public final TouchRecordEntity m14794h() {
        ToMany toManyM7637i;
        TouchRecordEntity touchRecordEntity;
        RecordEntity recordEntity = this.f15581c;
        return (recordEntity == null || (toManyM7637i = recordEntity.m7637i()) == null || (touchRecordEntity = (TouchRecordEntity) CollectionsKt.lastOrNull((List) toManyM7637i)) == null || touchRecordEntity.m7717c().size() >= 100) ? m14793f() : touchRecordEntity;
    }

    /* renamed from: i */
    public final void m14795i(RecordEntity recordEntity) {
        Intrinsics.checkNotNullParameter(recordEntity, "recordEntity");
        this.f15581c = recordEntity;
        this.f15582d = m14794h();
    }
}
