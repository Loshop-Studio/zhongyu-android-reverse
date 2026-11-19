package p256t7;

import java.io.File;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.p159io.FileWalkDirection;

/* renamed from: t7.g */
/* loaded from: classes5.dex */
public abstract class AbstractC10122g extends AbstractC10121f {
    /* renamed from: a */
    public static final C10119d m18874a(File file, FileWalkDirection direction) {
        AbstractC9133u.m16133g(file, "<this>");
        AbstractC9133u.m16133g(direction, "direction");
        return new C10119d(file, direction);
    }

    /* renamed from: b */
    public static /* synthetic */ C10119d m18875b(File file, FileWalkDirection fileWalkDirection, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fileWalkDirection = FileWalkDirection.f17464a;
        }
        return m18874a(file, fileWalkDirection);
    }

    /* renamed from: c */
    public static final C10119d m18876c(File file) {
        AbstractC9133u.m16133g(file, "<this>");
        return m18874a(file, FileWalkDirection.f17465b);
    }
}
