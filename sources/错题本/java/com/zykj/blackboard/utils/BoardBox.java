package com.zykj.blackboard.utils;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.AbstractC3387g;
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
import com.zykj.blackboard.core.data.dao.MyObjectBox;
import com.zykj.blackboard.core.data.dao.PageEntity;
import com.zykj.blackboard.core.data.dao.PageEntity_;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.blackboard.core.data.dao.TextInfoEntity;
import com.zykj.blackboard.core.data.dao.TextRecordEntity;
import com.zykj.blackboard.core.data.dao.TouchEventEntity;
import com.zykj.blackboard.core.data.dao.TouchInfoEntity;
import com.zykj.blackboard.core.data.dao.TouchRecordEntity;
import io.objectbox.BoxStore;
import io.objectbox.C5696a;
import io.objectbox.C5698b;
import io.objectbox.query.QueryBuilder;
import io.objectbox.relation.ToMany;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.UninitializedPropertyAccessException;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0007\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010 \u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00188F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, m5110d2 = {"Lcom/zykj/blackboard/utils/BoardBox;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ld6/s;", "init", "(Landroid/content/Context;)V", "", "dirName", "clearLocalData", "(Ljava/lang/String;Landroid/content/Context;)V", "Lcom/zykj/blackboard/core/data/dao/PageEntity;", "pageEntity", "clearPageData", "(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V", "path", "", "checkBoardFileExist", "(Landroid/content/Context;Ljava/lang/String;)Z", "Ljava/io/File;", "testFile", "(Ljava/io/File;)V", "Lio/objectbox/BoxStore;", "tempStore", "Lio/objectbox/BoxStore;", "value", "getBoxStore", "()Lio/objectbox/BoxStore;", "setBoxStore", "(Lio/objectbox/BoxStore;)V", "boxStore", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class BoardBox {

    @NotNull
    public static final BoardBox INSTANCE = new BoardBox();

    @Nullable
    private static BoxStore tempStore;

    private BoardBox() {
    }

    public static /* synthetic */ void clearLocalData$default(BoardBox boardBox, String str, Context context, int i, Object obj) {
        if ((i & 2) != 0) {
            context = null;
        }
        boardBox.clearLocalData(str, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: clearLocalData$lambda-8, reason: not valid java name */
    public static final void m13813clearLocalData$lambda8(String dirName) {
        AbstractC5830k.m5330g(dirName, "$dirName");
        C5696a c5696aM5018c = INSTANCE.getBoxStore().m5018c(BlackBoardEntity.class);
        QueryBuilder queryBuilderM5036g = c5696aM5018c.m5036g();
        queryBuilderM5036g.m5064b(BlackBoardEntity_.dir, dirName);
        BlackBoardEntity blackBoardEntity = (BlackBoardEntity) queryBuilderM5036g.m5063a().m5062c();
        if (blackBoardEntity != null) {
            ToMany<PageEntity> pages = blackBoardEntity.getPages();
            ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(pages, 10));
            Iterator<PageEntity> it = pages.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getDirName());
            }
            c5696aM5018c.m5039j(blackBoardEntity);
            AbstractC3387g.m2342e("BoardBox.kt -> [board: " + dirName + "] 已被清除");
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                BoardBox boardBox = INSTANCE;
                QueryBuilder queryBuilderM5036g2 = boardBox.getBoxStore().m5018c(PageEntity.class).m5036g();
                queryBuilderM5036g2.m5064b(PageEntity_.dirName, (String) obj);
                PageEntity pageEntity = (PageEntity) queryBuilderM5036g2.m5063a().m5062c();
                if (pageEntity != null) {
                    boardBox.clearPageData(pageEntity);
                }
            }
        }
    }

    private final void setBoxStore(BoxStore boxStore) {
        tempStore = boxStore;
    }

    public final boolean checkBoardFileExist(@NotNull Context context, @NotNull String path) {
        AbstractC5830k.m5330g(context, "context");
        AbstractC5830k.m5330g(path, "path");
        init(context);
        QueryBuilder queryBuilderM5036g = getBoxStore().m5018c(BlackBoardEntity.class).m5036g();
        queryBuilderM5036g.m5064b(BlackBoardEntity_.dir, path);
        List listM5061b = queryBuilderM5036g.m5063a().m5061b();
        AbstractC5830k.m5329f(listM5061b, "boxStore.boxFor(BlackBoa…r, path)\n        }.find()");
        Iterator it = listM5061b.iterator();
        while (it.hasNext()) {
            if (!((BlackBoardEntity) it.next()).getPages().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void clearLocalData(@NotNull String dirName, @Nullable Context context) {
        AbstractC5830k.m5330g(dirName, "dirName");
        if (context != null) {
            INSTANCE.init(context);
        }
        getBoxStore().m5021h(new RunnableC4349a(dirName, 0));
    }

    public final void clearPageData(@NotNull PageEntity pageEntity) {
        Object objM13956constructorimpl;
        AbstractC5830k.m5330g(pageEntity, "pageEntity");
        getBoxStore().m5018c(HeaderEntity.class).m5041l(pageEntity.getHeaderEntity().getTargetId());
        AbstractC3387g.m2342e("页面BoardBox.kt -> [page: " + pageEntity.getDirName() + "] header 已被清除");
        try {
            RecordEntity target = pageEntity.getRecordEntity().getTarget();
            Iterator<CommandRecordEntity> it = target.getCommandList().iterator();
            while (it.hasNext()) {
                getBoxStore().m5018c(CommandInfoEntity.class).m5040k(it.next().getCommandInfoEntity());
            }
            getBoxStore().m5018c(CommandRecordEntity.class).m5040k(target.getCommandList());
            for (TouchRecordEntity touchRecordEntity : target.getTouchList()) {
                Iterator<TouchEventEntity> it2 = touchRecordEntity.getTouchEventList().iterator();
                while (it2.hasNext()) {
                    getBoxStore().m5018c(TouchInfoEntity.class).m5040k(it2.next().getTouchInfoList());
                }
                getBoxStore().m5018c(TouchEventEntity.class).m5040k(touchRecordEntity.getTouchEventList());
            }
            getBoxStore().m5018c(TouchRecordEntity.class).m5040k(target.getTouchList());
            for (MatrixRecordEntity matrixRecordEntity : target.getMatrixList()) {
                Iterator<MatrixEventEntity> it3 = matrixRecordEntity.getMatrixEventEntity().iterator();
                while (it3.hasNext()) {
                    getBoxStore().m5018c(MatrixInfoEntity.class).m5040k(it3.next().getMatrixInfo());
                }
                getBoxStore().m5018c(MatrixEventEntity.class).m5040k(matrixRecordEntity.getMatrixEventEntity());
            }
            getBoxStore().m5018c(MatrixRecordEntity.class).m5040k(target.getMatrixList());
            Iterator<FileRecordEntity> it4 = target.getFileList().iterator();
            while (it4.hasNext()) {
                getBoxStore().m5018c(FileInfoEntity.class).m5040k(it4.next().getFileInfoEntity());
            }
            getBoxStore().m5018c(FileRecordEntity.class).m5040k(target.getFileList());
            Iterator<TextRecordEntity> it5 = target.getTextList().iterator();
            while (it5.hasNext()) {
                getBoxStore().m5018c(TextInfoEntity.class).m5040k(it5.next().getTextInfoEntityList());
            }
            getBoxStore().m5018c(TextRecordEntity.class).m5040k(target.getTextList());
            Iterator<AudioRecordEntity> it6 = target.getAudioList().iterator();
            while (it6.hasNext()) {
                getBoxStore().m5018c(AudioInfoEntity.class).m5040k(it6.next().getAudioInfoEntity());
            }
            getBoxStore().m5018c(AudioRecordEntity.class).m5040k(target.getAudioList());
            objM13956constructorimpl = Result.m13956constructorimpl(Boolean.valueOf(getBoxStore().m5018c(RecordEntity.class).m5041l(pageEntity.getRecordEntity().getTargetId())));
        } catch (Throwable th) {
            objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
        }
        Throwable thM13959exceptionOrNullimpl = Result.m13959exceptionOrNullimpl(objM13956constructorimpl);
        if (thM13959exceptionOrNullimpl != null) {
            AbstractC3387g.m2339b("BoardBox.kt -> clearPageData(), delete record failed " + thM13959exceptionOrNullimpl);
        }
        AbstractC5774b.m5119b(objM13956constructorimpl);
        getBoxStore().m5018c(RecordEntity.class).m5041l(pageEntity.getRecordEntity().getTargetId());
        AbstractC3387g.m2342e("[page: " + pageEntity.getDirName() + "] record 已被清除");
        getBoxStore().m5018c(PageEntity.class).m5041l(pageEntity.getId());
        AbstractC3387g.m2342e("[page: " + pageEntity.getDirName() + "] 已完全被清除");
    }

    @NotNull
    public final BoxStore getBoxStore() {
        BoxStore boxStore = tempStore;
        if (boxStore == null) {
            throw new UninitializedPropertyAccessException("boxStore not init");
        }
        AbstractC5830k.m5327d(boxStore);
        return boxStore;
    }

    public final synchronized void init(@NotNull Context context) {
        AbstractC5830k.m5330g(context, "context");
        if (tempStore == null) {
            C5698b c5698bBuilder = MyObjectBox.builder();
            c5698bBuilder.m5043a(context.getApplicationContext());
            c5698bBuilder.f8932e = 2097152L;
            setBoxStore(c5698bBuilder.m5044b());
        }
    }

    public final synchronized void init(@NotNull File testFile) {
        try {
            AbstractC5830k.m5330g(testFile, "testFile");
            if (tempStore == null) {
                C5698b c5698bBuilder = MyObjectBox.builder();
                if (c5698bBuilder.f8931d == null) {
                    if (!c5698bBuilder.f8934g && c5698bBuilder.f8930c != null) {
                        throw new IllegalArgumentException("Already has base directory, cannot assign directory");
                    }
                    c5698bBuilder.f8929b = testFile;
                    setBoxStore(c5698bBuilder.m5044b());
                } else {
                    throw new IllegalArgumentException("Already has name, cannot assign directory");
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
