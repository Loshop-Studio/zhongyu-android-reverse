package p144q4;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.zykj.mistake.fragment.OriginalAnswerFragment;
import p006a5.ViewOnClickListenerC0015f;
import p155s0.AbstractC6548g;

/* renamed from: q4.j */
/* loaded from: classes3.dex */
public final class C6426j extends AbstractC6548g {

    /* renamed from: b */
    public final /* synthetic */ ImageView f10547b;

    /* renamed from: c */
    public final /* synthetic */ View f10548c;

    /* renamed from: d */
    public final /* synthetic */ OriginalAnswerFragment f10549d;

    /* renamed from: e */
    public final /* synthetic */ String f10550e;

    public C6426j(ImageView imageView, View view, OriginalAnswerFragment originalAnswerFragment, String str) {
        this.f10547b = imageView;
        this.f10548c = view;
        this.f10549d = originalAnswerFragment;
        this.f10550e = str;
    }

    @Override // p155s0.InterfaceC6550i
    /* renamed from: c */
    public final void mo2380c(Object obj) {
        this.f10547b.setImageDrawable((Drawable) obj);
        this.f10548c.setOnClickListener(new ViewOnClickListenerC0015f(11, this.f10549d, this.f10550e));
    }

    @Override // p155s0.AbstractC6542a, p155s0.InterfaceC6550i
    /* renamed from: h */
    public final void mo2381h(Drawable drawable) {
        this.f10547b.setImageDrawable(drawable);
    }
}
