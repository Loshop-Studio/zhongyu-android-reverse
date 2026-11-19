package com.friday.main.view;

import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.NavigationBarItemColors;
import androidx.compose.material3.NavigationBarItemDefaults;
import androidx.compose.material3.NavigationBarKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.node.ComposeUiNode;
import androidx.compose.p014ui.text.TextStyle;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.font.FontStyle;
import androidx.compose.p014ui.text.font.FontWeight;
import androidx.compose.p014ui.text.style.TextAlign;
import androidx.compose.p014ui.text.style.TextDecoration;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptionsBuilder;
import androidx.navigation.Navigator;
import androidx.navigation.PopUpToBuilder;
import androidx.navigation.compose.NavGraphBuilderKt;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;
import com.friday.common.entity.FileEntity;
import com.friday.common.entity.ImageSafetyEntity;
import com.friday.common.entity.ResourceEntity;
import com.friday.common.entity.ShareCacheEntity;
import com.friday.main.view.DBActivity;
import com.friday.main.viewmodel.DbViewModel;
import com.taobao.accs.common.Constants;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p181hd.InterfaceC9546r;
import p296pd.InterfaceC10659g;
import p309qc.C10786q;
import p325rc.AbstractC10978w;
import p371v3.C11476f;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class DBActivity extends Hilt_DBActivity {

    /* renamed from: g */
    public final List f9248g = AbstractC10978w.m24139q(AbstractC6197a.a.f9263c, AbstractC6197a.c.f9265c, AbstractC6197a.d.f9266c, AbstractC6197a.b.f9264c);

    /* renamed from: com.friday.main.view.DBActivity$a */
    public static abstract class AbstractC6197a {

        /* renamed from: a */
        public final String f9261a;

        /* renamed from: b */
        public final String f9262b;

        /* renamed from: com.friday.main.view.DBActivity$a$a */
        public static final class a extends AbstractC6197a {

            /* renamed from: c */
            public static final a f9263c = new a();

            public a() {
                super("file", "File", null);
            }
        }

        /* renamed from: com.friday.main.view.DBActivity$a$b */
        public static final class b extends AbstractC6197a {

            /* renamed from: c */
            public static final b f9264c = new b();

            public b() {
                super("image", "Image", null);
            }
        }

        /* renamed from: com.friday.main.view.DBActivity$a$c */
        public static final class c extends AbstractC6197a {

            /* renamed from: c */
            public static final c f9265c = new c();

            public c() {
                super(Constants.SEND_TYPE_RES, "Res", null);
            }
        }

        /* renamed from: com.friday.main.view.DBActivity$a$d */
        public static final class d extends AbstractC6197a {

            /* renamed from: c */
            public static final d f9266c = new d();

            public d() {
                super("share", "Share", null);
            }
        }

        public /* synthetic */ AbstractC6197a(String str, String str2, AbstractC9972n abstractC9972n) {
            this(str, str2);
        }

        /* renamed from: a */
        public final String m7029a() {
            return this.f9262b;
        }

        /* renamed from: b */
        public final String m7030b() {
            return this.f9261a;
        }

        public AbstractC6197a(String str, String str2) {
            this.f9261a = str;
            this.f9262b = str2;
        }
    }

    /* renamed from: A0 */
    public static final C10786q m6955A0(final DBActivity dBActivity, State state, LazyListScope LazyColumn) {
        AbstractC9979u.m20294g(LazyColumn, "$this$LazyColumn");
        LazyListScope.stickyHeader$default(LazyColumn, (Object) null, (Object) null, (InterfaceC9546r) ComposableLambdaKt.composableLambdaInstance(-581558407, true, new InterfaceC9546r() { // from class: v3.u
            @Override // p181hd.InterfaceC9546r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return DBActivity.m6956B0(this.f27377c, (LazyItemScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 3, (Object) null);
        final List listM7019z0 = m7019z0(state);
        LazyColumn.items(listM7019z0.size(), null, new InterfaceC9540l() { // from class: com.friday.main.view.DBActivity$ListCard$lambda$23$lambda$22$lambda$21$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i10) {
                listM7019z0.get(i10);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new InterfaceC9546r() { // from class: com.friday.main.view.DBActivity$ListCard$lambda$23$lambda$22$lambda$21$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // p181hd.InterfaceC9546r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return C10786q.f26013a;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i10, Composer composer, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = (composer.changed(lazyItemScope) ? 4 : 2) | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    i12 |= composer.changed(i10) ? 32 : 16;
                }
                if (!composer.shouldExecute((i12 & 147) != 146, i12 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i12, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                FileEntity fileEntity = (FileEntity) listM7019z0.get(i10);
                composer.startReplaceGroup(453728274);
                dBActivity.m7027w0(i10 + 1, fileEntity, false, composer, FileEntity.$stable << 3, 4);
                DividerKt.m28663HorizontalDivider9IZ8Weo(null, 0.0f, Color.Companion.m30907getDarkGray0d7_KjU(), composer, 384, 3);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return C10786q.f26013a;
    }

    /* renamed from: B0 */
    public static final C10786q m6956B0(DBActivity dBActivity, LazyItemScope stickyHeader, int i10, Composer composer, int i11) {
        AbstractC9979u.m20294g(stickyHeader, "$this$stickyHeader");
        if (composer.shouldExecute((i11 & 129) != 128, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-581558407, i11, -1, "com.friday.main.view.DBActivity.ListCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DBActivity.kt:126)");
            }
            dBActivity.m7027w0(0, new FileEntity("fileId", 0L, "fileName", "ossFileUrl", "localFileUrl", "fileType", "parentId", "", "updateTime", -1, false, -1, false, null, 0, "md5", false, -1L, false), true, composer, (FileEntity.$stable << 3) | 390, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return C10786q.f26013a;
    }

    /* renamed from: C0 */
    public static final C10786q m6957C0(DBActivity dBActivity, DbViewModel dbViewModel, int i10, Composer composer, int i11) {
        dBActivity.m7028y0(dbViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return C10786q.f26013a;
    }

    /* renamed from: E0 */
    public static final List m6958E0(State state) {
        return (List) state.getValue();
    }

    /* renamed from: F0 */
    public static final C10786q m6959F0(final DBActivity dBActivity, State state, LazyListScope LazyColumn) {
        AbstractC9979u.m20294g(LazyColumn, "$this$LazyColumn");
        LazyListScope.stickyHeader$default(LazyColumn, (Object) null, (Object) null, (InterfaceC9546r) ComposableLambdaKt.composableLambdaInstance(-404667319, true, new InterfaceC9546r() { // from class: v3.s
            @Override // p181hd.InterfaceC9546r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return DBActivity.m6960G0(this.f27372c, (LazyItemScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 3, (Object) null);
        final List listM6958E0 = m6958E0(state);
        LazyColumn.items(listM6958E0.size(), null, new InterfaceC9540l() { // from class: com.friday.main.view.DBActivity$ResCard$lambda$32$lambda$31$lambda$30$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i10) {
                listM6958E0.get(i10);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new InterfaceC9546r() { // from class: com.friday.main.view.DBActivity$ResCard$lambda$32$lambda$31$lambda$30$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // p181hd.InterfaceC9546r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return C10786q.f26013a;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i10, Composer composer, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = (composer.changed(lazyItemScope) ? 4 : 2) | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    i12 |= composer.changed(i10) ? 32 : 16;
                }
                if (!composer.shouldExecute((i12 & 147) != 146, i12 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i12, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                ResourceEntity resourceEntity = (ResourceEntity) listM6958E0.get(i10);
                composer.startReplaceGroup(216402079);
                dBActivity.m7021I0(i10 + 1, resourceEntity, false, composer, ResourceEntity.$stable << 3, 4);
                DividerKt.m28663HorizontalDivider9IZ8Weo(null, 0.0f, Color.Companion.m30907getDarkGray0d7_KjU(), composer, 384, 3);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return C10786q.f26013a;
    }

    /* renamed from: G0 */
    public static final C10786q m6960G0(DBActivity dBActivity, LazyItemScope stickyHeader, int i10, Composer composer, int i11) {
        AbstractC9979u.m20294g(stickyHeader, "$this$stickyHeader");
        if (composer.shouldExecute((i11 & 129) != 128, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-404667319, i11, -1, "com.friday.main.view.DBActivity.ResCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DBActivity.kt:215)");
            }
            dBActivity.m7021I0(0, new ResourceEntity("", "", "", 0, "", "", 0L, 0, false, false, "", ""), true, composer, (ResourceEntity.$stable << 3) | 390, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return C10786q.f26013a;
    }

    /* renamed from: H0 */
    public static final C10786q m6961H0(DBActivity dBActivity, DbViewModel dbViewModel, int i10, Composer composer, int i11) {
        dBActivity.m7020D0(dbViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return C10786q.f26013a;
    }

    /* renamed from: J0 */
    public static final C10786q m6962J0(DBActivity dBActivity, int i10, ResourceEntity resourceEntity, boolean z10, int i11, int i12, Composer composer, int i13) {
        dBActivity.m7021I0(i10, resourceEntity, z10, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return C10786q.f26013a;
    }

    /* renamed from: L0 */
    public static final C10786q m6964L0(DBActivity dBActivity, int i10, ShareCacheEntity shareCacheEntity, boolean z10, int i11, int i12, Composer composer, int i13) {
        dBActivity.m7022K0(i10, shareCacheEntity, z10, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return C10786q.f26013a;
    }

    /* renamed from: N0 */
    public static final List m6967N0(State state) {
        return (List) state.getValue();
    }

    /* renamed from: O0 */
    public static final C10786q m6969O0(final DBActivity dBActivity, State state, LazyListScope LazyColumn) {
        AbstractC9979u.m20294g(LazyColumn, "$this$LazyColumn");
        LazyListScope.stickyHeader$default(LazyColumn, (Object) null, (Object) null, (InterfaceC9546r) ComposableLambdaKt.composableLambdaInstance(-2096423354, true, new InterfaceC9546r() { // from class: v3.t
            @Override // p181hd.InterfaceC9546r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return DBActivity.m6971P0(this.f27376c, (LazyItemScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 3, (Object) null);
        final List listM6967N0 = m6967N0(state);
        LazyColumn.items(listM6967N0.size(), null, new InterfaceC9540l() { // from class: com.friday.main.view.DBActivity$ShareListCard$lambda$41$lambda$40$lambda$39$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i10) {
                listM6967N0.get(i10);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new InterfaceC9546r() { // from class: com.friday.main.view.DBActivity$ShareListCard$lambda$41$lambda$40$lambda$39$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // p181hd.InterfaceC9546r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return C10786q.f26013a;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i10, Composer composer, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = (composer.changed(lazyItemScope) ? 4 : 2) | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    i12 |= composer.changed(i10) ? 32 : 16;
                }
                if (!composer.shouldExecute((i12 & 147) != 146, i12 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i12, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                ShareCacheEntity shareCacheEntity = (ShareCacheEntity) listM6967N0.get(i10);
                composer.startReplaceGroup(1442967955);
                dBActivity.m7022K0(i10 + 1, shareCacheEntity, false, composer, ShareCacheEntity.$stable << 3, 4);
                DividerKt.m28663HorizontalDivider9IZ8Weo(null, 0.0f, Color.Companion.m30907getDarkGray0d7_KjU(), composer, 384, 3);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return C10786q.f26013a;
    }

    /* renamed from: P0 */
    public static final C10786q m6971P0(DBActivity dBActivity, LazyItemScope stickyHeader, int i10, Composer composer, int i11) {
        AbstractC9979u.m20294g(stickyHeader, "$this$stickyHeader");
        if (composer.shouldExecute((i11 & 129) != 128, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2096423354, i11, -1, "com.friday.main.view.DBActivity.ShareListCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DBActivity.kt:296)");
            }
            dBActivity.m7022K0(0, new ShareCacheEntity("", "", 0, 0L, 0L), true, composer, (ShareCacheEntity.$stable << 3) | 390, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return C10786q.f26013a;
    }

    /* renamed from: Q0 */
    public static final C10786q m6973Q0(DBActivity dBActivity, DbViewModel dbViewModel, int i10, Composer composer, int i11) {
        dBActivity.m7023M0(dbViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return C10786q.f26013a;
    }

    /* renamed from: S0 */
    public static final C10786q m6976S0(DBActivity dBActivity, String str, float f10, boolean z10, int i10, int i11, Composer composer, int i12) {
        dBActivity.m7024R0(str, f10, z10, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return C10786q.f26013a;
    }

    /* renamed from: T0 */
    public static final C10786q m6978T0(final DBActivity dBActivity, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-861944054, i10, -1, "com.friday.main.view.DBActivity.onCreate.<anonymous> (DBActivity.kt:68)");
            }
            final NavHostController navHostControllerRememberNavController = NavHostControllerKt.rememberNavController(new Navigator[0], composer, 0);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            final DbViewModel dbViewModel = (DbViewModel) ViewModelKt.viewModel(AbstractC9983y.m20315b(DbViewModel.class), current, (String) null, (ViewModelProvider.Factory) null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer, 0, 0);
            ScaffoldKt.m29010ScaffoldTvnljyQ(null, null, ComposableLambdaKt.rememberComposableLambda(72542671, true, new InterfaceC9544p() { // from class: v3.r
                @Override // p181hd.InterfaceC9544p
                public final Object invoke(Object obj, Object obj2) {
                    return DBActivity.m6992a1(navHostControllerRememberNavController, dBActivity, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-799737191, true, new InterfaceC9545q() { // from class: v3.c0
                @Override // p181hd.InterfaceC9545q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return DBActivity.m6980U0(navHostControllerRememberNavController, dBActivity, dbViewModel, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), composer, 805306752, TypedValues.PositionType.TYPE_PERCENT_Y);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return C10786q.f26013a;
    }

    /* renamed from: U0 */
    public static final C10786q m6980U0(NavHostController navHostController, final DBActivity dBActivity, final DbViewModel dbViewModel, PaddingValues innerPadding, Composer composer, int i10) {
        int i11;
        AbstractC9979u.m20294g(innerPadding, "innerPadding");
        if ((i10 & 6) == 0) {
            i11 = i10 | (composer.changed(innerPadding) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if (composer.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-799737191, i11, -1, "com.friday.main.view.DBActivity.onCreate.<anonymous>.<anonymous> (DBActivity.kt:105)");
            }
            String strM7030b = AbstractC6197a.a.f9263c.m7030b();
            Modifier modifierPadding = PaddingKt.padding(Modifier.Companion, innerPadding);
            boolean zChangedInstance = composer.changedInstance(dBActivity) | composer.changedInstance(dbViewModel);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new InterfaceC9540l() { // from class: v3.d0
                    @Override // p181hd.InterfaceC9540l
                    public final Object invoke(Object obj) {
                        return DBActivity.m6982V0(this.f27308c, dbViewModel, (NavGraphBuilder) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            NavHostKt.NavHost(navHostController, strM7030b, modifierPadding, null, null, null, null, null, null, null, (InterfaceC9540l) objRememberedValue, composer, 0, 0, PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return C10786q.f26013a;
    }

    /* renamed from: V0 */
    public static final C10786q m6982V0(final DBActivity dBActivity, final DbViewModel dbViewModel, NavGraphBuilder NavHost) {
        AbstractC9979u.m20294g(NavHost, "$this$NavHost");
        NavGraphBuilderKt.composable$default(NavHost, AbstractC6197a.a.f9263c.m7030b(), (List) null, (List) null, (InterfaceC9540l) null, (InterfaceC9540l) null, (InterfaceC9540l) null, (InterfaceC9540l) null, (InterfaceC9540l) null, ComposableLambdaKt.composableLambdaInstance(-2011854186, true, new InterfaceC9546r() { // from class: v3.h0
            @Override // p181hd.InterfaceC9546r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return DBActivity.m6984W0(this.f27326c, dbViewModel, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 254, (Object) null);
        NavGraphBuilderKt.composable$default(NavHost, AbstractC6197a.c.f9265c.m7030b(), (List) null, (List) null, (InterfaceC9540l) null, (InterfaceC9540l) null, (InterfaceC9540l) null, (InterfaceC9540l) null, (InterfaceC9540l) null, ComposableLambdaKt.composableLambdaInstance(-142093377, true, new InterfaceC9546r() { // from class: v3.i0
            @Override // p181hd.InterfaceC9546r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return DBActivity.m6986X0(this.f27331c, dbViewModel, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 254, (Object) null);
        NavGraphBuilderKt.composable$default(NavHost, AbstractC6197a.d.f9266c.m7030b(), (List) null, (List) null, (InterfaceC9540l) null, (InterfaceC9540l) null, (InterfaceC9540l) null, (InterfaceC9540l) null, (InterfaceC9540l) null, ComposableLambdaKt.composableLambdaInstance(-312932834, true, new InterfaceC9546r() { // from class: v3.j0
            @Override // p181hd.InterfaceC9546r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return DBActivity.m6988Y0(this.f27337c, dbViewModel, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 254, (Object) null);
        NavGraphBuilderKt.composable$default(NavHost, AbstractC6197a.b.f9264c.m7030b(), (List) null, (List) null, (InterfaceC9540l) null, (InterfaceC9540l) null, (InterfaceC9540l) null, (InterfaceC9540l) null, (InterfaceC9540l) null, ComposableLambdaKt.composableLambdaInstance(-483772291, true, new InterfaceC9546r() { // from class: v3.h
            @Override // p181hd.InterfaceC9546r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return DBActivity.m6990Z0(this.f27324c, dbViewModel, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 254, (Object) null);
        return C10786q.f26013a;
    }

    /* renamed from: W0 */
    public static final C10786q m6984W0(DBActivity dBActivity, DbViewModel dbViewModel, AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i10) {
        AbstractC9979u.m20294g(composable, "$this$composable");
        AbstractC9979u.m20294g(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2011854186, i10, -1, "com.friday.main.view.DBActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DBActivity.kt:110)");
        }
        dBActivity.m7028y0(dbViewModel, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return C10786q.f26013a;
    }

    /* renamed from: X0 */
    public static final C10786q m6986X0(DBActivity dBActivity, DbViewModel dbViewModel, AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i10) {
        AbstractC9979u.m20294g(composable, "$this$composable");
        AbstractC9979u.m20294g(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-142093377, i10, -1, "com.friday.main.view.DBActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DBActivity.kt:111)");
        }
        dBActivity.m7020D0(dbViewModel, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return C10786q.f26013a;
    }

    /* renamed from: Y0 */
    public static final C10786q m6988Y0(DBActivity dBActivity, DbViewModel dbViewModel, AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i10) {
        AbstractC9979u.m20294g(composable, "$this$composable");
        AbstractC9979u.m20294g(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-312932834, i10, -1, "com.friday.main.view.DBActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DBActivity.kt:112)");
        }
        dBActivity.m7023M0(dbViewModel, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return C10786q.f26013a;
    }

    /* renamed from: Z0 */
    public static final C10786q m6990Z0(DBActivity dBActivity, DbViewModel dbViewModel, AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i10) {
        AbstractC9979u.m20294g(composable, "$this$composable");
        AbstractC9979u.m20294g(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-483772291, i10, -1, "com.friday.main.view.DBActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DBActivity.kt:113)");
        }
        dBActivity.m7026r0(dbViewModel, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return C10786q.f26013a;
    }

    /* renamed from: a1 */
    public static final C10786q m6992a1(final NavHostController navHostController, final DBActivity dBActivity, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(72542671, i10, -1, "com.friday.main.view.DBActivity.onCreate.<anonymous>.<anonymous> (DBActivity.kt:72)");
            }
            NavigationBarKt.m28872NavigationBarHsRjFd4(null, Color.Companion.m30915getWhite0d7_KjU(), 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1885867594, true, new InterfaceC9545q() { // from class: v3.e0
                @Override // p181hd.InterfaceC9545q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return DBActivity.m6994b1(navHostController, dBActivity, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), composer, 196656, 29);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return C10786q.f26013a;
    }

    /* renamed from: b1 */
    public static final C10786q m6994b1(final NavHostController navHostController, DBActivity dBActivity, RowScope rowScope, Composer composer, int i10) {
        NavDestination navDestination;
        boolean z10;
        InterfaceC10659g hierarchy;
        RowScope NavigationBar = rowScope;
        Composer composer2 = composer;
        AbstractC9979u.m20294g(NavigationBar, "$this$NavigationBar");
        int i11 = (i10 & 6) == 0 ? i10 | (composer2.changed(NavigationBar) ? 4 : 2) : i10;
        boolean z11 = true;
        if (composer2.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1885867594, i11, -1, "com.friday.main.view.DBActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (DBActivity.kt:75)");
            }
            NavBackStackEntry navBackStackEntryM6996c1 = m6996c1(NavHostControllerKt.currentBackStackEntryAsState(navHostController, composer2, 0));
            NavDestination destination = navBackStackEntryM6996c1 != null ? navBackStackEntryM6996c1.getDestination() : null;
            for (final AbstractC6197a abstractC6197a : dBActivity.f9248g) {
                if (destination == null || (hierarchy = NavDestination.Companion.getHierarchy(destination)) == null) {
                    navDestination = destination;
                    z10 = false;
                } else {
                    Iterator it = hierarchy.iterator();
                    while (it.hasNext()) {
                        if (AbstractC9979u.m20289b(((NavDestination) it.next()).getRoute(), abstractC6197a.m7030b())) {
                            navDestination = destination;
                            z10 = z11;
                            break;
                        }
                    }
                    navDestination = destination;
                    z10 = false;
                }
                NavigationBarItemColors navigationBarItemColorsColors = NavigationBarItemDefaults.INSTANCE.colors(composer2, NavigationBarItemDefaults.$stable);
                Color.Companion companion = Color.Companion;
                NavigationBarItemColors navigationBarItemColorsM28859copy4JmcsL4 = navigationBarItemColorsColors.m28859copy4JmcsL4((118 & 1) != 0 ? navigationBarItemColorsColors.selectedIconColor : companion.m30912getRed0d7_KjU(), (118 & 2) != 0 ? navigationBarItemColorsColors.selectedTextColor : 0L, (118 & 4) != 0 ? navigationBarItemColorsColors.selectedIndicatorColor : 0L, (118 & 8) != 0 ? navigationBarItemColorsColors.unselectedIconColor : companion.m30908getGray0d7_KjU(), (118 & 16) != 0 ? navigationBarItemColorsColors.unselectedTextColor : 0L, (118 & 32) != 0 ? navigationBarItemColorsColors.disabledIconColor : 0L, (118 & 64) != 0 ? navigationBarItemColorsColors.disabledTextColor : 0L);
                boolean zChangedInstance = composer2.changedInstance(navHostController) | composer2.changed(abstractC6197a);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new InterfaceC9529a() { // from class: v3.f0
                        @Override // p181hd.InterfaceC9529a
                        public final Object invoke() {
                            return DBActivity.m6998d1(navHostController, abstractC6197a);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                NavigationBarKt.NavigationBarItem(NavigationBar, z10, (InterfaceC9529a) objRememberedValue, C11476f.f27316a.m25379b(), null, false, ComposableLambdaKt.rememberComposableLambda(1637614943, z11, new InterfaceC9544p() { // from class: v3.g0
                    @Override // p181hd.InterfaceC9544p
                    public final Object invoke(Object obj, Object obj2) {
                        return DBActivity.m7004g1(abstractC6197a, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer2, 54), false, navigationBarItemColorsM28859copy4JmcsL4, null, composer2, (i11 & 14) | 1575936, 344);
                NavigationBar = rowScope;
                composer2 = composer;
                destination = navDestination;
                z11 = z11;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return C10786q.f26013a;
    }

    /* renamed from: c1 */
    public static final NavBackStackEntry m6996c1(State state) {
        return (NavBackStackEntry) state.getValue();
    }

    /* renamed from: d1 */
    public static final C10786q m6998d1(final NavHostController navHostController, AbstractC6197a abstractC6197a) {
        navHostController.navigate(abstractC6197a.m7030b(), new InterfaceC9540l() { // from class: v3.m
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return DBActivity.m7000e1(navHostController, (NavOptionsBuilder) obj);
            }
        });
        return C10786q.f26013a;
    }

    /* renamed from: e1 */
    public static final C10786q m7000e1(NavHostController navHostController, NavOptionsBuilder navigate) {
        AbstractC9979u.m20294g(navigate, "$this$navigate");
        navigate.popUpTo(NavGraph.Companion.findStartDestination(navHostController.getGraph()).getId(), new InterfaceC9540l() { // from class: v3.v
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return DBActivity.m7002f1((PopUpToBuilder) obj);
            }
        });
        navigate.setLaunchSingleTop(true);
        navigate.setRestoreState(true);
        return C10786q.f26013a;
    }

    /* renamed from: f1 */
    public static final C10786q m7002f1(PopUpToBuilder popUpTo) {
        AbstractC9979u.m20294g(popUpTo, "$this$popUpTo");
        popUpTo.setSaveState(true);
        return C10786q.f26013a;
    }

    /* renamed from: g1 */
    public static final C10786q m7004g1(AbstractC6197a abstractC6197a, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1637614943, i10, -1, "com.friday.main.view.DBActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DBActivity.kt:85)");
            }
            TextKt.m29301Text4IGK_g(abstractC6197a.m7029a(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC9540l) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return C10786q.f26013a;
    }

    /* renamed from: q0 */
    public static final C10786q m7013q0(DBActivity dBActivity, int i10, ImageSafetyEntity imageSafetyEntity, boolean z10, int i11, int i12, Composer composer, int i13) {
        dBActivity.m7025p0(i10, imageSafetyEntity, z10, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return C10786q.f26013a;
    }

    /* renamed from: s0 */
    public static final List m7014s0(State state) {
        return (List) state.getValue();
    }

    /* renamed from: t0 */
    public static final C10786q m7015t0(final DBActivity dBActivity, State state, LazyListScope LazyColumn) {
        AbstractC9979u.m20294g(LazyColumn, "$this$LazyColumn");
        LazyListScope.stickyHeader$default(LazyColumn, (Object) null, (Object) null, (InterfaceC9546r) ComposableLambdaKt.composableLambdaInstance(-1557392702, true, new InterfaceC9546r() { // from class: v3.w
            @Override // p181hd.InterfaceC9546r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return DBActivity.m7016u0(this.f27381c, (LazyItemScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 3, (Object) null);
        final List listM7014s0 = m7014s0(state);
        LazyColumn.items(listM7014s0.size(), null, new InterfaceC9540l() { // from class: com.friday.main.view.DBActivity$ImageListCard$lambda$52$lambda$51$lambda$50$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i10) {
                listM7014s0.get(i10);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new InterfaceC9546r() { // from class: com.friday.main.view.DBActivity$ImageListCard$lambda$52$lambda$51$lambda$50$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // p181hd.InterfaceC9546r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return C10786q.f26013a;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i10, Composer composer, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = (composer.changed(lazyItemScope) ? 4 : 2) | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    i12 |= composer.changed(i10) ? 32 : 16;
                }
                if (!composer.shouldExecute((i12 & 147) != 146, i12 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i12, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                ImageSafetyEntity imageSafetyEntity = (ImageSafetyEntity) listM7014s0.get(i10);
                composer.startReplaceGroup(-1144682214);
                dBActivity.m7025p0(i10 + 1, imageSafetyEntity, false, composer, ImageSafetyEntity.$stable << 3, 4);
                DividerKt.m28663HorizontalDivider9IZ8Weo(null, 0.0f, Color.Companion.m30907getDarkGray0d7_KjU(), composer, 384, 3);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return C10786q.f26013a;
    }

    /* renamed from: u0 */
    public static final C10786q m7016u0(DBActivity dBActivity, LazyItemScope stickyHeader, int i10, Composer composer, int i11) {
        AbstractC9979u.m20294g(stickyHeader, "$this$stickyHeader");
        if (composer.shouldExecute((i11 & 129) != 128, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1557392702, i11, -1, "com.friday.main.view.DBActivity.ImageListCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DBActivity.kt:369)");
            }
            dBActivity.m7025p0(0, new ImageSafetyEntity("", 0), true, composer, (ImageSafetyEntity.$stable << 3) | 390, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return C10786q.f26013a;
    }

    /* renamed from: v0 */
    public static final C10786q m7017v0(DBActivity dBActivity, DbViewModel dbViewModel, int i10, Composer composer, int i11) {
        dBActivity.m7026r0(dbViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return C10786q.f26013a;
    }

    /* renamed from: x0 */
    public static final C10786q m7018x0(DBActivity dBActivity, int i10, FileEntity fileEntity, boolean z10, int i11, int i12, Composer composer, int i13) {
        dBActivity.m7027w0(i10, fileEntity, z10, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return C10786q.f26013a;
    }

    /* renamed from: z0 */
    public static final List m7019z0(State state) {
        return (List) state.getValue();
    }

    /* renamed from: D0 */
    public final void m7020D0(final DbViewModel theVm, Composer composer, final int i10) {
        int i11;
        AbstractC9979u.m20294g(theVm, "theVm");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1295314876);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(theVm) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1295314876, i11, -1, "com.friday.main.view.DBActivity.ResCard (DBActivity.kt:210)");
            }
            final State stateCollectAsState = SnapshotStateKt.collectAsState(theVm.m7192s(), null, composerStartRestartGroup, 0, 1);
            Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(Modifier.Companion, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierHorizontalScroll$default);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            InterfaceC9529a constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composerStartRestartGroup);
            Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changed(stateCollectAsState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new InterfaceC9540l() { // from class: v3.k
                    @Override // p181hd.InterfaceC9540l
                    public final Object invoke(Object obj) {
                        return DBActivity.m6959F0(this.f27340c, stateCollectAsState, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (InterfaceC9540l) objRememberedValue, composerStartRestartGroup, 0, 511);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: v3.l
                @Override // p181hd.InterfaceC9544p
                public final Object invoke(Object obj, Object obj2) {
                    return DBActivity.m6961H0(this.f27342c, theVm, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* renamed from: I0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7021I0(final int r15, final com.friday.common.entity.ResourceEntity r16, boolean r17, androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.main.view.DBActivity.m7021I0(int, com.friday.common.entity.ResourceEntity, boolean, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/中育云笔记/smali_classes4/com/friday/main/view/DBActivity.smali:5197
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* renamed from: K0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7022K0(final int r15, final com.friday.common.entity.ShareCacheEntity r16, boolean r17, androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.main.view.DBActivity.m7022K0(int, com.friday.common.entity.ShareCacheEntity, boolean, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/中育云笔记/smali_classes4/com/friday/main/view/DBActivity.smali:5969
    }

    /* renamed from: M0 */
    public final void m7023M0(final DbViewModel theVm, Composer composer, final int i10) {
        int i11;
        AbstractC9979u.m20294g(theVm, "theVm");
        Composer composerStartRestartGroup = composer.startRestartGroup(703382017);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(theVm) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(703382017, i11, -1, "com.friday.main.view.DBActivity.ShareListCard (DBActivity.kt:291)");
            }
            final State stateCollectAsState = SnapshotStateKt.collectAsState(theVm.m7193t(), null, composerStartRestartGroup, 0, 1);
            Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(Modifier.Companion, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierHorizontalScroll$default);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            InterfaceC9529a constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composerStartRestartGroup);
            Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changed(stateCollectAsState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new InterfaceC9540l() { // from class: v3.n
                    @Override // p181hd.InterfaceC9540l
                    public final Object invoke(Object obj) {
                        return DBActivity.m6969O0(this.f27349c, stateCollectAsState, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (InterfaceC9540l) objRememberedValue, composerStartRestartGroup, 0, 511);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: v3.o
                @Override // p181hd.InterfaceC9544p
                public final Object invoke(Object obj, Object obj2) {
                    return DBActivity.m6973Q0(this.f27353c, theVm, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* renamed from: R0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7024R0(final java.lang.String r28, final float r29, boolean r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.main.view.DBActivity.m7024R0(java.lang.String, float, boolean, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/中育云笔记/smali_classes4/com/friday/main/view/DBActivity.smali:7163
    }

    @Override // com.friday.main.view.Hilt_DBActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-861944054, true, new InterfaceC9544p() { // from class: v3.g
            @Override // p181hd.InterfaceC9544p
            public final Object invoke(Object obj, Object obj2) {
                return DBActivity.m6978T0(this.f27321c, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* renamed from: p0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7025p0(final int r15, final com.friday.common.entity.ImageSafetyEntity r16, boolean r17, androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.main.view.DBActivity.m7025p0(int, com.friday.common.entity.ImageSafetyEntity, boolean, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/中育云笔记/smali_classes4/com/friday/main/view/DBActivity.smali:7730
    }

    /* renamed from: r0 */
    public final void m7026r0(final DbViewModel theVm, Composer composer, final int i10) {
        int i11;
        AbstractC9979u.m20294g(theVm, "theVm");
        Composer composerStartRestartGroup = composer.startRestartGroup(1242412669);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(theVm) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1242412669, i11, -1, "com.friday.main.view.DBActivity.ImageListCard (DBActivity.kt:364)");
            }
            final State stateCollectAsState = SnapshotStateKt.collectAsState(theVm.m7191r(), null, composerStartRestartGroup, 0, 1);
            Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(Modifier.Companion, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierHorizontalScroll$default);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            InterfaceC9529a constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composerStartRestartGroup);
            Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changed(stateCollectAsState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new InterfaceC9540l() { // from class: v3.p
                    @Override // p181hd.InterfaceC9540l
                    public final Object invoke(Object obj) {
                        return DBActivity.m7015t0(this.f27359c, stateCollectAsState, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (InterfaceC9540l) objRememberedValue, composerStartRestartGroup, 0, 511);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: v3.q
                @Override // p181hd.InterfaceC9544p
                public final Object invoke(Object obj, Object obj2) {
                    return DBActivity.m7017v0(this.f27364c, theVm, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* renamed from: w0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7027w0(final int r17, final com.friday.common.entity.FileEntity r18, boolean r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.main.view.DBActivity.m7027w0(int, com.friday.common.entity.FileEntity, boolean, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/中育云笔记/smali_classes4/com/friday/main/view/DBActivity.smali:8874
    }

    /* renamed from: y0 */
    public final void m7028y0(final DbViewModel theVm, Composer composer, final int i10) {
        int i11;
        AbstractC9979u.m20294g(theVm, "theVm");
        Composer composerStartRestartGroup = composer.startRestartGroup(1873138398);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(theVm) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1873138398, i11, -1, "com.friday.main.view.DBActivity.ListCard (DBActivity.kt:121)");
            }
            final State stateCollectAsState = SnapshotStateKt.collectAsState(theVm.m7190q(), null, composerStartRestartGroup, 0, 1);
            Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(Modifier.Companion, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierHorizontalScroll$default);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            InterfaceC9529a constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composerStartRestartGroup);
            Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changed(stateCollectAsState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new InterfaceC9540l() { // from class: v3.i
                    @Override // p181hd.InterfaceC9540l
                    public final Object invoke(Object obj) {
                        return DBActivity.m6955A0(this.f27329c, stateCollectAsState, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (InterfaceC9540l) objRememberedValue, composerStartRestartGroup, 0, 511);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: v3.j
                @Override // p181hd.InterfaceC9544p
                public final Object invoke(Object obj, Object obj2) {
                    return DBActivity.m6957C0(this.f27334c, theVm, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
