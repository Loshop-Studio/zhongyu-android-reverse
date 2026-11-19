package com.zykj.blackboard.core.data.dao;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.board.EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;
import io.objectbox.converter.PropertyConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m5110d2 = {"Lcom/zykj/blackboard/core/data/dao/BackgroundLineTypeEnumConverter;", "Lio/objectbox/converter/PropertyConverter;", "Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;", "", "()V", "convertToDatabaseValue", "entityProperty", "(Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;)Ljava/lang/Integer;", "convertToEntityProperty", "databaseValue", "(Ljava/lang/Integer;)Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class BackgroundLineTypeEnumConverter implements PropertyConverter<EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum, Integer> {
    @Override // io.objectbox.converter.PropertyConverter
    @NotNull
    public Integer convertToDatabaseValue(@Nullable EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum entityProperty) {
        return Integer.valueOf(entityProperty != null ? entityProperty.getNumber() : 0);
    }

    @Override // io.objectbox.converter.PropertyConverter
    @NotNull
    public EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum convertToEntityProperty(@Nullable Integer databaseValue) {
        EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum ezyBackgroundLineTypeEnum$BackgroundLineTypeEnumForNumber = EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum.forNumber(databaseValue != null ? databaseValue.intValue() : 0);
        AbstractC5830k.m5329f(ezyBackgroundLineTypeEnum$BackgroundLineTypeEnumForNumber, "forNumber(databaseValue ?: 0)");
        return ezyBackgroundLineTypeEnum$BackgroundLineTypeEnumForNumber;
    }
}
