package com.canhub.cropper;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.BlendModeColorFilterCompat;
import androidx.core.graphics.BlendModeCompat;
import com.canhub.cropper.C5486c;
import com.canhub.cropper.CropImageActivity;
import com.canhub.cropper.CropImageView;
import com.canhub.cropper.databinding.CropImageActivityBinding;
import java.io.File;
import java.io.IOException;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.AbstractC9108a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p113g8.AbstractC8661c0;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p149k0.AbstractC9049c;
import p212p7.InterfaceC9760a;
import p300x7.InterfaceC10570l;

@InterfaceC8721a
/* loaded from: classes3.dex */
public class CropImageActivity extends AppCompatActivity implements CropImageView.InterfaceC5477g, CropImageView.InterfaceC5473c {

    /* renamed from: h */
    public static final C5466a f3367h = new C5466a(null);

    /* renamed from: a */
    public Uri f3368a;

    /* renamed from: b */
    public CropImageOptions f3369b;

    /* renamed from: c */
    public CropImageView f3370c;

    /* renamed from: d */
    public CropImageActivityBinding f3371d;

    /* renamed from: e */
    public Uri f3372e;

    /* renamed from: f */
    public final ActivityResultLauncher f3373f = registerForActivityResult(new ActivityResultContracts.GetContent(), new ActivityResultCallback() { // from class: j0.b
        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            CropImageActivity.m3249z(this.f17172a, (Uri) obj);
        }
    });

    /* renamed from: g */
    public final ActivityResultLauncher f3374g = registerForActivityResult(new ActivityResultContracts.TakePicture(), new ActivityResultCallback() { // from class: j0.c
        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            CropImageActivity.m3241J(this.f17173a, ((Boolean) obj).booleanValue());
        }
    });

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Source {

        /* renamed from: a */
        public static final Source f3375a = new Source("CAMERA", 0);

        /* renamed from: b */
        public static final Source f3376b = new Source("GALLERY", 1);

        /* renamed from: c */
        public static final /* synthetic */ Source[] f3377c;

        /* renamed from: d */
        public static final /* synthetic */ InterfaceC9760a f3378d;

        static {
            Source[] sourceArrM3267a = m3267a();
            f3377c = sourceArrM3267a;
            f3378d = AbstractC9108a.m16085a(sourceArrM3267a);
        }

        public Source(String str, int i10) {
        }

        /* renamed from: a */
        public static final /* synthetic */ Source[] m3267a() {
            return new Source[]{f3375a, f3376b};
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) f3377c.clone();
        }
    }

    /* renamed from: com.canhub.cropper.CropImageActivity$a */
    public static final class C5466a {
        public /* synthetic */ C5466a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C5466a() {
        }
    }

    /* renamed from: com.canhub.cropper.CropImageActivity$b */
    public /* synthetic */ class C5467b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3379a;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.f3375a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.f3376b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f3379a = iArr;
        }
    }

    /* renamed from: com.canhub.cropper.CropImageActivity$c */
    public static final class C5468c implements C5486c.b {
        public C5468c() {
        }

        @Override // com.canhub.cropper.C5486c.b
        /* renamed from: a */
        public void mo3268a(Uri uri) {
            CropImageActivity.this.m3264w(uri);
        }

        @Override // com.canhub.cropper.C5486c.b
        /* renamed from: b */
        public void mo3269b() {
            CropImageActivity.this.m3254E();
        }
    }

    /* renamed from: com.canhub.cropper.CropImageActivity$onCreate$1 */
    public /* synthetic */ class C54691 extends FunctionReferenceImpl implements InterfaceC10570l {
        public C54691(Object obj) {
            super(1, obj, CropImageActivity.class, "openSource", "openSource(Lcom/canhub/cropper/CropImageActivity$Source;)V", 0);
        }

        /* renamed from: d */
        public final void m3270d(Source p02) throws IOException {
            AbstractC9133u.m16133g(p02, "p0");
            ((CropImageActivity) this.receiver).m3266y(p02);
        }

        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws IOException {
            m3270d((Source) obj);
            return C8736p.f16368a;
        }
    }

    /* renamed from: G */
    public static final boolean m3239G(CropImageActivity this$0, DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        AbstractC9133u.m16133g(this$0, "this$0");
        if (i10 == 4 && keyEvent.getAction() == 1) {
            this$0.m3254E();
            this$0.finish();
        }
        return true;
    }

    /* renamed from: H */
    public static final void m3240H(InterfaceC10570l openSource, DialogInterface dialogInterface, int i10) {
        AbstractC9133u.m16133g(openSource, "$openSource");
        openSource.invoke(i10 == 0 ? Source.f3375a : Source.f3376b);
    }

    /* renamed from: J */
    public static final void m3241J(CropImageActivity this$0, boolean z10) {
        AbstractC9133u.m16133g(this$0, "this$0");
        if (z10) {
            this$0.m3264w(this$0.f3372e);
        } else {
            this$0.m3264w(null);
        }
    }

    /* renamed from: v */
    public static final C8736p m3248v(CropImageActivity this$0, OnBackPressedCallback addCallback) {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(addCallback, "$this$addCallback");
        this$0.m3254E();
        return C8736p.f16368a;
    }

    /* renamed from: z */
    public static final void m3249z(CropImageActivity this$0, Uri uri) {
        AbstractC9133u.m16133g(this$0, "this$0");
        this$0.m3264w(uri);
    }

    /* renamed from: A */
    public void m3250A(int i10) {
        CropImageView cropImageView = this.f3370c;
        if (cropImageView != null) {
            cropImageView.m3288n(i10);
        }
    }

    /* renamed from: B */
    public void m3251B(CropImageView cropImageView) {
        AbstractC9133u.m16133g(cropImageView, "cropImageView");
        this.f3370c = cropImageView;
    }

    /* renamed from: C */
    public final void m3252C() {
        CropImageOptions cropImageOptions = this.f3369b;
        CropImageOptions cropImageOptions2 = null;
        if (cropImageOptions == null) {
            AbstractC9133u.m16151y("cropImageOptions");
            cropImageOptions = null;
        }
        int i10 = cropImageOptions.f3438r0;
        CropImageActivityBinding cropImageActivityBinding = this.f3371d;
        if (cropImageActivityBinding == null) {
            AbstractC9133u.m16151y("binding");
            cropImageActivityBinding = null;
        }
        cropImageActivityBinding.getRoot().setBackgroundColor(i10);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            CropImageOptions cropImageOptions3 = this.f3369b;
            if (cropImageOptions3 == null) {
                AbstractC9133u.m16151y("cropImageOptions");
                cropImageOptions3 = null;
            }
            CharSequence charSequence = cropImageOptions3.f3393M;
            if (charSequence.length() == 0) {
                charSequence = "";
            }
            setTitle(charSequence);
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            CropImageOptions cropImageOptions4 = this.f3369b;
            if (cropImageOptions4 == null) {
                AbstractC9133u.m16151y("cropImageOptions");
                cropImageOptions4 = null;
            }
            Integer num = cropImageOptions4.f3440s0;
            if (num != null) {
                supportActionBar.setBackgroundDrawable(new ColorDrawable(num.intValue()));
            }
            CropImageOptions cropImageOptions5 = this.f3369b;
            if (cropImageOptions5 == null) {
                AbstractC9133u.m16151y("cropImageOptions");
                cropImageOptions5 = null;
            }
            Integer num2 = cropImageOptions5.f3442t0;
            if (num2 != null) {
                int iIntValue = num2.intValue();
                SpannableString spannableString = new SpannableString(getTitle());
                spannableString.setSpan(new ForegroundColorSpan(iIntValue), 0, spannableString.length(), 33);
                setTitle(spannableString);
            }
            CropImageOptions cropImageOptions6 = this.f3369b;
            if (cropImageOptions6 == null) {
                AbstractC9133u.m16151y("cropImageOptions");
            } else {
                cropImageOptions2 = cropImageOptions6;
            }
            Integer num3 = cropImageOptions2.f3444u0;
            if (num3 != null) {
                int iIntValue2 = num3.intValue();
                try {
                    Drawable drawable = ContextCompat.getDrawable(this, R$drawable.ic_arrow_back_24);
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(iIntValue2, PorterDuff.Mode.SRC_ATOP));
                    }
                    supportActionBar.setHomeAsUpIndicator(drawable);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* renamed from: D */
    public void m3253D(Uri uri, Exception exc, int i10) {
        setResult(exc != null ? 204 : -1, m3262t(uri, exc, i10));
        finish();
    }

    /* renamed from: E */
    public void m3254E() {
        setResult(0);
        finish();
    }

    /* renamed from: F */
    public void m3255F(final InterfaceC10570l openSource) {
        AbstractC9133u.m16133g(openSource, "openSource");
        new AlertDialog.Builder(this).setCancelable(false).setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: j0.e
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                return CropImageActivity.m3239G(this.f17175a, dialogInterface, i10, keyEvent);
            }
        }).setTitle(R$string.pick_image_chooser_title).setItems(new String[]{getString(R$string.pick_image_camera), getString(R$string.pick_image_gallery)}, new DialogInterface.OnClickListener() { // from class: j0.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                CropImageActivity.m3240H(openSource, dialogInterface, i10);
            }
        }).show();
    }

    /* renamed from: I */
    public final void m3256I() {
        C5486c c5486c = new C5486c(this, new C5468c());
        CropImageOptions cropImageOptions = this.f3369b;
        if (cropImageOptions == null) {
            AbstractC9133u.m16151y("cropImageOptions");
            cropImageOptions = null;
        }
        String str = cropImageOptions.f3428m0;
        if (str != null) {
            if (AbstractC8661c0.m13993h0(str)) {
                str = null;
            }
            if (str != null) {
                c5486c.m3404g(str);
            }
        }
        List list = cropImageOptions.f3430n0;
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                c5486c.m3405h(list);
            }
        }
        c5486c.m3406i(cropImageOptions.f3408b, cropImageOptions.f3407a, cropImageOptions.f3408b ? m3263u() : null);
    }

    /* renamed from: K */
    public void m3257K(Menu menu, int i10, int i11) {
        Drawable icon;
        AbstractC9133u.m16133g(menu, "menu");
        MenuItem menuItemFindItem = menu.findItem(i10);
        if (menuItemFindItem == null || (icon = menuItemFindItem.getIcon()) == null) {
            return;
        }
        try {
            icon.mutate();
            icon.setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(i11, BlendModeCompat.SRC_ATOP));
            menuItemFindItem.setIcon(icon);
        } catch (Exception e10) {
            Log.w("AIC", "Failed to update menu item color", e10);
        }
    }

    /* renamed from: L */
    public void m3258L(Menu menu, int i10, int i11) {
        CharSequence title;
        AbstractC9133u.m16133g(menu, "menu");
        MenuItem menuItemFindItem = menu.findItem(i10);
        if (menuItemFindItem == null || (title = menuItemFindItem.getTitle()) == null || !(!AbstractC8661c0.m13993h0(title))) {
            return;
        }
        try {
            SpannableString spannableString = new SpannableString(title);
            spannableString.setSpan(new ForegroundColorSpan(i11), 0, spannableString.length(), 33);
            menuItemFindItem.setTitle(spannableString);
        } catch (Exception e10) {
            Log.w("AIC", "Failed to update menu item color", e10);
        }
    }

    @Override // com.canhub.cropper.CropImageView.InterfaceC5473c
    /* renamed from: a */
    public void mo3259a(CropImageView view, CropImageView.C5472b result) {
        AbstractC9133u.m16133g(view, "view");
        AbstractC9133u.m16133g(result, "result");
        m3253D(result.m3306j(), result.m3302d(), result.m3305i());
    }

    @Override // com.canhub.cropper.CropImageView.InterfaceC5477g
    /* renamed from: b */
    public void mo3260b(CropImageView view, Uri uri, Exception exc) {
        CropImageView cropImageView;
        CropImageView cropImageView2;
        AbstractC9133u.m16133g(view, "view");
        AbstractC9133u.m16133g(uri, "uri");
        CropImageOptions cropImageOptions = null;
        if (exc != null) {
            m3253D(null, exc, 1);
            return;
        }
        CropImageOptions cropImageOptions2 = this.f3369b;
        if (cropImageOptions2 == null) {
            AbstractC9133u.m16151y("cropImageOptions");
            cropImageOptions2 = null;
        }
        if (cropImageOptions2.f3403W != null && (cropImageView2 = this.f3370c) != null) {
            CropImageOptions cropImageOptions3 = this.f3369b;
            if (cropImageOptions3 == null) {
                AbstractC9133u.m16151y("cropImageOptions");
                cropImageOptions3 = null;
            }
            cropImageView2.setCropRect(cropImageOptions3.f3403W);
        }
        CropImageOptions cropImageOptions4 = this.f3369b;
        if (cropImageOptions4 == null) {
            AbstractC9133u.m16151y("cropImageOptions");
            cropImageOptions4 = null;
        }
        if (cropImageOptions4.f3404X > 0 && (cropImageView = this.f3370c) != null) {
            CropImageOptions cropImageOptions5 = this.f3369b;
            if (cropImageOptions5 == null) {
                AbstractC9133u.m16151y("cropImageOptions");
                cropImageOptions5 = null;
            }
            cropImageView.setRotatedDegrees(cropImageOptions5.f3404X);
        }
        CropImageOptions cropImageOptions6 = this.f3369b;
        if (cropImageOptions6 == null) {
            AbstractC9133u.m16151y("cropImageOptions");
        } else {
            cropImageOptions = cropImageOptions6;
        }
        if (cropImageOptions.f3424k0) {
            m3261s();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0140  */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r81) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0105  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onCreateOptionsMenu(android.view.Menu r11) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageActivity.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        AbstractC9133u.m16133g(item, "item");
        int itemId = item.getItemId();
        if (itemId == R$id.crop_image_menu_crop) {
            m3261s();
            return true;
        }
        CropImageOptions cropImageOptions = null;
        if (itemId == R$id.ic_rotate_left_24) {
            CropImageOptions cropImageOptions2 = this.f3369b;
            if (cropImageOptions2 == null) {
                AbstractC9133u.m16151y("cropImageOptions");
            } else {
                cropImageOptions = cropImageOptions2;
            }
            m3250A(-cropImageOptions.f3414f0);
            return true;
        }
        if (itemId == R$id.ic_rotate_right_24) {
            CropImageOptions cropImageOptions3 = this.f3369b;
            if (cropImageOptions3 == null) {
                AbstractC9133u.m16151y("cropImageOptions");
            } else {
                cropImageOptions = cropImageOptions3;
            }
            m3250A(cropImageOptions.f3414f0);
            return true;
        }
        if (itemId == R$id.ic_flip_24_horizontally) {
            CropImageView cropImageView = this.f3370c;
            if (cropImageView != null) {
                cropImageView.m3281f();
            }
            return true;
        }
        if (itemId == R$id.ic_flip_24_vertically) {
            CropImageView cropImageView2 = this.f3370c;
            if (cropImageView2 != null) {
                cropImageView2.m3282g();
            }
            return true;
        }
        if (itemId != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        m3254E();
        return true;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        AbstractC9133u.m16133g(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putString("bundle_key_tmp_uri", String.valueOf(this.f3372e));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        CropImageView cropImageView = this.f3370c;
        if (cropImageView != null) {
            cropImageView.setOnSetImageUriCompleteListener(this);
        }
        CropImageView cropImageView2 = this.f3370c;
        if (cropImageView2 != null) {
            cropImageView2.setOnCropImageCompleteListener(this);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        CropImageView cropImageView = this.f3370c;
        if (cropImageView != null) {
            cropImageView.setOnSetImageUriCompleteListener(null);
        }
        CropImageView cropImageView2 = this.f3370c;
        if (cropImageView2 != null) {
            cropImageView2.setOnCropImageCompleteListener(null);
        }
    }

    /* renamed from: s */
    public void m3261s() {
        CropImageOptions cropImageOptions = this.f3369b;
        CropImageOptions cropImageOptions2 = null;
        if (cropImageOptions == null) {
            AbstractC9133u.m16151y("cropImageOptions");
            cropImageOptions = null;
        }
        if (cropImageOptions.f3402V) {
            m3253D(null, null, 1);
            return;
        }
        CropImageView cropImageView = this.f3370c;
        if (cropImageView != null) {
            CropImageOptions cropImageOptions3 = this.f3369b;
            if (cropImageOptions3 == null) {
                AbstractC9133u.m16151y("cropImageOptions");
                cropImageOptions3 = null;
            }
            Bitmap.CompressFormat compressFormat = cropImageOptions3.f3397Q;
            CropImageOptions cropImageOptions4 = this.f3369b;
            if (cropImageOptions4 == null) {
                AbstractC9133u.m16151y("cropImageOptions");
                cropImageOptions4 = null;
            }
            int i10 = cropImageOptions4.f3398R;
            CropImageOptions cropImageOptions5 = this.f3369b;
            if (cropImageOptions5 == null) {
                AbstractC9133u.m16151y("cropImageOptions");
                cropImageOptions5 = null;
            }
            int i11 = cropImageOptions5.f3399S;
            CropImageOptions cropImageOptions6 = this.f3369b;
            if (cropImageOptions6 == null) {
                AbstractC9133u.m16151y("cropImageOptions");
                cropImageOptions6 = null;
            }
            int i12 = cropImageOptions6.f3400T;
            CropImageOptions cropImageOptions7 = this.f3369b;
            if (cropImageOptions7 == null) {
                AbstractC9133u.m16151y("cropImageOptions");
                cropImageOptions7 = null;
            }
            CropImageView.RequestSizeOptions requestSizeOptions = cropImageOptions7.f3401U;
            CropImageOptions cropImageOptions8 = this.f3369b;
            if (cropImageOptions8 == null) {
                AbstractC9133u.m16151y("cropImageOptions");
            } else {
                cropImageOptions2 = cropImageOptions8;
            }
            cropImageView.m3280d(compressFormat, i10, i11, i12, requestSizeOptions, cropImageOptions2.f3396P);
        }
    }

    /* renamed from: t */
    public Intent m3262t(Uri uri, Exception exc, int i10) {
        CropImageView cropImageView = this.f3370c;
        Uri imageUri = cropImageView != null ? cropImageView.getImageUri() : null;
        CropImageView cropImageView2 = this.f3370c;
        float[] cropPoints = cropImageView2 != null ? cropImageView2.getCropPoints() : null;
        CropImageView cropImageView3 = this.f3370c;
        Rect cropRect = cropImageView3 != null ? cropImageView3.getCropRect() : null;
        CropImageView cropImageView4 = this.f3370c;
        int rotatedDegrees = cropImageView4 != null ? cropImageView4.getRotatedDegrees() : 0;
        CropImageView cropImageView5 = this.f3370c;
        CropImage$ActivityResult cropImage$ActivityResult = new CropImage$ActivityResult(imageUri, uri, exc, cropPoints, cropRect, rotatedDegrees, cropImageView5 != null ? cropImageView5.getWholeImageRect() : null, i10);
        Intent intent = new Intent();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            intent.putExtras(extras);
        }
        intent.putExtra("CROP_IMAGE_EXTRA_RESULT", cropImage$ActivityResult);
        return intent;
    }

    /* renamed from: u */
    public final Uri m3263u() throws IOException {
        File fileCreateTempFile = File.createTempFile("tmp_image_file", ".png", getCacheDir());
        fileCreateTempFile.createNewFile();
        fileCreateTempFile.deleteOnExit();
        AbstractC9133u.m16130d(fileCreateTempFile);
        return AbstractC9049c.m15843b(this, fileCreateTempFile);
    }

    /* renamed from: w */
    public void m3264w(Uri uri) {
        if (uri == null) {
            m3254E();
            return;
        }
        this.f3368a = uri;
        CropImageView cropImageView = this.f3370c;
        if (cropImageView != null) {
            cropImageView.setImageUriAsync(uri);
        }
    }

    /* renamed from: x */
    public final void m3265x() throws IOException {
        Uri uriM3263u = m3263u();
        this.f3372e = uriM3263u;
        this.f3374g.launch(uriM3263u);
    }

    /* renamed from: y */
    public final void m3266y(Source source) throws IOException {
        int i10 = C5467b.f3379a[source.ordinal()];
        if (i10 == 1) {
            m3265x();
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.f3373f.launch("image/*");
        }
    }
}
