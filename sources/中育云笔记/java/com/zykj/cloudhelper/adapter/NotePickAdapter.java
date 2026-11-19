package com.zykj.cloudhelper.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import com.chad.library.adapter.base.BaseNodeAdapter;
import com.zykj.cloudhelper.R$layout;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p323ra.C10922a;

@StabilityInferred(parameters = 0)
/* loaded from: classes6.dex */
public final class NotePickAdapter extends BaseNodeAdapter {

    /* renamed from: c */
    public static final C8547a f19457c = new C8547a(null);

    /* renamed from: d */
    public static final int f19458d = 8;

    /* renamed from: com.zykj.cloudhelper.adapter.NotePickAdapter$a */
    public static final class C8547a {
        public /* synthetic */ C8547a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C8547a() {
        }
    }

    public NotePickAdapter() {
        super(null, 1, null);
        m4665z(new C10922a(0, R$layout.item_file));
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* renamed from: u */
    public int mo4677u(List data, int i10) {
        AbstractC9979u.m20294g(data, "data");
        return 0;
    }
}
