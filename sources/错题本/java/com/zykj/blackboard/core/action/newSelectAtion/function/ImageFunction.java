package com.zykj.blackboard.core.action.newSelectAtion.function;

import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.AbstractC3387g;
import com.zykj.blackboard.core.action.IActionListener;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionType;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.proxy.ImageCropView;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.board.EzyGraphEnum$GraphEnum;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5805t;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import kotlinx.coroutines.AbstractC5896f0;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.C5982m1;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p054e7.AbstractC5479k;
import p054e7.C5471c;
import p068g7.C5609e;
import p068g7.ExecutorC5608d;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p169t6.AbstractC6600a;

@Metadata(m5109d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\bJ\u001f\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u0012R$\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u001cj\b\u0012\u0004\u0012\u00020\u0017`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00130\u001cj\b\u0012\u0004\u0012\u00020\u0013`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001f¨\u0006!"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;", "Lcom/zykj/blackboard/core/action/IActionListener;", "listener", "<init>", "(Lcom/zykj/blackboard/core/action/IActionListener;)V", "Ld6/s;", "initFunctionTypeList", "()V", "initFunctionRelativeRectF", "updateSingleSelectedRectF", "calculateFunctionRectF", "updateFunctionRectF", "", "x", "y", "", "isClickInSelectFunction", "(FF)Z", "Landroid/graphics/RectF;", "getMaxFunctionRectF", "()Landroid/graphics/RectF;", "", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;", "getCurrentFunctionTypeList", "()Ljava/util/List;", "reset", "handleClick", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "functionTypeList", "Ljava/util/ArrayList;", "funcRelativeRectFList", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class ImageFunction extends BaseSelectFunction {

    @NotNull
    private final ArrayList<RectF> funcRelativeRectFList;

    @NotNull
    private final ArrayList<NewSelectFunctionType> functionTypeList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageFunction(@NotNull IActionListener listener) {
        super(listener);
        AbstractC5830k.m5330g(listener, "listener");
        this.functionTypeList = new ArrayList<>();
        this.funcRelativeRectFList = new ArrayList<>();
        initFunctionTypeList();
        initFunctionRelativeRectF();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void calculateFunctionRectF() {
        getSelectFunctionRectF().set(getMaxFunctionRectF());
        setDirectionLeft(getFunctionRectFBySelectRectF(getSelectFunctionRectF(), getSelectRectFAfterTransform(), getLimitRectFInPage(), getSelectSizePair()));
        updateFunctionRectF();
        updateFunctionBackgroundRectF();
    }

    private final void initFunctionRelativeRectF() {
        Paint paint = new Paint();
        paint.setTextSize(25.0f);
        paint.setStyle(Paint.Style.FILL);
        float f = paint.getFontMetrics().bottom - paint.getFontMetrics().top;
        float f7 = 2;
        float selectButtonHeight = (getBoardConfig().getSelectButtonHeight() - f) / f7;
        float selectButtonHeight2 = ((getBoardConfig().getSelectButtonHeight() - f) / f7) + f;
        ArrayList<NewSelectFunctionType> arrayList = this.functionTypeList;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        int i8 = 0;
        while (i8 < size) {
            NewSelectFunctionType newSelectFunctionType = arrayList.get(i8);
            i8++;
            if (newSelectFunctionType.getText().length() > 0) {
                arrayList2.add(newSelectFunctionType);
            }
        }
        int size2 = arrayList2.size();
        float f8 = 23.0f;
        while (i < size2) {
            Object obj = arrayList2.get(i);
            i++;
            float fMeasureText = paint.measureText(((NewSelectFunctionType) obj).getText());
            this.funcRelativeRectFList.add(new RectF(f8, selectButtonHeight, f8 + fMeasureText, selectButtonHeight2));
            f8 += fMeasureText + 30.0f;
        }
    }

    private final void initFunctionTypeList() {
        this.functionTypeList.clear();
        this.functionTypeList.add(NewSelectFunctionType.Rotate.INSTANCE);
        this.functionTypeList.add(NewSelectFunctionType.Scale.INSTANCE);
        this.functionTypeList.add(new NewSelectFunctionType.ImageCrop());
        this.functionTypeList.add(NewSelectFunctionType.Delete.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSingleSelectedRectF() {
        IGraph iGraph = (IGraph) AbstractC5805t.m5229i0(getSelectGraphList());
        if (iGraph != null) {
            getSelectRectF().set(iGraph.getOriginalRectF());
            Matrix transformMatrix = getTransformMatrix();
            transformMatrix.reset();
            transformMatrix.postConcat(iGraph.getRenderMatrix());
            transformMatrix.postConcat(getMatrixAdapter().getAdapterMatrix());
        }
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    @NotNull
    public List<NewSelectFunctionType> getCurrentFunctionTypeList() {
        return this.functionTypeList;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    @NotNull
    public RectF getMaxFunctionRectF() {
        setSelectSizePair(new Pair<>(Float.valueOf(((RectF) AbstractC5805t.m5235o0(this.funcRelativeRectFList)).right + 15.0f + 8.0f), Float.valueOf(getBoardConfig().getSelectButtonHeight())));
        return new RectF(0.0f, 0.0f, getSelectSizePair().getFirst().floatValue(), getSelectSizePair().getSecond().floatValue());
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public boolean handleClick(float x3, float y2) {
        if (!super.handleClick(x3, y2)) {
            return false;
        }
        if (getCurrentFunctionMode() instanceof NewSelectFunctionMode.Function) {
            NewSelectFunctionMode currentFunctionMode = getCurrentFunctionMode();
            AbstractC5830k.m5328e(currentFunctionMode, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Function");
            int index = ((NewSelectFunctionMode.Function) currentFunctionMode).getIndex();
            if (index == 0) {
                Object objM5229i0 = AbstractC5805t.m5229i0(getSelectGraphList());
                final ImageGraph imageGraph = objM5229i0 instanceof ImageGraph ? (ImageGraph) objM5229i0 : null;
                if (imageGraph == null) {
                    return true;
                }
                final String filePath = imageGraph.getFilePath();
                if (filePath == null) {
                    filePath = "";
                }
                ImageCropView imageCropView = getBoardConfig().getImageCropView();
                if (imageCropView != null) {
                    imageCropView.showCropView(filePath, new InterfaceC6471c() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.ImageFunction.handleClick.1

                        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 7, 1})
                        @DebugMetadata(m5302c = "com.zykj.blackboard.core.action.newSelectAtion.function.ImageFunction$handleClick$1$1", m5303f = "ImageFunction.kt", m5304i = {}, m5305l = {152}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                        /* renamed from: com.zykj.blackboard.core.action.newSelectAtion.function.ImageFunction$handleClick$1$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
                            final /* synthetic */ String $cropFilePath;
                            final /* synthetic */ ImageGraph $graph;
                            final /* synthetic */ String $graphFilePath;
                            int label;
                            final /* synthetic */ ImageFunction this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(ImageGraph imageGraph, String str, ImageFunction imageFunction, String str2, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                                super(2, interfaceC5631c);
                                this.$graph = imageGraph;
                                this.$graphFilePath = str;
                                this.this$0 = imageFunction;
                                this.$cropFilePath = str2;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
                                return new AnonymousClass1(this.$graph, this.$graphFilePath, this.this$0, this.$cropFilePath, interfaceC5631c);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                Object objM5626F;
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                int i = this.label;
                                if (i == 0) {
                                    AbstractC5774b.m5119b(obj);
                                    C5609e c5609e = AbstractC5896f0.f9343a;
                                    ExecutorC5608d executorC5608d = ExecutorC5608d.f8730a;
                                    ImageFunction$handleClick$1$1$newFilePath$1 imageFunction$handleClick$1$1$newFilePath$1 = new ImageFunction$handleClick$1$1$newFilePath$1(this.$cropFilePath, this.$graphFilePath, null);
                                    this.label = 1;
                                    objM5626F = AbstractC6014x.m5626F(executorC5608d, imageFunction$handleClick$1$1$newFilePath$1, this);
                                    if (objM5626F == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    AbstractC5774b.m5119b(obj);
                                    objM5626F = obj;
                                }
                                String newFilePath = (String) objM5626F;
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                RectF originalRectF = this.$graph.getOriginalRectF();
                                BitmapFactory.decodeFile(this.$graphFilePath, options);
                                float fWidth = originalRectF.width() / options.outWidth;
                                Matrix renderMatrix = this.$graph.getRenderMatrix();
                                BitmapFactory.decodeFile(newFilePath, options);
                                RectF rectF = new RectF(0.0f, 0.0f, options.outWidth * fWidth, options.outHeight * fWidth);
                                Matrix matrix = new Matrix();
                                matrix.postTranslate(originalRectF.centerX() - rectF.centerX(), originalRectF.centerY() - rectF.centerY());
                                matrix.postConcat(renderMatrix);
                                IGraphControl graphControl = this.this$0.getGraphControl();
                                String id = this.$graph.getId();
                                AbstractC5830k.m5329f(newFilePath, "newFilePath");
                                graphControl.changeImageGraph(id, rectF, matrix, newFilePath);
                                this.this$0.updateSingleSelectedRectF();
                                this.this$0.calculateFunctionRectF();
                                BaseSelectFunction.showSelectRectF$default(this.this$0, false, 1, null);
                                IActionListener listener = this.this$0.getListener();
                                ImageGraph imageGraph = this.$graph;
                                EzyGraphEnum$GraphEnum ezyGraphEnum$GraphEnum = EzyGraphEnum$GraphEnum.IMAGE_GRAPH;
                                String strSubstring = newFilePath.substring(AbstractC5855p.m5385S(newFilePath, File.separatorChar, 0, 6) + 1);
                                AbstractC5830k.m5329f(strSubstring, "this as java.lang.String).substring(startIndex)");
                                IActionListener.DefaultImpls.changeGraph$default(listener, imageGraph, ezyGraphEnum$GraphEnum, rectF, null, null, null, matrix, strSubstring, 56, null);
                                this.this$0.getListener().saveSnapshot();
                                return C5443s.f8405a;
                            }

                            @Override // p152r6.InterfaceC6473e
                            @Nullable
                            public final Object invoke(@NotNull InterfaceC6009v interfaceC6009v, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
                                return ((AnonymousClass1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p152r6.InterfaceC6471c
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((String) obj);
                            return C5443s.f8405a;
                        }

                        public final void invoke(@NotNull String cropFilePath) {
                            AbstractC5830k.m5330g(cropFilePath, "cropFilePath");
                            AbstractC3387g.m2342e("ImageFunction:Crop -> graphId: " + imageGraph.getId());
                            C5982m1 c5982m1M5632c = AbstractC6014x.m5632c();
                            C5609e c5609e = AbstractC5896f0.f9343a;
                            AbstractC6014x.m5651v(new C5471c(AbstractC6600a.m6239o(AbstractC5479k.f8471a, c5982m1M5632c)), null, null, new AnonymousClass1(imageGraph, filePath, this, cropFilePath, null), 3);
                        }
                    }, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.action.newSelectAtion.function.ImageFunction.handleClick.2
                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m13747invoke() {
                        }

                        @Override // p152r6.InterfaceC6469a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m13747invoke();
                            return C5443s.f8405a;
                        }
                    });
                }
            } else if (index == 1) {
                getGraphControl().delete(getSelectGraphList());
                getGraphControl().selectCancel();
                getListener().deleteGraphEvent(getSelectGraphList(), System.currentTimeMillis());
                getListener().saveSnapshot();
                reset();
            }
        }
        return true;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public boolean isClickInSelectFunction(float x3, float y2) {
        if (getFunctionRectF().getImageCrop().contains(x3, y2)) {
            setCurrentFunctionMode(new NewSelectFunctionMode.Function(0));
            return true;
        }
        if (getFunctionRectF().getDelete().contains(x3, y2)) {
            setCurrentFunctionMode(new NewSelectFunctionMode.Function(1));
            return true;
        }
        if (getFunctionBackgroundRectF().getEditRectF().contains(x3, y2)) {
            setCurrentFunctionMode(NewSelectFunctionMode.FunctionRectF.INSTANCE);
            return true;
        }
        Matrix matrixInvert = MatrixExtKt.invert(getCurrentMatrix());
        float[] fArr = {x3, y2};
        matrixInvert.mapPoints(fArr);
        float f = fArr[0];
        float f7 = fArr[1];
        float fMapRadius = matrixInvert.mapRadius(getBoardConfig().getSelectIconWidth());
        float f8 = 2;
        float f9 = fMapRadius / f8;
        if (new RectF(getSelectRectF().centerX() - f9, AbstractC1923c.m1036D(fMapRadius, 5, f8, getSelectRectF().top), getSelectRectF().centerX() + f9, AbstractC1923c.m1036D(fMapRadius, 3, f8, getSelectRectF().top)).contains(f, f7)) {
            setCurrentFunctionMode(NewSelectFunctionMode.Rotate.INSTANCE);
            return true;
        }
        if (new RectF(getSelectRectF().right - f9, getSelectRectF().bottom - f9, getSelectRectF().right + f9, getSelectRectF().bottom + f9).contains(f, f7)) {
            setCurrentFunctionMode(NewSelectFunctionMode.Scale.INSTANCE);
            return true;
        }
        if (getSelectRectF().contains(f, f7)) {
            setCurrentFunctionMode(NewSelectFunctionMode.Content.INSTANCE);
            return true;
        }
        setCurrentFunctionMode(NewSelectFunctionMode.Nothing.INSTANCE);
        return false;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public void reset() {
        super.reset();
        initFunctionTypeList();
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public void updateFunctionRectF() {
        FunctionRectF functionRectF = getFunctionRectF();
        functionRectF.getImageCrop().set((getSelectFunctionRectF().left + this.funcRelativeRectFList.get(0).left) - 15.0f, getSelectFunctionRectF().top, getSelectFunctionRectF().left + this.funcRelativeRectFList.get(0).right + 15.0f, getBoardConfig().getSelectButtonHeight() + getSelectFunctionRectF().top);
        functionRectF.getDelete().set((getSelectFunctionRectF().left + this.funcRelativeRectFList.get(1).left) - 15.0f, getSelectFunctionRectF().top, getSelectFunctionRectF().left + this.funcRelativeRectFList.get(1).right + 15.0f, getBoardConfig().getSelectButtonHeight() + getSelectFunctionRectF().top);
        if (getIsDirectionLeft()) {
            return;
        }
        float f = (functionRectF.getDelete().right - functionRectF.getImageCrop().left) + 16.0f;
        functionRectF.getImageCrop().offset(getSelectFunctionRectF().width() - f, 0.0f);
        functionRectF.getDelete().offset(getSelectFunctionRectF().width() - f, 0.0f);
    }
}
