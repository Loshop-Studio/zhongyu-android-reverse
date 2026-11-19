package p030b4;

import com.blankj.utilcode.util.ActivityUtils;
import com.friday.paint.view.NoteActivity;
import com.friday.paint.view.six.NewNoteActivity;
import p200j2.InterfaceC9667g;

/* renamed from: b4.a */
/* loaded from: classes4.dex */
public class C5164a implements InterfaceC9667g {
    @Override // p200j2.InterfaceC9667g
    /* renamed from: a */
    public boolean mo2670a() {
        try {
            for (int size = ActivityUtils.getActivityList().size() - 1; size >= 0; size--) {
                if (NoteActivity.class.getSimpleName().equals(ActivityUtils.getActivityList().get(size).getClass().getSimpleName()) || NewNoteActivity.class.getSimpleName().equals(ActivityUtils.getActivityList().get(size).getClass().getSimpleName())) {
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }
}
