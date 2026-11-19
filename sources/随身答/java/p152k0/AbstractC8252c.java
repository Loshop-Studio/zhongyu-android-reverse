package p152k0;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* renamed from: k0.c */
/* loaded from: classes3.dex */
public abstract class AbstractC8252c {

    /* renamed from: a */
    public static final AbstractC8252c f14323a = new a();

    /* renamed from: b */
    public static final AbstractC8252c f14324b = new b();

    /* renamed from: c */
    public static final AbstractC8252c f14325c = new c();

    /* renamed from: d */
    public static final AbstractC8252c f14326d = new d();

    /* renamed from: e */
    public static final AbstractC8252c f14327e = new e();

    /* renamed from: k0.c$a */
    public class a extends AbstractC8252c {
        @Override // p152k0.AbstractC8252c
        /* renamed from: a */
        public boolean mo13292a() {
            return true;
        }

        @Override // p152k0.AbstractC8252c
        /* renamed from: b */
        public boolean mo13293b() {
            return true;
        }

        @Override // p152k0.AbstractC8252c
        /* renamed from: c */
        public boolean mo13294c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // p152k0.AbstractC8252c
        /* renamed from: d */
        public boolean mo13295d(boolean z9, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: k0.c$b */
    public class b extends AbstractC8252c {
        @Override // p152k0.AbstractC8252c
        /* renamed from: a */
        public boolean mo13292a() {
            return false;
        }

        @Override // p152k0.AbstractC8252c
        /* renamed from: b */
        public boolean mo13293b() {
            return false;
        }

        @Override // p152k0.AbstractC8252c
        /* renamed from: c */
        public boolean mo13294c(DataSource dataSource) {
            return false;
        }

        @Override // p152k0.AbstractC8252c
        /* renamed from: d */
        public boolean mo13295d(boolean z9, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* renamed from: k0.c$c */
    public class c extends AbstractC8252c {
        @Override // p152k0.AbstractC8252c
        /* renamed from: a */
        public boolean mo13292a() {
            return true;
        }

        @Override // p152k0.AbstractC8252c
        /* renamed from: b */
        public boolean mo13293b() {
            return false;
        }

        @Override // p152k0.AbstractC8252c
        /* renamed from: c */
        public boolean mo13294c(DataSource dataSource) {
            return (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }

        @Override // p152k0.AbstractC8252c
        /* renamed from: d */
        public boolean mo13295d(boolean z9, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* renamed from: k0.c$d */
    public class d extends AbstractC8252c {
        @Override // p152k0.AbstractC8252c
        /* renamed from: a */
        public boolean mo13292a() {
            return false;
        }

        @Override // p152k0.AbstractC8252c
        /* renamed from: b */
        public boolean mo13293b() {
            return true;
        }

        @Override // p152k0.AbstractC8252c
        /* renamed from: c */
        public boolean mo13294c(DataSource dataSource) {
            return false;
        }

        @Override // p152k0.AbstractC8252c
        /* renamed from: d */
        public boolean mo13295d(boolean z9, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: k0.c$e */
    public class e extends AbstractC8252c {
        @Override // p152k0.AbstractC8252c
        /* renamed from: a */
        public boolean mo13292a() {
            return true;
        }

        @Override // p152k0.AbstractC8252c
        /* renamed from: b */
        public boolean mo13293b() {
            return true;
        }

        @Override // p152k0.AbstractC8252c
        /* renamed from: c */
        public boolean mo13294c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // p152k0.AbstractC8252c
        /* renamed from: d */
        public boolean mo13295d(boolean z9, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z9 && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED;
        }
    }

    /* renamed from: a */
    public abstract boolean mo13292a();

    /* renamed from: b */
    public abstract boolean mo13293b();

    /* renamed from: c */
    public abstract boolean mo13294c(DataSource dataSource);

    /* renamed from: d */
    public abstract boolean mo13295d(boolean z9, DataSource dataSource, EncodeStrategy encodeStrategy);
}
