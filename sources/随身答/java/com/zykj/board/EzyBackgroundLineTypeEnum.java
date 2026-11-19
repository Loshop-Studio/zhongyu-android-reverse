package com.zykj.board;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/* loaded from: classes4.dex */
public abstract class EzyBackgroundLineTypeEnum {

    /* renamed from: a */
    public static Descriptors.FileDescriptor f9154a = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\"enums/BackgroundLineTypeEnum.proto*7\n\u0016BackgroundLineTypeEnum\u0012\u000e\n\nHORIZONTAL\u0010\u0000\u0012\r\n\tSTAGGERED\u0010\u0001B+\n\u000ecom.zykj.boardB\u0019EzyBackgroundLineTypeEnumb\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    public enum BackgroundLineTypeEnum implements ProtocolMessageEnum {
        HORIZONTAL(0),
        STAGGERED(1),
        UNRECOGNIZED(-1);


        /* renamed from: e */
        public static final Internal.EnumLiteMap f9158e = new C7070a();

        /* renamed from: f */
        public static final BackgroundLineTypeEnum[] f9159f = values();

        /* renamed from: a */
        public final int f9161a;

        /* renamed from: com.zykj.board.EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum$a */
        public class C7070a implements Internal.EnumLiteMap {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public BackgroundLineTypeEnum findValueByNumber(int i9) {
                return BackgroundLineTypeEnum.m8025c(i9);
            }
        }

        BackgroundLineTypeEnum(int i9) {
            this.f9161a = i9;
        }

        /* renamed from: c */
        public static BackgroundLineTypeEnum m8025c(int i9) {
            if (i9 == 0) {
                return HORIZONTAL;
            }
            if (i9 != 1) {
                return null;
            }
            return STAGGERED;
        }

        /* renamed from: g */
        public static final Descriptors.EnumDescriptor m8026g() {
            return EzyBackgroundLineTypeEnum.m8023a().getEnumTypes().get(0);
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return m8026g();
        }

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f9161a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return m8026g().getValues().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }
    }

    /* renamed from: a */
    public static Descriptors.FileDescriptor m8023a() {
        return f9154a;
    }
}
