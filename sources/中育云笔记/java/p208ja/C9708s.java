package p208ja;

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
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p194ia.AbstractC9617a;
import p307q9.C10763c;
import p325rc.AbstractC10947g0;

/* renamed from: ja.s */
/* loaded from: classes5.dex */
public final class C9708s extends AbstractC9617a {

    /* renamed from: e */
    public static final a f22595e = new a(null);

    /* renamed from: c */
    public RecordEntity f22596c;

    /* renamed from: d */
    public TouchRecordEntity f22597d;

    /* renamed from: ja.s$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final EzySource.TouchSource m19214a(String pageRootPath, String fileName) throws IOException {
            AbstractC9979u.m20294g(pageRootPath, "pageRootPath");
            AbstractC9979u.m20294g(fileName, "fileName");
            File file = new File(pageRootPath, fileName);
            if (!file.exists()) {
                throw new FileNotFoundException(file.getPath());
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            EzySource.TouchSource touchSource = EzySource.TouchSource.m16249p(fileInputStream);
            fileInputStream.close();
            AbstractC9979u.m20293f(touchSource, "touchSource");
            return touchSource;
        }

        public a() {
        }
    }

    public C9708s() {
        super(null);
    }

    /* renamed from: g */
    private final synchronized void m19209g() {
        try {
            TouchRecordEntity touchRecordEntity = this.f22597d;
            if (touchRecordEntity == null) {
                this.f22597d = m19211f();
            } else {
                AbstractC9979u.m20291d(touchRecordEntity);
                if (touchRecordEntity.m14345c().size() >= 100) {
                    this.f22597d = m19211f();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: e */
    public final C10763c m19210e(List eventList, EzyPaint.Paint paint) throws IllegalAccessException, IllegalArgumentException {
        C10763c c10763c;
        AbstractC9979u.m20294g(eventList, "eventList");
        AbstractC9979u.m20294g(paint, "paint");
        TouchEventEntity touchEventEntity = new TouchEventEntity(0L, paint.getWidth(), paint.getColor(), paint.m15722o(), paint.m15721n(), paint.m15723p(), 0.0f, 64, null);
        Iterator it = eventList.iterator();
        while (it.hasNext()) {
            EzyTouchEvent.TouchEvent touchEvent = (EzyTouchEvent.TouchEvent) it.next();
            TouchInfoEntity touchInfoEntity = new TouchInfoEntity(0L, touchEvent.getEventTime(), touchEvent.getX(), touchEvent.getY());
            touchInfoEntity.m14333c().m19043o(touchEventEntity);
            touchInfoEntity.m14336f();
            touchEventEntity.m14321h().add(touchInfoEntity);
        }
        touchEventEntity.m14323j();
        TouchRecordEntity touchRecordEntity = this.f22597d;
        if (touchRecordEntity != null) {
            touchEventEntity.m14317d().m19043o(touchRecordEntity);
            touchEventEntity.m14323j();
            touchRecordEntity.m14345c().add(touchEventEntity);
            touchRecordEntity.m14347e();
            c10763c = new C10763c(touchRecordEntity.m14343a(), touchRecordEntity.m14345c().m19024m(touchEventEntity.m14315b()));
        } else {
            c10763c = null;
        }
        m19209g();
        return c10763c;
    }

    /* renamed from: f */
    public final TouchRecordEntity m19211f() {
        RecordEntity recordEntity = this.f22596c;
        if (recordEntity == null) {
            return null;
        }
        TouchRecordEntity touchRecordEntity = new TouchRecordEntity(0L, UUID.randomUUID() + "_touch.bin", "");
        recordEntity.m14265i().add(touchRecordEntity);
        Log.i("TestForConvert", "after add 当前touchList个数 -> " + recordEntity.m14265i().size());
        recordEntity.m14266j();
        return touchRecordEntity;
    }

    /* renamed from: h */
    public final TouchRecordEntity m19212h() {
        ToMany toManyM14265i;
        TouchRecordEntity touchRecordEntity;
        RecordEntity recordEntity = this.f22596c;
        return (recordEntity == null || (toManyM14265i = recordEntity.m14265i()) == null || (touchRecordEntity = (TouchRecordEntity) AbstractC10947g0.m23957z0(toManyM14265i)) == null || touchRecordEntity.m14345c().size() >= 100) ? m19211f() : touchRecordEntity;
    }

    /* renamed from: i */
    public final void m19213i(RecordEntity recordEntity) {
        AbstractC9979u.m20294g(recordEntity, "recordEntity");
        this.f22596c = recordEntity;
        this.f22597d = m19212h();
    }
}
