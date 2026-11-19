package p166m4;

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
import p077e5.C7342c;

/* renamed from: m4.b */
/* loaded from: classes4.dex */
public final class C8550b {

    /* renamed from: a */
    public static final C8550b f14183a = new C8550b();

    /* renamed from: C */
    public static final void m14063C(EzyPageRouter.PageRouter pageRouter, BlackBoardEntity boardEntity, String path) throws IllegalAccessException, IOException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(boardEntity, "$boardEntity");
        Intrinsics.checkNotNullParameter(path, "$path");
        List<EzyPageRouter.PageRouter.PageInfo> pageInfoList = pageRouter.m7777o();
        Intrinsics.checkNotNullExpressionValue(pageInfoList, "pageInfoList");
        for (EzyPageRouter.PageRouter.PageInfo pageInfo : pageInfoList) {
            LogUtils.m3239i("[SourceLoad]:loadRecord-> page:" + pageInfo.getName());
            String name = pageInfo.getName();
            Intrinsics.checkNotNullExpressionValue(name, "it.name");
            PageEntity pageEntity = new PageEntity(0L, name, false, null, 0, 28, null);
            f14183a.m14065A(path, pageEntity);
            pageEntity.m6507a().m13071t(boardEntity);
            pageEntity.m6515i();
            boardEntity.m6318c().add(pageEntity);
        }
        boardEntity.m6319d();
    }

    /* renamed from: A */
    public final void m14065A(String dir, PageEntity pageEntity) throws IllegalAccessException, IOException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        Intrinsics.checkNotNullParameter(pageEntity, "pageEntity");
        String pagePath = new File(dir, pageEntity.getDirName()).getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(pagePath, "pagePath");
        EzyRouterRecord.RouterRecord routerRecordM14082l = m14082l(pagePath);
        RecordEntity recordEntity = new RecordEntity(0L);
        C8550b c8550b = f14183a;
        List commandRecordList = routerRecordM14082l.m8097E();
        Intrinsics.checkNotNullExpressionValue(commandRecordList, "commandRecordList");
        c8550b.m14088r(pagePath, recordEntity, commandRecordList);
        List touchSourceRecordList = routerRecordM14082l.m8108Q();
        Intrinsics.checkNotNullExpressionValue(touchSourceRecordList, "touchSourceRecordList");
        c8550b.m14071H(pagePath, recordEntity, touchSourceRecordList);
        List matrixSourceRecordList = routerRecordM14082l.m8104M();
        Intrinsics.checkNotNullExpressionValue(matrixSourceRecordList, "matrixSourceRecordList");
        c8550b.m14096z(pagePath, recordEntity, matrixSourceRecordList);
        List fileSourceRecordList = routerRecordM14082l.m8100I();
        Intrinsics.checkNotNullExpressionValue(fileSourceRecordList, "fileSourceRecordList");
        c8550b.m14090t(pagePath, recordEntity, fileSourceRecordList);
        List textSourceRecordList = routerRecordM14082l.m8106O();
        Intrinsics.checkNotNullExpressionValue(textSourceRecordList, "textSourceRecordList");
        c8550b.m14068E(pagePath, recordEntity, textSourceRecordList);
        List geometrySourceRecordList = routerRecordM14082l.m8102K();
        Intrinsics.checkNotNullExpressionValue(geometrySourceRecordList, "geometrySourceRecordList");
        c8550b.m14093w(pagePath, recordEntity, geometrySourceRecordList);
        List audioRecordList = routerRecordM14082l.m8095C();
        Intrinsics.checkNotNullExpressionValue(audioRecordList, "audioRecordList");
        c8550b.m14086p(pagePath, recordEntity, audioRecordList);
        recordEntity.m6536j();
        pageEntity.m6513g().m13071t(recordEntity);
        EzyHeader.Header headerM14079i = m14079i(pagePath);
        int version = headerM14079i.getVersion();
        int width = headerM14079i.getWidth();
        int height = headerM14079i.getHeight();
        long createDate = headerM14079i.getCreateDate();
        long updateDate = headerM14079i.getUpdateDate();
        long jM7606I = headerM14079i.m7606I();
        String strM7602D = headerM14079i.m7602D();
        Intrinsics.checkNotNullExpressionValue(strM7602D, "this.convertUrl");
        HeaderEntity headerEntity = new HeaderEntity(0L, version, width, height, createDate, updateDate, jM7606I, strM7602D, headerM14079i.m7603E(), headerM14079i.m7607J());
        EzyHeader.Author authorM7601C = headerM14079i.m7601C();
        Intrinsics.checkNotNullExpressionValue(authorM7601C, "this.author");
        AuthorEntity authorEntityM14072b = c8550b.m14072b(authorM7601C);
        authorEntityM14072b.m6301h();
        headerEntity.m6417a().m13071t(authorEntityM14072b);
        EzyHeader.MoveConfig moveConfig = headerM14079i.m7609L();
        Intrinsics.checkNotNullExpressionValue(moveConfig, "moveConfig");
        MoveConfigEntity moveConfigEntityM14074d = c8550b.m14074d(moveConfig);
        moveConfigEntityM14074d.m6501i();
        headerEntity.m6427k().m13071t(moveConfigEntityM14074d);
        EzyHeader.BackgroundLineConfig defaultBackgroundLineConfig = headerM14079i.m7604F();
        Intrinsics.checkNotNullExpressionValue(defaultBackgroundLineConfig, "defaultBackgroundLineConfig");
        BackgroundLineConfigEntity backgroundLineConfigEntityM14073c = c8550b.m14073c(defaultBackgroundLineConfig);
        backgroundLineConfigEntityM14073c.m6311f();
        headerEntity.m6421e().m13071t(backgroundLineConfigEntityM14073c);
        EzyHeader.BackgroundLineConfig lastBackgroundLineConfig = headerM14079i.m7608K();
        Intrinsics.checkNotNullExpressionValue(lastBackgroundLineConfig, "lastBackgroundLineConfig");
        BackgroundLineConfigEntity backgroundLineConfigEntityM14073c2 = c8550b.m14073c(lastBackgroundLineConfig);
        backgroundLineConfigEntityM14073c2.m6311f();
        headerEntity.m6426j().m13071t(backgroundLineConfigEntityM14073c2);
        List<EzyHeader.Author> listM7611N = headerM14079i.m7611N();
        Intrinsics.checkNotNullExpressionValue(listM7611N, "this.providerList");
        for (EzyHeader.Author it : listM7611N) {
            C8550b c8550b2 = f14183a;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            AuthorEntity authorEntityM14072b2 = c8550b2.m14072b(it);
            authorEntityM14072b2.m6301h();
            headerEntity.m6429m().add(authorEntityM14072b2);
        }
        headerEntity.m6433q();
        pageEntity.m6511e().m13071t(headerEntity);
    }

    /* renamed from: B */
    public final BlackBoardEntity m14066B(final String path) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(path, "path");
        File file = new File(path, "page_router.bin");
        if (!file.exists() || !file.isFile()) {
            throw new FileNotFoundException(path);
        }
        final BlackBoardEntity blackBoardEntity = new BlackBoardEntity(0L, path);
        final EzyPageRouter.PageRouter pageRouterM7774t = EzyPageRouter.PageRouter.m7774t(new FileInputStream(file));
        C7342c.f11908a.m11744b().m12973G(new Runnable() { // from class: m4.a
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, IOException, IllegalArgumentException {
                C8550b.m14063C(pageRouterM7774t, blackBoardEntity, path);
            }
        });
        blackBoardEntity.m6319d();
        return blackBoardEntity;
    }

    /* renamed from: D */
    public final void m14067D(TextRecordEntity record, List list) {
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzySource.TextSource.TextInfo textInfo = (EzySource.TextSource.TextInfo) it.next();
            float width = textInfo.m8415r().getWidth();
            int color = textInfo.m8415r().getColor();
            float fM7973v = textInfo.m8415r().m7973v();
            int iM7972u = textInfo.m8415r().m7972u();
            String content = textInfo.getContent();
            Intrinsics.checkNotNullExpressionValue(content, "it.content");
            arrayList.add(new TextInfoEntity(0L, width, color, fM7973v, iM7972u, content));
        }
        C7342c.f11908a.m11744b().m12981h(TextInfoEntity.class).m15046m(arrayList);
        record.m6573c().addAll(arrayList);
    }

    /* renamed from: E */
    public final void m14068E(String pagePath, RecordEntity recordEntity, List list) {
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        Intrinsics.checkNotNullParameter(recordEntity, "recordEntity");
        Intrinsics.checkNotNullParameter(list, "list");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzyRouterRecord.RouterRecord.SourceCommandRecord sourceCommandRecord = (EzyRouterRecord.RouterRecord.SourceCommandRecord) it.next();
            String fileName = sourceCommandRecord.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName, "it.fileName");
            String strM8119q = sourceCommandRecord.m8119q();
            Intrinsics.checkNotNullExpressionValue(strM8119q, "it.validate");
            TextRecordEntity textRecordEntity = new TextRecordEntity(0L, fileName, strM8119q);
            C8550b c8550b = f14183a;
            String fileName2 = sourceCommandRecord.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName2, "it.fileName");
            String strM8119q2 = sourceCommandRecord.m8119q();
            Intrinsics.checkNotNullExpressionValue(strM8119q2, "it.validate");
            List listM8403q = c8550b.m14083m(pagePath, fileName2, strM8119q2).m8403q();
            Intrinsics.checkNotNullExpressionValue(listM8403q, "this.textInfoList");
            c8550b.m14067D(textRecordEntity, listM8403q);
            textRecordEntity.m6575e();
            recordEntity.m6534h().add(textRecordEntity);
        }
    }

    /* renamed from: F */
    public final void m14069F(TouchRecordEntity record, List list) {
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzySource.TouchSource.TouchInfo touchInfo = (EzySource.TouchSource.TouchInfo) it.next();
            TouchEventEntity touchEventEntity = new TouchEventEntity(0L, touchInfo.m8482s().getWidth(), touchInfo.m8482s().getColor(), touchInfo.m8482s().m7971t(), touchInfo.m8482s().m7970s(), touchInfo.m8482s().m7972u(), touchInfo.m8482s().m7973v());
            C8550b c8550b = f14183a;
            List touchEventList = touchInfo.getTouchEventList();
            Intrinsics.checkNotNullExpressionValue(touchEventList, "it.touchEventList");
            c8550b.m14070G(touchEventEntity, touchEventList);
            arrayList.add(touchEventEntity);
        }
        C7342c.f11908a.m11744b().m12981h(TouchEventEntity.class).m15046m(arrayList);
        record.m6614c().addAll(arrayList);
    }

    /* renamed from: G */
    public final void m14070G(TouchEventEntity event, List list) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzyTouchEvent.TouchEvent touchEvent = (EzyTouchEvent.TouchEvent) it.next();
            arrayList.add(new TouchInfoEntity(0L, touchEvent.getEventTime(), touchEvent.getX(), touchEvent.getY()));
        }
        C7342c.f11908a.m11744b().m12981h(TouchInfoEntity.class).m15046m(arrayList);
        event.m6590h().addAll(arrayList);
    }

    /* renamed from: H */
    public final void m14071H(String pagePath, RecordEntity recordEntity, List touchSourceRecordList) {
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        Intrinsics.checkNotNullParameter(recordEntity, "recordEntity");
        Intrinsics.checkNotNullParameter(touchSourceRecordList, "touchSourceRecordList");
        Iterator it = touchSourceRecordList.iterator();
        while (it.hasNext()) {
            EzyRouterRecord.RouterRecord.SourceCommandRecord sourceCommandRecord = (EzyRouterRecord.RouterRecord.SourceCommandRecord) it.next();
            String fileName = sourceCommandRecord.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName, "it.fileName");
            String strM8119q = sourceCommandRecord.m8119q();
            Intrinsics.checkNotNullExpressionValue(strM8119q, "it.validate");
            TouchRecordEntity touchRecordEntity = new TouchRecordEntity(0L, fileName, strM8119q);
            C8550b c8550b = f14183a;
            String fileName2 = sourceCommandRecord.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName2, "it.fileName");
            String strM8119q2 = sourceCommandRecord.m8119q();
            Intrinsics.checkNotNullExpressionValue(strM8119q2, "it.validate");
            List listM8469q = c8550b.m14084n(pagePath, fileName2, strM8119q2).m8469q();
            Intrinsics.checkNotNullExpressionValue(listM8469q, "this.touchInfoList");
            c8550b.m14069F(touchRecordEntity, listM8469q);
            touchRecordEntity.m6616e();
            recordEntity.m6535i().add(touchRecordEntity);
        }
    }

    /* renamed from: b */
    public final AuthorEntity m14072b(EzyHeader.Author author) {
        return new AuthorEntity(0L, author.m7519v(), author.m7518u(), author.m7522z(), author.m7514A(), Long.valueOf(author.getStartTime()), Long.valueOf(author.m7521y()));
    }

    /* renamed from: c */
    public final BackgroundLineConfigEntity m14073c(EzyHeader.BackgroundLineConfig backgroundLineConfig) { // 页头导入：颜色、间距与类型取自消息，构造掩码 16 使线宽使用 3 像素默认值。
        int iM7550r = backgroundLineConfig.m7550r();
        float fM7551s = backgroundLineConfig.m7551s();
        EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum backgroundLineTypeEnumM7552t = backgroundLineConfig.m7552t();
        Intrinsics.checkNotNullExpressionValue(backgroundLineTypeEnumM7552t, "backgroundLineConfig.lineType");
        return new BackgroundLineConfigEntity(0L, iM7550r, fM7551s, backgroundLineTypeEnumM7552t, 0.0f, 16, null);
    }

    /* renamed from: d */
    public final MoveConfigEntity m14074d(EzyHeader.MoveConfig moveConfig) {
        return new MoveConfigEntity(0L, moveConfig.m7677u(), moveConfig.m7682z(), moveConfig.m7676t(), moveConfig.m7681y(), moveConfig.m7680x(), moveConfig.m7678v(), moveConfig.m7679w());
    }

    /* renamed from: e */
    public final EzyCommand.CommandSource m14075e(String pagePath, String fileName, String validate) throws NoSuchAlgorithmException, IOException {
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(validate, "validate");
        File file = new File(pagePath, fileName);
        FileValidateUtils.f7853a.m6901c(FileValidateUtils.TypeEnum.SHA256, validate, file);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzyCommand.CommandSource record = EzyCommand.CommandSource.m6942u(fileInputStream);
        fileInputStream.close();
        Intrinsics.checkNotNullExpressionValue(record, "record");
        return record;
    }

    /* renamed from: f */
    public final EzyCommand.CommandSource m14076f(String pagePath, String fileName, String validate) throws NoSuchAlgorithmException, IOException {
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(validate, "validate");
        File file = new File(pagePath, fileName);
        FileValidateUtils.f7853a.m6901c(FileValidateUtils.TypeEnum.SHA256, validate, file);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzyCommand.CommandSource record = EzyCommand.CommandSource.m6942u(fileInputStream);
        fileInputStream.close();
        Intrinsics.checkNotNullExpressionValue(record, "record");
        return record;
    }

    /* renamed from: g */
    public final EzySource.FileSource m14077g(String pagePath, String fileName, String validate) throws NoSuchAlgorithmException, IOException {
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(validate, "validate");
        File file = new File(pagePath, fileName);
        FileValidateUtils.f7853a.m6901c(FileValidateUtils.TypeEnum.SHA256, validate, file);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzySource.FileSource record = EzySource.FileSource.m8203u(fileInputStream);
        fileInputStream.close();
        Intrinsics.checkNotNullExpressionValue(record, "record");
        return record;
    }

    /* renamed from: h */
    public final EzySource.GeometrySource m14078h(String pagePath, String fileName, String validate) throws NoSuchAlgorithmException, IOException {
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(validate, "validate");
        File file = new File(pagePath, fileName);
        FileValidateUtils.f7853a.m6901c(FileValidateUtils.TypeEnum.SHA256, validate, file);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzySource.GeometrySource record = EzySource.GeometrySource.m8268t(fileInputStream);
        fileInputStream.close();
        Intrinsics.checkNotNullExpressionValue(record, "record");
        return record;
    }

    /* renamed from: i */
    public final EzyHeader.Header m14079i(String path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        File file = new File(path, "header.bin");
        if (!file.exists()) {
            throw new FileNotFoundException(path);
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzyHeader.Header header = EzyHeader.Header.m7584V(fileInputStream);
        fileInputStream.close();
        Intrinsics.checkNotNullExpressionValue(header, "header");
        return header;
    }

    /* renamed from: j */
    public final EzySource.MatrixSource m14080j(String pagePath, String fileName, String validate) throws NoSuchAlgorithmException, IOException {
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(validate, "validate");
        File file = new File(pagePath, fileName);
        FileValidateUtils.f7853a.m6901c(FileValidateUtils.TypeEnum.SHA256, validate, file);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzySource.MatrixSource record = EzySource.MatrixSource.m8339t(fileInputStream);
        fileInputStream.close();
        Intrinsics.checkNotNullExpressionValue(record, "record");
        return record;
    }

    /* renamed from: k */
    public final EzyPageRouter.PageRouter m14081k(String path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        File file = new File(path, "page_router.bin");
        if (!file.exists()) {
            throw new FileNotFoundException(path);
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzyPageRouter.PageRouter record = EzyPageRouter.PageRouter.m7774t(fileInputStream);
        fileInputStream.close();
        Intrinsics.checkNotNullExpressionValue(record, "record");
        return record;
    }

    /* renamed from: l */
    public final EzyRouterRecord.RouterRecord m14082l(String path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        File file = new File(path, "router.bin");
        if (!file.exists()) {
            throw new FileNotFoundException(path);
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzyRouterRecord.RouterRecord record = EzyRouterRecord.RouterRecord.m8077U(fileInputStream);
        fileInputStream.close();
        Intrinsics.checkNotNullExpressionValue(record, "record");
        return record;
    }

    /* renamed from: m */
    public final EzySource.TextSource m14083m(String pagePath, String fileName, String validate) throws NoSuchAlgorithmException, IOException {
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(validate, "validate");
        File file = new File(pagePath, fileName);
        FileValidateUtils.f7853a.m6901c(FileValidateUtils.TypeEnum.SHA256, validate, file);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzySource.TextSource record = EzySource.TextSource.m8400u(fileInputStream);
        fileInputStream.close();
        Intrinsics.checkNotNullExpressionValue(record, "record");
        return record;
    }

    /* renamed from: n */
    public final EzySource.TouchSource m14084n(String pagePath, String fileName, String validate) throws NoSuchAlgorithmException, IOException {
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(validate, "validate");
        File file = new File(pagePath, fileName);
        FileValidateUtils.f7853a.m6901c(FileValidateUtils.TypeEnum.SHA256, validate, file);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzySource.TouchSource record = EzySource.TouchSource.m8466u(fileInputStream);
        fileInputStream.close();
        Intrinsics.checkNotNullExpressionValue(record, "record");
        return record;
    }

    /* renamed from: o */
    public final void m14085o(AudioRecordEntity audioRecordEntity, List audioInfoList) {
        Intrinsics.checkNotNullParameter(audioRecordEntity, "audioRecordEntity");
        Intrinsics.checkNotNullParameter(audioInfoList, "audioInfoList");
        ArrayList arrayList = new ArrayList();
        Iterator it = audioInfoList.iterator();
        while (it.hasNext()) {
            EzyCommand.CommandSource.CommandInfo commandInfo = (EzyCommand.CommandSource.CommandInfo) it.next();
            long jM6963v = commandInfo.m6963v();
            long jM6964w = commandInfo.m6964w();
            boolean zM6965x = commandInfo.m6965x();
            EzyCommandEnum.CommandEnum commandEnumM6959q = commandInfo.m6959q();
            Intrinsics.checkNotNullExpressionValue(commandEnumM6959q, "it.commandEnum");
            byte[] byteArray = commandInfo.m6961s().toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "it.data.toByteArray()");
            arrayList.add(new AudioInfoEntity(0L, jM6963v, jM6964w, zM6965x, commandEnumM6959q, byteArray));
        }
        C7342c.f11908a.m11744b().m12981h(AudioInfoEntity.class).m15046m(arrayList);
        audioRecordEntity.m6281a().addAll(arrayList);
    }

    /* renamed from: p */
    public final void m14086p(String pagePath, RecordEntity recordEntity, List list) {
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        Intrinsics.checkNotNullParameter(recordEntity, "recordEntity");
        Intrinsics.checkNotNullParameter(list, "list");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzyRouterRecord.RouterRecord.SourceCommandRecord sourceCommandRecord = (EzyRouterRecord.RouterRecord.SourceCommandRecord) it.next();
            String fileName = sourceCommandRecord.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName, "it.fileName");
            String strM8119q = sourceCommandRecord.m8119q();
            Intrinsics.checkNotNullExpressionValue(strM8119q, "it.validate");
            AudioRecordEntity audioRecordEntity = new AudioRecordEntity(0L, fileName, strM8119q);
            C8550b c8550b = f14183a;
            String fileName2 = sourceCommandRecord.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName2, "it.fileName");
            String strM8119q2 = sourceCommandRecord.m8119q();
            Intrinsics.checkNotNullExpressionValue(strM8119q2, "it.validate");
            List listM6944m = c8550b.m14075e(pagePath, fileName2, strM8119q2).m6944m();
            Intrinsics.checkNotNullExpressionValue(listM6944m, "this.commandInfoList");
            c8550b.m14085o(audioRecordEntity, listM6944m);
            audioRecordEntity.m6285e();
            recordEntity.m6527a().add(audioRecordEntity);
        }
    }

    /* renamed from: q */
    public final void m14087q(CommandRecordEntity commandRecordEntity, List commandInfoList) {
        Intrinsics.checkNotNullParameter(commandRecordEntity, "commandRecordEntity");
        Intrinsics.checkNotNullParameter(commandInfoList, "commandInfoList");
        ArrayList arrayList = new ArrayList();
        Iterator it = commandInfoList.iterator();
        while (it.hasNext()) {
            EzyCommand.CommandSource.CommandInfo commandInfo = (EzyCommand.CommandSource.CommandInfo) it.next();
            long jM6963v = commandInfo.m6963v();
            long jM6964w = commandInfo.m6964w();
            boolean zM6965x = commandInfo.m6965x();
            EzyCommandEnum.CommandEnum commandEnumM6959q = commandInfo.m6959q();
            Intrinsics.checkNotNullExpressionValue(commandEnumM6959q, "it.commandEnum");
            byte[] byteArray = commandInfo.m6961s().toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "it.data.toByteArray()");
            arrayList.add(new CommandInfoEntity(0L, jM6963v, jM6964w, zM6965x, commandEnumM6959q, byteArray));
        }
        C7342c.f11908a.m11744b().m12981h(CommandInfoEntity.class).m15046m(arrayList);
        commandRecordEntity.m6341a().addAll(arrayList);
    }

    /* renamed from: r */
    public final void m14088r(String pagePath, RecordEntity recordEntity, List sourceCommandRecordList) {
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        Intrinsics.checkNotNullParameter(recordEntity, "recordEntity");
        Intrinsics.checkNotNullParameter(sourceCommandRecordList, "sourceCommandRecordList");
        Iterator it = sourceCommandRecordList.iterator();
        while (it.hasNext()) {
            EzyRouterRecord.RouterRecord.SourceCommandRecord sourceCommandRecord = (EzyRouterRecord.RouterRecord.SourceCommandRecord) it.next();
            String fileName = sourceCommandRecord.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName, "it.fileName");
            String strM8119q = sourceCommandRecord.m8119q();
            Intrinsics.checkNotNullExpressionValue(strM8119q, "it.validate");
            CommandRecordEntity commandRecordEntity = new CommandRecordEntity(0L, fileName, strM8119q);
            C8550b c8550b = f14183a;
            String fileName2 = sourceCommandRecord.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName2, "it.fileName");
            String strM8119q2 = sourceCommandRecord.m8119q();
            Intrinsics.checkNotNullExpressionValue(strM8119q2, "it.validate");
            List listM6944m = c8550b.m14076f(pagePath, fileName2, strM8119q2).m6944m();
            Intrinsics.checkNotNullExpressionValue(listM6944m, "this.commandInfoList");
            c8550b.m14087q(commandRecordEntity, listM6944m);
            commandRecordEntity.m6345e();
            recordEntity.m6528b().add(commandRecordEntity);
        }
    }

    /* renamed from: s */
    public final void m14089s(FileRecordEntity record, List list) {
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
            String strM8219s = fileInfo.m8219s();
            Intrinsics.checkNotNullExpressionValue(strM8219s, "it.validate");
            arrayList.add(new FileInfoEntity(0L, name, width, height, strM8219s));
        }
        C7342c.f11908a.m11744b().m12981h(FileInfoEntity.class).m15046m(arrayList);
        record.m6366a().addAll(arrayList);
    }

    /* renamed from: t */
    public final void m14090t(String pagePath, RecordEntity recordEntity, List list) {
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        Intrinsics.checkNotNullParameter(recordEntity, "recordEntity");
        Intrinsics.checkNotNullParameter(list, "list");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzyRouterRecord.RouterRecord.SourceCommandRecord sourceCommandRecord = (EzyRouterRecord.RouterRecord.SourceCommandRecord) it.next();
            String fileName = sourceCommandRecord.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName, "it.fileName");
            String strM8119q = sourceCommandRecord.m8119q();
            Intrinsics.checkNotNullExpressionValue(strM8119q, "it.validate");
            FileRecordEntity fileRecordEntity = new FileRecordEntity(0L, fileName, strM8119q);
            C8550b c8550b = f14183a;
            String fileName2 = sourceCommandRecord.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName2, "it.fileName");
            String strM8119q2 = sourceCommandRecord.m8119q();
            Intrinsics.checkNotNullExpressionValue(strM8119q2, "it.validate");
            List listM8206q = c8550b.m14077g(pagePath, fileName2, strM8119q2).m8206q();
            Intrinsics.checkNotNullExpressionValue(listM8206q, "this.fileInfoList");
            c8550b.m14089s(fileRecordEntity, listM8206q);
            fileRecordEntity.m6370e();
            recordEntity.m6529c().add(fileRecordEntity);
        }
    }

    /* renamed from: u */
    public final void m14091u(GeometryRecordEntity record, List list) {
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzySource.GeometrySource.GeometryInfo geometryInfo = (EzySource.GeometrySource.GeometryInfo) it.next();
            GeometryInfoEntity geometryInfoEntity = new GeometryInfoEntity(0L, geometryInfo.m8287v().getWidth(), geometryInfo.m8287v().getColor(), geometryInfo.m8287v().m7973v(), geometryInfo.m8287v().m7972u(), geometryInfo.m8286u());
            C8550b c8550b = f14183a;
            List pointsList = geometryInfo.getPointsList();
            Intrinsics.checkNotNullExpressionValue(pointsList, "it.pointsList");
            c8550b.m14092v(geometryInfoEntity, pointsList);
            arrayList.add(geometryInfoEntity);
        }
        C7342c.f11908a.m11744b().m12981h(GeometryInfoEntity.class).m15046m(arrayList);
        record.m6406b().addAll(arrayList);
    }

    /* renamed from: v */
    public final void m14092v(GeometryInfoEntity geometryInfo, List list) {
        Intrinsics.checkNotNullParameter(geometryInfo, "geometryInfo");
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzyPointF.PointF pointF = (EzyPointF.PointF) it.next();
            arrayList.add(new GeometryPointFEntity(0L, pointF.getX(), pointF.getY()));
        }
        C7342c.f11908a.m11744b().m12981h(GeometryPointFEntity.class).m15046m(arrayList);
        geometryInfo.m6381d().addAll(arrayList);
    }

    /* renamed from: w */
    public final void m14093w(String pagePath, RecordEntity recordEntity, List list) {
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        Intrinsics.checkNotNullParameter(recordEntity, "recordEntity");
        Intrinsics.checkNotNullParameter(list, "list");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzyRouterRecord.RouterRecord.SourceCommandRecord sourceCommandRecord = (EzyRouterRecord.RouterRecord.SourceCommandRecord) it.next();
            String fileName = sourceCommandRecord.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName, "it.fileName");
            String strM8119q = sourceCommandRecord.m8119q();
            Intrinsics.checkNotNullExpressionValue(strM8119q, "it.validate");
            GeometryRecordEntity geometryRecordEntity = new GeometryRecordEntity(0L, fileName, strM8119q);
            C8550b c8550b = f14183a;
            String fileName2 = sourceCommandRecord.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName2, "it.fileName");
            String strM8119q2 = sourceCommandRecord.m8119q();
            Intrinsics.checkNotNullExpressionValue(strM8119q2, "it.validate");
            List listM8271o = c8550b.m14078h(pagePath, fileName2, strM8119q2).m8271o();
            Intrinsics.checkNotNullExpressionValue(listM8271o, "this.geometryInfoList");
            c8550b.m14091u(geometryRecordEntity, listM8271o);
            geometryRecordEntity.m6409e();
            recordEntity.m6530d().add(geometryRecordEntity);
        }
    }

    /* renamed from: x */
    public final void m14094x(MatrixRecordEntity record, List list) {
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzySource.MatrixSource.MatrixInfo matrixInfo = (EzySource.MatrixSource.MatrixInfo) it.next();
            MatrixEventEntity matrixEventEntity = new MatrixEventEntity(0L);
            C8550b c8550b = f14183a;
            List matrixList = matrixInfo.getMatrixList();
            Intrinsics.checkNotNullExpressionValue(matrixList, "it.matrixList");
            c8550b.m14095y(matrixEventEntity, matrixList);
            arrayList.add(matrixEventEntity);
        }
        C7342c.f11908a.m11744b().m12981h(MatrixEventEntity.class).m15046m(arrayList);
        record.m6483c().addAll(arrayList);
    }

    /* renamed from: y */
    public final void m14095y(MatrixEventEntity event, List list) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzyMatrix.Matrix matrix = (EzyMatrix.Matrix) it.next();
            arrayList.add(new MatrixInfoEntity(0L, matrix.getEventTime(), matrix.getScaleX(), matrix.m7732z(), matrix.m7723B(), matrix.m7722A(), matrix.getScaleY(), matrix.m7724C(), matrix.m7729w(), matrix.m7730x(), matrix.m7731y()));
        }
        C7342c.f11908a.m11744b().m12981h(MatrixInfoEntity.class).m15046m(arrayList);
        event.m6452b().addAll(arrayList);
    }

    /* renamed from: z */
    public final void m14096z(String pagePath, RecordEntity recordEntity, List matrixSourceRecordList) {
        Intrinsics.checkNotNullParameter(pagePath, "pagePath");
        Intrinsics.checkNotNullParameter(recordEntity, "recordEntity");
        Intrinsics.checkNotNullParameter(matrixSourceRecordList, "matrixSourceRecordList");
        Iterator it = matrixSourceRecordList.iterator();
        while (it.hasNext()) {
            EzyRouterRecord.RouterRecord.SourceCommandRecord sourceCommandRecord = (EzyRouterRecord.RouterRecord.SourceCommandRecord) it.next();
            String fileName = sourceCommandRecord.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName, "it.fileName");
            String strM8119q = sourceCommandRecord.m8119q();
            Intrinsics.checkNotNullExpressionValue(strM8119q, "it.validate");
            MatrixRecordEntity matrixRecordEntity = new MatrixRecordEntity(0L, fileName, strM8119q);
            C8550b c8550b = f14183a;
            String fileName2 = sourceCommandRecord.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName2, "it.fileName");
            String strM8119q2 = sourceCommandRecord.m8119q();
            Intrinsics.checkNotNullExpressionValue(strM8119q2, "it.validate");
            List listM8342o = c8550b.m14080j(pagePath, fileName2, strM8119q2).m8342o();
            Intrinsics.checkNotNullExpressionValue(listM8342o, "this.matrixInfoList");
            c8550b.m14094x(matrixRecordEntity, listM8342o);
            matrixRecordEntity.m6485e();
            recordEntity.m6532f().add(matrixRecordEntity);
        }
    }
}
