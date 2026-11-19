package p078i4;

import com.blankj.utilcode.util.AbstractC4639c0;
import com.blankj.utilcode.util.AbstractC4654k;
import com.blankj.utilcode.util.AbstractC4657l0;
import com.blankj.utilcode.util.AbstractC4668s;
import java.io.File;
import java.lang.Thread;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: i4.e */
/* loaded from: classes4.dex */
public final class C6535e {

    /* renamed from: a */
    public static final C6535e f8368a = new C6535e();

    /* renamed from: b */
    public static final String f8369b = System.getProperty("file.separator");

    /* renamed from: c */
    public static final Thread.UncaughtExceptionHandler f8370c = Thread.getDefaultUncaughtExceptionHandler();

    /* renamed from: d */
    public static final int f8371d = 8;

    /* renamed from: c */
    public static final void m7303c(String str, Function1 function1, Thread thread, Throwable th) {
        AbstractC4668s.m2388t("UncaughtExceptionHandler -> " + th.getMessage());
        AbstractC4654k.m2216h(str + new SimpleDateFormat("yyyy_MM_dd-HH_mm_ss").format(new Date()) + ".txt", th.getMessage(), true);
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        function1.invoke(message);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = f8370c;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    /* renamed from: b */
    public final Thread.UncaughtExceptionHandler m7304b(final String str, final Function1 function1) {
        return new Thread.UncaughtExceptionHandler() { // from class: i4.d
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                C6535e.m7303c(str, function1, thread, th);
            }
        };
    }

    /* renamed from: d */
    public final void m7305d(String crashDirPath, Function1 onCrash) {
        Intrinsics.checkNotNullParameter(crashDirPath, "crashDirPath");
        Intrinsics.checkNotNullParameter(onCrash, "onCrash");
        if (!StringsKt.isBlank(crashDirPath)) {
            String FILE_SEP = f8369b;
            Intrinsics.checkNotNullExpressionValue(FILE_SEP, "FILE_SEP");
            if (!StringsKt.endsWith$default(crashDirPath, FILE_SEP, false, 2, (Object) null)) {
                crashDirPath = crashDirPath + FILE_SEP;
            }
        } else if (!AbstractC4639c0.m2146a() || AbstractC4657l0.m2250a().getExternalFilesDir(null) == null) {
            File filesDir = AbstractC4657l0.m2250a().getFilesDir();
            String str = f8369b;
            crashDirPath = filesDir + str + "crash" + str;
        } else {
            File externalFilesDir = AbstractC4657l0.m2250a().getExternalFilesDir(null);
            String str2 = f8369b;
            crashDirPath = externalFilesDir + str2 + "crash" + str2;
        }
        Thread.setDefaultUncaughtExceptionHandler(m7304b(crashDirPath, onCrash));
    }

    /* renamed from: e */
    public final void m7306e(Function1 onCrash) {
        Intrinsics.checkNotNullParameter(onCrash, "onCrash");
        m7305d("", onCrash);
    }
}
