package com.zykj.view.board.crop;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.merge.sketch.listener.PlayStatusListener;
import com.zykj.view.C5280R;
import com.zykj.view.databinding.ViewFragmentBlackboardCropBinding;
import com.zykj.view.utils.TimeFormatUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;

@Metadata(m5109d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m5110d2 = {"com/zykj/view/board/crop/BlackboardCropFragment$load$2$1$1", "Lcom/zykj/merge/sketch/listener/PlayStatusListener;", "Ld6/s;", "onPlayEnd", "()V", "onPlayPause", "onPlayStart", "onPlayWait", "", "progress", "onProgress", "(J)V", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class BlackboardCropFragment$load$2$1$1 implements PlayStatusListener {
    final /* synthetic */ BlackboardCropFragment this$0;

    public BlackboardCropFragment$load$2$1$1(BlackboardCropFragment blackboardCropFragment) {
        this.this$0 = blackboardCropFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPlayEnd$lambda$0(BlackboardCropFragment blackboardCropFragment) {
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = blackboardCropFragment.mBinding;
        if (viewFragmentBlackboardCropBinding != null) {
            viewFragmentBlackboardCropBinding.ivRecord.setImageResource(C5280R.drawable.selector_btn_music_play);
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPlayPause$lambda$1(BlackboardCropFragment blackboardCropFragment) {
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = blackboardCropFragment.mBinding;
        if (viewFragmentBlackboardCropBinding != null) {
            viewFragmentBlackboardCropBinding.ivRecord.setImageResource(C5280R.drawable.selector_btn_music_play);
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPlayStart$lambda$2(BlackboardCropFragment blackboardCropFragment) {
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = blackboardCropFragment.mBinding;
        if (viewFragmentBlackboardCropBinding != null) {
            viewFragmentBlackboardCropBinding.ivRecord.setImageResource(C5280R.drawable.selector_btn_music_pause);
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPlayWait$lambda$3(BlackboardCropFragment blackboardCropFragment) {
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = blackboardCropFragment.mBinding;
        if (viewFragmentBlackboardCropBinding != null) {
            viewFragmentBlackboardCropBinding.ivRecord.setImageResource(C5280R.drawable.selector_btn_music_pause);
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onProgress$lambda$4(BlackboardCropFragment blackboardCropFragment, long j7) {
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = blackboardCropFragment.mBinding;
        if (viewFragmentBlackboardCropBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentBlackboardCropBinding.seekBar.setProgress(j7);
        blackboardCropFragment.progressTime = TimeFormatUtils.INSTANCE.formatTime(j7);
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding2 = blackboardCropFragment.mBinding;
        if (viewFragmentBlackboardCropBinding2 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentBlackboardCropBinding2.tvTime.setText(blackboardCropFragment.progressTime + "/" + blackboardCropFragment.totalTime);
    }

    @Override // com.zykj.merge.sketch.listener.PlayStatusListener
    public void onPlayEnd() {
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = this.this$0.mBinding;
        if (viewFragmentBlackboardCropBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentBlackboardCropBinding.ivRecord.post(new RunnableC5324c(6, this.this$0));
    }

    @Override // com.zykj.merge.sketch.listener.PlayStatusListener
    public void onPlayPause() {
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = this.this$0.mBinding;
        if (viewFragmentBlackboardCropBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentBlackboardCropBinding.ivRecord.post(new RunnableC5324c(5, this.this$0));
    }

    @Override // com.zykj.merge.sketch.listener.PlayStatusListener
    public void onPlayStart() {
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = this.this$0.mBinding;
        if (viewFragmentBlackboardCropBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentBlackboardCropBinding.ivRecord.post(new RunnableC5324c(7, this.this$0));
    }

    @Override // com.zykj.merge.sketch.listener.PlayStatusListener
    public void onPlayWait() {
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = this.this$0.mBinding;
        if (viewFragmentBlackboardCropBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentBlackboardCropBinding.ivRecord.post(new RunnableC5324c(4, this.this$0));
    }

    @Override // com.zykj.merge.sketch.listener.PlayStatusListener
    public void onProgress(long progress) {
        ViewFragmentBlackboardCropBinding viewFragmentBlackboardCropBinding = this.this$0.mBinding;
        if (viewFragmentBlackboardCropBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        TextView textView = viewFragmentBlackboardCropBinding.tvTime;
        if (textView != null) {
            textView.post(new RunnableC5327f(this.this$0, progress, 0));
        }
    }
}
