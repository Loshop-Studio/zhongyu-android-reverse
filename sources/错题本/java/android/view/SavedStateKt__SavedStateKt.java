package android.view;

import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a:\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00060\u0001j\u0002`\u00022\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0002\b\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a:\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00060\u0001j\u0002`\u00022\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0002\b\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "Lkotlin/Function1;", "Landroidx/savedstate/SavedStateReader;", "Lkotlin/ExtensionFunctionType;", "block", "read", "(Landroid/os/Bundle;Lr6/c;)Ljava/lang/Object;", "Landroidx/savedstate/SavedStateWriter;", "write", "savedstate_release"}, m5111k = 5, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE, m5115xs = "androidx/savedstate/SavedStateKt")
/* loaded from: classes2.dex */
final /* synthetic */ class SavedStateKt__SavedStateKt {
    public static final <T> T read(@NotNull Bundle bundle, @NotNull InterfaceC6471c block) {
        AbstractC5830k.m5330g(bundle, "<this>");
        AbstractC5830k.m5330g(block, "block");
        return (T) block.invoke(SavedStateReader.m13596boximpl(SavedStateReader.m13597constructorimpl(bundle)));
    }

    public static final <T> T write(@NotNull Bundle bundle, @NotNull InterfaceC6471c block) {
        AbstractC5830k.m5330g(bundle, "<this>");
        AbstractC5830k.m5330g(block, "block");
        return (T) block.invoke(SavedStateWriter.m13681boximpl(SavedStateWriter.m13683constructorimpl(bundle)));
    }
}
