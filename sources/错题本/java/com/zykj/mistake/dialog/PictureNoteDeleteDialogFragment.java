package com.zykj.mistake.dialog;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.R;
import com.zykj.mistake.databinding.DialogFragmentPictureNoteDeleteBinding;
import com.zykj.mistake.dialog.PictureNoteDeleteDialogFragment;
import kotlin.Metadata;
import p152r6.InterfaceC6469a;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m5110d2 = {"Lcom/zykj/mistake/dialog/PictureNoteDeleteDialogFragment;", "Lcom/zykj/mistake/dialog/BaseDialogFragment;", "Lcom/zykj/mistake/databinding/DialogFragmentPictureNoteDeleteBinding;", "<init>", "()V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class PictureNoteDeleteDialogFragment extends BaseDialogFragment<DialogFragmentPictureNoteDeleteBinding> {

    /* renamed from: c */
    public InterfaceC6469a f6178c;

    @Override // com.zykj.mistake.dialog.BaseDialogFragment
    /* renamed from: e */
    public final int mo3981e() {
        return R.drawable.bg_top_year;
    }

    @Override // com.zykj.mistake.dialog.BaseDialogFragment
    /* renamed from: f */
    public final int mo3982f() {
        return -2;
    }

    @Override // com.zykj.mistake.dialog.BaseDialogFragment
    /* renamed from: g */
    public final int mo3983g() {
        return R.layout.dialog_fragment_picture_note_delete;
    }

    @Override // com.zykj.mistake.dialog.BaseDialogFragment
    /* renamed from: h */
    public final int mo3984h() {
        return -2;
    }

    @Override // com.zykj.mistake.dialog.BaseDialogFragment
    /* renamed from: j */
    public final void mo3985j(View view) {
        final int i = 0;
        ((DialogFragmentPictureNoteDeleteBinding) m3987i()).f6109a.setOnClickListener(new View.OnClickListener(this) { // from class: l4.j

            /* renamed from: b */
            public final /* synthetic */ PictureNoteDeleteDialogFragment f9660b;

            {
                this.f9660b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        this.f9660b.dismiss();
                        break;
                    default:
                        PictureNoteDeleteDialogFragment pictureNoteDeleteDialogFragment = this.f9660b;
                        pictureNoteDeleteDialogFragment.dismiss();
                        InterfaceC6469a interfaceC6469a = pictureNoteDeleteDialogFragment.f6178c;
                        if (interfaceC6469a != null) {
                            interfaceC6469a.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        final int i8 = 1;
        ((DialogFragmentPictureNoteDeleteBinding) m3987i()).f6110b.setOnClickListener(new View.OnClickListener(this) { // from class: l4.j

            /* renamed from: b */
            public final /* synthetic */ PictureNoteDeleteDialogFragment f9660b;

            {
                this.f9660b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i8) {
                    case 0:
                        this.f9660b.dismiss();
                        break;
                    default:
                        PictureNoteDeleteDialogFragment pictureNoteDeleteDialogFragment = this.f9660b;
                        pictureNoteDeleteDialogFragment.dismiss();
                        InterfaceC6469a interfaceC6469a = pictureNoteDeleteDialogFragment.f6178c;
                        if (interfaceC6469a != null) {
                            interfaceC6469a.invoke();
                            break;
                        }
                        break;
                }
            }
        });
    }
}
