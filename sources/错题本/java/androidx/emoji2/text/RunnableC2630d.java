package androidx.emoji2.text;

import androidx.emoji2.text.FontRequestEmojiCompatConfig;

/* renamed from: androidx.emoji2.text.d */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2630d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1081a;

    /* renamed from: b */
    public final /* synthetic */ FontRequestEmojiCompatConfig.FontRequestMetadataLoader f1082b;

    public /* synthetic */ RunnableC2630d(FontRequestEmojiCompatConfig.FontRequestMetadataLoader fontRequestMetadataLoader, int i) {
        this.f1081a = i;
        this.f1082b = fontRequestMetadataLoader;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1081a) {
            case 0:
                this.f1082b.createMetadata();
                break;
            default:
                this.f1082b.loadInternal();
                break;
        }
    }
}
