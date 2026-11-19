package com.zykj.blackboard.utils;

import com.tencent.smtt.sdk.TbsListener;
import com.zykj.blackboard.bean.Author;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.bean.MoveActionConfig;
import com.zykj.blackboard.core.data.dao.AuthorEntity;
import com.zykj.blackboard.core.data.dao.BackgroundLineConfigEntity;
import com.zykj.blackboard.core.data.dao.MoveConfigEntity;
import com.zykj.board.EzyBackgroundLineTypeEnum;
import com.zykj.board.EzyHeader;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class ConvertExtKt {
    public static final BackgroundLineConfig.BackgroundLineType toBackgroundLineTypeEnum(EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum backgroundLineTypeEnum) {
        AbstractC9133u.m16133g(backgroundLineTypeEnum, "<this>");
        return BackgroundLineConfig.BackgroundLineType.values()[backgroundLineTypeEnum.getNumber()];
    }

    public static final BackgroundLineConfig toConfig(BackgroundLineConfigEntity backgroundLineConfigEntity) {
        AbstractC9133u.m16133g(backgroundLineConfigEntity, "<this>");
        return new BackgroundLineConfig(backgroundLineConfigEntity.getLineColor(), backgroundLineConfigEntity.getLineSpace(), toBackgroundLineTypeEnum(backgroundLineConfigEntity.getLineType()), backgroundLineConfigEntity.getLineWidth());
    }

    public static final MoveConfigEntity toEntity(MoveActionConfig moveActionConfig) {
        AbstractC9133u.m16133g(moveActionConfig, "<this>");
        return new MoveConfigEntity(0L, moveActionConfig.isMoveActionEnable(), moveActionConfig.getVerticalTranslate(), moveActionConfig.getHorizontalTranslate(), moveActionConfig.getScale(), moveActionConfig.getRotate(), moveActionConfig.getMaxHeightTimes(), moveActionConfig.getMaxWidthTimes(), 1, null);
    }

    public static final EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum toEzyBackgroundLineTypeEnum(BackgroundLineConfig.BackgroundLineType backgroundLineType) {
        AbstractC9133u.m16133g(backgroundLineType, "<this>");
        EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum backgroundLineTypeEnumM7398a = EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum.m7398a(backgroundLineType.ordinal());
        AbstractC9133u.m16132f(backgroundLineTypeEnumM7398a, "forNumber(ordinal)");
        return backgroundLineTypeEnumM7398a;
    }

    public static final EzyHeader.BackgroundLineConfig toEzyConfig(BackgroundLineConfig backgroundLineConfig) {
        AbstractC9133u.m16133g(backgroundLineConfig, "<this>");
        EzyHeader.BackgroundLineConfig backgroundLineConfigBuild = EzyHeader.BackgroundLineConfig.m8047n().m8073s(backgroundLineConfig.getLineSpace()).m8072r(backgroundLineConfig.getLineColor()).m8076v(backgroundLineConfig.getLineWidth()).m8074t(toEzyBackgroundLineTypeEnum(backgroundLineConfig.getLineType())).build();
        AbstractC9133u.m16132f(backgroundLineConfigBuild, "newBuilder()\n        .se…eEnum())\n        .build()");
        return backgroundLineConfigBuild;
    }

    public static final BackgroundLineConfig toConfig(EzyHeader.BackgroundLineConfig backgroundLineConfig) {
        AbstractC9133u.m16133g(backgroundLineConfig, "<this>");
        int iM8049i = backgroundLineConfig.m8049i();
        float fM8050j = backgroundLineConfig.m8050j();
        EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum lineType = backgroundLineConfig.m8051k();
        AbstractC9133u.m16132f(lineType, "lineType");
        return new BackgroundLineConfig(iM8049i, fM8050j, toBackgroundLineTypeEnum(lineType), backgroundLineConfig.m8053m());
    }

    public static final BackgroundLineConfigEntity toEntity(BackgroundLineConfig backgroundLineConfig) {
        AbstractC9133u.m16133g(backgroundLineConfig, "<this>");
        return new BackgroundLineConfigEntity(0L, backgroundLineConfig.getLineColor(), backgroundLineConfig.getLineSpace(), toEzyBackgroundLineTypeEnum(backgroundLineConfig.getLineType()), backgroundLineConfig.getLineWidth(), 1, null);
    }

    public static final AuthorEntity toEntity(Author author) {
        AbstractC9133u.m16133g(author, "<this>");
        return new AuthorEntity(0L, author.getAuthorName(), author.getAuthorId(), author.getSchoolId(), null, null, null, TbsListener.ErrorCode.DOWNLOAD_FILE_CONTENTLENGTH_NOT_MATCH, null);
    }
}
