package p106l4;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.zykj.mistake.databinding.DialogFragmentAnswerBinding;
import com.zykj.mistake.dialog.AnswerDialogFragment;
import com.zykj.mistake.utils.AbstractC5099d;
import com.zykj.mistake.widget.IntrinsicWidthImageView;
import p155s0.AbstractC6544c;

/* renamed from: l4.b */
/* loaded from: classes3.dex */
public final class C6051b extends AbstractC6544c {

    /* renamed from: d */
    public final /* synthetic */ AnswerDialogFragment f9642d;

    public C6051b(AnswerDialogFragment answerDialogFragment) {
        this.f9642d = answerDialogFragment;
    }

    @Override // p155s0.InterfaceC6550i
    /* renamed from: c */
    public final void mo2380c(Object obj) {
        Bitmap bitmapM4457g = (Bitmap) obj;
        AnswerDialogFragment answerDialogFragment = this.f9642d;
        IntrinsicWidthImageView intrinsicWidthImageView = ((DialogFragmentAnswerBinding) answerDialogFragment.m3987i()).f6100b;
        String str = answerDialogFragment.f6169c;
        intrinsicWidthImageView.setForceOrigin(str == null || str.length() == 0);
        IntrinsicWidthImageView intrinsicWidthImageView2 = ((DialogFragmentAnswerBinding) answerDialogFragment.m3987i()).f6100b;
        if (answerDialogFragment.f6171e) {
            bitmapM4457g = AbstractC5099d.m4457g(bitmapM4457g);
        }
        intrinsicWidthImageView2.setImageBitmap(bitmapM4457g);
    }

    @Override // p155s0.InterfaceC6550i
    /* renamed from: f */
    public final void mo5786f(Drawable drawable) {
    }
}
