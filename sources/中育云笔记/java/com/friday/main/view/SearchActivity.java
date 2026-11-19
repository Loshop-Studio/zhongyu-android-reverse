package com.friday.main.view;

import android.content.Context;
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
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.paging.CombinedLoadStates;
import androidx.paging.LoadState;
import androidx.paging.PagingData;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.KeyboardUtils;
import com.blankj.utilcode.util.StringUtils;
import com.blankj.utilcode.util.ZipUtils;
import com.friday.common.entity.FileEntity;
import com.friday.common.helper.C5962b;
import com.friday.common.helper.C5963c;
import com.friday.common.widget.dialog.WPSDownloadDialog;
import com.friday.main.R$drawable;
import com.friday.main.R$id;
import com.friday.main.R$layout;
import com.friday.main.R$string;
import com.friday.main.adapter.SearchAdapter;
import com.friday.main.databinding.SearchActivityBinding;
import com.friday.main.view.SearchActivity;
import com.friday.main.viewmodel.SearchViewModel;
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
import p215k2.AbstractC9806x;
import p309qc.C10786q;
import p309qc.InterfaceC10772c;
import p309qc.InterfaceC10773d;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
@Route(path = "/main/SearchActivity")
/* loaded from: classes4.dex */
public final class SearchActivity extends Hilt_SearchActivity<SearchActivityBinding> {

    /* renamed from: g */
    public final InterfaceC10773d f9416g;

    /* renamed from: h */
    public final InterfaceC10773d f9417h = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: v3.f2
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return SearchActivity.m7174h0();
        }
    });

    /* renamed from: i */
    public FileEntity f9418i;

    /* renamed from: com.friday.main.view.SearchActivity$a */
    public static final class ActionModeCallbackC6216a implements ActionMode.Callback {
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

    /* renamed from: com.friday.main.view.SearchActivity$b */
    public static final class C6217b implements Observer, InterfaceC9975q {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9540l f9423c;

        public C6217b(InterfaceC9540l function) {
            AbstractC9979u.m20294g(function, "function");
            this.f9423c = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9975q)) {
                return AbstractC9979u.m20289b(getFunctionDelegate(), ((InterfaceC9975q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9975q
        public final InterfaceC10772c getFunctionDelegate() {
            return this.f9423c;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f9423c.invoke(obj);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.main.view.SearchActivity$initDataSource$1", m26211f = "SearchActivity.kt", m26212l = {246}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.main.view.SearchActivity$initDataSource$1 */
    public static final class C62181 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f9424c;

        @InterfaceC11829d(m26210c = "com.friday.main.view.SearchActivity$initDataSource$1$1", m26211f = "SearchActivity.kt", m26212l = {247}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.main.view.SearchActivity$initDataSource$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f9426c;

            /* renamed from: d */
            public /* synthetic */ Object f9427d;

            /* renamed from: e */
            public final /* synthetic */ SearchActivity f9428e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SearchActivity searchActivity, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f9428e = searchActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f9428e, interfaceC11588c);
                anonymousClass1.f9427d = obj;
                return anonymousClass1;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(PagingData pagingData, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(pagingData, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                PagingData pagingData = (PagingData) this.f9427d;
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.f9426c;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    SearchAdapter searchAdapterM7177Z = this.f9428e.m7177Z();
                    this.f9427d = AbstractC11833h.m26224a(pagingData);
                    this.f9426c = 1;
                    if (searchAdapterM7177Z.submitData(pagingData, this) == objM25952f) {
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
        }

        public C62181(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return SearchActivity.this.new C62181(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f9424c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11594c interfaceC11594cM7285q = SearchActivity.this.m7176Y().m7285q();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SearchActivity.this, null);
                this.f9424c = 1;
                if (AbstractC11596e.m25559i(interfaceC11594cM7285q, anonymousClass1, this) == objM25952f) {
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
            return ((C62181) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public SearchActivity() {
        final InterfaceC9529a interfaceC9529a = null;
        this.f9416g = new ViewModelLazy(AbstractC9983y.m20315b(SearchViewModel.class), new InterfaceC9529a() { // from class: com.friday.main.view.SearchActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.main.view.SearchActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new InterfaceC9529a() { // from class: com.friday.main.view.SearchActivity$special$$inlined$viewModels$default$3
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

    /* renamed from: a0 */
    public static final C10786q m7167a0(SearchActivity searchActivity, FileEntity fileEntity) {
        searchActivity.isShowLoading(false);
        if (fileEntity != null) {
            if (C5962b.f6082a.m5299a().m5294v()) {
                C5963c.f6084a.m5314m(fileEntity.getOfficePath());
            } else {
                AbstractC9806x.a aVar = AbstractC9806x.f23003a;
                Context baseContext = searchActivity.getBaseContext();
                AbstractC9979u.m20293f(baseContext, "getBaseContext(...)");
                if (aVar.m19819c(baseContext, "cn.wps.moffice_eng")) {
                    searchActivity.startActivity(aVar.m19818b(fileEntity.getOfficePath()));
                } else {
                    WPSDownloadDialog wPSDownloadDialog = new WPSDownloadDialog();
                    FragmentManager supportFragmentManager = searchActivity.getSupportFragmentManager();
                    AbstractC9979u.m20293f(supportFragmentManager, "getSupportFragmentManager(...)");
                    wPSDownloadDialog.show(supportFragmentManager, WPSDownloadDialog.class.getSimpleName());
                }
            }
        }
        return C10786q.f26013a;
    }

    /* renamed from: b0 */
    public static final C10786q m7168b0(SearchActivity searchActivity, FileEntity fileEntity) {
        searchActivity.isShowLoading(false);
        if (fileEntity != null) {
            C5963c.m5304l(C5963c.f6084a, fileEntity.getFileId(), true, true, AbstractC9979u.m20289b(fileEntity.getFileType(), "12"), null, 16, null);
        }
        return C10786q.f26013a;
    }

    /* renamed from: c0 */
    public static final C10786q m7169c0(SearchActivity searchActivity, FileEntity fileEntity) {
        if (fileEntity != null) {
            if (!FileUtils.isDir(fileEntity.getLocalFileUrl() + fileEntity.getFileId())) {
                try {
                    ZipUtils.unzipFile(fileEntity.getZipFilePath(), fileEntity.getLocalFileUrl() + fileEntity.getFileId());
                } catch (Exception unused) {
                    FileUtils.delete(fileEntity.getLocalFileUrl() + fileEntity.getFileId());
                    searchActivity.isShowLoading(false);
                    AbstractC11958b.m26588i("微课文件解压失败，请重试");
                    return C10786q.f26013a;
                }
            }
            searchActivity.isShowLoading(false);
            C5963c.f6084a.m5319t(fileEntity.getLocalFileUrl() + fileEntity.getFileId());
        }
        return C10786q.f26013a;
    }

    /* renamed from: d0 */
    public static final C10786q m7170d0(SearchActivity searchActivity, FileEntity fileEntity) {
        searchActivity.isShowLoading(false);
        if (fileEntity != null && FileUtils.isFileExists(fileEntity.getTxtFilePath())) {
            C5963c.m5305q(C5963c.f6084a, fileEntity.getFileId(), fileEntity.getParentId(), fileEntity.getFileName(), null, null, false, null, androidx.compose.material3.MenuKt.InTransitionDuration, null);
        }
        return C10786q.f26013a;
    }

    /* renamed from: e0 */
    public static final void m7171e0(SearchActivity searchActivity, View view) {
        searchActivity.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f0 */
    public static final C10786q m7172f0(SearchActivity searchActivity, RecyclerView recyclerView, CombinedLoadStates loadState) {
        AbstractC9979u.m20294g(loadState, "loadState");
        if ((loadState.getSource().getRefresh() instanceof LoadState.NotLoading) && loadState.getAppend().getEndOfPaginationReached() && searchActivity.m7177Z().getItemCount() < 1) {
            AbstractC9979u.m20291d(recyclerView);
            recyclerView.setVisibility(8);
            TextView tvEmpty = ((SearchActivityBinding) searchActivity.getMBinding()).f9234g;
            AbstractC9979u.m20293f(tvEmpty, "tvEmpty");
            tvEmpty.setVisibility(0);
        } else {
            AbstractC9979u.m20291d(recyclerView);
            recyclerView.setVisibility(0);
            TextView tvEmpty2 = ((SearchActivityBinding) searchActivity.getMBinding()).f9234g;
            AbstractC9979u.m20293f(tvEmpty2, "tvEmpty");
            tvEmpty2.setVisibility(8);
        }
        return C10786q.f26013a;
    }

    /* renamed from: g0 */
    public static final C10786q m7173g0(SearchActivity searchActivity, int i10, FileEntity item) {
        AbstractC9979u.m20294g(item, "item");
        if (i10 == R$id.iv_go) {
            LiveEventBus.get("SearchToDetailPath").post(item);
            searchActivity.finish();
        } else if (i10 == R$id.ll_container) {
            AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(searchActivity), null, null, new SearchActivity$initView$4$2$1(item, searchActivity, null), 3, null);
        }
        return C10786q.f26013a;
    }

    /* renamed from: h0 */
    public static final SearchAdapter m7174h0() {
        return new SearchAdapter();
    }

    /* renamed from: i0 */
    private final void m7175i0(SearchView searchView) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
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

    /* renamed from: Y */
    public final SearchViewModel m7176Y() {
        return (SearchViewModel) this.f9416g.getValue();
    }

    /* renamed from: Z */
    public final SearchAdapter m7177Z() {
        return (SearchAdapter) this.f9417h.getValue();
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.search_activity;
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        initView();
        initDataSource();
    }

    @Override // com.friday.common.base.BaseActivity
    public void initDataSource() {
        super.initDataSource();
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C62181(null), 3, null);
        m7176Y().m7286r().observe(this, new C6217b(new InterfaceC9540l() { // from class: v3.b2
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return SearchActivity.m7167a0(this.f27301c, (FileEntity) obj);
            }
        }));
        m7176Y().m7289v().observe(this, new C6217b(new InterfaceC9540l() { // from class: v3.c2
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return SearchActivity.m7168b0(this.f27307c, (FileEntity) obj);
            }
        }));
        m7176Y().m7287t().observe(this, new C6217b(new InterfaceC9540l() { // from class: v3.d2
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return SearchActivity.m7169c0(this.f27311c, (FileEntity) obj);
            }
        }));
        m7176Y().m7288u().observe(this, new C6217b(new InterfaceC9540l() { // from class: v3.e2
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return SearchActivity.m7170d0(this.f27315c, (FileEntity) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.BaseActivity
    public void initView() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Object objM20054c;
        super.initView();
        ((SearchActivityBinding) getMBinding()).f9233f.setOnClickListener(new View.OnClickListener() { // from class: v3.y1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchActivity.m7171e0(this.f27398c, view);
            }
        });
        Toolbar toolbar = ((SearchActivityBinding) getMBinding()).f9232e;
        setSupportActionBar(toolbar);
        toolbar.setTitle("");
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayShowTitleEnabled(false);
        }
        SearchView searchView = ((SearchActivityBinding) getMBinding()).f9231d;
        searchView.setQueryHint(AbstractC11958b.m26585f(R$string.query_in_all_note));
        searchView.setIconified(false);
        searchView.setIconifiedByDefault(false);
        searchView.onActionViewExpanded();
        AbstractC9979u.m20291d(searchView);
        m7175i0(searchView);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() { // from class: com.friday.main.view.SearchActivity$initView$3$1
            @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
            public boolean onQueryTextChange(String str) {
                return false;
            }

            @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
            public boolean onQueryTextSubmit(String str) {
                if (StringUtils.isEmpty(str)) {
                    AbstractC11958b.m26587h(R$string.input_search_content_please);
                    return false;
                }
                if (str != null) {
                    this.f9429a.m7176Y().m7291x(str);
                }
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
            textView.setCustomInsertionActionModeCallback(new ActionModeCallbackC6216a());
            objM20054c = Result.m20054c(C10786q.f26013a);
        } catch (Throwable th) {
            Result.C9921a c9921a2 = Result.f23263d;
            objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
        }
        Throwable thM20056e = Result.m20056e(objM20054c);
        if (thM20056e != null) {
            thM20056e.printStackTrace();
        }
        final RecyclerView recyclerView = ((SearchActivityBinding) getMBinding()).f9230c;
        recyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getBaseContext(), 1);
        Drawable drawable = ContextCompat.getDrawable(recyclerView.getContext(), R$drawable.shape_search);
        AbstractC9979u.m20291d(drawable);
        dividerItemDecoration.setDrawable(drawable);
        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.setAdapter(m7177Z());
        m7177Z().addLoadStateListener(new InterfaceC9540l() { // from class: v3.z1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj2) {
                return SearchActivity.m7172f0(this.f27405c, recyclerView, (CombinedLoadStates) obj2);
            }
        });
        m7177Z().m6931j(new InterfaceC9544p() { // from class: v3.a2
            @Override // p181hd.InterfaceC9544p
            public final Object invoke(Object obj2, Object obj3) {
                return SearchActivity.m7173g0(this.f27292c, ((Integer) obj2).intValue(), (FileEntity) obj3);
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
