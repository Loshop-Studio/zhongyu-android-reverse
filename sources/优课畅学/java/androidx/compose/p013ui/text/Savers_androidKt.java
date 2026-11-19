package androidx.compose.p013ui.text;

import androidx.compose.p013ui.text.PlatformParagraphStyle;
import androidx.compose.p013ui.text.style.LineBreak;
import androidx.compose.p013ui.text.style.TextMotion;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public final class Savers_androidKt {
    private static final Saver<PlatformParagraphStyle, Object> PlatformParagraphStyleSaver = SaverKt.Saver(new InterfaceC10574p() { // from class: androidx.compose.ui.text.Savers_androidKt$PlatformParagraphStyleSaver$1
        @Override // p300x7.InterfaceC10574p
        public final Object invoke(SaverScope saverScope, PlatformParagraphStyle platformParagraphStyle) {
            return AbstractC8809v.m14764g(SaversKt.save(Boolean.valueOf(platformParagraphStyle.getIncludeFontPadding())), SaversKt.save(EmojiSupportMatch.m26201boximpl(platformParagraphStyle.m26282getEmojiSupportMatch_3YsG6Y())));
        }
    }, new InterfaceC10570l() { // from class: androidx.compose.ui.text.Savers_androidKt$PlatformParagraphStyleSaver$2
        @Override // p300x7.InterfaceC10570l
        public final PlatformParagraphStyle invoke(Object obj) {
            AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Boolean bool = obj2 != null ? (Boolean) obj2 : null;
            AbstractC9133u.m16130d(bool);
            boolean zBooleanValue = bool.booleanValue();
            Object obj3 = list.get(1);
            EmojiSupportMatch emojiSupportMatch = obj3 != null ? (EmojiSupportMatch) obj3 : null;
            AbstractC9133u.m16130d(emojiSupportMatch);
            return new PlatformParagraphStyle(emojiSupportMatch.m26207unboximpl(), zBooleanValue, (AbstractC9126n) null);
        }
    });
    private static final Saver<LineBreak, Object> LineBreakSaver = SaverKt.Saver(new InterfaceC10574p() { // from class: androidx.compose.ui.text.Savers_androidKt$LineBreakSaver$1
        @Override // p300x7.InterfaceC10574p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m26293invokenI23V4A((SaverScope) obj, ((LineBreak) obj2).m26696unboximpl());
        }

        /* renamed from: invoke-nI23V4A, reason: not valid java name */
        public final Object m26293invokenI23V4A(SaverScope saverScope, int i10) {
            return Integer.valueOf(i10);
        }
    }, new InterfaceC10570l() { // from class: androidx.compose.ui.text.Savers_androidKt$LineBreakSaver$2
        @Override // p300x7.InterfaceC10570l
        /* renamed from: invoke-8aCASmQ, reason: not valid java name and merged with bridge method [inline-methods] */
        public final LineBreak invoke(Object obj) {
            AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type kotlin.Int");
            return LineBreak.m26684boximpl(LineBreak.m26685constructorimpl(((Integer) obj).intValue()));
        }
    });
    private static final Saver<TextMotion, Object> TextMotionSaver = SaverKt.Saver(new InterfaceC10574p() { // from class: androidx.compose.ui.text.Savers_androidKt$TextMotionSaver$1
        @Override // p300x7.InterfaceC10574p
        public final Object invoke(SaverScope saverScope, TextMotion textMotion) {
            return AbstractC8809v.m14764g(SaversKt.save(TextMotion.Linearity.m26812boximpl(textMotion.m26811getLinearity4e0Vf04$ui_text_release())), SaversKt.save(Boolean.valueOf(textMotion.getSubpixelTextPositioning$ui_text_release())));
        }
    }, new InterfaceC10570l() { // from class: androidx.compose.ui.text.Savers_androidKt$TextMotionSaver$2
        @Override // p300x7.InterfaceC10570l
        public final TextMotion invoke(Object obj) {
            AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            TextMotion.Linearity linearity = obj2 != null ? (TextMotion.Linearity) obj2 : null;
            AbstractC9133u.m16130d(linearity);
            int iM26818unboximpl = linearity.m26818unboximpl();
            Object obj3 = list.get(1);
            Boolean bool = obj3 != null ? (Boolean) obj3 : null;
            AbstractC9133u.m16130d(bool);
            return new TextMotion(iM26818unboximpl, bool.booleanValue(), null);
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
