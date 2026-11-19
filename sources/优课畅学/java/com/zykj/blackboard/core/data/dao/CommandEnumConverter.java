package com.zykj.blackboard.core.data.dao;

import com.zykj.board.EzyCommandEnum;
import io.objectbox.converter.PropertyConverter;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class CommandEnumConverter implements PropertyConverter<EzyCommandEnum.CommandEnum, Integer> {
    @Override // io.objectbox.converter.PropertyConverter
    public Integer convertToDatabaseValue(EzyCommandEnum.CommandEnum commandEnum) {
        return Integer.valueOf(commandEnum != null ? commandEnum.getNumber() : 0);
    }

    @Override // io.objectbox.converter.PropertyConverter
    public EzyCommandEnum.CommandEnum convertToEntityProperty(Integer num) {
        EzyCommandEnum.CommandEnum commandEnumM7977a = EzyCommandEnum.CommandEnum.m7977a(num != null ? num.intValue() : 0);
        AbstractC9133u.m16132f(commandEnumM7977a, "forNumber(databaseValue ?: 0)");
        return commandEnumM7977a;
    }
}
