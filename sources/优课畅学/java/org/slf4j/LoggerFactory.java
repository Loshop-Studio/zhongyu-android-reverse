package org.slf4j;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.slf4j.helpers.NOPLoggerFactory;
import org.slf4j.helpers.SubstituteLoggerFactory;
import org.slf4j.helpers.Util;
import org.slf4j.impl.StaticLoggerBinder;

/* loaded from: classes5.dex */
public final class LoggerFactory {
    static final String CODES_PREFIX = "http://www.slf4j.org/codes.html";
    static final int FAILED_INITIALIZATION = 2;
    static int INITIALIZATION_STATE = 0;
    static final String MULTIPLE_BINDINGS_URL = "http://www.slf4j.org/codes.html#multiple_bindings";
    static final int NOP_FALLBACK_INITIALIZATION = 4;
    static final String NO_STATICLOGGERBINDER_URL = "http://www.slf4j.org/codes.html#StaticLoggerBinder";
    static final String NULL_LF_URL = "http://www.slf4j.org/codes.html#null_LF";
    static final int ONGOING_INITIALIZATION = 1;
    static final String SUBSTITUTE_LOGGER_URL = "http://www.slf4j.org/codes.html#substituteLogger";
    static final int SUCCESSFUL_INITIALIZATION = 3;
    static final int UNINITIALIZED = 0;
    static final String UNSUCCESSFUL_INIT_MSG = "org.slf4j.LoggerFactory could not be successfully initialized. See also http://www.slf4j.org/codes.html#unsuccessfulInit";
    static final String UNSUCCESSFUL_INIT_URL = "http://www.slf4j.org/codes.html#unsuccessfulInit";
    static final String VERSION_MISMATCH = "http://www.slf4j.org/codes.html#version_mismatch";
    static /* synthetic */ Class class$org$slf4j$LoggerFactory;
    static SubstituteLoggerFactory TEMP_FACTORY = new SubstituteLoggerFactory();
    static NOPLoggerFactory NOP_FALLBACK_FACTORY = new NOPLoggerFactory();
    private static final String[] API_COMPATIBILITY_LIST = {"1.6"};
    private static String STATIC_LOGGER_BINDER_PATH = "org/slf4j/impl/StaticLoggerBinder.class";

    private LoggerFactory() {
    }

    private static final void bind() {
        try {
            Set setFindPossibleStaticLoggerBinderPathSet = findPossibleStaticLoggerBinderPathSet();
            reportMultipleBindingAmbiguity(setFindPossibleStaticLoggerBinderPathSet);
            StaticLoggerBinder.getSingleton();
            INITIALIZATION_STATE = 3;
            reportActualBinding(setFindPossibleStaticLoggerBinderPathSet);
            emitSubstituteLoggerWarning();
        } catch (Exception e10) {
            failedBinding(e10);
            throw new IllegalStateException("Unexpected initialization failure", e10);
        } catch (NoClassDefFoundError e11) {
            if (!messageContainsOrgSlf4jImplStaticLoggerBinder(e11.getMessage())) {
                failedBinding(e11);
                throw e11;
            }
            INITIALIZATION_STATE = 4;
            Util.report("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
            Util.report("Defaulting to no-operation (NOP) logger implementation");
            Util.report("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
        } catch (NoSuchMethodError e12) {
            String message = e12.getMessage();
            if (message != null && message.indexOf("org.slf4j.impl.StaticLoggerBinder.getSingleton()") != -1) {
                INITIALIZATION_STATE = 2;
                Util.report("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                Util.report("Your binding is version 1.5.5 or earlier.");
                Util.report("Upgrade your binding to version 1.6.x.");
            }
            throw e12;
        }
    }

    public static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e10) {
            throw new NoClassDefFoundError(e10.getMessage());
        }
    }

    private static final void emitSubstituteLoggerWarning() {
        List loggerNameList = TEMP_FACTORY.getLoggerNameList();
        if (loggerNameList.size() == 0) {
            return;
        }
        Util.report("The following loggers will not work because they were created");
        Util.report("during the default configuration phase of the underlying logging system.");
        Util.report("See also http://www.slf4j.org/codes.html#substituteLogger");
        for (int i10 = 0; i10 < loggerNameList.size(); i10++) {
            Util.report((String) loggerNameList.get(i10));
        }
    }

    public static void failedBinding(Throwable th) {
        INITIALIZATION_STATE = 2;
        Util.report("Failed to instantiate SLF4J LoggerFactory", th);
    }

    private static Set findPossibleStaticLoggerBinderPathSet() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            Class clsClass$ = class$org$slf4j$LoggerFactory;
            if (clsClass$ == null) {
                clsClass$ = class$("org.slf4j.LoggerFactory");
                class$org$slf4j$LoggerFactory = clsClass$;
            }
            ClassLoader classLoader = clsClass$.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(STATIC_LOGGER_BINDER_PATH) : classLoader.getResources(STATIC_LOGGER_BINDER_PATH);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
            return linkedHashSet;
        } catch (IOException e10) {
            Util.report("Error getting resources from path", e10);
            return linkedHashSet;
        }
    }

    public static ILoggerFactory getILoggerFactory() {
        if (INITIALIZATION_STATE == 0) {
            INITIALIZATION_STATE = 1;
            performInitialization();
        }
        int i10 = INITIALIZATION_STATE;
        if (i10 == 1) {
            return TEMP_FACTORY;
        }
        if (i10 == 2) {
            throw new IllegalStateException(UNSUCCESSFUL_INIT_MSG);
        }
        if (i10 == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i10 == 4) {
            return NOP_FALLBACK_FACTORY;
        }
        throw new IllegalStateException("Unreachable code");
    }

    public static Logger getLogger(String str) {
        return getILoggerFactory().getLogger(str);
    }

    private static boolean isAmbiguousStaticLoggerBinderPathSet(Set set) {
        return set.size() > 1;
    }

    private static boolean messageContainsOrgSlf4jImplStaticLoggerBinder(String str) {
        if (str == null) {
            return false;
        }
        return (str.indexOf("org/slf4j/impl/StaticLoggerBinder") == -1 && str.indexOf("org.slf4j.impl.StaticLoggerBinder") == -1) ? false : true;
    }

    private static final void performInitialization() {
        bind();
        if (INITIALIZATION_STATE == 3) {
            versionSanityCheck();
        }
    }

    private static void reportActualBinding(Set set) {
        if (isAmbiguousStaticLoggerBinderPathSet(set)) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Actual binding is of type [");
            stringBuffer.append(StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr());
            stringBuffer.append("]");
            Util.report(stringBuffer.toString());
        }
    }

    private static void reportMultipleBindingAmbiguity(Set set) {
        if (isAmbiguousStaticLoggerBinderPathSet(set)) {
            Util.report("Class path contains multiple SLF4J bindings.");
            Iterator it = set.iterator();
            while (it.hasNext()) {
                URL url = (URL) it.next();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Found binding in [");
                stringBuffer.append(url);
                stringBuffer.append("]");
                Util.report(stringBuffer.toString());
            }
            Util.report("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    public static void reset() {
        INITIALIZATION_STATE = 0;
        TEMP_FACTORY = new SubstituteLoggerFactory();
    }

    private static final void versionSanityCheck() {
        String[] strArr;
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                strArr = API_COMPATIBILITY_LIST;
                if (i10 >= strArr.length) {
                    break;
                }
                if (str.startsWith(strArr[i10])) {
                    z10 = true;
                }
                i10++;
            }
            if (z10) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("The requested version ");
            stringBuffer.append(str);
            stringBuffer.append(" by your slf4j binding is not compatible with ");
            stringBuffer.append(Arrays.asList(strArr).toString());
            Util.report(stringBuffer.toString());
            Util.report("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            Util.report("Unexpected problem occured during version sanity check", th);
        }
    }

    public static Logger getLogger(Class cls) {
        return getLogger(cls.getName());
    }
}
