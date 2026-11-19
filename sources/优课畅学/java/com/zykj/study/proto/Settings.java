package com.zykj.study.proto;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class Settings extends GeneratedMessageLite<Settings, Builder> implements SettingsOrBuilder {
    public static final int CACHEPAGEINDEX_FIELD_NUMBER = 1;
    public static final int CACHEPAGEPOSITIONOFFSET_FIELD_NUMBER = 2;
    private static final Settings DEFAULT_INSTANCE;
    private static volatile Parser<Settings> PARSER;
    private int cachePageIndex_;
    private float cachePagePositionOffset_;

    /* renamed from: com.zykj.study.proto.Settings$1 */
    public static /* synthetic */ class C77331 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f11243xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f11243xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11243xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11243xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11243xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11243xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11243xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11243xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Settings, Builder> implements SettingsOrBuilder {
        public Builder clearCachePageIndex() {
            copyOnWrite();
            ((Settings) this.instance).clearCachePageIndex();
            return this;
        }

        public Builder clearCachePagePositionOffset() {
            copyOnWrite();
            ((Settings) this.instance).clearCachePagePositionOffset();
            return this;
        }

        @Override // com.zykj.study.proto.SettingsOrBuilder
        public int getCachePageIndex() {
            return ((Settings) this.instance).getCachePageIndex();
        }

        @Override // com.zykj.study.proto.SettingsOrBuilder
        public float getCachePagePositionOffset() {
            return ((Settings) this.instance).getCachePagePositionOffset();
        }

        public Builder setCachePageIndex(int i10) {
            copyOnWrite();
            ((Settings) this.instance).setCachePageIndex(i10);
            return this;
        }

        public Builder setCachePagePositionOffset(float f10) {
            copyOnWrite();
            ((Settings) this.instance).setCachePagePositionOffset(f10);
            return this;
        }

        private Builder() {
            super(Settings.DEFAULT_INSTANCE);
        }
    }

    static {
        Settings settings = new Settings();
        DEFAULT_INSTANCE = settings;
        GeneratedMessageLite.registerDefaultInstance(Settings.class, settings);
    }

    private Settings() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCachePageIndex() {
        this.cachePageIndex_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCachePagePositionOffset() {
        this.cachePagePositionOffset_ = 0.0f;
    }

    public static Settings getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Settings parseDelimitedFrom(InputStream inputStream) {
        return (Settings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Settings parseFrom(ByteBuffer byteBuffer) {
        return (Settings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Settings> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCachePageIndex(int i10) {
        this.cachePageIndex_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCachePagePositionOffset(float f10) {
        this.cachePagePositionOffset_ = f10;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C77331.f11243xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Settings();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0001", new Object[]{"cachePageIndex_", "cachePagePositionOffset_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Settings> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Settings.class) {
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
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.zykj.study.proto.SettingsOrBuilder
    public int getCachePageIndex() {
        return this.cachePageIndex_;
    }

    @Override // com.zykj.study.proto.SettingsOrBuilder
    public float getCachePagePositionOffset() {
        return this.cachePagePositionOffset_;
    }

    public static Builder newBuilder(Settings settings) {
        return DEFAULT_INSTANCE.createBuilder(settings);
    }

    public static Settings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Settings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Settings parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Settings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Settings parseFrom(ByteString byteString) {
        return (Settings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Settings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Settings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Settings parseFrom(byte[] bArr) {
        return (Settings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Settings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Settings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Settings parseFrom(InputStream inputStream) {
        return (Settings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Settings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Settings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Settings parseFrom(CodedInputStream codedInputStream) {
        return (Settings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Settings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Settings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
