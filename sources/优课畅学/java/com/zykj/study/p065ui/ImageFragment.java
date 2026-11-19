package com.zykj.study.p065ui;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavArgsLazy;
import com.bumptech.glide.C5396g;
import com.bumptech.glide.ComponentCallbacks2C5391b;
import com.zykj.study.R$drawable;
import com.zykj.study.R$layout;
import com.zykj.study.databinding.FragmentImageShowBinding;
import java.io.File;
import kotlin.jvm.internal.AbstractC9137y;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10559a;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class ImageFragment extends Hilt_ImageFragment<FragmentImageShowBinding> {

    /* renamed from: f */
    public final NavArgsLazy f11589f = new NavArgsLazy(AbstractC9137y.m16154b(ImageFragmentArgs.class), new C7755a(this));

    /* renamed from: com.zykj.study.ui.ImageFragment$a */
    public static final class C7755a implements InterfaceC10559a {

        /* renamed from: a */
        public final /* synthetic */ Fragment f11590a;

        public C7755a(Fragment fragment) {
            this.f11590a = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f11590a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f11590a + " has null arguments");
        }
    }

    /* renamed from: g */
    public final ImageFragmentArgs m10429g() {
        return (ImageFragmentArgs) this.f11589f.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        new File(m10429g().m10431a());
        ((C5396g) ((C5396g) ComponentCallbacks2C5391b.m2738t(requireContext()).m2809u(m10429g().m10431a()).m13377X(R$drawable.ic_loading)).m13397l(R$drawable.ic_image_error)).m2790w0(((FragmentImageShowBinding) getMBindView()).ivPrev);
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_image_show;
    }
}
