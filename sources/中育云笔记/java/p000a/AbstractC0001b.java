package p000a;

import com.huawei.hms.framework.common.BundleUtil;

/* renamed from: a.b */
/* loaded from: classes.dex */
public abstract class AbstractC0001b {

    /* renamed from: a */
    public static final String f0a = "_COROUTINE";

    /* renamed from: b */
    public static final StackTraceElement m2b(Throwable th, String str) {
        StackTraceElement stackTraceElement = th.getStackTrace()[0];
        return new StackTraceElement(f0a + '.' + str, BundleUtil.UNDERLINE_TAG, stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }
}
