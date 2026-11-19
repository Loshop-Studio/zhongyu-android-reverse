package com.zykj.board;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import p020b4.AbstractC3140j1;
import p020b4.C3137i1;

/* loaded from: classes3.dex */
public enum EzyScaleTypeEnum$ScaleTypeEnum implements ProtocolMessageEnum {
    MODE_MAX_WIDTH(0),
    MODE_MAX_HEIGHT(1),
    MODE_MAX_VALUE(2),
    MODE_MIN_VALUE(3),
    MODE_ADAPTER(4),
    MODE_ADAPTER_8(5),
    MODE_MATRIX_HEIGHT(6),
    UNRECOGNIZED(-1);

    public static final int MODE_ADAPTER_8_VALUE = 5;
    public static final int MODE_ADAPTER_VALUE = 4;
    public static final int MODE_MATRIX_HEIGHT_VALUE = 6;
    public static final int MODE_MAX_HEIGHT_VALUE = 1;
    public static final int MODE_MAX_VALUE_VALUE = 2;
    public static final int MODE_MAX_WIDTH_VALUE = 0;
    public static final int MODE_MIN_VALUE_VALUE = 3;

    /* renamed from: a */
    public static final C3137i1 f5407a = new C3137i1();

    /* renamed from: b */
    public static final EzyScaleTypeEnum$ScaleTypeEnum[] f5408b = values();
    private final int value;

    EzyScaleTypeEnum$ScaleTypeEnum(int i) {
        this.value = i;
    }

    public static EzyScaleTypeEnum$ScaleTypeEnum forNumber(int i) {
        switch (i) {
            case 0:
                return MODE_MAX_WIDTH;
            case 1:
                return MODE_MAX_HEIGHT;
            case 2:
                return MODE_MAX_VALUE;
            case 3:
                return MODE_MIN_VALUE;
            case 4:
                return MODE_ADAPTER;
            case 5:
                return MODE_ADAPTER_8;
            case 6:
                return MODE_MATRIX_HEIGHT;
            default:
                return null;
        }
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return AbstractC3140j1.f1617a.getEnumTypes().get(0);
    }

    public static Internal.EnumLiteMap<EzyScaleTypeEnum$ScaleTypeEnum> internalGetValueMap() {
        return f5407a;
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
    public static EzyScaleTypeEnum$ScaleTypeEnum valueOf(int i) {
        return forNumber(i);
    }

    public static EzyScaleTypeEnum$ScaleTypeEnum valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return f5408b[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
