package com.zykj.cloudhelper.dialog;

import android.text.Editable;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blankj.utilcode.util.KeyboardUtils;
import com.friday.common.R$string;
import com.zykj.cloudhelper.R$layout;
import com.zykj.cloudhelper.databinding.NoteHelperCreateFolderBinding;
import com.zykj.cloudhelper.dialog.CreateFolderDialogFragment;
import com.zykj.cloudhelper.viewmodel.PickNoteViewModel;
import kotlin.jvm.internal.AbstractC9983y;
import kotlin.text.Regex;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10773d;
import p310qd.AbstractC10793c0;
import p429z1.AbstractC11958b;

@StabilityInferred(parameters = 0)
/* loaded from: classes6.dex */
public final class CreateFolderDialogFragment extends Hilt_CreateFolderDialogFragment<NoteHelperCreateFolderBinding> {

    /* renamed from: k */
    public final InterfaceC10773d f19497k;

    public CreateFolderDialogFragment() {
        final InterfaceC9529a interfaceC9529a = null;
        this.f19497k = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9983y.m20315b(PickNoteViewModel.class), new InterfaceC9529a() { // from class: com.zykj.cloudhelper.dialog.CreateFolderDialogFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.zykj.cloudhelper.dialog.CreateFolderDialogFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC9529a interfaceC9529a2 = interfaceC9529a;
                return (interfaceC9529a2 == null || (creationExtras = (CreationExtras) interfaceC9529a2.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new InterfaceC9529a() { // from class: com.zykj.cloudhelper.dialog.CreateFolderDialogFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    /* renamed from: u */
    public static final void m16426u(CreateFolderDialogFragment createFolderDialogFragment, View view) {
        createFolderDialogFragment.dismissAllowingStateLoss();
    }

    /* renamed from: v */
    public static final void m16427v(CreateFolderDialogFragment createFolderDialogFragment, View view) {
        String string;
        CharSequence charSequenceM23129e1;
        Editable text = ((NoteHelperCreateFolderBinding) createFolderDialogFragment.getMBinding()).f19489c.getText();
        if (text == null || (charSequenceM23129e1 = AbstractC10793c0.m23129e1(text)) == null || (string = charSequenceM23129e1.toString()) == null) {
            string = "";
        }
        if (string.length() == 0) {
            AbstractC11958b.m26588i("文件名不能为空");
        } else if (!new Regex("^([\\u4e00-\\u9fa5a-zA-Z0-9\"\\s\\.\\/\\“\\”\\_\\（\\）\\(\\)\\【\\】])+$").m20341g(string)) {
            AbstractC11958b.m26587h(R$string.name_content_rule);
        } else {
            createFolderDialogFragment.m16428t().m16487p().setValue(string);
            createFolderDialogFragment.dismissAllowingStateLoss();
        }
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.note_helper_create_folder;
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        ((NoteHelperCreateFolderBinding) getMBinding()).f19491e.setOnClickListener(new View.OnClickListener() { // from class: ta.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateFolderDialogFragment.m16426u(this.f27069c, view);
            }
        });
        ((NoteHelperCreateFolderBinding) getMBinding()).f19492f.setOnClickListener(new View.OnClickListener() { // from class: ta.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateFolderDialogFragment.m16427v(this.f27070c, view);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            KeyboardUtils.hideSoftInput(activity.getWindow());
        }
        super.onDestroy();
    }

    /* renamed from: t */
    public final PickNoteViewModel m16428t() {
        return (PickNoteViewModel) this.f19497k.getValue();
    }
}
