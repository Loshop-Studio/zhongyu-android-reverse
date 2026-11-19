package com.zykj.board;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import p020b4.AbstractC3132h;
import p020b4.C3129g;

/* loaded from: classes3.dex */
public enum EzyCommandEnum$CommandEnum implements ProtocolMessageEnum {
    ACTION_DEFAULT(0),
    ACTION_GRAPH_ADD(1),
    ACTION_GRAPH_REMOVE(2),
    ACTION_GRAPH_MATRIX(3),
    ACTION_GRAPH_CHANGE(4),
    ACTION_GRAPH_CUSTOM(5),
    ACTION_AUDIO_START(6),
    ACTION_CAMERA(7),
    ACTION_CAMERA_MATRIX(8),
    ACTION_CONFIG(9),
    ACTION_RECORD_STOP(10),
    ACTION_CURSOR_MOVE(11),
    ACTION_REBUILD(12),
    UNRECOGNIZED(-1);

    public static final int ACTION_AUDIO_START_VALUE = 6;
    public static final int ACTION_CAMERA_MATRIX_VALUE = 8;
    public static final int ACTION_CAMERA_VALUE = 7;
    public static final int ACTION_CONFIG_VALUE = 9;
    public static final int ACTION_CURSOR_MOVE_VALUE = 11;
    public static final int ACTION_DEFAULT_VALUE = 0;
    public static final int ACTION_GRAPH_ADD_VALUE = 1;
    public static final int ACTION_GRAPH_CHANGE_VALUE = 4;
    public static final int ACTION_GRAPH_CUSTOM_VALUE = 5;
    public static final int ACTION_GRAPH_MATRIX_VALUE = 3;
    public static final int ACTION_GRAPH_REMOVE_VALUE = 2;
    public static final int ACTION_REBUILD_VALUE = 12;
    public static final int ACTION_RECORD_STOP_VALUE = 10;

    /* renamed from: a */
    public static final C3129g f5362a = new C3129g();

    /* renamed from: b */
    public static final EzyCommandEnum$CommandEnum[] f5363b = values();
    private final int value;

    EzyCommandEnum$CommandEnum(int i) {
        this.value = i;
    }

    public static EzyCommandEnum$CommandEnum forNumber(int i) {
        switch (i) {
            case 0:
                return ACTION_DEFAULT;
            case 1:
                return ACTION_GRAPH_ADD;
            case 2:
                return ACTION_GRAPH_REMOVE;
            case 3:
                return ACTION_GRAPH_MATRIX;
            case 4:
                return ACTION_GRAPH_CHANGE;
            case 5:
                return ACTION_GRAPH_CUSTOM;
            case 6:
                return ACTION_AUDIO_START;
            case 7:
                return ACTION_CAMERA;
            case 8:
                return ACTION_CAMERA_MATRIX;
            case 9:
                return ACTION_CONFIG;
            case 10:
                return ACTION_RECORD_STOP;
            case 11:
                return ACTION_CURSOR_MOVE;
            case 12:
                return ACTION_REBUILD;
            default:
                return null;
        }
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return AbstractC3132h.f1606a.getEnumTypes().get(0);
    }

    public static Internal.EnumLiteMap<EzyCommandEnum$CommandEnum> internalGetValueMap() {
        return f5362a;
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
    public static EzyCommandEnum$CommandEnum valueOf(int i) {
        return forNumber(i);
    }

    public static EzyCommandEnum$CommandEnum valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return f5363b[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
