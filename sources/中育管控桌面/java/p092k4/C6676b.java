package p092k4;

import android.graphics.drawable.PictureDrawable;
import com.caverock.androidsvg.SVG;
import kotlin.jvm.internal.Intrinsics;
import p053f0.C6285d;
import p067h0.InterfaceC6440j;
import p111n0.C7447d;
import p153t0.InterfaceC7719e;

/* renamed from: k4.b */
/* loaded from: classes4.dex */
public final class C6676b implements InterfaceC7719e {
    @Override // p153t0.InterfaceC7719e
    /* renamed from: a */
    public InterfaceC6440j mo7679a(InterfaceC6440j toTranscode, C6285d options) {
        Intrinsics.checkNotNullParameter(toTranscode, "toTranscode");
        Intrinsics.checkNotNullParameter(options, "options");
        Object obj = toTranscode.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return new C7447d(new PictureDrawable(((SVG) obj).m2991k()));
    }
}
