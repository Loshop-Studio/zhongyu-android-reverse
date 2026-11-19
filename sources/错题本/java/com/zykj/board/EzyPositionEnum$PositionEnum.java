package com.zykj.board;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import p020b4.AbstractC3184y0;
import p020b4.C3181x0;

/* loaded from: classes3.dex */
public enum EzyPositionEnum$PositionEnum implements ProtocolMessageEnum {
    TOP_LEFT(0),
    TOP_CENTER(1),
    TOP_RIGHT(2),
    CENTER_LEFT(3),
    CENTER(4),
    CENTER_RIGHT(5),
    BOTTOM_LEFT(6),
    BOTTOM_CENTER(7),
    BOTTOM_RIGHT(8),
    UNRECOGNIZED(-1);

    public static final int BOTTOM_CENTER_VALUE = 7;
    public static final int BOTTOM_LEFT_VALUE = 6;
    public static final int BOTTOM_RIGHT_VALUE = 8;
    public static final int CENTER_LEFT_VALUE = 3;
    public static final int CENTER_RIGHT_VALUE = 5;
    public static final int CENTER_VALUE = 4;
    public static final int TOP_CENTER_VALUE = 1;
    public static final int TOP_LEFT_VALUE = 0;
    public static final int TOP_RIGHT_VALUE = 2;

    /* renamed from: a */
    public static final C3181x0 f5398a = new C3181x0();

    /* renamed from: b */
    public static final EzyPositionEnum$PositionEnum[] f5399b = values();
    private final int value;

    EzyPositionEnum$PositionEnum(int i) {
        this.value = i;
    }

    public static EzyPositionEnum$PositionEnum forNumber(int i) {
        switch (i) {
            case 0:
                return TOP_LEFT;
            case 1:
                return TOP_CENTER;
            case 2:
                return TOP_RIGHT;
            case 3:
                return CENTER_LEFT;
            case 4:
                return CENTER;
            case 5:
                return CENTER_RIGHT;
            case 6:
                return BOTTOM_LEFT;
            case 7:
                return BOTTOM_CENTER;
            case 8:
                return BOTTOM_RIGHT;
            default:
                return null;
        }
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return AbstractC3184y0.f1709a.getEnumTypes().get(0);
    }

    public static Internal.EnumLiteMap<EzyPositionEnum$PositionEnum> internalGetValueMap() {
        return f5398a;
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
    public static EzyPositionEnum$PositionEnum valueOf(int i) {
        return forNumber(i);
    }

    public static EzyPositionEnum$PositionEnum valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return f5399b[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
