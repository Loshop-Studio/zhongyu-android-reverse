package com.zykj.board;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import p020b4.AbstractC3144l;
import p020b4.C3141k;

/* loaded from: classes3.dex */
public enum EzyGraphEnum$GraphEnum implements ProtocolMessageEnum {
    BOUNDED_CONTAINER_GRAPH(0),
    GROUP_GRAPH(1),
    IMAGE_GRAPH(2),
    STROKE_GRAPH(3),
    BEELINE_STROKE_GRAPH(4),
    TEXT_GRAPH(5),
    GEOMETRY_GRAPH(6),
    UNRECOGNIZED(-1);

    public static final int BEELINE_STROKE_GRAPH_VALUE = 4;
    public static final int BOUNDED_CONTAINER_GRAPH_VALUE = 0;
    public static final int GEOMETRY_GRAPH_VALUE = 6;
    public static final int GROUP_GRAPH_VALUE = 1;
    public static final int IMAGE_GRAPH_VALUE = 2;
    public static final int STROKE_GRAPH_VALUE = 3;
    public static final int TEXT_GRAPH_VALUE = 5;

    /* renamed from: a */
    public static final C3141k f5368a = new C3141k();

    /* renamed from: b */
    public static final EzyGraphEnum$GraphEnum[] f5369b = values();
    private final int value;

    EzyGraphEnum$GraphEnum(int i) {
        this.value = i;
    }

    public static EzyGraphEnum$GraphEnum forNumber(int i) {
        switch (i) {
            case 0:
                return BOUNDED_CONTAINER_GRAPH;
            case 1:
                return GROUP_GRAPH;
            case 2:
                return IMAGE_GRAPH;
            case 3:
                return STROKE_GRAPH;
            case 4:
                return BEELINE_STROKE_GRAPH;
            case 5:
                return TEXT_GRAPH;
            case 6:
                return GEOMETRY_GRAPH;
            default:
                return null;
        }
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return AbstractC3144l.f1618a.getEnumTypes().get(0);
    }

    public static Internal.EnumLiteMap<EzyGraphEnum$GraphEnum> internalGetValueMap() {
        return f5368a;
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
    public static EzyGraphEnum$GraphEnum valueOf(int i) {
        return forNumber(i);
    }

    public static EzyGraphEnum$GraphEnum valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return f5369b[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
