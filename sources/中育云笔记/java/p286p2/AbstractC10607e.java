package p286p2;

import com.friday.common.dao.FileDao;
import com.friday.common.dao.ResourceDao;
import com.friday.common.network.StudentSession;
import com.friday.document.service.FileManager;
import com.friday.document.sync.SyncStateOne;
import com.friday.document.sync.SyncStateThree;
import p040c2.InterfaceC5250g2;
import p110d2.InterfaceC8919i;
import p166gc.AbstractC9291e;
import p166gc.InterfaceC9292f;
import p200j2.InterfaceC9667g;
import sd.InterfaceC11122i0;

/* renamed from: p2.e */
/* loaded from: classes3.dex */
public abstract class AbstractC10607e implements InterfaceC9292f {
    /* renamed from: a */
    public static FileManager m22457a(C10603a c10603a, InterfaceC8919i interfaceC8919i, StudentSession studentSession, FileDao fileDao, ResourceDao resourceDao, InterfaceC9667g interfaceC9667g, SyncStateOne syncStateOne, SyncStateThree syncStateThree, InterfaceC5250g2 interfaceC5250g2, InterfaceC11122i0 interfaceC11122i0) {
        return (FileManager) AbstractC9291e.m18323c(c10603a.m22446d(interfaceC8919i, studentSession, fileDao, resourceDao, interfaceC9667g, syncStateOne, syncStateThree, interfaceC5250g2, interfaceC11122i0));
    }
}
