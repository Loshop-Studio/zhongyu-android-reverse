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
import androidx.compose.runtime.ComposerKt;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.BlendModeColorFilterCompat;
import androidx.core.graphics.BlendModeCompat;
import com.blankj.utilcode.constant.PermissionConstants;
import com.canhub.cropper.C5905c;
import com.canhub.cropper.CropImageActivity;
import com.canhub.cropper.CropImageView;
import com.canhub.cropper.databinding.CropImageActivityBinding;
import java.io.File;
import java.io.IOException;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.AbstractC9953a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p157g1.AbstractC9260c;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import p310qd.AbstractC10793c0;
import p425yc.InterfaceC11943a;

@InterfaceC10770a
/* loaded from: classes3.dex */
public class CropImageActivity extends AppCompatActivity implements CropImageView.InterfaceC5896g, CropImageView.InterfaceC5892c {

    /* renamed from: j */
    public static final C5885a f5137j = new C5885a(null);

    /* renamed from: c */
    public Uri f5138c;

    /* renamed from: d */
    public CropImageOptions f5139d;

    /* renamed from: e */
    public CropImageView f5140e;

    /* renamed from: f */
    public CropImageActivityBinding f5141f;

    /* renamed from: g */
    public Uri f5142g;

    /* renamed from: h */
    public final ActivityResultLauncher f5143h = registerForActivityResult(new ActivityResultContracts.GetContent(), new ActivityResultCallback() { // from class: f1.b
        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            CropImageActivity.m4448W(this.f21389a, (Uri) obj);
        }
    });

    /* renamed from: i */
    public final ActivityResultLauncher f5144i = registerForActivityResult(new ActivityResultContracts.TakePicture(), new ActivityResultCallback() { // from class: f1.c
        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            CropImageActivity.m4451g0(this.f21390a, ((Boolean) obj).booleanValue());
        }
    });

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Source {

        /* renamed from: c */
        public static final Source f5145c = new Source(PermissionConstants.CAMERA, 0);

        /* renamed from: d */
        public static final Source f5146d = new Source("GALLERY", 1);

        /* renamed from: e */
        public static final /* synthetic */ Source[] f5147e;

        /* renamed from: f */
        public static final /* synthetic */ InterfaceC11943a f5148f;

        static {
            Source[] sourceArrM4468a = m4468a();
            f5147e = sourceArrM4468a;
            f5148f = AbstractC9953a.m20230a(sourceArrM4468a);
        }

        public Source(String str, int i10) {
        }

        /* renamed from: a */
        public static final /* synthetic */ Source[] m4468a() {
            return new Source[]{f5145c, f5146d};
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) f5147e.clone();
        }
    }

    /* renamed from: com.canhub.cropper.CropImageActivity$a */
    public static final class C5885a {
        public /* synthetic */ C5885a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C5885a() {
        }
    }

    /* renamed from: com.canhub.cropper.CropImageActivity$b */
    public /* synthetic */ class C5886b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5149a;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.f5145c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.f5146d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f5149a = iArr;
        }
    }

    /* renamed from: com.canhub.cropper.CropImageActivity$c */
    public static final class C5887c implements C5905c.b {
        public C5887c() {
        }

        @Override // com.canhub.cropper.C5905c.b
        /* renamed from: a */
        public void mo4469a(Uri uri) {
            CropImageActivity.this.m4455T(uri);
        }

        @Override // com.canhub.cropper.C5905c.b
        /* renamed from: b */
        public void mo4470b() {
            CropImageActivity.this.m4462b0();
        }
    }

    /* renamed from: com.canhub.cropper.CropImageActivity$onCreate$1 */
    public /* synthetic */ class C58881 extends FunctionReferenceImpl implements InterfaceC9540l {
        public C58881(Object obj) {
            super(1, obj, CropImageActivity.class, "openSource", "openSource(Lcom/canhub/cropper/CropImageActivity$Source;)V", 0);
        }

        /* renamed from: g */
        public final void m4471g(Source p02) throws IOException {
            AbstractC9979u.m20294g(p02, "p0");
            ((CropImageActivity) this.receiver).m4457V(p02);
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws IOException {
            m4471g((Source) obj);
            return C10786q.f26013a;
        }
    }

    /* renamed from: S */
    public static final C10786q m4447S(CropImageActivity this$0, OnBackPressedCallback addCallback) {
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(addCallback, "$this$addCallback");
        this$0.m4462b0();
        return C10786q.f26013a;
    }

    /* renamed from: W */
    public static final void m4448W(CropImageActivity this$0, Uri uri) {
        AbstractC9979u.m20294g(this$0, "this$0");
        this$0.m4455T(uri);
    }

    /* renamed from: d0 */
    public static final boolean m4449d0(CropImageActivity this$0, DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        AbstractC9979u.m20294g(this$0, "this$0");
        if (i10 == 4 && keyEvent.getAction() == 1) {
            this$0.m4462b0();
            this$0.finish();
        }
        return true;
    }

    /* renamed from: e0 */
    public static final void m4450e0(InterfaceC9540l openSource, DialogInterface dialogInterface, int i10) {
        AbstractC9979u.m20294g(openSource, "$openSource");
        openSource.invoke(i10 == 0 ? Source.f5145c : Source.f5146d);
    }

    /* renamed from: g0 */
    public static final void m4451g0(CropImageActivity this$0, boolean z10) {
        AbstractC9979u.m20294g(this$0, "this$0");
        if (z10) {
            this$0.m4455T(this$0.f5142g);
        } else {
            this$0.m4455T(null);
        }
    }

    /* renamed from: P */
    public void m4452P() {
        CropImageOptions cropImageOptions = this.f5139d;
        CropImageOptions cropImageOptions2 = null;
        if (cropImageOptions == null) {
            AbstractC9979u.m20312y("cropImageOptions");
            cropImageOptions = null;
        }
        if (cropImageOptions.f5174X) {
            m4461a0(null, null, 1);
            return;
        }
        CropImageView cropImageView = this.f5140e;
        if (cropImageView != null) {
            CropImageOptions cropImageOptions3 = this.f5139d;
            if (cropImageOptions3 == null) {
                AbstractC9979u.m20312y("cropImageOptions");
                cropImageOptions3 = null;
            }
            Bitmap.CompressFormat compressFormat = cropImageOptions3.f5169S;
            CropImageOptions cropImageOptions4 = this.f5139d;
            if (cropImageOptions4 == null) {
                AbstractC9979u.m20312y("cropImageOptions");
                cropImageOptions4 = null;
            }
            int i10 = cropImageOptions4.f5170T;
            CropImageOptions cropImageOptions5 = this.f5139d;
            if (cropImageOptions5 == null) {
                AbstractC9979u.m20312y("cropImageOptions");
                cropImageOptions5 = null;
            }
            int i11 = cropImageOptions5.f5171U;
            CropImageOptions cropImageOptions6 = this.f5139d;
            if (cropImageOptions6 == null) {
                AbstractC9979u.m20312y("cropImageOptions");
                cropImageOptions6 = null;
            }
            int i12 = cropImageOptions6.f5172V;
            CropImageOptions cropImageOptions7 = this.f5139d;
            if (cropImageOptions7 == null) {
                AbstractC9979u.m20312y("cropImageOptions");
                cropImageOptions7 = null;
            }
            CropImageView.RequestSizeOptions requestSizeOptions = cropImageOptions7.f5173W;
            CropImageOptions cropImageOptions8 = this.f5139d;
            if (cropImageOptions8 == null) {
                AbstractC9979u.m20312y("cropImageOptions");
            } else {
                cropImageOptions2 = cropImageOptions8;
            }
            cropImageView.m4481d(compressFormat, i10, i11, i12, requestSizeOptions, cropImageOptions2.f5168R);
        }
    }

    /* renamed from: Q */
    public Intent m4453Q(Uri uri, Exception exc, int i10) {
        CropImageView cropImageView = this.f5140e;
        Uri imageUri = cropImageView != null ? cropImageView.getImageUri() : null;
        CropImageView cropImageView2 = this.f5140e;
        float[] cropPoints = cropImageView2 != null ? cropImageView2.getCropPoints() : null;
        CropImageView cropImageView3 = this.f5140e;
        Rect cropRect = cropImageView3 != null ? cropImageView3.getCropRect() : null;
        CropImageView cropImageView4 = this.f5140e;
        int rotatedDegrees = cropImageView4 != null ? cropImageView4.getRotatedDegrees() : 0;
        CropImageView cropImageView5 = this.f5140e;
        CropImage$ActivityResult cropImage$ActivityResult = new CropImage$ActivityResult(imageUri, uri, exc, cropPoints, cropRect, rotatedDegrees, cropImageView5 != null ? cropImageView5.getWholeImageRect() : null, i10);
        Intent intent = new Intent();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            intent.putExtras(extras);
        }
        intent.putExtra("CROP_IMAGE_EXTRA_RESULT", cropImage$ActivityResult);
        return intent;
    }

    /* renamed from: R */
    public final Uri m4454R() throws IOException {
        File fileCreateTempFile = File.createTempFile("tmp_image_file", ".png", getCacheDir());
        fileCreateTempFile.createNewFile();
        fileCreateTempFile.deleteOnExit();
        AbstractC9979u.m20291d(fileCreateTempFile);
        return AbstractC9260c.m18257b(this, fileCreateTempFile);
    }

    /* renamed from: T */
    public void m4455T(Uri uri) {
        if (uri == null) {
            m4462b0();
            return;
        }
        this.f5138c = uri;
        CropImageView cropImageView = this.f5140e;
        if (cropImageView != null) {
            cropImageView.setImageUriAsync(uri);
        }
    }

    /* renamed from: U */
    public final void m4456U() throws IOException {
        Uri uriM4454R = m4454R();
        this.f5142g = uriM4454R;
        this.f5144i.launch(uriM4454R);
    }

    /* renamed from: V */
    public final void m4457V(Source source) throws IOException {
        int i10 = C5886b.f5149a[source.ordinal()];
        if (i10 == 1) {
            m4456U();
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.f5143h.launch("image/*");
        }
    }

    /* renamed from: X */
    public void m4458X(int i10) {
        CropImageView cropImageView = this.f5140e;
        if (cropImageView != null) {
            cropImageView.m4489n(i10);
        }
    }

    /* renamed from: Y */
    public void m4459Y(CropImageView cropImageView) {
        AbstractC9979u.m20294g(cropImageView, "cropImageView");
        this.f5140e = cropImageView;
    }

    /* renamed from: Z */
    public final void m4460Z() {
        CropImageOptions cropImageOptions = this.f5139d;
        CropImageOptions cropImageOptions2 = null;
        if (cropImageOptions == null) {
            AbstractC9979u.m20312y("cropImageOptions");
            cropImageOptions = null;
        }
        int i10 = cropImageOptions.f5210t0;
        CropImageActivityBinding cropImageActivityBinding = this.f5141f;
        if (cropImageActivityBinding == null) {
            AbstractC9979u.m20312y("binding");
            cropImageActivityBinding = null;
        }
        cropImageActivityBinding.getRoot().setBackgroundColor(i10);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            CropImageOptions cropImageOptions3 = this.f5139d;
            if (cropImageOptions3 == null) {
                AbstractC9979u.m20312y("cropImageOptions");
                cropImageOptions3 = null;
            }
            CharSequence charSequence = cropImageOptions3.f5165O;
            if (charSequence.length() == 0) {
                charSequence = "";
            }
            setTitle(charSequence);
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            CropImageOptions cropImageOptions4 = this.f5139d;
            if (cropImageOptions4 == null) {
                AbstractC9979u.m20312y("cropImageOptions");
                cropImageOptions4 = null;
            }
            Integer num = cropImageOptions4.f5212u0;
            if (num != null) {
                supportActionBar.setBackgroundDrawable(new ColorDrawable(num.intValue()));
            }
            CropImageOptions cropImageOptions5 = this.f5139d;
            if (cropImageOptions5 == null) {
                AbstractC9979u.m20312y("cropImageOptions");
                cropImageOptions5 = null;
            }
            Integer num2 = cropImageOptions5.f5214v0;
            if (num2 != null) {
                int iIntValue = num2.intValue();
                SpannableString spannableString = new SpannableString(getTitle());
                spannableString.setSpan(new ForegroundColorSpan(iIntValue), 0, spannableString.length(), 33);
                setTitle(spannableString);
            }
            CropImageOptions cropImageOptions6 = this.f5139d;
            if (cropImageOptions6 == null) {
                AbstractC9979u.m20312y("cropImageOptions");
            } else {
                cropImageOptions2 = cropImageOptions6;
            }
            Integer num3 = cropImageOptions2.f5216w0;
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

    /* renamed from: a0 */
    public void m4461a0(Uri uri, Exception exc, int i10) {
        setResult(exc != null ? ComposerKt.providerMapsKey : -1, m4453Q(uri, exc, i10));
        finish();
    }

    /* renamed from: b0 */
    public void m4462b0() {
        setResult(0);
        finish();
    }

    /* renamed from: c0 */
    public void m4463c0(final InterfaceC9540l openSource) {
        AbstractC9979u.m20294g(openSource, "openSource");
        new AlertDialog.Builder(this).setCancelable(false).setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: f1.e
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                return CropImageActivity.m4449d0(this.f21392c, dialogInterface, i10, keyEvent);
            }
        }).setTitle(R$string.pick_image_chooser_title).setItems(new String[]{getString(R$string.pick_image_camera), getString(R$string.pick_image_gallery)}, new DialogInterface.OnClickListener() { // from class: f1.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                CropImageActivity.m4450e0(openSource, dialogInterface, i10);
            }
        }).show();
    }

    /* renamed from: f0 */
    public final void m4464f0() {
        C5905c c5905c = new C5905c(this, new C5887c());
        CropImageOptions cropImageOptions = this.f5139d;
        if (cropImageOptions == null) {
            AbstractC9979u.m20312y("cropImageOptions");
            cropImageOptions = null;
        }
        String str = cropImageOptions.f5200o0;
        if (str != null) {
            if (AbstractC10793c0.m23132h0(str)) {
                str = null;
            }
            if (str != null) {
                c5905c.m4606g(str);
            }
        }
        List list = cropImageOptions.f5202p0;
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                c5905c.m4607h(list);
            }
        }
        c5905c.m4608i(cropImageOptions.f5178d, cropImageOptions.f5177c, cropImageOptions.f5178d ? m4454R() : null);
    }

    /* renamed from: h0 */
    public void m4465h0(Menu menu, int i10, int i11) {
        Drawable icon;
        AbstractC9979u.m20294g(menu, "menu");
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

    /* renamed from: i0 */
    public void m4466i0(Menu menu, int i10, int i11) {
        CharSequence title;
        AbstractC9979u.m20294g(menu, "menu");
        MenuItem menuItemFindItem = menu.findItem(i10);
        if (menuItemFindItem == null || (title = menuItemFindItem.getTitle()) == null || !(!AbstractC10793c0.m23132h0(title))) {
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
        AbstractC9979u.m20294g(item, "item");
        int itemId = item.getItemId();
        if (itemId == R$id.crop_image_menu_crop) {
            m4452P();
            return true;
        }
        CropImageOptions cropImageOptions = null;
        if (itemId == R$id.ic_rotate_left_24) {
            CropImageOptions cropImageOptions2 = this.f5139d;
            if (cropImageOptions2 == null) {
                AbstractC9979u.m20312y("cropImageOptions");
            } else {
                cropImageOptions = cropImageOptions2;
            }
            m4458X(-cropImageOptions.f5186h0);
            return true;
        }
        if (itemId == R$id.ic_rotate_right_24) {
            CropImageOptions cropImageOptions3 = this.f5139d;
            if (cropImageOptions3 == null) {
                AbstractC9979u.m20312y("cropImageOptions");
            } else {
                cropImageOptions = cropImageOptions3;
            }
            m4458X(cropImageOptions.f5186h0);
            return true;
        }
        if (itemId == R$id.ic_flip_24_horizontally) {
            CropImageView cropImageView = this.f5140e;
            if (cropImageView != null) {
                cropImageView.m4482f();
            }
            return true;
        }
        if (itemId == R$id.ic_flip_24_vertically) {
            CropImageView cropImageView2 = this.f5140e;
            if (cropImageView2 != null) {
                cropImageView2.m4483g();
            }
            return true;
        }
        if (itemId != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        m4462b0();
        return true;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        AbstractC9979u.m20294g(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putString("bundle_key_tmp_uri", String.valueOf(this.f5142g));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        CropImageView cropImageView = this.f5140e;
        if (cropImageView != null) {
            cropImageView.setOnSetImageUriCompleteListener(this);
        }
        CropImageView cropImageView2 = this.f5140e;
        if (cropImageView2 != null) {
            cropImageView2.setOnCropImageCompleteListener(this);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        CropImageView cropImageView = this.f5140e;
        if (cropImageView != null) {
            cropImageView.setOnSetImageUriCompleteListener(null);
        }
        CropImageView cropImageView2 = this.f5140e;
        if (cropImageView2 != null) {
            cropImageView2.setOnCropImageCompleteListener(null);
        }
    }

    @Override // com.canhub.cropper.CropImageView.InterfaceC5892c
    /* renamed from: q */
    public void mo4467q(CropImageView view, CropImageView.C5891b result) {
        AbstractC9979u.m20294g(view, "view");
        AbstractC9979u.m20294g(result, "result");
        m4461a0(result.m4508j(), result.m4504c(), result.m4507i());
    }

    @Override // com.canhub.cropper.CropImageView.InterfaceC5896g
    /* renamed from: v */
    public void mo2667v(CropImageView view, Uri uri, Exception exc) {
        CropImageView cropImageView;
        CropImageView cropImageView2;
        AbstractC9979u.m20294g(view, "view");
        AbstractC9979u.m20294g(uri, "uri");
        CropImageOptions cropImageOptions = null;
        if (exc != null) {
            m4461a0(null, exc, 1);
            return;
        }
        CropImageOptions cropImageOptions2 = this.f5139d;
        if (cropImageOptions2 == null) {
            AbstractC9979u.m20312y("cropImageOptions");
            cropImageOptions2 = null;
        }
        if (cropImageOptions2.f5175Y != null && (cropImageView2 = this.f5140e) != null) {
            CropImageOptions cropImageOptions3 = this.f5139d;
            if (cropImageOptions3 == null) {
                AbstractC9979u.m20312y("cropImageOptions");
                cropImageOptions3 = null;
            }
            cropImageView2.setCropRect(cropImageOptions3.f5175Y);
        }
        CropImageOptions cropImageOptions4 = this.f5139d;
        if (cropImageOptions4 == null) {
            AbstractC9979u.m20312y("cropImageOptions");
            cropImageOptions4 = null;
        }
        if (cropImageOptions4.f5176Z > 0 && (cropImageView = this.f5140e) != null) {
            CropImageOptions cropImageOptions5 = this.f5139d;
            if (cropImageOptions5 == null) {
                AbstractC9979u.m20312y("cropImageOptions");
                cropImageOptions5 = null;
            }
            cropImageView.setRotatedDegrees(cropImageOptions5.f5176Z);
        }
        CropImageOptions cropImageOptions6 = this.f5139d;
        if (cropImageOptions6 == null) {
            AbstractC9979u.m20312y("cropImageOptions");
        } else {
            cropImageOptions = cropImageOptions6;
        }
        if (cropImageOptions.f5196m0) {
            m4452P();
        }
    }
}
