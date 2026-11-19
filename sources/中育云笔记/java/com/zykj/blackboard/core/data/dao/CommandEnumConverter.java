package com.zykj.blackboard.core.data.dao;

import com.zykj.board.EzyCommandEnum;
import io.objectbox.converter.PropertyConverter;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes5.dex */
public final class CommandEnumConverter implements PropertyConverter<EzyCommandEnum.CommandEnum, Integer> {
    @Override // io.objectbox.converter.PropertyConverter
    public Integer convertToDatabaseValue(EzyCommandEnum.CommandEnum commandEnum) {
        return Integer.valueOf(commandEnum != null ? commandEnum.getNumber() : 0);
    }

    @Override // io.objectbox.converter.PropertyConverter
    public EzyCommandEnum.CommandEnum convertToEntityProperty(Integer num) {
        EzyCommandEnum.CommandEnum commandEnumM15218a = EzyCommandEnum.CommandEnum.m15218a(num != null ? num.intValue() : 0);
        AbstractC9979u.m20293f(commandEnumM15218a, "forNumber(databaseValue ?: 0)");
        return commandEnumM15218a;
    }
}
