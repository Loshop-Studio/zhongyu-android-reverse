package androidx.work;

import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.OneTimeWorkRequest;
import gd.AbstractC9293a;
import kotlin.jvm.internal.AbstractC9979u;
import p280od.InterfaceC10469c;

/* loaded from: classes3.dex */
public final class OneTimeWorkRequestKt {
    public static final /* synthetic */ <W extends ListenableWorker> OneTimeWorkRequest.Builder OneTimeWorkRequestBuilder() {
        AbstractC9979u.m20300m(4, ExifInterface.LONGITUDE_WEST);
        return new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) ListenableWorker.class);
    }

    public static final OneTimeWorkRequest.Builder setInputMerger(OneTimeWorkRequest.Builder builder, @NonNull InterfaceC10469c inputMerger) {
        AbstractC9979u.m20294g(builder, "<this>");
        AbstractC9979u.m20294g(inputMerger, "inputMerger");
        return builder.setInputMerger(AbstractC9293a.m18324a(inputMerger));
    }
}
