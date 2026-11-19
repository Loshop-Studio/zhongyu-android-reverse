package p429z1;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.core.content.ContextCompat;
import cd.AbstractC5428g;
import com.blankj.utilcode.util.ClickUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10793c0;
import p310qd.C10792c;

/* renamed from: z1.b */
/* loaded from: classes3.dex */
public abstract class AbstractC11958b {
    /* renamed from: a */
    public static final int m26580a(int i10) {
        return ContextCompat.getColor(m26581b(), i10);
    }

    /* renamed from: b */
    public static final Context m26581b() {
        Application app = Utils.getApp();
        AbstractC9979u.m20293f(app, "getApp(...)");
        return app;
    }

    /* renamed from: c */
    public static final void m26582c(Object... content) {
        AbstractC9979u.m20294g(content, "content");
        LogUtils.m3886d(content);
    }

    /* renamed from: d */
    public static final void m26583d(String str) {
        AbstractC9979u.m20294g(str, "str");
        ToastUtils.showLong(str, new Object[0]);
    }

    /* renamed from: e */
    public static final Resources m26584e() {
        Resources resources = m26581b().getResources();
        AbstractC9979u.m20293f(resources, "getResources(...)");
        return resources;
    }

    /* renamed from: f */
    public static final String m26585f(int i10) {
        String string = m26581b().getString(i10);
        AbstractC9979u.m20293f(string, "getString(...)");
        return string;
    }

    /* renamed from: g */
    public static final String[] m26586g(int i10) {
        String[] stringArray = m26584e().getStringArray(i10);
        AbstractC9979u.m20293f(stringArray, "getStringArray(...)");
        return stringArray;
    }

    /* renamed from: h */
    public static final void m26587h(int i10) {
        ToastUtils.showShort(i10);
    }

    /* renamed from: i */
    public static final void m26588i(CharSequence message) {
        AbstractC9979u.m20294g(message, "message");
        ToastUtils.showShort(message);
    }

    /* renamed from: j */
    public static final String m26589j(String path, Charset charset, boolean z10) {
        AbstractC9979u.m20294g(path, "path");
        AbstractC9979u.m20294g(charset, "charset");
        if (!FileUtils.isFileExists(path)) {
            return "null";
        }
        File file = new File(path);
        if (!z10) {
            return AbstractC5428g.m2920d(file, charset);
        }
        byte[] bArrM2919c = AbstractC5428g.m2919c(file);
        try {
            CharsetDecoder charsetDecoderNewDecoder = C10792c.f26019b.newDecoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
            String string = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArrM2919c)).toString();
            AbstractC9979u.m20293f(string, "toString(...)");
            return AbstractC10793c0.m23149y0(string, "\ufeff");
        } catch (CharacterCodingException unused) {
            return new String(bArrM2919c, charset);
        }
    }

    /* renamed from: k */
    public static /* synthetic */ String m26590k(String str, Charset charset, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            charset = Charset.forName("GB2312");
            AbstractC9979u.m20293f(charset, "forName(...)");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return m26589j(str, charset, z10);
    }

    /* renamed from: l */
    public static final void m26591l(View view, long j10, View.OnClickListener event) {
        AbstractC9979u.m20294g(view, "<this>");
        AbstractC9979u.m20294g(event, "event");
        ClickUtils.applyGlobalDebouncing(view, j10, event);
    }

    /* renamed from: m */
    public static final long m26592m(float f10, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-843123118, i10, -1, "com.friday.common.toSp (FridayExt.kt:180)");
        }
        long jMo27101toSp0xMU5do = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo27101toSp0xMU5do(f10);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jMo27101toSp0xMU5do;
    }
}
