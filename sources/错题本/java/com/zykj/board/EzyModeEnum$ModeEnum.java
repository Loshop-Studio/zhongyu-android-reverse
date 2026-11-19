package com.zykj.board;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import p020b4.AbstractC3127f0;
import p020b4.C3124e0;

/* loaded from: classes3.dex */
public enum EzyModeEnum$ModeEnum implements ProtocolMessageEnum {
    ACTION_SELECT(0),
    ACTION_WRITING(1),
    ACTION_WRITING_MOVE(2),
    ACTION_WRITING_BEELINE(3),
    ACTION_ERASER_WRITING(4),
    ACTION_DELETE(5),
    ACTION_SEE(6),
    ACTION_TEXT(7),
    ACTION_CURSOR(8),
    ACTION_NEW_SELECT(9),
    ACTION_GEOMETRY(10),
    UNRECOGNIZED(-1);

    public static final int ACTION_CURSOR_VALUE = 8;
    public static final int ACTION_DELETE_VALUE = 5;
    public static final int ACTION_ERASER_WRITING_VALUE = 4;
    public static final int ACTION_GEOMETRY_VALUE = 10;
    public static final int ACTION_NEW_SELECT_VALUE = 9;
    public static final int ACTION_SEE_VALUE = 6;
    public static final int ACTION_SELECT_VALUE = 0;
    public static final int ACTION_TEXT_VALUE = 7;
    public static final int ACTION_WRITING_BEELINE_VALUE = 3;
    public static final int ACTION_WRITING_MOVE_VALUE = 2;
    public static final int ACTION_WRITING_VALUE = 1;

    /* renamed from: a */
    public static final C3124e0 f5381a = new C3124e0();

    /* renamed from: b */
    public static final EzyModeEnum$ModeEnum[] f5382b = values();
    private final int value;

    EzyModeEnum$ModeEnum(int i) {
        this.value = i;
    }

    public static EzyModeEnum$ModeEnum forNumber(int i) {
        switch (i) {
            case 0:
                return ACTION_SELECT;
            case 1:
                return ACTION_WRITING;
            case 2:
                return ACTION_WRITING_MOVE;
            case 3:
                return ACTION_WRITING_BEELINE;
            case 4:
                return ACTION_ERASER_WRITING;
            case 5:
                return ACTION_DELETE;
            case 6:
                return ACTION_SEE;
            case 7:
                return ACTION_TEXT;
            case 8:
                return ACTION_CURSOR;
            case 9:
                return ACTION_NEW_SELECT;
            case 10:
                return ACTION_GEOMETRY;
            default:
                return null;
        }
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return AbstractC3127f0.f1605a.getEnumTypes().get(0);
    }

    public static Internal.EnumLiteMap<EzyModeEnum$ModeEnum> internalGetValueMap() {
        return f5381a;
    }

    @Override // com.google.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return getDescriptor();
    }

    @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // com.google.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        if (this != UNRECOGNIZED) {
            return getDescriptor().getValues().get(ordinal());
        }
        throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
    }

    @Deprecated
    public static EzyModeEnum$ModeEnum valueOf(int i) {
        return forNumber(i);
    }

    public static EzyModeEnum$ModeEnum valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return f5382b[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
