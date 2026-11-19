package com.zykj.huiwei.launcher.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.zykj.base.BaseViewModel;
import com.zykj.gallery.repository.GalleryRepository;
import com.zykj.huiwei.launcher.ext.CommonExtKt;
import com.zykj.huiwei.launcher.viewmodels.MainViewModel;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BK\b\u0007\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010 \u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001eH\u0086@¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0082@¢\u0006\u0004\b&\u0010'R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a088FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\"0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020\"0>8\u0006¢\u0006\f\n\u0004\b;\u0010?\u001a\u0004\b@\u0010AR>\u0010D\u001a,\u0012(\u0012&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030C0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010)RA\u0010F\u001a,\u0012(\u0012&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030C0>8\u0006¢\u0006\f\n\u0004\b&\u0010?\u001a\u0004\bE\u0010A¨\u0006G"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;", "Lcom/zykj/base/BaseViewModel;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;", "appList", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/zykj/lib/error/code/ErrorCode;", "unauthorizedFlow", "Landroid/app/Application;", "application", "Lcom/zykj/gallery/repository/GalleryRepository;", "galleryRepository", "Landroidx/datastore/core/DataStore;", "Lcom/zykj/huiwei/launcher/proto/m;", "userDataStore", "<init>", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableSharedFlow;Landroid/app/Application;Lcom/zykj/gallery/repository/GalleryRepository;Landroidx/datastore/core/DataStore;)V", "", "o", "()V", "Lcom/zykj/huiwei/launcher/bean/LcAppInfo;", "list", "p", "(Ljava/util/List;)V", "r", "", "deviceId", "n", "(Ljava/lang/String;)V", "Landroid/net/Uri;", "uri", "m", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "number", "q", "(I)V", "j", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lkotlinx/coroutines/flow/MutableStateFlow;", "g", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "b", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "l", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "c", "Landroid/app/Application;", "d", "Lcom/zykj/gallery/repository/GalleryRepository;", "e", "Landroidx/datastore/core/DataStore;", "getUserDataStore", "()Landroidx/datastore/core/DataStore;", "Landroidx/lifecycle/MutableLiveData;", "f", "Lkotlin/Lazy;", "h", "()Landroidx/lifecycle/MutableLiveData;", "_gestureNumberFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "i", "()Lkotlinx/coroutines/flow/StateFlow;", "gestureNumberFlow", "Lkotlin/Triple;", "_shownAppList", "k", "shownAppList", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/MainViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Uri.kt\ncom/dylanc/longan/UriKt\n+ 4 ContentResolver.kt\ncom/dylanc/longan/ContentResolverKt\n*L\n1#1,190:1\n1563#2:191\n1634#2,3:192\n106#3,4:195\n29#4:199\n*S KotlinDebug\n*F\n+ 1 MainViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/MainViewModel\n*L\n100#1:191\n100#1:192,3\n136#1:195,4\n136#1:199\n*E\n"})
/* loaded from: classes4.dex */
public final class MainViewModel extends BaseViewModel {

    /* renamed from: a, reason: from kotlin metadata */
    public final MutableStateFlow appList;

    /* renamed from: b, reason: from kotlin metadata */
    public final MutableSharedFlow unauthorizedFlow;

    /* renamed from: c, reason: from kotlin metadata */
    public final Application application;

    /* renamed from: d, reason: from kotlin metadata */
    public final GalleryRepository galleryRepository;

    /* renamed from: e, reason: from kotlin metadata */
    public final DataStore userDataStore;

    /* renamed from: f, reason: from kotlin metadata */
    public final Lazy deviceId;

    /* renamed from: g, reason: from kotlin metadata */
    public final MutableStateFlow _gestureNumberFlow;

    /* renamed from: h, reason: from kotlin metadata */
    public final StateFlow gestureNumberFlow;

    /* renamed from: i, reason: from kotlin metadata */
    public final MutableStateFlow _shownAppList;

    /* renamed from: j, reason: from kotlin metadata */
    public final StateFlow shownAppList;

    @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.MainViewModel$1", m7918f = "MainViewModel.kt", m7919i = {}, m7920l = {80}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
    /* renamed from: com.zykj.huiwei.launcher.viewmodels.MainViewModel$1 */
    public static final class C61891 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f7215a;

        @Metadata(m7879d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m7880d2 = {"<anonymous>", "", "it", "Landroidx/datastore/preferences/core/Preferences;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
        @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.MainViewModel$1$1", m7918f = "MainViewModel.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
        /* renamed from: com.zykj.huiwei.launcher.viewmodels.MainViewModel$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Preferences, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f7217a;

            /* renamed from: b */
            public /* synthetic */ Object f7218b;

            /* renamed from: c */
            public final /* synthetic */ MainViewModel f7219c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MainViewModel mainViewModel, Continuation continuation) {
                super(2, continuation);
                this.f7219c = mainViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f7219c, continuation);
                anonymousClass1.f7218b = obj;
                return anonymousClass1;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Preferences preferences, Continuation continuation) {
                return ((AnonymousClass1) create(preferences, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Preferences preferences = (Preferences) this.f7218b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f7217a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.f7219c.m6152h().setValue(preferences.get(PreferencesKeys.stringKey("deviceId")));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Preferences preferences, Continuation<? super Unit> continuation) {
                return invoke2(preferences, (Continuation) continuation);
            }
        }

        public C61891(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MainViewModel.this.new C61891(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f7215a;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow data = CommonExtKt.m5311d(MainViewModel.this.application).getData();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(MainViewModel.this, null);
                this.f7215a = 1;
                if (FlowKt.collectLatest(data, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C61891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public MainViewModel(MutableStateFlow appList, MutableSharedFlow unauthorizedFlow, Application application, GalleryRepository galleryRepository, DataStore userDataStore) {
        Intrinsics.checkNotNullParameter(appList, "appList");
        Intrinsics.checkNotNullParameter(unauthorizedFlow, "unauthorizedFlow");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(galleryRepository, "galleryRepository");
        Intrinsics.checkNotNullParameter(userDataStore, "userDataStore");
        this.appList = appList;
        this.unauthorizedFlow = unauthorizedFlow;
        this.application = application;
        this.galleryRepository = galleryRepository;
        this.userDataStore = userDataStore;
        this.deviceId = LazyKt.lazy(new Function0() { // from class: l4.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainViewModel.m6150f();
            }
        });
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(-1);
        this._gestureNumberFlow = MutableStateFlow;
        this.gestureNumberFlow = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(new Triple(CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList()));
        this._shownAppList = MutableStateFlow2;
        this.shownAppList = FlowKt.asStateFlow(MutableStateFlow2);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C61891(null), 3, null);
    }

    /* renamed from: f */
    public static final MutableLiveData m6150f() {
        return new MutableLiveData();
    }

    /* renamed from: g, reason: from getter */
    public final MutableStateFlow getAppList() {
        return this.appList;
    }

    /* renamed from: h */
    public final MutableLiveData m6152h() {
        return (MutableLiveData) this.deviceId.getValue();
    }

    /* renamed from: i, reason: from getter */
    public final StateFlow getGestureNumberFlow() {
        return this.gestureNumberFlow;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6154j(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.zykj.huiwei.launcher.viewmodels.MainViewModel$getLCAPPList$1
            if (r0 == 0) goto L13
            r0 = r8
            com.zykj.huiwei.launcher.viewmodels.MainViewModel$getLCAPPList$1 r0 = (com.zykj.huiwei.launcher.viewmodels.MainViewModel$getLCAPPList$1) r0
            int r1 = r0.f7224e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7224e = r1
            goto L18
        L13:
            com.zykj.huiwei.launcher.viewmodels.MainViewModel$getLCAPPList$1 r0 = new com.zykj.huiwei.launcher.viewmodels.MainViewModel$getLCAPPList$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f7222c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f7224e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.f7221b
            android.content.Intent r1 = (android.content.Intent) r1
            java.lang.Object r0 = r0.f7220a
            android.content.pm.PackageManager r0 = (android.content.pm.PackageManager) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L6f
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            kotlin.ResultKt.throwOnFailure(r8)
            android.app.Application r8 = com.blankj.utilcode.util.AbstractC4657l0.m2250a()
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r4 = "android.intent.action.MAIN"
            r2.<init>(r4)
            java.lang.String r4 = "android.intent.category.LAUNCHER"
            r2.addCategory(r4)
            kotlinx.coroutines.CoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getIO()
            com.zykj.huiwei.launcher.viewmodels.MainViewModel$getLCAPPList$resolveInfoList$1 r5 = new com.zykj.huiwei.launcher.viewmodels.MainViewModel$getLCAPPList$resolveInfoList$1
            r6 = 0
            r5.<init>(r8, r2, r6)
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r0.f7220a = r8
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
            r0.f7221b = r8
            r0.f7224e = r3
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r4, r5, r0)
            if (r8 != r1) goto L6f
            return r1
        L6f:
            java.lang.String r0 = "withContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            java.util.List r8 = (java.util.List) r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r8, r1)
            r0.<init>(r1)
            java.util.Iterator r8 = r8.iterator()
        L85:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto Ld1
            java.lang.Object r1 = r8.next()
            android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1
            com.zykj.huiwei.launcher.bean.BaseAppInfo r2 = new com.zykj.huiwei.launcher.bean.BaseAppInfo
            android.content.pm.ActivityInfo r3 = r1.activityInfo
            android.app.Application r4 = com.blankj.utilcode.util.AbstractC4657l0.m2250a()
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.CharSequence r3 = r3.loadLabel(r4)
            java.lang.String r3 = r3.toString()
            android.content.pm.ActivityInfo r4 = r1.activityInfo
            android.app.Application r5 = com.blankj.utilcode.util.AbstractC4657l0.m2250a()
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            android.graphics.drawable.Drawable r4 = r4.loadIcon(r5)
            java.lang.String r5 = "loadIcon(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            android.content.pm.ActivityInfo r5 = r1.activityInfo
            java.lang.String r5 = r5.packageName
            java.lang.String r6 = "packageName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            android.content.pm.ActivityInfo r1 = r1.activityInfo
            java.lang.String r1 = r1.name
            java.lang.String r6 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
            r2.<init>(r3, r4, r5, r1)
            r0.add(r2)
            goto L85
        Ld1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.viewmodels.MainViewModel.m6154j(kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/viewmodels/MainViewModel.smali:484
    }

    /* renamed from: k, reason: from getter */
    public final StateFlow getShownAppList() {
        return this.shownAppList;
    }

    /* renamed from: l, reason: from getter */
    public final MutableSharedFlow getUnauthorizedFlow() {
        return this.unauthorizedFlow;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6157m(android.net.Uri r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.zykj.huiwei.launcher.viewmodels.MainViewModel$saveToOssImg$1
            if (r0 == 0) goto L13
            r0 = r15
            com.zykj.huiwei.launcher.viewmodels.MainViewModel$saveToOssImg$1 r0 = (com.zykj.huiwei.launcher.viewmodels.MainViewModel$saveToOssImg$1) r0
            int r1 = r0.f7232e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7232e = r1
            goto L18
        L13:
            com.zykj.huiwei.launcher.viewmodels.MainViewModel$saveToOssImg$1 r0 = new com.zykj.huiwei.launcher.viewmodels.MainViewModel$saveToOssImg$1
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.f7230c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f7232e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r14 = r0.f7229b
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r0 = r0.f7228a
            android.net.Uri r0 = (android.net.Uri) r0
            kotlin.ResultKt.throwOnFailure(r15)
            r5 = r14
            r6 = r0
            goto L71
        L33:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3b:
            kotlin.ResultKt.throwOnFailure(r15)
            android.webkit.MimeTypeMap r15 = android.webkit.MimeTypeMap.getSingleton()
            android.app.Application r2 = p054f1.AbstractC6289a.m6425a()
            android.content.ContentResolver r2 = r2.getContentResolver()
            java.lang.String r4 = "application.contentResolver"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            java.lang.String r2 = r2.getType(r14)
            java.lang.String r15 = r15.getExtensionFromMimeType(r2)
            if (r15 != 0) goto L5b
            java.lang.String r15 = "jpg"
        L5b:
            androidx.datastore.core.DataStore r2 = r13.userDataStore
            kotlinx.coroutines.flow.Flow r2 = r2.getData()
            r0.f7228a = r14
            r0.f7229b = r15
            r0.f7232e = r3
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r2, r0)
            if (r0 != r1) goto L6e
            return r1
        L6e:
            r6 = r14
            r5 = r15
            r15 = r0
        L71:
            com.zykj.huiwei.launcher.proto.m r15 = (com.zykj.huiwei.launcher.proto.C6075m) r15
            if (r15 == 0) goto L7a
            java.lang.String r14 = r15.getId()
            goto L7b
        L7a:
            r14 = 0
        L7b:
            java.lang.String r4 = java.lang.String.valueOf(r14)
            kotlinx.coroutines.CoroutineScope r14 = androidx.lifecycle.ViewModelKt.getViewModelScope(r13)
            com.zykj.huiwei.launcher.viewmodels.MainViewModel$saveToOssImg$2 r2 = new com.zykj.huiwei.launcher.viewmodels.MainViewModel$saveToOssImg$2
            r7 = 0
            r3 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r11 = 3
            r12 = 0
            r8 = 0
            r9 = 0
            r7 = r14
            r10 = r2
            kotlinx.coroutines.BuildersKt.launch$default(r7, r8, r9, r10, r11, r12)
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.viewmodels.MainViewModel.m6157m(android.net.Uri, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/viewmodels/MainViewModel.smali:934
    }

    /* renamed from: n */
    public final void m6158n(String deviceId) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MainViewModel$setDeviceId$1(this, deviceId, null), 3, null);
    }

    /* renamed from: o */
    public final void m6159o() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MainViewModel$updateAllAppList$1(this, null), 3, null);
    }

    /* renamed from: p */
    public final void m6160p(List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MainViewModel$updateFirst$1(this, list, null), 3, null);
    }

    /* renamed from: q */
    public final void m6161q(int number) {
        this._gestureNumberFlow.setValue(Integer.valueOf(number));
    }

    /* renamed from: r */
    public final void m6162r(List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MainViewModel$updateSecond$1(this, list, null), 3, null);
    }
}
