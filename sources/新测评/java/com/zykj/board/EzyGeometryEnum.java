package com.zykj.board;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/* loaded from: classes4.dex */
public abstract class EzyGeometryEnum {

    /* renamed from: a */
    public static Descriptors.FileDescriptor f8081a = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0018enums/GeometryEnum.proto*%\n\fGeometryEnum\u0012\b\n\u0004OVAL\u0010\u0000\u0012\u000b\n\u0007POLYGON\u0010\u0001B!\n\u000ecom.zykj.boardB\u000fEzyGeometryEnumb\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    public enum GeometryEnum implements ProtocolMessageEnum {
        OVAL(0),
        POLYGON(1),
        UNRECOGNIZED(-1);


        /* renamed from: e */
        public static final Internal.EnumLiteMap f8085e = new C6778a();

        /* renamed from: f */
        public static final GeometryEnum[] f8086f = values();

        /* renamed from: a */
        public final int f8088a;

        /* renamed from: com.zykj.board.EzyGeometryEnum$GeometryEnum$a */
        public class C6778a implements Internal.EnumLiteMap {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public GeometryEnum findValueByNumber(int i10) {
                return GeometryEnum.m7485f(i10);
            }
        }

        GeometryEnum(int i10) {
            this.f8088a = i10;
        }

        /* renamed from: f */
        public static GeometryEnum m7485f(int i10) {
            if (i10 == 0) {
                return OVAL;
            }
            if (i10 != 1) {
                return null;
            }
            return POLYGON;
        }

        /* renamed from: j */
        public static final Descriptors.EnumDescriptor m7486j() {
            return EzyGeometryEnum.m7483a().getEnumTypes().get(0);
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return m7486j();
        }

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f8088a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return m7486j().getValues().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }
    }

    /* renamed from: a */
    public static Descriptors.FileDescriptor m7483a() {
        return f8081a;
    }
}
