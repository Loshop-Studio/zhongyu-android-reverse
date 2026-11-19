package androidx.compose.foundation.content;

import android.content.ClipData;
import android.content.ClipDescription;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p014ui.platform.AndroidClipboardManager_androidKt;
import androidx.compose.p014ui.platform.ClipEntry;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p325rc.AbstractC10947g0;

/* loaded from: classes.dex */
public final class TransferableContent_androidKt {
    @ExperimentalFoundationApi
    public static final TransferableContent consume(TransferableContent transferableContent, InterfaceC9540l interfaceC9540l) {
        ClipData clipData = transferableContent.getClipEntry().getClipData();
        if (clipData.getItemCount() != 1) {
            int itemCount = clipData.getItemCount();
            ArrayList arrayList = null;
            for (int i10 = 0; i10 < itemCount; i10++) {
                ClipData.Item itemAt = clipData.getItemAt(i10);
                if (!((Boolean) interfaceC9540l.invoke(itemAt)).booleanValue()) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(itemAt);
                }
            }
            if (arrayList == null || arrayList.isEmpty()) {
                return null;
            }
            if (arrayList.size() != clipData.getItemCount()) {
                ClipDescription clipDescription = new ClipDescription(transferableContent.getClipMetadata().getClipDescription());
                ClipData clipData2 = new ClipData(clipDescription, (ClipData.Item) AbstractC10947g0.m23944m0(arrayList));
                int size = arrayList.size();
                for (int i11 = 1; i11 < size; i11++) {
                    clipData2.addItem((ClipData.Item) arrayList.get(i11));
                }
                return new TransferableContent(AndroidClipboardManager_androidKt.toClipEntry(clipData2), AndroidClipboardManager_androidKt.toClipMetadata(clipDescription), transferableContent.m27048getSourcekB6V9T0(), transferableContent.getPlatformTransferableContent(), null);
            }
        } else if (((Boolean) interfaceC9540l.invoke(clipData.getItemAt(0))).booleanValue()) {
            return null;
        }
        return transferableContent;
    }

    @ExperimentalFoundationApi
    public static final boolean hasMediaType(TransferableContent transferableContent, MediaType mediaType) {
        return transferableContent.getClipMetadata().getClipDescription().hasMimeType(mediaType.getRepresentation());
    }

    public static final String readPlainText(ClipEntry clipEntry) {
        int itemCount = clipEntry.getClipData().getItemCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < itemCount; i10++) {
            z10 = z10 || clipEntry.getClipData().getItemAt(i10).getText() != null;
        }
        if (!z10) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        int itemCount2 = clipEntry.getClipData().getItemCount();
        boolean z11 = false;
        for (int i11 = 0; i11 < itemCount2; i11++) {
            CharSequence text = clipEntry.getClipData().getItemAt(i11).getText();
            if (text != null) {
                if (z11) {
                    sb2.append(SignParameters.NEW_LINE);
                }
                sb2.append(text);
                z11 = true;
            }
        }
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }
}
