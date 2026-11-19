package com.zykj.board;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/* loaded from: classes4.dex */
public abstract class EzyScaleTypeEnum {

    /* renamed from: a */
    public static Descriptors.FileDescriptor f9422a = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0019enums/ScaleTypeEnum.proto*\u009e\u0001\n\rScaleTypeEnum\u0012\u0012\n\u000eMODE_MAX_WIDTH\u0010\u0000\u0012\u0013\n\u000fMODE_MAX_HEIGHT\u0010\u0001\u0012\u0012\n\u000eMODE_MAX_VALUE\u0010\u0002\u0012\u0012\n\u000eMODE_MIN_VALUE\u0010\u0003\u0012\u0010\n\fMODE_ADAPTER\u0010\u0004\u0012\u0012\n\u000eMODE_ADAPTER_8\u0010\u0005\u0012\u0016\n\u0012MODE_MATRIX_HEIGHT\u0010\u0006B\"\n\u000ecom.zykj.boardB\u0010EzyScaleTypeEnumb\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    public enum ScaleTypeEnum implements ProtocolMessageEnum {
        MODE_MAX_WIDTH(0),
        MODE_MAX_HEIGHT(1),
        MODE_MAX_VALUE(2),
        MODE_MIN_VALUE(3),
        MODE_ADAPTER(4),
        MODE_ADAPTER_8(5),
        MODE_MATRIX_HEIGHT(6),
        UNRECOGNIZED(-1);


        /* renamed from: j */
        public static final Internal.EnumLiteMap f9431j = new C7247a();

        /* renamed from: k */
        public static final ScaleTypeEnum[] f9432k = values();

        /* renamed from: a */
        public final int f9434a;

        /* renamed from: com.zykj.board.EzyScaleTypeEnum$ScaleTypeEnum$a */
        public class C7247a implements Internal.EnumLiteMap {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ScaleTypeEnum findValueByNumber(int i10) {
                return ScaleTypeEnum.m8687a(i10);
            }
        }

        ScaleTypeEnum(int i10) {
            this.f9434a = i10;
        }

        /* renamed from: a */
        public static ScaleTypeEnum m8687a(int i10) {
            switch (i10) {
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

        /* renamed from: b */
        public static final Descriptors.EnumDescriptor m8688b() {
            return EzyScaleTypeEnum.m8686a().getEnumTypes().get(0);
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return m8688b();
        }

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f9434a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return m8688b().getValues().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }
    }

    /* renamed from: a */
    public static Descriptors.FileDescriptor m8686a() {
        return f9422a;
    }
}
