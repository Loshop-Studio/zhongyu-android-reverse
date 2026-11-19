package p077e5;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import com.blankj.utilcode.util.LogUtils;
import com.zykj.blackboard.core.data.dao.AbstractC6737a;
import com.zykj.blackboard.core.data.dao.AudioInfoEntity;
import com.zykj.blackboard.core.data.dao.AudioRecordEntity;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.blackboard.core.data.dao.CommandRecordEntity;
import com.zykj.blackboard.core.data.dao.FileInfoEntity;
import com.zykj.blackboard.core.data.dao.FileRecordEntity;
import com.zykj.blackboard.core.data.dao.HeaderEntity;
import com.zykj.blackboard.core.data.dao.MatrixEventEntity;
import com.zykj.blackboard.core.data.dao.MatrixInfoEntity;
import com.zykj.blackboard.core.data.dao.MatrixRecordEntity;
import com.zykj.blackboard.core.data.dao.PageEntity;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.blackboard.core.data.dao.TextInfoEntity;
import com.zykj.blackboard.core.data.dao.TextRecordEntity;
import com.zykj.blackboard.core.data.dao.TouchEventEntity;
import com.zykj.blackboard.core.data.dao.TouchInfoEntity;
import com.zykj.blackboard.core.data.dao.TouchRecordEntity;
import io.objectbox.BoxStore;
import java.util.Iterator;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.UninitializedPropertyAccessException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e5.c */
/* loaded from: classes4.dex */
public final class C7342c {

    /* renamed from: a */
    public static final C7342c f11908a = new C7342c();

    /* renamed from: b */
    public static BoxStore f11909b;

    /* renamed from: a */
    public final void m11743a(PageEntity pageEntity) {
        Object objM24299constructorimpl;
        Intrinsics.checkNotNullParameter(pageEntity, "pageEntity");
        m11744b().m12981h(HeaderEntity.class).m15052s(pageEntity.m6511e().m13066m());
        LogUtils.m3239i("页面BoardBox.kt -> [page: " + pageEntity.getDirName() + "] header 已被清除");
        try {
            Result.Companion companion = Result.INSTANCE;
            RecordEntity recordEntity = (RecordEntity) pageEntity.m6513g().m13064j();
            Iterator<TARGET> it = recordEntity.m6528b().iterator();
            while (it.hasNext()) {
                m11744b().m12981h(CommandInfoEntity.class).m15051r(((CommandRecordEntity) it.next()).m6341a());
            }
            m11744b().m12981h(CommandRecordEntity.class).m15051r(recordEntity.m6528b());
            for (TouchRecordEntity touchRecordEntity : recordEntity.m6535i()) {
                Iterator<TARGET> it2 = touchRecordEntity.m6614c().iterator();
                while (it2.hasNext()) {
                    m11744b().m12981h(TouchInfoEntity.class).m15051r(((TouchEventEntity) it2.next()).m6590h());
                }
                m11744b().m12981h(TouchEventEntity.class).m15051r(touchRecordEntity.m6614c());
            }
            m11744b().m12981h(TouchRecordEntity.class).m15051r(recordEntity.m6535i());
            for (MatrixRecordEntity matrixRecordEntity : recordEntity.m6532f()) {
                Iterator<TARGET> it3 = matrixRecordEntity.m6483c().iterator();
                while (it3.hasNext()) {
                    m11744b().m12981h(MatrixInfoEntity.class).m15051r(((MatrixEventEntity) it3.next()).m6452b());
                }
                m11744b().m12981h(MatrixEventEntity.class).m15051r(matrixRecordEntity.m6483c());
            }
            m11744b().m12981h(MatrixRecordEntity.class).m15051r(recordEntity.m6532f());
            Iterator<TARGET> it4 = recordEntity.m6529c().iterator();
            while (it4.hasNext()) {
                m11744b().m12981h(FileInfoEntity.class).m15051r(((FileRecordEntity) it4.next()).m6366a());
            }
            m11744b().m12981h(FileRecordEntity.class).m15051r(recordEntity.m6529c());
            Iterator<TARGET> it5 = recordEntity.m6534h().iterator();
            while (it5.hasNext()) {
                m11744b().m12981h(TextInfoEntity.class).m15051r(((TextRecordEntity) it5.next()).m6573c());
            }
            m11744b().m12981h(TextRecordEntity.class).m15051r(recordEntity.m6534h());
            Iterator<TARGET> it6 = recordEntity.m6527a().iterator();
            while (it6.hasNext()) {
                m11744b().m12981h(AudioInfoEntity.class).m15051r(((AudioRecordEntity) it6.next()).m6281a());
            }
            m11744b().m12981h(AudioRecordEntity.class).m15051r(recordEntity.m6527a());
            objM24299constructorimpl = Result.m24299constructorimpl(Boolean.valueOf(m11744b().m12981h(RecordEntity.class).m15052s(pageEntity.m6513g().m13066m())));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM24299constructorimpl = Result.m24299constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM24302exceptionOrNullimpl = Result.m24302exceptionOrNullimpl(objM24299constructorimpl);
        if (thM24302exceptionOrNullimpl != null) {
            LogUtils.m3238e("BoardBox.kt -> clearPageData(), delete record failed " + thM24302exceptionOrNullimpl);
        }
        ResultKt.throwOnFailure(objM24299constructorimpl);
        m11744b().m12981h(RecordEntity.class).m15052s(pageEntity.m6513g().m13066m());
        LogUtils.m3239i("[page: " + pageEntity.getDirName() + "] record 已被清除");
        m11744b().m12981h(PageEntity.class).m15052s(pageEntity.getId());
        LogUtils.m3239i("[page: " + pageEntity.getDirName() + "] 已完全被清除");
    }

    /* renamed from: b */
    public final BoxStore m11744b() {
        BoxStore boxStore = f11909b;
        if (boxStore == null) {
            throw new UninitializedPropertyAccessException("boxStore not init");
        }
        Intrinsics.checkNotNull(boxStore);
        return boxStore;
    }

    /* renamed from: c */
    public final synchronized void m11745c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (f11909b == null) {
            BoxStore boxStoreM15059b = AbstractC6737a.m6648y().m15058a(context.getApplicationContext()).m15064k(PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE).m15059b();
            Intrinsics.checkNotNullExpressionValue(boxStoreM15059b, "builder()\n              …\n                .build()");
            m11746d(boxStoreM15059b);
        }
    }

    /* renamed from: d */
    public final void m11746d(BoxStore boxStore) {
        f11909b = boxStore;
    }
}
