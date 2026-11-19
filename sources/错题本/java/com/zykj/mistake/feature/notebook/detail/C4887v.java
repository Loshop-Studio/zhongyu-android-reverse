package com.zykj.mistake.feature.notebook.detail;

import android.app.Activity;
import android.app.ProgressDialog;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import com.zykj.mistake.entity.resp.CustomTagInfo;
import com.zykj.mistake.entity.resp.GetMyTagResp;
import com.zykj.view.board.crop.BlackboardCropFragment;
import com.zykj.view.simpleBoard.SimpleBoardView;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p169t6.AbstractC6600a;

/* renamed from: com.zykj.mistake.feature.notebook.detail.v */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4887v implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f7352a;

    /* renamed from: b */
    public final /* synthetic */ boolean f7353b;

    /* renamed from: c */
    public final /* synthetic */ Object f7354c;

    public /* synthetic */ C4887v(Object obj, boolean z8, int i) {
        this.f7352a = i;
        this.f7354c = obj;
        this.f7353b = z8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        final ProgressDialog progressDialogShow;
        switch (this.f7352a) {
            case 0:
                final C4764a5 c4764a5 = (C4764a5) this.f7354c;
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                AbstractC5830k.m5330g(DisposableEffect, "$this$DisposableEffect");
                final boolean z8 = this.f7353b;
                return new DisposableEffectResult() { // from class: com.zykj.mistake.feature.notebook.detail.MistakeDetailDraftPanelKt$MistakeDraftSketchView$lambda$65$lambda$64$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        C4764a5 c4764a52 = c4764a5;
                        if (z8) {
                            c4764a52.m4170f();
                        } else {
                            boolean z9 = c4764a52.f6909p;
                            c4764a52.f6909p = true;
                            try {
                                SimpleBoardView simpleBoardView = c4764a52.f6894a;
                                if (simpleBoardView != null) {
                                    simpleBoardView.clean();
                                }
                            } finally {
                                c4764a52.f6909p = z9;
                            }
                        }
                        c4764a52.m4169e();
                        FrameLayout frameLayout = c4764a52.f6895b;
                        if (frameLayout != null) {
                            frameLayout.removeAllViews();
                        }
                        c4764a52.f6895b = null;
                        SimpleBoardView simpleBoardView2 = c4764a52.f6894a;
                        if (simpleBoardView2 != null) {
                            simpleBoardView2.setOnActionListener(null);
                        }
                        c4764a52.f6894a = null;
                        c4764a52.f6908o = false;
                        c4764a52.f6904k = null;
                        c4764a52.f6906m = null;
                        c4764a52.f6907n = null;
                    }
                };
            case 1:
                MistakeDetailNewViewModel mistakeDetailNewViewModel = (MistakeDetailNewViewModel) this.f7354c;
                GetMyTagResp resp = (GetMyTagResp) obj;
                AbstractC5830k.m5330g(resp, "resp");
                List<CustomTagInfo> result = resp.getResult();
                if (result == null) {
                    result = EmptyList.INSTANCE;
                }
                mistakeDetailNewViewModel.m4144S(this.f7353b ? new C4767b1(result) : new C4781d1(result));
                return C5443s.f8405a;
            case 2:
                MutableState mutableState = (MutableState) this.f7354c;
                Density offset = (Density) obj;
                AbstractC5830k.m5330g(offset, "$this$offset");
                return IntOffset.m13424boximpl(IntOffset.m13427constructorimpl((0 & 4294967295L) | ((this.f7353b ? AbstractC6600a.m6241q(((Number) mutableState.getValue()).floatValue()) : 0) << 32)));
            case 3:
                return BlackboardCropFragment.initView$lambda$10$lambda$9$lambda$8((BlackboardCropFragment) this.f7354c, this.f7353b, (String) obj);
            default:
                Activity activity = (Activity) this.f7354c;
                DisposableEffectScope DisposableEffect2 = (DisposableEffectScope) obj;
                AbstractC5830k.m5330g(DisposableEffect2, "$this$DisposableEffect");
                if (!this.f7353b || activity == null) {
                    progressDialogShow = null;
                } else {
                    progressDialogShow = ProgressDialog.show(activity, "", "请稍候。", false, false);
                    Window window = progressDialogShow.getWindow();
                    if (window != null) {
                        window.setDimAmount(0.0f);
                        window.clearFlags(2);
                    }
                }
                return new DisposableEffectResult() { // from class: com.zykj.mistake.main.loading.AppLoadingOverlayKt$AppLoadingOverlay$lambda$5$lambda$4$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        ProgressDialog progressDialog = progressDialogShow;
                        if (progressDialog != null) {
                            progressDialog.dismiss();
                        }
                    }
                };
        }
    }

    public /* synthetic */ C4887v(boolean z8, Object obj, int i) {
        this.f7352a = i;
        this.f7353b = z8;
        this.f7354c = obj;
    }
}
