package com.zykj.board;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/* loaded from: classes5.dex */
public abstract class EzyModeEnum {

    /* renamed from: a */
    public static Descriptors.FileDescriptor f19058a = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0014enums/ModeEnum.proto*ô\u0001\n\bModeEnum\u0012\u0011\n\rACTION_SELECT\u0010\u0000\u0012\u0012\n\u000eACTION_WRITING\u0010\u0001\u0012\u0017\n\u0013ACTION_WRITING_MOVE\u0010\u0002\u0012\u001a\n\u0016ACTION_WRITING_BEELINE\u0010\u0003\u0012\u0019\n\u0015ACTION_ERASER_WRITING\u0010\u0004\u0012\u0011\n\rACTION_DELETE\u0010\u0005\u0012\u000e\n\nACTION_SEE\u0010\u0006\u0012\u000f\n\u000bACTION_TEXT\u0010\u0007\u0012\u0011\n\rACTION_CURSOR\u0010\b\u0012\u0015\n\u0011ACTION_NEW_SELECT\u0010\t\u0012\u0013\n\u000fACTION_GEOMETRY\u0010\nB\u001d\n\u000ecom.zykj.boardB\u000bEzyModeEnumb\u0006proto3"}, new Descriptors.FileDescriptor[0]);

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


        /* renamed from: p */
        public static final Internal.EnumLiteMap f19071p = new C8489a();

        /* renamed from: q */
        public static final ModeEnum[] f19072q = values();

        /* renamed from: c */
        public final int f19074c;

        /* renamed from: com.zykj.board.EzyModeEnum$ModeEnum$a */
        public class C8489a implements Internal.EnumLiteMap {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ModeEnum findValueByNumber(int i10) {
                return ModeEnum.m15506a(i10);
            }
        }

        ModeEnum(int i10) {
            this.f19074c = i10;
        }

        /* renamed from: a */
        public static ModeEnum m15506a(int i10) {
            switch (i10) {
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

        /* renamed from: c */
        public static final Descriptors.EnumDescriptor m15507c() {
            return EzyModeEnum.m15505a().getEnumTypes().get(0);
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return m15507c();
        }

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f19074c;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return m15507c().getValues().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }
    }

    /* renamed from: a */
    public static Descriptors.FileDescriptor m15505a() {
        return f19058a;
    }
}
