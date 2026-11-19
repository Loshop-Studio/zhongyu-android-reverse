package p110m;

import android.content.Context;
import android.support.v4.media.AbstractC0037f;
import android.view.Lifecycle;
import androidx.compose.p011ui.graphics.ImageBitmap;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.graphics.vector.ImageVector;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.InspectionModeKt;
import androidx.compose.p011ui.unit.ConstraintsKt;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import coil3.AbstractC3330o;
import coil3.compose.AbstractC3257n;
import coil3.compose.C3253j;
import coil3.compose.ConstraintsSizeResolver;
import kotlin.jvm.internal.AbstractC5830k;
import p154s.AbstractC6534h;
import p154s.C6529c;
import p154s.C6532f;
import p162t.InterfaceC6577g;
import p169t6.AbstractC6600a;

/* renamed from: m.e */
/* loaded from: classes2.dex */
public abstract class AbstractC6077e {

    /* renamed from: a */
    public static final long f9678a = ConstraintsKt.Constraints$default(0, 0, 0, 0, 5, null);

    /* renamed from: b */
    public static final /* synthetic */ int f9679b = 0;

    /* renamed from: a */
    public static final C3253j m5789a(Composer composer) {
        C3253j c3253j;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2074249623, 0, -1, "coil3.compose.internal.previewHandler (utils.kt:218)");
        }
        if (((Boolean) composer.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue()) {
            composer.startReplaceGroup(2019071620);
            c3253j = (C3253j) composer.consume(AbstractC3257n.f1880a);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(2019129125);
            composer.endReplaceGroup();
            c3253j = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return c3253j;
    }

    /* renamed from: b */
    public static final InterfaceC6577g m5790b(ContentScale contentScale, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-894086142, i, -1, "coil3.compose.internal.rememberSizeResolver (utils.kt:86)");
        }
        boolean zM5325b = AbstractC5830k.m5325b(contentScale, ContentScale.INSTANCE.getNone());
        boolean zChanged = composer.changed(zM5325b);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = zM5325b ? InterfaceC6577g.f10980b0 : new ConstraintsSizeResolver();
            composer.updateRememberedValue(objRememberedValue);
        }
        InterfaceC6577g interfaceC6577g = (InterfaceC6577g) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return interfaceC6577g;
    }

    /* renamed from: c */
    public static final C6532f m5791c(Composer composer, Object obj) {
        composer.startReplaceGroup(1319639034);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1319639034, 0, -1, "coil3.compose.internal.requestOf (utils.kt:42)");
        }
        if (obj instanceof C6532f) {
            composer.startReplaceGroup(1530922508);
            C6532f c6532f = (C6532f) obj;
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return c6532f;
        }
        composer.startReplaceGroup(1530961754);
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        boolean zChanged = composer.changed(context) | composer.changed(obj);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            C6529c c6529c = new C6529c(context);
            c6529c.f10820c = obj;
            objRememberedValue = c6529c.m6182a();
            composer.updateRememberedValue(objRememberedValue);
        }
        C6532f c6532f2 = (C6532f) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return c6532f2;
    }

    /* renamed from: d */
    public static final long m5792d(long j7) {
        return IntSize.m13471constructorimpl((AbstractC6600a.m6241q(Float.intBitsToFloat((int) (j7 & 4294967295L))) & 4294967295L) | (AbstractC6600a.m6241q(Float.intBitsToFloat((int) (j7 >> 32))) << 32));
    }

    /* renamed from: e */
    public static void m5793e(String str) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + AbstractC0037f.m86k("If you wish to display this ", str, ", use androidx.compose.foundation.Image."));
    }

    /* renamed from: f */
    public static final void m5794f(C6532f c6532f) {
        Object obj = c6532f.f10862b;
        if (obj instanceof C6529c) {
            throw new IllegalArgumentException("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
        }
        if (obj instanceof ImageBitmap) {
            m5793e("ImageBitmap");
            throw null;
        }
        if (obj instanceof ImageVector) {
            m5793e("ImageVector");
            throw null;
        }
        if (obj instanceof Painter) {
            m5793e("Painter");
            throw null;
        }
        if (c6532f.f10863c != null) {
            throw new IllegalArgumentException("request.target must be null.");
        }
        if (((Lifecycle) AbstractC3330o.m2267e(c6532f, AbstractC6534h.f10889e)) != null) {
            throw new IllegalArgumentException("request.lifecycle must be null.");
        }
    }
}
