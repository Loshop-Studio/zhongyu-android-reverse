package androidx.transition;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.Iterator;
import p148s.C3369g;

/* loaded from: classes.dex */
public class TransitionSet extends Transition {

    /* renamed from: a */
    private ArrayList<Transition> f4367a;

    /* renamed from: b */
    private boolean f4368b;

    /* renamed from: c */
    int f4369c;

    /* renamed from: d */
    boolean f4370d;

    /* renamed from: e */
    private int f4371e;

    /* renamed from: androidx.transition.TransitionSet$a */
    class C0709a extends C0748t {

        /* renamed from: a */
        final /* synthetic */ Transition f4372a;

        C0709a(Transition transition) {
            this.f4372a = transition;
        }

        @Override // androidx.transition.Transition.InterfaceC0708g
        public void onTransitionEnd(Transition transition) {
            this.f4372a.runAnimators();
            transition.removeListener(this);
        }
    }

    /* renamed from: androidx.transition.TransitionSet$b */
    static class C0710b extends C0748t {

        /* renamed from: a */
        TransitionSet f4374a;

        C0710b(TransitionSet transitionSet) {
            this.f4374a = transitionSet;
        }

        @Override // androidx.transition.Transition.InterfaceC0708g
        public void onTransitionEnd(Transition transition) {
            TransitionSet transitionSet = this.f4374a;
            int i4 = transitionSet.f4369c - 1;
            transitionSet.f4369c = i4;
            if (i4 == 0) {
                transitionSet.f4370d = false;
                transitionSet.end();
            }
            transition.removeListener(this);
        }

        @Override // androidx.transition.C0748t, androidx.transition.Transition.InterfaceC0708g
        public void onTransitionStart(Transition transition) {
            TransitionSet transitionSet = this.f4374a;
            if (transitionSet.f4370d) {
                return;
            }
            transitionSet.start();
            this.f4374a.f4370d = true;
        }
    }

    public TransitionSet() {
        this.f4367a = new ArrayList<>();
        this.f4368b = true;
        this.f4370d = false;
        this.f4371e = 0;
    }

    /* renamed from: g */
    private void m3819g(Transition transition) {
        this.f4367a.add(transition);
        transition.mParent = this;
    }

    /* renamed from: u */
    private void m3820u() {
        C0710b c0710b = new C0710b(this);
        Iterator<Transition> it = this.f4367a.iterator();
        while (it.hasNext()) {
            it.next().addListener(c0710b);
        }
        this.f4369c = this.f4367a.size();
    }

    @Override // androidx.transition.Transition
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public TransitionSet addListener(Transition.InterfaceC0708g interfaceC0708g) {
        return (TransitionSet) super.addListener(interfaceC0708g);
    }

    @Override // androidx.transition.Transition
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public TransitionSet addTarget(int i4) {
        for (int i5 = 0; i5 < this.f4367a.size(); i5++) {
            this.f4367a.get(i5).addTarget(i4);
        }
        return (TransitionSet) super.addTarget(i4);
    }

    @Override // androidx.transition.Transition
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public TransitionSet addTarget(View view) {
        for (int i4 = 0; i4 < this.f4367a.size(); i4++) {
            this.f4367a.get(i4).addTarget(view);
        }
        return (TransitionSet) super.addTarget(view);
    }

    @Override // androidx.transition.Transition
    protected void cancel() {
        super.cancel();
        int size = this.f4367a.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f4367a.get(i4).cancel();
        }
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(C0752x c0752x) {
        if (isValidTarget(c0752x.f4483b)) {
            Iterator<Transition> it = this.f4367a.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.isValidTarget(c0752x.f4483b)) {
                    next.captureEndValues(c0752x);
                    c0752x.f4484c.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    void capturePropagationValues(C0752x c0752x) {
        super.capturePropagationValues(c0752x);
        int size = this.f4367a.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f4367a.get(i4).capturePropagationValues(c0752x);
        }
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(C0752x c0752x) {
        if (isValidTarget(c0752x.f4483b)) {
            Iterator<Transition> it = this.f4367a.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.isValidTarget(c0752x.f4483b)) {
                    next.captureStartValues(c0752x);
                    c0752x.f4484c.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    protected void createAnimators(ViewGroup viewGroup, C0753y c0753y, C0753y c0753y2, ArrayList<C0752x> arrayList, ArrayList<C0752x> arrayList2) {
        long startDelay = getStartDelay();
        int size = this.f4367a.size();
        for (int i4 = 0; i4 < size; i4++) {
            Transition transition = this.f4367a.get(i4);
            if (startDelay > 0 && (this.f4368b || i4 == 0)) {
                long startDelay2 = transition.getStartDelay();
                if (startDelay2 > 0) {
                    transition.setStartDelay(startDelay2 + startDelay);
                } else {
                    transition.setStartDelay(startDelay);
                }
            }
            transition.createAnimators(viewGroup, c0753y, c0753y2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public TransitionSet addTarget(Class<?> cls) {
        for (int i4 = 0; i4 < this.f4367a.size(); i4++) {
            this.f4367a.get(i4).addTarget(cls);
        }
        return (TransitionSet) super.addTarget(cls);
    }

    @Override // androidx.transition.Transition
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public TransitionSet addTarget(String str) {
        for (int i4 = 0; i4 < this.f4367a.size(); i4++) {
            this.f4367a.get(i4).addTarget(str);
        }
        return (TransitionSet) super.addTarget(str);
    }

    @Override // androidx.transition.Transition
    public Transition excludeTarget(View view, boolean z3) {
        for (int i4 = 0; i4 < this.f4367a.size(); i4++) {
            this.f4367a.get(i4).excludeTarget(view, z3);
        }
        return super.excludeTarget(view, z3);
    }

    /* renamed from: f */
    public TransitionSet m3826f(Transition transition) {
        m3819g(transition);
        long j4 = this.mDuration;
        if (j4 >= 0) {
            transition.setDuration(j4);
        }
        if ((this.f4371e & 1) != 0) {
            transition.setInterpolator(getInterpolator());
        }
        if ((this.f4371e & 2) != 0) {
            transition.setPropagation(getPropagation());
        }
        if ((this.f4371e & 4) != 0) {
            transition.setPathMotion(getPathMotion());
        }
        if ((this.f4371e & 8) != 0) {
            transition.setEpicenterCallback(getEpicenterCallback());
        }
        return this;
    }

    @Override // androidx.transition.Transition
    void forceToEnd(ViewGroup viewGroup) {
        super.forceToEnd(viewGroup);
        int size = this.f4367a.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f4367a.get(i4).forceToEnd(viewGroup);
        }
    }

    /* renamed from: h */
    public Transition m3827h(int i4) {
        if (i4 < 0 || i4 >= this.f4367a.size()) {
            return null;
        }
        return this.f4367a.get(i4);
    }

    /* renamed from: i */
    public int m3828i() {
        return this.f4367a.size();
    }

    @Override // androidx.transition.Transition
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public TransitionSet removeListener(Transition.InterfaceC0708g interfaceC0708g) {
        return (TransitionSet) super.removeListener(interfaceC0708g);
    }

    @Override // androidx.transition.Transition
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public TransitionSet removeTarget(int i4) {
        for (int i5 = 0; i5 < this.f4367a.size(); i5++) {
            this.f4367a.get(i5).removeTarget(i4);
        }
        return (TransitionSet) super.removeTarget(i4);
    }

    @Override // androidx.transition.Transition
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public TransitionSet removeTarget(View view) {
        for (int i4 = 0; i4 < this.f4367a.size(); i4++) {
            this.f4367a.get(i4).removeTarget(view);
        }
        return (TransitionSet) super.removeTarget(view);
    }

    @Override // androidx.transition.Transition
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public TransitionSet removeTarget(Class<?> cls) {
        for (int i4 = 0; i4 < this.f4367a.size(); i4++) {
            this.f4367a.get(i4).removeTarget(cls);
        }
        return (TransitionSet) super.removeTarget(cls);
    }

    @Override // androidx.transition.Transition
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public TransitionSet removeTarget(String str) {
        for (int i4 = 0; i4 < this.f4367a.size(); i4++) {
            this.f4367a.get(i4).removeTarget(str);
        }
        return (TransitionSet) super.removeTarget(str);
    }

    /* renamed from: o */
    public TransitionSet m3834o(Transition transition) {
        this.f4367a.remove(transition);
        transition.mParent = null;
        return this;
    }

    @Override // androidx.transition.Transition
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public TransitionSet setDuration(long j4) {
        ArrayList<Transition> arrayList;
        super.setDuration(j4);
        if (this.mDuration >= 0 && (arrayList = this.f4367a) != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.f4367a.get(i4).setDuration(j4);
            }
        }
        return this;
    }

    @Override // androidx.transition.Transition
    public void pause(View view) {
        super.pause(view);
        int size = this.f4367a.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f4367a.get(i4).pause(view);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public TransitionSet setInterpolator(TimeInterpolator timeInterpolator) {
        this.f4371e |= 1;
        ArrayList<Transition> arrayList = this.f4367a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.f4367a.get(i4).setInterpolator(timeInterpolator);
            }
        }
        return (TransitionSet) super.setInterpolator(timeInterpolator);
    }

    /* renamed from: r */
    public TransitionSet m3837r(int i4) {
        if (i4 == 0) {
            this.f4368b = true;
        } else {
            if (i4 != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i4);
            }
            this.f4368b = false;
        }
        return this;
    }

    @Override // androidx.transition.Transition
    public void resume(View view) {
        super.resume(view);
        int size = this.f4367a.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f4367a.get(i4).resume(view);
        }
    }

    @Override // androidx.transition.Transition
    protected void runAnimators() {
        if (this.f4367a.isEmpty()) {
            start();
            end();
            return;
        }
        m3820u();
        if (this.f4368b) {
            Iterator<Transition> it = this.f4367a.iterator();
            while (it.hasNext()) {
                it.next().runAnimators();
            }
            return;
        }
        for (int i4 = 1; i4 < this.f4367a.size(); i4++) {
            this.f4367a.get(i4 - 1).addListener(new C0709a(this.f4367a.get(i4)));
        }
        Transition transition = this.f4367a.get(0);
        if (transition != null) {
            transition.runAnimators();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.transition.Transition
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public TransitionSet setSceneRoot(ViewGroup viewGroup) {
        super.setSceneRoot(viewGroup);
        int size = this.f4367a.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f4367a.get(i4).setSceneRoot(viewGroup);
        }
        return this;
    }

    @Override // androidx.transition.Transition
    void setCanRemoveViews(boolean z3) {
        super.setCanRemoveViews(z3);
        int size = this.f4367a.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f4367a.get(i4).setCanRemoveViews(z3);
        }
    }

    @Override // androidx.transition.Transition
    public void setEpicenterCallback(Transition.AbstractC0707f abstractC0707f) {
        super.setEpicenterCallback(abstractC0707f);
        this.f4371e |= 8;
        int size = this.f4367a.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f4367a.get(i4).setEpicenterCallback(abstractC0707f);
        }
    }

    @Override // androidx.transition.Transition
    public void setPathMotion(PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.f4371e |= 4;
        if (this.f4367a != null) {
            for (int i4 = 0; i4 < this.f4367a.size(); i4++) {
                this.f4367a.get(i4).setPathMotion(pathMotion);
            }
        }
    }

    @Override // androidx.transition.Transition
    public void setPropagation(AbstractC0750v abstractC0750v) {
        super.setPropagation(abstractC0750v);
        this.f4371e |= 2;
        int size = this.f4367a.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f4367a.get(i4).setPropagation(abstractC0750v);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public TransitionSet setStartDelay(long j4) {
        return (TransitionSet) super.setStartDelay(j4);
    }

    @Override // androidx.transition.Transition
    String toString(String str) {
        String string = super.toString(str);
        for (int i4 = 0; i4 < this.f4367a.size(); i4++) {
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append("\n");
            sb.append(this.f4367a.get(i4).toString(str + "  "));
            string = sb.toString();
        }
        return string;
    }

    @Override // androidx.transition.Transition
    /* renamed from: clone */
    public Transition mo10731clone() {
        TransitionSet transitionSet = (TransitionSet) super.mo10731clone();
        transitionSet.f4367a = new ArrayList<>();
        int size = this.f4367a.size();
        for (int i4 = 0; i4 < size; i4++) {
            transitionSet.m3819g(this.f4367a.get(i4).mo10731clone());
        }
        return transitionSet;
    }

    @Override // androidx.transition.Transition
    public Transition excludeTarget(String str, boolean z3) {
        for (int i4 = 0; i4 < this.f4367a.size(); i4++) {
            this.f4367a.get(i4).excludeTarget(str, z3);
        }
        return super.excludeTarget(str, z3);
    }

    @SuppressLint({"RestrictedApi"})
    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4367a = new ArrayList<>();
        this.f4368b = true;
        this.f4370d = false;
        this.f4371e = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0747s.f4466i);
        m3837r(C3369g.m10251g(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.transition.Transition
    public Transition excludeTarget(int i4, boolean z3) {
        for (int i5 = 0; i5 < this.f4367a.size(); i5++) {
            this.f4367a.get(i5).excludeTarget(i4, z3);
        }
        return super.excludeTarget(i4, z3);
    }

    @Override // androidx.transition.Transition
    public Transition excludeTarget(Class<?> cls, boolean z3) {
        for (int i4 = 0; i4 < this.f4367a.size(); i4++) {
            this.f4367a.get(i4).excludeTarget(cls, z3);
        }
        return super.excludeTarget(cls, z3);
    }
}
