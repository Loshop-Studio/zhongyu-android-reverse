package p106l4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.mistake.R;
import com.zykj.mistake.activity.SketchActivity;
import com.zykj.mistake.adapter.SketchMaterialAdapter;
import java.util.ArrayList;

/* renamed from: l4.k */
/* loaded from: classes3.dex */
public final class C6060k extends PopupWindow {

    /* renamed from: a */
    public final SketchActivity f9661a;

    public C6060k(SketchActivity sketchActivity, ArrayList arrayList) {
        super(sketchActivity);
        this.f9661a = sketchActivity;
        View viewInflate = LayoutInflater.from(sketchActivity).inflate(R.layout.popup_sketch_material, (ViewGroup) null);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(sketchActivity));
        recyclerView.setAdapter(new SketchMaterialAdapter(sketchActivity, arrayList));
        recyclerView.setNestedScrollingEnabled(false);
        setContentView(viewInflate);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(sketchActivity.getDrawable(R.drawable.bg_gray_stroke_radius_3));
        setOutsideTouchable(true);
        setFocusable(true);
    }
}
