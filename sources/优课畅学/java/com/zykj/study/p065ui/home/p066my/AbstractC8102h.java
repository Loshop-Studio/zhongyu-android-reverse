package com.zykj.study.p065ui.home.p066my;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.zykj.study.R$id;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: com.zykj.study.ui.home.my.h */
/* loaded from: classes5.dex */
public abstract class AbstractC8102h {

    /* renamed from: a */
    public static final d f13554a = new d(null);

    /* renamed from: com.zykj.study.ui.home.my.h$a */
    public static final class a implements NavDirections {

        /* renamed from: a */
        public final String f13555a;

        /* renamed from: b */
        public final String f13556b;

        /* renamed from: c */
        public final int f13557c;

        public a(String start, String end) {
            AbstractC9133u.m16133g(start, "start");
            AbstractC9133u.m16133g(end, "end");
            this.f13555a = start;
            this.f13556b = end;
            this.f13557c = R$id.action_managementSubscribeFragment_to_dateSelectedDialog;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC9133u.m16128b(this.f13555a, aVar.f13555a) && AbstractC9133u.m16128b(this.f13556b, aVar.f13556b);
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f13557c;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("start", this.f13555a);
            bundle.putString("end", this.f13556b);
            return bundle;
        }

        public int hashCode() {
            return (this.f13555a.hashCode() * 31) + this.f13556b.hashCode();
        }

        public String toString() {
            return "ActionManagementSubscribeFragmentToDateSelectedDialog(start=" + this.f13555a + ", end=" + this.f13556b + ")";
        }
    }

    /* renamed from: com.zykj.study.ui.home.my.h$b */
    public static final class b implements NavDirections {

        /* renamed from: a */
        public final String f13558a;

        /* renamed from: b */
        public final int f13559b;

        public b(String number) {
            AbstractC9133u.m16133g(number, "number");
            this.f13558a = number;
            this.f13559b = R$id.action_managementSubscribeFragment_to_deleteSubscribeBatchDialog;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC9133u.m16128b(this.f13558a, ((b) obj).f13558a);
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f13559b;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("number", this.f13558a);
            return bundle;
        }

        public int hashCode() {
            return this.f13558a.hashCode();
        }

        public String toString() {
            return "ActionManagementSubscribeFragmentToDeleteSubscribeBatchDialog(number=" + this.f13558a + ")";
        }
    }

    /* renamed from: com.zykj.study.ui.home.my.h$c */
    public static final class c implements NavDirections {

        /* renamed from: a */
        public final String f13560a;

        /* renamed from: b */
        public final int f13561b;

        public c(String accountId) {
            AbstractC9133u.m16133g(accountId, "accountId");
            this.f13560a = accountId;
            this.f13561b = R$id.f10709x21385e9c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC9133u.m16128b(this.f13560a, ((c) obj).f13560a);
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.f13561b;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("accountId", this.f13560a);
            return bundle;
        }

        public int hashCode() {
            return this.f13560a.hashCode();
        }

        public String toString() {
            return "ActionManagementSubscribeFragmentToDeleteSubscribeSingleDialog(accountId=" + this.f13560a + ")";
        }
    }

    /* renamed from: com.zykj.study.ui.home.my.h$d */
    public static final class d {
        public /* synthetic */ d(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final NavDirections m11799a(String start, String end) {
            AbstractC9133u.m16133g(start, "start");
            AbstractC9133u.m16133g(end, "end");
            return new a(start, end);
        }

        /* renamed from: b */
        public final NavDirections m11800b(String number) {
            AbstractC9133u.m16133g(number, "number");
            return new b(number);
        }

        /* renamed from: c */
        public final NavDirections m11801c(String accountId) {
            AbstractC9133u.m16133g(accountId, "accountId");
            return new c(accountId);
        }

        public d() {
        }
    }
}
