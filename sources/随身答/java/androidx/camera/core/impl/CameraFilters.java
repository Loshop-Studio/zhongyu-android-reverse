package androidx.camera.core.impl;

import androidx.camera.core.CameraFilter;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class CameraFilters {
    public static final CameraFilter ANY = new CameraFilter() { // from class: androidx.camera.core.impl.b
        @Override // androidx.camera.core.CameraFilter
        public final List filter(List list) {
            return CameraFilters.m566a(list);
        }
    };
    public static final CameraFilter NONE = new CameraFilter() { // from class: androidx.camera.core.impl.c
        @Override // androidx.camera.core.CameraFilter
        public final List filter(List list) {
            return Collections.EMPTY_LIST;
        }
    };

    private CameraFilters() {
    }

    /* renamed from: a */
    public static /* synthetic */ List m566a(List list) {
        return list;
    }
}
