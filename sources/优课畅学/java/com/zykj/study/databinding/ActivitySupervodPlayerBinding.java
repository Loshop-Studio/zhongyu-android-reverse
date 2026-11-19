package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.video.play.SuperPlayerView;

/* loaded from: classes3.dex */
public final class ActivitySupervodPlayerBinding implements ViewBinding {

    @NonNull
    public final RelativeLayout activitySuperPlayer;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final SuperPlayerView superVodPlayerView;

    @NonNull
    public final RelativeLayout superplayerRlPlayer;

    private ActivitySupervodPlayerBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull SuperPlayerView superPlayerView, @NonNull RelativeLayout relativeLayout3) {
        this.rootView = relativeLayout;
        this.activitySuperPlayer = relativeLayout2;
        this.superVodPlayerView = superPlayerView;
        this.superplayerRlPlayer = relativeLayout3;
    }

    @NonNull
    public static ActivitySupervodPlayerBinding bind(@NonNull View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i10 = R$id.superVodPlayerView;
        SuperPlayerView superPlayerView = (SuperPlayerView) ViewBindings.findChildViewById(view, i10);
        if (superPlayerView != null) {
            i10 = R$id.superplayer_rl_player;
            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i10);
            if (relativeLayout2 != null) {
                return new ActivitySupervodPlayerBinding(relativeLayout, relativeLayout, superPlayerView, relativeLayout2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ActivitySupervodPlayerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySupervodPlayerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R$layout.activity_supervod_player, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
