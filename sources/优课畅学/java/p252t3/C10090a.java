package p252t3;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;

/* renamed from: t3.a */
/* loaded from: classes4.dex */
public final class C10090a extends GeneratedMessageLite implements MessageLiteOrBuilder {

    /* renamed from: a */
    public static final C10090a f20160a;

    /* renamed from: b */
    public static volatile Parser f20161b;

    /* renamed from: t3.a$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20162a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20162a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20162a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20162a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20162a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20162a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20162a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20162a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: t3.a$b */
    public static final class b extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        public b() {
            super(C10090a.f20160a);
        }
    }

    static {
        C10090a c10090a = new C10090a();
        f20160a = c10090a;
        GeneratedMessageLite.registerDefaultInstance(C10090a.class, c10090a);
    }

    /* renamed from: b */
    public static C10090a m18844b() {
        return f20160a;
    }

    /* renamed from: c */
    public static C10090a m18845c(InputStream inputStream) {
        return (C10090a) GeneratedMessageLite.parseFrom(f20160a, inputStream);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.f20162a[methodToInvoke.ordinal()]) {
            case 1:
                return new C10090a();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(f20160a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"ignoreVersionCode_"});
            case 4:
                return f20160a;
            case 5:
                Parser parser = f20161b;
                if (parser != null) {
                    return parser;
                }
                synchronized (C10090a.class) {
                    try {
                        defaultInstanceBasedParser = f20161b;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(f20160a);
                            f20161b = defaultInstanceBasedParser;
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
}
