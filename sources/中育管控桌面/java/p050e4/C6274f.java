package p050e4;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.zykj.manage.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e4.f */
/* loaded from: classes4.dex */
public final class C6274f {

    /* renamed from: k */
    public static final a f7630k = new a(null);

    /* renamed from: l */
    public static final int f7631l = 8;

    /* renamed from: a */
    public final Context f7632a;

    /* renamed from: b */
    public final WindowManager f7633b;

    /* renamed from: c */
    public final Function1 f7634c;

    /* renamed from: d */
    public final Function1 f7635d;

    /* renamed from: e */
    public View f7636e;

    /* renamed from: f */
    public ImageView f7637f;

    /* renamed from: g */
    public ImageView f7638g;

    /* renamed from: h */
    public TextView f7639h;

    /* renamed from: i */
    public TextView f7640i;

    /* renamed from: j */
    public Bitmap f7641j;

    /* renamed from: e4.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C6274f(Context context, WindowManager windowManager, Function1 onCroppedResultEdit, Function1 onCroppedResultSaved) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(windowManager, "windowManager");
        Intrinsics.checkNotNullParameter(onCroppedResultEdit, "onCroppedResultEdit");
        Intrinsics.checkNotNullParameter(onCroppedResultSaved, "onCroppedResultSaved");
        this.f7632a = context;
        this.f7633b = windowManager;
        this.f7634c = onCroppedResultEdit;
        this.f7635d = onCroppedResultSaved;
    }

    /* renamed from: e */
    public static final void m6401e(C6274f c6274f, View view) {
        Bitmap bitmap = c6274f.f7641j;
        if (bitmap != null) {
            c6274f.f7635d.invoke(bitmap);
        }
        c6274f.m6403c();
    }

    /* renamed from: f */
    public static final void m6402f(C6274f c6274f, View view) {
        c6274f.m6403c();
    }

    /* renamed from: c */
    public final void m6403c() {
        View view = this.f7636e;
        if (view != null && view.getParent() != null) {
            this.f7633b.removeView(view);
        }
        this.f7636e = null;
        this.f7637f = null;
        this.f7639h = null;
        this.f7640i = null;
        Bitmap bitmap = this.f7641j;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f7641j = null;
    }

    /* renamed from: d */
    public final void m6404d(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        m6403c();
        this.f7641j = bitmap;
        View viewInflate = LayoutInflater.from(this.f7632a).inflate(R.layout.dialog_cropped_bitmap, (ViewGroup) null);
        this.f7636e = viewInflate;
        this.f7637f = viewInflate != null ? (ImageView) viewInflate.findViewById(R.id.cropped_image_view) : null;
        View view = this.f7636e;
        this.f7639h = view != null ? (TextView) view.findViewById(R.id.save_btn) : null;
        View view2 = this.f7636e;
        this.f7638g = view2 != null ? (ImageView) view2.findViewById(R.id.img_close) : null;
        ImageView imageView = this.f7637f;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
        TextView textView = this.f7639h;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: e4.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    C6274f.m6401e(this.f7628a, view3);
                }
            });
        }
        ImageView imageView2 = this.f7638g;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: e4.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    C6274f.m6402f(this.f7629a, view3);
                }
            });
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, Build.VERSION.SDK_INT >= 26 ? 2038 : 2002, 1800, -3);
        layoutParams.gravity = 17;
        try {
            this.f7633b.addView(this.f7636e, layoutParams);
        } catch (Exception e6) {
            Log.e("DisplayCroppedBitmapOverlay", "Failed to add cropped result overlay: " + e6.getMessage(), e6);
            Bitmap bitmap2 = this.f7641j;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
        }
    }
}
