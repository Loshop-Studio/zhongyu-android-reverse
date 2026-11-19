package com.zykj.cloudhelper.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import com.chad.library.adapter.base.BaseNodeAdapter;
import com.zykj.cloudhelper.R$layout;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p323ra.C10923b;

@StabilityInferred(parameters = 0)
/* loaded from: classes6.dex */
public final class NoteStoreAdapter extends BaseNodeAdapter {

    /* renamed from: c */
    public static final C8548a f19459c = new C8548a(null);

    /* renamed from: d */
    public static final int f19460d = 8;

    /* renamed from: com.zykj.cloudhelper.adapter.NoteStoreAdapter$a */
    public static final class C8548a {
        public /* synthetic */ C8548a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C8548a() {
        }
    }

    public NoteStoreAdapter() {
        super(null, 1, null);
        m4665z(new C10923b(0, R$layout.item_file));
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* renamed from: u */
    public int mo4677u(List data, int i10) {
        AbstractC9979u.m20294g(data, "data");
        return 0;
    }
}
