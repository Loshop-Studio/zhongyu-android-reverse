package com.zykj.huiwei.launcher.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.core.DataStore;
import androidx.lifecycle.MutableLiveData;
import com.zykj.base.BaseViewModel;
import com.zykj.huiwei.launcher.ext.ViewModelExtKt;
import com.zykj.huiwei.launcher.repository.HomeRepository;
import com.zykj.huiwei.launcher.repository.UserRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00198\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\u001eR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u00198\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006!"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;", "Lcom/zykj/base/BaseViewModel;", "Lcom/zykj/huiwei/launcher/repository/UserRepository;", "userRepository", "Lcom/zykj/huiwei/launcher/repository/HomeRepository;", "homeRepository", "Landroidx/datastore/core/DataStore;", "Lcom/zykj/huiwei/launcher/proto/m;", "userDataStore", "<init>", "(Lcom/zykj/huiwei/launcher/repository/UserRepository;Lcom/zykj/huiwei/launcher/repository/HomeRepository;Landroidx/datastore/core/DataStore;)V", "", "b", "()V", "", "profileId", "f", "(J)V", "a", "Lcom/zykj/huiwei/launcher/repository/UserRepository;", "Lcom/zykj/huiwei/launcher/repository/HomeRepository;", "c", "Landroidx/datastore/core/DataStore;", "e", "()Landroidx/datastore/core/DataStore;", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/zykj/huiwei/launcher/bean/AvatarItem;", "d", "Landroidx/lifecycle/MutableLiveData;", "()Landroidx/lifecycle/MutableLiveData;", "avatarItems", "userCacheBean", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nChangeAvatarViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeAvatarViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,53:1\n49#2:54\n51#2:58\n46#3:55\n51#3:57\n105#4:56\n*S KotlinDebug\n*F\n+ 1 ChangeAvatarViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel\n*L\n36#1:54\n36#1:58\n36#1:55\n36#1:57\n36#1:56\n*E\n"})
/* loaded from: classes4.dex */
public final class ChangeAvatarViewModel extends BaseViewModel {

    /* renamed from: a, reason: from kotlin metadata */
    public final UserRepository userRepository;

    /* renamed from: b, reason: from kotlin metadata */
    public final HomeRepository homeRepository;

    /* renamed from: c, reason: from kotlin metadata */
    public final DataStore userDataStore;

    /* renamed from: d, reason: from kotlin metadata */
    public final MutableLiveData avatarItems;

    /* renamed from: e, reason: from kotlin metadata */
    public final MutableLiveData userCacheBean;

    public ChangeAvatarViewModel(UserRepository userRepository, HomeRepository homeRepository, DataStore userDataStore) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(homeRepository, "homeRepository");
        Intrinsics.checkNotNullParameter(userDataStore, "userDataStore");
        this.userRepository = userRepository;
        this.homeRepository = homeRepository;
        this.userDataStore = userDataStore;
        this.avatarItems = new MutableLiveData();
        this.userCacheBean = new MutableLiveData();
    }

    /* renamed from: b */
    public final void m6043b() {
        ViewModelExtKt.m5324g(this, this.homeRepository.m5415b(), null, null, null, new ChangeAvatarViewModel$getAllProfilesAsync$1(this, null), 14, null);
    }

    /* renamed from: c, reason: from getter */
    public final MutableLiveData getAvatarItems() {
        return this.avatarItems;
    }

    /* renamed from: d, reason: from getter */
    public final MutableLiveData getUserCacheBean() {
        return this.userCacheBean;
    }

    /* renamed from: e, reason: from getter */
    public final DataStore getUserDataStore() {
        return this.userDataStore;
    }

    /* renamed from: f */
    public final void m6047f(long profileId) {
        final Flow flowM5422i = this.homeRepository.m5422i(profileId);
        ViewModelExtKt.m5324g(this, new Flow() { // from class: com.zykj.huiwei.launcher.viewmodels.ChangeAvatarViewModel$setPictureAsync$$inlined$map$1

            /* renamed from: com.zykj.huiwei.launcher.viewmodels.ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2 */
            public static final class C61772 implements FlowCollector {

                /* renamed from: a */
                public final /* synthetic */ FlowCollector f6973a;

                /* renamed from: b */
                public final /* synthetic */ ChangeAvatarViewModel f6974b;

                @Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
                @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2", m7918f = "ChangeAvatarViewModel.kt", m7919i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, m7920l = {51, 52, 50}, m7921m = "emit", m7922n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$completion", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1", "it", "$i$a$-map-ChangeAvatarViewModel$setPictureAsync$1", "value", "$completion", "value", "$this$map_u24lambda_u245", "$completion", "userInfo", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1", "it", "$i$a$-map-ChangeAvatarViewModel$setPictureAsync$1", "value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m7923s = {"L$0", "L$1", "L$2", "L$3", "L$5", "I$0", "Z$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "I$0", "Z$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0"})
                /* renamed from: com.zykj.huiwei.launcher.viewmodels.ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a */
                    public /* synthetic */ Object f6975a;

                    /* renamed from: b */
                    public int f6976b;

                    /* renamed from: c */
                    public Object f6977c;

                    /* renamed from: e */
                    public Object f6979e;

                    /* renamed from: f */
                    public Object f6980f;

                    /* renamed from: g */
                    public Object f6981g;

                    /* renamed from: h */
                    public Object f6982h;

                    /* renamed from: i */
                    public Object f6983i;

                    /* renamed from: j */
                    public Object f6984j;

                    /* renamed from: k */
                    public int f6985k;

                    /* renamed from: l */
                    public int f6986l;

                    /* renamed from: m */
                    public boolean f6987m;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f6975a = obj;
                        this.f6976b |= Integer.MIN_VALUE;
                        return C61772.this.emit(null, this);
                    }
                }

                public C61772(FlowCollector flowCollector, ChangeAvatarViewModel changeAvatarViewModel) {
                    this.f6973a = flowCollector;
                    this.f6974b = changeAvatarViewModel;
                }

                /* JADX WARN: Code restructure failed: missing block: B:27:0x0147, code lost:
                
                    if (r6.emit(r1, r2) != r3) goto L29;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r18, kotlin.coroutines.Continuation r19) {
                    /*
                        Method dump skipped, instructions count: 333
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.viewmodels.ChangeAvatarViewModel$setPictureAsync$$inlined$map$1.C61772.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1$2.smali:42
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowM5422i.collect(new C61772(flowCollector, this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, null, null, null, new ChangeAvatarViewModel$setPictureAsync$2(this, null), 14, null);
    }
}
