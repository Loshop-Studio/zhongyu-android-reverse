package p283w1;

import android.animation.ValueAnimator;
import android.content.DialogInterface;

/* renamed from: w1.a */
/* loaded from: classes4.dex */
public class C10272a extends ValueAnimator {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0014: INVOKE 
      (r3v0 ?? I:com.tencent.smtt.audio.core.utils.TbsDialogBase$Builder)
      (r7v0 ?? I:java.lang.CharSequence)
      (r8 I:android.content.DialogInterface$OnClickListener)
     VIRTUAL call: com.tencent.smtt.audio.core.utils.TbsDialogBase.Builder.setPositiveButton(java.lang.CharSequence, android.content.DialogInterface$OnClickListener):com.tencent.smtt.audio.core.utils.TbsDialogBase$Builder A[MD:(java.lang.CharSequence, android.content.DialogInterface$OnClickListener):com.tencent.smtt.audio.core.utils.TbsDialogBase$Builder (m)] (LINE:21), block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener, float[]] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.tencent.smtt.audio.core.db.ApnHelper, x1.a] */
    public C10272a(long j10, float f10, long j11) {
        DialogInterface.OnClickListener positiveButton;
        ?? r02 = {1065353216, f10};
        setFloatValues(r02);
        setDuration(j10);
        setPositiveButton(j11, positiveButton);
        super(r02);
    }
}
