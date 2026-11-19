package p406x9;

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
import kotlin.jvm.internal.AbstractC9979u;
import na.AbstractC10351n;
import na.C10341d;

/* renamed from: x9.b */
/* loaded from: classes5.dex */
public final class C11814b {

    /* renamed from: a */
    public static final C11814b f28049a = new C11814b();

    /* renamed from: x9.b$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28050a;

        static {
            int[] iArr = new int[EzyCommandEnum.CommandEnum.values().length];
            iArr[EzyCommandEnum.CommandEnum.ACTION_CAMERA_MATRIX.ordinal()] = 1;
            iArr[EzyCommandEnum.CommandEnum.ACTION_CAMERA.ordinal()] = 2;
            f28050a = iArr;
        }
    }

    /* renamed from: D */
    public static final void m26131D(EzyPageRouter.PageRouter pageRouter, BlackBoardEntity boardEntity, String path) throws IllegalAccessException, IOException, IllegalArgumentException {
        AbstractC9979u.m20294g(boardEntity, "$boardEntity");
        AbstractC9979u.m20294g(path, "$path");
        List<EzyPageRouter.PageRouter.PageInfo> pageInfoList = pageRouter.m15521g();
        AbstractC9979u.m20293f(pageInfoList, "pageInfoList");
        for (EzyPageRouter.PageRouter.PageInfo pageInfo : pageInfoList) {
            LogUtils.m3888i("[SourceLoad]:loadRecord-> page:" + pageInfo.getName());
            String name = pageInfo.getName();
            AbstractC9979u.m20293f(name, "it.name");
            PageEntity pageEntity = new PageEntity(0L, name, false, null, 0, 28, null);
            f28049a.m26134B(path, pageEntity);
            pageEntity.m14236a().m19043o(boardEntity);
            pageEntity.m14244i();
            boardEntity.m14041c().add(pageEntity);
        }
        boardEntity.m14042d();
    }

    /* renamed from: A */
    public final void m26133A(String pagePath, RecordEntity recordEntity, List matrixSourceRecordList) {
        AbstractC9979u.m20294g(pagePath, "pagePath");
        AbstractC9979u.m20294g(recordEntity, "recordEntity");
        AbstractC9979u.m20294g(matrixSourceRecordList, "matrixSourceRecordList");
        Iterator it = matrixSourceRecordList.iterator();
        while (it.hasNext()) {
            EzyRouterRecord.RouterRecord.SourceCommandRecord sourceCommandRecord = (EzyRouterRecord.RouterRecord.SourceCommandRecord) it.next();
            String fileName = sourceCommandRecord.getFileName();
            AbstractC9979u.m20293f(fileName, "it.fileName");
            String strM15869k = sourceCommandRecord.m15869k();
            AbstractC9979u.m20293f(strM15869k, "it.validate");
            MatrixRecordEntity matrixRecordEntity = new MatrixRecordEntity(0L, fileName, strM15869k);
            C11814b c11814b = f28049a;
            String fileName2 = sourceCommandRecord.getFileName();
            AbstractC9979u.m20293f(fileName2, "it.fileName");
            String strM15869k2 = sourceCommandRecord.m15869k();
            AbstractC9979u.m20293f(strM15869k2, "it.validate");
            List listM16118g = c11814b.m26152k(pagePath, fileName2, strM15869k2).m16118g();
            AbstractC9979u.m20293f(listM16118g, "this.matrixInfoList");
            c11814b.m26166y(matrixRecordEntity, listM16118g);
            matrixRecordEntity.m14213e();
            recordEntity.m14262f().add(matrixRecordEntity);
        }
    }

    /* renamed from: B */
    public final void m26134B(String dir, PageEntity pageEntity) throws IllegalAccessException, IOException, IllegalArgumentException {
        AbstractC9979u.m20294g(dir, "dir");
        AbstractC9979u.m20294g(pageEntity, "pageEntity");
        String pagePath = new File(dir, pageEntity.m14239d()).getAbsolutePath();
        AbstractC9979u.m20293f(pagePath, "pagePath");
        EzyRouterRecord.RouterRecord routerRecordM26154m = m26154m(pagePath);
        RecordEntity recordEntity = new RecordEntity(0L);
        C11814b c11814b = f28049a;
        List commandRecordList = routerRecordM26154m.m15847E();
        AbstractC9979u.m20293f(commandRecordList, "commandRecordList");
        c11814b.m26160s(pagePath, recordEntity, commandRecordList);
        List touchSourceRecordList = routerRecordM26154m.m15858Q();
        AbstractC9979u.m20293f(touchSourceRecordList, "touchSourceRecordList");
        c11814b.m26140I(pagePath, recordEntity, touchSourceRecordList);
        List matrixSourceRecordList = routerRecordM26154m.m15854M();
        AbstractC9979u.m20293f(matrixSourceRecordList, "matrixSourceRecordList");
        c11814b.m26133A(pagePath, recordEntity, matrixSourceRecordList);
        List fileSourceRecordList = routerRecordM26154m.m15850I();
        AbstractC9979u.m20293f(fileSourceRecordList, "fileSourceRecordList");
        c11814b.m26162u(pagePath, recordEntity, fileSourceRecordList);
        List textSourceRecordList = routerRecordM26154m.m15856O();
        AbstractC9979u.m20293f(textSourceRecordList, "textSourceRecordList");
        c11814b.m26137F(pagePath, recordEntity, textSourceRecordList);
        List geometrySourceRecordList = routerRecordM26154m.m15852K();
        AbstractC9979u.m20293f(geometrySourceRecordList, "geometrySourceRecordList");
        c11814b.m26165x(pagePath, recordEntity, geometrySourceRecordList);
        List audioRecordList = routerRecordM26154m.m15845C();
        AbstractC9979u.m20293f(audioRecordList, "audioRecordList");
        c11814b.m26158q(pagePath, recordEntity, audioRecordList);
        recordEntity.m14266j();
        pageEntity.m14242g().m19043o(recordEntity);
        EzyHeader.Header headerM26151j = m26151j(pagePath);
        int version = headerM26151j.getVersion();
        int width = headerM26151j.getWidth();
        int height = headerM26151j.getHeight();
        long createDate = headerM26151j.getCreateDate();
        long updateDate = headerM26151j.getUpdateDate();
        long jM15346I = headerM26151j.m15346I();
        String strM15342D = headerM26151j.m15342D();
        AbstractC9979u.m20293f(strM15342D, "this.convertUrl");
        HeaderEntity headerEntity = new HeaderEntity(0L, version, width, height, createDate, updateDate, jM15346I, strM15342D, headerM26151j.m15343E(), headerM26151j.m15347J());
        EzyHeader.Author authorM15341C = headerM26151j.m15341C();
        AbstractC9979u.m20293f(authorM15341C, "this.author");
        AuthorEntity authorEntityM26143b = c11814b.m26143b(authorM15341C);
        authorEntityM26143b.m14024h();
        headerEntity.m14144a().m19043o(authorEntityM26143b);
        EzyHeader.MoveConfig moveConfig = headerM26151j.m15349L();
        AbstractC9979u.m20293f(moveConfig, "moveConfig");
        MoveConfigEntity moveConfigEntityM26146e = c11814b.m26146e(moveConfig);
        moveConfigEntityM26146e.m14230i();
        headerEntity.m14154k().m19043o(moveConfigEntityM26146e);
        EzyHeader.BackgroundLineConfig defaultBackgroundLineConfig = headerM26151j.m15344F();
        AbstractC9979u.m20293f(defaultBackgroundLineConfig, "defaultBackgroundLineConfig");
        BackgroundLineConfigEntity backgroundLineConfigEntityM26144c = c11814b.m26144c(defaultBackgroundLineConfig);
        backgroundLineConfigEntityM26144c.m14034f();
        headerEntity.m14148e().m19043o(backgroundLineConfigEntityM26144c);
        EzyHeader.BackgroundLineConfig lastBackgroundLineConfig = headerM26151j.m15348K();
        AbstractC9979u.m20293f(lastBackgroundLineConfig, "lastBackgroundLineConfig");
        BackgroundLineConfigEntity backgroundLineConfigEntityM26144c2 = c11814b.m26144c(lastBackgroundLineConfig);
        backgroundLineConfigEntityM26144c2.m14034f();
        headerEntity.m14153j().m19043o(backgroundLineConfigEntityM26144c2);
        List<EzyHeader.Author> listM15351N = headerM26151j.m15351N();
        AbstractC9979u.m20293f(listM15351N, "this.providerList");
        for (EzyHeader.Author it : listM15351N) {
            C11814b c11814b2 = f28049a;
            AbstractC9979u.m20293f(it, "it");
            AuthorEntity authorEntityM26143b2 = c11814b2.m26143b(it);
            authorEntityM26143b2.m14024h();
            headerEntity.m14156m().add(authorEntityM26143b2);
        }
        headerEntity.m14160q();
        pageEntity.m14240e().m19043o(headerEntity);
    }

    /* renamed from: C */
    // Photo, geometry, text and touch records from a Flutter BIN export were verified
    // in the page_mdb created by this original APK transaction.
    public final BlackBoardEntity m26135C(final String path) throws FileNotFoundException {
        AbstractC9979u.m20294g(path, "path");
        File file = new File(path, "page_router.bin");
        if (!file.exists() || !file.isFile()) {
            throw new FileNotFoundException(path);
        }
        final BlackBoardEntity blackBoardEntity = new BlackBoardEntity(0L, path);
        final EzyPageRouter.PageRouter pageRouterM15518o = EzyPageRouter.PageRouter.m15518o(new FileInputStream(file));
        C10341d.f24644a.m21626f().m18946I(new Runnable() { // from class: x9.a
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, IOException, IllegalArgumentException {
                C11814b.m26131D(pageRouterM15518o, blackBoardEntity, path);
            }
        });
        return blackBoardEntity;
    }

    /* renamed from: E */
    public final void m26136E(TextRecordEntity record, List list) {
        AbstractC9979u.m20294g(record, "record");
        AbstractC9979u.m20294g(list, "list");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzySource.TextSource.TextInfo textInfo = (EzySource.TextSource.TextInfo) it.next();
            float width = textInfo.m16194m().getWidth();
            int color = textInfo.m16194m().getColor();
            float fM15724r = textInfo.m16194m().m15724r();
            int iM15723p = textInfo.m16194m().m15723p();
            String content = textInfo.getContent();
            AbstractC9979u.m20293f(content, "it.content");
            arrayList.add(new TextInfoEntity(0L, width, color, fM15724r, iM15723p, content));
        }
        C10341d.f24644a.m21626f().m18954g(TextInfoEntity.class).m19228n(arrayList);
        record.m14303c().addAll(arrayList);
    }

    /* renamed from: F */
    public final void m26137F(String pagePath, RecordEntity recordEntity, List list) {
        AbstractC9979u.m20294g(pagePath, "pagePath");
        AbstractC9979u.m20294g(recordEntity, "recordEntity");
        AbstractC9979u.m20294g(list, "list");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzyRouterRecord.RouterRecord.SourceCommandRecord sourceCommandRecord = (EzyRouterRecord.RouterRecord.SourceCommandRecord) it.next();
            String fileName = sourceCommandRecord.getFileName();
            AbstractC9979u.m20293f(fileName, "it.fileName");
            String strM15869k = sourceCommandRecord.m15869k();
            AbstractC9979u.m20293f(strM15869k, "it.validate");
            TextRecordEntity textRecordEntity = new TextRecordEntity(0L, fileName, strM15869k);
            C11814b c11814b = f28049a;
            String fileName2 = sourceCommandRecord.getFileName();
            AbstractC9979u.m20293f(fileName2, "it.fileName");
            String strM15869k2 = sourceCommandRecord.m15869k();
            AbstractC9979u.m20293f(strM15869k2, "it.validate");
            List listM16182k = c11814b.m26155n(pagePath, fileName2, strM15869k2).m16182k();
            AbstractC9979u.m20293f(listM16182k, "this.textInfoList");
            c11814b.m26136E(textRecordEntity, listM16182k);
            textRecordEntity.m14305e();
            recordEntity.m14264h().add(textRecordEntity);
        }
    }

    /* renamed from: G */
    public final void m26138G(TouchRecordEntity record, List list) {
        AbstractC9979u.m20294g(record, "record");
        AbstractC9979u.m20294g(list, "list");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzySource.TouchSource.TouchInfo touchInfo = (EzySource.TouchSource.TouchInfo) it.next();
            TouchEventEntity touchEventEntity = new TouchEventEntity(0L, touchInfo.m16265n().getWidth(), touchInfo.m16265n().getColor(), touchInfo.m16265n().m15722o(), touchInfo.m16265n().m15721n(), touchInfo.m16265n().m15723p(), touchInfo.m16265n().m15724r());
            C11814b c11814b = f28049a;
            List touchEventList = touchInfo.getTouchEventList();
            AbstractC9979u.m20293f(touchEventList, "it.touchEventList");
            c11814b.m26139H(touchEventEntity, touchEventList);
            arrayList.add(touchEventEntity);
        }
        C10341d.f24644a.m21626f().m18954g(TouchEventEntity.class).m19228n(arrayList);
        record.m14345c().addAll(arrayList);
    }

    /* renamed from: H */
    public final void m26139H(TouchEventEntity event, List list) {
        AbstractC9979u.m20294g(event, "event");
        AbstractC9979u.m20294g(list, "list");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzyTouchEvent.TouchEvent touchEvent = (EzyTouchEvent.TouchEvent) it.next();
            arrayList.add(new TouchInfoEntity(0L, touchEvent.getEventTime(), touchEvent.getX(), touchEvent.getY()));
        }
        C10341d.f24644a.m21626f().m18954g(TouchInfoEntity.class).m19228n(arrayList);
        event.m14321h().addAll(arrayList);
    }

    /* renamed from: I */
    public final void m26140I(String pagePath, RecordEntity recordEntity, List touchSourceRecordList) {
        AbstractC9979u.m20294g(pagePath, "pagePath");
        AbstractC9979u.m20294g(recordEntity, "recordEntity");
        AbstractC9979u.m20294g(touchSourceRecordList, "touchSourceRecordList");
        Iterator it = touchSourceRecordList.iterator();
        while (it.hasNext()) {
            EzyRouterRecord.RouterRecord.SourceCommandRecord sourceCommandRecord = (EzyRouterRecord.RouterRecord.SourceCommandRecord) it.next();
            String fileName = sourceCommandRecord.getFileName();
            AbstractC9979u.m20293f(fileName, "it.fileName");
            String strM15869k = sourceCommandRecord.m15869k();
            AbstractC9979u.m20293f(strM15869k, "it.validate");
            TouchRecordEntity touchRecordEntity = new TouchRecordEntity(0L, fileName, strM15869k);
            C11814b c11814b = f28049a;
            String fileName2 = sourceCommandRecord.getFileName();
            AbstractC9979u.m20293f(fileName2, "it.fileName");
            String strM15869k2 = sourceCommandRecord.m15869k();
            AbstractC9979u.m20293f(strM15869k2, "it.validate");
            List listM16252k = c11814b.m26156o(pagePath, fileName2, strM15869k2).m16252k();
            AbstractC9979u.m20293f(listM16252k, "this.touchInfoList");
            c11814b.m26138G(touchRecordEntity, listM16252k);
            touchRecordEntity.m14347e();
            recordEntity.m14265i().add(touchRecordEntity);
        }
    }

    /* renamed from: J */
    public final byte[] m26141J(EzyCommand.CommandSource.CommandInfo commandInfo) {
        EzyCommandEnum.CommandEnum commandEnumM14693k = commandInfo.m14693k();
        int i10 = commandEnumM14693k == null ? -1 : a.f28050a[commandEnumM14693k.ordinal()];
        boolean z10 = false;
        boolean z11 = true;
        if (i10 != 1) {
            if (i10 != 2) {
                byte[] byteArray = commandInfo.m14695n().toByteArray();
                AbstractC9979u.m20293f(byteArray, "commandInfo.data.toByteArray()");
                return byteArray;
            }
            EzyCommand.CommandSource.CommandInfo.Camera cameraM14741t = EzyCommand.CommandSource.CommandInfo.Camera.m14741t(commandInfo.m14695n());
            EzyCommand.CommandSource.CommandInfo.Camera.C8452b builder = cameraM14741t.toBuilder();
            EzyMatrix.Matrix matrixM14745k = cameraM14741t.m14745k();
            AbstractC9979u.m20293f(matrixM14745k, "data.originMatrix");
            boolean zM21662d = AbstractC10351n.m21662d(matrixM14745k);
            EzyMatrix.Matrix matrixM14744g = cameraM14741t.m14744g();
            AbstractC9979u.m20293f(matrixM14744g, "data.lastMatrix");
            boolean zM21662d2 = AbstractC10351n.m21662d(matrixM14744g);
            if (!zM21662d) {
                builder.m14777z(m26145d(cameraM14741t.m14745k().getEventTime()));
                z10 = true;
            }
            if (zM21662d2) {
                z11 = z10;
            } else {
                builder.m14776y(m26145d(cameraM14741t.m14744g().getEventTime()));
            }
            if (z11) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("页面 SourceLoad.kt -> sanitizeCameraCommandData，旧bin转mdb时发现非法相机矩阵，已重置，命令=ACTION_CAMERA，originValid=");
                sb2.append(zM21662d);
                sb2.append("，lastValid=");
                sb2.append(zM21662d2);
                sb2.append("，origin=");
                EzyMatrix.Matrix matrixM14745k2 = cameraM14741t.m14745k();
                AbstractC9979u.m20293f(matrixM14745k2, "data.originMatrix");
                sb2.append(m26142K(matrixM14745k2));
                sb2.append("，last=");
                EzyMatrix.Matrix matrixM14744g2 = cameraM14741t.m14744g();
                AbstractC9979u.m20293f(matrixM14744g2, "data.lastMatrix");
                sb2.append(m26142K(matrixM14744g2));
                LogUtils.m3887e(sb2.toString());
            }
            byte[] byteArray2 = builder.build().toByteArray();
            AbstractC9979u.m20293f(byteArray2, "{\n                val da…ByteArray()\n            }");
            return byteArray2;
        }
        EzyCommand.CommandSource.CommandInfo.CameraMatrix cameraMatrixM14778A = EzyCommand.CommandSource.CommandInfo.CameraMatrix.m14778A(commandInfo.m14695n());
        EzyCommand.CommandSource.CommandInfo.CameraMatrix.C8454b builder2 = cameraMatrixM14778A.toBuilder();
        EzyMatrix.Matrix matrixM14791o = cameraMatrixM14778A.m14791o();
        AbstractC9979u.m20293f(matrixM14791o, "data.originMatrix");
        boolean zM21662d3 = AbstractC10351n.m21662d(matrixM14791o);
        EzyMatrix.Matrix matrixM14790n = cameraMatrixM14778A.m14790n();
        AbstractC9979u.m20293f(matrixM14790n, "data.lastMatrix");
        boolean zM21662d4 = AbstractC10351n.m21662d(matrixM14790n);
        if (!zM21662d3) {
            builder2.m14826z(m26145d(cameraMatrixM14778A.m14791o().getEventTime()));
            z10 = true;
        }
        if (zM21662d4) {
            z11 = z10;
        } else {
            builder2.m14825y(m26145d(cameraMatrixM14778A.m14790n().getEventTime()));
        }
        if (z11) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("页面 SourceLoad.kt -> sanitizeCameraCommandData，旧bin转mdb时发现非法相机矩阵，已重置，命令=ACTION_CAMERA_MATRIX，source=");
            sb3.append(cameraMatrixM14778A.m14792p());
            sb3.append("，sourceId=");
            sb3.append(cameraMatrixM14778A.m14793r());
            sb3.append("，originValid=");
            sb3.append(zM21662d3);
            sb3.append("，lastValid=");
            sb3.append(zM21662d4);
            sb3.append("，origin=");
            EzyMatrix.Matrix matrixM14791o2 = cameraMatrixM14778A.m14791o();
            AbstractC9979u.m20293f(matrixM14791o2, "data.originMatrix");
            sb3.append(m26142K(matrixM14791o2));
            sb3.append("，last=");
            EzyMatrix.Matrix matrixM14790n2 = cameraMatrixM14778A.m14790n();
            AbstractC9979u.m20293f(matrixM14790n2, "data.lastMatrix");
            sb3.append(m26142K(matrixM14790n2));
            LogUtils.m3887e(sb3.toString());
        }
        byte[] byteArray3 = builder2.build().toByteArray();
        AbstractC9979u.m20293f(byteArray3, "{\n                val da…ByteArray()\n            }");
        return byteArray3;
    }

    /* renamed from: K */
    public final String m26142K(EzyMatrix.Matrix matrix) {
        return "eventTime=" + matrix.getEventTime() + ", scaleX=" + matrix.getScaleX() + ", skewX=" + matrix.m15476y() + ", transX=" + matrix.m15467A() + ", skewY=" + matrix.m15477z() + ", scaleY=" + matrix.getScaleY() + ", transY=" + matrix.m15468C() + ", perSp0=" + matrix.m15473t() + ", perSp1=" + matrix.m15474u() + ", perSp2=" + matrix.m15475v();
    }

    /* renamed from: b */
    public final AuthorEntity m26143b(EzyHeader.Author author) {
        return new AuthorEntity(0L, author.m15254r(), author.m15253p(), author.m15257y(), author.m15258z(), Long.valueOf(author.getStartTime()), Long.valueOf(author.m15256v()));
    }

    /* renamed from: c */
    public final BackgroundLineConfigEntity m26144c(EzyHeader.BackgroundLineConfig backgroundLineConfig) { // 页头导入：颜色、间距与类型取自消息，构造掩码 16 使线宽使用 3 像素默认值。
        int iM15290m = backgroundLineConfig.m15290m();
        float fM15291n = backgroundLineConfig.m15291n();
        EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum backgroundLineTypeEnumM15292o = backgroundLineConfig.m15292o();
        AbstractC9979u.m20293f(backgroundLineTypeEnumM15292o, "backgroundLineConfig.lineType");
        return new BackgroundLineConfigEntity(0L, iM15290m, fM15291n, backgroundLineTypeEnumM15292o, 0.0f, 16, null);
    }

    /* renamed from: d */
    public final EzyMatrix.Matrix m26145d(long j10) {
        EzyMatrix.Matrix.C8487b c8487bM15455D = EzyMatrix.Matrix.m15455D();
        c8487bM15455D.m15494p(j10);
        c8487bM15455D.m15500v(1.0f);
        c8487bM15455D.m15501w(1.0f);
        c8487bM15455D.m15498t(1.0f);
        EzyMatrix.Matrix matrixBuild = c8487bM15455D.build();
        AbstractC9979u.m20293f(matrixBuild, "newBuilder().apply {\n   …p2 = 1F\n        }.build()");
        return matrixBuild;
    }

    /* renamed from: e */
    public final MoveConfigEntity m26146e(EzyHeader.MoveConfig moveConfig) {
        return new MoveConfigEntity(0L, moveConfig.m15422p(), moveConfig.m15427y(), moveConfig.m15421o(), moveConfig.m15426v(), moveConfig.m15425u(), moveConfig.m15423r(), moveConfig.m15424t());
    }

    /* renamed from: f */
    public final EzyCommand.CommandSource m26147f(String pagePath, String fileName, String validate) throws NoSuchAlgorithmException, IOException {
        AbstractC9979u.m20294g(pagePath, "pagePath");
        AbstractC9979u.m20294g(fileName, "fileName");
        AbstractC9979u.m20294g(validate, "validate");
        File file = new File(pagePath, fileName);
        FileValidateUtils.f18689a.m14637c(FileValidateUtils.TypeEnum.SHA256, validate, file);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzyCommand.CommandSource record = EzyCommand.CommandSource.m14677p(fileInputStream);
        fileInputStream.close();
        AbstractC9979u.m20293f(record, "record");
        return record;
    }

    /* renamed from: g */
    public final EzyCommand.CommandSource m26148g(String pagePath, String fileName, String validate) throws NoSuchAlgorithmException, IOException {
        AbstractC9979u.m20294g(pagePath, "pagePath");
        AbstractC9979u.m20294g(fileName, "fileName");
        AbstractC9979u.m20294g(validate, "validate");
        File file = new File(pagePath, fileName);
        FileValidateUtils.f18689a.m14637c(FileValidateUtils.TypeEnum.SHA256, validate, file);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzyCommand.CommandSource record = EzyCommand.CommandSource.m14677p(fileInputStream);
        fileInputStream.close();
        AbstractC9979u.m20293f(record, "record");
        return record;
    }

    /* renamed from: h */
    public final EzySource.FileSource m26149h(String pagePath, String fileName, String validate) throws NoSuchAlgorithmException, IOException {
        AbstractC9979u.m20294g(pagePath, "pagePath");
        AbstractC9979u.m20294g(fileName, "fileName");
        AbstractC9979u.m20294g(validate, "validate");
        File file = new File(pagePath, fileName);
        FileValidateUtils.f18689a.m14637c(FileValidateUtils.TypeEnum.SHA256, validate, file);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzySource.FileSource record = EzySource.FileSource.m15973p(fileInputStream);
        fileInputStream.close();
        AbstractC9979u.m20293f(record, "record");
        return record;
    }

    /* renamed from: i */
    public final EzySource.GeometrySource m26150i(String pagePath, String fileName, String validate) throws NoSuchAlgorithmException, IOException {
        AbstractC9979u.m20294g(pagePath, "pagePath");
        AbstractC9979u.m20294g(fileName, "fileName");
        AbstractC9979u.m20294g(validate, "validate");
        File file = new File(pagePath, fileName);
        FileValidateUtils.f18689a.m14637c(FileValidateUtils.TypeEnum.SHA256, validate, file);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzySource.GeometrySource record = EzySource.GeometrySource.m16040o(fileInputStream);
        fileInputStream.close();
        AbstractC9979u.m20293f(record, "record");
        return record;
    }

    /* renamed from: j */
    public final EzyHeader.Header m26151j(String path) throws IOException {
        AbstractC9979u.m20294g(path, "path");
        File file = new File(path, "header.bin");
        if (!file.exists()) {
            throw new FileNotFoundException(path);
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzyHeader.Header header = EzyHeader.Header.m15323V(fileInputStream);
        fileInputStream.close();
        AbstractC9979u.m20293f(header, "header");
        return header;
    }

    /* renamed from: k */
    public final EzySource.MatrixSource m26152k(String pagePath, String fileName, String validate) throws NoSuchAlgorithmException, IOException {
        AbstractC9979u.m20294g(pagePath, "pagePath");
        AbstractC9979u.m20294g(fileName, "fileName");
        AbstractC9979u.m20294g(validate, "validate");
        File file = new File(pagePath, fileName);
        FileValidateUtils.f18689a.m14637c(FileValidateUtils.TypeEnum.SHA256, validate, file);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzySource.MatrixSource record = EzySource.MatrixSource.m16115o(fileInputStream);
        fileInputStream.close();
        AbstractC9979u.m20293f(record, "record");
        return record;
    }

    /* renamed from: l */
    public final EzyPageRouter.PageRouter m26153l(String path) throws IOException {
        AbstractC9979u.m20294g(path, "path");
        File file = new File(path, "page_router.bin");
        if (!file.exists()) {
            throw new FileNotFoundException(path);
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzyPageRouter.PageRouter record = EzyPageRouter.PageRouter.m15518o(fileInputStream);
        fileInputStream.close();
        AbstractC9979u.m20293f(record, "record");
        return record;
    }

    /* renamed from: m */
    public final EzyRouterRecord.RouterRecord m26154m(String path) throws IOException {
        AbstractC9979u.m20294g(path, "path");
        File file = new File(path, "router.bin");
        if (!file.exists()) {
            throw new FileNotFoundException(path);
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzyRouterRecord.RouterRecord record = EzyRouterRecord.RouterRecord.m15826U(fileInputStream);
        fileInputStream.close();
        AbstractC9979u.m20293f(record, "record");
        return record;
    }

    /* renamed from: n */
    public final EzySource.TextSource m26155n(String pagePath, String fileName, String validate) throws NoSuchAlgorithmException, IOException {
        AbstractC9979u.m20294g(pagePath, "pagePath");
        AbstractC9979u.m20294g(fileName, "fileName");
        AbstractC9979u.m20294g(validate, "validate");
        File file = new File(pagePath, fileName);
        FileValidateUtils.f18689a.m14637c(FileValidateUtils.TypeEnum.SHA256, validate, file);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzySource.TextSource record = EzySource.TextSource.m16179p(fileInputStream);
        fileInputStream.close();
        AbstractC9979u.m20293f(record, "record");
        return record;
    }

    /* renamed from: o */
    public final EzySource.TouchSource m26156o(String pagePath, String fileName, String validate) throws NoSuchAlgorithmException, IOException {
        AbstractC9979u.m20294g(pagePath, "pagePath");
        AbstractC9979u.m20294g(fileName, "fileName");
        AbstractC9979u.m20294g(validate, "validate");
        File file = new File(pagePath, fileName);
        FileValidateUtils.f18689a.m14637c(FileValidateUtils.TypeEnum.SHA256, validate, file);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzySource.TouchSource record = EzySource.TouchSource.m16249p(fileInputStream);
        fileInputStream.close();
        AbstractC9979u.m20293f(record, "record");
        return record;
    }

    /* renamed from: p */
    public final void m26157p(AudioRecordEntity audioRecordEntity, List audioInfoList) {
        AbstractC9979u.m20294g(audioRecordEntity, "audioRecordEntity");
        AbstractC9979u.m20294g(audioInfoList, "audioInfoList");
        ArrayList arrayList = new ArrayList();
        Iterator it = audioInfoList.iterator();
        while (it.hasNext()) {
            EzyCommand.CommandSource.CommandInfo commandInfo = (EzyCommand.CommandSource.CommandInfo) it.next();
            long jM14697r = commandInfo.m14697r();
            long jM14698t = commandInfo.m14698t();
            boolean zM14699u = commandInfo.m14699u();
            EzyCommandEnum.CommandEnum commandEnumM14693k = commandInfo.m14693k();
            AbstractC9979u.m20293f(commandEnumM14693k, "it.commandEnum");
            byte[] byteArray = commandInfo.m14695n().toByteArray();
            AbstractC9979u.m20293f(byteArray, "it.data.toByteArray()");
            arrayList.add(new AudioInfoEntity(0L, jM14697r, jM14698t, zM14699u, commandEnumM14693k, byteArray));
        }
        C10341d.f24644a.m21626f().m18954g(AudioInfoEntity.class).m19228n(arrayList);
        audioRecordEntity.m14003a().addAll(arrayList);
    }

    /* renamed from: q */
    public final void m26158q(String pagePath, RecordEntity recordEntity, List list) {
        AbstractC9979u.m20294g(pagePath, "pagePath");
        AbstractC9979u.m20294g(recordEntity, "recordEntity");
        AbstractC9979u.m20294g(list, "list");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzyRouterRecord.RouterRecord.SourceCommandRecord sourceCommandRecord = (EzyRouterRecord.RouterRecord.SourceCommandRecord) it.next();
            String fileName = sourceCommandRecord.getFileName();
            AbstractC9979u.m20293f(fileName, "it.fileName");
            String strM15869k = sourceCommandRecord.m15869k();
            AbstractC9979u.m20293f(strM15869k, "it.validate");
            AudioRecordEntity audioRecordEntity = new AudioRecordEntity(0L, fileName, strM15869k);
            C11814b c11814b = f28049a;
            String fileName2 = sourceCommandRecord.getFileName();
            AbstractC9979u.m20293f(fileName2, "it.fileName");
            String strM15869k2 = sourceCommandRecord.m15869k();
            AbstractC9979u.m20293f(strM15869k2, "it.validate");
            List listM14679f = c11814b.m26147f(pagePath, fileName2, strM15869k2).m14679f();
            AbstractC9979u.m20293f(listM14679f, "this.commandInfoList");
            c11814b.m26157p(audioRecordEntity, listM14679f);
            audioRecordEntity.m14007e();
            recordEntity.m14257a().add(audioRecordEntity);
        }
    }

    /* renamed from: r */
    public final void m26159r(CommandRecordEntity commandRecordEntity, List commandInfoList) {
        AbstractC9979u.m20294g(commandRecordEntity, "commandRecordEntity");
        AbstractC9979u.m20294g(commandInfoList, "commandInfoList");
        ArrayList arrayList = new ArrayList();
        Iterator it = commandInfoList.iterator();
        while (it.hasNext()) {
            EzyCommand.CommandSource.CommandInfo commandInfo = (EzyCommand.CommandSource.CommandInfo) it.next();
            byte[] bArrM26141J = f28049a.m26141J(commandInfo);
            long jM14697r = commandInfo.m14697r();
            long jM14698t = commandInfo.m14698t();
            boolean zM14699u = commandInfo.m14699u();
            EzyCommandEnum.CommandEnum commandEnumM14693k = commandInfo.m14693k();
            AbstractC9979u.m20293f(commandEnumM14693k, "it.commandEnum");
            arrayList.add(new CommandInfoEntity(0L, jM14697r, jM14698t, zM14699u, commandEnumM14693k, bArrM26141J));
        }
        C10341d.f24644a.m21626f().m18954g(CommandInfoEntity.class).m19228n(arrayList);
        commandRecordEntity.m14065a().addAll(arrayList);
    }

    /* renamed from: s */
    public final void m26160s(String pagePath, RecordEntity recordEntity, List sourceCommandRecordList) {
        AbstractC9979u.m20294g(pagePath, "pagePath");
        AbstractC9979u.m20294g(recordEntity, "recordEntity");
        AbstractC9979u.m20294g(sourceCommandRecordList, "sourceCommandRecordList");
        Iterator it = sourceCommandRecordList.iterator();
        while (it.hasNext()) {
            EzyRouterRecord.RouterRecord.SourceCommandRecord sourceCommandRecord = (EzyRouterRecord.RouterRecord.SourceCommandRecord) it.next();
            String fileName = sourceCommandRecord.getFileName();
            AbstractC9979u.m20293f(fileName, "it.fileName");
            String strM15869k = sourceCommandRecord.m15869k();
            AbstractC9979u.m20293f(strM15869k, "it.validate");
            CommandRecordEntity commandRecordEntity = new CommandRecordEntity(0L, fileName, strM15869k);
            C11814b c11814b = f28049a;
            String fileName2 = sourceCommandRecord.getFileName();
            AbstractC9979u.m20293f(fileName2, "it.fileName");
            String strM15869k2 = sourceCommandRecord.m15869k();
            AbstractC9979u.m20293f(strM15869k2, "it.validate");
            List listM14679f = c11814b.m26148g(pagePath, fileName2, strM15869k2).m14679f();
            AbstractC9979u.m20293f(listM14679f, "this.commandInfoList");
            c11814b.m26159r(commandRecordEntity, listM14679f);
            commandRecordEntity.m14069e();
            recordEntity.m14258b().add(commandRecordEntity);
        }
    }

    /* renamed from: t */
    public final void m26161t(FileRecordEntity record, List list) {
        AbstractC9979u.m20294g(record, "record");
        AbstractC9979u.m20294g(list, "list");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzySource.FileSource.FileInfo fileInfo = (EzySource.FileSource.FileInfo) it.next();
            String name = fileInfo.getName();
            AbstractC9979u.m20293f(name, "it.name");
            int width = fileInfo.getWidth();
            int height = fileInfo.getHeight();
            String strM15989n = fileInfo.m15989n();
            AbstractC9979u.m20293f(strM15989n, "it.validate");
            arrayList.add(new FileInfoEntity(0L, name, width, height, strM15989n));
        }
        C10341d.f24644a.m21626f().m18954g(FileInfoEntity.class).m19228n(arrayList);
        record.m14091a().addAll(arrayList);
    }

    /* renamed from: u */
    public final void m26162u(String pagePath, RecordEntity recordEntity, List list) {
        AbstractC9979u.m20294g(pagePath, "pagePath");
        AbstractC9979u.m20294g(recordEntity, "recordEntity");
        AbstractC9979u.m20294g(list, "list");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzyRouterRecord.RouterRecord.SourceCommandRecord sourceCommandRecord = (EzyRouterRecord.RouterRecord.SourceCommandRecord) it.next();
            String fileName = sourceCommandRecord.getFileName();
            AbstractC9979u.m20293f(fileName, "it.fileName");
            String strM15869k = sourceCommandRecord.m15869k();
            AbstractC9979u.m20293f(strM15869k, "it.validate");
            FileRecordEntity fileRecordEntity = new FileRecordEntity(0L, fileName, strM15869k);
            C11814b c11814b = f28049a;
            String fileName2 = sourceCommandRecord.getFileName();
            AbstractC9979u.m20293f(fileName2, "it.fileName");
            String strM15869k2 = sourceCommandRecord.m15869k();
            AbstractC9979u.m20293f(strM15869k2, "it.validate");
            List listM15976k = c11814b.m26149h(pagePath, fileName2, strM15869k2).m15976k();
            AbstractC9979u.m20293f(listM15976k, "this.fileInfoList");
            c11814b.m26161t(fileRecordEntity, listM15976k);
            fileRecordEntity.m14095e();
            recordEntity.m14259c().add(fileRecordEntity);
        }
    }

    /* renamed from: v */
    public final void m26163v(GeometryRecordEntity record, List list) {
        AbstractC9979u.m20294g(record, "record");
        AbstractC9979u.m20294g(list, "list");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzySource.GeometrySource.GeometryInfo geometryInfo = (EzySource.GeometrySource.GeometryInfo) it.next();
            GeometryInfoEntity geometryInfoEntity = new GeometryInfoEntity(0L, geometryInfo.m16059r().getWidth(), geometryInfo.m16059r().getColor(), geometryInfo.m16059r().m15724r(), geometryInfo.m16059r().m15723p(), geometryInfo.m16058p());
            C11814b c11814b = f28049a;
            List pointsList = geometryInfo.getPointsList();
            AbstractC9979u.m20293f(pointsList, "it.pointsList");
            c11814b.m26164w(geometryInfoEntity, pointsList);
            arrayList.add(geometryInfoEntity);
        }
        C10341d.f24644a.m21626f().m18954g(GeometryInfoEntity.class).m19228n(arrayList);
        record.m14132b().addAll(arrayList);
    }

    /* renamed from: w */
    public final void m26164w(GeometryInfoEntity geometryInfo, List list) {
        AbstractC9979u.m20294g(geometryInfo, "geometryInfo");
        AbstractC9979u.m20294g(list, "list");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzyPointF.PointF pointF = (EzyPointF.PointF) it.next();
            arrayList.add(new GeometryPointFEntity(0L, pointF.getX(), pointF.getY()));
        }
        C10341d.f24644a.m21626f().m18954g(GeometryPointFEntity.class).m19228n(arrayList);
        geometryInfo.m14107d().addAll(arrayList);
    }

    /* renamed from: x */
    public final void m26165x(String pagePath, RecordEntity recordEntity, List list) {
        AbstractC9979u.m20294g(pagePath, "pagePath");
        AbstractC9979u.m20294g(recordEntity, "recordEntity");
        AbstractC9979u.m20294g(list, "list");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzyRouterRecord.RouterRecord.SourceCommandRecord sourceCommandRecord = (EzyRouterRecord.RouterRecord.SourceCommandRecord) it.next();
            String fileName = sourceCommandRecord.getFileName();
            AbstractC9979u.m20293f(fileName, "it.fileName");
            String strM15869k = sourceCommandRecord.m15869k();
            AbstractC9979u.m20293f(strM15869k, "it.validate");
            GeometryRecordEntity geometryRecordEntity = new GeometryRecordEntity(0L, fileName, strM15869k);
            C11814b c11814b = f28049a;
            String fileName2 = sourceCommandRecord.getFileName();
            AbstractC9979u.m20293f(fileName2, "it.fileName");
            String strM15869k2 = sourceCommandRecord.m15869k();
            AbstractC9979u.m20293f(strM15869k2, "it.validate");
            List listM16043g = c11814b.m26150i(pagePath, fileName2, strM15869k2).m16043g();
            AbstractC9979u.m20293f(listM16043g, "this.geometryInfoList");
            c11814b.m26163v(geometryRecordEntity, listM16043g);
            geometryRecordEntity.m14135e();
            recordEntity.m14260d().add(geometryRecordEntity);
        }
    }

    /* renamed from: y */
    public final void m26166y(MatrixRecordEntity record, List list) {
        AbstractC9979u.m20294g(record, "record");
        AbstractC9979u.m20294g(list, "list");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzySource.MatrixSource.MatrixInfo matrixInfo = (EzySource.MatrixSource.MatrixInfo) it.next();
            MatrixEventEntity matrixEventEntity = new MatrixEventEntity(0L);
            C11814b c11814b = f28049a;
            List matrixList = matrixInfo.getMatrixList();
            AbstractC9979u.m20293f(matrixList, "it.matrixList");
            c11814b.m26167z(matrixEventEntity, matrixList);
            arrayList.add(matrixEventEntity);
        }
        C10341d.f24644a.m21626f().m18954g(MatrixEventEntity.class).m19228n(arrayList);
        record.m14211c().addAll(arrayList);
    }

    /* renamed from: z */
    public final void m26167z(MatrixEventEntity event, List list) {
        AbstractC9979u.m20294g(event, "event");
        AbstractC9979u.m20294g(list, "list");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EzyMatrix.Matrix matrix = (EzyMatrix.Matrix) it.next();
            arrayList.add(new MatrixInfoEntity(0L, matrix.getEventTime(), matrix.getScaleX(), matrix.m15476y(), matrix.m15467A(), matrix.m15477z(), matrix.getScaleY(), matrix.m15468C(), matrix.m15473t(), matrix.m15474u(), matrix.m15475v()));
        }
        C10341d.f24644a.m21626f().m18954g(MatrixInfoEntity.class).m19228n(arrayList);
        event.m14180b().addAll(arrayList);
    }
}
