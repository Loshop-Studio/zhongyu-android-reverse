package com.zykj.blackboard.core.data;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox、Protobuf。

import android.support.v4.media.AbstractC0037f;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.AbstractC3387g;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.ByteString;
import com.google.protobuf.Message;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.zykj.blackboard.core.data.dao.AudioInfoEntity;
import com.zykj.blackboard.core.data.dao.AudioRecordEntity;
import com.zykj.blackboard.core.data.dao.AuthorEntity;
import com.zykj.blackboard.core.data.dao.BackgroundLineConfigEntity;
import com.zykj.blackboard.core.data.dao.BlackBoardEntity;
import com.zykj.blackboard.core.data.dao.BlackBoardEntity_;
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
import com.zykj.blackboard.utils.BoardBox;
import com.zykj.blackboard.utils.FileUtils;
import com.zykj.blackboard.utils.FileValidateUtils;
import com.zykj.board.C4351a;
import com.zykj.board.C4352a0;
import com.zykj.board.C4362e;
import com.zykj.board.C4365f0;
import com.zykj.board.C4369h0;
import com.zykj.board.C4371i0;
import com.zykj.board.C4375k0;
import com.zykj.board.C4377l0;
import com.zykj.board.C4381n0;
import com.zykj.board.C4383o0;
import com.zykj.board.C4387q0;
import com.zykj.board.C4389r0;
import com.zykj.board.C4393t0;
import com.zykj.board.C4395u0;
import com.zykj.board.C4399w0;
import com.zykj.board.C4401x0;
import com.zykj.board.C4402y;
import com.zykj.board.EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;
import com.zykj.board.EzyCommand$CommandSource;
import com.zykj.board.EzyHeader$Author;
import com.zykj.board.EzyHeader$BackgroundLineConfig;
import com.zykj.board.EzyHeader$Header;
import com.zykj.board.EzyHeader$MoveConfig;
import com.zykj.board.EzyMatrix$Matrix;
import com.zykj.board.EzyPageRouter$PageRouter;
import com.zykj.board.EzyPaint$Paint;
import com.zykj.board.EzyPointF$PointF;
import com.zykj.board.EzyRouterRecord$RouterRecord;
import com.zykj.board.EzySource$FileSource;
import com.zykj.board.EzySource$GeometrySource;
import com.zykj.board.EzySource$MatrixSource;
import com.zykj.board.EzySource$TextSource;
import com.zykj.board.EzySource$TouchSource;
import com.zykj.board.EzyTouchEvent$TouchEvent;
import io.objectbox.query.QueryBuilder;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p020b4.C3115b0;
import p020b4.C3153o;
import p020b4.C3157p0;
import p020b4.C3162r;
import p020b4.C3171u;
import p020b4.C3172u0;
import p020b4.C3177w;

@Metadata(m5109d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0019\u001a\u00020\u00182\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0019\u0010\u001dJ\u001d\u0010 \u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\"\u0010!J\u001d\u0010&\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00142\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00142\u0006\u0010%\u001a\u00020(¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00142\u0006\u0010%\u001a\u00020+¢\u0006\u0004\b,\u0010-J\u001d\u0010/\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00142\u0006\u0010%\u001a\u00020.¢\u0006\u0004\b/\u00100J\u001d\u00102\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00142\u0006\u0010%\u001a\u000201¢\u0006\u0004\b2\u00103J\u001d\u00105\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00142\u0006\u0010%\u001a\u000204¢\u0006\u0004\b5\u00106J\u001d\u00108\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00142\u0006\u0010%\u001a\u000207¢\u0006\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\u00148\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\u00148\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010;R\u0014\u0010=\u001a\u00020\u00148\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010;¨\u0006>"}, m5110d2 = {"Lcom/zykj/blackboard/core/data/SourceSave;", "", "<init>", "()V", "Lcom/zykj/blackboard/core/data/dao/AuthorEntity;", "authorEntity", "Lcom/zykj/board/EzyHeader$Author;", "buildAuthor", "(Lcom/zykj/blackboard/core/data/dao/AuthorEntity;)Lcom/zykj/board/EzyHeader$Author;", "Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;", "moveConfig", "Lcom/zykj/board/EzyHeader$MoveConfig;", "buildMoveConfig", "(Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;)Lcom/zykj/board/EzyHeader$MoveConfig;", "Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;", "backgroundLineConfig", "Lcom/zykj/board/EzyHeader$BackgroundLineConfig;", "buildBackgroundLineConfig", "(Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;", "", "", "pagePathList", "path", "boardPath", "Ld6/s;", "saveRecord", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;", "boardEntity", "(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;Ljava/util/List;)V", "Lcom/zykj/blackboard/core/data/dao/PageEntity;", "pageEntity", "saveHeader", "(Lcom/zykj/blackboard/core/data/dao/PageEntity;Ljava/lang/String;)V", "saveRouter", "pagePath", "Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;", "record", "saveCommand", "(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;)V", "Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;", "saveTouch", "(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;)V", "Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;", "saveFile", "(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;)V", "Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;", "saveMatrix", "(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;)V", "Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;", "saveAudio", "(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;)V", "Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;", "saveText", "(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;)V", "Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;", "saveGeometry", "(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;)V", "PAGE_ROUTER_FILE_NAME", "Ljava/lang/String;", "ROUTER_FILE_NAME", "HEADER_FILE_NAME", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class SourceSave {

    @NotNull
    public static final String HEADER_FILE_NAME = "header.bin";

    @NotNull
    public static final SourceSave INSTANCE = new SourceSave();

    @NotNull
    public static final String PAGE_ROUTER_FILE_NAME = "page_router.bin";

    @NotNull
    public static final String ROUTER_FILE_NAME = "router.bin";

    private SourceSave() {
    }

    private final EzyHeader$Author buildAuthor(AuthorEntity authorEntity) {
        C3153o c3153oNewBuilder = EzyHeader$Author.newBuilder();
        String authorName = authorEntity.getAuthorName();
        if (authorName != null) {
            c3153oNewBuilder.getClass();
            c3153oNewBuilder.f1625b = authorName;
            c3153oNewBuilder.f1624a |= 1;
            c3153oNewBuilder.onChanged();
        }
        String authorId = authorEntity.getAuthorId();
        if (authorId != null) {
            c3153oNewBuilder.getClass();
            c3153oNewBuilder.f1627d = authorId;
            c3153oNewBuilder.f1624a |= 4;
            c3153oNewBuilder.onChanged();
        }
        String schoolId = authorEntity.getSchoolId();
        if (schoolId != null) {
            c3153oNewBuilder.getClass();
            c3153oNewBuilder.f1626c = schoolId;
            c3153oNewBuilder.f1624a |= 2;
            c3153oNewBuilder.onChanged();
        }
        String url = authorEntity.getUrl();
        if (url != null) {
            c3153oNewBuilder.getClass();
            c3153oNewBuilder.f1628e = url;
            c3153oNewBuilder.f1624a |= 8;
            c3153oNewBuilder.onChanged();
        }
        Long startTime = authorEntity.getStartTime();
        if (startTime != null) {
            c3153oNewBuilder.f1629f = startTime.longValue();
            c3153oNewBuilder.f1624a |= 16;
            c3153oNewBuilder.onChanged();
        }
        Long duration = authorEntity.getDuration();
        if (duration != null) {
            c3153oNewBuilder.f1630g = duration.longValue();
            c3153oNewBuilder.f1624a |= 32;
            c3153oNewBuilder.onChanged();
        }
        EzyHeader$Author ezyHeader$AuthorM2094c = c3153oNewBuilder.buildPartial();
        if (ezyHeader$AuthorM2094c.isInitialized()) {
            return ezyHeader$AuthorM2094c;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) ezyHeader$AuthorM2094c);
    }

    private final EzyHeader$BackgroundLineConfig buildBackgroundLineConfig(BackgroundLineConfigEntity backgroundLineConfig) { // 页头写回：只编码颜色、间距与类型。录制时的显式线宽位于 ACTION_CONFIG 命令中。
        C3162r c3162rNewBuilder = EzyHeader$BackgroundLineConfig.newBuilder();
        c3162rNewBuilder.f1639b = backgroundLineConfig.getLineColor();
        c3162rNewBuilder.f1638a |= 1;
        c3162rNewBuilder.onChanged();
        c3162rNewBuilder.f1640c = backgroundLineConfig.getLineSpace();
        c3162rNewBuilder.f1638a |= 2;
        c3162rNewBuilder.onChanged();
        EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum lineType = backgroundLineConfig.getLineType();
        lineType.getClass();
        c3162rNewBuilder.f1638a |= 4;
        c3162rNewBuilder.f1641d = lineType.getNumber();
        c3162rNewBuilder.onChanged();
        return c3162rNewBuilder.build();
    }

    private final EzyHeader$MoveConfig buildMoveConfig(MoveConfigEntity moveConfig) {
        C3177w c3177wNewBuilder = EzyHeader$MoveConfig.newBuilder();
        c3177wNewBuilder.f1690b = moveConfig.getIsEnable();
        c3177wNewBuilder.f1689a |= 1;
        c3177wNewBuilder.onChanged();
        c3177wNewBuilder.f1691c = moveConfig.getVerticalTranslate();
        c3177wNewBuilder.f1689a |= 2;
        c3177wNewBuilder.onChanged();
        c3177wNewBuilder.f1692d = moveConfig.getHorizontalTranslate();
        c3177wNewBuilder.f1689a |= 4;
        c3177wNewBuilder.onChanged();
        c3177wNewBuilder.f1693e = moveConfig.getScale();
        c3177wNewBuilder.f1689a |= 8;
        c3177wNewBuilder.onChanged();
        c3177wNewBuilder.f1694f = moveConfig.getRotate();
        c3177wNewBuilder.f1689a |= 16;
        c3177wNewBuilder.onChanged();
        c3177wNewBuilder.f1695g = moveConfig.getMaxHeightTimes();
        c3177wNewBuilder.f1689a |= 32;
        c3177wNewBuilder.onChanged();
        c3177wNewBuilder.f1696h = moveConfig.getMaxWidthTimes();
        c3177wNewBuilder.f1689a |= 64;
        c3177wNewBuilder.onChanged();
        EzyHeader$MoveConfig ezyHeader$MoveConfigM2132c = c3177wNewBuilder.buildPartial();
        if (ezyHeader$MoveConfigM2132c.isInitialized()) {
            return ezyHeader$MoveConfigM2132c;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) ezyHeader$MoveConfigM2132c);
    }

    public static /* synthetic */ void saveRecord$default(SourceSave sourceSave, List list, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = str;
        }
        sourceSave.saveRecord(list, str, str2);
    }

    // RE note 每页的 *_audio.bin 内为 CommandSource。独立音频在笔记根目录 res/audio/，
    // router.bin 的 audioRecord.validate 校验序列化后的命令分片。
    public final void saveAudio(@NotNull String pagePath, @NotNull AudioRecordEntity record) throws Throwable {
        String fileSignature;
        AbstractC5830k.m5330g(pagePath, "pagePath");
        AbstractC5830k.m5330g(record, "record");
        C4351a c4351aNewBuilder = EzyCommand$CommandSource.newBuilder();
        for (AudioInfoEntity audioInfoEntity : record.getAudioInfoEntity()) {
            C4362e c4362eNewBuilder = EzyCommand$CommandSource.CommandInfo.newBuilder();
            c4362eNewBuilder.m3727k(audioInfoEntity.getDelayTime());
            c4362eNewBuilder.m3728l(audioInfoEntity.getDuration());
            c4362eNewBuilder.m3729m(audioInfoEntity.isPlay());
            c4362eNewBuilder.m3725i(audioInfoEntity.getCommandEnum());
            c4362eNewBuilder.m3726j(ByteString.copyFrom(audioInfoEntity.getData()));
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = c4351aNewBuilder.f5442c;
            if (repeatedFieldBuilderV3 == null) {
                c4351aNewBuilder.m3684g();
                c4351aNewBuilder.f5441b.add(c4362eNewBuilder.build());
                c4351aNewBuilder.onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(c4362eNewBuilder.build());
            }
        }
        RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = c4351aNewBuilder.f5442c;
        if ((repeatedFieldBuilderV32 == null ? c4351aNewBuilder.f5441b.size() : repeatedFieldBuilderV32.getCount()) <= 0) {
            AbstractC3387g.m2342e("[SourceSave]: saveAudio-> [" + record.getFileName() + "]commandInfoCount==0");
            return;
        }
        File fileSaveToFile = FileUtils.INSTANCE.saveToFile(pagePath, record.getFileName(), c4351aNewBuilder.build());
        if (fileSaveToFile == null || (fileSignature = FileValidateUtils.INSTANCE.getFileSignature(fileSaveToFile, FileValidateUtils.TypeEnum.SHA256)) == null) {
            return;
        }
        record.setValidate(fileSignature);
    }

    public final void saveCommand(@NotNull String pagePath, @NotNull CommandRecordEntity record) throws Throwable {
        String fileSignature;
        AbstractC5830k.m5330g(pagePath, "pagePath");
        AbstractC5830k.m5330g(record, "record");
        C4351a c4351aNewBuilder = EzyCommand$CommandSource.newBuilder();
        for (CommandInfoEntity commandInfoEntity : record.getCommandInfoEntity()) {
            C4362e c4362eNewBuilder = EzyCommand$CommandSource.CommandInfo.newBuilder();
            c4362eNewBuilder.m3727k(commandInfoEntity.getDelayTime());
            c4362eNewBuilder.m3728l(commandInfoEntity.getDuration());
            c4362eNewBuilder.m3729m(commandInfoEntity.isPlay());
            c4362eNewBuilder.m3725i(commandInfoEntity.getCommandEnum());
            c4362eNewBuilder.m3726j(ByteString.copyFrom(commandInfoEntity.getData()));
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = c4351aNewBuilder.f5442c;
            if (repeatedFieldBuilderV3 == null) {
                c4351aNewBuilder.m3684g();
                c4351aNewBuilder.f5441b.add(c4362eNewBuilder.build());
                c4351aNewBuilder.onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(c4362eNewBuilder.build());
            }
        }
        RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = c4351aNewBuilder.f5442c;
        if ((repeatedFieldBuilderV32 == null ? c4351aNewBuilder.f5441b.size() : repeatedFieldBuilderV32.getCount()) <= 0) {
            AbstractC3387g.m2342e("[SourceSave]: saveCommand-> [" + record.getFileName() + "]commandInfoCount==0");
            return;
        }
        File fileSaveToFile = FileUtils.INSTANCE.saveToFile(pagePath, record.getFileName(), c4351aNewBuilder.build());
        if (fileSaveToFile == null || (fileSignature = FileValidateUtils.INSTANCE.getFileSignature(fileSaveToFile, FileValidateUtils.TypeEnum.SHA256)) == null) {
            return;
        }
        record.setValidate(fileSignature);
    }

    public final void saveFile(@NotNull String pagePath, @NotNull FileRecordEntity record) throws Throwable {
        String fileSignature;
        AbstractC5830k.m5330g(pagePath, "pagePath");
        AbstractC5830k.m5330g(record, "record");
        C4371i0 c4371i0NewBuilder = EzySource$FileSource.newBuilder();
        for (FileInfoEntity fileInfoEntity : record.getFileInfoEntity()) {
            C4375k0 c4375k0NewBuilder = EzySource$FileSource.FileInfo.newBuilder();
            String fileName = fileInfoEntity.getFileName();
            c4375k0NewBuilder.getClass();
            fileName.getClass();
            c4375k0NewBuilder.f5523b = fileName;
            c4375k0NewBuilder.f5522a |= 1;
            c4375k0NewBuilder.onChanged();
            String validate = fileInfoEntity.getValidate();
            validate.getClass();
            c4375k0NewBuilder.f5526e = validate;
            c4375k0NewBuilder.f5522a |= 8;
            c4375k0NewBuilder.onChanged();
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = c4371i0NewBuilder.f5514c;
            if (repeatedFieldBuilderV3 == null) {
                c4371i0NewBuilder.m3762f();
                c4371i0NewBuilder.f5513b.add(c4375k0NewBuilder.build());
                c4371i0NewBuilder.onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(c4375k0NewBuilder.build());
            }
        }
        RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = c4371i0NewBuilder.f5514c;
        if ((repeatedFieldBuilderV32 == null ? c4371i0NewBuilder.f5513b.size() : repeatedFieldBuilderV32.getCount()) <= 0) {
            AbstractC3387g.m2342e("[SourceSave]: saveFile-> [" + record.getFileName() + "]fileInfoCount==0");
            return;
        }
        FileUtils fileUtils = FileUtils.INSTANCE;
        String fileName2 = record.getFileName();
        EzySource$FileSource ezySource$FileSourceM3760c = c4371i0NewBuilder.buildPartial();
        if (!ezySource$FileSourceM3760c.isInitialized()) {
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) ezySource$FileSourceM3760c);
        }
        File fileSaveToFile = fileUtils.saveToFile(pagePath, fileName2, ezySource$FileSourceM3760c);
        if (fileSaveToFile == null || (fileSignature = FileValidateUtils.INSTANCE.getFileSignature(fileSaveToFile, FileValidateUtils.TypeEnum.SHA256)) == null) {
            return;
        }
        record.setValidate(fileSignature);
    }

    public final void saveGeometry(@NotNull String pagePath, @NotNull GeometryRecordEntity record) throws Throwable {
        String fileSignature;
        AbstractC5830k.m5330g(pagePath, "pagePath");
        AbstractC5830k.m5330g(record, "record");
        C4377l0 c4377l0NewBuilder = EzySource$GeometrySource.newBuilder();
        for (GeometryInfoEntity geometryInfoEntity : record.getGeometryInfoEntityList()) {
            C4381n0 c4381n0NewBuilder = EzySource$GeometrySource.GeometryInfo.newBuilder();
            c4381n0NewBuilder.f5534b = geometryInfoEntity.getGeometryType();
            c4381n0NewBuilder.f5533a |= 1;
            c4381n0NewBuilder.onChanged();
            C3157p0 c3157p0NewBuilder = EzyPaint$Paint.newBuilder();
            c3157p0NewBuilder.m2103i(geometryInfoEntity.getColor());
            c3157p0NewBuilder.m2108n(geometryInfoEntity.getWidth());
            c3157p0NewBuilder.m2107m(geometryInfoEntity.getTextSize());
            c3157p0NewBuilder.m2106l(geometryInfoEntity.getStyle());
            EzyPaint$Paint ezyPaint$PaintM2098c = c3157p0NewBuilder.build();
            SingleFieldBuilderV3 singleFieldBuilderV3 = c4381n0NewBuilder.f5538f;
            if (singleFieldBuilderV3 == null) {
                c4381n0NewBuilder.f5537e = ezyPaint$PaintM2098c;
            } else {
                singleFieldBuilderV3.setMessage(ezyPaint$PaintM2098c);
            }
            c4381n0NewBuilder.f5533a |= 4;
            c4381n0NewBuilder.onChanged();
            for (GeometryPointFEntity geometryPointFEntity : geometryInfoEntity.getPointList()) {
                C3172u0 c3172u0NewBuilder = EzyPointF$PointF.newBuilder();
                c3172u0NewBuilder.m2130i(geometryPointFEntity.getX());
                c3172u0NewBuilder.m2131j(geometryPointFEntity.getY());
                EzyPointF$PointF ezyPointF$PointFM2125c = c3172u0NewBuilder.build();
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = c4381n0NewBuilder.f5536d;
                if (repeatedFieldBuilderV3 == null) {
                    c4381n0NewBuilder.m3788g();
                    c4381n0NewBuilder.f5535c.add(ezyPointF$PointFM2125c);
                    c4381n0NewBuilder.onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(ezyPointF$PointFM2125c);
                }
            }
            RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = c4377l0NewBuilder.f5529c;
            if (repeatedFieldBuilderV32 == null) {
                c4377l0NewBuilder.m3778f();
                c4377l0NewBuilder.f5528b.add(c4381n0NewBuilder.build());
                c4377l0NewBuilder.onChanged();
            } else {
                repeatedFieldBuilderV32.addMessage(c4381n0NewBuilder.build());
            }
        }
        RepeatedFieldBuilderV3 repeatedFieldBuilderV33 = c4377l0NewBuilder.f5529c;
        if ((repeatedFieldBuilderV33 == null ? c4377l0NewBuilder.f5528b.size() : repeatedFieldBuilderV33.getCount()) <= 0) {
            AbstractC3387g.m2342e("[SourceSave]: saveGeometry-> [" + record.getFileName() + "]geometryInfoCount==0");
            return;
        }
        FileUtils fileUtils = FileUtils.INSTANCE;
        String fileName = record.getFileName();
        EzySource$GeometrySource ezySource$GeometrySourceM3776c = c4377l0NewBuilder.buildPartial();
        if (!ezySource$GeometrySourceM3776c.isInitialized()) {
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) ezySource$GeometrySourceM3776c);
        }
        File fileSaveToFile = fileUtils.saveToFile(pagePath, fileName, ezySource$GeometrySourceM3776c);
        if (fileSaveToFile == null || (fileSignature = FileValidateUtils.INSTANCE.getFileSignature(fileSaveToFile, FileValidateUtils.TypeEnum.SHA256)) == null) {
            return;
        }
        record.setValidate(fileSignature);
    }

    public final void saveHeader(@NotNull PageEntity pageEntity, @NotNull String path) throws Throwable {
        AbstractC5830k.m5330g(pageEntity, "pageEntity");
        AbstractC5830k.m5330g(path, "path");
        AbstractC3387g.m2338a("页面SourceSave：开始保存Header.bin文件");
        HeaderEntity target = pageEntity.getHeaderEntity().getTarget();
        C3171u c3171uNewBuilder = EzyHeader$Header.newBuilder();
        c3171uNewBuilder.f1647b = target.getVersion();
        c3171uNewBuilder.f1646a |= 1;
        c3171uNewBuilder.onChanged();
        c3171uNewBuilder.f1648c = target.getWidth();
        c3171uNewBuilder.f1646a |= 2;
        c3171uNewBuilder.onChanged();
        c3171uNewBuilder.f1649d = target.getHeight();
        c3171uNewBuilder.f1646a |= 4;
        c3171uNewBuilder.onChanged();
        c3171uNewBuilder.f1650e = target.getCreateDate();
        c3171uNewBuilder.f1646a |= 8;
        c3171uNewBuilder.onChanged();
        c3171uNewBuilder.f1651f = target.getUpdateDate();
        c3171uNewBuilder.f1646a |= 16;
        c3171uNewBuilder.onChanged();
        c3171uNewBuilder.f1652g = target.getDuration();
        c3171uNewBuilder.f1646a |= 32;
        c3171uNewBuilder.onChanged();
        c3171uNewBuilder.f1658m = target.getDefaultBackgroundColor();
        c3171uNewBuilder.f1646a |= 512;
        c3171uNewBuilder.onChanged();
        c3171uNewBuilder.f1659n = target.getLastBackgroundColor();
        c3171uNewBuilder.f1646a |= 1024;
        c3171uNewBuilder.onChanged();
        AuthorEntity target2 = target.getAuthor().getTarget();
        if (target2 != null) {
            EzyHeader$Author ezyHeader$AuthorBuildAuthor = INSTANCE.buildAuthor(target2);
            SingleFieldBuilderV3 singleFieldBuilderV3 = c3171uNewBuilder.f1654i;
            if (singleFieldBuilderV3 == null) {
                ezyHeader$AuthorBuildAuthor.getClass();
                c3171uNewBuilder.f1653h = ezyHeader$AuthorBuildAuthor;
            } else {
                singleFieldBuilderV3.setMessage(ezyHeader$AuthorBuildAuthor);
            }
            c3171uNewBuilder.f1646a |= 64;
            c3171uNewBuilder.onChanged();
        }
        MoveConfigEntity target3 = target.getMoveConfig().getTarget();
        if (target3 != null) {
            EzyHeader$MoveConfig ezyHeader$MoveConfigBuildMoveConfig = INSTANCE.buildMoveConfig(target3);
            SingleFieldBuilderV3 singleFieldBuilderV32 = c3171uNewBuilder.f1661p;
            if (singleFieldBuilderV32 == null) {
                ezyHeader$MoveConfigBuildMoveConfig.getClass();
                c3171uNewBuilder.f1660o = ezyHeader$MoveConfigBuildMoveConfig;
            } else {
                singleFieldBuilderV32.setMessage(ezyHeader$MoveConfigBuildMoveConfig);
            }
            c3171uNewBuilder.f1646a |= 2048;
            c3171uNewBuilder.onChanged();
        }
        BackgroundLineConfigEntity target4 = target.getDefaultBackgroundLineConfig().getTarget();
        if (target4 != null) {
            EzyHeader$BackgroundLineConfig ezyHeader$BackgroundLineConfigBuildBackgroundLineConfig = INSTANCE.buildBackgroundLineConfig(target4);
            SingleFieldBuilderV3 singleFieldBuilderV33 = c3171uNewBuilder.f1663r;
            if (singleFieldBuilderV33 == null) {
                ezyHeader$BackgroundLineConfigBuildBackgroundLineConfig.getClass();
                c3171uNewBuilder.f1662q = ezyHeader$BackgroundLineConfigBuildBackgroundLineConfig;
            } else {
                singleFieldBuilderV33.setMessage(ezyHeader$BackgroundLineConfigBuildBackgroundLineConfig);
            }
            c3171uNewBuilder.f1646a |= 4096;
            c3171uNewBuilder.onChanged();
        }
        BackgroundLineConfigEntity target5 = target.getLastBackgroundLineConfig().getTarget();
        if (target5 != null) {
            EzyHeader$BackgroundLineConfig ezyHeader$BackgroundLineConfigBuildBackgroundLineConfig2 = INSTANCE.buildBackgroundLineConfig(target5);
            SingleFieldBuilderV3 singleFieldBuilderV34 = c3171uNewBuilder.f1665t;
            if (singleFieldBuilderV34 == null) {
                ezyHeader$BackgroundLineConfigBuildBackgroundLineConfig2.getClass();
                c3171uNewBuilder.f1664s = ezyHeader$BackgroundLineConfigBuildBackgroundLineConfig2;
            } else {
                singleFieldBuilderV34.setMessage(ezyHeader$BackgroundLineConfigBuildBackgroundLineConfig2);
            }
            c3171uNewBuilder.f1646a |= 8192;
            c3171uNewBuilder.onChanged();
        }
        for (AuthorEntity it : target.getProvider()) {
            SourceSave sourceSave = INSTANCE;
            AbstractC5830k.m5329f(it, "it");
            EzyHeader$Author ezyHeader$AuthorBuildAuthor2 = sourceSave.buildAuthor(it);
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = c3171uNewBuilder.f1657l;
            if (repeatedFieldBuilderV3 == null) {
                ezyHeader$AuthorBuildAuthor2.getClass();
                c3171uNewBuilder.m2117g();
                c3171uNewBuilder.f1656k.add(ezyHeader$AuthorBuildAuthor2);
                c3171uNewBuilder.onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(ezyHeader$AuthorBuildAuthor2);
            }
        }
        FileUtils fileUtils = FileUtils.INSTANCE;
        String absolutePath = new File(path, pageEntity.getDirName()).getAbsolutePath();
        AbstractC5830k.m5329f(absolutePath, "File(path, pageEntity.dirName).absolutePath");
        fileUtils.saveToFile(absolutePath, HEADER_FILE_NAME, c3171uNewBuilder.build());
        AbstractC3387g.m2338a("页面SourceSave：保存Header.bin文件结束，路径是" + new File(path, pageEntity.getDirName()).getAbsolutePath());
    }

    public final void saveMatrix(@NotNull String pagePath, @NotNull MatrixRecordEntity record) throws Throwable {
        String fileSignature;
        AbstractC5830k.m5330g(pagePath, "pagePath");
        AbstractC5830k.m5330g(record, "record");
        C4383o0 c4383o0NewBuilder = EzySource$MatrixSource.newBuilder();
        for (MatrixEventEntity matrixEventEntity : record.getMatrixEventEntity()) {
            C4387q0 c4387q0NewBuilder = EzySource$MatrixSource.MatrixInfo.newBuilder();
            for (MatrixInfoEntity matrixInfoEntity : matrixEventEntity.getMatrixInfo()) {
                C3115b0 c3115b0NewBuilder = EzyMatrix$Matrix.newBuilder();
                c3115b0NewBuilder.m2075i(matrixInfoEntity.getEventTime());
                c3115b0NewBuilder.m2079m(matrixInfoEntity.getScaleX());
                c3115b0NewBuilder.m2081o(matrixInfoEntity.getSkewX());
                c3115b0NewBuilder.m2083q(matrixInfoEntity.getTransX());
                c3115b0NewBuilder.m2082p(matrixInfoEntity.getSkewY());
                c3115b0NewBuilder.m2080n(matrixInfoEntity.getScaleY());
                c3115b0NewBuilder.m2084r(matrixInfoEntity.getTransY());
                c3115b0NewBuilder.m2076j(matrixInfoEntity.getPerSp0());
                c3115b0NewBuilder.m2077k(matrixInfoEntity.getPerSp1());
                c3115b0NewBuilder.m2078l(matrixInfoEntity.getPerSp2());
                EzyMatrix$Matrix ezyMatrix$MatrixBuild = c3115b0NewBuilder.build();
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = c4387q0NewBuilder.f5566c;
                if (repeatedFieldBuilderV3 == null) {
                    c4387q0NewBuilder.ensureMatrixIsMutable();
                    c4387q0NewBuilder.f5565b.add(ezyMatrix$MatrixBuild);
                    c4387q0NewBuilder.onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(ezyMatrix$MatrixBuild);
                }
            }
            EzySource$MatrixSource.MatrixInfo matrixInfoM3817c = c4387q0NewBuilder.build();
            RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = c4383o0NewBuilder.f5554c;
            if (repeatedFieldBuilderV32 == null) {
                c4383o0NewBuilder.m3802f();
                c4383o0NewBuilder.f5553b.add(matrixInfoM3817c);
                c4383o0NewBuilder.onChanged();
            } else {
                repeatedFieldBuilderV32.addMessage(matrixInfoM3817c);
            }
        }
        RepeatedFieldBuilderV3 repeatedFieldBuilderV33 = c4383o0NewBuilder.f5554c;
        if ((repeatedFieldBuilderV33 == null ? c4383o0NewBuilder.f5553b.size() : repeatedFieldBuilderV33.getCount()) <= 0) {
            AbstractC3387g.m2342e("[SourceSave]: saveMatrix-> [" + record.getFileName() + "]matrixInfoCount==0");
            return;
        }
        FileUtils fileUtils = FileUtils.INSTANCE;
        String fileName = record.getFileName();
        EzySource$MatrixSource ezySource$MatrixSourceM3800c = c4383o0NewBuilder.buildPartial();
        if (!ezySource$MatrixSourceM3800c.isInitialized()) {
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) ezySource$MatrixSourceM3800c);
        }
        File fileSaveToFile = fileUtils.saveToFile(pagePath, fileName, ezySource$MatrixSourceM3800c);
        if (fileSaveToFile == null || (fileSignature = FileValidateUtils.INSTANCE.getFileSignature(fileSaveToFile, FileValidateUtils.TypeEnum.SHA256)) == null) {
            return;
        }
        record.setValidate(fileSignature);
    }

    public final void saveRecord(@NotNull List<String> pagePathList, @NotNull String path, @NotNull String boardPath) {
        AbstractC5830k.m5330g(pagePathList, "pagePathList");
        AbstractC5830k.m5330g(path, "path");
        AbstractC5830k.m5330g(boardPath, "boardPath");
        StringBuilder sb = new StringBuilder();
        sb.append("[SourceSave]: saveRecord-> boardPath:".concat(boardPath));
        int i = 0;
        for (Object obj : pagePathList) {
            int i8 = i + 1;
            if (i < 0) {
                AbstractC5806u.m5258L();
                throw null;
            }
            sb.append("[" + i + "]:" + ((String) obj));
            i = i8;
        }
        AbstractC3387g.m2342e(sb);
        QueryBuilder queryBuilderM5036g = BoardBox.INSTANCE.getBoxStore().m5018c(BlackBoardEntity.class).m5036g();
        queryBuilderM5036g.m5064b(BlackBoardEntity_.dir, boardPath);
        BlackBoardEntity blackBoardEntity = (BlackBoardEntity) queryBuilderM5036g.m5063a().m5062c();
        if (blackBoardEntity != null) {
            INSTANCE.saveRecord(blackBoardEntity, pagePathList);
        }
    }

    public final void saveRouter(@NotNull PageEntity pageEntity, @NotNull String path) throws Throwable {
        AbstractC5830k.m5330g(pageEntity, "pageEntity");
        AbstractC5830k.m5330g(path, "path");
        C4365f0 c4365f0NewBuilder = EzyRouterRecord$RouterRecord.newBuilder();
        String pagePath = new File(path, pageEntity.getDirName()).getAbsolutePath();
        RecordEntity target = pageEntity.getRecordEntity().getTarget();
        for (CommandRecordEntity commandRecordEntity : target.getCommandList()) {
            AbstractC3387g.m2338a("页面SourceSave: 开始保存commandList文件:" + commandRecordEntity.getFileName());
            if (!commandRecordEntity.getCommandInfoEntity().isEmpty()) {
                SourceSave sourceSave = INSTANCE;
                AbstractC5830k.m5329f(pagePath, "pagePath");
                sourceSave.saveCommand(pagePath, commandRecordEntity);
                AbstractC3387g.m2338a("页面SourceSave: saveRouter-> command:" + commandRecordEntity.getFileName() + ", validate:" + commandRecordEntity.getValidate());
                C4369h0 c4369h0NewBuilder = EzyRouterRecord$RouterRecord.SourceCommandRecord.newBuilder();
                c4369h0NewBuilder.m3752i(commandRecordEntity.getFileName());
                c4369h0NewBuilder.m3753j(commandRecordEntity.getValidate());
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = c4365f0NewBuilder.f5484c;
                if (repeatedFieldBuilderV3 == null) {
                    c4365f0NewBuilder.m3733g();
                    c4365f0NewBuilder.f5483b.add(c4369h0NewBuilder.build());
                    c4365f0NewBuilder.onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(c4369h0NewBuilder.build());
                }
            }
        }
        for (FileRecordEntity fileRecordEntity : target.getFileList()) {
            AbstractC3387g.m2338a("页面SourceSave: 开始保存file文件-> file:" + fileRecordEntity.getFileName());
            if (!fileRecordEntity.getFileInfoEntity().isEmpty()) {
                SourceSave sourceSave2 = INSTANCE;
                AbstractC5830k.m5329f(pagePath, "pagePath");
                sourceSave2.saveFile(pagePath, fileRecordEntity);
                AbstractC3387g.m2338a("页面SourceSave: saveRouter-> file:" + fileRecordEntity.getFileName() + ", validate:" + fileRecordEntity.getValidate());
                C4369h0 c4369h0NewBuilder2 = EzyRouterRecord$RouterRecord.SourceCommandRecord.newBuilder();
                c4369h0NewBuilder2.m3752i(fileRecordEntity.getFileName());
                c4369h0NewBuilder2.m3753j(fileRecordEntity.getValidate());
                RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = c4365f0NewBuilder.f5492k;
                if (repeatedFieldBuilderV32 == null) {
                    c4365f0NewBuilder.m3734h();
                    c4365f0NewBuilder.f5491j.add(c4369h0NewBuilder2.build());
                    c4365f0NewBuilder.onChanged();
                } else {
                    repeatedFieldBuilderV32.addMessage(c4369h0NewBuilder2.build());
                }
            }
        }
        for (TouchRecordEntity touchRecordEntity : target.getTouchList()) {
            AbstractC3387g.m2338a("页面SourceSave: 开始保存touch文件-> touch:" + touchRecordEntity.getFileName());
            if (!touchRecordEntity.getTouchEventList().isEmpty()) {
                SourceSave sourceSave3 = INSTANCE;
                AbstractC5830k.m5329f(pagePath, "pagePath");
                sourceSave3.saveTouch(pagePath, touchRecordEntity);
                AbstractC3387g.m2338a("页面SourceSave: saveRouter-> touch:" + touchRecordEntity.getFileName() + ", validate:" + touchRecordEntity.getValidate());
                C4369h0 c4369h0NewBuilder3 = EzyRouterRecord$RouterRecord.SourceCommandRecord.newBuilder();
                c4369h0NewBuilder3.m3752i(touchRecordEntity.getFileName());
                c4369h0NewBuilder3.m3753j(touchRecordEntity.getValidate());
                RepeatedFieldBuilderV3 repeatedFieldBuilderV33 = c4365f0NewBuilder.f5488g;
                if (repeatedFieldBuilderV33 == null) {
                    c4365f0NewBuilder.m3738l();
                    c4365f0NewBuilder.f5487f.add(c4369h0NewBuilder3.build());
                    c4365f0NewBuilder.onChanged();
                } else {
                    repeatedFieldBuilderV33.addMessage(c4369h0NewBuilder3.build());
                }
            }
        }
        for (MatrixRecordEntity matrixRecordEntity : target.getMatrixList()) {
            AbstractC3387g.m2338a("页面SourceSave: 开始保存矩阵文件-> matrix:" + matrixRecordEntity.getFileName());
            if (!matrixRecordEntity.getMatrixEventEntity().isEmpty()) {
                SourceSave sourceSave4 = INSTANCE;
                AbstractC5830k.m5329f(pagePath, "pagePath");
                sourceSave4.saveMatrix(pagePath, matrixRecordEntity);
                AbstractC3387g.m2338a("页面SourceSave: saveRouter-> matrix:" + matrixRecordEntity.getFileName() + ", validate:" + matrixRecordEntity.getValidate());
                C4369h0 c4369h0NewBuilder4 = EzyRouterRecord$RouterRecord.SourceCommandRecord.newBuilder();
                c4369h0NewBuilder4.m3752i(matrixRecordEntity.getFileName());
                c4369h0NewBuilder4.m3753j(matrixRecordEntity.getValidate());
                RepeatedFieldBuilderV3 repeatedFieldBuilderV34 = c4365f0NewBuilder.f5490i;
                if (repeatedFieldBuilderV34 == null) {
                    c4365f0NewBuilder.m3736j();
                    c4365f0NewBuilder.f5489h.add(c4369h0NewBuilder4.build());
                    c4365f0NewBuilder.onChanged();
                } else {
                    repeatedFieldBuilderV34.addMessage(c4369h0NewBuilder4.build());
                }
            }
        }
        for (AudioRecordEntity audioRecordEntity : target.getAudioList()) {
            AbstractC3387g.m2338a("页面SourceSave: 开始保存音频文件-> audio:" + audioRecordEntity.getFileName());
            if (!audioRecordEntity.getAudioInfoEntity().isEmpty()) {
                SourceSave sourceSave5 = INSTANCE;
                AbstractC5830k.m5329f(pagePath, "pagePath");
                sourceSave5.saveAudio(pagePath, audioRecordEntity);
                AbstractC3387g.m2338a("页面SourceSave: saveRouter-> audio:" + audioRecordEntity.getFileName() + ", validate:" + audioRecordEntity.getValidate());
                C4369h0 c4369h0NewBuilder5 = EzyRouterRecord$RouterRecord.SourceCommandRecord.newBuilder();
                c4369h0NewBuilder5.m3752i(audioRecordEntity.getFileName());
                c4369h0NewBuilder5.m3753j(audioRecordEntity.getValidate());
                RepeatedFieldBuilderV3 repeatedFieldBuilderV35 = c4365f0NewBuilder.f5486e;
                if (repeatedFieldBuilderV35 == null) {
                    c4365f0NewBuilder.m3732f();
                    c4365f0NewBuilder.f5485d.add(c4369h0NewBuilder5.build());
                    c4365f0NewBuilder.onChanged();
                } else {
                    repeatedFieldBuilderV35.addMessage(c4369h0NewBuilder5.build());
                }
            }
        }
        for (TextRecordEntity textRecordEntity : target.getTextList()) {
            AbstractC3387g.m2338a("页面SourceSave: 开始保存text文件,saveRouter-> text:" + textRecordEntity.getFileName());
            if (!textRecordEntity.getTextInfoEntityList().isEmpty()) {
                SourceSave sourceSave6 = INSTANCE;
                AbstractC5830k.m5329f(pagePath, "pagePath");
                sourceSave6.saveText(pagePath, textRecordEntity);
                AbstractC3387g.m2338a("页面SourceSave: saveRouter-> text:" + textRecordEntity.getFileName() + ", validate:" + textRecordEntity.getValidate());
                C4369h0 c4369h0NewBuilder6 = EzyRouterRecord$RouterRecord.SourceCommandRecord.newBuilder();
                c4369h0NewBuilder6.m3752i(textRecordEntity.getFileName());
                c4369h0NewBuilder6.m3753j(textRecordEntity.getValidate());
                RepeatedFieldBuilderV3 repeatedFieldBuilderV36 = c4365f0NewBuilder.f5494m;
                if (repeatedFieldBuilderV36 == null) {
                    c4365f0NewBuilder.m3737k();
                    c4365f0NewBuilder.f5493l.add(c4369h0NewBuilder6.build());
                    c4365f0NewBuilder.onChanged();
                } else {
                    repeatedFieldBuilderV36.addMessage(c4369h0NewBuilder6.build());
                }
            }
        }
        for (GeometryRecordEntity geometryRecordEntity : target.getGeometryList()) {
            AbstractC3387g.m2338a("页面SourceSave: 开始保存geometryList文件，saveRouter-> geometry:" + geometryRecordEntity.getFileName());
            if (!geometryRecordEntity.getGeometryInfoEntityList().isEmpty()) {
                SourceSave sourceSave7 = INSTANCE;
                AbstractC5830k.m5329f(pagePath, "pagePath");
                sourceSave7.saveGeometry(pagePath, geometryRecordEntity);
                AbstractC3387g.m2338a("页面SourceSave: saveRouter-> geometry:" + geometryRecordEntity.getFileName() + ", validate:" + geometryRecordEntity.getValidate());
                C4369h0 c4369h0NewBuilder7 = EzyRouterRecord$RouterRecord.SourceCommandRecord.newBuilder();
                c4369h0NewBuilder7.m3752i(geometryRecordEntity.getFileName());
                c4369h0NewBuilder7.m3753j(geometryRecordEntity.getValidate());
                RepeatedFieldBuilderV3 repeatedFieldBuilderV37 = c4365f0NewBuilder.f5496o;
                if (repeatedFieldBuilderV37 == null) {
                    c4365f0NewBuilder.m3735i();
                    c4365f0NewBuilder.f5495n.add(c4369h0NewBuilder7.build());
                    c4365f0NewBuilder.onChanged();
                } else {
                    repeatedFieldBuilderV37.addMessage(c4369h0NewBuilder7.build());
                }
            }
        }
        FileUtils fileUtils = FileUtils.INSTANCE;
        AbstractC5830k.m5329f(pagePath, "pagePath");
        EzyRouterRecord$RouterRecord ezyRouterRecord$RouterRecordM3730c = c4365f0NewBuilder.buildPartial();
        if (!ezyRouterRecord$RouterRecordM3730c.isInitialized()) {
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) ezyRouterRecord$RouterRecordM3730c);
        }
        fileUtils.saveToFile(pagePath, ROUTER_FILE_NAME, ezyRouterRecord$RouterRecordM3730c);
    }

    public final void saveText(@NotNull String pagePath, @NotNull TextRecordEntity record) throws Throwable {
        String fileSignature;
        AbstractC5830k.m5330g(pagePath, "pagePath");
        AbstractC5830k.m5330g(record, "record");
        C4389r0 c4389r0NewBuilder = EzySource$TextSource.newBuilder();
        for (TextInfoEntity textInfoEntity : record.getTextInfoEntityList()) {
            C4393t0 c4393t0NewBuilder = EzySource$TextSource.TextInfo.newBuilder();
            String content = textInfoEntity.getContent();
            c4393t0NewBuilder.getClass();
            content.getClass();
            c4393t0NewBuilder.f5580b = content;
            c4393t0NewBuilder.f5579a |= 1;
            c4393t0NewBuilder.onChanged();
            C3157p0 c3157p0NewBuilder = EzyPaint$Paint.newBuilder();
            c3157p0NewBuilder.m2103i(textInfoEntity.getColor());
            c3157p0NewBuilder.m2108n(textInfoEntity.getWidth());
            c3157p0NewBuilder.m2107m(textInfoEntity.getTextSize());
            c3157p0NewBuilder.m2106l(textInfoEntity.getStyle());
            EzyPaint$Paint ezyPaint$PaintM2098c = c3157p0NewBuilder.build();
            SingleFieldBuilderV3 singleFieldBuilderV3 = c4393t0NewBuilder.f5582d;
            if (singleFieldBuilderV3 == null) {
                c4393t0NewBuilder.f5581c = ezyPaint$PaintM2098c;
            } else {
                singleFieldBuilderV3.setMessage(ezyPaint$PaintM2098c);
            }
            c4393t0NewBuilder.f5579a |= 2;
            c4393t0NewBuilder.onChanged();
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = c4389r0NewBuilder.f5569c;
            if (repeatedFieldBuilderV3 == null) {
                c4389r0NewBuilder.m3824f();
                c4389r0NewBuilder.f5568b.add(c4393t0NewBuilder.build());
                c4389r0NewBuilder.onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(c4393t0NewBuilder.build());
            }
        }
        RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = c4389r0NewBuilder.f5569c;
        if ((repeatedFieldBuilderV32 == null ? c4389r0NewBuilder.f5568b.size() : repeatedFieldBuilderV32.getCount()) <= 0) {
            AbstractC3387g.m2342e("[SourceSave]: saveText-> [" + record.getFileName() + "]textInfoCount==0");
            return;
        }
        FileUtils fileUtils = FileUtils.INSTANCE;
        String fileName = record.getFileName();
        EzySource$TextSource ezySource$TextSourceM3822c = c4389r0NewBuilder.buildPartial();
        if (!ezySource$TextSourceM3822c.isInitialized()) {
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) ezySource$TextSourceM3822c);
        }
        File fileSaveToFile = fileUtils.saveToFile(pagePath, fileName, ezySource$TextSourceM3822c);
        if (fileSaveToFile == null || (fileSignature = FileValidateUtils.INSTANCE.getFileSignature(fileSaveToFile, FileValidateUtils.TypeEnum.SHA256)) == null) {
            return;
        }
        record.setValidate(fileSignature);
    }

    public final void saveTouch(@NotNull String pagePath, @NotNull TouchRecordEntity record) throws Throwable {
        String fileSignature;
        AbstractC5830k.m5330g(pagePath, "pagePath");
        AbstractC5830k.m5330g(record, "record");
        C4395u0 c4395u0NewBuilder = EzySource$TouchSource.newBuilder();
        for (TouchEventEntity touchEventEntity : record.getTouchEventList()) {
            C4399w0 c4399w0NewBuilder = EzySource$TouchSource.TouchInfo.newBuilder();
            C3157p0 c3157p0NewBuilder = EzyPaint$Paint.newBuilder();
            c3157p0NewBuilder.m2108n(touchEventEntity.getWidth());
            c3157p0NewBuilder.m2103i(touchEventEntity.getColor());
            c3157p0NewBuilder.m2105k(touchEventEntity.getSpacing());
            c3157p0NewBuilder.m2104j(touchEventEntity.getItemLength());
            c3157p0NewBuilder.m2106l(touchEventEntity.getStyle());
            c3157p0NewBuilder.m2107m(touchEventEntity.getTextSize());
            EzyPaint$Paint ezyPaint$PaintM2098c = c3157p0NewBuilder.build();
            SingleFieldBuilderV3 singleFieldBuilderV3 = c4399w0NewBuilder.f5593e;
            if (singleFieldBuilderV3 == null) {
                c4399w0NewBuilder.f5592d = ezyPaint$PaintM2098c;
            } else {
                singleFieldBuilderV3.setMessage(ezyPaint$PaintM2098c);
            }
            c4399w0NewBuilder.f5589a |= 2;
            c4399w0NewBuilder.onChanged();
            for (TouchInfoEntity touchInfoEntity : touchEventEntity.getTouchInfoList()) {
                C4401x0 c4401x0NewBuilder = EzyTouchEvent$TouchEvent.newBuilder();
                c4401x0NewBuilder.m3871j(touchInfoEntity.getX());
                c4401x0NewBuilder.m3872k(touchInfoEntity.getY());
                c4401x0NewBuilder.m3870i(touchInfoEntity.getEventTime());
                EzyTouchEvent$TouchEvent ezyTouchEvent$TouchEventM3865c = c4401x0NewBuilder.build();
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = c4399w0NewBuilder.f5591c;
                if (repeatedFieldBuilderV3 == null) {
                    c4399w0NewBuilder.ensureTouchEventIsMutable();
                    c4399w0NewBuilder.f5590b.add(ezyTouchEvent$TouchEventM3865c);
                    c4399w0NewBuilder.onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(ezyTouchEvent$TouchEventM3865c);
                }
            }
            RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = c4395u0NewBuilder.f5585c;
            if (repeatedFieldBuilderV32 == null) {
                c4395u0NewBuilder.m3844f();
                c4395u0NewBuilder.f5584b.add(c4399w0NewBuilder.build());
                c4395u0NewBuilder.onChanged();
            } else {
                repeatedFieldBuilderV32.addMessage(c4399w0NewBuilder.build());
            }
        }
        RepeatedFieldBuilderV3 repeatedFieldBuilderV33 = c4395u0NewBuilder.f5585c;
        if ((repeatedFieldBuilderV33 == null ? c4395u0NewBuilder.f5584b.size() : repeatedFieldBuilderV33.getCount()) <= 0) {
            AbstractC3387g.m2342e("[SourceSave]: saveTouch-> [" + record.getFileName() + "]touchInfoCount==0");
            return;
        }
        FileUtils fileUtils = FileUtils.INSTANCE;
        String fileName = record.getFileName();
        EzySource$TouchSource ezySource$TouchSourceM3842c = c4395u0NewBuilder.buildPartial();
        if (!ezySource$TouchSourceM3842c.isInitialized()) {
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) ezySource$TouchSourceM3842c);
        }
        File fileSaveToFile = fileUtils.saveToFile(pagePath, fileName, ezySource$TouchSourceM3842c);
        if (fileSaveToFile == null || (fileSignature = FileValidateUtils.INSTANCE.getFileSignature(fileSaveToFile, FileValidateUtils.TypeEnum.SHA256)) == null) {
            return;
        }
        record.setValidate(fileSignature);
    }

    // RE: 这个保存入口把完整 Header、快照和分片留在各页目录。根目录只写 page_router.bin。
    public final void saveRecord(@NotNull BlackBoardEntity boardEntity, @NotNull List<String> pagePathList) {
        AbstractC5830k.m5330g(boardEntity, "boardEntity");
        AbstractC5830k.m5330g(pagePathList, "pagePathList");
        String dir = boardEntity.getDir();
        if (dir == null) {
            return;
        }
        C4402y c4402yNewBuilder = EzyPageRouter$PageRouter.newBuilder();
        int i = 0;
        for (PageEntity pageEntity : boardEntity.getPages()) {
            int i8 = i + 1;
            if (i >= 0) {
                PageEntity pageEntity2 = pageEntity;
                StringBuilder sbM94s = AbstractC0037f.m94s(i, "页面SourceSave: saveRecord-> 第", "条 => ");
                sbM94s.append(pageEntity2.getDirName());
                sbM94s.append("开始执行保存操作");
                AbstractC3387g.m2338a(sbM94s.toString());
                if (pagePathList.contains(pageEntity2.getDirName())) {
                    C4352a0 c4352a0NewBuilder = EzyPageRouter$PageRouter.PageInfo.newBuilder();
                    c4352a0NewBuilder.f5445c = i;
                    c4352a0NewBuilder.f5443a |= 2;
                    c4352a0NewBuilder.onChanged();
                    String dirName = pageEntity2.getDirName();
                    dirName.getClass();
                    c4352a0NewBuilder.f5444b = dirName;
                    c4352a0NewBuilder.f5443a |= 1;
                    c4352a0NewBuilder.onChanged();
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = c4402yNewBuilder.f5612c;
                    if (repeatedFieldBuilderV3 == null) {
                        c4402yNewBuilder.m3875f();
                        c4402yNewBuilder.f5611b.add(c4352a0NewBuilder.build());
                        c4402yNewBuilder.onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(c4352a0NewBuilder.build());
                    }
                    SourceSave sourceSave = INSTANCE;
                    sourceSave.saveHeader(pageEntity2, dir);
                    sourceSave.saveRouter(pageEntity2, dir);
                    StringBuilder sbM94s2 = AbstractC0037f.m94s(i, "页面SourceSave: saveRecord-> 第", "条 => ");
                    sbM94s2.append(pageEntity2.getDirName());
                    sbM94s2.append(" 结束");
                    AbstractC3387g.m2338a(sbM94s2.toString());
                }
                i = i8;
            } else {
                AbstractC5806u.m5258L();
                throw null;
            }
        }
        FileUtils fileUtils = FileUtils.INSTANCE;
        EzyPageRouter$PageRouter ezyPageRouter$PageRouterM3873c = c4402yNewBuilder.buildPartial();
        if (ezyPageRouter$PageRouterM3873c.isInitialized()) {
            fileUtils.saveToFile(dir, PAGE_ROUTER_FILE_NAME, ezyPageRouter$PageRouterM3873c);
            AbstractC3387g.m2338a("页面SourceSave: saveRecord-> 结束,page_route.bin文件保存结束");
            return;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) ezyPageRouter$PageRouterM3873c);
    }
}
