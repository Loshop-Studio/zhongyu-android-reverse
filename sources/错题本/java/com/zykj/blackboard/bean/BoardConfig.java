package com.zykj.blackboard.bean;

import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.zykj.blackboard.core.action.GeometryActionEnum;
import com.zykj.blackboard.enums.SelectGraphEnum;
import com.zykj.blackboard.enums.SelectGraphEnumKt;
import com.zykj.blackboard.proxy.CustomColorView;
import com.zykj.blackboard.proxy.ImageCropView;
import com.zykj.blackboard.proxy.TextEditView;
import com.zykj.blackboard.utils.EventBus;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.board.EzyModeEnum$ModeEnum;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00142\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\"\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001eR*\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b \u0010\"\"\u0004\b#\u0010$R*\u0010%\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001eR\"\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0017\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001eR\"\u0010+\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R*\u00101\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R\"\u00104\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010,\u001a\u0004\b5\u0010.\"\u0004\b6\u00100R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010!\u001a\u0004\b\b\u0010\"\"\u0004\b\r\u0010$R$\u00108\u001a\u00020\t2\u0006\u00107\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b8\u0010,\u001a\u0004\b9\u0010.R$\u0010:\u001a\u00020\t2\u0006\u00107\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b:\u0010,\u001a\u0004\b;\u0010.R$\u0010\u0010\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\b=\u0010>R$\u0010@\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010G\u001a\u00020F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010N\u001a\u00020M8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010T\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010,\u001a\u0004\bU\u0010.\"\u0004\bV\u00100R\"\u0010W\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010,\u001a\u0004\bX\u0010.\"\u0004\bY\u00100R\"\u0010Z\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010,\u001a\u0004\b[\u0010.\"\u0004\b\\\u00100R\"\u0010]\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010\u0017\u001a\u0004\b^\u0010\u0019\"\u0004\b_\u0010\u001eR\"\u0010`\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010\u0017\u001a\u0004\ba\u0010\u0019\"\u0004\bb\u0010\u001eR\u0017\u0010d\u001a\u00020c8\u0006¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\"\u0010h\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010\u0017\u001a\u0004\bi\u0010\u0019\"\u0004\bj\u0010\u001eR\"\u0010k\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010\u0017\u001a\u0004\bl\u0010\u0019\"\u0004\bm\u0010\u001eR\"\u0010n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010,\u001a\u0004\bo\u0010.\"\u0004\bp\u00100R\"\u0010q\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010,\u001a\u0004\br\u0010.\"\u0004\bs\u00100R\u0017\u0010u\u001a\u00020t8\u0006¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\"\u0010y\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010,\u001a\u0004\bz\u0010.\"\u0004\b{\u00100R\"\u0010|\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b|\u0010!\u001a\u0004\b|\u0010\"\"\u0004\b}\u0010$R\"\u0010~\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b~\u0010!\u001a\u0004\b~\u0010\"\"\u0004\b\u007f\u0010$R,\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R,\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R0\u0010\u008f\u0001\u001a\t\u0012\u0005\u0012\u00030\u008e\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R0\u0010\u0095\u0001\u001a\t\u0012\u0005\u0012\u00030\u008e\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u0090\u0001\u001a\u0006\b\u0096\u0001\u0010\u0092\u0001\"\u0006\b\u0097\u0001\u0010\u0094\u0001R\u001d\u0010\u0098\u0001\u001a\u00020\t8\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0098\u0001\u0010,\u001a\u0005\b\u0099\u0001\u0010.R&\u0010\u009a\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009a\u0001\u0010,\u001a\u0005\b\u009b\u0001\u0010.\"\u0005\b\u009c\u0001\u00100R&\u0010\u009d\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009d\u0001\u0010,\u001a\u0005\b\u009e\u0001\u0010.\"\u0005\b\u009f\u0001\u00100R*\u0010¡\u0001\u001a\u00030 \u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R&\u0010§\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b§\u0001\u0010,\u001a\u0005\b¨\u0001\u0010.\"\u0005\b©\u0001\u00100R&\u0010ª\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bª\u0001\u0010\u0017\u001a\u0005\b«\u0001\u0010\u0019\"\u0005\b¬\u0001\u0010\u001eR&\u0010\u00ad\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u00ad\u0001\u0010,\u001a\u0005\b®\u0001\u0010.\"\u0005\b¯\u0001\u00100R/\u0010°\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b°\u0001\u0010\u0090\u0001\u001a\u0006\b±\u0001\u0010\u0092\u0001\"\u0006\b²\u0001\u0010\u0094\u0001R/\u0010³\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b³\u0001\u0010\u0090\u0001\u001a\u0006\b´\u0001\u0010\u0092\u0001\"\u0006\bµ\u0001\u0010\u0094\u0001R1\u0010¶\u0001\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¶\u0001\u0010\u0090\u0001\u001a\u0006\b·\u0001\u0010\u0092\u0001\"\u0006\b¸\u0001\u0010\u0094\u0001R8\u0010º\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0018\u00010¹\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bº\u0001\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001\"\u0006\b¾\u0001\u0010¿\u0001R,\u0010Á\u0001\u001a\u0005\u0018\u00010À\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÁ\u0001\u0010Â\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001\"\u0006\bÅ\u0001\u0010Æ\u0001¨\u0006Ç\u0001"}, m5110d2 = {"Lcom/zykj/blackboard/bean/BoardConfig;", "", "", "width", "height", "<init>", "(II)V", "", "isDottedLine", "", "itemLength", "spacing", "Ld6/s;", "setDottedLine", "(ZFF)V", "Lcom/zykj/board/EzyModeEnum$ModeEnum;", "mode", "setMode", "(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V", "isHighlighter", "", "getSelectStrokeWidthList", "(Z)Ljava/util/List;", "I", "getWidth", "()I", "getHeight", "maxImageSize", "getMaxImageSize", "setMaxImageSize", "(I)V", "value", "isFingerDraw", "Z", "()Z", "setFingerDraw", "(Z)V", "paintColor", "getPaintColor", "setPaintColor", "beelinePaintColor", "getBeelinePaintColor", "setBeelinePaintColor", "beelinePaintWidth", "F", "getBeelinePaintWidth", "()F", "setBeelinePaintWidth", "(F)V", "paintWidth", "getPaintWidth", "setPaintWidth", "eraserWidth", "getEraserWidth", "setEraserWidth", "<set-?>", "paintDottedLineItemLength", "getPaintDottedLineItemLength", "paintDottedLineSpacing", "getPaintDottedLineSpacing", "Lcom/zykj/board/EzyModeEnum$ModeEnum;", "getMode", "()Lcom/zykj/board/EzyModeEnum$ModeEnum;", "Lcom/zykj/blackboard/proxy/TextEditView;", "textEditView", "Lcom/zykj/blackboard/proxy/TextEditView;", "getTextEditView", "()Lcom/zykj/blackboard/proxy/TextEditView;", "setTextEditView", "(Lcom/zykj/blackboard/proxy/TextEditView;)V", "Landroid/graphics/RectF;", "addTextRectF", "Landroid/graphics/RectF;", "getAddTextRectF", "()Landroid/graphics/RectF;", "setAddTextRectF", "(Landroid/graphics/RectF;)V", "", "addTextOriginalText", "Ljava/lang/String;", "getAddTextOriginalText", "()Ljava/lang/String;", "setAddTextOriginalText", "(Ljava/lang/String;)V", "addTextOriginalTextSize", "getAddTextOriginalTextSize", "setAddTextOriginalTextSize", "addTextOriginalTextMinSize", "getAddTextOriginalTextMinSize", "setAddTextOriginalTextMinSize", "addTextOriginalTextMaxSize", "getAddTextOriginalTextMaxSize", "setAddTextOriginalTextMaxSize", "addTextOriginalTextColor", "getAddTextOriginalTextColor", "setAddTextOriginalTextColor", "backgroundColor", "getBackgroundColor", "setBackgroundColor", "Lcom/zykj/blackboard/bean/BackgroundLineConfig;", "backgroundLineConfig", "Lcom/zykj/blackboard/bean/BackgroundLineConfig;", "getBackgroundLineConfig", "()Lcom/zykj/blackboard/bean/BackgroundLineConfig;", "backgroundColorOutside", "getBackgroundColorOutside", "setBackgroundColorOutside", "cursorColor", "getCursorColor", "setCursorColor", "cursorWidth", "getCursorWidth", "setCursorWidth", "cursorOffset", "getCursorOffset", "setCursorOffset", "Lcom/zykj/blackboard/bean/MoveActionConfig;", "moveActionConfig", "Lcom/zykj/blackboard/bean/MoveActionConfig;", "getMoveActionConfig", "()Lcom/zykj/blackboard/bean/MoveActionConfig;", "multiImageOffset", "getMultiImageOffset", "setMultiImageOffset", "isImageBackground", "setImageBackground", "isGroupGraphComplete", "setGroupGraphComplete", "Lcom/zykj/blackboard/proxy/ImageCropView;", "imageCropView", "Lcom/zykj/blackboard/proxy/ImageCropView;", "getImageCropView", "()Lcom/zykj/blackboard/proxy/ImageCropView;", "setImageCropView", "(Lcom/zykj/blackboard/proxy/ImageCropView;)V", "Lcom/zykj/blackboard/bean/Author;", "author", "Lcom/zykj/blackboard/bean/Author;", "getAuthor", "()Lcom/zykj/blackboard/bean/Author;", "setAuthor", "(Lcom/zykj/blackboard/bean/Author;)V", "Lcom/zykj/blackboard/enums/SelectGraphEnum;", "selectIncludeGraphEnumListByClick", "Ljava/util/List;", "getSelectIncludeGraphEnumListByClick", "()Ljava/util/List;", "setSelectIncludeGraphEnumListByClick", "(Ljava/util/List;)V", "selectIncludeGraphEnumListByDrag", "getSelectIncludeGraphEnumListByDrag", "setSelectIncludeGraphEnumListByDrag", "selectButtonHeight", "getSelectButtonHeight", "selectIconWidth", "getSelectIconWidth", "setSelectIconWidth", "highlighterColorAlpha", "getHighlighterColorAlpha", "setHighlighterColorAlpha", "Lcom/zykj/blackboard/core/action/GeometryActionEnum;", "geometryActionEnum", "Lcom/zykj/blackboard/core/action/GeometryActionEnum;", "getGeometryActionEnum", "()Lcom/zykj/blackboard/core/action/GeometryActionEnum;", "setGeometryActionEnum", "(Lcom/zykj/blackboard/core/action/GeometryActionEnum;)V", "geometryStrokeWidth", "getGeometryStrokeWidth", "setGeometryStrokeWidth", "geometryStrokeColor", "getGeometryStrokeColor", "setGeometryStrokeColor", "geometryMinSize", "getGeometryMinSize", "setGeometryMinSize", "selectWriteLevel", "getSelectWriteLevel", "setSelectWriteLevel", "selectHighlighterLevel", "getSelectHighlighterLevel", "setSelectHighlighterLevel", "selectEditColorList", "getSelectEditColorList", "setSelectEditColorList", "Lkotlin/Function1;", "selectEditColorChangeListener", "Lr6/c;", "getSelectEditColorChangeListener", "()Lr6/c;", "setSelectEditColorChangeListener", "(Lr6/c;)V", "Lcom/zykj/blackboard/proxy/CustomColorView;", "selectCustomColorView", "Lcom/zykj/blackboard/proxy/CustomColorView;", "getSelectCustomColorView", "()Lcom/zykj/blackboard/proxy/CustomColorView;", "setSelectCustomColorView", "(Lcom/zykj/blackboard/proxy/CustomColorView;)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class BoardConfig {

    @Nullable
    private Author author;
    private int backgroundColor;

    @NotNull
    private GeometryActionEnum geometryActionEnum;
    private float geometryMinSize;
    private int geometryStrokeColor;
    private float geometryStrokeWidth;
    private final int height;
    private float highlighterColorAlpha;

    @Nullable
    private ImageCropView imageCropView;
    private boolean isDottedLine;
    private boolean isGroupGraphComplete;
    private boolean isImageBackground;

    @NotNull
    private final MoveActionConfig moveActionConfig;
    private float multiImageOffset;
    private final float selectButtonHeight;

    @Nullable
    private CustomColorView selectCustomColorView;

    @Nullable
    private InterfaceC6471c selectEditColorChangeListener;

    @Nullable
    private List<Integer> selectEditColorList;

    @NotNull
    private List<Float> selectHighlighterLevel;
    private float selectIconWidth;

    @NotNull
    private List<? extends SelectGraphEnum> selectIncludeGraphEnumListByClick;

    @NotNull
    private List<? extends SelectGraphEnum> selectIncludeGraphEnumListByDrag;

    @NotNull
    private List<Float> selectWriteLevel;

    @Nullable
    private TextEditView textEditView;
    private final int width;
    private int maxImageSize = 3;
    private boolean isFingerDraw = true;
    private int paintColor = ViewCompat.MEASURED_STATE_MASK;
    private int beelinePaintColor = ViewCompat.MEASURED_STATE_MASK;
    private float beelinePaintWidth = 5.0f;
    private float paintWidth = 5.0f;
    private float eraserWidth = 40.0f;
    private float paintDottedLineItemLength = 30.0f;
    private float paintDottedLineSpacing = 15.0f;

    @NotNull
    private EzyModeEnum$ModeEnum mode = EzyModeEnum$ModeEnum.ACTION_WRITING;

    @NotNull
    private RectF addTextRectF = new RectF(0.0f, 0.0f, 400.0f, 100.0f);

    @NotNull
    private String addTextOriginalText = "请输入文字";
    private float addTextOriginalTextSize = 28.0f;
    private float addTextOriginalTextMinSize = 20.0f;
    private float addTextOriginalTextMaxSize = 48.0f;
    private int addTextOriginalTextColor = ViewCompat.MEASURED_STATE_MASK;

    @NotNull
    private final BackgroundLineConfig backgroundLineConfig = new BackgroundLineConfig(0, 0.0f, null, 0.0f, 15, null);
    private int backgroundColorOutside = -1;
    private int cursorColor = SupportMenu.CATEGORY_MASK;
    private float cursorWidth = 20.0f;
    private float cursorOffset = 50.0f;

    @Metadata(m5111k = 3, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EzyModeEnum$ModeEnum.values().length];
            iArr[EzyModeEnum$ModeEnum.ACTION_SELECT.ordinal()] = 1;
            iArr[EzyModeEnum$ModeEnum.ACTION_WRITING_BEELINE.ordinal()] = 2;
            iArr[EzyModeEnum$ModeEnum.ACTION_ERASER_WRITING.ordinal()] = 3;
            iArr[EzyModeEnum$ModeEnum.ACTION_TEXT.ordinal()] = 4;
            iArr[EzyModeEnum$ModeEnum.ACTION_CURSOR.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BoardConfig(int i, int i8) {
        this.width = i;
        this.height = i8;
        Object[] objArr = 0 == true ? 1 : 0;
        this.moveActionConfig = new MoveActionConfig(false, objArr, false, false, false, 0, 0, 127, null);
        this.multiImageOffset = 50.0f;
        this.selectIncludeGraphEnumListByClick = SelectGraphEnumKt.getAllSelectGraphEnumList();
        this.selectIncludeGraphEnumListByDrag = SelectGraphEnumKt.getAllSelectGraphEnumList();
        this.selectButtonHeight = 60.0f;
        this.selectIconWidth = 36.0f;
        this.highlighterColorAlpha = 0.5f;
        this.geometryActionEnum = GeometryActionEnum.RECTANGLE;
        this.geometryStrokeWidth = 3.0f;
        this.geometryStrokeColor = ViewCompat.MEASURED_STATE_MASK;
        this.geometryMinSize = 36.0f;
        this.selectWriteLevel = AbstractC5806u.m5287z(Float.valueOf(3.0f), Float.valueOf(8.0f), Float.valueOf(15.0f));
        this.selectHighlighterLevel = AbstractC5806u.m5287z(Float.valueOf(28.0f), Float.valueOf(36.0f), Float.valueOf(56.0f));
    }

    public static /* synthetic */ void setDottedLine$default(BoardConfig boardConfig, boolean z8, float f, float f7, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 30.0f;
        }
        if ((i & 4) != 0) {
            f7 = 15.0f;
        }
        boardConfig.setDottedLine(z8, f, f7);
    }

    @NotNull
    public final String getAddTextOriginalText() {
        return this.addTextOriginalText;
    }

    public final int getAddTextOriginalTextColor() {
        return this.addTextOriginalTextColor;
    }

    public final float getAddTextOriginalTextMaxSize() {
        return this.addTextOriginalTextMaxSize;
    }

    public final float getAddTextOriginalTextMinSize() {
        return this.addTextOriginalTextMinSize;
    }

    public final float getAddTextOriginalTextSize() {
        return this.addTextOriginalTextSize;
    }

    @NotNull
    public final RectF getAddTextRectF() {
        return this.addTextRectF;
    }

    @Nullable
    public final Author getAuthor() {
        return this.author;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBackgroundColorOutside() {
        return this.backgroundColorOutside;
    }

    @NotNull
    public final BackgroundLineConfig getBackgroundLineConfig() {
        return this.backgroundLineConfig;
    }

    public final int getBeelinePaintColor() {
        return this.beelinePaintColor;
    }

    public final float getBeelinePaintWidth() {
        return this.beelinePaintWidth;
    }

    public final int getCursorColor() {
        return this.cursorColor;
    }

    public final float getCursorOffset() {
        return this.cursorOffset;
    }

    public final float getCursorWidth() {
        return this.cursorWidth;
    }

    public final float getEraserWidth() {
        return this.eraserWidth;
    }

    @NotNull
    public final GeometryActionEnum getGeometryActionEnum() {
        return this.geometryActionEnum;
    }

    public final float getGeometryMinSize() {
        return this.geometryMinSize;
    }

    public final int getGeometryStrokeColor() {
        return this.geometryStrokeColor;
    }

    public final float getGeometryStrokeWidth() {
        return this.geometryStrokeWidth;
    }

    public final int getHeight() {
        return this.height;
    }

    public final float getHighlighterColorAlpha() {
        return this.highlighterColorAlpha;
    }

    @Nullable
    public final ImageCropView getImageCropView() {
        return this.imageCropView;
    }

    public final int getMaxImageSize() {
        return this.maxImageSize;
    }

    @NotNull
    public final EzyModeEnum$ModeEnum getMode() {
        return this.mode;
    }

    @NotNull
    public final MoveActionConfig getMoveActionConfig() {
        return this.moveActionConfig;
    }

    public final float getMultiImageOffset() {
        return this.multiImageOffset;
    }

    public final int getPaintColor() {
        return this.paintColor;
    }

    public final float getPaintDottedLineItemLength() {
        return this.paintDottedLineItemLength;
    }

    public final float getPaintDottedLineSpacing() {
        return this.paintDottedLineSpacing;
    }

    public final float getPaintWidth() {
        return this.paintWidth;
    }

    public final float getSelectButtonHeight() {
        return this.selectButtonHeight;
    }

    @Nullable
    public final CustomColorView getSelectCustomColorView() {
        return this.selectCustomColorView;
    }

    @Nullable
    public final InterfaceC6471c getSelectEditColorChangeListener() {
        return this.selectEditColorChangeListener;
    }

    @Nullable
    public final List<Integer> getSelectEditColorList() {
        return this.selectEditColorList;
    }

    @NotNull
    public final List<Float> getSelectHighlighterLevel() {
        return this.selectHighlighterLevel;
    }

    public final float getSelectIconWidth() {
        return this.selectIconWidth;
    }

    @NotNull
    public final List<SelectGraphEnum> getSelectIncludeGraphEnumListByClick() {
        return this.selectIncludeGraphEnumListByClick;
    }

    @NotNull
    public final List<SelectGraphEnum> getSelectIncludeGraphEnumListByDrag() {
        return this.selectIncludeGraphEnumListByDrag;
    }

    @NotNull
    public final List<Float> getSelectStrokeWidthList(boolean isHighlighter) {
        return isHighlighter ? this.selectHighlighterLevel : this.selectWriteLevel;
    }

    @NotNull
    public final List<Float> getSelectWriteLevel() {
        return this.selectWriteLevel;
    }

    @Nullable
    public final TextEditView getTextEditView() {
        return this.textEditView;
    }

    public final int getWidth() {
        return this.width;
    }

    /* renamed from: isDottedLine, reason: from getter */
    public final boolean getIsDottedLine() {
        return this.isDottedLine;
    }

    /* renamed from: isFingerDraw, reason: from getter */
    public final boolean getIsFingerDraw() {
        return this.isFingerDraw;
    }

    /* renamed from: isGroupGraphComplete, reason: from getter */
    public final boolean getIsGroupGraphComplete() {
        return this.isGroupGraphComplete;
    }

    /* renamed from: isImageBackground, reason: from getter */
    public final boolean getIsImageBackground() {
        return this.isImageBackground;
    }

    public final void setAddTextOriginalText(@NotNull String str) {
        AbstractC5830k.m5330g(str, "<set-?>");
        this.addTextOriginalText = str;
    }

    public final void setAddTextOriginalTextColor(int i) {
        this.addTextOriginalTextColor = i;
    }

    public final void setAddTextOriginalTextMaxSize(float f) {
        this.addTextOriginalTextMaxSize = f;
    }

    public final void setAddTextOriginalTextMinSize(float f) {
        this.addTextOriginalTextMinSize = f;
    }

    public final void setAddTextOriginalTextSize(float f) {
        this.addTextOriginalTextSize = f;
    }

    public final void setAddTextRectF(@NotNull RectF rectF) {
        AbstractC5830k.m5330g(rectF, "<set-?>");
        this.addTextRectF = rectF;
    }

    public final void setAuthor(@Nullable Author author) {
        this.author = author;
    }

    public final void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    public final void setBackgroundColorOutside(int i) {
        this.backgroundColorOutside = i;
    }

    public final void setBeelinePaintColor(int i) {
        this.beelinePaintColor = i;
    }

    public final void setBeelinePaintWidth(float f) {
        this.beelinePaintWidth = f;
    }

    public final void setCursorColor(int i) {
        this.cursorColor = i;
    }

    public final void setCursorOffset(float f) {
        this.cursorOffset = f;
    }

    public final void setCursorWidth(float f) {
        this.cursorWidth = f;
    }

    public final void setDottedLine(boolean z8) {
        this.isDottedLine = z8;
    }

    public final void setEraserWidth(float f) {
        this.eraserWidth = f;
    }

    public final void setFingerDraw(boolean z8) {
        if (this.isFingerDraw != z8) {
            EventBus eventBus = EventBus.INSTANCE;
            eventBus.post(EventKey.WRITE_NEW_GROUP);
            eventBus.post(EventKey.WRITE_BEELINE_NEW_GROUP);
        }
        this.isFingerDraw = z8;
    }

    public final void setGeometryActionEnum(@NotNull GeometryActionEnum geometryActionEnum) {
        AbstractC5830k.m5330g(geometryActionEnum, "<set-?>");
        this.geometryActionEnum = geometryActionEnum;
    }

    public final void setGeometryMinSize(float f) {
        this.geometryMinSize = f;
    }

    public final void setGeometryStrokeColor(int i) {
        this.geometryStrokeColor = i;
    }

    public final void setGeometryStrokeWidth(float f) {
        this.geometryStrokeWidth = f;
    }

    public final void setGroupGraphComplete(boolean z8) {
        this.isGroupGraphComplete = z8;
    }

    public final void setHighlighterColorAlpha(float f) {
        this.highlighterColorAlpha = f;
    }

    public final void setImageBackground(boolean z8) {
        this.isImageBackground = z8;
    }

    public final void setImageCropView(@Nullable ImageCropView imageCropView) {
        this.imageCropView = imageCropView;
    }

    public final void setMaxImageSize(int i) {
        this.maxImageSize = i;
    }

    public final void setMode(@NotNull EzyModeEnum$ModeEnum mode) {
        AbstractC5830k.m5330g(mode, "mode");
        int i = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        if (i == 1) {
            EventBus eventBus = EventBus.INSTANCE;
            eventBus.post(EventKey.TEXT_ACTION_SELECTED_CANCEL);
            eventBus.post(EventKey.WRITE_NEW_GROUP);
        } else if (i != 2) {
            if (i == 3) {
                EventBus eventBus2 = EventBus.INSTANCE;
                eventBus2.post(EventKey.DELETE_ACTION);
                eventBus2.post(EventKey.WRITE_NEW_GROUP);
            } else if (i == 4) {
                EventBus eventBus3 = EventBus.INSTANCE;
                eventBus3.post(EventKey.SELECT_ACTION_SELECTED_CANCEL);
                eventBus3.post(EventKey.WRITE_NEW_GROUP);
            } else if (i == 5) {
                EventBus.INSTANCE.post(EventKey.WRITE_NEW_GROUP);
            }
        } else if (this.mode != mode) {
            EventBus.INSTANCE.post(EventKey.WRITE_BEELINE_NEW_GROUP);
        }
        this.mode = mode;
    }

    public final void setMultiImageOffset(float f) {
        this.multiImageOffset = f;
    }

    public final void setPaintColor(int i) {
        if (this.paintColor != i) {
            EventBus eventBus = EventBus.INSTANCE;
            eventBus.post(EventKey.WRITE_NEW_GROUP);
            eventBus.post(EventKey.WRITE_BEELINE_NEW_GROUP);
        }
        this.paintColor = i;
    }

    public final void setPaintWidth(float f) {
        if (this.paintWidth != f) {
            EventBus eventBus = EventBus.INSTANCE;
            eventBus.post(EventKey.WRITE_NEW_GROUP);
            eventBus.post(EventKey.WRITE_BEELINE_NEW_GROUP);
        }
        this.paintWidth = f;
    }

    public final void setSelectCustomColorView(@Nullable CustomColorView customColorView) {
        this.selectCustomColorView = customColorView;
    }

    public final void setSelectEditColorChangeListener(@Nullable InterfaceC6471c interfaceC6471c) {
        this.selectEditColorChangeListener = interfaceC6471c;
    }

    public final void setSelectEditColorList(@Nullable List<Integer> list) {
        this.selectEditColorList = list;
    }

    public final void setSelectHighlighterLevel(@NotNull List<Float> list) {
        AbstractC5830k.m5330g(list, "<set-?>");
        this.selectHighlighterLevel = list;
    }

    public final void setSelectIconWidth(float f) {
        this.selectIconWidth = f;
    }

    public final void setSelectIncludeGraphEnumListByClick(@NotNull List<? extends SelectGraphEnum> list) {
        AbstractC5830k.m5330g(list, "<set-?>");
        this.selectIncludeGraphEnumListByClick = list;
    }

    public final void setSelectIncludeGraphEnumListByDrag(@NotNull List<? extends SelectGraphEnum> list) {
        AbstractC5830k.m5330g(list, "<set-?>");
        this.selectIncludeGraphEnumListByDrag = list;
    }

    public final void setSelectWriteLevel(@NotNull List<Float> list) {
        AbstractC5830k.m5330g(list, "<set-?>");
        this.selectWriteLevel = list;
    }

    public final void setTextEditView(@Nullable TextEditView textEditView) {
        this.textEditView = textEditView;
    }

    public final void setDottedLine(boolean isDottedLine, float itemLength, float spacing) {
        if (this.isDottedLine != isDottedLine) {
            EventBus.INSTANCE.post(EventKey.WRITE_BEELINE_NEW_GROUP);
        }
        this.isDottedLine = isDottedLine;
        this.paintDottedLineItemLength = itemLength;
        this.paintDottedLineSpacing = spacing;
    }
}
