package p304y6;

import com.zykj.student.dialogue.upload.OssTaskManger;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import p038c9.C5299y;

/* renamed from: y6.c */
/* loaded from: classes5.dex */
public final class C9962c {

    /* renamed from: a */
    public static final C9962c f17929a = new C9962c();

    /* renamed from: a */
    public final InterfaceC9961b m17233a(C5299y retrofit) throws SecurityException {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objM2527b = retrofit.m2527b(InterfaceC9961b.class);
        Intrinsics.checkNotNullExpressionValue(objM2527b, "create(...)");
        return (InterfaceC9961b) objM2527b;
    }

    /* renamed from: b */
    public final OssTaskManger m17234b(InterfaceC9961b ossTokenApi, MutableStateFlow userInfoFlow) {
        Intrinsics.checkNotNullParameter(ossTokenApi, "ossTokenApi");
        Intrinsics.checkNotNullParameter(userInfoFlow, "userInfoFlow");
        return new OssTaskManger(ossTokenApi, userInfoFlow);
    }
}
