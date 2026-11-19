package com.zykj.mistake.widget;

// RE note 本类字节码直接引用的读写或显示接口包括WebView。

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.C6338z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009a8.RunnableC0023a;
import p152r6.InterfaceC6469a;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016R*\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m5110d2 = {"Lcom/zykj/mistake/widget/StemWebView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Bitmap;", "getCurrentPageBitmap", "()Landroid/graphics/Bitmap;", "", "enabled", "Ld6/s;", "setRemoveEmptyStemTopSpacing", "(Z)V", "visible", "setScaleButtonsVisible", "newOffset", "setZoomOffset", "(I)V", "Lkotlin/Function0;", "j", "Lr6/a;", "getPageFinishListener", "()Lr6/a;", "setPageFinishListener", "(Lr6/a;)V", "pageFinishListener", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nStemWebView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StemWebView.kt\ncom/zykj/mistake/widget/StemWebView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,373:1\n1#2:374\n*E\n"})
/* loaded from: classes3.dex */
public final class StemWebView extends RelativeLayout {

    /* renamed from: k */
    public static final /* synthetic */ int f8093k = 0;

    /* renamed from: a */
    public final WebView f8094a;

    /* renamed from: b */
    public String f8095b;

    /* renamed from: c */
    public final C6338z f8096c;

    /* renamed from: d */
    public final int f8097d;

    /* renamed from: e */
    public final int f8098e;

    /* renamed from: f */
    public int f8099f;

    /* renamed from: g */
    public LinearLayout f8100g;

    /* renamed from: h */
    public boolean f8101h;

    /* renamed from: i */
    public boolean f8102i;

    /* renamed from: j, reason: from kotlin metadata */
    public InterfaceC6469a pageFinishListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StemWebView(@NotNull Context context) {
        this(context, null, 6, 0);
        AbstractC5830k.m5330g(context, "context");
    }

    private final Bitmap getCurrentPageBitmap() {
        Object objM13956constructorimpl;
        WebView webView = this.f8094a;
        webView.setDrawingCacheEnabled(true);
        try {
            objM13956constructorimpl = Result.m13956constructorimpl(Bitmap.createBitmap(webView.getDrawingCache()));
        } catch (Throwable th) {
            objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
        }
        if (Result.m13961isFailureimpl(objM13956constructorimpl)) {
            objM13956constructorimpl = null;
        }
        Bitmap bitmap = (Bitmap) objM13956constructorimpl;
        webView.setDrawingCacheEnabled(false);
        if (bitmap == null) {
            return null;
        }
        int width = webView.getWidth();
        int height = webView.getHeight();
        if (width <= 0 || height <= 0) {
            bitmap.recycle();
            return null;
        }
        if (bitmap.getWidth() == width && bitmap.getHeight() == height) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
        if (bitmapCreateScaledBitmap != bitmap) {
            bitmap.recycle();
        }
        return bitmapCreateScaledBitmap;
    }

    /* renamed from: a */
    public final Bitmap m4480a() {
        Object objM13956constructorimpl;
        int i;
        int i8;
        int i9;
        int i10;
        WebView webView = this.f8094a;
        int scrollX = webView.getScrollX();
        int scrollY = webView.getScrollY();
        int i11 = 0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        webView.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int iMax = Math.max(webView.getWidth(), webView.getMeasuredWidth());
        int iMax2 = Math.max(webView.getHeight(), webView.getMeasuredHeight());
        int width = webView.getWidth();
        int height = webView.getHeight();
        if (iMax > 0 && iMax2 > 0 && width > 0 && height > 0) {
            try {
                objM13956constructorimpl = Result.m13956constructorimpl(Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.RGB_565));
            } catch (Throwable th) {
                objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
            }
            if (Result.m13961isFailureimpl(objM13956constructorimpl)) {
                objM13956constructorimpl = null;
            }
            Bitmap bitmap = (Bitmap) objM13956constructorimpl;
            if (bitmap != null) {
                Canvas canvas = new Canvas(bitmap);
                canvas.drawColor(-1);
                Paint paint = new Paint();
                int i12 = iMax / width;
                int i13 = iMax - (width * i12);
                int i14 = iMax2 / height;
                int i15 = iMax2 - (height * i14);
                while (i11 < i12) {
                    Bitmap bitmap2 = bitmap;
                    int i16 = i11 * width;
                    webView.setScrollX(i16);
                    int i17 = 0;
                    while (i17 < i14) {
                        int i18 = i17;
                        int i19 = i18 * height;
                        webView.setScrollY(i19);
                        int i20 = i11;
                        Bitmap currentPageBitmap = getCurrentPageBitmap();
                        int i21 = width;
                        if (currentPageBitmap != null) {
                            i8 = height;
                            i9 = i12;
                            i10 = i13;
                            canvas.drawBitmap(currentPageBitmap, new Rect(0, 0, currentPageBitmap.getWidth(), currentPageBitmap.getHeight()), new Rect(i16, i19, (i20 + 1) * i21, (i18 + 1) * i8), paint);
                        } else {
                            i8 = height;
                            i9 = i12;
                            i10 = i13;
                        }
                        i17 = i18 + 1;
                        i11 = i20;
                        width = i21;
                        i13 = i10;
                        height = i8;
                        i12 = i9;
                    }
                    int i22 = i11;
                    int i23 = width;
                    int i24 = height;
                    int i25 = i12;
                    int i26 = i13;
                    int i27 = iMax2 - i24;
                    if (i27 > 0 && i15 > 0) {
                        webView.setScrollY(i27);
                        Bitmap currentPageBitmap2 = getCurrentPageBitmap();
                        if (currentPageBitmap2 != null) {
                            canvas.drawBitmap(currentPageBitmap2, new Rect(0, currentPageBitmap2.getHeight() - i15, currentPageBitmap2.getWidth(), currentPageBitmap2.getHeight()), new Rect(i16, iMax2 - i15, (i22 + 1) * i23, iMax2), paint);
                        }
                    }
                    i11 = i22 + 1;
                    bitmap = bitmap2;
                    width = i23;
                    i13 = i26;
                    height = i24;
                    i12 = i25;
                }
                Bitmap bitmap3 = bitmap;
                int i28 = height;
                int i29 = i13;
                int i30 = iMax - width;
                if (i30 > 0 && i29 > 0) {
                    webView.setScrollX(i30);
                    int i31 = 0;
                    while (i31 < i14) {
                        int i32 = i31 * i28;
                        webView.setScrollY(i32);
                        Bitmap currentPageBitmap3 = getCurrentPageBitmap();
                        if (currentPageBitmap3 != null) {
                            i = i31;
                            canvas.drawBitmap(currentPageBitmap3, new Rect(currentPageBitmap3.getWidth() - i29, 0, currentPageBitmap3.getWidth(), currentPageBitmap3.getHeight()), new Rect(iMax - i29, i32, iMax, (i + 1) * i28), paint);
                        } else {
                            i = i31;
                        }
                        i31 = i + 1;
                    }
                    int i33 = iMax2 - i28;
                    if (i33 > 0 && i15 > 0) {
                        webView.setScrollY(i33);
                        Bitmap currentPageBitmap4 = getCurrentPageBitmap();
                        if (currentPageBitmap4 != null) {
                            canvas.drawBitmap(currentPageBitmap4, new Rect(currentPageBitmap4.getWidth() - i29, currentPageBitmap4.getHeight() - i15, currentPageBitmap4.getWidth(), currentPageBitmap4.getHeight()), new Rect(iMax - i29, iMax2 - i15, iMax, iMax2), paint);
                        }
                    }
                }
                webView.setScrollX(scrollX);
                webView.setScrollY(scrollY);
                return bitmap3;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void m4481b(String url) {
        AbstractC5830k.m5330g(url, "url");
        if (url.equals(this.f8095b)) {
            return;
        }
        this.f8095b = url;
        this.f8094a.loadUrl(url);
    }

    @Nullable
    public final InterfaceC6469a getPageFinishListener() {
        return this.pageFinishListener;
    }

    public final void setPageFinishListener(@Nullable InterfaceC6469a interfaceC6469a) {
        this.pageFinishListener = interfaceC6469a;
    }

    public final void setRemoveEmptyStemTopSpacing(boolean enabled) {
        this.f8102i = enabled;
    }

    public final void setScaleButtonsVisible(boolean visible) {
        this.f8101h = visible;
        LinearLayout linearLayout = this.f8100g;
        if (linearLayout != null) {
            linearLayout.setVisibility(visible ? 0 : 8);
        }
    }

    public final void setZoomOffset(int newOffset) {
        int iM5274m = AbstractC5806u.m5274m(newOffset, 0, this.f8098e);
        this.f8099f = iM5274m;
        this.f8094a.setInitialScale(this.f8097d + iM5274m);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StemWebView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        AbstractC5830k.m5330g(context, "context");
    }

    public /* synthetic */ StemWebView(Context context, AttributeSet attributeSet, int i, int i8) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StemWebView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC5830k.m5330g(context, "context");
        this.f8094a = new WebView(context);
        this.f8095b = "";
        this.f8096c = new C6338z();
        this.f8097d = 150;
        this.f8098e = 50;
        this.f8101h = true;
        post(new RunnableC0023a(this, 21));
    }
}
