package p263u5;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import com.blankj.utilcode.util.LogUtils;
import com.zykj.blackboard.core.data.dao.AbstractC7054a;
import com.zykj.blackboard.core.data.dao.AudioInfoEntity;
import com.zykj.blackboard.core.data.dao.AudioRecordEntity;
import com.zykj.blackboard.core.data.dao.BlackBoardEntity;
import com.zykj.blackboard.core.data.dao.BlackBoardEntity_;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.blackboard.core.data.dao.CommandRecordEntity;
import com.zykj.blackboard.core.data.dao.FileInfoEntity;
import com.zykj.blackboard.core.data.dao.FileRecordEntity;
import com.zykj.blackboard.core.data.dao.HeaderEntity;
import com.zykj.blackboard.core.data.dao.MatrixEventEntity;
import com.zykj.blackboard.core.data.dao.MatrixInfoEntity;
import com.zykj.blackboard.core.data.dao.MatrixRecordEntity;
import com.zykj.blackboard.core.data.dao.PageEntity;
import com.zykj.blackboard.core.data.dao.PageEntity_;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.blackboard.core.data.dao.TextInfoEntity;
import com.zykj.blackboard.core.data.dao.TextRecordEntity;
import com.zykj.blackboard.core.data.dao.TouchEventEntity;
import com.zykj.blackboard.core.data.dao.TouchInfoEntity;
import com.zykj.blackboard.core.data.dao.TouchRecordEntity;
import io.objectbox.BoxStore;
import io.objectbox.query.Query;
import io.objectbox.query.QueryBuilder;
import io.objectbox.relation.ToMany;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.UninitializedPropertyAccessException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p026b8.C5206a;

/* renamed from: u5.d */
/* loaded from: classes4.dex */
public final class C9685d {

    /* renamed from: a */
    public static final C9685d f17121a = new C9685d();

    /* renamed from: b */
    public static BoxStore f17122b;

    /* renamed from: c */
    public static /* synthetic */ void m16161c(C9685d c9685d, String str, Context context, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            context = null;
        }
        c9685d.m16163b(str, context);
    }

    /* renamed from: d */
    public static final void m16162d(String dirName) {
        Intrinsics.checkNotNullParameter(dirName, "$dirName");
        C5206a c5206aM13101h = f17121a.m16165f().m13101h(BlackBoardEntity.class);
        Intrinsics.checkNotNullExpressionValue(c5206aM13101h, "");
        QueryBuilder builder = c5206aM13101h.m2257n();
        Intrinsics.checkNotNullExpressionValue(builder, "builder");
        builder.m13160g(BlackBoardEntity_.f8538f, dirName);
        Query queryM13158a = builder.m13158a();
        Intrinsics.checkNotNullExpressionValue(queryM13158a, "builder.build()");
        BlackBoardEntity blackBoardEntity = (BlackBoardEntity) queryM13158a.m13152p();
        if (blackBoardEntity != null) {
            ToMany toManyM7415c = blackBoardEntity.m7415c();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(toManyM7415c, 10));
            Iterator<TARGET> it = toManyM7415c.iterator();
            while (it.hasNext()) {
                arrayList.add(((PageEntity) it.next()).getDirName());
            }
            c5206aM13101h.m2263t(blackBoardEntity);
            LogUtils.m2956i("BoardBox.kt -> [board: " + dirName + "] 已被清除");
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                C9685d c9685d = f17121a;
                C5206a c5206aM13101h2 = c9685d.m16165f().m13101h(PageEntity.class);
                Intrinsics.checkNotNullExpressionValue(c5206aM13101h2, "boxStore.boxFor(PageEntity::class.java)");
                QueryBuilder builder2 = c5206aM13101h2.m2257n();
                Intrinsics.checkNotNullExpressionValue(builder2, "builder");
                builder2.m13160g(PageEntity_.f8819f, (String) obj);
                Query queryM13158a2 = builder2.m13158a();
                Intrinsics.checkNotNullExpressionValue(queryM13158a2, "builder.build()");
                PageEntity it2 = (PageEntity) queryM13158a2.m13152p();
                if (it2 != null) {
                    Intrinsics.checkNotNullExpressionValue(it2, "it");
                    c9685d.m16164e(it2);
                }
            }
        }
    }

    /* renamed from: b */
    public final void m16163b(final String dirName, Context context) {
        Intrinsics.checkNotNullParameter(dirName, "dirName");
        if (context != null) {
            f17121a.m16166g(context);
        }
        m16165f().m13093G(new Runnable() { // from class: u5.c
            @Override // java.lang.Runnable
            public final void run() {
                C9685d.m16162d(dirName);
            }
        });
    }

    /* renamed from: e */
    public final void m16164e(PageEntity pageEntity) {
        Object objM24758constructorimpl;
        Intrinsics.checkNotNullParameter(pageEntity, "pageEntity");
        m16165f().m13101h(HeaderEntity.class).m2262s(pageEntity.m7613e().m13185n());
        LogUtils.m2956i("页面BoardBox.kt -> [page: " + pageEntity.getDirName() + "] header 已被清除");
        try {
            Result.Companion companion = Result.INSTANCE;
            RecordEntity recordEntity = (RecordEntity) pageEntity.m7615g().m13183g();
            Iterator<TARGET> it = recordEntity.m7630b().iterator();
            while (it.hasNext()) {
                m16165f().m13101h(CommandInfoEntity.class).m2261r(((CommandRecordEntity) it.next()).m7438a());
            }
            m16165f().m13101h(CommandRecordEntity.class).m2261r(recordEntity.m7630b());
            for (TouchRecordEntity touchRecordEntity : recordEntity.m7637i()) {
                Iterator<TARGET> it2 = touchRecordEntity.m7717c().iterator();
                while (it2.hasNext()) {
                    m16165f().m13101h(TouchInfoEntity.class).m2261r(((TouchEventEntity) it2.next()).m7693h());
                }
                m16165f().m13101h(TouchEventEntity.class).m2261r(touchRecordEntity.m7717c());
            }
            m16165f().m13101h(TouchRecordEntity.class).m2261r(recordEntity.m7637i());
            for (MatrixRecordEntity matrixRecordEntity : recordEntity.m7634f()) {
                Iterator<TARGET> it3 = matrixRecordEntity.m7584c().iterator();
                while (it3.hasNext()) {
                    m16165f().m13101h(MatrixInfoEntity.class).m2261r(((MatrixEventEntity) it3.next()).m7553b());
                }
                m16165f().m13101h(MatrixEventEntity.class).m2261r(matrixRecordEntity.m7584c());
            }
            m16165f().m13101h(MatrixRecordEntity.class).m2261r(recordEntity.m7634f());
            Iterator<TARGET> it4 = recordEntity.m7631c().iterator();
            while (it4.hasNext()) {
                m16165f().m13101h(FileInfoEntity.class).m2261r(((FileRecordEntity) it4.next()).m7464a());
            }
            m16165f().m13101h(FileRecordEntity.class).m2261r(recordEntity.m7631c());
            Iterator<TARGET> it5 = recordEntity.m7636h().iterator();
            while (it5.hasNext()) {
                m16165f().m13101h(TextInfoEntity.class).m2261r(((TextRecordEntity) it5.next()).m7675c());
            }
            m16165f().m13101h(TextRecordEntity.class).m2261r(recordEntity.m7636h());
            Iterator<TARGET> it6 = recordEntity.m7629a().iterator();
            while (it6.hasNext()) {
                m16165f().m13101h(AudioInfoEntity.class).m2261r(((AudioRecordEntity) it6.next()).m7373a());
            }
            m16165f().m13101h(AudioRecordEntity.class).m2261r(recordEntity.m7629a());
            objM24758constructorimpl = Result.m24758constructorimpl(Boolean.valueOf(m16165f().m13101h(RecordEntity.class).m2262s(pageEntity.m7615g().m13185n())));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM24758constructorimpl = Result.m24758constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM24761exceptionOrNullimpl = Result.m24761exceptionOrNullimpl(objM24758constructorimpl);
        if (thM24761exceptionOrNullimpl != null) {
            LogUtils.m2955e("BoardBox.kt -> clearPageData(), delete record failed " + thM24761exceptionOrNullimpl);
        }
        ResultKt.throwOnFailure(objM24758constructorimpl);
        m16165f().m13101h(RecordEntity.class).m2262s(pageEntity.m7615g().m13185n());
        LogUtils.m2956i("[page: " + pageEntity.getDirName() + "] record 已被清除");
        m16165f().m13101h(PageEntity.class).m2262s(pageEntity.getId());
        LogUtils.m2956i("[page: " + pageEntity.getDirName() + "] 已完全被清除");
    }

    /* renamed from: f */
    public final BoxStore m16165f() {
        BoxStore boxStore = f17122b;
        if (boxStore == null) {
            throw new UninitializedPropertyAccessException("boxStore not init");
        }
        Intrinsics.checkNotNull(boxStore);
        return boxStore;
    }

    /* renamed from: g */
    public final synchronized void m16166g(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (f17122b == null) {
            BoxStore boxStoreM2270b = AbstractC7054a.m7752y().m2269a(context.getApplicationContext()).m2275k(PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE).m2270b();
            Intrinsics.checkNotNullExpressionValue(boxStoreM2270b, "builder()\n              …\n                .build()");
            m16167h(boxStoreM2270b);
        }
    }

    /* renamed from: h */
    public final void m16167h(BoxStore boxStore) {
        f17122b = boxStore;
    }
}
