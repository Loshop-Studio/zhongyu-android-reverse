package androidx.core.graphics.drawable;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.C0332a;
import androidx.versionedparcelable.CustomVersionedParcelable;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    static final PorterDuff.Mode f2674k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f2675a;

    /* renamed from: b */
    Object f2676b;

    /* renamed from: c */
    public byte[] f2677c;

    /* renamed from: d */
    public Parcelable f2678d;

    /* renamed from: e */
    public int f2679e;

    /* renamed from: f */
    public int f2680f;

    /* renamed from: g */
    public ColorStateList f2681g;

    /* renamed from: h */
    PorterDuff.Mode f2682h;

    /* renamed from: i */
    public String f2683i;

    /* renamed from: j */
    public String f2684j;

    public IconCompat() {
        this.f2675a = -1;
        this.f2677c = null;
        this.f2678d = null;
        this.f2679e = 0;
        this.f2680f = 0;
        this.f2681g = null;
        this.f2682h = f2674k;
        this.f2683i = null;
    }

    /* renamed from: c */
    static Bitmap m1831c(Bitmap bitmap, boolean z3) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f4 = iMin;
        float f5 = 0.5f * f4;
        float f6 = 0.9166667f * f5;
        if (z3) {
            float f7 = 0.010416667f * f4;
            paint.setColor(0);
            paint.setShadowLayer(f7, IGoodView.DEFAULT_TO_ALPHA, f4 * 0.020833334f, 1023410176);
            canvas.drawCircle(f5, f5, f6, paint);
            paint.setShadowLayer(f7, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, 503316480);
            canvas.drawCircle(f5, f5, f6, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(IGoodView.DEFAULT_TEXT_COLOR);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2, (-(bitmap.getHeight() - iMin)) / 2);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f5, f5, f6, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    /* renamed from: d */
    public static IconCompat m1832d(Context context, int i4) {
        if (context != null) {
            return m1833e(context.getResources(), context.getPackageName(), i4);
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    /* renamed from: e */
    public static IconCompat m1833e(Resources resources, String str, int i4) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        }
        if (i4 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f2679e = i4;
        if (resources != null) {
            try {
                iconCompat.f2676b = resources.getResourceName(i4);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f2676b = str;
        }
        iconCompat.f2684j = str;
        return iconCompat;
    }

    /* renamed from: g */
    private static int m1834g(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        } catch (NoSuchMethodException e5) {
            Log.e("IconCompat", "Unable to get icon resource", e5);
            return 0;
        } catch (InvocationTargetException e6) {
            Log.e("IconCompat", "Unable to get icon resource", e6);
            return 0;
        }
    }

    /* renamed from: i */
    private static String m1835i(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e4) {
            Log.e("IconCompat", "Unable to get icon package", e4);
            return null;
        } catch (NoSuchMethodException e5) {
            Log.e("IconCompat", "Unable to get icon package", e5);
            return null;
        } catch (InvocationTargetException e6) {
            Log.e("IconCompat", "Unable to get icon package", e6);
            return null;
        }
    }

    /* renamed from: j */
    private static Resources m1836j(Context context, String str) throws PackageManager.NameNotFoundException {
        if (DispatchConstants.ANDROID.equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e4) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", str), e4);
            return null;
        }
    }

    /* renamed from: l */
    private static Uri m1837l(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e4) {
            Log.e("IconCompat", "Unable to get icon uri", e4);
            return null;
        } catch (NoSuchMethodException e5) {
            Log.e("IconCompat", "Unable to get icon uri", e5);
            return null;
        } catch (InvocationTargetException e6) {
            Log.e("IconCompat", "Unable to get icon uri", e6);
            return null;
        }
    }

    /* renamed from: q */
    private static String m1838q(int i4) {
        switch (i4) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: a */
    public void m1839a(Intent intent, Drawable drawable, Context context) throws PackageManager.NameNotFoundException {
        Bitmap bitmapCopy;
        m1840b(context);
        int i4 = this.f2675a;
        if (i4 == 1) {
            bitmapCopy = (Bitmap) this.f2676b;
            if (drawable != null) {
                bitmapCopy = bitmapCopy.copy(bitmapCopy.getConfig(), true);
            }
        } else if (i4 == 2) {
            try {
                Context contextCreatePackageContext = context.createPackageContext(m1842h(), 0);
                if (drawable == null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(contextCreatePackageContext, this.f2679e));
                    return;
                }
                Drawable drawableM1806d = C0332a.m1806d(contextCreatePackageContext, this.f2679e);
                if (drawableM1806d.getIntrinsicWidth() <= 0 || drawableM1806d.getIntrinsicHeight() <= 0) {
                    int launcherLargeIconSize = ((ActivityManager) contextCreatePackageContext.getSystemService(AgooConstants.OPEN_ACTIIVTY_NAME)).getLauncherLargeIconSize();
                    bitmapCopy = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
                } else {
                    bitmapCopy = Bitmap.createBitmap(drawableM1806d.getIntrinsicWidth(), drawableM1806d.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                }
                drawableM1806d.setBounds(0, 0, bitmapCopy.getWidth(), bitmapCopy.getHeight());
                drawableM1806d.draw(new Canvas(bitmapCopy));
            } catch (PackageManager.NameNotFoundException e4) {
                throw new IllegalArgumentException("Can't find package " + this.f2676b, e4);
            }
        } else {
            if (i4 != 5) {
                throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
            }
            bitmapCopy = m1831c((Bitmap) this.f2676b, true);
        }
        if (drawable != null) {
            int width = bitmapCopy.getWidth();
            int height = bitmapCopy.getHeight();
            drawable.setBounds(width / 2, height / 2, width, height);
            drawable.draw(new Canvas(bitmapCopy));
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmapCopy);
    }

    /* renamed from: b */
    public void m1840b(Context context) {
        Object obj;
        if (this.f2675a != 2 || (obj = this.f2676b) == null) {
            return;
        }
        String str = (String) obj;
        if (str.contains(":")) {
            String str2 = str.split(":", -1)[1];
            String str3 = str2.split("/", -1)[0];
            String str4 = str2.split("/", -1)[1];
            String str5 = str.split(":", -1)[0];
            if ("0_resource_name_obfuscated".equals(str4)) {
                Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                return;
            }
            String strM1842h = m1842h();
            int identifier = m1836j(context, strM1842h).getIdentifier(str4, str3, str5);
            if (this.f2679e != identifier) {
                Log.i("IconCompat", "Id has changed for " + strM1842h + " " + str);
                this.f2679e = identifier;
            }
        }
    }

    /* renamed from: f */
    public int m1841f() {
        int i4 = this.f2675a;
        if (i4 == -1 && Build.VERSION.SDK_INT >= 23) {
            return m1834g((Icon) this.f2676b);
        }
        if (i4 == 2) {
            return this.f2679e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* renamed from: h */
    public String m1842h() {
        int i4 = this.f2675a;
        if (i4 == -1 && Build.VERSION.SDK_INT >= 23) {
            return m1835i((Icon) this.f2676b);
        }
        if (i4 == 2) {
            return TextUtils.isEmpty(this.f2684j) ? ((String) this.f2676b).split(":", -1)[0] : this.f2684j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* renamed from: k */
    public Uri m1843k() {
        int i4 = this.f2675a;
        if (i4 == -1 && Build.VERSION.SDK_INT >= 23) {
            return m1837l((Icon) this.f2676b);
        }
        if (i4 == 4 || i4 == 6) {
            return Uri.parse((String) this.f2676b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    /* renamed from: m */
    public InputStream m1844m(Context context) {
        Uri uriM1843k = m1843k();
        String scheme = uriM1843k.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriM1843k);
            } catch (Exception e4) {
                Log.w("IconCompat", "Unable to load image from URI: " + uriM1843k, e4);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f2676b));
        } catch (FileNotFoundException e5) {
            Log.w("IconCompat", "Unable to load image from path: " + uriM1843k, e5);
            return null;
        }
    }

    /* renamed from: n */
    public void m1845n() {
        this.f2682h = PorterDuff.Mode.valueOf(this.f2683i);
        switch (this.f2675a) {
            case -1:
                Parcelable parcelable = this.f2678d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f2676b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f2678d;
                if (parcelable2 != null) {
                    this.f2676b = parcelable2;
                    return;
                }
                byte[] bArr = this.f2677c;
                this.f2676b = bArr;
                this.f2675a = 3;
                this.f2679e = 0;
                this.f2680f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f2677c, Charset.forName("UTF-16"));
                this.f2676b = str;
                if (this.f2675a == 2 && this.f2684j == null) {
                    this.f2684j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f2676b = this.f2677c;
                return;
        }
    }

    /* renamed from: o */
    public void m1846o(boolean z3) {
        this.f2683i = this.f2682h.name();
        switch (this.f2675a) {
            case -1:
                if (z3) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f2678d = (Parcelable) this.f2676b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z3) {
                    this.f2678d = (Parcelable) this.f2676b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f2676b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f2677c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f2677c = ((String) this.f2676b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f2677c = (byte[]) this.f2676b;
                return;
            case 4:
            case 6:
                this.f2677c = this.f2676b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    /* renamed from: p */
    public Icon m1847p(Context context) {
        Icon iconCreateWithBitmap;
        switch (this.f2675a) {
            case -1:
                return (Icon) this.f2676b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) this.f2676b);
                break;
            case 2:
                iconCreateWithBitmap = Icon.createWithResource(m1842h(), this.f2679e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) this.f2676b, this.f2679e, this.f2680f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) this.f2676b);
                break;
            case 5:
                if (Build.VERSION.SDK_INT < 26) {
                    iconCreateWithBitmap = Icon.createWithBitmap(m1831c((Bitmap) this.f2676b, false));
                    break;
                } else {
                    iconCreateWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) this.f2676b);
                    break;
                }
            case 6:
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 30) {
                    iconCreateWithBitmap = Icon.createWithAdaptiveBitmapContentUri(m1843k());
                    break;
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + m1843k());
                    }
                    InputStream inputStreamM1844m = m1844m(context);
                    if (inputStreamM1844m == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + m1843k());
                    }
                    if (i4 < 26) {
                        iconCreateWithBitmap = Icon.createWithBitmap(m1831c(BitmapFactory.decodeStream(inputStreamM1844m), false));
                        break;
                    } else {
                        iconCreateWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(inputStreamM1844m));
                        break;
                    }
                }
        }
        ColorStateList colorStateList = this.f2681g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f2682h;
        if (mode != f2674k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public String toString() {
        if (this.f2675a == -1) {
            return String.valueOf(this.f2676b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(m1838q(this.f2675a));
        switch (this.f2675a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f2676b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f2676b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f2684j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m1841f())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f2679e);
                if (this.f2680f != 0) {
                    sb.append(" off=");
                    sb.append(this.f2680f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f2676b);
                break;
        }
        if (this.f2681g != null) {
            sb.append(" tint=");
            sb.append(this.f2681g);
        }
        if (this.f2682h != f2674k) {
            sb.append(" mode=");
            sb.append(this.f2682h);
        }
        sb.append(")");
        return sb.toString();
    }

    private IconCompat(int i4) {
        this.f2677c = null;
        this.f2678d = null;
        this.f2679e = 0;
        this.f2680f = 0;
        this.f2681g = null;
        this.f2682h = f2674k;
        this.f2683i = null;
        this.f2675a = i4;
    }
}
