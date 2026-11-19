package com.zykj.lib.login.proto;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum RoleType implements Internal.EnumLite {
    Default(0),
    Student(1),
    Teacher(2),
    Parent(3),
    Administrator(9),
    SuperAdministrator(20),
    UNRECOGNIZED(-1);

    public static final int Administrator_VALUE = 9;
    public static final int Default_VALUE = 0;
    public static final int Parent_VALUE = 3;
    public static final int Student_VALUE = 1;
    public static final int SuperAdministrator_VALUE = 20;
    public static final int Teacher_VALUE = 2;
    private static final Internal.EnumLiteMap<RoleType> internalValueMap = new Internal.EnumLiteMap<RoleType>() { // from class: com.zykj.lib.login.proto.RoleType.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public RoleType findValueByNumber(int i10) {
            return RoleType.forNumber(i10);
        }
    };
    private final int value;

    public static final class RoleTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new RoleTypeVerifier();

        private RoleTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i10) {
            return RoleType.forNumber(i10) != null;
        }
    }

    RoleType(int i10) {
        this.value = i10;
    }

    public static RoleType forNumber(int i10) {
        if (i10 == 0) {
            return Default;
        }
        if (i10 == 1) {
            return Student;
        }
        if (i10 == 2) {
            return Teacher;
        }
        if (i10 == 3) {
            return Parent;
        }
        if (i10 == 9) {
            return Administrator;
        }
        if (i10 != 20) {
            return null;
        }
        return SuperAdministrator;
    }

    public static Internal.EnumLiteMap<RoleType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return RoleTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static RoleType valueOf(int i10) {
        return forNumber(i10);
    }
}
