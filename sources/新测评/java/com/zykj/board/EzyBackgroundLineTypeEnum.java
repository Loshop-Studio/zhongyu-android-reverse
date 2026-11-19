package com.zykj.board;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/* loaded from: classes4.dex */
public abstract class EzyBackgroundLineTypeEnum {

    /* renamed from: a */
    public static Descriptors.FileDescriptor f7866a = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\"enums/BackgroundLineTypeEnum.proto*7\n\u0016BackgroundLineTypeEnum\u0012\u000e\n\nHORIZONTAL\u0010\u0000\u0012\r\n\tSTAGGERED\u0010\u0001B+\n\u000ecom.zykj.boardB\u0019EzyBackgroundLineTypeEnumb\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    public enum BackgroundLineTypeEnum implements ProtocolMessageEnum {
        HORIZONTAL(0),
        STAGGERED(1),
        UNRECOGNIZED(-1);


        /* renamed from: e */
        public static final Internal.EnumLiteMap f7870e = new C6751a();

        /* renamed from: f */
        public static final BackgroundLineTypeEnum[] f7871f = values();

        /* renamed from: a */
        public final int f7873a;

        /* renamed from: com.zykj.board.EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum$a */
        public class C6751a implements Internal.EnumLiteMap {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public BackgroundLineTypeEnum findValueByNumber(int i10) {
                return BackgroundLineTypeEnum.m6909f(i10);
            }
        }

        BackgroundLineTypeEnum(int i10) {
            this.f7873a = i10;
        }

        /* renamed from: f */
        public static BackgroundLineTypeEnum m6909f(int i10) {
            if (i10 == 0) {
                return HORIZONTAL;
            }
            if (i10 != 1) {
                return null;
            }
            return STAGGERED;
        }

        /* renamed from: j */
        public static final Descriptors.EnumDescriptor m6910j() {
            return EzyBackgroundLineTypeEnum.m6907a().getEnumTypes().get(0);
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return m6910j();
        }

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f7873a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return m6910j().getValues().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }
    }

    /* renamed from: a */
    public static Descriptors.FileDescriptor m6907a() {
        return f7866a;
    }
}
