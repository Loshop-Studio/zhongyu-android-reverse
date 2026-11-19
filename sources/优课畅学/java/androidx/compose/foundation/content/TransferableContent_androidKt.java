package androidx.compose.foundation.content;

import android.content.ClipData;
import android.content.ClipDescription;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p013ui.platform.AndroidClipboardManager_androidKt;
import androidx.compose.p013ui.platform.ClipEntry;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class TransferableContent_androidKt {
    @ExperimentalFoundationApi
    public static final TransferableContent consume(TransferableContent transferableContent, InterfaceC10570l interfaceC10570l) {
        ClipData clipData = transferableContent.getClipEntry().getClipData();
        if (clipData.getItemCount() != 1) {
            int itemCount = clipData.getItemCount();
            ArrayList arrayList = null;
            for (int i10 = 0; i10 < itemCount; i10++) {
                ClipData.Item itemAt = clipData.getItemAt(i10);
                if (!((Boolean) interfaceC10570l.invoke(itemAt)).booleanValue()) {
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
                ClipData clipData2 = new ClipData(clipDescription, (ClipData.Item) AbstractC8778f0.m14566l0(arrayList));
                int size = arrayList.size();
                for (int i11 = 1; i11 < size; i11++) {
                    clipData2.addItem((ClipData.Item) arrayList.get(i11));
                }
                return new TransferableContent(AndroidClipboardManager_androidKt.toClipEntry(clipData2), AndroidClipboardManager_androidKt.toClipMetadata(clipDescription), transferableContent.m20446getSourcekB6V9T0(), transferableContent.getPlatformTransferableContent(), null);
            }
        } else if (((Boolean) interfaceC10570l.invoke(clipData.getItemAt(0))).booleanValue()) {
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
        StringBuilder sb = new StringBuilder();
        int itemCount2 = clipEntry.getClipData().getItemCount();
        boolean z11 = false;
        for (int i11 = 0; i11 < itemCount2; i11++) {
            CharSequence text = clipEntry.getClipData().getItemAt(i11).getText();
            if (text != null) {
                if (z11) {
                    sb.append(SignParameters.NEW_LINE);
                }
                sb.append(text);
                z11 = true;
            }
        }
        String string = sb.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        return string;
    }
}
