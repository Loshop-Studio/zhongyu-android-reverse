package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.collection.C0247a;
import androidx.collection.C0250d;
import androidx.core.view.C0358u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import p148s.C3369g;

/* loaded from: classes.dex */
public abstract class Transition implements Cloneable {
    static final boolean DBG = false;
    private static final String LOG_TAG = "Transition";
    private static final int MATCH_FIRST = 1;
    public static final int MATCH_ID = 3;
    private static final String MATCH_ID_STR = "id";
    public static final int MATCH_INSTANCE = 1;
    private static final String MATCH_INSTANCE_STR = "instance";
    public static final int MATCH_ITEM_ID = 4;
    private static final String MATCH_ITEM_ID_STR = "itemId";
    private static final int MATCH_LAST = 4;
    public static final int MATCH_NAME = 2;
    private static final String MATCH_NAME_STR = "name";
    private ArrayList<C0752x> mEndValuesList;
    private AbstractC0707f mEpicenterCallback;
    private C0247a<String, String> mNameOverrides;
    AbstractC0750v mPropagation;
    private ArrayList<C0752x> mStartValuesList;
    private static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};
    private static final PathMotion STRAIGHT_PATH_MOTION = new C0702a();
    private static ThreadLocal<C0247a<Animator, C0705d>> sRunningAnimators = new ThreadLocal<>();
    private String mName = getClass().getName();
    private long mStartDelay = -1;
    long mDuration = -1;
    private TimeInterpolator mInterpolator = null;
    ArrayList<Integer> mTargetIds = new ArrayList<>();
    ArrayList<View> mTargets = new ArrayList<>();
    private ArrayList<String> mTargetNames = null;
    private ArrayList<Class<?>> mTargetTypes = null;
    private ArrayList<Integer> mTargetIdExcludes = null;
    private ArrayList<View> mTargetExcludes = null;
    private ArrayList<Class<?>> mTargetTypeExcludes = null;
    private ArrayList<String> mTargetNameExcludes = null;
    private ArrayList<Integer> mTargetIdChildExcludes = null;
    private ArrayList<View> mTargetChildExcludes = null;
    private ArrayList<Class<?>> mTargetTypeChildExcludes = null;
    private C0753y mStartValues = new C0753y();
    private C0753y mEndValues = new C0753y();
    TransitionSet mParent = null;
    private int[] mMatchOrder = DEFAULT_MATCH_ORDER;
    private ViewGroup mSceneRoot = null;
    boolean mCanRemoveViews = false;
    ArrayList<Animator> mCurrentAnimators = new ArrayList<>();
    private int mNumInstances = 0;
    private boolean mPaused = false;
    private boolean mEnded = false;
    private ArrayList<InterfaceC0708g> mListeners = null;
    private ArrayList<Animator> mAnimators = new ArrayList<>();
    private PathMotion mPathMotion = STRAIGHT_PATH_MOTION;

    /* renamed from: androidx.transition.Transition$a */
    static class C0702a extends PathMotion {
        C0702a() {
        }

        @Override // androidx.transition.PathMotion
        public Path getPath(float f4, float f5, float f6, float f7) {
            Path path = new Path();
            path.moveTo(f4, f5);
            path.lineTo(f6, f7);
            return path;
        }
    }

    /* renamed from: androidx.transition.Transition$b */
    class C0703b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0247a f4359a;

        C0703b(C0247a c0247a) {
            this.f4359a = c0247a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4359a.remove(animator);
            Transition.this.mCurrentAnimators.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Transition.this.mCurrentAnimators.add(animator);
        }
    }

    /* renamed from: androidx.transition.Transition$c */
    class C0704c extends AnimatorListenerAdapter {
        C0704c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Transition.this.end();
            animator.removeListener(this);
        }
    }

    /* renamed from: androidx.transition.Transition$d */
    private static class C0705d {

        /* renamed from: a */
        View f4362a;

        /* renamed from: b */
        String f4363b;

        /* renamed from: c */
        C0752x f4364c;

        /* renamed from: d */
        InterfaceC0743o0 f4365d;

        /* renamed from: e */
        Transition f4366e;

        C0705d(View view, String str, Transition transition, InterfaceC0743o0 interfaceC0743o0, C0752x c0752x) {
            this.f4362a = view;
            this.f4363b = str;
            this.f4364c = c0752x;
            this.f4365d = interfaceC0743o0;
            this.f4366e = transition;
        }
    }

    /* renamed from: androidx.transition.Transition$e */
    private static class C0706e {
        /* renamed from: a */
        static <T> ArrayList<T> m3816a(ArrayList<T> arrayList, T t3) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(t3)) {
                arrayList.add(t3);
            }
            return arrayList;
        }

        /* renamed from: b */
        static <T> ArrayList<T> m3817b(ArrayList<T> arrayList, T t3) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(t3);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    /* renamed from: androidx.transition.Transition$f */
    public static abstract class AbstractC0707f {
        /* renamed from: a */
        public abstract Rect mo3818a(Transition transition);
    }

    /* renamed from: androidx.transition.Transition$g */
    public interface InterfaceC0708g {
        void onTransitionCancel(Transition transition);

        void onTransitionEnd(Transition transition);

        void onTransitionPause(Transition transition);

        void onTransitionResume(Transition transition);

        void onTransitionStart(Transition transition);
    }

    public Transition() {
    }

    private void addUnmatched(C0247a<View, C0752x> c0247a, C0247a<View, C0752x> c0247a2) {
        for (int i4 = 0; i4 < c0247a.size(); i4++) {
            C0752x c0752xValueAt = c0247a.valueAt(i4);
            if (isValidTarget(c0752xValueAt.f4483b)) {
                this.mStartValuesList.add(c0752xValueAt);
                this.mEndValuesList.add(null);
            }
        }
        for (int i5 = 0; i5 < c0247a2.size(); i5++) {
            C0752x c0752xValueAt2 = c0247a2.valueAt(i5);
            if (isValidTarget(c0752xValueAt2.f4483b)) {
                this.mEndValuesList.add(c0752xValueAt2);
                this.mStartValuesList.add(null);
            }
        }
    }

    private static void addViewValues(C0753y c0753y, View view, C0752x c0752x) {
        c0753y.f4485a.put(view, c0752x);
        int id = view.getId();
        if (id >= 0) {
            if (c0753y.f4486b.indexOfKey(id) >= 0) {
                c0753y.f4486b.put(id, null);
            } else {
                c0753y.f4486b.put(id, view);
            }
        }
        String strM1998K = C0358u.m1998K(view);
        if (strM1998K != null) {
            if (c0753y.f4488d.containsKey(strM1998K)) {
                c0753y.f4488d.put(strM1998K, null);
            } else {
                c0753y.f4488d.put(strM1998K, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c0753y.f4487c.m1115g(itemIdAtPosition) < 0) {
                    C0358u.m2069z0(view, true);
                    c0753y.f4487c.m1117i(itemIdAtPosition, view);
                    return;
                }
                View viewM1113e = c0753y.f4487c.m1113e(itemIdAtPosition);
                if (viewM1113e != null) {
                    C0358u.m2069z0(viewM1113e, false);
                    c0753y.f4487c.m1117i(itemIdAtPosition, null);
                }
            }
        }
    }

    private static boolean alreadyContains(int[] iArr, int i4) {
        int i5 = iArr[i4];
        for (int i6 = 0; i6 < i4; i6++) {
            if (iArr[i6] == i5) {
                return true;
            }
        }
        return false;
    }

    private void captureHierarchy(View view, boolean z3) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.mTargetIdExcludes;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList2 = this.mTargetExcludes;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.mTargetTypeExcludes;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        if (this.mTargetTypeExcludes.get(i4).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    C0752x c0752x = new C0752x(view);
                    if (z3) {
                        captureStartValues(c0752x);
                    } else {
                        captureEndValues(c0752x);
                    }
                    c0752x.f4484c.add(this);
                    capturePropagationValues(c0752x);
                    if (z3) {
                        addViewValues(this.mStartValues, view, c0752x);
                    } else {
                        addViewValues(this.mEndValues, view, c0752x);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.mTargetIdChildExcludes;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList<View> arrayList5 = this.mTargetChildExcludes;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.mTargetTypeChildExcludes;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i5 = 0; i5 < size2; i5++) {
                                    if (this.mTargetTypeChildExcludes.get(i5).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                                captureHierarchy(viewGroup.getChildAt(i6), z3);
                            }
                        }
                    }
                }
            }
        }
    }

    private ArrayList<Integer> excludeId(ArrayList<Integer> arrayList, int i4, boolean z3) {
        return i4 > 0 ? z3 ? C0706e.m3816a(arrayList, Integer.valueOf(i4)) : C0706e.m3817b(arrayList, Integer.valueOf(i4)) : arrayList;
    }

    private static <T> ArrayList<T> excludeObject(ArrayList<T> arrayList, T t3, boolean z3) {
        return t3 != null ? z3 ? C0706e.m3816a(arrayList, t3) : C0706e.m3817b(arrayList, t3) : arrayList;
    }

    private ArrayList<Class<?>> excludeType(ArrayList<Class<?>> arrayList, Class<?> cls, boolean z3) {
        return cls != null ? z3 ? C0706e.m3816a(arrayList, cls) : C0706e.m3817b(arrayList, cls) : arrayList;
    }

    private ArrayList<View> excludeView(ArrayList<View> arrayList, View view, boolean z3) {
        return view != null ? z3 ? C0706e.m3816a(arrayList, view) : C0706e.m3817b(arrayList, view) : arrayList;
    }

    private static C0247a<Animator, C0705d> getRunningAnimators() {
        C0247a<Animator, C0705d> c0247a = sRunningAnimators.get();
        if (c0247a != null) {
            return c0247a;
        }
        C0247a<Animator, C0705d> c0247a2 = new C0247a<>();
        sRunningAnimators.set(c0247a2);
        return c0247a2;
    }

    private static boolean isValidMatch(int i4) {
        return i4 >= 1 && i4 <= 4;
    }

    private static boolean isValueChanged(C0752x c0752x, C0752x c0752x2, String str) {
        Object obj = c0752x.f4482a.get(str);
        Object obj2 = c0752x2.f4482a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    private void matchIds(C0247a<View, C0752x> c0247a, C0247a<View, C0752x> c0247a2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            View viewValueAt = sparseArray.valueAt(i4);
            if (viewValueAt != null && isValidTarget(viewValueAt) && (view = sparseArray2.get(sparseArray.keyAt(i4))) != null && isValidTarget(view)) {
                C0752x c0752x = c0247a.get(viewValueAt);
                C0752x c0752x2 = c0247a2.get(view);
                if (c0752x != null && c0752x2 != null) {
                    this.mStartValuesList.add(c0752x);
                    this.mEndValuesList.add(c0752x2);
                    c0247a.remove(viewValueAt);
                    c0247a2.remove(view);
                }
            }
        }
    }

    private void matchInstances(C0247a<View, C0752x> c0247a, C0247a<View, C0752x> c0247a2) {
        C0752x c0752xRemove;
        for (int size = c0247a.size() - 1; size >= 0; size--) {
            View viewKeyAt = c0247a.keyAt(size);
            if (viewKeyAt != null && isValidTarget(viewKeyAt) && (c0752xRemove = c0247a2.remove(viewKeyAt)) != null && isValidTarget(c0752xRemove.f4483b)) {
                this.mStartValuesList.add(c0247a.removeAt(size));
                this.mEndValuesList.add(c0752xRemove);
            }
        }
    }

    private void matchItemIds(C0247a<View, C0752x> c0247a, C0247a<View, C0752x> c0247a2, C0250d<View> c0250d, C0250d<View> c0250d2) {
        View viewM1113e;
        int iM1120l = c0250d.m1120l();
        for (int i4 = 0; i4 < iM1120l; i4++) {
            View viewM1121m = c0250d.m1121m(i4);
            if (viewM1121m != null && isValidTarget(viewM1121m) && (viewM1113e = c0250d2.m1113e(c0250d.m1116h(i4))) != null && isValidTarget(viewM1113e)) {
                C0752x c0752x = c0247a.get(viewM1121m);
                C0752x c0752x2 = c0247a2.get(viewM1113e);
                if (c0752x != null && c0752x2 != null) {
                    this.mStartValuesList.add(c0752x);
                    this.mEndValuesList.add(c0752x2);
                    c0247a.remove(viewM1121m);
                    c0247a2.remove(viewM1113e);
                }
            }
        }
    }

    private void matchNames(C0247a<View, C0752x> c0247a, C0247a<View, C0752x> c0247a2, C0247a<String, View> c0247a3, C0247a<String, View> c0247a4) {
        View view;
        int size = c0247a3.size();
        for (int i4 = 0; i4 < size; i4++) {
            View viewValueAt = c0247a3.valueAt(i4);
            if (viewValueAt != null && isValidTarget(viewValueAt) && (view = c0247a4.get(c0247a3.keyAt(i4))) != null && isValidTarget(view)) {
                C0752x c0752x = c0247a.get(viewValueAt);
                C0752x c0752x2 = c0247a2.get(view);
                if (c0752x != null && c0752x2 != null) {
                    this.mStartValuesList.add(c0752x);
                    this.mEndValuesList.add(c0752x2);
                    c0247a.remove(viewValueAt);
                    c0247a2.remove(view);
                }
            }
        }
    }

    private void matchStartAndEnd(C0753y c0753y, C0753y c0753y2) {
        C0247a<View, C0752x> c0247a = new C0247a<>(c0753y.f4485a);
        C0247a<View, C0752x> c0247a2 = new C0247a<>(c0753y2.f4485a);
        int i4 = 0;
        while (true) {
            int[] iArr = this.mMatchOrder;
            if (i4 >= iArr.length) {
                addUnmatched(c0247a, c0247a2);
                return;
            }
            int i5 = iArr[i4];
            if (i5 == 1) {
                matchInstances(c0247a, c0247a2);
            } else if (i5 == 2) {
                matchNames(c0247a, c0247a2, c0753y.f4488d, c0753y2.f4488d);
            } else if (i5 == 3) {
                matchIds(c0247a, c0247a2, c0753y.f4486b, c0753y2.f4486b);
            } else if (i5 == 4) {
                matchItemIds(c0247a, c0247a2, c0753y.f4487c, c0753y2.f4487c);
            }
            i4++;
        }
    }

    private static int[] parseMatchOrder(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i4 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strTrim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(strTrim)) {
                iArr[i4] = 3;
            } else if (MATCH_INSTANCE_STR.equalsIgnoreCase(strTrim)) {
                iArr[i4] = 1;
            } else if (MATCH_NAME_STR.equalsIgnoreCase(strTrim)) {
                iArr[i4] = 2;
            } else if (MATCH_ITEM_ID_STR.equalsIgnoreCase(strTrim)) {
                iArr[i4] = 4;
            } else {
                if (!strTrim.isEmpty()) {
                    throw new InflateException("Unknown match type in matchOrder: '" + strTrim + "'");
                }
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i4);
                i4--;
                iArr = iArr2;
            }
            i4++;
        }
        return iArr;
    }

    private void runAnimator(Animator animator, C0247a<Animator, C0705d> c0247a) {
        if (animator != null) {
            animator.addListener(new C0703b(c0247a));
            animate(animator);
        }
    }

    public Transition addListener(InterfaceC0708g interfaceC0708g) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
        }
        this.mListeners.add(interfaceC0708g);
        return this;
    }

    public Transition addTarget(View view) {
        this.mTargets.add(view);
        return this;
    }

    protected void animate(Animator animator) {
        if (animator == null) {
            end();
            return;
        }
        if (getDuration() >= 0) {
            animator.setDuration(getDuration());
        }
        if (getStartDelay() >= 0) {
            animator.setStartDelay(getStartDelay() + animator.getStartDelay());
        }
        if (getInterpolator() != null) {
            animator.setInterpolator(getInterpolator());
        }
        animator.addListener(new C0704c());
        animator.start();
    }

    protected void cancel() {
        for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
            this.mCurrentAnimators.get(size).cancel();
        }
        ArrayList<InterfaceC0708g> arrayList = this.mListeners;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
        int size2 = arrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((InterfaceC0708g) arrayList2.get(i4)).onTransitionCancel(this);
        }
    }

    public abstract void captureEndValues(C0752x c0752x);

    void capturePropagationValues(C0752x c0752x) {
        String[] strArrMo3906b;
        if (this.mPropagation == null || c0752x.f4482a.isEmpty() || (strArrMo3906b = this.mPropagation.mo3906b()) == null) {
            return;
        }
        boolean z3 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= strArrMo3906b.length) {
                z3 = true;
                break;
            } else if (!c0752x.f4482a.containsKey(strArrMo3906b[i4])) {
                break;
            } else {
                i4++;
            }
        }
        if (z3) {
            return;
        }
        this.mPropagation.mo3905a(c0752x);
    }

    public abstract void captureStartValues(C0752x c0752x);

    void captureValues(ViewGroup viewGroup, boolean z3) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        C0247a<String, String> c0247a;
        clearValues(z3);
        if ((this.mTargetIds.size() > 0 || this.mTargets.size() > 0) && (((arrayList = this.mTargetNames) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetTypes) == null || arrayList2.isEmpty()))) {
            for (int i4 = 0; i4 < this.mTargetIds.size(); i4++) {
                View viewFindViewById = viewGroup.findViewById(this.mTargetIds.get(i4).intValue());
                if (viewFindViewById != null) {
                    C0752x c0752x = new C0752x(viewFindViewById);
                    if (z3) {
                        captureStartValues(c0752x);
                    } else {
                        captureEndValues(c0752x);
                    }
                    c0752x.f4484c.add(this);
                    capturePropagationValues(c0752x);
                    if (z3) {
                        addViewValues(this.mStartValues, viewFindViewById, c0752x);
                    } else {
                        addViewValues(this.mEndValues, viewFindViewById, c0752x);
                    }
                }
            }
            for (int i5 = 0; i5 < this.mTargets.size(); i5++) {
                View view = this.mTargets.get(i5);
                C0752x c0752x2 = new C0752x(view);
                if (z3) {
                    captureStartValues(c0752x2);
                } else {
                    captureEndValues(c0752x2);
                }
                c0752x2.f4484c.add(this);
                capturePropagationValues(c0752x2);
                if (z3) {
                    addViewValues(this.mStartValues, view, c0752x2);
                } else {
                    addViewValues(this.mEndValues, view, c0752x2);
                }
            }
        } else {
            captureHierarchy(viewGroup, z3);
        }
        if (z3 || (c0247a = this.mNameOverrides) == null) {
            return;
        }
        int size = c0247a.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i6 = 0; i6 < size; i6++) {
            arrayList3.add(this.mStartValues.f4488d.remove(this.mNameOverrides.keyAt(i6)));
        }
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = (View) arrayList3.get(i7);
            if (view2 != null) {
                this.mStartValues.f4488d.put(this.mNameOverrides.valueAt(i7), view2);
            }
        }
    }

    void clearValues(boolean z3) {
        if (z3) {
            this.mStartValues.f4485a.clear();
            this.mStartValues.f4486b.clear();
            this.mStartValues.f4487c.m1111b();
        } else {
            this.mEndValues.f4485a.clear();
            this.mEndValues.f4486b.clear();
            this.mEndValues.f4487c.m1111b();
        }
    }

    public Animator createAnimator(ViewGroup viewGroup, C0752x c0752x, C0752x c0752x2) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void createAnimators(android.view.ViewGroup r21, androidx.transition.C0753y r22, androidx.transition.C0753y r23, java.util.ArrayList<androidx.transition.C0752x> r24, java.util.ArrayList<androidx.transition.C0752x> r25) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Transition.createAnimators(android.view.ViewGroup, androidx.transition.y, androidx.transition.y, java.util.ArrayList, java.util.ArrayList):void");
    }

    protected void end() {
        int i4 = this.mNumInstances - 1;
        this.mNumInstances = i4;
        if (i4 == 0) {
            ArrayList<InterfaceC0708g> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((InterfaceC0708g) arrayList2.get(i5)).onTransitionEnd(this);
                }
            }
            for (int i6 = 0; i6 < this.mStartValues.f4487c.m1120l(); i6++) {
                View viewM1121m = this.mStartValues.f4487c.m1121m(i6);
                if (viewM1121m != null) {
                    C0358u.m2069z0(viewM1121m, false);
                }
            }
            for (int i7 = 0; i7 < this.mEndValues.f4487c.m1120l(); i7++) {
                View viewM1121m2 = this.mEndValues.f4487c.m1121m(i7);
                if (viewM1121m2 != null) {
                    C0358u.m2069z0(viewM1121m2, false);
                }
            }
            this.mEnded = true;
        }
    }

    public Transition excludeChildren(View view, boolean z3) {
        this.mTargetChildExcludes = excludeView(this.mTargetChildExcludes, view, z3);
        return this;
    }

    public Transition excludeTarget(View view, boolean z3) {
        this.mTargetExcludes = excludeView(this.mTargetExcludes, view, z3);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void forceToEnd(ViewGroup viewGroup) {
        C0247a<Animator, C0705d> runningAnimators = getRunningAnimators();
        int size = runningAnimators.size();
        if (viewGroup == null || size == 0) {
            return;
        }
        InterfaceC0743o0 interfaceC0743o0M3858d = C0725f0.m3858d(viewGroup);
        C0247a c0247a = new C0247a(runningAnimators);
        runningAnimators.clear();
        for (int i4 = size - 1; i4 >= 0; i4--) {
            C0705d c0705d = (C0705d) c0247a.valueAt(i4);
            if (c0705d.f4362a != null && interfaceC0743o0M3858d != null && interfaceC0743o0M3858d.equals(c0705d.f4365d)) {
                ((Animator) c0247a.keyAt(i4)).end();
            }
        }
    }

    public long getDuration() {
        return this.mDuration;
    }

    public Rect getEpicenter() {
        AbstractC0707f abstractC0707f = this.mEpicenterCallback;
        if (abstractC0707f == null) {
            return null;
        }
        return abstractC0707f.mo3818a(this);
    }

    public AbstractC0707f getEpicenterCallback() {
        return this.mEpicenterCallback;
    }

    public TimeInterpolator getInterpolator() {
        return this.mInterpolator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002e, code lost:
    
        if (r3 < 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0030, code lost:
    
        if (r8 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
    
        r7 = r6.mEndValuesList;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        r7 = r6.mStartValuesList;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
    
        return r7.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.transition.C0752x getMatchedTransitionValues(android.view.View r7, boolean r8) {
        /*
            r6 = this;
            androidx.transition.TransitionSet r0 = r6.mParent
            if (r0 == 0) goto L9
            androidx.transition.x r7 = r0.getMatchedTransitionValues(r7, r8)
            return r7
        L9:
            if (r8 == 0) goto Le
            java.util.ArrayList<androidx.transition.x> r0 = r6.mStartValuesList
            goto L10
        Le:
            java.util.ArrayList<androidx.transition.x> r0 = r6.mEndValuesList
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = -1
            r4 = 0
        L1a:
            if (r4 >= r2) goto L2e
            java.lang.Object r5 = r0.get(r4)
            androidx.transition.x r5 = (androidx.transition.C0752x) r5
            if (r5 != 0) goto L25
            return r1
        L25:
            android.view.View r5 = r5.f4483b
            if (r5 != r7) goto L2b
            r3 = r4
            goto L2e
        L2b:
            int r4 = r4 + 1
            goto L1a
        L2e:
            if (r3 < 0) goto L3e
            if (r8 == 0) goto L35
            java.util.ArrayList<androidx.transition.x> r7 = r6.mEndValuesList
            goto L37
        L35:
            java.util.ArrayList<androidx.transition.x> r7 = r6.mStartValuesList
        L37:
            java.lang.Object r7 = r7.get(r3)
            r1 = r7
            androidx.transition.x r1 = (androidx.transition.C0752x) r1
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Transition.getMatchedTransitionValues(android.view.View, boolean):androidx.transition.x");
    }

    public String getName() {
        return this.mName;
    }

    public PathMotion getPathMotion() {
        return this.mPathMotion;
    }

    public AbstractC0750v getPropagation() {
        return this.mPropagation;
    }

    public long getStartDelay() {
        return this.mStartDelay;
    }

    public List<Integer> getTargetIds() {
        return this.mTargetIds;
    }

    public List<String> getTargetNames() {
        return this.mTargetNames;
    }

    public List<Class<?>> getTargetTypes() {
        return this.mTargetTypes;
    }

    public List<View> getTargets() {
        return this.mTargets;
    }

    public String[] getTransitionProperties() {
        return null;
    }

    public C0752x getTransitionValues(View view, boolean z3) {
        TransitionSet transitionSet = this.mParent;
        if (transitionSet != null) {
            return transitionSet.getTransitionValues(view, z3);
        }
        return (z3 ? this.mStartValues : this.mEndValues).f4485a.get(view);
    }

    public boolean isTransitionRequired(C0752x c0752x, C0752x c0752x2) {
        if (c0752x == null || c0752x2 == null) {
            return false;
        }
        String[] transitionProperties = getTransitionProperties();
        if (transitionProperties == null) {
            Iterator<String> it = c0752x.f4482a.keySet().iterator();
            while (it.hasNext()) {
                if (isValueChanged(c0752x, c0752x2, it.next())) {
                }
            }
            return false;
        }
        for (String str : transitionProperties) {
            if (!isValueChanged(c0752x, c0752x2, str)) {
            }
        }
        return false;
        return true;
    }

    boolean isValidTarget(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.mTargetIdExcludes;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.mTargetExcludes;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.mTargetTypeExcludes;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (this.mTargetTypeExcludes.get(i4).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.mTargetNameExcludes != null && C0358u.m1998K(view) != null && this.mTargetNameExcludes.contains(C0358u.m1998K(view))) {
            return false;
        }
        if ((this.mTargetIds.size() == 0 && this.mTargets.size() == 0 && (((arrayList = this.mTargetTypes) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetNames) == null || arrayList2.isEmpty()))) || this.mTargetIds.contains(Integer.valueOf(id)) || this.mTargets.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.mTargetNames;
        if (arrayList6 != null && arrayList6.contains(C0358u.m1998K(view))) {
            return true;
        }
        if (this.mTargetTypes != null) {
            for (int i5 = 0; i5 < this.mTargetTypes.size(); i5++) {
                if (this.mTargetTypes.get(i5).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void pause(View view) {
        if (this.mEnded) {
            return;
        }
        C0247a<Animator, C0705d> runningAnimators = getRunningAnimators();
        int size = runningAnimators.size();
        InterfaceC0743o0 interfaceC0743o0M3858d = C0725f0.m3858d(view);
        for (int i4 = size - 1; i4 >= 0; i4--) {
            C0705d c0705dValueAt = runningAnimators.valueAt(i4);
            if (c0705dValueAt.f4362a != null && interfaceC0743o0M3858d.equals(c0705dValueAt.f4365d)) {
                C0714a.m3843b(runningAnimators.keyAt(i4));
            }
        }
        ArrayList<InterfaceC0708g> arrayList = this.mListeners;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
            int size2 = arrayList2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                ((InterfaceC0708g) arrayList2.get(i5)).onTransitionPause(this);
            }
        }
        this.mPaused = true;
    }

    void playTransition(ViewGroup viewGroup) {
        C0705d c0705d;
        this.mStartValuesList = new ArrayList<>();
        this.mEndValuesList = new ArrayList<>();
        matchStartAndEnd(this.mStartValues, this.mEndValues);
        C0247a<Animator, C0705d> runningAnimators = getRunningAnimators();
        int size = runningAnimators.size();
        InterfaceC0743o0 interfaceC0743o0M3858d = C0725f0.m3858d(viewGroup);
        for (int i4 = size - 1; i4 >= 0; i4--) {
            Animator animatorKeyAt = runningAnimators.keyAt(i4);
            if (animatorKeyAt != null && (c0705d = runningAnimators.get(animatorKeyAt)) != null && c0705d.f4362a != null && interfaceC0743o0M3858d.equals(c0705d.f4365d)) {
                C0752x c0752x = c0705d.f4364c;
                View view = c0705d.f4362a;
                C0752x transitionValues = getTransitionValues(view, true);
                C0752x matchedTransitionValues = getMatchedTransitionValues(view, true);
                if (transitionValues == null && matchedTransitionValues == null) {
                    matchedTransitionValues = this.mEndValues.f4485a.get(view);
                }
                if (!(transitionValues == null && matchedTransitionValues == null) && c0705d.f4366e.isTransitionRequired(c0752x, matchedTransitionValues)) {
                    if (animatorKeyAt.isRunning() || animatorKeyAt.isStarted()) {
                        animatorKeyAt.cancel();
                    } else {
                        runningAnimators.remove(animatorKeyAt);
                    }
                }
            }
        }
        createAnimators(viewGroup, this.mStartValues, this.mEndValues, this.mStartValuesList, this.mEndValuesList);
        runAnimators();
    }

    public Transition removeListener(InterfaceC0708g interfaceC0708g) {
        ArrayList<InterfaceC0708g> arrayList = this.mListeners;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(interfaceC0708g);
        if (this.mListeners.size() == 0) {
            this.mListeners = null;
        }
        return this;
    }

    public Transition removeTarget(View view) {
        this.mTargets.remove(view);
        return this;
    }

    public void resume(View view) {
        if (this.mPaused) {
            if (!this.mEnded) {
                C0247a<Animator, C0705d> runningAnimators = getRunningAnimators();
                int size = runningAnimators.size();
                InterfaceC0743o0 interfaceC0743o0M3858d = C0725f0.m3858d(view);
                for (int i4 = size - 1; i4 >= 0; i4--) {
                    C0705d c0705dValueAt = runningAnimators.valueAt(i4);
                    if (c0705dValueAt.f4362a != null && interfaceC0743o0M3858d.equals(c0705dValueAt.f4365d)) {
                        C0714a.m3844c(runningAnimators.keyAt(i4));
                    }
                }
                ArrayList<InterfaceC0708g> arrayList = this.mListeners;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                    int size2 = arrayList2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        ((InterfaceC0708g) arrayList2.get(i5)).onTransitionResume(this);
                    }
                }
            }
            this.mPaused = false;
        }
    }

    protected void runAnimators() {
        start();
        C0247a<Animator, C0705d> runningAnimators = getRunningAnimators();
        Iterator<Animator> it = this.mAnimators.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (runningAnimators.containsKey(next)) {
                start();
                runAnimator(next, runningAnimators);
            }
        }
        this.mAnimators.clear();
        end();
    }

    void setCanRemoveViews(boolean z3) {
        this.mCanRemoveViews = z3;
    }

    public Transition setDuration(long j4) {
        this.mDuration = j4;
        return this;
    }

    public void setEpicenterCallback(AbstractC0707f abstractC0707f) {
        this.mEpicenterCallback = abstractC0707f;
    }

    public Transition setInterpolator(TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
        return this;
    }

    public void setMatchOrder(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.mMatchOrder = DEFAULT_MATCH_ORDER;
            return;
        }
        for (int i4 = 0; i4 < iArr.length; i4++) {
            if (!isValidMatch(iArr[i4])) {
                throw new IllegalArgumentException("matches contains invalid value");
            }
            if (alreadyContains(iArr, i4)) {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.mMatchOrder = (int[]) iArr.clone();
    }

    public void setPathMotion(PathMotion pathMotion) {
        if (pathMotion == null) {
            this.mPathMotion = STRAIGHT_PATH_MOTION;
        } else {
            this.mPathMotion = pathMotion;
        }
    }

    public void setPropagation(AbstractC0750v abstractC0750v) {
        this.mPropagation = abstractC0750v;
    }

    Transition setSceneRoot(ViewGroup viewGroup) {
        this.mSceneRoot = viewGroup;
        return this;
    }

    public Transition setStartDelay(long j4) {
        this.mStartDelay = j4;
        return this;
    }

    protected void start() {
        if (this.mNumInstances == 0) {
            ArrayList<InterfaceC0708g> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((InterfaceC0708g) arrayList2.get(i4)).onTransitionStart(this);
                }
            }
            this.mEnded = false;
        }
        this.mNumInstances++;
    }

    public String toString() {
        return toString("");
    }

    public Transition addTarget(int i4) {
        if (i4 != 0) {
            this.mTargetIds.add(Integer.valueOf(i4));
        }
        return this;
    }

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Transition mo10731clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.mAnimators = new ArrayList<>();
            transition.mStartValues = new C0753y();
            transition.mEndValues = new C0753y();
            transition.mStartValuesList = null;
            transition.mEndValuesList = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Transition excludeChildren(int i4, boolean z3) {
        this.mTargetIdChildExcludes = excludeId(this.mTargetIdChildExcludes, i4, z3);
        return this;
    }

    public Transition excludeTarget(int i4, boolean z3) {
        this.mTargetIdExcludes = excludeId(this.mTargetIdExcludes, i4, z3);
        return this;
    }

    public Transition removeTarget(int i4) {
        if (i4 != 0) {
            this.mTargetIds.remove(Integer.valueOf(i4));
        }
        return this;
    }

    String toString(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.mDuration != -1) {
            str2 = str2 + "dur(" + this.mDuration + ") ";
        }
        if (this.mStartDelay != -1) {
            str2 = str2 + "dly(" + this.mStartDelay + ") ";
        }
        if (this.mInterpolator != null) {
            str2 = str2 + "interp(" + this.mInterpolator + ") ";
        }
        if (this.mTargetIds.size() <= 0 && this.mTargets.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.mTargetIds.size() > 0) {
            for (int i4 = 0; i4 < this.mTargetIds.size(); i4++) {
                if (i4 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.mTargetIds.get(i4);
            }
        }
        if (this.mTargets.size() > 0) {
            for (int i5 = 0; i5 < this.mTargets.size(); i5++) {
                if (i5 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.mTargets.get(i5);
            }
        }
        return str3 + ")";
    }

    public Transition addTarget(String str) {
        if (this.mTargetNames == null) {
            this.mTargetNames = new ArrayList<>();
        }
        this.mTargetNames.add(str);
        return this;
    }

    public Transition excludeChildren(Class<?> cls, boolean z3) {
        this.mTargetTypeChildExcludes = excludeType(this.mTargetTypeChildExcludes, cls, z3);
        return this;
    }

    public Transition excludeTarget(String str, boolean z3) {
        this.mTargetNameExcludes = excludeObject(this.mTargetNameExcludes, str, z3);
        return this;
    }

    public Transition removeTarget(String str) {
        ArrayList<String> arrayList = this.mTargetNames;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    public Transition excludeTarget(Class<?> cls, boolean z3) {
        this.mTargetTypeExcludes = excludeType(this.mTargetTypeExcludes, cls, z3);
        return this;
    }

    public Transition removeTarget(Class<?> cls) {
        ArrayList<Class<?>> arrayList = this.mTargetTypes;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    public Transition addTarget(Class<?> cls) {
        if (this.mTargetTypes == null) {
            this.mTargetTypes = new ArrayList<>();
        }
        this.mTargetTypes.add(cls);
        return this;
    }

    @SuppressLint({"RestrictedApi"})
    public Transition(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0747s.f4460c);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long jM10251g = C3369g.m10251g(typedArrayObtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (jM10251g >= 0) {
            setDuration(jM10251g);
        }
        long jM10251g2 = C3369g.m10251g(typedArrayObtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (jM10251g2 > 0) {
            setStartDelay(jM10251g2);
        }
        int iM10252h = C3369g.m10252h(typedArrayObtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (iM10252h > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, iM10252h));
        }
        String strM10253i = C3369g.m10253i(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (strM10253i != null) {
            setMatchOrder(parseMatchOrder(strM10253i));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
