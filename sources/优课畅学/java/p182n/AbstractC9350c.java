package p182n;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* renamed from: n.c */
/* loaded from: classes3.dex */
public abstract class AbstractC9350c {

    /* renamed from: a */
    public static final AbstractC9350c f18464a = new a();

    /* renamed from: b */
    public static final AbstractC9350c f18465b = new b();

    /* renamed from: c */
    public static final AbstractC9350c f18466c = new c();

    /* renamed from: d */
    public static final AbstractC9350c f18467d = new d();

    /* renamed from: e */
    public static final AbstractC9350c f18468e = new e();

    /* renamed from: n.c$a */
    public class a extends AbstractC9350c {
        @Override // p182n.AbstractC9350c
        /* renamed from: a */
        public boolean mo17227a() {
            return true;
        }

        @Override // p182n.AbstractC9350c
        /* renamed from: b */
        public boolean mo17228b() {
            return true;
        }

        @Override // p182n.AbstractC9350c
        /* renamed from: c */
        public boolean mo17229c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // p182n.AbstractC9350c
        /* renamed from: d */
        public boolean mo17230d(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: n.c$b */
    public class b extends AbstractC9350c {
        @Override // p182n.AbstractC9350c
        /* renamed from: a */
        public boolean mo17227a() {
            return false;
        }

        @Override // p182n.AbstractC9350c
        /* renamed from: b */
        public boolean mo17228b() {
            return false;
        }

        @Override // p182n.AbstractC9350c
        /* renamed from: c */
        public boolean mo17229c(DataSource dataSource) {
            return false;
        }

        @Override // p182n.AbstractC9350c
        /* renamed from: d */
        public boolean mo17230d(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* renamed from: n.c$c */
    public class c extends AbstractC9350c {
        @Override // p182n.AbstractC9350c
        /* renamed from: a */
        public boolean mo17227a() {
            return true;
        }

        @Override // p182n.AbstractC9350c
        /* renamed from: b */
        public boolean mo17228b() {
            return false;
        }

        @Override // p182n.AbstractC9350c
        /* renamed from: c */
        public boolean mo17229c(DataSource dataSource) {
            return (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }

        @Override // p182n.AbstractC9350c
        /* renamed from: d */
        public boolean mo17230d(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* renamed from: n.c$d */
    public class d extends AbstractC9350c {
        @Override // p182n.AbstractC9350c
        /* renamed from: a */
        public boolean mo17227a() {
            return false;
        }

        @Override // p182n.AbstractC9350c
        /* renamed from: b */
        public boolean mo17228b() {
            return true;
        }

        @Override // p182n.AbstractC9350c
        /* renamed from: c */
        public boolean mo17229c(DataSource dataSource) {
            return false;
        }

        @Override // p182n.AbstractC9350c
        /* renamed from: d */
        public boolean mo17230d(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: n.c$e */
    public class e extends AbstractC9350c {
        @Override // p182n.AbstractC9350c
        /* renamed from: a */
        public boolean mo17227a() {
            return true;
        }

        @Override // p182n.AbstractC9350c
        /* renamed from: b */
        public boolean mo17228b() {
            return true;
        }

        @Override // p182n.AbstractC9350c
        /* renamed from: c */
        public boolean mo17229c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // p182n.AbstractC9350c
        /* renamed from: d */
        public boolean mo17230d(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z10 && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED;
        }
    }

    /* renamed from: a */
    public abstract boolean mo17227a();

    /* renamed from: b */
    public abstract boolean mo17228b();

    /* renamed from: c */
    public abstract boolean mo17229c(DataSource dataSource);

    /* renamed from: d */
    public abstract boolean mo17230d(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy);
}
