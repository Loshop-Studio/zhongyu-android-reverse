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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.BlendModeColorFilterCompat;
import androidx.core.graphics.BlendModeCompat;
import androidx.exifinterface.media.ExifInterface;
import com.blankj.utilcode.constant.PermissionConstants;
import com.canhub.cropper.C5437c;
import com.canhub.cropper.CropImageActivity;
import com.canhub.cropper.CropImageView;
import com.canhub.cropper.databinding.CropImageActivityBinding;
import java.io.File;
import java.io.IOException;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p152l1.AbstractC8489c;

@Deprecated(message = "\n  Create your own Activity and use the CropImageView directly.\n  This way you can customize everything and have utter control of everything.\n  Feel free to use this Activity Code to create your own Activity.\n")
@Metadata(m13557d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0017\u0018\u0000 ]2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002^3B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\u00020\u00062\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u0005J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u0005J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u001c\u0010\u0014J\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b'\u0010(J/\u0010/\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u000e2\u000e\u0010.\u001a\n\u0018\u00010,j\u0004\u0018\u0001`-H\u0016¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0006H\u0016¢\u0006\u0004\b5\u0010\u0005J\u0017\u00107\u001a\u00020\u00062\u0006\u00106\u001a\u00020)H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\u00062\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J1\u0010>\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010\u000e2\u000e\u0010.\u001a\n\u0018\u00010,j\u0004\u0018\u0001`-2\u0006\u0010=\u001a\u000209H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0006H\u0016¢\u0006\u0004\b@\u0010\u0005J1\u0010B\u001a\u00020A2\b\u0010+\u001a\u0004\u0018\u00010\u000e2\u000e\u0010.\u001a\n\u0018\u00010,j\u0004\u0018\u0001`-2\u0006\u0010=\u001a\u000209H\u0016¢\u0006\u0004\bB\u0010CJ'\u0010F\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010D\u001a\u0002092\u0006\u0010E\u001a\u000209H\u0016¢\u0006\u0004\bF\u0010GJ'\u0010H\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010D\u001a\u0002092\u0006\u0010E\u001a\u000209H\u0016¢\u0006\u0004\bH\u0010GR\u0018\u0010J\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010IR\u0016\u0010M\u001a\u00020K8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u0010LR\u0018\u00106\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010S\u001a\u00020P8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010U\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010IR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020W0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u000e0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010Y¨\u0006_"}, m13558d2 = {"Lcom/canhub/cropper/CropImageActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/canhub/cropper/CropImageView$g;", "Lcom/canhub/cropper/CropImageView$c;", "<init>", "()V", "", "C", "I", "Lcom/canhub/cropper/CropImageActivity$Source;", "source", "y", "(Lcom/canhub/cropper/CropImageActivity$Source;)V", "x", "Landroid/net/Uri;", "u", "()Landroid/net/Uri;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lkotlin/Function1;", "openSource", "F", "(Lkotlin/jvm/functions/Function1;)V", "onStart", "onStop", "outState", "onSaveInstanceState", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "resultUri", "w", "(Landroid/net/Uri;)V", "Lcom/canhub/cropper/CropImageView;", "view", "uri", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "b", "(Lcom/canhub/cropper/CropImageView;Landroid/net/Uri;Ljava/lang/Exception;)V", "Lcom/canhub/cropper/CropImageView$b;", "result", "a", "(Lcom/canhub/cropper/CropImageView;Lcom/canhub/cropper/CropImageView$b;)V", "s", "cropImageView", "B", "(Lcom/canhub/cropper/CropImageView;)V", "", "degrees", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "(I)V", "sampleSize", "D", "(Landroid/net/Uri;Ljava/lang/Exception;I)V", ExifInterface.LONGITUDE_EAST, "Landroid/content/Intent;", "t", "(Landroid/net/Uri;Ljava/lang/Exception;I)Landroid/content/Intent;", "itemId", TypedValues.Custom.S_COLOR, "K", "(Landroid/view/Menu;II)V", "L", "Landroid/net/Uri;", "cropImageUri", "Lcom/canhub/cropper/CropImageOptions;", "Lcom/canhub/cropper/CropImageOptions;", "cropImageOptions", "c", "Lcom/canhub/cropper/CropImageView;", "Lcom/canhub/cropper/databinding/CropImageActivityBinding;", "d", "Lcom/canhub/cropper/databinding/CropImageActivityBinding;", "binding", "e", "latestTmpUri", "Landroidx/activity/result/ActivityResultLauncher;", "", "f", "Landroidx/activity/result/ActivityResultLauncher;", "pickImageGallery", "g", "takePicture", "h", "Source", "cropper_release"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nCropImageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropImageActivity.kt\ncom/canhub/cropper/CropImageActivity\n+ 2 ParcelableUtils.kt\ncom/canhub/cropper/ParcelableUtilsKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,488:1\n7#2,5:489\n7#2,5:494\n29#3:499\n1#4:500\n*S KotlinDebug\n*F\n+ 1 CropImageActivity.kt\ncom/canhub/cropper/CropImageActivity\n*L\n73#1:489,5\n75#1:494,5\n94#1:499\n*E\n"})
/* loaded from: classes3.dex */
public class CropImageActivity extends AppCompatActivity implements CropImageView.InterfaceC5428g, CropImageView.InterfaceC5424c {

    /* renamed from: a, reason: from kotlin metadata */
    public Uri cropImageUri;

    /* renamed from: b, reason: from kotlin metadata */
    public CropImageOptions cropImageOptions;

    /* renamed from: c, reason: from kotlin metadata */
    public CropImageView cropImageView;

    /* renamed from: d, reason: from kotlin metadata */
    public CropImageActivityBinding binding;

    /* renamed from: e, reason: from kotlin metadata */
    public Uri latestTmpUri;

    /* renamed from: f, reason: from kotlin metadata */
    public final ActivityResultLauncher pickImageGallery = registerForActivityResult(new ActivityResultContracts.GetContent(), new ActivityResultCallback() { // from class: k1.b
        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            CropImageActivity.m3805z(this.f13623a, (Uri) obj);
        }
    });

    /* renamed from: g, reason: from kotlin metadata */
    public final ActivityResultLauncher takePicture = registerForActivityResult(new ActivityResultContracts.TakePicture(), new ActivityResultCallback() { // from class: k1.c
        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            CropImageActivity.m3797J(this.f13624a, ((Boolean) obj).booleanValue());
        }
    });

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m13558d2 = {"Lcom/canhub/cropper/CropImageActivity$Source;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "cropper_release"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
    public static final class Source {

        /* renamed from: a */
        public static final Source f3942a = new Source(PermissionConstants.CAMERA, 0);

        /* renamed from: b */
        public static final Source f3943b = new Source("GALLERY", 1);

        /* renamed from: c */
        public static final /* synthetic */ Source[] f3944c;

        /* renamed from: d */
        public static final /* synthetic */ EnumEntries f3945d;

        static {
            Source[] sourceArrM3823a = m3823a();
            f3944c = sourceArrM3823a;
            f3945d = EnumEntriesKt.enumEntries(sourceArrM3823a);
        }

        public Source(String str, int i10) {
        }

        /* renamed from: a */
        public static final /* synthetic */ Source[] m3823a() {
            return new Source[]{f3942a, f3943b};
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) f3944c.clone();
        }
    }

    /* renamed from: com.canhub.cropper.CropImageActivity$b */
    public /* synthetic */ class C5418b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3946a;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.f3942a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.f3943b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f3946a = iArr;
        }
    }

    /* renamed from: com.canhub.cropper.CropImageActivity$c */
    public static final class C5419c implements C5437c.b {
        public C5419c() {
        }

        @Override // com.canhub.cropper.C5437c.b
        /* renamed from: a */
        public void mo3824a(Uri uri) {
            CropImageActivity.this.m3820w(uri);
        }

        @Override // com.canhub.cropper.C5437c.b
        /* renamed from: b */
        public void mo3825b() {
            CropImageActivity.this.m3810E();
        }
    }

    @Metadata(m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 48)
    /* renamed from: com.canhub.cropper.CropImageActivity$onCreate$1 */
    public /* synthetic */ class C54201 extends FunctionReferenceImpl implements Function1<Source, Unit> {
        public C54201(Object obj) {
            super(1, obj, CropImageActivity.class, "openSource", "openSource(Lcom/canhub/cropper/CropImageActivity$Source;)V", 0);
        }

        /* renamed from: a */
        public final void m3826a(Source p02) throws IOException {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((CropImageActivity) this.receiver).m3822y(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Source source) throws IOException {
            m3826a(source);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: G */
    public static final boolean m3795G(CropImageActivity this$0, DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i10 == 4 && keyEvent.getAction() == 1) {
            this$0.m3810E();
            this$0.finish();
        }
        return true;
    }

    /* renamed from: H */
    public static final void m3796H(Function1 openSource, DialogInterface dialogInterface, int i10) {
        Intrinsics.checkNotNullParameter(openSource, "$openSource");
        openSource.invoke(i10 == 0 ? Source.f3942a : Source.f3943b);
    }

    /* renamed from: J */
    public static final void m3797J(CropImageActivity this$0, boolean z9) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z9) {
            this$0.m3820w(this$0.latestTmpUri);
        } else {
            this$0.m3820w(null);
        }
    }

    /* renamed from: v */
    public static final Unit m3804v(CropImageActivity this$0, OnBackPressedCallback addCallback) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        this$0.m3810E();
        return Unit.INSTANCE;
    }

    /* renamed from: z */
    public static final void m3805z(CropImageActivity this$0, Uri uri) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m3820w(uri);
    }

    /* renamed from: A */
    public void m3806A(int degrees) {
        CropImageView cropImageView = this.cropImageView;
        if (cropImageView != null) {
            cropImageView.m3844n(degrees);
        }
    }

    /* renamed from: B */
    public void m3807B(CropImageView cropImageView) {
        Intrinsics.checkNotNullParameter(cropImageView, "cropImageView");
        this.cropImageView = cropImageView;
    }

    /* renamed from: C */
    public final void m3808C() {
        CropImageOptions cropImageOptions = this.cropImageOptions;
        CropImageOptions cropImageOptions2 = null;
        if (cropImageOptions == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
            cropImageOptions = null;
        }
        int i10 = cropImageOptions.activityBackgroundColor;
        CropImageActivityBinding cropImageActivityBinding = this.binding;
        if (cropImageActivityBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cropImageActivityBinding = null;
        }
        cropImageActivityBinding.getRoot().setBackgroundColor(i10);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            CropImageOptions cropImageOptions3 = this.cropImageOptions;
            if (cropImageOptions3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
                cropImageOptions3 = null;
            }
            CharSequence charSequence = cropImageOptions3.activityTitle;
            if (charSequence.length() == 0) {
                charSequence = "";
            }
            setTitle(charSequence);
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            CropImageOptions cropImageOptions4 = this.cropImageOptions;
            if (cropImageOptions4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
                cropImageOptions4 = null;
            }
            Integer num = cropImageOptions4.toolbarColor;
            if (num != null) {
                supportActionBar.setBackgroundDrawable(new ColorDrawable(num.intValue()));
            }
            CropImageOptions cropImageOptions5 = this.cropImageOptions;
            if (cropImageOptions5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
                cropImageOptions5 = null;
            }
            Integer num2 = cropImageOptions5.toolbarTitleColor;
            if (num2 != null) {
                int iIntValue = num2.intValue();
                SpannableString spannableString = new SpannableString(getTitle());
                spannableString.setSpan(new ForegroundColorSpan(iIntValue), 0, spannableString.length(), 33);
                setTitle(spannableString);
            }
            CropImageOptions cropImageOptions6 = this.cropImageOptions;
            if (cropImageOptions6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
            } else {
                cropImageOptions2 = cropImageOptions6;
            }
            Integer num3 = cropImageOptions2.toolbarBackButtonColor;
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
    public void m3809D(Uri uri, Exception error, int sampleSize) {
        setResult(error != null ? ComposerKt.providerMapsKey : -1, m3818t(uri, error, sampleSize));
        finish();
    }

    /* renamed from: E */
    public void m3810E() {
        setResult(0);
        finish();
    }

    /* renamed from: F */
    public void m3811F(final Function1 openSource) {
        Intrinsics.checkNotNullParameter(openSource, "openSource");
        new AlertDialog.Builder(this).setCancelable(false).setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: k1.e
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                return CropImageActivity.m3795G(this.f13626a, dialogInterface, i10, keyEvent);
            }
        }).setTitle(R$string.pick_image_chooser_title).setItems(new String[]{getString(R$string.pick_image_camera), getString(R$string.pick_image_gallery)}, new DialogInterface.OnClickListener() { // from class: k1.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                CropImageActivity.m3796H(openSource, dialogInterface, i10);
            }
        }).show();
    }

    /* renamed from: I */
    public final void m3812I() {
        C5437c c5437c = new C5437c(this, new C5419c());
        CropImageOptions cropImageOptions = this.cropImageOptions;
        if (cropImageOptions == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
            cropImageOptions = null;
        }
        String str = cropImageOptions.intentChooserTitle;
        if (str != null) {
            if (StringsKt.isBlank(str)) {
                str = null;
            }
            if (str != null) {
                c5437c.m3960g(str);
            }
        }
        List list = cropImageOptions.intentChooserPriorityList;
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                c5437c.m3961h(list);
            }
        }
        c5437c.m3962i(cropImageOptions.imageSourceIncludeCamera, cropImageOptions.imageSourceIncludeGallery, cropImageOptions.imageSourceIncludeCamera ? m3819u() : null);
    }

    /* renamed from: K */
    public void m3813K(Menu menu, int itemId, int color) {
        Drawable icon;
        Intrinsics.checkNotNullParameter(menu, "menu");
        MenuItem menuItemFindItem = menu.findItem(itemId);
        if (menuItemFindItem == null || (icon = menuItemFindItem.getIcon()) == null) {
            return;
        }
        try {
            icon.mutate();
            icon.setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(color, BlendModeCompat.SRC_ATOP));
            menuItemFindItem.setIcon(icon);
        } catch (Exception e10) {
            Log.w("AIC", "Failed to update menu item color", e10);
        }
    }

    /* renamed from: L */
    public void m3814L(Menu menu, int itemId, int color) {
        CharSequence title;
        Intrinsics.checkNotNullParameter(menu, "menu");
        MenuItem menuItemFindItem = menu.findItem(itemId);
        if (menuItemFindItem == null || (title = menuItemFindItem.getTitle()) == null || !(!StringsKt.isBlank(title))) {
            return;
        }
        try {
            SpannableString spannableString = new SpannableString(title);
            spannableString.setSpan(new ForegroundColorSpan(color), 0, spannableString.length(), 33);
            menuItemFindItem.setTitle(spannableString);
        } catch (Exception e10) {
            Log.w("AIC", "Failed to update menu item color", e10);
        }
    }

    @Override // com.canhub.cropper.CropImageView.InterfaceC5424c
    /* renamed from: a */
    public void mo3815a(CropImageView view, CropImageView.C5423b result) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(result, "result");
        m3809D(result.m3862h(), result.m3858c(), result.m3861g());
    }

    @Override // com.canhub.cropper.CropImageView.InterfaceC5428g
    /* renamed from: b */
    public void mo3816b(CropImageView view, Uri uri, Exception error) {
        CropImageView cropImageView;
        CropImageView cropImageView2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(uri, "uri");
        CropImageOptions cropImageOptions = null;
        if (error != null) {
            m3809D(null, error, 1);
            return;
        }
        CropImageOptions cropImageOptions2 = this.cropImageOptions;
        if (cropImageOptions2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
            cropImageOptions2 = null;
        }
        if (cropImageOptions2.initialCropWindowRectangle != null && (cropImageView2 = this.cropImageView) != null) {
            CropImageOptions cropImageOptions3 = this.cropImageOptions;
            if (cropImageOptions3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
                cropImageOptions3 = null;
            }
            cropImageView2.setCropRect(cropImageOptions3.initialCropWindowRectangle);
        }
        CropImageOptions cropImageOptions4 = this.cropImageOptions;
        if (cropImageOptions4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
            cropImageOptions4 = null;
        }
        if (cropImageOptions4.initialRotation > 0 && (cropImageView = this.cropImageView) != null) {
            CropImageOptions cropImageOptions5 = this.cropImageOptions;
            if (cropImageOptions5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
                cropImageOptions5 = null;
            }
            cropImageView.setRotatedDegrees(cropImageOptions5.initialRotation);
        }
        CropImageOptions cropImageOptions6 = this.cropImageOptions;
        if (cropImageOptions6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
        } else {
            cropImageOptions = cropImageOptions6;
        }
        if (cropImageOptions.skipEditing) {
            m3817s();
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
        Intrinsics.checkNotNullParameter(item, "item");
        int itemId = item.getItemId();
        if (itemId == R$id.crop_image_menu_crop) {
            m3817s();
            return true;
        }
        CropImageOptions cropImageOptions = null;
        if (itemId == R$id.ic_rotate_left_24) {
            CropImageOptions cropImageOptions2 = this.cropImageOptions;
            if (cropImageOptions2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
            } else {
                cropImageOptions = cropImageOptions2;
            }
            m3806A(-cropImageOptions.rotationDegrees);
            return true;
        }
        if (itemId == R$id.ic_rotate_right_24) {
            CropImageOptions cropImageOptions3 = this.cropImageOptions;
            if (cropImageOptions3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
            } else {
                cropImageOptions = cropImageOptions3;
            }
            m3806A(cropImageOptions.rotationDegrees);
            return true;
        }
        if (itemId == R$id.ic_flip_24_horizontally) {
            CropImageView cropImageView = this.cropImageView;
            if (cropImageView != null) {
                cropImageView.m3837f();
            }
            return true;
        }
        if (itemId == R$id.ic_flip_24_vertically) {
            CropImageView cropImageView2 = this.cropImageView;
            if (cropImageView2 != null) {
                cropImageView2.m3838g();
            }
            return true;
        }
        if (itemId != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        m3810E();
        return true;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putString("bundle_key_tmp_uri", String.valueOf(this.latestTmpUri));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        CropImageView cropImageView = this.cropImageView;
        if (cropImageView != null) {
            cropImageView.setOnSetImageUriCompleteListener(this);
        }
        CropImageView cropImageView2 = this.cropImageView;
        if (cropImageView2 != null) {
            cropImageView2.setOnCropImageCompleteListener(this);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        CropImageView cropImageView = this.cropImageView;
        if (cropImageView != null) {
            cropImageView.setOnSetImageUriCompleteListener(null);
        }
        CropImageView cropImageView2 = this.cropImageView;
        if (cropImageView2 != null) {
            cropImageView2.setOnCropImageCompleteListener(null);
        }
    }

    /* renamed from: s */
    public void m3817s() {
        CropImageOptions cropImageOptions = this.cropImageOptions;
        CropImageOptions cropImageOptions2 = null;
        if (cropImageOptions == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
            cropImageOptions = null;
        }
        if (cropImageOptions.noOutputImage) {
            m3809D(null, null, 1);
            return;
        }
        CropImageView cropImageView = this.cropImageView;
        if (cropImageView != null) {
            CropImageOptions cropImageOptions3 = this.cropImageOptions;
            if (cropImageOptions3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
                cropImageOptions3 = null;
            }
            Bitmap.CompressFormat compressFormat = cropImageOptions3.outputCompressFormat;
            CropImageOptions cropImageOptions4 = this.cropImageOptions;
            if (cropImageOptions4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
                cropImageOptions4 = null;
            }
            int i10 = cropImageOptions4.outputCompressQuality;
            CropImageOptions cropImageOptions5 = this.cropImageOptions;
            if (cropImageOptions5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
                cropImageOptions5 = null;
            }
            int i11 = cropImageOptions5.outputRequestWidth;
            CropImageOptions cropImageOptions6 = this.cropImageOptions;
            if (cropImageOptions6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
                cropImageOptions6 = null;
            }
            int i12 = cropImageOptions6.outputRequestHeight;
            CropImageOptions cropImageOptions7 = this.cropImageOptions;
            if (cropImageOptions7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
                cropImageOptions7 = null;
            }
            CropImageView.RequestSizeOptions requestSizeOptions = cropImageOptions7.outputRequestSizeOptions;
            CropImageOptions cropImageOptions8 = this.cropImageOptions;
            if (cropImageOptions8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cropImageOptions");
            } else {
                cropImageOptions2 = cropImageOptions8;
            }
            cropImageView.m3836d(compressFormat, i10, i11, i12, requestSizeOptions, cropImageOptions2.customOutputUri);
        }
    }

    /* renamed from: t */
    public Intent m3818t(Uri uri, Exception error, int sampleSize) {
        CropImageView cropImageView = this.cropImageView;
        Uri imageUri = cropImageView != null ? cropImageView.getImageUri() : null;
        CropImageView cropImageView2 = this.cropImageView;
        float[] cropPoints = cropImageView2 != null ? cropImageView2.getCropPoints() : null;
        CropImageView cropImageView3 = this.cropImageView;
        Rect cropRect = cropImageView3 != null ? cropImageView3.getCropRect() : null;
        CropImageView cropImageView4 = this.cropImageView;
        int mDegreesRotated = cropImageView4 != null ? cropImageView4.getMDegreesRotated() : 0;
        CropImageView cropImageView5 = this.cropImageView;
        CropImage$ActivityResult cropImage$ActivityResult = new CropImage$ActivityResult(imageUri, uri, error, cropPoints, cropRect, mDegreesRotated, cropImageView5 != null ? cropImageView5.getWholeImageRect() : null, sampleSize);
        Intent intent = new Intent();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            intent.putExtras(extras);
        }
        intent.putExtra("CROP_IMAGE_EXTRA_RESULT", cropImage$ActivityResult);
        return intent;
    }

    /* renamed from: u */
    public final Uri m3819u() throws IOException {
        File fileCreateTempFile = File.createTempFile("tmp_image_file", ".png", getCacheDir());
        fileCreateTempFile.createNewFile();
        fileCreateTempFile.deleteOnExit();
        Intrinsics.checkNotNull(fileCreateTempFile);
        return AbstractC8489c.m13915b(this, fileCreateTempFile);
    }

    /* renamed from: w */
    public void m3820w(Uri resultUri) {
        if (resultUri == null) {
            m3810E();
            return;
        }
        this.cropImageUri = resultUri;
        CropImageView cropImageView = this.cropImageView;
        if (cropImageView != null) {
            cropImageView.setImageUriAsync(resultUri);
        }
    }

    /* renamed from: x */
    public final void m3821x() throws IOException {
        Uri uriM3819u = m3819u();
        this.latestTmpUri = uriM3819u;
        this.takePicture.launch(uriM3819u);
    }

    /* renamed from: y */
    public final void m3822y(Source source) throws IOException {
        int i10 = C5418b.f3946a[source.ordinal()];
        if (i10 == 1) {
            m3821x();
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.pickImageGallery.launch("image/*");
        }
    }
}
