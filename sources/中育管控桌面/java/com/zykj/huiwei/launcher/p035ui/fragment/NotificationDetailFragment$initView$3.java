package com.zykj.huiwei.launcher.p035ui.fragment;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore、WebView。

import com.zykj.huiwei.launcher.databinding.HwFragmentNotificationDetailBinding;
import com.zykj.huiwei.launcher.proto.C6063a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.fragment.NotificationDetailFragment$initView$3", m7918f = "NotificationDetailFragment.kt", m7919i = {}, m7920l = {76}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
@SourceDebugExtension({"SMAP\nNotificationDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationDetailFragment.kt\ncom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$initView$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,254:1\n360#2,7:255\n*S KotlinDebug\n*F\n+ 1 NotificationDetailFragment.kt\ncom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$initView$3\n*L\n83#1:255,7\n*E\n"})
/* loaded from: classes4.dex */
public final class NotificationDetailFragment$initView$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f6776a;

    /* renamed from: b */
    public final /* synthetic */ NotificationDetailFragment f6777b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationDetailFragment$initView$3(NotificationDetailFragment notificationDetailFragment, Continuation continuation) {
        super(2, continuation);
        this.f6777b = notificationDetailFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NotificationDetailFragment$initView$3(this.f6777b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String string;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f6776a;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow data = this.f6777b.m5956z().getServerBean().getData();
            this.f6776a = 1;
            obj = FlowKt.firstOrNull(data, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        C6063a c6063a = (C6063a) obj;
        if (c6063a != null) {
            NotificationDetailFragment notificationDetailFragment = this.f6777b;
            String webServerUrl = c6063a.getWebServerUrl();
            if (webServerUrl.length() == 0) {
                String schoolCode = c6063a.getSchoolCode();
                if (Intrinsics.areEqual(schoolCode, "dev")) {
                    string = "http://demo.exam.zykj.org/dev";
                } else if (Intrinsics.areEqual(schoolCode, "test")) {
                    string = "https://test.school.zykj.org";
                } else {
                    StringBuilder sb = new StringBuilder();
                    String serverUrl = c6063a.getServerUrl();
                    Intrinsics.checkNotNullExpressionValue(serverUrl, "getServerUrl(...)");
                    List listSplit$default = StringsKt.split$default((CharSequence) serverUrl, new String[]{"."}, false, 0, 6, (Object) null);
                    Iterator it = listSplit$default.iterator();
                    int i7 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i7 = -1;
                            break;
                        }
                        if (StringsKt.contains$default((CharSequence) it.next(), (CharSequence) "api", false, 2, (Object) null)) {
                            break;
                        }
                        i7++;
                    }
                    if (i7 == -1) {
                        i7 = 1;
                    }
                    int size = listSplit$default.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        if (i8 == i7) {
                            sb.append("school");
                        } else {
                            sb.append((String) listSplit$default.get(i8));
                        }
                        if (i8 != listSplit$default.size() - 1) {
                            sb.append(".");
                        }
                    }
                    string = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                }
                webServerUrl = string;
            }
            ((HwFragmentNotificationDetailBinding) notificationDetailFragment.getMBindView()).webView.loadUrl(webServerUrl + "/fastWork.html#noticeMessage");
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((NotificationDetailFragment$initView$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
