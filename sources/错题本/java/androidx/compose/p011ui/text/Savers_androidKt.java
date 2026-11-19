package androidx.compose.p011ui.text;

import androidx.compose.p011ui.text.PlatformParagraphStyle;
import androidx.compose.p011ui.text.style.LineBreak;
import androidx.compose.p011ui.text.style.TextMotion;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"$\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"$\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\r\"$\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m5110d2 = {"LineBreakSaver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/LineBreak;", "", "PlatformParagraphStyleSaver", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "TextMotionSaver", "Landroidx/compose/ui/text/style/TextMotion;", "Saver", "Landroidx/compose/ui/text/PlatformParagraphStyle$Companion;", "getSaver", "(Landroidx/compose/ui/text/PlatformParagraphStyle$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/LineBreak$Companion;", "(Landroidx/compose/ui/text/style/LineBreak$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/TextMotion$Companion;", "(Landroidx/compose/ui/text/style/TextMotion$Companion;)Landroidx/compose/runtime/saveable/Saver;", "ui-text_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class Savers_androidKt {

    @NotNull
    private static final Saver<PlatformParagraphStyle, Object> PlatformParagraphStyleSaver = SaverKt.Saver(new InterfaceC6473e() { // from class: androidx.compose.ui.text.Savers_androidKt$PlatformParagraphStyleSaver$1
        @Override // p152r6.InterfaceC6473e
        public final Object invoke(SaverScope saverScope, PlatformParagraphStyle platformParagraphStyle) {
            return AbstractC5806u.m5267f(SaversKt.save(Boolean.valueOf(platformParagraphStyle.getIncludeFontPadding())), SaversKt.save(EmojiSupportMatch.m12607boximpl(platformParagraphStyle.getEmojiSupportMatch())));
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.ui.text.Savers_androidKt$PlatformParagraphStyleSaver$2
        @Override // p152r6.InterfaceC6471c
        public final PlatformParagraphStyle invoke(Object obj) {
            AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Boolean bool = obj2 != null ? (Boolean) obj2 : null;
            AbstractC5830k.m5327d(bool);
            boolean zBooleanValue = bool.booleanValue();
            Object obj3 = list.get(1);
            EmojiSupportMatch emojiSupportMatch = obj3 != null ? (EmojiSupportMatch) obj3 : null;
            AbstractC5830k.m5327d(emojiSupportMatch);
            return new PlatformParagraphStyle(emojiSupportMatch.getValue(), zBooleanValue, (AbstractC5824e) null);
        }
    });

    @NotNull
    private static final Saver<LineBreak, Object> LineBreakSaver = SaverKt.Saver(new InterfaceC6473e() { // from class: androidx.compose.ui.text.Savers_androidKt$LineBreakSaver$1
        @Override // p152r6.InterfaceC6473e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m12699invokenI23V4A((SaverScope) obj, ((LineBreak) obj2).getMask());
        }

        /* renamed from: invoke-nI23V4A, reason: not valid java name */
        public final Object m12699invokenI23V4A(SaverScope saverScope, int i) {
            return Integer.valueOf(i);
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.ui.text.Savers_androidKt$LineBreakSaver$2
        @Override // p152r6.InterfaceC6471c
        /* renamed from: invoke-8aCASmQ, reason: not valid java name and merged with bridge method [inline-methods] */
        public final LineBreak invoke(Object obj) {
            AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlin.Int");
            return LineBreak.m13090boximpl(LineBreak.m13091constructorimpl(((Integer) obj).intValue()));
        }
    });

    @NotNull
    private static final Saver<TextMotion, Object> TextMotionSaver = SaverKt.Saver(new InterfaceC6473e() { // from class: androidx.compose.ui.text.Savers_androidKt$TextMotionSaver$1
        @Override // p152r6.InterfaceC6473e
        public final Object invoke(SaverScope saverScope, TextMotion textMotion) {
            return AbstractC5806u.m5267f(SaversKt.save(TextMotion.Linearity.m13218boximpl(textMotion.getLinearity())), SaversKt.save(Boolean.valueOf(textMotion.getSubpixelTextPositioning())));
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.ui.text.Savers_androidKt$TextMotionSaver$2
        @Override // p152r6.InterfaceC6471c
        public final TextMotion invoke(Object obj) {
            AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            TextMotion.Linearity linearity = obj2 != null ? (TextMotion.Linearity) obj2 : null;
            AbstractC5830k.m5327d(linearity);
            int value = linearity.getValue();
            Object obj3 = list.get(1);
            Boolean bool = obj3 != null ? (Boolean) obj3 : null;
            AbstractC5830k.m5327d(bool);
            return new TextMotion(value, bool.booleanValue(), null);
        }
    });

    @NotNull
    public static final Saver<PlatformParagraphStyle, Object> getSaver(@NotNull PlatformParagraphStyle.Companion companion) {
        return PlatformParagraphStyleSaver;
    }

    @NotNull
    public static final Saver<LineBreak, Object> getSaver(@NotNull LineBreak.Companion companion) {
        return LineBreakSaver;
    }

    @NotNull
    public static final Saver<TextMotion, Object> getSaver(@NotNull TextMotion.Companion companion) {
        return TextMotionSaver;
    }
}
