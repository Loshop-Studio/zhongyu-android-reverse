package com.zykj.study.p065ui.home.p066my;

// RE note 本类字节码直接引用的读写或显示接口包括JSON、WebView。

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.NavDirections;
import androidx.navigation.fragment.FragmentKt;
import com.google.gson.Gson;
import com.xuexiang.xui.widget.actionbar.TitleBar;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import com.zykj.base.utils.XToastUtils;
import com.zykj.lib.p063ui.R$dimen;
import com.zykj.study.R$color;
import com.zykj.study.R$drawable;
import com.zykj.study.R$layout;
import com.zykj.study.R$string;
import com.zykj.study.adapter.GroupStatisticAdapter;
import com.zykj.study.bean.exercise.ExerciseBean;
import com.zykj.study.bean.exercise.ExerciseType;
import com.zykj.study.bean.exercise.GroupStatistic;
import com.zykj.study.bean.exercise.QuestionBean;
import com.zykj.study.databinding.DialogStatisticBinding;
import com.zykj.study.databinding.FragmentCourseContentBinding;
import com.zykj.study.p065ui.SuperPlayerActivity;
import com.zykj.study.p065ui.home.p066my.CourseContentFragment;
import com.zykj.study.view.CustomX5WebView;
import com.zykj.study.viewmodels.CourseContentViewModel;
import java.util.List;
import kotlin.AbstractC9078a;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONArray;
import p086e5.AbstractC8366o;
import p086e5.C8356e;
import p121h5.C8716c;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8807u;
import p135i8.AbstractC8839h;
import p135i8.C8843i0;
import p169l8.InterfaceC9270g;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class CourseContentFragment extends Hilt_CourseContentFragment<FragmentCourseContentBinding> {

    /* renamed from: f */
    public final NavArgsLazy f12808f = new NavArgsLazy(AbstractC9137y.m16154b(CourseContentFragmentArgs.class), new C7987a(this));

    /* renamed from: g */
    public final InterfaceC8724d f12809g;

    /* renamed from: h */
    public final InterfaceC8724d f12810h;

    /* renamed from: i */
    public InterfaceC9270g f12811i;

    public final class CourseDeauthorized {
        public CourseDeauthorized() {
        }

        @JavascriptInterface
        public final void courseDeauthorized() {
            LifecycleOwner viewLifecycleOwner = CourseContentFragment.this.getViewLifecycleOwner();
            AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new CourseContentFragment$CourseDeauthorized$courseDeauthorized$1(CourseContentFragment.this, null), 3, null);
        }
    }

    public final class JsToJava {

        /* renamed from: a */
        public final CourseContentFragmentArgs f12822a;

        /* renamed from: b */
        public final /* synthetic */ CourseContentFragment f12823b;

        public JsToJava(CourseContentFragment courseContentFragment, CourseContentFragmentArgs fragmentArgs) {
            AbstractC9133u.m16133g(fragmentArgs, "fragmentArgs");
            this.f12823b = courseContentFragment;
            this.f12822a = fragmentArgs;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* renamed from: b */
        public static final C8736p m11231b(String str, String str2, CourseContentFragment courseContentFragment, JsToJava jsToJava) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                switch (str2.hashCode()) {
                    case -1617968008:
                        if (!str2.equals("video_play")) {
                            break;
                        } else {
                            Intent intent = new Intent(courseContentFragment.getActivity(), (Class<?>) SuperPlayerActivity.class);
                            intent.putExtra("path", jSONArray.get(0).toString());
                            courseContentFragment.startActivity(intent);
                            break;
                        }
                    case -1561306964:
                        if (!str2.equals("exercise_view")) {
                            break;
                        } else {
                            LifecycleOwner viewLifecycleOwner = courseContentFragment.getViewLifecycleOwner();
                            AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                            AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), C8843i0.m14868c(), null, new CourseContentFragment$JsToJava$_callHandler$1$5(jSONArray, jsToJava, courseContentFragment, null), 2, null);
                            break;
                        }
                    case -366082135:
                        if (!str2.equals("exercise_statistic")) {
                            break;
                        } else if (!jsToJava.f12822a.m11242e()) {
                            LifecycleOwner viewLifecycleOwner2 = courseContentFragment.getViewLifecycleOwner();
                            AbstractC9133u.m16132f(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                            AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), C8843i0.m14868c(), null, new CourseContentFragment$JsToJava$_callHandler$1$4(jsToJava, jSONArray, courseContentFragment, null), 2, null);
                            break;
                        } else {
                            LifecycleOwner viewLifecycleOwner3 = courseContentFragment.getViewLifecycleOwner();
                            AbstractC9133u.m16132f(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
                            LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3).launchWhenResumed(new CourseContentFragment$JsToJava$_callHandler$1$3(courseContentFragment, jSONArray, jsToJava, null));
                            break;
                        }
                    case -94837594:
                        str2.equals("micro_add");
                        break;
                    case 1355456463:
                        if (!str2.equals("micro_play")) {
                            break;
                        } else {
                            String string = jSONArray.get(0).toString();
                            LifecycleOwner viewLifecycleOwner4 = courseContentFragment.getViewLifecycleOwner();
                            AbstractC9133u.m16132f(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
                            AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner4), C8843i0.m14868c(), null, new CourseContentFragment$JsToJava$_callHandler$1$1$1(courseContentFragment, string, null), 2, null);
                            break;
                        }
                    case 1545922129:
                        if (!str2.equals("open_file")) {
                            break;
                        } else {
                            String string2 = jSONArray.get(0).toString();
                            LifecycleOwner viewLifecycleOwner5 = courseContentFragment.getViewLifecycleOwner();
                            AbstractC9133u.m16132f(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
                            AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner5), C8843i0.m14868c(), null, new CourseContentFragment$JsToJava$_callHandler$1$7$1(courseContentFragment, string2, null), 2, null);
                            break;
                        }
                    case 2056323544:
                        if (!str2.equals("exercise")) {
                            break;
                        } else {
                            LifecycleOwner viewLifecycleOwner6 = courseContentFragment.getViewLifecycleOwner();
                            AbstractC9133u.m16132f(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
                            AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner6), C8843i0.m14868c(), null, new CourseContentFragment$JsToJava$_callHandler$1$2(courseContentFragment, jSONArray, null), 2, null);
                            break;
                        }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                XToastUtils xToastUtils = XToastUtils.INSTANCE;
                String string3 = courseContentFragment.getString(R$string.option_fail);
                AbstractC9133u.m16132f(string3, "getString(...)");
                AbstractC8366o.m13652d(xToastUtils, string3);
            }
            return C8736p.f16368a;
        }

        @JavascriptInterface
        @SuppressLint({"all"})
        public final void _callHandler(final String handlerName, String callHandlerID, final String args) {
            AbstractC9133u.m16133g(handlerName, "handlerName");
            AbstractC9133u.m16133g(callHandlerID, "callHandlerID");
            AbstractC9133u.m16133g(args, "args");
            C8716c c8716c = C8716c.f16341b;
            final CourseContentFragment courseContentFragment = this.f12823b;
            c8716c.m14220a(new InterfaceC10559a() { // from class: b5.n
                @Override // p300x7.InterfaceC10559a
                public final Object invoke() {
                    return CourseContentFragment.JsToJava.m11231b(args, handlerName, courseContentFragment, this);
                }
            });
        }

        /* renamed from: c */
        public final CourseContentFragmentArgs m11232c() {
            return this.f12822a;
        }
    }

    /* renamed from: com.zykj.study.ui.home.my.CourseContentFragment$a */
    public static final class C7987a implements InterfaceC10559a {

        /* renamed from: a */
        public final /* synthetic */ Fragment f12845a;

        public C7987a(Fragment fragment) {
            this.f12845a = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f12845a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f12845a + " has null arguments");
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.CourseContentFragment", m17801f = "CourseContentFragment.kt", m17802l = {ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL}, m17803m = "initData")
    /* renamed from: com.zykj.study.ui.home.my.CourseContentFragment$initData$1 */
    public static final class C79881 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f12846a;

        /* renamed from: c */
        public int f12848c;

        public C79881(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f12846a = obj;
            this.f12848c |= Integer.MIN_VALUE;
            return CourseContentFragment.this.initData(this);
        }
    }

    public CourseContentFragment() {
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.CourseContentFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.CourseContentFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f12809g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(CourseContentViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.CourseContentFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.CourseContentFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC10559a interfaceC10559a3 = interfaceC10559a2;
                if (interfaceC10559a3 != null && (creationExtras = (CreationExtras) interfaceC10559a3.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM27188viewModels$lambda1 = FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM27188viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM27188viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.CourseContentFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM27188viewModels$lambda1 = FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM27188viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM27188viewModels$lambda1 : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        });
        this.f12810h = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: b5.i
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return CourseContentFragment.m11222z(this.f2168a);
            }
        });
    }

    /* renamed from: s */
    public static final C8736p m11218s(CourseContentFragment courseContentFragment, String str, Bundle bundle) {
        AbstractC9133u.m16133g(str, "<unused var>");
        AbstractC9133u.m16133g(bundle, "bundle");
        ExerciseBean exerciseBean = (ExerciseBean) bundle.getParcelable("exercise_upload");
        if (exerciseBean != null) {
            exerciseBean.setStatus(ExerciseType.COMPLETED);
            exerciseBean.getQuestions().clear();
            new Gson().toJson(exerciseBean);
            courseContentFragment.m11226r().loadUrl("javascript:updateExercise('" + new Gson().toJson(exerciseBean) + "')");
        }
        return C8736p.f16368a;
    }

    /* renamed from: t */
    public static final void m11219t(CourseContentFragment courseContentFragment, View view) {
        FragmentKt.findNavController(courseContentFragment).navigateUp();
    }

    /* renamed from: x */
    public static final void m11220x(Ref$ObjectRef ref$ObjectRef, View view) {
        MaterialDialog materialDialog = (MaterialDialog) ref$ObjectRef.f17473a;
        if (materialDialog != null) {
            materialDialog.dismiss();
        }
    }

    /* renamed from: y */
    public static final C8736p m11221y(int i10, int i11, int i12, ExerciseBean exerciseBean, boolean z10, Ref$ObjectRef ref$ObjectRef, CourseContentFragment courseContentFragment, QuestionBean questionBean) {
        AbstractC9133u.m16133g(questionBean, "questionBean");
        NavDirections navDirectionsM11747b = AbstractC8091c.f13511a.m11747b(i10, i11, i12, exerciseBean.getQuestions().indexOf(questionBean), z10);
        MaterialDialog materialDialog = (MaterialDialog) ref$ObjectRef.f17473a;
        if (materialDialog != null) {
            materialDialog.dismiss();
        }
        FragmentKt.findNavController(courseContentFragment).navigate(navDirectionsM11747b);
        return C8736p.f16368a;
    }

    /* renamed from: z */
    public static final CustomX5WebView m11222z(CourseContentFragment courseContentFragment) {
        Context contextRequireContext = courseContentFragment.requireContext();
        AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
        return new CustomX5WebView(contextRequireContext, null, 0, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.zykj.base.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object initData(p179m7.InterfaceC9324c r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.zykj.study.p065ui.home.p066my.CourseContentFragment.C79881
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.study.ui.home.my.CourseContentFragment$initData$1 r0 = (com.zykj.study.p065ui.home.p066my.CourseContentFragment.C79881) r0
            int r1 = r0.f12848c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12848c = r1
            goto L18
        L13:
            com.zykj.study.ui.home.my.CourseContentFragment$initData$1 r0 = new com.zykj.study.ui.home.my.CourseContentFragment$initData$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f12846a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f12848c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9079b.m15926b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.AbstractC9079b.m15926b(r5)
            r0.f12848c = r3
            java.lang.Object r5 = super.initData(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            b5.k r5 = new b5.k
            r5.<init>()
            java.lang.String r0 = "exercise_upload"
            androidx.fragment.app.FragmentKt.setFragmentResultListener(r4, r0, r5)
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.p066my.CourseContentFragment.initData(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/CourseContentFragment.smali:629
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        ((FragmentCourseContentBinding) getMBindView()).setEntity(m11224p());
        TitleBar titleBarM6533n = ((FragmentCourseContentBinding) getMBindView()).toolbar.m6539t(m11223o().m11240c()).m6535p(getString(R$string.arrow_left_return)).m6534o(R$drawable.ic_arrow_left).m6537r(getResources().getColor(R$color.toolbar_back_icon_color)).m6538s(getResources().getDimensionPixelSize(R$dimen.text_9)).m6541v(getResources().getDimensionPixelSize(R$dimen.text_9)).m6536q(false).m6531l(true).m6533n(new View.OnClickListener() { // from class: b5.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CourseContentFragment.m11219t(this.f2175a, view);
            }
        });
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new CourseContentFragment$initView$3$1(this, titleBarM6533n, null), 3, null);
        m11227u(m11226r());
        ((FragmentCourseContentBinding) getMBindView()).fmContent.addView(m11226r(), new ViewGroup.LayoutParams(-1, -1));
        m11226r().loadUrl(m11223o().m11241d());
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_course_content;
    }

    /* renamed from: o */
    public final CourseContentFragmentArgs m11223o() {
        return (CourseContentFragmentArgs) this.f12808f.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        ((FragmentCourseContentBinding) getMBindView()).fmContent.removeView(m11226r());
        super.onDestroyView();
    }

    /* renamed from: p */
    public final CourseContentViewModel m11224p() {
        return (CourseContentViewModel) this.f12809g.getValue();
    }

    /* renamed from: q */
    public final InterfaceC9270g m11225q() {
        InterfaceC9270g interfaceC9270g = this.f12811i;
        if (interfaceC9270g != null) {
            return interfaceC9270g;
        }
        AbstractC9133u.m16151y("lessonDeauthorizedFlow");
        return null;
    }

    /* renamed from: r */
    public final CustomX5WebView m11226r() {
        return (CustomX5WebView) this.f12810h.getValue();
    }

    /* renamed from: u */
    public final void m11227u(CustomX5WebView customX5WebView) {
        customX5WebView.addJavascriptInterface(new JsToJava(this, m11223o()), "flutter_inappwebview");
        customX5WebView.addJavascriptInterface(new CourseDeauthorized(), "flutter_inappwebview1");
        C8356e c8356e = C8356e.f15876a;
        customX5WebView.m11897g(c8356e.m13622d());
        customX5WebView.m11897g(c8356e.m13619a());
        customX5WebView.m11897g(AbstractC8807u.m14755e(c8356e.m13620b()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m11228v(p179m7.InterfaceC9324c r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.zykj.study.p065ui.home.p066my.CourseContentFragment$isAuthor$1
            if (r0 == 0) goto L13
            r0 = r6
            com.zykj.study.ui.home.my.CourseContentFragment$isAuthor$1 r0 = (com.zykj.study.p065ui.home.p066my.CourseContentFragment$isAuthor$1) r0
            int r1 = r0.f12856d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12856d = r1
            goto L18
        L13:
            com.zykj.study.ui.home.my.CourseContentFragment$isAuthor$1 r0 = new com.zykj.study.ui.home.my.CourseContentFragment$isAuthor$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f12854b
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f12856d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f12853a
            java.lang.String r0 = (java.lang.String) r0
            kotlin.AbstractC9079b.m15926b(r6)
            goto L5a
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            kotlin.AbstractC9079b.m15926b(r6)
            com.zykj.study.ui.home.my.CourseContentFragmentArgs r6 = r5.m11223o()
            com.zykj.study.bean.course.CourseBean r6 = r6.m11238a()
            if (r6 == 0) goto L47
            java.lang.String r6 = r6.getUserId()
            goto L48
        L47:
            r6 = 0
        L48:
            com.zykj.study.viewmodels.CourseContentViewModel r2 = r5.m11224p()
            r0.f12853a = r6
            r0.f12856d = r3
            java.lang.Object r0 = r2.m12034c(r0)
            if (r0 != r1) goto L57
            return r1
        L57:
            r4 = r0
            r0 = r6
            r6 = r4
        L5a:
            boolean r6 = kotlin.jvm.internal.AbstractC9133u.m16128b(r0, r6)
            java.lang.Boolean r6 = p201o7.AbstractC9536a.m17796a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.p066my.CourseContentFragment.m11228v(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/CourseContentFragment.smali:1417
    }

    /* renamed from: w */
    public final void m11229w(final int i10, final int i11, final int i12, GroupStatistic groupStatistic, final boolean z10) {
        final ExerciseBean exerciseBean;
        Context context = getContext();
        if (context != null) {
            DialogStatisticBinding dialogStatisticBinding = (DialogStatisticBinding) DataBindingUtil.inflate(LayoutInflater.from(context), R$layout.dialog_statistic, null, false);
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            dialogStatisticBinding.setEntity(groupStatistic);
            dialogStatisticBinding.imageView18.setOnClickListener(new View.OnClickListener() { // from class: b5.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CourseContentFragment.m11220x(ref$ObjectRef, view);
                }
            });
            List<ExerciseBean> questionGroups = groupStatistic.getQuestionGroups();
            if (questionGroups != null && (exerciseBean = (ExerciseBean) AbstractC8778f0.m14568n0(questionGroups)) != null) {
                dialogStatisticBinding.setExerciseBean(exerciseBean);
                dialogStatisticBinding.recycler.setAdapter(new GroupStatisticAdapter(exerciseBean.getQuestions(), new InterfaceC10570l() { // from class: b5.m
                    @Override // p300x7.InterfaceC10570l
                    public final Object invoke(Object obj) {
                        return CourseContentFragment.m11221y(i10, i11, i12, exerciseBean, z10, ref$ObjectRef, this, (QuestionBean) obj);
                    }
                }));
            }
            ref$ObjectRef.f17473a = new MaterialDialog.C6913g(context).m6751l(dialogStatisticBinding.getRoot(), true).m6734E();
        }
    }
}
