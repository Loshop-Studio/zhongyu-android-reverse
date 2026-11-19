package com.google.protobuf;

import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class RuntimeVersion {
    public static final RuntimeDomain DOMAIN;
    public static final int MAJOR = 4;
    private static final int MAX_WARNING_COUNT = 20;
    public static final int MINOR = 31;
    public static final RuntimeDomain OSS_DOMAIN;
    public static final int OSS_MAJOR = 4;
    public static final int OSS_MINOR = 31;
    public static final int OSS_PATCH = 1;
    public static final String OSS_SUFFIX = "";
    public static final int PATCH = 1;
    public static final String SUFFIX = "";
    private static final String VERSION_STRING;
    private static final Logger logger;
    static int majorWarningLoggedCount;
    static int minorWarningLoggedCount;

    public static final class ProtobufRuntimeVersionException extends RuntimeException {
        public ProtobufRuntimeVersionException(String str) {
            super(str);
        }
    }

    public enum RuntimeDomain {
        GOOGLE_INTERNAL,
        PUBLIC
    }

    static {
        RuntimeDomain runtimeDomain = RuntimeDomain.PUBLIC;
        OSS_DOMAIN = runtimeDomain;
        DOMAIN = runtimeDomain;
        majorWarningLoggedCount = 0;
        minorWarningLoggedCount = 0;
        VERSION_STRING = versionString(4, 31, 1, "");
        logger = Logger.getLogger(RuntimeVersion.class.getName());
    }

    private RuntimeVersion() {
    }

    private static boolean checkDisabled() {
        String str = System.getenv("TEMPORARILY_DISABLE_PROTOBUF_VERSION_CHECK");
        return str != null && str.equals("true");
    }

    public static void validateProtobufGencodeVersion(RuntimeDomain runtimeDomain, int i6, int i7, int i8, String str, String str2) {
        validateProtobufGencodeVersionImpl(runtimeDomain, i6, i7, i8, str, str2);
    }

    private static void validateProtobufGencodeVersionImpl(RuntimeDomain runtimeDomain, int i6, int i7, int i8, String str, String str2) {
        String strVersionString;
        if (checkDisabled()) {
            return;
        }
        if (i6 < 0 || i7 < 0 || i8 < 0) {
            throw new ProtobufRuntimeVersionException("Invalid gencode version: " + versionString(i6, i7, i8, str));
        }
        RuntimeDomain runtimeDomain2 = DOMAIN;
        if (runtimeDomain != runtimeDomain2) {
            throw new ProtobufRuntimeVersionException(String.format("Detected mismatched Protobuf Gencode/Runtime domains when loading %s: gencode %s, runtime %s. Cross-domain usage of Protobuf is not supported.", str2, runtimeDomain, runtimeDomain2));
        }
        if (i6 == 4) {
            strVersionString = null;
        } else {
            if (i6 != 3 || majorWarningLoggedCount >= 20) {
                throw new ProtobufRuntimeVersionException(String.format("Detected mismatched Protobuf Gencode/Runtime major versions when loading %s: gencode %s, runtime %s. Same major version is required.", str2, versionString(i6, i7, i8, str), VERSION_STRING));
            }
            strVersionString = versionString(i6, i7, i8, str);
            logger.warning(String.format(" Protobuf gencode version %s is exactly one major version older than the runtime version %s at %s. Please update the gencode to avoid compatibility violations in the next runtime release.", strVersionString, VERSION_STRING, str2));
            majorWarningLoggedCount++;
        }
        if (31 < i7 || (i7 == 31 && 1 < i8)) {
            if (strVersionString == null) {
                strVersionString = versionString(i6, i7, i8, str);
            }
            throw new ProtobufRuntimeVersionException(String.format("Detected incompatible Protobuf Gencode/Runtime versions when loading %s: gencode %s, runtime %s. Runtime version cannot be older than the linked gencode version.", str2, strVersionString, VERSION_STRING));
        }
        if (str.equals("")) {
            return;
        }
        if (strVersionString == null) {
            strVersionString = versionString(i6, i7, i8, str);
        }
        throw new ProtobufRuntimeVersionException(String.format("Detected mismatched Protobuf Gencode/Runtime version suffixes when loading %s: gencode %s, runtime %s. Version suffixes must be the same.", str2, strVersionString, VERSION_STRING));
    }

    private static String versionString(int i6, int i7, int i8, String str) {
        return String.format("%d.%d.%d%s", Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), str);
    }
}
