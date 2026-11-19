package androidx.transition;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        m3764v();
    }

    /* renamed from: v */
    private void m3764v() {
        m3837r(1);
        m3826f(new Fade(2)).m3826f(new ChangeBounds()).m3826f(new Fade(1));
    }

    public AutoTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3764v();
    }
}
