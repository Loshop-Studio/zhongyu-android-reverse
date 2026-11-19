package p169x0;

import androidx.work.C0810a;
import java.util.List;

/* renamed from: x0.l */
/* loaded from: classes.dex */
public abstract class AbstractC3443l {

    /* renamed from: a */
    private static final String f12071a = AbstractC3445n.m10503f("InputMerger");

    /* renamed from: a */
    public static AbstractC3443l m10497a(String str) {
        try {
            return (AbstractC3443l) Class.forName(str).newInstance();
        } catch (Exception e4) {
            AbstractC3445n.m10501c().mo10505b(f12071a, "Trouble instantiating + " + str, e4);
            return null;
        }
    }

    /* renamed from: b */
    public abstract C0810a mo4121b(List<C0810a> list);
}
