package p016b0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.support.v4.media.AbstractC0037f;
import android.support.v4.media.C0039h;
import android.text.TextUtils;
import androidx.compose.material3.AbstractC1923c;
import androidx.core.os.EnvironmentCompat;
import androidx.navigation.C2827b;
import coil3.AbstractC3330o;
import coil3.C3259d;
import coil3.C3298i;
import coil3.C3304j;
import coil3.C3307m;
import coil3.C3332q;
import coil3.C3333r;
import coil3.InterfaceC3305k;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.blankj.utilcode.util.AbstractC3382c;
import com.blankj.utilcode.util.AbstractC3383c0;
import com.blankj.utilcode.util.AbstractC3387g;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.engine.C3417c;
import com.bumptech.glide.load.resource.bitmap.C3419a;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.C3420a;
import com.zykj.mistake.feature.notebook.detail.C4764a5;
import com.zykj.mistake.feature.notebook.detail.C4791f;
import com.zykj.view.simpleBoard.SimpleBoardView;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC5773a;
import kotlin.collections.EmptyList;
import p024c0.C3210g;
import p024c0.InterfaceC3205b;
import p041d2.C5413c;
import p045d6.InterfaceC5429e;
import p077i0.C5647c;
import p120n0.C6209c;
import p120n0.InterfaceC6207a;
import p154s.C6530d;
import p169t6.AbstractC6600a;
import p171u.InterfaceC6608a;
import p185v7.AbstractC6675d;
import p202y.C6763f;
import p202y.InterfaceC6759b;
import p208z.C6803h;

/* renamed from: b0.g */
/* loaded from: classes2.dex */
public final class C3071g implements InterfaceC6608a, InterfaceC6207a {

    /* renamed from: a */
    public final /* synthetic */ int f1419a;

    /* renamed from: b */
    public Object f1420b;

    /* renamed from: c */
    public Object f1421c;

    /* renamed from: d */
    public Object f1422d;

    public /* synthetic */ C3071g(int i) {
        this.f1419a = i;
    }

    @Override // p120n0.InterfaceC6207a
    /* renamed from: a */
    public InterfaceC3072g0 mo2017a(InterfaceC3072g0 interfaceC3072g0, C6763f c6763f) {
        Drawable drawable = (Drawable) interfaceC3072g0.get();
        if (drawable instanceof BitmapDrawable) {
            return ((C5413c) this.f1421c).mo2017a(C5647c.m4972b(((BitmapDrawable) drawable).getBitmap(), (InterfaceC3205b) this.f1420b), c6763f);
        }
        if (drawable instanceof GifDrawable) {
            return ((C6209c) this.f1422d).mo2017a(interfaceC3072g0, c6763f);
        }
        return null;
    }

    /* renamed from: b */
    public C3333r m2018b() {
        Context context = (Context) this.f1420b;
        C6530d c6530d = (C6530d) this.f1421c;
        C3298i c3298i = (C3298i) this.f1422d;
        c3298i.getClass();
        C6530d c6530dM6183a = C6530d.m6183a(c6530d, null, new C3304j(AbstractC6600a.m6246x(c3298i.f1979a)), 8191);
        InterfaceC5429e interfaceC5429eM5117b = AbstractC5773a.m5117b(new C2827b(this, 4));
        InterfaceC5429e interfaceC5429eM5117b2 = AbstractC5773a.m5117b(new C3307m(0));
        EmptyList emptyList = EmptyList.INSTANCE;
        return new C3333r(new C3332q(context, c6530dM6183a, interfaceC5429eM5117b, interfaceC5429eM5117b2, new C3259d(emptyList, emptyList, emptyList, emptyList, emptyList)));
    }

    /* renamed from: c */
    public Bitmap m2019c(BitmapFactory.Options options) {
        switch (this.f1419a) {
            case 7:
                C3419a c3419a = (C3419a) ((C6803h) this.f1420b).f11475b;
                c3419a.reset();
                return BitmapFactory.decodeStream(c3419a, null, options);
            default:
                return BitmapFactory.decodeFileDescriptor(((C6803h) this.f1422d).m6469e().getFileDescriptor(), null, options);
        }
    }

    /* renamed from: d */
    public String m2020d() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : ((LinkedHashMap) this.f1422d).entrySet()) {
            sb.append((String) entry.getKey());
            sb.append(": ");
            sb.append((String) entry.getValue());
            sb.append(SignParameters.NEW_LINE);
        }
        return sb.toString();
    }

    /* renamed from: e */
    public String m2021e() {
        AbstractC3383c0.m2327f("");
        return "";
    }

    @Override // p171u.InterfaceC6608a
    /* renamed from: f */
    public void mo112f(InterfaceC3305k interfaceC3305k) {
        C4764a5 c4764a5 = (C4764a5) this.f1420b;
        C4791f c4791f = (C4791f) this.f1421c;
        if (c4764a5.m4171g(c4791f)) {
            SimpleBoardView simpleBoardView = c4764a5.f6894a;
            if (simpleBoardView != null) {
                c4764a5.m4168d(simpleBoardView);
            }
            c4764a5.m4174j(c4791f);
        }
    }

    /* renamed from: g */
    public ImageHeaderParser$ImageType m2022g() throws Throwable {
        switch (this.f1419a) {
            case 7:
                List list = (List) this.f1422d;
                C3419a c3419a = (C3419a) ((C6803h) this.f1420b).f11475b;
                c3419a.reset();
                return AbstractC6600a.m6235g(list, c3419a, (C3210g) this.f1421c);
            default:
                List list2 = (List) this.f1421c;
                C6803h c6803h = (C6803h) this.f1422d;
                C3210g c3210g = (C3210g) this.f1420b;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    InterfaceC6759b interfaceC6759b = (InterfaceC6759b) list2.get(i);
                    C3419a c3419a2 = null;
                    try {
                        C3419a c3419a3 = new C3419a(new FileInputStream(c6803h.m6469e().getFileDescriptor()), c3210g);
                        try {
                            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo4983b = interfaceC6759b.mo4983b(c3419a3);
                            try {
                                c3419a3.close();
                            } catch (IOException unused) {
                            }
                            c6803h.m6469e();
                            if (imageHeaderParser$ImageTypeMo4983b != ImageHeaderParser$ImageType.UNKNOWN) {
                                return imageHeaderParser$ImageTypeMo4983b;
                            }
                        } catch (Throwable th) {
                            th = th;
                            c3419a2 = c3419a3;
                            if (c3419a2 != null) {
                                try {
                                    c3419a2.close();
                                } catch (IOException unused2) {
                                }
                            }
                            c6803h.m6469e();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    @Override // p171u.InterfaceC6608a
    /* renamed from: q */
    public void mo123q(InterfaceC3305k interfaceC3305k) {
        Bitmap bitmapM2272j = AbstractC3330o.m2272j(interfaceC3305k);
        C4764a5 c4764a5 = (C4764a5) this.f1420b;
        C4791f c4791f = (C4791f) this.f1422d;
        if (c4764a5.m4171g(c4791f)) {
            c4764a5.m4176l(c4791f, bitmapM2272j);
        }
    }

    public String toString() throws Throwable {
        String str;
        switch (this.f1419a) {
            case 4:
                StringBuilder sb = new StringBuilder("process: ");
                String str2 = (String) this.f1421c;
                sb.append(str2 == null ? "" : str2.replace(":", "_"));
                String str3 = AbstractC3387g.f2158b;
                AbstractC1923c.m1060x(sb, str3, "logSwitch: true", str3, "consoleSwitch: true");
                sb.append(str3);
                sb.append("tag: ");
                m2021e();
                sb.append("null");
                AbstractC1923c.m1060x(sb, str3, "headSwitch: true", str3, "fileSwitch: false");
                sb.append(str3);
                sb.append("dir: ");
                AbstractC1923c.m1060x(sb, (String) this.f1420b, str3, "filePrefix: util", str3);
                AbstractC1923c.m1060x(sb, "borderSwitch: true", str3, "singleTagSwitch: true", str3);
                sb.append("consoleFilter: ");
                char[] cArr = AbstractC3387g.f2157a;
                sb.append(cArr[0]);
                sb.append(str3);
                sb.append("fileFilter: ");
                sb.append(cArr[0]);
                sb.append(str3);
                sb.append("stackDeep: 1");
                sb.append(str3);
                AbstractC1923c.m1060x(sb, "stackOffset: 0", str3, "saveDays: -1", str3);
                sb.append("formatter: ");
                sb.append(AbstractC3387g.f2161e);
                sb.append(str3);
                sb.append("fileWriter: null");
                sb.append(str3);
                AbstractC1923c.m1060x(sb, "onConsoleOutputListener: null", str3, "onFileOutputListener: null", str3);
                sb.append("fileExtraHeader: ");
                sb.append(((C3071g) this.f1422d).m2020d());
                return sb.toString();
            case 5:
                StringBuilder sb2 = new StringBuilder();
                String str4 = "************* " + ((String) this.f1420b) + " Head ****************\n";
                sb2.append(str4);
                for (Map.Entry entry : ((LinkedHashMap) this.f1421c).entrySet()) {
                    sb2.append((String) entry.getKey());
                    sb2.append(": ");
                    sb2.append((String) entry.getValue());
                    sb2.append(SignParameters.NEW_LINE);
                }
                sb2.append("Rom Info           : ");
                String lowerCase = EnvironmentCompat.MEDIA_UNKNOWN;
                C0039h c0039h = AbstractC3382c.f2151v;
                String str5 = "";
                if (c0039h == null) {
                    AbstractC3382c.f2151v = new C0039h(7, false);
                    try {
                        str = Build.BRAND;
                    } catch (Throwable unused) {
                    }
                    String lowerCase2 = !TextUtils.isEmpty(str) ? str.toLowerCase() : EnvironmentCompat.MEDIA_UNKNOWN;
                    try {
                        String str6 = Build.MANUFACTURER;
                        if (!TextUtils.isEmpty(str6)) {
                            lowerCase = str6.toLowerCase();
                        }
                    } catch (Throwable unused2) {
                    }
                    String[] strArr = AbstractC3382c.f2131b;
                    if (AbstractC3382c.m2310k(lowerCase2, strArr, lowerCase)) {
                        AbstractC3382c.f2151v.f96b = strArr[0];
                        String strM2306g = AbstractC3382c.m2306g("ro.build.version.emui");
                        String[] strArrSplit = strM2306g.split("_");
                        if (strArrSplit.length > 1) {
                            AbstractC3382c.f2151v.f97c = strArrSplit[1];
                        } else {
                            AbstractC3382c.f2151v.f97c = strM2306g;
                        }
                        c0039h = AbstractC3382c.f2151v;
                    } else {
                        String[] strArr2 = AbstractC3382c.f2132c;
                        if (AbstractC3382c.m2310k(lowerCase2, strArr2, lowerCase)) {
                            C0039h c0039h2 = AbstractC3382c.f2151v;
                            c0039h2.f96b = strArr2[0];
                            c0039h2.f97c = AbstractC3382c.m2306g("ro.vivo.os.build.display.id");
                            c0039h = AbstractC3382c.f2151v;
                        } else {
                            String[] strArr3 = AbstractC3382c.f2133d;
                            if (AbstractC3382c.m2310k(lowerCase2, strArr3, lowerCase)) {
                                C0039h c0039h3 = AbstractC3382c.f2151v;
                                c0039h3.f96b = strArr3[0];
                                c0039h3.f97c = AbstractC3382c.m2306g("ro.build.version.incremental");
                                c0039h = AbstractC3382c.f2151v;
                            } else {
                                String[] strArr4 = AbstractC3382c.f2134e;
                                if (AbstractC3382c.m2310k(lowerCase2, strArr4, lowerCase)) {
                                    C0039h c0039h4 = AbstractC3382c.f2151v;
                                    c0039h4.f96b = strArr4[0];
                                    c0039h4.f97c = AbstractC3382c.m2306g("ro.build.version.opporom");
                                    c0039h = AbstractC3382c.f2151v;
                                } else {
                                    String[] strArr5 = AbstractC3382c.f2135f;
                                    if (AbstractC3382c.m2310k(lowerCase2, strArr5, lowerCase)) {
                                        C0039h c0039h5 = AbstractC3382c.f2151v;
                                        c0039h5.f96b = strArr5[0];
                                        c0039h5.f97c = AbstractC3382c.m2306g("ro.letv.release.version");
                                        c0039h = AbstractC3382c.f2151v;
                                    } else {
                                        String[] strArr6 = AbstractC3382c.f2136g;
                                        if (AbstractC3382c.m2310k(lowerCase2, strArr6, lowerCase)) {
                                            C0039h c0039h6 = AbstractC3382c.f2151v;
                                            c0039h6.f96b = strArr6[0];
                                            c0039h6.f97c = AbstractC3382c.m2306g("ro.build.uiversion");
                                            c0039h = AbstractC3382c.f2151v;
                                        } else {
                                            String[] strArr7 = AbstractC3382c.f2137h;
                                            if (AbstractC3382c.m2310k(lowerCase2, strArr7, lowerCase)) {
                                                C0039h c0039h7 = AbstractC3382c.f2151v;
                                                c0039h7.f96b = strArr7[0];
                                                c0039h7.f97c = AbstractC3382c.m2306g("ro.build.MiFavor_version");
                                                c0039h = AbstractC3382c.f2151v;
                                            } else {
                                                String[] strArr8 = AbstractC3382c.f2138i;
                                                if (AbstractC3382c.m2310k(lowerCase2, strArr8, lowerCase)) {
                                                    C0039h c0039h8 = AbstractC3382c.f2151v;
                                                    c0039h8.f96b = strArr8[0];
                                                    c0039h8.f97c = AbstractC3382c.m2306g("ro.rom.version");
                                                    c0039h = AbstractC3382c.f2151v;
                                                } else {
                                                    String[] strArr9 = AbstractC3382c.f2139j;
                                                    if (AbstractC3382c.m2310k(lowerCase2, strArr9, lowerCase)) {
                                                        C0039h c0039h9 = AbstractC3382c.f2151v;
                                                        c0039h9.f96b = strArr9[0];
                                                        c0039h9.f97c = AbstractC3382c.m2306g("ro.build.rom.id");
                                                        c0039h = AbstractC3382c.f2151v;
                                                    } else {
                                                        String[] strArr10 = AbstractC3382c.f2140k;
                                                        if (AbstractC3382c.m2310k(lowerCase2, strArr10, lowerCase)) {
                                                            AbstractC3382c.f2151v.f96b = strArr10[0];
                                                        } else {
                                                            String[] strArr11 = AbstractC3382c.f2141l;
                                                            if (AbstractC3382c.m2310k(lowerCase2, strArr11, lowerCase)) {
                                                                AbstractC3382c.f2151v.f96b = strArr11[0];
                                                            } else {
                                                                String[] strArr12 = AbstractC3382c.f2142m;
                                                                if (AbstractC3382c.m2310k(lowerCase2, strArr12, lowerCase)) {
                                                                    AbstractC3382c.f2151v.f96b = strArr12[0];
                                                                } else {
                                                                    String[] strArr13 = AbstractC3382c.f2143n;
                                                                    if (AbstractC3382c.m2310k(lowerCase2, strArr13, lowerCase)) {
                                                                        AbstractC3382c.f2151v.f96b = strArr13[0];
                                                                    } else {
                                                                        String[] strArr14 = AbstractC3382c.f2144o;
                                                                        if (AbstractC3382c.m2310k(lowerCase2, strArr14, lowerCase)) {
                                                                            AbstractC3382c.f2151v.f96b = strArr14[0];
                                                                        } else {
                                                                            String[] strArr15 = AbstractC3382c.f2145p;
                                                                            if (AbstractC3382c.m2310k(lowerCase2, strArr15, lowerCase)) {
                                                                                AbstractC3382c.f2151v.f96b = strArr15[0];
                                                                            } else {
                                                                                String[] strArr16 = AbstractC3382c.f2146q;
                                                                                if (AbstractC3382c.m2310k(lowerCase2, strArr16, lowerCase)) {
                                                                                    AbstractC3382c.f2151v.f96b = strArr16[0];
                                                                                } else {
                                                                                    String[] strArr17 = AbstractC3382c.f2147r;
                                                                                    if (AbstractC3382c.m2310k(lowerCase2, strArr17, lowerCase)) {
                                                                                        AbstractC3382c.f2151v.f96b = strArr17[0];
                                                                                    } else {
                                                                                        String[] strArr18 = AbstractC3382c.f2148s;
                                                                                        if (AbstractC3382c.m2310k(lowerCase2, strArr18, lowerCase)) {
                                                                                            AbstractC3382c.f2151v.f96b = strArr18[0];
                                                                                        } else {
                                                                                            String[] strArr19 = AbstractC3382c.f2149t;
                                                                                            if (AbstractC3382c.m2310k(lowerCase2, strArr19, lowerCase)) {
                                                                                                AbstractC3382c.f2151v.f96b = strArr19[0];
                                                                                            } else {
                                                                                                String[] strArr20 = AbstractC3382c.f2150u;
                                                                                                if (AbstractC3382c.m2310k(lowerCase2, strArr20, lowerCase)) {
                                                                                                    AbstractC3382c.f2151v.f96b = strArr20[0];
                                                                                                } else {
                                                                                                    AbstractC3382c.f2151v.f96b = lowerCase;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        AbstractC3382c.f2151v.f97c = AbstractC3382c.m2306g("");
                                                        c0039h = AbstractC3382c.f2151v;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                sb2.append(c0039h);
                sb2.append("\nDevice Manufacturer: ");
                sb2.append(Build.MANUFACTURER);
                sb2.append("\nDevice Model       : ");
                sb2.append(Build.MODEL);
                sb2.append("\nAndroid Version    : ");
                sb2.append(Build.VERSION.RELEASE);
                sb2.append("\nAndroid SDK        : ");
                sb2.append(Build.VERSION.SDK_INT);
                sb2.append("\nApp VersionName    : ");
                String packageName = AbstractC3382c.m2303d().getPackageName();
                if (!AbstractC3383c0.m2327f(packageName)) {
                    try {
                        PackageInfo packageInfo = AbstractC3382c.m2303d().getPackageManager().getPackageInfo(packageName, 0);
                        if (packageInfo != null) {
                            str5 = packageInfo.versionName;
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        e.printStackTrace();
                    }
                }
                sb2.append(str5);
                sb2.append("\nApp VersionCode    : ");
                sb2.append(AbstractC3382c.m2304e());
                sb2.append(SignParameters.NEW_LINE);
                sb2.append(m2020d());
                return AbstractC0037f.m91p(sb2, str4, SignParameters.NEW_LINE);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C3071g(Object obj, Object obj2, int i, Object obj3) {
        this.f1419a = i;
        this.f1420b = obj;
        this.f1421c = obj2;
        this.f1422d = obj3;
    }

    public C3071g(InputStream inputStream, ArrayList arrayList, C3210g c3210g) {
        this.f1419a = 7;
        AbstractC6675d.m6344f(c3210g, "Argument must not be null");
        this.f1421c = c3210g;
        AbstractC6675d.m6344f(arrayList, "Argument must not be null");
        this.f1422d = arrayList;
        this.f1420b = new C6803h(inputStream, c3210g);
    }

    public C3071g(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, C3210g c3210g) {
        this.f1419a = 8;
        AbstractC6675d.m6344f(c3210g, "Argument must not be null");
        this.f1420b = c3210g;
        AbstractC6675d.m6344f(arrayList, "Argument must not be null");
        this.f1421c = arrayList;
        this.f1422d = new C6803h(parcelFileDescriptor);
    }

    public C3071g(Context context) {
        this.f1419a = 3;
        this.f1420b = context.getApplicationContext();
        this.f1421c = C6530d.f10835o;
        this.f1422d = new C3298i();
    }

    public C3071g(C3417c c3417c, C3420a c3420a, C3093w c3093w) {
        this.f1419a = 2;
        this.f1422d = c3417c;
        this.f1421c = c3420a;
        this.f1420b = c3093w;
    }

    /* renamed from: h */
    private final void m2016h() {
    }

    @Override // p171u.InterfaceC6608a
    /* renamed from: m */
    public void mo119m(InterfaceC3305k interfaceC3305k) {
    }
}
