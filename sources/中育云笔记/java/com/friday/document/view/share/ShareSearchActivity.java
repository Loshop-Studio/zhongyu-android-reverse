package com.friday.document.view.share;

import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.view.MenuKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.KeyboardUtils;
import com.blankj.utilcode.util.ZipUtils;
import com.friday.common.entity.FileType;
import com.friday.common.helper.C5963c;
import com.friday.document.R$drawable;
import com.friday.document.R$id;
import com.friday.document.R$layout;
import com.friday.document.R$string;
import com.friday.document.databinding.ShareSearchActivityBinding;
import com.friday.document.model.ShareFile;
import com.friday.document.view.share.ShareSearchActivity;
import com.friday.document.viewmodel.StudentShareViewModel;
import com.jeremyliao.liveeventbus.LiveEventBus;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC9923a;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import kotlin.jvm.internal.InterfaceC9975q;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p309qc.InterfaceC10772c;
import p309qc.InterfaceC10773d;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11612u;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
@Route(path = "/document/ShareSearchActivity")
/* loaded from: classes3.dex */
public final class ShareSearchActivity extends Hilt_ShareSearchActivity<ShareSearchActivityBinding> {

    /* renamed from: g */
    public final InterfaceC10773d f7634g;

    /* renamed from: h */
    public final InterfaceC10773d f7635h = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: x2.m
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return ShareSearchActivity.m6085d0();
        }
    });

    /* renamed from: com.friday.document.view.share.ShareSearchActivity$a */
    public static final class ActionModeCallbackC6076a implements ActionMode.Callback {
        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            List listM24139q = AbstractC10978w.m24139q("粘贴", "全选");
            if (menu == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            for (MenuItem menuItem : MenuKt.getChildren(menu)) {
                if (!AbstractC10947g0.m23932e0(listM24139q, menuItem.getTitle())) {
                    arrayList.add(Integer.valueOf(menuItem.getItemId()));
                }
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                menu.removeItem(((Number) obj).intValue());
            }
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    /* renamed from: com.friday.document.view.share.ShareSearchActivity$b */
    public static final class C6077b implements Observer, InterfaceC9975q {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9540l f7640c;

        public C6077b(InterfaceC9540l function) {
            AbstractC9979u.m20294g(function, "function");
            this.f7640c = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9975q)) {
                return AbstractC9979u.m20289b(getFunctionDelegate(), ((InterfaceC9975q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9975q
        public final InterfaceC10772c getFunctionDelegate() {
            return this.f7640c;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f7640c.invoke(obj);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.document.view.share.ShareSearchActivity$initDataSource$1", m26211f = "ShareSearchActivity.kt", m26212l = {210}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.share.ShareSearchActivity$initDataSource$1 */
    public static final class C60781 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7641c;

        @InterfaceC11829d(m26210c = "com.friday.document.view.share.ShareSearchActivity$initDataSource$1$1", m26211f = "ShareSearchActivity.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.document.view.share.ShareSearchActivity$initDataSource$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f7643c;

            /* renamed from: d */
            public /* synthetic */ Object f7644d;

            /* renamed from: e */
            public final /* synthetic */ ShareSearchActivity f7645e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ShareSearchActivity shareSearchActivity, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f7645e = shareSearchActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f7645e, interfaceC11588c);
                anonymousClass1.f7644d = obj;
                return anonymousClass1;
            }

            @Override // p181hd.InterfaceC9544p
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(List list, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(list, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                List list = (List) this.f7644d;
                AbstractC11725a.m25952f();
                if (this.f7643c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                if (list.isEmpty()) {
                    RecyclerView rvSearch = ShareSearchActivity.m6077T(this.f7645e).f6632c;
                    AbstractC9979u.m20293f(rvSearch, "rvSearch");
                    rvSearch.setVisibility(8);
                    TextView tvEmpty = ShareSearchActivity.m6077T(this.f7645e).f6636g;
                    AbstractC9979u.m20293f(tvEmpty, "tvEmpty");
                    tvEmpty.setVisibility(0);
                } else {
                    RecyclerView rvSearch2 = ShareSearchActivity.m6077T(this.f7645e).f6632c;
                    AbstractC9979u.m20293f(rvSearch2, "rvSearch");
                    rvSearch2.setVisibility(0);
                    TextView tvEmpty2 = ShareSearchActivity.m6077T(this.f7645e).f6636g;
                    AbstractC9979u.m20293f(tvEmpty2, "tvEmpty");
                    tvEmpty2.setVisibility(8);
                    this.f7645e.m6087X().submitList(list);
                }
                return C10786q.f26013a;
            }
        }

        public C60781(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return ShareSearchActivity.this.new C60781(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f7641c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11612u interfaceC11612uM6465z = ShareSearchActivity.this.m6086W().m6465z();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ShareSearchActivity.this, null);
                this.f7641c = 1;
                if (AbstractC11596e.m25559i(interfaceC11612uM6465z, anonymousClass1, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C60781) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public ShareSearchActivity() {
        final InterfaceC9529a interfaceC9529a = null;
        this.f7634g = new ViewModelLazy(AbstractC9983y.m20315b(StudentShareViewModel.class), new InterfaceC9529a() { // from class: com.friday.document.view.share.ShareSearchActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.document.view.share.ShareSearchActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new InterfaceC9529a() { // from class: com.friday.document.view.share.ShareSearchActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC9529a interfaceC9529a2 = interfaceC9529a;
                return (interfaceC9529a2 == null || (creationExtras = (CreationExtras) interfaceC9529a2.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: T */
    public static final /* synthetic */ ShareSearchActivityBinding m6077T(ShareSearchActivity shareSearchActivity) {
        return (ShareSearchActivityBinding) shareSearchActivity.getMBinding();
    }

    /* renamed from: Y */
    public static final C10786q m6080Y(ShareSearchActivity shareSearchActivity, ShareFile shareFile) {
        shareSearchActivity.isShowLoading(false);
        if (shareFile != null) {
            C5963c.f6084a.m5313k(shareFile.getFileId(), true, false, AbstractC9979u.m20289b(shareFile.getType(), "12"), shareFile.getShareTime());
        } else {
            AbstractC11958b.m26587h(R$string.download_error);
        }
        return C10786q.f26013a;
    }

    /* renamed from: Z */
    public static final C10786q m6081Z(ShareSearchActivity shareSearchActivity, ShareFile shareFile) {
        shareSearchActivity.isShowLoading(false);
        if (shareFile != null) {
            C5963c.m5305q(C5963c.f6084a, shareFile.getFileId(), shareFile.getParentId(), shareFile.getFileName(), null, shareFile.getShareTime(), false, shareFile.getTxtFilePath(), 8, null);
        } else {
            AbstractC11958b.m26587h(R$string.download_error);
        }
        return C10786q.f26013a;
    }

    /* renamed from: a0 */
    public static final C10786q m6082a0(ShareSearchActivity shareSearchActivity, ShareFile shareFile) {
        if (shareFile != null) {
            String type = shareFile.getType();
            if (AbstractC9979u.m20289b(type, FileType.PICTURE)) {
                shareSearchActivity.isShowLoading(false);
                C5963c.f6084a.m5309d(shareFile.getOthersPath(), true);
            } else if (AbstractC9979u.m20289b(type, "11")) {
                shareSearchActivity.isShowLoading(true);
                if (!FileUtils.isDir(shareFile.shareNotePath() + shareFile.getFileId())) {
                    try {
                        ZipUtils.unzipFile(shareFile.shareNotePath() + shareFile.getFileId() + ".zip", shareFile.shareNotePath() + shareFile.getFileId());
                    } catch (Exception unused) {
                        FileUtils.delete(shareFile.shareNotePath() + shareFile.getFileId());
                        shareSearchActivity.isShowLoading(false);
                        AbstractC11958b.m26588i("微课文件解压失败，请重试");
                        return C10786q.f26013a;
                    }
                }
                shareSearchActivity.isShowLoading(false);
                C5963c.f6084a.m5319t(shareFile.shareNotePath() + shareFile.getFileId());
            } else {
                shareSearchActivity.isShowLoading(false);
                C5963c.f6084a.m5314m(shareFile.getOthersPath());
            }
        } else {
            AbstractC11958b.m26587h(R$string.download_error);
        }
        return C10786q.f26013a;
    }

    /* renamed from: b0 */
    public static final void m6083b0(ShareSearchActivity shareSearchActivity, View view) {
        shareSearchActivity.finish();
    }

    /* renamed from: c0 */
    public static final C10786q m6084c0(ShareSearchActivity shareSearchActivity, int i10, ShareFile shareFile) {
        AbstractC9979u.m20294g(shareFile, "shareFile");
        if (i10 == R$id.iv_go) {
            LiveEventBus.get("ShareSearchToDetailPath").post(shareFile);
            shareSearchActivity.finish();
        } else if (i10 == R$id.ll_container) {
            AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(shareSearchActivity), null, null, new ShareSearchActivity$initView$4$1$1(shareFile, shareSearchActivity, null), 3, null);
        }
        return C10786q.f26013a;
    }

    /* renamed from: d0 */
    public static final ShareSearchAdapter m6085d0() {
        return new ShareSearchAdapter();
    }

    /* renamed from: W */
    public final StudentShareViewModel m6086W() {
        return (StudentShareViewModel) this.f7634g.getValue();
    }

    /* renamed from: X */
    public final ShareSearchAdapter m6087X() {
        return (ShareSearchAdapter) this.f7635h.getValue();
    }

    /* renamed from: e0 */
    public final void m6088e0(SearchView searchView) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        try {
            Field declaredField = searchView.getClass().getDeclaredField("mSearchPlate");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(searchView);
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type android.view.View");
            ((View) obj).setBackgroundColor(0);
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
        } catch (NoSuchFieldException e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.share_search_activity;
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        initView();
        initDataSource();
    }

    @Override // com.friday.common.base.BaseActivity
    public void initDataSource() {
        super.initDataSource();
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C60781(null), 3, null);
        m6086W().m6453A().observe(this, new C6077b(new InterfaceC9540l() { // from class: x2.p
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ShareSearchActivity.m6080Y(this.f27954c, (ShareFile) obj);
            }
        }));
        m6086W().m6454B().observe(this, new C6077b(new InterfaceC9540l() { // from class: x2.q
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ShareSearchActivity.m6081Z(this.f27955c, (ShareFile) obj);
            }
        }));
        m6086W().m6463x().observe(this, new C6077b(new InterfaceC9540l() { // from class: x2.r
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ShareSearchActivity.m6082a0(this.f27956c, (ShareFile) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.BaseActivity
    public void initView() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Object objM20054c;
        super.initView();
        ((ShareSearchActivityBinding) getMBinding()).f6635f.setOnClickListener(new View.OnClickListener() { // from class: x2.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShareSearchActivity.m6083b0(this.f27952c, view);
            }
        });
        Toolbar toolbar = ((ShareSearchActivityBinding) getMBinding()).f6634e;
        setSupportActionBar(toolbar);
        toolbar.setTitle("");
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayShowTitleEnabled(false);
        }
        SearchView searchView = ((ShareSearchActivityBinding) getMBinding()).f6633d;
        searchView.setQueryHint(AbstractC11958b.m26585f(R$string.query_in_all_share));
        searchView.setIconified(false);
        searchView.setIconifiedByDefault(false);
        searchView.onActionViewExpanded();
        AbstractC9979u.m20291d(searchView);
        m6088e0(searchView);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() { // from class: com.friday.document.view.share.ShareSearchActivity$initView$3$1
            @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
            public boolean onQueryTextChange(String str) {
                return false;
            }

            @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
            public boolean onQueryTextSubmit(String str) {
                if (str == null || str.length() == 0) {
                    AbstractC11958b.m26587h(R$string.input_search_content_please);
                    return false;
                }
                AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this.f7646a), null, null, new ShareSearchActivity$initView$3$1$onQueryTextSubmit$1(this.f7646a, str, null), 3, null);
                return false;
            }
        });
        try {
            Result.C9921a c9921a = Result.f23263d;
            Field declaredField = SearchView.class.getDeclaredField("mSearchSrcTextView");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(searchView);
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) obj;
            Field declaredField2 = TextView.class.getDeclaredField("mDeviceProvisionedState");
            declaredField2.setAccessible(true);
            declaredField2.set(textView, 1);
            textView.setCustomInsertionActionModeCallback(new ActionModeCallbackC6076a());
            objM20054c = Result.m20054c(C10786q.f26013a);
        } catch (Throwable th) {
            Result.C9921a c9921a2 = Result.f23263d;
            objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
        }
        Throwable thM20056e = Result.m20056e(objM20054c);
        if (thM20056e != null) {
            thM20056e.printStackTrace();
        }
        RecyclerView recyclerView = ((ShareSearchActivityBinding) getMBinding()).f6632c;
        recyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getBaseContext(), 1);
        Drawable drawable = ContextCompat.getDrawable(recyclerView.getContext(), R$drawable.shape_search);
        AbstractC9979u.m20291d(drawable);
        dividerItemDecoration.setDrawable(drawable);
        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.setAdapter(m6087X());
        m6087X().m6096g(new InterfaceC9544p() { // from class: x2.o
            @Override // p181hd.InterfaceC9544p
            public final Object invoke(Object obj2, Object obj3) {
                return ShareSearchActivity.m6084c0(this.f27953c, ((Integer) obj2).intValue(), (ShareFile) obj3);
            }
        });
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        AbstractC9979u.m20294g(item, "item");
        if (item.getItemId() == 16908332) {
            KeyboardUtils.hideSoftInput(this);
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
