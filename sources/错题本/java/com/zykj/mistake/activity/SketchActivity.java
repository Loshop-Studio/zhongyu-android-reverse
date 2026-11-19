package com.zykj.mistake.activity;

import android.view.C2766k;
import android.view.KeyEvent;
import android.view.result.ActivityResultLauncher;
import android.view.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertDialog;
import androidx.camera.core.impl.utils.RunnableC0377a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.R;
import com.zykj.mistake.base.BaseMVPActivity;
import com.zykj.mistake.databinding.ActivitySketchBinding;
import com.zykj.mistake.dialog.WebViewShotDialog;
import com.zykj.mistake.entity.req.SetNoteReq;
import com.zykj.mistake.presenter.SketchPresenter;
import com.zykj.mistake.utils.C5103h;
import com.zykj.view.board.board.BoardFragment;
import com.zykj.view.utils.ImagePicker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import p106l4.C6060k;
import p106l4.DialogC6053d;
import p152r6.InterfaceC6469a;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m5110d2 = {"Lcom/zykj/mistake/activity/SketchActivity;", "Lcom/zykj/mistake/base/BaseMVPActivity;", "Lcom/zykj/mistake/presenter/SketchPresenter;", "Lcom/zykj/mistake/databinding/ActivitySketchBinding;", "", "<init>", "()V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSketchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SketchActivity.kt\ncom/zykj/mistake/activity/SketchActivity\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,612:1\n3829#2:613\n4344#2,2:614\n1869#3,2:616\n1869#3,2:618\n*S KotlinDebug\n*F\n+ 1 SketchActivity.kt\ncom/zykj/mistake/activity/SketchActivity\n*L\n353#1:613\n353#1:614,2\n357#1:616,2\n478#1:618,2\n*E\n"})
/* loaded from: classes3.dex */
public final class SketchActivity extends BaseMVPActivity<SketchPresenter, ActivitySketchBinding> {

    /* renamed from: v */
    public static final /* synthetic */ int f5853v = 0;

    /* renamed from: e */
    public long f5854e;

    /* renamed from: f */
    public String f5855f;

    /* renamed from: g */
    public ArrayList f5856g;

    /* renamed from: h */
    public ArrayList f5857h;

    /* renamed from: i */
    public ArrayList f5858i;

    /* renamed from: j */
    public BoardFragment f5859j;

    /* renamed from: k */
    public C5103h f5860k;

    /* renamed from: l */
    public AlertDialog f5861l;

    /* renamed from: m */
    public C6060k f5862m;

    /* renamed from: n */
    public WebViewShotDialog f5863n;

    /* renamed from: p */
    public String f5865p;

    /* renamed from: q */
    public boolean f5866q;

    /* renamed from: s */
    public boolean f5868s;

    /* renamed from: t */
    public DialogC6053d f5869t;

    /* renamed from: o */
    public final SetNoteReq f5864o = new SetNoteReq();

    /* renamed from: r */
    public final ImagePicker f5867r = new ImagePicker(null, this, 1, 0 == true ? 1 : 0);

    /* renamed from: u */
    public final ActivityResultLauncher f5870u = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new C4482r(this));

    @Override // com.zykj.mistake.base.BaseActivity
    /* renamed from: o */
    public final int mo3905o() {
        return R.layout.activity_sketch;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        AbstractC5830k.m5327d(keyEvent);
        if (keyEvent.getKeyCode() != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        String str = this.f5865p;
        if (str != null) {
            m3945w(str, new C2766k(12));
            return true;
        }
        AbstractC5830k.m5339p("mUploadDataPath");
        throw null;
    }

    @Override // com.zykj.mistake.base.BaseActivity
    /* renamed from: q */
    public final void mo3906q() {
        ((ActivitySketchBinding) m3957p()).f6087a.setOnClickListener(new ViewOnClickListenerC4474j(this, 5));
        this.f5869t = new DialogC6053d(this);
    }

    @Override // com.zykj.mistake.base.BaseMVPActivity
    /* renamed from: s */
    public final Class mo3916s() {
        return SketchPresenter.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0180  */
    @Override // com.zykj.mistake.base.BaseMVPActivity
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo3917t() {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.activity.SketchActivity.mo3917t():void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/activity/SketchActivity.smali:327
    }

    /* renamed from: u */
    public final void m3943u(List list) {
        mo3964d(true);
        new Thread(new RunnableC0377a(11, list, this)).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cb  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3944v() {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.activity.SketchActivity.m3944v():void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/activity/SketchActivity.smali:1495
    }

    /* renamed from: w */
    public final void m3945w(String str, InterfaceC6469a interfaceC6469a) {
        mo3964d(false);
        this.f5866q = false;
        BoardFragment boardFragment = this.f5859j;
        if (boardFragment != null) {
            BoardFragment.getSavePath$default(boardFragment, false, false, null, new SketchActivity$saveData$2(this, interfaceC6469a, str, null), 7, null);
        } else {
            AbstractC5830k.m5339p("mSketchFragment");
            throw null;
        }
    }
}
