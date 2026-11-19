package com.zykj.board;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/* loaded from: classes5.dex */
public abstract class EzyBackgroundLineTypeEnum {

    /* renamed from: a */
    public static Descriptors.FileDescriptor f18702a = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\"enums/BackgroundLineTypeEnum.proto*7\n\u0016BackgroundLineTypeEnum\u0012\u000e\n\nHORIZONTAL\u0010\u0000\u0012\r\n\tSTAGGERED\u0010\u0001B+\n\u000ecom.zykj.boardB\u0019EzyBackgroundLineTypeEnumb\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    public enum BackgroundLineTypeEnum implements ProtocolMessageEnum {
        HORIZONTAL(0),
        STAGGERED(1),
        UNRECOGNIZED(-1);


        /* renamed from: g */
        public static final Internal.EnumLiteMap f18706g = new C8448a();

        /* renamed from: h */
        public static final BackgroundLineTypeEnum[] f18707h = values();

        /* renamed from: c */
        public final int f18709c;

        /* renamed from: com.zykj.board.EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum$a */
        public class C8448a implements Internal.EnumLiteMap {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public BackgroundLineTypeEnum findValueByNumber(int i10) {
                return BackgroundLineTypeEnum.m14644a(i10);
            }
        }

        BackgroundLineTypeEnum(int i10) {
            this.f18709c = i10;
        }

        /* renamed from: a */
        public static BackgroundLineTypeEnum m14644a(int i10) {
            if (i10 == 0) {
                return HORIZONTAL;
            }
            if (i10 != 1) {
                return null;
            }
            return STAGGERED;
        }

        /* renamed from: c */
        public static final Descriptors.EnumDescriptor m14645c() {
            return EzyBackgroundLineTypeEnum.m14643a().getEnumTypes().get(0);
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return m14645c();
        }

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f18709c;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return m14645c().getValues().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }
    }

    /* renamed from: a */
    public static Descriptors.FileDescriptor m14643a() {
        return f18702a;
    }
}
