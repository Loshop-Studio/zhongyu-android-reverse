package p000a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Paint;
import android.net.Uri;
import android.support.v4.media.AbstractC0037f;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import coil3.network.AbstractC3315g;
import com.zykj.mistake.feature.notebook.detail.C4887v;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.AbstractC5774b;
import kotlin.Result;
import kotlin.collections.AbstractC5802q;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import kotlinx.coroutines.DispatchException;
import p000a.AbstractC0000a;
import p045d6.C5443s;
import p054e7.AbstractC5469a;
import p075h6.InterfaceC5631c;
import p101k7.AbstractC5764f;
import p101k7.C5759a;
import p101k7.C5766h;
import p101k7.C5770l;
import p101k7.C5772n;
import p101k7.InterfaceC5765g;
import p118m7.AbstractC6135f1;
import p118m7.C6132e1;
import p137p4.C6383b;
import p137p4.C6386e;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p185v7.AbstractC6683l;

/* renamed from: a.a */
/* loaded from: classes.dex */
public abstract class AbstractC0000a {
    /* renamed from: a */
    public static final void m0a(final boolean z8, Composer composer, final int i) {
        int i8;
        Activity activity;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1051884876);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(z8) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1051884876, i8, -1, "com.zykj.mistake.main.loading.AppLoadingOverlay (AppLoadingOverlay.kt:13)");
            }
            Context baseContext = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            boolean zChanged = composerStartRestartGroup.changed(baseContext);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                while (true) {
                    if (!(baseContext instanceof ContextWrapper)) {
                        activity = null;
                        break;
                    } else if (baseContext instanceof Activity) {
                        activity = (Activity) baseContext;
                        break;
                    } else {
                        baseContext = ((ContextWrapper) baseContext).getBaseContext();
                        AbstractC5830k.m5329f(baseContext, "getBaseContext(...)");
                    }
                }
                objRememberedValue = activity;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Activity activity2 = (Activity) objRememberedValue;
            Boolean boolValueOf = Boolean.valueOf(z8);
            int i9 = i8 & 14;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(activity2) | (i9 == 4);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new C4887v(z8, activity2, 4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.DisposableEffect(boolValueOf, activity2, (InterfaceC6471c) objRememberedValue2, composerStartRestartGroup, i9);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: s4.a
                @Override // p152r6.InterfaceC6473e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                    AbstractC0000a.m0a(z8, (Composer) obj, iUpdateChangedFlags);
                    return C5443s.f8405a;
                }
            });
        }
    }

    /* renamed from: b */
    public static final C6132e1 m1b(String str, AbstractC5764f kind) {
        AbstractC5830k.m5330g(kind, "kind");
        if (AbstractC5855p.m5382P(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        AbstractC6135f1.m5829a(str);
        return new C6132e1(str, kind);
    }

    /* renamed from: c */
    public static final C5772n m2c(String str, InterfaceC5765g original) {
        AbstractC5830k.m5330g(original, "original");
        if (AbstractC5855p.m5382P(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (!str.equals(original.mo5105h())) {
            if (original.getKind() instanceof AbstractC5764f) {
                AbstractC6135f1.m5829a(str);
            }
            return new C5772n(str, original);
        }
        StringBuilder sbM100y = AbstractC0037f.m100y("The name of the wrapped descriptor (", str, ") cannot be the same as the name of the original descriptor (");
        sbM100y.append(original.mo5105h());
        sbM100y.append(')');
        throw new IllegalArgumentException(sbM100y.toString().toString());
    }

    /* renamed from: d */
    public static final boolean m3d(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (AbstractC5830k.m5332i(cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static final C5766h m4e(String str, InterfaceC5765g[] interfaceC5765gArr, InterfaceC6471c interfaceC6471c) {
        if (AbstractC5855p.m5382P(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        C5759a c5759a = new C5759a(str);
        interfaceC6471c.invoke(c5759a);
        return new C5766h(str, C5770l.f9146b, c5759a.f9111c.size(), AbstractC5802q.m5204e0(interfaceC5765gArr), c5759a);
    }

    /* renamed from: f */
    public static C5766h m5f(String str, InterfaceC5765g[] interfaceC5765gArr) {
        if (AbstractC5855p.m5382P(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        C5759a c5759a = new C5759a(str);
        return new C5766h(str, C5770l.f9146b, c5759a.f9111c.size(), AbstractC5802q.m5204e0(interfaceC5765gArr), c5759a);
    }

    /* renamed from: g */
    public static final C5766h m6g(String serialName, AbstractC3315g abstractC3315g, InterfaceC5765g[] interfaceC5765gArr, InterfaceC6471c interfaceC6471c) {
        AbstractC5830k.m5330g(serialName, "serialName");
        if (AbstractC5855p.m5382P(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (abstractC3315g.equals(C5770l.f9146b)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        C5759a c5759a = new C5759a(serialName);
        interfaceC6471c.invoke(c5759a);
        return new C5766h(serialName, abstractC3315g, c5759a.f9111c.size(), AbstractC5802q.m5204e0(interfaceC5765gArr), c5759a);
    }

    /* renamed from: h */
    public static C5766h m7h(String serialName, AbstractC3315g abstractC3315g, InterfaceC5765g[] interfaceC5765gArr) {
        AbstractC5830k.m5330g(serialName, "serialName");
        if (AbstractC5855p.m5382P(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (abstractC3315g.equals(C5770l.f9146b)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        C5759a c5759a = new C5759a(serialName);
        return new C5766h(serialName, abstractC3315g, c5759a.f9111c.size(), AbstractC5802q.m5204e0(interfaceC5765gArr), c5759a);
    }

    /* renamed from: i */
    public static final long m8i(FileInputStream fileInputStream, FileOutputStream fileOutputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i = fileInputStream.read(bArr);
        long j7 = 0;
        while (i >= 0) {
            fileOutputStream.write(bArr, 0, i);
            j7 += i;
            i = fileInputStream.read(bArr);
        }
        return j7;
    }

    /* renamed from: j */
    public static Paint m9j(float f, int i) {
        if (f <= 0.0f) {
            return null;
        }
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setStrokeWidth(f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        return paint;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e5 A[Catch: Exception -> 0x0063, TryCatch #8 {Exception -> 0x0063, blocks: (B:6:0x001e, B:11:0x005c, B:42:0x00e5, B:44:0x00ea, B:45:0x00ed, B:37:0x00da, B:39:0x00df), top: B:60:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ea A[Catch: Exception -> 0x0063, TryCatch #8 {Exception -> 0x0063, blocks: (B:6:0x001e, B:11:0x005c, B:42:0x00e5, B:44:0x00ea, B:45:0x00ed, B:37:0x00da, B:39:0x00df), top: B:60:0x001e }] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.net.Uri m10k(android.content.Context r8, java.io.File r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC0000a.m10k(android.content.Context, java.io.File):android.net.Uri");
    }

    /* renamed from: l */
    public static boolean m11l(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ed  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p084i7.InterfaceC5686b m12o(p133o7.AbstractC6281e r5, p207y6.InterfaceC6793q r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC0000a.m12o(o7.e, y6.q, boolean):i7.b");
    }

    /* renamed from: p */
    public static final void m13p(InterfaceC6473e interfaceC6473e, Object obj, InterfaceC5631c interfaceC5631c) {
        try {
            AbstractC5469a.m4832h(AbstractC6683l.m6374n(AbstractC6683l.m6365e(interfaceC6473e, obj, interfaceC5631c)), Result.m13956constructorimpl(C5443s.f8405a));
        } catch (Throwable th) {
            th = th;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).getCause();
            }
            interfaceC5631c.resumeWith(Result.m13956constructorimpl(AbstractC5774b.m5118a(th)));
            throw th;
        }
    }

    /* renamed from: q */
    public static final C6386e m14q(C6383b c6383b) {
        AbstractC5830k.m5330g(c6383b, "<this>");
        return new C6386e(c6383b.f10448c, c6383b.f10449d, c6383b.f10451f, c6383b.f10452g, c6383b.f10453h, c6383b.f10454i, c6383b.f10455j, c6383b.f10456k, c6383b.f10457l, c6383b.f10458m, c6383b.f10461p);
    }

    /* renamed from: m */
    public abstract void mo15m(String str);

    /* renamed from: n */
    public abstract void mo16n(Object obj);
}
