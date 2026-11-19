package com.zykj.view.board.board;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.blackboard.core.edit.IPageControl;
import com.zykj.blackboard.listener.EventListener;
import com.zykj.blackboard.listener.IAreaMoveListener;
import com.zykj.blackboard.listener.IGeometrySelectListener;
import com.zykj.blackboard.listener.ITextSelectListener;
import com.zykj.blackboard.listener.MicroPhoneListener;
import com.zykj.blackboard.listener.RecordListener;
import com.zykj.blackboard.listener.WithdrawListener;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aA\u0010\b\u001a\u00020\u0002*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\f\u001a\u00020\u0002*\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\f\u0010\r\u001a9\u0010\u0012\u001a\u00020\u0002*\u00020\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0015\u001a\u00020\u0002*\u00020\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0015\u0010\r\u001aG\u0010\u001a\u001a\u00020\u0002*\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a%\u0010\u001e\u001a\u00020\u0002*\u00020\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u001e\u0010\r\u001a+\u0010 \u001a\u00020\u0002*\u00020\u00002\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\u0017¢\u0006\u0004\b \u0010!¨\u0006\""}, m5110d2 = {"Lcom/zykj/blackboard/core/edit/IPageControl;", "Lkotlin/Function0;", "Ld6/s;", "onStart", "Lkotlin/Function1;", "", "onProgress", "onStop", "setRecordListener", "(Lcom/zykj/blackboard/core/edit/IPageControl;Lr6/a;Lr6/c;Lr6/a;)V", "", "onMicroPhoneChange", "setMicroPhoneListener", "(Lcom/zykj/blackboard/core/edit/IPageControl;Lr6/c;)V", "", "onTextColorChange", "", "onTextSizeChange", "setTextSelectListener", "(Lcom/zykj/blackboard/core/edit/IPageControl;Lr6/c;Lr6/c;)V", "onGeometryColorChange", "bindGeometryColorSelectListener", "onMoveStart", "Lkotlin/Function2;", "onMoving", "onMoveEnd", "setAreaMoveListener", "(Lcom/zykj/blackboard/core/edit/IPageControl;Lr6/a;Lr6/e;Lr6/a;)V", "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;", "onEvent", "addTempEventListener", "onChange", "addRevokeListener", "(Lcom/zykj/blackboard/core/edit/IPageControl;Lr6/e;)V", "view_release"}, m5111k = 2, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class PageControlExtKt {
    public static final void addRevokeListener(@NotNull IPageControl iPageControl, @NotNull final InterfaceC6473e onChange) {
        AbstractC5830k.m5330g(iPageControl, "<this>");
        AbstractC5830k.m5330g(onChange, "onChange");
        iPageControl.addWithdrawListener(new WithdrawListener() { // from class: com.zykj.view.board.board.PageControlExtKt.addRevokeListener.1
            @Override // com.zykj.blackboard.listener.WithdrawListener
            public void onWithdraw(boolean canWithdraw, boolean canRecover) {
                onChange.invoke(Boolean.valueOf(canWithdraw), Boolean.valueOf(canRecover));
            }
        });
    }

    public static final void addTempEventListener(@NotNull final IPageControl iPageControl, @NotNull final InterfaceC6471c onEvent) {
        AbstractC5830k.m5330g(iPageControl, "<this>");
        AbstractC5830k.m5330g(onEvent, "onEvent");
        iPageControl.addEventListener(new EventListener() { // from class: com.zykj.view.board.board.PageControlExtKt.addTempEventListener.1
            @Override // com.zykj.blackboard.listener.EventListener
            public void onEvent(CommandInfoEntity entity) {
                AbstractC5830k.m5330g(entity, "entity");
                onEvent.invoke(entity);
                iPageControl.removeEventListener(this);
            }
        });
    }

    public static final void bindGeometryColorSelectListener(@NotNull IPageControl iPageControl, @NotNull final InterfaceC6471c onGeometryColorChange) {
        AbstractC5830k.m5330g(iPageControl, "<this>");
        AbstractC5830k.m5330g(onGeometryColorChange, "onGeometryColorChange");
        iPageControl.setGeometrySelectListener(new IGeometrySelectListener() { // from class: com.zykj.view.board.board.PageControlExtKt.bindGeometryColorSelectListener.1
            @Override // com.zykj.blackboard.listener.IGeometrySelectListener
            public void geometryColorChange(int newColor) {
                onGeometryColorChange.invoke(Integer.valueOf(newColor));
            }
        });
    }

    public static final void setAreaMoveListener(@NotNull IPageControl iPageControl, @NotNull final InterfaceC6469a onMoveStart, @NotNull final InterfaceC6473e onMoving, @NotNull final InterfaceC6469a onMoveEnd) {
        AbstractC5830k.m5330g(iPageControl, "<this>");
        AbstractC5830k.m5330g(onMoveStart, "onMoveStart");
        AbstractC5830k.m5330g(onMoving, "onMoving");
        AbstractC5830k.m5330g(onMoveEnd, "onMoveEnd");
        iPageControl.setAreaMoveListener(new IAreaMoveListener() { // from class: com.zykj.view.board.board.PageControlExtKt.setAreaMoveListener.1
            private float lastHorizontalProgress;
            private float lastVerticalProgress;

            public final float getLastHorizontalProgress() {
                return this.lastHorizontalProgress;
            }

            public final float getLastVerticalProgress() {
                return this.lastVerticalProgress;
            }

            @Override // com.zykj.blackboard.listener.IAreaMoveListener
            public void onHorizontalMove(float progress) {
                this.lastHorizontalProgress = progress;
                onMoving.invoke(Float.valueOf(this.lastVerticalProgress), Float.valueOf(this.lastHorizontalProgress));
            }

            @Override // com.zykj.blackboard.listener.IAreaMoveListener
            public void onMoveEnd() {
                onMoveEnd.invoke();
            }

            @Override // com.zykj.blackboard.listener.IAreaMoveListener
            public void onMoveStart() {
                onMoveStart.invoke();
            }

            @Override // com.zykj.blackboard.listener.IAreaMoveListener
            public void onVerticalMove(float progress) {
                this.lastVerticalProgress = progress;
                onMoving.invoke(Float.valueOf(progress), Float.valueOf(this.lastHorizontalProgress));
            }

            public final void setLastHorizontalProgress(float f) {
                this.lastHorizontalProgress = f;
            }

            public final void setLastVerticalProgress(float f) {
                this.lastVerticalProgress = f;
            }
        });
    }

    public static final void setMicroPhoneListener(@NotNull IPageControl iPageControl, @NotNull final InterfaceC6471c onMicroPhoneChange) {
        AbstractC5830k.m5330g(iPageControl, "<this>");
        AbstractC5830k.m5330g(onMicroPhoneChange, "onMicroPhoneChange");
        iPageControl.setMicroPhoneListener(new MicroPhoneListener() { // from class: com.zykj.view.board.board.PageControlExtKt.setMicroPhoneListener.1
            @Override // com.zykj.blackboard.listener.MicroPhoneListener
            public void turnOffMicroPhone() {
                onMicroPhoneChange.invoke(Boolean.FALSE);
            }

            @Override // com.zykj.blackboard.listener.MicroPhoneListener
            public void turnOnMicroPhone() {
                onMicroPhoneChange.invoke(Boolean.TRUE);
            }
        });
    }

    public static final void setRecordListener(@NotNull IPageControl iPageControl, @NotNull final InterfaceC6469a onStart, @NotNull final InterfaceC6471c onProgress, @NotNull final InterfaceC6469a onStop) {
        AbstractC5830k.m5330g(iPageControl, "<this>");
        AbstractC5830k.m5330g(onStart, "onStart");
        AbstractC5830k.m5330g(onProgress, "onProgress");
        AbstractC5830k.m5330g(onStop, "onStop");
        iPageControl.setRecordListener(new RecordListener() { // from class: com.zykj.view.board.board.PageControlExtKt.setRecordListener.1
            @Override // com.zykj.blackboard.listener.RecordListener
            public void progress(long time) {
                onProgress.invoke(Long.valueOf(time));
            }

            @Override // com.zykj.blackboard.listener.RecordListener
            public void startRecord() {
                onStart.invoke();
            }

            @Override // com.zykj.blackboard.listener.RecordListener
            public void stopRecord() {
                onStop.invoke();
            }
        });
    }

    public static final void setTextSelectListener(@NotNull IPageControl iPageControl, @NotNull final InterfaceC6471c onTextColorChange, @NotNull final InterfaceC6471c onTextSizeChange) {
        AbstractC5830k.m5330g(iPageControl, "<this>");
        AbstractC5830k.m5330g(onTextColorChange, "onTextColorChange");
        AbstractC5830k.m5330g(onTextSizeChange, "onTextSizeChange");
        iPageControl.setTextSelectListener(new ITextSelectListener() { // from class: com.zykj.view.board.board.PageControlExtKt.setTextSelectListener.1
            @Override // com.zykj.blackboard.listener.ITextSelectListener
            public void textColorChange(int newColor) {
                onTextColorChange.invoke(Integer.valueOf(newColor));
            }

            @Override // com.zykj.blackboard.listener.ITextSelectListener
            public void textSelected(int selectedColor, float selectedSize) {
            }

            @Override // com.zykj.blackboard.listener.ITextSelectListener
            public void textSelectedCancel() {
            }

            @Override // com.zykj.blackboard.listener.ITextSelectListener
            public void textSizeChange(float newSize) {
                onTextSizeChange.invoke(Float.valueOf(newSize));
            }
        });
    }
}
