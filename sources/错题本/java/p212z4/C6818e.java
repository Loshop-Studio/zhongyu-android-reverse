package p212z4;

import android.view.result.ActivityResultLauncher;
import androidx.navigation.serialization.C2872b;
import com.zykj.mistake.activity.MainActivity;
import com.zykj.mistake.utils.C5102g;
import com.zykj.view.utils.ImagePicker;
import kotlin.jvm.internal.AbstractC5830k;
import p106l4.DialogC6053d;

/* renamed from: z4.e */
/* loaded from: classes3.dex */
public final class C6818e {

    /* renamed from: a */
    public final MainActivity f11546a;

    /* renamed from: b */
    public final C5102g f11547b;

    /* renamed from: c */
    public final ImagePicker f11548c;

    /* renamed from: d */
    public final DialogC6053d f11549d;

    /* renamed from: e */
    public final ActivityResultLauncher f11550e;

    /* renamed from: f */
    public C2872b f11551f;

    public C6818e(MainActivity mainActivity, C5102g galleryLauncher, ImagePicker imagePicker, DialogC6053d dialogC6053d, ActivityResultLauncher editMistakeLauncher) {
        AbstractC5830k.m5330g(galleryLauncher, "galleryLauncher");
        AbstractC5830k.m5330g(imagePicker, "imagePicker");
        AbstractC5830k.m5330g(editMistakeLauncher, "editMistakeLauncher");
        this.f11546a = mainActivity;
        this.f11547b = galleryLauncher;
        this.f11548c = imagePicker;
        this.f11549d = dialogC6053d;
        this.f11550e = editMistakeLauncher;
        this.f11551f = null;
    }
}
