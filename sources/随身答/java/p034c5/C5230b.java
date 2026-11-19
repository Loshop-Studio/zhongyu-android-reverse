package p034c5;

import com.blankj.utilcode.util.LogUtils;
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
import com.zykj.board.EzyBackgroundLineTypeEnum;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyCommandEnum;
import com.zykj.board.EzyHeader;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyPageRouter;
import com.zykj.board.EzyPointF;
import com.zykj.board.EzyRouterRecord;
import com.zykj.board.EzySource;
import com.zykj.board.EzyTouchEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p263u5.C9685d;

/* renamed from: c5.b */
/* loaded from: classes4.dex */
public final class C5230b {

    /* renamed from: a */
    public static final C5230b f2464a = new C5230b();

    /* renamed from: C */
    public static final void m2345C(EzyPageRouter.PageRouter pageRouter, BlackBoardEntity boardEntity, String path) throws IllegalAccessException, IOException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(boardEntity, "$boardEntity");
        Intrinsics.checkNotNullParameter(path, "$path");
        List<EzyPageRouter.PageRouter.PageInfo> pageInfoList = pageRouter.m8906q();
        Intrinsics.checkNotNullExpressionValue(pageInfoList, "pageInfoList");
        for (EzyPageRouter.PageRouter.PageInfo pageInfo : pageInfoList) {
            LogUtils.m2956i("[SourceLoad]:loadRecord-> page:" + pageInfo.getName());
            String name = pageInfo.getName();
            Intrinsics.checkNotNullExpressionValue(name, "it.name");
            PageEntity pageEntity = new PageEntity(0L, name, false, null, 0, 28, null);
            f2464a.m2347A(path, pageEntity);
            pageEntity.m7609a().m13190w(boardEntity);
            pageEntity.m7617i();
            boardEntity.m7415c().add(pageEntity);
        }
        boardEntity.m7416d();
    }

    /* renamed from: A */
    public final void m2347A(String dir, PageEntity pageEntity) throws IllegalAccessException, IOException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        Intrinsics.checkNotNullParameter(pageEntity, "pageEntity");
        String pagePath = new File(dir, pageEntity.getDirName()).getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(pagePath, "pagePath");
        EzyRouterRecord.RouterRecord routerRecordM2364l = m2364l(pagePath);
        RecordEntity recordEntity = new RecordEntity(0L);
        C5230b c5230b = f2464a;
        List commandRecordList = routerRecordM2364l.m9229H();
        Intrinsics.checkNotNullExpressionValue(commandRecordList, "commandRecordList");
        c5230b.m2370r(pagePath, recordEntity, commandRecordList);
        List touchSourceRecordList = routerRecordM2364l.m9240T();
        Intrinsics.checkNotNullExpressionValue(touchSourceRecordList, "touchSourceRecordList");
        c5230b.m2353H(pagePath, recordEntity, touchSourceRecordList);
        List matrixSourceRecordList = routerRecordM2364l.m9236P();
        Intrinsics.checkNotNullExpressionValue(matrixSourceRecordList, "matrixSourceRecordList");
        c5230b.m2378z(pagePath, recordEntity, matrixSourceRecordList);
        List fileSourceRecordList = routerRecordM2364l.m9232L();
        Intrinsics.checkNotNullExpressionValue(fileSourceRecordList, "fileSourceRecordList");
        c5230b.m2372t(pagePath, recordEntity, fileSourceRecordList);
        List textSourceRecordList = routerRecordM2364l.m9238R();
        Intrinsics.checkNotNullExpressionValue(textSourceRecordList, "textSourceRecordList");
        c5230b.m2350E(pagePath, recordEntity, textSourceRecordList);
        List geometrySourceRecordList = routerRecordM2364l.m9234N();
        Intrinsics.checkNotNullExpressionValue(geometrySourceRecordList, "geometrySourceRecordList");
        c5230b.m2375w(pagePath, recordEntity, geometrySourceRecordList);
        List audioRecordList = routerRecordM2364l.m9227F();
        Intrinsics.checkNotNullExpressionValue(audioRecordList, "audioRecordList");
        c5230b.m2368p(pagePath, recordEntity, audioRecordList);
        recordEntity.m7638j();
        pageEntity.m7615g().m13190w(recordEntity);
        EzyHeader.Header headerM2361i = m2361i(pagePath);
        int version = headerM2361i.getVersion();
        int width = headerM2361i.getWidth();
        int height = headerM2361i.getHeight();
        long createDate = headerM2361i.getCreateDate();
        long updateDate = headerM2361i.getUpdateDate();
        long jM8730L = headerM2361i.m8730L();
        String strM8726G = headerM2361i.m8726G();
        Intrinsics.checkNotNullExpressionValue(strM8726G, "this.convertUrl");
        HeaderEntity headerEntity = new HeaderEntity(0L, version, width, height, createDate, updateDate, jM8730L, strM8726G, headerM2361i.m8727H(), headerM2361i.m8731M());
        EzyHeader.Author authorM8725F = headerM2361i.m8725F();
        Intrinsics.checkNotNullExpressionValue(authorM8725F, "this.author");
        AuthorEntity authorEntityM2354b = c5230b.m2354b(authorM8725F);
        authorEntityM2354b.m7394h();
        headerEntity.m7517a().m13190w(authorEntityM2354b);
        EzyHeader.MoveConfig moveConfig = headerM2361i.m8733O();
        Intrinsics.checkNotNullExpressionValue(moveConfig, "moveConfig");
        MoveConfigEntity moveConfigEntityM2356d = c5230b.m2356d(moveConfig);
        moveConfigEntityM2356d.m7603i();
        headerEntity.m7527k().m13190w(moveConfigEntityM2356d);
        EzyHeader.BackgroundLineConfig defaultBackgroundLineConfig = headerM2361i.m8728I();
        Intrinsics.checkNotNullExpressionValue(defaultBackgroundLineConfig, "defaultBackgroundLineConfig");
        BackgroundLineConfigEntity backgroundLineConfigEntityM2355c = c5230b.m2355c(defaultBackgroundLineConfig);
        backgroundLineConfigEntityM2355c.m7404f();
        headerEntity.m7521e().m13190w(backgroundLineConfigEntityM2355c);
        EzyHeader.BackgroundLineConfig lastBackgroundLineConfig = headerM2361i.m8732N();
        Intrinsics.checkNotNullExpressionValue(lastBackgroundLineConfig, "lastBackgroundLineConfig");
        BackgroundLineConfigEntity backgroundLineConfigEntityM2355c2 = c5230b.m2355c(lastBackgroundLineConfig);
        backgroundLineConfigEntityM2355c2.m7404f();
        headerEntity.m7526j().m13190w(backgroundLineConfigEntityM2355c2);
        List<EzyHeader.Author> listM8735Q = headerM2361i.m8735Q();
        Intrinsics.checkNotNullExpressionValue(listM8735Q, "this.providerList");
        for (EzyHeader.Author it : listM8735Q) {
            C5230b c5230b2 = f2464a;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            AuthorEntity authorEntityM2354b2 = c5230b2.m2354b(it);
            authorEntityM2354b2.m7394h();
            headerEntity.m7529m().add(authorEntityM2354b2);
        }
        headerEntity.m7533q();
        pageEntity.m7613e().m13190w(headerEntity);
    }

    /* renamed from: B */
    public final BlackBoardEntity m2348B(final String path) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(path, "path");
        File file = new File(path, "page_router.bin");
        if (!file.exists() || !file.isFile()) {
            throw new FileNotFoundException(path);
        }
        final BlackBoardEntity blackBoardEntity = new BlackBoardEntity(0L, path);
        final EzyPageRouter.PageRouter pageRouterM8903w = EzyPageRouter.PageRouter.m8903w(new FileInputStream(file));
        C9685d.f17121a.m16165f().m13093G(new Runnable() { // from class: c5.a
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, IOException, IllegalArgumentException {
                C5230b.m2345C(pageRouterM8903w, blackBoardEntity, path);
            }
        });
        blackBoardEntity.m7416d();
        return blackBoardEntity;
    }

    /* renamed from: D */
    public final void m2349D(TextRecordEntity record, List list) {
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzySource.TextSource.TextInfo textInfo = (EzySource.TextSource.TextInfo) it.next();
            float width = textInfo.m9565u().getWidth();
            int color = textInfo.m9565u().getColor();
            float fM9108y = textInfo.m9565u().m9108y();
            int iM9107x = textInfo.m9565u().m9107x();
            String content = textInfo.getContent();
            Intrinsics.checkNotNullExpressionValue(content, "it.content");
            arrayList.add(new TextInfoEntity(0L, width, color, fM9108y, iM9107x, content));
        }
        C9685d.f17121a.m16165f().m13101h(TextInfoEntity.class).m2256m(arrayList);
        record.m7675c().addAll(arrayList);
    }

    /* renamed from: E */
    public final void m2350E(String pagePath, RecordEntity recordEntity, List list) {
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        Intrinsics.checkNotNullParameter(recordEntity, "recordEntity");
        Intrinsics.checkNotNullParameter(list, "list");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzyRouterRecord.RouterRecord.SourceCommandRecord sourceCommandRecord = (EzyRouterRecord.RouterRecord.SourceCommandRecord) it.next();
            String fileName = sourceCommandRecord.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName, "it.fileName");
            String strM9251t = sourceCommandRecord.m9251t();
            Intrinsics.checkNotNullExpressionValue(strM9251t, "it.validate");
            TextRecordEntity textRecordEntity = new TextRecordEntity(0L, fileName, strM9251t);
            C5230b c5230b = f2464a;
            String fileName2 = sourceCommandRecord.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName2, "it.fileName");
            String strM9251t2 = sourceCommandRecord.m9251t();
            Intrinsics.checkNotNullExpressionValue(strM9251t2, "it.validate");
            List listM9553t = c5230b.m2365m(pagePath, fileName2, strM9251t2).m9553t();
            Intrinsics.checkNotNullExpressionValue(listM9553t, "this.textInfoList");
            c5230b.m2349D(textRecordEntity, listM9553t);
            textRecordEntity.m7677e();
            recordEntity.m7636h().add(textRecordEntity);
        }
    }

    /* renamed from: F */
    public final void m2351F(TouchRecordEntity record, List list) {
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzySource.TouchSource.TouchInfo touchInfo = (EzySource.TouchSource.TouchInfo) it.next();
            TouchEventEntity touchEventEntity = new TouchEventEntity(0L, touchInfo.m9637v().getWidth(), touchInfo.m9637v().getColor(), touchInfo.m9637v().m9106w(), touchInfo.m9637v().m9105v(), touchInfo.m9637v().m9107x(), touchInfo.m9637v().m9108y());
            C5230b c5230b = f2464a;
            List touchEventList = touchInfo.getTouchEventList();
            Intrinsics.checkNotNullExpressionValue(touchEventList, "it.touchEventList");
            c5230b.m2352G(touchEventEntity, touchEventList);
            arrayList.add(touchEventEntity);
        }
        C9685d.f17121a.m16165f().m13101h(TouchEventEntity.class).m2256m(arrayList);
        record.m7717c().addAll(arrayList);
    }

    /* renamed from: G */
    public final void m2352G(TouchEventEntity event, List list) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzyTouchEvent.TouchEvent touchEvent = (EzyTouchEvent.TouchEvent) it.next();
            arrayList.add(new TouchInfoEntity(0L, touchEvent.getEventTime(), touchEvent.getX(), touchEvent.getY()));
        }
        C9685d.f17121a.m16165f().m13101h(TouchInfoEntity.class).m2256m(arrayList);
        event.m7693h().addAll(arrayList);
    }

    /* renamed from: H */
    public final void m2353H(String pagePath, RecordEntity recordEntity, List touchSourceRecordList) {
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        Intrinsics.checkNotNullParameter(recordEntity, "recordEntity");
        Intrinsics.checkNotNullParameter(touchSourceRecordList, "touchSourceRecordList");
        Iterator it = touchSourceRecordList.iterator();
        while (it.hasNext()) {
            EzyRouterRecord.RouterRecord.SourceCommandRecord sourceCommandRecord = (EzyRouterRecord.RouterRecord.SourceCommandRecord) it.next();
            String fileName = sourceCommandRecord.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName, "it.fileName");
            String strM9251t = sourceCommandRecord.m9251t();
            Intrinsics.checkNotNullExpressionValue(strM9251t, "it.validate");
            TouchRecordEntity touchRecordEntity = new TouchRecordEntity(0L, fileName, strM9251t);
            C5230b c5230b = f2464a;
            String fileName2 = sourceCommandRecord.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName2, "it.fileName");
            String strM9251t2 = sourceCommandRecord.m9251t();
            Intrinsics.checkNotNullExpressionValue(strM9251t2, "it.validate");
            List listM9623t = c5230b.m2366n(pagePath, fileName2, strM9251t2).m9623t();
            Intrinsics.checkNotNullExpressionValue(listM9623t, "this.touchInfoList");
            c5230b.m2351F(touchRecordEntity, listM9623t);
            touchRecordEntity.m7719e();
            recordEntity.m7637i().add(touchRecordEntity);
        }
    }

    /* renamed from: b */
    public final AuthorEntity m2354b(EzyHeader.Author author) {
        return new AuthorEntity(0L, author.m8642y(), author.m8641x(), author.m8636C(), author.m8637D(), Long.valueOf(author.getStartTime()), Long.valueOf(author.m8635B()));
    }

    /* renamed from: c */
    public final BackgroundLineConfigEntity m2355c(EzyHeader.BackgroundLineConfig backgroundLineConfig) { // 页头导入：颜色、间距与类型取自消息，构造掩码 16 使线宽使用 3 像素默认值。
        int iM8677u = backgroundLineConfig.m8677u();
        float fM8678v = backgroundLineConfig.m8678v();
        EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum backgroundLineTypeEnumM8679w = backgroundLineConfig.m8679w();
        Intrinsics.checkNotNullExpressionValue(backgroundLineTypeEnumM8679w, "backgroundLineConfig.lineType");
        return new BackgroundLineConfigEntity(0L, iM8677u, fM8678v, backgroundLineTypeEnumM8679w, 0.0f, 16, null);
    }

    /* renamed from: d */
    public final MoveConfigEntity m2356d(EzyHeader.MoveConfig moveConfig) {
        return new MoveConfigEntity(0L, moveConfig.m8809x(), moveConfig.m8803C(), moveConfig.m8808w(), moveConfig.m8802B(), moveConfig.m8801A(), moveConfig.m8810y(), moveConfig.m8811z());
    }

    /* renamed from: e */
    public final EzyCommand.CommandSource m2357e(String pagePath, String fileName, String validate) throws NoSuchAlgorithmException, IOException {
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(validate, "validate");
        File file = new File(pagePath, fileName);
        FileValidateUtils.f9141a.m8017c(FileValidateUtils.TypeEnum.SHA256, validate, file);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzyCommand.CommandSource record = EzyCommand.CommandSource.m8058x(fileInputStream);
        fileInputStream.close();
        Intrinsics.checkNotNullExpressionValue(record, "record");
        return record;
    }

    /* renamed from: f */
    public final EzyCommand.CommandSource m2358f(String pagePath, String fileName, String validate) throws NoSuchAlgorithmException, IOException {
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(validate, "validate");
        File file = new File(pagePath, fileName);
        FileValidateUtils.f9141a.m8017c(FileValidateUtils.TypeEnum.SHA256, validate, file);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzyCommand.CommandSource record = EzyCommand.CommandSource.m8058x(fileInputStream);
        fileInputStream.close();
        Intrinsics.checkNotNullExpressionValue(record, "record");
        return record;
    }

    /* renamed from: g */
    public final EzySource.FileSource m2359g(String pagePath, String fileName, String validate) throws NoSuchAlgorithmException, IOException {
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(validate, "validate");
        File file = new File(pagePath, fileName);
        FileValidateUtils.f9141a.m8017c(FileValidateUtils.TypeEnum.SHA256, validate, file);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzySource.FileSource record = EzySource.FileSource.m9344x(fileInputStream);
        fileInputStream.close();
        Intrinsics.checkNotNullExpressionValue(record, "record");
        return record;
    }

    /* renamed from: h */
    public final EzySource.GeometrySource m2360h(String pagePath, String fileName, String validate) throws NoSuchAlgorithmException, IOException {
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(validate, "validate");
        File file = new File(pagePath, fileName);
        FileValidateUtils.f9141a.m8017c(FileValidateUtils.TypeEnum.SHA256, validate, file);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzySource.GeometrySource record = EzySource.GeometrySource.m9411w(fileInputStream);
        fileInputStream.close();
        Intrinsics.checkNotNullExpressionValue(record, "record");
        return record;
    }

    /* renamed from: i */
    public final EzyHeader.Header m2361i(String path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        File file = new File(path, "header.bin");
        if (!file.exists()) {
            throw new FileNotFoundException(path);
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzyHeader.Header header = EzyHeader.Header.m8711Y(fileInputStream);
        fileInputStream.close();
        Intrinsics.checkNotNullExpressionValue(header, "header");
        return header;
    }

    /* renamed from: j */
    public final EzySource.MatrixSource m2362j(String pagePath, String fileName, String validate) throws NoSuchAlgorithmException, IOException {
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(validate, "validate");
        File file = new File(pagePath, fileName);
        FileValidateUtils.f9141a.m8017c(FileValidateUtils.TypeEnum.SHA256, validate, file);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzySource.MatrixSource record = EzySource.MatrixSource.m9486w(fileInputStream);
        fileInputStream.close();
        Intrinsics.checkNotNullExpressionValue(record, "record");
        return record;
    }

    /* renamed from: k */
    public final EzyPageRouter.PageRouter m2363k(String path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        File file = new File(path, "page_router.bin");
        if (!file.exists()) {
            throw new FileNotFoundException(path);
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzyPageRouter.PageRouter record = EzyPageRouter.PageRouter.m8903w(fileInputStream);
        fileInputStream.close();
        Intrinsics.checkNotNullExpressionValue(record, "record");
        return record;
    }

    /* renamed from: l */
    public final EzyRouterRecord.RouterRecord m2364l(String path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        File file = new File(path, "router.bin");
        if (!file.exists()) {
            throw new FileNotFoundException(path);
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzyRouterRecord.RouterRecord record = EzyRouterRecord.RouterRecord.m9212X(fileInputStream);
        fileInputStream.close();
        Intrinsics.checkNotNullExpressionValue(record, "record");
        return record;
    }

    /* renamed from: m */
    public final EzySource.TextSource m2365m(String pagePath, String fileName, String validate) throws NoSuchAlgorithmException, IOException {
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(validate, "validate");
        File file = new File(pagePath, fileName);
        FileValidateUtils.f9141a.m8017c(FileValidateUtils.TypeEnum.SHA256, validate, file);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzySource.TextSource record = EzySource.TextSource.m9550x(fileInputStream);
        fileInputStream.close();
        Intrinsics.checkNotNullExpressionValue(record, "record");
        return record;
    }

    /* renamed from: n */
    public final EzySource.TouchSource m2366n(String pagePath, String fileName, String validate) throws NoSuchAlgorithmException, IOException {
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(validate, "validate");
        File file = new File(pagePath, fileName);
        FileValidateUtils.f9141a.m8017c(FileValidateUtils.TypeEnum.SHA256, validate, file);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzySource.TouchSource record = EzySource.TouchSource.m9620x(fileInputStream);
        fileInputStream.close();
        Intrinsics.checkNotNullExpressionValue(record, "record");
        return record;
    }

    /* renamed from: o */
    public final void m2367o(AudioRecordEntity audioRecordEntity, List audioInfoList) {
        Intrinsics.checkNotNullParameter(audioRecordEntity, "audioRecordEntity");
        Intrinsics.checkNotNullParameter(audioInfoList, "audioInfoList");
        ArrayList arrayList = new ArrayList();
        Iterator it = audioInfoList.iterator();
        while (it.hasNext()) {
            EzyCommand.CommandSource.CommandInfo commandInfo = (EzyCommand.CommandSource.CommandInfo) it.next();
            long jM8081y = commandInfo.m8081y();
            long jM8082z = commandInfo.m8082z();
            boolean zM8073A = commandInfo.m8073A();
            EzyCommandEnum.CommandEnum commandEnumM8077t = commandInfo.m8077t();
            Intrinsics.checkNotNullExpressionValue(commandEnumM8077t, "it.commandEnum");
            byte[] byteArray = commandInfo.m8079v().toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "it.data.toByteArray()");
            arrayList.add(new AudioInfoEntity(0L, jM8081y, jM8082z, zM8073A, commandEnumM8077t, byteArray));
        }
        C9685d.f17121a.m16165f().m13101h(AudioInfoEntity.class).m2256m(arrayList);
        audioRecordEntity.m7373a().addAll(arrayList);
    }

    /* renamed from: p */
    public final void m2368p(String pagePath, RecordEntity recordEntity, List list) {
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        Intrinsics.checkNotNullParameter(recordEntity, "recordEntity");
        Intrinsics.checkNotNullParameter(list, "list");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzyRouterRecord.RouterRecord.SourceCommandRecord sourceCommandRecord = (EzyRouterRecord.RouterRecord.SourceCommandRecord) it.next();
            String fileName = sourceCommandRecord.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName, "it.fileName");
            String strM9251t = sourceCommandRecord.m9251t();
            Intrinsics.checkNotNullExpressionValue(strM9251t, "it.validate");
            AudioRecordEntity audioRecordEntity = new AudioRecordEntity(0L, fileName, strM9251t);
            C5230b c5230b = f2464a;
            String fileName2 = sourceCommandRecord.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName2, "it.fileName");
            String strM9251t2 = sourceCommandRecord.m9251t();
            Intrinsics.checkNotNullExpressionValue(strM9251t2, "it.validate");
            List listM8060n = c5230b.m2357e(pagePath, fileName2, strM9251t2).m8060n();
            Intrinsics.checkNotNullExpressionValue(listM8060n, "this.commandInfoList");
            c5230b.m2367o(audioRecordEntity, listM8060n);
            audioRecordEntity.m7377e();
            recordEntity.m7629a().add(audioRecordEntity);
        }
    }

    /* renamed from: q */
    public final void m2369q(CommandRecordEntity commandRecordEntity, List commandInfoList) {
        Intrinsics.checkNotNullParameter(commandRecordEntity, "commandRecordEntity");
        Intrinsics.checkNotNullParameter(commandInfoList, "commandInfoList");
        ArrayList arrayList = new ArrayList();
        Iterator it = commandInfoList.iterator();
        while (it.hasNext()) {
            EzyCommand.CommandSource.CommandInfo commandInfo = (EzyCommand.CommandSource.CommandInfo) it.next();
            long jM8081y = commandInfo.m8081y();
            long jM8082z = commandInfo.m8082z();
            boolean zM8073A = commandInfo.m8073A();
            EzyCommandEnum.CommandEnum commandEnumM8077t = commandInfo.m8077t();
            Intrinsics.checkNotNullExpressionValue(commandEnumM8077t, "it.commandEnum");
            byte[] byteArray = commandInfo.m8079v().toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "it.data.toByteArray()");
            arrayList.add(new CommandInfoEntity(0L, jM8081y, jM8082z, zM8073A, commandEnumM8077t, byteArray));
        }
        C9685d.f17121a.m16165f().m13101h(CommandInfoEntity.class).m2256m(arrayList);
        commandRecordEntity.m7438a().addAll(arrayList);
    }

    /* renamed from: r */
    public final void m2370r(String pagePath, RecordEntity recordEntity, List sourceCommandRecordList) {
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        Intrinsics.checkNotNullParameter(recordEntity, "recordEntity");
        Intrinsics.checkNotNullParameter(sourceCommandRecordList, "sourceCommandRecordList");
        Iterator it = sourceCommandRecordList.iterator();
        while (it.hasNext()) {
            EzyRouterRecord.RouterRecord.SourceCommandRecord sourceCommandRecord = (EzyRouterRecord.RouterRecord.SourceCommandRecord) it.next();
            String fileName = sourceCommandRecord.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName, "it.fileName");
            String strM9251t = sourceCommandRecord.m9251t();
            Intrinsics.checkNotNullExpressionValue(strM9251t, "it.validate");
            CommandRecordEntity commandRecordEntity = new CommandRecordEntity(0L, fileName, strM9251t);
            C5230b c5230b = f2464a;
            String fileName2 = sourceCommandRecord.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName2, "it.fileName");
            String strM9251t2 = sourceCommandRecord.m9251t();
            Intrinsics.checkNotNullExpressionValue(strM9251t2, "it.validate");
            List listM8060n = c5230b.m2358f(pagePath, fileName2, strM9251t2).m8060n();
            Intrinsics.checkNotNullExpressionValue(listM8060n, "this.commandInfoList");
            c5230b.m2369q(commandRecordEntity, listM8060n);
            commandRecordEntity.m7442e();
            recordEntity.m7630b().add(commandRecordEntity);
        }
    }

    /* renamed from: s */
    public final void m2371s(FileRecordEntity record, List list) {
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzySource.FileSource.FileInfo fileInfo = (EzySource.FileSource.FileInfo) it.next();
            String name = fileInfo.getName();
            Intrinsics.checkNotNullExpressionValue(name, "it.name");
            int width = fileInfo.getWidth();
            int height = fileInfo.getHeight();
            String strM9360v = fileInfo.m9360v();
            Intrinsics.checkNotNullExpressionValue(strM9360v, "it.validate");
            arrayList.add(new FileInfoEntity(0L, name, width, height, strM9360v));
        }
        C9685d.f17121a.m16165f().m13101h(FileInfoEntity.class).m2256m(arrayList);
        record.m7464a().addAll(arrayList);
    }

    /* renamed from: t */
    public final void m2372t(String pagePath, RecordEntity recordEntity, List list) {
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        Intrinsics.checkNotNullParameter(recordEntity, "recordEntity");
        Intrinsics.checkNotNullParameter(list, "list");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzyRouterRecord.RouterRecord.SourceCommandRecord sourceCommandRecord = (EzyRouterRecord.RouterRecord.SourceCommandRecord) it.next();
            String fileName = sourceCommandRecord.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName, "it.fileName");
            String strM9251t = sourceCommandRecord.m9251t();
            Intrinsics.checkNotNullExpressionValue(strM9251t, "it.validate");
            FileRecordEntity fileRecordEntity = new FileRecordEntity(0L, fileName, strM9251t);
            C5230b c5230b = f2464a;
            String fileName2 = sourceCommandRecord.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName2, "it.fileName");
            String strM9251t2 = sourceCommandRecord.m9251t();
            Intrinsics.checkNotNullExpressionValue(strM9251t2, "it.validate");
            List listM9347t = c5230b.m2359g(pagePath, fileName2, strM9251t2).m9347t();
            Intrinsics.checkNotNullExpressionValue(listM9347t, "this.fileInfoList");
            c5230b.m2371s(fileRecordEntity, listM9347t);
            fileRecordEntity.m7468e();
            recordEntity.m7631c().add(fileRecordEntity);
        }
    }

    /* renamed from: u */
    public final void m2373u(GeometryRecordEntity record, List list) {
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzySource.GeometrySource.GeometryInfo geometryInfo = (EzySource.GeometrySource.GeometryInfo) it.next();
            GeometryInfoEntity geometryInfoEntity = new GeometryInfoEntity(0L, geometryInfo.m9433y().getWidth(), geometryInfo.m9433y().getColor(), geometryInfo.m9433y().m9108y(), geometryInfo.m9433y().m9107x(), geometryInfo.m9432x());
            C5230b c5230b = f2464a;
            List pointsList = geometryInfo.getPointsList();
            Intrinsics.checkNotNullExpressionValue(pointsList, "it.pointsList");
            c5230b.m2374v(geometryInfoEntity, pointsList);
            arrayList.add(geometryInfoEntity);
        }
        C9685d.f17121a.m16165f().m13101h(GeometryInfoEntity.class).m2256m(arrayList);
        record.m7505b().addAll(arrayList);
    }

    /* renamed from: v */
    public final void m2374v(GeometryInfoEntity geometryInfo, List list) {
        Intrinsics.checkNotNullParameter(geometryInfo, "geometryInfo");
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzyPointF.PointF pointF = (EzyPointF.PointF) it.next();
            arrayList.add(new GeometryPointFEntity(0L, pointF.getX(), pointF.getY()));
        }
        C9685d.f17121a.m16165f().m13101h(GeometryPointFEntity.class).m2256m(arrayList);
        geometryInfo.m7480d().addAll(arrayList);
    }

    /* renamed from: w */
    public final void m2375w(String pagePath, RecordEntity recordEntity, List list) {
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        Intrinsics.checkNotNullParameter(recordEntity, "recordEntity");
        Intrinsics.checkNotNullParameter(list, "list");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzyRouterRecord.RouterRecord.SourceCommandRecord sourceCommandRecord = (EzyRouterRecord.RouterRecord.SourceCommandRecord) it.next();
            String fileName = sourceCommandRecord.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName, "it.fileName");
            String strM9251t = sourceCommandRecord.m9251t();
            Intrinsics.checkNotNullExpressionValue(strM9251t, "it.validate");
            GeometryRecordEntity geometryRecordEntity = new GeometryRecordEntity(0L, fileName, strM9251t);
            C5230b c5230b = f2464a;
            String fileName2 = sourceCommandRecord.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName2, "it.fileName");
            String strM9251t2 = sourceCommandRecord.m9251t();
            Intrinsics.checkNotNullExpressionValue(strM9251t2, "it.validate");
            List listM9414q = c5230b.m2360h(pagePath, fileName2, strM9251t2).m9414q();
            Intrinsics.checkNotNullExpressionValue(listM9414q, "this.geometryInfoList");
            c5230b.m2373u(geometryRecordEntity, listM9414q);
            geometryRecordEntity.m7508e();
            recordEntity.m7632d().add(geometryRecordEntity);
        }
    }

    /* renamed from: x */
    public final void m2376x(MatrixRecordEntity record, List list) {
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzySource.MatrixSource.MatrixInfo matrixInfo = (EzySource.MatrixSource.MatrixInfo) it.next();
            MatrixEventEntity matrixEventEntity = new MatrixEventEntity(0L);
            C5230b c5230b = f2464a;
            List matrixList = matrixInfo.getMatrixList();
            Intrinsics.checkNotNullExpressionValue(matrixList, "it.matrixList");
            c5230b.m2377y(matrixEventEntity, matrixList);
            arrayList.add(matrixEventEntity);
        }
        C9685d.f17121a.m16165f().m13101h(MatrixEventEntity.class).m2256m(arrayList);
        record.m7584c().addAll(arrayList);
    }

    /* renamed from: y */
    public final void m2377y(MatrixEventEntity event, List list) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzyMatrix.Matrix matrix = (EzyMatrix.Matrix) it.next();
            arrayList.add(new MatrixInfoEntity(0L, matrix.getEventTime(), matrix.getScaleX(), matrix.m8853C(), matrix.m8855E(), matrix.m8854D(), matrix.getScaleY(), matrix.m8856F(), matrix.m8861z(), matrix.m8851A(), matrix.m8852B()));
        }
        C9685d.f17121a.m16165f().m13101h(MatrixInfoEntity.class).m2256m(arrayList);
        event.m7553b().addAll(arrayList);
    }

    /* renamed from: z */
    public final void m2378z(String pagePath, RecordEntity recordEntity, List matrixSourceRecordList) {
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        Intrinsics.checkNotNullParameter(recordEntity, "recordEntity");
        Intrinsics.checkNotNullParameter(matrixSourceRecordList, "matrixSourceRecordList");
        Iterator it = matrixSourceRecordList.iterator();
        while (it.hasNext()) {
            EzyRouterRecord.RouterRecord.SourceCommandRecord sourceCommandRecord = (EzyRouterRecord.RouterRecord.SourceCommandRecord) it.next();
            String fileName = sourceCommandRecord.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName, "it.fileName");
            String strM9251t = sourceCommandRecord.m9251t();
            Intrinsics.checkNotNullExpressionValue(strM9251t, "it.validate");
            MatrixRecordEntity matrixRecordEntity = new MatrixRecordEntity(0L, fileName, strM9251t);
            C5230b c5230b = f2464a;
            String fileName2 = sourceCommandRecord.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName2, "it.fileName");
            String strM9251t2 = sourceCommandRecord.m9251t();
            Intrinsics.checkNotNullExpressionValue(strM9251t2, "it.validate");
            List listM9489q = c5230b.m2362j(pagePath, fileName2, strM9251t2).m9489q();
            Intrinsics.checkNotNullExpressionValue(listM9489q, "this.matrixInfoList");
            c5230b.m2376x(matrixRecordEntity, listM9489q);
            matrixRecordEntity.m7586e();
            recordEntity.m7634f().add(matrixRecordEntity);
        }
    }
}
