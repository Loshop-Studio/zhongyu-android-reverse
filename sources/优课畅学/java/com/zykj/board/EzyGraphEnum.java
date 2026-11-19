package com.zykj.board;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/* loaded from: classes4.dex */
public abstract class EzyGraphEnum {

    /* renamed from: a */
    public static Descriptors.FileDescriptor f9104a = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0015enums/GraphEnum.proto*\u009a\u0001\n\tGraphEnum\u0012\u001b\n\u0017BOUNDED_CONTAINER_GRAPH\u0010\u0000\u0012\u000f\n\u000bGROUP_GRAPH\u0010\u0001\u0012\u000f\n\u000bIMAGE_GRAPH\u0010\u0002\u0012\u0010\n\fSTROKE_GRAPH\u0010\u0003\u0012\u0018\n\u0014BEELINE_STROKE_GRAPH\u0010\u0004\u0012\u000e\n\nTEXT_GRAPH\u0010\u0005\u0012\u0012\n\u000eGEOMETRY_GRAPH\u0010\u0006B\u001e\n\u000ecom.zykj.boardB\fEzyGraphEnumb\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    public enum GraphEnum implements ProtocolMessageEnum {
        BOUNDED_CONTAINER_GRAPH(0),
        GROUP_GRAPH(1),
        IMAGE_GRAPH(2),
        STROKE_GRAPH(3),
        BEELINE_STROKE_GRAPH(4),
        TEXT_GRAPH(5),
        GEOMETRY_GRAPH(6),
        UNRECOGNIZED(-1);


        /* renamed from: j */
        public static final Internal.EnumLiteMap f9113j = new C7208a();

        /* renamed from: k */
        public static final GraphEnum[] f9114k = values();

        /* renamed from: a */
        public final int f9116a;

        /* renamed from: com.zykj.board.EzyGraphEnum$GraphEnum$a */
        public class C7208a implements Internal.EnumLiteMap {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public GraphEnum findValueByNumber(int i10) {
                return GraphEnum.m7985a(i10);
            }
        }

        GraphEnum(int i10) {
            this.f9116a = i10;
        }

        /* renamed from: a */
        public static GraphEnum m7985a(int i10) {
            switch (i10) {
                case 0:
                    return BOUNDED_CONTAINER_GRAPH;
                case 1:
                    return GROUP_GRAPH;
                case 2:
                    return IMAGE_GRAPH;
                case 3:
                    return STROKE_GRAPH;
                case 4:
                    return BEELINE_STROKE_GRAPH;
                case 5:
                    return TEXT_GRAPH;
                case 6:
                    return GEOMETRY_GRAPH;
                default:
                    return null;
            }
        }

        /* renamed from: b */
        public static final Descriptors.EnumDescriptor m7986b() {
            return EzyGraphEnum.m7984a().getEnumTypes().get(0);
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return m7986b();
        }

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f9116a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return m7986b().getValues().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }
    }

    /* renamed from: a */
    public static Descriptors.FileDescriptor m7984a() {
        return f9104a;
    }
}
