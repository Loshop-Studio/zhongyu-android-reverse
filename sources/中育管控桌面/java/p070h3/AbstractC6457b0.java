package p070h3;

import android.content.Context;
import androidx.compose.p009ui.graphics.painter.Painter;
import androidx.compose.p009ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p009ui.res.PainterResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import coil3.compose.AbstractC4558c;
import coil3.compose.AsyncImagePainter;
import com.zykj.gallery.R$drawable;
import com.zykj.gallery.bean.GalleryImgBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p070h3.AbstractC6459c0;
import p187y.AbstractC7876i;
import p187y.C7872e;

/* renamed from: h3.b0 */
/* loaded from: classes4.dex */
public abstract class AbstractC6457b0 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* renamed from: b */
    public static final AbstractC6459c0 m7099b(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        switch (str.hashCode()) {
            case -1955878649:
                if (str.equals("Normal")) {
                    return AbstractC6459c0.b.f8222g;
                }
                break;
            case -1822154468:
                if (str.equals("Select")) {
                    return AbstractC6459c0.d.f8224g;
                }
                break;
            case -1547433357:
                if (str.equals("Recycle")) {
                    return AbstractC6459c0.c.f8223g;
                }
                break;
            case 79847359:
                if (str.equals("Share")) {
                    return AbstractC6459c0.e.f8225g;
                }
                break;
        }
        return AbstractC6459c0.a.f8221g;
    }

    /* renamed from: c */
    public static final C6461d0 m7100c(GalleryImgBean galleryImgBean) {
        Intrinsics.checkNotNullParameter(galleryImgBean, "<this>");
        return new C6461d0(galleryImgBean.getId(), galleryImgBean.getName(), galleryImgBean.getCreateTime(), galleryImgBean.getSize(), galleryImgBean.getPicture());
    }

    /* renamed from: d */
    public static final String m7101d(AbstractC6459c0 abstractC6459c0) {
        Intrinsics.checkNotNullParameter(abstractC6459c0, "<this>");
        return abstractC6459c0.m7104a();
    }

    /* renamed from: e */
    public static final Painter m7102e(String str, int i6, Function0 function0, Function0 function02, Composer composer, int i7, int i8) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        composer.startReplaceGroup(351244726);
        int i9 = (i8 & 1) != 0 ? 0 : i6;
        final Function0 function03 = (i8 & 2) != 0 ? null : function0;
        final Function0 function04 = (i8 & 4) != 0 ? null : function02;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(351244726, i7, -1, "com.zykj.gallery.ui.gallery.detail.painterWithDeletedFallback (Ext.kt:90)");
        }
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "deleted.", false, 2, (Object) null)) {
            composer.startReplaceGroup(1391491784);
            Painter painterPainterResource = PainterResources_androidKt.painterResource(R$drawable.error_holder, composer, 0);
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return painterPainterResource;
        }
        composer.startReplaceGroup(1389259660);
        composer.endReplaceGroup();
        C7872e.a aVarM9600c = new C7872e.a((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).m9600c(str + "?reload_key=" + i9);
        int i10 = R$drawable.galler_icon_normal;
        C7872e c7872eM9598a = AbstractC7876i.m9644c(AbstractC7876i.m9657p(aVarM9600c, i10), i10).m9598a();
        boolean z6 = ((((i7 & 896) ^ 384) > 256 && composer.changed(function03)) || (i7 & 384) == 256) | ((((i7 & 7168) ^ 3072) > 2048 && composer.changed(function04)) || (i7 & 3072) == 2048);
        Object objRememberedValue = composer.rememberedValue();
        if (z6 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: h3.a0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC6457b0.m7103f(function03, function04, (AsyncImagePainter.InterfaceC4553c) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        AsyncImagePainter asyncImagePainterM1773a = AbstractC4558c.m1773a(c7872eM9598a, null, (Function1) objRememberedValue, null, 0, composer, 0, 26);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return asyncImagePainterM1773a;
    }

    /* renamed from: f */
    public static final Unit m7103f(Function0 function0, Function0 function02, AsyncImagePainter.InterfaceC4553c state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof AsyncImagePainter.InterfaceC4553c.d) {
            if (function0 != null) {
                function0.invoke();
            }
        } else if ((state instanceof AsyncImagePainter.InterfaceC4553c.b) && function02 != null) {
            function02.invoke();
        }
        return Unit.INSTANCE;
    }
}
