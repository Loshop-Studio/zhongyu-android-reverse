package com.zykj.image;

// RE note 本类字节码直接引用的读写或显示接口包括文件流、位图。

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.Keep;
import androidx.databinding.library.baseAdapters.C3721BR;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.fragment.FragmentKt;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.base.utils.XToastUtils;
import com.zykj.image.ImageCropFragment;
import com.zykj.image.databinding.FragmentImageCropBinding;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlinx.coroutines.InterfaceC9212n;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p256t7.AbstractC10117b;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

@Keep
/* loaded from: classes4.dex */
public final class ImageCropFragment extends Hilt_ImageCropFragment {
    public static final C7303a Companion = new C7303a(null);
    public static final String IMAGE_PATH = "result_image_crop_path";
    public static final String RESULT_IMAGE_PATH_KEY = "result_image_crop_key";
    private final NavArgsLazy args$delegate = new NavArgsLazy(AbstractC9137y.m16154b(ImageCropFragmentArgs.class), new InterfaceC10559a() { // from class: com.zykj.image.ImageCropFragment$special$$inlined$navArgs$1
        {
            super(0);
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this + " has null arguments");
        }
    });
    private MutableLiveData<String> localFilePath = new MutableLiveData<>();
    private InterfaceC9212n processJob;

    /* renamed from: com.zykj.image.ImageCropFragment$a */
    public static final class C7303a {
        public /* synthetic */ C7303a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C7303a() {
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.image.ImageCropFragment", m17801f = "ImageCropFragment.kt", m17802l = {40, 41}, m17803m = "initData")
    /* renamed from: com.zykj.image.ImageCropFragment$initData$1 */
    public static final class C73041 extends ContinuationImpl {

        /* renamed from: a */
        public Object f9721a;

        /* renamed from: b */
        public /* synthetic */ Object f9722b;

        /* renamed from: d */
        public int f9724d;

        public C73041(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9722b = obj;
            this.f9724d |= Integer.MIN_VALUE;
            return ImageCropFragment.this.initData(this);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.image.ImageCropFragment$initData$2", m17801f = "ImageCropFragment.kt", m17802l = {52, C3721BR.versionViewModel}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.image.ImageCropFragment$initData$2 */
    public static final class C73052 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f9725a;

        @InterfaceC9539d(m17800c = "com.zykj.image.ImageCropFragment$initData$2$2", m17801f = "ImageCropFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.image.ImageCropFragment$initData$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f9727a;

            public AnonymousClass2(InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass2(interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC9434a.m17291f();
                if (this.f9727a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                XToastUtils.INSTANCE.error("图片设置失败");
                return C8736p.f16368a;
            }
        }

        @InterfaceC9539d(m17800c = "com.zykj.image.ImageCropFragment$initData$2$3", m17801f = "ImageCropFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.image.ImageCropFragment$initData$2$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f9728a;

            public AnonymousClass3(InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass3(interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass3) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC9434a.m17291f();
                if (this.f9728a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                XToastUtils.INSTANCE.error("图片预览失败");
                return C8736p.f16368a;
            }
        }

        public C73052(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return ImageCropFragment.this.new C73052(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C73052) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
        
            if (p135i8.AbstractC8833f.m14848g(r1, r3, r6) != r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
        
            if (p135i8.AbstractC8833f.m14848g(r1, r2, r6) != r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0099, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                int r1 = r6.f9725a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto Le
                if (r1 != r2) goto L13
            Le:
                kotlin.AbstractC9079b.m15926b(r7)
                goto L9a
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1b:
                kotlin.AbstractC9079b.m15926b(r7)
                r7 = 0
                com.zykj.image.ImageCropFragment r1 = com.zykj.image.ImageCropFragment.this     // Catch: java.lang.Exception -> L5a java.util.NoSuchElementException -> L5c
                android.content.Context r1 = r1.requireContext()     // Catch: java.lang.Exception -> L5a java.util.NoSuchElementException -> L5c
                top.zibin.luban.b$a r1 = top.zibin.luban.C10131b.m18932g(r1)     // Catch: java.lang.Exception -> L5a java.util.NoSuchElementException -> L5c
                com.zykj.image.ImageCropFragment r4 = com.zykj.image.ImageCropFragment.this     // Catch: java.lang.Exception -> L5a java.util.NoSuchElementException -> L5c
                com.zykj.image.ImageCropFragmentArgs r4 = com.zykj.image.ImageCropFragment.access$getArgs(r4)     // Catch: java.lang.Exception -> L5a java.util.NoSuchElementException -> L5c
                java.lang.String r4 = r4.m9215c()     // Catch: java.lang.Exception -> L5a java.util.NoSuchElementException -> L5c
                top.zibin.luban.b$a r1 = r1.m18947k(r4)     // Catch: java.lang.Exception -> L5a java.util.NoSuchElementException -> L5c
                r4 = 500(0x1f4, float:7.0E-43)
                top.zibin.luban.b$a r1 = r1.m18945i(r4)     // Catch: java.lang.Exception -> L5a java.util.NoSuchElementException -> L5c
                java.util.List r1 = r1.m18944h()     // Catch: java.lang.Exception -> L5a java.util.NoSuchElementException -> L5c
                com.zykj.image.ImageCropFragment r4 = com.zykj.image.ImageCropFragment.this     // Catch: java.lang.Exception -> L5a java.util.NoSuchElementException -> L5c
                androidx.lifecycle.MutableLiveData r4 = com.zykj.image.ImageCropFragment.access$getLocalFilePath$p(r4)     // Catch: java.lang.Exception -> L5a java.util.NoSuchElementException -> L5c
                java.lang.String r5 = "this"
                kotlin.jvm.internal.AbstractC9133u.m16132f(r1, r5)     // Catch: java.lang.Exception -> L5a java.util.NoSuchElementException -> L5c
                java.lang.Object r1 = p134i7.AbstractC8778f0.m14566l0(r1)     // Catch: java.lang.Exception -> L5a java.util.NoSuchElementException -> L5c
                java.io.File r1 = (java.io.File) r1     // Catch: java.lang.Exception -> L5a java.util.NoSuchElementException -> L5c
                java.lang.String r1 = r1.getAbsolutePath()     // Catch: java.lang.Exception -> L5a java.util.NoSuchElementException -> L5c
                r4.postValue(r1)     // Catch: java.lang.Exception -> L5a java.util.NoSuchElementException -> L5c
                goto L9a
            L5a:
                r1 = move-exception
                goto L5e
            L5c:
                r1 = move-exception
                goto L7c
            L5e:
                r1.printStackTrace()
                com.zykj.image.ImageCropFragment r1 = com.zykj.image.ImageCropFragment.this
                androidx.lifecycle.MutableLiveData r1 = com.zykj.image.ImageCropFragment.access$getLocalFilePath$p(r1)
                r1.postValue(r7)
                i8.h1 r1 = p135i8.C8843i0.m14868c()
                com.zykj.image.ImageCropFragment$initData$2$3 r3 = new com.zykj.image.ImageCropFragment$initData$2$3
                r3.<init>(r7)
                r6.f9725a = r2
                java.lang.Object r7 = p135i8.AbstractC8833f.m14848g(r1, r3, r6)
                if (r7 != r0) goto L9a
                goto L99
            L7c:
                r1.printStackTrace()
                com.zykj.image.ImageCropFragment r1 = com.zykj.image.ImageCropFragment.this
                androidx.lifecycle.MutableLiveData r1 = com.zykj.image.ImageCropFragment.access$getLocalFilePath$p(r1)
                r1.postValue(r7)
                i8.h1 r1 = p135i8.C8843i0.m14868c()
                com.zykj.image.ImageCropFragment$initData$2$2 r2 = new com.zykj.image.ImageCropFragment$initData$2$2
                r2.<init>(r7)
                r6.f9725a = r3
                java.lang.Object r7 = p135i8.AbstractC8833f.m14848g(r1, r2, r6)
                if (r7 != r0) goto L9a
            L99:
                return r0
            L9a:
                h7.p r7 = p123h7.C8736p.f16368a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.image.ImageCropFragment.C73052.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes4/com/zykj/image/ImageCropFragment$initData$2.smali:119
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageCropFragmentArgs getArgs() {
        return (ImageCropFragmentArgs) this.args$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: initView$lambda-0, reason: not valid java name */
    public static final void m27483initView$lambda0(ImageCropFragment this$0, String str) {
        AbstractC9133u.m16133g(this$0, "this$0");
        if (str == null) {
            FragmentKt.findNavController(this$0).navigateUp();
            return;
        }
        ProgressBar progressBar = ((FragmentImageCropBinding) this$0.getMBindView()).f9812c;
        AbstractC9133u.m16132f(progressBar, "mBindView.progressBar");
        BindingAdaptersKt.visibleOrGone(progressBar, Boolean.FALSE);
        ((FragmentImageCropBinding) this$0.getMBindView()).f9813d.setImagePath(str);
        ((FragmentImageCropBinding) this$0.getMBindView()).f9813d.setFixedAspectRatio(this$0.getArgs().m9214b());
        if (this$0.getArgs().m9214b()) {
            ((FragmentImageCropBinding) this$0.getMBindView()).f9813d.m6856d(this$0.getArgs().m9216d(), this$0.getArgs().m9217e());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initView$lambda-1, reason: not valid java name */
    public static final void m27484initView$lambda1(ImageCropFragment this$0, View view) {
        AbstractC9133u.m16133g(this$0, "this$0");
        FragmentKt.findNavController(this$0).navigateUp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initView$lambda-2, reason: not valid java name */
    public static final void m27485initView$lambda2(ImageCropFragment this$0, View view) {
        AbstractC9133u.m16133g(this$0, "this$0");
        this$0.showCropDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveToLocal(Bitmap bitmap, File file) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 90, bufferedOutputStream);
            AbstractC10117b.m18861a(bufferedOutputStream, null);
        } finally {
        }
    }

    private final void showCropDialog() {
        new MaterialDialog.C6913g(requireContext()).m6758s().m6749j(getString(R$string.cutting)).m6731B(true, 0).m6733D(false).m6743d(new DialogInterface.OnCancelListener() { // from class: j3.a
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ImageCropFragment.m27486showCropDialog$lambda3(this.f17188a, dialogInterface);
            }
        }).m6735F(new DialogInterface.OnShowListener() { // from class: j3.b
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ImageCropFragment.m27487showCropDialog$lambda4(this.f17189a, dialogInterface);
            }
        }).m6760u(getString(R$string.cancel)).m6734E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showCropDialog$lambda-3, reason: not valid java name */
    public static final void m27486showCropDialog$lambda3(ImageCropFragment this$0, DialogInterface dialogInterface) {
        AbstractC9133u.m16133g(this$0, "this$0");
        InterfaceC9212n interfaceC9212n = this$0.processJob;
        if (interfaceC9212n == null) {
            return;
        }
        InterfaceC9212n.a.m16777a(interfaceC9212n, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showCropDialog$lambda-4, reason: not valid java name */
    public static final void m27487showCropDialog$lambda4(ImageCropFragment this$0, DialogInterface dialogInterface) {
        AbstractC9133u.m16133g(this$0, "this$0");
        this$0.processJob = AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new ImageCropFragment$showCropDialog$2$1(this$0, dialogInterface, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (p135i8.AbstractC8833f.m14848g(r7, r4, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.zykj.base.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object initData(p179m7.InterfaceC9324c<? super p123h7.C8736p> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.zykj.image.ImageCropFragment.C73041
            if (r0 == 0) goto L13
            r0 = r7
            com.zykj.image.ImageCropFragment$initData$1 r0 = (com.zykj.image.ImageCropFragment.C73041) r0
            int r1 = r0.f9724d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9724d = r1
            goto L18
        L13:
            com.zykj.image.ImageCropFragment$initData$1 r0 = new com.zykj.image.ImageCropFragment$initData$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f9722b
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f9724d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.AbstractC9079b.m15926b(r7)
            goto L60
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.f9721a
            com.zykj.image.ImageCropFragment r2 = (com.zykj.image.ImageCropFragment) r2
            kotlin.AbstractC9079b.m15926b(r7)
            goto L4b
        L3c:
            kotlin.AbstractC9079b.m15926b(r7)
            r0.f9721a = r6
            r0.f9724d = r4
            java.lang.Object r7 = super.initData(r0)
            if (r7 != r1) goto L4a
            goto L5f
        L4a:
            r2 = r6
        L4b:
            kotlinx.coroutines.CoroutineDispatcher r7 = p135i8.C8843i0.m14867b()
            com.zykj.image.ImageCropFragment$initData$2 r4 = new com.zykj.image.ImageCropFragment$initData$2
            r5 = 0
            r4.<init>(r5)
            r0.f9721a = r5
            r0.f9724d = r3
            java.lang.Object r7 = p135i8.AbstractC8833f.m14848g(r7, r4, r0)
            if (r7 != r1) goto L60
        L5f:
            return r1
        L60:
            h7.p r7 = p123h7.C8736p.f16368a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.image.ImageCropFragment.initData(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes4/com/zykj/image/ImageCropFragment.smali:790
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        this.localFilePath.observe(getViewLifecycleOwner(), new Observer() { // from class: j3.c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ImageCropFragment.m27483initView$lambda0(this.f17190a, (String) obj);
            }
        });
        ((FragmentImageCropBinding) getMBindView()).f9810a.setOnClickListener(new View.OnClickListener() { // from class: j3.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageCropFragment.m27484initView$lambda1(this.f17191a, view);
            }
        });
        ((FragmentImageCropBinding) getMBindView()).f9811b.setOnClickListener(new View.OnClickListener() { // from class: j3.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageCropFragment.m27485initView$lambda2(this.f17192a, view);
            }
        });
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_image_crop;
    }
}
