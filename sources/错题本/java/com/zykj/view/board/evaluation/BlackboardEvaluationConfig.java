package com.zykj.view.board.evaluation;

import androidx.annotation.IntRange;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b9\u0018\u00002\u00020\u0001BÍ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010!\u001a\u0004\b&\u0010#\"\u0004\b'\u0010%R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001a\u001a\u0004\b(\u0010\u001c\"\u0004\b)\u0010\u001eR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010*\u001a\u0004\b/\u0010,\"\u0004\b0\u0010.R*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b6\u0010\u001c\"\u0004\b7\u0010\u001eR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b8\u0010\u001c\"\u0004\b9\u0010\u001eR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b:\u0010\u001c\"\u0004\b;\u0010\u001eR\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b<\u0010\u001c\"\u0004\b=\u0010\u001eR\"\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010*\u001a\u0004\b>\u0010,\"\u0004\b?\u0010.R\"\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001a\u001a\u0004\b@\u0010\u001c\"\u0004\bA\u0010\u001eR\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0015\u00101\u001a\u0004\bB\u00103R\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001a\u001a\u0004\bC\u0010\u001c\"\u0004\bD\u0010\u001eR\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0017\u00101\u001a\u0004\bE\u00103¨\u0006F"}, m5110d2 = {"Lcom/zykj/view/board/evaluation/BlackboardEvaluationConfig;", "", "", "needDottedLine", "needCamera", "", "maxImageCount", "maxVerticalTime", "enableMove", "", "defaultLocationRatio", "bottomOffset", "Lkotlin/Function0;", "Ld6/s;", "callbackForSubmit", "needWithdraw", "needRecover", "needText", "needSelect", "defaultTextSize", "needQuestion", "onImportQuestionClick", "needAnswer", "onImportAnswerClick", "<init>", "(ZZLjava/lang/Integer;Ljava/lang/Integer;ZFFLr6/a;ZZZZFZLr6/a;ZLr6/a;)V", "Z", "getNeedDottedLine", "()Z", "setNeedDottedLine", "(Z)V", "getNeedCamera", "setNeedCamera", "Ljava/lang/Integer;", "getMaxImageCount", "()Ljava/lang/Integer;", "setMaxImageCount", "(Ljava/lang/Integer;)V", "getMaxVerticalTime", "setMaxVerticalTime", "getEnableMove", "setEnableMove", "F", "getDefaultLocationRatio", "()F", "setDefaultLocationRatio", "(F)V", "getBottomOffset", "setBottomOffset", "Lr6/a;", "getCallbackForSubmit", "()Lr6/a;", "setCallbackForSubmit", "(Lr6/a;)V", "getNeedWithdraw", "setNeedWithdraw", "getNeedRecover", "setNeedRecover", "getNeedText", "setNeedText", "getNeedSelect", "setNeedSelect", "getDefaultTextSize", "setDefaultTextSize", "getNeedQuestion", "setNeedQuestion", "getOnImportQuestionClick", "getNeedAnswer", "setNeedAnswer", "getOnImportAnswerClick", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class BlackboardEvaluationConfig {
    private float bottomOffset;

    @Nullable
    private InterfaceC6469a callbackForSubmit;
    private float defaultLocationRatio;
    private float defaultTextSize;
    private boolean enableMove;

    @Nullable
    private Integer maxImageCount;

    @Nullable
    private Integer maxVerticalTime;
    private boolean needAnswer;
    private boolean needCamera;
    private boolean needDottedLine;
    private boolean needQuestion;
    private boolean needRecover;
    private boolean needSelect;
    private boolean needText;
    private boolean needWithdraw;

    @Nullable
    private final InterfaceC6469a onImportAnswerClick;

    @Nullable
    private final InterfaceC6469a onImportQuestionClick;

    public BlackboardEvaluationConfig() {
        this(false, false, null, null, false, 0.0f, 0.0f, null, false, false, false, false, 0.0f, false, null, false, null, 131071, null);
    }

    public final float getBottomOffset() {
        return this.bottomOffset;
    }

    @Nullable
    public final InterfaceC6469a getCallbackForSubmit() {
        return this.callbackForSubmit;
    }

    public final float getDefaultLocationRatio() {
        return this.defaultLocationRatio;
    }

    public final float getDefaultTextSize() {
        return this.defaultTextSize;
    }

    public final boolean getEnableMove() {
        return this.enableMove;
    }

    @Nullable
    public final Integer getMaxImageCount() {
        return this.maxImageCount;
    }

    @Nullable
    public final Integer getMaxVerticalTime() {
        return this.maxVerticalTime;
    }

    public final boolean getNeedAnswer() {
        return this.needAnswer;
    }

    public final boolean getNeedCamera() {
        return this.needCamera;
    }

    public final boolean getNeedDottedLine() {
        return this.needDottedLine;
    }

    public final boolean getNeedQuestion() {
        return this.needQuestion;
    }

    public final boolean getNeedRecover() {
        return this.needRecover;
    }

    public final boolean getNeedSelect() {
        return this.needSelect;
    }

    public final boolean getNeedText() {
        return this.needText;
    }

    public final boolean getNeedWithdraw() {
        return this.needWithdraw;
    }

    @Nullable
    public final InterfaceC6469a getOnImportAnswerClick() {
        return this.onImportAnswerClick;
    }

    @Nullable
    public final InterfaceC6469a getOnImportQuestionClick() {
        return this.onImportQuestionClick;
    }

    public final void setBottomOffset(float f) {
        this.bottomOffset = f;
    }

    public final void setCallbackForSubmit(@Nullable InterfaceC6469a interfaceC6469a) {
        this.callbackForSubmit = interfaceC6469a;
    }

    public final void setDefaultLocationRatio(float f) {
        this.defaultLocationRatio = f;
    }

    public final void setDefaultTextSize(float f) {
        this.defaultTextSize = f;
    }

    public final void setEnableMove(boolean z8) {
        this.enableMove = z8;
    }

    public final void setMaxImageCount(@Nullable Integer num) {
        this.maxImageCount = num;
    }

    public final void setMaxVerticalTime(@Nullable Integer num) {
        this.maxVerticalTime = num;
    }

    public final void setNeedAnswer(boolean z8) {
        this.needAnswer = z8;
    }

    public final void setNeedCamera(boolean z8) {
        this.needCamera = z8;
    }

    public final void setNeedDottedLine(boolean z8) {
        this.needDottedLine = z8;
    }

    public final void setNeedQuestion(boolean z8) {
        this.needQuestion = z8;
    }

    public final void setNeedRecover(boolean z8) {
        this.needRecover = z8;
    }

    public final void setNeedSelect(boolean z8) {
        this.needSelect = z8;
    }

    public final void setNeedText(boolean z8) {
        this.needText = z8;
    }

    public final void setNeedWithdraw(boolean z8) {
        this.needWithdraw = z8;
    }

    public BlackboardEvaluationConfig(boolean z8, boolean z9, @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) @Nullable Integer num, @Nullable Integer num2, boolean z10, float f, float f7, @Nullable InterfaceC6469a interfaceC6469a, boolean z11, boolean z12, boolean z13, boolean z14, float f8, boolean z15, @Nullable InterfaceC6469a interfaceC6469a2, boolean z16, @Nullable InterfaceC6469a interfaceC6469a3) {
        this.needDottedLine = z8;
        this.needCamera = z9;
        this.maxImageCount = num;
        this.maxVerticalTime = num2;
        this.enableMove = z10;
        this.defaultLocationRatio = f;
        this.bottomOffset = f7;
        this.callbackForSubmit = interfaceC6469a;
        this.needWithdraw = z11;
        this.needRecover = z12;
        this.needText = z13;
        this.needSelect = z14;
        this.defaultTextSize = f8;
        this.needQuestion = z15;
        this.onImportQuestionClick = interfaceC6469a2;
        this.needAnswer = z16;
        this.onImportAnswerClick = interfaceC6469a3;
    }

    public /* synthetic */ BlackboardEvaluationConfig(boolean z8, boolean z9, Integer num, Integer num2, boolean z10, float f, float f7, InterfaceC6469a interfaceC6469a, boolean z11, boolean z12, boolean z13, boolean z14, float f8, boolean z15, InterfaceC6469a interfaceC6469a2, boolean z16, InterfaceC6469a interfaceC6469a3, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? false : z8, (i & 2) != 0 ? false : z9, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? true : z10, (i & 32) != 0 ? 0.5f : f, (i & 64) != 0 ? 0.0f : f7, (i & 128) != 0 ? null : interfaceC6469a, (i & 256) != 0 ? false : z11, (i & 512) != 0 ? false : z12, (i & 1024) != 0 ? false : z13, (i & 2048) != 0 ? false : z14, (i & 4096) != 0 ? 56.0f : f8, (i & 8192) != 0 ? false : z15, (i & 16384) != 0 ? null : interfaceC6469a2, (i & 32768) != 0 ? false : z16, (i & 65536) != 0 ? null : interfaceC6469a3);
    }
}
