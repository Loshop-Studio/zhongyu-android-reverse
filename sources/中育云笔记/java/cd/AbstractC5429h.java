package cd;

import java.io.File;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.p227io.FileWalkDirection;

/* renamed from: cd.h */
/* loaded from: classes6.dex */
public abstract class AbstractC5429h extends AbstractC5428g {
    /* renamed from: i */
    public static final C5426e m2925i(File file, FileWalkDirection direction) {
        AbstractC9979u.m20294g(file, "<this>");
        AbstractC9979u.m20294g(direction, "direction");
        return new C5426e(file, direction);
    }

    /* renamed from: j */
    public static /* synthetic */ C5426e m2926j(File file, FileWalkDirection fileWalkDirection, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fileWalkDirection = FileWalkDirection.f23377c;
        }
        return m2925i(file, fileWalkDirection);
    }
}
