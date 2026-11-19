package com.zykj.board;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/* loaded from: classes4.dex */
public abstract class EzyBackgroundLineTypeEnum {

    /* renamed from: a */
    public static Descriptors.FileDescriptor f8881a = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\"enums/BackgroundLineTypeEnum.proto*7\n\u0016BackgroundLineTypeEnum\u0012\u000e\n\nHORIZONTAL\u0010\u0000\u0012\r\n\tSTAGGERED\u0010\u0001B+\n\u000ecom.zykj.boardB\u0019EzyBackgroundLineTypeEnumb\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    public enum BackgroundLineTypeEnum implements ProtocolMessageEnum {
        HORIZONTAL(0),
        STAGGERED(1),
        UNRECOGNIZED(-1);


        /* renamed from: e */
        public static final Internal.EnumLiteMap f8885e = new C7180a();

        /* renamed from: f */
        public static final BackgroundLineTypeEnum[] f8886f = values();

        /* renamed from: a */
        public final int f8888a;

        /* renamed from: com.zykj.board.EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum$a */
        public class C7180a implements Internal.EnumLiteMap {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public BackgroundLineTypeEnum findValueByNumber(int i10) {
                return BackgroundLineTypeEnum.m7398a(i10);
            }
        }

        BackgroundLineTypeEnum(int i10) {
            this.f8888a = i10;
        }

        /* renamed from: a */
        public static BackgroundLineTypeEnum m7398a(int i10) {
            if (i10 == 0) {
                return HORIZONTAL;
            }
            if (i10 != 1) {
                return null;
            }
            return STAGGERED;
        }

        /* renamed from: b */
        public static final Descriptors.EnumDescriptor m7399b() {
            return EzyBackgroundLineTypeEnum.m7397a().getEnumTypes().get(0);
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return m7399b();
        }

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f8888a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return m7399b().getValues().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }
    }

    /* renamed from: a */
    public static Descriptors.FileDescriptor m7397a() {
        return f8881a;
    }
}
