package com.zykj.mistake.activity;

import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.C3413g;
import com.bumptech.glide.ComponentCallbacks2C3408b;
import com.bumptech.glide.ComponentCallbacks2C3414h;
import com.zykj.mistake.dialog.ImageDialogFragment;
import com.zykj.mistake.entity.req.CreateOrUpdateMistakeReq;
import com.zykj.mistake.utils.C5102g;
import java.util.ArrayList;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5835p;

/* renamed from: com.zykj.mistake.activity.s */
/* loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC4483s implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f5938a = 1;

    /* renamed from: b */
    public final /* synthetic */ int f5939b;

    /* renamed from: c */
    public final /* synthetic */ MistakeCreateOrEditActivity f5940c;

    /* renamed from: d */
    public final /* synthetic */ String f5941d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f5942e;

    /* renamed from: f */
    public final /* synthetic */ ImageView f5943f;

    public /* synthetic */ ViewOnClickListenerC4483s(int i, MistakeCreateOrEditActivity mistakeCreateOrEditActivity, String str, ImageView imageView, ImageView imageView2) {
        this.f5939b = i;
        this.f5940c = mistakeCreateOrEditActivity;
        this.f5941d = str;
        this.f5942e = imageView;
        this.f5943f = imageView2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i = this.f5938a;
        String str2 = this.f5941d;
        switch (i) {
            case 0:
                int i8 = MistakeCreateOrEditActivity.f5799u;
                ImageView imageView = this.f5942e;
                boolean zIsSelected = imageView.isSelected();
                MistakeCreateOrEditActivity mistakeCreateOrEditActivity = this.f5940c;
                int i9 = this.f5939b;
                if (!zIsSelected) {
                    C5102g c5102g = mistakeCreateOrEditActivity.f5814s;
                    ImageView imageView2 = this.f5943f;
                    c5102g.m4465a(new C4479o(i9, imageView, imageView2, mistakeCreateOrEditActivity), new C4480p(i9, 0, mistakeCreateOrEditActivity, imageView, imageView2));
                    break;
                } else {
                    String str3 = mistakeCreateOrEditActivity.f5811p[i9];
                    if (str3.length() == 0) {
                        str3 = str2 != null ? str2 : "";
                    }
                    new ImageDialogFragment().m3989l(mistakeCreateOrEditActivity, str3, null);
                    break;
                }
            default:
                MistakeCreateOrEditActivity mistakeCreateOrEditActivity2 = this.f5940c;
                CreateOrUpdateMistakeReq createOrUpdateMistakeReq = mistakeCreateOrEditActivity2.f5813r;
                int i10 = this.f5939b;
                if (i10 < 2) {
                    ArrayList<String> extraStems = createOrUpdateMistakeReq.getExtraStems();
                    if (extraStems != null) {
                        AbstractC5835p.m5352a(extraStems).remove(str2);
                    }
                    if (AbstractC5830k.m5325b(createOrUpdateMistakeReq.getStemShoot(), str2)) {
                        ArrayList<String> extraStems2 = createOrUpdateMistakeReq.getExtraStems();
                        if (extraStems2 == null || (str = (String) AbstractC5805t.m5229i0(extraStems2)) == null) {
                            str = "";
                        }
                        createOrUpdateMistakeReq.setStemShoot(str);
                    }
                } else {
                    ArrayList<String> extraAnswers = createOrUpdateMistakeReq.getExtraAnswers();
                    if (extraAnswers != null) {
                        AbstractC5835p.m5352a(extraAnswers).remove(str2);
                    }
                }
                ComponentCallbacks2C3414h componentCallbacks2C3414hM5863c = ComponentCallbacks2C3408b.m2361d(mistakeCreateOrEditActivity2).m5863c(mistakeCreateOrEditActivity2);
                componentCallbacks2C3414hM5863c.getClass();
                ImageView imageView3 = this.f5942e;
                componentCallbacks2C3414hM5863c.m2385k(new C3413g(imageView3));
                imageView3.setImageDrawable(null);
                imageView3.setSelected(false);
                MistakeCreateOrEditActivity.m3911C(imageView3, false);
                this.f5943f.setVisibility(8);
                mistakeCreateOrEditActivity2.f5811p[i10] = "";
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC4483s(ImageView imageView, MistakeCreateOrEditActivity mistakeCreateOrEditActivity, int i, String str, ImageView imageView2) {
        this.f5942e = imageView;
        this.f5940c = mistakeCreateOrEditActivity;
        this.f5939b = i;
        this.f5941d = str;
        this.f5943f = imageView2;
    }
}
