package com.zykj.blackboard.core.data.dao;

import com.zykj.board.EzyCommandEnum;
import io.objectbox.converter.PropertyConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m13558d2 = {"Lcom/zykj/blackboard/core/data/dao/CommandEnumConverter;", "Lio/objectbox/converter/PropertyConverter;", "Lcom/zykj/board/EzyCommandEnum$CommandEnum;", "", "()V", "convertToDatabaseValue", "entityProperty", "(Lcom/zykj/board/EzyCommandEnum$CommandEnum;)Ljava/lang/Integer;", "convertToEntityProperty", "databaseValue", "(Ljava/lang/Integer;)Lcom/zykj/board/EzyCommandEnum$CommandEnum;", "blackboard_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes4.dex */
public final class CommandEnumConverter implements PropertyConverter<EzyCommandEnum.CommandEnum, Integer> {
    @Override // io.objectbox.converter.PropertyConverter
    public Integer convertToDatabaseValue(EzyCommandEnum.CommandEnum entityProperty) {
        return Integer.valueOf(entityProperty != null ? entityProperty.getNumber() : 0);
    }

    @Override // io.objectbox.converter.PropertyConverter
    public EzyCommandEnum.CommandEnum convertToEntityProperty(Integer databaseValue) {
        EzyCommandEnum.CommandEnum commandEnumM7480f = EzyCommandEnum.CommandEnum.m7480f(databaseValue != null ? databaseValue.intValue() : 0);
        Intrinsics.checkNotNullExpressionValue(commandEnumM7480f, "forNumber(databaseValue ?: 0)");
        return commandEnumM7480f;
    }
}
