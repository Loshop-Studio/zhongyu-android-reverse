package com.zykj.board;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/* loaded from: classes4.dex */
public abstract class EzyGeometryEnum {

    /* renamed from: a */
    public static Descriptors.FileDescriptor f9369a = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0018enums/GeometryEnum.proto*%\n\fGeometryEnum\u0012\b\n\u0004OVAL\u0010\u0000\u0012\u000b\n\u0007POLYGON\u0010\u0001B!\n\u000ecom.zykj.boardB\u000fEzyGeometryEnumb\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    public enum GeometryEnum implements ProtocolMessageEnum {
        OVAL(0),
        POLYGON(1),
        UNRECOGNIZED(-1);


        /* renamed from: e */
        public static final Internal.EnumLiteMap f9373e = new C7097a();

        /* renamed from: f */
        public static final GeometryEnum[] f9374f = values();

        /* renamed from: a */
        public final int f9376a;

        /* renamed from: com.zykj.board.EzyGeometryEnum$GeometryEnum$a */
        public class C7097a implements Internal.EnumLiteMap {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public GeometryEnum findValueByNumber(int i9) {
                return GeometryEnum.m8605c(i9);
            }
        }

        GeometryEnum(int i9) {
            this.f9376a = i9;
        }

        /* renamed from: c */
        public static GeometryEnum m8605c(int i9) {
            if (i9 == 0) {
                return OVAL;
            }
            if (i9 != 1) {
                return null;
            }
            return POLYGON;
        }

        /* renamed from: g */
        public static final Descriptors.EnumDescriptor m8606g() {
            return EzyGeometryEnum.m8603a().getEnumTypes().get(0);
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return m8606g();
        }

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f9376a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return m8606g().getValues().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }
    }

    /* renamed from: a */
    public static Descriptors.FileDescriptor m8603a() {
        return f9369a;
    }
}
