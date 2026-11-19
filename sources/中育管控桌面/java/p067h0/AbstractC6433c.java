package p067h0;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* renamed from: h0.c */
/* loaded from: classes3.dex */
public abstract class AbstractC6433c {

    /* renamed from: a */
    public static final AbstractC6433c f8112a = new a();

    /* renamed from: b */
    public static final AbstractC6433c f8113b = new b();

    /* renamed from: c */
    public static final AbstractC6433c f8114c = new c();

    /* renamed from: d */
    public static final AbstractC6433c f8115d = new d();

    /* renamed from: e */
    public static final AbstractC6433c f8116e = new e();

    /* renamed from: h0.c$a */
    public class a extends AbstractC6433c {
        @Override // p067h0.AbstractC6433c
        /* renamed from: a */
        public boolean mo7040a() {
            return true;
        }

        @Override // p067h0.AbstractC6433c
        /* renamed from: b */
        public boolean mo7041b() {
            return true;
        }

        @Override // p067h0.AbstractC6433c
        /* renamed from: c */
        public boolean mo7042c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // p067h0.AbstractC6433c
        /* renamed from: d */
        public boolean mo7043d(boolean z6, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: h0.c$b */
    public class b extends AbstractC6433c {
        @Override // p067h0.AbstractC6433c
        /* renamed from: a */
        public boolean mo7040a() {
            return false;
        }

        @Override // p067h0.AbstractC6433c
        /* renamed from: b */
        public boolean mo7041b() {
            return false;
        }

        @Override // p067h0.AbstractC6433c
        /* renamed from: c */
        public boolean mo7042c(DataSource dataSource) {
            return false;
        }

        @Override // p067h0.AbstractC6433c
        /* renamed from: d */
        public boolean mo7043d(boolean z6, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* renamed from: h0.c$c */
    public class c extends AbstractC6433c {
        @Override // p067h0.AbstractC6433c
        /* renamed from: a */
        public boolean mo7040a() {
            return true;
        }

        @Override // p067h0.AbstractC6433c
        /* renamed from: b */
        public boolean mo7041b() {
            return false;
        }

        @Override // p067h0.AbstractC6433c
        /* renamed from: c */
        public boolean mo7042c(DataSource dataSource) {
            return (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }

        @Override // p067h0.AbstractC6433c
        /* renamed from: d */
        public boolean mo7043d(boolean z6, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* renamed from: h0.c$d */
    public class d extends AbstractC6433c {
        @Override // p067h0.AbstractC6433c
        /* renamed from: a */
        public boolean mo7040a() {
            return false;
        }

        @Override // p067h0.AbstractC6433c
        /* renamed from: b */
        public boolean mo7041b() {
            return true;
        }

        @Override // p067h0.AbstractC6433c
        /* renamed from: c */
        public boolean mo7042c(DataSource dataSource) {
            return false;
        }

        @Override // p067h0.AbstractC6433c
        /* renamed from: d */
        public boolean mo7043d(boolean z6, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: h0.c$e */
    public class e extends AbstractC6433c {
        @Override // p067h0.AbstractC6433c
        /* renamed from: a */
        public boolean mo7040a() {
            return true;
        }

        @Override // p067h0.AbstractC6433c
        /* renamed from: b */
        public boolean mo7041b() {
            return true;
        }

        @Override // p067h0.AbstractC6433c
        /* renamed from: c */
        public boolean mo7042c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // p067h0.AbstractC6433c
        /* renamed from: d */
        public boolean mo7043d(boolean z6, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z6 && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED;
        }
    }

    /* renamed from: a */
    public abstract boolean mo7040a();

    /* renamed from: b */
    public abstract boolean mo7041b();

    /* renamed from: c */
    public abstract boolean mo7042c(DataSource dataSource);

    /* renamed from: d */
    public abstract boolean mo7043d(boolean z6, DataSource dataSource, EncodeStrategy encodeStrategy);
}
