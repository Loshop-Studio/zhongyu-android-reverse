package androidx.compose.p014ui.semantics;

import kotlin.jvm.internal.AbstractC9983y;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import p280od.InterfaceC10478l;

/* loaded from: classes2.dex */
public final class SemanticsProperties_androidKt {
    static final /* synthetic */ InterfaceC10478l[] $$delegatedProperties = {AbstractC9983y.m20318e(new MutablePropertyReference1Impl(SemanticsProperties_androidKt.class, "testTagsAsResourceId", "getTestTagsAsResourceId(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1))};

    static {
        SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId();
    }

    public static final boolean getTestTagsAsResourceId(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId().getValue(semanticsPropertyReceiver, $$delegatedProperties[0]).booleanValue();
    }

    public static /* synthetic */ void getTestTagsAsResourceId$annotations(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    public static final void setTestTagsAsResourceId(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z10) {
        SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId().setValue(semanticsPropertyReceiver, $$delegatedProperties[0], Boolean.valueOf(z10));
    }
}
