package com.friday.lecture.floatwindow.canvas;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewpager2.widget.ViewPager2;
import com.friday.lecture.R$id;
import com.friday.lecture.R$layout;
import com.friday.lecture.floatwindow.canvas.CanvasListLayout;
import java.util.ArrayList;
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10773d;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CanvasListLayout extends FrameLayout {

    /* renamed from: c */
    public ViewPager2 f8686c;

    /* renamed from: d */
    public final ArrayList f8687d;

    /* renamed from: e */
    public String f8688e;

    /* renamed from: f */
    public boolean f8689f;

    /* renamed from: g */
    public final InterfaceC10773d f8690g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CanvasListLayout(Context context) {
        super(context);
        AbstractC9979u.m20294g(context, "context");
        this.f8687d = new ArrayList();
        this.f8688e = "";
        this.f8690g = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: e3.a
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return CanvasListLayout.m6523c();
            }
        });
    }

    /* renamed from: c */
    public static final CanvasListLayout$theAdapter$2$1 m6523c() {
        return new CanvasListLayout$theAdapter$2$1(R$layout.item_canvas_list);
    }

    private final CanvasListLayout$theAdapter$2$1 getTheAdapter() {
        return (CanvasListLayout$theAdapter$2$1) this.f8690g.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final void m6524b() {
        this.f8689f = true;
        ViewPager2 viewPager2 = null;
        addView(View.inflate(getContext(), R$layout.simple_canvas, null));
        View viewFindViewById = findViewById(R$id.view_pager);
        AbstractC9979u.m20293f(viewFindViewById, "findViewById(...)");
        this.f8686c = (ViewPager2) viewFindViewById;
        ArrayList arrayList = this.f8687d;
        Context context = getContext();
        AbstractC9979u.m20293f(context, "getContext(...)");
        arrayList.add(new SimpleCanvasLayout(context, false, 2, 0 == true ? 1 : 0));
        ViewPager2 viewPager22 = this.f8686c;
        if (viewPager22 == null) {
            AbstractC9979u.m20312y("viewPager");
        } else {
            viewPager2 = viewPager22;
        }
        viewPager2.setUserInputEnabled(false);
        viewPager2.setAdapter(getTheAdapter());
        getTheAdapter().setList(this.f8687d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f8689f) {
            return;
        }
        m6524b();
    }
}
