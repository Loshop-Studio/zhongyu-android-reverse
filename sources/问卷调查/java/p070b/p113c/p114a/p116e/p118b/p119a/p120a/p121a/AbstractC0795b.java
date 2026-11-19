package p070b.p113c.p114a.p116e.p118b.p119a.p120a.p121a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import p070b.p113c.p114a.C0788b;
import p070b.p113c.p114a.p116e.p118b.p119a.p120a.p121a.AbstractC0795b;

/* renamed from: b.c.a.e.b.a.a.a.b */
/* loaded from: classes.dex */
public abstract class AbstractC0795b<E, T extends AbstractC0795b<E, T>> extends AbstractC0794a<E, T> {

    /* renamed from: t */
    public List<ImageView> f4485t;

    /* renamed from: u */
    public int f4486u;

    /* renamed from: v */
    public Drawable f4487v;

    /* renamed from: w */
    public Drawable f4488w;

    /* renamed from: x */
    public LinearLayout f4489x;

    public AbstractC0795b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4485t = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0788b.f4448b);
        this.f4486u = typedArrayObtainStyledAttributes.getInt(5, 1);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(8, m2497a(6.0f));
        typedArrayObtainStyledAttributes.getDimensionPixelSize(2, m2497a(6.0f));
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, m2497a(6.0f));
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, m2497a(3.0f));
        typedArrayObtainStyledAttributes.getColor(3, Color.parseColor("#ffffff"));
        typedArrayObtainStyledAttributes.getColor(6, Color.parseColor("#88ffffff"));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        typedArrayObtainStyledAttributes.recycle();
        LinearLayout linearLayout = new LinearLayout(context);
        this.f4489x = linearLayout;
        linearLayout.setGravity(17);
        try {
            if (this.f4486u == 0) {
                if (resourceId != 0) {
                    this.f4487v = getResources().getDrawable(resourceId);
                }
                if (resourceId2 != 0) {
                    this.f4488w = getResources().getDrawable(resourceId2);
                }
            }
        } catch (Resources.NotFoundException e2) {
            e2.printStackTrace();
        }
    }

    @Override // p070b.p113c.p114a.p116e.p118b.p119a.p120a.p121a.AbstractC0794a
    public void setCurrentIndicator(int i) {
        int i2 = 0;
        while (i2 < this.f4485t.size()) {
            this.f4485t.get(i2).setImageDrawable(i2 == i ? this.f4487v : this.f4488w);
            i2++;
        }
    }
}
