package com.zykj.mistake.feature.notebook.detail;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Messenger;
import android.support.v4.media.AbstractC0037f;
import android.view.C2764i;
import android.view.SavedStateHandle;
import android.view.compose.C2750a;
import android.view.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.navigation.serialization.C2872b;
import com.blankj.utilcode.util.AbstractC3382c;
import com.blankj.utilcode.util.AbstractC3385e;
import com.blankj.utilcode.util.AbstractC3386f;
import com.zykj.mistake.activity.MainActivity;
import com.zykj.mistake.activity.MistakeCreateOrEditActivity;
import com.zykj.mistake.activity.SketchActivity;
import com.zykj.mistake.activity.SketchPlayerActivity;
import com.zykj.mistake.dialog.AnswerDialogFragment;
import com.zykj.mistake.dialog.ImageDialogFragment;
import com.zykj.mistake.dialog.PictureNoteDeleteDialogFragment;
import com.zykj.mistake.entity.EditMistakeData;
import com.zykj.mistake.feature.ask.C4515c0;
import com.zykj.mistake.feature.ask.C4520f;
import com.zykj.mistake.feature.ask.C4534m;
import com.zykj.mistake.feature.ask.C4548x;
import com.zykj.mistake.feature.ask.MistakeAskMaterialContract$MaterialType;
import com.zykj.mistake.feature.ask.MistakeAskMaterialContract$SourceType;
import com.zykj.mistake.main.C5054j0;
import com.zykj.mistake.main.C5056k0;
import com.zykj.mistake.main.C5061m0;
import com.zykj.mistake.main.C5065o0;
import com.zykj.mistake.main.C5073s0;
import com.zykj.mistake.main.C5085y0;
import com.zykj.mistake.main.MainShellViewModel;
import com.zykj.mistake.main.RemoveDialogTarget;
import com.zykj.mistake.utils.C5102g;
import com.zykj.view.utils.ImagePicker;
import io.reactivex.internal.operators.observable.C5707c;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.flow.AbstractC5914h;
import kotlinx.coroutines.flow.C5904c;
import p045d6.C5443s;
import p054e7.C5488t;
import p073h4.AbstractC5625a;
import p075h6.InterfaceC5631c;
import p106l4.DialogC6053d;
import p125n7.C6237l;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;
import p167t4.C6592e;
import p191w4.InterfaceC6718c;
import p212z4.C6818e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1", m5303f = "MistakeDetailEffectHandler.kt", m5304i = {}, m5305l = {110}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
final class MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ C6818e $detailEnvironment;
    final /* synthetic */ String $imageLocalPath;
    final /* synthetic */ C6592e $mainNavController;
    final /* synthetic */ InterfaceC6718c $platformBridge;
    final /* synthetic */ MainShellViewModel $shellViewModel;
    final /* synthetic */ Messenger $uploadMessenger;
    final /* synthetic */ MistakeDetailNewViewModel $viewModel;
    int label;

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lcom/zykj/mistake/feature/notebook/detail/k1;", "effect", "Ld6/s;", "<anonymous>", "(Lcom/zykj/mistake/feature/notebook/detail/k1;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1", m5303f = "MistakeDetailEffectHandler.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.mistake.feature.notebook.detail.MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1$1 */
    public static final class C47461 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ C6818e $detailEnvironment;
        final /* synthetic */ String $imageLocalPath;
        final /* synthetic */ C6592e $mainNavController;
        final /* synthetic */ InterfaceC6718c $platformBridge;
        final /* synthetic */ MainShellViewModel $shellViewModel;
        final /* synthetic */ Messenger $uploadMessenger;
        final /* synthetic */ MistakeDetailNewViewModel $viewModel;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47461(C6592e c6592e, MainShellViewModel mainShellViewModel, MistakeDetailNewViewModel mistakeDetailNewViewModel, C6818e c6818e, InterfaceC6718c interfaceC6718c, String str, Messenger messenger, InterfaceC5631c<? super C47461> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$mainNavController = c6592e;
            this.$shellViewModel = mainShellViewModel;
            this.$viewModel = mistakeDetailNewViewModel;
            this.$detailEnvironment = c6818e;
            this.$platformBridge = interfaceC6718c;
            this.$imageLocalPath = str;
            this.$uploadMessenger = messenger;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C47461 c47461 = new C47461(this.$mainNavController, this.$shellViewModel, this.$viewModel, this.$detailEnvironment, this.$platformBridge, this.$imageLocalPath, this.$uploadMessenger, interfaceC5631c);
            c47461.L$0 = obj;
            return c47461;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(AbstractC4823k1 abstractC4823k1, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C47461) create(abstractC4823k1, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v18, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r12v6, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Iterable] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            ?? arrayList;
            final AbstractC4823k1 abstractC4823k1 = (AbstractC4823k1) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            if (abstractC4823k1 instanceof C4864r0) {
                C4864r0 c4864r0 = (C4864r0) abstractC4823k1;
                boolean z8 = c4864r0.f7278a;
                boolean z9 = c4864r0.f7280c;
                if (z8) {
                    SavedStateHandle savedStateHandleM6223b = this.$mainNavController.m6223b();
                    if (savedStateHandleM6223b != null) {
                        savedStateHandleM6223b.set("nav_result_refresh_notebook", Boolean.TRUE);
                    }
                    this.$mainNavController.m6222a(Boolean.TRUE, "nav_result_collection_detail_refresh_after_practice");
                }
                Integer num = c4864r0.f7279b;
                if (num != null) {
                    C6592e c6592e = this.$mainNavController;
                    int iIntValue = num.intValue();
                    c6592e.m6222a(Boolean.valueOf(z9), "nav_result_notebook_removed_item_is_mastered");
                    c6592e.m6222a(new Integer(iIntValue), "nav_result_notebook_removed_item_id");
                    c6592e.m6222a(Boolean.valueOf(z9), "nav_result_collection_removed_item_is_mastered");
                    c6592e.m6222a(new Integer(iIntValue), "nav_result_collection_removed_item_id");
                }
                this.$mainNavController.f11003a.popBackStack();
            } else if (abstractC4823k1 instanceof C4767b1) {
                this.$shellViewModel.m4354b(new C5065o0(((C4767b1) abstractC4823k1).f6921a, ((C4837m3) this.$viewModel.f6877f.f9347a.getValue()).f7178s));
            } else if (abstractC4823k1 instanceof C4781d1) {
                this.$shellViewModel.m4354b(new C5073s0(((C4781d1) abstractC4823k1).f6960a));
            } else if (AbstractC5830k.m5325b(abstractC4823k1, C4882u0.f7335a)) {
                this.$shellViewModel.m4354b(C5054j0.f7926a);
            } else if (AbstractC5830k.m5325b(abstractC4823k1, C4888v0.f7355a)) {
                this.$shellViewModel.m4354b(C5056k0.f7927a);
            } else if (AbstractC5830k.m5325b(abstractC4823k1, C4894w0.f7381a)) {
                C4837m3 c4837m3 = (C4837m3) this.$viewModel.f6877f.f9347a.getValue();
                C6818e c6818e = this.$detailEnvironment;
                long j7 = c4837m3.f7149b;
                long j8 = c4837m3.f7151c;
                float f = AbstractC4874s4.f7299a;
                EditMistakeData editMistakeData = new EditMistakeData(j7, j8, c4837m3.f7165j, c4837m3.f7174o, c4837m3.f7169l, c4837m3.f7171m, c4837m3.f7173n);
                boolean z10 = c4837m3.f7175p;
                C2872b c2872b = new C2872b(this.$viewModel, 3);
                c6818e.getClass();
                c6818e.f11551f = c2872b;
                ActivityResultLauncher activityResultLauncher = c6818e.f11550e;
                Intent intent = new Intent(c6818e.f11546a, (Class<?>) MistakeCreateOrEditActivity.class);
                intent.putExtra("isCustomMistake", z10);
                intent.putExtra("editMistakeData", AbstractC3386f.m2337a().m2787f(editMistakeData));
                activityResultLauncher.launch(intent);
            } else if (AbstractC5830k.m5325b(abstractC4823k1, C4811i1.f7026a)) {
                this.$shellViewModel.m4354b(new C5085y0(RemoveDialogTarget.DETAIL));
            } else if (abstractC4823k1 instanceof C4787e1) {
                this.$shellViewModel.m4354b(C5061m0.f7932a);
                C4837m3 c4837m32 = (C4837m3) this.$viewModel.f6877f.f9347a.getValue();
                this.$mainNavController.m6222a(Boolean.valueOf(c4837m32.f7184y), "nav_result_notebook_removed_item_is_mastered");
                C4787e1 c4787e1 = (C4787e1) abstractC4823k1;
                this.$mainNavController.m6222a(new Integer(c4787e1.f6977a), "nav_result_notebook_removed_item_id");
                this.$mainNavController.m6222a(Boolean.valueOf(c4837m32.f7184y), "nav_result_collection_removed_item_is_mastered");
                this.$mainNavController.m6222a(new Integer(c4787e1.f6977a), "nav_result_collection_removed_item_id");
                this.$mainNavController.f11003a.popBackStack();
            } else if (abstractC4823k1 instanceof C4817j1) {
                ((MainActivity) this.$platformBridge).m3907b(((C4817j1) abstractC4823k1).f7036a);
            } else if (AbstractC5830k.m5325b(abstractC4823k1, C4805h1.f7013a)) {
                ((MainActivity) this.$platformBridge).m3909d(false);
            } else if (AbstractC5830k.m5325b(abstractC4823k1, C4900x0.f7400a)) {
                ((MainActivity) this.$platformBridge).m3908c();
            } else if (AbstractC5830k.m5325b(abstractC4823k1, C4876t0.f7302a)) {
                this.$shellViewModel.f7816h = true;
                this.$mainNavController.m6222a(Boolean.TRUE, "nav_result_collection_detail_refresh_after_collection_change");
            } else if (AbstractC5830k.m5325b(abstractC4823k1, C4793f1.f6986a)) {
                this.$shellViewModel.f7817i = true;
            } else {
                int i = 0;
                if (abstractC4823k1 instanceof C4799g1) {
                    AnswerDialogFragment answerDialogFragment = new AnswerDialogFragment();
                    MainActivity mainActivity = this.$detailEnvironment.f11546a;
                    C4799g1 c4799g1 = (C4799g1) abstractC4823k1;
                    String str2 = c4799g1.f6998a;
                    String str3 = c4799g1.f6999b;
                    answerDialogFragment.m3986l(mainActivity, str2, str3, (str2 == null || str2.length() == 0 || str3 == null || str3.length() == 0) ? false : true);
                } else if (abstractC4823k1 instanceof C4912z0) {
                    int i8 = SketchPlayerActivity.f5871g;
                    C4912z0 c4912z0 = (C4912z0) abstractC4823k1;
                    C5707c.m5080o(this.$detailEnvironment.f11546a, c4912z0.f7424a, c4912z0.f7425b, c4912z0.f7426c);
                } else if (abstractC4823k1 instanceof C4906y0) {
                    int i9 = SketchActivity.f5853v;
                    MainActivity mainActivity2 = this.$detailEnvironment.f11546a;
                    C4906y0 c4906y0 = (C4906y0) abstractC4823k1;
                    long j9 = c4906y0.f7407a;
                    boolean z11 = c4906y0.f7408b;
                    String str4 = c4906y0.f7409c;
                    String str5 = c4906y0.f7410d;
                    ArrayList<String> arrayList2 = new ArrayList<>(c4906y0.f7411e);
                    ArrayList<String> arrayList3 = new ArrayList<>(c4906y0.f7412f);
                    ArrayList<String> arrayList4 = new ArrayList<>(c4906y0.f7413g);
                    Bundle bundle = new Bundle();
                    bundle.putLong("itemId", j9);
                    bundle.putBoolean("canOpenCamera", z11);
                    if (str4 != null) {
                        bundle.putString("noteUrl", str4);
                    }
                    if (str5 != null) {
                        bundle.putString("stemUrl", str5);
                    }
                    bundle.putStringArrayList("stemPathList", arrayList2);
                    bundle.putStringArrayList("answerPathList", arrayList3);
                    bundle.putStringArrayList("revisedAnswerPathList", arrayList4);
                    Intent intent2 = new Intent(mainActivity2, (Class<?>) SketchActivity.class);
                    intent2.putExtras(bundle);
                    mainActivity2.startActivity(intent2);
                } else if (AbstractC5830k.m5325b(abstractC4823k1, C4870s0.f7292a)) {
                    MainActivity mainActivity3 = this.$detailEnvironment.f11546a;
                    InterfaceC6718c platformBridge = this.$platformBridge;
                    C6592e mainNavController = this.$mainNavController;
                    C4837m3 detailState = (C4837m3) this.$viewModel.f6877f.f9347a.getValue();
                    MistakeDetailNewViewModel mistakeDetailNewViewModel = this.$viewModel;
                    AbstractC5830k.m5330g(platformBridge, "platformBridge");
                    AbstractC5830k.m5330g(mainNavController, "mainNavController");
                    AbstractC5830k.m5330g(detailState, "detailState");
                    PackageManager packageManager = mainActivity3.getPackageManager();
                    AbstractC5830k.m5329f(packageManager, "getPackageManager(...)");
                    Intent intent3 = new Intent("com.zykj.dialogue.ask");
                    intent3.addCategory("android.intent.category.DEFAULT");
                    intent3.setDataAndType(Uri.parse("http://www.zykj.dialogue.ask/"), "share/file");
                    intent3.putExtra("fromOtherApp", true);
                    if (intent3.resolveActivity(packageManager) != null) {
                        C4825k3 c4825k3 = detailState.f7129I;
                        C4843n3 c4843n3 = detailState.f7128H;
                        List list = detailState.f7125E;
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj2 : list) {
                            if (((C4846o0) obj2).f7216b == MistakeDetailNewContract$AnswerDisplayType.IMAGE) {
                                arrayList5.add(obj2);
                            }
                        }
                        ListBuilder listBuilderM5278q = AbstractC5806u.m5278q();
                        ListBuilder listBuilderM5278q2 = AbstractC5806u.m5278q();
                        C4858q0 c4858q0 = detailState.f7130J;
                        String str6 = c4858q0.f7265e;
                        String str7 = c4858q0.f7261a;
                        if (str6 == null) {
                            str6 = "";
                        }
                        String str8 = str6;
                        if (AbstractC5855p.m5382P(str8)) {
                            str = str8;
                            if (str7 != null && !AbstractC5855p.m5382P(str7)) {
                                listBuilderM5278q2.add(new C4548x("stem_web_0", "题干1", MistakeAskMaterialContract$SourceType.WEB, (String) null, str7, (C4515c0) null, 40));
                            }
                        } else {
                            str = str8;
                            listBuilderM5278q2.add(new C4548x("stem_snapshot_0", "题干1", MistakeAskMaterialContract$SourceType.IMAGE, str8, (String) null, (C4515c0) null, 48));
                        }
                        if (AbstractC5855p.m5382P(str)) {
                            Collection collectionM5286y = c4858q0.f7262b;
                            if (collectionM5286y.isEmpty()) {
                                String str9 = detailState.f7169l;
                                if (AbstractC5855p.m5382P(str9)) {
                                    str9 = null;
                                }
                                collectionM5286y = str9 != null ? AbstractC5806u.m5286y(str9) : EmptyList.INSTANCE;
                            }
                            arrayList = new ArrayList();
                            for (Object obj3 : collectionM5286y) {
                                if (!AbstractC5855p.m5382P((String) obj3)) {
                                    arrayList.add(obj3);
                                }
                            }
                        } else {
                            arrayList = EmptyList.INSTANCE;
                        }
                        int i10 = 0;
                        for (Object obj4 : arrayList) {
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                AbstractC5806u.m5258L();
                                throw null;
                            }
                            listBuilderM5278q2.add(new C4548x(AbstractC0037f.m81f(i10, "stem_"), AbstractC0037f.m81f(i11, "题干"), MistakeAskMaterialContract$SourceType.IMAGE, (String) obj4, (String) null, (C4515c0) null, 48));
                            i10 = i11;
                        }
                        List listBuild = listBuilderM5278q2.build();
                        if (!listBuild.isEmpty()) {
                            listBuilderM5278q.add(new C4534m(MistakeAskMaterialContract$MaterialType.STEM, listBuild));
                        }
                        AbstractC5625a.m4941a(listBuilderM5278q, MistakeAskMaterialContract$MaterialType.ORIGINAL_ANSWER, arrayList5, detailState.f7123C, new C6237l(25), new C6237l(26));
                        AbstractC5625a.m4941a(listBuilderM5278q, MistakeAskMaterialContract$MaterialType.REVISED_ANSWER, arrayList5, detailState.f7123C, new C6237l(27), new C6237l(28));
                        AbstractC5625a.m4942b(listBuilderM5278q, MistakeAskMaterialContract$MaterialType.TYPICAL_RIGHT, c4843n3.f7202d, new C5488t(12));
                        AbstractC5625a.m4942b(listBuilderM5278q, MistakeAskMaterialContract$MaterialType.TYPICAL_ERROR, c4843n3.f7203e, new C5488t(13));
                        String str10 = c4825k3.f7079c;
                        if (str10 != null) {
                            String str11 = !AbstractC5855p.m5382P(str10) ? str10 : null;
                            if (str11 != null) {
                                listBuilderM5278q.add(new C4534m(MistakeAskMaterialContract$MaterialType.BOARD_NOTE, AbstractC5806u.m5286y(new C4548x("board_note_0", "", MistakeAskMaterialContract$SourceType.IMAGE, str11, (String) null, (C4515c0) null, 48))));
                            }
                        }
                        List list2 = c4825k3.f7081e;
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj5 : list2) {
                            if (!AbstractC5855p.m5382P((String) obj5)) {
                                arrayList6.add(obj5);
                            }
                        }
                        ArrayList arrayList7 = new ArrayList(AbstractC5806u.m5277p(arrayList6, 10));
                        int size = arrayList6.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj6 = arrayList6.get(i12);
                            i12++;
                            int i13 = i + 1;
                            if (i < 0) {
                                AbstractC5806u.m5258L();
                                throw null;
                            }
                            arrayList7.add(new C4548x(AbstractC0037f.m81f(i, "picture_note_"), AbstractC0037f.m81f(i13, "图片"), MistakeAskMaterialContract$SourceType.IMAGE, (String) obj6, (String) null, (C4515c0) null, 48));
                            i = i13;
                        }
                        if (!arrayList7.isEmpty()) {
                            listBuilderM5278q.add(new C4534m(MistakeAskMaterialContract$MaterialType.PICTURE_NOTE, arrayList7));
                        }
                        List listBuild2 = listBuilderM5278q.build();
                        C4520f c4520f = new C4520f(listBuild2);
                        if (listBuild2.isEmpty()) {
                            ((MainActivity) platformBridge).m3907b("暂无可提问素材");
                        } else {
                            Iterator it = listBuild2.iterator();
                            while (it.hasNext()) {
                                if (!((C4534m) it.next()).f6269b.isEmpty()) {
                                    mistakeDetailNewViewModel.m4162t(C4836m2.f7120a);
                                    NavController.navigate$default(mainNavController.f11003a, c4520f, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                                    break;
                                }
                            }
                            ((MainActivity) platformBridge).m3907b("暂无可提问素材");
                        }
                    } else {
                        ((MainActivity) platformBridge).m3907b("未检测到随身答应用，无法提问");
                    }
                } else if (AbstractC5830k.m5325b(abstractC4823k1, C4760a1.f6886a)) {
                    final C6818e c6818e2 = this.$detailEnvironment;
                    C5102g c5102g = c6818e2.f11547b;
                    final MistakeDetailNewViewModel mistakeDetailNewViewModel2 = this.$viewModel;
                    final String str12 = this.$imageLocalPath;
                    final InterfaceC6718c interfaceC6718c = this.$platformBridge;
                    final Messenger messenger = this.$uploadMessenger;
                    c5102g.m4465a(new InterfaceC6469a() { // from class: com.zykj.mistake.feature.notebook.detail.i0
                        @Override // p152r6.InterfaceC6469a
                        public final Object invoke() {
                            boolean z12 = ((C4837m3) mistakeDetailNewViewModel2.f6877f.f9347a.getValue()).f7129I.f7082f;
                            C6818e c6818e3 = c6818e2;
                            if (z12) {
                                ImagePicker imagePicker = c6818e3.f11548c;
                                MainActivity mainActivity4 = c6818e3.f11546a;
                                File file = new File(str12, System.currentTimeMillis() + ".jpg");
                                AbstractC3385e.m2332d(file);
                                Uri uriM2302c = AbstractC3382c.m2302c(file);
                                AbstractC5830k.m5329f(uriM2302c, "file2Uri(...)");
                                imagePicker.startSystemCamera(uriM2302c, true, new C4804h0(interfaceC6718c, mainActivity4, messenger, 0));
                            } else {
                                DialogC6053d dialogC6053d = c6818e3.f11549d;
                                if (dialogC6053d != null) {
                                    dialogC6053d.show();
                                }
                            }
                            return C5443s.f8405a;
                        }
                    }, new C2764i(c6818e2, interfaceC6718c, 9, messenger));
                } else {
                    if (!(abstractC4823k1 instanceof C4774c1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    final ImageDialogFragment imageDialogFragment = new ImageDialogFragment();
                    final C6818e c6818e3 = this.$detailEnvironment;
                    MainActivity mainActivity4 = c6818e3.f11546a;
                    String str13 = ((C4774c1) abstractC4823k1).f6939a;
                    final MistakeDetailNewViewModel mistakeDetailNewViewModel3 = this.$viewModel;
                    imageDialogFragment.m3989l(mainActivity4, str13, new InterfaceC6469a() { // from class: com.zykj.mistake.feature.notebook.detail.j0
                        @Override // p152r6.InterfaceC6469a
                        public final Object invoke() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
                            PictureNoteDeleteDialogFragment pictureNoteDeleteDialogFragment = new PictureNoteDeleteDialogFragment();
                            MainActivity mainActivity5 = c6818e3.f11546a;
                            pictureNoteDeleteDialogFragment.f6178c = new C2750a(mistakeDetailNewViewModel3, abstractC4823k1, 4, imageDialogFragment);
                            FragmentManager supportFragmentManager = mainActivity5.getSupportFragmentManager();
                            AbstractC5830k.m5329f(supportFragmentManager, "getSupportFragmentManager(...)");
                            pictureNoteDeleteDialogFragment.m3988k(supportFragmentManager);
                            return C5443s.f8405a;
                        }
                    });
                }
            }
            return C5443s.f8405a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1(MistakeDetailNewViewModel mistakeDetailNewViewModel, C6592e c6592e, MainShellViewModel mainShellViewModel, C6818e c6818e, InterfaceC6718c interfaceC6718c, String str, Messenger messenger, InterfaceC5631c<? super MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$viewModel = mistakeDetailNewViewModel;
        this.$mainNavController = c6592e;
        this.$shellViewModel = mainShellViewModel;
        this.$detailEnvironment = c6818e;
        this.$platformBridge = interfaceC6718c;
        this.$imageLocalPath = str;
        this.$uploadMessenger = messenger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1(this.$viewModel, this.$mainNavController, this.$shellViewModel, this.$detailEnvironment, this.$platformBridge, this.$imageLocalPath, this.$uploadMessenger, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            MistakeDetailNewViewModel mistakeDetailNewViewModel = this.$viewModel;
            C5904c c5904c = mistakeDetailNewViewModel.f6879h;
            C47461 c47461 = new C47461(this.$mainNavController, this.$shellViewModel, mistakeDetailNewViewModel, this.$detailEnvironment, this.$platformBridge, this.$imageLocalPath, this.$uploadMessenger, null);
            this.label = 1;
            if (AbstractC5914h.m5552h(c5904c, c47461, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
        }
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((MistakeDetailEffectHandlerKt$MistakeDetailEffectHandler$3$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
