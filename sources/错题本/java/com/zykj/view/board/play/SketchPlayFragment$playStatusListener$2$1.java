package com.zykj.view.board.play;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.merge.sketch.listener.PlayStatusListener;
import com.zykj.view.C5280R;
import com.zykj.view.board.crop.RunnableC5327f;
import com.zykj.view.databinding.ViewFragmentSketchPlayBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m5110d2 = {"com/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1", "Lcom/zykj/merge/sketch/listener/PlayStatusListener;", "Ld6/s;", "onPlayEnd", "()V", "onPlayPause", "onPlayStart", "onPlayWait", "", "progress", "onProgress", "(J)V", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class SketchPlayFragment$playStatusListener$2$1 implements PlayStatusListener {
    final /* synthetic */ SketchPlayFragment this$0;

    public SketchPlayFragment$playStatusListener$2$1(SketchPlayFragment sketchPlayFragment) {
        this.this$0 = sketchPlayFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPlayEnd$lambda$0(SketchPlayFragment sketchPlayFragment) {
        PlayActionListener playActionListener;
        InterfaceC6469a callbackForEnd;
        try {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            viewFragmentSketchPlayBinding.controlBar.ivRecord.setImageResource(C5280R.drawable.selector_btn_music_play);
            NewPlayerConfig newPlayerConfig = sketchPlayFragment.mNewPlayerConfig;
            if (newPlayerConfig == null || (playActionListener = newPlayerConfig.getPlayActionListener()) == null || (callbackForEnd = playActionListener.getCallbackForEnd()) == null) {
                return;
            }
            callbackForEnd.invoke();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPlayPause$lambda$1(SketchPlayFragment sketchPlayFragment) {
        PlayActionListener playActionListener;
        InterfaceC6469a callbackForPause;
        try {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            viewFragmentSketchPlayBinding.controlBar.ivRecord.setImageResource(C5280R.drawable.selector_btn_music_play);
            NewPlayerConfig newPlayerConfig = sketchPlayFragment.mNewPlayerConfig;
            if (newPlayerConfig == null || (playActionListener = newPlayerConfig.getPlayActionListener()) == null || (callbackForPause = playActionListener.getCallbackForPause()) == null) {
                return;
            }
            callbackForPause.invoke();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPlayStart$lambda$2(SketchPlayFragment sketchPlayFragment) {
        PlayActionListener playActionListener;
        InterfaceC6469a callbackForStart;
        try {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            viewFragmentSketchPlayBinding.controlBar.ivRecord.setImageResource(C5280R.drawable.selector_btn_music_pause);
            NewPlayerConfig newPlayerConfig = sketchPlayFragment.mNewPlayerConfig;
            if (newPlayerConfig == null || (playActionListener = newPlayerConfig.getPlayActionListener()) == null || (callbackForStart = playActionListener.getCallbackForStart()) == null) {
                return;
            }
            callbackForStart.invoke();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPlayWait$lambda$3(SketchPlayFragment sketchPlayFragment) {
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.mBinding;
        if (viewFragmentSketchPlayBinding != null) {
            viewFragmentSketchPlayBinding.controlBar.ivRecord.setImageResource(C5280R.drawable.selector_btn_music_pause);
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onProgress$lambda$4(SketchPlayFragment sketchPlayFragment, long j7) {
        PlayActionListener playActionListener;
        InterfaceC6471c callbackForRunning;
        try {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.mBinding;
            if (viewFragmentSketchPlayBinding == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            viewFragmentSketchPlayBinding.controlBar.seekBar.setProgress((int) j7);
            sketchPlayFragment.progressTime = SketchPlayFragment.INSTANCE.formatTime(j7);
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = sketchPlayFragment.mBinding;
            if (viewFragmentSketchPlayBinding2 == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            viewFragmentSketchPlayBinding2.controlBar.tvTime.setText(sketchPlayFragment.progressTime + "/" + sketchPlayFragment.totalTime);
            NewPlayerConfig newPlayerConfig = sketchPlayFragment.mNewPlayerConfig;
            if (newPlayerConfig == null || (playActionListener = newPlayerConfig.getPlayActionListener()) == null || (callbackForRunning = playActionListener.getCallbackForRunning()) == null) {
                return;
            }
            callbackForRunning.invoke(Long.valueOf(j7));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.zykj.merge.sketch.listener.PlayStatusListener
    public void onPlayEnd() {
        this.this$0.continueWhenResume = false;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.this$0.mBinding;
        if (viewFragmentSketchPlayBinding != null) {
            viewFragmentSketchPlayBinding.controlBar.ivRecord.post(new RunnableC5361j(this.this$0, 1));
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }

    @Override // com.zykj.merge.sketch.listener.PlayStatusListener
    public void onPlayPause() {
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.this$0.mBinding;
        if (viewFragmentSketchPlayBinding != null) {
            viewFragmentSketchPlayBinding.controlBar.ivRecord.post(new RunnableC5361j(this.this$0, 0));
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }

    @Override // com.zykj.merge.sketch.listener.PlayStatusListener
    public void onPlayStart() {
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.this$0.mBinding;
        if (viewFragmentSketchPlayBinding != null) {
            viewFragmentSketchPlayBinding.controlBar.ivRecord.post(new RunnableC5361j(this.this$0, 2));
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }

    @Override // com.zykj.merge.sketch.listener.PlayStatusListener
    public void onPlayWait() {
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.this$0.mBinding;
        if (viewFragmentSketchPlayBinding != null) {
            viewFragmentSketchPlayBinding.controlBar.ivRecord.post(new RunnableC5361j(this.this$0, 3));
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }

    @Override // com.zykj.merge.sketch.listener.PlayStatusListener
    public void onProgress(long progress) {
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.this$0.mBinding;
        if (viewFragmentSketchPlayBinding != null) {
            viewFragmentSketchPlayBinding.controlBar.tvTime.post(new RunnableC5327f(this.this$0, progress, 1));
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }
}
