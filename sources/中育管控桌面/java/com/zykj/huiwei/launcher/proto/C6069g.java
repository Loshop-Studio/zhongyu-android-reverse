package com.zykj.huiwei.launcher.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.zykj.huiwei.launcher.proto.g */
/* loaded from: classes4.dex */
public final class C6069g extends GeneratedMessageLite implements InterfaceC6071i {
    public static final int CLASSID_FIELD_NUMBER = 3;
    public static final int CLASSNAME_FIELD_NUMBER = 4;
    private static final C6069g DEFAULT_INSTANCE;
    public static final int ENTERSCHOOLYEAR_FIELD_NUMBER = 5;
    public static final int GRADENAME_FIELD_NUMBER = 6;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<C6069g> PARSER = null;
    public static final int STUDENTNUMBER_FIELD_NUMBER = 2;
    private int classId_;
    private long id_;
    private String studentNumber_ = "";
    private String className_ = "";
    private String enterSchoolYear_ = "";
    private String gradeName_ = "";

    /* renamed from: com.zykj.huiwei.launcher.proto.g$a */
    public static /* synthetic */ class a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f6124xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f6124xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6124xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6124xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6124xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6124xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6124xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6124xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.proto.g$b */
    public static final class b extends GeneratedMessageLite.Builder implements InterfaceC6071i {
        public b clearClassId() {
            copyOnWrite();
            ((C6069g) this.instance).clearClassId();
            return this;
        }

        public b clearClassName() {
            copyOnWrite();
            ((C6069g) this.instance).clearClassName();
            return this;
        }

        public b clearEnterSchoolYear() {
            copyOnWrite();
            ((C6069g) this.instance).clearEnterSchoolYear();
            return this;
        }

        public b clearGradeName() {
            copyOnWrite();
            ((C6069g) this.instance).clearGradeName();
            return this;
        }

        public b clearId() {
            copyOnWrite();
            ((C6069g) this.instance).clearId();
            return this;
        }

        public b clearStudentNumber() {
            copyOnWrite();
            ((C6069g) this.instance).clearStudentNumber();
            return this;
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6071i
        public int getClassId() {
            return ((C6069g) this.instance).getClassId();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6071i
        public String getClassName() {
            return ((C6069g) this.instance).getClassName();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6071i
        public ByteString getClassNameBytes() {
            return ((C6069g) this.instance).getClassNameBytes();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6071i
        public String getEnterSchoolYear() {
            return ((C6069g) this.instance).getEnterSchoolYear();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6071i
        public ByteString getEnterSchoolYearBytes() {
            return ((C6069g) this.instance).getEnterSchoolYearBytes();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6071i
        public String getGradeName() {
            return ((C6069g) this.instance).getGradeName();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6071i
        public ByteString getGradeNameBytes() {
            return ((C6069g) this.instance).getGradeNameBytes();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6071i
        public long getId() {
            return ((C6069g) this.instance).getId();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6071i
        public String getStudentNumber() {
            return ((C6069g) this.instance).getStudentNumber();
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6071i
        public ByteString getStudentNumberBytes() {
            return ((C6069g) this.instance).getStudentNumberBytes();
        }

        public b setClassId(int i6) {
            copyOnWrite();
            ((C6069g) this.instance).setClassId(i6);
            return this;
        }

        public b setClassName(String str) {
            copyOnWrite();
            ((C6069g) this.instance).setClassName(str);
            return this;
        }

        public b setClassNameBytes(ByteString byteString) {
            copyOnWrite();
            ((C6069g) this.instance).setClassNameBytes(byteString);
            return this;
        }

        public b setEnterSchoolYear(String str) {
            copyOnWrite();
            ((C6069g) this.instance).setEnterSchoolYear(str);
            return this;
        }

        public b setEnterSchoolYearBytes(ByteString byteString) {
            copyOnWrite();
            ((C6069g) this.instance).setEnterSchoolYearBytes(byteString);
            return this;
        }

        public b setGradeName(String str) {
            copyOnWrite();
            ((C6069g) this.instance).setGradeName(str);
            return this;
        }

        public b setGradeNameBytes(ByteString byteString) {
            copyOnWrite();
            ((C6069g) this.instance).setGradeNameBytes(byteString);
            return this;
        }

        public b setId(long j6) {
            copyOnWrite();
            ((C6069g) this.instance).setId(j6);
            return this;
        }

        public b setStudentNumber(String str) {
            copyOnWrite();
            ((C6069g) this.instance).setStudentNumber(str);
            return this;
        }

        public b setStudentNumberBytes(ByteString byteString) {
            copyOnWrite();
            ((C6069g) this.instance).setStudentNumberBytes(byteString);
            return this;
        }

        private b() {
            super(C6069g.DEFAULT_INSTANCE);
        }
    }

    static {
        C6069g c6069g = new C6069g();
        DEFAULT_INSTANCE = c6069g;
        GeneratedMessageLite.registerDefaultInstance(C6069g.class, c6069g);
    }

    private C6069g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClassId() {
        this.classId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClassName() {
        this.className_ = getDefaultInstance().getClassName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnterSchoolYear() {
        this.enterSchoolYear_ = getDefaultInstance().getEnterSchoolYear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGradeName() {
        this.gradeName_ = getDefaultInstance().getGradeName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStudentNumber() {
        this.studentNumber_ = getDefaultInstance().getStudentNumber();
    }

    public static C6069g getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static C6069g parseDelimitedFrom(InputStream inputStream) {
        return (C6069g) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static C6069g parseFrom(ByteBuffer byteBuffer) {
        return (C6069g) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<C6069g> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClassId(int i6) {
        this.classId_ = i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClassName(String str) {
        str.getClass();
        this.className_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClassNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.className_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnterSchoolYear(String str) {
        str.getClass();
        this.enterSchoolYear_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnterSchoolYearBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.enterSchoolYear_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGradeName(String str) {
        str.getClass();
        this.gradeName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGradeNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.gradeName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j6) {
        this.id_ = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStudentNumber(String str) {
        str.getClass();
        this.studentNumber_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStudentNumberBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.studentNumber_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.f6124xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new C6069g();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003\u0004\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"id_", "studentNumber_", "classId_", "className_", "enterSchoolYear_", "gradeName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C6069g> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C6069g.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6071i
    public int getClassId() {
        return this.classId_;
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6071i
    public String getClassName() {
        return this.className_;
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6071i
    public ByteString getClassNameBytes() {
        return ByteString.copyFromUtf8(this.className_);
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6071i
    public String getEnterSchoolYear() {
        return this.enterSchoolYear_;
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6071i
    public ByteString getEnterSchoolYearBytes() {
        return ByteString.copyFromUtf8(this.enterSchoolYear_);
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6071i
    public String getGradeName() {
        return this.gradeName_;
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6071i
    public ByteString getGradeNameBytes() {
        return ByteString.copyFromUtf8(this.gradeName_);
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6071i
    public long getId() {
        return this.id_;
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6071i
    public String getStudentNumber() {
        return this.studentNumber_;
    }

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6071i
    public ByteString getStudentNumberBytes() {
        return ByteString.copyFromUtf8(this.studentNumber_);
    }

    public static b newBuilder(C6069g c6069g) {
        return (b) DEFAULT_INSTANCE.createBuilder(c6069g);
    }

    public static C6069g parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (C6069g) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static C6069g parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (C6069g) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static C6069g parseFrom(ByteString byteString) {
        return (C6069g) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static C6069g parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (C6069g) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static C6069g parseFrom(byte[] bArr) {
        return (C6069g) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static C6069g parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (C6069g) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static C6069g parseFrom(InputStream inputStream) {
        return (C6069g) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static C6069g parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (C6069g) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static C6069g parseFrom(CodedInputStream codedInputStream) {
        return (C6069g) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static C6069g parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (C6069g) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
