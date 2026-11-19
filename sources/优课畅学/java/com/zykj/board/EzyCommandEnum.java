package com.zykj.board;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/* loaded from: classes4.dex */
public abstract class EzyCommandEnum {

    /* renamed from: a */
    public static Descriptors.FileDescriptor f9077a = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0017enums/CommandEnum.proto*·\u0002\n\u000bCommandEnum\u0012\u0012\n\u000eACTION_DEFAULT\u0010\u0000\u0012\u0014\n\u0010ACTION_GRAPH_ADD\u0010\u0001\u0012\u0017\n\u0013ACTION_GRAPH_REMOVE\u0010\u0002\u0012\u0017\n\u0013ACTION_GRAPH_MATRIX\u0010\u0003\u0012\u0017\n\u0013ACTION_GRAPH_CHANGE\u0010\u0004\u0012\u0017\n\u0013ACTION_GRAPH_CUSTOM\u0010\u0005\u0012\u0016\n\u0012ACTION_AUDIO_START\u0010\u0006\u0012\u0011\n\rACTION_CAMERA\u0010\u0007\u0012\u0018\n\u0014ACTION_CAMERA_MATRIX\u0010\b\u0012\u0011\n\rACTION_CONFIG\u0010\t\u0012\u0016\n\u0012ACTION_RECORD_STOP\u0010\n\u0012\u0016\n\u0012ACTION_CURSOR_MOVE\u0010\u000b\u0012\u0012\n\u000eACTION_REBUILD\u0010\fB \n\u000ecom.zykj.boardB\u000eEzyCommandEnumb\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    public enum CommandEnum implements ProtocolMessageEnum {
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


        /* renamed from: p */
        public static final Internal.EnumLiteMap f9092p = new C7206a();

        /* renamed from: q */
        public static final CommandEnum[] f9093q = values();

        /* renamed from: a */
        public final int f9095a;

        /* renamed from: com.zykj.board.EzyCommandEnum$CommandEnum$a */
        public class C7206a implements Internal.EnumLiteMap {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CommandEnum findValueByNumber(int i10) {
                return CommandEnum.m7977a(i10);
            }
        }

        CommandEnum(int i10) {
            this.f9095a = i10;
        }

        /* renamed from: a */
        public static CommandEnum m7977a(int i10) {
            switch (i10) {
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

        /* renamed from: b */
        public static final Descriptors.EnumDescriptor m7978b() {
            return EzyCommandEnum.m7976a().getEnumTypes().get(0);
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return m7978b();
        }

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f9095a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return m7978b().getValues().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }
    }

    /* renamed from: a */
    public static Descriptors.FileDescriptor m7976a() {
        return f9077a;
    }
}
