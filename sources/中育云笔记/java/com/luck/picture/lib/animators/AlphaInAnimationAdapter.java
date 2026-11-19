package com.luck.picture.lib.animators;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes5.dex */
public class AlphaInAnimationAdapter extends BaseAnimationAdapter {

    /* renamed from: f */
    public final float f12254f;

    public AlphaInAnimationAdapter(RecyclerView.Adapter adapter) {
        this(adapter, 0.0f);
    }

    @Override // com.luck.picture.lib.animators.BaseAnimationAdapter
    /* renamed from: a */
    public Animator[] mo9237a(View view) {
        return new Animator[]{ObjectAnimator.ofFloat(view, "alpha", this.f12254f, 1.0f)};
    }

    public AlphaInAnimationAdapter(RecyclerView.Adapter adapter, float f10) {
        super(adapter);
        this.f12254f = f10;
    }
}
