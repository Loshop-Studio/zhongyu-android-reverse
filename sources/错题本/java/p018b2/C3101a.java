package p018b2;

import android.os.Handler;
import android.os.Message;
import androidx.viewpager.widget.ViewPager;
import com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner;
import com.xuexiang.xui.widget.banner.widget.loopviewpager.LoopViewPager;
import com.xuexiang.xui.widget.textview.MarqueeTextView;
import p111m0.C6080c;
import p111m0.C6082e;

/* renamed from: b2.a */
/* loaded from: classes3.dex */
public final class C3101a implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ int f1538a;

    /* renamed from: b */
    public final /* synthetic */ Object f1539b;

    public /* synthetic */ C3101a(Object obj, int i) {
        this.f1538a = i;
        this.f1539b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Handler handler;
        switch (this.f1538a) {
            case 0:
                BaseBanner baseBanner = (BaseBanner) this.f1539b;
                int i = baseBanner.f4031f;
                if (baseBanner.m3455d()) {
                    if (baseBanner.f4045t) {
                        ViewPager viewPager = baseBanner.f4029d;
                        if (viewPager instanceof LoopViewPager) {
                            ((LoopViewPager) viewPager).getPageAdapterWrapper().notifyDataSetChanged();
                        } else if (viewPager.getAdapter() != null) {
                            baseBanner.f4029d.getAdapter().notifyDataSetChanged();
                        }
                    }
                    baseBanner.f4029d.setCurrentItem(i + 1);
                    break;
                }
                break;
            case 1:
                C6082e c6082e = (C6082e) this.f1539b;
                int i8 = message.what;
                if (i8 != 1) {
                    if (i8 == 2) {
                        c6082e.f9695d.m2385k((C6080c) message.obj);
                        break;
                    }
                } else {
                    c6082e.m5798b((C6080c) message.obj);
                    break;
                }
                break;
            default:
                MarqueeTextView marqueeTextView = (MarqueeTextView) this.f1539b;
                if (message.what == 1) {
                    float f = marqueeTextView.f5014e;
                    if (f >= -0.0f) {
                        marqueeTextView.f5014e = f - marqueeTextView.f5016g;
                        marqueeTextView.invalidate();
                        if (!marqueeTextView.f5011b && (handler = marqueeTextView.f5019j) != null) {
                            handler.sendEmptyMessageDelayed(1, 30);
                            break;
                        }
                    } else {
                        marqueeTextView.m3613b();
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
