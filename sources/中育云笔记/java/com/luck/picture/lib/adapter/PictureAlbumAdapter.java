package com.luck.picture.lib.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.luck.picture.lib.R$drawable;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.R$string;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMediaFolder;
import com.luck.picture.lib.style.AlbumWindowStyle;
import java.util.ArrayList;
import java.util.List;
import p235l6.AbstractC10148b;
import p235l6.AbstractC10149c;
import p260n6.InterfaceC10322a;
import p304q6.InterfaceC10741a;
import p359u6.AbstractC11370a;

/* loaded from: classes5.dex */
public class PictureAlbumAdapter extends RecyclerView.Adapter<C7439b> {

    /* renamed from: a */
    public List f12149a;

    /* renamed from: b */
    public InterfaceC10741a f12150b;

    /* renamed from: com.luck.picture.lib.adapter.PictureAlbumAdapter$a */
    public class ViewOnClickListenerC7438a implements View.OnClickListener {

        /* renamed from: c */
        public final /* synthetic */ int f12151c;

        /* renamed from: d */
        public final /* synthetic */ LocalMediaFolder f12152d;

        public ViewOnClickListenerC7438a(int i10, LocalMediaFolder localMediaFolder) {
            this.f12151c = i10;
            this.f12152d = localMediaFolder;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PictureAlbumAdapter.this.f12150b == null) {
                return;
            }
            PictureAlbumAdapter.this.f12150b.mo9008a(this.f12151c, this.f12152d);
        }
    }

    /* renamed from: com.luck.picture.lib.adapter.PictureAlbumAdapter$b */
    public static class C7439b extends RecyclerView.ViewHolder {

        /* renamed from: c */
        public ImageView f12154c;

        /* renamed from: d */
        public TextView f12155d;

        /* renamed from: e */
        public TextView f12156e;

        public C7439b(View view) {
            super(view);
            this.f12154c = (ImageView) view.findViewById(R$id.first_image);
            this.f12155d = (TextView) view.findViewById(R$id.tv_folder_name);
            this.f12156e = (TextView) view.findViewById(R$id.tv_select_tag);
            AlbumWindowStyle albumWindowStyleM26625a = PictureSelectionConfig.f12295P0.m26625a();
            int iM9474a = albumWindowStyleM26625a.m9474a();
            if (iM9474a != 0) {
                view.setBackgroundResource(iM9474a);
            }
            int iM9475b = albumWindowStyleM26625a.m9475b();
            if (iM9475b != 0) {
                this.f12156e.setBackgroundResource(iM9475b);
            }
            int iM9476c = albumWindowStyleM26625a.m9476c();
            if (iM9476c != 0) {
                this.f12155d.setTextColor(iM9476c);
            }
            int iM9477g = albumWindowStyleM26625a.m9477g();
            if (iM9477g > 0) {
                this.f12155d.setTextSize(iM9477g);
            }
        }
    }

    /* renamed from: b */
    public void m9129b(List list) {
        this.f12149a = new ArrayList(list);
    }

    /* renamed from: c */
    public List m9130c() {
        List list = this.f12149a;
        return list != null ? list : new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C7439b c7439b, int i10) {
        LocalMediaFolder localMediaFolder = (LocalMediaFolder) this.f12149a.get(i10);
        String strM9411i = localMediaFolder.m9411i();
        int iM9412j = localMediaFolder.m9412j();
        String strM9409g = localMediaFolder.m9409g();
        boolean z10 = false;
        c7439b.f12156e.setVisibility(localMediaFolder.m9414l() ? 0 : 4);
        LocalMediaFolder localMediaFolderM25302j = AbstractC11370a.m25302j();
        View view = c7439b.itemView;
        if (localMediaFolderM25302j != null && localMediaFolder.m9406a() == localMediaFolderM25302j.m9406a()) {
            z10 = true;
        }
        view.setSelected(z10);
        if (AbstractC10149c.m21175d(localMediaFolder.m9410h())) {
            c7439b.f12154c.setImageResource(R$drawable.ps_audio_placeholder);
        } else {
            InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
            if (interfaceC10322a != null) {
                interfaceC10322a.mo19806d(c7439b.itemView.getContext(), strM9409g, c7439b.f12154c);
            }
        }
        c7439b.f12155d.setText(c7439b.itemView.getContext().getString(R$string.ps_camera_roll_num, strM9411i, Integer.valueOf(iM9412j)));
        c7439b.itemView.setOnClickListener(new ViewOnClickListenerC7438a(i10, localMediaFolder));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C7439b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        int iM21171a = AbstractC10148b.m21171a(viewGroup.getContext(), 6);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (iM21171a == 0) {
            iM21171a = R$layout.ps_album_folder_item;
        }
        return new C7439b(layoutInflaterFrom.inflate(iM21171a, viewGroup, false));
    }

    /* renamed from: f */
    public void m9133f(InterfaceC10741a interfaceC10741a) {
        this.f12150b = interfaceC10741a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f12149a.size();
    }
}
