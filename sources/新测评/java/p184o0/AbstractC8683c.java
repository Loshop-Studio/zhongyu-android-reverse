package p184o0;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* renamed from: o0.c */
/* loaded from: classes3.dex */
public abstract class AbstractC8683c {

    /* renamed from: a */
    public static final AbstractC8683c f14422a = new a();

    /* renamed from: b */
    public static final AbstractC8683c f14423b = new b();

    /* renamed from: c */
    public static final AbstractC8683c f14424c = new c();

    /* renamed from: d */
    public static final AbstractC8683c f14425d = new d();

    /* renamed from: e */
    public static final AbstractC8683c f14426e = new e();

    /* renamed from: o0.c$a */
    public class a extends AbstractC8683c {
        @Override // p184o0.AbstractC8683c
        /* renamed from: a */
        public boolean mo14281a() {
            return true;
        }

        @Override // p184o0.AbstractC8683c
        /* renamed from: b */
        public boolean mo14282b() {
            return true;
        }

        @Override // p184o0.AbstractC8683c
        /* renamed from: c */
        public boolean mo14283c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // p184o0.AbstractC8683c
        /* renamed from: d */
        public boolean mo14284d(boolean z9, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: o0.c$b */
    public class b extends AbstractC8683c {
        @Override // p184o0.AbstractC8683c
        /* renamed from: a */
        public boolean mo14281a() {
            return false;
        }

        @Override // p184o0.AbstractC8683c
        /* renamed from: b */
        public boolean mo14282b() {
            return false;
        }

        @Override // p184o0.AbstractC8683c
        /* renamed from: c */
        public boolean mo14283c(DataSource dataSource) {
            return false;
        }

        @Override // p184o0.AbstractC8683c
        /* renamed from: d */
        public boolean mo14284d(boolean z9, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* renamed from: o0.c$c */
    public class c extends AbstractC8683c {
        @Override // p184o0.AbstractC8683c
        /* renamed from: a */
        public boolean mo14281a() {
            return true;
        }

        @Override // p184o0.AbstractC8683c
        /* renamed from: b */
        public boolean mo14282b() {
            return false;
        }

        @Override // p184o0.AbstractC8683c
        /* renamed from: c */
        public boolean mo14283c(DataSource dataSource) {
            return (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }

        @Override // p184o0.AbstractC8683c
        /* renamed from: d */
        public boolean mo14284d(boolean z9, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* renamed from: o0.c$d */
    public class d extends AbstractC8683c {
        @Override // p184o0.AbstractC8683c
        /* renamed from: a */
        public boolean mo14281a() {
            return false;
        }

        @Override // p184o0.AbstractC8683c
        /* renamed from: b */
        public boolean mo14282b() {
            return true;
        }

        @Override // p184o0.AbstractC8683c
        /* renamed from: c */
        public boolean mo14283c(DataSource dataSource) {
            return false;
        }

        @Override // p184o0.AbstractC8683c
        /* renamed from: d */
        public boolean mo14284d(boolean z9, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: o0.c$e */
    public class e extends AbstractC8683c {
        @Override // p184o0.AbstractC8683c
        /* renamed from: a */
        public boolean mo14281a() {
            return true;
        }

        @Override // p184o0.AbstractC8683c
        /* renamed from: b */
        public boolean mo14282b() {
            return true;
        }

        @Override // p184o0.AbstractC8683c
        /* renamed from: c */
        public boolean mo14283c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // p184o0.AbstractC8683c
        /* renamed from: d */
        public boolean mo14284d(boolean z9, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z9 && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED;
        }
    }

    /* renamed from: a */
    public abstract boolean mo14281a();

    /* renamed from: b */
    public abstract boolean mo14282b();

    /* renamed from: c */
    public abstract boolean mo14283c(DataSource dataSource);

    /* renamed from: d */
    public abstract boolean mo14284d(boolean z9, DataSource dataSource, EncodeStrategy encodeStrategy);
}
