package p187n4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.GridLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.zykj.study.R$drawable;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: n4.o0 */
/* loaded from: classes4.dex */
public final class C9398o0 extends BaseExpandableListAdapter {

    /* renamed from: a */
    public List f18561a;

    /* renamed from: b */
    public List f18562b;

    /* renamed from: c */
    public Context f18563c;

    public C9398o0(List group, List students, Context context) {
        AbstractC9133u.m16133g(group, "group");
        AbstractC9133u.m16133g(students, "students");
        AbstractC9133u.m16133g(context, "context");
        this.f18561a = group;
        this.f18562b = students;
        this.f18563c = context;
    }

    @Override // android.widget.ExpandableListAdapter
    public Object getChild(int i10, int i11) {
        return this.f18562b.get(i11);
    }

    @Override // android.widget.ExpandableListAdapter
    public long getChildId(int i10, int i11) {
        return i11;
    }

    @Override // android.widget.ExpandableListAdapter
    public View getChildView(int i10, int i11, boolean z10, View view, ViewGroup parent) {
        AbstractC9133u.m16133g(parent, "parent");
        if (((List) this.f18562b.get(i10)).isEmpty()) {
            View viewInflate = View.inflate(this.f18563c, R$layout.layout_self_course_student_group_empty, null);
            AbstractC9133u.m16132f(viewInflate, "inflate(...)");
            return viewInflate;
        }
        View viewInflate2 = View.inflate(this.f18563c, R$layout.layout_self_course_group_student, null);
        AbstractC9133u.m16132f(viewInflate2, "inflate(...)");
        GridLayout gridLayout = (GridLayout) viewInflate2.findViewById(R$id.course_group_student_bg);
        GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
        layoutParams.height = -2;
        layoutParams.width = -1;
        gridLayout.setLayoutParams(layoutParams);
        gridLayout.setColumnCount(6);
        for (String str : (Iterable) this.f18562b.get(i10)) {
            View viewInflate3 = View.inflate(this.f18563c, R$layout.item_self_course_group_student, null);
            ((AppCompatTextView) viewInflate3.findViewById(R$id.tv_name)).setText(str);
            gridLayout.addView(viewInflate3);
        }
        return viewInflate2;
    }

    @Override // android.widget.ExpandableListAdapter
    public int getChildrenCount(int i10) {
        return 1;
    }

    @Override // android.widget.ExpandableListAdapter
    public Object getGroup(int i10) {
        return this.f18561a.get(i10);
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        return this.f18561a.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public long getGroupId(int i10) {
        return i10;
    }

    @Override // android.widget.ExpandableListAdapter
    public View getGroupView(int i10, boolean z10, View view, ViewGroup viewGroup) {
        LayoutInflater.from(this.f18563c).inflate(R$layout.item_self_course_student_gruop, viewGroup, false);
        if (view == null) {
            view = LayoutInflater.from(this.f18563c).inflate(R$layout.item_self_course_student_gruop, viewGroup, false);
            AbstractC9133u.m16132f(view, "inflate(...)");
        }
        ((AppCompatTextView) view.findViewById(R$id.tv_group_message)).setText(this.f18561a.get(i10) + "(" + ((List) this.f18562b.get(i10)).size() + "人)");
        ((AppCompatImageView) view.findViewById(R$id.iv_expansion)).setImageResource(R$drawable.ic_down_arrow);
        if (z10) {
            ((AppCompatImageView) view.findViewById(R$id.iv_expansion)).setRotation(180.0f);
            return view;
        }
        ((AppCompatImageView) view.findViewById(R$id.iv_expansion)).setRotation(0.0f);
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean isChildSelectable(int i10, int i11) {
        return false;
    }
}
