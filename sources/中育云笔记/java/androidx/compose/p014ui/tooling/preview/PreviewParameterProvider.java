package androidx.compose.p014ui.tooling.preview;

import p296pd.AbstractC10669q;
import p296pd.InterfaceC10659g;

/* loaded from: classes2.dex */
public interface PreviewParameterProvider<T> {

    public static final class DefaultImpls {
        @Deprecated
        public static <T> int getCount(PreviewParameterProvider<T> previewParameterProvider) {
            return PreviewParameterProvider.super.getCount();
        }
    }

    default int getCount() {
        return AbstractC10669q.m22578p(getValues());
    }

    InterfaceC10659g getValues();
}
