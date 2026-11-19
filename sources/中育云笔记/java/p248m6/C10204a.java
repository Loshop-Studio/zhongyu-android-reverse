package p248m6;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.R$style;
import com.luck.picture.lib.adapter.PictureAlbumAdapter;
import com.luck.picture.lib.decoration.WrapContentLinearLayoutManager;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import java.util.List;
import p008a7.AbstractC0072e;
import p008a7.AbstractC0077j;
import p304q6.InterfaceC10741a;
import p359u6.AbstractC11370a;

/* renamed from: m6.a */
/* loaded from: classes5.dex */
public class C10204a extends PopupWindow {

    /* renamed from: a */
    public final Context f24299a;

    /* renamed from: b */
    public View f24300b;

    /* renamed from: c */
    public RecyclerView f24301c;

    /* renamed from: d */
    public boolean f24302d = false;

    /* renamed from: e */
    public int f24303e;

    /* renamed from: f */
    public PictureAlbumAdapter f24304f;

    /* renamed from: g */
    public d f24305g;

    /* renamed from: m6.a$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C10204a.this.dismiss();
        }
    }

    /* renamed from: m6.a$b */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (AbstractC0077j.m214b()) {
                C10204a.this.dismiss();
            }
        }
    }

    /* renamed from: m6.a$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C10204a.super.dismiss();
            C10204a.this.f24302d = false;
        }
    }

    /* renamed from: m6.a$d */
    public interface d {
        /* renamed from: a */
        void mo9006a();

        /* renamed from: b */
        void mo9007b();
    }

    public C10204a(Context context) {
        this.f24299a = context;
        setContentView(LayoutInflater.from(context).inflate(R$layout.ps_window_folder, (ViewGroup) null));
        setWidth(-1);
        setHeight(-2);
        setAnimationStyle(R$style.PictureThemeWindowStyle);
        setFocusable(true);
        setOutsideTouchable(true);
        update();
        m21329j();
    }

    /* renamed from: d */
    public static C10204a m21322d(Context context) {
        return new C10204a(context);
    }

    /* renamed from: c */
    public void m21323c(List list) {
        this.f24304f.m9129b(list);
        this.f24304f.notifyDataSetChanged();
        this.f24301c.getLayoutParams().height = list.size() > 8 ? this.f24303e : -2;
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        if (this.f24302d) {
            return;
        }
        this.f24300b.setAlpha(0.0f);
        d dVar = this.f24305g;
        if (dVar != null) {
            dVar.mo9007b();
        }
        this.f24302d = true;
        this.f24300b.post(new c());
    }

    /* renamed from: e */
    public void m21324e() {
        List listM9130c = this.f24304f.m9130c();
        for (int i10 = 0; i10 < listM9130c.size(); i10++) {
            LocalMediaFolder localMediaFolder = (LocalMediaFolder) listM9130c.get(i10);
            localMediaFolder.m9423u(false);
            this.f24304f.notifyItemChanged(i10);
            for (int i11 = 0; i11 < AbstractC11370a.m25304l(); i11++) {
                if (TextUtils.equals(localMediaFolder.m9411i(), ((LocalMedia) AbstractC11370a.m25306n().get(i11)).m9400w()) || localMediaFolder.m9406a() == -1) {
                    localMediaFolder.m9423u(true);
                    this.f24304f.notifyItemChanged(i10);
                    break;
                }
            }
        }
    }

    /* renamed from: f */
    public List m21325f() {
        return this.f24304f.m9130c();
    }

    /* renamed from: g */
    public int m21326g() {
        if (m21328i() > 0) {
            return m21327h(0).m9412j();
        }
        return 0;
    }

    /* renamed from: h */
    public LocalMediaFolder m21327h(int i10) {
        if (this.f24304f.m9130c().size() <= 0 || i10 >= this.f24304f.m9130c().size()) {
            return null;
        }
        return (LocalMediaFolder) this.f24304f.m9130c().get(i10);
    }

    /* renamed from: i */
    public int m21328i() {
        return this.f24304f.m9130c().size();
    }

    /* renamed from: j */
    public final void m21329j() {
        this.f24303e = (int) (AbstractC0072e.m167g(this.f24299a) * 0.6d);
        this.f24301c = (RecyclerView) getContentView().findViewById(R$id.folder_list);
        this.f24300b = getContentView().findViewById(R$id.rootViewBg);
        this.f24301c.setLayoutManager(new WrapContentLinearLayoutManager(this.f24299a));
        PictureAlbumAdapter pictureAlbumAdapter = new PictureAlbumAdapter();
        this.f24304f = pictureAlbumAdapter;
        this.f24301c.setAdapter(pictureAlbumAdapter);
        this.f24300b.setOnClickListener(new a());
        getContentView().findViewById(R$id.rootView).setOnClickListener(new b());
    }

    /* renamed from: k */
    public void m21330k(InterfaceC10741a interfaceC10741a) {
        this.f24304f.m9133f(interfaceC10741a);
    }

    /* renamed from: l */
    public void m21331l(d dVar) {
        this.f24305g = dVar;
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        if (m21325f() == null || m21325f().size() == 0) {
            return;
        }
        if (AbstractC0077j.m215c()) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            showAtLocation(view, 0, 0, iArr[1] + view.getHeight());
        } else {
            super.showAsDropDown(view);
        }
        this.f24302d = false;
        d dVar = this.f24305g;
        if (dVar != null) {
            dVar.mo9006a();
        }
        this.f24300b.animate().alpha(1.0f).setDuration(250L).setStartDelay(250L).start();
        m21324e();
    }
}
