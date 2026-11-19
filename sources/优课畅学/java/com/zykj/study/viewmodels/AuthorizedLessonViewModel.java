package com.zykj.study.viewmodels;

import androidx.compose.runtime.internal.StabilityInferred;
import com.zykj.base.BaseViewModel;
import com.zykj.study.bean.UiState;
import com.zykj.study.bean.exercise.AuthorizeLesson;
import com.zykj.study.utils.ContextExtKt;
import kotlin.jvm.internal.AbstractC9133u;
import p169l8.AbstractC9268e;
import p169l8.AbstractC9276m;
import p169l8.AbstractC9281r;
import p169l8.InterfaceC9270g;
import p169l8.InterfaceC9271h;
import p169l8.InterfaceC9275l;
import p169l8.InterfaceC9280q;
import p253t4.C10092a;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class AuthorizedLessonViewModel extends BaseViewModel {

    /* renamed from: a */
    public final C10092a f13843a;

    /* renamed from: b */
    public final InterfaceC9271h f13844b;

    /* renamed from: c */
    public final InterfaceC9271h f13845c;

    /* renamed from: d */
    public int f13846d;

    /* renamed from: e */
    public String f13847e;

    /* renamed from: f */
    public final InterfaceC9271h f13848f;

    /* renamed from: g */
    public final InterfaceC9280q f13849g;

    /* renamed from: h */
    public final InterfaceC9271h f13850h;

    /* renamed from: i */
    public final InterfaceC9280q f13851i;

    /* renamed from: j */
    public String f13852j;

    /* renamed from: k */
    public final InterfaceC9270g f13853k;

    /* renamed from: l */
    public final InterfaceC9275l f13854l;

    /* renamed from: m */
    public final InterfaceC9270g f13855m;

    /* renamed from: n */
    public final InterfaceC9275l f13856n;

    public AuthorizedLessonViewModel(C10092a authorizeLessonRepository) {
        AbstractC9133u.m16133g(authorizeLessonRepository, "authorizeLessonRepository");
        this.f13843a = authorizeLessonRepository;
        Boolean bool = Boolean.FALSE;
        this.f13844b = AbstractC9281r.m17054a(bool);
        this.f13845c = AbstractC9281r.m17054a(bool);
        this.f13847e = "";
        UiState.Initial initial = UiState.Initial.INSTANCE;
        InterfaceC9271h interfaceC9271hM17054a = AbstractC9281r.m17054a(initial);
        this.f13848f = interfaceC9271hM17054a;
        this.f13849g = AbstractC9268e.m17012b(interfaceC9271hM17054a);
        InterfaceC9271h interfaceC9271hM17054a2 = AbstractC9281r.m17054a(initial);
        this.f13850h = interfaceC9271hM17054a2;
        this.f13851i = AbstractC9268e.m17012b(interfaceC9271hM17054a2);
        this.f13852j = "";
        InterfaceC9270g interfaceC9270gM17044b = AbstractC9276m.m17044b(0, 0, null, 7, null);
        this.f13853k = interfaceC9270gM17044b;
        this.f13854l = AbstractC9268e.m17011a(interfaceC9270gM17044b);
        InterfaceC9270g interfaceC9270gM17044b2 = AbstractC9276m.m17044b(0, 0, null, 7, null);
        this.f13855m = interfaceC9270gM17044b2;
        this.f13856n = AbstractC9268e.m17011a(interfaceC9270gM17044b2);
    }

    /* renamed from: f */
    public final void m11985f(int i10, AuthorizeLesson item) {
        AbstractC9133u.m16133g(item, "item");
        ContextExtKt.m11876b(this, null, null, new AuthorizedLessonViewModel$authorizeMember$1(this, item, i10, null), new AuthorizedLessonViewModel$authorizeMember$2(this, null), 3, null);
    }

    /* renamed from: g */
    public final void m11986g(AuthorizeLesson item) {
        AbstractC9133u.m16133g(item, "item");
        ContextExtKt.m11876b(this, null, null, new AuthorizedLessonViewModel$deauthorizeMember$1(this, item, null), new AuthorizedLessonViewModel$deauthorizeMember$2(this, null), 3, null);
    }

    /* renamed from: h */
    public final void m11987h(String keyword) {
        AbstractC9133u.m16133g(keyword, "keyword");
        ContextExtKt.m11876b(this, null, null, new AuthorizedLessonViewModel$doSearch$1(this, keyword, null), new AuthorizedLessonViewModel$doSearch$2(this, null), 3, null);
    }

    /* renamed from: i */
    public final void m11988i() {
        ContextExtKt.m11876b(this, null, null, new AuthorizedLessonViewModel$fetchAuthorizedList$1(this, null), new AuthorizedLessonViewModel$fetchAuthorizedList$2(this, null), 3, null);
    }

    /* renamed from: j */
    public final InterfaceC9280q m11989j() {
        return this.f13849g;
    }

    /* renamed from: k */
    public final InterfaceC9275l m11990k() {
        return this.f13854l;
    }

    /* renamed from: l */
    public final int m11991l() {
        return this.f13846d;
    }

    /* renamed from: m */
    public final InterfaceC9275l m11992m() {
        return this.f13856n;
    }

    /* renamed from: n */
    public final String m11993n() {
        return this.f13852j;
    }

    /* renamed from: o */
    public final InterfaceC9280q m11994o() {
        return this.f13851i;
    }

    /* renamed from: p */
    public final InterfaceC9271h m11995p() {
        return this.f13844b;
    }

    /* renamed from: q */
    public final InterfaceC9271h m11996q() {
        return this.f13845c;
    }

    /* renamed from: r */
    public final void m11997r(int i10) {
        this.f13846d = i10;
    }

    /* renamed from: s */
    public final void m11998s(String str) {
        AbstractC9133u.m16133g(str, "<set-?>");
        this.f13852j = str;
    }
}
