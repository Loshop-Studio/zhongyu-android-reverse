package com.zykj.student.dialogue.p076ui.home;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.student.dialogue.bean.resp.FilterType;
import com.zykj.student.dialogue.bean.resp.HomeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p244s6.C9530l0;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomeFilterViewModel$updateCustomTime$1", m13451f = "HomeFilterViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
@SourceDebugExtension({"SMAP\nHomeFilterViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeFilterViewModel.kt\ncom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,380:1\n1563#2:381\n1634#2,3:382\n1563#2:385\n1634#2,3:386\n1563#2:389\n1634#2,3:390\n*S KotlinDebug\n*F\n+ 1 HomeFilterViewModel.kt\ncom/zykj/student/dialogue/ui/home/HomeFilterViewModel$updateCustomTime$1\n*L\n153#1:381\n153#1:382,3\n168#1:385\n168#1:386,3\n185#1:389\n185#1:390,3\n*E\n"})
/* loaded from: classes5.dex */
public final class HomeFilterViewModel$updateCustomTime$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11412a;

    /* renamed from: b */
    public final /* synthetic */ String f11413b;

    /* renamed from: c */
    public final /* synthetic */ String f11414c;

    /* renamed from: d */
    public final /* synthetic */ boolean f11415d;

    /* renamed from: e */
    public final /* synthetic */ int f11416e;

    /* renamed from: f */
    public final /* synthetic */ HomeFilterViewModel f11417f;

    /* renamed from: g */
    public final /* synthetic */ boolean f11418g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFilterViewModel$updateCustomTime$1(String str, String str2, boolean z9, int i9, HomeFilterViewModel homeFilterViewModel, boolean z10, Continuation continuation) {
        super(2, continuation);
        this.f11413b = str;
        this.f11414c = str2;
        this.f11415d = z9;
        this.f11416e = i9;
        this.f11417f = homeFilterViewModel;
        this.f11418g = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeFilterViewModel$updateCustomTime$1(this.f11413b, this.f11414c, this.f11415d, this.f11416e, this.f11417f, this.f11418g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        C9530l0 c9530l0M15730b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f11412a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String str2 = this.f11413b;
        boolean z9 = (str2 == null || str2.length() == 0) && ((str = this.f11414c) == null || str.length() == 0);
        if (!this.f11415d) {
            if (this.f11416e == 0) {
                HomeFilterViewModel homeFilterViewModel = this.f11417f;
                if (this.f11418g) {
                    String str3 = this.f11413b;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = this.f11414c;
                    FilterType.Time.JoinedTime custom = new FilterType.Time.JoinedTime.Custom(str3, str4 != null ? str4 : "");
                    C9530l0 c9530l0M10636g = this.f11417f.m10636g();
                    List<FilterType.Time.JoinedTime> listM15741l = this.f11417f.m10636g().m15741l();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM15741l, 10));
                    for (FilterType.Time.JoinedTime joinedTime : listM15741l) {
                        if (joinedTime instanceof FilterType.Time.JoinedTime.Custom) {
                            joinedTime = custom;
                        }
                        arrayList.add(joinedTime);
                    }
                    if (z9) {
                        custom = HomeKt.getInitialJoinedTime();
                    }
                    c9530l0M15730b = C9530l0.m15730b(c9530l0M10636g, null, null, arrayList, null, null, null, null, null, null, null, null, custom, null, null, null, 30715, null);
                } else {
                    String str5 = this.f11413b;
                    if (str5 == null) {
                        str5 = "";
                    }
                    String str6 = this.f11414c;
                    FilterType.Time.UpdatedTime custom2 = new FilterType.Time.UpdatedTime.Custom(str5, str6 != null ? str6 : "");
                    C9530l0 c9530l0M10636g2 = this.f11417f.m10636g();
                    List<FilterType.Time.UpdatedTime> listM15745p = this.f11417f.m10636g().m15745p();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM15745p, 10));
                    for (FilterType.Time.UpdatedTime updatedTime : listM15745p) {
                        if (updatedTime instanceof FilterType.Time.UpdatedTime.Custom) {
                            updatedTime = custom2;
                        }
                        arrayList2.add(updatedTime);
                    }
                    if (z9) {
                        custom2 = HomeKt.getInitialUpdatedTime();
                    }
                    c9530l0M15730b = C9530l0.m15730b(c9530l0M10636g2, null, arrayList2, null, null, null, null, null, null, null, null, null, null, custom2, null, null, 28669, null);
                }
                homeFilterViewModel.m10643n(c9530l0M15730b);
            } else {
                String str7 = this.f11413b;
                if (str7 == null) {
                    str7 = "";
                }
                String str8 = this.f11414c;
                if (str8 == null) {
                    str8 = "";
                }
                FilterType.Time.FavoriteTime custom3 = new FilterType.Time.FavoriteTime.Custom(str7, str8);
                HomeFilterViewModel homeFilterViewModel2 = this.f11417f;
                C9530l0 c9530l0M10636g3 = homeFilterViewModel2.m10636g();
                List<FilterType.Time> listM15740k = this.f11417f.m10636g().m15740k();
                String str9 = this.f11413b;
                String str10 = this.f11414c;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM15740k, 10));
                for (FilterType.Time custom4 : listM15740k) {
                    if (custom4 instanceof FilterType.Time.FavoriteTime.Custom) {
                        custom4 = new FilterType.Time.FavoriteTime.Custom(str9 == null ? "" : str9, str10 == null ? "" : str10);
                    }
                    arrayList3.add(custom4);
                }
                if (z9) {
                    custom3 = HomeKt.getInitialFavoriteTime();
                }
                homeFilterViewModel2.m10643n(C9530l0.m15730b(c9530l0M10636g3, null, null, null, arrayList3, null, null, null, null, null, null, null, null, null, custom3, null, 24567, null));
            }
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeFilterViewModel$updateCustomTime$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
