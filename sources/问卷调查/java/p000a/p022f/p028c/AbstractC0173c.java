package p000a.p022f.p028c;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import p000a.p022f.p025b.p026i.C0150d;
import p000a.p022f.p025b.p026i.InterfaceC0153g;

/* renamed from: a.f.c.c */
/* loaded from: classes.dex */
public abstract class AbstractC0173c extends View {

    /* renamed from: b */
    public int[] f1240b;

    /* renamed from: c */
    public int f1241c;

    /* renamed from: d */
    public Context f1242d;

    /* renamed from: e */
    public InterfaceC0153g f1243e;

    /* renamed from: f */
    public String f1244f;

    /* renamed from: g */
    public HashMap<Integer, String> f1245g;

    public AbstractC0173c(Context context) {
        super(context);
        this.f1240b = new int[32];
        this.f1245g = new HashMap<>();
        this.f1242d = context;
        mo657e(null);
    }

    /* renamed from: a */
    public final void m661a(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        if (str == null || str.length() == 0 || this.f1242d == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int identifier = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objM1636c = constraintLayout.m1636c(0, strTrim);
            if (objM1636c instanceof Integer) {
                identifier = ((Integer) objM1636c).intValue();
            }
        }
        if (identifier == 0 && constraintLayout != null) {
            identifier = m664d(constraintLayout, strTrim);
        }
        if (identifier == 0) {
            try {
                identifier = C0179i.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (identifier == 0) {
            identifier = this.f1242d.getResources().getIdentifier(strTrim, "id", this.f1242d.getPackageName());
        }
        if (identifier != 0) {
            this.f1245g.put(Integer.valueOf(identifier), strTrim);
            m662b(identifier);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    /* renamed from: b */
    public final void m662b(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f1241c + 1;
        int[] iArr = this.f1240b;
        if (i2 > iArr.length) {
            this.f1240b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1240b;
        int i3 = this.f1241c;
        iArr2[i3] = i;
        this.f1241c = i3 + 1;
    }

    /* renamed from: c */
    public void m663c() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) parent;
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f1241c; i++) {
            View viewM1637d = constraintLayout.m1637d(this.f1240b[i]);
            if (viewM1637d != null) {
                viewM1637d.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewM1637d.setTranslationZ(viewM1637d.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* renamed from: d */
    public final int m664d(ConstraintLayout constraintLayout, String str) throws Resources.NotFoundException {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f1242d.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String resourceEntryName = null;
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: e */
    public void mo657e(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0180j.f1377b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 19) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f1244f = string;
                    setIds(string);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo658f(C0150d c0150d, boolean z) {
    }

    /* renamed from: g */
    public void m665g() {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1240b, this.f1241c);
    }

    /* renamed from: h */
    public void m666h() {
    }

    /* renamed from: i */
    public void m667i() {
    }

    /* renamed from: j */
    public void m668j() {
        if (this.f1243e == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.C0499a) {
            ((ConstraintLayout.C0499a) layoutParams).f3064l0 = (C0150d) this.f1243e;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1244f;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f1244f = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f1241c = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m661a(str.substring(i));
                return;
            } else {
                m661a(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1244f = null;
        this.f1241c = 0;
        for (int i : iArr) {
            m662b(i);
        }
    }
}
