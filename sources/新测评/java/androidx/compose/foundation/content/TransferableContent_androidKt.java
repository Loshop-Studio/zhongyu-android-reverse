package androidx.compose.foundation.content;

import android.content.ClipData;
import android.content.ClipDescription;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p013ui.platform.AndroidClipboardManager_androidKt;
import androidx.compose.p013ui.platform.ClipEntry;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a\u000e\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u000bH\u0000¨\u0006\f"}, m13558d2 = {"consume", "Landroidx/compose/foundation/content/TransferableContent;", "predicate", "Lkotlin/Function1;", "Landroid/content/ClipData$Item;", "", "hasMediaType", "mediaType", "Landroidx/compose/foundation/content/MediaType;", "readPlainText", "", "Landroidx/compose/ui/platform/ClipEntry;", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nTransferableContent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferableContent.android.kt\nandroidx/compose/foundation/content/TransferableContent_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
/* loaded from: classes.dex */
public final class TransferableContent_androidKt {
    @ExperimentalFoundationApi
    public static final TransferableContent consume(TransferableContent transferableContent, Function1<? super ClipData.Item, Boolean> function1) {
        ClipData clipData = transferableContent.getClipEntry().getClipData();
        if (clipData.getItemCount() != 1) {
            int itemCount = clipData.getItemCount();
            ArrayList arrayList = null;
            for (int i10 = 0; i10 < itemCount; i10++) {
                ClipData.Item itemAt = clipData.getItemAt(i10);
                if (!function1.invoke(itemAt).booleanValue()) {
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
                ClipData clipData2 = new ClipData(clipDescription, (ClipData.Item) CollectionsKt.first((List) arrayList));
                int size = arrayList.size();
                for (int i11 = 1; i11 < size; i11++) {
                    clipData2.addItem((ClipData.Item) arrayList.get(i11));
                }
                return new TransferableContent(AndroidClipboardManager_androidKt.toClipEntry(clipData2), AndroidClipboardManager_androidKt.toClipMetadata(clipDescription), transferableContent.getSource(), transferableContent.getPlatformTransferableContent(), null);
            }
        } else if (function1.invoke(clipData.getItemAt(0)).booleanValue()) {
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
        boolean z9 = false;
        for (int i10 = 0; i10 < itemCount; i10++) {
            z9 = z9 || clipEntry.getClipData().getItemAt(i10).getText() != null;
        }
        if (!z9) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int itemCount2 = clipEntry.getClipData().getItemCount();
        boolean z10 = false;
        for (int i11 = 0; i11 < itemCount2; i11++) {
            CharSequence text = clipEntry.getClipData().getItemAt(i11).getText();
            if (text != null) {
                if (z10) {
                    sb.append(SignParameters.NEW_LINE);
                }
                sb.append(text);
                z10 = true;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
