package com.zykj.board;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/* loaded from: classes4.dex */
public abstract class EzyModeEnum {

    /* renamed from: a */
    public static Descriptors.FileDescriptor f9510a = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0014enums/ModeEnum.proto*ô\u0001\n\bModeEnum\u0012\u0011\n\rACTION_SELECT\u0010\u0000\u0012\u0012\n\u000eACTION_WRITING\u0010\u0001\u0012\u0017\n\u0013ACTION_WRITING_MOVE\u0010\u0002\u0012\u001a\n\u0016ACTION_WRITING_BEELINE\u0010\u0003\u0012\u0019\n\u0015ACTION_ERASER_WRITING\u0010\u0004\u0012\u0011\n\rACTION_DELETE\u0010\u0005\u0012\u000e\n\nACTION_SEE\u0010\u0006\u0012\u000f\n\u000bACTION_TEXT\u0010\u0007\u0012\u0011\n\rACTION_CURSOR\u0010\b\u0012\u0015\n\u0011ACTION_NEW_SELECT\u0010\t\u0012\u0013\n\u000fACTION_GEOMETRY\u0010\nB\u001d\n\u000ecom.zykj.boardB\u000bEzyModeEnumb\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    public enum ModeEnum implements ProtocolMessageEnum {
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


        /* renamed from: n */
        public static final Internal.EnumLiteMap f9523n = new C7111a();

        /* renamed from: o */
        public static final ModeEnum[] f9524o = values();

        /* renamed from: a */
        public final int f9526a;

        /* renamed from: com.zykj.board.EzyModeEnum$ModeEnum$a */
        public class C7111a implements Internal.EnumLiteMap {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ModeEnum findValueByNumber(int i9) {
                return ModeEnum.m8891c(i9);
            }
        }

        ModeEnum(int i9) {
            this.f9526a = i9;
        }

        /* renamed from: c */
        public static ModeEnum m8891c(int i9) {
            switch (i9) {
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

        /* renamed from: g */
        public static final Descriptors.EnumDescriptor m8892g() {
            return EzyModeEnum.m8889a().getEnumTypes().get(0);
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return m8892g();
        }

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f9526a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return m8892g().getValues().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }
    }

    /* renamed from: a */
    public static Descriptors.FileDescriptor m8889a() {
        return f9510a;
    }
}
