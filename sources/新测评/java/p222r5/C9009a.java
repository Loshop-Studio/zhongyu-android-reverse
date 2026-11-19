package p222r5;

import com.zykj.evaluation.p056di.AppDatabase;
import com.zykj.evaluation.submit.SubmitTaskManger;
import com.zykj.evaluation.upload.OssTaskManger;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: r5.a */
/* loaded from: classes4.dex */
public final class C9009a {

    /* renamed from: a */
    public static final C9009a f15435a = new C9009a();

    /* renamed from: a */
    public final SubmitTaskManger m15163a(AppDatabase database, OssTaskManger ossTaskManger) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(ossTaskManger, "ossTaskManger");
        return new SubmitTaskManger(database, ossTaskManger);
    }
}
