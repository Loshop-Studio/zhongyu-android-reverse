package com.zykj.blackboard.core.data.dao;

import com.zykj.board.EzyBackgroundLineTypeEnum;
import io.objectbox.converter.PropertyConverter;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class BackgroundLineTypeEnumConverter implements PropertyConverter<EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum, Integer> {
    @Override // io.objectbox.converter.PropertyConverter
    public Integer convertToDatabaseValue(EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum backgroundLineTypeEnum) {
        return Integer.valueOf(backgroundLineTypeEnum != null ? backgroundLineTypeEnum.getNumber() : 0);
    }

    @Override // io.objectbox.converter.PropertyConverter
    public EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum convertToEntityProperty(Integer num) {
        EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum backgroundLineTypeEnumM7398a = EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum.m7398a(num != null ? num.intValue() : 0);
        AbstractC9133u.m16132f(backgroundLineTypeEnumM7398a, "forNumber(databaseValue ?: 0)");
        return backgroundLineTypeEnumM7398a;
    }
}
