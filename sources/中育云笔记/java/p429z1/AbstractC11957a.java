package p429z1;

import com.blankj.utilcode.util.PathUtils;
import com.friday.common.helper.C5962b;
import java.io.File;
import kotlin.jvm.internal.AbstractC9972n;

/* renamed from: z1.a */
/* loaded from: classes3.dex */
public abstract class AbstractC11957a {

    /* renamed from: a */
    public static final a f28334a = new a(null);

    /* renamed from: b */
    public static final String f28335b;

    /* renamed from: z1.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final String m26579a() {
            return AbstractC11957a.f28335b;
        }

        public a() {
        }
    }

    static {
        String externalAppDataPath = PathUtils.getExternalAppDataPath();
        String str = File.separator;
        f28335b = externalAppDataPath + str + "userNote" + str + C5962b.f6082a.m5299a().m5292t();
    }
}
