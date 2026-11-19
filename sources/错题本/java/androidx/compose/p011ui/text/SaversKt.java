package androidx.compose.p011ui.text;

import androidx.autofill.HintConstants;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.LinkAnnotation;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.Locale;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.Hyphens;
import androidx.compose.p011ui.text.style.LineBreak;
import androidx.compose.p011ui.text.style.LineHeightStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextDirection;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.text.style.TextIndent;
import androidx.compose.p011ui.text.style.TextMotion;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.p011ui.unit.TextUnitKt;
import androidx.compose.p011ui.unit.TextUnitType;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\u0098\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\t\u001a\u00020\b\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001aN\u0010\f\u001a\u0004\u0018\u00018\u0003\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003\"\u0006\b\u0003\u0010\u000b\u0018\u00012\b\u0010\u0004\u001a\u0004\u0018\u00018\u00022\u0006\u0010\u0005\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\f\u0010\r\u001a\u0080\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\b2.\u0010\t\u001a*\u0012\u0004\u0012\u00020\u0006\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000e¢\u0006\u0002\b\u00112#\u0010\f\u001a\u001f\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a!\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0000¢\u0006\u0004\b\t\u0010\u0016\u001a$\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u000b\u0018\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\bH\u0080\b¢\u0006\u0004\b\f\u0010\u0016\"&\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\".\u0010\u001e\u001a\u001c\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u001d0\u001c\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019\".\u0010\u001f\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u001d\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u0012\u0004\b \u0010!\" \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019\"&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b%\u0010\u0019\u0012\u0004\b&\u0010!\" \u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019\" \u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019\"&\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010\u0019\u001a\u0004\b-\u0010\u001b\"&\u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u0010\u0019\u001a\u0004\b0\u0010\u001b\"&\u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u0010\u0019\u001a\u0004\b3\u0010\u001b\" \u00105\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0019\" \u00107\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\u0019\" \u00109\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\u0019\" \u0010;\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0019\" \u0010=\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010\u0019\" \u0010?\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010\u0019\" \u0010A\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010\u0019\" \u0010C\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\b0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D\" \u0010F\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\b0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010D\" \u0010H\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\b0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010D\" \u0010J\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010\u0019\" \u0010L\u001a\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010\u0019\" \u0010N\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010\u0019\"$\u0010R\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\b0\u0000*\u00020O8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bP\u0010Q\"$\u0010R\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\b0\u0000*\u00020S8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bP\u0010T\"$\u0010R\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\b0\u0000*\u00020U8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bP\u0010V\"$\u0010R\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\b0\u0000*\u00020W8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bP\u0010X\"$\u0010R\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\b0\u0000*\u00020Y8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bP\u0010Z\"$\u0010R\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\b0\u0000*\u00020[8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bP\u0010\\\"$\u0010R\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\b0\u0000*\u00020]8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bP\u0010^\"$\u0010R\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\b0\u0000*\u00020_8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bP\u0010`\"$\u0010R\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\b0\u0000*\u00020a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bP\u0010b\"$\u0010R\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\b0\u0000*\u00020c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bP\u0010d\"$\u0010R\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\b0\u0000*\u00020e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bP\u0010f\"$\u0010R\u001a\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\b0\u0000*\u00020g8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bP\u0010h\"$\u0010R\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\b0\u0000*\u00020i8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bP\u0010j¨\u0006k"}, m5110d2 = {"Landroidx/compose/runtime/saveable/Saver;", ExifInterface.GPS_DIRECTION_TRUE, "Original", "Saveable", "value", "saver", "Landroidx/compose/runtime/saveable/SaverScope;", "scope", "", "save", "(Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Landroidx/compose/runtime/saveable/SaverScope;)Ljava/lang/Object;", "Result", RequestParameters.X_OSS_RESTORE, "(Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "Lkotlin/ExtensionFunctionType;", "Lkotlin/Function1;", "Landroidx/compose/ui/text/NonNullValueClassSaver;", "NonNullValueClassSaver", "(Lr6/e;Lr6/c;)Landroidx/compose/ui/text/NonNullValueClassSaver;", "(Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/compose/ui/text/AnnotatedString;", "AnnotatedStringSaver", "Landroidx/compose/runtime/saveable/Saver;", "getAnnotatedStringSaver", "()Landroidx/compose/runtime/saveable/Saver;", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "AnnotationRangeListSaver", "AnnotationRangeSaver", "getAnnotationRangeSaver$annotations", "()V", "Landroidx/compose/ui/text/VerbatimTtsAnnotation;", "VerbatimTtsAnnotationSaver", "Landroidx/compose/ui/text/UrlAnnotation;", "UrlAnnotationSaver", "getUrlAnnotationSaver$annotations", "Landroidx/compose/ui/text/LinkAnnotation$Url;", "LinkSaver", "Landroidx/compose/ui/text/LinkAnnotation$Clickable;", "ClickableSaver", "Landroidx/compose/ui/text/ParagraphStyle;", "ParagraphStyleSaver", "getParagraphStyleSaver", "Landroidx/compose/ui/text/SpanStyle;", "SpanStyleSaver", "getSpanStyleSaver", "Landroidx/compose/ui/text/TextLinkStyles;", "TextLinkStylesSaver", "getTextLinkStylesSaver", "Landroidx/compose/ui/text/style/TextDecoration;", "TextDecorationSaver", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "TextGeometricTransformSaver", "Landroidx/compose/ui/text/style/TextIndent;", "TextIndentSaver", "Landroidx/compose/ui/text/font/FontWeight;", "FontWeightSaver", "Landroidx/compose/ui/text/style/BaselineShift;", "BaselineShiftSaver", "Landroidx/compose/ui/text/TextRange;", "TextRangeSaver", "Landroidx/compose/ui/graphics/Shadow;", "ShadowSaver", "Landroidx/compose/ui/graphics/Color;", "ColorSaver", "Landroidx/compose/ui/text/NonNullValueClassSaver;", "Landroidx/compose/ui/unit/TextUnit;", "TextUnitSaver", "Landroidx/compose/ui/geometry/Offset;", "OffsetSaver", "Landroidx/compose/ui/text/intl/LocaleList;", "LocaleListSaver", "Landroidx/compose/ui/text/intl/Locale;", "LocaleSaver", "Landroidx/compose/ui/text/style/LineHeightStyle;", "LineHeightStyleSaver", "Landroidx/compose/ui/text/style/TextDecoration$Companion;", "getSaver", "(Landroidx/compose/ui/text/style/TextDecoration$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Saver", "Landroidx/compose/ui/text/style/TextGeometricTransform$Companion;", "(Landroidx/compose/ui/text/style/TextGeometricTransform$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/TextIndent$Companion;", "(Landroidx/compose/ui/text/style/TextIndent$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/font/FontWeight$Companion;", "(Landroidx/compose/ui/text/font/FontWeight$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/BaselineShift$Companion;", "(Landroidx/compose/ui/text/style/BaselineShift$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/TextRange$Companion;", "(Landroidx/compose/ui/text/TextRange$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/graphics/Shadow$Companion;", "(Landroidx/compose/ui/graphics/Shadow$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/graphics/Color$Companion;", "(Landroidx/compose/ui/graphics/Color$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/unit/TextUnit$Companion;", "(Landroidx/compose/ui/unit/TextUnit$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/geometry/Offset$Companion;", "(Landroidx/compose/ui/geometry/Offset$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/intl/LocaleList$Companion;", "(Landroidx/compose/ui/text/intl/LocaleList$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/intl/Locale$Companion;", "(Landroidx/compose/ui/text/intl/Locale$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/LineHeightStyle$Companion;", "(Landroidx/compose/ui/text/style/LineHeightStyle$Companion;)Landroidx/compose/runtime/saveable/Saver;", "ui-text_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,546:1\n1#2:547\n*E\n"})
/* loaded from: classes2.dex */
public final class SaversKt {

    @NotNull
    private static final Saver<AnnotatedString, Object> AnnotatedStringSaver = SaverKt.Saver(new InterfaceC6473e() { // from class: androidx.compose.ui.text.SaversKt$AnnotatedStringSaver$1
        @Override // p152r6.InterfaceC6473e
        public final Object invoke(SaverScope saverScope, AnnotatedString annotatedString) {
            return AbstractC5806u.m5267f(SaversKt.save(annotatedString.getText()), SaversKt.save(annotatedString.getAnnotations$ui_text_release(), SaversKt.AnnotationRangeListSaver, saverScope));
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.ui.text.SaversKt$AnnotatedStringSaver$2
        @Override // p152r6.InterfaceC6471c
        public final AnnotatedString invoke(Object obj) {
            AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(1);
            Saver saver = SaversKt.AnnotationRangeListSaver;
            List list2 = ((!AbstractC5830k.m5325b(obj2, Boolean.FALSE) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) ? (List) saver.restore(obj2) : null;
            Object obj3 = list.get(0);
            String str = obj3 != null ? (String) obj3 : null;
            AbstractC5830k.m5327d(str);
            return new AnnotatedString((List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>>) list2, str);
        }
    });

    @NotNull
    private static final Saver<List<AnnotatedString.Range<? extends Object>>, Object> AnnotationRangeListSaver = SaverKt.Saver(new InterfaceC6473e() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeListSaver$1
        @Override // p152r6.InterfaceC6473e
        public final Object invoke(SaverScope saverScope, List<? extends AnnotatedString.Range<? extends Object>> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(SaversKt.save(list.get(i), SaversKt.AnnotationRangeSaver, saverScope));
            }
            return arrayList;
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeListSaver$2
        @Override // p152r6.InterfaceC6471c
        public final List<AnnotatedString.Range<? extends Object>> invoke(Object obj) {
            AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                Saver saver = SaversKt.AnnotationRangeSaver;
                AnnotatedString.Range range = null;
                if ((!AbstractC5830k.m5325b(obj2, Boolean.FALSE) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) {
                    range = (AnnotatedString.Range) saver.restore(obj2);
                }
                AbstractC5830k.m5327d(range);
                arrayList.add(range);
            }
            return arrayList;
        }
    });

    @NotNull
    private static final Saver<AnnotatedString.Range<? extends Object>, Object> AnnotationRangeSaver = SaverKt.Saver(new InterfaceC6473e() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$1

        @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AnnotationType.values().length];
                try {
                    iArr[AnnotationType.Paragraph.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AnnotationType.Span.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AnnotationType.Url.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AnnotationType.Link.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AnnotationType.Clickable.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AnnotationType.String.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(SaverScope saverScope, AnnotatedString.Range<? extends Object> range) {
            AnnotationType annotationType;
            Object objSave;
            Object item = range.getItem();
            if (item instanceof ParagraphStyle) {
                annotationType = AnnotationType.Paragraph;
            } else if (item instanceof SpanStyle) {
                annotationType = AnnotationType.Span;
            } else if (item instanceof VerbatimTtsAnnotation) {
                annotationType = AnnotationType.VerbatimTts;
            } else if (item instanceof UrlAnnotation) {
                annotationType = AnnotationType.Url;
            } else if (item instanceof LinkAnnotation.Url) {
                annotationType = AnnotationType.Link;
            } else if (item instanceof LinkAnnotation.Clickable) {
                annotationType = AnnotationType.Clickable;
            } else {
                if (!(item instanceof StringAnnotation)) {
                    throw new UnsupportedOperationException();
                }
                annotationType = AnnotationType.String;
            }
            switch (WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()]) {
                case 1:
                    Object item2 = range.getItem();
                    AbstractC5830k.m5328e(item2, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                    objSave = SaversKt.save((ParagraphStyle) item2, SaversKt.getParagraphStyleSaver(), saverScope);
                    break;
                case 2:
                    Object item3 = range.getItem();
                    AbstractC5830k.m5328e(item3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                    objSave = SaversKt.save((SpanStyle) item3, SaversKt.getSpanStyleSaver(), saverScope);
                    break;
                case 3:
                    Object item4 = range.getItem();
                    AbstractC5830k.m5328e(item4, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                    objSave = SaversKt.save((VerbatimTtsAnnotation) item4, SaversKt.VerbatimTtsAnnotationSaver, saverScope);
                    break;
                case 4:
                    Object item5 = range.getItem();
                    AbstractC5830k.m5328e(item5, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                    objSave = SaversKt.save((UrlAnnotation) item5, SaversKt.UrlAnnotationSaver, saverScope);
                    break;
                case 5:
                    Object item6 = range.getItem();
                    AbstractC5830k.m5328e(item6, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                    objSave = SaversKt.save((LinkAnnotation.Url) item6, SaversKt.LinkSaver, saverScope);
                    break;
                case 6:
                    Object item7 = range.getItem();
                    AbstractC5830k.m5328e(item7, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                    objSave = SaversKt.save((LinkAnnotation.Clickable) item7, SaversKt.ClickableSaver, saverScope);
                    break;
                case 7:
                    Object item8 = range.getItem();
                    AbstractC5830k.m5328e(item8, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                    objSave = SaversKt.save(((StringAnnotation) item8).m12724unboximpl());
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            return AbstractC5806u.m5267f(SaversKt.save(annotationType), objSave, SaversKt.save(Integer.valueOf(range.getStart())), SaversKt.save(Integer.valueOf(range.getEnd())), SaversKt.save(range.getTag()));
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$2

        @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AnnotationType.values().length];
                try {
                    iArr[AnnotationType.Paragraph.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AnnotationType.Span.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AnnotationType.Url.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AnnotationType.Link.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AnnotationType.Clickable.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AnnotationType.String.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // p152r6.InterfaceC6471c
        public final AnnotatedString.Range<? extends Object> invoke(Object obj) {
            AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            ParagraphStyle paragraphStyleRestore = null;
            clickable = null;
            LinkAnnotation.Clickable clickable = null;
            url = null;
            LinkAnnotation.Url url = null;
            urlAnnotation = null;
            UrlAnnotation urlAnnotation = null;
            verbatimTtsAnnotation = null;
            VerbatimTtsAnnotation verbatimTtsAnnotation = null;
            spanStyleRestore = null;
            SpanStyle spanStyleRestore = null;
            paragraphStyleRestore = null;
            AnnotationType annotationType = obj2 != null ? (AnnotationType) obj2 : null;
            AbstractC5830k.m5327d(annotationType);
            Object obj3 = list.get(2);
            Integer num = obj3 != null ? (Integer) obj3 : null;
            AbstractC5830k.m5327d(num);
            int iIntValue = num.intValue();
            Object obj4 = list.get(3);
            Integer num2 = obj4 != null ? (Integer) obj4 : null;
            AbstractC5830k.m5327d(num2);
            int iIntValue2 = num2.intValue();
            Object obj5 = list.get(4);
            String str = obj5 != null ? (String) obj5 : null;
            AbstractC5830k.m5327d(str);
            switch (WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()]) {
                case 1:
                    Object obj6 = list.get(1);
                    Saver<ParagraphStyle, Object> paragraphStyleSaver = SaversKt.getParagraphStyleSaver();
                    if ((!AbstractC5830k.m5325b(obj6, Boolean.FALSE) || (paragraphStyleSaver instanceof NonNullValueClassSaver)) && obj6 != null) {
                        paragraphStyleRestore = paragraphStyleSaver.restore(obj6);
                    }
                    AbstractC5830k.m5327d(paragraphStyleRestore);
                    return new AnnotatedString.Range<>(paragraphStyleRestore, iIntValue, iIntValue2, str);
                case 2:
                    Object obj7 = list.get(1);
                    Saver<SpanStyle, Object> spanStyleSaver = SaversKt.getSpanStyleSaver();
                    if ((!AbstractC5830k.m5325b(obj7, Boolean.FALSE) || (spanStyleSaver instanceof NonNullValueClassSaver)) && obj7 != null) {
                        spanStyleRestore = spanStyleSaver.restore(obj7);
                    }
                    AbstractC5830k.m5327d(spanStyleRestore);
                    return new AnnotatedString.Range<>(spanStyleRestore, iIntValue, iIntValue2, str);
                case 3:
                    Object obj8 = list.get(1);
                    Saver saver = SaversKt.VerbatimTtsAnnotationSaver;
                    if ((!AbstractC5830k.m5325b(obj8, Boolean.FALSE) || (saver instanceof NonNullValueClassSaver)) && obj8 != null) {
                        verbatimTtsAnnotation = (VerbatimTtsAnnotation) saver.restore(obj8);
                    }
                    AbstractC5830k.m5327d(verbatimTtsAnnotation);
                    return new AnnotatedString.Range<>(verbatimTtsAnnotation, iIntValue, iIntValue2, str);
                case 4:
                    Object obj9 = list.get(1);
                    Saver saver2 = SaversKt.UrlAnnotationSaver;
                    if ((!AbstractC5830k.m5325b(obj9, Boolean.FALSE) || (saver2 instanceof NonNullValueClassSaver)) && obj9 != null) {
                        urlAnnotation = (UrlAnnotation) saver2.restore(obj9);
                    }
                    AbstractC5830k.m5327d(urlAnnotation);
                    return new AnnotatedString.Range<>(urlAnnotation, iIntValue, iIntValue2, str);
                case 5:
                    Object obj10 = list.get(1);
                    Saver saver3 = SaversKt.LinkSaver;
                    if ((!AbstractC5830k.m5325b(obj10, Boolean.FALSE) || (saver3 instanceof NonNullValueClassSaver)) && obj10 != null) {
                        url = (LinkAnnotation.Url) saver3.restore(obj10);
                    }
                    AbstractC5830k.m5327d(url);
                    return new AnnotatedString.Range<>(url, iIntValue, iIntValue2, str);
                case 6:
                    Object obj11 = list.get(1);
                    Saver saver4 = SaversKt.ClickableSaver;
                    if ((!AbstractC5830k.m5325b(obj11, Boolean.FALSE) || (saver4 instanceof NonNullValueClassSaver)) && obj11 != null) {
                        clickable = (LinkAnnotation.Clickable) saver4.restore(obj11);
                    }
                    AbstractC5830k.m5327d(clickable);
                    return new AnnotatedString.Range<>(clickable, iIntValue, iIntValue2, str);
                case 7:
                    Object obj12 = list.get(1);
                    String str2 = obj12 != null ? (String) obj12 : null;
                    AbstractC5830k.m5327d(str2);
                    return new AnnotatedString.Range<>(StringAnnotation.m12718boximpl(StringAnnotation.m12719constructorimpl(str2)), iIntValue, iIntValue2, str);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    });

    @NotNull
    private static final Saver<VerbatimTtsAnnotation, Object> VerbatimTtsAnnotationSaver = SaverKt.Saver(new InterfaceC6473e() { // from class: androidx.compose.ui.text.SaversKt$VerbatimTtsAnnotationSaver$1
        @Override // p152r6.InterfaceC6473e
        public final Object invoke(SaverScope saverScope, VerbatimTtsAnnotation verbatimTtsAnnotation) {
            return SaversKt.save(verbatimTtsAnnotation.getVerbatim());
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.ui.text.SaversKt$VerbatimTtsAnnotationSaver$2
        @Override // p152r6.InterfaceC6471c
        public final VerbatimTtsAnnotation invoke(Object obj) {
            String str = obj != null ? (String) obj : null;
            AbstractC5830k.m5327d(str);
            return new VerbatimTtsAnnotation(str);
        }
    });

    @NotNull
    private static final Saver<UrlAnnotation, Object> UrlAnnotationSaver = SaverKt.Saver(new InterfaceC6473e() { // from class: androidx.compose.ui.text.SaversKt$UrlAnnotationSaver$1
        @Override // p152r6.InterfaceC6473e
        public final Object invoke(SaverScope saverScope, UrlAnnotation urlAnnotation) {
            return SaversKt.save(urlAnnotation.getUrl());
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.ui.text.SaversKt$UrlAnnotationSaver$2
        @Override // p152r6.InterfaceC6471c
        public final UrlAnnotation invoke(Object obj) {
            String str = obj != null ? (String) obj : null;
            AbstractC5830k.m5327d(str);
            return new UrlAnnotation(str);
        }
    });

    @NotNull
    private static final Saver<LinkAnnotation.Url, Object> LinkSaver = SaverKt.Saver(new InterfaceC6473e() { // from class: androidx.compose.ui.text.SaversKt$LinkSaver$1
        @Override // p152r6.InterfaceC6473e
        public final Object invoke(SaverScope saverScope, LinkAnnotation.Url url) {
            return AbstractC5806u.m5267f(SaversKt.save(url.getUrl()), SaversKt.save(url.getStyles(), SaversKt.getTextLinkStylesSaver(), saverScope));
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.ui.text.SaversKt$LinkSaver$2
        @Override // p152r6.InterfaceC6471c
        public final LinkAnnotation.Url invoke(Object obj) {
            AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            TextLinkStyles textLinkStylesRestore = null;
            String str = obj2 != null ? (String) obj2 : null;
            AbstractC5830k.m5327d(str);
            Object obj3 = list.get(1);
            Saver<TextLinkStyles, Object> textLinkStylesSaver = SaversKt.getTextLinkStylesSaver();
            if ((!AbstractC5830k.m5325b(obj3, Boolean.FALSE) || (textLinkStylesSaver instanceof NonNullValueClassSaver)) && obj3 != null) {
                textLinkStylesRestore = textLinkStylesSaver.restore(obj3);
            }
            return new LinkAnnotation.Url(str, textLinkStylesRestore, null, 4, null);
        }
    });

    @NotNull
    private static final Saver<LinkAnnotation.Clickable, Object> ClickableSaver = SaverKt.Saver(new InterfaceC6473e() { // from class: androidx.compose.ui.text.SaversKt$ClickableSaver$1
        @Override // p152r6.InterfaceC6473e
        public final Object invoke(SaverScope saverScope, LinkAnnotation.Clickable clickable) {
            return AbstractC5806u.m5267f(SaversKt.save(clickable.getTag()), SaversKt.save(clickable.getStyles(), SaversKt.getTextLinkStylesSaver(), saverScope));
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.ui.text.SaversKt$ClickableSaver$2
        @Override // p152r6.InterfaceC6471c
        public final LinkAnnotation.Clickable invoke(Object obj) {
            AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            String str = obj2 != null ? (String) obj2 : null;
            AbstractC5830k.m5327d(str);
            Object obj3 = list.get(1);
            Saver<TextLinkStyles, Object> textLinkStylesSaver = SaversKt.getTextLinkStylesSaver();
            return new LinkAnnotation.Clickable(str, ((!AbstractC5830k.m5325b(obj3, Boolean.FALSE) || (textLinkStylesSaver instanceof NonNullValueClassSaver)) && obj3 != null) ? textLinkStylesSaver.restore(obj3) : null, null);
        }
    });

    @NotNull
    private static final Saver<ParagraphStyle, Object> ParagraphStyleSaver = SaverKt.Saver(new InterfaceC6473e() { // from class: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$1
        @Override // p152r6.InterfaceC6473e
        public final Object invoke(SaverScope saverScope, ParagraphStyle paragraphStyle) {
            return AbstractC5806u.m5267f(SaversKt.save(TextAlign.m13182boximpl(paragraphStyle.getTextAlign())), SaversKt.save(TextDirection.m13196boximpl(paragraphStyle.getTextDirection())), SaversKt.save(TextUnit.m13489boximpl(paragraphStyle.getLineHeight()), SaversKt.getSaver(TextUnit.INSTANCE), saverScope), SaversKt.save(paragraphStyle.getTextIndent(), SaversKt.getSaver(TextIndent.INSTANCE), saverScope), SaversKt.save(paragraphStyle.getPlatformStyle(), Savers_androidKt.getSaver(PlatformParagraphStyle.INSTANCE), saverScope), SaversKt.save(paragraphStyle.getLineHeightStyle(), SaversKt.getSaver(LineHeightStyle.INSTANCE), saverScope), SaversKt.save(LineBreak.m13090boximpl(paragraphStyle.getLineBreak()), Savers_androidKt.getSaver(LineBreak.INSTANCE), saverScope), SaversKt.save(Hyphens.m13080boximpl(paragraphStyle.getHyphens())), SaversKt.save(paragraphStyle.getTextMotion(), Savers_androidKt.getSaver(TextMotion.INSTANCE), saverScope));
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$2
        @Override // p152r6.InterfaceC6471c
        public final ParagraphStyle invoke(Object obj) {
            AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            TextMotion textMotionRestore = null;
            TextAlign textAlign = obj2 != null ? (TextAlign) obj2 : null;
            AbstractC5830k.m5327d(textAlign);
            int value = textAlign.getValue();
            Object obj3 = list.get(1);
            TextDirection textDirection = obj3 != null ? (TextDirection) obj3 : null;
            AbstractC5830k.m5327d(textDirection);
            int value2 = textDirection.getValue();
            Object obj4 = list.get(2);
            Saver<TextUnit, Object> saver = SaversKt.getSaver(TextUnit.INSTANCE);
            Boolean bool = Boolean.FALSE;
            TextUnit textUnitRestore = ((!AbstractC5830k.m5325b(obj4, bool) || (saver instanceof NonNullValueClassSaver)) && obj4 != null) ? saver.restore(obj4) : null;
            AbstractC5830k.m5327d(textUnitRestore);
            long packedValue = textUnitRestore.getPackedValue();
            Object obj5 = list.get(3);
            Saver<TextIndent, Object> saver2 = SaversKt.getSaver(TextIndent.INSTANCE);
            TextIndent textIndentRestore = ((!AbstractC5830k.m5325b(obj5, bool) || (saver2 instanceof NonNullValueClassSaver)) && obj5 != null) ? saver2.restore(obj5) : null;
            Object obj6 = list.get(4);
            Saver<PlatformParagraphStyle, Object> saver3 = Savers_androidKt.getSaver(PlatformParagraphStyle.INSTANCE);
            PlatformParagraphStyle platformParagraphStyleRestore = ((!AbstractC5830k.m5325b(obj6, bool) || (saver3 instanceof NonNullValueClassSaver)) && obj6 != null) ? saver3.restore(obj6) : null;
            Object obj7 = list.get(5);
            Saver<LineHeightStyle, Object> saver4 = SaversKt.getSaver(LineHeightStyle.INSTANCE);
            LineHeightStyle lineHeightStyleRestore = ((!AbstractC5830k.m5325b(obj7, bool) || (saver4 instanceof NonNullValueClassSaver)) && obj7 != null) ? saver4.restore(obj7) : null;
            Object obj8 = list.get(6);
            Saver<LineBreak, Object> saver5 = Savers_androidKt.getSaver(LineBreak.INSTANCE);
            LineBreak lineBreakRestore = ((!AbstractC5830k.m5325b(obj8, bool) || (saver5 instanceof NonNullValueClassSaver)) && obj8 != null) ? saver5.restore(obj8) : null;
            AbstractC5830k.m5327d(lineBreakRestore);
            int mask = lineBreakRestore.getMask();
            Object obj9 = list.get(7);
            Hyphens hyphens = obj9 != null ? (Hyphens) obj9 : null;
            AbstractC5830k.m5327d(hyphens);
            int value3 = hyphens.getValue();
            Object obj10 = list.get(8);
            Saver<TextMotion, Object> saver6 = Savers_androidKt.getSaver(TextMotion.INSTANCE);
            if ((!AbstractC5830k.m5325b(obj10, bool) || (saver6 instanceof NonNullValueClassSaver)) && obj10 != null) {
                textMotionRestore = saver6.restore(obj10);
            }
            return new ParagraphStyle(value, value2, packedValue, textIndentRestore, platformParagraphStyleRestore, lineHeightStyleRestore, mask, value3, textMotionRestore, (AbstractC5824e) null);
        }
    });

    @NotNull
    private static final Saver<SpanStyle, Object> SpanStyleSaver = SaverKt.Saver(new InterfaceC6473e() { // from class: androidx.compose.ui.text.SaversKt$SpanStyleSaver$1
        @Override // p152r6.InterfaceC6473e
        public final Object invoke(SaverScope saverScope, SpanStyle spanStyle) {
            Color colorM10672boximpl = Color.m10672boximpl(spanStyle.m12711getColor0d7_KjU());
            Color.Companion companion = Color.INSTANCE;
            Object objSave = SaversKt.save(colorM10672boximpl, SaversKt.getSaver(companion), saverScope);
            TextUnit textUnitM13489boximpl = TextUnit.m13489boximpl(spanStyle.getFontSize());
            TextUnit.Companion companion2 = TextUnit.INSTANCE;
            return AbstractC5806u.m5267f(objSave, SaversKt.save(textUnitM13489boximpl, SaversKt.getSaver(companion2), saverScope), SaversKt.save(spanStyle.getFontWeight(), SaversKt.getSaver(FontWeight.INSTANCE), saverScope), SaversKt.save(spanStyle.getFontStyle()), SaversKt.save(spanStyle.getFontSynthesis()), SaversKt.save(-1), SaversKt.save(spanStyle.getFontFeatureSettings()), SaversKt.save(TextUnit.m13489boximpl(spanStyle.getLetterSpacing()), SaversKt.getSaver(companion2), saverScope), SaversKt.save(spanStyle.getBaselineShift(), SaversKt.getSaver(BaselineShift.INSTANCE), saverScope), SaversKt.save(spanStyle.getTextGeometricTransform(), SaversKt.getSaver(TextGeometricTransform.INSTANCE), saverScope), SaversKt.save(spanStyle.getLocaleList(), SaversKt.getSaver(LocaleList.INSTANCE), saverScope), SaversKt.save(Color.m10672boximpl(spanStyle.getBackground()), SaversKt.getSaver(companion), saverScope), SaversKt.save(spanStyle.getBackground(), SaversKt.getSaver(TextDecoration.INSTANCE), saverScope), SaversKt.save(spanStyle.getShadow(), SaversKt.getSaver(Shadow.INSTANCE), saverScope));
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.ui.text.SaversKt$SpanStyleSaver$2
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 androidx.compose.ui.text.SpanStyle, still in use, count: 2, list:
              (r1v1 androidx.compose.ui.text.SpanStyle) from 0x00d8: MOVE (r16v2 androidx.compose.ui.text.SpanStyle) = (r1v1 androidx.compose.ui.text.SpanStyle)
              (r1v1 androidx.compose.ui.text.SpanStyle) from 0x00d0: MOVE (r16v7 androidx.compose.ui.text.SpanStyle) = (r1v1 androidx.compose.ui.text.SpanStyle)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
            	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
            */
        @Override // p152r6.InterfaceC6471c
        public final androidx.compose.p011ui.text.SpanStyle invoke(java.lang.Object r29) {
            /*
                Method dump skipped, instructions count: 450
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.text.SaversKt$SpanStyleSaver$2.invoke(java.lang.Object):androidx.compose.ui.text.SpanStyle");
        }
    });

    @NotNull
    private static final Saver<TextLinkStyles, Object> TextLinkStylesSaver = SaverKt.Saver(new InterfaceC6473e() { // from class: androidx.compose.ui.text.SaversKt$TextLinkStylesSaver$1
        @Override // p152r6.InterfaceC6473e
        public final Object invoke(SaverScope saverScope, TextLinkStyles textLinkStyles) {
            return AbstractC5806u.m5267f(SaversKt.save(textLinkStyles.getStyle(), SaversKt.getSpanStyleSaver(), saverScope), SaversKt.save(textLinkStyles.getFocusedStyle(), SaversKt.getSpanStyleSaver(), saverScope), SaversKt.save(textLinkStyles.getHoveredStyle(), SaversKt.getSpanStyleSaver(), saverScope), SaversKt.save(textLinkStyles.getPressedStyle(), SaversKt.getSpanStyleSaver(), saverScope));
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.ui.text.SaversKt$TextLinkStylesSaver$2
        @Override // p152r6.InterfaceC6471c
        public final TextLinkStyles invoke(Object obj) {
            AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Saver<SpanStyle, Object> spanStyleSaver = SaversKt.getSpanStyleSaver();
            Boolean bool = Boolean.FALSE;
            SpanStyle spanStyleRestore = null;
            SpanStyle spanStyleRestore2 = ((!AbstractC5830k.m5325b(obj2, bool) || (spanStyleSaver instanceof NonNullValueClassSaver)) && obj2 != null) ? spanStyleSaver.restore(obj2) : null;
            Object obj3 = list.get(1);
            Saver<SpanStyle, Object> spanStyleSaver2 = SaversKt.getSpanStyleSaver();
            SpanStyle spanStyleRestore3 = ((!AbstractC5830k.m5325b(obj3, bool) || (spanStyleSaver2 instanceof NonNullValueClassSaver)) && obj3 != null) ? spanStyleSaver2.restore(obj3) : null;
            Object obj4 = list.get(2);
            Saver<SpanStyle, Object> spanStyleSaver3 = SaversKt.getSpanStyleSaver();
            SpanStyle spanStyleRestore4 = ((!AbstractC5830k.m5325b(obj4, bool) || (spanStyleSaver3 instanceof NonNullValueClassSaver)) && obj4 != null) ? spanStyleSaver3.restore(obj4) : null;
            Object obj5 = list.get(3);
            Saver<SpanStyle, Object> spanStyleSaver4 = SaversKt.getSpanStyleSaver();
            if ((!AbstractC5830k.m5325b(obj5, bool) || (spanStyleSaver4 instanceof NonNullValueClassSaver)) && obj5 != null) {
                spanStyleRestore = spanStyleSaver4.restore(obj5);
            }
            return new TextLinkStyles(spanStyleRestore2, spanStyleRestore3, spanStyleRestore4, spanStyleRestore);
        }
    });

    @NotNull
    private static final Saver<TextDecoration, Object> TextDecorationSaver = SaverKt.Saver(new InterfaceC6473e() { // from class: androidx.compose.ui.text.SaversKt$TextDecorationSaver$1
        @Override // p152r6.InterfaceC6473e
        public final Object invoke(SaverScope saverScope, TextDecoration textDecoration) {
            return Integer.valueOf(textDecoration.getMask());
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.ui.text.SaversKt$TextDecorationSaver$2
        @Override // p152r6.InterfaceC6471c
        public final TextDecoration invoke(Object obj) {
            AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlin.Int");
            return new TextDecoration(((Integer) obj).intValue());
        }
    });

    @NotNull
    private static final Saver<TextGeometricTransform, Object> TextGeometricTransformSaver = SaverKt.Saver(new InterfaceC6473e() { // from class: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$1
        @Override // p152r6.InterfaceC6473e
        public final Object invoke(SaverScope saverScope, TextGeometricTransform textGeometricTransform) {
            return AbstractC5806u.m5267f(Float.valueOf(textGeometricTransform.getScaleX()), Float.valueOf(textGeometricTransform.getSkewX()));
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$2
        @Override // p152r6.InterfaceC6471c
        public final TextGeometricTransform invoke(Object obj) {
            AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
            List list = (List) obj;
            return new TextGeometricTransform(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
        }
    });

    @NotNull
    private static final Saver<TextIndent, Object> TextIndentSaver = SaverKt.Saver(new InterfaceC6473e() { // from class: androidx.compose.ui.text.SaversKt$TextIndentSaver$1
        @Override // p152r6.InterfaceC6473e
        public final Object invoke(SaverScope saverScope, TextIndent textIndent) {
            TextUnit textUnitM13489boximpl = TextUnit.m13489boximpl(textIndent.getFirstLine());
            TextUnit.Companion companion = TextUnit.INSTANCE;
            return AbstractC5806u.m5267f(SaversKt.save(textUnitM13489boximpl, SaversKt.getSaver(companion), saverScope), SaversKt.save(TextUnit.m13489boximpl(textIndent.getRestLine()), SaversKt.getSaver(companion), saverScope));
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.ui.text.SaversKt$TextIndentSaver$2
        @Override // p152r6.InterfaceC6471c
        public final TextIndent invoke(Object obj) {
            AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            TextUnit.Companion companion = TextUnit.INSTANCE;
            Saver<TextUnit, Object> saver = SaversKt.getSaver(companion);
            Boolean bool = Boolean.FALSE;
            TextUnit textUnitRestore = null;
            TextUnit textUnitRestore2 = ((!AbstractC5830k.m5325b(obj2, bool) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) ? saver.restore(obj2) : null;
            AbstractC5830k.m5327d(textUnitRestore2);
            long packedValue = textUnitRestore2.getPackedValue();
            Object obj3 = list.get(1);
            Saver<TextUnit, Object> saver2 = SaversKt.getSaver(companion);
            if ((!AbstractC5830k.m5325b(obj3, bool) || (saver2 instanceof NonNullValueClassSaver)) && obj3 != null) {
                textUnitRestore = saver2.restore(obj3);
            }
            AbstractC5830k.m5327d(textUnitRestore);
            return new TextIndent(packedValue, textUnitRestore.getPackedValue(), null);
        }
    });

    @NotNull
    private static final Saver<FontWeight, Object> FontWeightSaver = SaverKt.Saver(new InterfaceC6473e() { // from class: androidx.compose.ui.text.SaversKt$FontWeightSaver$1
        @Override // p152r6.InterfaceC6473e
        public final Object invoke(SaverScope saverScope, FontWeight fontWeight) {
            return Integer.valueOf(fontWeight.getWeight());
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.ui.text.SaversKt$FontWeightSaver$2
        @Override // p152r6.InterfaceC6471c
        public final FontWeight invoke(Object obj) {
            AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlin.Int");
            return new FontWeight(((Integer) obj).intValue());
        }
    });

    @NotNull
    private static final Saver<BaselineShift, Object> BaselineShiftSaver = SaverKt.Saver(new InterfaceC6473e() { // from class: androidx.compose.ui.text.SaversKt$BaselineShiftSaver$1
        @Override // p152r6.InterfaceC6473e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m12689invoke8a2Sb4w((SaverScope) obj, ((BaselineShift) obj2).m13067unboximpl());
        }

        /* renamed from: invoke-8a2Sb4w, reason: not valid java name */
        public final Object m12689invoke8a2Sb4w(SaverScope saverScope, float f) {
            return Float.valueOf(f);
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.ui.text.SaversKt$BaselineShiftSaver$2
        @Override // p152r6.InterfaceC6471c
        /* renamed from: invoke-jTk7eUs, reason: not valid java name and merged with bridge method [inline-methods] */
        public final BaselineShift invoke(Object obj) {
            AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlin.Float");
            return BaselineShift.m13061boximpl(BaselineShift.m13062constructorimpl(((Float) obj).floatValue()));
        }
    });

    @NotNull
    private static final Saver<TextRange, Object> TextRangeSaver = SaverKt.Saver(new InterfaceC6473e() { // from class: androidx.compose.ui.text.SaversKt$TextRangeSaver$1
        @Override // p152r6.InterfaceC6473e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m12695invokeFDrldGo((SaverScope) obj, ((TextRange) obj2).getPackedValue());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke-FDrldGo, reason: not valid java name */
        public final Object m12695invokeFDrldGo(SaverScope saverScope, long j7) {
            return AbstractC5806u.m5267f(SaversKt.save(Integer.valueOf(TextRange.m12770getStartimpl(j7))), SaversKt.save(Integer.valueOf(TextRange.m12765getEndimpl(j7))));
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.ui.text.SaversKt$TextRangeSaver$2
        @Override // p152r6.InterfaceC6471c
        /* renamed from: invoke-VqIyPBM, reason: not valid java name and merged with bridge method [inline-methods] */
        public final TextRange invoke(Object obj) {
            AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Integer num = obj2 != null ? (Integer) obj2 : null;
            AbstractC5830k.m5327d(num);
            int iIntValue = num.intValue();
            Object obj3 = list.get(1);
            Integer num2 = obj3 != null ? (Integer) obj3 : null;
            AbstractC5830k.m5327d(num2);
            return TextRange.m12758boximpl(TextRangeKt.TextRange(iIntValue, num2.intValue()));
        }
    });

    @NotNull
    private static final Saver<Shadow, Object> ShadowSaver = SaverKt.Saver(new InterfaceC6473e() { // from class: androidx.compose.ui.text.SaversKt$ShadowSaver$1
        @Override // p152r6.InterfaceC6473e
        public final Object invoke(SaverScope saverScope, Shadow shadow) {
            return AbstractC5806u.m5267f(SaversKt.save(Color.m10672boximpl(shadow.getColor()), SaversKt.getSaver(Color.INSTANCE), saverScope), SaversKt.save(Offset.m10430boximpl(shadow.getOffset()), SaversKt.getSaver(Offset.INSTANCE), saverScope), SaversKt.save(Float.valueOf(shadow.getBlurRadius())));
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.ui.text.SaversKt$ShadowSaver$2
        @Override // p152r6.InterfaceC6471c
        public final Shadow invoke(Object obj) {
            AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Saver<Color, Object> saver = SaversKt.getSaver(Color.INSTANCE);
            Boolean bool = Boolean.FALSE;
            Color colorRestore = ((!AbstractC5830k.m5325b(obj2, bool) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) ? saver.restore(obj2) : null;
            AbstractC5830k.m5327d(colorRestore);
            long jM10692unboximpl = colorRestore.m10692unboximpl();
            Object obj3 = list.get(1);
            Saver<Offset, Object> saver2 = SaversKt.getSaver(Offset.INSTANCE);
            Offset offsetRestore = ((!AbstractC5830k.m5325b(obj3, bool) || (saver2 instanceof NonNullValueClassSaver)) && obj3 != null) ? saver2.restore(obj3) : null;
            AbstractC5830k.m5327d(offsetRestore);
            long jM10451unboximpl = offsetRestore.m10451unboximpl();
            Object obj4 = list.get(2);
            Float f = obj4 != null ? (Float) obj4 : null;
            AbstractC5830k.m5327d(f);
            return new Shadow(jM10692unboximpl, jM10451unboximpl, f.floatValue(), null);
        }
    });

    @NotNull
    private static final NonNullValueClassSaver<Color, Object> ColorSaver = NonNullValueClassSaver(new InterfaceC6473e() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$1
        @Override // p152r6.InterfaceC6473e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m12691invoke4WTKRHQ((SaverScope) obj, ((Color) obj2).m10692unboximpl());
        }

        /* renamed from: invoke-4WTKRHQ, reason: not valid java name */
        public final Object m12691invoke4WTKRHQ(SaverScope saverScope, long j7) {
            return j7 == 16 ? Boolean.FALSE : Integer.valueOf(ColorKt.m10736toArgb8_81llA(j7));
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$2
        @Override // p152r6.InterfaceC6471c
        /* renamed from: invoke-ijrfgN4, reason: not valid java name and merged with bridge method [inline-methods] */
        public final Color invoke(Object obj) {
            if (AbstractC5830k.m5325b(obj, Boolean.FALSE)) {
                return Color.m10672boximpl(Color.INSTANCE.m10718getUnspecified0d7_KjU());
            }
            AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlin.Int");
            return Color.m10672boximpl(ColorKt.Color(((Integer) obj).intValue()));
        }
    });

    @NotNull
    private static final NonNullValueClassSaver<TextUnit, Object> TextUnitSaver = NonNullValueClassSaver(new InterfaceC6473e() { // from class: androidx.compose.ui.text.SaversKt$TextUnitSaver$1
        @Override // p152r6.InterfaceC6473e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m12697invokempE4wyQ((SaverScope) obj, ((TextUnit) obj2).getPackedValue());
        }

        /* renamed from: invoke-mpE4wyQ, reason: not valid java name */
        public final Object m12697invokempE4wyQ(SaverScope saverScope, long j7) {
            return TextUnit.m13496equalsimpl0(j7, TextUnit.INSTANCE.m13510getUnspecifiedXSAIIZE()) ? Boolean.FALSE : AbstractC5806u.m5267f(SaversKt.save(Float.valueOf(TextUnit.m13499getValueimpl(j7))), SaversKt.save(TextUnitType.m13524boximpl(TextUnit.m13498getTypeUIouoOA(j7))));
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.ui.text.SaversKt$TextUnitSaver$2
        @Override // p152r6.InterfaceC6471c
        /* renamed from: invoke-XNhUCwk, reason: not valid java name and merged with bridge method [inline-methods] */
        public final TextUnit invoke(Object obj) {
            if (AbstractC5830k.m5325b(obj, Boolean.FALSE)) {
                return TextUnit.m13489boximpl(TextUnit.INSTANCE.m13510getUnspecifiedXSAIIZE());
            }
            AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Float f = obj2 != null ? (Float) obj2 : null;
            AbstractC5830k.m5327d(f);
            float fFloatValue = f.floatValue();
            Object obj3 = list.get(1);
            TextUnitType textUnitType = obj3 != null ? (TextUnitType) obj3 : null;
            AbstractC5830k.m5327d(textUnitType);
            return TextUnit.m13489boximpl(TextUnitKt.m13511TextUnitanM5pPY(fFloatValue, textUnitType.getType()));
        }
    });

    @NotNull
    private static final NonNullValueClassSaver<Offset, Object> OffsetSaver = NonNullValueClassSaver(new InterfaceC6473e() { // from class: androidx.compose.ui.text.SaversKt$OffsetSaver$1
        @Override // p152r6.InterfaceC6473e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m12693invokeUv8p0NA((SaverScope) obj, ((Offset) obj2).m10451unboximpl());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
        public final Object m12693invokeUv8p0NA(SaverScope saverScope, long j7) {
            return Offset.m10438equalsimpl0(j7, Offset.INSTANCE.m10456getUnspecifiedF1C5BW0()) ? Boolean.FALSE : AbstractC5806u.m5267f(SaversKt.save(Float.valueOf(Float.intBitsToFloat((int) (j7 >> 32)))), SaversKt.save(Float.valueOf(Float.intBitsToFloat((int) (j7 & 4294967295L)))));
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.ui.text.SaversKt$OffsetSaver$2
        @Override // p152r6.InterfaceC6471c
        /* renamed from: invoke-x-9fifI, reason: not valid java name and merged with bridge method [inline-methods] */
        public final Offset invoke(Object obj) {
            if (AbstractC5830k.m5325b(obj, Boolean.FALSE)) {
                return Offset.m10430boximpl(Offset.INSTANCE.m10456getUnspecifiedF1C5BW0());
            }
            AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Float f = obj2 != null ? (Float) obj2 : null;
            AbstractC5830k.m5327d(f);
            float fFloatValue = f.floatValue();
            Object obj3 = list.get(1);
            AbstractC5830k.m5327d(obj3 != null ? (Float) obj3 : null);
            return Offset.m10430boximpl(Offset.m10433constructorimpl((Float.floatToRawIntBits(fFloatValue) << 32) | (Float.floatToRawIntBits(r1.floatValue()) & 4294967295L)));
        }
    });

    @NotNull
    private static final Saver<LocaleList, Object> LocaleListSaver = SaverKt.Saver(new InterfaceC6473e() { // from class: androidx.compose.ui.text.SaversKt$LocaleListSaver$1
        @Override // p152r6.InterfaceC6473e
        public final Object invoke(SaverScope saverScope, LocaleList localeList) {
            List<Locale> localeList2 = localeList.getLocaleList();
            ArrayList arrayList = new ArrayList(localeList2.size());
            int size = localeList2.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(SaversKt.save(localeList2.get(i), SaversKt.getSaver(Locale.INSTANCE), saverScope));
            }
            return arrayList;
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.ui.text.SaversKt$LocaleListSaver$2
        @Override // p152r6.InterfaceC6471c
        public final LocaleList invoke(Object obj) {
            AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                Saver<Locale, Object> saver = SaversKt.getSaver(Locale.INSTANCE);
                Locale localeRestore = null;
                if ((!AbstractC5830k.m5325b(obj2, Boolean.FALSE) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) {
                    localeRestore = saver.restore(obj2);
                }
                AbstractC5830k.m5327d(localeRestore);
                arrayList.add(localeRestore);
            }
            return new LocaleList(arrayList);
        }
    });

    @NotNull
    private static final Saver<Locale, Object> LocaleSaver = SaverKt.Saver(new InterfaceC6473e() { // from class: androidx.compose.ui.text.SaversKt$LocaleSaver$1
        @Override // p152r6.InterfaceC6473e
        public final Object invoke(SaverScope saverScope, Locale locale) {
            return locale.toLanguageTag();
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.ui.text.SaversKt$LocaleSaver$2
        @Override // p152r6.InterfaceC6471c
        public final Locale invoke(Object obj) {
            AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlin.String");
            return new Locale((String) obj);
        }
    });

    @NotNull
    private static final Saver<LineHeightStyle, Object> LineHeightStyleSaver = SaverKt.Saver(new InterfaceC6473e() { // from class: androidx.compose.ui.text.SaversKt$LineHeightStyleSaver$1
        @Override // p152r6.InterfaceC6473e
        public final Object invoke(SaverScope saverScope, LineHeightStyle lineHeightStyle) {
            return AbstractC5806u.m5267f(SaversKt.save(LineHeightStyle.Alignment.m13149boximpl(lineHeightStyle.getAlignment())), SaversKt.save(LineHeightStyle.Trim.m13169boximpl(lineHeightStyle.getTrim())), SaversKt.save(LineHeightStyle.Mode.m13160boximpl(lineHeightStyle.getMode())));
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.ui.text.SaversKt$LineHeightStyleSaver$2
        @Override // p152r6.InterfaceC6471c
        public final LineHeightStyle invoke(Object obj) {
            AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            LineHeightStyle.Alignment alignment = obj2 != null ? (LineHeightStyle.Alignment) obj2 : null;
            AbstractC5830k.m5327d(alignment);
            float topRatio = alignment.getTopRatio();
            Object obj3 = list.get(1);
            LineHeightStyle.Trim trim = obj3 != null ? (LineHeightStyle.Trim) obj3 : null;
            AbstractC5830k.m5327d(trim);
            int value = trim.getValue();
            Object obj4 = list.get(2);
            LineHeightStyle.Mode mode = obj4 != null ? (LineHeightStyle.Mode) obj4 : null;
            AbstractC5830k.m5327d(mode);
            return new LineHeightStyle(topRatio, value, mode.getValue(), null);
        }
    });

    private static final <Original, Saveable> NonNullValueClassSaver<Original, Saveable> NonNullValueClassSaver(final InterfaceC6473e interfaceC6473e, final InterfaceC6471c interfaceC6471c) {
        return new NonNullValueClassSaver<Original, Saveable>() { // from class: androidx.compose.ui.text.SaversKt.NonNullValueClassSaver.1
            @Override // androidx.compose.runtime.saveable.Saver
            public Original restore(Saveable value) {
                return (Original) interfaceC6471c.invoke(value);
            }

            @Override // androidx.compose.runtime.saveable.Saver
            public Saveable save(SaverScope saverScope, Original original) {
                return (Saveable) interfaceC6473e.invoke(saverScope, original);
            }
        };
    }

    @NotNull
    public static final Saver<AnnotatedString, Object> getAnnotatedStringSaver() {
        return AnnotatedStringSaver;
    }

    private static /* synthetic */ void getAnnotationRangeSaver$annotations() {
    }

    @NotNull
    public static final Saver<ParagraphStyle, Object> getParagraphStyleSaver() {
        return ParagraphStyleSaver;
    }

    @NotNull
    public static final Saver<TextDecoration, Object> getSaver(@NotNull TextDecoration.Companion companion) {
        return TextDecorationSaver;
    }

    @NotNull
    public static final Saver<SpanStyle, Object> getSpanStyleSaver() {
        return SpanStyleSaver;
    }

    @NotNull
    public static final Saver<TextLinkStyles, Object> getTextLinkStylesSaver() {
        return TextLinkStylesSaver;
    }

    private static /* synthetic */ void getUrlAnnotationSaver$annotations() {
    }

    public static final <T extends Saver<Original, Saveable>, Original, Saveable, Result> Result restore(Saveable saveable, T t8) {
        if ((AbstractC5830k.m5325b(saveable, Boolean.FALSE) && !(t8 instanceof NonNullValueClassSaver)) || saveable == null) {
            return null;
        }
        t8.restore(saveable);
        AbstractC5830k.m5338o();
        throw null;
    }

    @Nullable
    public static final <T> T save(@Nullable T t8) {
        return t8;
    }

    @NotNull
    public static final Saver<TextGeometricTransform, Object> getSaver(@NotNull TextGeometricTransform.Companion companion) {
        return TextGeometricTransformSaver;
    }

    @NotNull
    public static final <T extends Saver<Original, Saveable>, Original, Saveable> Object save(@Nullable Original original, @NotNull T t8, @NotNull SaverScope saverScope) {
        Object objSave;
        return (original == null || (objSave = t8.save(saverScope, original)) == null) ? Boolean.FALSE : objSave;
    }

    @NotNull
    public static final Saver<TextIndent, Object> getSaver(@NotNull TextIndent.Companion companion) {
        return TextIndentSaver;
    }

    @NotNull
    public static final Saver<FontWeight, Object> getSaver(@NotNull FontWeight.Companion companion) {
        return FontWeightSaver;
    }

    public static final <Result> Result restore(Object obj) {
        if (obj == null) {
            return null;
        }
        AbstractC5830k.m5338o();
        throw null;
    }

    @NotNull
    public static final Saver<BaselineShift, Object> getSaver(@NotNull BaselineShift.Companion companion) {
        return BaselineShiftSaver;
    }

    @NotNull
    public static final Saver<TextRange, Object> getSaver(@NotNull TextRange.Companion companion) {
        return TextRangeSaver;
    }

    @NotNull
    public static final Saver<Shadow, Object> getSaver(@NotNull Shadow.Companion companion) {
        return ShadowSaver;
    }

    @NotNull
    public static final Saver<Color, Object> getSaver(@NotNull Color.Companion companion) {
        return ColorSaver;
    }

    @NotNull
    public static final Saver<TextUnit, Object> getSaver(@NotNull TextUnit.Companion companion) {
        return TextUnitSaver;
    }

    @NotNull
    public static final Saver<Offset, Object> getSaver(@NotNull Offset.Companion companion) {
        return OffsetSaver;
    }

    @NotNull
    public static final Saver<LocaleList, Object> getSaver(@NotNull LocaleList.Companion companion) {
        return LocaleListSaver;
    }

    @NotNull
    public static final Saver<Locale, Object> getSaver(@NotNull Locale.Companion companion) {
        return LocaleSaver;
    }

    @NotNull
    public static final Saver<LineHeightStyle, Object> getSaver(@NotNull LineHeightStyle.Companion companion) {
        return LineHeightStyleSaver;
    }
}
