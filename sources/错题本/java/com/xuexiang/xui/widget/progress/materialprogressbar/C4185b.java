package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import p111m0.C6082e;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.b */
/* loaded from: classes3.dex */
public final class C4185b extends Drawable.ConstantState {

    /* renamed from: a */
    public final /* synthetic */ int f4732a = 0;

    /* renamed from: b */
    public final Object f4733b;

    public C4185b(AbstractC4187d abstractC4187d) {
        this.f4733b = abstractC4187d;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f4732a) {
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.f4732a) {
            case 0:
                return (AbstractC4187d) this.f4733b;
            default:
                return new GifDrawable(this);
        }
    }

    public C4185b(C6082e c6082e) {
        this.f4733b = c6082e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        switch (this.f4732a) {
            case 1:
                return new GifDrawable(this);
            default:
                return super.newDrawable(resources);
        }
    }
}
