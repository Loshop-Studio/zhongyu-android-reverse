package com.zykj.evaluation.p057ui.home;

import com.zykj.evaluation.bean.TaskListType;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.zykj.evaluation.ui.home.a */
/* loaded from: classes4.dex */
public abstract class AbstractC6928a {

    /* renamed from: a */
    public final String f9872a;

    /* renamed from: b */
    public final TaskListType f9873b;

    /* renamed from: com.zykj.evaluation.ui.home.a$a */
    public static final class a extends AbstractC6928a {

        /* renamed from: c */
        public static final a f9874c = new a();

        public a() {
            super("全部测评", TaskListType.TotalTask.INSTANCE, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 648103239;
        }

        public String toString() {
            return "AllTask";
        }
    }

    /* renamed from: com.zykj.evaluation.ui.home.a$b */
    public static final class b extends AbstractC6928a {

        /* renamed from: c */
        public static final b f9875c = new b();

        public b() {
            super("已完成测评", TaskListType.CompletedTask.INSTANCE, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 594982961;
        }

        public String toString() {
            return "CompletedTask";
        }
    }

    /* renamed from: com.zykj.evaluation.ui.home.a$c */
    public static final class c extends AbstractC6928a {

        /* renamed from: c */
        public static final c f9876c = new c();

        public c() {
            super("收藏夹", TaskListType.FavoriteTask.INSTANCE, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -431172768;
        }

        public String toString() {
            return "FavoriteTask";
        }
    }

    /* renamed from: com.zykj.evaluation.ui.home.a$d */
    public static final class d extends AbstractC6928a {

        /* renamed from: c */
        public static final d f9877c = new d();

        public d() {
            super("待处理测评", TaskListType.ToHandleTask.INSTANCE, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return -171969398;
        }

        public String toString() {
            return "TodoTask";
        }
    }

    public /* synthetic */ AbstractC6928a(String str, TaskListType taskListType, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, taskListType);
    }

    /* renamed from: a */
    public final String m10072a() {
        return this.f9872a;
    }

    /* renamed from: b */
    public final TaskListType m10073b() {
        return this.f9873b;
    }

    public AbstractC6928a(String str, TaskListType taskListType) {
        this.f9872a = str;
        this.f9873b = taskListType;
    }
}
