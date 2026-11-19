package p090f7;

import com.zykj.evaluation.p056di.AppDatabase;
import com.zykj.evaluation.upload.OssTaskManger;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import p226r9.C9059d0;

/* renamed from: f7.d */
/* loaded from: classes4.dex */
public final class C7491d {

    /* renamed from: a */
    public static final C7491d f12284a = new C7491d();

    /* renamed from: a */
    public final InterfaceC7490c m12122a(C9059d0 retrofit) throws SecurityException {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objM15249b = retrofit.m15249b(InterfaceC7490c.class);
        Intrinsics.checkNotNullExpressionValue(objM15249b, "create(...)");
        return (InterfaceC7490c) objM15249b;
    }

    /* renamed from: b */
    public final OssTaskManger m12123b(MutableStateFlow userFlow, InterfaceC7490c ossTokenApi, AppDatabase database) {
        Intrinsics.checkNotNullParameter(userFlow, "userFlow");
        Intrinsics.checkNotNullParameter(ossTokenApi, "ossTokenApi");
        Intrinsics.checkNotNullParameter(database, "database");
        return new OssTaskManger(userFlow, ossTokenApi, database);
    }
}
