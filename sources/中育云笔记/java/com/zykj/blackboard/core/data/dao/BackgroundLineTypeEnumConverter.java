package com.zykj.blackboard.core.data.dao;

import com.zykj.board.EzyBackgroundLineTypeEnum;
import io.objectbox.converter.PropertyConverter;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes5.dex */
public final class BackgroundLineTypeEnumConverter implements PropertyConverter<EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum, Integer> {
    @Override // io.objectbox.converter.PropertyConverter
    public Integer convertToDatabaseValue(EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum backgroundLineTypeEnum) {
        return Integer.valueOf(backgroundLineTypeEnum != null ? backgroundLineTypeEnum.getNumber() : 0);
    }

    @Override // io.objectbox.converter.PropertyConverter
    public EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum convertToEntityProperty(Integer num) {
        EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum backgroundLineTypeEnumM14644a = EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum.m14644a(num != null ? num.intValue() : 0);
        AbstractC9979u.m20293f(backgroundLineTypeEnumM14644a, "forNumber(databaseValue ?: 0)");
        return backgroundLineTypeEnumM14644a;
    }
}
