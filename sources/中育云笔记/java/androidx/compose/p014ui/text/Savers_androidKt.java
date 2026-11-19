package androidx.compose.p014ui.text;

import androidx.compose.p014ui.text.PlatformParagraphStyle;
import androidx.compose.p014ui.text.style.LineBreak;
import androidx.compose.p014ui.text.style.TextMotion;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p325rc.AbstractC10978w;

/* loaded from: classes2.dex */
public final class Savers_androidKt {
    private static final Saver<PlatformParagraphStyle, Object> PlatformParagraphStyleSaver = SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.compose.ui.text.Savers_androidKt$PlatformParagraphStyleSaver$1
        @Override // p181hd.InterfaceC9544p
        public final Object invoke(SaverScope saverScope, PlatformParagraphStyle platformParagraphStyle) {
            return AbstractC10978w.m24129g(SaversKt.save(Boolean.valueOf(platformParagraphStyle.getIncludeFontPadding())), SaversKt.save(EmojiSupportMatch.m32803boximpl(platformParagraphStyle.m32884getEmojiSupportMatch_3YsG6Y())));
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.ui.text.Savers_androidKt$PlatformParagraphStyleSaver$2
        @Override // p181hd.InterfaceC9540l
        public final PlatformParagraphStyle invoke(Object obj) {
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Boolean bool = obj2 != null ? (Boolean) obj2 : null;
            AbstractC9979u.m20291d(bool);
            boolean zBooleanValue = bool.booleanValue();
            Object obj3 = list.get(1);
            EmojiSupportMatch emojiSupportMatch = obj3 != null ? (EmojiSupportMatch) obj3 : null;
            AbstractC9979u.m20291d(emojiSupportMatch);
            return new PlatformParagraphStyle(emojiSupportMatch.m32809unboximpl(), zBooleanValue, (AbstractC9972n) null);
        }
    });
    private static final Saver<LineBreak, Object> LineBreakSaver = SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.compose.ui.text.Savers_androidKt$LineBreakSaver$1
        @Override // p181hd.InterfaceC9544p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m32895invokenI23V4A((SaverScope) obj, ((LineBreak) obj2).m33298unboximpl());
        }

        /* renamed from: invoke-nI23V4A, reason: not valid java name */
        public final Object m32895invokenI23V4A(SaverScope saverScope, int i10) {
            return Integer.valueOf(i10);
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.ui.text.Savers_androidKt$LineBreakSaver$2
        @Override // p181hd.InterfaceC9540l
        /* renamed from: invoke-8aCASmQ, reason: not valid java name and merged with bridge method [inline-methods] */
        public final LineBreak invoke(Object obj) {
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.Int");
            return LineBreak.m33286boximpl(LineBreak.m33287constructorimpl(((Integer) obj).intValue()));
        }
    });
    private static final Saver<TextMotion, Object> TextMotionSaver = SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.compose.ui.text.Savers_androidKt$TextMotionSaver$1
        @Override // p181hd.InterfaceC9544p
        public final Object invoke(SaverScope saverScope, TextMotion textMotion) {
            return AbstractC10978w.m24129g(SaversKt.save(TextMotion.Linearity.m33414boximpl(textMotion.m33413getLinearity4e0Vf04$ui_text_release())), SaversKt.save(Boolean.valueOf(textMotion.getSubpixelTextPositioning$ui_text_release())));
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.ui.text.Savers_androidKt$TextMotionSaver$2
        @Override // p181hd.InterfaceC9540l
        public final TextMotion invoke(Object obj) {
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            TextMotion.Linearity linearity = obj2 != null ? (TextMotion.Linearity) obj2 : null;
            AbstractC9979u.m20291d(linearity);
            int iM33420unboximpl = linearity.m33420unboximpl();
            Object obj3 = list.get(1);
            Boolean bool = obj3 != null ? (Boolean) obj3 : null;
            AbstractC9979u.m20291d(bool);
            return new TextMotion(iM33420unboximpl, bool.booleanValue(), null);
        }
    });

    public static final Saver<PlatformParagraphStyle, Object> getSaver(PlatformParagraphStyle.Companion companion) {
        return PlatformParagraphStyleSaver;
    }

    public static final Saver<LineBreak, Object> getSaver(LineBreak.Companion companion) {
        return LineBreakSaver;
    }

    public static final Saver<TextMotion, Object> getSaver(TextMotion.Companion companion) {
        return TextMotionSaver;
    }
}
