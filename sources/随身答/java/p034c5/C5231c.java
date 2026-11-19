package p034c5;

import com.blankj.utilcode.util.LogUtils;
import com.google.protobuf.ByteString;
import com.zykj.blackboard.core.data.dao.AudioInfoEntity;
import com.zykj.blackboard.core.data.dao.AudioRecordEntity;
import com.zykj.blackboard.core.data.dao.AuthorEntity;
import com.zykj.blackboard.core.data.dao.BackgroundLineConfigEntity;
import com.zykj.blackboard.core.data.dao.BlackBoardEntity;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.blackboard.core.data.dao.CommandRecordEntity;
import com.zykj.blackboard.core.data.dao.FileInfoEntity;
import com.zykj.blackboard.core.data.dao.FileRecordEntity;
import com.zykj.blackboard.core.data.dao.GeometryInfoEntity;
import com.zykj.blackboard.core.data.dao.GeometryPointFEntity;
import com.zykj.blackboard.core.data.dao.GeometryRecordEntity;
import com.zykj.blackboard.core.data.dao.HeaderEntity;
import com.zykj.blackboard.core.data.dao.MatrixEventEntity;
import com.zykj.blackboard.core.data.dao.MatrixInfoEntity;
import com.zykj.blackboard.core.data.dao.MatrixRecordEntity;
import com.zykj.blackboard.core.data.dao.MoveConfigEntity;
import com.zykj.blackboard.core.data.dao.PageEntity;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.blackboard.core.data.dao.TextInfoEntity;
import com.zykj.blackboard.core.data.dao.TextRecordEntity;
import com.zykj.blackboard.core.data.dao.TouchEventEntity;
import com.zykj.blackboard.core.data.dao.TouchInfoEntity;
import com.zykj.blackboard.core.data.dao.TouchRecordEntity;
import com.zykj.blackboard.utils.FileValidateUtils;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyHeader;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyPageRouter;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzyPointF;
import com.zykj.board.EzyRouterRecord;
import com.zykj.board.EzySource;
import com.zykj.board.EzyTouchEvent;
import java.io.File;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p263u5.C9692k;

/* renamed from: c5.c */
/* loaded from: classes4.dex */
public final class C5231c {

    /* renamed from: a */
    public static final C5231c f2465a = new C5231c();

    /* renamed from: a */
    public final EzyHeader.Author m2379a(AuthorEntity authorEntity) {
        EzyHeader.Author.C7100b c7100bM8622E = EzyHeader.Author.m8622E();
        String authorName = authorEntity.getAuthorName();
        if (authorName != null) {
            c7100bM8622E.m8658r(authorName);
        }
        String authorId = authorEntity.getAuthorId();
        if (authorId != null) {
            c7100bM8622E.m8657q(authorId);
        }
        String schoolId = authorEntity.getSchoolId();
        if (schoolId != null) {
            c7100bM8622E.m8662v(schoolId);
        }
        String url = authorEntity.getUrl();
        if (url != null) {
            c7100bM8622E.m8665y(url);
        }
        Long startTime = authorEntity.getStartTime();
        if (startTime != null) {
            c7100bM8622E.m8663w(startTime.longValue());
        }
        Long duration = authorEntity.getDuration();
        if (duration != null) {
            c7100bM8622E.m8659s(duration.longValue());
        }
        EzyHeader.Author authorBuild = c7100bM8622E.build();
        Intrinsics.checkNotNullExpressionValue(authorBuild, "newBuilder().apply {\n   …      }\n        }.build()");
        return authorBuild;
    }

    /* renamed from: b */
    public final EzyHeader.BackgroundLineConfig m2380b(BackgroundLineConfigEntity backgroundLineConfigEntity) { // 页头写回：只编码颜色、间距与类型。录制时的显式线宽位于 ACTION_CONFIG 命令中。
        EzyHeader.BackgroundLineConfig.C7102b c7102bM8672z = EzyHeader.BackgroundLineConfig.m8672z();
        c7102bM8672z.m8697r(backgroundLineConfigEntity.getLineColor());
        c7102bM8672z.m8698s(backgroundLineConfigEntity.getLineSpace());
        c7102bM8672z.m8699t(backgroundLineConfigEntity.getLineType());
        EzyHeader.BackgroundLineConfig backgroundLineConfigBuild = c7102bM8672z.build();
        Intrinsics.checkNotNullExpressionValue(backgroundLineConfigBuild, "newBuilder().apply {\n   …ineType\n        }.build()");
        return backgroundLineConfigBuild;
    }

    /* renamed from: c */
    public final EzyHeader.MoveConfig m2381c(MoveConfigEntity moveConfigEntity) {
        EzyHeader.MoveConfig.C7106b c7106bM8792D = EzyHeader.MoveConfig.m8792D();
        c7106bM8792D.m8828s(moveConfigEntity.getIsEnable());
        c7106bM8792D.m8835z(moveConfigEntity.getVerticalTranslate());
        c7106bM8792D.m8827r(moveConfigEntity.getHorizontalTranslate());
        c7106bM8792D.m8833x(moveConfigEntity.getScale());
        c7106bM8792D.m8832w(moveConfigEntity.getRotate());
        c7106bM8792D.m8829t(moveConfigEntity.getMaxHeightTimes());
        c7106bM8792D.m8830u(moveConfigEntity.getMaxWidthTimes());
        EzyHeader.MoveConfig moveConfigBuild = c7106bM8792D.build();
        Intrinsics.checkNotNullExpressionValue(moveConfigBuild, "newBuilder().apply {\n   …thTimes\n        }.build()");
        return moveConfigBuild;
    }

    /* renamed from: d */
    public final void m2382d(String pagePath, AudioRecordEntity record) throws Throwable {
        String strM8016a;
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        Intrinsics.checkNotNullParameter(record, "record");
        EzyCommand.CommandSource.C7094b c7094bM8057u = EzyCommand.CommandSource.m8057u();
        for (AudioInfoEntity audioInfoEntity : record.m7373a()) {
            EzyCommand.CommandSource.CommandInfo.C7092b c7092bM8065B = EzyCommand.CommandSource.CommandInfo.m8065B();
            c7092bM8065B.m8570t(audioInfoEntity.getDelayTime());
            c7092bM8065B.m8571u(audioInfoEntity.getDuration());
            c7092bM8065B.m8573w(audioInfoEntity.getIsPlay());
            c7092bM8065B.m8567q(audioInfoEntity.getCommandEnum());
            c7092bM8065B.m8569s(ByteString.copyFrom(audioInfoEntity.getData()));
            c7094bM8057u.m8577b(c7092bM8065B);
        }
        if (c7094bM8057u.m8588o() <= 0) {
            LogUtils.m2956i("[SourceSave]: saveAudio-> [" + record.getFileName() + "]commandInfoCount==0");
            return;
        }
        C9692k c9692k = C9692k.f17130a;
        String fileName = record.getFileName();
        EzyCommand.CommandSource commandSourceBuild = c7094bM8057u.build();
        Intrinsics.checkNotNullExpressionValue(commandSourceBuild, "audioRecord.build()");
        File fileM16187d = c9692k.m16187d(pagePath, fileName, commandSourceBuild);
        if (fileM16187d == null || (strM8016a = FileValidateUtils.f9141a.m8016a(fileM16187d, FileValidateUtils.TypeEnum.SHA256)) == null) {
            return;
        }
        record.m7379g(strM8016a);
    }

    /* renamed from: e */
    public final void m2383e(String pagePath, CommandRecordEntity record) throws Throwable {
        String strM8016a;
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        Intrinsics.checkNotNullParameter(record, "record");
        EzyCommand.CommandSource.C7094b c7094bM8057u = EzyCommand.CommandSource.m8057u();
        for (CommandInfoEntity commandInfoEntity : record.m7438a()) {
            EzyCommand.CommandSource.CommandInfo.C7092b c7092bM8065B = EzyCommand.CommandSource.CommandInfo.m8065B();
            c7092bM8065B.m8570t(commandInfoEntity.getDelayTime());
            c7092bM8065B.m8571u(commandInfoEntity.getDuration());
            c7092bM8065B.m8573w(commandInfoEntity.getIsPlay());
            c7092bM8065B.m8567q(commandInfoEntity.getCommandEnum());
            c7092bM8065B.m8569s(ByteString.copyFrom(commandInfoEntity.getData()));
            c7094bM8057u.m8577b(c7092bM8065B);
        }
        if (c7094bM8057u.m8588o() <= 0) {
            LogUtils.m2956i("[SourceSave]: saveCommand-> [" + record.getFileName() + "]commandInfoCount==0");
            return;
        }
        C9692k c9692k = C9692k.f17130a;
        String fileName = record.getFileName();
        EzyCommand.CommandSource commandSourceBuild = c7094bM8057u.build();
        Intrinsics.checkNotNullExpressionValue(commandSourceBuild, "commandRecord.build()");
        File fileM16187d = c9692k.m16187d(pagePath, fileName, commandSourceBuild);
        if (fileM16187d == null || (strM8016a = FileValidateUtils.f9141a.m8016a(fileM16187d, FileValidateUtils.TypeEnum.SHA256)) == null) {
            return;
        }
        record.m7444g(strM8016a);
    }

    /* renamed from: f */
    public final void m2384f(String pagePath, FileRecordEntity record) throws Throwable {
        String strM8016a;
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        Intrinsics.checkNotNullParameter(record, "record");
        EzySource.FileSource.C7141b c7141bM9343u = EzySource.FileSource.m9343u();
        for (FileInfoEntity fileInfoEntity : record.m7464a()) {
            EzySource.FileSource.FileInfo.C7139b c7139bM9358w = EzySource.FileSource.FileInfo.m9358w();
            c7139bM9358w.m9380s(fileInfoEntity.getFileName());
            c7139bM9358w.m9383v(fileInfoEntity.getValidate());
            c7141bM9343u.m9386b(c7139bM9358w);
        }
        if (c7141bM9343u.m9398p() <= 0) {
            LogUtils.m2956i("[SourceSave]: saveFile-> [" + record.getFileName() + "]fileInfoCount==0");
            return;
        }
        C9692k c9692k = C9692k.f17130a;
        String fileName = record.getFileName();
        EzySource.FileSource fileSourceBuild = c7141bM9343u.build();
        Intrinsics.checkNotNullExpressionValue(fileSourceBuild, "fileRecord.build()");
        File fileM16187d = c9692k.m16187d(pagePath, fileName, fileSourceBuild);
        if (fileM16187d == null || (strM8016a = FileValidateUtils.f9141a.m8016a(fileM16187d, FileValidateUtils.TypeEnum.SHA256)) == null) {
            return;
        }
        record.m7470g(strM8016a);
    }

    /* renamed from: g */
    public final void m2385g(String pagePath, GeometryRecordEntity record) throws Throwable {
        String strM8016a;
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        Intrinsics.checkNotNullParameter(record, "record");
        EzySource.GeometrySource.C7145b c7145bM9410t = EzySource.GeometrySource.m9410t();
        for (GeometryInfoEntity geometryInfoEntity : record.m7505b()) {
            EzySource.GeometrySource.GeometryInfo.C7143b c7143bM9418A = EzySource.GeometrySource.GeometryInfo.m9418A();
            c7143bM9418A.m9457x(geometryInfoEntity.getGeometryType());
            EzyPaint.Paint.C7123b c7123bM9100z = EzyPaint.Paint.m9100z();
            c7123bM9100z.m9123q(geometryInfoEntity.getColor());
            c7123bM9100z.m9131y(geometryInfoEntity.getWidth());
            c7123bM9100z.m9129w(geometryInfoEntity.getTextSize());
            c7123bM9100z.m9128v(geometryInfoEntity.getStyle());
            c7143bM9418A.m9458y(c7123bM9100z.build());
            for (GeometryPointFEntity geometryPointFEntity : geometryInfoEntity.m7480d()) {
                EzyPointF.PointF.C7126b c7126bM9138n = EzyPointF.PointF.m9138n();
                c7126bM9138n.m9160t(geometryPointFEntity.getX());
                c7126bM9138n.m9161u(geometryPointFEntity.getY());
                c7143bM9418A.m9438b(c7126bM9138n.build());
            }
            c7145bM9410t.m9461b(c7143bM9418A);
        }
        if (c7145bM9410t.m9473p() <= 0) {
            LogUtils.m2956i("[SourceSave]: saveGeometry-> [" + record.getFileName() + "]geometryInfoCount==0");
            return;
        }
        C9692k c9692k = C9692k.f17130a;
        String fileName = record.getFileName();
        EzySource.GeometrySource geometrySourceBuild = c7145bM9410t.build();
        Intrinsics.checkNotNullExpressionValue(geometrySourceBuild, "geometryRecord.build()");
        File fileM16187d = c9692k.m16187d(pagePath, fileName, geometrySourceBuild);
        if (fileM16187d == null || (strM8016a = FileValidateUtils.f9141a.m8016a(fileM16187d, FileValidateUtils.TypeEnum.SHA256)) == null) {
            return;
        }
        record.m7510g(strM8016a);
    }

    /* renamed from: h */
    public final void m2386h(PageEntity pageEntity, String path) throws Throwable {
        Intrinsics.checkNotNullParameter(pageEntity, "pageEntity");
        Intrinsics.checkNotNullParameter(path, "path");
        LogUtils.m2954d("页面SourceSave：开始保存Header.bin文件");
        HeaderEntity headerEntity = (HeaderEntity) pageEntity.m7613e().m13183g();
        EzyHeader.Header.C7104b c7104bM8710V = EzyHeader.Header.m8710V();
        c7104bM8710V.m8768X(headerEntity.getVersion());
        c7104bM8710V.m8769Y(headerEntity.getWidth());
        c7104bM8710V.m8761Q(headerEntity.getHeight());
        c7104bM8710V.m8756L(headerEntity.getCreateDate());
        c7104bM8710V.m8767W(headerEntity.getUpdateDate());
        c7104bM8710V.m8759O(headerEntity.getDuration());
        c7104bM8710V.m8757M(headerEntity.getDefaultBackgroundColor());
        c7104bM8710V.m8762R(headerEntity.getLastBackgroundColor());
        AuthorEntity authorEntity = (AuthorEntity) headerEntity.m7517a().m13183g();
        if (authorEntity != null) {
            c7104bM8710V.m8755K(f2465a.m2379a(authorEntity));
        }
        MoveConfigEntity moveConfigEntity = (MoveConfigEntity) headerEntity.m7527k().m13183g();
        if (moveConfigEntity != null) {
            c7104bM8710V.m8764T(f2465a.m2381c(moveConfigEntity));
        }
        BackgroundLineConfigEntity backgroundLineConfigEntity = (BackgroundLineConfigEntity) headerEntity.m7521e().m13183g();
        if (backgroundLineConfigEntity != null) {
            c7104bM8710V.m8758N(f2465a.m2380b(backgroundLineConfigEntity));
        }
        BackgroundLineConfigEntity backgroundLineConfigEntity2 = (BackgroundLineConfigEntity) headerEntity.m7526j().m13183g();
        if (backgroundLineConfigEntity2 != null) {
            c7104bM8710V.m8763S(f2465a.m2380b(backgroundLineConfigEntity2));
        }
        for (AuthorEntity it : headerEntity.m7529m()) {
            C5231c c5231c = f2465a;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c7104bM8710V.m8770b(c5231c.m2379a(it));
        }
        C9692k c9692k = C9692k.f17130a;
        String absolutePath = new File(path, pageEntity.getDirName()).getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "File(path, pageEntity.dirName).absolutePath");
        EzyHeader.Header headerBuild = c7104bM8710V.build();
        Intrinsics.checkNotNullExpressionValue(headerBuild, "header.build()");
        c9692k.m16187d(absolutePath, "header.bin", headerBuild);
        LogUtils.m2954d("页面SourceSave：保存Header.bin文件结束，路径是" + new File(path, pageEntity.getDirName()).getAbsolutePath());
    }

    /* renamed from: i */
    public final void m2387i(String pagePath, MatrixRecordEntity record) throws Throwable {
        String strM8016a;
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        Intrinsics.checkNotNullParameter(record, "record");
        EzySource.MatrixSource.C7149b c7149bM9485t = EzySource.MatrixSource.m9485t();
        for (MatrixEventEntity matrixEventEntity : record.m7584c()) {
            EzySource.MatrixSource.MatrixInfo.C7147b c7147bM9497q = EzySource.MatrixSource.MatrixInfo.m9497q();
            for (MatrixInfoEntity matrixInfoEntity : matrixEventEntity.m7553b()) {
                EzyMatrix.Matrix.C7109b c7109bM8839G = EzyMatrix.Matrix.m8839G();
                c7109bM8839G.m8879q(matrixInfoEntity.getEventTime());
                c7109bM8839G.m8885w(matrixInfoEntity.getScaleX());
                c7109bM8839G.m8887y(matrixInfoEntity.getSkewX());
                c7109bM8839G.m8863A(matrixInfoEntity.getTransX());
                c7109bM8839G.m8888z(matrixInfoEntity.getSkewY());
                c7109bM8839G.m8886x(matrixInfoEntity.getScaleY());
                c7109bM8839G.m8864B(matrixInfoEntity.getTransY());
                c7109bM8839G.m8881s(matrixInfoEntity.getPerSp0());
                c7109bM8839G.m8882t(matrixInfoEntity.getPerSp1());
                c7109bM8839G.m8883u(matrixInfoEntity.getPerSp2());
                c7147bM9497q.m9504d(c7109bM8839G.build());
            }
            c7149bM9485t.m9524b(c7147bM9497q.build());
        }
        if (c7149bM9485t.m9536p() <= 0) {
            LogUtils.m2956i("[SourceSave]: saveMatrix-> [" + record.getFileName() + "]matrixInfoCount==0");
            return;
        }
        C9692k c9692k = C9692k.f17130a;
        String fileName = record.getFileName();
        EzySource.MatrixSource matrixSourceBuild = c7149bM9485t.build();
        Intrinsics.checkNotNullExpressionValue(matrixSourceBuild, "matrixRecord.build()");
        File fileM16187d = c9692k.m16187d(pagePath, fileName, matrixSourceBuild);
        if (fileM16187d == null || (strM8016a = FileValidateUtils.f9141a.m8016a(fileM16187d, FileValidateUtils.TypeEnum.SHA256)) == null) {
            return;
        }
        record.m7588g(strM8016a);
    }

    /* renamed from: j */
    public final void m2388j(BlackBoardEntity boardEntity, List pagePathList) {
        Intrinsics.checkNotNullParameter(boardEntity, "boardEntity");
        Intrinsics.checkNotNullParameter(pagePathList, "pagePathList");
        String strM7413a = boardEntity.getDir();
        if (strM7413a == null) {
            return;
        }
        EzyPageRouter.PageRouter.C7115b c7115bM8902t = EzyPageRouter.PageRouter.m8902t();
        int i9 = 0;
        for (Object obj : boardEntity.m7415c()) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            PageEntity pageEntity = (PageEntity) obj;
            LogUtils.m2954d("页面SourceSave: saveRecord-> 第" + i9 + "条 => " + pageEntity.getDirName() + "开始执行保存操作");
            if (pagePathList.contains(pageEntity.getDirName())) {
                EzyPageRouter.PageRouter.PageInfo.C7113b c7113bM8914t = EzyPageRouter.PageRouter.PageInfo.m8914t();
                c7113bM8914t.m8936s(i9);
                c7113bM8914t.m8935r(pageEntity.getDirName());
                c7115bM8902t.m8940b(c7113bM8914t);
                C5231c c5231c = f2465a;
                Intrinsics.checkNotNullExpressionValue(pageEntity, "pageEntity");
                c5231c.m2386h(pageEntity, strM7413a);
                c5231c.m2389k(pageEntity, strM7413a);
                LogUtils.m2954d("页面SourceSave: saveRecord-> 第" + i9 + "条 => " + pageEntity.getDirName() + " 结束");
            }
            i9 = i10;
        }
        C9692k c9692k = C9692k.f17130a;
        EzyPageRouter.PageRouter pageRouterBuild = c7115bM8902t.build();
        Intrinsics.checkNotNullExpressionValue(pageRouterBuild, "pageRecord.build()");
        c9692k.m16187d(strM7413a, "page_router.bin", pageRouterBuild);
        LogUtils.m2954d("页面SourceSave: saveRecord-> 结束,page_route.bin文件保存结束");
    }

    /* renamed from: k */
    public final void m2389k(PageEntity pageEntity, String path) throws Throwable {
        Intrinsics.checkNotNullParameter(pageEntity, "pageEntity");
        Intrinsics.checkNotNullParameter(path, "path");
        EzyRouterRecord.RouterRecord.C7135b c7135bM9211U = EzyRouterRecord.RouterRecord.m9211U();
        String pagePath = new File(path, pageEntity.getDirName()).getAbsolutePath();
        RecordEntity recordEntity = (RecordEntity) pageEntity.m7615g().m13183g();
        for (CommandRecordEntity it : recordEntity.m7630b()) {
            LogUtils.m2954d("页面SourceSave: 开始保存commandList文件:" + it.getFileName());
            if (!it.m7438a().isEmpty()) {
                C5231c c5231c = f2465a;
                Intrinsics.checkNotNullExpressionValue(pagePath, "pagePath");
                Intrinsics.checkNotNullExpressionValue(it, "it");
                c5231c.m2383e(pagePath, it);
                LogUtils.m2954d("页面SourceSave: saveRouter-> command:" + it.getFileName() + ", validate:" + it.getValidate());
                EzyRouterRecord.RouterRecord.SourceCommandRecord.C7133b c7133bM9249u = EzyRouterRecord.RouterRecord.SourceCommandRecord.m9249u();
                c7133bM9249u.m9270r(it.getFileName());
                c7133bM9249u.m9273u(it.getValidate());
                c7135bM9211U.m9291d(c7133bM9249u);
            }
        }
        for (FileRecordEntity it2 : recordEntity.m7631c()) {
            LogUtils.m2954d("页面SourceSave: 开始保存file文件-> file:" + it2.getFileName());
            if (!it2.m7464a().isEmpty()) {
                C5231c c5231c2 = f2465a;
                Intrinsics.checkNotNullExpressionValue(pagePath, "pagePath");
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                c5231c2.m2384f(pagePath, it2);
                LogUtils.m2954d("页面SourceSave: saveRouter-> file:" + it2.getFileName() + ", validate:" + it2.getValidate());
                EzyRouterRecord.RouterRecord.SourceCommandRecord.C7133b c7133bM9249u2 = EzyRouterRecord.RouterRecord.SourceCommandRecord.m9249u();
                c7133bM9249u2.m9270r(it2.getFileName());
                c7133bM9249u2.m9273u(it2.getValidate());
                c7135bM9211U.m9292e(c7133bM9249u2);
            }
        }
        for (TouchRecordEntity it3 : recordEntity.m7637i()) {
            LogUtils.m2954d("页面SourceSave: 开始保存touch文件-> touch:" + it3.getFileName());
            if (!it3.m7717c().isEmpty()) {
                C5231c c5231c3 = f2465a;
                Intrinsics.checkNotNullExpressionValue(pagePath, "pagePath");
                Intrinsics.checkNotNullExpressionValue(it3, "it");
                c5231c3.m2391m(pagePath, it3);
                LogUtils.m2954d("页面SourceSave: saveRouter-> touch:" + it3.getFileName() + ", validate:" + it3.getValidate());
                EzyRouterRecord.RouterRecord.SourceCommandRecord.C7133b c7133bM9249u3 = EzyRouterRecord.RouterRecord.SourceCommandRecord.m9249u();
                c7133bM9249u3.m9270r(it3.getFileName());
                c7133bM9249u3.m9273u(it3.getValidate());
                c7135bM9211U.m9297j(c7133bM9249u3);
            }
        }
        for (MatrixRecordEntity it4 : recordEntity.m7634f()) {
            LogUtils.m2954d("页面SourceSave: 开始保存矩阵文件-> matrix:" + it4.getFileName());
            if (!it4.m7584c().isEmpty()) {
                C5231c c5231c4 = f2465a;
                Intrinsics.checkNotNullExpressionValue(pagePath, "pagePath");
                Intrinsics.checkNotNullExpressionValue(it4, "it");
                c5231c4.m2387i(pagePath, it4);
                LogUtils.m2954d("页面SourceSave: saveRouter-> matrix:" + it4.getFileName() + ", validate:" + it4.getValidate());
                EzyRouterRecord.RouterRecord.SourceCommandRecord.C7133b c7133bM9249u4 = EzyRouterRecord.RouterRecord.SourceCommandRecord.m9249u();
                c7133bM9249u4.m9270r(it4.getFileName());
                c7133bM9249u4.m9273u(it4.getValidate());
                c7135bM9211U.m9294g(c7133bM9249u4);
            }
        }
        for (AudioRecordEntity it5 : recordEntity.m7629a()) {
            LogUtils.m2954d("页面SourceSave: 开始保存音频文件-> audio:" + it5.getFileName());
            if (!it5.m7373a().isEmpty()) {
                C5231c c5231c5 = f2465a;
                Intrinsics.checkNotNullExpressionValue(pagePath, "pagePath");
                Intrinsics.checkNotNullExpressionValue(it5, "it");
                c5231c5.m2382d(pagePath, it5);
                LogUtils.m2954d("页面SourceSave: saveRouter-> audio:" + it5.getFileName() + ", validate:" + it5.getValidate());
                EzyRouterRecord.RouterRecord.SourceCommandRecord.C7133b c7133bM9249u5 = EzyRouterRecord.RouterRecord.SourceCommandRecord.m9249u();
                c7133bM9249u5.m9270r(it5.getFileName());
                c7133bM9249u5.m9273u(it5.getValidate());
                c7135bM9211U.m9290b(c7133bM9249u5);
            }
        }
        for (TextRecordEntity it6 : recordEntity.m7636h()) {
            LogUtils.m2954d("页面SourceSave: 开始保存text文件,saveRouter-> text:" + it6.getFileName());
            if (!it6.m7675c().isEmpty()) {
                C5231c c5231c6 = f2465a;
                Intrinsics.checkNotNullExpressionValue(pagePath, "pagePath");
                Intrinsics.checkNotNullExpressionValue(it6, "it");
                c5231c6.m2390l(pagePath, it6);
                LogUtils.m2954d("页面SourceSave: saveRouter-> text:" + it6.getFileName() + ", validate:" + it6.getValidate());
                EzyRouterRecord.RouterRecord.SourceCommandRecord.C7133b c7133bM9249u6 = EzyRouterRecord.RouterRecord.SourceCommandRecord.m9249u();
                c7133bM9249u6.m9270r(it6.getFileName());
                c7133bM9249u6.m9273u(it6.getValidate());
                c7135bM9211U.m9296i(c7133bM9249u6);
            }
        }
        for (GeometryRecordEntity it7 : recordEntity.m7632d()) {
            LogUtils.m2954d("页面SourceSave: 开始保存geometryList文件，saveRouter-> geometry:" + it7.getFileName());
            if (!it7.m7505b().isEmpty()) {
                C5231c c5231c7 = f2465a;
                Intrinsics.checkNotNullExpressionValue(pagePath, "pagePath");
                Intrinsics.checkNotNullExpressionValue(it7, "it");
                c5231c7.m2385g(pagePath, it7);
                LogUtils.m2954d("页面SourceSave: saveRouter-> geometry:" + it7.getFileName() + ", validate:" + it7.getValidate());
                EzyRouterRecord.RouterRecord.SourceCommandRecord.C7133b c7133bM9249u7 = EzyRouterRecord.RouterRecord.SourceCommandRecord.m9249u();
                c7133bM9249u7.m9270r(it7.getFileName());
                c7133bM9249u7.m9273u(it7.getValidate());
                c7135bM9211U.m9293f(c7133bM9249u7);
            }
        }
        C9692k c9692k = C9692k.f17130a;
        Intrinsics.checkNotNullExpressionValue(pagePath, "pagePath");
        EzyRouterRecord.RouterRecord routerRecordM9298l = c7135bM9211U.build();
        Intrinsics.checkNotNullExpressionValue(routerRecordM9298l, "routerRecord.build()");
        c9692k.m16187d(pagePath, "router.bin", routerRecordM9298l);
    }

    /* renamed from: l */
    public final void m2390l(String pagePath, TextRecordEntity record) throws Throwable {
        String strM8016a;
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        Intrinsics.checkNotNullParameter(record, "record");
        EzySource.TextSource.C7153b c7153bM9549u = EzySource.TextSource.m9549u();
        for (TextInfoEntity textInfoEntity : record.m7675c()) {
            EzySource.TextSource.TextInfo.C7151b c7151bM9563w = EzySource.TextSource.TextInfo.m9563w();
            c7151bM9563w.m9588u(textInfoEntity.getContent());
            EzyPaint.Paint.C7123b c7123bM9100z = EzyPaint.Paint.m9100z();
            c7123bM9100z.m9123q(textInfoEntity.getColor());
            c7123bM9100z.m9131y(textInfoEntity.getWidth());
            c7123bM9100z.m9129w(textInfoEntity.getTextSize());
            c7123bM9100z.m9128v(textInfoEntity.getStyle());
            c7151bM9563w.m9590w(c7123bM9100z.build());
            c7153bM9549u.m9595d(c7151bM9563w);
        }
        if (c7153bM9549u.m9606p() <= 0) {
            LogUtils.m2956i("[SourceSave]: saveText-> [" + record.getFileName() + "]textInfoCount==0");
            return;
        }
        C9692k c9692k = C9692k.f17130a;
        String fileName = record.getFileName();
        EzySource.TextSource textSourceBuild = c7153bM9549u.build();
        Intrinsics.checkNotNullExpressionValue(textSourceBuild, "textRecord.build()");
        File fileM16187d = c9692k.m16187d(pagePath, fileName, textSourceBuild);
        if (fileM16187d == null || (strM8016a = FileValidateUtils.f9141a.m8016a(fileM16187d, FileValidateUtils.TypeEnum.SHA256)) == null) {
            return;
        }
        record.m7679g(strM8016a);
    }

    /* renamed from: m */
    public final void m2391m(String pagePath, TouchRecordEntity record) throws Throwable {
        String strM8016a;
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        Intrinsics.checkNotNullParameter(record, "record");
        EzySource.TouchSource.C7157b c7157bM9619u = EzySource.TouchSource.m9619u();
        for (TouchEventEntity touchEventEntity : record.m7717c()) {
            EzySource.TouchSource.TouchInfo.C7155b c7155bM9634x = EzySource.TouchSource.TouchInfo.m9634x();
            EzyPaint.Paint.C7123b c7123bM9100z = EzyPaint.Paint.m9100z();
            c7123bM9100z.m9131y(touchEventEntity.getWidth());
            c7123bM9100z.m9123q(touchEventEntity.getColor());
            c7123bM9100z.m9127u(touchEventEntity.getSpacing());
            c7123bM9100z.m9125s(touchEventEntity.getItemLength());
            c7123bM9100z.m9128v(touchEventEntity.getStyle());
            c7123bM9100z.m9129w(touchEventEntity.getTextSize());
            c7155bM9634x.m9664y(c7123bM9100z.build());
            for (TouchInfoEntity touchInfoEntity : touchEventEntity.m7693h()) {
                EzyTouchEvent.TouchEvent.C7164b c7164bM9695A = EzyTouchEvent.TouchEvent.m9695A();
                c7164bM9695A.m9768B(touchInfoEntity.getX());
                c7164bM9695A.m9769C(touchInfoEntity.getY());
                c7164bM9695A.m9788v(touchInfoEntity.getEventTime());
                c7155bM9634x.m9646e(c7164bM9695A.build());
            }
            c7157bM9619u.m9668d(c7155bM9634x);
        }
        if (c7157bM9619u.m9679p() <= 0) {
            LogUtils.m2956i("[SourceSave]: saveTouch-> [" + record.getFileName() + "]touchInfoCount==0");
            return;
        }
        C9692k c9692k = C9692k.f17130a;
        String fileName = record.getFileName();
        EzySource.TouchSource touchSourceBuild = c7157bM9619u.build();
        Intrinsics.checkNotNullExpressionValue(touchSourceBuild, "touchRecord.build()");
        File fileM16187d = c9692k.m16187d(pagePath, fileName, touchSourceBuild);
        if (fileM16187d == null || (strM8016a = FileValidateUtils.f9141a.m8016a(fileM16187d, FileValidateUtils.TypeEnum.SHA256)) == null) {
            return;
        }
        record.m7721g(strM8016a);
    }
}
