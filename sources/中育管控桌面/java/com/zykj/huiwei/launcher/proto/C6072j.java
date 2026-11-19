package com.zykj.huiwei.launcher.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.zykj.huiwei.launcher.proto.j */
/* loaded from: classes4.dex */
public final class C6072j extends GeneratedMessageLite implements InterfaceC6074l {
    private static final C6072j DEFAULT_INSTANCE;
    public static final int IGNOREVERSIONCODE_FIELD_NUMBER = 1;
    private static volatile Parser<C6072j> PARSER;
    private int ignoreVersionCode_;

    /* renamed from: com.zykj.huiwei.launcher.proto.j$a */
    public static /* synthetic */ class a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f6125xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f6125xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6125xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6125xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6125xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6125xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6125xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6125xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.proto.j$b */
    public static final class b extends GeneratedMessageLite.Builder implements InterfaceC6074l {
        public b clearIgnoreVersionCode() {
            copyOnWrite();
            ((C6072j) this.instance).clearIgnoreVersionCode();
            return this;
        }

        @Override // com.zykj.huiwei.launcher.proto.InterfaceC6074l
        public int getIgnoreVersionCode() {
            return ((C6072j) this.instance).getIgnoreVersionCode();
        }

        public b setIgnoreVersionCode(int i6) {
            copyOnWrite();
            ((C6072j) this.instance).setIgnoreVersionCode(i6);
            return this;
        }

        private b() {
            super(C6072j.DEFAULT_INSTANCE);
        }
    }

    static {
        C6072j c6072j = new C6072j();
        DEFAULT_INSTANCE = c6072j;
        GeneratedMessageLite.registerDefaultInstance(C6072j.class, c6072j);
    }

    private C6072j() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIgnoreVersionCode() {
        this.ignoreVersionCode_ = 0;
    }

    public static C6072j getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static C6072j parseDelimitedFrom(InputStream inputStream) {
        return (C6072j) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static C6072j parseFrom(ByteBuffer byteBuffer) {
        return (C6072j) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<C6072j> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIgnoreVersionCode(int i6) {
        this.ignoreVersionCode_ = i6;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.f6125xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new C6072j();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"ignoreVersionCode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C6072j> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C6072j.class) {
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

    @Override // com.zykj.huiwei.launcher.proto.InterfaceC6074l
    public int getIgnoreVersionCode() {
        return this.ignoreVersionCode_;
    }

    public static b newBuilder(C6072j c6072j) {
        return (b) DEFAULT_INSTANCE.createBuilder(c6072j);
    }

    public static C6072j parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (C6072j) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static C6072j parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (C6072j) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static C6072j parseFrom(ByteString byteString) {
        return (C6072j) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static C6072j parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (C6072j) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static C6072j parseFrom(byte[] bArr) {
        return (C6072j) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static C6072j parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (C6072j) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static C6072j parseFrom(InputStream inputStream) {
        return (C6072j) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static C6072j parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (C6072j) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static C6072j parseFrom(CodedInputStream codedInputStream) {
        return (C6072j) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static C6072j parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (C6072j) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
