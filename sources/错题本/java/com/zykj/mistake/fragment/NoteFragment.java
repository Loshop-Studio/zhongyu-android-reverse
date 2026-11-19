package com.zykj.mistake.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Messenger;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.core.impl.C0362d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.C2857e;
import com.blankj.utilcode.util.HandlerC3388h;
import com.bumptech.glide.C3412f;
import com.bumptech.glide.ComponentCallbacks2C3408b;
import com.zykj.mistake.R;
import com.zykj.mistake.adapter.DetailNoteImageAdapter;
import com.zykj.mistake.base.BaseMVPFragment;
import com.zykj.mistake.databinding.FragmentNoteBinding;
import com.zykj.mistake.network.C5088a;
import com.zykj.mistake.presenter.NotePresenter;
import com.zykj.mistake.service.UploadIntentService;
import com.zykj.mistake.utils.AbstractC5101f;
import com.zykj.mistake.utils.C5100e;
import com.zykj.mistake.utils.C5102g;
import com.zykj.mistake.utils.C5103h;
import com.zykj.view.utils.ImagePicker;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import p016b0.AbstractC3085o;
import p021b5.C3197i;
import p059f5.C5527a;
import p106l4.DialogC6053d;
import p144q4.C6419c;
import p144q4.C6422f;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m5110d2 = {"Lcom/zykj/mistake/fragment/NoteFragment;", "Lcom/zykj/mistake/base/BaseMVPFragment;", "Lcom/zykj/mistake/presenter/NotePresenter;", "Lcom/zykj/mistake/databinding/FragmentNoteBinding;", "", "<init>", "()V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNoteFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoteFragment.kt\ncom/zykj/mistake/fragment/NoteFragment\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,366:1\n13472#2,2:367\n*S KotlinDebug\n*F\n+ 1 NoteFragment.kt\ncom/zykj/mistake/fragment/NoteFragment\n*L\n152#1:367,2\n*E\n"})
/* loaded from: classes3.dex */
public final class NoteFragment extends BaseMVPFragment<NotePresenter, FragmentNoteBinding> {

    /* renamed from: e */
    public long f7783e;

    /* renamed from: k */
    public boolean f7789k;

    /* renamed from: l */
    public DialogC6053d f7790l;

    /* renamed from: m */
    public C5102g f7791m;

    /* renamed from: d */
    public final String f7782d = "DrawBoardData";

    /* renamed from: f */
    public String f7784f = "";

    /* renamed from: g */
    public String f7785g = "";

    /* renamed from: h */
    public final ImagePicker f7786h = new ImagePicker(this, null, 2, 0 == true ? 1 : 0);

    /* renamed from: i */
    public final DetailNoteImageAdapter f7787i = new DetailNoteImageAdapter();

    /* renamed from: j */
    public final int f7788j = 4;

    /* renamed from: n */
    public final Messenger f7792n = new Messenger(new HandlerC3388h(this, 6));

    @Override // com.zykj.mistake.base.BaseFragment
    /* renamed from: e */
    public final int mo3959e() {
        return R.layout.fragment_note;
    }

    @Override // com.zykj.mistake.base.BaseFragment
    /* renamed from: g */
    public final void mo3961g(View view) {
        AppCompatImageView ivNoteThumbnail = ((FragmentNoteBinding) m3960f()).f6141a;
        AbstractC5830k.m5329f(ivNoteThumbnail, "ivNoteThumbnail");
        C5100e.m4461e(ivNoteThumbnail, new C6419c(this, 1));
        C0362d c0362d = new C0362d(this, 17);
        DetailNoteImageAdapter detailNoteImageAdapter = this.f7787i;
        detailNoteImageAdapter.f2646c = c0362d;
        C5527a c5527a = detailNoteImageAdapter.f2647d;
        if (c5527a == null) {
            throw new IllegalStateException("Please first implements DraggableModule");
        }
        c5527a.f16e = new C6422f(this);
        ((FragmentNoteBinding) m3960f()).f6142b.setAdapter(detailNoteImageAdapter);
    }

    @Override // com.zykj.mistake.base.BaseMVPFragment
    /* renamed from: i */
    public final Class mo3967i() {
        return NotePresenter.class;
    }

    @Override // com.zykj.mistake.base.BaseMVPFragment
    /* renamed from: j */
    public final void mo3968j() {
        this.f7783e = requireArguments().getLong("itemId", 0L);
        String string = requireArguments().getString("noteUrl", "");
        AbstractC5830k.m5329f(string, "getString(...)");
        this.f7784f = string;
        ArrayList arrayList = new ArrayList();
        String[] stringArray = requireArguments().getStringArray("pictureNoteUrl");
        int i = 0;
        if (stringArray != null) {
            for (String str : stringArray) {
                arrayList.add(str);
            }
        }
        if (arrayList.size() < this.f7788j) {
            arrayList.add("");
        }
        this.f7785g = AbstractC5101f.m4464b("Board/Pictures");
        if (this.f7784f.length() > 0) {
            try {
                File file = new File(AbstractC5101f.m4464b(this.f7782d + "/" + this.f7783e));
                String str2 = this.f7784f;
                String absolutePath = file.getAbsolutePath();
                AbstractC5830k.m5329f(absolutePath, "getAbsolutePath(...)");
                C5103h c5103h = new C5103h(absolutePath, str2);
                c5103h.m4466a(str2, new C2857e(24, this, c5103h), new C6419c(this, i));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        DetailNoteImageAdapter detailNoteImageAdapter = this.f7787i;
        List list = detailNoteImageAdapter.f2645b;
        if (arrayList != list) {
            list.clear();
            if (!arrayList.isEmpty()) {
                list.addAll(arrayList);
            }
        } else if (arrayList.isEmpty()) {
            list.clear();
        } else {
            ArrayList arrayList2 = new ArrayList(arrayList);
            list.clear();
            list.addAll(arrayList2);
        }
        detailNoteImageAdapter.notifyDataSetChanged();
        Context contextRequireContext = requireContext();
        AbstractC5830k.m5329f(contextRequireContext, "requireContext(...)");
        this.f7790l = new DialogC6053d(contextRequireContext);
        NotePresenter notePresenter = (NotePresenter) m3966h();
        C5088a c5088a = C5088a.f7986a;
        notePresenter.m3970b(C5088a.m4381b().m4395m("com.zykj.mistake"), new C3197i(notePresenter, i), false);
    }

    /* renamed from: k */
    public final void m4338k(String str) throws IOException {
        String str2 = AbstractC5101f.f8039a;
        String strM4464b = AbstractC5101f.m4464b(this.f7782d + "/" + this.f7783e);
        if (str == null) {
            str = new C5103h(strM4464b, null).m4469d();
        }
        if (str == null || !new File(str).exists()) {
            ((FragmentNoteBinding) m3960f()).f6141a.setImageDrawable(null);
            return;
        }
        if (getActivity() != null) {
            FragmentActivity activity = getActivity();
            if (activity == null || !activity.isDestroyed()) {
                ((C3412f) ((C3412f) ComponentCallbacks2C3408b.m2363f(this).m2386l(str).m6096r()).m6086g(AbstractC3085o.f1480b)).m2378y(((FragmentNoteBinding) m3960f()).f6141a);
            }
        }
    }

    /* renamed from: l */
    public final void m4339l(String str) {
        Intent intent = new Intent(requireActivity(), (Class<?>) UploadIntentService.class);
        intent.putExtra("UPLOAD_TYPE", 1);
        intent.putExtra("UPLOAD_PATH", str);
        intent.putExtra("UPLOAD_MESSENGER", this.f7792n);
        requireActivity().startService(intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f7791m = new C5102g(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() throws IOException {
        super.onResume();
        m4338k(null);
    }
}
