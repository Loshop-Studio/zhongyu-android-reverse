package p219k6;

import android.app.Activity;
import android.content.Intent;
import com.luck.picture.lib.R$anim;
import com.luck.picture.lib.basic.PictureSelectorSupporterActivity;
import com.luck.picture.lib.config.PictureSelectionConfig;
import p008a7.AbstractC0073f;
import p235l6.AbstractC10150d;
import p260n6.InterfaceC10322a;
import p304q6.InterfaceC10752l;

/* renamed from: k6.e */
/* loaded from: classes5.dex */
public final class C9823e {

    /* renamed from: a */
    public final PictureSelectionConfig f23065a;

    /* renamed from: b */
    public final C9824f f23066b;

    public C9823e(C9824f c9824f, int i10) {
        this.f23066b = c9824f;
        PictureSelectionConfig pictureSelectionConfigM9327b = PictureSelectionConfig.m9327b();
        this.f23065a = pictureSelectionConfigM9327b;
        pictureSelectionConfigM9327b.f12337c = i10;
        m19899e(pictureSelectionConfigM9327b.f12359o);
    }

    /* renamed from: a */
    public void m19895a(InterfaceC10752l interfaceC10752l) {
        if (AbstractC0073f.m171a()) {
            return;
        }
        Activity activityM19903c = this.f23066b.m19903c();
        if (activityM19903c == null) {
            throw new NullPointerException("Activity cannot be null");
        }
        if (interfaceC10752l == null) {
            throw new NullPointerException("OnResultCallbackListener cannot be null");
        }
        PictureSelectionConfig pictureSelectionConfig = this.f23065a;
        pictureSelectionConfig.f12374v0 = true;
        pictureSelectionConfig.f12378x0 = false;
        PictureSelectionConfig.f12296Q0 = interfaceC10752l;
        if (PictureSelectionConfig.f12293N0 == null && pictureSelectionConfig.f12337c != AbstractC10150d.m21191b()) {
            throw new NullPointerException("imageEngine is null,Please implement ImageEngine");
        }
        activityM19903c.startActivity(new Intent(activityM19903c, (Class<?>) PictureSelectorSupporterActivity.class));
        activityM19903c.overridePendingTransition(PictureSelectionConfig.f12295P0.m26629e().f12499c, R$anim.ps_anim_fade_in);
    }

    /* renamed from: b */
    public C9823e m19896b(boolean z10) {
        this.f23065a.f12306E = z10;
        return this;
    }

    /* renamed from: c */
    public C9823e m19897c(InterfaceC10322a interfaceC10322a) {
        PictureSelectionConfig.f12293N0 = interfaceC10322a;
        return this;
    }

    /* renamed from: d */
    public C9823e m19898d(int i10) {
        PictureSelectionConfig pictureSelectionConfig = this.f23065a;
        if (pictureSelectionConfig.f12353l == 1) {
            i10 = 1;
        }
        pictureSelectionConfig.f12355m = i10;
        return this;
    }

    /* renamed from: e */
    public C9823e m19899e(int i10) {
        PictureSelectionConfig pictureSelectionConfig = this.f23065a;
        if (pictureSelectionConfig.f12337c == AbstractC10150d.m21193d()) {
            i10 = 0;
        }
        pictureSelectionConfig.f12359o = i10;
        return this;
    }
}
