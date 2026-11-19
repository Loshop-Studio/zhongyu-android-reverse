package com.zykj.blackboard.core.data;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox、文件流。

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.blankj.utilcode.util.AbstractC3387g;
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
import com.zykj.blackboard.exception.FileVerificationException;
import com.zykj.blackboard.utils.BoardBox;
import com.zykj.blackboard.utils.FileValidateUtils;
import com.zykj.board.EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;
import com.zykj.board.EzyCommand$CommandSource;
import com.zykj.board.EzyCommandEnum$CommandEnum;
import com.zykj.board.EzyHeader$Author;
import com.zykj.board.EzyHeader$BackgroundLineConfig;
import com.zykj.board.EzyHeader$Header;
import com.zykj.board.EzyHeader$MoveConfig;
import com.zykj.board.EzyMatrix$Matrix;
import com.zykj.board.EzyPageRouter$PageRouter;
import com.zykj.board.EzyPointF$PointF;
import com.zykj.board.EzyRouterRecord$RouterRecord;
import com.zykj.board.EzySource$FileSource;
import com.zykj.board.EzySource$GeometrySource;
import com.zykj.board.EzySource$MatrixSource;
import com.zykj.board.EzySource$TextSource;
import com.zykj.board.EzySource$TouchSource;
import com.zykj.board.EzyTouchEvent$TouchEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p006a5.RunnableC0017h;

@Metadata(m5109d1 = {"\u0000¨\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u001e\u0010\u0016J#\u0010#\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0012¢\u0006\u0004\b#\u0010$J#\u0010(\u001a\u00020\f2\u0006\u0010&\u001a\u00020%2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020'0\u0012¢\u0006\u0004\b(\u0010)J+\u0010+\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b+\u0010\u0016J#\u0010.\u001a\u00020\f2\u0006\u0010 \u001a\u00020,2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020-0\u0012¢\u0006\u0004\b.\u0010/J#\u00102\u001a\u00020\f2\u0006\u0010&\u001a\u0002002\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002010\u0012¢\u0006\u0004\b2\u00103J+\u00104\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b4\u0010\u0016J#\u00107\u001a\u00020\f2\u0006\u0010 \u001a\u0002052\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002060\u0012¢\u0006\u0004\b7\u00108J+\u00109\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b9\u0010\u0016J#\u0010<\u001a\u00020\f2\u0006\u0010 \u001a\u00020:2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020;0\u0012¢\u0006\u0004\b<\u0010=J+\u0010>\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b>\u0010\u0016J#\u0010A\u001a\u00020\f2\u0006\u0010 \u001a\u00020?2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020@0\u0012¢\u0006\u0004\bA\u0010BJ#\u0010F\u001a\u00020\f2\u0006\u0010D\u001a\u00020C2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020E0\u0012¢\u0006\u0004\bF\u0010GJ+\u0010H\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\bH\u0010\u0016J#\u0010L\u001a\u00020\f2\u0006\u0010J\u001a\u00020I2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012¢\u0006\u0004\bL\u0010MJ\u0015\u0010O\u001a\u00020N2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bO\u0010PJ\u0015\u0010R\u001a\u00020Q2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bR\u0010SJ\u0015\u0010U\u001a\u00020T2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bU\u0010VJ%\u0010Z\u001a\u00020Y2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\u00042\u0006\u0010X\u001a\u00020\u0004¢\u0006\u0004\bZ\u0010[J%\u0010\\\u001a\u00020Y2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\u00042\u0006\u0010X\u001a\u00020\u0004¢\u0006\u0004\b\\\u0010[J%\u0010^\u001a\u00020]2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\u00042\u0006\u0010X\u001a\u00020\u0004¢\u0006\u0004\b^\u0010_J%\u0010a\u001a\u00020`2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\u00042\u0006\u0010X\u001a\u00020\u0004¢\u0006\u0004\ba\u0010bJ%\u0010d\u001a\u00020c2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\u00042\u0006\u0010X\u001a\u00020\u0004¢\u0006\u0004\bd\u0010eJ%\u0010g\u001a\u00020f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\u00042\u0006\u0010X\u001a\u00020\u0004¢\u0006\u0004\bg\u0010hJ%\u0010j\u001a\u00020i2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\u00042\u0006\u0010X\u001a\u00020\u0004¢\u0006\u0004\bj\u0010kJ\u0017\u0010o\u001a\u00020n2\u0006\u0010m\u001a\u00020lH\u0002¢\u0006\u0004\bo\u0010pJ\u0017\u0010t\u001a\u00020s2\u0006\u0010r\u001a\u00020qH\u0002¢\u0006\u0004\bt\u0010uJ\u0017\u0010y\u001a\u00020x2\u0006\u0010w\u001a\u00020vH\u0002¢\u0006\u0004\by\u0010z¨\u0006{"}, m5110d2 = {"Lcom/zykj/blackboard/core/data/SourceLoad;", "", "<init>", "()V", "", "path", "Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;", "loadRecord", "(Ljava/lang/String;)Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;", "dir", "Lcom/zykj/blackboard/core/data/dao/PageEntity;", "pageEntity", "Ld6/s;", "loadPage", "(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/PageEntity;)V", "pagePath", "Lcom/zykj/blackboard/core/data/dao/RecordEntity;", "recordEntity", "", "Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;", "sourceCommandRecordList", "loadCommandRecordList", "(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/RecordEntity;Ljava/util/List;)V", "Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;", "commandRecordEntity", "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;", "commandInfoList", "loadCommandInfoEntityList", "(Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;Ljava/util/List;)V", "touchSourceRecordList", "loadTouchRecordList", "Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;", "record", "Lcom/zykj/board/EzySource$TouchSource$TouchInfo;", "list", "loadTouchEventEntityList", "(Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;Ljava/util/List;)V", "Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;", NotificationCompat.CATEGORY_EVENT, "Lcom/zykj/board/EzyTouchEvent$TouchEvent;", "loadTouchInfo", "(Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;Ljava/util/List;)V", "matrixSourceRecordList", "loadMatrixRecordList", "Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;", "Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;", "loadMatrixEventEntityList", "(Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;Ljava/util/List;)V", "Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;", "Lcom/zykj/board/EzyMatrix$Matrix;", "loadMatrixInfo", "(Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;Ljava/util/List;)V", "loadFileRecordList", "Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;", "Lcom/zykj/board/EzySource$FileSource$FileInfo;", "loadFileInfoList", "(Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;Ljava/util/List;)V", "loadTextRecordList", "Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;", "Lcom/zykj/board/EzySource$TextSource$TextInfo;", "loadTextInfoList", "(Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;Ljava/util/List;)V", "loadGeometryRecordList", "Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;", "Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;", "loadGeometryInfoList", "(Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;Ljava/util/List;)V", "Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;", "geometryInfo", "Lcom/zykj/board/EzyPointF$PointF;", "loadGeometryPointFList", "(Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;Ljava/util/List;)V", "loadAudioRecordList", "Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;", "audioRecordEntity", "audioInfoList", "loadAudioInfoList", "(Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;Ljava/util/List;)V", "Lcom/zykj/board/EzyPageRouter$PageRouter;", "getPageRouter", "(Ljava/lang/String;)Lcom/zykj/board/EzyPageRouter$PageRouter;", "Lcom/zykj/board/EzyRouterRecord$RouterRecord;", "getRouter", "(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord;", "Lcom/zykj/board/EzyHeader$Header;", "getHeader", "(Ljava/lang/String;)Lcom/zykj/board/EzyHeader$Header;", "fileName", "validate", "Lcom/zykj/board/EzyCommand$CommandSource;", "getCommandRecord", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource;", "getAudioRecord", "Lcom/zykj/board/EzySource$MatrixSource;", "getMatrixRecord", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzySource$MatrixSource;", "Lcom/zykj/board/EzySource$TouchSource;", "getTouchRecord", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzySource$TouchSource;", "Lcom/zykj/board/EzySource$FileSource;", "getFileRecord", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzySource$FileSource;", "Lcom/zykj/board/EzySource$TextSource;", "getTextRecord", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzySource$TextSource;", "Lcom/zykj/board/EzySource$GeometrySource;", "getGeometryRecord", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/board/EzySource$GeometrySource;", "Lcom/zykj/board/EzyHeader$Author;", "author", "Lcom/zykj/blackboard/core/data/dao/AuthorEntity;", "buildAuthorEntity", "(Lcom/zykj/board/EzyHeader$Author;)Lcom/zykj/blackboard/core/data/dao/AuthorEntity;", "Lcom/zykj/board/EzyHeader$MoveConfig;", "moveConfig", "Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;", "buildMoveConfigEntity", "(Lcom/zykj/board/EzyHeader$MoveConfig;)Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;", "Lcom/zykj/board/EzyHeader$BackgroundLineConfig;", "backgroundLineConfig", "Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;", "buildBackgroundLineConfigEntity", "(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class SourceLoad {

    @NotNull
    public static final SourceLoad INSTANCE = new SourceLoad();

    private SourceLoad() {
    }

    private final AuthorEntity buildAuthorEntity(EzyHeader$Author author) {
        return new AuthorEntity(0L, author.getAuthorName(), author.getAuthorId(), author.getSchoolId(), author.getUrl(), Long.valueOf(author.getStartTime()), Long.valueOf(author.getDuration()));
    }

    private final BackgroundLineConfigEntity buildBackgroundLineConfigEntity(EzyHeader$BackgroundLineConfig backgroundLineConfig) { // 页头导入：颜色、间距与类型取自消息，构造掩码 16 使线宽使用 3 像素默认值。
        int lineColor = backgroundLineConfig.getLineColor();
        float lineSpace = backgroundLineConfig.getLineSpace();
        EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum lineType = backgroundLineConfig.getLineType();
        AbstractC5830k.m5329f(lineType, "backgroundLineConfig.lineType");
        return new BackgroundLineConfigEntity(0L, lineColor, lineSpace, lineType, 0.0f, 16, null);
    }

    private final MoveConfigEntity buildMoveConfigEntity(EzyHeader$MoveConfig moveConfig) {
        return new MoveConfigEntity(0L, moveConfig.getIsEnable(), moveConfig.getVerticalTranslate(), moveConfig.getHorizontalTranslate(), moveConfig.getScale(), moveConfig.getRotate(), moveConfig.getMaxHeightTimes(), moveConfig.getMaxWidthTimes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadRecord$lambda-3$lambda-2$lambda-1, reason: not valid java name */
    public static final void m13761loadRecord$lambda3$lambda2$lambda1(EzyPageRouter$PageRouter ezyPageRouter$PageRouter, BlackBoardEntity boardEntity, String path) throws FileVerificationException, IOException {
        AbstractC5830k.m5330g(boardEntity, "$boardEntity");
        AbstractC5830k.m5330g(path, "$path");
        List<EzyPageRouter$PageRouter.PageInfo> pageInfoList = ezyPageRouter$PageRouter.getPageInfoList();
        AbstractC5830k.m5329f(pageInfoList, "pageInfoList");
        for (EzyPageRouter$PageRouter.PageInfo pageInfo : pageInfoList) {
            AbstractC3387g.m2342e("[SourceLoad]:loadRecord-> page:" + pageInfo.getName());
            String name = pageInfo.getName();
            AbstractC5830k.m5329f(name, "it.name");
            PageEntity pageEntity = new PageEntity(0L, name, false, null, 0, 28, null);
            INSTANCE.loadPage(path, pageEntity);
            pageEntity.getBlackBoardEntity().setTarget(boardEntity);
            pageEntity.put();
            boardEntity.getPages().add(pageEntity);
        }
        boardEntity.put();
    }

    @NotNull
    public final EzyCommand$CommandSource getAudioRecord(@NotNull String pagePath, @NotNull String fileName, @NotNull String validate) throws FileVerificationException, IOException {
        AbstractC5830k.m5330g(pagePath, "pagePath");
        AbstractC5830k.m5330g(fileName, "fileName");
        AbstractC5830k.m5330g(validate, "validate");
        File file = new File(pagePath, fileName);
        FileValidateUtils.INSTANCE.validateFile(FileValidateUtils.TypeEnum.SHA256, validate, file);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzyCommand$CommandSource record = EzyCommand$CommandSource.parseFrom(fileInputStream);
        fileInputStream.close();
        AbstractC5830k.m5329f(record, "record");
        return record;
    }

    @NotNull
    public final EzyCommand$CommandSource getCommandRecord(@NotNull String pagePath, @NotNull String fileName, @NotNull String validate) throws FileVerificationException, IOException {
        AbstractC5830k.m5330g(pagePath, "pagePath");
        AbstractC5830k.m5330g(fileName, "fileName");
        AbstractC5830k.m5330g(validate, "validate");
        File file = new File(pagePath, fileName);
        FileValidateUtils.INSTANCE.validateFile(FileValidateUtils.TypeEnum.SHA256, validate, file);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzyCommand$CommandSource record = EzyCommand$CommandSource.parseFrom(fileInputStream);
        fileInputStream.close();
        AbstractC5830k.m5329f(record, "record");
        return record;
    }

    @NotNull
    public final EzySource$FileSource getFileRecord(@NotNull String pagePath, @NotNull String fileName, @NotNull String validate) throws FileVerificationException, IOException {
        AbstractC5830k.m5330g(pagePath, "pagePath");
        AbstractC5830k.m5330g(fileName, "fileName");
        AbstractC5830k.m5330g(validate, "validate");
        File file = new File(pagePath, fileName);
        FileValidateUtils.INSTANCE.validateFile(FileValidateUtils.TypeEnum.SHA256, validate, file);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzySource$FileSource record = EzySource$FileSource.parseFrom(fileInputStream);
        fileInputStream.close();
        AbstractC5830k.m5329f(record, "record");
        return record;
    }

    @NotNull
    public final EzySource$GeometrySource getGeometryRecord(@NotNull String pagePath, @NotNull String fileName, @NotNull String validate) throws FileVerificationException, IOException {
        AbstractC5830k.m5330g(pagePath, "pagePath");
        AbstractC5830k.m5330g(fileName, "fileName");
        AbstractC5830k.m5330g(validate, "validate");
        File file = new File(pagePath, fileName);
        FileValidateUtils.INSTANCE.validateFile(FileValidateUtils.TypeEnum.SHA256, validate, file);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzySource$GeometrySource record = EzySource$GeometrySource.parseFrom(fileInputStream);
        fileInputStream.close();
        AbstractC5830k.m5329f(record, "record");
        return record;
    }

    @NotNull
    public final EzyHeader$Header getHeader(@NotNull String path) throws FileNotFoundException {
        AbstractC5830k.m5330g(path, "path");
        File file = new File(path, SourceSave.HEADER_FILE_NAME);
        if (!file.exists()) {
            throw new FileNotFoundException(path);
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzyHeader$Header header = EzyHeader$Header.parseFrom(fileInputStream);
        fileInputStream.close();
        AbstractC5830k.m5329f(header, "header");
        return header;
    }

    @NotNull
    public final EzySource$MatrixSource getMatrixRecord(@NotNull String pagePath, @NotNull String fileName, @NotNull String validate) throws FileVerificationException, IOException {
        AbstractC5830k.m5330g(pagePath, "pagePath");
        AbstractC5830k.m5330g(fileName, "fileName");
        AbstractC5830k.m5330g(validate, "validate");
        File file = new File(pagePath, fileName);
        FileValidateUtils.INSTANCE.validateFile(FileValidateUtils.TypeEnum.SHA256, validate, file);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzySource$MatrixSource record = EzySource$MatrixSource.parseFrom(fileInputStream);
        fileInputStream.close();
        AbstractC5830k.m5329f(record, "record");
        return record;
    }

    @NotNull
    public final EzyPageRouter$PageRouter getPageRouter(@NotNull String path) throws IOException {
        AbstractC5830k.m5330g(path, "path");
        File file = new File(path, SourceSave.PAGE_ROUTER_FILE_NAME);
        if (!file.exists()) {
            throw new FileNotFoundException(path);
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzyPageRouter$PageRouter record = EzyPageRouter$PageRouter.parseFrom(fileInputStream);
        fileInputStream.close();
        AbstractC5830k.m5329f(record, "record");
        return record;
    }

    @NotNull
    public final EzyRouterRecord$RouterRecord getRouter(@NotNull String path) throws IOException {
        AbstractC5830k.m5330g(path, "path");
        File file = new File(path, SourceSave.ROUTER_FILE_NAME);
        if (!file.exists()) {
            throw new FileNotFoundException(path);
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzyRouterRecord$RouterRecord record = EzyRouterRecord$RouterRecord.parseFrom(fileInputStream);
        fileInputStream.close();
        AbstractC5830k.m5329f(record, "record");
        return record;
    }

    @NotNull
    public final EzySource$TextSource getTextRecord(@NotNull String pagePath, @NotNull String fileName, @NotNull String validate) throws FileVerificationException, IOException {
        AbstractC5830k.m5330g(pagePath, "pagePath");
        AbstractC5830k.m5330g(fileName, "fileName");
        AbstractC5830k.m5330g(validate, "validate");
        File file = new File(pagePath, fileName);
        FileValidateUtils.INSTANCE.validateFile(FileValidateUtils.TypeEnum.SHA256, validate, file);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzySource$TextSource record = EzySource$TextSource.parseFrom(fileInputStream);
        fileInputStream.close();
        AbstractC5830k.m5329f(record, "record");
        return record;
    }

    @NotNull
    public final EzySource$TouchSource getTouchRecord(@NotNull String pagePath, @NotNull String fileName, @NotNull String validate) throws FileVerificationException, IOException {
        AbstractC5830k.m5330g(pagePath, "pagePath");
        AbstractC5830k.m5330g(fileName, "fileName");
        AbstractC5830k.m5330g(validate, "validate");
        File file = new File(pagePath, fileName);
        FileValidateUtils.INSTANCE.validateFile(FileValidateUtils.TypeEnum.SHA256, validate, file);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzySource$TouchSource record = EzySource$TouchSource.parseFrom(fileInputStream);
        fileInputStream.close();
        AbstractC5830k.m5329f(record, "record");
        return record;
    }

    public final void loadAudioInfoList(@NotNull AudioRecordEntity audioRecordEntity, @NotNull List<EzyCommand$CommandSource.CommandInfo> audioInfoList) {
        AbstractC5830k.m5330g(audioRecordEntity, "audioRecordEntity");
        AbstractC5830k.m5330g(audioInfoList, "audioInfoList");
        ArrayList arrayList = new ArrayList();
        for (EzyCommand$CommandSource.CommandInfo commandInfo : audioInfoList) {
            long delayTime = commandInfo.getDelayTime();
            long duration = commandInfo.getDuration();
            boolean isPlay = commandInfo.getIsPlay();
            EzyCommandEnum$CommandEnum commandEnum = commandInfo.getCommandEnum();
            AbstractC5830k.m5329f(commandEnum, "it.commandEnum");
            byte[] byteArray = commandInfo.getData().toByteArray();
            AbstractC5830k.m5329f(byteArray, "it.data.toByteArray()");
            arrayList.add(new AudioInfoEntity(0L, delayTime, duration, isPlay, commandEnum, byteArray));
        }
        BoardBox.INSTANCE.getBoxStore().m5018c(AudioInfoEntity.class).m5035f(arrayList);
        audioRecordEntity.getAudioInfoEntity().addAll(arrayList);
    }

    public final void loadAudioRecordList(@NotNull String pagePath, @NotNull RecordEntity recordEntity, @NotNull List<EzyRouterRecord$RouterRecord.SourceCommandRecord> list) throws FileVerificationException, FileNotFoundException {
        AbstractC5830k.m5330g(pagePath, "pagePath");
        AbstractC5830k.m5330g(recordEntity, "recordEntity");
        AbstractC5830k.m5330g(list, "list");
        for (EzyRouterRecord$RouterRecord.SourceCommandRecord sourceCommandRecord : list) {
            String fileName = sourceCommandRecord.getFileName();
            AbstractC5830k.m5329f(fileName, "it.fileName");
            String validate = sourceCommandRecord.getValidate();
            AbstractC5830k.m5329f(validate, "it.validate");
            AudioRecordEntity audioRecordEntity = new AudioRecordEntity(0L, fileName, validate);
            SourceLoad sourceLoad = INSTANCE;
            String fileName2 = sourceCommandRecord.getFileName();
            AbstractC5830k.m5329f(fileName2, "it.fileName");
            String validate2 = sourceCommandRecord.getValidate();
            AbstractC5830k.m5329f(validate2, "it.validate");
            List<EzyCommand$CommandSource.CommandInfo> commandInfoList = sourceLoad.getAudioRecord(pagePath, fileName2, validate2).getCommandInfoList();
            AbstractC5830k.m5329f(commandInfoList, "this.commandInfoList");
            sourceLoad.loadAudioInfoList(audioRecordEntity, commandInfoList);
            audioRecordEntity.put();
            recordEntity.getAudioList().add(audioRecordEntity);
        }
    }

    public final void loadCommandInfoEntityList(@NotNull CommandRecordEntity commandRecordEntity, @NotNull List<EzyCommand$CommandSource.CommandInfo> commandInfoList) {
        AbstractC5830k.m5330g(commandRecordEntity, "commandRecordEntity");
        AbstractC5830k.m5330g(commandInfoList, "commandInfoList");
        ArrayList arrayList = new ArrayList();
        for (EzyCommand$CommandSource.CommandInfo commandInfo : commandInfoList) {
            long delayTime = commandInfo.getDelayTime();
            long duration = commandInfo.getDuration();
            boolean isPlay = commandInfo.getIsPlay();
            EzyCommandEnum$CommandEnum commandEnum = commandInfo.getCommandEnum();
            AbstractC5830k.m5329f(commandEnum, "it.commandEnum");
            byte[] byteArray = commandInfo.getData().toByteArray();
            AbstractC5830k.m5329f(byteArray, "it.data.toByteArray()");
            arrayList.add(new CommandInfoEntity(0L, delayTime, duration, isPlay, commandEnum, byteArray));
        }
        BoardBox.INSTANCE.getBoxStore().m5018c(CommandInfoEntity.class).m5035f(arrayList);
        commandRecordEntity.getCommandInfoEntity().addAll(arrayList);
    }

    public final void loadCommandRecordList(@NotNull String pagePath, @NotNull RecordEntity recordEntity, @NotNull List<EzyRouterRecord$RouterRecord.SourceCommandRecord> sourceCommandRecordList) throws FileVerificationException, FileNotFoundException {
        AbstractC5830k.m5330g(pagePath, "pagePath");
        AbstractC5830k.m5330g(recordEntity, "recordEntity");
        AbstractC5830k.m5330g(sourceCommandRecordList, "sourceCommandRecordList");
        for (EzyRouterRecord$RouterRecord.SourceCommandRecord sourceCommandRecord : sourceCommandRecordList) {
            String fileName = sourceCommandRecord.getFileName();
            AbstractC5830k.m5329f(fileName, "it.fileName");
            String validate = sourceCommandRecord.getValidate();
            AbstractC5830k.m5329f(validate, "it.validate");
            CommandRecordEntity commandRecordEntity = new CommandRecordEntity(0L, fileName, validate);
            SourceLoad sourceLoad = INSTANCE;
            String fileName2 = sourceCommandRecord.getFileName();
            AbstractC5830k.m5329f(fileName2, "it.fileName");
            String validate2 = sourceCommandRecord.getValidate();
            AbstractC5830k.m5329f(validate2, "it.validate");
            List<EzyCommand$CommandSource.CommandInfo> commandInfoList = sourceLoad.getCommandRecord(pagePath, fileName2, validate2).getCommandInfoList();
            AbstractC5830k.m5329f(commandInfoList, "this.commandInfoList");
            sourceLoad.loadCommandInfoEntityList(commandRecordEntity, commandInfoList);
            commandRecordEntity.put();
            recordEntity.getCommandList().add(commandRecordEntity);
        }
    }

    public final void loadFileInfoList(@NotNull FileRecordEntity record, @NotNull List<EzySource$FileSource.FileInfo> list) {
        AbstractC5830k.m5330g(record, "record");
        AbstractC5830k.m5330g(list, "list");
        ArrayList arrayList = new ArrayList();
        for (EzySource$FileSource.FileInfo fileInfo : list) {
            String name = fileInfo.getName();
            AbstractC5830k.m5329f(name, "it.name");
            int width = fileInfo.getWidth();
            int height = fileInfo.getHeight();
            String validate = fileInfo.getValidate();
            AbstractC5830k.m5329f(validate, "it.validate");
            arrayList.add(new FileInfoEntity(0L, name, width, height, validate));
        }
        BoardBox.INSTANCE.getBoxStore().m5018c(FileInfoEntity.class).m5035f(arrayList);
        record.getFileInfoEntity().addAll(arrayList);
    }

    public final void loadFileRecordList(@NotNull String pagePath, @NotNull RecordEntity recordEntity, @NotNull List<EzyRouterRecord$RouterRecord.SourceCommandRecord> list) throws FileVerificationException, FileNotFoundException {
        AbstractC5830k.m5330g(pagePath, "pagePath");
        AbstractC5830k.m5330g(recordEntity, "recordEntity");
        AbstractC5830k.m5330g(list, "list");
        for (EzyRouterRecord$RouterRecord.SourceCommandRecord sourceCommandRecord : list) {
            String fileName = sourceCommandRecord.getFileName();
            AbstractC5830k.m5329f(fileName, "it.fileName");
            String validate = sourceCommandRecord.getValidate();
            AbstractC5830k.m5329f(validate, "it.validate");
            FileRecordEntity fileRecordEntity = new FileRecordEntity(0L, fileName, validate);
            SourceLoad sourceLoad = INSTANCE;
            String fileName2 = sourceCommandRecord.getFileName();
            AbstractC5830k.m5329f(fileName2, "it.fileName");
            String validate2 = sourceCommandRecord.getValidate();
            AbstractC5830k.m5329f(validate2, "it.validate");
            List<EzySource$FileSource.FileInfo> fileInfoList = sourceLoad.getFileRecord(pagePath, fileName2, validate2).getFileInfoList();
            AbstractC5830k.m5329f(fileInfoList, "this.fileInfoList");
            sourceLoad.loadFileInfoList(fileRecordEntity, fileInfoList);
            fileRecordEntity.put();
            recordEntity.getFileList().add(fileRecordEntity);
        }
    }

    public final void loadGeometryInfoList(@NotNull GeometryRecordEntity record, @NotNull List<EzySource$GeometrySource.GeometryInfo> list) {
        AbstractC5830k.m5330g(record, "record");
        AbstractC5830k.m5330g(list, "list");
        ArrayList arrayList = new ArrayList();
        for (EzySource$GeometrySource.GeometryInfo geometryInfo : list) {
            GeometryInfoEntity geometryInfoEntity = new GeometryInfoEntity(0L, geometryInfo.getPaint().getWidth(), geometryInfo.getPaint().getColor(), geometryInfo.getPaint().getTextSize(), geometryInfo.getPaint().getStyle(), geometryInfo.getGeometryTypeValue());
            SourceLoad sourceLoad = INSTANCE;
            List<EzyPointF$PointF> pointsList = geometryInfo.getPointsList();
            AbstractC5830k.m5329f(pointsList, "it.pointsList");
            sourceLoad.loadGeometryPointFList(geometryInfoEntity, pointsList);
            arrayList.add(geometryInfoEntity);
        }
        BoardBox.INSTANCE.getBoxStore().m5018c(GeometryInfoEntity.class).m5035f(arrayList);
        record.getGeometryInfoEntityList().addAll(arrayList);
    }

    public final void loadGeometryPointFList(@NotNull GeometryInfoEntity geometryInfo, @NotNull List<EzyPointF$PointF> list) {
        AbstractC5830k.m5330g(geometryInfo, "geometryInfo");
        AbstractC5830k.m5330g(list, "list");
        ArrayList arrayList = new ArrayList();
        for (EzyPointF$PointF ezyPointF$PointF : list) {
            arrayList.add(new GeometryPointFEntity(0L, ezyPointF$PointF.getX(), ezyPointF$PointF.getY()));
        }
        BoardBox.INSTANCE.getBoxStore().m5018c(GeometryPointFEntity.class).m5035f(arrayList);
        geometryInfo.getPointList().addAll(arrayList);
    }

    public final void loadGeometryRecordList(@NotNull String pagePath, @NotNull RecordEntity recordEntity, @NotNull List<EzyRouterRecord$RouterRecord.SourceCommandRecord> list) throws FileVerificationException, FileNotFoundException {
        AbstractC5830k.m5330g(pagePath, "pagePath");
        AbstractC5830k.m5330g(recordEntity, "recordEntity");
        AbstractC5830k.m5330g(list, "list");
        for (EzyRouterRecord$RouterRecord.SourceCommandRecord sourceCommandRecord : list) {
            String fileName = sourceCommandRecord.getFileName();
            AbstractC5830k.m5329f(fileName, "it.fileName");
            String validate = sourceCommandRecord.getValidate();
            AbstractC5830k.m5329f(validate, "it.validate");
            GeometryRecordEntity geometryRecordEntity = new GeometryRecordEntity(0L, fileName, validate);
            SourceLoad sourceLoad = INSTANCE;
            String fileName2 = sourceCommandRecord.getFileName();
            AbstractC5830k.m5329f(fileName2, "it.fileName");
            String validate2 = sourceCommandRecord.getValidate();
            AbstractC5830k.m5329f(validate2, "it.validate");
            List<EzySource$GeometrySource.GeometryInfo> geometryInfoList = sourceLoad.getGeometryRecord(pagePath, fileName2, validate2).getGeometryInfoList();
            AbstractC5830k.m5329f(geometryInfoList, "this.geometryInfoList");
            sourceLoad.loadGeometryInfoList(geometryRecordEntity, geometryInfoList);
            geometryRecordEntity.put();
            recordEntity.getGeometryList().add(geometryRecordEntity);
        }
    }

    public final void loadMatrixEventEntityList(@NotNull MatrixRecordEntity record, @NotNull List<EzySource$MatrixSource.MatrixInfo> list) {
        AbstractC5830k.m5330g(record, "record");
        AbstractC5830k.m5330g(list, "list");
        ArrayList arrayList = new ArrayList();
        for (EzySource$MatrixSource.MatrixInfo matrixInfo : list) {
            MatrixEventEntity matrixEventEntity = new MatrixEventEntity(0L);
            SourceLoad sourceLoad = INSTANCE;
            List<EzyMatrix$Matrix> matrixList = matrixInfo.getMatrixList();
            AbstractC5830k.m5329f(matrixList, "it.matrixList");
            sourceLoad.loadMatrixInfo(matrixEventEntity, matrixList);
            arrayList.add(matrixEventEntity);
        }
        BoardBox.INSTANCE.getBoxStore().m5018c(MatrixEventEntity.class).m5035f(arrayList);
        record.getMatrixEventEntity().addAll(arrayList);
    }

    public final void loadMatrixInfo(@NotNull MatrixEventEntity event, @NotNull List<EzyMatrix$Matrix> list) {
        AbstractC5830k.m5330g(event, "event");
        AbstractC5830k.m5330g(list, "list");
        ArrayList arrayList = new ArrayList();
        for (EzyMatrix$Matrix ezyMatrix$Matrix : list) {
            arrayList.add(new MatrixInfoEntity(0L, ezyMatrix$Matrix.getEventTime(), ezyMatrix$Matrix.getScaleX(), ezyMatrix$Matrix.getSkewX(), ezyMatrix$Matrix.getTransX(), ezyMatrix$Matrix.getSkewY(), ezyMatrix$Matrix.getScaleY(), ezyMatrix$Matrix.getTransY(), ezyMatrix$Matrix.getPerSp0(), ezyMatrix$Matrix.getPerSp1(), ezyMatrix$Matrix.getPerSp2()));
        }
        BoardBox.INSTANCE.getBoxStore().m5018c(MatrixInfoEntity.class).m5035f(arrayList);
        event.getMatrixInfo().addAll(arrayList);
    }

    public final void loadMatrixRecordList(@NotNull String pagePath, @NotNull RecordEntity recordEntity, @NotNull List<EzyRouterRecord$RouterRecord.SourceCommandRecord> matrixSourceRecordList) throws FileVerificationException, FileNotFoundException {
        AbstractC5830k.m5330g(pagePath, "pagePath");
        AbstractC5830k.m5330g(recordEntity, "recordEntity");
        AbstractC5830k.m5330g(matrixSourceRecordList, "matrixSourceRecordList");
        for (EzyRouterRecord$RouterRecord.SourceCommandRecord sourceCommandRecord : matrixSourceRecordList) {
            String fileName = sourceCommandRecord.getFileName();
            AbstractC5830k.m5329f(fileName, "it.fileName");
            String validate = sourceCommandRecord.getValidate();
            AbstractC5830k.m5329f(validate, "it.validate");
            MatrixRecordEntity matrixRecordEntity = new MatrixRecordEntity(0L, fileName, validate);
            SourceLoad sourceLoad = INSTANCE;
            String fileName2 = sourceCommandRecord.getFileName();
            AbstractC5830k.m5329f(fileName2, "it.fileName");
            String validate2 = sourceCommandRecord.getValidate();
            AbstractC5830k.m5329f(validate2, "it.validate");
            List<EzySource$MatrixSource.MatrixInfo> matrixInfoList = sourceLoad.getMatrixRecord(pagePath, fileName2, validate2).getMatrixInfoList();
            AbstractC5830k.m5329f(matrixInfoList, "this.matrixInfoList");
            sourceLoad.loadMatrixEventEntityList(matrixRecordEntity, matrixInfoList);
            matrixRecordEntity.put();
            recordEntity.getMatrixList().add(matrixRecordEntity);
        }
    }

    public final void loadPage(@NotNull String dir, @NotNull PageEntity pageEntity) throws FileVerificationException, IOException {
        AbstractC5830k.m5330g(dir, "dir");
        AbstractC5830k.m5330g(pageEntity, "pageEntity");
        String pagePath = new File(dir, pageEntity.getDirName()).getAbsolutePath();
        AbstractC5830k.m5329f(pagePath, "pagePath");
        EzyRouterRecord$RouterRecord router = getRouter(pagePath);
        RecordEntity recordEntity = new RecordEntity(0L);
        SourceLoad sourceLoad = INSTANCE;
        List<EzyRouterRecord$RouterRecord.SourceCommandRecord> commandRecordList = router.getCommandRecordList();
        AbstractC5830k.m5329f(commandRecordList, "commandRecordList");
        sourceLoad.loadCommandRecordList(pagePath, recordEntity, commandRecordList);
        List<EzyRouterRecord$RouterRecord.SourceCommandRecord> touchSourceRecordList = router.getTouchSourceRecordList();
        AbstractC5830k.m5329f(touchSourceRecordList, "touchSourceRecordList");
        sourceLoad.loadTouchRecordList(pagePath, recordEntity, touchSourceRecordList);
        List<EzyRouterRecord$RouterRecord.SourceCommandRecord> matrixSourceRecordList = router.getMatrixSourceRecordList();
        AbstractC5830k.m5329f(matrixSourceRecordList, "matrixSourceRecordList");
        sourceLoad.loadMatrixRecordList(pagePath, recordEntity, matrixSourceRecordList);
        List<EzyRouterRecord$RouterRecord.SourceCommandRecord> fileSourceRecordList = router.getFileSourceRecordList();
        AbstractC5830k.m5329f(fileSourceRecordList, "fileSourceRecordList");
        sourceLoad.loadFileRecordList(pagePath, recordEntity, fileSourceRecordList);
        List<EzyRouterRecord$RouterRecord.SourceCommandRecord> textSourceRecordList = router.getTextSourceRecordList();
        AbstractC5830k.m5329f(textSourceRecordList, "textSourceRecordList");
        sourceLoad.loadTextRecordList(pagePath, recordEntity, textSourceRecordList);
        List<EzyRouterRecord$RouterRecord.SourceCommandRecord> geometrySourceRecordList = router.getGeometrySourceRecordList();
        AbstractC5830k.m5329f(geometrySourceRecordList, "geometrySourceRecordList");
        sourceLoad.loadGeometryRecordList(pagePath, recordEntity, geometrySourceRecordList);
        List<EzyRouterRecord$RouterRecord.SourceCommandRecord> audioRecordList = router.getAudioRecordList();
        AbstractC5830k.m5329f(audioRecordList, "audioRecordList");
        sourceLoad.loadAudioRecordList(pagePath, recordEntity, audioRecordList);
        recordEntity.put();
        pageEntity.getRecordEntity().setTarget(recordEntity);
        EzyHeader$Header header = getHeader(pagePath);
        int version = header.getVersion();
        int width = header.getWidth();
        int height = header.getHeight();
        long createDate = header.getCreateDate();
        long updateDate = header.getUpdateDate();
        long duration = header.getDuration();
        String convertUrl = header.getConvertUrl();
        AbstractC5830k.m5329f(convertUrl, "this.convertUrl");
        HeaderEntity headerEntity = new HeaderEntity(0L, version, width, height, createDate, updateDate, duration, convertUrl, header.getDefaultBackgroundColor(), header.getLastBackgroundColor());
        EzyHeader$Author author = header.getAuthor();
        AbstractC5830k.m5329f(author, "this.author");
        AuthorEntity authorEntityBuildAuthorEntity = sourceLoad.buildAuthorEntity(author);
        authorEntityBuildAuthorEntity.put();
        headerEntity.getAuthor().setTarget(authorEntityBuildAuthorEntity);
        EzyHeader$MoveConfig moveConfig = header.getMoveConfig();
        AbstractC5830k.m5329f(moveConfig, "moveConfig");
        MoveConfigEntity moveConfigEntityBuildMoveConfigEntity = sourceLoad.buildMoveConfigEntity(moveConfig);
        moveConfigEntityBuildMoveConfigEntity.put();
        headerEntity.getMoveConfig().setTarget(moveConfigEntityBuildMoveConfigEntity);
        EzyHeader$BackgroundLineConfig defaultBackgroundLineConfig = header.getDefaultBackgroundLineConfig();
        AbstractC5830k.m5329f(defaultBackgroundLineConfig, "defaultBackgroundLineConfig");
        BackgroundLineConfigEntity backgroundLineConfigEntityBuildBackgroundLineConfigEntity = sourceLoad.buildBackgroundLineConfigEntity(defaultBackgroundLineConfig);
        backgroundLineConfigEntityBuildBackgroundLineConfigEntity.put();
        headerEntity.getDefaultBackgroundLineConfig().setTarget(backgroundLineConfigEntityBuildBackgroundLineConfigEntity);
        EzyHeader$BackgroundLineConfig lastBackgroundLineConfig = header.getLastBackgroundLineConfig();
        AbstractC5830k.m5329f(lastBackgroundLineConfig, "lastBackgroundLineConfig");
        BackgroundLineConfigEntity backgroundLineConfigEntityBuildBackgroundLineConfigEntity2 = sourceLoad.buildBackgroundLineConfigEntity(lastBackgroundLineConfig);
        backgroundLineConfigEntityBuildBackgroundLineConfigEntity2.put();
        headerEntity.getLastBackgroundLineConfig().setTarget(backgroundLineConfigEntityBuildBackgroundLineConfigEntity2);
        List<EzyHeader$Author> providerList = header.getProviderList();
        AbstractC5830k.m5329f(providerList, "this.providerList");
        for (EzyHeader$Author it : providerList) {
            SourceLoad sourceLoad2 = INSTANCE;
            AbstractC5830k.m5329f(it, "it");
            AuthorEntity authorEntityBuildAuthorEntity2 = sourceLoad2.buildAuthorEntity(it);
            authorEntityBuildAuthorEntity2.put();
            headerEntity.getProvider().add(authorEntityBuildAuthorEntity2);
        }
        headerEntity.put();
        pageEntity.getHeaderEntity().setTarget(headerEntity);
    }

    @NotNull
    public final BlackBoardEntity loadRecord(@NotNull String path) throws FileVerificationException, IOException {
        AbstractC5830k.m5330g(path, "path");
        File file = new File(path, SourceSave.PAGE_ROUTER_FILE_NAME);
        if (!file.exists() || !file.isFile()) {
            throw new FileNotFoundException(path);
        }
        BlackBoardEntity blackBoardEntity = new BlackBoardEntity(0L, path);
        BoardBox.INSTANCE.getBoxStore().m5021h(new RunnableC0017h(EzyPageRouter$PageRouter.parseFrom(new FileInputStream(file)), blackBoardEntity, 17, path));
        blackBoardEntity.put();
        return blackBoardEntity;
    }

    public final void loadTextInfoList(@NotNull TextRecordEntity record, @NotNull List<EzySource$TextSource.TextInfo> list) {
        AbstractC5830k.m5330g(record, "record");
        AbstractC5830k.m5330g(list, "list");
        ArrayList arrayList = new ArrayList();
        for (EzySource$TextSource.TextInfo textInfo : list) {
            float width = textInfo.getPaint().getWidth();
            int color = textInfo.getPaint().getColor();
            float textSize = textInfo.getPaint().getTextSize();
            int style = textInfo.getPaint().getStyle();
            String content = textInfo.getContent();
            AbstractC5830k.m5329f(content, "it.content");
            arrayList.add(new TextInfoEntity(0L, width, color, textSize, style, content));
        }
        BoardBox.INSTANCE.getBoxStore().m5018c(TextInfoEntity.class).m5035f(arrayList);
        record.getTextInfoEntityList().addAll(arrayList);
    }

    public final void loadTextRecordList(@NotNull String pagePath, @NotNull RecordEntity recordEntity, @NotNull List<EzyRouterRecord$RouterRecord.SourceCommandRecord> list) throws FileVerificationException, FileNotFoundException {
        AbstractC5830k.m5330g(pagePath, "pagePath");
        AbstractC5830k.m5330g(recordEntity, "recordEntity");
        AbstractC5830k.m5330g(list, "list");
        for (EzyRouterRecord$RouterRecord.SourceCommandRecord sourceCommandRecord : list) {
            String fileName = sourceCommandRecord.getFileName();
            AbstractC5830k.m5329f(fileName, "it.fileName");
            String validate = sourceCommandRecord.getValidate();
            AbstractC5830k.m5329f(validate, "it.validate");
            TextRecordEntity textRecordEntity = new TextRecordEntity(0L, fileName, validate);
            SourceLoad sourceLoad = INSTANCE;
            String fileName2 = sourceCommandRecord.getFileName();
            AbstractC5830k.m5329f(fileName2, "it.fileName");
            String validate2 = sourceCommandRecord.getValidate();
            AbstractC5830k.m5329f(validate2, "it.validate");
            List<EzySource$TextSource.TextInfo> textInfoList = sourceLoad.getTextRecord(pagePath, fileName2, validate2).getTextInfoList();
            AbstractC5830k.m5329f(textInfoList, "this.textInfoList");
            sourceLoad.loadTextInfoList(textRecordEntity, textInfoList);
            textRecordEntity.put();
            recordEntity.getTextList().add(textRecordEntity);
        }
    }

    public final void loadTouchEventEntityList(@NotNull TouchRecordEntity record, @NotNull List<EzySource$TouchSource.TouchInfo> list) {
        AbstractC5830k.m5330g(record, "record");
        AbstractC5830k.m5330g(list, "list");
        ArrayList arrayList = new ArrayList();
        for (EzySource$TouchSource.TouchInfo touchInfo : list) {
            TouchEventEntity touchEventEntity = new TouchEventEntity(0L, touchInfo.getPaint().getWidth(), touchInfo.getPaint().getColor(), touchInfo.getPaint().getSpacing(), touchInfo.getPaint().getItemLength(), touchInfo.getPaint().getStyle(), touchInfo.getPaint().getTextSize());
            SourceLoad sourceLoad = INSTANCE;
            List<EzyTouchEvent$TouchEvent> touchEventList = touchInfo.getTouchEventList();
            AbstractC5830k.m5329f(touchEventList, "it.touchEventList");
            sourceLoad.loadTouchInfo(touchEventEntity, touchEventList);
            arrayList.add(touchEventEntity);
        }
        BoardBox.INSTANCE.getBoxStore().m5018c(TouchEventEntity.class).m5035f(arrayList);
        record.getTouchEventList().addAll(arrayList);
    }

    public final void loadTouchInfo(@NotNull TouchEventEntity event, @NotNull List<EzyTouchEvent$TouchEvent> list) {
        AbstractC5830k.m5330g(event, "event");
        AbstractC5830k.m5330g(list, "list");
        ArrayList arrayList = new ArrayList();
        for (EzyTouchEvent$TouchEvent ezyTouchEvent$TouchEvent : list) {
            arrayList.add(new TouchInfoEntity(0L, ezyTouchEvent$TouchEvent.getEventTime(), ezyTouchEvent$TouchEvent.getX(), ezyTouchEvent$TouchEvent.getY()));
        }
        BoardBox.INSTANCE.getBoxStore().m5018c(TouchInfoEntity.class).m5035f(arrayList);
        event.getTouchInfoList().addAll(arrayList);
    }

    public final void loadTouchRecordList(@NotNull String pagePath, @NotNull RecordEntity recordEntity, @NotNull List<EzyRouterRecord$RouterRecord.SourceCommandRecord> touchSourceRecordList) throws FileVerificationException, FileNotFoundException {
        AbstractC5830k.m5330g(pagePath, "pagePath");
        AbstractC5830k.m5330g(recordEntity, "recordEntity");
        AbstractC5830k.m5330g(touchSourceRecordList, "touchSourceRecordList");
        for (EzyRouterRecord$RouterRecord.SourceCommandRecord sourceCommandRecord : touchSourceRecordList) {
            String fileName = sourceCommandRecord.getFileName();
            AbstractC5830k.m5329f(fileName, "it.fileName");
            String validate = sourceCommandRecord.getValidate();
            AbstractC5830k.m5329f(validate, "it.validate");
            TouchRecordEntity touchRecordEntity = new TouchRecordEntity(0L, fileName, validate);
            SourceLoad sourceLoad = INSTANCE;
            String fileName2 = sourceCommandRecord.getFileName();
            AbstractC5830k.m5329f(fileName2, "it.fileName");
            String validate2 = sourceCommandRecord.getValidate();
            AbstractC5830k.m5329f(validate2, "it.validate");
            List<EzySource$TouchSource.TouchInfo> touchInfoList = sourceLoad.getTouchRecord(pagePath, fileName2, validate2).getTouchInfoList();
            AbstractC5830k.m5329f(touchInfoList, "this.touchInfoList");
            sourceLoad.loadTouchEventEntityList(touchRecordEntity, touchInfoList);
            touchRecordEntity.put();
            recordEntity.getTouchList().add(touchRecordEntity);
        }
    }
}
