package p133j6;

import com.zykj.evaluation.bean.CommitAnswer;
import com.zykj.evaluation.bean.CommitTaskAnswer;
import com.zykj.evaluation.bean.UploadData;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p178n5.C8655v;

/* renamed from: j6.b */
/* loaded from: classes4.dex */
public abstract class AbstractC7798b {
    /* renamed from: a */
    public static final boolean m13205a(C8655v c8655v) {
        Intrinsics.checkNotNullParameter(c8655v, "<this>");
        if (!c8655v.m14245c().isEmpty()) {
            List listM14245c = c8655v.m14245c();
            if (listM14245c != null && listM14245c.isEmpty()) {
                return false;
            }
            Iterator it = listM14245c.iterator();
            while (it.hasNext()) {
                if (((UploadData) it.next()).getLocalPath().length() > 0) {
                    return true;
                }
            }
            return false;
        }
        List listM14247e = c8655v.m14247e();
        if (listM14247e != null && listM14247e.isEmpty()) {
            return false;
        }
        Iterator it2 = listM14247e.iterator();
        while (it2.hasNext()) {
            List<CommitAnswer> answers = ((CommitTaskAnswer) it2.next()).getAnswers();
            if (answers == null || !answers.isEmpty()) {
                Iterator<T> it3 = answers.iterator();
                while (it3.hasNext()) {
                    List<String> answers2 = ((CommitAnswer) it3.next()).getAnswers();
                    if (answers2 == null || !answers2.isEmpty()) {
                        Iterator<T> it4 = answers2.iterator();
                        while (it4.hasNext()) {
                            if (((String) it4.next()).length() > 0) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
