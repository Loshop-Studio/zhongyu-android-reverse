package com.zykj.blackboard.utils;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.bean.Author;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.bean.MoveActionConfig;
import com.zykj.blackboard.core.data.dao.AuthorEntity;
import com.zykj.blackboard.core.data.dao.BackgroundLineConfigEntity;
import com.zykj.blackboard.core.data.dao.MoveConfigEntity;
import com.zykj.board.EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;
import com.zykj.board.EzyHeader$BackgroundLineConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p020b4.C3162r;

@Metadata(m5109d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0006\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\t\u001a\n\u0010\u0007\u001a\u00020\u0005*\u00020\u0004\u001a\n\u0010\u0007\u001a\u00020\n*\u00020\u000b\u001a\n\u0010\f\u001a\u00020\u0002*\u00020\u0001\u001a\n\u0010\r\u001a\u00020\u0006*\u00020\u0004¨\u0006\u000e"}, m5110d2 = {"toBackgroundLineTypeEnum", "Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;", "Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;", "toConfig", "Lcom/zykj/blackboard/bean/BackgroundLineConfig;", "Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;", "Lcom/zykj/board/EzyHeader$BackgroundLineConfig;", "toEntity", "Lcom/zykj/blackboard/core/data/dao/AuthorEntity;", "Lcom/zykj/blackboard/bean/Author;", "Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;", "Lcom/zykj/blackboard/bean/MoveActionConfig;", "toEzyBackgroundLineTypeEnum", "toEzyConfig", "blackboard_release"}, m5111k = 2, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class ConvertExtKt {
    @NotNull
    public static final BackgroundLineConfig.BackgroundLineType toBackgroundLineTypeEnum(@NotNull EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum ezyBackgroundLineTypeEnum$BackgroundLineTypeEnum) {
        AbstractC5830k.m5330g(ezyBackgroundLineTypeEnum$BackgroundLineTypeEnum, "<this>");
        return BackgroundLineConfig.BackgroundLineType.values()[ezyBackgroundLineTypeEnum$BackgroundLineTypeEnum.getNumber()];
    }

    @NotNull
    public static final BackgroundLineConfig toConfig(@NotNull BackgroundLineConfigEntity backgroundLineConfigEntity) {
        AbstractC5830k.m5330g(backgroundLineConfigEntity, "<this>");
        return new BackgroundLineConfig(backgroundLineConfigEntity.getLineColor(), backgroundLineConfigEntity.getLineSpace(), toBackgroundLineTypeEnum(backgroundLineConfigEntity.getLineType()), backgroundLineConfigEntity.getLineWidth());
    }

    @NotNull
    public static final MoveConfigEntity toEntity(@NotNull MoveActionConfig moveActionConfig) {
        AbstractC5830k.m5330g(moveActionConfig, "<this>");
        return new MoveConfigEntity(0L, moveActionConfig.isMoveActionEnable(), moveActionConfig.getVerticalTranslate(), moveActionConfig.getHorizontalTranslate(), moveActionConfig.getScale(), moveActionConfig.getRotate(), moveActionConfig.getMaxHeightTimes(), moveActionConfig.getMaxWidthTimes(), 1, null);
    }

    @NotNull
    public static final EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum toEzyBackgroundLineTypeEnum(@NotNull BackgroundLineConfig.BackgroundLineType backgroundLineType) {
        AbstractC5830k.m5330g(backgroundLineType, "<this>");
        EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum ezyBackgroundLineTypeEnum$BackgroundLineTypeEnumForNumber = EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum.forNumber(backgroundLineType.ordinal());
        AbstractC5830k.m5329f(ezyBackgroundLineTypeEnum$BackgroundLineTypeEnumForNumber, "forNumber(ordinal)");
        return ezyBackgroundLineTypeEnum$BackgroundLineTypeEnumForNumber;
    }

    @NotNull
    public static final EzyHeader$BackgroundLineConfig toEzyConfig(@NotNull BackgroundLineConfig backgroundLineConfig) {
        AbstractC5830k.m5330g(backgroundLineConfig, "<this>");
        C3162r c3162rNewBuilder = EzyHeader$BackgroundLineConfig.newBuilder();
        c3162rNewBuilder.f1640c = backgroundLineConfig.getLineSpace();
        c3162rNewBuilder.f1638a |= 2;
        c3162rNewBuilder.onChanged();
        c3162rNewBuilder.f1639b = backgroundLineConfig.getLineColor();
        c3162rNewBuilder.f1638a |= 1;
        c3162rNewBuilder.onChanged();
        c3162rNewBuilder.f1642e = backgroundLineConfig.getLineWidth();
        c3162rNewBuilder.f1638a |= 8;
        c3162rNewBuilder.onChanged();
        EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum ezyBackgroundLineTypeEnum = toEzyBackgroundLineTypeEnum(backgroundLineConfig.getLineType());
        ezyBackgroundLineTypeEnum.getClass();
        c3162rNewBuilder.f1638a |= 4;
        c3162rNewBuilder.f1641d = ezyBackgroundLineTypeEnum.getNumber();
        c3162rNewBuilder.onChanged();
        return c3162rNewBuilder.build();
    }

    @NotNull
    public static final BackgroundLineConfig toConfig(@NotNull EzyHeader$BackgroundLineConfig ezyHeader$BackgroundLineConfig) {
        AbstractC5830k.m5330g(ezyHeader$BackgroundLineConfig, "<this>");
        int lineColor = ezyHeader$BackgroundLineConfig.getLineColor();
        float lineSpace = ezyHeader$BackgroundLineConfig.getLineSpace();
        EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum lineType = ezyHeader$BackgroundLineConfig.getLineType();
        AbstractC5830k.m5329f(lineType, "lineType");
        return new BackgroundLineConfig(lineColor, lineSpace, toBackgroundLineTypeEnum(lineType), ezyHeader$BackgroundLineConfig.getLineWidth());
    }

    @NotNull
    public static final BackgroundLineConfigEntity toEntity(@NotNull BackgroundLineConfig backgroundLineConfig) {
        AbstractC5830k.m5330g(backgroundLineConfig, "<this>");
        return new BackgroundLineConfigEntity(0L, backgroundLineConfig.getLineColor(), backgroundLineConfig.getLineSpace(), toEzyBackgroundLineTypeEnum(backgroundLineConfig.getLineType()), backgroundLineConfig.getLineWidth(), 1, null);
    }

    @NotNull
    public static final AuthorEntity toEntity(@NotNull Author author) {
        AbstractC5830k.m5330g(author, "<this>");
        return new AuthorEntity(0L, author.getAuthorName(), author.getAuthorId(), author.getSchoolId(), null, null, null, 113, null);
    }
}
