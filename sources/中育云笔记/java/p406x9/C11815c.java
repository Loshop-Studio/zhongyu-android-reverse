package p406x9;

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
import kotlin.jvm.internal.AbstractC9979u;
import na.C10348k;
import p325rc.AbstractC10978w;

/* renamed from: x9.c */
/* loaded from: classes5.dex */
public final class C11815c {

    /* renamed from: a */
    public static final C11815c f28051a = new C11815c();

    /* renamed from: a */
    public final EzyHeader.Author m26168a(AuthorEntity authorEntity) {
        EzyHeader.Author.C8478b c8478bM15238A = EzyHeader.Author.m15238A();
        String strM14018b = authorEntity.m14018b();
        if (strM14018b != null) {
            c8478bM15238A.m15274q(strM14018b);
        }
        String strM14017a = authorEntity.m14017a();
        if (strM14017a != null) {
            c8478bM15238A.m15273p(strM14017a);
        }
        String strM14021e = authorEntity.m14021e();
        if (strM14021e != null) {
            c8478bM15238A.m15278u(strM14021e);
        }
        String strM14023g = authorEntity.m14023g();
        if (strM14023g != null) {
            c8478bM15238A.m15281x(strM14023g);
        }
        Long lM14022f = authorEntity.m14022f();
        if (lM14022f != null) {
            c8478bM15238A.m15279v(lM14022f.longValue());
        }
        Long lM14019c = authorEntity.m14019c();
        if (lM14019c != null) {
            c8478bM15238A.m15275r(lM14019c.longValue());
        }
        EzyHeader.Author authorBuild = c8478bM15238A.build();
        AbstractC9979u.m20293f(authorBuild, "newBuilder().apply {\n   …      }\n        }.build()");
        return authorBuild;
    }

    /* renamed from: b */
    public final EzyHeader.BackgroundLineConfig m26169b(BackgroundLineConfigEntity backgroundLineConfigEntity) { // 页头写回：只编码颜色、间距与类型。录制时的显式线宽位于 ACTION_CONFIG 命令中。
        EzyHeader.BackgroundLineConfig.C8480b c8480bM15288t = EzyHeader.BackgroundLineConfig.m15288t();
        c8480bM15288t.m15313q(backgroundLineConfigEntity.m14030b());
        c8480bM15288t.m15314r(backgroundLineConfigEntity.m14031c());
        c8480bM15288t.m15315s(backgroundLineConfigEntity.m14032d());
        EzyHeader.BackgroundLineConfig backgroundLineConfigBuild = c8480bM15288t.build();
        AbstractC9979u.m20293f(backgroundLineConfigBuild, "newBuilder().apply {\n   …ineType\n        }.build()");
        return backgroundLineConfigBuild;
    }

    /* renamed from: c */
    public final EzyHeader.MoveConfig m26170c(MoveConfigEntity moveConfigEntity) {
        EzyHeader.MoveConfig.C8484b c8484bM15416z = EzyHeader.MoveConfig.m15416z();
        c8484bM15416z.m15444r(moveConfigEntity.m14229h());
        c8484bM15416z.m15451y(moveConfigEntity.m14228g());
        c8484bM15416z.m15443q(moveConfigEntity.m14222a());
        c8484bM15416z.m15449w(moveConfigEntity.m14227f());
        c8484bM15416z.m15448v(moveConfigEntity.m14226e());
        c8484bM15416z.m15445s(moveConfigEntity.m14224c());
        c8484bM15416z.m15446t(moveConfigEntity.m14225d());
        EzyHeader.MoveConfig moveConfigBuild = c8484bM15416z.build();
        AbstractC9979u.m20293f(moveConfigBuild, "newBuilder().apply {\n   …thTimes\n        }.build()");
        return moveConfigBuild;
    }

    /* renamed from: d */
    public final void m26171d(String pagePath, AudioRecordEntity record) throws Throwable {
        String strM14636a;
        AbstractC9979u.m20294g(pagePath, "pagePath");
        AbstractC9979u.m20294g(record, "record");
        EzyCommand.CommandSource.C8472b c8472bM14676m = EzyCommand.CommandSource.m14676m();
        for (AudioInfoEntity audioInfoEntity : record.m14003a()) {
            EzyCommand.CommandSource.CommandInfo.C8470b c8470bM14691v = EzyCommand.CommandSource.CommandInfo.m14691v();
            c8470bM14691v.m15189s(audioInfoEntity.m13977c());
            c8470bM14691v.m15190t(audioInfoEntity.m13978d());
            c8470bM14691v.m15192v(audioInfoEntity.m13981g());
            c8470bM14691v.m15186p(audioInfoEntity.m13975a());
            c8470bM14691v.m15188r(ByteString.copyFrom(audioInfoEntity.m13976b()));
            c8472bM14676m.m15196b(c8470bM14691v);
        }
        if (c8472bM14676m.m15207n() <= 0) {
            LogUtils.m3888i("[SourceSave]: saveAudio-> [" + record.m14004b() + "]commandInfoCount==0");
            return;
        }
        C10348k c10348k = C10348k.f24655a;
        String strM14004b = record.m14004b();
        EzyCommand.CommandSource commandSourceBuild = c8472bM14676m.build();
        AbstractC9979u.m20293f(commandSourceBuild, "audioRecord.build()");
        File fileM21647c = c10348k.m21647c(pagePath, strM14004b, commandSourceBuild);
        if (fileM21647c == null || (strM14636a = FileValidateUtils.f18689a.m14636a(fileM21647c, FileValidateUtils.TypeEnum.SHA256)) == null) {
            return;
        }
        record.m14009g(strM14636a);
    }

    /* renamed from: e */
    public final void m26172e(String pagePath, CommandRecordEntity record) throws Throwable {
        String strM14636a;
        AbstractC9979u.m20294g(pagePath, "pagePath");
        AbstractC9979u.m20294g(record, "record");
        EzyCommand.CommandSource.C8472b c8472bM14676m = EzyCommand.CommandSource.m14676m();
        for (CommandInfoEntity commandInfoEntity : record.m14065a()) {
            EzyCommand.CommandSource.CommandInfo.C8470b c8470bM14691v = EzyCommand.CommandSource.CommandInfo.m14691v();
            c8470bM14691v.m15189s(commandInfoEntity.m14053c());
            c8470bM14691v.m15190t(commandInfoEntity.m14054d());
            c8470bM14691v.m15192v(commandInfoEntity.m14057g());
            c8470bM14691v.m15186p(commandInfoEntity.m14051a());
            c8470bM14691v.m15188r(ByteString.copyFrom(commandInfoEntity.m14052b()));
            c8472bM14676m.m15196b(c8470bM14691v);
        }
        if (c8472bM14676m.m15207n() <= 0) {
            LogUtils.m3888i("[SourceSave]: saveCommand-> [" + record.m14066b() + "]commandInfoCount==0");
            return;
        }
        C10348k c10348k = C10348k.f24655a;
        String strM14066b = record.m14066b();
        EzyCommand.CommandSource commandSourceBuild = c8472bM14676m.build();
        AbstractC9979u.m20293f(commandSourceBuild, "commandRecord.build()");
        File fileM21647c = c10348k.m21647c(pagePath, strM14066b, commandSourceBuild);
        if (fileM21647c == null || (strM14636a = FileValidateUtils.f18689a.m14636a(fileM21647c, FileValidateUtils.TypeEnum.SHA256)) == null) {
            return;
        }
        record.m14071g(strM14636a);
    }

    /* renamed from: f */
    public final void m26173f(String pagePath, FileRecordEntity record) throws Throwable {
        String strM14636a;
        AbstractC9979u.m20294g(pagePath, "pagePath");
        AbstractC9979u.m20294g(record, "record");
        EzySource.FileSource.C8519b c8519bM15972m = EzySource.FileSource.m15972m();
        for (FileInfoEntity fileInfoEntity : record.m14091a()) {
            EzySource.FileSource.FileInfo.C8517b c8517bM15987o = EzySource.FileSource.FileInfo.m15987o();
            c8517bM15987o.m16009r(fileInfoEntity.m14078a());
            c8517bM15987o.m16012u(fileInfoEntity.m14082e());
            c8519bM15972m.m16015b(c8517bM15987o);
        }
        if (c8519bM15972m.m16027o() <= 0) {
            LogUtils.m3888i("[SourceSave]: saveFile-> [" + record.m14092b() + "]fileInfoCount==0");
            return;
        }
        C10348k c10348k = C10348k.f24655a;
        String strM14092b = record.m14092b();
        EzySource.FileSource fileSourceBuild = c8519bM15972m.build();
        AbstractC9979u.m20293f(fileSourceBuild, "fileRecord.build()");
        File fileM21647c = c10348k.m21647c(pagePath, strM14092b, fileSourceBuild);
        if (fileM21647c == null || (strM14636a = FileValidateUtils.f18689a.m14636a(fileM21647c, FileValidateUtils.TypeEnum.SHA256)) == null) {
            return;
        }
        record.m14097g(strM14636a);
    }

    /* renamed from: g */
    public final void m26174g(String pagePath, GeometryRecordEntity record) throws Throwable {
        String strM14636a;
        AbstractC9979u.m20294g(pagePath, "pagePath");
        AbstractC9979u.m20294g(record, "record");
        EzySource.GeometrySource.C8523b c8523bM16039k = EzySource.GeometrySource.m16039k();
        for (GeometryInfoEntity geometryInfoEntity : record.m14132b()) {
            EzySource.GeometrySource.GeometryInfo.C8521b c8521bM16056u = EzySource.GeometrySource.GeometryInfo.m16056u();
            c8521bM16056u.m16085w(geometryInfoEntity.m14105b());
            EzyPaint.Paint.C8501b c8501bM15719t = EzyPaint.Paint.m15719t();
            c8501bM15719t.m15742p(geometryInfoEntity.m14104a());
            c8501bM15719t.m15750x(geometryInfoEntity.m14111h());
            c8501bM15719t.m15748v(geometryInfoEntity.m14110g());
            c8501bM15719t.m15747u(geometryInfoEntity.m14109f());
            c8521bM16056u.m16086x(c8501bM15719t.build());
            for (GeometryPointFEntity geometryPointFEntity : geometryInfoEntity.m14107d()) {
                EzyPointF.PointF.C8504b c8504bM15757f = EzyPointF.PointF.m15757f();
                c8504bM15757f.m15779s(geometryPointFEntity.m14122c());
                c8504bM15757f.m15780t(geometryPointFEntity.m14123d());
                c8521bM16056u.m16066b(c8504bM15757f.build());
            }
            c8523bM16039k.m16090b(c8521bM16056u);
        }
        if (c8523bM16039k.m16102o() <= 0) {
            LogUtils.m3888i("[SourceSave]: saveGeometry-> [" + record.m14131a() + "]geometryInfoCount==0");
            return;
        }
        C10348k c10348k = C10348k.f24655a;
        String strM14131a = record.m14131a();
        EzySource.GeometrySource geometrySourceBuild = c8523bM16039k.build();
        AbstractC9979u.m20293f(geometrySourceBuild, "geometryRecord.build()");
        File fileM21647c = c10348k.m21647c(pagePath, strM14131a, geometrySourceBuild);
        if (fileM21647c == null || (strM14636a = FileValidateUtils.f18689a.m14636a(fileM21647c, FileValidateUtils.TypeEnum.SHA256)) == null) {
            return;
        }
        record.m14137g(strM14636a);
    }

    /* renamed from: h */
    public final void m26175h(PageEntity pageEntity, String path) throws Throwable {
        AbstractC9979u.m20294g(pageEntity, "pageEntity");
        AbstractC9979u.m20294g(path, "path");
        LogUtils.m3886d("页面SourceSave：开始保存Header.bin文件");
        HeaderEntity headerEntity = (HeaderEntity) pageEntity.m14240e().m19036d();
        EzyHeader.Header.C8482b c8482bM15322S = EzyHeader.Header.m15322S();
        c8482bM15322S.m15383W(headerEntity.m14158o());
        c8482bM15322S.m15384X(headerEntity.m14159p());
        c8482bM15322S.m15376P(headerEntity.m14150g());
        c8482bM15322S.m15371K(headerEntity.m14146c());
        c8482bM15322S.m15382V(headerEntity.m14157n());
        c8482bM15322S.m15374N(headerEntity.m14149f());
        c8482bM15322S.m15372L(headerEntity.m14147d());
        c8482bM15322S.m15377Q(headerEntity.m14152i());
        AuthorEntity authorEntity = (AuthorEntity) headerEntity.m14144a().m19036d();
        if (authorEntity != null) {
            c8482bM15322S.m15370J(f28051a.m26168a(authorEntity));
        }
        MoveConfigEntity moveConfigEntity = (MoveConfigEntity) headerEntity.m14154k().m19036d();
        if (moveConfigEntity != null) {
            c8482bM15322S.m15379S(f28051a.m26170c(moveConfigEntity));
        }
        BackgroundLineConfigEntity backgroundLineConfigEntity = (BackgroundLineConfigEntity) headerEntity.m14148e().m19036d();
        if (backgroundLineConfigEntity != null) {
            c8482bM15322S.m15373M(f28051a.m26169b(backgroundLineConfigEntity));
        }
        BackgroundLineConfigEntity backgroundLineConfigEntity2 = (BackgroundLineConfigEntity) headerEntity.m14153j().m19036d();
        if (backgroundLineConfigEntity2 != null) {
            c8482bM15322S.m15378R(f28051a.m26169b(backgroundLineConfigEntity2));
        }
        for (AuthorEntity it : headerEntity.m14156m()) {
            C11815c c11815c = f28051a;
            AbstractC9979u.m20293f(it, "it");
            c8482bM15322S.m15385b(c11815c.m26168a(it));
        }
        C10348k c10348k = C10348k.f24655a;
        String absolutePath = new File(path, pageEntity.m14239d()).getAbsolutePath();
        AbstractC9979u.m20293f(absolutePath, "File(path, pageEntity.dirName).absolutePath");
        EzyHeader.Header headerBuild = c8482bM15322S.build();
        AbstractC9979u.m20293f(headerBuild, "header.build()");
        c10348k.m21647c(absolutePath, "header.bin", headerBuild);
        LogUtils.m3886d("页面SourceSave：保存Header.bin文件结束，路径是" + new File(path, pageEntity.m14239d()).getAbsolutePath());
    }

    /* renamed from: i */
    public final void m26176i(String pagePath, MatrixRecordEntity record) throws Throwable {
        String strM14636a;
        AbstractC9979u.m20294g(pagePath, "pagePath");
        AbstractC9979u.m20294g(record, "record");
        EzySource.MatrixSource.C8527b c8527bM16114k = EzySource.MatrixSource.m16114k();
        for (MatrixEventEntity matrixEventEntity : record.m14211c()) {
            EzySource.MatrixSource.MatrixInfo.C8525b c8525bM16126g = EzySource.MatrixSource.MatrixInfo.m16126g();
            for (MatrixInfoEntity matrixInfoEntity : matrixEventEntity.m14180b()) {
                EzyMatrix.Matrix.C8487b c8487bM15455D = EzyMatrix.Matrix.m15455D();
                c8487bM15455D.m15494p(matrixInfoEntity.m14190a());
                c8487bM15455D.m15500v(matrixInfoEntity.m14196g());
                c8487bM15455D.m15502x(matrixInfoEntity.m14198i());
                c8487bM15455D.m15504z(matrixInfoEntity.m14200k());
                c8487bM15455D.m15503y(matrixInfoEntity.m14199j());
                c8487bM15455D.m15501w(matrixInfoEntity.m14197h());
                c8487bM15455D.m15479A(matrixInfoEntity.m14201l());
                c8487bM15455D.m15496r(matrixInfoEntity.m14192c());
                c8487bM15455D.m15497s(matrixInfoEntity.m14193d());
                c8487bM15455D.m15498t(matrixInfoEntity.m14194e());
                c8525bM16126g.m16133d(c8487bM15455D.build());
            }
            c8527bM16114k.m16153b(c8525bM16126g.build());
        }
        if (c8527bM16114k.m16165o() <= 0) {
            LogUtils.m3888i("[SourceSave]: saveMatrix-> [" + record.m14209a() + "]matrixInfoCount==0");
            return;
        }
        C10348k c10348k = C10348k.f24655a;
        String strM14209a = record.m14209a();
        EzySource.MatrixSource matrixSourceBuild = c8527bM16114k.build();
        AbstractC9979u.m20293f(matrixSourceBuild, "matrixRecord.build()");
        File fileM21647c = c10348k.m21647c(pagePath, strM14209a, matrixSourceBuild);
        if (fileM21647c == null || (strM14636a = FileValidateUtils.f18689a.m14636a(fileM21647c, FileValidateUtils.TypeEnum.SHA256)) == null) {
            return;
        }
        record.m14215g(strM14636a);
    }

    /* renamed from: j */
    public final void m26177j(BlackBoardEntity boardEntity, List pagePathList) {
        AbstractC9979u.m20294g(boardEntity, "boardEntity");
        AbstractC9979u.m20294g(pagePathList, "pagePathList");
        String strM14039a = boardEntity.m14039a();
        if (strM14039a == null) {
            return;
        }
        EzyPageRouter.PageRouter.C8493b c8493bM15517k = EzyPageRouter.PageRouter.m15517k();
        int i10 = 0;
        for (Object obj : boardEntity.m14041c()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC10978w.m24145w();
            }
            PageEntity pageEntity = (PageEntity) obj;
            LogUtils.m3886d("页面SourceSave: saveRecord-> 第" + i10 + "条 => " + pageEntity.m14239d() + "开始执行保存操作");
            if (pagePathList.contains(pageEntity.m14239d())) {
                EzyPageRouter.PageRouter.PageInfo.C8491b c8491bM15529k = EzyPageRouter.PageRouter.PageInfo.m15529k();
                c8491bM15529k.m15551r(i10);
                c8491bM15529k.m15550q(pageEntity.m14239d());
                c8493bM15517k.m15555b(c8491bM15529k);
                C11815c c11815c = f28051a;
                AbstractC9979u.m20293f(pageEntity, "pageEntity");
                c11815c.m26175h(pageEntity, strM14039a);
                c11815c.m26178k(pageEntity, strM14039a);
                LogUtils.m3886d("页面SourceSave: saveRecord-> 第" + i10 + "条 => " + pageEntity.m14239d() + " 结束");
            }
            i10 = i11;
        }
        C10348k c10348k = C10348k.f24655a;
        EzyPageRouter.PageRouter pageRouterBuild = c8493bM15517k.build();
        AbstractC9979u.m20293f(pageRouterBuild, "pageRecord.build()");
        c10348k.m21647c(strM14039a, "page_router.bin", pageRouterBuild);
        LogUtils.m3886d("页面SourceSave: saveRecord-> 结束,page_route.bin文件保存结束");
    }

    /* renamed from: k */
    public final void m26178k(PageEntity pageEntity, String path) throws Throwable {
        AbstractC9979u.m20294g(pageEntity, "pageEntity");
        AbstractC9979u.m20294g(path, "path");
        EzyRouterRecord.RouterRecord.C8513b c8513bM15825R = EzyRouterRecord.RouterRecord.m15825R();
        String pagePath = new File(path, pageEntity.m14239d()).getAbsolutePath();
        RecordEntity recordEntity = (RecordEntity) pageEntity.m14242g().m19036d();
        for (CommandRecordEntity it : recordEntity.m14258b()) {
            LogUtils.m3886d("页面SourceSave: 开始保存commandList文件:" + it.m14066b());
            if (!it.m14065a().isEmpty()) {
                C11815c c11815c = f28051a;
                AbstractC9979u.m20293f(pagePath, "pagePath");
                AbstractC9979u.m20293f(it, "it");
                c11815c.m26172e(pagePath, it);
                LogUtils.m3886d("页面SourceSave: saveRouter-> command:" + it.m14066b() + ", validate:" + it.m14068d());
                EzyRouterRecord.RouterRecord.SourceCommandRecord.C8511b c8511bM15867m = EzyRouterRecord.RouterRecord.SourceCommandRecord.m15867m();
                c8511bM15867m.m15888q(it.m14066b());
                c8511bM15867m.m15891t(it.m14068d());
                c8513bM15825R.m15926j(c8511bM15867m);
            }
        }
        for (FileRecordEntity it2 : recordEntity.m14259c()) {
            LogUtils.m3886d("页面SourceSave: 开始保存file文件-> file:" + it2.m14092b());
            if (!it2.m14091a().isEmpty()) {
                C11815c c11815c2 = f28051a;
                AbstractC9979u.m20293f(pagePath, "pagePath");
                AbstractC9979u.m20293f(it2, "it");
                c11815c2.m26173f(pagePath, it2);
                LogUtils.m3886d("页面SourceSave: saveRouter-> file:" + it2.m14092b() + ", validate:" + it2.m14094d());
                EzyRouterRecord.RouterRecord.SourceCommandRecord.C8511b c8511bM15867m2 = EzyRouterRecord.RouterRecord.SourceCommandRecord.m15867m();
                c8511bM15867m2.m15888q(it2.m14092b());
                c8511bM15867m2.m15891t(it2.m14094d());
                c8513bM15825R.m15927k(c8511bM15867m2);
            }
        }
        for (TouchRecordEntity it3 : recordEntity.m14265i()) {
            LogUtils.m3886d("页面SourceSave: 开始保存touch文件-> touch:" + it3.m14343a());
            if (!it3.m14345c().isEmpty()) {
                C11815c c11815c3 = f28051a;
                AbstractC9979u.m20293f(pagePath, "pagePath");
                AbstractC9979u.m20293f(it3, "it");
                c11815c3.m26180m(pagePath, it3);
                LogUtils.m3886d("页面SourceSave: saveRouter-> touch:" + it3.m14343a() + ", validate:" + it3.m14346d());
                EzyRouterRecord.RouterRecord.SourceCommandRecord.C8511b c8511bM15867m3 = EzyRouterRecord.RouterRecord.SourceCommandRecord.m15867m();
                c8511bM15867m3.m15888q(it3.m14343a());
                c8511bM15867m3.m15891t(it3.m14346d());
                c8513bM15825R.m15932p(c8511bM15867m3);
            }
        }
        for (MatrixRecordEntity it4 : recordEntity.m14262f()) {
            LogUtils.m3886d("页面SourceSave: 开始保存矩阵文件-> matrix:" + it4.m14209a());
            if (!it4.m14211c().isEmpty()) {
                C11815c c11815c4 = f28051a;
                AbstractC9979u.m20293f(pagePath, "pagePath");
                AbstractC9979u.m20293f(it4, "it");
                c11815c4.m26176i(pagePath, it4);
                LogUtils.m3886d("页面SourceSave: saveRouter-> matrix:" + it4.m14209a() + ", validate:" + it4.m14212d());
                EzyRouterRecord.RouterRecord.SourceCommandRecord.C8511b c8511bM15867m4 = EzyRouterRecord.RouterRecord.SourceCommandRecord.m15867m();
                c8511bM15867m4.m15888q(it4.m14209a());
                c8511bM15867m4.m15891t(it4.m14212d());
                c8513bM15825R.m15929m(c8511bM15867m4);
            }
        }
        for (AudioRecordEntity it5 : recordEntity.m14257a()) {
            LogUtils.m3886d("页面SourceSave: 开始保存音频文件-> audio:" + it5.m14004b());
            if (!it5.m14003a().isEmpty()) {
                C11815c c11815c5 = f28051a;
                AbstractC9979u.m20293f(pagePath, "pagePath");
                AbstractC9979u.m20293f(it5, "it");
                c11815c5.m26171d(pagePath, it5);
                LogUtils.m3886d("页面SourceSave: saveRouter-> audio:" + it5.m14004b() + ", validate:" + it5.m14006d());
                EzyRouterRecord.RouterRecord.SourceCommandRecord.C8511b c8511bM15867m5 = EzyRouterRecord.RouterRecord.SourceCommandRecord.m15867m();
                c8511bM15867m5.m15888q(it5.m14004b());
                c8511bM15867m5.m15891t(it5.m14006d());
                c8513bM15825R.m15925i(c8511bM15867m5);
            }
        }
        for (TextRecordEntity it6 : recordEntity.m14264h()) {
            LogUtils.m3886d("页面SourceSave: 开始保存text文件,saveRouter-> text:" + it6.m14301a());
            if (!it6.m14303c().isEmpty()) {
                C11815c c11815c6 = f28051a;
                AbstractC9979u.m20293f(pagePath, "pagePath");
                AbstractC9979u.m20293f(it6, "it");
                c11815c6.m26179l(pagePath, it6);
                LogUtils.m3886d("页面SourceSave: saveRouter-> text:" + it6.m14301a() + ", validate:" + it6.m14304d());
                EzyRouterRecord.RouterRecord.SourceCommandRecord.C8511b c8511bM15867m6 = EzyRouterRecord.RouterRecord.SourceCommandRecord.m15867m();
                c8511bM15867m6.m15888q(it6.m14301a());
                c8511bM15867m6.m15891t(it6.m14304d());
                c8513bM15825R.m15931o(c8511bM15867m6);
            }
        }
        for (GeometryRecordEntity it7 : recordEntity.m14260d()) {
            LogUtils.m3886d("页面SourceSave: 开始保存geometryList文件，saveRouter-> geometry:" + it7.m14131a());
            if (!it7.m14132b().isEmpty()) {
                C11815c c11815c7 = f28051a;
                AbstractC9979u.m20293f(pagePath, "pagePath");
                AbstractC9979u.m20293f(it7, "it");
                c11815c7.m26174g(pagePath, it7);
                LogUtils.m3886d("页面SourceSave: saveRouter-> geometry:" + it7.m14131a() + ", validate:" + it7.m14134d());
                EzyRouterRecord.RouterRecord.SourceCommandRecord.C8511b c8511bM15867m7 = EzyRouterRecord.RouterRecord.SourceCommandRecord.m15867m();
                c8511bM15867m7.m15888q(it7.m14131a());
                c8511bM15867m7.m15891t(it7.m14134d());
                c8513bM15825R.m15928l(c8511bM15867m7);
            }
        }
        C10348k c10348k = C10348k.f24655a;
        AbstractC9979u.m20293f(pagePath, "pagePath");
        EzyRouterRecord.RouterRecord routerRecordBuild = c8513bM15825R.build();
        AbstractC9979u.m20293f(routerRecordBuild, "routerRecord.build()");
        c10348k.m21647c(pagePath, "router.bin", routerRecordBuild);
    }

    /* renamed from: l */
    public final void m26179l(String pagePath, TextRecordEntity record) throws Throwable {
        String strM14636a;
        AbstractC9979u.m20294g(pagePath, "pagePath");
        AbstractC9979u.m20294g(record, "record");
        EzySource.TextSource.C8531b c8531bM16178m = EzySource.TextSource.m16178m();
        for (TextInfoEntity textInfoEntity : record.m14303c()) {
            EzySource.TextSource.TextInfo.C8529b c8529bM16192o = EzySource.TextSource.TextInfo.m16192o();
            c8529bM16192o.m16217t(textInfoEntity.m14288b());
            EzyPaint.Paint.C8501b c8501bM15719t = EzyPaint.Paint.m15719t();
            c8501bM15719t.m15742p(textInfoEntity.m14287a());
            c8501bM15719t.m15750x(textInfoEntity.m14293g());
            c8501bM15719t.m15748v(textInfoEntity.m14292f());
            c8501bM15719t.m15747u(textInfoEntity.m14291e());
            c8529bM16192o.m16219v(c8501bM15719t.build());
            c8531bM16178m.m16224d(c8529bM16192o);
        }
        if (c8531bM16178m.m16235o() <= 0) {
            LogUtils.m3888i("[SourceSave]: saveText-> [" + record.m14301a() + "]textInfoCount==0");
            return;
        }
        C10348k c10348k = C10348k.f24655a;
        String strM14301a = record.m14301a();
        EzySource.TextSource textSourceBuild = c8531bM16178m.build();
        AbstractC9979u.m20293f(textSourceBuild, "textRecord.build()");
        File fileM21647c = c10348k.m21647c(pagePath, strM14301a, textSourceBuild);
        if (fileM21647c == null || (strM14636a = FileValidateUtils.f18689a.m14636a(fileM21647c, FileValidateUtils.TypeEnum.SHA256)) == null) {
            return;
        }
        record.m14307g(strM14636a);
    }

    /* renamed from: m */
    public final void m26180m(String pagePath, TouchRecordEntity record) throws Throwable {
        String strM14636a;
        AbstractC9979u.m20294g(pagePath, "pagePath");
        AbstractC9979u.m20294g(record, "record");
        EzySource.TouchSource.C8535b c8535bM16248m = EzySource.TouchSource.m16248m();
        for (TouchEventEntity touchEventEntity : record.m14345c()) {
            EzySource.TouchSource.TouchInfo.C8533b c8533bM16263p = EzySource.TouchSource.TouchInfo.m16263p();
            EzyPaint.Paint.C8501b c8501bM15719t = EzyPaint.Paint.m15719t();
            c8501bM15719t.m15750x(touchEventEntity.m14322i());
            c8501bM15719t.m15742p(touchEventEntity.m14314a());
            c8501bM15719t.m15746t(touchEventEntity.m14318e());
            c8501bM15719t.m15744r(touchEventEntity.m14316c());
            c8501bM15719t.m15747u(touchEventEntity.m14319f());
            c8501bM15719t.m15748v(touchEventEntity.m14320g());
            c8533bM16263p.m16292x(c8501bM15719t.build());
            for (TouchInfoEntity touchInfoEntity : touchEventEntity.m14321h()) {
                EzyTouchEvent.TouchEvent.C8542b c8542bM16335u = EzyTouchEvent.TouchEvent.m16335u();
                c8542bM16335u.m16396A(touchInfoEntity.m14334d());
                c8542bM16335u.m16397B(touchInfoEntity.m14335e());
                c8542bM16335u.m16416u(touchInfoEntity.m14331a());
                c8533bM16263p.m16274e(c8542bM16335u.build());
            }
            c8535bM16248m.m16297d(c8533bM16263p);
        }
        if (c8535bM16248m.m16308o() <= 0) {
            LogUtils.m3888i("[SourceSave]: saveTouch-> [" + record.m14343a() + "]touchInfoCount==0");
            return;
        }
        C10348k c10348k = C10348k.f24655a;
        String strM14343a = record.m14343a();
        EzySource.TouchSource touchSourceBuild = c8535bM16248m.build();
        AbstractC9979u.m20293f(touchSourceBuild, "touchRecord.build()");
        File fileM21647c = c10348k.m21647c(pagePath, strM14343a, touchSourceBuild);
        if (fileM21647c == null || (strM14636a = FileValidateUtils.f18689a.m14636a(fileM21647c, FileValidateUtils.TypeEnum.SHA256)) == null) {
            return;
        }
        record.m14349g(strM14636a);
    }
}
