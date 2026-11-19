package com.zykj.student.dialogue.p076ui.home.category;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModelKt;
import com.zykj.student.dialogue.base.BaseViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p158k6.InterfaceC8287g;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\u00020\b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b¢\u0006\u0004\b\u001e\u0010\u000fJ\u0015\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\b¢\u0006\u0004\b#\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010+\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R \u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R#\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0010068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00100:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020@068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u00108R\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020@0:8\u0006¢\u0006\f\n\u0004\bC\u0010<\u001a\u0004\bD\u0010>R\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u0006068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u00108R\u001d\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00060:8\u0006¢\u0006\f\n\u0004\bH\u0010<\u001a\u0004\bI\u0010>¨\u0006K"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;", "Lcom/zykj/student/dialogue/base/BaseViewModel;", "Lk6/g;", "dialogueApi", "<init>", "(Lk6/g;)V", "", "bool", "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "(Z)V", "", "Lcom/zykj/student/dialogue/bean/resp/CatalogResp;", "categoryList", "D", "(Ljava/util/List;)V", "Lcom/zykj/student/dialogue/ui/home/category/b;", "page", "B", "(Lcom/zykj/student/dialogue/ui/home/category/b;)V", "", "id", "", HintConstants.AUTOFILL_HINT_NAME, ExifInterface.LONGITUDE_EAST, "(JLjava/lang/String;)V", "t", "()V", "Lcom/zykj/student/dialogue/bean/req/SortCatalogReq;", "req", "C", "r", "(Ljava/lang/String;)V", "s", "(J)V", "z", "c", "Lk6/g;", "value", "d", "Z", "y", "()Z", "tabChanged", "Lkotlinx/coroutines/flow/MutableStateFlow;", "e", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_categories", "Lkotlinx/coroutines/flow/StateFlow;", "f", "Lkotlinx/coroutines/flow/StateFlow;", "u", "()Lkotlinx/coroutines/flow/StateFlow;", "categories", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "g", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_pageEvent", "Lkotlinx/coroutines/flow/SharedFlow;", "h", "Lkotlinx/coroutines/flow/SharedFlow;", "x", "()Lkotlinx/coroutines/flow/SharedFlow;", "pageEvent", "Lcom/zykj/student/dialogue/ui/home/category/a;", "i", "_categoryResultEvent", "j", "v", "categoryResultEvent", "k", "_dismissDialog", "l", "w", "dismissDialog", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class EditCategoryViewModel extends BaseViewModel {

    /* renamed from: c, reason: from kotlin metadata */
    public final InterfaceC8287g dialogueApi;

    /* renamed from: d, reason: from kotlin metadata */
    public boolean tabChanged;

    /* renamed from: e, reason: from kotlin metadata */
    public final MutableStateFlow _categories;

    /* renamed from: f, reason: from kotlin metadata */
    public final StateFlow categories;

    /* renamed from: g, reason: from kotlin metadata */
    public final MutableSharedFlow _pageEvent;

    /* renamed from: h, reason: from kotlin metadata */
    public final SharedFlow pageEvent;

    /* renamed from: i, reason: from kotlin metadata */
    public final MutableSharedFlow _categoryResultEvent;

    /* renamed from: j, reason: from kotlin metadata */
    public final SharedFlow categoryResultEvent;

    /* renamed from: k, reason: from kotlin metadata */
    public final MutableSharedFlow _dismissDialog;

    /* renamed from: l, reason: from kotlin metadata */
    public final SharedFlow dismissDialog;

    public EditCategoryViewModel(InterfaceC8287g dialogueApi) {
        Intrinsics.checkNotNullParameter(dialogueApi, "dialogueApi");
        this.dialogueApi = dialogueApi;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._categories = MutableStateFlow;
        this.categories = MutableStateFlow;
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._pageEvent = mutableSharedFlowMutableSharedFlow$default;
        this.pageEvent = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._categoryResultEvent = mutableSharedFlowMutableSharedFlow$default2;
        this.categoryResultEvent = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._dismissDialog = mutableSharedFlowMutableSharedFlow$default3;
        this.dismissDialog = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
    }

    /* renamed from: A */
    public final void m10940A(boolean bool) {
        this.tabChanged = bool;
    }

    /* renamed from: B */
    public final void m10941B(AbstractC7620b page) {
        Intrinsics.checkNotNullParameter(page, "page");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EditCategoryViewModel$showPage$1(this, page, null), 3, null);
    }

    /* renamed from: C */
    public final void m10942C(List req) {
        Intrinsics.checkNotNullParameter(req, "req");
        BaseViewModel.m9917f(this, null, false, null, null, new EditCategoryViewModel$sortCategory$1(this, null), new EditCategoryViewModel$sortCategory$2(this, req, null), 15, null);
    }

    /* renamed from: D */
    public final void m10943D(List categoryList) {
        Intrinsics.checkNotNullParameter(categoryList, "categoryList");
        this._categories.setValue(categoryList);
    }

    /* renamed from: E */
    public final void m10944E(long id, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        BaseViewModel.m9917f(this, null, false, null, null, new EditCategoryViewModel$updateCategory$1(this, null), new EditCategoryViewModel$updateCategory$2(this, id, name, null), 15, null);
    }

    /* renamed from: r */
    public final void m10945r(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        BaseViewModel.m9917f(this, null, false, null, null, new EditCategoryViewModel$addCategory$1(this, null), new EditCategoryViewModel$addCategory$2(this, name, null), 15, null);
    }

    /* renamed from: s */
    public final void m10946s(long id) {
        BaseViewModel.m9917f(this, null, false, null, null, new EditCategoryViewModel$deleteCategory$1(null), new EditCategoryViewModel$deleteCategory$2(this, id, null), 15, null);
    }

    /* renamed from: t */
    public final void m10947t() {
        BaseViewModel.m9917f(this, null, false, null, null, null, new EditCategoryViewModel$getAllCategories$1(this, null), 31, null);
    }

    /* renamed from: u, reason: from getter */
    public final StateFlow getCategories() {
        return this.categories;
    }

    /* renamed from: v, reason: from getter */
    public final SharedFlow getCategoryResultEvent() {
        return this.categoryResultEvent;
    }

    /* renamed from: w, reason: from getter */
    public final SharedFlow getDismissDialog() {
        return this.dismissDialog;
    }

    /* renamed from: x, reason: from getter */
    public final SharedFlow getPageEvent() {
        return this.pageEvent;
    }

    /* renamed from: y, reason: from getter */
    public final boolean getTabChanged() {
        return this.tabChanged;
    }

    /* renamed from: z */
    public final void m10953z() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EditCategoryViewModel$makeDialogDismiss$1(this, null), 3, null);
    }
}
