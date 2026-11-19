package p177h9;

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: h9.b */
/* loaded from: classes5.dex */
public class C9502b extends AbstractC9501a implements InterfaceC9503c {

    /* renamed from: c */
    public Context f21979c;

    /* renamed from: d */
    public final List f21980d;

    /* renamed from: e */
    public final List f21981e;

    /* renamed from: f */
    public final int[] f21982f;

    /* renamed from: g */
    public int f21983g;

    /* renamed from: h */
    public float f21984h;

    /* renamed from: i */
    public int f21985i;

    /* renamed from: j */
    public boolean f21986j = false;

    /* renamed from: h9.b$b */
    public static class b {

        /* renamed from: a */
        public TextView f21987a;

        public b(TextView textView) {
            this.f21987a = textView;
        }
    }

    public C9502b(Context context, String[] strArr) {
        this.f21979c = context;
        ArrayList arrayList = new ArrayList();
        this.f21980d = arrayList;
        arrayList.addAll(Arrays.asList(strArr));
        this.f21981e = new ArrayList(arrayList);
        this.f21982f = new int[arrayList.size()];
    }

    @Override // p177h9.InterfaceC9503c
    /* renamed from: a */
    public boolean mo18724a(String str) {
        this.f21981e.clear();
        if (TextUtils.isEmpty(str)) {
            this.f21981e.addAll(this.f21980d);
            int i10 = 0;
            while (true) {
                int[] iArr = this.f21982f;
                if (i10 >= iArr.length) {
                    break;
                }
                iArr[i10] = i10;
                i10++;
            }
        } else {
            try {
                for (int i11 = 0; i11 < this.f21980d.size(); i11++) {
                    if (((String) this.f21980d.get(i11)).replaceAll("\\s+", HiAnalyticsConstant.REPORT_VAL_SEPARATOR).matches("[^\\s]*" + str + "[^\\s]*")) {
                        this.f21982f[this.f21981e.size()] = i11;
                        if (this.f21986j) {
                            this.f21981e.add(((String) this.f21980d.get(i11)).replaceFirst(str, "<font color=\"#F15C58\">" + str + "</font>"));
                        } else {
                            this.f21981e.add(this.f21980d.get(i11));
                        }
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        notifyDataSetChanged();
        return this.f21981e.size() <= 0;
    }

    @Override // p177h9.AbstractC9501a
    /* renamed from: c */
    public String mo18723c(int i10) {
        return (String) this.f21980d.get(this.f21982f[i10]);
    }

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public String getItem(int i10) {
        List list = this.f21981e;
        return (list == null || list.get(i10) == null) ? "" : (String) this.f21981e.get(i10);
    }

    /* renamed from: e */
    public C9502b m18726e(boolean z10) {
        this.f21986j = z10;
        return this;
    }

    /* renamed from: f */
    public C9502b m18727f(int i10) {
        this.f21983g = i10;
        return this;
    }

    /* renamed from: g */
    public C9502b m18728g(float f10) {
        this.f21984h = f10;
        return this;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List list = this.f21981e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView;
        if (view == null) {
            View viewInflate = LayoutInflater.from(this.f21979c).inflate(R$layout.ms_layout_list_item, viewGroup, false);
            textView = (TextView) viewInflate.findViewById(R$id.tv_tinted_spinner);
            textView.setTextColor(this.f21983g);
            textView.setTextSize(0, this.f21984h);
            int i11 = this.f21985i;
            if (i11 != 0) {
                textView.setBackgroundResource(i11);
            }
            if (this.f21979c.getResources().getConfiguration().getLayoutDirection() == 1) {
                textView.setTextDirection(4);
            }
            viewInflate.setTag(new b(textView));
        } else {
            textView = ((b) view.getTag()).f21987a;
        }
        textView.setText(Html.fromHtml(getItem(i10)));
        return textView;
    }

    @Override // p177h9.AbstractC9501a
    /* renamed from: b */
    public InterfaceC9503c mo18722b() {
        return this;
    }
}
