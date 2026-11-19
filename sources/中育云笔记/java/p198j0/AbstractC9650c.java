package p198j0;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* renamed from: j0.c */
/* loaded from: classes3.dex */
public abstract class AbstractC9650c {

    /* renamed from: a */
    public static final AbstractC9650c f22355a = new a();

    /* renamed from: b */
    public static final AbstractC9650c f22356b = new b();

    /* renamed from: c */
    public static final AbstractC9650c f22357c = new c();

    /* renamed from: d */
    public static final AbstractC9650c f22358d = new d();

    /* renamed from: e */
    public static final AbstractC9650c f22359e = new e();

    /* renamed from: j0.c$a */
    public class a extends AbstractC9650c {
        @Override // p198j0.AbstractC9650c
        /* renamed from: a */
        public boolean mo19045a() {
            return true;
        }

        @Override // p198j0.AbstractC9650c
        /* renamed from: b */
        public boolean mo19046b() {
            return true;
        }

        @Override // p198j0.AbstractC9650c
        /* renamed from: c */
        public boolean mo19047c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // p198j0.AbstractC9650c
        /* renamed from: d */
        public boolean mo19048d(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: j0.c$b */
    public class b extends AbstractC9650c {
        @Override // p198j0.AbstractC9650c
        /* renamed from: a */
        public boolean mo19045a() {
            return false;
        }

        @Override // p198j0.AbstractC9650c
        /* renamed from: b */
        public boolean mo19046b() {
            return false;
        }

        @Override // p198j0.AbstractC9650c
        /* renamed from: c */
        public boolean mo19047c(DataSource dataSource) {
            return false;
        }

        @Override // p198j0.AbstractC9650c
        /* renamed from: d */
        public boolean mo19048d(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* renamed from: j0.c$c */
    public class c extends AbstractC9650c {
        @Override // p198j0.AbstractC9650c
        /* renamed from: a */
        public boolean mo19045a() {
            return true;
        }

        @Override // p198j0.AbstractC9650c
        /* renamed from: b */
        public boolean mo19046b() {
            return false;
        }

        @Override // p198j0.AbstractC9650c
        /* renamed from: c */
        public boolean mo19047c(DataSource dataSource) {
            return (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }

        @Override // p198j0.AbstractC9650c
        /* renamed from: d */
        public boolean mo19048d(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* renamed from: j0.c$d */
    public class d extends AbstractC9650c {
        @Override // p198j0.AbstractC9650c
        /* renamed from: a */
        public boolean mo19045a() {
            return false;
        }

        @Override // p198j0.AbstractC9650c
        /* renamed from: b */
        public boolean mo19046b() {
            return true;
        }

        @Override // p198j0.AbstractC9650c
        /* renamed from: c */
        public boolean mo19047c(DataSource dataSource) {
            return false;
        }

        @Override // p198j0.AbstractC9650c
        /* renamed from: d */
        public boolean mo19048d(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: j0.c$e */
    public class e extends AbstractC9650c {
        @Override // p198j0.AbstractC9650c
        /* renamed from: a */
        public boolean mo19045a() {
            return true;
        }

        @Override // p198j0.AbstractC9650c
        /* renamed from: b */
        public boolean mo19046b() {
            return true;
        }

        @Override // p198j0.AbstractC9650c
        /* renamed from: c */
        public boolean mo19047c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // p198j0.AbstractC9650c
        /* renamed from: d */
        public boolean mo19048d(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z10 && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED;
        }
    }

    /* renamed from: a */
    public abstract boolean mo19045a();

    /* renamed from: b */
    public abstract boolean mo19046b();

    /* renamed from: c */
    public abstract boolean mo19047c(DataSource dataSource);

    /* renamed from: d */
    public abstract boolean mo19048d(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy);
}
