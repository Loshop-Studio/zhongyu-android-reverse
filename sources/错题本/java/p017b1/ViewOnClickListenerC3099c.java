package p017b1;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Toast;
import android.widget.VideoView;
import com.flyco.tablayout.SegmentTabLayout;
import com.flyco.tablayout.SlidingTabLayout;
import com.xuexiang.xui.R$string;
import com.xuexiang.xui.widget.button.C4166d;
import com.xuexiang.xui.widget.button.RunnableC4165c;
import com.xuexiang.xui.widget.button.SmoothCheckBox;
import com.xuexiang.xui.widget.imageview.preview.p034ui.VideoPlayerActivity;
import com.xuexiang.xui.widget.searchview.MaterialSearchView;
import com.xuexiang.xui.widget.tabbar.TabSegment;
import com.xuexiang.xui.widget.tabbar.VerticalTabLayout;
import com.zykj.message.UnLoginActivity;
import com.zykj.message.client.MessageClient;
import p136p3.C6370h;

/* renamed from: b1.c */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC3099c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f1534a;

    /* renamed from: b */
    public final /* synthetic */ KeyEvent.Callback f1535b;

    public /* synthetic */ ViewOnClickListenerC3099c(KeyEvent.Callback callback, int i) {
        this.f1534a = i;
        this.f1535b = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f1534a;
        int i8 = 1;
        int i9 = 0;
        KeyEvent.Callback callback = this.f1535b;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) view.getTag()).intValue();
                SegmentTabLayout segmentTabLayout = (SegmentTabLayout) callback;
                if (segmentTabLayout.f2723d == iIntValue) {
                    segmentTabLayout.getClass();
                    break;
                } else {
                    segmentTabLayout.setCurrentTab(iIntValue);
                    segmentTabLayout.getClass();
                    break;
                }
            case 1:
                SlidingTabLayout slidingTabLayout = (SlidingTabLayout) callback;
                int iIndexOfChild = slidingTabLayout.f2764c.indexOfChild(view);
                if (iIndexOfChild != -1) {
                    if (slidingTabLayout.f2763b.getCurrentItem() == iIndexOfChild) {
                        slidingTabLayout.getClass();
                        break;
                    } else {
                        if (slidingTabLayout.f2759N) {
                            slidingTabLayout.f2763b.setCurrentItem(iIndexOfChild, false);
                        } else {
                            slidingTabLayout.f2763b.setCurrentItem(iIndexOfChild);
                        }
                        slidingTabLayout.getClass();
                        break;
                    }
                }
                break;
            case 2:
                SmoothCheckBox smoothCheckBox = (SmoothCheckBox) callback;
                smoothCheckBox.toggle();
                smoothCheckBox.f4113t = false;
                smoothCheckBox.f4102i = 0.0f;
                int i10 = 3;
                int i11 = 2;
                if (!smoothCheckBox.f4112s) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.setDuration(smoothCheckBox.f4106m);
                    valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                    valueAnimatorOfFloat.addUpdateListener(new C4166d(smoothCheckBox, i11));
                    valueAnimatorOfFloat.start();
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.8f, 1.0f);
                    valueAnimatorOfFloat2.setDuration(smoothCheckBox.f4106m);
                    valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                    valueAnimatorOfFloat2.addUpdateListener(new C4166d(smoothCheckBox, i10));
                    valueAnimatorOfFloat2.start();
                    break;
                } else {
                    ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat3.setDuration((smoothCheckBox.f4106m / 3) * 2);
                    valueAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
                    valueAnimatorOfFloat3.addUpdateListener(new C4166d(smoothCheckBox, i9));
                    valueAnimatorOfFloat3.start();
                    ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.8f, 1.0f);
                    valueAnimatorOfFloat4.setDuration(smoothCheckBox.f4106m);
                    valueAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
                    valueAnimatorOfFloat4.addUpdateListener(new C4166d(smoothCheckBox, i8));
                    valueAnimatorOfFloat4.start();
                    smoothCheckBox.postDelayed(new RunnableC4165c(smoothCheckBox, 1), smoothCheckBox.f4106m);
                    break;
                }
            case 3:
                MaterialSearchView materialSearchView = (MaterialSearchView) callback;
                if (view != materialSearchView.f4838g) {
                    if (view != materialSearchView.f4839h) {
                        if (view != materialSearchView.f4840i) {
                            if (view != materialSearchView.f4837f) {
                                if (view == materialSearchView.f4835d) {
                                    materialSearchView.m3566a();
                                    break;
                                }
                            } else {
                                materialSearchView.m3571f();
                                break;
                            }
                        } else {
                            materialSearchView.f4837f.setText((CharSequence) null);
                            break;
                        }
                    } else {
                        materialSearchView.getClass();
                        try {
                            Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
                            intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
                            intent.putExtra("android.speech.extra.MAX_RESULTS", 1);
                            Context context = materialSearchView.f4849r;
                            if (context instanceof Activity) {
                                ((Activity) context).startActivityForResult(intent, 9999);
                                break;
                            }
                        } catch (Exception unused) {
                            Toast.makeText(materialSearchView.getContext(), R$string.xui_tip_no_recognize_speech, 0).show();
                            return;
                        }
                    }
                } else {
                    materialSearchView.m3566a();
                    break;
                }
                break;
            case 4:
                Intent intent2 = new Intent();
                intent2.setAction(MessageClient.serverLoginAction);
                intent2.setPackage(MessageClient.serverPackageName);
                ((UnLoginActivity) callback).startActivityForResult(intent2, 200);
                break;
            case 5:
                TabSegment tabSegment = (TabSegment) callback;
                if (tabSegment.f4947s == null && tabSegment.f4946r == 0) {
                    int iIntValue2 = ((Integer) view.getTag()).intValue();
                    if (((C6370h) tabSegment.getAdapter().m6032b(iIntValue2)) != null) {
                        tabSegment.m3595i(iIntValue2, false, true);
                        break;
                    }
                }
                break;
            case 6:
                VerticalTabLayout verticalTabLayout = (VerticalTabLayout) callback;
                verticalTabLayout.setTabSelected(verticalTabLayout.f4961b.indexOfChild(view));
                break;
            default:
                VideoPlayerActivity videoPlayerActivity = (VideoPlayerActivity) callback;
                videoPlayerActivity.finish();
                int i12 = VideoPlayerActivity.f4454b;
                VideoView videoView = videoPlayerActivity.f4455a;
                if (videoView != null) {
                    videoView.stopPlayback();
                    break;
                }
                break;
        }
    }
}
