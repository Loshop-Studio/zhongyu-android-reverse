package p110d2;

import android.app.Application;
import com.friday.common.MyDataBase;
import com.friday.common.dao.FileDao;
import com.friday.common.dao.ResourceDao;
import com.friday.common.dao.UserDao;
import kotlin.jvm.internal.AbstractC9979u;
import p040c2.InterfaceC5225a1;
import p040c2.InterfaceC5250g2;
import p040c2.InterfaceC5308v0;

/* renamed from: d2.a */
/* loaded from: classes3.dex */
public final class C8911a {
    /* renamed from: a */
    public final MyDataBase m17494a(Application application) {
        AbstractC9979u.m20294g(application, "application");
        return MyDataBase.f5532a.m4756a(application);
    }

    /* renamed from: b */
    public final FileDao m17495b(MyDataBase database) {
        AbstractC9979u.m20294g(database, "database");
        return database.mo4750r();
    }

    /* renamed from: c */
    public final InterfaceC5308v0 m17496c(MyDataBase database) {
        AbstractC9979u.m20294g(database, "database");
        return database.mo4751s();
    }

    /* renamed from: d */
    public final InterfaceC5225a1 m17497d(MyDataBase database) {
        AbstractC9979u.m20294g(database, "database");
        return database.mo4752t();
    }

    /* renamed from: e */
    public final ResourceDao m17498e(MyDataBase database) {
        AbstractC9979u.m20294g(database, "database");
        return database.mo4753u();
    }

    /* renamed from: f */
    public final InterfaceC5250g2 m17499f(MyDataBase database) {
        AbstractC9979u.m20294g(database, "database");
        return database.mo4754v();
    }

    /* renamed from: g */
    public final UserDao m17500g(MyDataBase database) {
        AbstractC9979u.m20294g(database, "database");
        return database.mo4755w();
    }
}
