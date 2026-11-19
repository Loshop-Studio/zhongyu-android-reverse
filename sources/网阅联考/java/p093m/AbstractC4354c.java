package p093m;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* renamed from: m.c */
/* loaded from: classes2.dex */
public abstract class AbstractC4354c {

    /* renamed from: a */
    public static final AbstractC4354c f4865a = new a();

    /* renamed from: b */
    public static final AbstractC4354c f4866b = new b();

    /* renamed from: c */
    public static final AbstractC4354c f4867c = new c();

    /* renamed from: d */
    public static final AbstractC4354c f4868d = new d();

    /* renamed from: e */
    public static final AbstractC4354c f4869e = new e();

    /* renamed from: m.c$a */
    public class a extends AbstractC4354c {
        @Override // p093m.AbstractC4354c
        /* renamed from: a */
        public boolean mo5364a() {
            return true;
        }

        @Override // p093m.AbstractC4354c
        /* renamed from: b */
        public boolean mo5365b() {
            return true;
        }

        @Override // p093m.AbstractC4354c
        /* renamed from: c */
        public boolean mo5366c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // p093m.AbstractC4354c
        /* renamed from: d */
        public boolean mo5367d(boolean z3, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: m.c$b */
    public class b extends AbstractC4354c {
        @Override // p093m.AbstractC4354c
        /* renamed from: a */
        public boolean mo5364a() {
            return false;
        }

        @Override // p093m.AbstractC4354c
        /* renamed from: b */
        public boolean mo5365b() {
            return false;
        }

        @Override // p093m.AbstractC4354c
        /* renamed from: c */
        public boolean mo5366c(DataSource dataSource) {
            return false;
        }

        @Override // p093m.AbstractC4354c
        /* renamed from: d */
        public boolean mo5367d(boolean z3, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* renamed from: m.c$c */
    public class c extends AbstractC4354c {
        @Override // p093m.AbstractC4354c
        /* renamed from: a */
        public boolean mo5364a() {
            return true;
        }

        @Override // p093m.AbstractC4354c
        /* renamed from: b */
        public boolean mo5365b() {
            return false;
        }

        @Override // p093m.AbstractC4354c
        /* renamed from: c */
        public boolean mo5366c(DataSource dataSource) {
            return (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }

        @Override // p093m.AbstractC4354c
        /* renamed from: d */
        public boolean mo5367d(boolean z3, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* renamed from: m.c$d */
    public class d extends AbstractC4354c {
        @Override // p093m.AbstractC4354c
        /* renamed from: a */
        public boolean mo5364a() {
            return false;
        }

        @Override // p093m.AbstractC4354c
        /* renamed from: b */
        public boolean mo5365b() {
            return true;
        }

        @Override // p093m.AbstractC4354c
        /* renamed from: c */
        public boolean mo5366c(DataSource dataSource) {
            return false;
        }

        @Override // p093m.AbstractC4354c
        /* renamed from: d */
        public boolean mo5367d(boolean z3, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: m.c$e */
    public class e extends AbstractC4354c {
        @Override // p093m.AbstractC4354c
        /* renamed from: a */
        public boolean mo5364a() {
            return true;
        }

        @Override // p093m.AbstractC4354c
        /* renamed from: b */
        public boolean mo5365b() {
            return true;
        }

        @Override // p093m.AbstractC4354c
        /* renamed from: c */
        public boolean mo5366c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // p093m.AbstractC4354c
        /* renamed from: d */
        public boolean mo5367d(boolean z3, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z3 && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED;
        }
    }

    /* renamed from: a */
    public abstract boolean mo5364a();

    /* renamed from: b */
    public abstract boolean mo5365b();

    /* renamed from: c */
    public abstract boolean mo5366c(DataSource dataSource);

    /* renamed from: d */
    public abstract boolean mo5367d(boolean z3, DataSource dataSource, EncodeStrategy encodeStrategy);
}
