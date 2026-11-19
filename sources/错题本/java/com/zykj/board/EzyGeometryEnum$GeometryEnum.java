package com.zykj.board;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import p020b4.AbstractC3138j;
import p020b4.C3135i;

/* loaded from: classes3.dex */
public enum EzyGeometryEnum$GeometryEnum implements ProtocolMessageEnum {
    OVAL(0),
    POLYGON(1),
    UNRECOGNIZED(-1);

    public static final int OVAL_VALUE = 0;
    public static final int POLYGON_VALUE = 1;

    /* renamed from: a */
    public static final C3135i f5365a = new C3135i();

    /* renamed from: b */
    public static final EzyGeometryEnum$GeometryEnum[] f5366b = values();
    private final int value;

    EzyGeometryEnum$GeometryEnum(int i) {
        this.value = i;
    }

    public static EzyGeometryEnum$GeometryEnum forNumber(int i) {
        if (i == 0) {
            return OVAL;
        }
        if (i != 1) {
            return null;
        }
        return POLYGON;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return AbstractC3138j.f1611a.getEnumTypes().get(0);
    }

    public static Internal.EnumLiteMap<EzyGeometryEnum$GeometryEnum> internalGetValueMap() {
        return f5365a;
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
    public static EzyGeometryEnum$GeometryEnum valueOf(int i) {
        return forNumber(i);
    }

    public static EzyGeometryEnum$GeometryEnum valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return f5366b[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
