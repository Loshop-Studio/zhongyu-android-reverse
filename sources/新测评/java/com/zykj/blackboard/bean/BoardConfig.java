package com.zykj.blackboard.bean;

import android.graphics.RectF;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.zykj.blackboard.core.action.GeometryActionEnum;
import com.zykj.blackboard.enums.SelectGraphEnum;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.board.EzyModeEnum;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p007a5.AbstractC0022a;
import p066d5.InterfaceC7289a;
import p066d5.InterfaceC7290b;
import p066d5.InterfaceC7291c;
import p077e5.C7347h;
import p087f4.AbstractC7436a;
import p087f4.C7438c;

@Metadata(m13557d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00142\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\"\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001eR*\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b \u0010\"\"\u0004\b#\u0010$R*\u0010%\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001eR\"\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0017\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001eR\"\u0010+\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R*\u00101\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R\"\u00104\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010,\u001a\u0004\b5\u0010.\"\u0004\b6\u00100R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010!\u001a\u0004\b\b\u0010\"\"\u0004\b\r\u0010$R$\u00108\u001a\u00020\t2\u0006\u00107\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b8\u0010,\u001a\u0004\b9\u0010.R$\u0010:\u001a\u00020\t2\u0006\u00107\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b:\u0010,\u001a\u0004\b;\u0010.R$\u0010\u0010\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\b=\u0010>R$\u0010@\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010G\u001a\u00020F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010N\u001a\u00020M8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010T\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010,\u001a\u0004\bU\u0010.\"\u0004\bV\u00100R\"\u0010W\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010,\u001a\u0004\bX\u0010.\"\u0004\bY\u00100R\"\u0010Z\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010,\u001a\u0004\b[\u0010.\"\u0004\b\\\u00100R\"\u0010]\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010\u0017\u001a\u0004\b^\u0010\u0019\"\u0004\b_\u0010\u001eR\"\u0010`\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010\u0017\u001a\u0004\ba\u0010\u0019\"\u0004\bb\u0010\u001eR\u0017\u0010d\u001a\u00020c8\u0006¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\"\u0010h\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010\u0017\u001a\u0004\bi\u0010\u0019\"\u0004\bj\u0010\u001eR\"\u0010k\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010\u0017\u001a\u0004\bl\u0010\u0019\"\u0004\bm\u0010\u001eR\"\u0010n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010,\u001a\u0004\bo\u0010.\"\u0004\bp\u00100R\"\u0010q\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010,\u001a\u0004\br\u0010.\"\u0004\bs\u00100R\u0017\u0010u\u001a\u00020t8\u0006¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\"\u0010y\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010,\u001a\u0004\bz\u0010.\"\u0004\b{\u00100R\"\u0010|\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b|\u0010!\u001a\u0004\b|\u0010\"\"\u0004\b}\u0010$R\"\u0010~\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b~\u0010!\u001a\u0004\b~\u0010\"\"\u0004\b\u007f\u0010$R,\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R,\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R0\u0010\u008f\u0001\u001a\t\u0012\u0005\u0012\u00030\u008e\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R0\u0010\u0095\u0001\u001a\t\u0012\u0005\u0012\u00030\u008e\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u0090\u0001\u001a\u0006\b\u0096\u0001\u0010\u0092\u0001\"\u0006\b\u0097\u0001\u0010\u0094\u0001R\u001d\u0010\u0098\u0001\u001a\u00020\t8\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0098\u0001\u0010,\u001a\u0005\b\u0099\u0001\u0010.R&\u0010\u009a\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009a\u0001\u0010,\u001a\u0005\b\u009b\u0001\u0010.\"\u0005\b\u009c\u0001\u00100R&\u0010\u009d\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009d\u0001\u0010,\u001a\u0005\b\u009e\u0001\u0010.\"\u0005\b\u009f\u0001\u00100R*\u0010¡\u0001\u001a\u00030 \u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R&\u0010§\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b§\u0001\u0010,\u001a\u0005\b¨\u0001\u0010.\"\u0005\b©\u0001\u00100R&\u0010ª\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bª\u0001\u0010\u0017\u001a\u0005\b«\u0001\u0010\u0019\"\u0005\b¬\u0001\u0010\u001eR&\u0010\u00ad\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u00ad\u0001\u0010,\u001a\u0005\b®\u0001\u0010.\"\u0005\b¯\u0001\u00100R/\u0010°\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b°\u0001\u0010\u0090\u0001\u001a\u0006\b±\u0001\u0010\u0092\u0001\"\u0006\b²\u0001\u0010\u0094\u0001R/\u0010³\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b³\u0001\u0010\u0090\u0001\u001a\u0006\b´\u0001\u0010\u0092\u0001\"\u0006\bµ\u0001\u0010\u0094\u0001R1\u0010¶\u0001\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¶\u0001\u0010\u0090\u0001\u001a\u0006\b·\u0001\u0010\u0092\u0001\"\u0006\b¸\u0001\u0010\u0094\u0001R8\u0010º\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0018\u00010¹\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bº\u0001\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001\"\u0006\b¾\u0001\u0010¿\u0001R,\u0010Á\u0001\u001a\u0005\u0018\u00010À\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÁ\u0001\u0010Â\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001\"\u0006\bÅ\u0001\u0010Æ\u0001¨\u0006Ç\u0001"}, m13558d2 = {"Lcom/zykj/blackboard/bean/BoardConfig;", "", "", "width", "height", "<init>", "(II)V", "", "isDottedLine", "", "itemLength", "spacing", "", "setDottedLine", "(ZFF)V", "Lcom/zykj/board/EzyModeEnum$ModeEnum;", "mode", "setMode", "(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V", "isHighlighter", "", "getSelectStrokeWidthList", "(Z)Ljava/util/List;", "I", "getWidth", "()I", "getHeight", "maxImageSize", "getMaxImageSize", "setMaxImageSize", "(I)V", "value", "isFingerDraw", "Z", "()Z", "setFingerDraw", "(Z)V", "paintColor", "getPaintColor", "setPaintColor", "beelinePaintColor", "getBeelinePaintColor", "setBeelinePaintColor", "beelinePaintWidth", "F", "getBeelinePaintWidth", "()F", "setBeelinePaintWidth", "(F)V", "paintWidth", "getPaintWidth", "setPaintWidth", "eraserWidth", "getEraserWidth", "setEraserWidth", "<set-?>", "paintDottedLineItemLength", "getPaintDottedLineItemLength", "paintDottedLineSpacing", "getPaintDottedLineSpacing", "Lcom/zykj/board/EzyModeEnum$ModeEnum;", "getMode", "()Lcom/zykj/board/EzyModeEnum$ModeEnum;", "Ld5/c;", "textEditView", "Ld5/c;", "getTextEditView", "()Ld5/c;", "setTextEditView", "(Ld5/c;)V", "Landroid/graphics/RectF;", "addTextRectF", "Landroid/graphics/RectF;", "getAddTextRectF", "()Landroid/graphics/RectF;", "setAddTextRectF", "(Landroid/graphics/RectF;)V", "", "addTextOriginalText", "Ljava/lang/String;", "getAddTextOriginalText", "()Ljava/lang/String;", "setAddTextOriginalText", "(Ljava/lang/String;)V", "addTextOriginalTextSize", "getAddTextOriginalTextSize", "setAddTextOriginalTextSize", "addTextOriginalTextMinSize", "getAddTextOriginalTextMinSize", "setAddTextOriginalTextMinSize", "addTextOriginalTextMaxSize", "getAddTextOriginalTextMaxSize", "setAddTextOriginalTextMaxSize", "addTextOriginalTextColor", "getAddTextOriginalTextColor", "setAddTextOriginalTextColor", "backgroundColor", "getBackgroundColor", "setBackgroundColor", "Lcom/zykj/blackboard/bean/BackgroundLineConfig;", "backgroundLineConfig", "Lcom/zykj/blackboard/bean/BackgroundLineConfig;", "getBackgroundLineConfig", "()Lcom/zykj/blackboard/bean/BackgroundLineConfig;", "backgroundColorOutside", "getBackgroundColorOutside", "setBackgroundColorOutside", "cursorColor", "getCursorColor", "setCursorColor", "cursorWidth", "getCursorWidth", "setCursorWidth", "cursorOffset", "getCursorOffset", "setCursorOffset", "Lf4/c;", "moveActionConfig", "Lf4/c;", "getMoveActionConfig", "()Lf4/c;", "multiImageOffset", "getMultiImageOffset", "setMultiImageOffset", "isImageBackground", "setImageBackground", "isGroupGraphComplete", "setGroupGraphComplete", "Ld5/b;", "imageCropView", "Ld5/b;", "getImageCropView", "()Ld5/b;", "setImageCropView", "(Ld5/b;)V", "Lf4/a;", "author", "Lf4/a;", "getAuthor", "()Lf4/a;", "setAuthor", "(Lf4/a;)V", "Lcom/zykj/blackboard/enums/SelectGraphEnum;", "selectIncludeGraphEnumListByClick", "Ljava/util/List;", "getSelectIncludeGraphEnumListByClick", "()Ljava/util/List;", "setSelectIncludeGraphEnumListByClick", "(Ljava/util/List;)V", "selectIncludeGraphEnumListByDrag", "getSelectIncludeGraphEnumListByDrag", "setSelectIncludeGraphEnumListByDrag", "selectButtonHeight", "getSelectButtonHeight", "selectIconWidth", "getSelectIconWidth", "setSelectIconWidth", "highlighterColorAlpha", "getHighlighterColorAlpha", "setHighlighterColorAlpha", "Lcom/zykj/blackboard/core/action/GeometryActionEnum;", "geometryActionEnum", "Lcom/zykj/blackboard/core/action/GeometryActionEnum;", "getGeometryActionEnum", "()Lcom/zykj/blackboard/core/action/GeometryActionEnum;", "setGeometryActionEnum", "(Lcom/zykj/blackboard/core/action/GeometryActionEnum;)V", "geometryStrokeWidth", "getGeometryStrokeWidth", "setGeometryStrokeWidth", "geometryStrokeColor", "getGeometryStrokeColor", "setGeometryStrokeColor", "geometryMinSize", "getGeometryMinSize", "setGeometryMinSize", "selectWriteLevel", "getSelectWriteLevel", "setSelectWriteLevel", "selectHighlighterLevel", "getSelectHighlighterLevel", "setSelectHighlighterLevel", "selectEditColorList", "getSelectEditColorList", "setSelectEditColorList", "Lkotlin/Function1;", "selectEditColorChangeListener", "Lkotlin/jvm/functions/Function1;", "getSelectEditColorChangeListener", "()Lkotlin/jvm/functions/Function1;", "setSelectEditColorChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "Ld5/a;", "selectCustomColorView", "Ld5/a;", "getSelectCustomColorView", "()Ld5/a;", "setSelectCustomColorView", "(Ld5/a;)V", "blackboard_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes4.dex */
public final class BoardConfig {
    private AbstractC7436a author;
    private int backgroundColor;
    private final int height;
    private InterfaceC7290b imageCropView;
    private boolean isDottedLine;
    private boolean isGroupGraphComplete;
    private boolean isImageBackground;
    private InterfaceC7289a selectCustomColorView;
    private Function1<? super Integer, Unit> selectEditColorChangeListener;
    private List<Integer> selectEditColorList;
    private InterfaceC7291c textEditView;
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
    private EzyModeEnum.ModeEnum mode = EzyModeEnum.ModeEnum.ACTION_WRITING;
    private RectF addTextRectF = new RectF(0.0f, 0.0f, 400.0f, 100.0f);
    private String addTextOriginalText = "请输入文字";
    private float addTextOriginalTextSize = 28.0f;
    private float addTextOriginalTextMinSize = 20.0f;
    private float addTextOriginalTextMaxSize = 48.0f;
    private int addTextOriginalTextColor = ViewCompat.MEASURED_STATE_MASK;
    private final BackgroundLineConfig backgroundLineConfig = new BackgroundLineConfig(0, 0.0f, null, 0.0f, 15, null);
    private int backgroundColorOutside = -1;
    private int cursorColor = SupportMenu.CATEGORY_MASK;
    private float cursorWidth = 20.0f;
    private float cursorOffset = 50.0f;
    private final C7438c moveActionConfig = new C7438c(false, false, false, false, false, 0, 0, 127, null);
    private float multiImageOffset = 50.0f;
    private List<? extends SelectGraphEnum> selectIncludeGraphEnumListByClick = AbstractC0022a.m63b();
    private List<? extends SelectGraphEnum> selectIncludeGraphEnumListByDrag = AbstractC0022a.m63b();
    private final float selectButtonHeight = 60.0f;
    private float selectIconWidth = 36.0f;
    private float highlighterColorAlpha = 0.5f;
    private GeometryActionEnum geometryActionEnum = GeometryActionEnum.RECTANGLE;
    private float geometryStrokeWidth = 3.0f;
    private int geometryStrokeColor = ViewCompat.MEASURED_STATE_MASK;
    private float geometryMinSize = 36.0f;
    private List<Float> selectWriteLevel = CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(3.0f), Float.valueOf(8.0f), Float.valueOf(15.0f)});
    private List<Float> selectHighlighterLevel = CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(28.0f), Float.valueOf(36.0f), Float.valueOf(56.0f)});

    /* renamed from: com.zykj.blackboard.bean.BoardConfig$a */
    public /* synthetic */ class C6617a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6910a;

        static {
            int[] iArr = new int[EzyModeEnum.ModeEnum.values().length];
            iArr[EzyModeEnum.ModeEnum.ACTION_SELECT.ordinal()] = 1;
            iArr[EzyModeEnum.ModeEnum.ACTION_WRITING_BEELINE.ordinal()] = 2;
            iArr[EzyModeEnum.ModeEnum.ACTION_ERASER_WRITING.ordinal()] = 3;
            iArr[EzyModeEnum.ModeEnum.ACTION_TEXT.ordinal()] = 4;
            iArr[EzyModeEnum.ModeEnum.ACTION_CURSOR.ordinal()] = 5;
            f6910a = iArr;
        }
    }

    public BoardConfig(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }

    public static /* synthetic */ void setDottedLine$default(BoardConfig boardConfig, boolean z9, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 30.0f;
        }
        if ((i10 & 4) != 0) {
            f11 = 15.0f;
        }
        boardConfig.setDottedLine(z9, f10, f11);
    }

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

    public final RectF getAddTextRectF() {
        return this.addTextRectF;
    }

    public final AbstractC7436a getAuthor() {
        return null;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBackgroundColorOutside() {
        return this.backgroundColorOutside;
    }

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

    public final InterfaceC7290b getImageCropView() {
        return this.imageCropView;
    }

    public final int getMaxImageSize() {
        return this.maxImageSize;
    }

    public final EzyModeEnum.ModeEnum getMode() {
        return this.mode;
    }

    public final C7438c getMoveActionConfig() {
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

    public final InterfaceC7289a getSelectCustomColorView() {
        return this.selectCustomColorView;
    }

    public final Function1<Integer, Unit> getSelectEditColorChangeListener() {
        return this.selectEditColorChangeListener;
    }

    public final List<Integer> getSelectEditColorList() {
        return this.selectEditColorList;
    }

    public final List<Float> getSelectHighlighterLevel() {
        return this.selectHighlighterLevel;
    }

    public final float getSelectIconWidth() {
        return this.selectIconWidth;
    }

    public final List<SelectGraphEnum> getSelectIncludeGraphEnumListByClick() {
        return this.selectIncludeGraphEnumListByClick;
    }

    public final List<SelectGraphEnum> getSelectIncludeGraphEnumListByDrag() {
        return this.selectIncludeGraphEnumListByDrag;
    }

    public final List<Float> getSelectStrokeWidthList(boolean isHighlighter) {
        return isHighlighter ? this.selectHighlighterLevel : this.selectWriteLevel;
    }

    public final List<Float> getSelectWriteLevel() {
        return this.selectWriteLevel;
    }

    public final InterfaceC7291c getTextEditView() {
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

    public final void setAddTextOriginalText(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.addTextOriginalText = str;
    }

    public final void setAddTextOriginalTextColor(int i10) {
        this.addTextOriginalTextColor = i10;
    }

    public final void setAddTextOriginalTextMaxSize(float f10) {
        this.addTextOriginalTextMaxSize = f10;
    }

    public final void setAddTextOriginalTextMinSize(float f10) {
        this.addTextOriginalTextMinSize = f10;
    }

    public final void setAddTextOriginalTextSize(float f10) {
        this.addTextOriginalTextSize = f10;
    }

    public final void setAddTextRectF(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<set-?>");
        this.addTextRectF = rectF;
    }

    public final void setBackgroundColor(int i10) {
        this.backgroundColor = i10;
    }

    public final void setBackgroundColorOutside(int i10) {
        this.backgroundColorOutside = i10;
    }

    public final void setBeelinePaintColor(int i10) {
        this.beelinePaintColor = i10;
    }

    public final void setBeelinePaintWidth(float f10) {
        this.beelinePaintWidth = f10;
    }

    public final void setCursorColor(int i10) {
        this.cursorColor = i10;
    }

    public final void setCursorOffset(float f10) {
        this.cursorOffset = f10;
    }

    public final void setCursorWidth(float f10) {
        this.cursorWidth = f10;
    }

    public final void setDottedLine(boolean z9) {
        this.isDottedLine = z9;
    }

    public final void setEraserWidth(float f10) {
        this.eraserWidth = f10;
    }

    public final void setFingerDraw(boolean z9) {
        if (this.isFingerDraw != z9) {
            C7347h c7347h = C7347h.f11914a;
            c7347h.m11758b(EventKey.WRITE_NEW_GROUP);
            c7347h.m11758b(EventKey.WRITE_BEELINE_NEW_GROUP);
        }
        this.isFingerDraw = z9;
    }

    public final void setGeometryActionEnum(GeometryActionEnum geometryActionEnum) {
        Intrinsics.checkNotNullParameter(geometryActionEnum, "<set-?>");
        this.geometryActionEnum = geometryActionEnum;
    }

    public final void setGeometryMinSize(float f10) {
        this.geometryMinSize = f10;
    }

    public final void setGeometryStrokeColor(int i10) {
        this.geometryStrokeColor = i10;
    }

    public final void setGeometryStrokeWidth(float f10) {
        this.geometryStrokeWidth = f10;
    }

    public final void setGroupGraphComplete(boolean z9) {
        this.isGroupGraphComplete = z9;
    }

    public final void setHighlighterColorAlpha(float f10) {
        this.highlighterColorAlpha = f10;
    }

    public final void setImageBackground(boolean z9) {
        this.isImageBackground = z9;
    }

    public final void setImageCropView(InterfaceC7290b interfaceC7290b) {
        this.imageCropView = interfaceC7290b;
    }

    public final void setMaxImageSize(int i10) {
        this.maxImageSize = i10;
    }

    public final void setMode(EzyModeEnum.ModeEnum mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        int i10 = C6617a.f6910a[mode.ordinal()];
        if (i10 == 1) {
            C7347h c7347h = C7347h.f11914a;
            c7347h.m11758b(EventKey.TEXT_ACTION_SELECTED_CANCEL);
            c7347h.m11758b(EventKey.WRITE_NEW_GROUP);
        } else if (i10 != 2) {
            if (i10 == 3) {
                C7347h c7347h2 = C7347h.f11914a;
                c7347h2.m11758b(EventKey.DELETE_ACTION);
                c7347h2.m11758b(EventKey.WRITE_NEW_GROUP);
            } else if (i10 == 4) {
                C7347h c7347h3 = C7347h.f11914a;
                c7347h3.m11758b(EventKey.SELECT_ACTION_SELECTED_CANCEL);
                c7347h3.m11758b(EventKey.WRITE_NEW_GROUP);
            } else if (i10 == 5) {
                C7347h.f11914a.m11758b(EventKey.WRITE_NEW_GROUP);
            }
        } else if (this.mode != mode) {
            C7347h.f11914a.m11758b(EventKey.WRITE_BEELINE_NEW_GROUP);
        }
        this.mode = mode;
    }

    public final void setMultiImageOffset(float f10) {
        this.multiImageOffset = f10;
    }

    public final void setPaintColor(int i10) {
        if (this.paintColor != i10) {
            C7347h c7347h = C7347h.f11914a;
            c7347h.m11758b(EventKey.WRITE_NEW_GROUP);
            c7347h.m11758b(EventKey.WRITE_BEELINE_NEW_GROUP);
        }
        this.paintColor = i10;
    }

    public final void setPaintWidth(float f10) {
        if (this.paintWidth != f10) {
            C7347h c7347h = C7347h.f11914a;
            c7347h.m11758b(EventKey.WRITE_NEW_GROUP);
            c7347h.m11758b(EventKey.WRITE_BEELINE_NEW_GROUP);
        }
        this.paintWidth = f10;
    }

    public final void setSelectCustomColorView(InterfaceC7289a interfaceC7289a) {
        this.selectCustomColorView = interfaceC7289a;
    }

    public final void setSelectEditColorChangeListener(Function1<? super Integer, Unit> function1) {
        this.selectEditColorChangeListener = function1;
    }

    public final void setSelectEditColorList(List<Integer> list) {
        this.selectEditColorList = list;
    }

    public final void setSelectHighlighterLevel(List<Float> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.selectHighlighterLevel = list;
    }

    public final void setSelectIconWidth(float f10) {
        this.selectIconWidth = f10;
    }

    public final void setSelectIncludeGraphEnumListByClick(List<? extends SelectGraphEnum> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.selectIncludeGraphEnumListByClick = list;
    }

    public final void setSelectIncludeGraphEnumListByDrag(List<? extends SelectGraphEnum> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.selectIncludeGraphEnumListByDrag = list;
    }

    public final void setSelectWriteLevel(List<Float> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.selectWriteLevel = list;
    }

    public final void setTextEditView(InterfaceC7291c interfaceC7291c) {
        this.textEditView = interfaceC7291c;
    }

    public final void setDottedLine(boolean isDottedLine, float itemLength, float spacing) {
        if (this.isDottedLine != isDottedLine) {
            C7347h.f11914a.m11758b(EventKey.WRITE_BEELINE_NEW_GROUP);
        }
        this.isDottedLine = isDottedLine;
        this.paintDottedLineItemLength = itemLength;
        this.paintDottedLineSpacing = spacing;
    }

    public final void setAuthor(AbstractC7436a abstractC7436a) {
    }
}
