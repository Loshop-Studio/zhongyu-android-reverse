package com.zykj.board;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import p020b4.AbstractC3114b;
import p020b4.C3110a;

/* loaded from: classes3.dex */
public enum EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum implements ProtocolMessageEnum {
    HORIZONTAL(0),
    STAGGERED(1),
    UNRECOGNIZED(-1);

    public static final int HORIZONTAL_VALUE = 0;
    public static final int STAGGERED_VALUE = 1;

    /* renamed from: a */
    public static final C3110a f5335a = new C3110a();

    /* renamed from: b */
    public static final EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum[] f5336b = values();
    private final int value;

    EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum(int i) {
        this.value = i;
    }

    public static EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum forNumber(int i) {
        if (i == 0) {
            return HORIZONTAL;
        }
        if (i != 1) {
            return null;
        }
        return STAGGERED;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return AbstractC3114b.f1558a.getEnumTypes().get(0);
    }

    public static Internal.EnumLiteMap<EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum> internalGetValueMap() {
        return f5335a;
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
    public static EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum valueOf(int i) {
        return forNumber(i);
    }

    public static EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return f5336b[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
