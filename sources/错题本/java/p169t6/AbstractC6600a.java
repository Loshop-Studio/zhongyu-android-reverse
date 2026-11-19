package p169t6;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.InputDeviceCompat;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.resource.bitmap.C3419a;
import com.zykj.mistake.fragment.EmptyFragment;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC5785e0;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.AbstractC5830k;
import p019b3.InterfaceC3107c;
import p024c0.C3210g;
import p054e7.C5488t;
import p075h6.InterfaceC5634f;
import p075h6.InterfaceC5635g;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6473e;
import p202y.InterfaceC6759b;
import p204y1.AbstractC6768a;

/* renamed from: t6.a */
/* loaded from: classes2.dex */
public abstract class AbstractC6600a implements InterfaceC3107c {

    /* renamed from: a */
    public static volatile boolean f11016a = true;

    /* renamed from: a */
    public static Object m6230a(InterfaceC5634f interfaceC5634f, Object obj, InterfaceC6473e operation) {
        AbstractC5830k.m5330g(operation, "operation");
        return operation.invoke(obj, interfaceC5634f);
    }

    /* renamed from: b */
    public static InterfaceC5634f m6231b(InterfaceC5634f interfaceC5634f, InterfaceC5635g key) {
        AbstractC5830k.m5330g(key, "key");
        if (AbstractC5830k.m5325b(interfaceC5634f.getKey(), key)) {
            return interfaceC5634f;
        }
        return null;
    }

    /* renamed from: c */
    public static Bitmap m6232c(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* renamed from: d */
    public static Drawable m6233d(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f11016a) {
                return AppCompatResources.getDrawable(theme != null ? new ContextThemeWrapper(context2, theme) : context2, i);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return ContextCompat.getDrawable(context2, i);
        } catch (NoClassDefFoundError unused2) {
            f11016a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return ResourcesCompat.getDrawable(context2.getResources(), i, theme);
    }

    /* renamed from: f */
    public static int m6234f(List list, InputStream inputStream, C3210g c3210g) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C3419a(inputStream, c3210g);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                int iMo4984c = ((InterfaceC6759b) list.get(i)).mo4984c(inputStream, c3210g);
                if (iMo4984c != -1) {
                    return iMo4984c;
                }
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    /* renamed from: g */
    public static ImageHeaderParser$ImageType m6235g(List list, InputStream inputStream, C3210g c3210g) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C3419a(inputStream, c3210g);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo4983b = ((InterfaceC6759b) list.get(i)).mo4983b(inputStream);
                inputStream.reset();
                if (imageHeaderParser$ImageTypeMo4983b != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeMo4983b;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* renamed from: l */
    public static boolean m6236l(int i) {
        return Math.sqrt((((double) (Color.blue(i) * Color.blue(i))) * 0.068d) + ((((double) (Color.green(i) * Color.green(i))) * 0.691d) + (((double) (Color.red(i) * Color.red(i))) * 0.241d))) > 130.0d;
    }

    /* renamed from: m */
    public static InterfaceC5636h m6237m(InterfaceC5634f interfaceC5634f, InterfaceC5635g key) {
        AbstractC5830k.m5330g(key, "key");
        return AbstractC5830k.m5325b(interfaceC5634f.getKey(), key) ? EmptyCoroutineContext.INSTANCE : interfaceC5634f;
    }

    /* renamed from: n */
    public static EmptyFragment m6238n(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("emptyText", str);
        EmptyFragment emptyFragment = new EmptyFragment();
        emptyFragment.setArguments(bundle);
        return emptyFragment;
    }

    /* renamed from: o */
    public static InterfaceC5636h m6239o(InterfaceC5636h context, InterfaceC5634f interfaceC5634f) {
        AbstractC5830k.m5330g(context, "context");
        return context == EmptyCoroutineContext.INSTANCE ? interfaceC5634f : (InterfaceC5636h) context.fold(interfaceC5634f, new C5488t(4));
    }

    /* renamed from: p */
    public static int m6240p(double d9) {
        if (Double.isNaN(d9)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d9 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d9 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d9);
    }

    /* renamed from: q */
    public static int m6241q(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }

    /* renamed from: r */
    public static long m6242r(double d9) {
        if (Double.isNaN(d9)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d9);
    }

    /* renamed from: s */
    public static Activity m6243s(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m6243s(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: u */
    public static ViewGroup m6244u(Context context, boolean z8) {
        Activity activityM6243s = m6243s(context);
        ViewGroup viewGroup = activityM6243s == null ? null : (ViewGroup) activityM6243s.getWindow().getDecorView();
        if (viewGroup == null) {
            return null;
        }
        if (z8) {
            viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() | InputDeviceCompat.SOURCE_TOUCHSCREEN);
            activityM6243s.getWindow().setFlags(1024, 1024);
            activityM6243s.setRequestedOrientation(0);
            return viewGroup;
        }
        viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() & (-4099));
        activityM6243s.getWindow().clearFlags(1024);
        activityM6243s.setRequestedOrientation(1);
        return viewGroup;
    }

    /* renamed from: w */
    public static final List m6245w(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(AbstractC5805t.m5228h0(list)) : EmptyList.INSTANCE;
    }

    /* renamed from: x */
    public static final Map m6246x(Map map) {
        int size = map.size();
        if (size == 0) {
            return AbstractC5785e0.m5147A();
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) AbstractC5805t.m5227g0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    /* renamed from: y */
    public static final double m6247y(long j7) {
        return ((j7 >>> 11) * 2048) + (j7 & 2047);
    }

    /* renamed from: z */
    public static final String m6248z(int i, long j7) {
        if (j7 >= 0) {
            AbstractC6768a.m6440d(i);
            String string = Long.toString(j7, i);
            AbstractC5830k.m5329f(string, "toString(...)");
            return string;
        }
        long j8 = i;
        long j9 = ((j7 >>> 1) / j8) << 1;
        long j10 = j7 - (j9 * j8);
        if (j10 >= j8) {
            j10 -= j8;
            j9++;
        }
        AbstractC6768a.m6440d(i);
        String string2 = Long.toString(j9, i);
        AbstractC5830k.m5329f(string2, "toString(...)");
        AbstractC6768a.m6440d(i);
        String string3 = Long.toString(j10, i);
        AbstractC5830k.m5329f(string3, "toString(...)");
        return string2.concat(string3);
    }

    @Override // p019b3.InterfaceC3107c
    /* renamed from: e */
    public boolean mo2062e(int i) {
        return false;
    }

    @Override // p019b3.InterfaceC3107c
    /* renamed from: i */
    public void mo2064i() {
    }

    @Override // p019b3.InterfaceC3107c
    /* renamed from: v */
    public void mo2068v() {
    }

    @Override // p019b3.InterfaceC3107c
    /* renamed from: j */
    public void mo2065j(int i) {
    }
}
