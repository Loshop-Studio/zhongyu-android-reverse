package androidx.compose.foundation.content;

import android.content.ClipData;
import android.content.ClipDescription;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p011ui.platform.AndroidClipboardManager_androidKt;
import androidx.compose.p011ui.platform.ClipEntry;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a)\u0010\u0005\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m5110d2 = {"Landroidx/compose/foundation/content/TransferableContent;", "Lkotlin/Function1;", "Landroid/content/ClipData$Item;", "", "predicate", "consume", "(Landroidx/compose/foundation/content/TransferableContent;Lr6/c;)Landroidx/compose/foundation/content/TransferableContent;", "Landroidx/compose/foundation/content/MediaType;", "mediaType", "hasMediaType", "(Landroidx/compose/foundation/content/TransferableContent;Landroidx/compose/foundation/content/MediaType;)Z", "Landroidx/compose/ui/platform/ClipEntry;", "", "readPlainText", "(Landroidx/compose/ui/platform/ClipEntry;)Ljava/lang/String;", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTransferableContent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferableContent.android.kt\nandroidx/compose/foundation/content/TransferableContent_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
/* loaded from: classes.dex */
public final class TransferableContent_androidKt {
    @ExperimentalFoundationApi
    @Nullable
    public static final TransferableContent consume(@NotNull TransferableContent transferableContent, @NotNull InterfaceC6471c interfaceC6471c) {
        ClipData clipData = transferableContent.getClipEntry().getClipData();
        if (clipData.getItemCount() != 1) {
            int itemCount = clipData.getItemCount();
            ArrayList arrayList = null;
            for (int i = 0; i < itemCount; i++) {
                ClipData.Item itemAt = clipData.getItemAt(i);
                if (!((Boolean) interfaceC6471c.invoke(itemAt)).booleanValue()) {
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
                ClipData clipData2 = new ClipData(clipDescription, (ClipData.Item) AbstractC5805t.m5228h0(arrayList));
                int size = arrayList.size();
                for (int i8 = 1; i8 < size; i8++) {
                    clipData2.addItem((ClipData.Item) arrayList.get(i8));
                }
                return new TransferableContent(AndroidClipboardManager_androidKt.toClipEntry(clipData2), AndroidClipboardManager_androidKt.toClipMetadata(clipDescription), transferableContent.getSource(), transferableContent.getPlatformTransferableContent(), null);
            }
        } else if (((Boolean) interfaceC6471c.invoke(clipData.getItemAt(0))).booleanValue()) {
            return null;
        }
        return transferableContent;
    }

    @ExperimentalFoundationApi
    public static final boolean hasMediaType(@NotNull TransferableContent transferableContent, @NotNull MediaType mediaType) {
        return transferableContent.getClipMetadata().getClipDescription().hasMimeType(mediaType.getRepresentation());
    }

    @Nullable
    public static final String readPlainText(@NotNull ClipEntry clipEntry) {
        int itemCount = clipEntry.getClipData().getItemCount();
        boolean z8 = false;
        for (int i = 0; i < itemCount; i++) {
            z8 = z8 || clipEntry.getClipData().getItemAt(i).getText() != null;
        }
        if (!z8) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int itemCount2 = clipEntry.getClipData().getItemCount();
        boolean z9 = false;
        for (int i8 = 0; i8 < itemCount2; i8++) {
            CharSequence text = clipEntry.getClipData().getItemAt(i8).getText();
            if (text != null) {
                if (z9) {
                    sb.append(SignParameters.NEW_LINE);
                }
                sb.append(text);
                z9 = true;
            }
        }
        String string = sb.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        return string;
    }
}
