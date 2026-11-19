package com.zykj.huiwei.launcher.proto;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum RoleType implements Internal.EnumLite {
    DEFAULT(0),
    STUDENT(1),
    TEACHER(2),
    UNRECOGNIZED(-1);

    public static final int DEFAULT_VALUE = 0;
    public static final int STUDENT_VALUE = 1;
    public static final int TEACHER_VALUE = 2;
    private static final Internal.EnumLiteMap<RoleType> internalValueMap = new Internal.EnumLiteMap() { // from class: com.zykj.huiwei.launcher.proto.RoleType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public RoleType findValueByNumber(int i6) {
            return RoleType.forNumber(i6);
        }
    };
    private final int value;

    /* renamed from: com.zykj.huiwei.launcher.proto.RoleType$b */
    public static final class C6062b implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new C6062b();

        private C6062b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i6) {
            return RoleType.forNumber(i6) != null;
        }
    }

    RoleType(int i6) {
        this.value = i6;
    }

    public static RoleType forNumber(int i6) {
        if (i6 == 0) {
            return DEFAULT;
        }
        if (i6 == 1) {
            return STUDENT;
        }
        if (i6 != 2) {
            return null;
        }
        return TEACHER;
    }

    public static Internal.EnumLiteMap<RoleType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C6062b.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static RoleType valueOf(int i6) {
        return forNumber(i6);
    }
}
