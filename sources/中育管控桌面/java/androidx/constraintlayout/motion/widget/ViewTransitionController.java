package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.motion.widget.ViewTransition;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.SharedValues;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class ViewTransitionController {
    ArrayList<ViewTransition.Animate> mAnimations;
    private final MotionLayout mMotionLayout;
    private HashSet<View> mRelatedViews;
    private ArrayList<ViewTransition> mViewTransitions = new ArrayList<>();
    private String mTAG = "ViewTransitionController";
    ArrayList<ViewTransition.Animate> mRemoveList = new ArrayList<>();

    public ViewTransitionController(MotionLayout motionLayout) {
        this.mMotionLayout = motionLayout;
    }

    private void listenForSharedVariable(final ViewTransition viewTransition, final boolean z6) {
        final int sharedValueID = viewTransition.getSharedValueID();
        final int sharedValue = viewTransition.getSharedValue();
        ConstraintLayout.getSharedValues().addListener(viewTransition.getSharedValueID(), new SharedValues.SharedValuesListener() { // from class: androidx.constraintlayout.motion.widget.ViewTransitionController.1
            @Override // androidx.constraintlayout.widget.SharedValues.SharedValuesListener
            public void onNewValue(int i6, int i7, int i8) {
                int sharedValueCurrent = viewTransition.getSharedValueCurrent();
                viewTransition.setSharedValueCurrent(i7);
                if (sharedValueID != i6 || sharedValueCurrent == i7) {
                    return;
                }
                int i9 = 0;
                if (z6) {
                    if (sharedValue == i7) {
                        int childCount = ViewTransitionController.this.mMotionLayout.getChildCount();
                        while (i9 < childCount) {
                            View childAt = ViewTransitionController.this.mMotionLayout.getChildAt(i9);
                            if (viewTransition.matchesView(childAt)) {
                                int currentState = ViewTransitionController.this.mMotionLayout.getCurrentState();
                                ConstraintSet constraintSet = ViewTransitionController.this.mMotionLayout.getConstraintSet(currentState);
                                ViewTransition viewTransition2 = viewTransition;
                                ViewTransitionController viewTransitionController = ViewTransitionController.this;
                                viewTransition2.applyTransition(viewTransitionController, viewTransitionController.mMotionLayout, currentState, constraintSet, childAt);
                            }
                            i9++;
                        }
                        return;
                    }
                    return;
                }
                if (sharedValue != i7) {
                    int childCount2 = ViewTransitionController.this.mMotionLayout.getChildCount();
                    while (i9 < childCount2) {
                        View childAt2 = ViewTransitionController.this.mMotionLayout.getChildAt(i9);
                        if (viewTransition.matchesView(childAt2)) {
                            int currentState2 = ViewTransitionController.this.mMotionLayout.getCurrentState();
                            ConstraintSet constraintSet2 = ViewTransitionController.this.mMotionLayout.getConstraintSet(currentState2);
                            ViewTransition viewTransition3 = viewTransition;
                            ViewTransitionController viewTransitionController2 = ViewTransitionController.this;
                            viewTransition3.applyTransition(viewTransitionController2, viewTransitionController2.mMotionLayout, currentState2, constraintSet2, childAt2);
                        }
                        i9++;
                    }
                }
            }
        });
    }

    private void viewTransition(ViewTransition viewTransition, View... viewArr) {
        int currentState = this.mMotionLayout.getCurrentState();
        if (viewTransition.mViewTransitionMode == 2) {
            viewTransition.applyTransition(this, this.mMotionLayout, currentState, null, viewArr);
            return;
        }
        if (currentState != -1) {
            ConstraintSet constraintSet = this.mMotionLayout.getConstraintSet(currentState);
            if (constraintSet == null) {
                return;
            }
            viewTransition.applyTransition(this, this.mMotionLayout, currentState, constraintSet, viewArr);
            return;
        }
        Log.w(this.mTAG, "No support for ViewTransition within transition yet. Currently: " + this.mMotionLayout.toString());
    }

    public void add(ViewTransition viewTransition) {
        this.mViewTransitions.add(viewTransition);
        this.mRelatedViews = null;
        if (viewTransition.getStateTransition() == 4) {
            listenForSharedVariable(viewTransition, true);
        } else if (viewTransition.getStateTransition() == 5) {
            listenForSharedVariable(viewTransition, false);
        }
    }

    public void addAnimation(ViewTransition.Animate animate) {
        if (this.mAnimations == null) {
            this.mAnimations = new ArrayList<>();
        }
        this.mAnimations.add(animate);
    }

    public void animate() {
        ArrayList<ViewTransition.Animate> arrayList = this.mAnimations;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            ViewTransition.Animate animate = arrayList.get(i6);
            i6++;
            animate.mutate();
        }
        this.mAnimations.removeAll(this.mRemoveList);
        this.mRemoveList.clear();
        if (this.mAnimations.isEmpty()) {
            this.mAnimations = null;
        }
    }

    public boolean applyViewTransition(int i6, MotionController motionController) {
        ArrayList<ViewTransition> arrayList = this.mViewTransitions;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            ViewTransition viewTransition = arrayList.get(i7);
            i7++;
            ViewTransition viewTransition2 = viewTransition;
            if (viewTransition2.getId() == i6) {
                viewTransition2.mKeyFrames.addAllFrames(motionController);
                return true;
            }
        }
        return false;
    }

    public void enableViewTransition(int i6, boolean z6) {
        ArrayList<ViewTransition> arrayList = this.mViewTransitions;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            ViewTransition viewTransition = arrayList.get(i7);
            i7++;
            ViewTransition viewTransition2 = viewTransition;
            if (viewTransition2.getId() == i6) {
                viewTransition2.setEnabled(z6);
                return;
            }
        }
    }

    public void invalidate() {
        this.mMotionLayout.invalidate();
    }

    public boolean isViewTransitionEnabled(int i6) {
        ArrayList<ViewTransition> arrayList = this.mViewTransitions;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            ViewTransition viewTransition = arrayList.get(i7);
            i7++;
            ViewTransition viewTransition2 = viewTransition;
            if (viewTransition2.getId() == i6) {
                return viewTransition2.isEnabled();
            }
        }
        return false;
    }

    public void remove(int i6) {
        ViewTransition viewTransition;
        ArrayList<ViewTransition> arrayList = this.mViewTransitions;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                viewTransition = null;
                break;
            }
            ViewTransition viewTransition2 = arrayList.get(i7);
            i7++;
            viewTransition = viewTransition2;
            if (viewTransition.getId() == i6) {
                break;
            }
        }
        if (viewTransition != null) {
            this.mRelatedViews = null;
            this.mViewTransitions.remove(viewTransition);
        }
    }

    public void removeAnimation(ViewTransition.Animate animate) {
        this.mRemoveList.add(animate);
    }

    public void touchEvent(MotionEvent motionEvent) {
        int currentState = this.mMotionLayout.getCurrentState();
        if (currentState == -1) {
            return;
        }
        int i6 = 0;
        if (this.mRelatedViews == null) {
            this.mRelatedViews = new HashSet<>();
            ArrayList<ViewTransition> arrayList = this.mViewTransitions;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                ViewTransition viewTransition = arrayList.get(i7);
                i7++;
                ViewTransition viewTransition2 = viewTransition;
                int childCount = this.mMotionLayout.getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = this.mMotionLayout.getChildAt(i8);
                    if (viewTransition2.matchesView(childAt)) {
                        childAt.getId();
                        this.mRelatedViews.add(childAt);
                    }
                }
            }
        }
        float x6 = motionEvent.getX();
        float y6 = motionEvent.getY();
        Rect rect = new Rect();
        int action = motionEvent.getAction();
        ArrayList<ViewTransition.Animate> arrayList2 = this.mAnimations;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList<ViewTransition.Animate> arrayList3 = this.mAnimations;
            int size2 = arrayList3.size();
            int i9 = 0;
            while (i9 < size2) {
                ViewTransition.Animate animate = arrayList3.get(i9);
                i9++;
                animate.reactTo(action, x6, y6);
            }
        }
        if (action == 0 || action == 1) {
            ConstraintSet constraintSet = this.mMotionLayout.getConstraintSet(currentState);
            ArrayList<ViewTransition> arrayList4 = this.mViewTransitions;
            int size3 = arrayList4.size();
            while (i6 < size3) {
                int i10 = i6 + 1;
                ViewTransition viewTransition3 = arrayList4.get(i6);
                if (viewTransition3.supports(action)) {
                    Iterator<View> it = this.mRelatedViews.iterator();
                    while (it.hasNext()) {
                        View next = it.next();
                        if (viewTransition3.matchesView(next)) {
                            next.getHitRect(rect);
                            if (rect.contains((int) x6, (int) y6)) {
                                viewTransition3.applyTransition(this, this.mMotionLayout, currentState, constraintSet, next);
                            }
                        }
                    }
                }
                i6 = i10;
            }
        }
    }

    public void viewTransition(int i6, View... viewArr) {
        ArrayList arrayList = new ArrayList();
        ArrayList<ViewTransition> arrayList2 = this.mViewTransitions;
        int size = arrayList2.size();
        ViewTransition viewTransition = null;
        int i7 = 0;
        while (i7 < size) {
            ViewTransition viewTransition2 = arrayList2.get(i7);
            i7++;
            ViewTransition viewTransition3 = viewTransition2;
            if (viewTransition3.getId() == i6) {
                for (View view : viewArr) {
                    if (viewTransition3.checkTags(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    viewTransition(viewTransition3, (View[]) arrayList.toArray(new View[0]));
                    arrayList.clear();
                }
                viewTransition = viewTransition3;
            }
        }
        if (viewTransition == null) {
            Log.e(this.mTAG, " Could not find ViewTransition");
        }
    }
}
