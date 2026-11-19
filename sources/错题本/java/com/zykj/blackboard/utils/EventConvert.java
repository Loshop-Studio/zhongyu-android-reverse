package com.zykj.blackboard.utils;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import android.graphics.Matrix;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Message;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.zykj.board.C4356b1;
import com.zykj.board.C4401x0;
import com.zykj.board.C4405z0;
import com.zykj.board.EzyTouchEvent$TouchEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000b¨\u0006\u000e"}, m5110d2 = {"Lcom/zykj/blackboard/utils/EventConvert;", "", "()V", "buildPointPropertiesList", "", "Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;", "touchEvent", "Landroid/view/MotionEvent;", "motionEventConvertTouchEvent", "Lcom/zykj/board/EzyTouchEvent$TouchEvent;", "matrix", "Landroid/graphics/Matrix;", "updateTouchEventByNewMatrix", "newMatrix", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class EventConvert {

    @NotNull
    public static final EventConvert INSTANCE = new EventConvert();

    private EventConvert() {
    }

    private final List<EzyTouchEvent$TouchEvent.PointerProperties> buildPointPropertiesList(MotionEvent touchEvent) {
        ArrayList arrayList = new ArrayList();
        int pointerCount = touchEvent.getPointerCount();
        C4356b1[] c4356b1Arr = new C4356b1[pointerCount];
        for (int i = 0; i < pointerCount; i++) {
            c4356b1Arr[i] = EzyTouchEvent$TouchEvent.PointerProperties.newBuilder();
        }
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        int pointerCount2 = touchEvent.getPointerCount();
        for (int i8 = 0; i8 < pointerCount2; i8++) {
            touchEvent.getPointerProperties(i8, pointerProperties);
            C4356b1 c4356b1 = c4356b1Arr[i8];
            c4356b1.f5452b = pointerProperties.id;
            c4356b1.f5451a |= 1;
            c4356b1.onChanged();
            C4356b1 c4356b12 = c4356b1Arr[i8];
            c4356b12.f5453c = pointerProperties.toolType;
            c4356b12.f5451a |= 2;
            c4356b12.onChanged();
        }
        for (int i9 = 0; i9 < pointerCount; i9++) {
            EzyTouchEvent$TouchEvent.PointerProperties pointerPropertiesBuildPartial = c4356b1Arr[i9].buildPartial();
            if (!pointerPropertiesBuildPartial.isInitialized()) {
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) pointerPropertiesBuildPartial);
            }
            arrayList.add(pointerPropertiesBuildPartial);
        }
        return arrayList;
    }

    @NotNull
    public final EzyTouchEvent$TouchEvent motionEventConvertTouchEvent(@NotNull MotionEvent touchEvent, @Nullable Matrix matrix) {
        AbstractC5830k.m5330g(touchEvent, "touchEvent");
        ArrayList arrayList = new ArrayList();
        int pointerCount = touchEvent.getPointerCount();
        C4405z0[] c4405z0Arr = new C4405z0[pointerCount];
        for (int i = 0; i < pointerCount; i++) {
            c4405z0Arr[i] = EzyTouchEvent$TouchEvent.PointerCoords.newBuilder();
        }
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        float[] fArr = {0.0f, 0.0f};
        int pointerCount2 = touchEvent.getPointerCount();
        for (int i8 = 0; i8 < pointerCount2; i8++) {
            touchEvent.getPointerCoords(i8, pointerCoords);
            fArr[0] = pointerCoords.x;
            fArr[1] = pointerCoords.y;
            if (matrix != null) {
                matrix.mapPoints(fArr);
            }
            C4405z0 c4405z0 = c4405z0Arr[i8];
            c4405z0.f5614b = fArr[0];
            c4405z0.f5613a |= 1;
            c4405z0.onChanged();
            C4405z0 c4405z02 = c4405z0Arr[i8];
            c4405z02.f5615c = fArr[1];
            c4405z02.f5613a |= 2;
            c4405z02.onChanged();
            pointerCoords.clear();
        }
        for (int i9 = 0; i9 < pointerCount; i9++) {
            arrayList.add(c4405z0Arr[i9].build());
        }
        fArr[0] = touchEvent.getX();
        fArr[1] = touchEvent.getY();
        if (matrix != null) {
            matrix.mapPoints(fArr);
        }
        C4401x0 c4401x0NewBuilder = EzyTouchEvent$TouchEvent.newBuilder();
        c4401x0NewBuilder.m3870i(System.currentTimeMillis());
        c4401x0NewBuilder.f5602c = touchEvent.getActionMasked();
        c4401x0NewBuilder.f5600a |= 2;
        c4401x0NewBuilder.onChanged();
        c4401x0NewBuilder.f5605f = touchEvent.getPointerCount();
        c4401x0NewBuilder.f5600a |= 16;
        c4401x0NewBuilder.onChanged();
        c4401x0NewBuilder.m3871j(fArr[0]);
        c4401x0NewBuilder.m3872k(fArr[1]);
        List<EzyTouchEvent$TouchEvent.PointerProperties> listBuildPointPropertiesList = buildPointPropertiesList(touchEvent);
        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = c4401x0NewBuilder.f5607h;
        if (repeatedFieldBuilderV3 == null) {
            c4401x0NewBuilder.ensurePointerPropertiesIsMutable();
            AbstractMessageLite.Builder.addAll((Iterable) listBuildPointPropertiesList, c4401x0NewBuilder.f5606g);
            c4401x0NewBuilder.onChanged();
        } else {
            repeatedFieldBuilderV3.addAllMessages(listBuildPointPropertiesList);
        }
        RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = c4401x0NewBuilder.f5609j;
        if (repeatedFieldBuilderV32 == null) {
            c4401x0NewBuilder.ensurePointerCoordsIsMutable();
            AbstractMessageLite.Builder.addAll((Iterable) arrayList, c4401x0NewBuilder.f5608i);
            c4401x0NewBuilder.onChanged();
        } else {
            repeatedFieldBuilderV32.addAllMessages(arrayList);
        }
        EzyTouchEvent$TouchEvent ezyTouchEvent$TouchEventBuild = c4401x0NewBuilder.build();
        arrayList.clear();
        return ezyTouchEvent$TouchEventBuild;
    }

    @NotNull
    public final EzyTouchEvent$TouchEvent updateTouchEventByNewMatrix(@NotNull EzyTouchEvent$TouchEvent touchEvent, @Nullable Matrix newMatrix) {
        AbstractC5830k.m5330g(touchEvent, "touchEvent");
        C4401x0 builder = touchEvent.toBuilder();
        float[] fArr = {0.0f, 0.0f};
        int i = builder.f5605f;
        for (int i8 = 0; i8 < i; i8++) {
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = builder.f5609j;
            C4405z0 builder2 = (repeatedFieldBuilderV3 == null ? (EzyTouchEvent$TouchEvent.PointerCoords) builder.f5608i.get(i8) : (EzyTouchEvent$TouchEvent.PointerCoords) repeatedFieldBuilderV3.getMessage(i8)).toBuilder();
            fArr[0] = builder2.f5614b;
            fArr[1] = builder2.f5615c;
            if (newMatrix != null) {
                newMatrix.mapPoints(fArr);
            }
            builder2.f5614b = fArr[0];
            builder2.f5613a |= 1;
            builder2.onChanged();
            builder2.f5615c = fArr[1];
            builder2.f5613a |= 2;
            builder2.onChanged();
            RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = builder.f5609j;
            if (repeatedFieldBuilderV32 == null) {
                builder.ensurePointerCoordsIsMutable();
                builder.f5608i.set(i8, builder2.build());
                builder.onChanged();
            } else {
                repeatedFieldBuilderV32.setMessage(i8, builder2.build());
            }
        }
        fArr[0] = builder.f5603d;
        fArr[1] = builder.f5604e;
        if (newMatrix != null) {
            newMatrix.mapPoints(fArr);
        }
        builder.m3871j(fArr[0]);
        builder.m3872k(fArr[1]);
        return builder.build();
    }
}
