package p070b.p074b.p075a.p076a.p080c;

import android.util.Property;
import android.view.ViewGroup;
import io.github.inflationx.calligraphy3.C1088R;

/* renamed from: b.b.a.a.c.c */
/* loaded from: classes.dex */
public class C0572c extends Property<ViewGroup, Float> {

    /* renamed from: a */
    public static final Property<ViewGroup, Float> f3540a = new C0572c("childrenAlpha");

    public C0572c(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    public Float get(ViewGroup viewGroup) {
        Float f2 = (Float) viewGroup.getTag(C1088R.id.mtrl_internal_children_alpha_tag);
        return f2 != null ? f2 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public void set(ViewGroup viewGroup, Float f2) {
        ViewGroup viewGroup2 = viewGroup;
        float fFloatValue = f2.floatValue();
        viewGroup2.setTag(C1088R.id.mtrl_internal_children_alpha_tag, Float.valueOf(fFloatValue));
        int childCount = viewGroup2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup2.getChildAt(i).setAlpha(fFloatValue);
        }
    }
}
