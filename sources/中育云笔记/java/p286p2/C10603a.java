package p286p2;

import com.friday.common.dao.FileDao;
import com.friday.common.dao.ResourceDao;
import com.friday.common.network.StudentSession;
import com.friday.document.service.FileManager;
import com.friday.document.sync.SyncStateOne;
import com.friday.document.sync.SyncStateThree;
import com.friday.document.view.document.FolderFragment;
import com.friday.document.view.document.NewestFragment;
import com.friday.document.view.document.RecycleBinFragment;
import com.friday.document.view.share.StudentShareFragment;
import com.google.gson.GsonBuilder;
import java.util.Date;
import je.C9742v;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.AbstractC10006d;
import p040c2.InterfaceC5250g2;
import p040c2.InterfaceC5308v0;
import p110d2.InterfaceC8919i;
import p122df.C9033d0;
import p137ef.C9140a;
import p154ff.C9240k;
import p170h2.C9452c;
import p200j2.InterfaceC9663c;
import p200j2.InterfaceC9664d;
import p200j2.InterfaceC9666f;
import p200j2.InterfaceC9667g;
import p200j2.InterfaceC9668h;
import p200j2.InterfaceC9669i;
import p330s2.InterfaceC11051a;
import p330s2.InterfaceC11052b;
import sd.AbstractC11108e2;
import sd.C11157r0;
import sd.InterfaceC11122i0;

/* renamed from: p2.a */
/* loaded from: classes3.dex */
public final class C10603a {
    /* renamed from: a */
    public final InterfaceC11122i0 m22443a() {
        return AbstractC10006d.m20744a(AbstractC11108e2.m24701b(null, 1, null).plus(C11157r0.m24799b()));
    }

    /* renamed from: b */
    public final InterfaceC9663c m22444b() {
        return new NewestFragment();
    }

    /* renamed from: c */
    public final InterfaceC11051a m22445c(C9742v okHttpClient) throws SecurityException {
        AbstractC9979u.m20294g(okHttpClient, "okHttpClient");
        Object objM17712b = new C9033d0.b().m17726f(okHttpClient).m17722b("https://hagateway.zyai.cc").m17721a(C9240k.m18163a()).m17721a(C9140a.m17985a(new GsonBuilder().registerTypeAdapter(Date.class, new C9452c()).create())).m17724d().m17712b(InterfaceC11051a.class);
        AbstractC9979u.m20293f(objM17712b, "create(...)");
        return (InterfaceC11051a) objM17712b;
    }

    /* renamed from: d */
    public final FileManager m22446d(InterfaceC8919i service, StudentSession studentSession, FileDao fileDao, ResourceDao resourceDao, InterfaceC9667g noteHelper, SyncStateOne syncStateOne, SyncStateThree syncStateThree, InterfaceC5250g2 shareCacheDao, InterfaceC11122i0 externalScope) {
        AbstractC9979u.m20294g(service, "service");
        AbstractC9979u.m20294g(studentSession, "studentSession");
        AbstractC9979u.m20294g(fileDao, "fileDao");
        AbstractC9979u.m20294g(resourceDao, "resourceDao");
        AbstractC9979u.m20294g(noteHelper, "noteHelper");
        AbstractC9979u.m20294g(syncStateOne, "syncStateOne");
        AbstractC9979u.m20294g(syncStateThree, "syncStateThree");
        AbstractC9979u.m20294g(shareCacheDao, "shareCacheDao");
        AbstractC9979u.m20294g(externalScope, "externalScope");
        return new FileManager(service, studentSession, fileDao, resourceDao, noteHelper, syncStateOne, syncStateThree, shareCacheDao, externalScope);
    }

    /* renamed from: e */
    public final InterfaceC9666f m22447e() {
        return new FolderFragment();
    }

    /* renamed from: f */
    public final InterfaceC9664d m22448f(FileManager fileManager) {
        AbstractC9979u.m20294g(fileManager, "fileManager");
        return fileManager;
    }

    /* renamed from: g */
    public final InterfaceC9668h m22449g() {
        return new RecycleBinFragment();
    }

    /* renamed from: h */
    public final InterfaceC9669i m22450h() {
        return new StudentShareFragment();
    }

    /* renamed from: i */
    public final InterfaceC11052b m22451i(C9742v okHttpClient) throws SecurityException {
        AbstractC9979u.m20294g(okHttpClient, "okHttpClient");
        Object objM17712b = new C9033d0.b().m17726f(okHttpClient).m17722b("https://hagateway.zyai.cc").m17721a(C9240k.m18163a()).m17721a(C9140a.m17985a(new GsonBuilder().registerTypeAdapter(Date.class, new C9452c()).create())).m17724d().m17712b(InterfaceC11052b.class);
        AbstractC9979u.m20293f(objM17712b, "create(...)");
        return (InterfaceC11052b) objM17712b;
    }

    /* renamed from: j */
    public final SyncStateOne m22452j(InterfaceC11051a service, InterfaceC8919i ezyService, FileDao fileDao, ResourceDao resourceDao, InterfaceC5308v0 imageSafetyDao) {
        AbstractC9979u.m20294g(service, "service");
        AbstractC9979u.m20294g(ezyService, "ezyService");
        AbstractC9979u.m20294g(fileDao, "fileDao");
        AbstractC9979u.m20294g(resourceDao, "resourceDao");
        AbstractC9979u.m20294g(imageSafetyDao, "imageSafetyDao");
        return new SyncStateOne(service, ezyService, fileDao, resourceDao, imageSafetyDao);
    }

    /* renamed from: k */
    public final SyncStateThree m22453k(InterfaceC11051a service, FileDao fileDao, ResourceDao resourceDao) {
        AbstractC9979u.m20294g(service, "service");
        AbstractC9979u.m20294g(fileDao, "fileDao");
        AbstractC9979u.m20294g(resourceDao, "resourceDao");
        return new SyncStateThree(service, fileDao, resourceDao);
    }
}
