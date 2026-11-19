package com.zykj.mistake.main;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavType;
import androidx.navigation.compose.NavGraphBuilderKt;
import com.zykj.mistake.feature.ask.C4520f;
import com.zykj.mistake.feature.collection.detail.AbstractC4587e;
import com.zykj.mistake.feature.collection.filter.AbstractC4641b;
import com.zykj.mistake.feature.collection.filter.C4661l;
import com.zykj.mistake.feature.home.AbstractC4737j;
import com.zykj.mistake.feature.notebook.detail.AbstractC4868r4;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC5785e0;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import p045d6.C5443s;
import p125n7.C6237l;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6475g;
import p167t4.AbstractC6589b;
import p167t4.AbstractC6596i;
import p175u4.C6616c;
import p175u4.C6620g;
import p207y6.InterfaceC6793q;

/* renamed from: com.zykj.mistake.main.f */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5045f implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f7908a;

    /* renamed from: b */
    public final /* synthetic */ MainShellViewModel f7909b;

    public /* synthetic */ C5045f(MainShellViewModel mainShellViewModel, int i) {
        this.f7908a = i;
        this.f7909b = mainShellViewModel;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        switch (this.f7908a) {
            case 0:
                this.f7909b.m4354b(new C5083x0(((Integer) obj).intValue()));
                break;
            case 1:
                String name = (String) obj;
                AbstractC5830k.m5330g(name, "name");
                this.f7909b.m4354b(new C5023b0(name));
                break;
            case 2:
                C5066p draft = (C5066p) obj;
                AbstractC5830k.m5330g(draft, "draft");
                this.f7909b.m4354b(new C5048g0(draft));
                break;
            default:
                NavGraphBuilder NavHost = (NavGraphBuilder) obj;
                AbstractC5830k.m5330g(NavHost, "$this$NavHost");
                C6237l c6237l = new C6237l(18);
                C6237l c6237l2 = new C6237l(6);
                C6237l c6237l3 = new C6237l(11);
                C6237l c6237l4 = new C6237l(12);
                final int i = 1;
                final MainShellViewModel mainShellViewModel = this.f7909b;
                NavGraphBuilderKt.composable$default(NavHost, "home", (List) null, (List) null, c6237l, c6237l2, c6237l3, c6237l4, (InterfaceC6471c) null, ComposableLambdaKt.composableLambdaInstance(-1437292293, true, new InterfaceC6475g() { // from class: t4.f
                    @Override // p152r6.InterfaceC6475g
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i8 = i;
                        AnimatedContentScope composable = (AnimatedContentScope) obj2;
                        NavBackStackEntry entry = (NavBackStackEntry) obj3;
                        Composer composer = (Composer) obj4;
                        int iIntValue = ((Integer) obj5).intValue();
                        switch (i8) {
                            case 0:
                                AbstractC5830k.m5330g(composable, "$this$composable");
                                AbstractC5830k.m5330g(entry, "entry");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-715042749, iIntValue, -1, "com.zykj.mistake.navigation.MainNavHost.<anonymous>.<anonymous>.<anonymous> (MainNavHost.kt:116)");
                                }
                                AbstractC4868r4.m4237a(entry, mainShellViewModel, composer, (iIntValue >> 3) & 14);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                            case 1:
                                AbstractC5830k.m5330g(composable, "$this$composable");
                                AbstractC5830k.m5330g(entry, "it");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1437292293, iIntValue, -1, "com.zykj.mistake.navigation.MainNavHost.<anonymous>.<anonymous>.<anonymous> (MainNavHost.kt:82)");
                                }
                                AbstractC4737j.m4103a(mainShellViewModel, composer, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                            case 2:
                                AbstractC5830k.m5330g(composable, "$this$composable");
                                AbstractC5830k.m5330g(entry, "entry");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1250944005, iIntValue, -1, "com.zykj.mistake.navigation.MainNavHost.<anonymous>.<anonymous>.<anonymous> (MainNavHost.kt:92)");
                                }
                                AbstractC4587e.m4036a(entry, mainShellViewModel, composer, (iIntValue >> 3) & 14);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                            default:
                                AbstractC5830k.m5330g(composable, "$this$composable");
                                AbstractC5830k.m5330g(entry, "entry");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(267950628, iIntValue, -1, "com.zykj.mistake.navigation.MainNavHost.<anonymous>.<anonymous>.<anonymous> (MainNavHost.kt:104)");
                                }
                                AbstractC4641b.m4074a(entry, mainShellViewModel, composer, (iIntValue >> 3) & 14);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                        }
                        return C5443s.f8405a;
                    }
                }), 134, (Object) null);
                C6237l c6237l5 = new C6237l(13);
                C6237l c6237l6 = new C6237l(14);
                C6237l c6237l7 = new C6237l(15);
                C6237l c6237l8 = new C6237l(16);
                final int i8 = 2;
                ComposableLambda composableLambdaComposableLambdaInstance = ComposableLambdaKt.composableLambdaInstance(1250944005, true, new InterfaceC6475g() { // from class: t4.f
                    @Override // p152r6.InterfaceC6475g
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i82 = i8;
                        AnimatedContentScope composable = (AnimatedContentScope) obj2;
                        NavBackStackEntry entry = (NavBackStackEntry) obj3;
                        Composer composer = (Composer) obj4;
                        int iIntValue = ((Integer) obj5).intValue();
                        switch (i82) {
                            case 0:
                                AbstractC5830k.m5330g(composable, "$this$composable");
                                AbstractC5830k.m5330g(entry, "entry");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-715042749, iIntValue, -1, "com.zykj.mistake.navigation.MainNavHost.<anonymous>.<anonymous>.<anonymous> (MainNavHost.kt:116)");
                                }
                                AbstractC4868r4.m4237a(entry, mainShellViewModel, composer, (iIntValue >> 3) & 14);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                            case 1:
                                AbstractC5830k.m5330g(composable, "$this$composable");
                                AbstractC5830k.m5330g(entry, "it");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1437292293, iIntValue, -1, "com.zykj.mistake.navigation.MainNavHost.<anonymous>.<anonymous>.<anonymous> (MainNavHost.kt:82)");
                                }
                                AbstractC4737j.m4103a(mainShellViewModel, composer, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                            case 2:
                                AbstractC5830k.m5330g(composable, "$this$composable");
                                AbstractC5830k.m5330g(entry, "entry");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1250944005, iIntValue, -1, "com.zykj.mistake.navigation.MainNavHost.<anonymous>.<anonymous>.<anonymous> (MainNavHost.kt:92)");
                                }
                                AbstractC4587e.m4036a(entry, mainShellViewModel, composer, (iIntValue >> 3) & 14);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                            default:
                                AbstractC5830k.m5330g(composable, "$this$composable");
                                AbstractC5830k.m5330g(entry, "entry");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(267950628, iIntValue, -1, "com.zykj.mistake.navigation.MainNavHost.<anonymous>.<anonymous>.<anonymous> (MainNavHost.kt:104)");
                                }
                                AbstractC4641b.m4074a(entry, mainShellViewModel, composer, (iIntValue >> 3) & 14);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                        }
                        return C5443s.f8405a;
                    }
                });
                Map mapM5147A = AbstractC5785e0.m5147A();
                EmptyList emptyList = EmptyList.INSTANCE;
                NavGraphBuilderKt.composable(NavHost, AbstractC5832m.m5340a(C6616c.class), (Map<InterfaceC6793q, NavType<?>>) mapM5147A, emptyList, c6237l5, c6237l6, c6237l7, c6237l8, (InterfaceC6471c) null, composableLambdaComposableLambdaInstance);
                final int i9 = 3;
                NavGraphBuilderKt.composable(NavHost, AbstractC5832m.m5340a(C4661l.class), (Map<InterfaceC6793q, NavType<?>>) AbstractC6596i.f11014c, emptyList, new C6237l(19), new C6237l(20), new C6237l(21), new C6237l(22), (InterfaceC6471c) null, ComposableLambdaKt.composableLambdaInstance(267950628, true, new InterfaceC6475g() { // from class: t4.f
                    @Override // p152r6.InterfaceC6475g
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i82 = i9;
                        AnimatedContentScope composable = (AnimatedContentScope) obj2;
                        NavBackStackEntry entry = (NavBackStackEntry) obj3;
                        Composer composer = (Composer) obj4;
                        int iIntValue = ((Integer) obj5).intValue();
                        switch (i82) {
                            case 0:
                                AbstractC5830k.m5330g(composable, "$this$composable");
                                AbstractC5830k.m5330g(entry, "entry");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-715042749, iIntValue, -1, "com.zykj.mistake.navigation.MainNavHost.<anonymous>.<anonymous>.<anonymous> (MainNavHost.kt:116)");
                                }
                                AbstractC4868r4.m4237a(entry, mainShellViewModel, composer, (iIntValue >> 3) & 14);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                            case 1:
                                AbstractC5830k.m5330g(composable, "$this$composable");
                                AbstractC5830k.m5330g(entry, "it");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1437292293, iIntValue, -1, "com.zykj.mistake.navigation.MainNavHost.<anonymous>.<anonymous>.<anonymous> (MainNavHost.kt:82)");
                                }
                                AbstractC4737j.m4103a(mainShellViewModel, composer, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                            case 2:
                                AbstractC5830k.m5330g(composable, "$this$composable");
                                AbstractC5830k.m5330g(entry, "entry");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1250944005, iIntValue, -1, "com.zykj.mistake.navigation.MainNavHost.<anonymous>.<anonymous>.<anonymous> (MainNavHost.kt:92)");
                                }
                                AbstractC4587e.m4036a(entry, mainShellViewModel, composer, (iIntValue >> 3) & 14);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                            default:
                                AbstractC5830k.m5330g(composable, "$this$composable");
                                AbstractC5830k.m5330g(entry, "entry");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(267950628, iIntValue, -1, "com.zykj.mistake.navigation.MainNavHost.<anonymous>.<anonymous>.<anonymous> (MainNavHost.kt:104)");
                                }
                                AbstractC4641b.m4074a(entry, mainShellViewModel, composer, (iIntValue >> 3) & 14);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                        }
                        return C5443s.f8405a;
                    }
                }));
                final int i10 = 0;
                NavGraphBuilderKt.composable(NavHost, AbstractC5832m.m5340a(C6620g.class), (Map<InterfaceC6793q, NavType<?>>) AbstractC6596i.f11013b, emptyList, new C6237l(23), new C6237l(24), new C6237l(4), new C6237l(5), (InterfaceC6471c) null, ComposableLambdaKt.composableLambdaInstance(-715042749, true, new InterfaceC6475g() { // from class: t4.f
                    @Override // p152r6.InterfaceC6475g
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i82 = i10;
                        AnimatedContentScope composable = (AnimatedContentScope) obj2;
                        NavBackStackEntry entry = (NavBackStackEntry) obj3;
                        Composer composer = (Composer) obj4;
                        int iIntValue = ((Integer) obj5).intValue();
                        switch (i82) {
                            case 0:
                                AbstractC5830k.m5330g(composable, "$this$composable");
                                AbstractC5830k.m5330g(entry, "entry");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-715042749, iIntValue, -1, "com.zykj.mistake.navigation.MainNavHost.<anonymous>.<anonymous>.<anonymous> (MainNavHost.kt:116)");
                                }
                                AbstractC4868r4.m4237a(entry, mainShellViewModel, composer, (iIntValue >> 3) & 14);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                            case 1:
                                AbstractC5830k.m5330g(composable, "$this$composable");
                                AbstractC5830k.m5330g(entry, "it");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1437292293, iIntValue, -1, "com.zykj.mistake.navigation.MainNavHost.<anonymous>.<anonymous>.<anonymous> (MainNavHost.kt:82)");
                                }
                                AbstractC4737j.m4103a(mainShellViewModel, composer, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                            case 2:
                                AbstractC5830k.m5330g(composable, "$this$composable");
                                AbstractC5830k.m5330g(entry, "entry");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1250944005, iIntValue, -1, "com.zykj.mistake.navigation.MainNavHost.<anonymous>.<anonymous>.<anonymous> (MainNavHost.kt:92)");
                                }
                                AbstractC4587e.m4036a(entry, mainShellViewModel, composer, (iIntValue >> 3) & 14);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                            default:
                                AbstractC5830k.m5330g(composable, "$this$composable");
                                AbstractC5830k.m5330g(entry, "entry");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(267950628, iIntValue, -1, "com.zykj.mistake.navigation.MainNavHost.<anonymous>.<anonymous>.<anonymous> (MainNavHost.kt:104)");
                                }
                                AbstractC4641b.m4074a(entry, mainShellViewModel, composer, (iIntValue >> 3) & 14);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                break;
                        }
                        return C5443s.f8405a;
                    }
                }));
                NavGraphBuilderKt.composable(NavHost, AbstractC5832m.m5340a(C4520f.class), (Map<InterfaceC6793q, NavType<?>>) AbstractC6596i.f11015d, emptyList, new C6237l(7), new C6237l(8), new C6237l(9), new C6237l(10), (InterfaceC6471c) null, AbstractC6589b.f10999a);
                break;
        }
        return C5443s.f8405a;
    }
}
