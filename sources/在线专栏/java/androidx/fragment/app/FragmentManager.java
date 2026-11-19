package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.AbstractC0055b;
import androidx.activity.InterfaceC0056c;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.AbstractC0066b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.InterfaceC0065a;
import androidx.activity.result.InterfaceC0067c;
import androidx.collection.C0248b;
import androidx.fragment.app.AbstractC0470s;
import androidx.fragment.app.C0455d;
import androidx.fragment.app.C0471t;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC0496f;
import androidx.lifecycle.C0493d0;
import androidx.lifecycle.InterfaceC0495e0;
import androidx.lifecycle.InterfaceC0501i;
import androidx.lifecycle.InterfaceC0504l;
import com.umeng.analytics.pro.C1913n;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p010b.AbstractC1015a;
import p010b.C1016b;
import p010b.C1017c;
import p099i0.C2663b;
import p172y.C3483b;

/* loaded from: classes.dex */
public abstract class FragmentManager {

    /* renamed from: O */
    private static boolean f3014O = false;

    /* renamed from: P */
    static boolean f3015P = true;

    /* renamed from: A */
    private AbstractC0066b<IntentSenderRequest> f3016A;

    /* renamed from: B */
    private AbstractC0066b<String[]> f3017B;

    /* renamed from: D */
    private boolean f3019D;

    /* renamed from: E */
    private boolean f3020E;

    /* renamed from: F */
    private boolean f3021F;

    /* renamed from: G */
    private boolean f3022G;

    /* renamed from: H */
    private boolean f3023H;

    /* renamed from: I */
    private ArrayList<C0451a> f3024I;

    /* renamed from: J */
    private ArrayList<Boolean> f3025J;

    /* renamed from: K */
    private ArrayList<Fragment> f3026K;

    /* renamed from: L */
    private ArrayList<C0446o> f3027L;

    /* renamed from: M */
    private C0463l f3028M;

    /* renamed from: b */
    private boolean f3031b;

    /* renamed from: d */
    ArrayList<C0451a> f3033d;

    /* renamed from: e */
    private ArrayList<Fragment> f3034e;

    /* renamed from: g */
    private OnBackPressedDispatcher f3036g;

    /* renamed from: l */
    private ArrayList<InterfaceC0443l> f3041l;

    /* renamed from: r */
    private AbstractC0459h<?> f3047r;

    /* renamed from: s */
    private AbstractC0456e f3048s;

    /* renamed from: t */
    private Fragment f3049t;

    /* renamed from: u */
    Fragment f3050u;

    /* renamed from: z */
    private AbstractC0066b<Intent> f3055z;

    /* renamed from: a */
    private final ArrayList<InterfaceC0444m> f3030a = new ArrayList<>();

    /* renamed from: c */
    private final C0469r f3032c = new C0469r();

    /* renamed from: f */
    private final LayoutInflaterFactory2C0460i f3035f = new LayoutInflaterFactory2C0460i(this);

    /* renamed from: h */
    private final AbstractC0055b f3037h = new C0434c(false);

    /* renamed from: i */
    private final AtomicInteger f3038i = new AtomicInteger();

    /* renamed from: j */
    private final Map<String, Bundle> f3039j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k */
    private final Map<String, Object> f3040k = Collections.synchronizedMap(new HashMap());

    /* renamed from: m */
    private Map<Fragment, HashSet<C3483b>> f3042m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n */
    private final C0471t.g f3043n = new C0435d();

    /* renamed from: o */
    private final C0461j f3044o = new C0461j(this);

    /* renamed from: p */
    private final CopyOnWriteArrayList<InterfaceC0464m> f3045p = new CopyOnWriteArrayList<>();

    /* renamed from: q */
    int f3046q = -1;

    /* renamed from: v */
    private C0458g f3051v = null;

    /* renamed from: w */
    private C0458g f3052w = new C0436e();

    /* renamed from: x */
    private InterfaceC0477z f3053x = null;

    /* renamed from: y */
    private InterfaceC0477z f3054y = new C0437f();

    /* renamed from: C */
    ArrayDeque<LaunchedFragmentInfo> f3018C = new ArrayDeque<>();

    /* renamed from: N */
    private Runnable f3029N = new RunnableC0438g();

    /* renamed from: androidx.fragment.app.FragmentManager$6 */
    class C04306 implements InterfaceC0501i {

        /* renamed from: a */
        final /* synthetic */ String f3056a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC0466o f3057b;

        /* renamed from: c */
        final /* synthetic */ AbstractC0496f f3058c;

        /* renamed from: d */
        final /* synthetic */ FragmentManager f3059d;

        @Override // androidx.lifecycle.InterfaceC0501i
        /* renamed from: d */
        public void mo63d(InterfaceC0504l interfaceC0504l, AbstractC0496f.b bVar) {
            Bundle bundle;
            if (bVar == AbstractC0496f.b.ON_START && (bundle = (Bundle) this.f3059d.f3039j.get(this.f3056a)) != null) {
                this.f3057b.m2651a(this.f3056a, bundle);
                this.f3059d.m2499r(this.f3056a);
            }
            if (bVar == AbstractC0496f.b.ON_DESTROY) {
                this.f3058c.mo2869c(this);
                this.f3059d.f3040k.remove(this.f3056a);
            }
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$a */
    class C0432a implements InterfaceC0065a<ActivityResult> {
        C0432a() {
        }

        @Override // androidx.activity.result.InterfaceC0065a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo105a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.f3018C.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = launchedFragmentInfoPollFirst.f3060a;
            int i4 = launchedFragmentInfoPollFirst.f3061b;
            Fragment fragmentM2683i = FragmentManager.this.f3032c.m2683i(str);
            if (fragmentM2683i != null) {
                fragmentM2683i.onActivityResult(i4, activityResult.m78b(), activityResult.m77a());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$b */
    class C0433b implements InterfaceC0065a<Map<String, Boolean>> {
        C0433b() {
        }

        @Override // androidx.activity.result.InterfaceC0065a
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo105a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                iArr[i4] = ((Boolean) arrayList.get(i4)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.f3018C.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = launchedFragmentInfoPollFirst.f3060a;
            int i5 = launchedFragmentInfoPollFirst.f3061b;
            Fragment fragmentM2683i = FragmentManager.this.f3032c.m2683i(str);
            if (fragmentM2683i != null) {
                fragmentM2683i.onRequestPermissionsResult(i5, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$c */
    class C0434c extends AbstractC0055b {
        C0434c(boolean z3) {
            super(z3);
        }

        @Override // androidx.activity.AbstractC0055b
        /* renamed from: b */
        public void mo71b() {
            FragmentManager.this.m2429D0();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$d */
    class C0435d implements C0471t.g {
        C0435d() {
        }

        @Override // androidx.fragment.app.C0471t.g
        /* renamed from: a */
        public void mo2517a(Fragment fragment, C3483b c3483b) {
            FragmentManager.this.m2473f(fragment, c3483b);
        }

        @Override // androidx.fragment.app.C0471t.g
        /* renamed from: b */
        public void mo2518b(Fragment fragment, C3483b c3483b) {
            if (c3483b.m10556b()) {
                return;
            }
            FragmentManager.this.m2472e1(fragment, c3483b);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$e */
    class C0436e extends C0458g {
        C0436e() {
        }

        @Override // androidx.fragment.app.C0458g
        /* renamed from: a */
        public Fragment mo2519a(ClassLoader classLoader, String str) {
            return FragmentManager.this.m2505v0().m2590b(FragmentManager.this.m2505v0().m2619f(), str, null);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$f */
    class C0437f implements InterfaceC0477z {
        C0437f() {
        }

        @Override // androidx.fragment.app.InterfaceC0477z
        /* renamed from: a */
        public AbstractC0476y mo2520a(ViewGroup viewGroup) {
            return new C0453b(viewGroup);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$g */
    class RunnableC0438g implements Runnable {
        RunnableC0438g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.m2467b0(true);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$h */
    class C0439h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3069a;

        /* renamed from: b */
        final /* synthetic */ View f3070b;

        /* renamed from: c */
        final /* synthetic */ Fragment f3071c;

        C0439h(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f3069a = viewGroup;
            this.f3070b = view;
            this.f3071c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3069a.endViewTransition(this.f3070b);
            animator.removeListener(this);
            Fragment fragment = this.f3071c;
            View view = fragment.mView;
            if (view == null || !fragment.mHidden) {
                return;
            }
            view.setVisibility(8);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$i */
    class C0440i implements InterfaceC0464m {

        /* renamed from: a */
        final /* synthetic */ Fragment f3073a;

        C0440i(Fragment fragment) {
            this.f3073a = fragment;
        }

        @Override // androidx.fragment.app.InterfaceC0464m
        /* renamed from: a */
        public void mo2378a(FragmentManager fragmentManager, Fragment fragment) {
            this.f3073a.onAttachFragment(fragment);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$j */
    class C0441j implements InterfaceC0065a<ActivityResult> {
        C0441j() {
        }

        @Override // androidx.activity.result.InterfaceC0065a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo105a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.f3018C.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = launchedFragmentInfoPollFirst.f3060a;
            int i4 = launchedFragmentInfoPollFirst.f3061b;
            Fragment fragmentM2683i = FragmentManager.this.f3032c.m2683i(str);
            if (fragmentM2683i != null) {
                fragmentM2683i.onActivityResult(i4, activityResult.m78b(), activityResult.m77a());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$k */
    static class C0442k extends AbstractC1015a<IntentSenderRequest, ActivityResult> {
        C0442k() {
        }

        @Override // p010b.AbstractC1015a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent mo2522a(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intentM96a = intentSenderRequest.m96a();
            if (intentM96a != null && (bundleExtra = intentM96a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intentM96a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intentM96a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.C0064b(intentSenderRequest.m99d()).m103b(null).m104c(intentSenderRequest.m98c(), intentSenderRequest.m97b()).m102a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.m2388H0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // p010b.AbstractC1015a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public ActivityResult mo2523c(int i4, Intent intent) {
            return new ActivityResult(i4, intent);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$l */
    public interface InterfaceC0443l {
        /* renamed from: a */
        void m2526a();
    }

    /* renamed from: androidx.fragment.app.FragmentManager$m */
    interface InterfaceC0444m {
        /* renamed from: a */
        boolean mo2527a(ArrayList<C0451a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.FragmentManager$n */
    private class C0445n implements InterfaceC0444m {

        /* renamed from: a */
        final String f3076a;

        /* renamed from: b */
        final int f3077b;

        /* renamed from: c */
        final int f3078c;

        C0445n(String str, int i4, int i5) {
            this.f3076a = str;
            this.f3077b = i4;
            this.f3078c = i5;
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC0444m
        /* renamed from: a */
        public boolean mo2527a(ArrayList<C0451a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f3050u;
            if (fragment == null || this.f3077b >= 0 || this.f3076a != null || !fragment.getChildFragmentManager().m2466Z0()) {
                return FragmentManager.this.m2468b1(arrayList, arrayList2, this.f3076a, this.f3077b, this.f3078c);
            }
            return false;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$o */
    static class C0446o implements Fragment.InterfaceC0426l {

        /* renamed from: a */
        final boolean f3080a;

        /* renamed from: b */
        final C0451a f3081b;

        /* renamed from: c */
        private int f3082c;

        C0446o(C0451a c0451a, boolean z3) {
            this.f3080a = z3;
            this.f3081b = c0451a;
        }

        @Override // androidx.fragment.app.Fragment.InterfaceC0426l
        /* renamed from: a */
        public void mo2376a() {
            int i4 = this.f3082c - 1;
            this.f3082c = i4;
            if (i4 != 0) {
                return;
            }
            this.f3081b.f3116t.m2492n1();
        }

        @Override // androidx.fragment.app.Fragment.InterfaceC0426l
        /* renamed from: b */
        public void mo2377b() {
            this.f3082c++;
        }

        /* renamed from: c */
        void m2528c() {
            C0451a c0451a = this.f3081b;
            c0451a.f3116t.m2503u(c0451a, this.f3080a, false, false);
        }

        /* renamed from: d */
        void m2529d() {
            boolean z3 = this.f3082c > 0;
            for (Fragment fragment : this.f3081b.f3116t.m2504u0()) {
                fragment.setOnStartEnterTransitionListener(null);
                if (z3 && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            C0451a c0451a = this.f3081b;
            c0451a.f3116t.m2503u(c0451a, this.f3080a, !z3, true);
        }

        /* renamed from: e */
        public boolean m2530e() {
            return this.f3082c == 0;
        }
    }

    /* renamed from: B0 */
    static Fragment m2387B0(View view) {
        Object tag = view.getTag(C2663b.f10585a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* renamed from: H0 */
    static boolean m2388H0(int i4) {
        return f3014O || Log.isLoggable("FragmentManager", i4);
    }

    /* renamed from: I0 */
    private boolean m2389I0(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.m2493o();
    }

    /* renamed from: M */
    private void m2390M(Fragment fragment) {
        if (fragment == null || !fragment.equals(m2478h0(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    /* renamed from: Q0 */
    private void m2391Q0(C0248b<Fragment> c0248b) {
        int size = c0248b.size();
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragmentM1102h = c0248b.m1102h(i4);
            if (!fragmentM1102h.mAdded) {
                View viewRequireView = fragmentM1102h.requireView();
                fragmentM1102h.mPostponedAlpha = viewRequireView.getAlpha();
                viewRequireView.setAlpha(IGoodView.DEFAULT_TO_ALPHA);
            }
        }
    }

    /* renamed from: T */
    private void m2392T(int i4) {
        try {
            this.f3031b = true;
            this.f3032c.m2678d(i4);
            m2455S0(i4, false);
            if (f3015P) {
                Iterator<AbstractC0476y> it = m2416s().iterator();
                while (it.hasNext()) {
                    it.next().m2784j();
                }
            }
            this.f3031b = false;
            m2467b0(true);
        } catch (Throwable th) {
            this.f3031b = false;
            throw th;
        }
    }

    /* renamed from: W */
    private void m2393W() {
        if (this.f3023H) {
            this.f3023H = false;
            m2418t1();
        }
    }

    /* renamed from: Y */
    private void m2394Y() {
        if (f3015P) {
            Iterator<AbstractC0476y> it = m2416s().iterator();
            while (it.hasNext()) {
                it.next().m2784j();
            }
        } else {
            if (this.f3042m.isEmpty()) {
                return;
            }
            for (Fragment fragment : this.f3042m.keySet()) {
                m2410n(fragment);
                m2456T0(fragment);
            }
        }
    }

    /* renamed from: a0 */
    private void m2396a0(boolean z3) {
        if (this.f3031b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f3047r == null) {
            if (!this.f3022G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f3047r.m2620g().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z3) {
            m2412p();
        }
        if (this.f3024I == null) {
            this.f3024I = new ArrayList<>();
            this.f3025J = new ArrayList<>();
        }
        this.f3031b = true;
        try {
            m2404g0(null, null);
        } finally {
            this.f3031b = false;
        }
    }

    /* renamed from: a1 */
    private boolean m2397a1(String str, int i4, int i5) {
        m2467b0(false);
        m2396a0(true);
        Fragment fragment = this.f3050u;
        if (fragment != null && i4 < 0 && str == null && fragment.getChildFragmentManager().m2466Z0()) {
            return true;
        }
        boolean zM2468b1 = m2468b1(this.f3024I, this.f3025J, str, i4, i5);
        if (zM2468b1) {
            this.f3031b = true;
            try {
                m2405g1(this.f3024I, this.f3025J);
            } finally {
                m2413q();
            }
        }
        m2421v1();
        m2393W();
        this.f3032c.m2676b();
        return zM2468b1;
    }

    /* renamed from: c1 */
    private int m2400c1(ArrayList<C0451a> arrayList, ArrayList<Boolean> arrayList2, int i4, int i5, C0248b<Fragment> c0248b) {
        int i6 = i5;
        for (int i7 = i5 - 1; i7 >= i4; i7--) {
            C0451a c0451a = arrayList.get(i7);
            boolean zBooleanValue = arrayList2.get(i7).booleanValue();
            if (c0451a.m2546G() && !c0451a.m2545E(arrayList, i7 + 1, i5)) {
                if (this.f3027L == null) {
                    this.f3027L = new ArrayList<>();
                }
                C0446o c0446o = new C0446o(c0451a, zBooleanValue);
                this.f3027L.add(c0446o);
                c0451a.m2548I(c0446o);
                if (zBooleanValue) {
                    c0451a.m2564z();
                } else {
                    c0451a.m2541A(false);
                }
                i6--;
                if (i7 != i6) {
                    arrayList.remove(i7);
                    arrayList.add(i6, c0451a);
                }
                m2401d(c0248b);
            }
        }
        return i6;
    }

    /* renamed from: d */
    private void m2401d(C0248b<Fragment> c0248b) {
        int i4 = this.f3046q;
        if (i4 < 1) {
            return;
        }
        int iMin = Math.min(i4, 5);
        for (Fragment fragment : this.f3032c.m2688n()) {
            if (fragment.mState < iMin) {
                m2458U0(fragment, iMin);
                if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                    c0248b.add(fragment);
                }
            }
        }
    }

    /* renamed from: d0 */
    private static void m2402d0(ArrayList<C0451a> arrayList, ArrayList<Boolean> arrayList2, int i4, int i5) {
        while (i4 < i5) {
            C0451a c0451a = arrayList.get(i4);
            if (arrayList2.get(i4).booleanValue()) {
                c0451a.m2560v(-1);
                c0451a.m2541A(i4 == i5 + (-1));
            } else {
                c0451a.m2560v(1);
                c0451a.m2564z();
            }
            i4++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /* renamed from: e0 */
    private void m2403e0(ArrayList<C0451a> arrayList, ArrayList<Boolean> arrayList2, int i4, int i5) {
        ?? r12;
        boolean z3;
        int i6;
        int i7;
        ArrayList<Boolean> arrayList3;
        int i8;
        int iM2400c1;
        ArrayList<Boolean> arrayList4;
        int i9;
        boolean z4;
        boolean z5 = arrayList.get(i4).f3234r;
        ArrayList<Fragment> arrayList5 = this.f3026K;
        if (arrayList5 == null) {
            this.f3026K = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.f3026K.addAll(this.f3032c.m2688n());
        Fragment fragmentM2512z0 = m2512z0();
        boolean z6 = false;
        for (int i10 = i4; i10 < i5; i10++) {
            C0451a c0451a = arrayList.get(i10);
            fragmentM2512z0 = !arrayList2.get(i10).booleanValue() ? c0451a.m2542B(this.f3026K, fragmentM2512z0) : c0451a.m2549J(this.f3026K, fragmentM2512z0);
            z6 = z6 || c0451a.f3225i;
        }
        this.f3026K.clear();
        if (z5 || this.f3046q < 1) {
            r12 = 1;
        } else if (f3015P) {
            for (int i11 = i4; i11 < i5; i11++) {
                Iterator<AbstractC0470s.a> it = arrayList.get(i11).f3219c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f3237b;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.f3032c.m2690p(m2506w(fragment));
                    }
                }
            }
            r12 = 1;
        } else {
            r12 = 1;
            C0471t.m2710B(this.f3047r.m2619f(), this.f3048s, arrayList, arrayList2, i4, i5, false, this.f3043n);
        }
        m2402d0(arrayList, arrayList2, i4, i5);
        if (f3015P) {
            boolean zBooleanValue = arrayList2.get(i5 - 1).booleanValue();
            for (int i12 = i4; i12 < i5; i12++) {
                C0451a c0451a2 = arrayList.get(i12);
                if (zBooleanValue) {
                    for (int size = c0451a2.f3219c.size() - r12; size >= 0; size--) {
                        Fragment fragment2 = c0451a2.f3219c.get(size).f3237b;
                        if (fragment2 != null) {
                            m2506w(fragment2).m2665m();
                        }
                    }
                } else {
                    Iterator<AbstractC0470s.a> it2 = c0451a2.f3219c.iterator();
                    while (it2.hasNext()) {
                        Fragment fragment3 = it2.next().f3237b;
                        if (fragment3 != null) {
                            m2506w(fragment3).m2665m();
                        }
                    }
                }
            }
            m2455S0(this.f3046q, r12);
            for (AbstractC0476y abstractC0476y : m2417t(arrayList, i4, i5)) {
                abstractC0476y.m2789r(zBooleanValue);
                abstractC0476y.m2788p();
                abstractC0476y.m2783g();
            }
            i9 = i5;
            arrayList4 = arrayList2;
        } else {
            if (z5) {
                C0248b c0248b = new C0248b();
                m2401d(c0248b);
                i8 = 1;
                z3 = z5;
                i6 = i5;
                i7 = i4;
                arrayList3 = arrayList2;
                iM2400c1 = m2400c1(arrayList, arrayList2, i4, i5, c0248b);
                m2391Q0(c0248b);
            } else {
                z3 = z5;
                i6 = i5;
                i7 = i4;
                arrayList3 = arrayList2;
                i8 = 1;
                iM2400c1 = i6;
            }
            if (iM2400c1 == i7 || !z3) {
                arrayList4 = arrayList3;
                i9 = i6;
            } else {
                if (this.f3046q >= i8) {
                    arrayList4 = arrayList3;
                    int i13 = iM2400c1;
                    i9 = i6;
                    z4 = true;
                    C0471t.m2710B(this.f3047r.m2619f(), this.f3048s, arrayList, arrayList2, i4, i13, true, this.f3043n);
                } else {
                    arrayList4 = arrayList3;
                    i9 = i6;
                    z4 = true;
                }
                m2455S0(this.f3046q, z4);
            }
        }
        for (int i14 = i4; i14 < i9; i14++) {
            C0451a c0451a3 = arrayList.get(i14);
            if (arrayList4.get(i14).booleanValue() && c0451a3.f3118v >= 0) {
                c0451a3.f3118v = -1;
            }
            c0451a3.m2547H();
        }
        if (z6) {
            m2406i1();
        }
    }

    /* renamed from: g0 */
    private void m2404g0(ArrayList<C0451a> arrayList, ArrayList<Boolean> arrayList2) {
        int iIndexOf;
        int iIndexOf2;
        ArrayList<C0446o> arrayList3 = this.f3027L;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i4 = 0;
        while (i4 < size) {
            C0446o c0446o = this.f3027L.get(i4);
            if (arrayList != null && !c0446o.f3080a && (iIndexOf2 = arrayList.indexOf(c0446o.f3081b)) != -1 && arrayList2 != null && arrayList2.get(iIndexOf2).booleanValue()) {
                this.f3027L.remove(i4);
                i4--;
                size--;
                c0446o.m2528c();
            } else if (c0446o.m2530e() || (arrayList != null && c0446o.f3081b.m2545E(arrayList, 0, arrayList.size()))) {
                this.f3027L.remove(i4);
                i4--;
                size--;
                if (arrayList == null || c0446o.f3080a || (iIndexOf = arrayList.indexOf(c0446o.f3081b)) == -1 || arrayList2 == null || !arrayList2.get(iIndexOf).booleanValue()) {
                    c0446o.m2529d();
                } else {
                    c0446o.m2528c();
                }
            }
            i4++;
        }
    }

    /* renamed from: g1 */
    private void m2405g1(ArrayList<C0451a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        m2404g0(arrayList, arrayList2);
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            if (!arrayList.get(i4).f3234r) {
                if (i5 != i4) {
                    m2403e0(arrayList, arrayList2, i5, i4);
                }
                i5 = i4 + 1;
                if (arrayList2.get(i4).booleanValue()) {
                    while (i5 < size && arrayList2.get(i5).booleanValue() && !arrayList.get(i5).f3234r) {
                        i5++;
                    }
                }
                m2403e0(arrayList, arrayList2, i4, i5);
                i4 = i5 - 1;
            }
            i4++;
        }
        if (i5 != size) {
            m2403e0(arrayList, arrayList2, i5, size);
        }
    }

    /* renamed from: i1 */
    private void m2406i1() {
        if (this.f3041l != null) {
            for (int i4 = 0; i4 < this.f3041l.size(); i4++) {
                this.f3041l.get(i4).m2526a();
            }
        }
    }

    /* renamed from: k1 */
    static int m2407k1(int i4) {
        if (i4 == 4097) {
            return C1913n.a.f8875q;
        }
        if (i4 == 4099) {
            return C1913n.a.f8861c;
        }
        if (i4 != 8194) {
            return 0;
        }
        return C1913n.a.f8859a;
    }

    /* renamed from: l0 */
    private void m2408l0() {
        if (f3015P) {
            Iterator<AbstractC0476y> it = m2416s().iterator();
            while (it.hasNext()) {
                it.next().m2785k();
            }
        } else if (this.f3027L != null) {
            while (!this.f3027L.isEmpty()) {
                this.f3027L.remove(0).m2529d();
            }
        }
    }

    /* renamed from: m0 */
    private boolean m2409m0(ArrayList<C0451a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f3030a) {
            if (this.f3030a.isEmpty()) {
                return false;
            }
            int size = this.f3030a.size();
            boolean zMo2527a = false;
            for (int i4 = 0; i4 < size; i4++) {
                zMo2527a |= this.f3030a.get(i4).mo2527a(arrayList, arrayList2);
            }
            this.f3030a.clear();
            this.f3047r.m2620g().removeCallbacks(this.f3029N);
            return zMo2527a;
        }
    }

    /* renamed from: n */
    private void m2410n(Fragment fragment) {
        HashSet<C3483b> hashSet = this.f3042m.get(fragment);
        if (hashSet != null) {
            Iterator<C3483b> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().m10555a();
            }
            hashSet.clear();
            m2422x(fragment);
            this.f3042m.remove(fragment);
        }
    }

    /* renamed from: o0 */
    private C0463l m2411o0(Fragment fragment) {
        return this.f3028M.m2643i(fragment);
    }

    /* renamed from: p */
    private void m2412p() {
        if (m2444M0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: q */
    private void m2413q() {
        this.f3031b = false;
        this.f3025J.clear();
        this.f3024I.clear();
    }

    /* renamed from: r0 */
    private ViewGroup m2414r0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f3048s.mo2372d()) {
            View viewMo2371c = this.f3048s.mo2371c(fragment.mContainerId);
            if (viewMo2371c instanceof ViewGroup) {
                return (ViewGroup) viewMo2371c;
            }
        }
        return null;
    }

    /* renamed from: r1 */
    private void m2415r1(Fragment fragment) {
        ViewGroup viewGroupM2414r0 = m2414r0(fragment);
        if (viewGroupM2414r0 == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        int i4 = C2663b.f10587c;
        if (viewGroupM2414r0.getTag(i4) == null) {
            viewGroupM2414r0.setTag(i4, fragment);
        }
        ((Fragment) viewGroupM2414r0.getTag(i4)).setPopDirection(fragment.getPopDirection());
    }

    /* renamed from: s */
    private Set<AbstractC0476y> m2416s() {
        HashSet hashSet = new HashSet();
        Iterator<C0467p> it = this.f3032c.m2685k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().m2664k().mContainer;
            if (viewGroup != null) {
                hashSet.add(AbstractC0476y.m2777o(viewGroup, m2424A0()));
            }
        }
        return hashSet;
    }

    /* renamed from: t */
    private Set<AbstractC0476y> m2417t(ArrayList<C0451a> arrayList, int i4, int i5) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i4 < i5) {
            Iterator<AbstractC0470s.a> it = arrayList.get(i4).f3219c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f3237b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(AbstractC0476y.m2776n(viewGroup, this));
                }
            }
            i4++;
        }
        return hashSet;
    }

    /* renamed from: t1 */
    private void m2418t1() {
        Iterator<C0467p> it = this.f3032c.m2685k().iterator();
        while (it.hasNext()) {
            m2463X0(it.next());
        }
    }

    /* renamed from: u1 */
    private void m2419u1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0475x("FragmentManager"));
        AbstractC0459h<?> abstractC0459h = this.f3047r;
        if (abstractC0459h != null) {
            try {
                abstractC0459h.mo2379h("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e4) {
                Log.e("FragmentManager", "Failed dumping state", e4);
                throw runtimeException;
            }
        }
        try {
            m2462X("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e5) {
            Log.e("FragmentManager", "Failed dumping state", e5);
            throw runtimeException;
        }
    }

    /* renamed from: v */
    private void m2420v(Fragment fragment) {
        Animator animator;
        if (fragment.mView != null) {
            C0455d.d dVarM2588c = C0455d.m2588c(this.f3047r.m2619f(), fragment, !fragment.mHidden, fragment.getPopDirection());
            if (dVarM2588c == null || (animator = dVarM2588c.f3179b) == null) {
                if (dVarM2588c != null) {
                    fragment.mView.startAnimation(dVarM2588c.f3178a);
                    dVarM2588c.f3178a.start();
                }
                fragment.mView.setVisibility((!fragment.mHidden || fragment.isHideReplaced()) ? 0 : 8);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            } else {
                animator.setTarget(fragment.mView);
                if (!fragment.mHidden) {
                    fragment.mView.setVisibility(0);
                } else if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                } else {
                    ViewGroup viewGroup = fragment.mContainer;
                    View view = fragment.mView;
                    viewGroup.startViewTransition(view);
                    dVarM2588c.f3179b.addListener(new C0439h(viewGroup, view, fragment));
                }
                dVarM2588c.f3179b.start();
            }
        }
        m2433F0(fragment);
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    /* renamed from: v1 */
    private void m2421v1() {
        synchronized (this.f3030a) {
            if (this.f3030a.isEmpty()) {
                this.f3037h.m75f(m2491n0() > 0 && m2441K0(this.f3049t));
            } else {
                this.f3037h.m75f(true);
            }
        }
    }

    /* renamed from: x */
    private void m2422x(Fragment fragment) {
        fragment.performDestroyView();
        this.f3044o.m2637n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.setValue(null);
        fragment.mInLayout = false;
    }

    /* renamed from: A */
    void m2423A() {
        this.f3020E = false;
        this.f3021F = false;
        this.f3028M.m2648o(false);
        m2392T(0);
    }

    /* renamed from: A0 */
    InterfaceC0477z m2424A0() {
        InterfaceC0477z interfaceC0477z = this.f3053x;
        if (interfaceC0477z != null) {
            return interfaceC0477z;
        }
        Fragment fragment = this.f3049t;
        return fragment != null ? fragment.mFragmentManager.m2424A0() : this.f3054y;
    }

    /* renamed from: B */
    void m2425B(Configuration configuration) {
        for (Fragment fragment : this.f3032c.m2688n()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    /* renamed from: C */
    boolean m2426C(MenuItem menuItem) {
        if (this.f3046q < 1) {
            return false;
        }
        for (Fragment fragment : this.f3032c.m2688n()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: C0 */
    C0493d0 m2427C0(Fragment fragment) {
        return this.f3028M.m2645l(fragment);
    }

    /* renamed from: D */
    void m2428D() {
        this.f3020E = false;
        this.f3021F = false;
        this.f3028M.m2648o(false);
        m2392T(1);
    }

    /* renamed from: D0 */
    void m2429D0() {
        m2467b0(true);
        if (this.f3037h.m72c()) {
            m2466Z0();
        } else {
            this.f3036g.m69c();
        }
    }

    /* renamed from: E */
    boolean m2430E(Menu menu, MenuInflater menuInflater) {
        if (this.f3046q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z3 = false;
        for (Fragment fragment : this.f3032c.m2688n()) {
            if (fragment != null && m2439J0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z3 = true;
            }
        }
        if (this.f3034e != null) {
            for (int i4 = 0; i4 < this.f3034e.size(); i4++) {
                Fragment fragment2 = this.f3034e.get(i4);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f3034e = arrayList;
        return z3;
    }

    /* renamed from: E0 */
    void m2431E0(Fragment fragment) {
        if (m2388H0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        m2415r1(fragment);
    }

    /* renamed from: F */
    void m2432F() {
        this.f3022G = true;
        m2467b0(true);
        m2394Y();
        m2392T(-1);
        this.f3047r = null;
        this.f3048s = null;
        this.f3049t = null;
        if (this.f3036g != null) {
            this.f3037h.m73d();
            this.f3036g = null;
        }
        AbstractC0066b<Intent> abstractC0066b = this.f3055z;
        if (abstractC0066b != null) {
            abstractC0066b.mo93c();
            this.f3016A.mo93c();
            this.f3017B.mo93c();
        }
    }

    /* renamed from: F0 */
    void m2433F0(Fragment fragment) {
        if (fragment.mAdded && m2389I0(fragment)) {
            this.f3019D = true;
        }
    }

    /* renamed from: G */
    void m2434G() {
        m2392T(1);
    }

    /* renamed from: G0 */
    public boolean m2435G0() {
        return this.f3022G;
    }

    /* renamed from: H */
    void m2436H() {
        for (Fragment fragment : this.f3032c.m2688n()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    /* renamed from: I */
    void m2437I(boolean z3) {
        for (Fragment fragment : this.f3032c.m2688n()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z3);
            }
        }
    }

    /* renamed from: J */
    void m2438J(Fragment fragment) {
        Iterator<InterfaceC0464m> it = this.f3045p.iterator();
        while (it.hasNext()) {
            it.next().mo2378a(this, fragment);
        }
    }

    /* renamed from: J0 */
    boolean m2439J0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    /* renamed from: K */
    boolean m2440K(MenuItem menuItem) {
        if (this.f3046q < 1) {
            return false;
        }
        for (Fragment fragment : this.f3032c.m2688n()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: K0 */
    boolean m2441K0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.m2512z0()) && m2441K0(fragmentManager.f3049t);
    }

    /* renamed from: L */
    void m2442L(Menu menu) {
        if (this.f3046q < 1) {
            return;
        }
        for (Fragment fragment : this.f3032c.m2688n()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    /* renamed from: L0 */
    boolean m2443L0(int i4) {
        return this.f3046q >= i4;
    }

    /* renamed from: M0 */
    public boolean m2444M0() {
        return this.f3020E || this.f3021F;
    }

    /* renamed from: N */
    void m2445N() {
        m2392T(5);
    }

    /* renamed from: N0 */
    void m2446N0(Fragment fragment, String[] strArr, int i4) {
        if (this.f3017B == null) {
            this.f3047r.m2621k(fragment, strArr, i4);
            return;
        }
        this.f3018C.addLast(new LaunchedFragmentInfo(fragment.mWho, i4));
        this.f3017B.m106a(strArr);
    }

    /* renamed from: O */
    void m2447O(boolean z3) {
        for (Fragment fragment : this.f3032c.m2688n()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z3);
            }
        }
    }

    /* renamed from: O0 */
    void m2448O0(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i4, Bundle bundle) {
        if (this.f3055z == null) {
            this.f3047r.m2622n(fragment, intent, i4, bundle);
            return;
        }
        this.f3018C.addLast(new LaunchedFragmentInfo(fragment.mWho, i4));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f3055z.m106a(intent);
    }

    /* renamed from: P */
    boolean m2449P(Menu menu) {
        boolean z3 = false;
        if (this.f3046q < 1) {
            return false;
        }
        for (Fragment fragment : this.f3032c.m2688n()) {
            if (fragment != null && m2439J0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z3 = true;
            }
        }
        return z3;
    }

    /* renamed from: P0 */
    void m2450P0(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i4, Intent intent, int i5, int i6, int i7, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (this.f3016A == null) {
            this.f3047r.m2623o(fragment, intentSender, i4, intent, i5, i6, i7, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            } else {
                intent2 = intent;
            }
            if (m2388H0(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent2 = intent;
        }
        IntentSenderRequest intentSenderRequestM102a = new IntentSenderRequest.C0064b(intentSender).m103b(intent2).m104c(i6, i5).m102a();
        this.f3018C.addLast(new LaunchedFragmentInfo(fragment.mWho, i4));
        if (m2388H0(2)) {
            Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
        }
        this.f3016A.m106a(intentSenderRequestM102a);
    }

    /* renamed from: Q */
    void m2451Q() {
        m2421v1();
        m2390M(this.f3050u);
    }

    /* renamed from: R */
    void m2452R() {
        this.f3020E = false;
        this.f3021F = false;
        this.f3028M.m2648o(false);
        m2392T(7);
    }

    /* renamed from: R0 */
    void m2453R0(Fragment fragment) {
        if (!this.f3032c.m2677c(fragment.mWho)) {
            if (m2388H0(3)) {
                Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f3046q + "since it is not added to " + this);
                return;
            }
            return;
        }
        m2456T0(fragment);
        View view = fragment.mView;
        if (view != null && fragment.mIsNewlyAdded && fragment.mContainer != null) {
            float f4 = fragment.mPostponedAlpha;
            if (f4 > IGoodView.DEFAULT_TO_ALPHA) {
                view.setAlpha(f4);
            }
            fragment.mPostponedAlpha = IGoodView.DEFAULT_TO_ALPHA;
            fragment.mIsNewlyAdded = false;
            C0455d.d dVarM2588c = C0455d.m2588c(this.f3047r.m2619f(), fragment, true, fragment.getPopDirection());
            if (dVarM2588c != null) {
                Animation animation = dVarM2588c.f3178a;
                if (animation != null) {
                    fragment.mView.startAnimation(animation);
                } else {
                    dVarM2588c.f3179b.setTarget(fragment.mView);
                    dVarM2588c.f3179b.start();
                }
            }
        }
        if (fragment.mHiddenChanged) {
            m2420v(fragment);
        }
    }

    /* renamed from: S */
    void m2454S() {
        this.f3020E = false;
        this.f3021F = false;
        this.f3028M.m2648o(false);
        m2392T(5);
    }

    /* renamed from: S0 */
    void m2455S0(int i4, boolean z3) {
        AbstractC0459h<?> abstractC0459h;
        if (this.f3047r == null && i4 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z3 || i4 != this.f3046q) {
            this.f3046q = i4;
            if (f3015P) {
                this.f3032c.m2692r();
            } else {
                Iterator<Fragment> it = this.f3032c.m2688n().iterator();
                while (it.hasNext()) {
                    m2453R0(it.next());
                }
                for (C0467p c0467p : this.f3032c.m2685k()) {
                    Fragment fragmentM2664k = c0467p.m2664k();
                    if (!fragmentM2664k.mIsNewlyAdded) {
                        m2453R0(fragmentM2664k);
                    }
                    if (fragmentM2664k.mRemoving && !fragmentM2664k.isInBackStack()) {
                        this.f3032c.m2691q(c0467p);
                    }
                }
            }
            m2418t1();
            if (this.f3019D && (abstractC0459h = this.f3047r) != null && this.f3046q == 7) {
                abstractC0459h.mo2384p();
                this.f3019D = false;
            }
        }
    }

    /* renamed from: T0 */
    void m2456T0(Fragment fragment) {
        m2458U0(fragment, this.f3046q);
    }

    /* renamed from: U */
    void m2457U() {
        this.f3021F = true;
        this.f3028M.m2648o(true);
        m2392T(4);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0160  */
    /* renamed from: U0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m2458U0(androidx.fragment.app.Fragment r11, int r12) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.m2458U0(androidx.fragment.app.Fragment, int):void");
    }

    /* renamed from: V */
    void m2459V() {
        m2392T(2);
    }

    /* renamed from: V0 */
    void m2460V0() {
        if (this.f3047r == null) {
            return;
        }
        this.f3020E = false;
        this.f3021F = false;
        this.f3028M.m2648o(false);
        for (Fragment fragment : this.f3032c.m2688n()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    /* renamed from: W0 */
    void m2461W0(FragmentContainerView fragmentContainerView) {
        View view;
        for (C0467p c0467p : this.f3032c.m2685k()) {
            Fragment fragmentM2664k = c0467p.m2664k();
            if (fragmentM2664k.mContainerId == fragmentContainerView.getId() && (view = fragmentM2664k.mView) != null && view.getParent() == null) {
                fragmentM2664k.mContainer = fragmentContainerView;
                c0467p.m2655b();
            }
        }
    }

    /* renamed from: X */
    public void m2462X(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f3032c.m2679e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f3034e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < size2; i4++) {
                Fragment fragment = this.f3034e.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList<C0451a> arrayList2 = this.f3033d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i5 = 0; i5 < size; i5++) {
                C0451a c0451a = this.f3033d.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(c0451a.toString());
                c0451a.m2562x(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f3038i.get());
        synchronized (this.f3030a) {
            int size3 = this.f3030a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i6 = 0; i6 < size3; i6++) {
                    InterfaceC0444m interfaceC0444m = this.f3030a.get(i6);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i6);
                    printWriter.print(": ");
                    printWriter.println(interfaceC0444m);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f3047r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f3048s);
        if (this.f3049t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f3049t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f3046q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f3020E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f3021F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f3022G);
        if (this.f3019D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f3019D);
        }
    }

    /* renamed from: X0 */
    void m2463X0(C0467p c0467p) {
        Fragment fragmentM2664k = c0467p.m2664k();
        if (fragmentM2664k.mDeferStart) {
            if (this.f3031b) {
                this.f3023H = true;
                return;
            }
            fragmentM2664k.mDeferStart = false;
            if (f3015P) {
                c0467p.m2665m();
            } else {
                m2456T0(fragmentM2664k);
            }
        }
    }

    /* renamed from: Y0 */
    public void m2464Y0(int i4, int i5) {
        if (i4 >= 0) {
            m2465Z(new C0445n(null, i4, i5), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i4);
    }

    /* renamed from: Z */
    void m2465Z(InterfaceC0444m interfaceC0444m, boolean z3) {
        if (!z3) {
            if (this.f3047r == null) {
                if (!this.f3022G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            m2412p();
        }
        synchronized (this.f3030a) {
            if (this.f3047r == null) {
                if (!z3) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f3030a.add(interfaceC0444m);
                m2492n1();
            }
        }
    }

    /* renamed from: Z0 */
    public boolean m2466Z0() {
        return m2397a1(null, -1, 0);
    }

    /* renamed from: b0 */
    boolean m2467b0(boolean z3) {
        m2396a0(z3);
        boolean z4 = false;
        while (m2409m0(this.f3024I, this.f3025J)) {
            this.f3031b = true;
            try {
                m2405g1(this.f3024I, this.f3025J);
                m2413q();
                z4 = true;
            } catch (Throwable th) {
                m2413q();
                throw th;
            }
        }
        m2421v1();
        m2393W();
        this.f3032c.m2676b();
        return z4;
    }

    /* renamed from: b1 */
    boolean m2468b1(ArrayList<C0451a> arrayList, ArrayList<Boolean> arrayList2, String str, int i4, int i5) {
        int i6;
        ArrayList<C0451a> arrayList3 = this.f3033d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i4 < 0 && (i5 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f3033d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i4 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    C0451a c0451a = this.f3033d.get(size2);
                    if ((str != null && str.equals(c0451a.m2543C())) || (i4 >= 0 && i4 == c0451a.f3118v)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i5 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C0451a c0451a2 = this.f3033d.get(size2);
                        if (str == null || !str.equals(c0451a2.m2543C())) {
                            if (i4 < 0 || i4 != c0451a2.f3118v) {
                                break;
                            }
                        }
                    }
                }
                i6 = size2;
            } else {
                i6 = -1;
            }
            if (i6 == this.f3033d.size() - 1) {
                return false;
            }
            for (int size3 = this.f3033d.size() - 1; size3 > i6; size3--) {
                arrayList.add(this.f3033d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* renamed from: c0 */
    void m2469c0(InterfaceC0444m interfaceC0444m, boolean z3) {
        if (z3 && (this.f3047r == null || this.f3022G)) {
            return;
        }
        m2396a0(z3);
        if (interfaceC0444m.mo2527a(this.f3024I, this.f3025J)) {
            this.f3031b = true;
            try {
                m2405g1(this.f3024I, this.f3025J);
            } finally {
                m2413q();
            }
        }
        m2421v1();
        m2393W();
        this.f3032c.m2676b();
    }

    /* renamed from: d1 */
    public void m2470d1(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            m2419u1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    /* renamed from: e */
    void m2471e(C0451a c0451a) {
        if (this.f3033d == null) {
            this.f3033d = new ArrayList<>();
        }
        this.f3033d.add(c0451a);
    }

    /* renamed from: e1 */
    void m2472e1(Fragment fragment, C3483b c3483b) {
        HashSet<C3483b> hashSet = this.f3042m.get(fragment);
        if (hashSet != null && hashSet.remove(c3483b) && hashSet.isEmpty()) {
            this.f3042m.remove(fragment);
            if (fragment.mState < 5) {
                m2422x(fragment);
                m2456T0(fragment);
            }
        }
    }

    /* renamed from: f */
    void m2473f(Fragment fragment, C3483b c3483b) {
        if (this.f3042m.get(fragment) == null) {
            this.f3042m.put(fragment, new HashSet<>());
        }
        this.f3042m.get(fragment).add(c3483b);
    }

    /* renamed from: f0 */
    public boolean m2474f0() {
        boolean zM2467b0 = m2467b0(true);
        m2408l0();
        return zM2467b0;
    }

    /* renamed from: f1 */
    void m2475f1(Fragment fragment) {
        if (m2388H0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z3 = !fragment.isInBackStack();
        if (!fragment.mDetached || z3) {
            this.f3032c.m2693s(fragment);
            if (m2389I0(fragment)) {
                this.f3019D = true;
            }
            fragment.mRemoving = true;
            m2415r1(fragment);
        }
    }

    /* renamed from: g */
    C0467p m2476g(Fragment fragment) {
        if (m2388H0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        C0467p c0467pM2506w = m2506w(fragment);
        fragment.mFragmentManager = this;
        this.f3032c.m2690p(c0467pM2506w);
        if (!fragment.mDetached) {
            this.f3032c.m2675a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (m2389I0(fragment)) {
                this.f3019D = true;
            }
        }
        return c0467pM2506w;
    }

    /* renamed from: h */
    public void m2477h(InterfaceC0464m interfaceC0464m) {
        this.f3045p.add(interfaceC0464m);
    }

    /* renamed from: h0 */
    Fragment m2478h0(String str) {
        return this.f3032c.m2680f(str);
    }

    /* renamed from: h1 */
    void m2479h1(Fragment fragment) {
        this.f3028M.m2647n(fragment);
    }

    /* renamed from: i */
    void m2480i(Fragment fragment) {
        this.f3028M.m2640f(fragment);
    }

    /* renamed from: i0 */
    public Fragment m2481i0(int i4) {
        return this.f3032c.m2681g(i4);
    }

    /* renamed from: j */
    int m2482j() {
        return this.f3038i.getAndIncrement();
    }

    /* renamed from: j0 */
    public Fragment m2483j0(String str) {
        return this.f3032c.m2682h(str);
    }

    /* renamed from: j1 */
    void m2484j1(Parcelable parcelable) {
        C0467p c0467p;
        if (parcelable == null) {
            return;
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
        if (fragmentManagerState.f3083a == null) {
            return;
        }
        this.f3032c.m2694t();
        Iterator<FragmentState> it = fragmentManagerState.f3083a.iterator();
        while (it.hasNext()) {
            FragmentState next = it.next();
            if (next != null) {
                Fragment fragmentM2642h = this.f3028M.m2642h(next.f3092b);
                if (fragmentM2642h != null) {
                    if (m2388H0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragmentM2642h);
                    }
                    c0467p = new C0467p(this.f3044o, this.f3032c, fragmentM2642h, next);
                } else {
                    c0467p = new C0467p(this.f3044o, this.f3032c, this.f3047r.m2619f().getClassLoader(), m2500s0(), next);
                }
                Fragment fragmentM2664k = c0467p.m2664k();
                fragmentM2664k.mFragmentManager = this;
                if (m2388H0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragmentM2664k.mWho + "): " + fragmentM2664k);
                }
                c0467p.m2667o(this.f3047r.m2619f().getClassLoader());
                this.f3032c.m2690p(c0467p);
                c0467p.m2672u(this.f3046q);
            }
        }
        for (Fragment fragment : this.f3028M.m2644k()) {
            if (!this.f3032c.m2677c(fragment.mWho)) {
                if (m2388H0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + fragmentManagerState.f3083a);
                }
                this.f3028M.m2647n(fragment);
                fragment.mFragmentManager = this;
                C0467p c0467p2 = new C0467p(this.f3044o, this.f3032c, fragment);
                c0467p2.m2672u(1);
                c0467p2.m2665m();
                fragment.mRemoving = true;
                c0467p2.m2665m();
            }
        }
        this.f3032c.m2695u(fragmentManagerState.f3084b);
        if (fragmentManagerState.f3085c != null) {
            this.f3033d = new ArrayList<>(fragmentManagerState.f3085c.length);
            int i4 = 0;
            while (true) {
                BackStackState[] backStackStateArr = fragmentManagerState.f3085c;
                if (i4 >= backStackStateArr.length) {
                    break;
                }
                C0451a c0451aM2365a = backStackStateArr[i4].m2365a(this);
                if (m2388H0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i4 + " (index " + c0451aM2365a.f3118v + "): " + c0451aM2365a);
                    PrintWriter printWriter = new PrintWriter(new C0475x("FragmentManager"));
                    c0451aM2365a.m2563y("  ", printWriter, false);
                    printWriter.close();
                }
                this.f3033d.add(c0451aM2365a);
                i4++;
            }
        } else {
            this.f3033d = null;
        }
        this.f3038i.set(fragmentManagerState.f3086d);
        String str = fragmentManagerState.f3087e;
        if (str != null) {
            Fragment fragmentM2478h0 = m2478h0(str);
            this.f3050u = fragmentM2478h0;
            m2390M(fragmentM2478h0);
        }
        ArrayList<String> arrayList = fragmentManagerState.f3088f;
        if (arrayList != null) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                Bundle bundle = fragmentManagerState.f3089g.get(i5);
                bundle.setClassLoader(this.f3047r.m2619f().getClassLoader());
                this.f3039j.put(arrayList.get(i5), bundle);
            }
        }
        this.f3018C = new ArrayDeque<>(fragmentManagerState.f3090h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SyntheticAccessor"})
    /* renamed from: k */
    void m2485k(AbstractC0459h<?> abstractC0459h, AbstractC0456e abstractC0456e, Fragment fragment) {
        String str;
        if (this.f3047r != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f3047r = abstractC0459h;
        this.f3048s = abstractC0456e;
        this.f3049t = fragment;
        if (fragment != null) {
            m2477h(new C0440i(fragment));
        } else if (abstractC0459h instanceof InterfaceC0464m) {
            m2477h((InterfaceC0464m) abstractC0459h);
        }
        if (this.f3049t != null) {
            m2421v1();
        }
        if (abstractC0459h instanceof InterfaceC0056c) {
            InterfaceC0056c interfaceC0056c = (InterfaceC0056c) abstractC0459h;
            OnBackPressedDispatcher onBackPressedDispatcher = interfaceC0056c.getOnBackPressedDispatcher();
            this.f3036g = onBackPressedDispatcher;
            InterfaceC0504l interfaceC0504l = interfaceC0056c;
            if (fragment != null) {
                interfaceC0504l = fragment;
            }
            onBackPressedDispatcher.m67a(interfaceC0504l, this.f3037h);
        }
        if (fragment != null) {
            this.f3028M = fragment.mFragmentManager.m2411o0(fragment);
        } else if (abstractC0459h instanceof InterfaceC0495e0) {
            this.f3028M = C0463l.m2638j(((InterfaceC0495e0) abstractC0459h).getViewModelStore());
        } else {
            this.f3028M = new C0463l(false);
        }
        this.f3028M.m2648o(m2444M0());
        this.f3032c.m2698x(this.f3028M);
        Object obj = this.f3047r;
        if (obj instanceof InterfaceC0067c) {
            ActivityResultRegistry activityResultRegistry = ((InterfaceC0067c) obj).getActivityResultRegistry();
            if (fragment != null) {
                str = fragment.mWho + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.f3055z = activityResultRegistry.m90j(str2 + "StartActivityForResult", new C1017c(), new C0441j());
            this.f3016A = activityResultRegistry.m90j(str2 + "StartIntentSenderForResult", new C0442k(), new C0432a());
            this.f3017B = activityResultRegistry.m90j(str2 + "RequestPermissions", new C1016b(), new C0433b());
        }
    }

    /* renamed from: k0 */
    Fragment m2486k0(String str) {
        return this.f3032c.m2683i(str);
    }

    /* renamed from: l */
    void m2487l(Fragment fragment) {
        if (m2388H0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f3032c.m2675a(fragment);
            if (m2388H0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (m2389I0(fragment)) {
                this.f3019D = true;
            }
        }
    }

    /* renamed from: l1 */
    Parcelable m2488l1() {
        int size;
        m2408l0();
        m2394Y();
        m2467b0(true);
        this.f3020E = true;
        this.f3028M.m2648o(true);
        ArrayList<FragmentState> arrayListM2696v = this.f3032c.m2696v();
        BackStackState[] backStackStateArr = null;
        if (arrayListM2696v.isEmpty()) {
            if (m2388H0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> arrayListM2697w = this.f3032c.m2697w();
        ArrayList<C0451a> arrayList = this.f3033d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i4 = 0; i4 < size; i4++) {
                backStackStateArr[i4] = new BackStackState(this.f3033d.get(i4));
                if (m2388H0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i4 + ": " + this.f3033d.get(i4));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f3083a = arrayListM2696v;
        fragmentManagerState.f3084b = arrayListM2697w;
        fragmentManagerState.f3085c = backStackStateArr;
        fragmentManagerState.f3086d = this.f3038i.get();
        Fragment fragment = this.f3050u;
        if (fragment != null) {
            fragmentManagerState.f3087e = fragment.mWho;
        }
        fragmentManagerState.f3088f.addAll(this.f3039j.keySet());
        fragmentManagerState.f3089g.addAll(this.f3039j.values());
        fragmentManagerState.f3090h = new ArrayList<>(this.f3018C);
        return fragmentManagerState;
    }

    /* renamed from: m */
    public AbstractC0470s m2489m() {
        return new C0451a(this);
    }

    /* renamed from: m1 */
    public Fragment.SavedState m2490m1(Fragment fragment) {
        C0467p c0467pM2687m = this.f3032c.m2687m(fragment.mWho);
        if (c0467pM2687m == null || !c0467pM2687m.m2664k().equals(fragment)) {
            m2419u1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return c0467pM2687m.m2669r();
    }

    /* renamed from: n0 */
    public int m2491n0() {
        ArrayList<C0451a> arrayList = this.f3033d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: n1 */
    void m2492n1() {
        synchronized (this.f3030a) {
            ArrayList<C0446o> arrayList = this.f3027L;
            boolean z3 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            boolean z4 = this.f3030a.size() == 1;
            if (z3 || z4) {
                this.f3047r.m2620g().removeCallbacks(this.f3029N);
                this.f3047r.m2620g().post(this.f3029N);
                m2421v1();
            }
        }
    }

    /* renamed from: o */
    boolean m2493o() {
        boolean zM2389I0 = false;
        for (Fragment fragment : this.f3032c.m2686l()) {
            if (fragment != null) {
                zM2389I0 = m2389I0(fragment);
            }
            if (zM2389I0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o1 */
    void m2494o1(Fragment fragment, boolean z3) {
        ViewGroup viewGroupM2414r0 = m2414r0(fragment);
        if (viewGroupM2414r0 == null || !(viewGroupM2414r0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupM2414r0).setDrawDisappearingViewsLast(!z3);
    }

    /* renamed from: p0 */
    AbstractC0456e m2495p0() {
        return this.f3048s;
    }

    /* renamed from: p1 */
    void m2496p1(Fragment fragment, AbstractC0496f.c cVar) {
        if (fragment.equals(m2478h0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = cVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: q0 */
    public Fragment m2497q0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragmentM2478h0 = m2478h0(string);
        if (fragmentM2478h0 == null) {
            m2419u1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return fragmentM2478h0;
    }

    /* renamed from: q1 */
    void m2498q1(Fragment fragment) {
        if (fragment == null || (fragment.equals(m2478h0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f3050u;
            this.f3050u = fragment;
            m2390M(fragment2);
            m2390M(this.f3050u);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: r */
    public final void m2499r(String str) {
        this.f3039j.remove(str);
    }

    /* renamed from: s0 */
    public C0458g m2500s0() {
        C0458g c0458g = this.f3051v;
        if (c0458g != null) {
            return c0458g;
        }
        Fragment fragment = this.f3049t;
        return fragment != null ? fragment.mFragmentManager.m2500s0() : this.f3052w;
    }

    /* renamed from: s1 */
    void m2501s1(Fragment fragment) {
        if (m2388H0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    /* renamed from: t0 */
    C0469r m2502t0() {
        return this.f3032c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f3049t;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f3049t)));
            sb.append("}");
        } else {
            AbstractC0459h<?> abstractC0459h = this.f3047r;
            if (abstractC0459h != null) {
                sb.append(abstractC0459h.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f3047r)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: u */
    void m2503u(C0451a c0451a, boolean z3, boolean z4, boolean z5) {
        if (z3) {
            c0451a.m2541A(z5);
        } else {
            c0451a.m2564z();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c0451a);
        arrayList2.add(Boolean.valueOf(z3));
        if (z4 && this.f3046q >= 1) {
            C0471t.m2710B(this.f3047r.m2619f(), this.f3048s, arrayList, arrayList2, 0, 1, true, this.f3043n);
        }
        if (z5) {
            m2455S0(this.f3046q, true);
        }
        for (Fragment fragment : this.f3032c.m2686l()) {
            if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && c0451a.m2544D(fragment.mContainerId)) {
                float f4 = fragment.mPostponedAlpha;
                if (f4 > IGoodView.DEFAULT_TO_ALPHA) {
                    fragment.mView.setAlpha(f4);
                }
                if (z5) {
                    fragment.mPostponedAlpha = IGoodView.DEFAULT_TO_ALPHA;
                } else {
                    fragment.mPostponedAlpha = -1.0f;
                    fragment.mIsNewlyAdded = false;
                }
            }
        }
    }

    /* renamed from: u0 */
    public List<Fragment> m2504u0() {
        return this.f3032c.m2688n();
    }

    /* renamed from: v0 */
    AbstractC0459h<?> m2505v0() {
        return this.f3047r;
    }

    /* renamed from: w */
    C0467p m2506w(Fragment fragment) {
        C0467p c0467pM2687m = this.f3032c.m2687m(fragment.mWho);
        if (c0467pM2687m != null) {
            return c0467pM2687m;
        }
        C0467p c0467p = new C0467p(this.f3044o, this.f3032c, fragment);
        c0467p.m2667o(this.f3047r.m2619f().getClassLoader());
        c0467p.m2672u(this.f3046q);
        return c0467p;
    }

    /* renamed from: w0 */
    LayoutInflater.Factory2 m2507w0() {
        return this.f3035f;
    }

    /* renamed from: x0 */
    C0461j m2508x0() {
        return this.f3044o;
    }

    /* renamed from: y */
    void m2509y(Fragment fragment) {
        if (m2388H0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (m2388H0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f3032c.m2693s(fragment);
            if (m2389I0(fragment)) {
                this.f3019D = true;
            }
            m2415r1(fragment);
        }
    }

    /* renamed from: y0 */
    Fragment m2510y0() {
        return this.f3049t;
    }

    /* renamed from: z */
    void m2511z() {
        this.f3020E = false;
        this.f3021F = false;
        this.f3028M.m2648o(false);
        m2392T(4);
    }

    /* renamed from: z0 */
    public Fragment m2512z0() {
        return this.f3050u;
    }

    @SuppressLint({"BanParcelableUsage"})
    static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new C0431a();

        /* renamed from: a */
        String f3060a;

        /* renamed from: b */
        int f3061b;

        /* renamed from: androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$a */
        class C0431a implements Parcelable.Creator<LaunchedFragmentInfo> {
            C0431a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo[] newArray(int i4) {
                return new LaunchedFragmentInfo[i4];
            }
        }

        LaunchedFragmentInfo(String str, int i4) {
            this.f3060a = str;
            this.f3061b = i4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeString(this.f3060a);
            parcel.writeInt(this.f3061b);
        }

        LaunchedFragmentInfo(Parcel parcel) {
            this.f3060a = parcel.readString();
            this.f3061b = parcel.readInt();
        }
    }
}
