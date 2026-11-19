package com.canhub.cropper;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.result.ActivityResultCallback;
import android.view.result.ActivityResultLauncher;
import android.view.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.BlendModeColorFilterCompat;
import androidx.core.graphics.BlendModeCompat;
import com.canhub.cropper.CropImageView;
import com.canhub.cropper.databinding.CropImageActivityBinding;
import java.io.File;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.AbstractC5817a;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p000a.AbstractC0000a;
import p045d6.C5443s;
import p092j6.InterfaceC5748a;
import p152r6.InterfaceC6471c;

@Deprecated(message = "\n  Create your own Activity and use the CropImageView directly.\n  This way you can customize everything and have utter control of everything.\n  Feel free to use this Activity Code to create your own Activity.\n")
@Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m5110d2 = {"Lcom/canhub/cropper/CropImageActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/canhub/cropper/z;", "Lcom/canhub/cropper/v;", "<init>", "()V", "Source", "cropper_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCropImageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropImageActivity.kt\ncom/canhub/cropper/CropImageActivity\n+ 2 ParcelableUtils.kt\ncom/canhub/cropper/ParcelableUtilsKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,488:1\n7#2,5:489\n7#2,5:494\n29#3:499\n1#4:500\n*S KotlinDebug\n*F\n+ 1 CropImageActivity.kt\ncom/canhub/cropper/CropImageActivity\n*L\n73#1:489,5\n75#1:494,5\n94#1:499\n*E\n"})
/* loaded from: classes2.dex */
public class CropImageActivity extends AppCompatActivity implements InterfaceC3455z, InterfaceC3451v {

    /* renamed from: h */
    public static final /* synthetic */ int f2361h = 0;

    /* renamed from: a */
    public Uri f2362a;

    /* renamed from: b */
    public CropImageOptions f2363b;

    /* renamed from: c */
    public CropImageView f2364c;

    /* renamed from: d */
    public CropImageActivityBinding f2365d;

    /* renamed from: e */
    public Uri f2366e;

    /* renamed from: f */
    public final ActivityResultLauncher f2367f;

    /* renamed from: g */
    public final ActivityResultLauncher f2368g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, m5110d2 = {"Lcom/canhub/cropper/CropImageActivity$Source;", "", "CAMERA", "GALLERY", "cropper_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Source {
        public static final Source CAMERA;
        public static final Source GALLERY;

        /* renamed from: a */
        public static final /* synthetic */ Source[] f2369a;

        /* renamed from: b */
        public static final /* synthetic */ InterfaceC5748a f2370b;

        static {
            Source source = new Source("CAMERA", 0);
            CAMERA = source;
            Source source2 = new Source("GALLERY", 1);
            GALLERY = source2;
            Source[] sourceArr = {source, source2};
            f2369a = sourceArr;
            f2370b = AbstractC5817a.m5310a(sourceArr);
        }

        @NotNull
        public static InterfaceC5748a getEntries() {
            return f2370b;
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) f2369a.clone();
        }
    }

    @Metadata(m5111k = 3, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: com.canhub.cropper.CropImageActivity$onCreate$1 */
    final /* synthetic */ class C34221 extends FunctionReferenceImpl implements InterfaceC6471c {
        public C34221(Object obj) {
            super(1, obj, CropImageActivity.class, "openSource", "openSource(Lcom/canhub/cropper/CropImageActivity$Source;)V", 0);
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            invoke((Source) obj);
            return C5443s.f8405a;
        }

        public final void invoke(Source p0) throws Throwable {
            AbstractC5830k.m5330g(p0, "p0");
            CropImageActivity cropImageActivity = (CropImageActivity) this.receiver;
            int i = CropImageActivity.f2361h;
            cropImageActivity.getClass();
            int i8 = AbstractC3446q.f2616a[p0.ordinal()];
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                cropImageActivity.f2367f.launch("image/*");
            } else {
                File fileCreateTempFile = File.createTempFile("tmp_image_file", ".png", cropImageActivity.getCacheDir());
                fileCreateTempFile.createNewFile();
                fileCreateTempFile.deleteOnExit();
                Uri uriM10k = AbstractC0000a.m10k(cropImageActivity, fileCreateTempFile);
                cropImageActivity.f2366e = uriM10k;
                cropImageActivity.f2368g.launch(uriM10k);
            }
        }
    }

    public CropImageActivity() {
        final int i = 0;
        this.f2367f = registerForActivityResult(new ActivityResultContracts.GetContent(), new ActivityResultCallback(this) { // from class: com.canhub.cropper.n

            /* renamed from: b */
            public final /* synthetic */ CropImageActivity f2612b;

            {
                this.f2612b = this;
            }

            @Override // android.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                int i8 = i;
                CropImageActivity cropImageActivity = this.f2612b;
                switch (i8) {
                    case 0:
                        Uri uri = (Uri) obj;
                        int i9 = CropImageActivity.f2361h;
                        if (uri != null) {
                            cropImageActivity.f2362a = uri;
                            CropImageView cropImageView = cropImageActivity.f2364c;
                            if (cropImageView != null) {
                                cropImageView.setImageUriAsync(uri);
                                break;
                            }
                        } else {
                            cropImageActivity.m2435q();
                            break;
                        }
                        break;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i10 = CropImageActivity.f2361h;
                        if (!zBooleanValue) {
                            cropImageActivity.m2435q();
                            break;
                        } else {
                            Uri uri2 = cropImageActivity.f2366e;
                            if (uri2 != null) {
                                cropImageActivity.f2362a = uri2;
                                CropImageView cropImageView2 = cropImageActivity.f2364c;
                                if (cropImageView2 != null) {
                                    cropImageView2.setImageUriAsync(uri2);
                                    break;
                                }
                            } else {
                                cropImageActivity.m2435q();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        final int i8 = 1;
        this.f2368g = registerForActivityResult(new ActivityResultContracts.TakePicture(), new ActivityResultCallback(this) { // from class: com.canhub.cropper.n

            /* renamed from: b */
            public final /* synthetic */ CropImageActivity f2612b;

            {
                this.f2612b = this;
            }

            @Override // android.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                int i82 = i8;
                CropImageActivity cropImageActivity = this.f2612b;
                switch (i82) {
                    case 0:
                        Uri uri = (Uri) obj;
                        int i9 = CropImageActivity.f2361h;
                        if (uri != null) {
                            cropImageActivity.f2362a = uri;
                            CropImageView cropImageView = cropImageActivity.f2364c;
                            if (cropImageView != null) {
                                cropImageView.setImageUriAsync(uri);
                                break;
                            }
                        } else {
                            cropImageActivity.m2435q();
                            break;
                        }
                        break;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i10 = CropImageActivity.f2361h;
                        if (!zBooleanValue) {
                            cropImageActivity.m2435q();
                            break;
                        } else {
                            Uri uri2 = cropImageActivity.f2366e;
                            if (uri2 != null) {
                                cropImageActivity.f2362a = uri2;
                                CropImageView cropImageView2 = cropImageActivity.f2364c;
                                if (cropImageView2 != null) {
                                    cropImageView2.setImageUriAsync(uri2);
                                    break;
                                }
                            } else {
                                cropImageActivity.m2435q();
                                break;
                            }
                        }
                        break;
                }
            }
        });
    }

    /* renamed from: r */
    public static void m2432r(Menu menu, int i, int i8) {
        Drawable icon;
        MenuItem menuItemFindItem = menu.findItem(i);
        if (menuItemFindItem == null || (icon = menuItemFindItem.getIcon()) == null) {
            return;
        }
        try {
            icon.mutate();
            icon.setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(i8, BlendModeCompat.SRC_ATOP));
            menuItemFindItem.setIcon(icon);
        } catch (Exception e) {
            Log.w("AIC", "Failed to update menu item color", e);
        }
    }

    /* renamed from: o */
    public final void m2433o() {
        CropImageOptions cropImageOptions = this.f2363b;
        if (cropImageOptions == null) {
            AbstractC5830k.m5339p("cropImageOptions");
            throw null;
        }
        if (cropImageOptions.f2392V) {
            m2434p(null, null, 1);
            return;
        }
        CropImageView cropImageView = this.f2364c;
        if (cropImageView != null) {
            if (cropImageOptions == null) {
                AbstractC5830k.m5339p("cropImageOptions");
                throw null;
            }
            Bitmap.CompressFormat compressFormat = cropImageOptions.f2387Q;
            if (cropImageOptions == null) {
                AbstractC5830k.m5339p("cropImageOptions");
                throw null;
            }
            int i = cropImageOptions.f2388R;
            if (cropImageOptions == null) {
                AbstractC5830k.m5339p("cropImageOptions");
                throw null;
            }
            int i8 = cropImageOptions.f2389S;
            if (cropImageOptions == null) {
                AbstractC5830k.m5339p("cropImageOptions");
                throw null;
            }
            int i9 = cropImageOptions.f2390T;
            if (cropImageOptions == null) {
                AbstractC5830k.m5339p("cropImageOptions");
                throw null;
            }
            CropImageView.RequestSizeOptions requestSizeOptions = cropImageOptions.f2391U;
            if (cropImageOptions != null) {
                cropImageView.m2438c(compressFormat, i, i8, i9, requestSizeOptions, cropImageOptions.f2386P);
            } else {
                AbstractC5830k.m5339p("cropImageOptions");
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0211  */
    @Override // androidx.fragment.app.FragmentActivity, android.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r50) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 921
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014e  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onCreateOptionsMenu(android.view.Menu r12) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageActivity.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    @Override // com.canhub.cropper.InterfaceC3451v
    public final void onCropImageComplete(CropImageView cropImageView, C3450u c3450u) {
        m2434p(c3450u.f2631b, c3450u.f2632c, c3450u.f2637h);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        AbstractC5830k.m5330g(item, "item");
        int itemId = item.getItemId();
        if (itemId == R$id.crop_image_menu_crop) {
            m2433o();
            return true;
        }
        if (itemId == R$id.ic_rotate_left_24) {
            CropImageOptions cropImageOptions = this.f2363b;
            if (cropImageOptions == null) {
                AbstractC5830k.m5339p("cropImageOptions");
                throw null;
            }
            int i = -cropImageOptions.f2402d0;
            CropImageView cropImageView = this.f2364c;
            if (cropImageView != null) {
                cropImageView.m2441f(i);
                return true;
            }
        } else if (itemId == R$id.ic_rotate_right_24) {
            CropImageOptions cropImageOptions2 = this.f2363b;
            if (cropImageOptions2 == null) {
                AbstractC5830k.m5339p("cropImageOptions");
                throw null;
            }
            int i8 = cropImageOptions2.f2402d0;
            CropImageView cropImageView2 = this.f2364c;
            if (cropImageView2 != null) {
                cropImageView2.m2441f(i8);
                return true;
            }
        } else if (itemId == R$id.ic_flip_24_horizontally) {
            CropImageView cropImageView3 = this.f2364c;
            if (cropImageView3 != null) {
                cropImageView3.f2466l = !cropImageView3.f2466l;
                cropImageView3.m2436a(cropImageView3.getWidth(), cropImageView3.getHeight(), true, false);
                return true;
            }
        } else {
            if (itemId != R$id.ic_flip_24_vertically) {
                if (itemId != 16908332) {
                    return super.onOptionsItemSelected(item);
                }
                m2435q();
                return true;
            }
            CropImageView cropImageView4 = this.f2364c;
            if (cropImageView4 != null) {
                cropImageView4.f2467m = !cropImageView4.f2467m;
                cropImageView4.m2436a(cropImageView4.getWidth(), cropImageView4.getHeight(), true, false);
            }
        }
        return true;
    }

    @Override // android.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        AbstractC5830k.m5330g(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putString("bundle_key_tmp_uri", String.valueOf(this.f2366e));
    }

    @Override // com.canhub.cropper.InterfaceC3455z
    public final void onSetImageUriComplete(CropImageView cropImageView, Uri uri, Exception exc) {
        CropImageView cropImageView2;
        CropImageView cropImageView3;
        if (exc != null) {
            m2434p(null, exc, 1);
            return;
        }
        CropImageOptions cropImageOptions = this.f2363b;
        if (cropImageOptions == null) {
            AbstractC5830k.m5339p("cropImageOptions");
            throw null;
        }
        Rect rect = cropImageOptions.f2393W;
        if (rect != null && (cropImageView3 = this.f2364c) != null) {
            cropImageView3.setCropRect(rect);
        }
        CropImageOptions cropImageOptions2 = this.f2363b;
        if (cropImageOptions2 == null) {
            AbstractC5830k.m5339p("cropImageOptions");
            throw null;
        }
        int i = cropImageOptions2.f2394X;
        if (i > 0 && (cropImageView2 = this.f2364c) != null) {
            cropImageView2.setRotatedDegrees(i);
        }
        CropImageOptions cropImageOptions3 = this.f2363b;
        if (cropImageOptions3 == null) {
            AbstractC5830k.m5339p("cropImageOptions");
            throw null;
        }
        if (cropImageOptions3.f2412i0) {
            m2433o();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        CropImageView cropImageView = this.f2364c;
        if (cropImageView != null) {
            cropImageView.setOnSetImageUriCompleteListener(this);
        }
        CropImageView cropImageView2 = this.f2364c;
        if (cropImageView2 != null) {
            cropImageView2.setOnCropImageCompleteListener(this);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        CropImageView cropImageView = this.f2364c;
        if (cropImageView != null) {
            cropImageView.setOnSetImageUriCompleteListener(null);
        }
        CropImageView cropImageView2 = this.f2364c;
        if (cropImageView2 != null) {
            cropImageView2.setOnCropImageCompleteListener(null);
        }
    }

    /* renamed from: p */
    public final void m2434p(Uri uri, Exception exc, int i) {
        int i8 = exc != null ? ComposerKt.providerMapsKey : -1;
        CropImageView cropImageView = this.f2364c;
        Uri imageUri = cropImageView != null ? cropImageView.getImageUri() : null;
        CropImageView cropImageView2 = this.f2364c;
        float[] cropPoints = cropImageView2 != null ? cropImageView2.getCropPoints() : null;
        CropImageView cropImageView3 = this.f2364c;
        Rect cropRect = cropImageView3 != null ? cropImageView3.getCropRect() : null;
        CropImageView cropImageView4 = this.f2364c;
        int f2465k = cropImageView4 != null ? cropImageView4.getF2465k() : 0;
        CropImageView cropImageView5 = this.f2364c;
        Rect wholeImageRect = cropImageView5 != null ? cropImageView5.getWholeImageRect() : null;
        AbstractC5830k.m5327d(cropPoints);
        CropImage$ActivityResult cropImage$ActivityResult = new CropImage$ActivityResult(imageUri, uri, exc, cropPoints, cropRect, wholeImageRect, f2465k, i);
        Intent intent = new Intent();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            intent.putExtras(extras);
        }
        intent.putExtra("CROP_IMAGE_EXTRA_RESULT", cropImage$ActivityResult);
        setResult(i8, intent);
        finish();
    }

    /* renamed from: q */
    public final void m2435q() {
        setResult(0);
        finish();
    }
}
