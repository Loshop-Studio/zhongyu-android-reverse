package p155s0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bumptech.glide.request.C3420a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: s0.d */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnPreDrawListenerC6545d implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final /* synthetic */ int f10921a = 0;

    /* renamed from: b */
    public final WeakReference f10922b;

    public ViewTreeObserverOnPreDrawListenerC6545d(C6546e c6546e) {
        this.f10922b = new WeakReference(c6546e);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() throws Throwable {
        switch (this.f10921a) {
            case 0:
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                C6546e c6546e = (C6546e) this.f10922b.get();
                if (c6546e != null) {
                    ArrayList arrayList = c6546e.f10925b;
                    View view = c6546e.f10924a;
                    if (!arrayList.isEmpty()) {
                        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        int i = 0;
                        int iM6189a = c6546e.m6189a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        int iM6189a2 = c6546e.m6189a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                        if (iM6189a > 0 || iM6189a == Integer.MIN_VALUE) {
                            if (iM6189a2 > 0 || iM6189a2 == Integer.MIN_VALUE) {
                                ArrayList arrayList2 = new ArrayList(arrayList);
                                int size = arrayList2.size();
                                while (i < size) {
                                    Object obj = arrayList2.get(i);
                                    i++;
                                    ((C3420a) ((InterfaceC6549h) obj)).m2431m(iM6189a, iM6189a2);
                                }
                                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                                if (viewTreeObserver.isAlive()) {
                                    viewTreeObserver.removeOnPreDrawListener(c6546e.f10926c);
                                }
                                c6546e.f10926c = null;
                                arrayList.clear();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                C6551j c6551j = (C6551j) this.f10922b.get();
                if (c6551j != null) {
                    ArrayList arrayList3 = c6551j.f10932b;
                    View view2 = c6551j.f10931a;
                    if (!arrayList3.isEmpty()) {
                        int paddingRight2 = view2.getPaddingRight() + view2.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                        int i8 = 0;
                        int iM6190a = c6551j.m6190a(view2.getWidth(), layoutParams3 != null ? layoutParams3.width : 0, paddingRight2);
                        int paddingBottom2 = view2.getPaddingBottom() + view2.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
                        int iM6190a2 = c6551j.m6190a(view2.getHeight(), layoutParams4 != null ? layoutParams4.height : 0, paddingBottom2);
                        if (iM6190a > 0 || iM6190a == Integer.MIN_VALUE) {
                            if (iM6190a2 > 0 || iM6190a2 == Integer.MIN_VALUE) {
                                ArrayList arrayList4 = new ArrayList(arrayList3);
                                int size2 = arrayList4.size();
                                while (i8 < size2) {
                                    Object obj2 = arrayList4.get(i8);
                                    i8++;
                                    ((C3420a) ((InterfaceC6549h) obj2)).m2431m(iM6190a, iM6190a2);
                                }
                                ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
                                if (viewTreeObserver2.isAlive()) {
                                    viewTreeObserver2.removeOnPreDrawListener(c6551j.f10933c);
                                }
                                c6551j.f10933c = null;
                                arrayList3.clear();
                                break;
                            }
                        }
                    }
                }
                break;
        }
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC6545d(C6551j c6551j) {
        this.f10922b = new WeakReference(c6551j);
    }
}
