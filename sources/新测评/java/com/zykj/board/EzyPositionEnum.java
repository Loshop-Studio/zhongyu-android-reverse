package com.zykj.board;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/* loaded from: classes4.dex */
public abstract class EzyPositionEnum {

    /* renamed from: a */
    public static Descriptors.FileDescriptor f8339a = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0018enums/PositionEnum.proto* \u0001\n\fPositionEnum\u0012\f\n\bTOP_LEFT\u0010\u0000\u0012\u000e\n\nTOP_CENTER\u0010\u0001\u0012\r\n\tTOP_RIGHT\u0010\u0002\u0012\u000f\n\u000bCENTER_LEFT\u0010\u0003\u0012\n\n\u0006CENTER\u0010\u0004\u0012\u0010\n\fCENTER_RIGHT\u0010\u0005\u0012\u000f\n\u000bBOTTOM_LEFT\u0010\u0006\u0012\u0011\n\rBOTTOM_CENTER\u0010\u0007\u0012\u0010\n\fBOTTOM_RIGHT\u0010\bB!\n\u000ecom.zykj.boardB\u000fEzyPositionEnumb\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    public enum PositionEnum implements ProtocolMessageEnum {
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


        /* renamed from: l */
        public static final Internal.EnumLiteMap f8350l = new C6809a();

        /* renamed from: m */
        public static final PositionEnum[] f8351m = values();

        /* renamed from: a */
        public final int f8353a;

        /* renamed from: com.zykj.board.EzyPositionEnum$PositionEnum$a */
        public class C6809a implements Internal.EnumLiteMap {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public PositionEnum findValueByNumber(int i10) {
                return PositionEnum.m8032f(i10);
            }
        }

        PositionEnum(int i10) {
            this.f8353a = i10;
        }

        /* renamed from: f */
        public static PositionEnum m8032f(int i10) {
            switch (i10) {
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

        /* renamed from: j */
        public static final Descriptors.EnumDescriptor m8033j() {
            return EzyPositionEnum.m8030a().getEnumTypes().get(0);
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return m8033j();
        }

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f8353a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return m8033j().getValues().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }
    }

    /* renamed from: a */
    public static Descriptors.FileDescriptor m8030a() {
        return f8339a;
    }
}
