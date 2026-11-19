package androidx.compose.p014ui.text.android;

import android.text.StaticLayout;

/* loaded from: classes2.dex */
interface StaticLayoutFactoryImpl {
    StaticLayout create(StaticLayoutParams staticLayoutParams);

    boolean isFallbackLineSpacingEnabled(StaticLayout staticLayout, boolean z10);
}
