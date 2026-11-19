package androidx.navigation.internal;

import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import com.blankj.utilcode.util.AbstractC3382c;
import com.zykj.mistake.main.C5019a;
import com.zykj.mistake.main.C5021a1;
import java.io.File;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import kotlin.text.AbstractC5862w;
import okhttp3.AbstractC6323m0;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

/* renamed from: androidx.navigation.internal.d */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2865d implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f1328a;

    /* renamed from: b */
    public final /* synthetic */ String f1329b;

    public /* synthetic */ C2865d(String str, int i) {
        this.f1328a = i;
        this.f1329b = str;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) throws Throwable {
        switch (this.f1328a) {
            case 0:
                return Boolean.valueOf(NavControllerImpl.restoreStateInternal$lambda$53(this.f1329b, (String) obj));
            case 1:
                return Boolean.valueOf(NavControllerImpl.restoreStateInternal$lambda$51(this.f1329b, (String) obj));
            case 2:
                SemanticsPropertyReceiver clearAndSetSemantics = (SemanticsPropertyReceiver) obj;
                AbstractC5830k.m5330g(clearAndSetSemantics, "$this$clearAndSetSemantics");
                SemanticsPropertiesKt.setContentDescription(clearAndSetSemantics, this.f1329b);
                return C5443s.f8405a;
            case 3:
                String it = (String) obj;
                AbstractC5830k.m5330g(it, "it");
                return Boolean.valueOf(AbstractC5862w.m5409C(it, this.f1329b + ":", false));
            case 4:
                C5021a1 state = (C5021a1) obj;
                AbstractC5830k.m5330g(state, "state");
                C5019a c5019a = state.f7831d;
                return C5021a1.m4360a(state, null, c5019a != null ? C5019a.m4359a(c5019a, AbstractC5855p.m5401i0(10, this.f1329b), "", false, 19) : null, 7);
            default:
                AbstractC6323m0 responseBody = (AbstractC6323m0) obj;
                AbstractC5830k.m5330g(responseBody, "responseBody");
                InputStream inputStreamByteStream = responseBody.byteStream();
                String str = this.f1329b;
                AbstractC3382c.m2319t(inputStreamByteStream, str);
                return new File(str);
        }
    }
}
