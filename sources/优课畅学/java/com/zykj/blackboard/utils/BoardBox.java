package com.zykj.blackboard.utils;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import com.blankj.utilcode.util.AbstractC5380q;
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
import io.objectbox.C8957a;
import io.objectbox.query.Query;
import io.objectbox.query.QueryBuilder;
import io.objectbox.relation.ToMany;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.UninitializedPropertyAccessException;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8811w;

/* loaded from: classes4.dex */
public final class BoardBox {
    public static final BoardBox INSTANCE = new BoardBox();
    private static BoxStore tempStore;

    private BoardBox() {
    }

    public static /* synthetic */ void clearLocalData$default(BoardBox boardBox, String str, Context context, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            context = null;
        }
        boardBox.clearLocalData(str, context);
    }

    private final void setBoxStore(BoxStore boxStore) {
        tempStore = boxStore;
    }

    public final boolean checkBoardFileExist(Context context, String path) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(path, "path");
        init(context);
        C8957a c8957aM15370d = getBoxStore().m15370d(BlackBoardEntity.class);
        AbstractC9133u.m16132f(c8957aM15370d, "boxStore.boxFor(BlackBoardEntity::class.java)");
        QueryBuilder builder = c8957aM15370d.m15416n();
        AbstractC9133u.m16132f(builder, "builder");
        builder.m15488c(BlackBoardEntity_.dir, path);
        Query queryM15486a = builder.m15486a();
        AbstractC9133u.m16132f(queryM15486a, "builder.build()");
        List listM15478j = queryM15486a.m15478j();
        AbstractC9133u.m16132f(listM15478j, "boxStore.boxFor(BlackBoa…r, path)\n        }.find()");
        Iterator it = listM15478j.iterator();
        while (it.hasNext()) {
            if (!((BlackBoardEntity) it.next()).getPages().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void clearLocalData(String dirName, Context context) {
        AbstractC9133u.m16133g(dirName, "dirName");
        if (context != null) {
            INSTANCE.init(context);
        }
        C8957a c8957aM15370d = getBoxStore().m15370d(BlackBoardEntity.class);
        AbstractC9133u.m16132f(c8957aM15370d, "");
        QueryBuilder builder = c8957aM15370d.m15416n();
        AbstractC9133u.m16132f(builder, "builder");
        builder.m15488c(BlackBoardEntity_.dir, dirName);
        Query queryM15486a = builder.m15486a();
        AbstractC9133u.m16132f(queryM15486a, "builder.build()");
        BlackBoardEntity blackBoardEntity = (BlackBoardEntity) queryM15486a.m15480l();
        if (blackBoardEntity != null) {
            ToMany<PageEntity> pages = blackBoardEntity.getPages();
            ArrayList<String> arrayList = new ArrayList(AbstractC8811w.m14786x(pages, 10));
            Iterator<PageEntity> it = pages.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getDirName());
            }
            c8957aM15370d.m15422t(blackBoardEntity);
            AbstractC5380q.m2623s("[board: " + dirName + "] 已被清除");
            for (String str : arrayList) {
                BoardBox boardBox = INSTANCE;
                C8957a c8957aM15370d2 = boardBox.getBoxStore().m15370d(PageEntity.class);
                AbstractC9133u.m16132f(c8957aM15370d2, "boxStore.boxFor(PageEntity::class.java)");
                QueryBuilder builder2 = c8957aM15370d2.m15416n();
                AbstractC9133u.m16132f(builder2, "builder");
                builder2.m15488c(PageEntity_.dirName, str);
                Query queryM15486a2 = builder2.m15486a();
                AbstractC9133u.m16132f(queryM15486a2, "builder.build()");
                PageEntity it2 = (PageEntity) queryM15486a2.m15480l();
                if (it2 != null) {
                    AbstractC9133u.m16132f(it2, "it");
                    boardBox.clearPageData(it2);
                }
            }
        }
    }

    public final void clearPageData(PageEntity pageEntity) {
        AbstractC9133u.m16133g(pageEntity, "pageEntity");
        getBoxStore().m15370d(HeaderEntity.class).m15421s(pageEntity.getHeaderEntity().m15513e());
        AbstractC5380q.m2623s("[page: " + pageEntity.getDirName() + "] header 已被清除");
        RecordEntity recordEntity = (RecordEntity) pageEntity.getRecordEntity().m15511c();
        Iterator<CommandRecordEntity> it = recordEntity.getCommandList().iterator();
        while (it.hasNext()) {
            INSTANCE.getBoxStore().m15370d(CommandInfoEntity.class).m15420r(it.next().getCommandInfoEntity());
        }
        INSTANCE.getBoxStore().m15370d(CommandRecordEntity.class).m15420r(recordEntity.getCommandList());
        for (TouchRecordEntity touchRecordEntity : recordEntity.getTouchList()) {
            Iterator<TouchEventEntity> it2 = touchRecordEntity.getTouchEventList().iterator();
            while (it2.hasNext()) {
                INSTANCE.getBoxStore().m15370d(TouchInfoEntity.class).m15420r(it2.next().getTouchInfoList());
            }
            INSTANCE.getBoxStore().m15370d(TouchEventEntity.class).m15420r(touchRecordEntity.getTouchEventList());
        }
        INSTANCE.getBoxStore().m15370d(TouchRecordEntity.class).m15420r(recordEntity.getTouchList());
        for (MatrixRecordEntity matrixRecordEntity : recordEntity.getMatrixList()) {
            Iterator<MatrixEventEntity> it3 = matrixRecordEntity.getMatrixEventEntity().iterator();
            while (it3.hasNext()) {
                INSTANCE.getBoxStore().m15370d(MatrixInfoEntity.class).m15420r(it3.next().getMatrixInfo());
            }
            INSTANCE.getBoxStore().m15370d(MatrixEventEntity.class).m15420r(matrixRecordEntity.getMatrixEventEntity());
        }
        INSTANCE.getBoxStore().m15370d(MatrixRecordEntity.class).m15420r(recordEntity.getMatrixList());
        Iterator<FileRecordEntity> it4 = recordEntity.getFileList().iterator();
        while (it4.hasNext()) {
            INSTANCE.getBoxStore().m15370d(FileInfoEntity.class).m15420r(it4.next().getFileInfoEntity());
        }
        INSTANCE.getBoxStore().m15370d(FileRecordEntity.class).m15420r(recordEntity.getFileList());
        Iterator<TextRecordEntity> it5 = recordEntity.getTextList().iterator();
        while (it5.hasNext()) {
            INSTANCE.getBoxStore().m15370d(TextInfoEntity.class).m15420r(it5.next().getTextInfoEntityList());
        }
        INSTANCE.getBoxStore().m15370d(TextRecordEntity.class).m15420r(recordEntity.getTextList());
        Iterator<AudioRecordEntity> it6 = recordEntity.getAudioList().iterator();
        while (it6.hasNext()) {
            INSTANCE.getBoxStore().m15370d(AudioInfoEntity.class).m15420r(it6.next().getAudioInfoEntity());
        }
        INSTANCE.getBoxStore().m15370d(AudioRecordEntity.class).m15420r(recordEntity.getAudioList());
        getBoxStore().m15370d(RecordEntity.class).m15421s(pageEntity.getRecordEntity().m15513e());
        AbstractC5380q.m2623s("[page: " + pageEntity.getDirName() + "] record 已被清除");
        getBoxStore().m15370d(PageEntity.class).m15421s(pageEntity.getId());
        AbstractC5380q.m2623s("[page: " + pageEntity.getDirName() + "] 已完全被清除");
    }

    public final BoxStore getBoxStore() {
        BoxStore boxStore = tempStore;
        if (boxStore == null) {
            throw new UninitializedPropertyAccessException("boxStore not init");
        }
        AbstractC9133u.m16130d(boxStore);
        return boxStore;
    }

    public final synchronized void init(Context context) {
        AbstractC9133u.m16133g(context, "context");
        if (tempStore == null) {
            BoxStore boxStoreM15431b = MyObjectBox.builder().m15430a(context.getApplicationContext()).m15438m(PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE).m15431b();
            AbstractC9133u.m16132f(boxStoreM15431b, "builder()\n              …\n                .build()");
            setBoxStore(boxStoreM15431b);
        }
    }

    public final synchronized void init(File testFile) {
        AbstractC9133u.m16133g(testFile, "testFile");
        if (tempStore == null) {
            BoxStore boxStoreM15431b = MyObjectBox.builder().m15435g(testFile).m15434f(0).m15431b();
            AbstractC9133u.m16132f(boxStoreM15431b, "builder()\n              …\n                .build()");
            setBoxStore(boxStoreM15431b);
        }
    }
}
