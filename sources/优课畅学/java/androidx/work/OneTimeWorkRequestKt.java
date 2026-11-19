package androidx.work;

import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.OneTimeWorkRequest;
import kotlin.jvm.internal.AbstractC9133u;
import p089e8.InterfaceC8375c;
import p289w7.AbstractC10360a;

/* loaded from: classes3.dex */
public final class OneTimeWorkRequestKt {
    public static final /* synthetic */ <W extends ListenableWorker> OneTimeWorkRequest.Builder OneTimeWorkRequestBuilder() {
        AbstractC9133u.m16139m(4, ExifInterface.LONGITUDE_WEST);
        return new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) ListenableWorker.class);
    }

    public static final OneTimeWorkRequest.Builder setInputMerger(OneTimeWorkRequest.Builder builder, @NonNull InterfaceC8375c inputMerger) {
        AbstractC9133u.m16133g(builder, "<this>");
        AbstractC9133u.m16133g(inputMerger, "inputMerger");
        return builder.setInputMerger(AbstractC10360a.m19298a(inputMerger));
    }
}
