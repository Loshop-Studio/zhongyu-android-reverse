package p128h6;

import com.zykj.base.bean.toast.ToastSuccessMessage;
import com.zykj.base.bean.toast.ToastWarnMessage;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import p128h6.AbstractC8103b;
import p138i6.AbstractC8136b;
import p138i6.AbstractC8139e;

/* renamed from: h6.a */
/* loaded from: classes5.dex */
public abstract class AbstractC8102a {
    /* renamed from: a */
    public static final void m12946a(AbstractC8103b abstractC8103b) {
        Intrinsics.checkNotNullParameter(abstractC8103b, "<this>");
        if (abstractC8103b instanceof AbstractC8103b.a.C10073a) {
            AbstractC8136b.m13039g(((AbstractC8103b.a.C10073a) abstractC8103b).m12947a(), null, 1, null);
        } else if (abstractC8103b instanceof AbstractC8103b.a.b) {
            AbstractC8139e.m13046b(new ToastSuccessMessage(((AbstractC8103b.a.b) abstractC8103b).m12948a(), null, 2, null), null, 2, null);
        } else {
            if (!(abstractC8103b instanceof AbstractC8103b.a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC8139e.m13046b(new ToastWarnMessage(((AbstractC8103b.a.c) abstractC8103b).m12949a(), null, 2, null), null, 2, null);
        }
    }
}
